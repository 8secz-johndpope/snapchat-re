package defpackage;

import defpackage.mpl.c;
import java.util.Date;

/* renamed from: naw */
public final class naw {
    static final akbl<nau, c> a = a.a;

    /* renamed from: naw$a */
    static final class a extends akcs implements akbl<nau, c> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            nau nau = (nau) obj;
            akcr.b(nau, "userData");
            String str = nau.b;
            String str2 = nau.c;
            Long l = nau.e;
            long longValue = l != null ? l.longValue() : 0;
            l = nau.d;
            return new c(str, str2, longValue, l != null ? new Date(l.longValue()) : null, nau.f);
        }
    }
}
