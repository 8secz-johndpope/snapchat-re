package defpackage;

/* renamed from: adax */
public final class adax {
    final String a;
    private final Throwable b;
    private final Object[] c;

    static {
        adax adax = new adax(null);
    }

    public adax(String str) {
        this(str, null, null);
    }

    public adax(String str, Object[] objArr, Throwable th) {
        this.a = str;
        this.b = th;
        if (th == null) {
            this.c = objArr;
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.c = objArr2;
        }
    }
}
