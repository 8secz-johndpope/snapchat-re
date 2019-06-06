package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: abyo */
public final class abyo {
    @SerializedName("offset")
    public final int a;
    @SerializedName("duration")
    public final int b;
    @SerializedName("preSplitIndex")
    public final int c;
    @SerializedName("preSplitCount")
    public final int d;
    @SerializedName("postSplitIndex")
    public final int e;
    @SerializedName("postSplitCount")
    public final int f;

    public abyo(int i) {
        this(0, i, -1, 0, -1, 0);
    }

    public abyo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof abyo) {
                abyo abyo = (abyo) obj;
                if ((this.a == abyo.a ? 1 : null) != null) {
                    if ((this.b == abyo.b ? 1 : null) != null) {
                        if ((this.c == abyo.c ? 1 : null) != null) {
                            if ((this.d == abyo.d ? 1 : null) != null) {
                                if ((this.e == abyo.e ? 1 : null) != null) {
                                    if ((this.f == abyo.f ? 1 : null) != null) {
                                        return true;
                                    }
                                }
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
        return (((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SegmentInfo(offset=");
        stringBuilder.append(this.a);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.b);
        stringBuilder.append(", preSplitIndex=");
        stringBuilder.append(this.c);
        stringBuilder.append(", preSplitCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", postSplitIndex=");
        stringBuilder.append(this.e);
        stringBuilder.append(", postSplitCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
