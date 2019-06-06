package com.addlive.impl;

import com.addlive.impl.video.AndroidVideoService;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL11;

public class OffscreenRenderContext {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private static final int PLACEHOLDER_SURFACE_SIZE = 1;
    private EGLSurface mDefaultEglSurface;
    private EGL10 mEGL;
    private EGLConfig mEGLConfig;
    private EGLContext mEGLContext;
    private EGLDisplay mEGLDisplay;
    private final Object mEglLock;
    private GL11 mGL;
    private int mHeight;
    private int mWidth;

    public OffscreenRenderContext() {
        this(1, 1);
    }

    public OffscreenRenderContext(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mEglLock = AndroidVideoService.getSharedEglLock();
    }

    public EGLSurface createEglSurface(Object obj) {
        EGLSurface eglCreateWindowSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, new int[]{12344});
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public void deleteTextureId(int i) {
        this.mGL.glDeleteTextures(1, new int[]{i}, 0);
    }

    public void dispose() {
        makeCurrent(null);
        this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mDefaultEglSurface);
        this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
        this.mEGL.eglTerminate(this.mEGLDisplay);
        this.mEGLDisplay = EGL10.EGL_NO_DISPLAY;
        this.mEGLContext = EGL10.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
        this.mGL = null;
        this.mEGL = null;
    }

    public int generateTextureId() {
        int[] iArr = new int[]{0};
        this.mGL.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    public int[] getSurfaceSize(EGLSurface eGLSurface) {
        int[] iArr = new int[1];
        this.mEGL.eglQuerySurface(this.mEGLDisplay, eGLSurface, 12375, new int[1]);
        this.mEGL.eglQuerySurface(this.mEGLDisplay, eGLSurface, 12374, iArr);
        return new int[]{r1[0], iArr[0]};
    }

    public void initialize() {
        initialize(EGL10.EGL_NO_CONTEXT);
    }

    public void initialize(OffscreenRenderContext offscreenRenderContext) {
        initialize(offscreenRenderContext.mEGLContext);
    }

    public void initialize(EGLContext eGLContext) {
        this.mEGL = (EGL10) EGLContext.getEGL();
        this.mEGLDisplay = this.mEGL.eglGetDisplay(Integer.valueOf(0));
        if (this.mEGLDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.mEGL.eglInitialize(this.mEGLDisplay, new int[2])) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.mEGL.eglChooseConfig(this.mEGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                    this.mEGLConfig = eGLConfigArr[0];
                    this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, eGLContext, new int[]{EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                    eGLContext = this.mEGLContext;
                    if (eGLContext != null) {
                        this.mGL = (GL11) eGLContext.getGL();
                        this.mDefaultEglSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, this.mWidth, 12374, this.mHeight, 12344});
                        if (this.mDefaultEglSurface == null) {
                            throw new RuntimeException("surface was null");
                        }
                        return;
                    }
                    throw new RuntimeException("unable to create context");
                }
                throw new RuntimeException("unable to choose EGL config");
            }
            throw new RuntimeException("unable to initialize EGL");
        }
        throw new RuntimeException("unable to get EGL display");
    }

    public void makeCurrent() {
        makeCurrent(this.mDefaultEglSurface);
    }

    public void makeCurrent(EGLSurface eGLSurface) {
        boolean eglMakeCurrent;
        EGLContext eGLContext = this.mEGLContext;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            eGLSurface = EGL10.EGL_NO_SURFACE;
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        synchronized (this.mEglLock) {
            eglMakeCurrent = this.mEGL.eglMakeCurrent(this.mEGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        if (!eglMakeCurrent) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void readPixels(Buffer buffer) {
        this.mGL.glViewport(0, 0, this.mWidth, this.mHeight);
        this.mGL.glPixelStorei(3333, 1);
        this.mGL.glReadPixels(0, 0, this.mWidth, this.mHeight, 6408, 5121, buffer.rewind());
        buffer.rewind();
    }

    public void releaseEglSurface(EGLSurface eGLSurface) {
        this.mEGL.eglDestroySurface(this.mEGLDisplay, eGLSurface);
    }

    public void setDefaultEglSurfaceSize(int i, int i2) {
        if (this.mWidth != i || this.mHeight != i2) {
            this.mWidth = i;
            this.mHeight = i2;
            EGLSurface eGLSurface = this.mDefaultEglSurface;
            if (eGLSurface != null) {
                releaseEglSurface(eGLSurface);
            }
            this.mDefaultEglSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, this.mWidth, 12374, this.mHeight, 12344});
            if (this.mDefaultEglSurface == null) {
                throw new RuntimeException("surface was null");
            }
        }
    }

    public void setPresentationTime(EGLSurface eGLSurface, long j) {
    }

    public boolean swapBuffers(EGLSurface eGLSurface) {
        boolean eglSwapBuffers;
        synchronized (this.mEglLock) {
            eglSwapBuffers = this.mEGL.eglSwapBuffers(this.mEGLDisplay, eGLSurface);
        }
        return eglSwapBuffers;
    }
}
