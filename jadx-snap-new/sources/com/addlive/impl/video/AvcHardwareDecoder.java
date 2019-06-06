package com.addlive.impl.video;

import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.DecoderCallback;
import com.addlive.djinni.DecoderConfig;

public class AvcHardwareDecoder extends AndroidVideoDecoder {
    private static final String DECODER_MIME = "video/avc";
    private static final int NAL_TYPE_PPS = 8;
    private static final int NAL_TYPE_SPS = 7;
    private static String sDecoderName;
    private boolean mGotCodecConfig = false;

    public AvcHardwareDecoder(DecoderConfig decoderConfig, DecoderCallback decoderCallback, Handler handler) {
        super(decoderConfig, decoderCallback, handler);
    }

    private static String getAvcDecoderName() {
        if (sDecoderName == null) {
            sDecoderName = VERSION.SDK_INT < 21 ? "NO-CODEC" : CodecSupport.findDecoder(DECODER_MIME);
        }
        return sDecoderName;
    }

    public static boolean hardwareDecoderAvailable() {
        return !getAvcDecoderName().equals("NO-CODEC");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x00a8 in {9, 11, 12, 14, 15, 20, 21, 26, 32, 33, 35, 38} preds:[]
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
    public synchronized void decodeFrame(com.addlive.djinni.FrameData r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.getFrameData();	 Catch:{ all -> 0x00a5 }
        r0 = r0.iterator();	 Catch:{ all -> 0x00a5 }
        r1 = 0;	 Catch:{ all -> 0x00a5 }
        r2 = 0;	 Catch:{ all -> 0x00a5 }
        r4 = r1;	 Catch:{ all -> 0x00a5 }
        r3 = 0;	 Catch:{ all -> 0x00a5 }
        r5 = 0;	 Catch:{ all -> 0x00a5 }
        r6 = r0.hasNext();	 Catch:{ all -> 0x00a5 }
        if (r6 == 0) goto L_0x0049;	 Catch:{ all -> 0x00a5 }
        r6 = r0.next();	 Catch:{ all -> 0x00a5 }
        r6 = (java.nio.ByteBuffer) r6;	 Catch:{ all -> 0x00a5 }
        r7 = 4;	 Catch:{ all -> 0x00a5 }
        r7 = r6.get(r7);	 Catch:{ all -> 0x00a5 }
        r7 = r7 & 31;	 Catch:{ all -> 0x00a5 }
        r8 = 7;	 Catch:{ all -> 0x00a5 }
        if (r7 == r8) goto L_0x0039;	 Catch:{ all -> 0x00a5 }
        r8 = 8;	 Catch:{ all -> 0x00a5 }
        if (r7 != r8) goto L_0x0029;	 Catch:{ all -> 0x00a5 }
        goto L_0x0039;	 Catch:{ all -> 0x00a5 }
        if (r4 != 0) goto L_0x0030;	 Catch:{ all -> 0x00a5 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x00a5 }
        r4.<init>();	 Catch:{ all -> 0x00a5 }
        r4.add(r6);	 Catch:{ all -> 0x00a5 }
        r6 = r6.remaining();	 Catch:{ all -> 0x00a5 }
        r5 = r5 + r6;	 Catch:{ all -> 0x00a5 }
        goto L_0x000e;	 Catch:{ all -> 0x00a5 }
        if (r1 != 0) goto L_0x0040;	 Catch:{ all -> 0x00a5 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00a5 }
        r1.<init>();	 Catch:{ all -> 0x00a5 }
        r1.add(r6);	 Catch:{ all -> 0x00a5 }
        r6 = r6.remaining();	 Catch:{ all -> 0x00a5 }
        r3 = r3 + r6;	 Catch:{ all -> 0x00a5 }
        goto L_0x000e;	 Catch:{ all -> 0x00a5 }
        if (r1 == 0) goto L_0x0074;	 Catch:{ all -> 0x00a5 }
        r0 = java.nio.ByteBuffer.allocateDirect(r3);	 Catch:{ all -> 0x00a5 }
        r1 = r1.iterator();	 Catch:{ all -> 0x00a5 }
        r3 = r1.hasNext();	 Catch:{ all -> 0x00a5 }
        if (r3 == 0) goto L_0x0063;	 Catch:{ all -> 0x00a5 }
        r3 = r1.next();	 Catch:{ all -> 0x00a5 }
        r3 = (java.nio.ByteBuffer) r3;	 Catch:{ all -> 0x00a5 }
        r0.put(r3);	 Catch:{ all -> 0x00a5 }
        goto L_0x0053;	 Catch:{ all -> 0x00a5 }
        r0.rewind();	 Catch:{ all -> 0x00a5 }
        r9.flushBufferedFrames();	 Catch:{ all -> 0x00a5 }
        r6 = r10.getTimestamp();	 Catch:{ all -> 0x00a5 }
        r1 = 2;	 Catch:{ all -> 0x00a5 }
        r9.decodeFrameInternal(r0, r6, r1);	 Catch:{ all -> 0x00a5 }
        r0 = 1;	 Catch:{ all -> 0x00a5 }
        r9.mGotCodecConfig = r0;	 Catch:{ all -> 0x00a5 }
        r0 = r9.mGotCodecConfig;	 Catch:{ all -> 0x00a5 }
        if (r0 != 0) goto L_0x007f;	 Catch:{ all -> 0x00a5 }
        r10 = r9.mDecoderCallback;	 Catch:{ all -> 0x00a5 }
        r10.onDecoderError();	 Catch:{ all -> 0x00a5 }
        monitor-exit(r9);
        return;
        if (r4 == 0) goto L_0x00a3;
        r0 = java.nio.ByteBuffer.allocateDirect(r5);	 Catch:{ all -> 0x00a5 }
        r1 = r4.iterator();	 Catch:{ all -> 0x00a5 }
        r3 = r1.hasNext();	 Catch:{ all -> 0x00a5 }
        if (r3 == 0) goto L_0x0099;	 Catch:{ all -> 0x00a5 }
        r3 = r1.next();	 Catch:{ all -> 0x00a5 }
        r3 = (java.nio.ByteBuffer) r3;	 Catch:{ all -> 0x00a5 }
        r0.put(r3);	 Catch:{ all -> 0x00a5 }
        goto L_0x0089;	 Catch:{ all -> 0x00a5 }
        r0.rewind();	 Catch:{ all -> 0x00a5 }
        r3 = r10.getTimestamp();	 Catch:{ all -> 0x00a5 }
        r9.decodeFrameInternal(r0, r3, r2);	 Catch:{ all -> 0x00a5 }
        monitor-exit(r9);
        return;
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.addlive.impl.video.AvcHardwareDecoder.decodeFrame(com.addlive.djinni.FrameData):void");
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
