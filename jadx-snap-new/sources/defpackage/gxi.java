package defpackage;

import defpackage.fth.a;

/* renamed from: gxi */
public enum gxi implements fth {
    VIDEO_CATALOG_ENDPOINT_KEY(a.a("catalogVideoEndpoint")),
    CHANNEL_LIST_URL_KEY(a.a("channelListUrl")),
    EDITION_LIST_URL_KEY(a.a("editionUrl")),
    VALIDATION_URL_KEY(a.a("validationUrl")),
    AD_VIDEO_URL_KEY(a.a("adVideoCatalogUrl"));
    
    private final a<?> delegate;

    private gxi(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.PLAYBACK;
    }
}
