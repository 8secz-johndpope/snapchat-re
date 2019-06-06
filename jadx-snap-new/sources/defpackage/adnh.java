package defpackage;

import com.google.common.math.Stats;

/* renamed from: adnh */
public final class adnh implements Cloneable {
    public int a;
    private long[] b;

    public adnh() {
        this(10);
    }

    public adnh(int i) {
        if (i > 0) {
            this.b = new long[i];
            this.a = 0;
            return;
        }
        throw new IllegalArgumentException("The capacity should be positive:".concat(String.valueOf(i)));
    }

    private long[] f() {
        int i = this.a;
        long[] jArr = new long[i];
        System.arraycopy(this.b, 0, jArr, 0, i);
        return jArr;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void a() {
        this.a = 0;
    }

    public final void a(long j) {
        long[] jArr = this.b;
        int length = jArr.length;
        if (this.a + 1 > length) {
            long[] jArr2 = new long[(length << 1)];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            this.b = jArr2;
        }
        jArr = this.b;
        length = this.a;
        this.a = length + 1;
        jArr[length] = j;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final Object clone() {
        adnh adnh = new adnh(this.a);
        System.arraycopy(this.b, 0, adnh.b, 0, this.a);
        adnh.a = this.a;
        return adnh;
    }

    public final long d() {
        return this.a != 0 ? (long) Stats.of(f()).mean() : 0;
    }

    public final long e() {
        return this.a != 0 ? (long) Stats.of(f()).max() : 0;
    }

    public final String toString() {
        if (this.a == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.b[0]);
        for (int i = 1; i != this.a; i++) {
            stringBuilder.append(',');
            stringBuilder.append(' ');
            stringBuilder.append(this.b[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
