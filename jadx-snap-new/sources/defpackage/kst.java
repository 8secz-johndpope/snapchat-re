package defpackage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: kst */
public final class kst {
    public final Long A;
    public final Float B;
    public final Boolean C;
    public final Boolean D;
    public final Double E;
    public final Double F;
    public final Double G;
    public final mux a;
    public final long b;
    public final long c;
    public final long d;
    public final aasc e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final aapr j;
    public final aapp k;
    public final aabz l;
    public final boolean m;
    public final HashMap<String, Integer> n;
    public final long o;
    public final long p;
    public final Double q;
    public final Long r;
    public final long s;
    public final String t;
    public final boolean u;
    public final Long v;
    public final Long w;
    public final boolean x;
    public final Double y;
    public final Double z;

    /* renamed from: kst$a */
    public static final class a {
        static {
            a aVar = new a();
        }

        private a() {
        }

        public static kst a(kro kro) {
            kro kro2 = kro;
            akcr.b(kro2, "session");
            kst kst = r2;
            kst kst2 = new kst(kro2.v, kro2.w, kro2.x, kro2.y, kro2.z, kro2.A, kro2.a.a(TimeUnit.MILLISECONDS), kro2.b.a(TimeUnit.MILLISECONDS), kro2.c.a(TimeUnit.MILLISECONDS), kro2.C, kro2.D, kro2.G, kro2.H, kro2.e, kro2.f, kro2.g, kro2.h, kro2.n, kro2.E, kro2.F, kro2.o, kro2.p, kro2.q, kro2.B, kro2.i, kro2.j, kro2.r, kro2.s, kro2.t, kro2.u, kro2.k, kro2.l, kro2.m);
            return kst;
        }
    }

    public kst(mux mux, long j, long j2, long j3, aasc aasc, String str, long j4, long j5, long j6, aapr aapr, aapp aapp, aabz aabz, boolean z, HashMap<String, Integer> hashMap, long j7, long j8, Double d, Long l, long j9, String str2, boolean z2, Long l2, Long l3, boolean z3, Double d2, Double d3, Long l4, Float f, Boolean bool, Boolean bool2, Double d4, Double d5, Double d6) {
        mux mux2 = mux;
        String str3 = str;
        HashMap<String, Integer> hashMap2 = hashMap;
        akcr.b(mux, "lens");
        akcr.b(str, "sessionId");
        akcr.b(hashMap2, "expressionToCountMap");
        this.a = mux2;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = aasc;
        this.f = str3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = aapr;
        this.k = aapp;
        this.l = aabz;
        this.m = z;
        this.n = hashMap2;
        this.o = j7;
        this.p = j8;
        this.q = d;
        this.r = l;
        this.s = j9;
        this.t = str2;
        this.u = z2;
        this.v = l2;
        this.w = l3;
        this.x = z3;
        this.y = d2;
        this.z = d3;
        this.A = l4;
        this.B = f;
        this.C = bool;
        this.D = bool2;
        this.E = d4;
        this.F = d5;
        this.G = d6;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final boolean b() {
        return this.k == aapp.VIDEOCHAT;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kst) {
                kst kst = (kst) obj;
                if (akcr.a(this.a, kst.a)) {
                    if ((this.b == kst.b ? 1 : null) != null) {
                        if ((this.c == kst.c ? 1 : null) != null) {
                            if ((this.d == kst.d ? 1 : null) != null && akcr.a(this.e, kst.e) && akcr.a(this.f, kst.f)) {
                                if ((this.g == kst.g ? 1 : null) != null) {
                                    if ((this.h == kst.h ? 1 : null) != null) {
                                        if ((this.i == kst.i ? 1 : null) != null && akcr.a(this.j, kst.j) && akcr.a(this.k, kst.k) && akcr.a(this.l, kst.l)) {
                                            if ((this.m == kst.m ? 1 : null) != null && akcr.a(this.n, kst.n)) {
                                                if ((this.o == kst.o ? 1 : null) != null) {
                                                    if ((this.p == kst.p ? 1 : null) != null && akcr.a(this.q, kst.q) && akcr.a(this.r, kst.r)) {
                                                        if ((this.s == kst.s ? 1 : null) != null && akcr.a(this.t, kst.t)) {
                                                            if ((this.u == kst.u ? 1 : null) != null && akcr.a(this.v, kst.v) && akcr.a(this.w, kst.w)) {
                                                                if (!((this.x == kst.x ? 1 : null) != null && akcr.a(this.y, kst.y) && akcr.a(this.z, kst.z) && akcr.a(this.A, kst.A) && akcr.a(this.B, kst.B) && akcr.a(this.C, kst.C) && akcr.a(this.D, kst.D) && akcr.a(this.E, kst.E) && akcr.a(this.F, kst.F) && akcr.a(this.G, kst.G))) {
                                                                    return false;
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
        mux mux = this.a;
        int i = 0;
        int hashCode = (mux != null ? mux.hashCode() : 0) * 31;
        long j = this.b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        aasc aasc = this.e;
        hashCode = (hashCode + (aasc != null ? aasc.hashCode() : 0)) * 31;
        String str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        j = this.g;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.h;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.i;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        aapr aapr = this.j;
        hashCode = (hashCode + (aapr != null ? aapr.hashCode() : 0)) * 31;
        aapp aapp = this.k;
        hashCode = (hashCode + (aapp != null ? aapp.hashCode() : 0)) * 31;
        aabz aabz = this.l;
        hashCode = (hashCode + (aabz != null ? aabz.hashCode() : 0)) * 31;
        int i2 = this.m;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        HashMap hashMap = this.n;
        hashCode = (hashCode + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        long j2 = this.o;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.p;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Double d = this.q;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        Long l = this.r;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        j2 = this.s;
        hashCode = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.t;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        i2 = this.u;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        l = this.v;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.w;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        i2 = this.x;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        d = this.y;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.z;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        l = this.A;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Float f = this.B;
        hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        Boolean bool = this.C;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.D;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        d = this.E;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.F;
        hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
        d = this.G;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensReport(lens=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lensPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(", lensesCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", camera=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lensAttachmentType=");
        stringBuilder.append(this.e);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.f);
        stringBuilder.append(", viewTime=");
        stringBuilder.append(this.g);
        stringBuilder.append(", cameraTime=");
        stringBuilder.append(this.h);
        stringBuilder.append(", recordingTime=");
        stringBuilder.append(this.i);
        stringBuilder.append(", lensType=");
        stringBuilder.append(this.j);
        stringBuilder.append(", lensSourceType=");
        stringBuilder.append(this.k);
        stringBuilder.append(", flipAction=");
        stringBuilder.append(this.l);
        stringBuilder.append(", isRecording=");
        stringBuilder.append(this.m);
        stringBuilder.append(", expressionToCountMap=");
        stringBuilder.append(this.n);
        stringBuilder.append(", frontCameraFaceCount=");
        stringBuilder.append(this.o);
        stringBuilder.append(", backCameraFaceCount=");
        stringBuilder.append(this.p);
        stringBuilder.append(", avgFps=");
        stringBuilder.append(this.q);
        stringBuilder.append(", applyDelayMillis=");
        stringBuilder.append(this.r);
        stringBuilder.append(", deviceScore=");
        stringBuilder.append(this.s);
        stringBuilder.append(", lensLink=");
        stringBuilder.append(this.t);
        stringBuilder.append(", lensAttachmentOpened=");
        stringBuilder.append(this.u);
        stringBuilder.append(", firstTriggerTimestamp=");
        stringBuilder.append(this.v);
        stringBuilder.append(", firstFaceRenderTimestamp=");
        stringBuilder.append(this.w);
        stringBuilder.append(", isGeo=");
        stringBuilder.append(this.x);
        stringBuilder.append(", processingAvg=");
        stringBuilder.append(this.y);
        stringBuilder.append(", processingStd=");
        stringBuilder.append(this.z);
        stringBuilder.append(", lensAttachmentOpenTimestampMs=");
        stringBuilder.append(this.A);
        stringBuilder.append(", lensAttachmentViewTimeSec=");
        stringBuilder.append(this.B);
        stringBuilder.append(", lensAttachmentRedirectToPlaystore=");
        stringBuilder.append(this.C);
        stringBuilder.append(", lensAttachmentRedirectToWebview=");
        stringBuilder.append(this.D);
        stringBuilder.append(", avgFpsRecording=");
        stringBuilder.append(this.E);
        stringBuilder.append(", processingAvgRecording=");
        stringBuilder.append(this.F);
        stringBuilder.append(", processingStdRecording=");
        stringBuilder.append(this.G);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
