package defpackage;

import defpackage.fth.a;

/* renamed from: jxw */
public enum jxw implements fth {
    MDP_IMAGELOAD_PREDOWNLOAD_ENABLED(a.a(true)),
    IMAGE_LOADING_CUSTOM_DOWNSAMPLER_ENABLED(a.a(false)),
    IMAGELOAD_RECYCLE_BITMAPS_IMMEDIATELY(a.a(false)),
    ENABLE_GLIDE_V4(a.a(false));
    
    private final a<?> delegate;

    private jxw(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.IMAGE_LOADING;
    }
}
