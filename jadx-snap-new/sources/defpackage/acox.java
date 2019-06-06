package defpackage;

import android.content.res.Resources;
import android.location.Location;
import android.view.View;
import android.view.View.OnClickListener;
import com.snapchat.android.R;
import defpackage.nct.a;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: acox */
public final class acox implements OnClickListener {
    final acqq a;
    final aclw b;
    final aclg c;
    final niw d;
    final adbq e;
    private final nct f;
    private final a g = new a(this);

    /* renamed from: acox$a */
    static class a implements defpackage.nct.a {
        private final WeakReference<acox> a;

        public a(acox acox) {
            this.a = new WeakReference(acox);
        }

        public final void a() {
            acox acox = (acox) this.a.get();
            if (acox != null) {
                Resources g = acox.c.g();
                acox.e.a(g, g.getString(R.string.nyc_compass_click_loading_location), R.color.medium_grey);
            }
        }

        public final void a(Location location) {
            acox acox = (acox) this.a.get();
            if (acox != null) {
                acmj j = acox.c.a.j();
                if (j != null) {
                    acox.a.a(acox.d.b(), (float) Math.max(13.0d, j.i()), aarb.MAP, false);
                    aclw aclw = acox.b;
                    aclu aclu = aclw.a;
                    Object obj = aclw.a.b;
                    akcr.a(obj, "mapAnalyticsSession.dataProvider");
                    Collection f = obj.f();
                    aclt aclt = aclu.a;
                    Object obj2 = aclu.b;
                    String str = "dataProvider";
                    akcr.a(obj2, str);
                    Location a = obj2.b.a();
                    double d = 0.0d;
                    if (a != null) {
                        cgj a2 = obj2.a.a.d.a();
                        if (a2 != null) {
                            cgi center = a2.getCenter();
                            Location location2 = new Location("");
                            location2.setLatitude(center.getLatitude());
                            location2.setLongitude(center.getLongitude());
                            d = (double) a.distanceTo(location2);
                        }
                    }
                    Object obj3 = aclu.b;
                    akcr.a(obj3, str);
                    long b = (long) obj3.b();
                    long size = (long) f.size();
                    double round = (double) Math.round(d * 1000.0d);
                    Double.isNaN(round);
                    round /= 1000.0d;
                    aaqg aaqg = new aaqg();
                    aaqg.a = Long.valueOf(aclt.a);
                    aaqg.b = zyr.TAP;
                    aaqg.c = Double.valueOf(round);
                    aaqg.d = Long.valueOf(b);
                    aaqg.e = Long.valueOf(size);
                    aclt.b.a(aaqg);
                }
            }
        }
    }

    public acox(aclg aclg, adbq adbq, nct nct, acqq acqq, niw niw, aclw aclw) {
        this.c = aclg;
        this.e = adbq;
        this.f = nct;
        this.a = acqq;
        this.d = niw;
        this.b = aclw;
    }

    public final void onClick(View view) {
        this.c.h.a(true);
        this.c.g.a(null, null);
        this.f.a(new WeakReference(this.g));
    }
}
