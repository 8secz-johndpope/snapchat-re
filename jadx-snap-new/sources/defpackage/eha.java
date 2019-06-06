package defpackage;

import defpackage.ebs.d;
import defpackage.ehc.a.a;
import defpackage.eih.e;

/* renamed from: eha */
public final class eha implements dno {
    private static final String n = n;
    final ajei a = new ajei();
    a b;
    ftl c;
    ejh d;
    private final zfw e = zgb.a(dnh.f.callsite(n));
    private ajdp<e> f;
    private ajdp<Boolean> g;
    private ajdp<Boolean> h;
    private ajdp<ebs> i;
    private ajdp<duz> j;
    private eij k;
    private ajdp<ebm> l;
    private adnp m;

    /* renamed from: eha$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: eha$b */
    public static final class b<T1, T2, T3, R> implements ajfd<T1, T2, T3, R> {
        public final R apply(T1 t1, T2 t2, T3 t3) {
            boolean z = ((Boolean) t1).booleanValue() && ((duz) t2) == duz.FULLY_VISIBLE && akcr.a((ebs) t3, d.b);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: eha$i */
    static final class i<T> implements ajfb<Boolean> {
        private /* synthetic */ eha a;

        i(eha eha) {
            this.a = eha;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                this.a.d.a();
            } else {
                this.a.d.b();
            }
        }
    }

    /* renamed from: eha$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ eha a;

        c(eha eha) {
            this.a = eha;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                this.a.d.c();
            } else {
                this.a.d.d();
            }
        }
    }

    /* renamed from: eha$d */
    static final class d<T> implements ajfl<e> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            e eVar = (e) obj;
            akcr.b(eVar, "it");
            return eVar == e.SNAP_BUTTON_DOWN || eVar == e.HARDWARE_KEY_DOWN || eVar == e.EXTERNAL_RECORDING_REQUESTED;
        }
    }

    /* renamed from: eha$e */
    static final class e implements ajev {
        private /* synthetic */ eha a;
        private /* synthetic */ ajej b;

        e(eha eha, ajej ajej) {
            this.a = eha;
            this.b = ajej;
        }

        public final void run() {
            this.b.dispose();
            igk.a(this.a.b.a().a().start(), this.a.a);
        }
    }

    /* renamed from: eha$f */
    static final class f<T> implements ajfb<ebs> {
        private /* synthetic */ eha a;

        f(eha eha) {
            this.a = eha;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c.a((fth) dnd.RECORD_THREE_SECOND_SEGMENT);
            this.a.c.a((fth) dnd.EARLY_INIT_RECORDER_ENABLED);
        }
    }

    /* renamed from: eha$g */
    static final class g implements ajev {
        private /* synthetic */ eha a;

        g(eha eha) {
            this.a = eha;
        }

        public final void run() {
            adnp.a();
        }
    }

    /* renamed from: eha$h */
    static final class h implements ajev {
        private /* synthetic */ eha a;

        h(eha eha) {
            this.a = eha;
        }

        public final void run() {
            this.a.d.b();
        }
    }

    static {
        a aVar = new a();
    }

    public eha(zgb zgb, ajdp<e> ajdp, a aVar, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, ajdp<ebs> ajdp4, ajdp<duz> ajdp5, eij eij, ftl ftl, ajdp<ebm> ajdp6, ejh ejh, adnp adnp) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdp, "captureActionObservable");
        akcr.b(aVar, "captureBuilder");
        akcr.b(ajdp2, "captureEnabled");
        akcr.b(ajdp3, "hardwareCaptureEnabled");
        akcr.b(ajdp4, "streamingStateObservable");
        akcr.b(ajdp5, "pageVisibilityObservable");
        akcr.b(eij, "captureResultCollector");
        akcr.b(ftl, "configurationProvider");
        akcr.b(ajdp6, "externalMediaCreationEventObservable");
        akcr.b(ejh, "captureActivatorView");
        akcr.b(adnp, "mimeTools");
        this.f = ajdp;
        this.b = aVar;
        this.g = ajdp2;
        this.h = ajdp3;
        this.i = ajdp4;
        this.j = ajdp5;
        this.k = eij;
        this.c = ftl;
        this.l = ajdp6;
        this.d = ejh;
        this.m = adnp;
    }

    public final ajej start() {
        igk.a(this.k.start(), this.a);
        ajdp a = ajdp.a((ajdt) this.g, (ajdt) this.j, (ajdt) this.i, (ajfd) new b());
        if (a == null) {
            akcr.a();
        }
        ajej f = a.j(ajfu.a).f((ajfb) new i(this));
        igk.a(f, this.a);
        igk.a(this.h.f((ajfb) new c(this)), this.a);
        igk.a(this.f.a((ajfl) d.a).d().d().a((ajdb) this.l.d().d()).g(new e(this, f)), this.a);
        igk.a(this.i.d().a((ajdw) this.e.f()).d((ajfb) new f(this)), this.a);
        igk.a(ajcx.a((ajev) new g(this)).b((ajdw) this.e.f()).e(), this.a);
        this.a.a(ajek.a((ajev) new h(this)));
        return this.a;
    }
}
