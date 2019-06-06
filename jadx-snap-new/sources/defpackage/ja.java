package defpackage;

/* renamed from: ja */
public final class ja<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public ja() {
        this((byte) 0);
    }

    private ja(byte b) {
        this.b = false;
        int b2 = ix.b(10);
        this.c = new long[b2];
        this.d = new Object[b2];
        this.e = 0;
    }

    private ja<E> c() {
        try {
            ja jaVar = (ja) super.clone();
            try {
                jaVar.c = (long[]) this.c.clone();
                jaVar.d = (Object[]) this.d.clone();
                return jaVar;
            } catch (CloneNotSupportedException unused) {
                return jaVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    private void d() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final int a() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final E a(long j) {
        return b(j);
    }

    public final void a(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    public final void a(int i, E e) {
        if (this.b) {
            d();
        }
        this.d[i] = e;
    }

    public final void a(long j, E e) {
        int a = ix.a(this.c, this.e, j);
        if (a >= 0) {
            this.d[a] = e;
            return;
        }
        Object[] objArr;
        long[] jArr;
        a ^= -1;
        if (a < this.e) {
            objArr = this.d;
            if (objArr[a] == a) {
                this.c[a] = j;
                objArr[a] = e;
                return;
            }
        }
        if (this.b && this.e >= this.c.length) {
            d();
            a = ix.a(this.c, this.e, j) ^ -1;
        }
        int i = this.e;
        if (i >= this.c.length) {
            i = ix.b(i + 1);
            jArr = new long[i];
            objArr = new Object[i];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.c = jArr;
            this.d = objArr;
        }
        i = this.e;
        if (i - a != 0) {
            jArr = this.c;
            int i2 = a + 1;
            System.arraycopy(jArr, a, jArr, i2, i - a);
            objArr = this.d;
            System.arraycopy(objArr, a, objArr, i2, this.e - a);
        }
        this.c[a] = j;
        this.d[a] = e;
        this.e++;
    }

    public final long b(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final E b(long j) {
        int a = ix.a(this.c, this.e, j);
        if (a >= 0) {
            Object[] objArr = this.d;
            if (objArr[a] != a) {
                return objArr[a];
            }
        }
        return null;
    }

    public final void b() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final E c(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public final void c(long j) {
        int a = ix.a(this.c, this.e, j);
        if (a >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.b = true;
            }
        }
    }

    public final /* synthetic */ Object clone() {
        return c();
    }

    public final void d(long j) {
        c(j);
    }

    public final int e(long j) {
        if (this.b) {
            d();
        }
        return ix.a(this.c, this.e, j);
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                stringBuilder.append(ppy.d);
            }
            stringBuilder.append(b(i));
            stringBuilder.append('=');
            ja c = c(i);
            if (c != this) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
