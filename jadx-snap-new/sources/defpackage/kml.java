package defpackage;

import defpackage.fth.a;

/* renamed from: kml */
public enum kml implements fth {
    IN_APP_REPORT_MESSAGE(a.a("")),
    ENABLE_IN_APP_MODERATED_ACTION(a.a(false));
    
    private final a<?> delegate;

    private kml(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.IN_APP_REPORTING;
    }
}
