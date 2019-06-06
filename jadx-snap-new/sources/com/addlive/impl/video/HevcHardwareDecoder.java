package com.addlive.impl.video;

import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.DecoderCallback;
import com.addlive.djinni.DecoderConfig;

public class HevcHardwareDecoder extends AndroidVideoDecoder {
    private static final String DECODER_MIME = "video/hevc";
    private static String sDecoderName;
    private boolean mGotCodecConfig = false;

    public HevcHardwareDecoder(DecoderConfig decoderConfig, DecoderCallback decoderCallback, Handler handler) {
        super(decoderConfig, decoderCallback, handler);
    }

    private static String getHevcDecoderName() {
        if (sDecoderName == null) {
            sDecoderName = VERSION.SDK_INT < 21 ? "NO-CODEC" : CodecSupport.findDecoder(DECODER_MIME);
        }
        return sDecoderName;
    }

    public static boolean hardwareDecoderAvailable() {
        return !getHevcDecoderName().equals("NO-CODEC");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x0096 in {15, 18, 20, 25, 30, 34, 37, 40} preds:[]
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
    public synchronized void decodeFrame(com.addlive.djinni.FrameData r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r8.getFrameData();	 Catch:{ all -> 0x0093 }
        r1 = 0;	 Catch:{ all -> 0x0093 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0093 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x0093 }
        r2 = 0;	 Catch:{ all -> 0x0093 }
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;	 Catch:{ all -> 0x0093 }
        r4 = r0.remaining();	 Catch:{ all -> 0x0093 }
        r5 = 1;	 Catch:{ all -> 0x0093 }
        if (r4 <= 0) goto L_0x005f;	 Catch:{ all -> 0x0093 }
        r4 = r0.get();	 Catch:{ all -> 0x0093 }
        r3 = r3 << 8;	 Catch:{ all -> 0x0093 }
        r3 = r3 | r4;	 Catch:{ all -> 0x0093 }
        if (r3 != r5) goto L_0x0010;	 Catch:{ all -> 0x0093 }
        r4 = r0.remaining();	 Catch:{ all -> 0x0093 }
        if (r4 <= 0) goto L_0x0010;	 Catch:{ all -> 0x0093 }
        r4 = r0.get();	 Catch:{ all -> 0x0093 }
        r4 = r4 >> r5;	 Catch:{ all -> 0x0093 }
        r4 = r4 & 63;	 Catch:{ all -> 0x0093 }
        r6 = 32;	 Catch:{ all -> 0x0093 }
        if (r4 == r6) goto L_0x004a;	 Catch:{ all -> 0x0093 }
        r6 = 33;	 Catch:{ all -> 0x0093 }
        if (r4 == r6) goto L_0x004a;	 Catch:{ all -> 0x0093 }
        r6 = 34;	 Catch:{ all -> 0x0093 }
        if (r4 != r6) goto L_0x003a;	 Catch:{ all -> 0x0093 }
        goto L_0x004a;	 Catch:{ all -> 0x0093 }
        r3 = r0.position();	 Catch:{ all -> 0x0093 }
        r4 = r3 + -4;	 Catch:{ all -> 0x0093 }
        r4 = r4 - r5;	 Catch:{ all -> 0x0093 }
        r0.position(r4);	 Catch:{ all -> 0x0093 }
        if (r2 == 0) goto L_0x005f;	 Catch:{ all -> 0x0093 }
        r2.limit(r3);	 Catch:{ all -> 0x0093 }
        goto L_0x005f;	 Catch:{ all -> 0x0093 }
        if (r2 != 0) goto L_0x0010;	 Catch:{ all -> 0x0093 }
        r2 = r0.position();	 Catch:{ all -> 0x0093 }
        r4 = r2 + -4;	 Catch:{ all -> 0x0093 }
        r4 = r4 - r5;	 Catch:{ all -> 0x0093 }
        r0.position(r4);	 Catch:{ all -> 0x0093 }
        r4 = r0.slice();	 Catch:{ all -> 0x0093 }
        r0.position(r2);	 Catch:{ all -> 0x0093 }
        r2 = r4;	 Catch:{ all -> 0x0093 }
        goto L_0x0010;	 Catch:{ all -> 0x0093 }
        r0 = r0.slice();	 Catch:{ all -> 0x0093 }
        if (r2 == 0) goto L_0x0078;	 Catch:{ all -> 0x0093 }
        r3 = r2.remaining();	 Catch:{ all -> 0x0093 }
        if (r3 <= 0) goto L_0x0078;	 Catch:{ all -> 0x0093 }
        r7.flushBufferedFrames();	 Catch:{ all -> 0x0093 }
        r3 = r8.getTimestamp();	 Catch:{ all -> 0x0093 }
        r6 = 2;	 Catch:{ all -> 0x0093 }
        r7.decodeFrameInternal(r2, r3, r6);	 Catch:{ all -> 0x0093 }
        r7.mGotCodecConfig = r5;	 Catch:{ all -> 0x0093 }
        r2 = r7.mGotCodecConfig;	 Catch:{ all -> 0x0093 }
        if (r2 != 0) goto L_0x0083;	 Catch:{ all -> 0x0093 }
        r8 = r7.mDecoderCallback;	 Catch:{ all -> 0x0093 }
        r8.onDecoderError();	 Catch:{ all -> 0x0093 }
        monitor-exit(r7);
        return;
        r2 = r8.getTimestamp();	 Catch:{ all -> 0x0093 }
        r8 = r8.getKeyFrame();	 Catch:{ all -> 0x0093 }
        if (r8 == 0) goto L_0x008e;	 Catch:{ all -> 0x0093 }
        r1 = 1;	 Catch:{ all -> 0x0093 }
        r7.decodeFrameInternal(r0, r2, r1);	 Catch:{ all -> 0x0093 }
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.addlive.impl.video.HevcHardwareDecoder.decodeFrame(com.addlive.djinni.FrameData):void");
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
