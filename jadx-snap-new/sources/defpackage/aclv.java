package defpackage;

import android.location.Location;
import java.util.ArrayList;

/* renamed from: aclv */
public final class aclv {
    public static double a(nbo nbo, double d, double d2) {
        double d3 = Double.MAX_VALUE;
        for (alhq alhq : nbo == null ? new ArrayList() : nbo.f()) {
            double a = adbu.a(d, d2, (double) alhq.b, (double) alhq.c);
            if (a < d3) {
                d3 = a;
            }
        }
        return Double.compare(d3, Double.MAX_VALUE) == 0 ? -1.0d : d3 * 1000.0d;
    }

    public static double a(nct nct, double d, double d2) {
        Location a = nct == null ? null : nct.a();
        if (a == null) {
            return -1.0d;
        }
        return adbu.a(d, d2, a.getLatitude(), a.getLongitude()) * 1000.0d;
    }
}
