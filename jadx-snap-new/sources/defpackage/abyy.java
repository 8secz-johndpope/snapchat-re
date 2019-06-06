package defpackage;

import com.google.common.base.Strings;
import com.google.gson.annotations.SerializedName;
import defpackage.acak.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abyy */
public class abyy {
    @SerializedName(alternate = {"b"}, value = "filters")
    public final abzt a;
    @SerializedName(alternate = {"c"}, value = "caption")
    public final abzg b;
    @SerializedName(alternate = {"d"}, value = "drawing")
    public final abzl c;
    @SerializedName(alternate = {"e"}, value = "stickers")
    public final acan d;
    @SerializedName(alternate = {"f"}, value = "attachments")
    public final abze e;
    @SerializedName(alternate = {"g"}, value = "filterLensId")
    public final String f;
    @SerializedName("lensSessionMetadata")
    final String g;
    @SerializedName("previewLensId")
    public final String h;
    @SerializedName(alternate = {"h"}, value = "snapcraftStyleId")
    public final String i;
    @SerializedName("openGLTransformData")
    public final acaj j;
    @SerializedName(alternate = {"j"}, value = "soundToolsMetadata")
    public final acak k;
    @SerializedName(alternate = {"l"}, value = "captionList")
    public final List<abzg> l;
    @SerializedName("craftType")
    public final agnx m;
    @SerializedName("timerOrDuration")
    final int n;
    @SerializedName("isInfiniteDuration")
    final boolean o;
    @SerializedName("userTagIds")
    final List<String> p;
    @SerializedName("userTagNonStrings")
    final List<String> q;
    @SerializedName("encryptedGeoLoggingData")
    final String r;
    @SerializedName("bitmojiAvatarId")
    public final String s;
    @SerializedName("drawingV2")
    public final abzo t;
    @SerializedName("friendBitmojiAvatarId")
    public final String u;
    @SerializedName("canvasWidth")
    final int v;
    @SerializedName("canvasHeight")
    final int w;
    @SerializedName(alternate = {"i"}, value = "magicToolsMetadata")
    private acai x;
    @SerializedName(alternate = {"k"}, value = "magicEraserMetadata")
    @Deprecated
    private acag y;

    /* renamed from: abyy$a */
    public static class a {
        public abzg a;
        public abzl b;
        public acan c;
        public acai d;
        public abze e;
        public String f;
        public String g;
        public agnx h;
        private abzt i;
        private List<abzg> j;
        private abzo k;
        private acak l;
        private String m;
        private acaj n;
        private String o;
        private int p;
        private boolean q;
        private List<String> r = Collections.synchronizedList(new ArrayList());
        private List<String> s = Collections.synchronizedList(new ArrayList());
        private String t;
        private String u;
        private String v;
        private int w;
        private int x;

        public final a a(int i) {
            this.p = i;
            return this;
        }

        public final a a(abyy abyy) {
            this.i = abyy.a;
            this.a = abyy.b;
            this.j = abyy.l;
            this.b = abyy.c;
            this.c = abyy.d;
            this.d = abyy.h();
            this.l = abyy.k;
            this.e = abyy.e;
            this.f = abyy.f;
            this.m = abyy.g;
            this.g = abyy.i;
            this.n = abyy.j;
            this.h = abyy.m;
            this.o = abyy.h;
            this.p = abyy.n;
            this.q = abyy.o;
            this.r = Collections.synchronizedList(abyy.p == null ? new ArrayList() : abyy.p);
            this.s = Collections.synchronizedList(abyy.q == null ? new ArrayList() : abyy.q);
            this.t = abyy.r;
            this.u = abyy.s;
            this.k = abyy.t;
            this.v = abyy.u;
            this.w = abyy.v;
            this.x = abyy.w;
            return this;
        }

        public final a a(abze abze) {
            this.e = abze;
            return this;
        }

        public final a a(abzg abzg) {
            this.a = abzg;
            return this;
        }

        public final a a(abzl abzl) {
            this.b = abzl;
            return this;
        }

        public final a a(abzo abzo) {
            this.k = abzo;
            return this;
        }

        public final a a(abzt abzt) {
            abzt abzt2 = this.i;
            if (abzt2 == null) {
                this.i = abzt;
            } else {
                List list = abzt2.c;
                this.i = abzt;
                abzt = this.i;
                if (abzt != null) {
                    abzt.a(list);
                }
            }
            return this;
        }

        public final a a(acaj acaj) {
            this.n = acaj;
            return this;
        }

        public final a a(acak acak) {
            this.l = acak;
            return this;
        }

        public final a a(acan acan) {
            this.c = acan;
            return this;
        }

        public final a a(Integer num) {
            this.w = num.intValue();
            return this;
        }

        public final a a(String str) {
            this.f = str;
            return this;
        }

        public final a a(List<abzg> list) {
            this.j = list;
            return this;
        }

        public final a a(boolean z) {
            this.q = z;
            return this;
        }

        public final abyy a() {
            return new abyy(this.p, this.q, this.i, this.a, this.j, this.b, this.c, this.d, this.l, this.e, this.f, this.m, this.g, this.h, this.n, this.o, this.r, this.s, this.t, this.u, this.k, this.v, Integer.valueOf(this.w), Integer.valueOf(this.x), (byte) 0);
        }

        public final a b(Integer num) {
            this.x = num.intValue();
            return this;
        }

        public final a b(String str) {
            this.m = str;
            return this;
        }

        public final a b(List<abzv> list) {
            abzt abzt = this.i;
            if (abzt != null) {
                abzt.a((List) list);
            } else {
                defpackage.abzt.a aVar = new defpackage.abzt.a();
                aVar.c = list;
                this.i = aVar.a();
            }
            return this;
        }

        public final a c(String str) {
            this.t = str;
            return this;
        }

        public final a c(List<String> list) {
            if (!(list == null || list.isEmpty())) {
                this.r.addAll(list);
            }
            return this;
        }

        public final a d(String str) {
            this.u = str;
            return this;
        }

        public final a d(List<String> list) {
            if (list.isEmpty()) {
                return this;
            }
            this.s.addAll(list);
            return this;
        }

        public final a e(String str) {
            this.v = str;
            return this;
        }
    }

    private abyy(int i, boolean z, abzt abzt, abzg abzg, List<abzg> list, abzl abzl, acan acan, acai acai, acak acak, abze abze, String str, String str2, String str3, agnx agnx, acaj acaj, String str4, List<String> list2, List<String> list3, String str5, String str6, abzo abzo, String str7, Integer num, Integer num2) {
        this.n = i;
        this.o = z;
        this.a = abzt;
        this.b = abzg;
        this.l = list;
        this.c = abzl;
        this.d = acan;
        this.x = acai;
        this.k = acak;
        this.e = abze;
        this.f = str;
        this.g = str2;
        this.i = str3;
        this.j = acaj;
        this.m = agnx;
        this.h = str4;
        this.p = list2;
        this.q = list3;
        this.r = str5;
        this.s = str6;
        this.t = abzo;
        this.u = str7;
        this.v = num.intValue();
        this.w = num2.intValue();
    }

    /* synthetic */ abyy(int i, boolean z, abzt abzt, abzg abzg, List list, abzl abzl, acan acan, acai acai, acak acak, abze abze, String str, String str2, String str3, agnx agnx, acaj acaj, String str4, List list2, List list3, String str5, String str6, abzo abzo, String str7, Integer num, Integer num2, byte b) {
        this(i, z, abzt, abzg, list, abzl, acan, acai, acak, abze, str, str2, str3, agnx, acaj, str4, list2, list3, str5, str6, abzo, str7, num, num2);
    }

    public final boolean A() {
        abzg abzg = this.b;
        if (abzg != null && !Strings.isNullOrEmpty(abzg.b)) {
            return true;
        }
        List<abzg> list = this.l;
        if (list != null) {
            for (abzg abzg2 : list) {
                if (abzg2 != null && !Strings.isNullOrEmpty(abzg2.b)) {
                    return true;
                }
            }
        }
        abzl abzl = this.c;
        if (abzl != null && !abzl.a.isEmpty()) {
            return true;
        }
        abzt abzt = this.a;
        if (abzt != null) {
            acae a = abzt.a();
            if (!(a == null || a == acae.UNFILTERED) || this.a.l() != null || this.a.f || this.a.f()) {
                return true;
            }
        }
        acan acan = this.d;
        if ((acan != null && acan.e() != 0) || this.i != null) {
            return true;
        }
        acak acak = this.k;
        if (acak != null) {
            if ((a.a(acak.a) != a.NO_EFFECT ? 1 : null) != null) {
                return true;
            }
        }
        return !acaj.b(this.j);
    }

    public final boolean B() {
        boolean C = C();
        abzt abzt = this.a;
        if (abzt != null) {
            if (abzt.k && this.a.j != null) {
                return true;
            }
            if (this.a.i && this.a.h != null) {
                return true;
            }
            abzy g = this.a.g();
            if (!(g == null || (C && (g.k || g.l)))) {
                return true;
            }
        }
        abzg abzg = this.b;
        if (abzg != null && !Strings.isNullOrEmpty(abzg.b) && !this.b.i) {
            return true;
        }
        List<abzg> list = this.l;
        if (list != null) {
            for (abzg abzg2 : list) {
                if (abzg2 != null && !Strings.isNullOrEmpty(abzg2.b) && !abzg2.i) {
                    return true;
                }
            }
        }
        abzl abzl = this.c;
        if (abzl != null && !abzl.a.isEmpty()) {
            return true;
        }
        acan acan = this.d;
        if (acan != null && !acan.f() && !this.d.c()) {
            return true;
        }
        if (!C()) {
            acan = this.d;
            if (!(acan == null || acan.f())) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        abzt abzt = this.a;
        if (abzt == null || !abzt.f()) {
            acan acan = this.d;
            if (acan == null || !acan.c()) {
                return false;
            }
        }
        return true;
    }

    public final boolean D() {
        acan acan = this.d;
        if (acan != null && acan.b()) {
            return true;
        }
        abzg abzg = this.b;
        return (abzg != null && abzg.i) || abzg.a(this.l);
    }

    public final boolean E() {
        return C() || D();
    }

    public final abzt a() {
        return this.a;
    }

    public final boolean a(abyy abyy) {
        return abyy == null || !new akmc().a(this.b, abyy.b).a(this.c, abyy.c).a(this.a, abyy.a).a(this.d, abyy.d).a(this.x, abyy.x).a(this.h, abyy.h).a(this.k, abyy.k).a(this.i, abyy.i).a(this.m, abyy.m).a(this.j, abyy.j).a(this.l, abyy.l).a;
    }

    public final abzg b() {
        return this.b;
    }

    public final List<abzg> c() {
        return this.l;
    }

    public final abzl d() {
        return this.c;
    }

    public final abzo e() {
        return this.t;
    }

    public final acan f() {
        return this.d;
    }

    public final abze g() {
        return this.e;
    }

    public final acai h() {
        acai acai = this.x;
        if (acai != null) {
            return acai;
        }
        acag acag = this.y;
        if (acag != null) {
            this.x = acag.a();
            this.y = null;
        }
        return this.x;
    }

    public final acak i() {
        return this.k;
    }

    public final String j() {
        return this.m == agnx.SNAP_CRAFT ? this.i : null;
    }

    public final agnx k() {
        return this.m;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.g;
    }

    public final acaj n() {
        return this.j;
    }

    public final String o() {
        return this.h;
    }

    public final int p() {
        return this.n;
    }

    public final boolean q() {
        return this.o;
    }

    public final List<String> r() {
        return this.p;
    }

    public final List<String> s() {
        return this.q;
    }

    public final String t() {
        return this.r;
    }

    public final String u() {
        return this.s;
    }

    public final String v() {
        return this.u;
    }

    public final int w() {
        return this.v;
    }

    public final int x() {
        return this.w;
    }

    public final boolean y() {
        acak acak = this.k;
        return acak != null && acak.d();
    }

    public final acae z() {
        acae acae = acae.UNFILTERED;
        abzt abzt = this.a;
        if (abzt == null) {
            return acae;
        }
        acae = abzt.a();
        return acae == null ? acae.UNFILTERED : acae;
    }
}
