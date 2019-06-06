package defpackage;

/* renamed from: adnx */
public final class adnx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;

    private /* synthetic */ adnx() {
        this(true, true, true, true, false, 0, 0);
    }

    public adnx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof adnx) {
                adnx adnx = (adnx) obj;
                if ((this.a == adnx.a ? 1 : null) != null) {
                    if ((this.b == adnx.b ? 1 : null) != null) {
                        if ((this.c == adnx.c ? 1 : null) != null) {
                            if ((this.d == adnx.d ? 1 : null) != null) {
                                if ((this.e == adnx.e ? 1 : null) != null) {
                                    if ((this.f == adnx.f ? 1 : null) != null) {
                                        if ((this.g == adnx.g ? 1 : null) != null) {
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
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.d;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.e;
        if (!z) {
            i2 = z;
        }
        return ((((i + i2) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TranscodingPerformanceTweaks(skipAudioEncodingIfNotNeeded=");
        stringBuilder.append(this.a);
        stringBuilder.append(", skipAudioResamplerIfNotNeeded=");
        stringBuilder.append(this.b);
        stringBuilder.append(", resampleAudioInBackground=");
        stringBuilder.append(this.c);
        stringBuilder.append(", adjustAudioSlowPlaybackRateByChangingSampleRate=");
        stringBuilder.append(this.d);
        stringBuilder.append(", tryUseMultiThread=");
        stringBuilder.append(this.e);
        stringBuilder.append(", numThreadsForConcurrentStageProcessor=");
        stringBuilder.append(this.f);
        stringBuilder.append(", sleepDurationForNoopMs=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
