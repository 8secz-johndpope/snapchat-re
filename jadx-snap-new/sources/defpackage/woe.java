package defpackage;

import defpackage.fth.a;

/* renamed from: woe */
public enum woe implements fth {
    SETTINGS_V2;
    
    private final a<?> delegate;

    private woe() {
        this.delegate = r3;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SETTINGS_CORE;
    }
}
