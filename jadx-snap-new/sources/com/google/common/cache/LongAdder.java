package com.google.common.cache;

import java.io.Serializable;

final class LongAdder extends Striped64 implements LongAddable, Serializable {
    public final void add(long j) {
        Cell[] cellArr = this.cells;
        if (cellArr == null) {
            long j2 = this.base;
            if (casBase(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = (int[]) threadHashCode.get();
        boolean z = true;
        if (!(iArr == null || cellArr == null)) {
            int length = cellArr.length;
            if (length > 0) {
                Cell cell = cellArr[(length - 1) & iArr[0]];
                if (cell != null) {
                    long j3 = cell.value;
                    z = cell.cas(j3, j3 + j);
                    if (z) {
                        return;
                    }
                }
            }
        }
        retryUpdate(j, iArr, z);
    }

    public final double doubleValue() {
        return (double) sum();
    }

    public final float floatValue() {
        return (float) sum();
    }

    /* Access modifiers changed, original: final */
    public final long fn(long j, long j2) {
        return j + j2;
    }

    public final void increment() {
        add(1);
    }

    public final int intValue() {
        return (int) sum();
    }

    public final long longValue() {
        return sum();
    }

    public final long sum() {
        long j = this.base;
        Cell[] cellArr = this.cells;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.value;
                }
            }
        }
        return j;
    }

    public final String toString() {
        return Long.toString(sum());
    }
}
