package defpackage;

import defpackage.abln.d;
import defpackage.dny.a;
import defpackage.dny.b;

/* renamed from: dmy */
public final class dmy implements dny {
    private final aipn<ablx> a;
    private final aipn<dof> b;
    private final aipn<doj> c;
    private final aipn<doi> d;
    private final aipn<doh> e;
    private final aipn<doa> f;
    private final aipn<dob> g;
    private final aipn<dod> h;
    private final aipn<gqr> i;
    private volatile boolean j = false;

    /* renamed from: dmy$1 */
    class 1 implements b {
        1() {
        }
    }

    /* renamed from: dmy$2 */
    class 2 implements a {
        2() {
        }
    }

    public dmy(aipn<ablx> aipn, aipn<dof> aipn2, aipn<doj> aipn3, aipn<doi> aipn4, aipn<doh> aipn5, aipn<doa> aipn6, aipn<dob> aipn7, aipn<dod> aipn8, aipn<gqr> aipn9) {
        this.a = aipn;
        this.b = aipn2;
        this.c = aipn3;
        this.d = aipn4;
        this.e = aipn5;
        this.f = aipn6;
        this.g = aipn7;
        this.h = aipn8;
        this.i = aipn9;
    }

    public final b a() {
        return new 1();
    }

    public final void a(int i, boolean z, Boolean bool, edd edd) {
        ((doa) this.f.get()).a(i, z, bool.booleanValue(), edd);
    }

    public final void a(long j) {
        if (!this.j) {
            ((dod) this.h.get()).b(j);
            this.j = true;
        }
    }

    public final void a(abll abll) {
        ((ablx) this.a.get()).b(abll);
    }

    public final void a(d dVar) {
        this.j = false;
        ((ablx) this.a.get()).a(dVar);
    }

    public final void a(adlx.a aVar, String str, adjc adjc, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, long j8, long j9, long j10, long j11, boolean z2, boolean z3) {
        adlx.a aVar2 = aVar;
        ((doj) this.c.get()).a(aVar, str, adjc, i, j, j2, j3, j4, j5, j6, j7, z, j8, j9, j10, j11, z2, z3);
    }

    public final void a(dof.a aVar) {
        ((dof) this.b.get()).a(aVar);
    }

    public final void a(eca eca, ebx ebx, edi edi, doc doc) {
        ((dod) this.h.get()).a(eca, ebx, edi, doc);
    }

    public final void a(Exception exception, idd idd) {
        ((gqr) this.i.get()).a(gqt.NORMAL, exception, idd);
    }

    public final void a(String str, aasc aasc, String str2) {
        ((dof) this.b.get()).a(str, aasc, str2);
    }

    public final void a(boolean z, String str, boolean z2, dqu dqu, boolean z3, boolean z4, aaqd aaqd, aatd aatd, Double d, eca eca, dqv dqv, abtl abtl) {
        ((doi) this.d.get()).a(z, str, z2, dqu, z3, z4, aaqd, aatd, d, eca, dqv, abtl);
    }

    public final void a(ede[] edeArr, edc[] edcArr) {
        ((doa) this.f.get()).a(edeArr, edcArr);
    }

    public final a b() {
        return new 2();
    }

    public final void b(long j) {
        ((dod) this.h.get()).a(j);
    }

    public final doh c() {
        return (doh) this.e.get();
    }

    public final dob d() {
        return (dob) this.g.get();
    }
}
