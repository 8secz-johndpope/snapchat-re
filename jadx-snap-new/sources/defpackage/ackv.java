package defpackage;

import android.os.SystemClock;
import java.util.Iterator;

/* renamed from: ackv */
public final class ackv {
    final aclu a;
    final aclg b;
    final dis c;
    long d;
    long e;
    long f;
    long g = -1;
    long h;
    long i;
    final abpt<acku> j = new abpt();
    private long k;

    public ackv(aclu aclu, final aclg aclg, dis dis) {
        this.a = aclu;
        this.c = dis;
        this.b = aclg;
        aclg.a.a(new adbw() {
            public final void c(acmj acmj) {
                ackv.this.d = SystemClock.elapsedRealtime();
            }

            public final void d(acmj acmj) {
                if (ackv.this.d > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    ackq d = aclg.d();
                    ackm e = aclg.e();
                    Object obj = 1;
                    if (e != null) {
                        if (!e.b) {
                            ackv.this.f = -1;
                            obj = null;
                        } else if (ackv.this.f <= 0) {
                            ackv.this.f = elapsedRealtime;
                        }
                    }
                    if (d != null) {
                        if (!d.f) {
                            ackv.this.e = -1;
                            obj = null;
                        } else if (ackv.this.e <= 0) {
                            ackv.this.e = elapsedRealtime;
                        }
                        if (!d.g) {
                            ackv.this.h = -1;
                            obj = null;
                        } else if (ackv.this.h <= 0) {
                            ackv.this.h = elapsedRealtime;
                        }
                        if (d.i && ackv.this.g <= 0) {
                            ackv.this.g = elapsedRealtime;
                        }
                        if (!d.h) {
                            ackv.this.i = -1;
                            obj = null;
                        } else if (ackv.this.i <= 0) {
                            ackv.this.i = elapsedRealtime;
                        }
                    }
                    if (obj != null) {
                        long j;
                        Iterator it = ackv.this.j.iterator();
                        while (it.hasNext()) {
                            ((acku) it.next()).a();
                        }
                        ackv ackv = ackv.this;
                        aarn aarn = new aarn();
                        aarn.a = Long.valueOf(ackv.a.a.a);
                        aclo aclo = ackv.b.f;
                        if (aclo.A != null) {
                            j = ackv.f - ackv.d;
                            aarn.h = Long.valueOf((long) aclo.A.c);
                            aarn.i = Long.valueOf(j);
                        }
                        ackq d2 = ackv.b.d();
                        if (d2 != null) {
                            j = ackv.e - ackv.d;
                            aarn.f = Long.valueOf((long) d2.b.size());
                            aarn.g = Long.valueOf(j);
                        }
                        if (ackv.g > 0) {
                            aarn.d = Long.valueOf(ackv.g - ackv.d);
                        }
                        long j2 = ackv.h - ackv.d;
                        if (d2 != null) {
                            j = (long) ackv.b.d().e;
                            aarn.b = Long.valueOf((long) d2.d);
                            aarn.c = Long.valueOf(j);
                        }
                        aarn.e = Long.valueOf(j2);
                        ackv.c.a(aarn);
                        ackv = ackv.this;
                        ackv.d = -1;
                        ackv.e = -1;
                        ackv.i = -1;
                        ackv.h = -1;
                        ackv.f = -1;
                    }
                }
            }
        });
    }

    public final void a() {
        this.k = SystemClock.elapsedRealtime();
        this.d = -1;
        this.e = -1;
        this.i = -1;
        this.h = -1;
        this.f = -1;
    }

    public final void a(acku acku) {
        this.j.c(acku);
    }
}
