package com.looksery.sdk.media;

import android.content.Context;
import android.net.Uri;
import com.looksery.sdk.audio.AudioTrack;
import com.looksery.sdk.audio.AudioTrackFactory;
import com.looksery.sdk.io.ResourceResolver;
import defpackage.bkx;
import defpackage.bld;
import defpackage.bls;
import defpackage.bmo;
import defpackage.bqm;
import defpackage.bsf.c;
import defpackage.bwq;
import defpackage.bxi;
import defpackage.byq;

public class ExoPlayerAudioTrackFactory implements AudioTrackFactory {
    private static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 100;
    private static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 50;
    private static final int DEFAULT_MAX_BUFFER_MS = 20000;
    private static final int DEFAULT_MIN_BUFFER_MS = 10000;
    private static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = true;
    private static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    private final Context mContext;
    private final c mMediaSourceFactory;

    private ExoPlayerAudioTrackFactory(Context context, ResourceResolver resourceResolver) {
        this.mContext = context;
        this.mMediaSourceFactory = new c(new Factory(resourceResolver));
    }

    public static AudioTrackFactory newInstance(Context context, ResourceResolver resourceResolver) {
        return new ExoPlayerAudioTrackFactory(context, resourceResolver);
    }

    public AudioTrack newTrack(String str) {
        return new ExoPlayerAudioTrack(this.mMediaSourceFactory.a(Uri.parse(str)), new bmo(this.mContext, bqm.a), new bld(new bls[]{new bmo(this.mContext, bqm.a)}, new bwq(), new bkx(new bxi(), 10000, DEFAULT_MAX_BUFFER_MS, 50, 100), byq.a));
    }
}
