package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.HashMap;
import org.opencv.imgproc.Imgproc;

/* renamed from: kro */
public final class kro {
    public final String A;
    public final boolean B;
    public final aapr C;
    public final aapp D;
    public final long E;
    public final String F;
    public final aabz G;
    public boolean H;
    public final krt a;
    public final krt b;
    public final krt c;
    public final krt d;
    public HashMap<String, Integer> e;
    public long f;
    public long g;
    public Double h;
    public Double i;
    public Double j;
    public Double k;
    public Double l;
    public Double m;
    public Long n;
    public boolean o;
    public Long p;
    public Long q;
    public Long r;
    public Float s;
    public Boolean t;
    public Boolean u;
    public final mux v;
    public final long w;
    public final long x;
    public long y;
    public final aasc z;

    public /* synthetic */ kro(mux mux, long j, long j2, long j3, aasc aasc, String str, boolean z, aapr aapr, aapp aapp, long j4, String str2) {
        this(mux, j, j2, j3, aasc, str, z, aapr, aapp, j4, str2, aabz.INTERACTION_END, false);
    }

    private kro(mux mux, long j, long j2, long j3, aasc aasc, String str, boolean z, aapr aapr, aapp aapp, long j4, String str2, aabz aabz, boolean z2) {
        mux mux2 = mux;
        String str3 = str;
        akcr.b(mux, "lens");
        akcr.b(str, "sessionId");
        this.v = mux2;
        this.w = j;
        this.x = j2;
        this.y = j3;
        this.z = aasc;
        this.A = str3;
        this.B = z;
        this.C = aapr;
        this.D = aapp;
        this.E = j4;
        this.F = str2;
        this.G = aabz;
        this.H = z2;
        this.a = new krt();
        this.b = new krt();
        this.c = new krt();
        this.d = new krt();
        this.e = new HashMap();
    }

    public static /* synthetic */ kro a(kro kro, mux mux, long j, long j2, long j3, aasc aasc, String str, boolean z, aapr aapr, aapp aapp, long j4, String str2, aabz aabz, boolean z2, int i) {
        kro kro2 = kro;
        int i2 = i;
        return kro.a((i2 & 1) != 0 ? kro2.v : mux, (i2 & 2) != 0 ? kro2.w : j, (i2 & 4) != 0 ? kro2.x : j2, (i2 & 8) != 0 ? kro2.y : j3, (i2 & 16) != 0 ? kro2.z : aasc, (i2 & 32) != 0 ? kro2.A : str, (i2 & 64) != 0 ? kro2.B : z, (i2 & 128) != 0 ? kro2.C : aapr, (i2 & 256) != 0 ? kro2.D : aapp, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? kro2.E : j4, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? kro2.F : str2, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? kro2.G : aabz, (i2 & 4096) != 0 ? kro2.H : z2);
    }

    private static kro a(mux mux, long j, long j2, long j3, aasc aasc, String str, boolean z, aapr aapr, aapp aapp, long j4, String str2, aabz aabz, boolean z2) {
        mux mux2 = mux;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        aasc aasc2 = aasc;
        String str3 = str;
        boolean z3 = z;
        aapr aapr2 = aapr;
        aapp aapp2 = aapp;
        long j8 = j4;
        String str4 = str2;
        aabz aabz2 = aabz;
        boolean z4 = z2;
        mux mux3 = mux2;
        akcr.b(mux2, "lens");
        akcr.b(str, "sessionId");
        return new kro(mux3, j5, j6, j7, aasc2, str3, z3, aapr2, aapp2, j8, str4, aabz2, z4);
    }

    public final String a() {
        return this.v.a.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kro) {
                kro kro = (kro) obj;
                if (akcr.a(this.v, kro.v)) {
                    if ((this.w == kro.w ? 1 : null) != null) {
                        if ((this.x == kro.x ? 1 : null) != null) {
                            if ((this.y == kro.y ? 1 : null) != null && akcr.a(this.z, kro.z) && akcr.a(this.A, kro.A)) {
                                if ((this.B == kro.B ? 1 : null) != null && akcr.a(this.C, kro.C) && akcr.a(this.D, kro.D)) {
                                    if ((this.E == kro.E ? 1 : null) != null && akcr.a(this.F, kro.F) && akcr.a(this.G, kro.G)) {
                                        if ((this.H == kro.H ? 1 : null) != null) {
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
        mux mux = this.v;
        int i = 0;
        int hashCode = (mux != null ? mux.hashCode() : 0) * 31;
        long j = this.w;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.x;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.y;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        aasc aasc = this.z;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        String str = this.A;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = this.B;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        aapr aapr = this.C;
        hashCode = (hashCode + (aapr != null ? aapr.hashCode() : 0)) * 31;
        aapp aapp = this.D;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        long j2 = this.E;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.F;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aabz aabz = this.G;
        if (aabz != null) {
            i = aabz.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.H;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensSession(lens=");
        stringBuilder.append(this.v);
        stringBuilder.append(", lensPosition=");
        stringBuilder.append(this.w);
        stringBuilder.append(", lensesCount=");
        stringBuilder.append(this.x);
        stringBuilder.append(", camera=");
        stringBuilder.append(this.y);
        stringBuilder.append(", lensAttachmentType=");
        stringBuilder.append(this.z);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.A);
        stringBuilder.append(", isGeo=");
        stringBuilder.append(this.B);
        stringBuilder.append(", lensType=");
        stringBuilder.append(this.C);
        stringBuilder.append(", lensSourceType=");
        stringBuilder.append(this.D);
        stringBuilder.append(", deviceScore=");
        stringBuilder.append(this.E);
        stringBuilder.append(", lensLink=");
        stringBuilder.append(this.F);
        stringBuilder.append(", flipAction=");
        stringBuilder.append(this.G);
        stringBuilder.append(", isRecording=");
        stringBuilder.append(this.H);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
