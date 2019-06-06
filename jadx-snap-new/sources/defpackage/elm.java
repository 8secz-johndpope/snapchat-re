package defpackage;

import defpackage.eln.a.a;

/* renamed from: elm */
public final class elm implements dno {
    final ajei a = new ajei();
    public a b;
    public dpe c;
    public ftl d;
    public zgb e;
    final ajxe f = ajxh.a(new a(this));
    dpe.a g;
    elj.a h;

    /* renamed from: elm$b */
    public static final class b implements dpe.a {
        final /* synthetic */ elm a;

        /* renamed from: elm$b$a */
        static final class a implements Runnable {
            private /* synthetic */ b a;
            private /* synthetic */ aesf b;
            private /* synthetic */ boolean c;

            a(b bVar, aesf aesf, boolean z) {
                this.a = bVar;
                this.b = aesf;
                this.c = z;
            }

            public final void run() {
                ftl ftl = this.a.a.d;
                if (ftl == null) {
                    akcr.a("configProvider");
                }
                if (ftl.a((fth) dnd.ENABLE_MULTI_SNAP) && this.b == aesf.VIDEO && this.a.a.h == null) {
                    defpackage.eln.a.a aVar = this.a.a.b;
                    if (aVar == null) {
                        akcr.a("thumbnailBuilder");
                    }
                    defpackage.elj.a a = aVar.a().a();
                    this.a.a.a.a(a.start());
                    a.b(this.b, this.c);
                    this.a.a.h = a;
                    this.a.a.a().b(this.a.a.g);
                }
            }
        }

        b(elm elm) {
            this.a = elm;
        }

        public final void a() {
        }

        public final void a(aesf aesf, boolean z) {
            akcr.b(aesf, "mediaType");
            ajej e = ajcx.a((Runnable) new a(this, aesf, z)).b((ajdw) ((zfw) this.a.f.b()).h()).e();
            akcr.a((Object) e, "Completable\n            …             .subscribe()");
            ajvv.a(e, this.a.a);
        }

        public final void a(ebi ebi) {
            akcr.b(ebi, "failure");
        }

        public final void b() {
        }

        public final void c() {
        }
    }

    /* renamed from: elm$a */
    static final class a extends akcs implements akbk<zfw> {
        private /* synthetic */ elm a;

        a(elm elm) {
            this.a = elm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.a.e == null) {
                akcr.a("schedulersProvider");
            }
            return zgb.a(dnh.f.callsite("ThumbnailActivator"));
        }
    }

    /* renamed from: elm$c */
    static final class c implements ajev {
        private /* synthetic */ elm a;

        c(elm elm) {
            this.a = elm;
        }

        public final void run() {
            this.a.a().b(this.a.g);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(elm.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public final dpe a() {
        dpe dpe = this.c;
        if (dpe == null) {
            akcr.a("captureModel");
        }
        return dpe;
    }

    public final ajej start() {
        this.g = new b(this);
        dpe dpe = this.c;
        if (dpe == null) {
            akcr.a("captureModel");
        }
        dpe.a(this.g);
        this.a.a(ajek.a((ajev) new c(this)));
        return this.a;
    }
}
