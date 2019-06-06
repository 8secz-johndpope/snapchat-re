package defpackage;

import android.text.TextUtils;
import com.google.common.base.Joiner;
import defpackage.szw.b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: tjm */
public final class tjm {
    private static double a(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static aafq a(tgg tgg, aafp aafp) {
        aaga aafq = new aafq();
        aafq.a = zyr.TAP;
        aafq.d = aafp;
        tjm.a(aafq, tgg);
        return aafq;
    }

    public static aafu a(tgg tgg, aafr aafr) {
        aaga aafu = new aafu();
        tjm.a(aafu, tgg);
        aafu.a = aafr;
        return aafu;
    }

    public static aagj a(tgg tgg) {
        aaga aagj = new aagj();
        tjm.a(aagj, tgg);
        return aagj;
    }

    public static aagk a(tgg tgg, String str, agip agip) {
        aaga aagk = new aagk();
        tjm.a(aagk, tgg);
        if (!TextUtils.isEmpty(str)) {
            aagk.a = str;
        }
        aagk.b = agip.c;
        aagk.c = Double.valueOf(tjm.a(agip.l.a));
        aagk.d = Double.valueOf(tjm.a(agip.m.a));
        aagk.e = Double.valueOf(tjm.a(agip.k.b.a));
        aagk.f = Double.valueOf(tjm.a(agip.n.a));
        aagk.F = aahs.USD;
        if (agip.g != null) {
            BigDecimal bigDecimal = null;
            Iterable arrayList = new ArrayList();
            int i = 0;
            for (agir agir : agip.g) {
                i += agir.d.intValue();
                arrayList.add(String.format(Locale.getDefault(), "(%s, %d)", new Object[]{agir.c.e, agir.d}));
                if (agir.h != null) {
                    if (bigDecimal == null) {
                        try {
                            bigDecimal = BigDecimal.ZERO;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    bigDecimal = bigDecimal.add(new BigDecimal(agir.h.a));
                }
            }
            if (bigDecimal != null) {
                aagk.N = Double.valueOf(bigDecimal.doubleValue());
            }
            aagk.G = Long.valueOf((long) i);
            aagk.H = Long.valueOf((long) agip.g.size());
            aagk.I = Joiner.on(ppy.b).join(arrayList);
        }
        if (agip.k != null) {
            aagk.J = agip.k.a;
        }
        if (!agip.o.isEmpty()) {
            ahje ahje = (ahje) agip.o.get(0);
            if (!(ahje == null || ahje.d == null)) {
                try {
                    aagk.K = zzj.valueOf(ahje.d.c);
                } catch (IllegalArgumentException unused2) {
                    aagk.K = zzj.UNKNOWN;
                }
            }
        }
        aagk.L = aagd.SUCCESS;
        return aagk;
    }

    public static aagw a(tgg tgg, aagv aagv) {
        aaga aagw = new aagw();
        aagw.a = aagv;
        tjm.a(aagw, tgg);
        return aagw;
    }

    private static void a(aafl aafl, tgg tgg) {
        if (tgg.c(tge.i)) {
            aafl.b = (aagf) tgg.a(tge.i);
        }
    }

    public static <T extends aaga> void a(T t, tgg tgg) {
        if (!(t instanceof aagn)) {
            tgg.a(tge.C);
        }
        try {
            tjm.b((aaga) t, tgg);
            if (t instanceof aagi) {
                tjm.a((aagi) t, tgg);
            }
            if (t instanceof aafl) {
                tjm.a((aafl) t, tgg);
            }
            if (t instanceof aagr) {
                tjm.a((aagr) t, tgg);
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
        }
    }

    private static void a(aagi aagi, tgg tgg) {
        if (tgg.c(tge.i)) {
            aagi.b = (aagf) tgg.a(tge.i);
        }
    }

    private static void a(aagr aagr, tgg tgg) {
        if (tgg.c(tge.v)) {
            aagr.d = (String) tgg.a(tge.v);
        }
        if (tgg.c(tge.x)) {
            aagr.e = (String) tgg.a(tge.x);
        }
        if (tgg.c(tge.w)) {
            aagr.f = (Long) tgg.a(tge.w);
        }
        if (tgg.c(tge.y)) {
            aagr.F = (Long) tgg.a(tge.y);
        }
    }

    public static void a(tgg tgg, aafn aafn, aafm aafm, boolean z, the the) {
        tjm.a((aaga) aafn, tgg);
        aafn.a = aafm;
        aafn.b = Boolean.valueOf(z);
        if (the != null) {
            aafn.c = the.a;
        }
        String str = (String) tgg.a(tge.D);
        if (str != null) {
            aafn.d = str;
        }
    }

    public static aaft b(tgg tgg, aafr aafr) {
        aaga aaft = new aaft();
        tjm.a(aaft, tgg);
        aaft.a = aafr;
        return aaft;
    }

    public static aagh b(tgg tgg) {
        aaga aagh = new aagh();
        tjm.a(aagh, tgg);
        return aagh;
    }

    private static <T extends aaga> void b(T t, tgg tgg) {
        for (b bVar : tgg.a()) {
            tgf valueOf = tgf.valueOf(bVar.a);
            switch (valueOf) {
                case COMMERCE_PAGE_ID:
                    t.h = (String) tgg.a(tge.c);
                    break;
                case COMMERCE_PRODUCT_TYPE:
                    t.r = (String) tgg.a(tge.b);
                    break;
                case COMMERCE_ORIGIN_TYPE:
                    t.s = (String) tgg.a(tge.d);
                    break;
                case SCANNABLE_ID:
                    t.y = (String) tgg.a(tge.j);
                    break;
                case COMMERCE_SESSION_ID:
                    t.g = (String) tgg.a(tge.e);
                    break;
                case CONTEXT_MEDIA_TYPE:
                    t.u = (String) tgg.a(tge.f);
                    break;
                case CONTEXT_SESSION_ID:
                    t.v = (String) tgg.a(tge.g);
                    break;
                case CONTEXT_SNAP_TYPE:
                    t.t = (String) tgg.a(tge.h);
                    break;
                case CURRENT_PAGE:
                case STORE_CATEGORY_ID:
                case STORE_CATEGORY_ROW_INDEX:
                case STORE_CATEGORY_TITLE:
                case STORE_TOTAL_CATEGORIES:
                case CHECKOUT_ID:
                    break;
                case COMMERCE_DISPLAY_ID:
                    t.i = (String) tgg.a(tge.a);
                    break;
                case DISCOVER_EDITION_ID:
                    t.m = (String) tgg.a(tge.r);
                    break;
                case DISCOVER_EDITION_SESSION_ID:
                    t.q = (String) tgg.a(tge.q);
                    break;
                case DISCOVER_SNAP_ID:
                    t.p = (String) tgg.a(tge.s);
                    t.x = (String) tgg.a(tge.s);
                    break;
                case DISCOVER_PUBLISHER_ID:
                    t.w = (String) tgg.a(tge.t);
                    break;
                case EXTERNAL_SESSION_ID:
                    t.o = (String) tgg.a(tge.u);
                    break;
                case LENS_CTA_LENS_ID:
                    t.A = (String) tgg.a(tge.l);
                    break;
                case LENS_SESSION_ID:
                    t.B = (String) tgg.a(tge.m);
                    break;
                case LENS_CAMERA_SOURCE_TYPE:
                    t.C = (String) tgg.a(tge.n);
                    break;
                case LENS_POSITION:
                    t.D = (Long) tgg.a(tge.o);
                    break;
                case LENS_CAMERA_TYPE:
                    t.E = (String) tgg.a(tge.p);
                    break;
                case PRODUCT_ID:
                    t.k = (String) tgg.a(tge.z);
                    break;
                case SCANNABLE_DATA:
                    t.z = (String) tgg.a(tge.k);
                    break;
                case SOURCE_ID:
                    t.n = (String) tgg.a(tge.A);
                    break;
                case SOURCE_TYPE:
                    t.l = (abbd) tgg.a(tge.C);
                    break;
                case STORE_ID:
                    t.j = (String) tgg.a(tge.B);
                    break;
                default:
                    new StringBuilder("Unhandled type ").append(valueOf.name());
                    break;
            }
        }
    }

    public static aagn c(tgg tgg) {
        aaga aagn = new aagn();
        tjm.a(aagn, tgg);
        return aagn;
    }

    public static aagg d(tgg tgg) {
        aaga aagg = new aagg();
        tjm.a(aagg, tgg);
        return aagg;
    }

    public final aafw a(tgg tgg, boolean z, the the) {
        aafw aafw = new aafw();
        tjm.a(tgg, aafw, aafm.UPDATE, z, the);
        return aafw;
    }

    public final aafx a(thn thn, String str, tgg tgg, aafm aafm, boolean z, the the) {
        aafx aafx = new aafx();
        tjm.a(tgg, aafx, aafm, z, the);
        try {
            aafx.f = zzj.valueOf(thn.name());
        } catch (IllegalArgumentException unused) {
            aafx.f = zzj.UNKNOWN;
        }
        aafx.e = str;
        return aafx;
    }
}
