package defpackage;

/* renamed from: akqp */
final class akqp {
    private akqo a;
    private akqo b;

    akqp() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized akqo a() {
        akqo akqo;
        akqo = this.a;
        if (this.a != null) {
            this.a = this.a.c;
            if (this.a == null) {
                this.b = null;
            }
        }
        return akqo;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(akqo akqo) {
        if (akqo != null) {
            try {
                if (this.b != null) {
                    this.b.c = akqo;
                    this.b = akqo;
                } else if (this.a == null) {
                    this.b = akqo;
                    this.a = akqo;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } finally {
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized akqo b() {
        if (this.a == null) {
            wait(1000);
        }
        return a();
    }
}
