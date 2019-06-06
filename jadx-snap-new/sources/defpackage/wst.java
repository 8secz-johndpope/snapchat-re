package defpackage;

/* renamed from: wst */
public final class wst extends wss<aily, wsq> {
    public wst() {
        super(wsq.class);
    }

    public final /* synthetic */ Enum a(Enum enumR) {
        aily aily = (aily) enumR;
        akcr.b(aily, "jsonEnum");
        int i = wsu.a[aily.ordinal()];
        wsq wsq = i != 1 ? i != 2 ? i != 3 ? i != 4 ? wsq.UNRECOGNIZED_VALUE : wsq.IN_COGNAC : wsq.IN_SETTING_REPORT : wsq.CRASH_REPORT : wsq.SHAKE_REPORT;
        return wsq;
    }

    public final /* synthetic */ Enum b(Enum enumR) {
        wsq wsq = (wsq) enumR;
        akcr.b(wsq, "integerEnum");
        int i = wsu.b[wsq.ordinal()];
        aily aily = i != 1 ? i != 2 ? i != 3 ? i != 4 ? aily.UNRECOGNIZED_VALUE : aily.IN_GAME : aily.IN_SETTING_REPORT : aily.CRASH_REPORT : aily.SHAKE_REPORT;
        return aily;
    }
}
