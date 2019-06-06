package defpackage;

import defpackage.ssi.a;

/* renamed from: yhm */
public final class yhm implements yhl {
    private final ajwy<yhk> a;
    private final yhp b;

    public yhm(ajwy<yhk> ajwy, yhp yhp) {
        akcr.b(ajwy, "storySnapMetricsReporterProvider");
        akcr.b(yhp, "storyViewAnalytics");
        this.a = ajwy;
        this.b = yhp;
    }

    public final ssi a(long j, aahb aahb, fvj fvj) {
        akcr.b(aahb, "viewSource");
        akcr.b(fvj, "contextCardsAnalyticsPlugin");
        ssi[] ssiArr = new ssi[2];
        ssiArr[0] = new yhb(j, aahb, this.b, fvj);
        ssiArr[1] = a(aahb);
        return new a(ssiArr);
    }

    public final ssi a(aahb aahb) {
        akcr.b(aahb, "viewSource");
        return new yhn(aahb, this.a);
    }
}
