package defpackage;

import android.os.SystemClock;
import java.util.Date;

/* renamed from: acmb */
public final class acmb {
    private final aclu a;
    private final abqo b;
    private long c;

    public acmb(aclu aclu) {
        this(aclu, new abqo());
    }

    private acmb(aclu aclu, abqo abqo) {
        this.a = aclu;
        this.b = abqo;
        this.c = SystemClock.elapsedRealtime();
    }

    public final void a(String str) {
        aaye aaye = aaye.MAP_CHOOSE_FRIEND_NOT_ON_MAP;
        if ((this.a.b.c.a(str) != null ? 1 : null) != null) {
            aaye = aaye.MAP_CHOOSE_FRIEND_ON_MAP;
        }
        aclt aclt = this.a.a;
        long j = this.c;
        aayq aayq = new aayq();
        aayq.a = Long.toString(aclt.a);
        aayq.b = Long.valueOf(j);
        aayq.e = aaye;
        aayq.d = aayg.SEARCH_RESULTS_PAGE;
        aayq.c = aaym.UNKNOWN;
        double time = (double) new Date().getTime();
        Double.isNaN(time);
        aayq.f = Double.valueOf(time / 1000.0d);
        aayq.g = abbd.MAP;
        aclt.b.a(aayq);
    }
}
