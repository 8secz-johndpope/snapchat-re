package defpackage;

/* renamed from: akcx */
public abstract class akcx<T> {
    private int a;
    private final T[] b = new Object[2];
    private final int c = 2;

    public abstract int a(T t);

    /* Access modifiers changed, original: protected|final */
    public final T a(T t, T t2) {
        akcr.b(t, "values");
        akcr.b(t2, "result");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Object obj = this.b[i];
            if (obj != null) {
                if (i2 < i) {
                    int i4 = i - i2;
                    System.arraycopy(t, i2, t2, i3, i4);
                    i3 += i4;
                }
                i2 = a(obj);
                System.arraycopy(obj, 0, t2, i3, i2);
                i3 += i2;
                i2 = i + 1;
            }
            if (i == 1) {
                break;
            }
            i++;
        }
        if (i2 < 2) {
            System.arraycopy(t, i2, t2, i3, 2 - i2);
        }
        return t2;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = this.b[i2];
            i += obj != null ? a(obj) : 1;
            if (i2 == 1) {
                return i;
            }
            i2++;
        }
    }

    public final void b(T t) {
        akcr.b(t, "spreadArgument");
        Object[] objArr = this.b;
        int i = this.a;
        this.a = i + 1;
        objArr[i] = t;
    }
}
