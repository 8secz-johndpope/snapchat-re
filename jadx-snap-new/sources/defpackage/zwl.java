package defpackage;

import defpackage.fth.a;

/* renamed from: zwl */
public enum zwl implements fth {
    WEB_VIEW_RECYCLE_ENABLED(a.a(false)),
    ENABLE_CHANNEL_REQUEST_TO_CONTENT_MANAGER(a.a(false)),
    ENABLE_LOAD_ON_SWIPE_START(a.a(false));
    
    private final a<?> delegate;

    private zwl(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.WEBVIEW;
    }
}
