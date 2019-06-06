package com.google.android.gms.internal;

import android.content.Context;
import android.media.AudioManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

@zzabh
public final class zzaja {
    private float zzcsn = 1.0f;
    private boolean zzcst = false;

    public static float zzav(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        return streamMaxVolume == 0 ? MapboxConstants.MINIMUM_ZOOM : ((float) audioManager.getStreamVolume(3)) / ((float) streamMaxVolume);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0010 in {5, 7, 8, 11} preds:[]
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
    private final synchronized boolean zzrm() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.zzcsn;	 Catch:{ all -> 0x000d }
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x000b;
        r0 = 1;
        monitor-exit(r2);
        return r0;
        r0 = 0;
        goto L_0x0009;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaja.zzrm():boolean");
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzcst = z;
    }

    public final synchronized void setAppVolume(float f) {
        this.zzcsn = f;
    }

    public final synchronized float zzdp() {
        if (!zzrm()) {
            return 1.0f;
        }
        return this.zzcsn;
    }

    public final synchronized boolean zzdq() {
        return this.zzcst;
    }
}
