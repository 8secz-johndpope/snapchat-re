package com.looksery.sdk;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FpsLogger {
    private int mFramesDrawn = 0;
    private long mLastDrawTime = 0;
    private Set<OnFpsChanged> mListeners = Collections.newSetFromMap(new ConcurrentHashMap());

    public interface OnFpsChanged {
        void onFpsChanged(double d);
    }

    public void addFpsChangedListener(OnFpsChanged onFpsChanged) {
        if (onFpsChanged != null) {
            this.mListeners.add(onFpsChanged);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0046 in {14, 16, 19} preds:[]
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
    public synchronized void onNewFrame() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.mFramesDrawn;	 Catch:{ all -> 0x0043 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0043 }
        r6.mFramesDrawn = r0;	 Catch:{ all -> 0x0043 }
        r0 = r6.mFramesDrawn;	 Catch:{ all -> 0x0043 }
        r1 = 10;	 Catch:{ all -> 0x0043 }
        if (r0 < r1) goto L_0x0041;	 Catch:{ all -> 0x0043 }
        r0 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0043 }
        r2 = r6.mFramesDrawn;	 Catch:{ all -> 0x0043 }
        r2 = (double) r2;
        r4 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r4;
        r4 = r6.mLastDrawTime;	 Catch:{ all -> 0x0043 }
        r4 = r0 - r4;
        r4 = (double) r4;
        java.lang.Double.isNaN(r4);
        r2 = r2 / r4;
        r6.mLastDrawTime = r0;	 Catch:{ all -> 0x0043 }
        r0 = 0;	 Catch:{ all -> 0x0043 }
        r6.mFramesDrawn = r0;	 Catch:{ all -> 0x0043 }
        r0 = r6.mListeners;	 Catch:{ all -> 0x0043 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0043 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x0041;	 Catch:{ all -> 0x0043 }
        r1 = r0.next();	 Catch:{ all -> 0x0043 }
        r1 = (com.looksery.sdk.FpsLogger.OnFpsChanged) r1;	 Catch:{ all -> 0x0043 }
        r1.onFpsChanged(r2);	 Catch:{ all -> 0x0043 }
        goto L_0x0031;
        monitor-exit(r6);
        return;
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.FpsLogger.onNewFrame():void");
    }

    public void removeFpsChangedListener(OnFpsChanged onFpsChanged) {
        if (onFpsChanged != null) {
            this.mListeners.remove(onFpsChanged);
        }
    }
}
