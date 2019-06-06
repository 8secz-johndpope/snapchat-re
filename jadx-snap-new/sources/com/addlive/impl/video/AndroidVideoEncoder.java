package com.addlive.impl.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.addlive.djinni.EncoderCallback;
import com.addlive.djinni.EncoderConfig;
import com.addlive.djinni.ExternalEncoder;
import com.addlive.djinni.FrameData;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(21)
class AndroidVideoEncoder extends ExternalEncoder {
    private static final int BIT_RATE_SCALE = 1000;
    private static final long DEQUEUE_TIMEOUT = 1000000;
    private static final String LOG_TAG = "AddLive_SDK";
    protected int mBitRate;
    private final Handler mCodecHandler;
    protected final EncoderCallback mEncoderCallback;
    private final AtomicReference<EncoderInstance> mEncoderInstance = new AtomicReference();
    protected final String mEncoderMime;
    protected final String mEncoderName;
    protected int mHeight;
    private final VideoFrameReceiverLifecycle mLifecycleListener;
    protected int mWidth;

    enum EncoderInstanceState {
        Active,
        Inactive,
        Released
    }

    class EncoderInstance implements VideoFrameReceiver {
        private final MediaCodec mEncoder;
        private final Surface mEncoderSurface;
        private final FrameRateFilter mFrameRateFilter = new FrameRateFilter(24);
        private final int mOutputHeight;
        private final int mOutputWidth;
        private volatile EncoderInstanceState mState = EncoderInstanceState.Active;

        class MediaCodecCallback extends Callback {
            MediaCodecCallback() {
            }

            public void onError(MediaCodec mediaCodec, CodecException codecException) {
                Log.e("AddLive_SDK", "encoding failure", codecException);
                if (!codecException.isRecoverable()) {
                    AndroidVideoEncoder.this.start();
                }
            }

            public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            }

            public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
                try {
                    if (EncoderInstance.this.mState != EncoderInstanceState.Active) {
                        mediaCodec.releaseOutputBuffer(i, false);
                        return;
                    }
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                    if (outputBuffer != null) {
                        AndroidVideoEncoder.this.deliverEncodedFrame(outputBuffer.slice(), EncoderInstance.this.mOutputWidth, EncoderInstance.this.mOutputHeight, bufferInfo.presentationTimeUs, bufferInfo.flags);
                        mediaCodec.releaseOutputBuffer(i, false);
                    }
                } catch (IllegalStateException e) {
                    Log.e("AddLive_SDK", null == null ? "called getOutputBuffer while encoder is not in executing state" : "called releaseOutputBuffer while encoder is not in executing state", e);
                }
            }

            public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            }
        }

        /* JADX WARNING: Missing block: B:29:0x0089, code skipped:
            r9 = e;
     */
        EncoderInstance(int r9, int r10) {
            /*
            r7 = this;
            com.addlive.impl.video.AndroidVideoEncoder.this = r8;
            r7.<init>();
            r0 = com.addlive.impl.video.AndroidVideoEncoder.EncoderInstanceState.Active;
            r7.mState = r0;
            r0 = new com.addlive.impl.video.FrameRateFilter;
            r1 = 24;
            r0.<init>(r1);
            r7.mFrameRateFilter = r0;
            r7.mOutputWidth = r9;
            r7.mOutputHeight = r10;
            r9 = r8.mEncoderMime;
            r10 = r7.mOutputWidth;
            r0 = r7.mOutputHeight;
            r2 = r8.mBitRate;
            r9 = com.addlive.impl.video.CodecSupport.createEncoderFormat(r9, r10, r0, r1, r2);
            r10 = 23;
            r0 = 0;
            r1 = com.addlive.impl.video.CodecSupport.globalCodecInitializationLock;	 Catch:{ IOException -> 0x0095, IllegalStateException -> 0x0093, IOException | IllegalArgumentException | IllegalStateException -> 0x0091 }
            monitor-enter(r1);	 Catch:{ IOException -> 0x0095, IllegalStateException -> 0x0093, IOException | IllegalArgumentException | IllegalStateException -> 0x0091 }
            r2 = r8.mEncoderMime;	 Catch:{ all -> 0x0084 }
            r2 = android.media.MediaCodec.createEncoderByType(r2);	 Catch:{ all -> 0x0084 }
            r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0081 }
            r4 = 18;
            if (r3 < r4) goto L_0x004c;
        L_0x0034:
            r3 = "AddLive_SDK";
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0081 }
            r5 = "created encoder ";
            r4.<init>(r5);	 Catch:{ all -> 0x0081 }
            r5 = r2.getName();	 Catch:{ all -> 0x0081 }
            r4.append(r5);	 Catch:{ all -> 0x0081 }
            r4 = r4.toString();	 Catch:{ all -> 0x0081 }
        L_0x0048:
            android.util.Log.d(r3, r4);	 Catch:{ all -> 0x0081 }
            goto L_0x005f;
        L_0x004c:
            r3 = "AddLive_SDK";
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0081 }
            r5 = "created encoder ";
            r4.<init>(r5);	 Catch:{ all -> 0x0081 }
            r5 = r8.mEncoderMime;	 Catch:{ all -> 0x0081 }
            r4.append(r5);	 Catch:{ all -> 0x0081 }
            r4 = r4.toString();	 Catch:{ all -> 0x0081 }
            goto L_0x0048;
        L_0x005f:
            r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0081 }
            if (r3 < r10) goto L_0x006f;
        L_0x0063:
            r3 = new com.addlive.impl.video.AndroidVideoEncoder$EncoderInstance$MediaCodecCallback;	 Catch:{ all -> 0x0081 }
            r3.<init>();	 Catch:{ all -> 0x0081 }
            r4 = r8.mCodecHandler;	 Catch:{ all -> 0x0081 }
            r2.setCallback(r3, r4);	 Catch:{ all -> 0x0081 }
        L_0x006f:
            r3 = 1;
            r2.configure(r9, r0, r0, r3);	 Catch:{ all -> 0x0081 }
            r9 = r2.createInputSurface();	 Catch:{ all -> 0x0081 }
            r2.start();	 Catch:{ all -> 0x007c }
            monitor-exit(r1);	 Catch:{ all -> 0x007c }
            goto L_0x00a0;
        L_0x007c:
            r3 = move-exception;
            r6 = r3;
            r3 = r9;
            r9 = r6;
            goto L_0x0087;
        L_0x0081:
            r9 = move-exception;
            r3 = r0;
            goto L_0x0087;
        L_0x0084:
            r9 = move-exception;
            r2 = r0;
            r3 = r2;
        L_0x0087:
            monitor-exit(r1);	 Catch:{ all -> 0x008f }
            throw r9;	 Catch:{ IOException -> 0x008d, IllegalStateException -> 0x008b, IOException | IllegalArgumentException | IllegalStateException -> 0x0089 }
        L_0x0089:
            r9 = move-exception;
            goto L_0x0098;
        L_0x008b:
            r9 = move-exception;
            goto L_0x0098;
        L_0x008d:
            r9 = move-exception;
            goto L_0x0098;
        L_0x008f:
            r9 = move-exception;
            goto L_0x0087;
        L_0x0091:
            r9 = move-exception;
            goto L_0x0096;
        L_0x0093:
            r9 = move-exception;
            goto L_0x0096;
        L_0x0095:
            r9 = move-exception;
        L_0x0096:
            r2 = r0;
            r3 = r2;
        L_0x0098:
            r1 = "AddLive_SDK";
            r4 = "Initialization of media codec failed";
            android.util.Log.e(r1, r4, r9);
            r9 = r3;
        L_0x00a0:
            if (r2 == 0) goto L_0x00c6;
        L_0x00a2:
            if (r9 != 0) goto L_0x00a5;
        L_0x00a4:
            goto L_0x00c6;
        L_0x00a5:
            r7.mEncoder = r2;
            r7.mEncoderSurface = r9;
            r9 = r8.mLifecycleListener;
            r9.onReceiverActivated(r7);
            r9 = android.os.Build.VERSION.SDK_INT;
            if (r9 >= r10) goto L_0x00c5;
        L_0x00b4:
            r9 = r7.mEncoder;
            if (r9 == 0) goto L_0x00c5;
        L_0x00b8:
            r9 = new java.lang.Thread;
            r10 = new com.addlive.impl.video.AndroidVideoEncoder$EncoderInstance$1;
            r10.<init>(r8);
            r9.<init>(r10);
            r9.start();
        L_0x00c5:
            return;
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb;
        L_0x00c8:
            com.addlive.impl.video.CodecSupport.stopAndReleaseCodec(r2);
        L_0x00cb:
            r7.mEncoder = r0;
            r7.mEncoderSurface = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.addlive.impl.video.AndroidVideoEncoder$EncoderInstance.<init>(com.addlive.impl.video.AndroidVideoEncoder, int, int):void");
        }

        private void runEncoderLoop(Callback callback) {
            BufferInfo bufferInfo = new BufferInfo();
            while (this.mState == EncoderInstanceState.Active) {
                try {
                    int dequeueOutputBuffer = this.mEncoder.dequeueOutputBuffer(bufferInfo, AndroidVideoEncoder.DEQUEUE_TIMEOUT);
                    if (dequeueOutputBuffer >= 0) {
                        callback.onOutputBufferAvailable(this.mEncoder, dequeueOutputBuffer, bufferInfo);
                    }
                } catch (CodecException e) {
                    callback.onError(this.mEncoder, e);
                } catch (IllegalStateException e2) {
                    Log.e("AddLive_SDK", "exception from dequeueOutputBuffer()", e2);
                }
            }
        }

        public boolean canAcceptNewFrame(long j, int i, int i2) {
            return this.mState == EncoderInstanceState.Active && this.mFrameRateFilter.canAcceptNewFrame(j);
        }

        /* Access modifiers changed, original: 0000 */
        public void deactivate() {
            if (this.mState == EncoderInstanceState.Active) {
                this.mState = EncoderInstanceState.Inactive;
                if (this.mEncoderSurface != null) {
                    AndroidVideoEncoder.this.mLifecycleListener.onReceiverDeactivated(this);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void forceKeyFrame() {
            if (this.mEncoder != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.mEncoder.setParameters(bundle);
            }
        }

        public Object getInputSurface() {
            return this.mEncoderSurface;
        }

        public void release() {
            if (this.mState != EncoderInstanceState.Inactive) {
                StringBuilder stringBuilder = new StringBuilder("Trying to release encoder instance in state ");
                stringBuilder.append(this.mState);
                Log.w("AddLive_SDK", stringBuilder.toString());
                return;
            }
            this.mState = EncoderInstanceState.Released;
            Surface surface = this.mEncoderSurface;
            if (surface != null) {
                surface.release();
            }
            MediaCodec mediaCodec = this.mEncoder;
            if (mediaCodec != null) {
                CodecSupport.stopAndReleaseCodec(mediaCodec);
            }
        }

        public void reset() {
            AndroidVideoEncoder.this.start();
        }

        /* Access modifiers changed, original: 0000 */
        public void setBitRate(int i) {
            if (this.mEncoder != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i * 1000);
                this.mEncoder.setParameters(bundle);
            }
        }
    }

    AndroidVideoEncoder(String str, EncoderConfig encoderConfig, EncoderCallback encoderCallback, VideoFrameReceiverLifecycle videoFrameReceiverLifecycle, Handler handler) {
        this.mEncoderName = str;
        this.mEncoderMime = encoderConfig.getMimeType();
        this.mBitRate = encoderConfig.getInitialBitrateKbps() * 1000;
        this.mWidth = encoderConfig.getWidth();
        this.mHeight = encoderConfig.getHeight();
        this.mLifecycleListener = videoFrameReceiverLifecycle;
        this.mEncoderCallback = encoderCallback;
        this.mCodecHandler = handler;
    }

    /* Access modifiers changed, original: 0000 */
    public int deliverEncodedFrame(ByteBuffer byteBuffer, int i, int i2, long j, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(byteBuffer);
        int remaining = byteBuffer.remaining();
        this.mEncoderCallback.onFrameEncoded(new FrameData(arrayList, i, i2, j, (i3 & 1) != 0));
        return remaining;
    }

    public void dispose() {
        stop();
    }

    public void forceKeyFrame() {
        EncoderInstance encoderInstance = (EncoderInstance) this.mEncoderInstance.get();
        if (encoderInstance != null) {
            encoderInstance.forceKeyFrame();
        }
    }

    public void reset() {
    }

    public void setBitRate(int i) {
        this.mBitRate = i * 1000;
        EncoderInstance encoderInstance = (EncoderInstance) this.mEncoderInstance.get();
        if (encoderInstance != null) {
            encoderInstance.setBitRate(i);
        }
    }

    public void setResolution(int i, int i2) {
        if (CodecSupport.findEncoder(this.mEncoderMime, i, i2) != "NO-CODEC") {
            this.mWidth = i;
            this.mHeight = i2;
            if (this.mEncoderInstance.get() != null) {
                start();
            }
        }
    }

    public void start() {
        EncoderInstance encoderInstance = (EncoderInstance) this.mEncoderInstance.getAndSet(new EncoderInstance(this.mWidth, this.mHeight));
        if (encoderInstance != null) {
            encoderInstance.deactivate();
        }
    }

    public void stop() {
        EncoderInstance encoderInstance = (EncoderInstance) this.mEncoderInstance.getAndSet(null);
        if (encoderInstance != null) {
            encoderInstance.deactivate();
        }
    }
}
