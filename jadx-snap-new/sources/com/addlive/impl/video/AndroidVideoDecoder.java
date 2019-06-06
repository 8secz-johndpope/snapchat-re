package com.addlive.impl.video;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.media.Image;
import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import com.addlive.djinni.DecodedImage;
import com.addlive.djinni.DecoderCallback;
import com.addlive.djinni.DecoderConfig;
import com.addlive.djinni.ExternalDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

@TargetApi(21)
class AndroidVideoDecoder extends ExternalDecoder {
    private static final String LOG_TAG = "AddLive_SDK";
    private static final int MAX_BUFFERED_FRAMES = 6;
    private static final int MAX_FRAME_HEIGHT = 1280;
    private static final int MAX_FRAME_WIDTH = 720;
    private static final int PLANES_PER_FRAME = 3;
    private final ArrayDeque<Integer> mAvailableBufferIds = new ArrayDeque();
    private final ArrayDeque<BufferedVideoFrame> mBufferedInputFrames = new ArrayDeque();
    private MediaCodec mCodec;
    protected Handler mCodecHandler;
    protected DecoderCallback mDecoderCallback;
    protected final String mDecoderMime;

    class BufferedVideoFrame {
        final ByteBuffer buffer;
        final int flags;
        final long timestamp;

        BufferedVideoFrame(ByteBuffer byteBuffer, long j, int i) {
            this.buffer = byteBuffer;
            this.timestamp = j;
            this.flags = i;
        }
    }

    class MediaCodecCallback extends Callback {
        private MediaCodecCallback() {
        }

        public void onError(MediaCodec mediaCodec, CodecException codecException) {
            AndroidVideoDecoder.this.handleException(codecException);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0054 in {13, 16, 18, 21} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public void onInputBufferAvailable(android.media.MediaCodec r5, int r6) {
            /*
            r4 = this;
            r0 = com.addlive.impl.video.AndroidVideoDecoder.this;
            monitor-enter(r0);
            r1 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ all -> 0x0051 }
            r1 = r1.mCodec;	 Catch:{ all -> 0x0051 }
            if (r1 != r5) goto L_0x004f;	 Catch:{ all -> 0x0051 }
            r5 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ all -> 0x0051 }
            r5 = r5.mAvailableBufferIds;	 Catch:{ all -> 0x0051 }
            r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0051 }
            r5.add(r6);	 Catch:{ all -> 0x0051 }
            r5 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ all -> 0x0051 }
            r5 = r5.mBufferedInputFrames;	 Catch:{ all -> 0x0051 }
            r5 = r5.isEmpty();	 Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x004f;	 Catch:{ all -> 0x0051 }
            r5 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ all -> 0x0051 }
            r5 = r5.mAvailableBufferIds;	 Catch:{ all -> 0x0051 }
            r5 = r5.isEmpty();	 Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x004f;	 Catch:{ all -> 0x0051 }
            r5 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ all -> 0x0051 }
            r5 = r5.mBufferedInputFrames;	 Catch:{ all -> 0x0051 }
            r5 = r5.remove();	 Catch:{ all -> 0x0051 }
            r5 = (com.addlive.impl.video.AndroidVideoDecoder.BufferedVideoFrame) r5;	 Catch:{ all -> 0x0051 }
            r6 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ IllegalStateException -> 0x0048 }
            r1 = r5.buffer;	 Catch:{ IllegalStateException -> 0x0048 }
            r2 = r5.timestamp;	 Catch:{ IllegalStateException -> 0x0048 }
            r5 = r5.flags;	 Catch:{ IllegalStateException -> 0x0048 }
            r6.queueInputFrame(r1, r2, r5);	 Catch:{ IllegalStateException -> 0x0048 }
            goto L_0x0018;
            r5 = move-exception;
            r6 = com.addlive.impl.video.AndroidVideoDecoder.this;	 Catch:{ all -> 0x0051 }
            r6.handleException(r5);	 Catch:{ all -> 0x0051 }
            goto L_0x0018;	 Catch:{ all -> 0x0051 }
            monitor-exit(r0);	 Catch:{ all -> 0x0051 }
            return;	 Catch:{ all -> 0x0051 }
            r5 = move-exception;	 Catch:{ all -> 0x0051 }
            monitor-exit(r0);	 Catch:{ all -> 0x0051 }
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.addlive.impl.video.AndroidVideoDecoder$MediaCodecCallback.onInputBufferAvailable(android.media.MediaCodec, int):void");
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
            Exception e;
            Throwable th;
            MediaCodecCallback mediaCodecCallback = this;
            synchronized (AndroidVideoDecoder.this) {
                try {
                    Image outputImage = mediaCodec.getOutputImage(i);
                    if (outputImage != null) {
                        Plane[] planes = outputImage.getPlanes();
                        if (planes.length >= 3) {
                            try {
                                Rect cropRect = outputImage.getCropRect();
                                DecoderCallback decoderCallback = AndroidVideoDecoder.this.mDecoderCallback;
                                ByteBuffer buffer = planes[0].getBuffer();
                                ByteBuffer buffer2 = planes[1].getBuffer();
                                ByteBuffer buffer3 = planes[2].getBuffer();
                                int pixelStride = planes[0].getPixelStride();
                                int pixelStride2 = planes[1].getPixelStride();
                                int pixelStride3 = planes[2].getPixelStride();
                                int rowStride = planes[0].getRowStride();
                                int rowStride2 = planes[1].getRowStride();
                                int rowStride3 = planes[2].getRowStride();
                                int i2 = rowStride3;
                                DecodedImage decodedImage = r6;
                                DecodedImage decodedImage2 = new DecodedImage(buffer, buffer2, buffer3, pixelStride, pixelStride2, pixelStride3, rowStride, rowStride2, i2, cropRect.width(), cropRect.height(), bufferInfo.presentationTimeUs);
                                decoderCallback.onFrameDecoded(decodedImage);
                            } catch (IllegalStateException e2) {
                                e = e2;
                                mediaCodecCallback = this;
                                try {
                                    AndroidVideoDecoder.this.handleException(e);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                        Log.e("AddLive_SDK", "Decoder produced unknown image format");
                        mediaCodecCallback = this;
                        AndroidVideoDecoder.this.mDecoderCallback.onDecoderError();
                    }
                    mediaCodec.releaseOutputBuffer(i, false);
                } catch (IllegalStateException e3) {
                    e = e3;
                    AndroidVideoDecoder.this.handleException(e);
                }
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        }
    }

    class MediaCodecCallbackShim extends Callback {
        private final MediaCodecCallback mCallback;

        private MediaCodecCallbackShim() {
            this.mCallback = new MediaCodecCallback();
        }

        public void onError(MediaCodec mediaCodec, CodecException codecException) {
            this.mCallback.onError(mediaCodec, codecException);
        }

        public void onInputBufferAvailable(final MediaCodec mediaCodec, final int i) {
            AndroidVideoDecoder.this.mCodecHandler.post(new Runnable() {
                public void run() {
                    MediaCodecCallbackShim.this.mCallback.onInputBufferAvailable(mediaCodec, i);
                }
            });
        }

        public void onOutputBufferAvailable(final MediaCodec mediaCodec, final int i, final BufferInfo bufferInfo) {
            AndroidVideoDecoder.this.mCodecHandler.post(new Runnable() {
                public void run() {
                    MediaCodecCallbackShim.this.mCallback.onOutputBufferAvailable(mediaCodec, i, bufferInfo);
                }
            });
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        }
    }

    class DummyDecoderCallback extends DecoderCallback {
        private DummyDecoderCallback() {
        }

        public void onDecoderError() {
        }

        public void onFrameDecoded(DecodedImage decodedImage) {
        }
    }

    AndroidVideoDecoder(DecoderConfig decoderConfig, DecoderCallback decoderCallback, Handler handler) {
        this.mDecoderMime = decoderConfig.getMimeType();
        this.mDecoderCallback = decoderCallback;
        this.mCodecHandler = handler;
    }

    private void bufferInputFrame(ByteBuffer byteBuffer, long j, int i) {
        String str = "AddLive_SDK";
        if (this.mBufferedInputFrames.size() < 6) {
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            allocate.put(byteBuffer).rewind();
            this.mBufferedInputFrames.add(new BufferedVideoFrame(allocate, j, i));
            StringBuilder stringBuilder = new StringBuilder("Running out of decoder input buffers, input frame is buffered, buffer queue depth: ");
            stringBuilder.append(this.mBufferedInputFrames.size());
            Log.d(str, stringBuilder.toString());
            return;
        }
        Log.d(str, "buffer queue is full, flush all buffered frames");
        flushBufferedFrames();
        this.mDecoderCallback.onDecoderError();
    }

    private void handleException(Exception exception) {
        Log.e("AddLive_SDK", "Got an exception in hardware decoder", exception);
        this.mDecoderCallback.onDecoderError();
    }

    private void queueInputFrame(ByteBuffer byteBuffer, long j, int i) {
        int intValue = ((Integer) this.mAvailableBufferIds.remove()).intValue();
        ByteBuffer inputBuffer = this.mCodec.getInputBuffer(intValue);
        int remaining = byteBuffer.remaining();
        if (inputBuffer == null || inputBuffer.remaining() < remaining) {
            this.mAvailableBufferIds.add(Integer.valueOf(intValue));
            throw new RuntimeException("not enough space in the input buffer");
        }
        inputBuffer.put(byteBuffer);
        this.mCodec.queueInputBuffer(intValue, 0, remaining, j, i);
    }

    private void startDecoder() {
        if (VERSION.SDK_INT >= 23) {
            this.mCodec.setCallback(new MediaCodecCallback(), this.mCodecHandler);
        } else {
            this.mCodec.setCallback(new MediaCodecCallbackShim());
        }
        MediaFormat createDecoderFormat = CodecSupport.createDecoderFormat(this.mDecoderMime);
        createDecoderFormat.setInteger("max-width", MAX_FRAME_WIDTH);
        createDecoderFormat.setInteger("max-height", MAX_FRAME_HEIGHT);
        this.mCodec.configure(createDecoderFormat, null, null, 0);
        this.mCodec.start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0053 in {5, 10, 13, 14, 16, 19} preds:[]
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
    public synchronized void decodeFrame(com.addlive.djinni.FrameData r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r5.getFrameData();	 Catch:{ all -> 0x0050 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0050 }
        r1 = 0;	 Catch:{ all -> 0x0050 }
        r2 = 0;	 Catch:{ all -> 0x0050 }
        r3 = r0.hasNext();	 Catch:{ all -> 0x0050 }
        if (r3 == 0) goto L_0x001d;	 Catch:{ all -> 0x0050 }
        r3 = r0.next();	 Catch:{ all -> 0x0050 }
        r3 = (java.nio.ByteBuffer) r3;	 Catch:{ all -> 0x0050 }
        r3 = r3.remaining();	 Catch:{ all -> 0x0050 }
        r2 = r2 + r3;	 Catch:{ all -> 0x0050 }
        goto L_0x000b;	 Catch:{ all -> 0x0050 }
        if (r2 <= 0) goto L_0x004e;	 Catch:{ all -> 0x0050 }
        r0 = java.nio.ByteBuffer.allocateDirect(r2);	 Catch:{ all -> 0x0050 }
        r2 = r5.getFrameData();	 Catch:{ all -> 0x0050 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0050 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0050 }
        if (r3 == 0) goto L_0x003b;	 Catch:{ all -> 0x0050 }
        r3 = r2.next();	 Catch:{ all -> 0x0050 }
        r3 = (java.nio.ByteBuffer) r3;	 Catch:{ all -> 0x0050 }
        r0.put(r3);	 Catch:{ all -> 0x0050 }
        goto L_0x002b;	 Catch:{ all -> 0x0050 }
        r0.rewind();	 Catch:{ all -> 0x0050 }
        r2 = r5.getKeyFrame();	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x0047;	 Catch:{ all -> 0x0050 }
        r4.flushBufferedFrames();	 Catch:{ all -> 0x0050 }
        r2 = r5.getTimestamp();	 Catch:{ all -> 0x0050 }
        r4.decodeFrameInternal(r0, r2, r1);	 Catch:{ all -> 0x0050 }
        monitor-exit(r4);
        return;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.addlive.impl.video.AndroidVideoDecoder.decodeFrame(com.addlive.djinni.FrameData):void");
    }

    /* Access modifiers changed, original: 0000 */
    public void decodeFrameInternal(ByteBuffer byteBuffer, long j, int i) {
        try {
            if (this.mCodec == null) {
                synchronized (CodecSupport.globalCodecInitializationLock) {
                    this.mCodec = MediaCodec.createDecoderByType(this.mDecoderMime);
                    StringBuilder stringBuilder = new StringBuilder("created decoder ");
                    stringBuilder.append(this.mCodec.getName());
                    Log.d("AddLive_SDK", stringBuilder.toString());
                    startDecoder();
                }
            }
            if (!this.mBufferedInputFrames.isEmpty() || this.mAvailableBufferIds.isEmpty()) {
                bufferInputFrame(byteBuffer, j, i);
            } else {
                queueInputFrame(byteBuffer, j, i);
            }
        } catch (IOException e) {
            handleException(e);
        } catch (IllegalStateException e2) {
            handleException(e2);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void flushBufferedFrames() {
        this.mBufferedInputFrames.clear();
    }

    public synchronized void stop() {
        this.mDecoderCallback = new DummyDecoderCallback();
        if (this.mCodec != null) {
            CodecSupport.stopAndReleaseCodec(this.mCodec);
            this.mCodec = null;
        }
    }
}
