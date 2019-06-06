package defpackage;

import android.view.animation.Interpolator;
import defpackage.acvm.a;
import defpackage.acvm.b;
import defpackage.acvm.e;

/* renamed from: ackl */
public final class ackl {
    public boolean a;
    public boolean b;
    public acvm c;
    public boolean d;
    public long e;
    public final Interpolator f = acun.a;
    public final Interpolator g = acue.a;
    public final Interpolator h = acun.a;
    public final Interpolator i = acue.a;
    public boolean j = true;
    private final adbv k;
    private final aclj l;

    /* renamed from: ackl$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[e.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.acvm.e.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ackl$1.<clinit>():void");
        }
    }

    public ackl(adbv adbv, aclj aclj) {
        this.k = adbv;
        this.l = aclj;
    }

    public static int a(acxj acxj, acvr acvr) {
        a aVar = acvr.r;
        int i = 1.a[aVar.a(acvr, "") - 1];
        if (i == 1) {
            acxj.a((acur) acvr);
        } else if (i == 2) {
            acxj.a(acvr, aVar.b());
        }
        return (acvr.g == null || !acvr.g.a()) ? -1 : acvr.g.a.a;
    }

    public final void a() {
        if (this.a != this.b) {
            this.k.m();
        }
        this.b = this.a;
    }

    public final void a(adap adap) {
        if (this.c == null) {
            b bVar = new b();
            bVar.b = 0.0d;
            bVar.a = 0.0d;
            bVar.c = "GhostModeRenderingState_ghostId";
            bVar.f = 1;
            bVar.d = new acvv(adap, this.l.a());
            bVar.g = false;
            this.c = bVar.c();
        }
    }
}
