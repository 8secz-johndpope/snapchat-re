package defpackage;

/* renamed from: akqh */
final class akqh implements Runnable {
    private final akqp a = new akqp();
    private final akqj b;

    akqh(akqj akqj) {
        this.b = akqj;
    }

    public final void a(akqu akqu, Object obj) {
        this.a.a(akqo.a(akqu, obj));
        this.b.b.execute(this);
    }

    public final void run() {
        akqo a = this.a.a();
        if (a != null) {
            this.b.a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
