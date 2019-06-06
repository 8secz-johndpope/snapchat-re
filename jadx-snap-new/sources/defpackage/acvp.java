package defpackage;

import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acuh.a;
import defpackage.acup.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acvp */
public final class acvp {
    String a = null;
    public final List<acvr> b = new ArrayList();
    boolean c;
    public final acuv d = new acuv();
    public boolean e;
    boolean f;
    public acuh g;
    public acuh h;
    public acuh i;
    public float j = 1.0f;
    public int k;
    private final int l;
    private float m;
    private int n;

    /* renamed from: acvp$1 */
    class 1 implements a {
        private /* synthetic */ String a;
        private /* synthetic */ long b;

        1(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public final void onAnimationEnd(acuh acuh) {
            if (acvp.this.a(this.a) && acvp.this.d() && acvp.this.i.c != 1.0f) {
                acvp.this.i.a(this.b, 1.0f, 300.0f, acue.a);
                acvp.this.i.h = true;
            }
        }
    }

    public acvp(int i) {
        this.l = i;
    }

    private void a(long j, float f) {
        acuh acuh = this.i;
        if (acuh != null) {
            float f2 = this.m;
            float f3 = MapboxConstants.MINIMUM_ZOOM;
            if (!(f2 == MapboxConstants.MINIMUM_ZOOM || acuh.c == MapboxConstants.MINIMUM_ZOOM)) {
                float b = f > MapboxConstants.MINIMUM_ZOOM ? (this.m * this.i.b(j)) / f : MapboxConstants.MINIMUM_ZOOM;
                acuh acuh2 = this.i;
                if (f != MapboxConstants.MINIMUM_ZOOM) {
                    f3 = 1.0f;
                }
                Interpolator interpolator = acue.a;
                acuh2.b = b;
                acuh2.c = f3;
                acuh2.e = 300.0f;
                acuh2.a = interpolator;
                acuh2.g = false;
                acuh2.f = 1;
                acuh2.d = 0;
                acuh2.h = false;
                acuh2.j = false;
                this.i.h = true;
                this.m = f;
                return;
            }
        }
        this.m = f;
    }

    public final acvr a() {
        return (acvr) this.b.get(0);
    }

    public final void a(b bVar, float f, ackh ackh) {
        this.n = (int) f;
        if (f <= MapboxConstants.MINIMUM_ZOOM) {
            a(ackh.b, MapboxConstants.MINIMUM_ZOOM);
            return;
        }
        f = (float) adcd.a.a(f, bVar);
        float f2 = (f * 2.0f) / (bVar.a / 2.0f);
        float f3 = a().i;
        float a = ackh.a(this.h, 1.0f);
        if (a > MapboxConstants.MINIMUM_ZOOM) {
            f3 /= a;
        }
        if (f == MapboxConstants.MINIMUM_ZOOM || f2 < f3 * 1.5f) {
            f = 1.0f;
        }
        a(ackh.b, f);
        bVar.g = true;
    }

    public final void a(acvr acvr) {
        Object obj = (acvr == null || !this.b.contains(acvr)) ? null : 1;
        if (obj == null) {
            this.b.add(acvr);
            this.a = acvr.p.a;
            this.c = true;
        }
    }

    public final boolean a(String str) {
        return this.b.size() == 1 && str != null && str.equals(this.a);
    }

    public final List<acvr> b() {
        return this.b;
    }

    public final boolean c() {
        return this.a == null;
    }

    public final boolean d() {
        acuh acuh = this.h;
        return acuh != null && acuh.c == 1.5f;
    }
}
