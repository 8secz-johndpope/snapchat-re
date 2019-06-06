package defpackage;

import defpackage.fth.a;

/* renamed from: djg */
public enum djg implements fth {
    QOS_CONFIG(a.a(false)),
    RELIABLE_UPLOADS(a.a(false)),
    BLIZZARD_LOG_VIEWER(a.a(false)),
    VIEWER_EVENT_BLACKLIST(a.a(dhx.a)),
    CONFIG_OVERRIDE(a.a(r2)),
    SAMPLING_UUID(a.a(r2)),
    QUEUES_DISABLE_UPLOAD_WITHOUT_NETWORK(a.a(r2)),
    QUEUES_DISABLE_UPLOAD_IN_BACKGROUND(a.a(r2)),
    ENABLE_UPLOADER_V2(a.a(false)),
    DURABLE_JOB(a.a(false)),
    DURABLE_JOB_PERIOD_MINUTES(a.a(-1)),
    DURABLE_JOB_PERIODIC_QUEUES(a.a(r2)),
    DURABLE_JOB_DELAY_SECONDS_ON_BACKGROUND(a.a(-1)),
    DURABLE_JOB_IN_FOREGROUND(a.a(false)),
    DURABLE_JOB_FOREGROUND_DELAY_SECONDS(a.a(5)),
    BATCH_SEQUENCE_ID_WRITES(a.a(false));
    
    private final a<?> delegate;

    private djg(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.BLIZZARD;
    }
}
