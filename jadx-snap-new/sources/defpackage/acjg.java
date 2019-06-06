package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.achp.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: acjg */
public final class acjg implements a {
    public final List<achp<?>> a = new ArrayList(2);
    private final acgs<?, ?> b;

    public acjg(View view, acgs<?, ?> acgs) {
        this.b = acgs;
        this.a.add(new achs(this, view));
        this.a.add(new acia(this, view));
    }

    public final float a() {
        achd f = this.b.b.c.f();
        acgv navigationActionSpec = f != null ? f.getNavigationActionSpec() : null;
        return (navigationActionSpec == null || (navigationActionSpec.a(achr.BOTTOM_TO_TOP) == null && navigationActionSpec.a(achr.TOP_TO_BOTTOM) == null)) ? 2.0f : 1.0f;
    }

    public final void a(float f) {
        acgs acgs = this.b;
        if (f == MapboxConstants.MINIMUM_ZOOM) {
            acgs.e();
        } else if (!acgs.h()) {
            acgs.b.a(acgs.e, acgs.f, acgs.b(), null);
            acgs.e = null;
            if (acgs.f == null || acgs.f.e(acgs.a, acgs.b.c)) {
                acgs.f = null;
                acgs.g();
                for (achq achq : acgs.d) {
                    achq.a = null;
                }
            } else {
                acgs.f();
            }
        }
        if (acgs.g != null) {
            acgs.g.a();
            acgs.g = null;
        }
    }

    public final void a(achr achr, float f, achj achj) {
        this.b.a(achr, f, achj);
    }

    public final boolean a(achr achr) {
        acgs acgs = this.b;
        acgv navigationActionSpec = acgs.b.c.f().getNavigationActionSpec();
        if (navigationActionSpec == null) {
            return false;
        }
        acgu a = navigationActionSpec.a(achr);
        if (a == null) {
            return false;
        }
        Object obj = (acgs.e == null || achr != acgs.e.a()) ? 1 : null;
        if (!(acgs.c() && obj == null)) {
            for (achq achq : acgs.d) {
                boolean apply;
                Object obj2 = ((achq.b == null || akcr.a(achq.b, a.d() == null ? acgs.b.c.d() : a.d())) && (achq.c == null || akcr.a(achq.c, a.e() == null ? acgs.b.c.l() : a.e()))) ? 1 : null;
                if (obj2 != null) {
                    apply = achq.d.apply(null);
                    achq.a = Boolean.valueOf(apply);
                    continue;
                } else {
                    apply = true;
                    continue;
                }
                if (!apply) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i = 0;
        boolean z = false;
        while (i < this.a.size()) {
            achp achp = (achp) this.a.get(i);
            boolean a = achp.a(motionEvent);
            if (a || !achp.a()) {
                Collections.swap(this.a, i, 0);
                return a;
            }
            i++;
            z = a;
        }
        return z;
    }

    public final View b() {
        return this.b.b.c.c().c();
    }

    public final void b(achr achr) {
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            ((achh) it.next()).a(achr);
        }
    }

    public final boolean c() {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((achp) this.a.get(i)).a()) {
                return false;
            }
        }
        return true;
    }
}
