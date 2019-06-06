package defpackage;

import defpackage.hhm.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: hhe */
public final class hhe {
    public List<hjx> a = new ArrayList();
    public List<hmw> b;
    public int c;
    private final hhm d;
    private List<hjx> e = new ArrayList();
    private List<hjx> f = new ArrayList();
    private final Map<hka, Double> g = new HashMap();

    public hhe(hhm hhm) {
        this.d = hhm;
    }

    private static int a(List<hjx> list, hka hka, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((hjx) list.get(i2)).a.af().b().equals(hka.b())) {
                return i2 + i;
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        int i;
        hjx hjx;
        StringBuilder stringBuilder = new StringBuilder();
        a b = this.d.b();
        if (b != null) {
            stringBuilder.append("<h2>Last Rank</h2>AST: ");
            stringBuilder.append(b.a());
            stringBuilder.append("<br/>Time: ");
            stringBuilder.append(new Date(b.b()));
            stringBuilder.append("<br/>");
        }
        hhd hhd = new hhd();
        hhd.a = "Original Cards";
        String str = "score";
        String str2 = "title";
        String str3 = "type";
        String str4 = "pos";
        hhd.b = new String[]{str4, str3, str, str2};
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            hjx hjx2 = (hjx) this.e.get(i2);
            hhd.a(Integer.valueOf(i2), hjx2.a.d(), Float.valueOf(hjx2.a.f().a()), hkc.a(hjx2.a));
        }
        stringBuilder.append(hhd);
        hhd = new hhd();
        hhd.a = "Ranked Cards";
        hhd.b = new String[]{str4, str3, str, str2};
        for (i = 0; i < this.f.size(); i++) {
            hjx hjx3 = (hjx) this.f.get(i);
            hhd.a(Integer.valueOf(i), hjx3.a.d(), this.g.get(hjx3.a.af()), hkc.a(hjx3.a));
        }
        stringBuilder.append(hhd);
        hhd = new hhd();
        hhd.a = "Reordered Cards";
        hhd.b = new String[]{str4, str3, "slot", str2};
        for (i = 0; i < this.a.size(); i++) {
            hjx = (hjx) this.a.get(i);
            hhd.a(Integer.valueOf(i), hjx.a.d(), this.b.get(i), hkc.a(hjx.a));
        }
        stringBuilder.append(hhd);
        hhd = new hhd();
        hhd.a = "Signals";
        hhd.b = new String[]{"pos", "title", "view_utility", "impression_utility", "long_views_score", "short_views_score", "long_impressions_score", "short_impressions_score"};
        for (i = 0; i < this.a.size(); i++) {
            hka af = ((hjx) this.a.get(i)).a.af();
            hhd.a(Integer.valueOf(i), hkc.a(hjx.a), this.d.a(af, "view_utility"), this.d.a(af, "impression_utility"), this.d.a(af, "long_views_score"), this.d.a(af, "short_views_score"), this.d.a(af, "long_impressions_score"), this.d.a(af, "short_impressions_score"));
        }
        stringBuilder.append(hhd);
        List<a> a = this.d.a();
        if (!a.isEmpty()) {
            hhd hhd2 = new hhd();
            hhd2.a = "ReRanking Events";
            hhd2.b = new String[]{"AST Version", "Date"};
            for (a aVar : a) {
                hhd2.a(aVar.a(), new Date(aVar.b()));
            }
            stringBuilder.append(hhd2);
        }
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final String a(String str) {
        String[] split = str.split("::");
        hka a = hka.a(Integer.parseInt(split[0]), split[1]);
        hhd hhd = new hhd();
        hhd.a = "AST Feature Scores";
        hhd = hhd.a("Story ID", a.b());
        for (hip hip : this.a) {
            if (hip.a.af().b().equals(a.b())) {
                break;
            }
        }
        hip hip2 = null;
        if (hip2 != null) {
            hio hio = hip2.a;
            int a2 = hhe.a(this.e, a, this.c);
            int a3 = hhe.a(this.a, a, this.c);
            hhd a4 = hhd.a("story_version", Long.valueOf(hio.b().c())).a("card_type", hio.d().name());
            Object[] objArr = new Object[2];
            objArr[0] = "is_fixed";
            objArr[1] = hio.f().b() >= 0 ? "true" : "false";
            a4.a(objArr).a("Initial Position", Integer.valueOf(a2)).a("Final Position", Integer.valueOf(a3));
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = "Final AST Score";
        objArr2[1] = this.g.containsKey(a) ? this.g.get(a) : "UNKNOWN";
        hhd.a(objArr2);
        Map a5 = this.d.a(a);
        if (!(a5 == null || a5.isEmpty())) {
            String str2 = "now_timestamp";
            if (a5.containsKey(str2)) {
                long floatValue = ((long) ((Float) a5.get(str2)).floatValue()) * 1000;
                hhd.a("Last ReRank", new Date(floatValue));
            }
            for (String str3 : new TreeSet(a5.keySet())) {
                hhd.a(str3, a5.get(str3));
            }
        }
        return hhd.toString();
    }

    public final void a(List<hjx> list) {
        this.e = list;
    }

    public final void a(Map<hka, Double> map, List<hjx> list) {
        this.f = list;
        this.g.putAll(map);
    }
}
