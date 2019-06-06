package defpackage;

import defpackage.dva.b;
import defpackage.ejy.a.a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ejv */
public final class ejv implements dno {
    public a a;
    public a b;
    public zgb c;
    public dnr d;
    private ekd e;

    /* renamed from: ejv$a */
    public static class a {
        final ajwo<Object> a = new ajwo();
        final ajdp<Boolean> b;
        final ekd c;
        private final ajdp<Object> d;
        private final ajdp<dva> e;
        private final AtomicReference<dva> f = new AtomicReference();
        private final AtomicReference<Object> g = new AtomicReference();

        public a(ajdp<Boolean> ajdp, ekd ekd, ajdp<dva> ajdp2, ebr ebr) {
            this.c = ekd;
            this.b = ajdp;
            this.e = ajdp2.a(new -$$Lambda$ejv$a$QnDwD_Pl3-Ftqxcn573m-s4xbOA(ebr));
            this.d = cfl.c(ekd.a);
        }

        private static /* synthetic */ boolean a(ebr ebr, dva dva) {
            return (dva instanceof b) && ebr.b;
        }

        public final ajdp<Object> a() {
            ajdp ajdp = this.d;
            AtomicReference atomicReference = this.g;
            atomicReference.getClass();
            return epl.a(ajdp, new -$$Lambda$wYh067be8FNfa2u-WC-x-EKijwM(atomicReference));
        }

        public final ajdp<dva> b() {
            ajdp ajdp = this.e;
            AtomicReference atomicReference = this.f;
            atomicReference.getClass();
            return epl.a(ajdp, new -$$Lambda$lsimfB5AjtG4j9XnrYd5qD1G4b8(atomicReference));
        }

        /* Access modifiers changed, original: final */
        public final ajej c() {
            return this.d.d().d(new -$$Lambda$ejv$a$7vGOQayJmIAVsRskdcYJRsc5-hM(this));
        }

        /* Access modifiers changed, original: final */
        public final ajej d() {
            return this.e.d().d(new -$$Lambda$ejv$a$BRiAlzlPwLG_2H3UiV_k67iqaaM(this));
        }
    }

    private /* synthetic */ void a(ajei ajei, ajei ajei2, Object obj) {
        ajei.dispose();
        ajei2.a(this.a.a(this.e).a(this.b).a().a().start());
    }

    public final ajej start() {
        ajei ajei = new ajei();
        ajei ajei2 = new ajei(ajei);
        this.e = this.b.c;
        String str = "FlashActivator";
        ajei.a(this.b.b.a((ajdw) zgb.a(dnh.f.callsite(str)).l()).f(new -$$Lambda$ejv$QVUeA2mSNNt-qS5prCdh8mXdeUo(this)));
        ajei.a(this.b.d());
        ajei.a(this.b.c());
        ajei.a(this.b.a.d().d(new -$$Lambda$ejv$G6X7_cRCpNBDIw0xqwXyZJI8Ui8(this, ajei, ajei2)));
        eea eea = this.e.b;
        this.d.a(eea, str);
        ajei2.a(ajek.a(new -$$Lambda$ejv$7KbL9O3V9_KDTiMS1C0dmMgDKo8(this, eea)));
        return ajei2;
    }
}
