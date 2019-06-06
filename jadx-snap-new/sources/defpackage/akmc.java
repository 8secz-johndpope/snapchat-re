package defpackage;

/* renamed from: akmc */
public final class akmc {
    public boolean a = true;

    static {
        ThreadLocal threadLocal = new ThreadLocal();
    }

    public final akmc a(double d, double d2) {
        return !this.a ? this : a(Double.doubleToLongBits(d), Double.doubleToLongBits(d2));
    }

    public final akmc a(float f, float f2) {
        return !this.a ? this : a(Float.floatToIntBits(f), Float.floatToIntBits(f2));
    }

    public final akmc a(int i, int i2) {
        if (!this.a) {
            return this;
        }
        this.a = i == i2;
        return this;
    }

    public final akmc a(long j, long j2) {
        if (!this.a) {
            return this;
        }
        this.a = j == j2;
        return this;
    }

    public final akmc a(Object obj, Object obj2) {
        if (!this.a || obj == obj2) {
            return this;
        }
        int i = 0;
        if (obj == null || obj2 == null) {
            this.a = false;
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj.getClass() == obj2.getClass()) {
                int i2;
                boolean z;
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    long[] jArr2 = (long[]) obj2;
                    if (this.a && jArr != jArr2) {
                        if (!(jArr == null || jArr2 == null || jArr.length != jArr2.length)) {
                            while (i < jArr.length && this.a) {
                                a(jArr[i], jArr2[i]);
                                i++;
                            }
                        }
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int[] iArr2 = (int[]) obj2;
                    if (this.a && iArr != iArr2) {
                        if (!(iArr == null || iArr2 == null || iArr.length != iArr2.length)) {
                            while (i < iArr.length && this.a) {
                                a(iArr[i], iArr2[i]);
                                i++;
                            }
                        }
                    }
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    short[] sArr2 = (short[]) obj2;
                    if (this.a && sArr != sArr2) {
                        if (!(sArr == null || sArr2 == null || sArr.length != sArr2.length)) {
                            for (i2 = 0; i2 < sArr.length; i2++) {
                                z = this.a;
                                if (!z) {
                                    break;
                                }
                                short s = sArr[i2];
                                short s2 = sArr2[i2];
                                if (z) {
                                    this.a = s == s2;
                                }
                            }
                        }
                    }
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    char[] cArr2 = (char[]) obj2;
                    if (this.a && cArr != cArr2) {
                        if (!(cArr == null || cArr2 == null || cArr.length != cArr2.length)) {
                            for (i2 = 0; i2 < cArr.length; i2++) {
                                z = this.a;
                                if (!z) {
                                    break;
                                }
                                char c = cArr[i2];
                                char c2 = cArr2[i2];
                                if (z) {
                                    this.a = c == c2;
                                }
                            }
                        }
                    }
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    if (this.a && bArr != bArr2) {
                        if (!(bArr == null || bArr2 == null || bArr.length != bArr2.length)) {
                            for (i2 = 0; i2 < bArr.length; i2++) {
                                z = this.a;
                                if (!z) {
                                    break;
                                }
                                byte b = bArr[i2];
                                byte b2 = bArr2[i2];
                                if (z) {
                                    this.a = b == b2;
                                }
                            }
                        }
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    double[] dArr2 = (double[]) obj2;
                    if (this.a && dArr != dArr2) {
                        if (!(dArr == null || dArr2 == null || dArr.length != dArr2.length)) {
                            while (i < dArr.length && this.a) {
                                a(dArr[i], dArr2[i]);
                                i++;
                            }
                        }
                    }
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    float[] fArr2 = (float[]) obj2;
                    if (this.a && fArr != fArr2) {
                        if (!(fArr == null || fArr2 == null || fArr.length != fArr2.length)) {
                            while (i < fArr.length && this.a) {
                                a(fArr[i], fArr2[i]);
                                i++;
                            }
                        }
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    boolean[] zArr2 = (boolean[]) obj2;
                    if (this.a && zArr != zArr2) {
                        if (!(zArr == null || zArr2 == null || zArr.length != zArr2.length)) {
                            while (i < zArr.length && this.a) {
                                a(zArr[i], zArr2[i]);
                                i++;
                            }
                        }
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    Object[] objArr2 = (Object[]) obj2;
                    if (this.a && objArr != objArr2) {
                        if (!(objArr == null || objArr2 == null || objArr.length != objArr2.length)) {
                            while (i < objArr.length && this.a) {
                                a(objArr[i], objArr2[i]);
                                i++;
                            }
                        }
                    }
                }
            }
            this.a = false;
        } else {
            this.a = obj.equals(obj2);
        }
        return this;
    }

    public final akmc a(boolean z, boolean z2) {
        if (!this.a) {
            return this;
        }
        this.a = z == z2;
        return this;
    }
}
