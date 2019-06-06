package defpackage;

import defpackage.fth.a;

/* renamed from: esd */
public enum esd implements fth {
    ENABLE_FRIEND_CHARMS(a.a(false)),
    ENABLE_GROUP_CHARMS(a.a(false)),
    ENABLE_REAL_CHARMS_SERVER_RESPONSE(a.a(true)),
    ENDPOINT(a.a(esg.PROD));
    
    private final a<?> delegate;

    private esd(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.CHARMS;
    }
}
