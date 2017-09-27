#!/usr/local/bin/python3
from math import inf
from numpy import average, std as std_dev
from matplotlib import pyplot

source_file = "time_diff.csv"

def deviation_stats(list, desired_value):
	deviations = []
	minimum = inf
	maximum = -inf
	for value in list:
		dev = desired_value - value
		deviations.append(dev)
		minimum = min(minimum, dev)
		maximum = max(maximum, dev)
	return (deviations, minimum, maximum)

def ex08a():
	print("------ ex08a ------")
	file = open(source_file, "r")

	values = []

	for line in file:
		_,v = line.split(',')
		values.append(int(v))
	(deviations, minimum, maximum) = deviation_stats(values, 100000)

	print("Number of values:: ", len(values))
	print("Average: ", average(values))
	print("Maximum deviation: ", maximum)
	print("Minimum deviation: ", minimum)
	print("Standard Deviation: ", std_dev(deviations))

	pyplot.title("Scheduling - run on Raspberry Pi")
	pyplot.xlabel("runs")
	pyplot.ylabel("delta (us)")
	pyplot.scatter(x = list(range(1, len(values)+1)), y = values, marker='.')
	pyplot.show()

def ex08b():
	print("------ ex08b ------")

def main():
	ex08a()
	ex08b()

if __name__ == "__main__": main()