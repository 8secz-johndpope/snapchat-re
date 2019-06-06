package defpackage;

import defpackage.lsa.d;
import defpackage.lsa.d.a.b;

/* renamed from: lsb */
public final class lsb {
    public static final akbw<d, d, Boolean> a = a.a;

    /* renamed from: lsb$a */
    static final class a extends akcs implements akbw<d, d, Boolean> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean z;
            d dVar = (d) obj;
            d dVar2 = (d) obj2;
            akcr.b(dVar, "old");
            akcr.b(dVar2, "new");
            if (dVar instanceof defpackage.lsa.d.a.a) {
                z = dVar2 instanceof defpackage.lsa.d.a.a;
            } else if (dVar instanceof b) {
                z = (dVar2 instanceof b) && akcr.a(((b) dVar2).a, ((b) dVar).a);
            } else if (dVar instanceof d.b) {
                z = dVar2 instanceof d.b;
            } else {
                throw new ajxk();
            }
            return Boolean.valueOf(z);
        }
    }
}
