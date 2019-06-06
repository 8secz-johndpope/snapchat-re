package defpackage;

import android.net.wifi.WifiInfo;
import defpackage.rwz.a;
import defpackage.rxa.b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rxg */
public final class rxg implements a {
    private final aipn<ifa> a;
    private final aipn<rxa.a> b;
    private final Map<String, rxa> c = new HashMap();
    private aipn<rxc> d;
    private final b e;

    public rxg(aipn<ifa> aipn, aipn<rxa.a> aipn2, aipn<rxc> aipn3, b bVar) {
        this.a = aipn;
        this.b = aipn2;
        this.d = aipn3;
        this.e = bVar;
    }

    private synchronized String a() {
        if (((ifa) this.a.get()).k()) {
            WifiInfo j = ((ifa) this.a.get()).j();
            String str = null;
            String ssid = j != null ? j.getSSID() : null;
            if (j != null) {
                str = j.getBSSID();
            }
            if (j == null || ssid == null || str == null) {
                return "NO_NETWORK";
            }
            StringBuilder stringBuilder = new StringBuilder("WIFI-");
            stringBuilder.append(ssid);
            stringBuilder.append('-');
            stringBuilder.append(str);
            return stringBuilder.toString();
        } else if (((ifa) this.a.get()).i()) {
            return "WWAN";
        } else {
            return "NO_NETWORK";
        }
    }

    private synchronized rxa a(String str) {
        rxa rxa;
        rxa = (rxa) this.c.get(str);
        if (rxa == null) {
            rxa = ((rxa.a) this.b.get()).a((rxc) this.d.get(), this.e);
            this.c.put(str, rxa);
        }
        return rxa;
    }

    private synchronized rxa b() {
        return a(a());
    }

    public final synchronized void a(rwy rwy) {
        rxa b = b();
        if (rwy.d) {
            b.a(rwy.a.toString());
        } else {
            b.a(rwy.a.toString(), rwy.b);
        }
    }
}
