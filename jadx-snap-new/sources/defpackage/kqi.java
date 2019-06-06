package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.mhs.b;
import org.opencv.imgproc.Imgproc;

/* renamed from: kqi */
public final class kqi {
    static final kqi n;
    public final String a;
    public final mux b;
    public final long c;
    public final long d;
    public final long e;
    public final aapr f;
    public final aapp g;
    public final boolean h;
    final boolean i;
    public final String j;
    public final kqj k;
    public final long l;
    public final long m;
    private final long o;
    private final aasc p;

    /* renamed from: kqi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        mux mux = r4;
        mux mux2 = new mux(new b("empty"), null, null, null, null, null, null, null, null, null, null, null, 0, 2097150);
        n = new kqi(mux, 0, 0, 0, null, null, false, 0, false, null, null, kqj.c, 14334);
    }

    public /* synthetic */ kqi(mux mux, long j, long j2, long j3, aapr aapr, aapp aapp, boolean z, long j4, boolean z2, String str, aasc aasc, kqj kqj, int i) {
        int i2 = i;
        this(mux, (i2 & 2) != 0 ? 0 : j, (i2 & 4) != 0 ? 0 : j2, (i2 & 8) != 0 ? -1 : j3, (i2 & 16) != 0 ? null : aapr, (i2 & 32) != 0 ? null : aapp, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? -1 : j4, (i2 & 256) != 0 ? false : z2, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? null : str, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? null : aasc, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? kqj.c : kqj, 0, 0);
    }

    private kqi(mux mux, long j, long j2, long j3, aapr aapr, aapp aapp, boolean z, long j4, boolean z2, String str, aasc aasc, kqj kqj, long j5, long j6) {
        mux mux2 = mux;
        kqj kqj2 = kqj;
        akcr.b(mux, "lens");
        akcr.b(kqj2, "sessionId");
        this.b = mux2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = aapr;
        this.g = aapp;
        this.h = z;
        this.o = j4;
        this.i = z2;
        this.j = str;
        this.p = aasc;
        this.k = kqj2;
        this.l = j5;
        this.m = j6;
        this.a = this.b.a.a;
    }

    public static /* synthetic */ kqi a(kqi kqi, mux mux, long j, long j2, long j3, aapr aapr, aapp aapp, boolean z, long j4, boolean z2, String str, aasc aasc, kqj kqj, long j5, long j6, int i) {
        kqi kqi2 = kqi;
        int i2 = i;
        mux mux2 = (i2 & 1) != 0 ? kqi2.b : mux;
        long j7 = (i2 & 2) != 0 ? kqi2.c : j;
        long j8 = (i2 & 4) != 0 ? kqi2.d : j2;
        long j9 = (i2 & 8) != 0 ? kqi2.e : j3;
        aapr aapr2 = (i2 & 16) != 0 ? kqi2.f : aapr;
        aapp aapp2 = (i2 & 32) != 0 ? kqi2.g : aapp;
        boolean z3 = (i2 & 64) != 0 ? kqi2.h : z;
        long j10 = (i2 & 128) != 0 ? kqi2.o : j4;
        boolean z4 = (i2 & 256) != 0 ? kqi2.i : z2;
        str = (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? kqi2.j : str;
        aasc = (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? kqi2.p : aasc;
        kqj kqj2 = (i2 & ItemAnimator.FLAG_MOVED) != 0 ? kqi2.k : kqj;
        z2 = z4;
        if ((i2 & 4096) != 0) {
            j4 = j10;
            j10 = kqi2.l;
        } else {
            j4 = j10;
            j10 = j5;
        }
        long j11 = (i2 & 8192) != 0 ? kqi2.m : j6;
        akcr.b(mux2, "lens");
        akcr.b(kqj2, "sessionId");
        return new kqi(mux2, j7, j8, j9, aapr2, aapp2, z3, j4, z2, str, aasc, kqj2, j10, j11);
    }

    public final kro a() {
        return new kro(this.b, this.c, this.d, this.e, this.p, this.k.a(), this.h, this.f, this.g, this.o, this.j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kqi) {
                kqi kqi = (kqi) obj;
                if (akcr.a(this.b, kqi.b)) {
                    if ((this.c == kqi.c ? 1 : null) != null) {
                        if ((this.d == kqi.d ? 1 : null) != null) {
                            if ((this.e == kqi.e ? 1 : null) != null && akcr.a(this.f, kqi.f) && akcr.a(this.g, kqi.g)) {
                                if ((this.h == kqi.h ? 1 : null) != null) {
                                    if ((this.o == kqi.o ? 1 : null) != null) {
                                        if ((this.i == kqi.i ? 1 : null) != null && akcr.a(this.j, kqi.j) && akcr.a(this.p, kqi.p) && akcr.a(this.k, kqi.k)) {
                                            if ((this.l == kqi.l ? 1 : null) != null) {
                                                if ((this.m == kqi.m ? 1 : null) != null) {
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
        mux mux = this.b;
        int i = 0;
        int hashCode = (mux != null ? mux.hashCode() : 0) * 31;
        long j = this.c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.e;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        aapr aapr = this.f;
        hashCode = (hashCode + (aapr != null ? aapr.hashCode() : 0)) * 31;
        aapp aapp = this.g;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        int i2 = this.h;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long j2 = this.o;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        i2 = this.i;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.j;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aasc aasc = this.p;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        kqj kqj = this.k;
        if (kqj != null) {
            i = kqj.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j3 = this.l;
        hashCode = (hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        j3 = this.m;
        return hashCode + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnalyticsSession(lens=");
        stringBuilder.append(this.b);
        stringBuilder.append(", lensPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lensesCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cameraFacing=");
        stringBuilder.append(this.e);
        stringBuilder.append(", lensType=");
        stringBuilder.append(this.f);
        stringBuilder.append(", lensSource=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isGeo=");
        stringBuilder.append(this.h);
        stringBuilder.append(", deviceScore=");
        stringBuilder.append(this.o);
        stringBuilder.append(", isPostponed=");
        stringBuilder.append(this.i);
        stringBuilder.append(", lensLink=");
        stringBuilder.append(this.j);
        stringBuilder.append(", lensAttachmentType=");
        stringBuilder.append(this.p);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.k);
        stringBuilder.append(", frontCameraFaceCount=");
        stringBuilder.append(this.l);
        stringBuilder.append(", backCameraFaceCount=");
        stringBuilder.append(this.m);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
