XENO_CONFIG := /usr/xenomai/bin/xeno-config
CFLAGS := $(shell $(XENO_CONFIG) --alchemy --cobalt --cflags)
LDFLAGS := $(shell $(XENO_CONFIG) --alchemy --cobalt --ldflags)
EXTRA :=
CC := gcc

EXECUTABLE := ex02a ex02b ex02c ex02d

all: $(EXECUTABLE)

%: %.c
	$(CC) -o $@ $< $(CFLAGS) $(LDFLAGS) $(EXTRA)
