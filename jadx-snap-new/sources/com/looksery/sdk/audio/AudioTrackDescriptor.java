package com.looksery.sdk.audio;

import com.looksery.sdk.audio.AudioTrack.Client;
import com.looksery.sdk.io.ResourceResolver;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.concurrent.atomic.AtomicInteger;

class AudioTrackDescriptor implements Client {
    private static final AtomicInteger NEXT_HANDLE = new AtomicInteger();
    private static final int REPEAT_INFINITELY = -1;
    private AudioTrack mAudioTrack;
    private volatile State mCurState;
    private final ResourceResolver mResourceResolver;
    private final AudioTrackStateCallback mStateCallback;
    private final int mTrackHandle = NEXT_HANDLE.getAndIncrement();
    private final String mTrackUri;

    enum State {
        STOPPED,
        PLAYING,
        PAUSED,
        DEAD
    }

    AudioTrackDescriptor(ResourceResolver resourceResolver, String str, AudioTrack audioTrack, AudioTrackStateCallback audioTrackStateCallback) {
        this.mAudioTrack = audioTrack;
        this.mResourceResolver = resourceResolver;
        this.mTrackUri = str;
        this.mStateCallback = audioTrackStateCallback;
        this.mCurState = State.STOPPED;
        this.mAudioTrack.initialize(this);
    }

    private static float millisToSec(long j) {
        return ((float) j) / 1000.0f;
    }

    private static long secToMillis(float f) {
        return (long) Math.round(f * 1000.0f);
    }

    public synchronized void close() {
        if (this.mCurState != State.DEAD) {
            this.mAudioTrack.release();
            this.mCurState = State.DEAD;
        }
    }

    public synchronized float getDuration() {
        if (this.mCurState == State.DEAD) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        long durationMillis = this.mAudioTrack.getDurationMillis();
        if (durationMillis == -2) {
            AudioSampleInfo extract = new MediaExtractorAudioSampleInfoExtractor(this.mResourceResolver).extract(this.mTrackUri);
            durationMillis = extract != null ? extract.getDurationUs() / 1000 : 0;
        }
        return millisToSec(durationMillis);
    }

    public int getHandle() {
        return this.mTrackHandle;
    }

    public synchronized float getPosition() {
        if (this.mCurState == State.DEAD) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        return millisToSec(this.mAudioTrack.getPositionMillis());
    }

    public Object getSyncLock() {
        return this;
    }

    public boolean isPlaying() {
        return this.mCurState == State.PLAYING;
    }

    public synchronized void notifyPlaybackComplete() {
        if (!(this.mCurState == State.STOPPED || this.mCurState == State.DEAD)) {
            this.mAudioTrack.setPositionMillis(0);
            if (this.mStateCallback != null) {
                this.mStateCallback.onPlaybackComplete(this.mTrackHandle, false);
            }
            this.mCurState = State.STOPPED;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0018 in {5, 7, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public synchronized boolean pause() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.mCurState;	 Catch:{ all -> 0x0015 }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.PLAYING;	 Catch:{ all -> 0x0015 }
        if (r0 != r1) goto L_0x0013;	 Catch:{ all -> 0x0015 }
        r0 = r2.mAudioTrack;	 Catch:{ all -> 0x0015 }
        r0.doPause();	 Catch:{ all -> 0x0015 }
        r0 = com.looksery.sdk.audio.AudioTrackDescriptor.State.PAUSED;	 Catch:{ all -> 0x0015 }
        r2.mCurState = r0;	 Catch:{ all -> 0x0015 }
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x0011;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.AudioTrackDescriptor.pause():boolean");
    }

    /* JADX WARNING: Missing block: B:18:0x002a, code skipped:
            return false;
     */
    public synchronized boolean play(int r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.mCurState;	 Catch:{ all -> 0x002b }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.PLAYING;	 Catch:{ all -> 0x002b }
        r2 = 0;
        if (r0 == r1) goto L_0x0029;
    L_0x0008:
        r0 = r3.mCurState;	 Catch:{ all -> 0x002b }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.DEAD;	 Catch:{ all -> 0x002b }
        if (r0 != r1) goto L_0x000f;
    L_0x000e:
        goto L_0x0029;
    L_0x000f:
        r0 = -1;
        r1 = 1;
        if (r4 != r0) goto L_0x0019;
    L_0x0013:
        r4 = r3.mAudioTrack;	 Catch:{ all -> 0x002b }
        r4.doPlayInfinitely();	 Catch:{ all -> 0x002b }
        goto L_0x0021;
    L_0x0019:
        if (r4 < 0) goto L_0x0027;
    L_0x001b:
        r0 = r3.mAudioTrack;	 Catch:{ all -> 0x002b }
        r4 = r4 + r1;
        r0.doPlay(r4);	 Catch:{ all -> 0x002b }
    L_0x0021:
        r4 = com.looksery.sdk.audio.AudioTrackDescriptor.State.PLAYING;	 Catch:{ all -> 0x002b }
        r3.mCurState = r4;	 Catch:{ all -> 0x002b }
        monitor-exit(r3);
        return r1;
    L_0x0027:
        monitor-exit(r3);
        return r2;
    L_0x0029:
        monitor-exit(r3);
        return r2;
    L_0x002b:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.AudioTrackDescriptor.play(int):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0018 in {5, 7, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public synchronized boolean resume() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.mCurState;	 Catch:{ all -> 0x0015 }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.PAUSED;	 Catch:{ all -> 0x0015 }
        if (r0 != r1) goto L_0x0013;	 Catch:{ all -> 0x0015 }
        r0 = r2.mAudioTrack;	 Catch:{ all -> 0x0015 }
        r0.doResume();	 Catch:{ all -> 0x0015 }
        r0 = com.looksery.sdk.audio.AudioTrackDescriptor.State.PLAYING;	 Catch:{ all -> 0x0015 }
        r2.mCurState = r0;	 Catch:{ all -> 0x0015 }
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x0011;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.AudioTrackDescriptor.resume():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0026 in {8, 10, 12, 13, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public synchronized boolean setPosition(float r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.mCurState;	 Catch:{ all -> 0x0023 }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.DEAD;	 Catch:{ all -> 0x0023 }
        if (r0 == r1) goto L_0x0021;	 Catch:{ all -> 0x0023 }
        r0 = 0;	 Catch:{ all -> 0x0023 }
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ all -> 0x0023 }
        if (r0 < 0) goto L_0x0021;	 Catch:{ all -> 0x0023 }
        r0 = r3.getDuration();	 Catch:{ all -> 0x0023 }
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ all -> 0x0023 }
        if (r0 < 0) goto L_0x0015;	 Catch:{ all -> 0x0023 }
        goto L_0x0021;	 Catch:{ all -> 0x0023 }
        r0 = r3.mAudioTrack;	 Catch:{ all -> 0x0023 }
        r1 = secToMillis(r4);	 Catch:{ all -> 0x0023 }
        r0.setPositionMillis(r1);	 Catch:{ all -> 0x0023 }
        r4 = 1;
        monitor-exit(r3);
        return r4;
        r4 = 0;
        goto L_0x001f;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.AudioTrackDescriptor.setPosition(float):boolean");
    }

    public synchronized void setVolume(float f) {
        if (this.mCurState != State.DEAD) {
            this.mAudioTrack.setVolumeGain(f);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0026, code skipped:
            return false;
     */
    public synchronized boolean stop() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.mCurState;	 Catch:{ all -> 0x0027 }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.STOPPED;	 Catch:{ all -> 0x0027 }
        r2 = 0;
        if (r0 == r1) goto L_0x0025;
    L_0x0008:
        r0 = r3.mCurState;	 Catch:{ all -> 0x0027 }
        r1 = com.looksery.sdk.audio.AudioTrackDescriptor.State.DEAD;	 Catch:{ all -> 0x0027 }
        if (r0 == r1) goto L_0x0025;
    L_0x000e:
        r0 = r3.mAudioTrack;	 Catch:{ all -> 0x0027 }
        r0.doStop();	 Catch:{ all -> 0x0027 }
        r0 = r3.mStateCallback;	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x001e;
    L_0x0017:
        r0 = r3.mStateCallback;	 Catch:{ all -> 0x0027 }
        r1 = r3.mTrackHandle;	 Catch:{ all -> 0x0027 }
        r0.onPlaybackComplete(r1, r2);	 Catch:{ all -> 0x0027 }
    L_0x001e:
        r0 = com.looksery.sdk.audio.AudioTrackDescriptor.State.STOPPED;	 Catch:{ all -> 0x0027 }
        r3.mCurState = r0;	 Catch:{ all -> 0x0027 }
        r0 = 1;
        monitor-exit(r3);
        return r0;
    L_0x0025:
        monitor-exit(r3);
        return r2;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.AudioTrackDescriptor.stop():boolean");
    }
}
