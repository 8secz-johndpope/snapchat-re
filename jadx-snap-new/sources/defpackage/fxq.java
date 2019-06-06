package defpackage;

import defpackage.fth.a;

/* renamed from: fxq */
public enum fxq implements fth {
    DURABLE_JOB_MUSHROOM_WAKEUP_USE_CUSTOM_SCHEDULE(a.a(false)),
    DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_START(a.a(50)),
    DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_END(a.a(80)),
    DURABLE_JOB_WAKEUP_DEBOUNCE_SEC(a.a(0)),
    DURABLE_JOB_MUSHROOM_WORKMANAGER_WAKEUP_EMABLED(a.a(false)),
    DURABLE_JOB_ALLOW_BLIZZARD_INIT(a.a(true)),
    DURABLE_JOB_GRAPHENE_FLUSH_ON_STOP_ENABLED(a.a(false));
    
    private final a<?> delegate;

    private fxq(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.DURABLE_JOB;
    }
}
