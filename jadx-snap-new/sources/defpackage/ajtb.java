package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ajtb */
public final class ajtb<T> implements ajge<T> {
    public static final Object d = new Object();
    private static int e = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public final AtomicLong a = new AtomicLong();
    public final int b;
    public AtomicReferenceArray<Object> c;
    private int f;
    private long g;
    private int h;
    private AtomicReferenceArray<Object> i;
    private AtomicLong j = new AtomicLong();

    public ajtb(int i) {
        i = ajux.a(Math.max(8, i));
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.c = atomicReferenceArray;
        this.b = i2;
        this.f = Math.min(i / 4, e);
        this.i = atomicReferenceArray;
        this.h = i2;
        this.g = (long) (i2 - 1);
        a(0);
    }

    public static void a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    private boolean a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        atomicReferenceArray.lazySet(i, t);
        a(j + 1);
        return true;
    }

    private void b(long j) {
        this.j.lazySet(j);
    }

    public final void a(long j) {
        this.a.lazySet(j);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.a.get() == this.j.get();
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            long j = this.a.get();
            int i = this.b;
            int i2 = ((int) j) & i;
            if (j < this.g) {
                return a(atomicReferenceArray, t, j, i2);
            }
            long j2 = ((long) this.f) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.g = j2 - 1;
                return a(atomicReferenceArray, t, j, i2);
            }
            j2 = j + 1;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                return a(atomicReferenceArray, t, j, i2);
            }
            long j3 = (long) i;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.c = atomicReferenceArray2;
            this.g = (j + j3) - 1;
            atomicReferenceArray2.lazySet(i2, t);
            ajtb.a(atomicReferenceArray, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, d);
            a(j2);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final T poll() {
        AtomicReferenceArray atomicReferenceArray = this.i;
        long j = this.j.get();
        int i = this.h;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = obj == d ? 1 : null;
        if (obj != null && obj2 == null) {
            atomicReferenceArray.lazySet(i2, null);
            b(j + 1);
            return obj;
        } else if (obj2 == null) {
            return null;
        } else {
            i++;
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i);
            atomicReferenceArray.lazySet(i, null);
            this.i = atomicReferenceArray2;
            Object obj3 = atomicReferenceArray2.get(i2);
            if (obj3 != null) {
                atomicReferenceArray2.lazySet(i2, null);
                b(j + 1);
            }
            return obj3;
        }
    }
}
