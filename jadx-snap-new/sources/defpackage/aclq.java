package defpackage;

/* renamed from: aclq */
public final class aclq {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    private aclq() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public aclq(char c) {
        this();
    }

    public final void a() {
        this.a++;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aclq) {
                aclq aclq = (aclq) obj;
                if ((this.a == aclq.a ? 1 : null) != null) {
                    if ((this.b == aclq.b ? 1 : null) != null) {
                        if ((this.c == aclq.c ? 1 : null) != null) {
                            if ((this.d == aclq.d ? 1 : null) != null) {
                                if ((this.e == aclq.e ? 1 : null) != null) {
                                    if ((this.f == aclq.f ? 1 : null) != null) {
                                        if ((this.g == aclq.g ? 1 : null) != null) {
                                            return true;
                                        }
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
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.e;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.g;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GestureCounter(singleTapCount=");
        stringBuilder.append(this.a);
        stringBuilder.append(", doubleTapCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", pinchCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", panCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", zoomSliderCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", oneFingerZoomCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(", twoFingerTapCount=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
