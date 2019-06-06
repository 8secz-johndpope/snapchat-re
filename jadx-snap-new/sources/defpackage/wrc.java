package defpackage;

import defpackage.fth.a;

/* renamed from: wrc */
public enum wrc implements fth {
    DEBUG_USER_TYPE(a.a(wrb.EMPLOYEE)),
    DB_DUMP_ENABLED(a.a(false)),
    NUMBER_OF_SHAKES(a.a(0)),
    S2R_ELIGIBILITY_IN_PROD(a.a(false)),
    S2R_ENABLED(a.a(false)),
    CRASH_REPORT_FOR_DEBUG(a.a(false)),
    CRASH_REPORT_JIRA_ENABLED(a.a(false)),
    IN_SETTING_REPORT_OUTAGE_BANNER_KEY(a.a("")),
    CRASH_REPORT_FOR_BETA(a.a(false)),
    SHAKE_SENSITIVITY(a.a(aima.MEDIUM));
    
    private final a<?> delegate;

    private wrc(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SHAKE_2_REPORT;
    }
}
