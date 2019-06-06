package defpackage;

import com.brightcove.player.event.Event;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.iib.a;

/* renamed from: zlj */
public final class zlj extends zgi implements achk<zjm, zjk> {
    static final String d = d;
    boolean a;
    boolean b;
    public final achb<zjm, zjk> c;
    private final ajxe e;
    private final iii f;

    /* renamed from: zlj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zlj$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zgu.a.callsite(zlj.d));
        }
    }

    /* renamed from: zlj$1 */
    static final class 1 implements ajev {
        private /* synthetic */ zlj a;

        1(zlj zlj) {
            this.a = zlj;
        }

        public final void run() {
            this.a.c.b((achk) this.a);
        }
    }

    /* renamed from: zlj$2 */
    static final class 2<T> implements ajfb<ajxm<? extends a, ? extends Boolean>> {
        private /* synthetic */ zlj a;

        2(zlj zlj) {
            this.a = zlj;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            a aVar = (a) ajxm.a;
            obj = (Boolean) ajxm.b;
            zlj zlj = this.a;
            Object obj2 = aVar.a;
            akcr.a(obj2, "screenParam.resolution");
            zlj.a = obj2.c();
            zlj zlj2 = this.a;
            akcr.a(obj, "useWindowConfig");
            zlj2.b = obj.booleanValue();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zlj.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public zlj(achb<zjm, zjk> achb, iib iib, zgk<b> zgk, iii iii, ajei ajei, ajwy<ftl> ajwy, zgb zgb) {
        akcr.b(achb, "navigationHost");
        akcr.b(iib, "screenParameterProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(iii, "windowConfiguration");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ajwy, Event.CONFIGURATION);
        akcr.b(zgb, "schedulersProvider");
        super(zgk);
        this.c = achb;
        this.f = iii;
        this.e = ajxh.a(new b(zgb));
        Object b = iib.b().b((ajdw) c().h());
        akcr.a(b, "screenParameterProvider.…dulers.userInteractive())");
        ajeb ajeb = (ajeb) b;
        Object b2 = ((ftl) ajwy.get()).b((fth) fxs.INSETS_DETECTOR_V2).b((ajdw) c().b());
        akcr.a(b2, "configuration.get().getB…schedulers.computation())");
        ajej e = ajwc.a(ajeb, (ajeb) b2).c((ajev) new 1(this)).e((ajfb) new 2(this));
        akcr.a((Object) e, "Singles.zip(\n           …useWindowConfig\n        }");
        ajvv.a(e, ajei);
    }

    private final zfw c() {
        return (zfw) this.e.b();
    }

    public final ajej a() {
        if (this.b) {
            iii.a.a aVar = this.f.a;
            if (aVar != null) {
                this.f.a(aVar, true);
            }
        }
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        return obj;
    }

    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            if (r0 == null) goto L_0x0027;
     */
    public final void a(defpackage.achi<defpackage.zjm, defpackage.zjk> r3) {
        /*
        r2 = this;
        r0 = "navigationEvent";
        defpackage.akcr.b(r3, r0);
        r0 = r2.b;
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r0 = r3.l;
        if (r0 == 0) goto L_0x0043;
    L_0x000e:
        r0 = r3.j;
        if (r0 == 0) goto L_0x0043;
    L_0x0012:
        r3 = r3.f;
        r0 = r3.d();
        r1 = r0 instanceof defpackage.zjf;
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        r0 = 0;
    L_0x001d:
        r0 = (defpackage.zjf) r0;
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r0 = r0.c();
        if (r0 != 0) goto L_0x002b;
    L_0x0027:
        r0 = r3.d();
    L_0x002b:
        r3 = r0 instanceof defpackage.zli;
        if (r3 == 0) goto L_0x0038;
    L_0x002f:
        r0 = (defpackage.zli) r0;
        r3 = r2.a;
        r3 = r0.a(r3);
        goto L_0x003d;
    L_0x0038:
        r3 = new iii$a$a;
        r3.<init>();
    L_0x003d:
        r0 = r2.f;
        r1 = 0;
        r0.a(r3, r1);
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlj.a(achi):void");
    }

    public final void b(achi<zjm, zjk> achi) {
    }

    public final void c(achi<zjm, zjk> achi) {
    }
}
