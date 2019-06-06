package defpackage;

import com.google.gson.annotations.SerializedName;
import defpackage.ahyg.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abzt */
public class abzt {
    @SerializedName(alternate = {"a"}, value = "visualFilterDataList")
    public final List<acad> a;
    @SerializedName(alternate = {"b"}, value = "selectedVisualFilterIndex")
    public final int b;
    @SerializedName(alternate = {"c"}, value = "infoFilterDataList")
    public final List<abzv> c;
    @SerializedName(alternate = {"e"}, value = "geofilters")
    public final List<abzy> d;
    @SerializedName(alternate = {"g"}, value = "reverseMotionFilterEnabled")
    public final boolean e;
    @SerializedName(alternate = {"h"}, value = "reverseMotionFilterSelected")
    public final boolean f;
    @SerializedName(alternate = {"i"}, value = "speedMotionFilterDataList")
    public final List<acaa> g;
    @SerializedName(alternate = {"k"}, value = "venueFilter")
    public final acab h;
    @SerializedName(alternate = {"l"}, value = "venueFilterSelected")
    public final boolean i;
    @SerializedName(alternate = {"n"}, value = "streakFilter")
    public final agqp j;
    @SerializedName(alternate = {"o"}, value = "streakFilterSelected")
    public final boolean k;
    @SerializedName("contextFilterMetadata")
    public final aeht l;
    @SerializedName("contextFilterSelectedId")
    public final String m;
    @SerializedName(alternate = {"d"}, value = "selectedInfoFilterIndex")
    private final int n;
    @SerializedName(alternate = {"f"}, value = "selectedGeofilterIndex")
    private final int o;
    @SerializedName(alternate = {"j"}, value = "selectedSpeedMotionFilterIndex")
    private final int p;
    @SerializedName(alternate = {"m"}, value = "isBackgroundShown")
    private final boolean q = false;
    @SerializedName("hasSeenContextFilter")
    private final boolean r;
    @SerializedName("hasSeenVisualFilter")
    private final boolean s;
    @SerializedName("hasEnabledContextFilter")
    private final boolean t;

    /* renamed from: abzt$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.ahyg.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.ahyg.a.GREYSCALE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.ahyg.a.SMOOTHING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.ahyg.a.MISS_ETIKATE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.ahyg.a.INSTASNAP;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abzt$1.<clinit>():void");
        }
    }

    /* renamed from: abzt$a */
    public static class a {
        public List<acad> a = new ArrayList();
        public int b = -1;
        public List<abzv> c = new ArrayList();
        public int d = -1;
        public List<abzy> e = new ArrayList();
        public int f = -1;
        public boolean g = false;
        public boolean h = false;
        public List<acaa> i = new ArrayList();
        public int j = -1;
        public boolean k = false;
        public agqp l = null;
        public boolean m = false;
        public aeht n = null;
        public String o = null;
        private acab p = null;
        private boolean q = false;
        private boolean r = false;
        private boolean s = false;
        private boolean t = false;

        public final a a(int i) {
            this.b = i;
            return this;
        }

        public final a a(acab acab) {
            this.p = acab != null ? new acab(acab) : null;
            return this;
        }

        public final a a(aeht aeht) {
            this.n = aeht;
            return this;
        }

        public final a a(String str) {
            this.o = str;
            return this;
        }

        public final a a(List<acad> list) {
            this.a = list;
            return this;
        }

        public final a a(boolean z) {
            this.h = z;
            return this;
        }

        public final abzt a() {
            return new abzt(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.p, this.k, this.l, this.m, this.n, this.o, this.t);
        }

        public final a b(int i) {
            this.f = i;
            return this;
        }

        public final a b(List<abzy> list) {
            this.e = list;
            return this;
        }

        public final a b(boolean z) {
            this.k = z;
            return this;
        }

        public final a c(int i) {
            this.j = i;
            return this;
        }

        public final a c(List<acaa> list) {
            this.i = list;
            return this;
        }

        public final a c(boolean z) {
            this.t = z;
            return this;
        }
    }

    abzt(List<acad> list, int i, List<abzv> list2, int i2, List<abzy> list3, int i3, boolean z, boolean z2, List<acaa> list4, int i4, acab acab, boolean z3, agqp agqp, boolean z4, aeht aeht, String str, boolean z5) {
        this.a = list;
        this.b = i;
        this.c = list2;
        this.n = i2;
        this.d = list3;
        this.o = i3;
        this.e = z;
        this.f = z2;
        this.g = list4;
        this.p = i4;
        this.h = acab;
        this.i = z3;
        this.j = agqp;
        this.k = z4;
        this.l = aeht;
        this.m = str;
        this.r = false;
        this.s = false;
        this.t = z5;
    }

    public static acae a(abzy abzy) {
        if (abzy != null) {
            ahyg ahyg = abzy.j;
            if (!(ahyg == null || ahyg.a() == null)) {
                return abzt.a(ahyg.a());
            }
        }
        return acae.UNFILTERED;
    }

    private static acae a(a aVar) {
        int i = 1.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? acae.UNFILTERED : acae.INSTASNAP : acae.MISS_ETIKATE : acae.SMOOTHING : acae.GREYSCALE;
    }

    public static boolean a(List list, int i) {
        return (list == null || i == -1 || i >= list.size()) ? false : true;
    }

    public final acae a() {
        if (abzt.a(this.a, this.b)) {
            int i = ((acad) this.a.get(this.b)).a.type;
            acae[] values = acae.values();
            if (i >= 0 && i < values.length) {
                return values[i];
            }
        }
        acae a = abzt.a(g());
        return a != acae.UNFILTERED ? a : null;
    }

    public final void a(List<abzv> list) {
        this.c.clear();
        this.c.addAll(list);
    }

    public final List<acad> b() {
        return this.a;
    }

    public final List<abzv> c() {
        return this.c;
    }

    public final abzv d() {
        return !abzt.a(this.c, this.n) ? null : (abzv) this.c.get(this.n);
    }

    public final List<abzy> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof abzt)) {
            return false;
        }
        abzt abzt = (abzt) obj;
        return new akmc().a(this.a, abzt.a).a(this.b, abzt.b).a(this.c, abzt.c).a(this.n, abzt.n).a(this.d, abzt.d).a(this.o, abzt.o).a(this.e, abzt.e).a(this.f, abzt.f).a(this.g, abzt.g).a(this.p, abzt.p).a(this.h, abzt.h).a(this.i, abzt.i).a(this.q, abzt.q).a(this.j, abzt.j).a(this.k, abzt.k).a(this.l, abzt.l).a(this.m, abzt.m).a(this.r, abzt.r).a(this.s, abzt.s).a(this.t, abzt.t).a;
    }

    public final boolean f() {
        abzy g = g();
        return g != null && g.k;
    }

    public final abzy g() {
        return !abzt.a(this.d, this.o) ? null : (abzy) this.d.get(this.o);
    }

    public final int h() {
        return this.o;
    }

    public int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.n).a(this.d).a(this.o).a(this.e).a(this.f).a(this.g).a(this.p).a(this.h).a(this.i).a(this.q).a(this.j).a(this.k).a(this.l).a(this.m).a(this.r).a(this.s).a(this.t).a;
    }

    public final boolean i() {
        return this.f;
    }

    public final List<acaa> j() {
        return this.g;
    }

    public final int k() {
        return this.p;
    }

    public final acaa l() {
        return !abzt.a(this.g, this.p) ? null : (acaa) this.g.get(this.p);
    }

    public final acab m() {
        return this.h;
    }

    public final boolean n() {
        return this.i;
    }

    public final boolean o() {
        return this.q;
    }

    public final boolean p() {
        return this.k;
    }

    public final boolean q() {
        return this.k || this.i || this.f || this.n != -1 || this.o != -1 || !((this.b == -1 || a() == null) && this.p == -1 && !this.q);
    }

    public final aeht r() {
        return this.l;
    }

    public final String s() {
        return this.m;
    }

    public final boolean t() {
        return this.s;
    }

    public final boolean u() {
        return this.t;
    }
}
