package defpackage;

import defpackage.fth.a;

/* renamed from: rgz */
public enum rgz implements fth {
    HAS_SEEN_SNAPPABLES_PRIVACY_ALERT(a.a(false)),
    HAS_SEEN_SEND_TO_QUICK_ADD_DIALOG(a.a(false)),
    ANDROID_PREVIEW_SWIPE_UP_TO_SEND(a.a(false));
    
    private final a<?> delegate;

    private rgz(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.MESSAGING_SENDTO;
    }
}
