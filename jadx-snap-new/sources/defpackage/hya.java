package defpackage;

import defpackage.fth.a;

/* renamed from: hya */
public enum hya implements fth {
    PRELOAD_ENABLED;
    
    private final a<?> delegate;

    private hya() {
        this.delegate = r3;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.FEATURE_PRELOADER;
    }
}
