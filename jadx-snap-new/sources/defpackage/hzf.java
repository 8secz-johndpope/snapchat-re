package defpackage;

import defpackage.fth.a;

/* renamed from: hzf */
public enum hzf implements fth {
    FIDELIUS_FRIENDS_NEED_SYNC(a.a(false)),
    FIDELIUS_FETCH_MISSING_FRIENDS(a.a(false)),
    SHOW_FIDELIUS_TOASTS(a.a(false)),
    FIDELIUS_WIPE_REDUNDANT_DBS(a.a(false)),
    DELETE_FIDELIUS_DATA_ON_LOGOUT(a.a(false)),
    FIDELIUS_PUBLISH_LOG_FILE(a.a(false)),
    FIDELIUS_ENABLE_MULTI_RECIPIENT_SUPPORT(a.a(false));
    
    private final a<?> delegate;

    private hzf(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.FIDELIUS;
    }
}
