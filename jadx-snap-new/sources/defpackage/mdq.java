package defpackage;

import defpackage.mec.c;
import defpackage.mec.c.a;
import defpackage.mec.c.d;

/* renamed from: mdq */
public final class mdq {
    static final akbw<c, c, c> a = b.a;
    static final akbw<c, c, Boolean> b = a.a;

    /* renamed from: mdq$b */
    static final class b extends akcs implements akbw<c, c, c> {
        public static final b a = new b();

        b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (c) obj;
            obj2 = (c) obj2;
            akcr.b(obj, "old");
            akcr.b(obj2, "new");
            return (akcr.a(obj, a.a) && akcr.a(obj2, d.a.a)) ? a.a : obj2;
        }
    }

    /* renamed from: mdq$a */
    static final class a extends akcs implements akbw<c, c, Boolean> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (c) obj;
            obj2 = (c) obj2;
            akcr.b(obj, "old");
            akcr.b(obj2, "new");
            return Boolean.valueOf(akcr.a(obj, defpackage.mec.c.a.a) ? akcr.a(obj2, defpackage.mec.c.a.a) : false);
        }
    }
}
