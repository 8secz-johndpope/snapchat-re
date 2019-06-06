package defpackage;

import android.graphics.Point;
import android.view.View;
import defpackage.ebs.d;
import defpackage.edv.a;
import defpackage.edv.b;

/* renamed from: edy */
public final class edy implements a {
    public ekc a;
    public b b;
    public ajdp<Point> c;
    public dqi d;
    public dqm e;
    public View f;
    public ajdp<duz> g;
    public ajdp<ebs> h;
    public dok i;
    private ajei j;
    private final ekc.a k = ekc.a.a();
    private final ekc.a l = ekc.a.b();

    private static /* synthetic */ Boolean a(ebs ebs, duz duz) {
        boolean z = ebs == d.b && duz == duz.FULLY_VISIBLE;
        return Boolean.valueOf(z);
    }

    private /* synthetic */ void a(ekc.a aVar, boolean z, dpp dpp) {
        if (!this.j.isDisposed()) {
            this.a.b(aVar);
        }
    }

    public final ajej start() {
        this.j = new ajei();
        this.j.a(this.c.f(new -$$Lambda$edy$aPLRW_4e8rbLIkECXKS5-28SBCA(this)));
        this.j.a(ajdp.a(this.h, this.g, -$$Lambda$edy$aGoFErAWtN-uftdJzHRG5CYzDgA.INSTANCE).j(ajfu.a).f(new -$$Lambda$edy$-OXnMhlXnxF2uZUzQMBb8tfSYDo(this)));
        return this.j;
    }
}
