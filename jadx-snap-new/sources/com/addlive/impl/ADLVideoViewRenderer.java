package com.addlive.impl;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.addlive.Constants;
import com.addlive.djinni.DirectRendererCallback;
import com.addlive.djinni.NumberResponder;
import com.addlive.djinni.Service;
import com.addlive.djinni.VideoFrame;
import com.addlive.djinni.VoidResponder;
import com.addlive.impl.VideoTextureRenderer.TextureType;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLSurface;

public class ADLVideoViewRenderer {
    private static final int BACK_BUFFER_HEIGHT = 640;
    private static final int BACK_BUFFER_WIDTH = 360;
    private static final int NEW_TEXTURE_FLAG = 16;
    private final ConcurrentHashMap<String, ViewDesc> mActiveStreams = new ConcurrentHashMap();
    private final Service mAddLive = Service.sharedInstance();
    private boolean mAspectRatioCorrection = true;
    private final Handler mHandler;
    private ByteBuffer mImageBuffer = ByteBuffer.allocateDirect(this.mImageBufferSize);
    private int mImageBufferSize = 921600;
    private final OffscreenRenderContext mRenderContext = new OffscreenRenderContext();
    private final VideoTextureRenderer mRenderer = new VideoTextureRenderer(TextureType.YUV);

    static class TextureSet {
        int height;
        int[] stride;
        int[] textures;
        int width;

        private TextureSet() {
            this.textures = new int[]{-1, -1, -1};
            this.stride = new int[]{-1, -1, -1};
            this.width = -1;
            this.height = -1;
        }

        /* synthetic */ TextureSet(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static class ViewDesc {
        int foregroundTextureSet;
        AtomicInteger readyTextureSet;
        int rendererId;
        EGLSurface surface;
        TextureSet[] textureSets;
        OffscreenRenderContext uploadingContext;
        int uploadingTextureSet;
        TextureView view;

        private ViewDesc() {
            this.rendererId = -1;
            this.textureSets = new TextureSet[]{new TextureSet(), new TextureSet(), new TextureSet()};
            this.foregroundTextureSet = 0;
            this.uploadingTextureSet = 1;
            this.readyTextureSet = new AtomicInteger(2);
        }

        /* synthetic */ ViewDesc(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void finishUploading() {
            this.uploadingTextureSet = this.readyTextureSet.getAndSet(this.uploadingTextureSet | 16) & -17;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean updateForegroundSet() {
            if ((this.readyTextureSet.get() & 16) == 0) {
                return false;
            }
            this.foregroundTextureSet = this.readyTextureSet.getAndSet(this.foregroundTextureSet) & -17;
            return true;
        }
    }

    public ADLVideoViewRenderer() {
        HandlerThread handlerThread = new HandlerThread("RemoteRendererThread");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.mHandler.post(new Runnable() {
            public void run() {
                ADLVideoViewRenderer.this.mRenderContext.initialize();
                ADLVideoViewRenderer.this.mRenderContext.makeCurrent();
                ADLVideoViewRenderer.this.mRenderer.initialize();
            }
        });
    }

    private void renderSinkToBitmapInternal(String str, Bitmap bitmap) {
        ViewDesc viewDesc = (ViewDesc) this.mActiveStreams.get(str);
        String str2 = Constants.LOG_TAG;
        if (viewDesc == null) {
            Log.e(str2, "ADLVideoViewRenderer.renderSinkToBitmap: no sink with name ".concat(String.valueOf(str)));
            return;
        }
        TextureSet textureSet = viewDesc.textureSets[viewDesc.foregroundTextureSet];
        if (viewDesc.rendererId == -1 || textureSet.height < 0) {
            Log.e(str2, "ADLVideoViewRenderer.renderSinkToBitmap: video texture not available".concat(String.valueOf(str)));
            return;
        }
        int byteCount = bitmap.getByteCount();
        if (this.mImageBufferSize < byteCount) {
            this.mImageBufferSize = byteCount;
            this.mImageBuffer = ByteBuffer.allocateDirect(this.mImageBufferSize);
        }
        try {
            this.mRenderContext.setDefaultEglSurfaceSize(bitmap.getRowBytes() / 4, bitmap.getHeight());
            this.mRenderContext.makeCurrent();
            this.mRenderer.bindYuvTextures(textureSet.width, textureSet.height, textureSet.stride, textureSet.textures);
            this.mRenderer.reshape(bitmap.getWidth(), bitmap.getHeight());
            this.mRenderer.drawFlipped();
            this.mRenderContext.readPixels(this.mImageBuffer);
            this.mRenderContext.makeCurrent(null);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder("ADLVideoViewRenderer.renderSinkToBitmap failed: ");
            stringBuilder.append(e.getMessage());
            Log.e(str2, stringBuilder.toString());
        }
        bitmap.copyPixelsFromBuffer(this.mImageBuffer);
    }

    private void renderView(ViewDesc viewDesc) {
        TextureSet textureSet = viewDesc.textureSets[viewDesc.foregroundTextureSet];
        if (!(viewDesc.rendererId == -1 || viewDesc.surface == null || textureSet.height < 0)) {
            try {
                this.mRenderContext.makeCurrent(viewDesc.surface);
                this.mRenderer.bindYuvTextures(textureSet.width, textureSet.height, textureSet.stride, textureSet.textures);
                int[] surfaceSize = this.mRenderContext.getSurfaceSize(viewDesc.surface);
                if (this.mAspectRatioCorrection) {
                    this.mRenderer.reshape(surfaceSize[0], surfaceSize[1], (viewDesc.view.getScaleX() * ((float) viewDesc.view.getWidth())) / (viewDesc.view.getScaleY() * ((float) viewDesc.view.getHeight())));
                } else {
                    this.mRenderer.reshape(surfaceSize[0], surfaceSize[1]);
                }
                this.mRenderer.draw();
                this.mRenderContext.swapBuffers(viewDesc.surface);
                this.mRenderContext.makeCurrent(null);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder("ADLVideoViewRenderer.renderView failed: ");
                stringBuilder.append(e.getMessage());
                Log.e(Constants.LOG_TAG, stringBuilder.toString());
            }
        }
    }

    private ViewDesc startInternal(TextureView textureView, String str) {
        final ViewDesc viewDesc = new ViewDesc();
        viewDesc.view = textureView;
        viewDesc.uploadingContext = new OffscreenRenderContext();
        viewDesc.uploadingContext.initialize(this.mRenderContext);
        this.mRenderContext.makeCurrent();
        for (TextureSet textureSet : viewDesc.textureSets) {
            GLES20.glGenTextures(3, textureSet.textures, 0);
        }
        this.mRenderContext.makeCurrent(null);
        final AnonymousClass7 anonymousClass7 = new Runnable() {
            public void run() {
                if (viewDesc.updateForegroundSet()) {
                    ADLVideoViewRenderer.this.renderView(viewDesc);
                }
            }
        };
        this.mAddLive.startDirectRender(new NumberResponder() {
            public void onCompletion(int i) {
                viewDesc.rendererId = i;
            }

            public void onError(int i, String str) {
                viewDesc.rendererId = -1;
            }
        }, str, new DirectRendererCallback() {
            static final /* synthetic */ boolean $assertionsDisabled = false;
            long mContextThreadId = -1;

            static {
                Class cls = ADLVideoViewRenderer.class;
            }

            public void onFrame(VideoFrame videoFrame) {
                long id = Thread.currentThread().getId();
                if (this.mContextThreadId == -1) {
                    viewDesc.uploadingContext.makeCurrent();
                    this.mContextThreadId = id;
                }
                TextureSet textureSet = viewDesc.textureSets[viewDesc.uploadingTextureSet];
                if (textureSet.height == videoFrame.getHeight() && textureSet.width == videoFrame.getWidth()) {
                    ADLVideoViewRenderer.this.mRenderer.updateYuvTextures(textureSet.height, textureSet.stride, textureSet.textures, videoFrame.getPlane0(), videoFrame.getPlane1(), videoFrame.getPlane2());
                } else {
                    textureSet.stride[0] = videoFrame.getStride0();
                    textureSet.stride[1] = videoFrame.getStride1();
                    textureSet.stride[2] = videoFrame.getStride2();
                    textureSet.height = videoFrame.getHeight();
                    textureSet.width = videoFrame.getWidth();
                    ADLVideoViewRenderer.this.mRenderer.createYuvTextures(textureSet.height, textureSet.stride, textureSet.textures, videoFrame.getPlane0(), videoFrame.getPlane1(), videoFrame.getPlane2());
                }
                GLES20.glFlush();
                viewDesc.finishUploading();
                ADLVideoViewRenderer.this.mHandler.post(anonymousClass7);
            }
        });
        this.mActiveStreams.put(str, viewDesc);
        return viewDesc;
    }

    private void stopInternal(final ViewDesc viewDesc) {
        viewDesc.view.setSurfaceTextureListener(null);
        this.mAddLive.stopRender(new VoidResponder() {
            public void onCompletion() {
                viewDesc.uploadingContext.dispose();
            }

            public void onError(int i, String str) {
                onCompletion();
            }
        }, viewDesc.rendererId);
        viewDesc.rendererId = -1;
        this.mRenderContext.makeCurrent();
        for (TextureSet textureSet : viewDesc.textureSets) {
            textureSet.stride[0] = -1;
            textureSet.stride[1] = -1;
            textureSet.stride[2] = -1;
            textureSet.height = -1;
            textureSet.width = -1;
            GLES20.glDeleteTextures(3, textureSet.textures, 0);
        }
        this.mRenderContext.makeCurrent(null);
        if (viewDesc.surface != null) {
            this.mRenderContext.releaseEglSurface(viewDesc.surface);
        }
    }

    public void dispose() {
        stopAll();
        this.mHandler.post(new Runnable() {
            public void run() {
                ADLVideoViewRenderer.this.mRenderContext.dispose();
            }
        });
    }

    public Rect getVideoSizeForSink(String str) {
        ViewDesc viewDesc = (ViewDesc) this.mActiveStreams.get(str);
        if (viewDesc == null) {
            Log.e(Constants.LOG_TAG, "ADLVideoViewRenderer.getVideoSizeForSink: no sink with name ".concat(String.valueOf(str)));
            return new Rect(0, 0, 0, 0);
        }
        TextureSet textureSet = viewDesc.textureSets[viewDesc.foregroundTextureSet];
        return new Rect(0, 0, textureSet.width, textureSet.height);
    }

    public TextureView getViewBySinkId(String str) {
        ViewDesc viewDesc = (ViewDesc) this.mActiveStreams.get(str);
        return viewDesc == null ? null : viewDesc.view;
    }

    public Bitmap renderSinkToBitmap(final String str, final Bitmap bitmap) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mHandler.postAtFrontOfQueue(new Runnable() {
            public void run() {
                ADLVideoViewRenderer.this.renderSinkToBitmapInternal(str, bitmap);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(Constants.LOG_TAG, "ADLVideoViewRenderer.renderSinkToBitmap: wait interrupted ".concat(String.valueOf(e)));
        }
        return bitmap;
    }

    public void setAspectRatioCorrection(boolean z) {
        this.mAspectRatioCorrection = z;
    }

    public void start(final TextureView textureView, final String str) {
        if (textureView == null) {
            throw new IllegalArgumentException("view is null");
        } else if (str == null) {
            throw new IllegalArgumentException("sink is null");
        } else if (str.isEmpty()) {
            throw new IllegalArgumentException("sink is empty");
        } else {
            this.mHandler.post(new Runnable() {
                public void run() {
                    ViewDesc access$300 = ADLVideoViewRenderer.this.startInternal(textureView, str);
                    textureView.setSurfaceTextureListener(new SurfaceTextureListener() {
                        public void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, int i, int i2) {
                            ADLVideoViewRenderer.this.mHandler.post(new Runnable() {
                                public void run() {
                                    ViewDesc viewDesc = (ViewDesc) ADLVideoViewRenderer.this.mActiveStreams.get(str);
                                    if (viewDesc != null && surfaceTexture == textureView.getSurfaceTexture()) {
                                        if (viewDesc.surface != null) {
                                            ADLVideoViewRenderer.this.mRenderContext.releaseEglSurface(viewDesc.surface);
                                        }
                                        surfaceTexture.setDefaultBufferSize(ADLVideoViewRenderer.BACK_BUFFER_WIDTH, ADLVideoViewRenderer.BACK_BUFFER_HEIGHT);
                                        viewDesc.surface = ADLVideoViewRenderer.this.mRenderContext.createEglSurface(surfaceTexture);
                                        ADLVideoViewRenderer.this.renderView(viewDesc);
                                    }
                                }
                            });
                        }

                        public boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
                            ADLVideoViewRenderer.this.mHandler.post(new Runnable() {
                                public void run() {
                                    ViewDesc viewDesc = (ViewDesc) ADLVideoViewRenderer.this.mActiveStreams.get(str);
                                    if (!(viewDesc == null || viewDesc.surface == null)) {
                                        ADLVideoViewRenderer.this.mRenderContext.releaseEglSurface(viewDesc.surface);
                                        viewDesc.surface = null;
                                    }
                                    surfaceTexture.release();
                                }
                            });
                            return false;
                        }

                        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                            surfaceTexture.setDefaultBufferSize(ADLVideoViewRenderer.BACK_BUFFER_WIDTH, ADLVideoViewRenderer.BACK_BUFFER_HEIGHT);
                        }

                        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }
                    });
                    SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(ADLVideoViewRenderer.BACK_BUFFER_WIDTH, ADLVideoViewRenderer.BACK_BUFFER_HEIGHT);
                        access$300.surface = ADLVideoViewRenderer.this.mRenderContext.createEglSurface(surfaceTexture);
                    }
                }
            });
        }
    }

    public void stop(final String str) {
        if (str != null) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    ViewDesc viewDesc = (ViewDesc) ADLVideoViewRenderer.this.mActiveStreams.get(str);
                    if (viewDesc != null) {
                        ADLVideoViewRenderer.this.stopInternal(viewDesc);
                        ADLVideoViewRenderer.this.mActiveStreams.remove(str);
                    }
                }
            });
        }
    }

    public void stopAll() {
        this.mHandler.post(new Runnable() {
            public void run() {
                for (ViewDesc access$700 : ADLVideoViewRenderer.this.mActiveStreams.values()) {
                    ADLVideoViewRenderer.this.stopInternal(access$700);
                }
                ADLVideoViewRenderer.this.mActiveStreams.clear();
            }
        });
    }
}
