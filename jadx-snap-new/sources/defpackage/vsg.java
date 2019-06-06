package defpackage;

import defpackage.fth.a;

/* renamed from: vsg */
public enum vsg implements fth {
    TWEAK_ENABLE_CREATOR_PROFILE(a.a(false)),
    TWEAK_OVERRIDE_CREATORS_PROFILE_ID_WITH_TEST_ID(a.a(false)),
    LENS_EXPLORER_NATIVE_ENABLED(a.a(false)),
    LENS_STUDIO_SECRET_SHARED_KEY(a.a(""));
    
    private final a<?> delegate;

    private vsg(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.SCAN;
    }
}
