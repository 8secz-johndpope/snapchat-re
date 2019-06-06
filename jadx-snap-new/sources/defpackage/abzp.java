package defpackage;

import android.graphics.PointF;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: abzp */
public final class abzp implements abzn {
    @SerializedName("color")
    public final int a;
    @SerializedName("points")
    public final List<PointF> b;
    @SerializedName("strokeWidth")
    public final float c;
    @SerializedName("emojiUnicodeString")
    public final String d;
    @SerializedName("brushId")
    public final String e;

    /* renamed from: abzp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public abzp(int i, List<? extends PointF> list, float f, String str, String str2) {
        akcr.b(list, "points");
        this.a = i;
        this.b = list;
        this.c = f;
        this.d = str;
        this.e = str2;
    }

    public final boolean a() {
        return akgb.a(this.e, "EmojiBrush.prfb", false);
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
        if (this != obj) {
            if (obj instanceof abzp) {
                abzp abzp = (abzp) obj;
                if (!((this.a == abzp.a ? 1 : null) != null && akcr.a(this.b, abzp.b) && Float.compare(this.c, abzp.c) == 0 && akcr.a(this.d, abzp.d) && akcr.a(this.e, abzp.e))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        List list = this.b;
        int i2 = 0;
        i = (((i + (list != null ? list.hashCode() : 0)) * 31) + Float.floatToIntBits(this.c)) * 31;
        String str = this.d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DrawingV2Stroke(color=");
        stringBuilder.append(this.a);
        stringBuilder.append(", points=");
        stringBuilder.append(this.b);
        stringBuilder.append(", strokeWidth=");
        stringBuilder.append(this.c);
        stringBuilder.append(", emojiUnicodeString=");
        stringBuilder.append(this.d);
        stringBuilder.append(", brushId=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
