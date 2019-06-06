package defpackage;

/* renamed from: akmd */
public final class akmd {
    public int a;
    private final int b;

    static {
        ThreadLocal threadLocal = new ThreadLocal();
    }

    public akmd() {
        this.a = 0;
        this.b = 37;
        this.a = 17;
    }

    private akmd a(short s) {
        this.a = (this.a * 37) + s;
        return this;
    }

    private akmd a(byte[] bArr) {
        if (bArr == null) {
            this.a *= 37;
        } else {
            for (byte b : bArr) {
                this.a = (this.a * 37) + b;
            }
        }
        return this;
    }

    private akmd a(char[] cArr) {
        if (cArr == null) {
            this.a *= 37;
        } else {
            for (char c : cArr) {
                this.a = (this.a * 37) + c;
            }
        }
        return this;
    }

    private akmd a(double[] dArr) {
        if (dArr == null) {
            this.a *= 37;
        } else {
            for (double a : dArr) {
                a(a);
            }
        }
        return this;
    }

    private akmd a(float[] fArr) {
        if (fArr == null) {
            this.a *= 37;
        } else {
            for (float a : fArr) {
                a(a);
            }
        }
        return this;
    }

    private akmd a(int[] iArr) {
        if (iArr == null) {
            this.a *= 37;
        } else {
            for (int a : iArr) {
                a(a);
            }
        }
        return this;
    }

    private akmd a(long[] jArr) {
        if (jArr == null) {
            this.a *= 37;
        } else {
            for (long a : jArr) {
                a(a);
            }
        }
        return this;
    }

    private akmd a(Object[] objArr) {
        if (objArr == null) {
            this.a *= 37;
        } else {
            for (Object a : objArr) {
                a(a);
            }
        }
        return this;
    }

    private akmd a(short[] sArr) {
        if (sArr == null) {
            this.a *= 37;
        } else {
            for (short a : sArr) {
                a(a);
            }
        }
        return this;
    }

    private akmd a(boolean[] zArr) {
        if (zArr == null) {
            this.a *= 37;
        } else {
            for (boolean a : zArr) {
                a(a);
            }
        }
        return this;
    }

    public final akmd a(double d) {
        return a(Double.doubleToLongBits(d));
    }

    public final akmd a(float f) {
        this.a = (this.a * 37) + Float.floatToIntBits(f);
        return this;
    }

    public final akmd a(int i) {
        this.a = (this.a * 37) + i;
        return this;
    }

    public final akmd a(long j) {
        this.a = (this.a * 37) + ((int) (j ^ (j >> 32)));
        return this;
    }

    public final akmd a(Object obj) {
        if (obj == null) {
            this.a *= 37;
        } else if (!obj.getClass().isArray()) {
            this.a = (this.a * 37) + obj.hashCode();
        } else if (obj instanceof long[]) {
            a((long[]) obj);
        } else if (obj instanceof int[]) {
            a((int[]) obj);
        } else if (obj instanceof short[]) {
            a((short[]) obj);
        } else if (obj instanceof char[]) {
            a((char[]) obj);
        } else if (obj instanceof byte[]) {
            a((byte[]) obj);
        } else if (obj instanceof double[]) {
            a((double[]) obj);
        } else if (obj instanceof float[]) {
            a((float[]) obj);
        } else if (obj instanceof boolean[]) {
            a((boolean[]) obj);
        } else {
            a((Object[]) obj);
        }
        return this;
    }

    public final akmd a(boolean z) {
        this.a = (this.a * 37) + (z ^ 1);
        return this;
    }

    public final int hashCode() {
        return this.a;
    }
}
