package defpackage;

/* renamed from: rbj */
public final class rbj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final long f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public rbj(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.e = z;
        this.f = j;
        this.g = z2;
        this.a = z3;
        this.b = z4;
        this.h = z5;
        this.c = z6;
        this.i = z7;
        this.d = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rbj) {
                rbj rbj = (rbj) obj;
                if ((this.e == rbj.e ? 1 : null) != null) {
                    if ((this.f == rbj.f ? 1 : null) != null) {
                        if ((this.g == rbj.g ? 1 : null) != null) {
                            if ((this.a == rbj.a ? 1 : null) != null) {
                                if ((this.b == rbj.b ? 1 : null) != null) {
                                    if ((this.h == rbj.h ? 1 : null) != null) {
                                        if ((this.c == rbj.c ? 1 : null) != null) {
                                            if ((this.i == rbj.i ? 1 : null) != null) {
                                                if ((this.d == rbj.d ? 1 : null) != null) {
                                                    return true;
                                                }
                                            }
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
        int i = this.e;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        long j = this.f;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = this.g;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.a;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.h;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.i;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.d;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsFeedConfig(shouldShowQuickAddCarousel=");
        stringBuilder.append(this.e);
        stringBuilder.append(", lastCheckStoriesTimestamp=");
        stringBuilder.append(this.f);
        stringBuilder.append(", shouldShowQuickAdd=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isArroyoFeedFirstEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", useLoqConversations=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isPrefetchSnapStackInOperaEnabled=");
        stringBuilder.append(this.h);
        stringBuilder.append(", useArroyoPagination=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isForceSyncAndClearLocalDataEnabled=");
        stringBuilder.append(this.i);
        stringBuilder.append(", useStackDrawLayout=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
