package defpackage;

/* renamed from: zkf */
public final class zkf implements ajej {
    final akqj a;
    public final zke b;
    private final ajei c;

    /* renamed from: zkf$1 */
    class 1 implements zke {
        1() {
        }

        public final void a(Object obj) {
            if (!zkf.this.isDisposed()) {
                in.a("RxBus:post");
                try {
                    zkf.this.a.c(obj);
                } finally {
                    in.a();
                }
            }
        }
    }

    public zkf() {
        akqk akqk = new akqk();
        this.a = akqk.b();
        this.c = new ajei();
        this.b = new 1();
    }

    private /* synthetic */ void b(Object obj) {
        this.a.b(obj);
    }

    public final ajej a(Object obj) {
        in.a("RxBus:subscribe");
        try {
            this.a.a(obj);
            ajej a = ajek.a(new -$$Lambda$zkf$Izeg7F6A2rMAC3wa1IGq_1wWo6U(this, obj));
            this.c.a(a);
            return a;
        } finally {
            in.a();
        }
    }

    public final zke a() {
        return this.b;
    }

    public final void dispose() {
        this.c.dispose();
    }

    public final boolean isDisposed() {
        return this.c.isDisposed();
    }
}
