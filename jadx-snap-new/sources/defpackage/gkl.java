package defpackage;

import com.brightcove.player.event.EventType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.Map;

/* renamed from: gkl */
public final class gkl extends saa {
    private final abss a;

    public gkl(abss abss) {
        akcr.b(abss, "releaseManager");
        this.a = abss;
    }

    private boolean a(String str) {
        akcr.b(str, "host");
        boolean p = this.a.p();
        Object obj = "auth.snapchat.com";
        Object obj2 = utp.a;
        return p ? akcr.a((Object) str, obj2) || akcr.a((Object) str, (Object) "devsnapchat.appspot.com") || akcr.a((Object) str, obj) || akcr.a((Object) str, (Object) "everybodysayhodor.appspot.com") || akgb.c(str, "-dot-feelinsonice-hrd.appspot.com") || akgb.c(str, "-dot-devsnapchat.appspot.com") || akgb.c(str, "-dot-sc-auth-service.appspot.com") || akgb.c(str, "-dot-everybodysayhodor.appspot.com") : akcr.a((Object) str, obj2) || akcr.a((Object) str, obj);
    }

    private static URL b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private void b(saq<sai> saq, sab sab) {
        akcr.b(saq, EventType.RESPONSE);
        akcr.b(sab, "chain");
        super.a((saq) saq, sab);
    }

    public final void a(saq<sai> saq, sab sab) {
        String str = EventType.RESPONSE;
        akcr.b(saq, str);
        akcr.b(sab, "chain");
        Object a = sab.a();
        String str2 = "chain.context()";
        akcr.a(a, str2);
        akcr.a(a.i(), "chain.context().visitedUrls");
        a = sab.a();
        akcr.a(a, str2);
        a = a.b();
        String str3 = "chain.context().request";
        akcr.a(a, str3);
        akcr.b(a, "request");
        akcr.b(saq, str);
        String str4 = null;
        if (saq.a() == 307) {
            Object j = a.j();
            akcr.a(j, "request.host");
            if (a(j)) {
                Map h = saq.h();
                str = h != null ? (String) h.get("Location") : null;
                CharSequence charSequence = str;
                a = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                if (a == null) {
                    URL b = gkl.b(str);
                    if (b != null) {
                        a = b.getHost();
                        akcr.a(a, "newUrl.host");
                        Object obj = Locale.US;
                        akcr.a(obj, "Locale.US");
                        if (a != null) {
                            a = a.toLowerCase(obj);
                            akcr.a(a, "(this as java.lang.String).toLowerCase(locale)");
                            if (a(a)) {
                                str4 = str;
                            }
                        } else {
                            throw new ajxt("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            }
        }
        if (str4 == null) {
            b(saq, sab);
        } else if (sab.a().a(str4, "Status307RedirectFilter")) {
            sbg.a((sai) saq.g());
            Object a2 = sab.a();
            akcr.a(a2, str2);
            sak b2 = a2.b();
            akcr.a((Object) b2, str3);
            b2.h().a(str4).e();
            sab.a(b2);
        } else {
            b(saq, sab);
        }
    }
}
