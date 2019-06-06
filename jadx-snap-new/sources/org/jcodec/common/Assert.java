package org.jcodec.common;

public class Assert {
    public static void assertEquals(int i, int i2) {
        if (i != i2) {
            throw new AssertionError();
        }
    }

    public static void assertEquals(long j, long j2) {
        if (j != j2) {
            throw new AssertionError();
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }
}
