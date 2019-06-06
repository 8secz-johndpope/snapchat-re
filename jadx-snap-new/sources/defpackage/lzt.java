package defpackage;

import defpackage.mae.a;
import defpackage.maf.a.b;

/* renamed from: lzt */
public final class lzt {
    static final akbl<a, maf.a> a = a.a;

    /* renamed from: lzt$a */
    static final class a extends akcs implements akbl<defpackage.mae.a, defpackage.maf.a> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            defpackage.mae.a aVar = (defpackage.mae.a) obj;
            akcr.b(aVar, "result");
            if (!(aVar instanceof defpackage.mae.a.a)) {
                return new b();
            }
            defpackage.mae.a.a aVar2 = (defpackage.mae.a.a) aVar;
            return (((CharSequence) aVar2.b).length() > 0 ? 1 : null) != null ? new defpackage.maf.a.a.b(aVar2.a, aVar2.b, aVar2.c, (byte) 0) : new defpackage.maf.a.a.a(aVar2.a, aVar2.c, (byte) 0);
        }
    }
}
