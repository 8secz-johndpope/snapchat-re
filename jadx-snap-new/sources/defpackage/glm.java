package defpackage;

import com.google.common.base.Supplier;
import defpackage.sak.a;

/* renamed from: glm */
public final class glm implements rzn<ryz> {
    final Supplier<rxk> a;
    final idm b;
    private final gkd c = new gkd();
    private final ifg d;

    /* renamed from: glm$d */
    static final class d extends akcs implements akbk<defpackage.ryx.d> {
        private /* synthetic */ glm a;
        private /* synthetic */ ryz b;
        private /* synthetic */ String c;

        d(glm glm, ryz ryz, String str) {
            this.a = glm;
            this.b = ryz;
            this.c = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ryz ryz = this.b;
            String str = this.c;
            Object obj = this.a.a.get();
            akcr.a(obj, "networkConditionProvider.get()");
            return new defpackage.ryx.d(ryz, str, (rxk) obj, this.a.b.b());
        }
    }

    /* renamed from: glm$f */
    static final class f extends akcs implements akbk<defpackage.ryx.f> {
        private /* synthetic */ glm a;
        private /* synthetic */ ryz b;

        f(glm glm, ryz ryz) {
            this.a = glm;
            this.b = ryz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ryz ryz = this.b;
            Object obj = this.a.a.get();
            akcr.a(obj, "networkConditionProvider.get()");
            return new defpackage.ryx.f(ryz, (rxk) obj);
        }
    }

    /* renamed from: glm$a */
    static final class a extends akcs implements akbk<defpackage.ryx.a> {
        private /* synthetic */ glm a;
        private /* synthetic */ ryz b;

        a(glm glm, ryz ryz) {
            this.a = glm;
            this.b = ryz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ryz ryz = this.b;
            Object obj = this.a.a.get();
            akcr.a(obj, "networkConditionProvider.get()");
            return new defpackage.ryx.a(ryz, (rxk) obj, this.a.b.b());
        }
    }

    /* renamed from: glm$h */
    static final class h extends akcs implements akbk<defpackage.ryx.h> {
        private /* synthetic */ ryz a;
        private /* synthetic */ sat b;

        h(ryz ryz, sat sat) {
            this.a = ryz;
            this.b = sat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.ryx.h(this.a, this.b);
        }
    }

    /* renamed from: glm$g */
    static final class g extends akcs implements akbk<defpackage.ryx.g> {
        private /* synthetic */ ryz a;
        private /* synthetic */ sat b;

        g(ryz ryz, sat sat) {
            this.a = ryz;
            this.b = sat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.ryx.g(this.a, this.b);
        }
    }

    /* renamed from: glm$b */
    static final class b extends akcs implements akbk<defpackage.ryx.b> {
        private /* synthetic */ glm a;
        private /* synthetic */ ryz b;
        private /* synthetic */ sat c;
        private /* synthetic */ sao d;

        b(glm glm, ryz ryz, sat sat, sao sao) {
            this.a = glm;
            this.b = ryz;
            this.c = sat;
            this.d = sao;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ryz ryz = this.b;
            sat sat = this.c;
            sao sao = this.d;
            Object obj = this.a.a.get();
            akcr.a(obj, "networkConditionProvider.get()");
            return new defpackage.ryx.b(ryz, sat, sao, (rxk) obj, this.a.b.b());
        }
    }

    /* renamed from: glm$c */
    static final class c extends akcs implements akbk<defpackage.ryx.c<ryz>> {
        private /* synthetic */ ryz a;
        private /* synthetic */ ryz b;

        c(ryz ryz, ryz ryz2) {
            this.a = ryz;
            this.b = ryz2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.ryx.c(this.a, this.b);
        }
    }

    /* renamed from: glm$e */
    static final class e extends akcs implements akbk<defpackage.ryx.e> {
        private /* synthetic */ ryz a;
        private /* synthetic */ sat b;

        e(ryz ryz, sat sat) {
            this.a = ryz;
            this.b = sat;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new defpackage.ryx.e(this.a, this.b);
        }
    }

    public glm(ifg ifg, Supplier<rxk> supplier, idm idm) {
        akcr.b(ifg, "netEventBus");
        akcr.b(supplier, "networkConditionProvider");
        akcr.b(idm, "uiPageManager");
        this.d = ifg;
        this.a = supplier;
        this.b = idm;
    }

    private static <Req extends sak<?>, T> ajxw a(Req req, akbk<? extends T> akbk) {
        ifi a = sbr.a(req);
        if (a == null) {
            return null;
        }
        a.a(akbk.invoke());
        return ajxw.a;
    }

    public final /* synthetic */ sak a(sak sak) {
        ryz ryz = (ryz) sak;
        akcr.b(ryz, "networkRequest");
        if (sbr.a(ryz) == null && this.d != null) {
            Object a = ryz.h();
            akcr.a(a, "it");
            sbr.a((a) a, this.d.a());
            ryz = a.e();
            akcr.a((Object) ryz, "networkRequest.builder.a…())\n            }.build()");
        }
        return ryz;
    }

    public final /* synthetic */ void a(sak sak, sat sat, sao sao) {
        ryz ryz = (ryz) sak;
        akcr.b(ryz, "networkRequest");
        akcr.b(sat, "networkResult");
        akcr.b(sao, "requestFinishedInfo");
        glm.a((sak) ryz, (akbk) new b(this, ryz, sat, sao));
    }

    public final /* synthetic */ void b(sak sak) {
        ryz ryz = (ryz) sak;
        akcr.b(ryz, "networkRequest");
        glm.a((sak) ryz, (akbk) new f(this, ryz));
    }

    public final /* synthetic */ void b(sak sak, sat sat) {
        ryz ryz = (ryz) sak;
        akcr.b(ryz, "networkRequest");
        akcr.b(sat, "networkResult");
        glm.a((sak) ryz, (akbk) new h(ryz, sat));
    }

    public final /* synthetic */ void c(sak sak) {
        ryz ryz = (ryz) sak;
        akcr.b(ryz, "networkRequest");
        glm.a((sak) ryz, (akbk) new a(this, ryz));
    }

    public final /* synthetic */ void c(sak sak, sat sat) {
        ryz ryz = (ryz) sak;
        akcr.b(ryz, "networkRequest");
        akcr.b(sat, "networkResult");
        glm.a((sak) ryz, (akbk) new g(ryz, sat));
    }
}
