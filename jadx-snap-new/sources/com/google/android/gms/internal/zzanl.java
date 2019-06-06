package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.util.Log;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@zzabh
@TargetApi(14)
public final class zzanl extends Thread implements OnFrameAvailableListener, zzank {
    private static final float[] zzdmn = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private int zzalt;
    private int zzalu;
    private final float[] zzdmk;
    private final zzani zzdmo;
    private final float[] zzdmp;
    private final float[] zzdmq;
    private final float[] zzdmr;
    private final float[] zzdms;
    private final float[] zzdmt;
    private final float[] zzdmu;
    private float zzdmv;
    private float zzdmw;
    private float zzdmx;
    private SurfaceTexture zzdmy;
    private SurfaceTexture zzdmz;
    private int zzdna;
    private int zzdnb;
    private int zzdnc;
    private FloatBuffer zzdnd = ByteBuffer.allocateDirect(zzdmn.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    private final CountDownLatch zzdne;
    private final Object zzdnf;
    private EGL10 zzdng;
    private EGLDisplay zzdnh;
    private EGLContext zzdni;
    private EGLSurface zzdnj;
    private volatile boolean zzdnk;
    private volatile boolean zzdnl;

    public zzanl(Context context) {
        super("SphericalVideoProcessor");
        this.zzdnd.put(zzdmn).position(0);
        this.zzdmk = new float[9];
        this.zzdmp = new float[9];
        this.zzdmq = new float[9];
        this.zzdmr = new float[9];
        this.zzdms = new float[9];
        this.zzdmt = new float[9];
        this.zzdmu = new float[9];
        this.zzdmv = Float.NaN;
        this.zzdmo = new zzani(context);
        this.zzdmo.zza((zzank) this);
        this.zzdne = new CountDownLatch(1);
        this.zzdnf = new Object();
    }

    private static void zza(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = MapboxConstants.MINIMUM_ZOOM;
        fArr[2] = MapboxConstants.MINIMUM_ZOOM;
        fArr[3] = MapboxConstants.MINIMUM_ZOOM;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = MapboxConstants.MINIMUM_ZOOM;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void zza(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = ((fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3])) + (fArr2[2] * fArr3[6]);
        fArr[1] = ((fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4])) + (fArr2[2] * fArr3[7]);
        fArr[2] = ((fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5])) + (fArr2[2] * fArr3[8]);
        fArr[3] = ((fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3])) + (fArr2[5] * fArr3[6]);
        fArr[4] = ((fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4])) + (fArr2[5] * fArr3[7]);
        fArr[5] = ((fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5])) + (fArr2[5] * fArr3[8]);
        fArr[6] = ((fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3])) + (fArr2[8] * fArr3[6]);
        fArr[7] = ((fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4])) + (fArr2[8] * fArr3[7]);
        fArr[8] = ((fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5])) + (fArr2[8] * fArr3[8]);
    }

    private static void zzb(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = MapboxConstants.MINIMUM_ZOOM;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = MapboxConstants.MINIMUM_ZOOM;
        fArr[6] = MapboxConstants.MINIMUM_ZOOM;
        fArr[7] = MapboxConstants.MINIMUM_ZOOM;
        fArr[8] = 1.0f;
    }

    private static int zzd(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        zzdb("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        zzdb("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        zzdb("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        zzdb("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(":");
        str = "SphericalVideoRenderer";
        Log.e(str, stringBuilder.toString());
        Log.e(str, GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        zzdb("deleteShader");
        return 0;
    }

    private static void zzdb(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(glGetError);
            Log.e("SphericalVideoRenderer", stringBuilder.toString());
        }
    }

    private final void zzte() {
        float[] fArr;
        float f;
        while (this.zzdnc > 0) {
            this.zzdmy.updateTexImage();
            this.zzdnc--;
        }
        if (this.zzdmo.zza(this.zzdmk)) {
            if (Float.isNaN(this.zzdmv)) {
                fArr = this.zzdmk;
                float[] fArr2 = new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM};
                float[] fArr3 = new float[]{((fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1])) + (fArr[2] * fArr2[2]), ((fArr[3] * fArr2[0]) + (fArr[4] * fArr2[1])) + (fArr[5] * fArr2[2]), ((fArr[6] * fArr2[0]) + (fArr[7] * fArr2[1])) + (fArr[8] * fArr2[2])};
                this.zzdmv = -(((float) Math.atan2((double) fArr3[1], (double) fArr3[0])) - 1.5707964f);
            }
            fArr = this.zzdmt;
            f = this.zzdmv + this.zzdmw;
        } else {
            zza(this.zzdmk, -1.5707964f);
            fArr = this.zzdmt;
            f = this.zzdmw;
        }
        zzb(fArr, f);
        zza(this.zzdmp, 1.5707964f);
        zza(this.zzdmq, this.zzdmt, this.zzdmp);
        zza(this.zzdmr, this.zzdmk, this.zzdmq);
        zza(this.zzdms, this.zzdmx);
        zza(this.zzdmu, this.zzdms, this.zzdmr);
        GLES20.glUniformMatrix3fv(this.zzdnb, 1, false, this.zzdmu, 0);
        GLES20.glDrawArrays(5, 0, 4);
        zzdb("drawArrays");
        GLES20.glFinish();
        this.zzdng.eglSwapBuffers(this.zzdnh, this.zzdnj);
    }

    private final boolean zztf() {
        EGLSurface eGLSurface = this.zzdnj;
        int i = 0;
        if (!(eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE)) {
            EGL10 egl10 = this.zzdng;
            EGLDisplay eGLDisplay = this.zzdnh;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            i = this.zzdng.eglDestroySurface(this.zzdnh, this.zzdnj) | (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT) | 0);
            this.zzdnj = null;
        }
        EGLContext eGLContext = this.zzdni;
        if (eGLContext != null) {
            i |= this.zzdng.eglDestroyContext(this.zzdnh, eGLContext);
            this.zzdni = null;
        }
        EGLDisplay eGLDisplay2 = this.zzdnh;
        if (eGLDisplay2 == null) {
            return i;
        }
        i |= this.zzdng.eglTerminate(eGLDisplay2);
        this.zzdnh = null;
        return i;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.zzdnc++;
        synchronized (this.zzdnf) {
            this.zzdnf.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01de A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d3  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0293 */
    public final void run() {
        /*
        r12 = this;
        r0 = r12.zzdmz;
        if (r0 != 0) goto L_0x000f;
    L_0x0004:
        r0 = "SphericalVideoProcessor started with no output texture.";
        com.google.android.gms.internal.zzaky.e(r0);
        r0 = r12.zzdne;
        r0.countDown();
        return;
    L_0x000f:
        r0 = javax.microedition.khronos.egl.EGLContext.getEGL();
        r0 = (javax.microedition.khronos.egl.EGL10) r0;
        r12.zzdng = r0;
        r0 = r12.zzdng;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY;
        r0 = r0.eglGetDisplay(r1);
        r12.zzdnh = r0;
        r0 = r12.zzdnh;
        r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        r2 = 0;
        r3 = 1;
        r4 = 0;
        if (r0 != r1) goto L_0x002c;
    L_0x002a:
        r0 = 0;
        goto L_0x009d;
    L_0x002c:
        r0 = 2;
        r0 = new int[r0];
        r1 = r12.zzdng;
        r5 = r12.zzdnh;
        r0 = r1.eglInitialize(r5, r0);
        if (r0 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x002a;
    L_0x003a:
        r0 = new int[r3];
        r1 = new javax.microedition.khronos.egl.EGLConfig[r3];
        r5 = 11;
        r7 = new int[r5];
        r7 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344};
        r5 = r12.zzdng;
        r6 = r12.zzdnh;
        r9 = 1;
        r8 = r1;
        r10 = r0;
        r5 = r5.eglChooseConfig(r6, r7, r8, r9, r10);
        if (r5 == 0) goto L_0x0059;
    L_0x0052:
        r0 = r0[r4];
        if (r0 <= 0) goto L_0x0059;
    L_0x0056:
        r0 = r1[r4];
        goto L_0x005a;
    L_0x0059:
        r0 = r2;
    L_0x005a:
        if (r0 != 0) goto L_0x005d;
    L_0x005c:
        goto L_0x002a;
    L_0x005d:
        r1 = 3;
        r1 = new int[r1];
        r1 = {12440, 2, 12344};
        r5 = r12.zzdng;
        r6 = r12.zzdnh;
        r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        r1 = r5.eglCreateContext(r6, r0, r7, r1);
        r12.zzdni = r1;
        r1 = r12.zzdni;
        if (r1 == 0) goto L_0x002a;
    L_0x0073:
        r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        if (r1 != r5) goto L_0x0078;
    L_0x0077:
        goto L_0x002a;
    L_0x0078:
        r1 = r12.zzdng;
        r5 = r12.zzdnh;
        r6 = r12.zzdmz;
        r0 = r1.eglCreateWindowSurface(r5, r0, r6, r2);
        r12.zzdnj = r0;
        r0 = r12.zzdnj;
        if (r0 == 0) goto L_0x002a;
    L_0x0088:
        r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        if (r0 != r1) goto L_0x008d;
    L_0x008c:
        goto L_0x002a;
    L_0x008d:
        r0 = r12.zzdng;
        r1 = r12.zzdnh;
        r5 = r12.zzdnj;
        r6 = r12.zzdni;
        r0 = r0.eglMakeCurrent(r1, r5, r5, r6);
        if (r0 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x002a;
    L_0x009c:
        r0 = 1;
    L_0x009d:
        r1 = 35633; // 0x8b31 float:4.9932E-41 double:1.7605E-319;
        r5 = com.google.android.gms.internal.zzoi.zzbqi;
        r6 = com.google.android.gms.internal.zzlc.zzio();
        r6 = r6.zzd(r5);
        r6 = (java.lang.String) r6;
        r7 = r5.zzje();
        r6 = r6.equals(r7);
        if (r6 != 0) goto L_0x00c1;
    L_0x00b6:
        r6 = com.google.android.gms.internal.zzlc.zzio();
        r5 = r6.zzd(r5);
        r5 = (java.lang.String) r5;
        goto L_0x00c3;
    L_0x00c1:
        r5 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}";
    L_0x00c3:
        r1 = zzd(r1, r5);
        if (r1 != 0) goto L_0x00cc;
    L_0x00c9:
        r6 = 0;
        goto L_0x014e;
    L_0x00cc:
        r5 = 35632; // 0x8b30 float:4.9931E-41 double:1.76045E-319;
        r6 = com.google.android.gms.internal.zzoi.zzbqj;
        r7 = com.google.android.gms.internal.zzlc.zzio();
        r7 = r7.zzd(r6);
        r7 = (java.lang.String) r7;
        r8 = r6.zzje();
        r7 = r7.equals(r8);
        if (r7 != 0) goto L_0x00f0;
    L_0x00e5:
        r7 = com.google.android.gms.internal.zzlc.zzio();
        r6 = r7.zzd(r6);
        r6 = (java.lang.String) r6;
        goto L_0x00f2;
    L_0x00f0:
        r6 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}";
    L_0x00f2:
        r5 = zzd(r5, r6);
        if (r5 != 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x00c9;
    L_0x00f9:
        r6 = android.opengl.GLES20.glCreateProgram();
        r7 = "createProgram";
        zzdb(r7);
        if (r6 == 0) goto L_0x014e;
    L_0x0104:
        android.opengl.GLES20.glAttachShader(r6, r1);
        r1 = "attachShader";
        zzdb(r1);
        android.opengl.GLES20.glAttachShader(r6, r5);
        r1 = "attachShader";
        zzdb(r1);
        android.opengl.GLES20.glLinkProgram(r6);
        r1 = "linkProgram";
        zzdb(r1);
        r1 = new int[r3];
        r5 = 35714; // 0x8b82 float:5.0046E-41 double:1.7645E-319;
        android.opengl.GLES20.glGetProgramiv(r6, r5, r1, r4);
        r5 = "getProgramiv";
        zzdb(r5);
        r1 = r1[r4];
        if (r1 == r3) goto L_0x0146;
    L_0x012d:
        r1 = "SphericalVideoRenderer";
        r5 = "Could not link program: ";
        android.util.Log.e(r1, r5);
        r1 = android.opengl.GLES20.glGetProgramInfoLog(r6);
        r5 = "SphericalVideoRenderer";
        android.util.Log.e(r5, r1);
        android.opengl.GLES20.glDeleteProgram(r6);
        r1 = "deleteProgram";
        zzdb(r1);
        goto L_0x00c9;
    L_0x0146:
        android.opengl.GLES20.glValidateProgram(r6);
        r1 = "validateProgram";
        zzdb(r1);
    L_0x014e:
        r12.zzdna = r6;
        r1 = r12.zzdna;
        android.opengl.GLES20.glUseProgram(r1);
        r1 = "useProgram";
        zzdb(r1);
        r1 = r12.zzdna;
        r5 = "aPosition";
        r1 = android.opengl.GLES20.glGetAttribLocation(r1, r5);
        r7 = 3;
        r8 = 5126; // 0x1406 float:7.183E-42 double:2.5326E-320;
        r9 = 0;
        r10 = 12;
        r11 = r12.zzdnd;
        r6 = r1;
        android.opengl.GLES20.glVertexAttribPointer(r6, r7, r8, r9, r10, r11);
        r5 = "vertexAttribPointer";
        zzdb(r5);
        android.opengl.GLES20.glEnableVertexAttribArray(r1);
        r1 = "enableVertexAttribArray";
        zzdb(r1);
        r1 = new int[r3];
        android.opengl.GLES20.glGenTextures(r3, r1, r4);
        r5 = "genTextures";
        zzdb(r5);
        r1 = r1[r4];
        r5 = 36197; // 0x8d65 float:5.0723E-41 double:1.78837E-319;
        android.opengl.GLES20.glBindTexture(r5, r1);
        r6 = "bindTextures";
        zzdb(r6);
        r6 = 10240; // 0x2800 float:1.4349E-41 double:5.059E-320;
        r7 = 9729; // 0x2601 float:1.3633E-41 double:4.807E-320;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r6 = "texParameteri";
        zzdb(r6);
        r6 = 10241; // 0x2801 float:1.435E-41 double:5.0597E-320;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r6 = "texParameteri";
        zzdb(r6);
        r6 = 10242; // 0x2802 float:1.4352E-41 double:5.06E-320;
        r7 = 33071; // 0x812f float:4.6342E-41 double:1.6339E-319;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r6 = "texParameteri";
        zzdb(r6);
        r6 = 10243; // 0x2803 float:1.4354E-41 double:5.0607E-320;
        android.opengl.GLES20.glTexParameteri(r5, r6, r7);
        r5 = "texParameteri";
        zzdb(r5);
        r5 = r12.zzdna;
        r6 = "uVMat";
        r5 = android.opengl.GLES20.glGetUniformLocation(r5, r6);
        r12.zzdnb = r5;
        r5 = 9;
        r5 = new float[r5];
        r5 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216};
        r6 = r12.zzdnb;
        android.opengl.GLES20.glUniformMatrix3fv(r6, r3, r4, r5, r4);
        r5 = r12.zzdna;
        if (r5 == 0) goto L_0x01db;
    L_0x01d9:
        r5 = 1;
        goto L_0x01dc;
    L_0x01db:
        r5 = 0;
    L_0x01dc:
        if (r0 == 0) goto L_0x02b8;
    L_0x01de:
        if (r5 != 0) goto L_0x01e2;
    L_0x01e0:
        goto L_0x02b8;
    L_0x01e2:
        r0 = new android.graphics.SurfaceTexture;
        r0.<init>(r1);
        r12.zzdmy = r0;
        r0 = r12.zzdmy;
        r0.setOnFrameAvailableListener(r12);
        r0 = r12.zzdne;
        r0.countDown();
        r0 = r12.zzdmo;
        r0.start();
        r12.zzdnk = r3;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
    L_0x01fa:
        r0 = r12.zzdnl;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        if (r0 != 0) goto L_0x0262;
    L_0x01fe:
        r12.zzte();	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = r12.zzdnk;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        if (r0 == 0) goto L_0x0249;
    L_0x0205:
        r0 = r12.zzalt;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r1 = r12.zzalu;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        android.opengl.GLES20.glViewport(r4, r4, r0, r1);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = "viewport";
        zzdb(r0);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = r12.zzdna;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r1 = "uFOVx";
        r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r1 = r12.zzdna;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r3 = "uFOVy";
        r1 = android.opengl.GLES20.glGetUniformLocation(r1, r3);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r3 = r12.zzalt;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r5 = r12.zzalu;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r6 = 1063216883; // 0x3f5f66f3 float:0.87266463 double:5.25298936E-315;
        if (r3 <= r5) goto L_0x0239;
    L_0x022a:
        android.opengl.GLES20.glUniform1f(r0, r6);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = r12.zzalu;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = (float) r0;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = r0 * r6;
        r3 = r12.zzalt;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r0 = r0 / r3;
        android.opengl.GLES20.glUniform1f(r1, r0);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        goto L_0x0247;
    L_0x0239:
        r3 = r12.zzalt;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r3 = (float) r3;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r3 = r3 * r6;
        r5 = r12.zzalu;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r5 = (float) r5;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        r3 = r3 / r5;
        android.opengl.GLES20.glUniform1f(r0, r3);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
        android.opengl.GLES20.glUniform1f(r1, r6);	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
    L_0x0247:
        r12.zzdnk = r4;	 Catch:{ IllegalStateException -> 0x0293, Throwable -> 0x0274 }
    L_0x0249:
        r0 = r12.zzdnf;	 Catch:{ InterruptedException -> 0x01fa }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x01fa }
        r1 = r12.zzdnl;	 Catch:{ all -> 0x025f }
        if (r1 != 0) goto L_0x025d;
    L_0x0250:
        r1 = r12.zzdnk;	 Catch:{ all -> 0x025f }
        if (r1 != 0) goto L_0x025d;
    L_0x0254:
        r1 = r12.zzdnc;	 Catch:{ all -> 0x025f }
        if (r1 != 0) goto L_0x025d;
    L_0x0258:
        r1 = r12.zzdnf;	 Catch:{ all -> 0x025f }
        r1.wait();	 Catch:{ all -> 0x025f }
    L_0x025d:
        monitor-exit(r0);	 Catch:{ all -> 0x025f }
        goto L_0x01fa;
    L_0x025f:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x025f }
        throw r1;	 Catch:{ InterruptedException -> 0x01fa }
    L_0x0262:
        r0 = r12.zzdmo;
        r0.stop();
        r0 = r12.zzdmy;
        r0.setOnFrameAvailableListener(r2);
        r12.zzdmy = r2;
        r12.zztf();
        return;
    L_0x0272:
        r0 = move-exception;
        goto L_0x02a8;
    L_0x0274:
        r0 = move-exception;
        r1 = "SphericalVideoProcessor died.";
        com.google.android.gms.internal.zzaky.zzb(r1, r0);	 Catch:{ all -> 0x0272 }
        r1 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0272 }
        r3 = "SphericalVideoProcessor.run.2";
        r1.zza(r0, r3);	 Catch:{ all -> 0x0272 }
        r0 = r12.zzdmo;
        r0.stop();
        r0 = r12.zzdmy;
        r0.setOnFrameAvailableListener(r2);
        r12.zzdmy = r2;
        r12.zztf();
        return;
    L_0x0293:
        r0 = "SphericalVideoProcessor halted unexpectedly.";
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ all -> 0x0272 }
        r0 = r12.zzdmo;
        r0.stop();
        r0 = r12.zzdmy;
        r0.setOnFrameAvailableListener(r2);
        r12.zzdmy = r2;
        r12.zztf();
        return;
    L_0x02a8:
        r1 = r12.zzdmo;
        r1.stop();
        r1 = r12.zzdmy;
        r1.setOnFrameAvailableListener(r2);
        r12.zzdmy = r2;
        r12.zztf();
        throw r0;
    L_0x02b8:
        r0 = r12.zzdng;
        r0 = r0.eglGetError();
        r0 = android.opengl.GLUtils.getEGLErrorString(r0);
        r1 = "EGL initialization failed: ";
        r0 = java.lang.String.valueOf(r0);
        r2 = r0.length();
        if (r2 == 0) goto L_0x02d3;
    L_0x02ce:
        r0 = r1.concat(r0);
        goto L_0x02d8;
    L_0x02d3:
        r0 = new java.lang.String;
        r0.<init>(r1);
    L_0x02d8:
        com.google.android.gms.internal.zzaky.e(r0);
        r1 = com.google.android.gms.ads.internal.zzbt.zzep();
        r2 = new java.lang.Throwable;
        r2.<init>(r0);
        r0 = "SphericalVideoProcessor.run.1";
        r1.zza(r2, r0);
        r12.zztf();
        r0 = r12.zzdne;
        r0.countDown();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzanl.run():void");
    }

    public final void zza(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzalt = i;
        this.zzalu = i2;
        this.zzdmz = surfaceTexture;
    }

    public final void zzb(float f, float f2) {
        float f3;
        int i = this.zzalt;
        int i2 = this.zzalu;
        if (i > i2) {
            f = (f * 1.7453293f) / ((float) i);
            f2 *= 1.7453293f;
            f3 = (float) i;
        } else {
            f = (f * 1.7453293f) / ((float) i2);
            f2 *= 1.7453293f;
            f3 = (float) i2;
        }
        f2 /= f3;
        this.zzdmw -= f;
        this.zzdmx -= f2;
        if (this.zzdmx < -1.5707964f) {
            this.zzdmx = -1.5707964f;
        }
        if (this.zzdmx > 1.5707964f) {
            this.zzdmx = 1.5707964f;
        }
    }

    public final void zzh(int i, int i2) {
        synchronized (this.zzdnf) {
            this.zzalt = i;
            this.zzalu = i2;
            this.zzdnk = true;
            this.zzdnf.notifyAll();
        }
    }

    public final void zznm() {
        synchronized (this.zzdnf) {
            this.zzdnf.notifyAll();
        }
    }

    public final void zztc() {
        synchronized (this.zzdnf) {
            this.zzdnl = true;
            this.zzdmz = null;
            this.zzdnf.notifyAll();
        }
    }

    public final SurfaceTexture zztd() {
        if (this.zzdmz == null) {
            return null;
        }
        try {
            this.zzdne.await();
        } catch (InterruptedException unused) {
        }
        return this.zzdmy;
    }
}
