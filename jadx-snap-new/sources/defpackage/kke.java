package defpackage;

/* renamed from: kke */
public final class kke extends ide {
    public static final zjm a;
    public static final zjm b;
    public static final zjm c;
    public static final zjm d;
    public static final acgu<zjm> e;
    public static final acgu<zjm> f;
    public static final acgu<zjm> g;
    public static final kke h;

    static {
        kke kke = new kke();
        h = kke;
        ide ide = kke;
        a = new zjm(ide, "InAppReportReasonPage", false, false, false, false, null, false, false, false, false, null, 4092);
        b = new zjm(ide, "InAppReportContextPage", false, false, false, false, null, false, false, false, false, null, 4092);
        c = new zjm(ide, "InAppReportWebViewPage", false, false, false, false, null, false, false, false, false, null, 4092);
        d = new zjm(ide, "InAppReportModeratedActionPage", false, false, false, false, null, false, false, false, false, null, 4092);
        acgu a = acgu.a(acis.b, (achg) a, true);
        if (a == null) {
            akcr.a();
        }
        e = a;
        a = acgu.a(acis.b, (achg) b, true);
        if (a == null) {
            akcr.a();
        }
        f = a;
        a = acgu.a(acis.b, (achg) c, true);
        if (a == null) {
            akcr.a();
        }
        g = a;
        if (acgu.a(acis.b, (achg) d, true) == null) {
            akcr.a();
        }
    }

    private kke() {
        super("IN_APP_REPORT", idi.APP_INSIGHTS);
    }
}
