package defpackage;

/* renamed from: ajuw */
// List
public final class ajuw<T> {
    public int a;
    public int b;
    public T[] c;
    private float d;
    private int e;

    public ajuw() {
        this(16, (byte) 0);
    }

    public ajuw(int i) {
        this(i, (byte) 0);
    }

    private ajuw(int i, byte b) {
        this.d = 0.75f;
        i = ajux.a(i);
        this.a = i - 1;
        this.e = (int) (((float) i) * 0.75f);
        this.c = new Object[i];
    }

    public static int a(int i) {
        i *= -1640531527;
        return i ^ (i >>> 16);
    }

    private void a() {
        Object[] objArr = this.c;
        int length = objArr.length;
        int i = length << 1;
        int i2 = i - 1;
        Object[] objArr2 = new Object[i];
        int i3 = this.b;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (objArr[length] == null);
                i3 = ajuw.a(objArr[length].hashCode()) & i2;
                if (objArr2[i3] != null) {
                    do {
                        i3 = (i3 + 1) & i2;
                    } while (objArr2[i3] != null);
                }
                objArr2[i3] = objArr[length];
                i3 = i4;
            } else {
                this.a = i2;
                this.e = (int) (((float) i) * this.d);
                this.c = objArr2;
                return;
            }
        }
    }

    public final boolean a(int i, T[] tArr, int i2) {
        this.b--;
        while (true) {
            Object obj;
            int i3 = i + 1;
            while (true) {
                i3 &= i2;
                obj = tArr[i3];
                if (obj == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = ajuw.a(obj.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i3++;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3++;
                }
            }
            tArr[i] = obj;
            i = i3;
        }
    }

    public final boolean a(T t) {
        Object[] objArr = this.c;
        int i = this.a;
        int a = ajuw.a(t.hashCode()) & i;
        Object obj = objArr[a];
        if (obj != null) {
            if (obj.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                obj = objArr[a];
                if (obj != null) {
                }
            } while (!obj.equals(t));
            return false;
        }
        objArr[a] = t;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 >= this.e) {
            a();
        }
        return true;
    }
}
