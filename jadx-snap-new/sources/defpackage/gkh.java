package defpackage;

import defpackage.aggt.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gkh */
public final class gkh {
    private final List<gki> a = new ArrayList();
    private final ajwy<gqr> b;

    public gkh(aggh aggh, ajwy<gqr> ajwy) {
        akcr.b(aggh, "cdnClientConfig");
        akcr.b(ajwy, "exceptionTracker");
        this.b = ajwy;
        for (aggr aggr : aggh.e) {
            if (aggr != null) {
                this.a.add(new gki(aggr));
            }
        }
    }

    public final String a(String str, a aVar) {
        akcr.b(str, "requestUrl");
        akcr.b(aVar, "reachability");
        try {
            Object host = new URL(str).getHost();
            akcr.a(host, "host");
            if ((((CharSequence) host).length() == 0 ? 1 : null) == null) {
                for (gki a : this.a) {
                    String a2 = a.a(str, aVar);
                    if (a2 != null) {
                        Object a3 = akly.a(str, host, a2, 1);
                        akcr.a(a3, "StringUtils.replaceOnce(…estUrl, host, routedHost)");
                        return a3;
                    }
                }
            }
        } catch (MalformedURLException e) {
            ((gqr) this.b.get()).a(gqt.HIGH, e, iew.a.callsite("MappedCdnClientConfig"), str);
        }
        return str;
    }
}
