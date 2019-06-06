package com.looksery.sdk.audio;

import com.looksery.sdk.io.ResourceResolver;

final class MediaExtractorAudioSampleInfoExtractor implements AudioSampleInfoExtractor {
    private static final String TAG = "MediaExtractorAudioSampleInfoExtractor";
    private final ResourceResolver mResourceResolver;

    MediaExtractorAudioSampleInfoExtractor(ResourceResolver resourceResolver) {
        this.mResourceResolver = resourceResolver;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d A:{SYNTHETIC, Splitter:B:39:0x008d} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099 A:{SYNTHETIC, Splitter:B:44:0x0099} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a7 A:{SYNTHETIC, Splitter:B:51:0x00a7} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3 A:{SYNTHETIC, Splitter:B:56:0x00b3} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a7 A:{SYNTHETIC, Splitter:B:51:0x00a7} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3 A:{SYNTHETIC, Splitter:B:56:0x00b3} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d A:{SYNTHETIC, Splitter:B:39:0x008d} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099 A:{SYNTHETIC, Splitter:B:44:0x0099} */
    public final com.looksery.sdk.audio.AudioSampleInfo extract(java.lang.String r12) {
        /*
        r11 = this;
        r0 = "close failed: ";
        r1 = "release failed:";
        r2 = 0;
        r3 = r11.mResourceResolver;	 Catch:{ Throwable -> 0x0081, all -> 0x007d }
        r4 = android.net.Uri.parse(r12);	 Catch:{ Throwable -> 0x0081, all -> 0x007d }
        r3 = r3.openResourceFd(r4);	 Catch:{ Throwable -> 0x0081, all -> 0x007d }
        r10 = new android.media.MediaExtractor;	 Catch:{ Throwable -> 0x007a, all -> 0x0077 }
        r10.<init>();	 Catch:{ Throwable -> 0x007a, all -> 0x0077 }
        r5 = r3.getFileDescriptor();	 Catch:{ Throwable -> 0x0075 }
        r6 = r3.getStartOffset();	 Catch:{ Throwable -> 0x0075 }
        r8 = r3.getLength();	 Catch:{ Throwable -> 0x0075 }
        r4 = r10;
        r4.setDataSource(r5, r6, r8);	 Catch:{ Throwable -> 0x0075 }
        r4 = 0;
        r2 = r10.getTrackFormat(r4);	 Catch:{ Throwable -> 0x0075 }
        r10.release();	 Catch:{ Throwable -> 0x002d }
        goto L_0x0033;
    L_0x002d:
        r4 = move-exception;
        r5 = TAG;
        android.util.Log.e(r5, r1, r4);
    L_0x0033:
        if (r3 == 0) goto L_0x003f;
    L_0x0035:
        r3.close();	 Catch:{ IOException -> 0x0039 }
        goto L_0x003f;
    L_0x0039:
        r1 = move-exception;
        r3 = TAG;
        android.util.Log.e(r3, r0, r1);
    L_0x003f:
        r12 = com.looksery.sdk.audio.AudioSampleInfo.create(r12);
        r0 = "channel-count";
        r1 = r2.containsKey(r0);
        if (r1 == 0) goto L_0x0052;
    L_0x004b:
        r0 = r2.getInteger(r0);
        r12.channelCount(r0);
    L_0x0052:
        r0 = "sample-rate";
        r1 = r2.containsKey(r0);
        if (r1 == 0) goto L_0x0061;
    L_0x005a:
        r0 = r2.getInteger(r0);
        r12.sampleRate(r0);
    L_0x0061:
        r0 = "durationUs";
        r1 = r2.containsKey(r0);
        if (r1 == 0) goto L_0x0070;
    L_0x0069:
        r0 = r2.getLong(r0);
        r12.durationUs(r0);
    L_0x0070:
        r12 = r12.build();
        return r12;
    L_0x0075:
        r12 = move-exception;
        goto L_0x0084;
    L_0x0077:
        r12 = move-exception;
        r10 = r2;
        goto L_0x00a5;
    L_0x007a:
        r12 = move-exception;
        r10 = r2;
        goto L_0x0084;
    L_0x007d:
        r12 = move-exception;
        r3 = r2;
        r10 = r3;
        goto L_0x00a5;
    L_0x0081:
        r12 = move-exception;
        r3 = r2;
        r10 = r3;
    L_0x0084:
        r4 = TAG;	 Catch:{ all -> 0x00a4 }
        r5 = "setDataSource failed: ";
        android.util.Log.e(r4, r5, r12);	 Catch:{ all -> 0x00a4 }
        if (r10 == 0) goto L_0x0097;
    L_0x008d:
        r10.release();	 Catch:{ Throwable -> 0x0091 }
        goto L_0x0097;
    L_0x0091:
        r12 = move-exception;
        r4 = TAG;
        android.util.Log.e(r4, r1, r12);
    L_0x0097:
        if (r3 == 0) goto L_0x00a3;
    L_0x0099:
        r3.close();	 Catch:{ IOException -> 0x009d }
        goto L_0x00a3;
    L_0x009d:
        r12 = move-exception;
        r1 = TAG;
        android.util.Log.e(r1, r0, r12);
    L_0x00a3:
        return r2;
    L_0x00a4:
        r12 = move-exception;
    L_0x00a5:
        if (r10 == 0) goto L_0x00b1;
    L_0x00a7:
        r10.release();	 Catch:{ Throwable -> 0x00ab }
        goto L_0x00b1;
    L_0x00ab:
        r2 = move-exception;
        r4 = TAG;
        android.util.Log.e(r4, r1, r2);
    L_0x00b1:
        if (r3 == 0) goto L_0x00bd;
    L_0x00b3:
        r3.close();	 Catch:{ IOException -> 0x00b7 }
        goto L_0x00bd;
    L_0x00b7:
        r1 = move-exception;
        r2 = TAG;
        android.util.Log.e(r2, r0, r1);
    L_0x00bd:
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.MediaExtractorAudioSampleInfoExtractor.extract(java.lang.String):com.looksery.sdk.audio.AudioSampleInfo");
    }
}
