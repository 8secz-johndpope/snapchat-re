package com.addlive.impl;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.addlive.impl.VideoTextureRenderer.TextureType;
import com.addlive.impl.video.VideoFrameReceiver;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.microedition.khronos.egl.EGLSurface;

public class CameraRenderer implements OnFrameAvailableListener {
    private final int DEFAULT_ROTATION = 270;
    private final ArrayList<TextureView> mAttachedViews = new ArrayList();
    private Camera mCamera;
    private final Handler mHandler;
    private int mHeight;
    private final HashMap<Object, EGLSurface> mRegisteredSurfaces = new HashMap();
    private final OffscreenRenderContext mRenderContext = new OffscreenRenderContext();
    private SurfaceTexture mSurfaceTexture;
    private int mTexId;
    private float[] mTransformMatrix = new float[16];
    private VideoTextureRenderer mVideoTextureRenderer;
    private int mWidth;

    public CameraRenderer() {
        HandlerThread handlerThread = new HandlerThread("CameraRendererThread");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
        this.mHandler.post(new Runnable() {
            public void run() {
                CameraRenderer.this.mRenderContext.initialize();
                CameraRenderer.this.mRenderContext.makeCurrent();
                CameraRenderer cameraRenderer = CameraRenderer.this;
                cameraRenderer.mTexId = cameraRenderer.mRenderContext.generateTextureId();
                cameraRenderer = CameraRenderer.this;
                cameraRenderer.mSurfaceTexture = new SurfaceTexture(cameraRenderer.mTexId);
                CameraRenderer.this.mVideoTextureRenderer = new VideoTextureRenderer(TextureType.External);
                CameraRenderer.this.mVideoTextureRenderer.initialize();
                CameraRenderer.this.mSurfaceTexture.setOnFrameAvailableListener(CameraRenderer.this);
            }
        });
    }

    private void unregisterInternal(final Object obj) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (CameraRenderer.this.mRegisteredSurfaces.containsKey(obj)) {
                    EGLSurface eGLSurface = (EGLSurface) CameraRenderer.this.mRegisteredSurfaces.get(obj);
                    CameraRenderer.this.mRegisteredSurfaces.remove(obj);
                    CameraRenderer.this.mRenderContext.releaseEglSurface(eGLSurface);
                    Object obj = obj;
                    if (obj instanceof VideoFrameReceiver) {
                        ((VideoFrameReceiver) obj).release();
                    }
                }
            }
        });
    }

    public void attachView(final TextureView textureView) {
        textureView.setSurfaceTextureListener(new SurfaceTextureListener() {
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                CameraRenderer.this.registerSurfaceTexture(surfaceTexture);
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                CameraRenderer.this.unregisterSurfaceTexture(surfaceTexture);
                return true;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
        if (textureView.isAvailable()) {
            registerSurfaceTexture(textureView.getSurfaceTexture());
        }
        this.mHandler.post(new Runnable() {
            public void run() {
                CameraRenderer.this.mAttachedViews.add(textureView);
            }
        });
    }

    public void dispose() {
        this.mHandler.post(new Runnable() {
            public void run() {
                CameraRenderer.this.mSurfaceTexture.release();
                CameraRenderer.this.mSurfaceTexture = null;
                CameraRenderer.this.mRenderContext.deleteTextureId(CameraRenderer.this.mTexId);
                CameraRenderer.this.mRenderContext.dispose();
            }
        });
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mHandler.post(new Runnable() {
            public void run() {
                long currentTimeMillis = System.currentTimeMillis() * 1000000;
                CameraRenderer.this.mSurfaceTexture.updateTexImage();
                CameraRenderer.this.mSurfaceTexture.getTransformMatrix(CameraRenderer.this.mTransformMatrix);
                CameraRenderer.this.mVideoTextureRenderer.setMatrix(CameraRenderer.this.mTransformMatrix);
                for (Entry entry : CameraRenderer.this.mRegisteredSurfaces.entrySet()) {
                    if (!(entry.getKey() instanceof VideoFrameReceiver) || ((VideoFrameReceiver) entry.getKey()).canAcceptNewFrame(currentTimeMillis, CameraRenderer.this.mWidth, CameraRenderer.this.mHeight)) {
                        EGLSurface eGLSurface = (EGLSurface) entry.getValue();
                        CameraRenderer.this.mRenderContext.makeCurrent(eGLSurface);
                        int[] surfaceSize = CameraRenderer.this.mRenderContext.getSurfaceSize(eGLSurface);
                        CameraRenderer.this.mVideoTextureRenderer.reshape(surfaceSize[0], surfaceSize[1]);
                        GLES20.glClearColor(1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
                        CameraRenderer.this.mVideoTextureRenderer.draw();
                        CameraRenderer.this.mRenderContext.setPresentationTime(eGLSurface, currentTimeMillis);
                        CameraRenderer.this.mRenderContext.swapBuffers(eGLSurface);
                    }
                }
            }
        });
    }

    public void registerFrameReceiver(final VideoFrameReceiver videoFrameReceiver) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (!CameraRenderer.this.mRegisteredSurfaces.containsKey(videoFrameReceiver)) {
                    CameraRenderer.this.mRegisteredSurfaces.put(videoFrameReceiver, CameraRenderer.this.mRenderContext.createEglSurface(videoFrameReceiver.getInputSurface()));
                }
            }
        });
    }

    public void registerSurfaceTexture(final SurfaceTexture surfaceTexture) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (!CameraRenderer.this.mRegisteredSurfaces.containsKey(surfaceTexture)) {
                    CameraRenderer.this.mRegisteredSurfaces.put(surfaceTexture, CameraRenderer.this.mRenderContext.createEglSurface(surfaceTexture));
                }
            }
        });
    }

    public void start(final int i, final int i2, final int i3) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (CameraRenderer.this.mCamera == null) {
                    CameraRenderer.this.mCamera = Camera.open(i);
                    CameraRenderer.this.mCamera.setDisplayOrientation(270);
                    Parameters parameters = CameraRenderer.this.mCamera.getParameters();
                    parameters.setPreviewSize(i3, i2);
                    CameraRenderer.this.mCamera.setParameters(parameters);
                    CameraRenderer.this.mVideoTextureRenderer.setVideoTextureAspectRatio(((float) i2) / ((float) i3));
                    CameraRenderer.this.mWidth = i2;
                    CameraRenderer.this.mHeight = i3;
                    try {
                        CameraRenderer.this.mCamera.setPreviewTexture(CameraRenderer.this.mSurfaceTexture);
                        CameraRenderer.this.mCamera.startPreview();
                    } catch (IOException unused) {
                        throw new RuntimeException("failed starting camera");
                    }
                }
            }
        });
    }

    public void stop() {
        this.mHandler.post(new Runnable() {
            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0056 in {2, 8, 10, 13} preds:[]
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
            public void run() {
                /*
                r3 = this;
                r0 = com.addlive.impl.CameraRenderer.this;
                r0 = r0.mCamera;
                if (r0 != 0) goto L_0x0009;
                return;
                r0 = com.addlive.impl.CameraRenderer.this;	 Catch:{ IOException -> 0x004e }
                r0 = r0.mCamera;	 Catch:{ IOException -> 0x004e }
                r0.stopPreview();	 Catch:{ IOException -> 0x004e }
                r0 = com.addlive.impl.CameraRenderer.this;	 Catch:{ IOException -> 0x004e }
                r0 = r0.mCamera;	 Catch:{ IOException -> 0x004e }
                r1 = 0;	 Catch:{ IOException -> 0x004e }
                r0.setPreviewTexture(r1);	 Catch:{ IOException -> 0x004e }
                r0 = com.addlive.impl.CameraRenderer.this;	 Catch:{ IOException -> 0x004e }
                r0 = r0.mCamera;	 Catch:{ IOException -> 0x004e }
                r0.release();	 Catch:{ IOException -> 0x004e }
                r0 = com.addlive.impl.CameraRenderer.this;	 Catch:{ IOException -> 0x004e }
                r0.mCamera = r1;	 Catch:{ IOException -> 0x004e }
                r0 = com.addlive.impl.CameraRenderer.this;
                r0 = r0.mAttachedViews;
                r0 = r0.iterator();
                r2 = r0.hasNext();
                if (r2 == 0) goto L_0x0044;
                r2 = r0.next();
                r2 = (android.view.TextureView) r2;
                r2.setSurfaceTextureListener(r1);
                goto L_0x0034;
                r0 = com.addlive.impl.CameraRenderer.this;
                r0 = r0.mAttachedViews;
                r0.clear();
                return;
                r0 = new java.lang.RuntimeException;
                r1 = "failed releasing camera";
                r0.<init>(r1);
                throw r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.addlive.impl.CameraRenderer$AnonymousClass4.run():void");
            }
        });
    }

    public void unregisterFrameReceiver(VideoFrameReceiver videoFrameReceiver) {
        unregisterInternal(videoFrameReceiver);
    }

    public void unregisterSurfaceTexture(SurfaceTexture surfaceTexture) {
        unregisterInternal(surfaceTexture);
    }
}
