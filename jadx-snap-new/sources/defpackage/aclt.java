package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: aclt */
public final class aclt {
    public final long a;
    public final dis b;

    public aclt(dis dis, ihh ihh) {
        this.a = ihh.c();
        this.b = dis;
    }

    public final long a() {
        return this.a;
    }

    public final void a(double d, double d2, double d3, aarj aarj, String str, double d4, double d5) {
        aark aark = new aark();
        long j = this.a;
        if (j > 0) {
            aark.a = Long.valueOf(j);
        }
        aark.b = Double.valueOf(d);
        aark.c = Double.valueOf(d2);
        aark.d = Double.valueOf(d3);
        aark.e = aarj;
        aark.f = str;
        aark.g = Double.valueOf(d4);
        aark.h = Double.valueOf(d5);
        this.b.a(aark);
    }

    public final void a(aajv aajv, zyr zyr, double d, long j, long j2, long j3, long j4, long j5, Set<String> set) {
        double round = (double) Math.round(d * 10.0d);
        Double.isNaN(round);
        round /= 10.0d;
        aaqs aaqs = new aaqs();
        aaqs.a = Long.valueOf(this.a);
        aaqs.b = abbd.MAP;
        aaqs.c = zyr;
        aaqs.d = aajv;
        aaqs.f = Double.valueOf(round);
        aaqs.g = Long.valueOf(j);
        aaqs.e = Long.valueOf(j2);
        aaqs.k = Long.valueOf(0);
        aaqs.l = Long.valueOf(j4);
        aaqs.h = Long.valueOf(j3);
        aaqs.i = Long.valueOf(j5);
        aaqs.j = abps.a(set, ppy.b);
        this.b.a(aaqs);
    }

    public final void a(aaqv aaqv, double d) {
        d = (double) Math.round(d * 10.0d);
        Double.isNaN(d);
        d /= 10.0d;
        aaqw aaqw = new aaqw();
        aaqw.a = Long.valueOf(this.a);
        aaqw.b = abbd.MAP;
        aaqw.c = aaua.MAP_PLACES_ONBOARDING;
        aaqw.d = aaqv;
        aaqw.e = Double.valueOf(d);
        this.b.a(aaqw);
    }

    public final void a(aarb aarb, Collection<String> collection, long j, long j2) {
        aarm aarm = new aarm();
        aarm.a = Long.valueOf(this.a);
        aarm.b = aarb;
        aarm.d = Long.valueOf((long) collection.size());
        aarm.h = abps.a(collection, "~");
        aarm.e = Long.valueOf(j);
        aarm.f = Long.valueOf(j2);
        this.b.a(aarm);
    }

    public final void a(abbd abbd, zyr zyr) {
        aaqu aaqu = new aaqu();
        aaqu.a = Long.valueOf(this.a);
        aaqu.b = abbd;
        aaqu.c = zyr;
        this.b.a(aaqu);
    }

    public final void a(abbd abbd, zyr zyr, long j) {
        aaqt aaqt = new aaqt();
        aaqt.a = Long.valueOf(this.a);
        aaqt.b = abbd;
        aaqt.c = zyr;
        aaqt.d = Long.valueOf(j);
        aaqt.e = Boolean.FALSE;
        this.b.a(aaqt);
    }

    public final void a(aclu aclu) {
        aaqf aaqf = new aaqf();
        long j = this.a;
        if (j > 0) {
            aaqf.a = Long.valueOf(j);
        }
        aclq aclq = aclu.b.d;
        aaqf.b = Long.valueOf(aclq.a);
        aaqf.c = Long.valueOf(aclq.b);
        aaqf.d = Long.valueOf(aclq.c);
        aaqf.e = Long.valueOf(aclq.d);
        aaqf.f = Long.valueOf(aclq.e);
        aaqf.g = Long.valueOf(aclq.f);
        aaqf.h = Long.valueOf(aclq.g);
        this.b.a(aaqf);
    }

    public final void a(Long l, aarh aarh, Long l2, Long l3) {
        aarg aarg = new aarg();
        aarg.a = Long.valueOf(this.a);
        aarg.b = l;
        aarg.c = aarh;
        aarg.e = l2;
        aarg.d = l3;
        this.b.a(aarg);
    }

    public final void a(Long l, Long l2, aarh aarh, String str, Long l3) {
        aarf aarf = new aarf();
        aarf.a = Long.valueOf(this.a);
        aarf.b = l;
        aarf.e = l2;
        aarf.c = aarh;
        aarf.f = str;
        aarf.d = l3;
        this.b.a(aarf);
    }

    public final void a(Long l, Long l2, Long l3) {
        aarc aarc = new aarc();
        aarc.a = Long.valueOf(this.a);
        aarc.b = l;
        aarc.c = l2;
        aarc.d = l3;
        this.b.a(aarc);
    }

    public final void a(Long l, Long l2, Long l3, abbd abbd) {
        aare aare = new aare();
        aare.a = Long.valueOf(this.a);
        aare.b = l;
        aare.d = l2;
        aare.e = l3;
        aare.c = abbd;
        this.b.a(aare);
    }

    public final void a(String str, String str2, Long l, boolean z) {
        aaqk aaqk = new aaqk();
        aaqk.a = Long.valueOf(this.a);
        aaqk.c = str;
        aaqk.b = str2;
        aaqk.d = l;
        aaqk.e = Boolean.valueOf(z);
        this.b.a(aaqk);
    }

    public final void a(zyr zyr) {
        aarm aarm = new aarm();
        aarm.a = Long.valueOf(this.a);
        aarm.c = zyr;
        this.b.a(aarm);
    }

    public final dis b() {
        return this.b;
    }

    public final void b(Long l, Long l2, Long l3) {
        aard aard = new aard();
        aard.a = Long.valueOf(this.a);
        aard.b = l;
        aard.c = l2;
        aard.d = l3;
        this.b.a(aard);
    }

    public final void c() {
        aaqw aaqw = new aaqw();
        aaqw.a = Long.valueOf(this.a);
        aaqw.b = abbd.MAP;
        aaqw.c = aaua.MAP_ONBOARDING;
        aaqw.d = aaqv.COMPLETE;
        aaqw.e = Double.valueOf(0.0d);
        this.b.a(aaqw);
    }
}
