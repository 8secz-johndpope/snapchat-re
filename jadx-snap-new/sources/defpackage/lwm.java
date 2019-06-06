package defpackage;

import defpackage.lwj.a;
import defpackage.lwk.a.b;

/* renamed from: lwm */
public final class lwm implements lwi {
    private final ajdp<lwk> a;
    private final lwj b;
    private final zfw c;

    /* renamed from: lwm$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            if (aVar instanceof defpackage.lwj.a.b) {
                return new defpackage.lwk.a.b(((defpackage.lwj.a.b) aVar).a);
            }
            if (aVar instanceof a.a) {
                return lwk.a.a.a;
            }
            throw new ajxk();
        }
    }

    /* renamed from: lwm$c */
    static final class c<T1, T2> implements ajey<lwk.a, lwk.a> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            lwk.a aVar = (lwk.a) obj;
            lwk.a aVar2 = (lwk.a) obj2;
            akcr.b(aVar, "old");
            akcr.b(aVar2, "new");
            if (aVar instanceof lwk.a.a) {
                return akcr.a(akde.a(aVar.getClass()), akde.a(aVar2.getClass()));
            }
            if (aVar instanceof b) {
                return (aVar2 instanceof b) && akcr.a(((b) aVar).a, ((b) aVar2).a);
            } else {
                throw new ajxk();
            }
        }
    }

    /* renamed from: lwm$a */
    static final class a<T> implements ajfb<ajxm<? extends lwk, ? extends defpackage.lwk.a>> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ((lwk) ajxm.a).accept((defpackage.lwk.a) ajxm.b);
        }
    }

    public lwm(ajdp<lwk> ajdp, lwj lwj, zfw zfw) {
        akcr.b(ajdp, "view");
        akcr.b(lwj, "useCase");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = lwj;
        this.c = zfw;
    }

    public final ajej a() {
        Object a = this.b.b().p(b.a).h(lwk.a.a.a).a((ajey) c.a);
        akcr.a(a, "useCase.outputs\n        …      }\n                }");
        a = myu.a(this.a, a).a((ajdw) this.c.l()).f((ajfb) a.a);
        akcr.a(a, "pairLatest(view, viewMod…) -> view.accept(model) }");
        return a;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
