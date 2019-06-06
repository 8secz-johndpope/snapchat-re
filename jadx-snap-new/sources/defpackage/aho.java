package defpackage;

/* renamed from: aho */
public abstract class aho {

    /* renamed from: aho$a */
    public static class a extends aho {
        private volatile boolean a;

        public a() {
            super();
        }

        public final void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }

        public final void a(boolean z) {
            this.a = z;
        }
    }

    private aho() {
    }

    /* synthetic */ aho(byte b) {
        this();
    }

    public abstract void a();

    public abstract void a(boolean z);
}
