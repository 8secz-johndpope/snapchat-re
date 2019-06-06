package defpackage;

import defpackage.fth.a;

/* renamed from: iui */
public enum iui implements fth {
    TOS_VERSION_6_ACCEPTED(a.a(false)),
    TOS_VERSION_7_ACCEPTED(a.a(false)),
    SEEN_PRIVACY_POLICY_GDPR(a.a(false)),
    SHOW_PRIVACY_POLICY_GDPR(a.a(true));
    
    private final a<?> delegate;

    private iui(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.LEGAL_AGREEMENT;
    }
}
