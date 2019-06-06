package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: admp */
public final class admp {
    final adgv[] a;
    final a[] b;
    public final adjc c;
    public final adjc d;
    public final adnx e;
    public final adie f;
    final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public int k = 8192;
    public int l = 783360;
    public boolean m;
    public boolean n;
    boolean o;
    boolean p;
    private admr q;

    /* renamed from: admp$a */
    public static class a {
        public String a;
        public long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    /* renamed from: admp$b */
    public enum b {
        TRANSCODE_VIDEO,
        TRANSCODE_IMAGE,
        SPLIT,
        FAST_SPLIT,
        COMBINE,
        UNKNOWN
    }

    public admp(adgv[] adgvArr, a[] aVarArr, adjc adjc, adjc adjc2, adnx adnx, adie adie, int i, boolean z, boolean z2) {
        adjc adjc3 = adjc;
        adjc adjc4 = adjc2;
        adnx adnx2 = adnx;
        boolean z3 = z;
        this.a = (adgv[]) Preconditions.checkNotNull(adgvArr);
        this.b = (a[]) Preconditions.checkNotNull(aVarArr);
        this.c = adjc3;
        this.d = adjc4;
        boolean z4 = true;
        if (this.a.length <= 1) {
            this.e = adnx2;
        } else {
            this.e = new adnx(false, adnx2.b, adnx2.c, false, adnx2.e, adnx2.f, adnx2.g);
        }
        this.f = (adie) Preconditions.checkNotNull(adie);
        this.g = i;
        this.q = null;
        this.h = false;
        this.i = z3;
        this.j = z2;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        Preconditions.checkArgument(adgvArr.length > 0);
        if (adjc3 == null && adjc4 == null && z3) {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
    }

    public final adjc a() {
        return this.c;
    }

    public final adjc b() {
        return this.d;
    }

    public final adnx c() {
        return this.e;
    }

    public final boolean d() {
        return this.j;
    }

    public final b e() {
        adgv[] adgvArr = this.a;
        return adgvArr.length > 1 ? this.b.length == 1 ? b.COMBINE : b.UNKNOWN : this.b.length > 1 ? this.i ? b.FAST_SPLIT : b.SPLIT : adgvArr[0] instanceof adgw ? b.TRANSCODE_VIDEO : b.TRANSCODE_IMAGE;
    }
}
