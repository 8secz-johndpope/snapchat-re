package defpackage;

import defpackage.gfw.c;
import defpackage.gfw.d;
import defpackage.moh.b;

/* renamed from: lcg */
public final class lcg {
    static final akbl<gfw, moh> a = a.a;

    /* renamed from: lcg$a */
    static final class a extends akcs implements akbl<gfw, moh> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar;
            obj = (gfw) obj;
            akcr.b(obj, "it");
            if (akcr.a(obj, c.a) || akcr.a(obj, d.a)) {
                bVar = moh.c.a;
            } else if (akcr.a(obj, gfw.b.a)) {
                bVar = b.a;
            } else if (obj instanceof defpackage.gfw.a) {
                bVar = defpackage.moh.a.a;
            } else {
                throw new ajxk();
            }
            return bVar;
        }
    }

    static final mhs.b a(moc moc) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(moc.a());
        stringBuilder.append(':');
        stringBuilder.append(moc.getClass().getSimpleName());
        return new mhs.b(stringBuilder.toString());
    }
}
