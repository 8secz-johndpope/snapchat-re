package com.looksery.sdk.media;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class SurfaceVideoStream implements VideoStream {
    private volatile OnFrameAvailableListener mExternalListener;
    private final OnFrameAvailableListener mListener = new OnFrameAvailableListener() {
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            SurfaceVideoStream.this.mShouldUpdateTexture.set(true);
            OnFrameAvailableListener access$100 = SurfaceVideoStream.this.mExternalListener;
            if (access$100 != null) {
                access$100.onFrameAvailable(surfaceTexture);
            }
        }
    };
    private final AtomicBoolean mShouldUpdateTexture = new AtomicBoolean(false);
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private int mTextureName = 0;

    private int createExternalTextureOes() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return i;
    }

    public final void checkIfReleased() {
        if (this.mSurfaceTexture == null) {
            throw new IllegalStateException("Stream is not prepared or released already");
        }
    }

    public int nextExternalTextureFrame(float[] fArr) {
        checkIfReleased();
        if (this.mShouldUpdateTexture.compareAndSet(true, false)) {
            this.mSurfaceTexture.updateTexImage();
        }
        this.mSurfaceTexture.getTransformMatrix(fArr);
        return this.mTextureName;
    }

    public final Surface prepareSurface() {
        if (this.mSurface == null) {
            this.mTextureName = createExternalTextureOes();
            this.mSurfaceTexture = new SurfaceTexture(this.mTextureName);
            this.mSurfaceTexture.setOnFrameAvailableListener(this.mListener);
            this.mSurface = new Surface(this.mSurfaceTexture);
            return this.mSurface;
        }
        throw new IllegalStateException("prepared already");
    }

    public final Surface prepareSurface(int i, int i2) {
        prepareSurface();
        this.mSurfaceTexture.setDefaultBufferSize(i, i2);
        return this.mSurface;
    }

    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
            GLES20.glDeleteTextures(1, new int[]{this.mTextureName}, 0);
            this.mTextureName = 0;
        }
    }

    public final void setOnFrameAvailableListener(OnFrameAvailableListener onFrameAvailableListener) {
        this.mExternalListener = onFrameAvailableListener;
    }
}
