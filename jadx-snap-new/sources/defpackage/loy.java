package defpackage;

import defpackage.lqh.b;
import defpackage.lqh.b.a.c;
import defpackage.lsa.a;

/* renamed from: loy */
final class loy<T, R> implements ajfc<T, ajdt<? extends R>> {
    public static final loy a = new loy();

    loy() {
    }

    public final /* synthetic */ Object apply(Object obj) {
        ajxm ajxm = (ajxm) obj;
        akcr.b(ajxm, "<name for destructuring parameter 0>");
        b bVar = (b) ajxm.a;
        lqf lqf = (lqf) ajxm.b;
        if (bVar instanceof b.b) {
            return ajdp.b(a.b.a);
        }
        Object obj2 = "Carousel";
        if ((bVar instanceof b.a.a) && (lqf instanceof lqf.b.b) && (akcr.a(((b.a.a) bVar).a, obj2) ^ 1) != 0) {
            return ajdp.b(new a.a.a());
        }
        if (bVar instanceof c) {
            c cVar = (c) bVar;
            if ((akcr.a(cVar.b, obj2) ^ 1) != 0) {
                return ajdp.b(new a.a.c(cVar.a));
            }
        }
        if (bVar instanceof b.a.b.a) {
            return ajdp.b(new a.a.b());
        }
        if (bVar instanceof b.a.b.b) {
            b.a.b.b bVar2 = (b.a.b.b) bVar;
            if ((akcr.a(bVar2.b, obj2) ^ 1) != 0) {
                return ajdp.b(new a.a.c(bVar2.a));
            }
        }
        return ajvo.a(ajot.a);
    }
}
