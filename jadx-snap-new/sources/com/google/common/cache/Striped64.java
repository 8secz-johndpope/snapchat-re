package com.google.common.cache;

import java.util.Random;
import sun.misc.Unsafe;

abstract class Striped64 extends Number {
    static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    static final Random rng = new Random();
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal();
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell[] cells;

    static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;
        volatile long value;

        static {
            try {
                UNSAFE = Striped64.getUnsafe();
                valueOffset = UNSAFE.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        Cell(long j) {
            this.value = j;
        }

        /* Access modifiers changed, original: final */
        public final boolean cas(long j, long j2) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, j, j2);
        }
    }

    static {
        try {
            UNSAFE = getUnsafe();
            Class cls = Striped64.class;
            baseOffset = UNSAFE.objectFieldOffset(cls.getDeclaredField("base"));
            busyOffset = UNSAFE.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    Striped64() {
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:5:0x0010, code skipped:
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.cache.Striped64.AnonymousClass1());
     */
    /* JADX WARNING: Missing block: B:6:0x0011, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:8:0x001d, code skipped:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    private static sun.misc.Unsafe getUnsafe() {
        /*
        r0 = sun.misc.Unsafe.getUnsafe();	 Catch:{ SecurityException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new com.google.common.cache.Striped64$1;	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0.<init>();	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ PrivilegedActionException -> 0x0011 }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ PrivilegedActionException -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.getCause();
        r2 = "Could not initialize intrinsics";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.getUnsafe():sun.misc.Unsafe");
    }

    /* Access modifiers changed, original: final */
    public final boolean casBase(long j, long j2) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j, j2);
    }

    /* Access modifiers changed, original: final */
    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    public abstract long fn(long j, long j2);

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0022 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x005a A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:54:0x008a, code skipped:
            if (r1.cells != r9) goto L_0x009c;
     */
    /* JADX WARNING: Missing block: B:55:0x008c, code skipped:
            r8 = new com.google.common.cache.Striped64.Cell[(r10 << 1)];
            r11 = 0;
     */
    /* JADX WARNING: Missing block: B:56:0x0091, code skipped:
            if (r11 >= r10) goto L_0x009a;
     */
    /* JADX WARNING: Missing block: B:57:0x0093, code skipped:
            r8[r11] = r9[r11];
            r11 = r11 + 1;
     */
    /* JADX WARNING: Missing block: B:58:0x009a, code skipped:
            r1.cells = r8;
     */
    public final void retryUpdate(long r17, int[] r19, boolean r20) {
        /*
        r16 = this;
        r1 = r16;
        r2 = r17;
        r0 = 1;
        r4 = 0;
        if (r19 != 0) goto L_0x001b;
    L_0x0008:
        r5 = threadHashCode;
        r6 = new int[r0];
        r5.set(r6);
        r5 = rng;
        r5 = r5.nextInt();
        if (r5 != 0) goto L_0x0018;
    L_0x0017:
        r5 = 1;
    L_0x0018:
        r6[r4] = r5;
        goto L_0x001f;
    L_0x001b:
        r5 = r19[r4];
        r6 = r19;
    L_0x001f:
        r7 = r20;
    L_0x0021:
        r8 = 0;
    L_0x0022:
        r9 = r1.cells;
        if (r9 == 0) goto L_0x00b0;
    L_0x0026:
        r10 = r9.length;
        if (r10 <= 0) goto L_0x00b0;
    L_0x0029:
        r11 = r10 + -1;
        r11 = r11 & r5;
        r11 = r9[r11];
        if (r11 != 0) goto L_0x0061;
    L_0x0030:
        r9 = r1.busy;
        if (r9 != 0) goto L_0x005f;
    L_0x0034:
        r9 = new com.google.common.cache.Striped64$Cell;
        r9.<init>(r2);
        r10 = r1.busy;
        if (r10 != 0) goto L_0x005f;
    L_0x003d:
        r10 = r16.casBusy();
        if (r10 == 0) goto L_0x005f;
    L_0x0043:
        r10 = r1.cells;	 Catch:{ all -> 0x005b }
        if (r10 == 0) goto L_0x0055;
    L_0x0047:
        r11 = r10.length;	 Catch:{ all -> 0x005b }
        if (r11 <= 0) goto L_0x0055;
    L_0x004a:
        r11 = r11 + -1;
        r11 = r11 & r5;
        r12 = r10[r11];	 Catch:{ all -> 0x005b }
        if (r12 != 0) goto L_0x0055;
    L_0x0051:
        r10[r11] = r9;	 Catch:{ all -> 0x005b }
        r9 = 1;
        goto L_0x0056;
    L_0x0055:
        r9 = 0;
    L_0x0056:
        r1.busy = r4;
        if (r9 == 0) goto L_0x0022;
    L_0x005a:
        return;
    L_0x005b:
        r0 = move-exception;
        r1.busy = r4;
        throw r0;
    L_0x005f:
        r8 = 0;
        goto L_0x00a3;
    L_0x0061:
        if (r7 != 0) goto L_0x0065;
    L_0x0063:
        r7 = 1;
        goto L_0x00a3;
    L_0x0065:
        r12 = r11.value;
        r14 = r1.fn(r12, r2);
        r11 = r11.cas(r12, r14);
        if (r11 != 0) goto L_0x00e9;
    L_0x0071:
        r11 = NCPU;
        if (r10 >= r11) goto L_0x005f;
    L_0x0075:
        r11 = r1.cells;
        if (r11 == r9) goto L_0x007a;
    L_0x0079:
        goto L_0x005f;
    L_0x007a:
        if (r8 != 0) goto L_0x007e;
    L_0x007c:
        r8 = 1;
        goto L_0x00a3;
    L_0x007e:
        r11 = r1.busy;
        if (r11 != 0) goto L_0x00a3;
    L_0x0082:
        r11 = r16.casBusy();
        if (r11 == 0) goto L_0x00a3;
    L_0x0088:
        r8 = r1.cells;	 Catch:{ all -> 0x009f }
        if (r8 != r9) goto L_0x009c;
    L_0x008c:
        r8 = r10 << 1;
        r8 = new com.google.common.cache.Striped64.Cell[r8];	 Catch:{ all -> 0x009f }
        r11 = 0;
    L_0x0091:
        if (r11 >= r10) goto L_0x009a;
    L_0x0093:
        r12 = r9[r11];	 Catch:{ all -> 0x009f }
        r8[r11] = r12;	 Catch:{ all -> 0x009f }
        r11 = r11 + 1;
        goto L_0x0091;
    L_0x009a:
        r1.cells = r8;	 Catch:{ all -> 0x009f }
    L_0x009c:
        r1.busy = r4;
        goto L_0x0021;
    L_0x009f:
        r0 = move-exception;
        r1.busy = r4;
        throw r0;
    L_0x00a3:
        r9 = r5 << 13;
        r5 = r5 ^ r9;
        r9 = r5 >>> 17;
        r5 = r5 ^ r9;
        r9 = r5 << 5;
        r5 = r5 ^ r9;
        r6[r4] = r5;
        goto L_0x0022;
    L_0x00b0:
        r10 = r1.busy;
        if (r10 != 0) goto L_0x00dd;
    L_0x00b4:
        r10 = r1.cells;
        if (r10 != r9) goto L_0x00dd;
    L_0x00b8:
        r10 = r16.casBusy();
        if (r10 == 0) goto L_0x00dd;
    L_0x00be:
        r10 = r1.cells;	 Catch:{ all -> 0x00d9 }
        if (r10 != r9) goto L_0x00d2;
    L_0x00c2:
        r9 = 2;
        r9 = new com.google.common.cache.Striped64.Cell[r9];	 Catch:{ all -> 0x00d9 }
        r10 = r5 & 1;
        r11 = new com.google.common.cache.Striped64$Cell;	 Catch:{ all -> 0x00d9 }
        r11.<init>(r2);	 Catch:{ all -> 0x00d9 }
        r9[r10] = r11;	 Catch:{ all -> 0x00d9 }
        r1.cells = r9;	 Catch:{ all -> 0x00d9 }
        r9 = 1;
        goto L_0x00d3;
    L_0x00d2:
        r9 = 0;
    L_0x00d3:
        r1.busy = r4;
        if (r9 != 0) goto L_0x00e9;
    L_0x00d7:
        goto L_0x0022;
    L_0x00d9:
        r0 = move-exception;
        r1.busy = r4;
        throw r0;
    L_0x00dd:
        r9 = r1.base;
        r11 = r1.fn(r9, r2);
        r9 = r1.casBase(r9, r11);
        if (r9 == 0) goto L_0x0022;
    L_0x00e9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.retryUpdate(long, int[], boolean):void");
    }
}
