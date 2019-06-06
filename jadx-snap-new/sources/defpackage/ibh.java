package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ibh */
public final class ibh implements hyu {
    private final ajwy<icm> a;
    private final ajwy<ico> b;
    private final hyw c;
    private final ajwy<hyk> d;
    private final ajwy<hys> e;
    private volatile boolean f;
    private final ajwy<iam> g;

    /* renamed from: ibh$a */
    static class a {
        final String a;
        final boolean b;

        a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    ibh(ajwy<icm> ajwy, ajwy<ico> ajwy2, hyw hyw, ajwy<hyk> ajwy3, ajwy<hys> ajwy4, ajwy<iam> ajwy5) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = hyw;
        this.d = ajwy3;
        this.e = ajwy4;
        this.g = ajwy5;
    }

    private a a(Long l) {
        hyx b;
        this.g.get();
        CharSequence charSequence = null;
        if (TextUtils.isEmpty(null)) {
            b = this.c.b("rewrap_fetch_sek");
            if (b != null) {
                charSequence = b.a(l.longValue());
            }
        } else {
            b = null;
        }
        boolean z = TextUtils.isEmpty(charSequence) && b != null;
        return new a(charSequence, z);
    }

    public final void a(Map<String, ahpp> map, String str, String str2) {
        String str3 = str;
        for (Entry entry : map.entrySet()) {
            a a;
            ahpr ahpr;
            String str4 = (String) entry.getKey();
            ahpp ahpp = (ahpp) entry.getValue();
            List<Long> list = ahpp.a;
            ahql ahql = ahpp.b;
            boolean equals = Boolean.TRUE.equals(ahpp.d);
            if (!(list == null || ahql == null)) {
                boolean z = equals;
                for (Long l : list) {
                    a = a(l);
                    if (a.b) {
                        ((hyk) this.d.get()).a(str3, false, this.f);
                        ((ico) this.b.get()).a((Object) l);
                    } else if (!TextUtils.isEmpty(a.a)) {
                        hzc a2 = this.c.a("rewrap_sek");
                        if (a2 != null) {
                            ((hyk) this.d.get()).b(str3, false, this.f);
                            ich a3 = a2.a(str4, str2, ahql, a.a, icf.SNAP, z, ((hys) this.e.get()).a(hyt.FIDELIUS_SNAP_PHI));
                            if (a3 != null) {
                                ahpr = new ahpr();
                                ahpr.c = a3.c;
                                ahpr.b = Integer.valueOf(a3.a);
                                ahpr.d = a3.b;
                                ahpr.a = l;
                                ahpr.e = str3;
                                ((icm) this.a.get()).a((Object) ahpr);
                            }
                            z = false;
                        }
                    }
                }
            }
            List<Long> list2 = ahpp.c;
            if (list2 != null) {
                for (Long l2 : list2) {
                    a = a(l2);
                    if (a.b) {
                        ((hyk) this.d.get()).a(str3, true, this.f);
                        ((ico) this.b.get()).a((Object) l2);
                    } else if (!TextUtils.isEmpty(a.a)) {
                        ((hyk) this.d.get()).b(str3, true, this.f);
                        ahpr = new ahpr();
                        ahpr.a = l2;
                        ahpr.f = a.a;
                        ((icm) this.a.get()).a((Object) ahpr);
                    }
                }
            }
        }
    }
}
