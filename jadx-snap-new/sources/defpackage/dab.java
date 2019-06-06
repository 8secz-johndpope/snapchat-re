package defpackage;

import defpackage.fth.a;

/* renamed from: dab */
public enum dab implements fth {
    BATTERY_MONITORING(a.a(false)),
    SHOULD_READ_POWER_PROFILE_VERSION(a.a(0)),
    LAST_READ_TIME_OF_USAGE_STATS(a.a(0));
    
    private final a<?> delegate;

    private dab(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.BATTERY;
    }
}
