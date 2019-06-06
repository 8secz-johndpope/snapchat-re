package com.google.common.collect;

final class Hashing {
    static int closedTableSize(int i, double d) {
        i = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(i);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (i <= ((int) (d * d2))) {
            return highestOneBit;
        }
        i = highestOneBit << 1;
        return i > 0 ? i : AudioPlayer.INFINITY_LOOP_COUNT;
    }

    static boolean needsResizing(int i, int i2, double d) {
        double d2 = (double) i;
        double d3 = (double) i2;
        Double.isNaN(d3);
        return d2 > d * d3 && i2 < AudioPlayer.INFINITY_LOOP_COUNT;
    }

    static int smear(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
