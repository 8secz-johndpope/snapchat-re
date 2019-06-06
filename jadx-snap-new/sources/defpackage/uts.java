package defpackage;

import defpackage.fth.a;

/* renamed from: uts */
public enum uts implements fth {
    ENABLE_FRIEND_ATTACHMENTS(a.a(false)),
    ENABLE_SAVED_MEDIA(a.a(false));
    
    private final a<?> delegate;

    private uts(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.PROFILE;
    }
}
