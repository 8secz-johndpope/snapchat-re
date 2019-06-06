package defpackage;

import android.util.AndroidRuntimeException;
import android.webkit.CookieManager;
import java.net.HttpCookie;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cnf */
public final class cnf {
    final CookieManager a;
    final cnh b;
    final cjt c;
    private final ajxe d = ajxh.a(a.a);

    /* renamed from: cnf$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ckz.a.callsite("PixelCookieManager");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cnf.class), "adCallsite", "getAdCallsite()Lcom/snap/framework/attribution/AttributedCallsite;");
    }

    public cnf(CookieManager cookieManager, cnh cnh, cjt cjt) {
        akcr.b(cookieManager, "cookieManager");
        akcr.b(cnh, "pixelTrackingConfig");
        akcr.b(cjt, "issuesReporter");
        this.a = cookieManager;
        this.b = cnh;
        this.c = cjt;
    }

    static boolean a(List<String> list, Set<String> set) {
        HashSet hashSet = new HashSet(set);
        for (String a : list) {
            Object parse = HttpCookie.parse(cnh.a(a));
            akcr.a(parse, "parsedCookies");
            for (Object obj : (Iterable) parse) {
                akcr.a(obj, "it");
                hashSet.remove(obj.getName());
            }
        }
        return hashSet.isEmpty();
    }

    /* Access modifiers changed, original: final */
    public final idd a() {
        return (idd) this.d.b();
    }

    public final boolean b() {
        try {
            String cookie = this.a.getCookie(this.b.a);
            if (cookie == null) {
                return false;
            }
            return cnf.a(akgc.a((CharSequence) cookie, new String[]{";"}, 0, 6), ajzt.a((Object[]) new String[]{this.b.c, this.b.d}));
        } catch (AndroidRuntimeException e) {
            this.c.a(ckt.NORMAL, a(), "cookie_validation_error", e, false);
            return false;
        }
    }
}
