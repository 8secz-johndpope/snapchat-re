package defpackage;

import defpackage.meo.b;
import defpackage.meo.b.c;
import defpackage.mep.a;

/* renamed from: mef */
public final class mef {
    static final akbl<b, mep.b> a = a.a;
    static final akbl<a, meo.a> b = b.a;

    /* renamed from: mef$a */
    static final class a extends akcs implements akbl<b, mep.b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mep.b.b bVar;
            obj = (b) obj;
            akcr.b(obj, "result");
            if (akcr.a(obj, c.a)) {
                bVar = mep.b.b.a;
            } else if (akcr.a(obj, defpackage.meo.b.a.a) || akcr.a(obj, b.b.a)) {
                bVar = defpackage.mep.b.a.a;
            } else {
                throw new ajxk();
            }
            return bVar;
        }
    }

    /* renamed from: mef$b */
    static final class b extends akcs implements akbl<a, meo.a> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (a) obj;
            akcr.b(obj, "event");
            if (akcr.a(obj, a.a.a)) {
                return meo.a.a.a;
            }
            throw new ajxk();
        }
    }
}
