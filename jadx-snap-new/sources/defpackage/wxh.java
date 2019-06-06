package defpackage;

import defpackage.fth.a;

/* renamed from: wxh */
public enum wxh implements fth {
    ENABLED(a.a(true)),
    EXP_ENABLED(a.a(false)),
    API_TOKEN(a.a(r2)),
    INITIAL_REQUEST_TIME(a.a(3.0f)),
    POST_RETRY_SEND_INTERVAL(a.a(2.0f)),
    MAX_BUFFER_LENGTH(a.a(10.0f)),
    MAX_ATTEMPTS(a.a(8)),
    DEVICE_ID(a.a(r2)),
    DEVICE_DATE(a.a(0));
    
    private final a<?> delegate;

    private wxh(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SHAZAM;
    }
}
