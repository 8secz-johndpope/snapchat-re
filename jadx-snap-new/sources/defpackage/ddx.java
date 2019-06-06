package defpackage;

import defpackage.fth.a;

/* renamed from: ddx */
public enum ddx implements fth {
    WEB_BUILDER_URL(a.a(ddz.PRODUCTION)),
    WEB_BUILDER_OVERRIDES_BITMOJI_APP(a.a(false)),
    EDIT_AVATAR_WEB_BUILDER(a.a(false)),
    EDIT_MIN_WEBVIEW_VERSION(a.a(57)),
    CREATE_AVATAR_BUILDER_TYPE(a.a(ddv.BITMOJI_APP)),
    CREATE_MIN_WEBVIEW_VERSION(a.a(57)),
    CHANGE_OUTFIT_IN_SNAPCHAT(a.a(false)),
    CHANGE_OUTFIT_MIN_WEBVIEW_VERSION(a.a(57)),
    MDP_MROOM_BITMOJI_NON_USER_SCOPE_ENABLED(a.a(true)),
    BITMOJI_EDIT_SOURCE(a.a(aaua.SETTINGS)),
    STREAMING_PROTOCOL(a.a(ddm.a)),
    STREAMING_VIDEO_URL_OVERRIDE(a.a(""));
    
    private final a<?> delegate;

    private ddx(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.BITMOJI;
    }
}
