package defpackage;

import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;
import com.snap.core.db.record.CognacAppListModel;
import com.snap.core.db.record.GeofilterModel;
import java.util.List;
import java.util.Map;

/* renamed from: abzy */
public final class abzy {
    @SerializedName(alternate = {"a"}, value = "type")
    public final int a;
    @SerializedName(alternate = {"b"}, value = "id")
    public final String b;
    @SerializedName(alternate = {"c"}, value = "imageUrl")
    public final String c;
    @SerializedName(alternate = {"d"}, value = "imageUrlParams")
    public final Map<String, String> d;
    @SerializedName(alternate = {"e"}, value = "scaleSetting")
    public final int e;
    @SerializedName(alternate = {"f"}, value = "positionSetting")
    public final int f;
    @SerializedName(alternate = {"g"}, value = "unlockableContentType")
    public final afdr g;
    @SerializedName(alternate = {"h"}, value = "dynamicContent")
    public final List<aenn> h;
    @SerializedName(alternate = {"i"}, value = "dynamicContentSetting")
    public final aeju i;
    @SerializedName("autoStacking")
    public final ahyg j;
    @SerializedName("isAnimated")
    public final boolean k;
    @SerializedName("belowDrawingLayer")
    public final boolean l;
    @SerializedName("hasContextCard")
    private final boolean m;
    @SerializedName("carouselGroup")
    private final ahyr n;
    @SerializedName("encryptedGeoLoggingData")
    private final String o;
    @SerializedName("dynamicContextProperties")
    private final ahzb p;
    @SerializedName("unlockableCategory")
    private final aica q;
    @SerializedName("unlockableAttributes")
    private final List<String> r;
    @SerializedName("unlockableContext")
    private final aicd s;
    @SerializedName("sponsoredSlugPosAndText")
    private final aezp t;
    @SerializedName("unlockableTrackInfo")
    private final afds u;
    private final boolean v;

    /* renamed from: abzy$a */
    public static class a {
        public final String a;
        public final String b;
        public final Map<String, String> c;
        public final int d;
        public final int e;
        public final int f;
        public final afdr g;
        final List<aenn> h;
        final aeju i;
        final ahyg j;
        final boolean k;
        final boolean l;
        final boolean m;
        final ahyr n;
        final String o;
        final ahzb p;
        final aica q;
        final List<String> r;
        final aicd s;
        final aezp t;
        final afds u;
        final boolean v;

        public a(int i, String str, String str2, Map<String, String> map, int i2, int i3, afdr afdr, List<aenn> list, aeju aeju, ahyg ahyg, boolean z, boolean z2, ahyr ahyr) {
            this(i, str, str2, map, i2, i3, afdr, list, aeju, ahyg, z, z2, false, ahyr, null, null, aica.UNKNOWN, null, null, null, null, false);
        }

        public a(int i, String str, String str2, Map<String, String> map, int i2, int i3, afdr afdr, List<aenn> list, aeju aeju, ahyg ahyg, boolean z, boolean z2, boolean z3, ahyr ahyr, String str3, ahzb ahzb, aica aica, List<String> list2, aicd aicd, aezp aezp, afds afds, boolean z4) {
            int i4 = i;
            int i5 = i2;
            boolean z5 = false;
            Preconditions.checkArgument(i4 < aame.values().length);
            if (i5 < ScaleType.values().length) {
                z5 = true;
            }
            Preconditions.checkArgument(z5);
            Preconditions.checkArgument(TextUtils.isEmpty(str) ^ 1);
            Preconditions.checkArgument(TextUtils.isEmpty(str2) ^ 1);
            this.d = i4;
            this.a = str;
            this.b = str2;
            this.c = map;
            this.e = i5;
            this.f = i3;
            this.g = afdr;
            this.h = list;
            this.i = aeju;
            this.j = ahyg;
            this.k = z;
            this.l = z2;
            this.m = z3;
            this.n = ahyr;
            this.o = str3;
            this.p = ahzb;
            this.q = aica;
            this.r = list2;
            this.s = aicd;
            this.t = aezp;
            this.u = afds;
            this.v = z4;
        }

        public final abzy a() {
            return new abzy(this);
        }
    }

    abzy(a aVar) {
        this.a = aVar.d;
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final Map<String, String> c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzy abzy = (abzy) obj;
        return new akmc().a(this.a, abzy.a).a(this.b, abzy.b).a(this.c, abzy.c).a(this.e, abzy.e).a(this.f, abzy.f).a(this.h, abzy.h).a(this.i, abzy.i).a(this.j, abzy.j).a(this.k, abzy.k).a(this.l, abzy.l).a(this.m, abzy.m).a(this.n, abzy.n).a(this.o, abzy.o).a(this.p, abzy.p).a(this.q, abzy.q).a(this.r, abzy.r).a(this.s, abzy.s).a(this.t, abzy.t).a(this.u, abzy.u).a(this.v, abzy.v).a;
    }

    public final afdr f() {
        return this.g;
    }

    public final List<aenn> g() {
        return this.h;
    }

    public final ahyr h() {
        return this.n;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.e).a(this.f).a(this.h).a(this.i).a(this.j).a(this.k).a(this.l).a(this.m).a(this.n).a(this.o).a(this.p).a(this.q).a(this.r).a(this.s).a(this.t).a(this.u).a(this.v).a;
    }

    public final String i() {
        return this.o;
    }

    public final boolean j() {
        return this.k;
    }

    public final boolean k() {
        return this.m;
    }

    public final ahzb l() {
        return this.p;
    }

    public final aica m() {
        return this.q;
    }

    public final List<String> n() {
        return this.r;
    }

    public final aicd o() {
        return this.s;
    }

    public final aezp p() {
        return this.t;
    }

    public final afds q() {
        return this.u;
    }

    public final boolean r() {
        return this.v;
    }

    public final String toString() {
        String str = "id";
        str = "positionSetting";
        str = "dynamicContent";
        str = "dynamicContentSetting";
        str = "autoStacking";
        ToStringHelper add = MoreObjects.toStringHelper((Object) this).add("type", this.a).add(str, this.b).add(CognacAppListModel.IMAGEURL, this.c).add(GeofilterModel.SCALESETTING, this.e).add(str, this.f).add(str, this.h).add(str, this.i).add(str, this.j).add(GeofilterModel.ISANIMATED, this.k);
        return add.add(GeofilterModel.ISBELOWDRAWINGLAYER, this.l).add("hasContextCard", this.m).add("carouselGroup", this.n).add("encryptedGeoLoggingData", this.o).add("dynamicContextProperties", this.p).add("unlockableCategory", this.q).add("unlockableAttributes", this.r).add("unlockableContext", this.s).add("sponsoredSlugAndText", this.t).add("unlockableTrackInfo", this.u).add("isGuaranteedFilter", this.v).toString();
    }
}
