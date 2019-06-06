package defpackage;

import defpackage.lpj.a;
import defpackage.lqh.b;
import defpackage.lqh.b.a.c;

/* renamed from: kyb */
public final class kyb implements dno, mha {
    private final a a;
    private final kxe b;
    private final ajdv<dpw> c;
    private final zfw d;

    /* renamed from: kyb$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (b) obj;
            akcr.b(obj, "it");
            if (obj instanceof c) {
                obj = ajdp.b(new defpackage.dpw.a.b(((c) obj).a.a));
                akcr.a(obj, "just(LensesCameraLifecyc…ithLens(it.lensId.value))");
                return obj;
            }
            String str = "just(LensesCameraLifecycle.Activated.Empty)";
            if (obj instanceof defpackage.lqh.b.a.a) {
                obj = ajdp.b(defpackage.dpw.a.a.a);
                akcr.a(obj, str);
                return obj;
            } else if (akcr.a(obj, b.b.a)) {
                obj = ajdp.b(dpw.b.a);
                akcr.a(obj, "just(LensesCameraLifecycle.Deactivated)");
                return obj;
            } else if (obj instanceof defpackage.lqh.b.a.b) {
                obj = ajdp.b(defpackage.dpw.a.a.a);
                akcr.a(obj, str);
                return obj;
            } else {
                throw new ajxk();
            }
        }
    }

    public kyb(a aVar, kxe kxe, ajdv<dpw> ajdv, zfw zfw) {
        akcr.b(aVar, "cameraBuilder");
        akcr.b(kxe, "cameraUseCaseActionSource");
        akcr.b(ajdv, "lensesLifecycleObserver");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = aVar;
        this.b = kxe;
        this.c = ajdv;
        this.d = zfw;
    }

    public final ajej a() {
        ajei ajei = new ajei();
        lpj a = this.a.a();
        ajei.a(a.a());
        ajei.a(this.b.a(a.c()).f(a.c().a()));
        Object u = a.c().b().j(ajfu.a).u(a.a);
        akcr.a(u, "cameraComponent.cameraUs…      }\n                }");
        ajei.a((ajej) u.c((ajdv) new ajvl(this.c)));
        return ajei;
    }

    public final ajdp<Object> b() {
        Object b = mha.a.a(this).b((ajdw) this.d.h());
        akcr.a(b, "super.observe().subscrib…dulers.userInteractive())");
        return b;
    }

    public final ajej start() {
        Object l = b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }
}
