XENO_CONFIG := /usr/xenomai/bin/xeno-config
CFLAGS := $(shell $(XENO_CONFIG) --alchemy --cobalt --cflags)
LDFLAGS := $(shell $(XENO_CONFIG) --alchemy --cobalt --ldflags)
EXTRA :=
CC := gcc

EXECUTABLE := ex03a ex03b ex03c-broadcast ex03c-p 

all: $(EXECUTABLE)

%: %.c
	$(CC) -o $@ $< $(CFLAGS) $(LDFLAGS) $(EXTRA)
