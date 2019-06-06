package com.snap.ui.view.emoji;

import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.gfu;
import defpackage.zgb;

public final class SnapEmojiSpanFactory_Factory implements aiqc<SnapEmojiSpanFactory> {
    private final ajwy<gfu> contentResolverProvider;
    private final ajwy<zgb> schedulersProvider;

    public SnapEmojiSpanFactory_Factory(ajwy<zgb> ajwy, ajwy<gfu> ajwy2) {
        this.schedulersProvider = ajwy;
        this.contentResolverProvider = ajwy2;
    }

    public static SnapEmojiSpanFactory_Factory create(ajwy<zgb> ajwy, ajwy<gfu> ajwy2) {
        return new SnapEmojiSpanFactory_Factory(ajwy, ajwy2);
    }

    public static SnapEmojiSpanFactory newSnapEmojiSpanFactory(zgb zgb, gfu gfu) {
        return new SnapEmojiSpanFactory(zgb, gfu);
    }

    public static SnapEmojiSpanFactory provideInstance(ajwy<zgb> ajwy, ajwy<gfu> ajwy2) {
        return new SnapEmojiSpanFactory((zgb) ajwy.get(), (gfu) ajwy2.get());
    }

    public final SnapEmojiSpanFactory get() {
        return provideInstance(this.schedulersProvider, this.contentResolverProvider);
    }
}
