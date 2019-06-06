package defpackage;

import android.graphics.PointF;
import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.agoe.a;
import java.util.List;

/* renamed from: abzm */
public final class abzm implements abzn {
    @SerializedName(alternate = {"a"}, value = "color")
    public final int a;
    @SerializedName(alternate = {"b"}, value = "points")
    public final List<PointF> b;
    @SerializedName(alternate = {"d"}, value = "strokeWidth")
    public final float c;
    @SerializedName(alternate = {"e"}, value = "emojiUnicodeString")
    public final String d;
    @SerializedName(alternate = {"c"}, value = "displayDensity")
    private final float e;
    @SerializedName(alternate = {"f"}, value = "drawerType")
    private final a f;

    /* renamed from: abzm$a */
    public static class a {
        public int a;
        public List<PointF> b;
        public float c = MapboxConstants.MINIMUM_ZOOM;
        public float d = 6.5f;
        public String e;
        public defpackage.agoe.a f;

        public final abzm a() {
            return new abzm(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    public abzm(int i, List<PointF> list, float f, float f2, String str, a aVar) {
        this.a = i;
        this.b = list;
        this.e = f;
        this.c = f2;
        this.d = str;
        this.f = aVar;
    }

    public final boolean a() {
        return this.f == a.EMOJI;
    }

    public final List<PointF> b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final float d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzm abzm = (abzm) obj;
        return new akmc().a(this.a, abzm.a).a(this.b, abzm.b).a(this.e, abzm.e).a(this.c, abzm.c).a(this.d, abzm.d).a(this.f, abzm.f).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.d).a(this.b).a(this.e).a(this.c).a(this.f).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("color", this.a).add("points", this.b).add("displayDensity", this.e).add("strokeWidth", this.c).add("emojiString", this.d).add("drawerType", this.f).toString();
    }
}
