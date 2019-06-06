package defpackage;

import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: gkx */
public final class gkx {
    static {
        gkd gkd = new gkd();
    }

    static final String a(String str) {
        try {
            Object host = new URL(str).getHost();
            akcr.a(host, "URL(url).host");
            return host;
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    static final String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(' ');
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    static final String a(rxk rxk) {
        Object rxm = rxk.e.toString();
        akcr.a(rxm, "networkCondition.bandwidthClassDownload.toString()");
        return rxm;
    }

    static final void a(aasw aasw, sat<sai> sat) {
        Object c = sbi.c(sat.b());
        if (c != null) {
            akcr.a(c, "url");
            aasw.o(c.getHost());
            aasw.p(c.getPath());
            aasw.q(c.getQuery());
        }
    }

    static final boolean a(sao sao, sam sam) {
        san san = sao.c;
        return sam == (san != null ? san.a : null);
    }

    static final aasv b(rxk rxk) {
        int i = gky.b[rxk.c.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : aasv.UNKNOWN : aasv.NOT_REACHABLE : aasv.WIFI : aasv.WWAN;
    }
}
