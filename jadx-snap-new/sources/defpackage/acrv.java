package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acrv */
public final class acrv {
    final aipn<aclg> a;

    /* renamed from: acrv$a */
    static final class a implements defpackage.acuh.a {
        private /* synthetic */ acrv a;
        private /* synthetic */ actb b;

        a(acrv acrv, actb actb) {
            this.a = acrv;
            this.b = actb;
        }

        public final void onAnimationEnd(acuh acuh) {
            Object obj = this.a.a.get();
            akcr.a(obj, "snapMap.get()");
            ((aclg) obj).k().b(this.b);
        }
    }

    public acrv(aipn<aclg> aipn) {
        akcr.b(aipn, "snapMap");
        this.a = aipn;
    }

    public final actb a(cgi cgi, double d) {
        akcr.b(cgi, "latLng");
        float pow = ((float) Math.pow(1.03d, d)) * 40.0f;
        long currentTimeMillis = System.currentTimeMillis();
        double d2 = (double) pow;
        Double.isNaN(d2);
        actb actb = new actb(cgi, currentTimeMillis, (int) (d2 * 1.4d));
        Object obj = this.a.get();
        String str = "snapMap.get()";
        akcr.a(obj, str);
        ((aclg) obj).k().a(actb);
        obj = this.a.get();
        akcr.a(obj, str);
        ((aclg) obj).j().m();
        return actb;
    }

    public final void a(actb actb, boolean z) {
        acuh acuh;
        akcr.b(actb, "tapAnimationState");
        if (z) {
            acuh = new acuh(1.0f, MapboxConstants.MINIMUM_ZOOM, 700.0f, actb.a);
            acuh.h = true;
            actb.b(acuh);
        }
        acuh = new acuh(1.0f, MapboxConstants.MINIMUM_ZOOM, 300.0f, acun.a);
        acuh.i.add(new a(this, actb));
        acuh.h = true;
        actb.a(acuh);
    }

    public final void a(acuu acuu) {
        akcr.b(acuu, "poiSceneObject");
        acuu.c(0);
        Object obj = this.a.get();
        akcr.a(obj, "snapMap.get()");
        ((aclg) obj).j().m();
    }

    public final sri b(acuu acuu) {
        akcr.b(acuu, "poiSceneObject");
        Object obj = this.a.get();
        akcr.a(obj, "snapMap.get()");
        obj = ((aclg) obj).j();
        akcr.a(obj, "snapMap.get().viewHost");
        ViewGroup k = obj.k();
        return k != null ? acuu.a((View) k) : null;
    }
}
