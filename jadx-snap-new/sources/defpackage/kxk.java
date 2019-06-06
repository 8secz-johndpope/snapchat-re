package defpackage;

import defpackage.dnc.a;

/* renamed from: kxk */
public final class kxk implements lpi {
    final dnc a;

    /* renamed from: kxk$b */
    public static final class b implements a {
        private /* synthetic */ akbk a;

        b(akbk akbk) {
            this.a = akbk;
        }

        public final boolean a() {
            return ((Boolean) this.a.invoke()).booleanValue();
        }
    }

    /* renamed from: kxk$a */
    static final class a implements ajev {
        private /* synthetic */ kxk a;
        private /* synthetic */ b b;

        a(kxk kxk, b bVar) {
            this.a = kxk;
            this.b = bVar;
        }

        public final void run() {
            this.a.a.b(this.b);
        }
    }

    public kxk(dnc dnc) {
        akcr.b(dnc, "backPressDispatcher");
        this.a = dnc;
    }

    public final ajej a(akbk<Boolean> akbk) {
        akcr.b(akbk, "handler");
        b bVar = new b(akbk);
        this.a.a(bVar);
        Object a = ajek.a((ajev) new a(this, bVar));
        akcr.a(a, "Disposables.fromAction {…stener(adapterListener) }");
        return a;
    }

    public final ajdp<Object> b(akbk<Boolean> akbk) {
        akcr.b(akbk, "handler");
        return lpi.a.a(this, akbk);
    }
}
