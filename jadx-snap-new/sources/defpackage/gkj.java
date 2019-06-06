package defpackage;

import com.brightcove.player.event.EventType;
import defpackage.gkk.b;
import defpackage.gkk.c;
import java.util.HashSet;

/* renamed from: gkj */
public final class gkj extends saa {
    private final ajwy<gkk> a;

    /* renamed from: gkj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public gkj(ajwy<gkk> ajwy) {
        akcr.b(ajwy, "routingRulesManager");
        this.a = ajwy;
    }

    private void b(sak<sai> sak, sab sab) {
        akcr.b(sak, "request");
        akcr.b(sab, "chain");
        super.a((sak) sak, sab);
    }

    public final void a(sak<sai> sak, sab sab) {
        sak sak2;
        String str = "request";
        akcr.b(sak2, str);
        String str2 = "chain";
        akcr.b(sab, str2);
        akcr.b(sak2, str);
        akcr.b(sab, str2);
        gkk gkk = (gkk) this.a.get();
        Object i = sak2.i();
        String str3 = "request.url";
        akcr.a(i, str3);
        c a = gkk.a(i);
        if (a != null) {
            i = sak2.i();
            akcr.a(i, str3);
            str = a.a(i);
            sab.a().a(str, "RoutingRulesFilter");
            sak2 = sak2.h().a(str).e();
            akcr.a((Object) sak2, "request.builder.setUrl(routedUrl).build()");
        }
        b(sak2, sab);
    }

    public final void a(saq<sai> saq, sab sab) {
        String str = EventType.RESPONSE;
        akcr.b(saq, str);
        String str2 = "chain";
        akcr.b(sab, str2);
        Object a = sab.a();
        String str3 = "chain.context()";
        akcr.a(a, str3);
        a = a.b();
        String str4 = "chain.context().request";
        akcr.a(a, str4);
        a = a.i();
        akcr.a(a, "chain.context().request.url");
        Object a2 = sab.a();
        akcr.a(a2, str3);
        a2 = a2.c();
        akcr.a(a2, "chain.context().originalRequest");
        a2 = a2.i();
        akcr.a(a2, "chain.context().originalRequest.url");
        if (!(saq.b() || a.equals(a2))) {
            c a3 = ((gkk) this.a.get()).a(a2);
            if (a3 != null && a3.a(a2).equals(a)) {
                if ((a3.b == b.FAIL_OVER_TO_DEFAULT ? 1 : null) != null) {
                    akcr.b(saq, str);
                    sbg.a((sai) saq.g());
                    Object a4 = sab.a();
                    akcr.a(a4, str3);
                    a4 = a4.b();
                    akcr.a(a4, str4);
                    a4 = a4.h().a(a2).e();
                    akcr.a(a4, "chain.context().request.…rl(orgRequestUrl).build()");
                    b(a4, sab);
                    return;
                }
            }
        }
        Object a5 = sab.a();
        akcr.a(a5, str3);
        if (a5.i().size() > 0 && a2.equals(a) && saq.b()) {
            c a6 = ((gkk) this.a.get()).a(a);
            if (!(a6 == null || sab.a().a(a6.a(a2), "RoutingRulesFilter"))) {
                gkk gkk = (gkk) this.a.get();
                akcr.b(a6, "routingRule");
                HashSet hashSet = gkk.b;
                if (hashSet != null) {
                    hashSet.remove(a6);
                }
            }
        }
        akcr.b(saq, str);
        akcr.b(sab, str2);
        super.a((saq) saq, sab);
    }
}
