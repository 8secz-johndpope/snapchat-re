package defpackage;

import defpackage.fth.a;

/* renamed from: wiq */
public enum wiq implements fth {
    DISABLE_PINNING(a.a(false)),
    SHOULD_SEND_CLEARTEXT_KEY(a.a(false));
    
    private final a<?> delegate;

    private wiq(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SECURITY;
    }
}
