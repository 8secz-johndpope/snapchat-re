package com.looksery.sdk.audio;

import com.looksery.sdk.io.ResourceResolver;

final class DefaultMediaPlayerFactory implements MediaPlayerFactory {
    private static final String TAG = "DefaultMediaPlayerFactory";
    private final ResourceResolver mResourceResolver;

    DefaultMediaPlayerFactory(ResourceResolver resourceResolver) {
        this.mResourceResolver = resourceResolver;
    }

    static DefaultMediaPlayerFactory newInstance(ResourceResolver resourceResolver) {
        return new DefaultMediaPlayerFactory(resourceResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A:{SYNTHETIC, Splitter:B:21:0x005d} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A:{SYNTHETIC, Splitter:B:27:0x0064} */
    public final android.media.MediaPlayer create(java.lang.String r10) {
        /*
        r9 = this;
        r0 = 0;
        r7 = new android.media.MediaPlayer;	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r7.<init>();	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r2 = 21;
        if (r1 < r2) goto L_0x0018;
    L_0x000c:
        r1 = new android.media.AudioAttributes$Builder;	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r1.<init>();	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r1 = r1.build();	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r7.setAudioAttributes(r1);	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
    L_0x0018:
        r1 = r9.mResourceResolver;	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r2 = android.net.Uri.parse(r10);	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r8 = r1.openResourceFd(r2);	 Catch:{ IOException -> 0x0048, IllegalArgumentException -> 0x0046, IOException | IllegalArgumentException | SecurityException -> 0x0044, all -> 0x0041 }
        r2 = r8.getFileDescriptor();	 Catch:{ IOException -> 0x003f, IllegalArgumentException -> 0x003d, IOException | IllegalArgumentException | SecurityException -> 0x003b }
        r3 = r8.getStartOffset();	 Catch:{ IOException -> 0x003f, IllegalArgumentException -> 0x003d, IOException | IllegalArgumentException | SecurityException -> 0x003b }
        r5 = r8.getLength();	 Catch:{ IOException -> 0x003f, IllegalArgumentException -> 0x003d, IOException | IllegalArgumentException | SecurityException -> 0x003b }
        r1 = r7;
        r1.setDataSource(r2, r3, r5);	 Catch:{ IOException -> 0x003f, IllegalArgumentException -> 0x003d, IOException | IllegalArgumentException | SecurityException -> 0x003b }
        r7.prepare();	 Catch:{ IOException -> 0x003f, IllegalArgumentException -> 0x003d, IOException | IllegalArgumentException | SecurityException -> 0x003b }
        if (r8 == 0) goto L_0x003a;
    L_0x0037:
        r8.close();	 Catch:{ IOException -> 0x003a }
    L_0x003a:
        return r7;
    L_0x003b:
        r1 = move-exception;
        goto L_0x004a;
    L_0x003d:
        r1 = move-exception;
        goto L_0x004a;
    L_0x003f:
        r1 = move-exception;
        goto L_0x004a;
    L_0x0041:
        r10 = move-exception;
        r8 = r0;
        goto L_0x0062;
    L_0x0044:
        r1 = move-exception;
        goto L_0x0049;
    L_0x0046:
        r1 = move-exception;
        goto L_0x0049;
    L_0x0048:
        r1 = move-exception;
    L_0x0049:
        r8 = r0;
    L_0x004a:
        r2 = TAG;	 Catch:{ all -> 0x0061 }
        r3 = "Failed to create media player for %s";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0061 }
        r5 = 0;
        r4[r5] = r10;	 Catch:{ all -> 0x0061 }
        r10 = java.lang.String.format(r3, r4);	 Catch:{ all -> 0x0061 }
        android.util.Log.e(r2, r10, r1);	 Catch:{ all -> 0x0061 }
        if (r8 == 0) goto L_0x0060;
    L_0x005d:
        r8.close();	 Catch:{ IOException -> 0x0060 }
    L_0x0060:
        return r0;
    L_0x0061:
        r10 = move-exception;
    L_0x0062:
        if (r8 == 0) goto L_0x0067;
    L_0x0064:
        r8.close();	 Catch:{ IOException -> 0x0067 }
    L_0x0067:
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.audio.DefaultMediaPlayerFactory.create(java.lang.String):android.media.MediaPlayer");
    }
}
