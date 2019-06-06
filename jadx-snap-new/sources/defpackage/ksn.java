package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.kqe.t;

/* renamed from: ksn */
public final class ksn implements ksr {
    private final ksr a;
    private final kqu b;
    private final kss c;
    private final ksv d;

    public ksn(ksr ksr, kqu kqu, kss kss, ksv ksv) {
        akcr.b(ksr, "blizzardEventReporter");
        akcr.b(kqu, "adTrackReporter");
        akcr.b(kss, "lensAnalyticsSessionReporter");
        akcr.b(ksv, "performanceEventsReporter");
        this.a = ksr;
        this.b = kqu;
        this.c = kss;
        this.d = ksv;
    }

    public final void a(String str, long j, long j2, long j3) {
        String str2 = str;
        akcr.b(str, DiscoverStorySnapModel.LENSID);
        this.a.a(str2, j, j2, j3);
    }

    public final void a(kqi kqi) {
        akcr.b(kqi, "sessionData");
        this.c.a(kqi);
    }

    public final void a(kqi kqi, t tVar) {
        akcr.b(kqi, "sessionData");
        akcr.b(tVar, "event");
        this.a.a(kqi, tVar);
    }

    public final void a(krp krp) {
        akcr.b(krp, "optionReport");
        this.a.a(krp);
    }

    public final void a(ksm ksm) {
        akcr.b(ksm, "carouselReport");
        this.a.a(ksm);
    }

    public final void a(kst kst) {
        akcr.b(kst, "lensReport");
        this.a.a(kst);
        this.b.a(kst);
        Double d = kst.q;
        if (d != null) {
            this.d.a(d.doubleValue(), kst.b());
        }
        d = kst.y;
        if (d != null) {
            this.d.b(d.doubleValue(), kst.b());
        }
        d = kst.E;
        if (d != null) {
            this.d.c(d.doubleValue(), kst.b());
        }
        d = kst.F;
        if (d != null) {
            this.d.d(d.doubleValue(), kst.b());
        }
    }

    public final void b(kst kst) {
        akcr.b(kst, "lensReport");
        this.a.b(kst);
    }

    public final void c(kst kst) {
        akcr.b(kst, "lensReport");
        this.a.c(kst);
    }

    public final void d(kst kst) {
        akcr.b(kst, "lensReport");
        this.a.d(kst);
    }
}
