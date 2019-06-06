package defpackage;

import android.util.Base64;
import defpackage.hbw.a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hrd */
public final class hrd implements hhu {
    private final dis a;
    private final hhq b;
    private final hnc c;
    private final zfw d;
    private final hbw e;
    private final hnw f;
    private final iha g;
    private final hpr h;
    private final ajei i = new ajei();

    public hrd(dis dis, zfw zfw, hnc hnc, hbw hbw, hnw hnw, hhq hhq, iha iha, hpr hpr) {
        this.a = dis;
        this.c = hnc;
        this.d = zfw;
        this.e = hbw;
        this.f = hnw;
        this.b = hhq;
        this.g = iha;
        this.h = hpr;
    }

    private static abfc a(abey abey) {
        abfc abfd = hrd.b(abey) ? new abfd() : new abfc();
        abfd.q = abey;
        return abfd;
    }

    private abfc a(abey abey, hiq hiq, String str, String str2, abfi abfi, boolean z, zyr zyr, String str3, Long l, String str4, String str5, abfb abfb, String str6) {
        hnb b = this.c.b();
        abfc a = hrd.a(abey);
        a.l = Long.valueOf((long) b.d);
        a.s = zyr;
        a.g = str;
        if (z) {
            a.w = Boolean.TRUE;
        }
        a.h = str2;
        a.j = abff.TWO_COLUMNS;
        a.m = abfi;
        a.n = str4;
        a.t = str3;
        a.u = l;
        a.c = hnx.a(hiq);
        a.e = hnx.b(hiq);
        a.i = str5;
        a.r = abfb;
        a.b = str6;
        if (hiq != null) {
            a.d = Long.valueOf((long) this.f.a(hiq.k()));
            a.v = Boolean.valueOf(hiq.d());
            a.k = Long.valueOf((long) hiq.a());
            a.o = hiq.b();
            a.p = hiq.c();
            byte[] g = hiq.g();
            if (g != null && g.length > 0) {
                a.y = Base64.encodeToString(g, 0);
            }
        }
        return a;
    }

    private abfc a(zyr zyr, abey abey, hio hio) {
        return a(zyr, abey, hio, null, null);
    }

    private abfc a(zyr zyr, abey abey, hio hio, String str, Long l) {
        return a(zyr, abey, hio, str, l, null, null);
    }

    private abfc a(zyr zyr, abey abey, hio hio, String str, Long l, abfb abfb, String str2) {
        Object obj = hio.d() == hbj.FRIEND_STORY_CARD ? 1 : null;
        return a(abey, hio.g(), hio.l(), obj != null ? null : hio.e(), hrd.h(hio), hio.q(), zyr, str, l, hio.o(), obj != null ? ((hjh) hio).z() : null, abfb, str2);
    }

    private static Map<hjd, a> a(Map<hjd, a> map, achg achg) {
        if (achg.equals(hbn.a)) {
            return map;
        }
        if (achg.equals(hbn.b)) {
            HashMap hashMap = new HashMap();
            hashMap.put(hje.b, map.get(hje.b));
            return hashMap;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(achg.c());
        stringBuilder.append(" not supported to get interactions map");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void a(aaka aaka) {
        hnb b = this.c.b();
        aaka.a = b.b;
        aaka.f = b.a;
        this.a.a(aaka);
    }

    private void a(abfe abfe, hio hio, zyr zyr) {
        if (!hrd.g(hio)) {
            hnb b = this.c.b();
            if (hio.q()) {
                abfe.t = Boolean.TRUE;
            }
            Object obj = hio.d() == hbj.FRIEND_STORY_CARD ? 1 : null;
            abfe.k = Long.valueOf((long) b.d);
            abfe.g = zyr;
            abfe.h = hio.l();
            abfe.i = abff.TWO_COLUMNS;
            abfe.l = hrd.h(hio);
            abfe.n = obj != null ? null : hio.e();
            abfe.m = hio.o();
            hiq g = hio.g();
            abfe.s = Boolean.valueOf(g.d());
            abfe.j = Long.valueOf((long) g.a());
            abfe.p = g.b();
            abfe.q = g.c();
            abfe.c = hnx.a(g);
            abfe.e = hnx.b(g);
            abfe.d = Long.valueOf((long) this.f.a(g.k()));
            abfe.o = hrd.f(hio);
            byte[] h = g.h();
            if (h != null && h.length > 0) {
                abfe.v = Base64.encodeToString(h, 0);
            }
            a((aaka) abfe);
        }
    }

    private static boolean a(Map<hjd, a> map) {
        for (a b : map.values()) {
            if (b.b() > 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(abey abey) {
        switch (abey) {
            case ADD_FRIENDS_BUTTON_CLICK:
            case ADD_TO_STORY:
            case DISMISS_AT_UP_NEXT:
            case EXPAND_SECTION:
            case FAVORITE:
            case HIDE:
            case NAVIGATE_PAST_AT_UP_NEXT:
            case OPEN_CHAT_VIEW:
            case OPT_INTO_NOTIFICATION:
            case OPT_OUT_OF_NOTIFICATION:
            case REPORT_INAPPROPRIATE:
            case REPORT_IRRELEVANT:
            case SCREENSHOT:
            case SEND:
            case SHARE_EXTERNALLY:
            case SHARE_EXTERNALLY_COMPLETED:
            case SHOW_CONTEXT_CARDS:
            case TAP_CONTEXT_CARD:
            case UNFAVORITE:
            case UNHIDE:
            case UNLOCK_LENS:
            case VIEW:
                return true;
            default:
                return false;
        }
    }

    private static String f(hio hio) {
        return hio instanceof hjh ? ((hjh) hio).z() : null;
    }

    private static boolean g(hio hio) {
        return hio.d() == hbj.ERROR;
    }

    private static abfi h(hio hio) {
        switch (hio.d()) {
            case MAP_TILE_CARD:
                return abfi.MAP;
            case MOMENT_CARD:
                return abfi.LIVE;
            case PROMOTED_STORY_CARD:
                return abfi.PROMOTED;
            case OUR_STORY_CARD:
                return abfi.DYNAMIC;
            case PUBLISHER_STORY_CARD:
                return abfi.PUBLISHER;
            case PUBLIC_USER_STORY_CARD:
                return ((hio instanceof hjg) && ((hjg) hio).H()) ? abfi.OFFICIAL : abfi.PUBLIC;
            case FRIEND_STORY_CARD:
                return abfi.FRIEND;
            case UNKNOWN:
                return abfi.UNSPECIFIED;
            default:
                return abfi.UNSPECIFIED;
        }
    }

    public final ajcx D_() {
        return ajvo.a(ajhn.a);
    }

    public final void E_() {
    }

    public final void F_() {
        this.i.a(this.h.a().b((ajdw) this.d.b()).a(new -$$Lambda$hrd$zM2G-LoKXi8wztaotMhBLVXrYGI(this), new -$$Lambda$hrd$gJomUqoKRq36Dlf3iHMHIlUkRmg(this)));
    }

    public final void G_() {
        aaka a = hrd.a(abey.SCREENSHOT);
        a.j = abff.TWO_COLUMNS;
        a(a);
    }

    public final void a(double d, double d2, zyr zyr, hjd hjd) {
        aaka aakd = new aakd();
        aakd.h = Double.valueOf(d);
        aakd.i = Double.valueOf(d2);
        aakd.g = zyr;
        aakd.c = hqn.e(hjd);
        aakd.d = Long.valueOf((long) this.f.a(hjd));
        aakd.e = hnx.a(hjd);
        a(aakd);
    }

    public final void a(hio hio) {
        a(a(zyr.TAP, abey.OPT_INTO_NOTIFICATION, hio, null, null, abfb.DROP_DOWN_TOAST, null));
    }

    public final void a(hio hio, double d) {
    }

    public final void a(hio hio, long j, float f, abpq abpq) {
        if (hio instanceof hjq) {
            this.b.a((hjq) hio, j, f, abpq);
        }
    }

    public final void a(hio hio, abey abey, zyr zyr) {
        aaka a = a(zyr, abey, hio);
        a.x = hio.t() ? abfh.RECOMMENDATION : abfh.UP_NEXT;
        a(a);
    }

    public final void a(hio hio, String str) {
        a(a(zyr.TAP, abey.OPT_INTO_NOTIFICATION, hio, null, null, abfb.ACTION_MENU, str));
    }

    public final void a(hio hio, String str, float f) {
        this.b.a(hio, str, f);
    }

    public final void a(hio hio, String str, Long l) {
        a(a(null, abey.SCREENSHOT, hio, str, l));
    }

    public final void a(hio hio, String str, Long l, aajr aajr, aajv aajv, aasc aasc, Double d, Double d2, Long l2, Long l3, Long l4, Double d3, abfl abfl, abfh abfh, String str2, int i, String str3) {
        abfl abfl2 = abfl;
        abfh abfh2 = abfh;
        hnb b = this.c.b();
        aaka abfk = abfl2 == abfl.ITEM ? new abfk() : new abfj();
        Object obj = hio.d() == hbj.FRIEND_STORY_CARD ? 1 : null;
        if (hio.q()) {
            abfk.D = Boolean.TRUE;
        }
        abfk.k = Long.valueOf((long) b.d);
        abfk.g = hio.l();
        String str4 = null;
        abfk.h = obj != null ? null : hio.e();
        abfk.l = hrd.h(hio);
        abfk.m = hio.o();
        abfk.n = str;
        abfk.o = l;
        abfk.t = aajr;
        abfk.u = aajv;
        abfk.A = l4;
        abfk.v = aasc;
        abfk.w = d;
        abfk.x = d2;
        abfk.y = l2;
        abfk.z = l3;
        abfk.B = d3;
        abfk.s = abfl2;
        abfk.b = str3;
        hiq g = hio.g();
        abfk.C = Boolean.valueOf(g.d());
        abfk.j = Long.valueOf((long) g.a());
        abfk.p = g.b();
        abfk.q = g.c();
        abfk.c = hnx.a(g);
        abfk.e = hnx.b(g);
        abfk.d = Long.valueOf((long) this.f.a(g.k()));
        abfk.G = obj != null ? null : str2;
        abfk.H = Long.valueOf((long) i);
        abfk.r = Boolean.valueOf(hio.r());
        if (obj != null) {
            str4 = ((hjh) hio).z();
        }
        abfk.i = str4;
        abfk.E = abfh2;
        if (abfh2 == null && g.e()) {
            abfk.k = Long.valueOf(-1);
            abfk.E = abfh.NOTIFICATION;
        }
        byte[] i2 = g.i();
        if (i2 != null && i2.length > 0) {
            abfk.F = Base64.encodeToString(i2, 0);
        }
        a(abfk);
    }

    public final void a(hio hio, zyr zyr, double d, double d2, double d3, Boolean bool, abfh abfh, String str, int i, String str2) {
        Object obj = hio.d() == hbj.FRIEND_STORY_CARD ? 1 : null;
        abfe abfg = new abfg();
        abfg.A = Double.valueOf(d);
        abfg.y = Double.valueOf(d2);
        abfg.z = Double.valueOf(d3);
        abfg.u = abfh;
        if (obj != null) {
            str = null;
        }
        abfg.w = str;
        abfg.x = Long.valueOf((long) i);
        abfg.r = bool;
        abfg.B = Boolean.valueOf(hio.r());
        abfg.b = str2;
        a(abfg, hio, zyr);
    }

    public final void a(hio hio, zyr zyr, Boolean bool, String str) {
        abfe abfe = new abfe();
        abfe.r = bool;
        abfe.b = str;
        a(abfe, hio, zyr);
    }

    public final void a(hio hio, zyr zyr, String str) {
        a(a(zyr, abey.OPEN_ACTION_MENU, hio, null, null, null, str));
    }

    public final void a(hio hio, zyr zyr, String str, Long l, abfb abfb, String str2, abfh abfh) {
        aaka a = a(zyr, abey.FAVORITE, hio, str, l, abfb, str2);
        a.x = abfh;
        a(a);
        if (hio instanceof hjf) {
            hjf hjf = (hjf) hio;
            aajf aajf = new aajf();
            aajf.a = hjf.C().a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hjf.B());
            aajf.b = stringBuilder.toString();
            aajf.c = abbd.STORY_FEED;
            this.a.a(aajf);
        }
    }

    public final void a(hio hio, zyr zyr, String str, Long l, abfh abfh) {
        aaka a = a(zyr, abey.SEND, hio, str, l);
        a.x = abfh;
        a(a);
    }

    public final void a(hio hio, zyr zyr, String str, Long l, String str2) {
        a(a(zyr, abey.REPORT_INAPPROPRIATE, hio, str, l, null, str2));
    }

    public final void a(hio hio, zza zza, zyz zyz, abpq abpq) {
        if (hio instanceof hjq) {
            this.b.a((hjq) hio, zza, zyz, abpq);
        }
    }

    public final void a(hio hio, boolean z, Double d, Double d2, Double d3, Long l, Integer num, int i, int i2, boolean z2, int i3) {
    }

    public final void a(hjd hjd) {
        aaka a = hrd.a(abey.PIVOT);
        a.c = hqn.e(hjd);
        a.e = hnx.a(hjd);
        a.d = Long.valueOf((long) this.f.a(hjd));
        a(a);
    }

    public final void a(hjd hjd, zyr zyr) {
        aaka abfd = new abfd();
        abfd.q = abey.HIDE;
        abfd.c = aake.DF_CATEGORICAL;
        abfd.e = hnx.a(hjd);
        abfd.d = Long.valueOf((long) this.f.a(hjd));
        a(abfd);
    }

    public final void a(hkm hkm) {
    }

    public final void a(Double d, zyr zyr) {
        this.i.a(this.e.c().f(new -$$Lambda$hrd$GnNsvPhliuqCY6i-0v0H35gf-tw(this)).a((ajdw) this.d.b()).e(new -$$Lambda$hrd$oSDwLaXs6b4yyRVTbzrlxNnFO2A(this, zyr, d)));
    }

    public final void a(boolean z, boolean z2) {
        this.i.a(this.h.a().b((ajdw) this.d.b()).a(new -$$Lambda$hrd$XM1D-Xf-QyIPMe2jJc8JUbd_3N0(this, z, z2), new -$$Lambda$hrd$6qNGBCfjvoz-9UkbUQDhOtNYbFc(this, z, z2)));
    }

    public final void b(hio hio) {
        a(a(zyr.SWIPE_UP, abey.OPT_INTO_NOTIFICATION, hio, null, null, abfb.STORY_PLAYER, null));
    }

    public final void b(hio hio, String str) {
        a(a(zyr.TAP, abey.OPT_OUT_OF_NOTIFICATION, hio, null, null, abfb.ACTION_MENU, str));
    }

    public final void b(hio hio, zyr zyr, String str) {
        a(a(zyr, abey.SEND, hio, null, null, null, str));
        if (hio instanceof hjq) {
            this.b.a((hjq) hio);
        }
    }

    public final void b(hio hio, zyr zyr, String str, Long l, abfb abfb, String str2, abfh abfh) {
        aaka a = a(zyr, abey.UNFAVORITE, hio, str, l, abfb, str2);
        a.x = abfh;
        a(a);
        if (hio instanceof hjf) {
            hjf hjf = (hjf) hio;
            aajh aajh = new aajh();
            aajh.a = hjf.C().a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(hjf.B());
            aajh.b = stringBuilder.toString();
            aajh.c = abbd.STORY_FEED;
            this.a.a(aajh);
        }
    }

    public final void b(hio hio, zyr zyr, String str, Long l, String str2) {
        a(a(zyr, abey.REPORT_IRRELEVANT, hio, str, l, null, str2));
    }

    public final void b(Double d, zyr zyr) {
        this.i.a(this.e.c().f(new -$$Lambda$hrd$E--aDh3X5gj_H-sgDLrxa0rWnL0(this)).a((ajdw) this.d.b()).e(new -$$Lambda$hrd$mPXyq9UQTQfugNUpHY9JLl3MEC4(this, zyr, d)));
    }

    public final void c(hio hio) {
        a(a(zyr.SWIPE_UP, abey.OPEN_CAMERA, hio, null, null));
    }

    public final void c(hio hio, String str) {
        aaka a = hrd.a(abey.SHARE_EXTERNALLY_PANEL_READY);
        a.b = str;
        a(a);
    }

    public final void c(hio hio, zyr zyr, String str) {
        a(a(zyr, abey.HIDE, hio, null, null, null, str));
        if (hio instanceof hjf) {
            hjf hjf = (hjf) hio;
            aavb aavb = new aavb();
            aavb.e = Long.toString(hjf.B().longValue());
            aavb.a = hjf.C().a;
            aavb.b = abbd.STORY_FEED;
            aavb.g = abgm.COLLAPSED_ONE_TILE;
            hiq g = hjf.g();
            aavb.c = hqn.d(g.k());
            aavb.f = Long.valueOf((long) g.a());
            aavb.d = g.b();
            this.a.a(aavb);
        }
    }

    public final void d(hio hio) {
    }

    public final void d(hio hio, String str) {
        aaka a = a(null, abey.SHARE_EXTERNALLY_COMPLETED, hio);
        a.b = str;
        a(a);
    }

    public final void d(hio hio, zyr zyr, String str) {
        a(a(zyr, abey.SHARE_EXTERNALLY, hio, null, null, null, str));
    }

    public final void e(hio hio) {
        a(a(zyr.TAP, abey.OPEN_CHAT_VIEW, hio));
    }
}
