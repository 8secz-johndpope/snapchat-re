package defpackage;

/* renamed from: acwz */
public final class acwz<T> {
    private acxn a;
    private T b;

    /* renamed from: acwz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final synchronized T a() {
        return this.b;
    }

    public final synchronized void a(T t, actz actz) {
        akcr.b(actz, "glThread");
        this.b = t;
        acxn acxn = this.a;
        if (acxn != null) {
            Object obj = acxn.a;
            akcr.a(obj, "it.handle");
            if (obj.a()) {
                acxn.a.b();
                actz.a(acxn.a.a);
            }
            this.a = null;
        }
    }

    public final synchronized void a(T t, acxn acxn, actz actz) {
        akcr.b(actz, "glThread");
        if (t == this.b) {
            if (!(this.a == null || this.a == acxn)) {
                a(this.b, actz);
            }
            this.a = acxn;
        }
    }

    public final synchronized acxn b() {
        acxn acxn = this.a;
        return (acxn == null || !acxn.a()) ? null : acxn;
    }
}
