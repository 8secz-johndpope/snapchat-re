package defpackage;

/* renamed from: ptg */
public final class ptg {
    public double a;
    public long b;
    public long c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public boolean m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;

    /* renamed from: ptg$a */
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

    public /* synthetic */ ptg() {
        this(-1.0d, -1, -1, false, -1, -1, -1, -1, -1, -1, -1, -1, false, false, -1, false, false);
    }

    public ptg(byte b) {
        this(-1.0d, -1, -1, true, -1, -1, -1, -1, -1, -1, -1, -1, false, false, -1, true, false);
    }

    public ptg(double d, long j, long j2, boolean z, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, boolean z3, long j11, boolean z4, boolean z5) {
        this.a = d;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
        this.k = j9;
        this.l = j10;
        this.m = z2;
        this.n = z3;
        this.o = j11;
        this.p = z4;
        this.q = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ptg) {
                ptg ptg = (ptg) obj;
                if (Double.compare(this.a, ptg.a) == 0) {
                    if ((this.b == ptg.b ? 1 : null) != null) {
                        if ((this.c == ptg.c ? 1 : null) != null) {
                            if ((this.d == ptg.d ? 1 : null) != null) {
                                if ((this.e == ptg.e ? 1 : null) != null) {
                                    if ((this.f == ptg.f ? 1 : null) != null) {
                                        if ((this.g == ptg.g ? 1 : null) != null) {
                                            if ((this.h == ptg.h ? 1 : null) != null) {
                                                if ((this.i == ptg.i ? 1 : null) != null) {
                                                    if ((this.j == ptg.j ? 1 : null) != null) {
                                                        if ((this.k == ptg.k ? 1 : null) != null) {
                                                            if ((this.l == ptg.l ? 1 : null) != null) {
                                                                if ((this.m == ptg.m ? 1 : null) != null) {
                                                                    if ((this.n == ptg.n ? 1 : null) != null) {
                                                                        if ((this.o == ptg.o ? 1 : null) != null) {
                                                                            if ((this.p == ptg.p ? 1 : null) != null) {
                                                                                if ((this.q == ptg.q ? 1 : null) != null) {
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
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long j = this.b;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = this.d;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        long j2 = this.e;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.g;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.h;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.i;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.j;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.k;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.l;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        i2 = this.m;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        i2 = this.n;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        j2 = this.o;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        i2 = this.p;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        i2 = this.q;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewEditsAnalytics(viewTimeSec=");
        stringBuilder.append(this.a);
        stringBuilder.append(", captionAddCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", captionDeleteCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", withGallery=");
        stringBuilder.append(this.d);
        stringBuilder.append(", stickerUserEnterSearchCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", stickerCustomCreateCount=");
        stringBuilder.append(this.f);
        stringBuilder.append(", stickerCustomDeleteCount=");
        stringBuilder.append(this.g);
        stringBuilder.append(", pretypeStickerTagSelectCount=");
        stringBuilder.append(this.h);
        stringBuilder.append(", prefixMatchStickerTagSelectCount=");
        stringBuilder.append(this.i);
        stringBuilder.append(", stickerDeletionCount=");
        stringBuilder.append(this.j);
        stringBuilder.append(", stickerInfoTapCount=");
        stringBuilder.append(this.k);
        stringBuilder.append(", contextFilterGeneratedCount=");
        stringBuilder.append(this.l);
        stringBuilder.append(", contextFilterIsSeen=");
        stringBuilder.append(this.m);
        stringBuilder.append(", visualFilterIsSeen=");
        stringBuilder.append(this.n);
        stringBuilder.append(", swipeCount=");
        stringBuilder.append(this.o);
        stringBuilder.append(", galleryMediaSync=");
        stringBuilder.append(this.p);
        stringBuilder.append(", withSearch=");
        stringBuilder.append(this.q);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
