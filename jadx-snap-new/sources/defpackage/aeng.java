package defpackage;

import com.snapchat.soju.android.Geofence;
import java.util.ArrayList;

/* renamed from: aeng */
public final class aeng {
    public static adzi a(Geofence geofence) {
        adzi adzi = new adzi();
        if (geofence.id != null) {
            adzi.a = geofence.id;
        }
        if (geofence.coordinates != null) {
            adzi.b = new adzg[geofence.coordinates.size()];
            for (int i = 0; i < geofence.coordinates.size(); i++) {
                adzg[] adzgArr = adzi.b;
                aeiq aeiq = (aeiq) geofence.coordinates.get(i);
                adzg adzg = new adzg();
                if (aeiq.a != null) {
                    adzg.a = aeiq.a.doubleValue();
                }
                if (aeiq.b != null) {
                    adzg.b = aeiq.b.doubleValue();
                }
                adzgArr[i] = adzg;
            }
        }
        return adzi;
    }

    public static Geofence a(adzi adzi) {
        Geofence geofence = new Geofence();
        if (!adzi.a.isEmpty()) {
            geofence.id = adzi.a;
        }
        if (adzi.b.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (adzg adzg : adzi.b) {
                aeiq aeiq = new aeiq();
                aeiq.a = Double.valueOf(adzg.a);
                aeiq.b = Double.valueOf(adzg.b);
                arrayList.add(aeiq);
            }
            if (!arrayList.isEmpty()) {
                geofence.coordinates = arrayList;
            }
        }
        return geofence;
    }
}
