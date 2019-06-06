package defpackage;

/* renamed from: ji */
public final class ji<E> implements Cloneable {
    private static final Object e = new Object();
    public boolean a;
    public int[] b;
    public Object[] c;
    public int d;

    public ji() {
        this(10);
    }

    public ji(int i) {
        Object[] objArr;
        this.a = false;
        if (i == 0) {
            this.b = ix.a;
            objArr = ix.b;
        } else {
            i = ix.a(i);
            this.b = new int[i];
            objArr = new Object[i];
        }
        this.c = objArr;
        this.d = 0;
    }

    private ji<E> c() {
        try {
            ji jiVar = (ji) super.clone();
            try {
                jiVar.b = (int[]) this.b.clone();
                jiVar.c = (Object[]) this.c.clone();
                return jiVar;
            } catch (CloneNotSupportedException unused) {
                return jiVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final E a(int i, E e) {
        i = ix.a(this.b, this.d, i);
        if (i >= 0) {
            Object[] objArr = this.c;
            if (objArr[i] != e) {
                return objArr[i];
            }
        }
        return e;
    }

    public final void a() {
        int i = this.d;
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.d = i2;
    }

    public final void a(int i) {
        i = ix.a(this.b, this.d, i);
        if (i >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[i];
            Object obj2 = e;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.a = true;
            }
        }
    }

    public final int b() {
        if (this.a) {
            a();
        }
        return this.d;
    }

    public final int b(int i) {
        if (this.a) {
            a();
        }
        return this.b[i];
    }

    public final void b(int i, E e) {
        int a = ix.a(this.b, this.d, i);
        if (a >= 0) {
            this.c[a] = e;
            return;
        }
        Object[] objArr;
        int[] iArr;
        a ^= -1;
        if (a < this.d) {
            objArr = this.c;
            if (objArr[a] == e) {
                this.b[a] = i;
                objArr[a] = e;
                return;
            }
        }
        if (this.a && this.d >= this.b.length) {
            a();
            a = ix.a(this.b, this.d, i) ^ -1;
        }
        int i2 = this.d;
        if (i2 >= this.b.length) {
            i2 = ix.a(i2 + 1);
            iArr = new int[i2];
            objArr = new Object[i2];
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.b = iArr;
            this.c = objArr;
        }
        i2 = this.d;
        if (i2 - a != 0) {
            iArr = this.b;
            int i3 = a + 1;
            System.arraycopy(iArr, a, iArr, i3, i2 - a);
            objArr = this.c;
            System.arraycopy(objArr, a, objArr, i3, this.d - a);
        }
        this.b[a] = i;
        this.c[a] = e;
        this.d++;
    }

    public final E c(int i) {
        if (this.a) {
            a();
        }
        return this.c[i];
    }

    public final void c(int i, E e) {
        int i2 = this.d;
        if (i2 == 0 || i > this.b[i2 - 1]) {
            if (this.a && this.d >= this.b.length) {
                a();
            }
            i2 = this.d;
            if (i2 >= this.b.length) {
                int a = ix.a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                int[] iArr2 = this.b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.b = iArr;
                this.c = objArr;
            }
            this.b[i2] = i;
            this.c[i2] = e;
            this.d = i2 + 1;
            return;
        }
        b(i, e);
    }

    public final /* synthetic */ Object clone() {
        return c();
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.d * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                stringBuilder.append(ppy.d);
            }
            stringBuilder.append(b(i));
            stringBuilder.append('=');
            ji c = c(i);
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
