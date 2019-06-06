package defpackage;

import defpackage.dva.b;
import defpackage.egw.a.a;

/* renamed from: egt */
public final class egt implements dno {
    final a a;
    private final ajdp<dva> b;
    private final zgb c;
    private final zjm d;

    /* renamed from: egt$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ egt a;

        b(egt egt) {
            this.a = egt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "captionText");
            return this.a.a.a(str).a().a();
        }
    }

    /* renamed from: egt$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            egv.a aVar = (egv.a) obj;
            akcr.b(aVar, "it");
            return aVar.start();
        }
    }

    /* renamed from: egt$d */
    static final class d<T> implements ajfl<dva> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            dva dva = (dva) obj;
            akcr.b(dva, "it");
            return dva instanceof b;
        }
    }

    /* renamed from: egt$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            dva dva = (dva) obj;
            akcr.b(dva, "it");
            acih acih = ((b) dva).b;
            obj = acih instanceof dnk.b ? ((dnk.b) acih).c : acih instanceof dnk.a ? ((dnk.a) acih).a.e : null;
            return obj == null ? ajvo.a(ajot.a) : ajdp.b(obj);
        }
    }

    /* renamed from: egt$a */
    static final class a extends akcq implements akbl<String, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final String getName() {
            return "isValidCaptionText";
        }

        public final akej getOwner() {
            return akde.a(egy.class, "camera-core_release");
        }

        public final String getSignature() {
            return "isValidCaptionText(Ljava/lang/String;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(egy.a((String) obj));
        }
    }

    public egt(a aVar, ajdp<dva> ajdp, zgb zgb, zjm zjm) {
        akcr.b(aVar, "componentBuilder");
        akcr.b(ajdp, "pageVisibilityTransitionObservable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zjm, "mainPageType");
        this.a = aVar;
        this.b = ajdp;
        this.c = zgb;
        this.d = zjm;
    }

    public final ajej start() {
        Object obj;
        String str;
        if (akcr.a(this.d, dnh.a)) {
            obj = ajfq.INSTANCE;
            str = "Disposables.disposed()";
        } else {
            zfw a = zgb.a(dnh.f.callsite("CaptionTextActivator"));
            obj = this.b.a((ajfl) d.a).k((ajfc) e.a).b((ajdw) a.h()).a((ajfl) new egu(a.a)).d().f(new b(this)).a((ajdw) a.l()).f(c.a).i();
            str = "captionTextObservable\n  …             .subscribe()";
        }
        akcr.a(obj, str);
        return obj;
    }
}
