package defpackage;

import defpackage.ele.a;

/* renamed from: elf */
public final class elf implements achh, achk<zjm, zjk> {
    final zfw a = zgb.a(adcw.b.callsite("MapTooltipEventListener"));
    ajej b;
    final ajxe<a> c = ajxh.a(new b(this));
    boolean d;
    final ajwy<a> e;
    final achb<zjm, zjk> f;
    final ajdp<ebk> g;
    final ajdp<dpw> h;
    private final ajxe i = this.c;

    /* renamed from: elf$e */
    static final class e extends akcq implements akbl<Boolean, ajxw> {
        e(elf elf) {
            super(1, elf);
        }

        public final String getName() {
            return "onCameraBusyStateChanged";
        }

        public final akej getOwner() {
            return akde.a(elf.class);
        }

        public final String getSignature() {
            return "onCameraBusyStateChanged(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            elf elf = (elf) this.receiver;
            if (booleanValue) {
                elf.a().c();
            }
            elf.d = booleanValue;
            return ajxw.a;
        }
    }

    /* renamed from: elf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: elf$b */
    static final class b extends akcs implements akbk<a> {
        private /* synthetic */ elf a;

        b(elf elf) {
            this.a = elf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            a aVar = (a) this.a.e.get();
            this.a.b = aVar.a();
            return aVar;
        }
    }

    /* renamed from: elf$c */
    public static final class c<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            boolean z = ((ebk) t1) != ebk.READY || (((dpw) t2) instanceof dpw.a);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: elf$d */
    static final class d implements ajev {
        private /* synthetic */ elf a;
        private /* synthetic */ ajej b;

        d(elf elf, ajej ajej) {
            this.a = elf;
            this.b = ajej;
        }

        public final void run() {
            ajej ajej = this.a.b;
            if (ajej != null) {
                ajej.dispose();
            }
            this.a.f.b((achk) this.a);
            this.a.f.b((achh) this.a);
            ajej = this.b;
            if (ajej != null) {
                ajej.dispose();
            }
            if (this.a.c.a()) {
                this.a.a().c();
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(elf.class), "presenter", "getPresenter()Lcom/snap/camera/subcomponents/maptooltip/MapTooltipContract$Presenter;");
        a aVar = new a();
    }

    public elf(zgb zgb, ajwy<a> ajwy, achb<zjm, zjk> achb, ajdp<ebk> ajdp, ajdp<dpw> ajdp2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "presenterProvider");
        akcr.b(achb, "navigationHost");
        akcr.b(ajdp, "captureStateObservable");
        akcr.b(ajdp2, "lensesLifecycleObservable");
        this.e = ajwy;
        this.f = achb;
        this.g = ajdp;
        this.h = ajdp2;
    }

    private final void b() {
        this.f.b((achh) this);
    }

    /* Access modifiers changed, original: final */
    public final a a() {
        return (a) this.i.b();
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.k && akcr.a((zjm) achi.e.e(), dnh.a)) {
            if (achi.l) {
                if (akcr.a((zjm) achi.f.e(), adcw.a)) {
                    a().d();
                    return;
                }
                if (this.c.a()) {
                    a().e();
                }
            } else if (akcr.a((zjm) achi.f.e(), adcw.a)) {
                a().a(achi.i);
            }
        }
    }

    public final void a(achr achr) {
        akcr.b(achr, "inputGesture");
        if (achr == achr.PINCH_OUT && !this.d) {
            a().b();
        }
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.j) {
            Object obj = (zjm) achi.f.e();
            if (akcr.a(obj, dnh.a)) {
                if (this.c.a()) {
                    a().h();
                }
                this.f.a((achh) this);
            } else if (akcr.a(obj, adcw.a)) {
                b();
                a().g();
            } else {
                b();
            }
        }
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (akcr.a((zjm) achi.f.e(), adcw.a) && akcr.a((zjm) achi.e.e(), dnh.a)) {
            a().f();
        }
    }
}
