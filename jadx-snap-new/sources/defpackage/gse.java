package defpackage;

import defpackage.fth.a;

/* renamed from: gse */
public enum gse implements fth {
    CRASH_SAMPLE_RATE(a.a(-1.0d)),
    CRASH_SAMPLE_UUID(a.a("")),
    CRASH_REPORT_FOR_DEBUG(a.a(false)),
    CRASH_VIEWER_ENABLED(a.a(true)),
    CRASH_REPORT_FOR_BETA(a.a(false)),
    CRASH_REPORT_ENABLED(a.a(false));
    
    private final a<?> delegate;

    private gse(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.CRASH;
    }
}
