package defpackage;

import defpackage.moc.b.a;
import defpackage.moc.b.b;
import defpackage.moc.b.c;

/* renamed from: lco */
public final class lco implements akbl<moc, ajdw> {
    final zfw a;
    private final ajxe b = ajxh.a(new a(this));
    private final ajxe c = ajxh.a(new b(this));

    /* renamed from: lco$a */
    static final class a extends akcs implements akbk<ajdw> {
        private /* synthetic */ lco a;

        a(lco lco) {
            this.a = lco;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zfx.a((ajdw) this.a.a.g(), 2);
        }
    }

    /* renamed from: lco$b */
    static final class b extends akcs implements akbk<ajdw> {
        private /* synthetic */ lco a;

        b(lco lco) {
            this.a = lco;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zfx.a((ajdw) this.a.a.g(), 2);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lco.class), "lensesNetworkScheduler", "getLensesNetworkScheduler()Lio/reactivex/Scheduler;"), new akdc(akde.a(lco.class), "remoteAssetsScheduler", "getRemoteAssetsScheduler()Lio/reactivex/Scheduler;")};
    }

    public lco(zfw zfw) {
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = zfw;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zfi b;
        moc moc = (moc) obj;
        akcr.b(moc, "request");
        ajxe ajxe;
        if ((moc instanceof a) || (moc instanceof c)) {
            ajxe = this.b;
            b = ajxe.b();
        } else if (moc instanceof b) {
            b = this.a.b();
        } else if (moc instanceof moc.c) {
            ajxe = this.c;
            b = ajxe.b();
        } else {
            b = this.a.f();
        }
        return b;
    }
}
