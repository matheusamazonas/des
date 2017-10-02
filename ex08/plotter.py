#!/usr/local/bin/python3
from math import inf
from numpy import average, std as std_dev
from matplotlib import pyplot

source_file_a = "time_diff_a.csv"
source_file_b = "time_diff_b.csv"

def deviation_stats(list, desired_value):
	deviations = []
	minimum = inf
	maximum = -inf
	for value in list:
		dev = desired_value - value
		deviations.append(dev)
		minimum = min(minimum, abs(dev))
		maximum = max(maximum, abs(dev))
	return (deviations, minimum, maximum)

def read_file_values(file_name, ignore_zeros):
	file = open(file_name, "r")
	values = []

	for line in file:
		_,v = line.split(',')
		value = int(v)
		if not ignore_zeros or value != 0:
			values.append(int(v))
	file.close()
	return values

def ex08a():
	print("------ ex08a ------")
	values = read_file_values(source_file_a, False)
	(deviations, minimum, maximum) = deviation_stats(values, 100000)

	print("Number of values: ", len(values))
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
	values = read_file_values(source_file_b, True)

	correct_values = [value/2 for value in values]
	print("Number of values: ", len(correct_values))
	print("Average: ", average(correct_values))
	print("Standard Deviation: ", std_dev(correct_values))

	pyplot.title("Interrupt Latency on Raspberry Pi")
	pyplot.xlabel("runs")
	pyplot.ylabel("latency (us)")
	pyplot.scatter(x = list(range(1, len(correct_values)+1)), y = correct_values, marker='.')
	pyplot.show()

def main():
	ex08a()
	ex08b()

if __name__ == "__main__": main()