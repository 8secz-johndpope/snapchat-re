package defpackage;

import android.content.res.Resources;
import com.snapchat.android.R;
import defpackage.aleb.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: acsl */
public final class acsl {
    private final Resources a;
    private final ihi b;
    private final ihh c;
    private final abss d;

    public acsl(Resources resources, ihi ihi, ihh ihh, abss abss) {
        akcr.b(resources, "resources");
        akcr.b(ihi, "dateTimeUtils");
        akcr.b(ihh, "clock");
        akcr.b(abss, "releaseManager");
        this.a = resources;
        this.b = ihi;
        this.c = ihh;
        this.d = abss;
    }

    private static gcp a(int i) {
        if (i == 9) {
            return gcp.AUDIO_STITCH;
        }
        switch (i) {
            case 0:
                return gcp.IMAGE;
            case 1:
                return gcp.VIDEO;
            case 2:
                return gcp.VIDEO_NO_SOUND;
            case 3:
                return gcp.FRIEND_DEPRECATED;
            case 4:
                return gcp.BLOB;
            case 5:
                return gcp.LAGUNA_SOUND;
            case 6:
                return gcp.LAGUNA_NO_SOUND;
            default:
                return gcp.UNKNOWN;
        }
    }

    private final gwe a(aleb aleb, String str) {
        gwx gwx;
        Object h = aleb.h();
        String str2 = "element.snapInfo";
        akcr.a(h, str2);
        String a = h.a();
        h = aleb.h();
        akcr.a(h, str2);
        String e = h.e();
        h = aleb.h();
        akcr.a(h, str2);
        String c = h.c();
        h = aleb.h();
        akcr.a(h, str2);
        String d = h.d();
        long c2 = (long) aleb.c();
        h = aleb.h();
        akcr.a(h, str2);
        boolean f = h.f();
        int d2 = aleb.d() ^ 1;
        h = aleb.h();
        akcr.a(h, str2);
        gwf gwf = new gwf(a, e, c, d, c2, f, d2, acsl.a(h.b()));
        alrn alrn = aleb.h().c;
        if (alrn != null) {
            c = alrn.b();
            d = alrn.c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(alrn.d());
            stringBuilder.append(alrn.f());
            gwx = new gwx(c, d, stringBuilder.toString());
        } else {
            gwx = null;
        }
        String a2 = adcy.a(aleb.h().a);
        String str3 = a2 == null ? str : a2;
        e = aleb.b();
        a2 = "element.id";
        akcr.a((Object) e, a2);
        long e2 = aleb.e();
        c2 = this.c.a() + 43200000;
        String a3 = a(aleb);
        Object h2 = aleb.h();
        akcr.a(h2, str2);
        String h3 = h2.h();
        Object h4 = aleb.h();
        akcr.a(h4, str2);
        String valueOf = String.valueOf(h4.j());
        String b = aleb.b();
        akcr.a((Object) b, a2);
        b h5 = aleb.h();
        String g = h5 != null ? h5.g() : null;
        h5 = aleb.h();
        return new gwe(e, e2, c2, str3, a3, h3, valueOf, gwf, gwx, b, str3, null, g, h5 != null ? h5.i() : null);
    }

    private final String a(aleb aleb) {
        String a = this.b.a(aleb.e(), true, true);
        if (adcy.a(aleb.h().b) == null) {
            return a;
        }
        Object string = this.a.getString(R.string.snap_subtext_time_with_location, new Object[]{a, r7});
        akcr.a(string, "resources.getString(R.st…timePiece, locationPiece)");
        return string;
    }

    public static String a(aljy aljy) {
        akcr.b(aljy, "poi");
        String a = adcy.a(aljy.d);
        return a == null ? "Map" : a;
    }

    private final List<aleb> a(alee alee) {
        Object obj = alee.b;
        String str = "elements";
        akcr.a(obj, str);
        Collection arrayList = new ArrayList(obj.length);
        for (Object obj2 : obj) {
            akcr.a(obj2, "it");
            arrayList.add(ajxs.a(obj2.b(), obj2));
        }
        Map a = ajzm.a((Iterable) (List) arrayList);
        Object obj3 = alee.b;
        akcr.a(obj3, str);
        aleb aleb = (aleb) ajyi.a((Object[]) obj3, 0);
        return a(aleb != null ? aleb.b() : null, a);
    }

    private final List<aleb> a(String str, Map<String, aleb> map) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Object str2;
        while (str2 != null) {
            aleb aleb = (aleb) map.get(str2);
            if (aleb != null) {
                if (!hashSet.contains(str2)) {
                    hashSet.add(str2);
                    arrayList.add(aleb);
                    str2 = null;
                    alef alef = aleb.a;
                    if (alef != null) {
                        if (alef.b() == 1) {
                            break;
                        }
                        str2 = alef.a();
                    }
                } else if (this.d.b()) {
                    StringBuilder stringBuilder = new StringBuilder("Found a circular manifest! ");
                    stringBuilder.append(aleb.b());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                break;
            }
        }
        return arrayList;
    }

    public final List<gwe> a(alee alee, String str) {
        akcr.b(alee, "manifest");
        akcr.b(str, "fallbackTitle");
        String a = adcy.a(alee.a);
        if (a != null) {
            str = a;
        }
        Iterable<aleb> a2 = a(alee);
        Collection arrayList = new ArrayList(ajyn.a((Iterable) a2, 10));
        for (aleb aleb : a2) {
            akcr.a(alee.b(), "manifest.unviewedThumbnailUrl");
            arrayList.add(a(aleb, str));
        }
        return (List) arrayList;
    }
}
