package defpackage;

import defpackage.fth.a;

/* renamed from: jhk */
public enum jhk implements fth {
    USE_TWEAKS_OVER_CLIENT_STUDY(a.a(false)),
    ENABLED(a.a(false)),
    CAN_KICK_OUT_OTHER_USERS(a.a(false)),
    USE_ALTERNATIVE_OPT_IN_DIALOG_COPY(a.a(false)),
    ONE_TAP_LOGIN_KILL_SWITCH(a.a(false)),
    ONE_TAP_LOGIN_ENABLED_INTERNAL_USE(a.a(false));
    
    private final a<?> delegate;

    private jhk(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.ONE_TAP_LOGIN;
    }
}
