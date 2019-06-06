package defpackage;

/* renamed from: acpa */
public final class acpa {
    private boolean a;
    private final a b;

    /* renamed from: acpa$a */
    public interface a {
        void a(boolean z);
    }

    public acpa(a aVar) {
        this.b = aVar;
    }

    public final synchronized void a(boolean z) {
        if (z != this.a) {
            this.a = z;
            if (this.b != null) {
                this.b.a(z);
            }
        }
    }

    public final synchronized boolean a() {
        return this.a;
    }
}
