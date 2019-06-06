package com.brightcove.player.video360;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

@TargetApi(17)
public class GlRenderTarget {
    private EGLDisplay a = EGL14.EGL_NO_DISPLAY;
    private EGLSurface b = EGL14.EGL_NO_SURFACE;
    private EGLConfig c;
    private EGLContext d = EGL14.EGL_NO_CONTEXT;

    public GlRenderTarget() {
        initialize();
    }

    public void createRenderSurface(Object obj) {
        if (!hasValidContext()) {
            initialize();
        }
        this.b = EGL14.eglCreateWindowSurface(this.a, this.c, obj, new int[]{12344}, 0);
        EGLSurface eGLSurface = this.b;
        if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new OpenGLException("Failed to create Open GL surface");
        }
        makeCurrent();
    }

    public boolean hasValidContext() {
        EGLContext eGLContext = this.d;
        return (eGLContext == null || eGLContext == EGL14.EGL_NO_CONTEXT) ? false : true;
    }

    public boolean hasValidSurface() {
        EGLSurface eGLSurface = this.b;
        return (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) ? false : true;
    }

    public void initialize() {
        this.a = EGL14.eglGetDisplay(0);
        if (this.a != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.a, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (!EGL14.eglChooseConfig(this.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                    throw new OpenGLException("Failed to choose Open GL configuration");
                } else if (iArr2[0] > 0) {
                    this.c = eGLConfigArr[0];
                    this.d = EGL14.eglCreateContext(this.a, this.c, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    if (this.d == null) {
                        throw new OpenGLException("Failed to create Open GL context");
                    }
                    return;
                } else {
                    throw new OpenGLException("No EGL config found for attribute list");
                }
            }
            throw new OpenGLException("Failed to initialize Open GL Display!");
        }
        throw new OpenGLException("Failed to get Open GL Display!");
    }

    public void makeCurrent() {
        EGLDisplay eGLDisplay = this.a;
        EGLSurface eGLSurface = this.b;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
            throw new OpenGLException("Failed to make surface current");
        }
    }

    public void release() {
        EGL14.eglDestroySurface(this.a, this.b);
        EGL14.eglDestroyContext(this.a, this.d);
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_SURFACE;
        this.d = EGL14.EGL_NO_CONTEXT;
    }

    public void swapBuffers() {
        if (!EGL14.eglSwapBuffers(this.a, this.b)) {
            throw new OpenGLException("Failed to swap Open GL buffers");
        }
    }
}
