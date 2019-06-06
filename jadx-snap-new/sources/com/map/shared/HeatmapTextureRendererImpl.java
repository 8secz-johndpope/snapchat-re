package com.map.shared;

import android.support.annotation.Keep;
import java.nio.ByteBuffer;

@Keep
public class HeatmapTextureRendererImpl {
    private static boolean sHeatMapDisabled;
    private static boolean sLoadedSnapMapLibrary;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x000f in {5, 7, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static synchronized boolean isHeatmapSupported() {
        /*
        r0 = com.map.shared.HeatmapTextureRendererImpl.class;
        monitor-enter(r0);
        r1 = sHeatMapDisabled;	 Catch:{ all -> 0x000c }
        if (r1 != 0) goto L_0x000a;
        r1 = 1;
        monitor-exit(r0);
        return r1;
        r1 = 0;
        goto L_0x0008;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.map.shared.HeatmapTextureRendererImpl.isHeatmapSupported():boolean");
    }

    public static boolean isSnapMapLibraryLoaded() {
        return sLoadedSnapMapLibrary;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000e */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    public static synchronized void preloadLibraries() {
        /*
        r0 = com.map.shared.HeatmapTextureRendererImpl.class;
        monitor-enter(r0);
        r1 = sLoadedSnapMapLibrary;	 Catch:{ all -> 0x0014 }
        if (r1 != 0) goto L_0x0012;
    L_0x0007:
        r1 = 1;
        r2 = "snapmap";
        java.lang.System.loadLibrary(r2);	 Catch:{ UnsatisfiedLinkError -> 0x000e }
        goto L_0x0010;
    L_0x000e:
        sHeatMapDisabled = r1;	 Catch:{ all -> 0x0014 }
    L_0x0010:
        sLoadedSnapMapLibrary = r1;	 Catch:{ all -> 0x0014 }
    L_0x0012:
        monitor-exit(r0);
        return;
    L_0x0014:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.map.shared.HeatmapTextureRendererImpl.preloadLibraries():void");
    }

    public static native boolean renderHeatToTexture(double d, double d2, double d3, ByteBuffer[] byteBufferArr, int i, ByteBuffer[] byteBufferArr2, int i2, int i3, boolean z, float f, float f2, float f3, double d4, boolean z2, boolean z3);
}
