package defpackage;

import defpackage.adob.a;
import java.io.File;
import java.util.List;

/* renamed from: adoe */
public final class adoe {
    private final ilv a;

    /* renamed from: adoe$a */
    static final class a implements defpackage.adob.a {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ adob a(String str) {
            return new adhc(str);
        }
    }

    /* renamed from: adoe$b */
    static final class b implements a {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ adob a(String str) {
            return new adoa(new File(str));
        }
    }

    public adoe() {
        this(null);
    }

    public adoe(ilv ilv) {
        this.a = ilv;
    }

    private final a a(adno adno) {
        return a(adno, adnn.SYSTEM_RETRIEVER, (a) b.a);
    }

    private final a a(adno adno, adnn adnn, a aVar) {
        ilv ilv = this.a;
        return ilv != null ? new adoc(adno, adnn, ilv, aVar) : aVar;
    }

    private final adob a(String str, adno adno, List<? extends a> list) {
        adnb adnb = new adnb(str, (List) list);
        ilv ilv = this.a;
        adob adod = ilv != null ? new adod(adnb, adno, ilv) : adnb;
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                ajym.a();
            }
            a aVar = (a) next;
            if (aVar instanceof adoc) {
                ((adoc) aVar).b("@".concat(String.valueOf(i)));
            }
            i = i2;
        }
        return adod;
    }

    private final a b(adno adno) {
        return a(adno, adnn.MP4_RETRIEVER, (a) a.a);
    }

    public final adob a(String str, adno adno) {
        akcr.b(str, "path");
        akcr.b(adno, "useCase");
        return a(str, adno, ajym.b((Object[]) new a[]{a(adno), b(adno)}));
    }

    public final adob b(String str, adno adno) {
        akcr.b(str, "path");
        akcr.b(adno, "useCase");
        return a(str, adno, ajym.b((Object[]) new a[]{b(adno), a(adno)}));
    }
}
