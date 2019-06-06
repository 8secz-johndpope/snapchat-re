package defpackage;

import com.google.gson.annotations.SerializedName;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acaj */
public final class acaj {
    @SerializedName("x")
    public final float a;
    @SerializedName("y")
    public final float b;
    @SerializedName("rotation")
    public final float c;
    @SerializedName("scale")
    public final float d;

    public acaj() {
        this(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
    }

    public acaj(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static adie a(acaj acaj, float f) {
        return acaj.a(acaj, f, new float[]{1.0f, 1.0f});
    }

    public static adie a(acaj acaj, float f, float[] fArr) {
        adie adie = new adie();
        if (!acaj.b(acaj)) {
            adie b = adie.b(fArr[0], fArr[1]);
            float f2 = acaj.d;
            b.b(f2, f2).b(1.0f, 1.0f / f).a(acaj.c).b(1.0f, f).a(acaj.a, acaj.b);
        }
        return adie;
    }

    public static boolean a(acaj acaj) {
        float f = acaj.c % 360.0f;
        if (f < MapboxConstants.MINIMUM_ZOOM) {
            f += 360.0f;
        }
        return Math.abs(f - 90.0f) < 0.001f || Math.abs(f - 270.0f) < 0.001f;
    }

    public static boolean b(acaj acaj) {
        return acaj == null || acaj.e();
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final boolean e() {
        return Math.abs(this.a) < 0.001f && Math.abs(this.b) < 0.001f && Math.abs(this.c) < 0.001f && Math.abs(this.d - 1.0f) < 0.001f;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return e();
        }
        try {
            acaj acaj = (acaj) obj;
            return new akmc().a(this.a, acaj.a).a(this.b, acaj.b).a(this.c, acaj.c).a(this.d, acaj.d).a;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return e() ? 0 : new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OpenGLTransformData: [x:");
        stringBuilder.append(this.a);
        stringBuilder.append(", y:");
        stringBuilder.append(this.b);
        stringBuilder.append(", rotation:");
        stringBuilder.append(this.c);
        stringBuilder.append(", scale:");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
