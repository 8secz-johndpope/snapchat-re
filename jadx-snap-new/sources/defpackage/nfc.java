package defpackage;

import defpackage.fth.a;

/* renamed from: nfc */
public enum nfc implements fth {
    GET_LAST_LOCATION_INTERVAL_MS(a.a(-1)),
    IGNORE_SERVER_SHARING_SETTINGS(a.a(false)),
    LOCATION_PERMISSION_RESULT_STATE(a.a(ifv.UNKNOWN));
    
    private final a<?> delegate;

    private nfc(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.LOCATION;
    }
}
