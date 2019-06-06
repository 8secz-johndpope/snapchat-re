package com.looksery.sdk.media;

import android.content.Context;
import android.net.Uri;
import com.looksery.sdk.io.ResourceResolver;
import defpackage.bkx;
import defpackage.bkz;
import defpackage.blc;
import defpackage.blv;
import defpackage.bsf.c;
import defpackage.bwq;
import defpackage.bxi;

public class ExoPlayerVideoStreamFactory implements VideoStreamFactory {
    private static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 200;
    private static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 100;
    private static final int DEFAULT_MAX_BUFFER_MS = 5000;
    private static final int DEFAULT_MIN_BUFFER_MS = 1000;
    private static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = true;
    private static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    private final c mMediaSourceFactory;
    private final blv mRenderersFactory;

    public ExoPlayerVideoStreamFactory(Context context, ResourceResolver resourceResolver) {
        this.mRenderersFactory = new bkz(context);
        this.mMediaSourceFactory = new c(new Factory(resourceResolver));
    }

    public VideoStream createVideoStream(String str) {
        return new ExoPlayerVideoStream(blc.a(this.mRenderersFactory, new bwq(), new bkx(new bxi(), 1000, DEFAULT_MAX_BUFFER_MS, 100, 200)), this.mMediaSourceFactory.a(Uri.parse(str)));
    }
}
