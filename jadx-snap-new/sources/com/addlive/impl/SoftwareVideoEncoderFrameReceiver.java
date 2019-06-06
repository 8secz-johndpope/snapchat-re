package com.addlive.impl;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.addlive.Constants;
import com.addlive.djinni.CameraImage;
import com.addlive.djinni.PixelFormat;
import com.addlive.djinni.Service;
import com.addlive.impl.VideoTextureRenderer.TextureType;
import com.addlive.impl.video.AndroidVideoService;
import com.addlive.impl.video.FrameRateFilter;
import com.addlive.impl.video.VideoFrameReceiver;
import com.addlive.impl.video.VideoFrameReceiverLifecycle;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public class SoftwareVideoEncoderFrameReceiver {
    private static final ByteBuffer nullBuffer = ByteBuffer.allocate(0);
    private final int INPUT_TEX_HEIGHT = 1280;
    private final int INPUT_TEX_WIDTH = 720;
    private final int OUTPUT_TEX_HEIGHT = 640;
    private final int OUTPUT_TEX_WIDTH = 360;
    private final Object mEglLock = AndroidVideoService.getSharedEglLock();
    private final VideoFrameReceiverLifecycle mFrameReceiverLifecycle;
    private final AtomicReference<InputSurfaceWrapper> mInputSurface = new AtomicReference();
    private final Service mService = Service.sharedInstance();

    enum FrameReceiverState {
        Active,
        Inactive,
        Released
    }

    class InputSurfaceWrapper implements OnFrameAvailableListener, VideoFrameReceiver {
        private static final int BYTES_PER_RGB_PIXEL = 4;
        private static final int SOFTWARE_ENCODER_FRAME_RATE = 15;
        private OffscreenRenderContext mContext;
        private final FrameRateFilter mFrameRateFilter = new FrameRateFilter(15);
        private Handler mHandler;
        private HandlerThread mHandlerThread;
        private SurfaceTexture mInputSurfaceTexture = null;
        private final int mInputTextureHeight;
        private int mInputTextureId = 0;
        private final int mInputTextureWidth;
        private ByteBuffer mReadBackBuffer = null;
        private VideoTextureRenderer mRenderer;
        private volatile FrameReceiverState mState = FrameReceiverState.Released;

        InputSurfaceWrapper(int i, int i2) {
            this.mInputTextureWidth = i;
            this.mInputTextureHeight = i2;
            this.mReadBackBuffer = ByteBuffer.allocateDirect(921600);
            this.mContext = new OffscreenRenderContext(360, 640);
            this.mRenderer = new VideoTextureRenderer(TextureType.External);
            this.mHandlerThread = new HandlerThread("SoftwareVideoEncoderFrameReceiver");
            this.mHandlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper());
            this.mHandler.post(new Runnable(SoftwareVideoEncoderFrameReceiver.this) {
                public void run() {
                    try {
                        InputSurfaceWrapper.this.mContext.initialize();
                        InputSurfaceWrapper.this.mContext.makeCurrent();
                        InputSurfaceWrapper inputSurfaceWrapper = InputSurfaceWrapper.this;
                        inputSurfaceWrapper.mInputTextureId = inputSurfaceWrapper.mContext.generateTextureId();
                        inputSurfaceWrapper = InputSurfaceWrapper.this;
                        inputSurfaceWrapper.mInputSurfaceTexture = new SurfaceTexture(inputSurfaceWrapper.mInputTextureId);
                        InputSurfaceWrapper.this.mInputSurfaceTexture.setDefaultBufferSize(InputSurfaceWrapper.this.mInputTextureWidth, InputSurfaceWrapper.this.mInputTextureHeight);
                        InputSurfaceWrapper.this.mRenderer.initialize();
                        InputSurfaceWrapper.this.mRenderer.setVideoTextureAspectRatio(((float) InputSurfaceWrapper.this.mInputTextureWidth) / ((float) InputSurfaceWrapper.this.mInputTextureHeight));
                        InputSurfaceWrapper.this.mRenderer.reshape(360, 640);
                        InputSurfaceWrapper.this.mInputSurfaceTexture.setOnFrameAvailableListener(InputSurfaceWrapper.this);
                        InputSurfaceWrapper.this.mState = FrameReceiverState.Active;
                        SoftwareVideoEncoderFrameReceiver.this.mFrameReceiverLifecycle.onReceiverActivated(InputSurfaceWrapper.this);
                    } catch (RuntimeException e) {
                        StringBuilder stringBuilder = new StringBuilder("Failed creating offscreen render context: ");
                        stringBuilder.append(e.getMessage());
                        Log.e(Constants.LOG_TAG, stringBuilder.toString());
                    }
                }
            });
        }

        public boolean canAcceptNewFrame(long j, int i, int i2) {
            if (this.mState != FrameReceiverState.Active || !this.mFrameRateFilter.canAcceptNewFrame(j)) {
                return false;
            }
            if (this.mInputTextureWidth == i && this.mInputTextureHeight == i2) {
                return true;
            }
            SoftwareVideoEncoderFrameReceiver.this.recreateImageReader(i, i2);
            return false;
        }

        public void dispose() {
            this.mHandler.post(new Runnable() {
                public void run() {
                    if (InputSurfaceWrapper.this.mState == FrameReceiverState.Active) {
                        InputSurfaceWrapper.this.mState = FrameReceiverState.Inactive;
                        SoftwareVideoEncoderFrameReceiver.this.mFrameReceiverLifecycle.onReceiverDeactivated(InputSurfaceWrapper.this);
                    }
                }
            });
        }

        public Object getInputSurface() {
            return this.mInputSurfaceTexture;
        }

        public void onFrameAvailable(final SurfaceTexture surfaceTexture) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    if (InputSurfaceWrapper.this.mState == FrameReceiverState.Active) {
                        surfaceTexture.updateTexImage();
                        long timestamp = surfaceTexture.getTimestamp();
                        if (VERSION.SDK_INT < 18) {
                            timestamp = System.currentTimeMillis() * 1000000;
                        }
                        InputSurfaceWrapper.this.mRenderer.drawFlipped();
                        InputSurfaceWrapper.this.mContext.readPixels(InputSurfaceWrapper.this.mReadBackBuffer);
                        SoftwareVideoEncoderFrameReceiver.this.mService.injectImageFrame(new CameraImage(InputSurfaceWrapper.this.mReadBackBuffer, SoftwareVideoEncoderFrameReceiver.nullBuffer, SoftwareVideoEncoderFrameReceiver.nullBuffer, 1440, 0, 0, 360, 640, PixelFormat.ABGR32.ordinal(), 0, 0, timestamp / 1000000));
                    }
                }
            });
        }

        public void release() {
            if (this.mState == FrameReceiverState.Inactive) {
                this.mState = FrameReceiverState.Released;
                this.mHandler.post(new Runnable() {
                    public void run() {
                        InputSurfaceWrapper.this.mInputSurfaceTexture.release();
                        InputSurfaceWrapper.this.mContext.deleteTextureId(InputSurfaceWrapper.this.mInputTextureId);
                        InputSurfaceWrapper.this.mContext.dispose();
                    }
                });
            }
        }

        public void reset() {
        }
    }

    public SoftwareVideoEncoderFrameReceiver(VideoFrameReceiverLifecycle videoFrameReceiverLifecycle) {
        this.mFrameReceiverLifecycle = videoFrameReceiverLifecycle;
        this.mInputSurface.set(new InputSurfaceWrapper(720, 1280));
    }

    private void recreateImageReader(int i, int i2) {
        InputSurfaceWrapper inputSurfaceWrapper = (InputSurfaceWrapper) this.mInputSurface.getAndSet(new InputSurfaceWrapper(i, i2));
        if (inputSurfaceWrapper != null) {
            inputSurfaceWrapper.dispose();
        }
    }

    public final void dispose() {
        InputSurfaceWrapper inputSurfaceWrapper = (InputSurfaceWrapper) this.mInputSurface.getAndSet(null);
        if (inputSurfaceWrapper != null) {
            inputSurfaceWrapper.dispose();
        }
    }
}
