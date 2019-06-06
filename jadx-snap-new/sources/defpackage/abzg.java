package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import defpackage.abzi.a;
import java.util.List;
import java.util.Map;

/* renamed from: abzg */
public class abzg {
    @SerializedName(alternate = {"a"}, value = "type")
    public final int a;
    @SerializedName(alternate = {"b"}, value = "mText")
    public final String b;
    @SerializedName(alternate = {"c"}, value = "mTextAttributes")
    public final List<abzh> c;
    @SerializedName(alternate = {"d"}, value = "mSpanListMap")
    public final Map<a, List<abzi>> d;
    @SerializedName(alternate = {"e"}, value = "mFontSize")
    public final double e;
    @SerializedName(alternate = {"f"}, value = "mEditingFontSize")
    public final double f;
    @SerializedName(alternate = {"g"}, value = "mCenter")
    public final acas g;
    @SerializedName(alternate = {"h"}, value = "mRotationInClockwiseDegrees")
    public final double h;
    @SerializedName(alternate = {"i"}, value = "mIsPinned")
    public final boolean i;
    @SerializedName(alternate = {"j"}, value = "mNormalizedTrajectory")
    public final acar<acaq> j;
    @SerializedName(alternate = {"k"}, value = "mTypeface")
    public final String k;
    @SerializedName("mPickedColor")
    public final int l;
    @SerializedName("mCaptionStyle")
    @Deprecated
    public final aeer m;
    @SerializedName("mUserTags")
    public final List<agnv> n;
    @SerializedName("mDynamicCaptionStyle")
    public final ahyl o;
    @SerializedName(alternate = {"l"}, value = "mScaleFactor")
    private final float p;
    @SerializedName(alternate = {"m"}, value = "mWidth")
    private final double q;
    @SerializedName(alternate = {"n"}, value = "mHeight")
    private final double r;

    /* renamed from: abzg$a */
    public static class a {
        public int a = 0;
        public String b;
        public String c;
        public List<abzh> d;
        public Map<defpackage.abzi.a, List<abzi>> e;
        double f;
        double g;
        public acas h;
        double i;
        public float j;
        float k;
        float l;
        public int m;
        public aeer n;
        public ahyl o;
        public List<agnv> p;
        public boolean q;
        public acar<acaq> r;

        public final a a(float f) {
            this.i = (double) f;
            return this;
        }

        public final a a(int i) {
            this.a = i;
            return this;
        }

        public final a a(acar<acaq> acar) {
            this.r = acar;
            return this;
        }

        public final a a(acas acas) {
            this.h = acas;
            return this;
        }

        public final a a(aeer aeer) {
            this.n = aeer;
            return this;
        }

        public final a a(ahyl ahyl) {
            this.o = ahyl;
            return this;
        }

        public final a a(Double d) {
            this.f = d != null ? d.doubleValue() : 0.0d;
            return this;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a a(List<agnv> list) {
            this.p = list;
            return this;
        }

        public final a a(Map<defpackage.abzi.a, List<abzi>> map) {
            this.e = map;
            return this;
        }

        public final a a(boolean z) {
            this.q = z;
            return this;
        }

        public final abzg a() {
            return new abzg(this);
        }

        public final a b(float f) {
            this.j = f;
            return this;
        }

        public final a b(int i) {
            this.m = i;
            return this;
        }

        public final a b(Double d) {
            this.g = d != null ? d.doubleValue() : 0.0d;
            return this;
        }

        public final a c(float f) {
            this.k = f;
            return this;
        }

        public final a c(Double d) {
            this.i = d != null ? d.doubleValue() : 0.0d;
            return this;
        }

        public final a d(float f) {
            this.l = f;
            return this;
        }
    }

    public abzg(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.p = aVar.j;
        this.i = aVar.q;
        this.j = aVar.r;
        this.k = aVar.c;
        this.q = (double) aVar.k;
        this.r = (double) aVar.l;
        this.l = aVar.m;
        this.m = aVar.n;
        this.o = aVar.o;
        this.n = aVar.p;
    }

    public static boolean a(List<abzg> list) {
        if (list == null) {
            return false;
        }
        for (abzg abzg : list) {
            if (abzg.i) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<abzh> c() {
        return this.c;
    }

    public final Map<a, List<abzi>> d() {
        return this.d;
    }

    public final double e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzg abzg = (abzg) obj;
        boolean z = this.i;
        if (z != abzg.i) {
            return false;
        }
        return (z ? new akmc().a(this.a, abzg.a).a(this.b, abzg.b).a(this.c, abzg.c).a(this.d, abzg.d).a(this.f, abzg.f).a(this.j, abzg.j) : new akmc().a(this.a, abzg.a).a(this.b, abzg.b).a(this.c, abzg.c).a(this.d, abzg.d).a(this.e, abzg.e).a(this.f, abzg.f).a(this.h, abzg.h).a(this.g, abzg.g).a(this.q, abzg.q).a(this.r, abzg.r)).a(this.l, abzg.l).a(this.m, abzg.m).a(this.o, abzg.o).a(this.n, abzg.n).a;
    }

    public final acas f() {
        return this.g;
    }

    public final double g() {
        return this.h;
    }

    public final float h() {
        return this.p;
    }

    public int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.k).a(this.c).a(this.d).a(this.e).a(this.f).a(this.h).a(this.p).a(this.g).a(this.i).a(this.j).a(this.q).a(this.r).a(this.l).a(this.m).a(this.o).a(this.n).a;
    }

    public final boolean i() {
        return this.i;
    }

    public final acar<acaq> j() {
        return this.j;
    }

    public final double k() {
        return this.q;
    }

    public final double l() {
        return this.r;
    }

    public final String m() {
        return this.k;
    }

    public final int n() {
        return this.l;
    }

    public final aeer o() {
        return this.m;
    }

    public final ahyl p() {
        return this.o;
    }

    public final List<agnv> q() {
        return this.n;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("type", this.a).add("text", this.b).add("typeface", this.k).add("text_attributes", this.c).add("style_attributes", this.d).add("font_size", this.e).add("editing_font_size", this.f).add("position", this.g).add("rotationInClockwiseDegrees", this.h).add("scale", this.p).add("is_pinned", this.i).add("normalized_trajectory", this.j).add("width", this.q).add("height", this.r).add("picked_color", this.l).add("caption_style", this.m).add("user tags", this.n).add("dynamic_caption_style", this.o).toString();
    }
}
