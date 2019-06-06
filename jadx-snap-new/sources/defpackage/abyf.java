package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abyf */
public final class abyf {
    public float a;
    public int b;
    public int c;
    public int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;

    public abyf() {
        this(MapboxConstants.MINIMUM_ZOOM, 0, 0, 0, 511);
    }

    private abyf(float f, int i, int i2, int i3) {
        this.a = f;
        this.e = 0;
        this.f = 0;
        this.b = i;
        this.c = i2;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.d = i3;
    }

    public /* synthetic */ abyf(float f, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            f = 1.0f;
        }
        if ((i4 & 8) != 0) {
            i = 0;
        }
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 256) != 0) {
            i3 = 0;
        }
        this(f, i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abyf) {
                abyf abyf = (abyf) obj;
                if (Float.compare(this.a, abyf.a) == 0) {
                    if ((this.b == abyf.b ? 1 : null) != null) {
                        if ((this.c == abyf.c ? 1 : null) != null) {
                            if ((this.d == abyf.d ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((Float.floatToIntBits(this.a) * 31) * 31) * 31) + this.b) * 31) + this.c) * 31) * 31) * 31) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ImageTranscodingOptions(scaleFactor=");
        stringBuilder.append(this.a);
        stringBuilder.append(", inWidth=0");
        stringBuilder.append(", inHeight=0");
        stringBuilder.append(", targetWidth=");
        stringBuilder.append(this.b);
        stringBuilder.append(", targetHeight=");
        stringBuilder.append(this.c);
        stringBuilder.append(", rotationDegree=0");
        stringBuilder.append(", flipImage=false");
        stringBuilder.append(", centerCrop=false");
        stringBuilder.append(", jpegEncodingQuality=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
