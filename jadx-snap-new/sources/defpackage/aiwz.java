package defpackage;

/* renamed from: aiwz */
abstract class aiwz implements Runnable {
    private final aiuq a;

    public aiwz(aiuq aiuq) {
        this.a = aiuq;
    }

    public abstract void a();

    public final void run() {
        aiuq c = this.a.c();
        try {
            a();
        } finally {
            this.a.a(c);
        }
    }
}
