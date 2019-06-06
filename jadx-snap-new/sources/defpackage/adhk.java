package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES20;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.Buffer;

/* renamed from: adhk */
public final class adhk {
    public static adhk a = new adhk();

    private adhk() {
    }

    public static int a(int i) {
        i = GLES20.glCreateShader(i);
        if (i != 0) {
            return i;
        }
        adhk.b("glCreateShader");
        throw new adjw("glCreateShader failed");
    }

    public static adhk a() {
        return a;
    }

    public static void a(float f) {
        GLES20.glClearColor(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
    }

    public static void a(int i, float f, float f2, float f3, float f4) {
        GLES20.glUniform4f(i, f, f2, f3, f4);
    }

    public static void a(int i, int i2) {
        GLES20.glUniform1i(i, i2);
        adhk.a("glUniform1i");
    }

    public static void a(int i, int i2, int i3, int i4, Buffer buffer) {
        GLES20.glTexImage2D(3553, 0, i, i2, i3, 0, i4, 5121, buffer);
    }

    public static void a(int i, int i2, int i3, Buffer buffer) {
        GLES20.glVertexAttribPointer(i, i2, 5126, false, i3, buffer);
    }

    public static void a(int i, float[] fArr) {
        GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
    }

    public static void a(int i, int[] iArr) {
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x005d in {2, 6, 9, 11} preds:[]
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
    public static void a(java.lang.String r5) {
        /*
        r0 = android.opengl.GLES20.glGetError();
        if (r0 != 0) goto L_0x0007;
        return;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r5);
        r2 = ": glError ";
        r1.append(r2);
        r2 = 3;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r2[r3] = r5;
        r3 = 1;
        r4 = java.lang.Integer.valueOf(r0);
        r2[r3] = r4;
        r3 = 2;
        r4 = android.opengl.GLU.gluErrorString(r0);
        r2[r3] = r4;
        r3 = "%s: glError %d %s";
        defpackage.adni.e(r3, r2);
        r1.append(r0);
        r2 = " ";
        r1.append(r2);
        r3 = android.opengl.GLU.gluErrorString(r0);
        r1.append(r3);
        r3 = 1285; // 0x505 float:1.8E-42 double:6.35E-321;
        if (r0 != r3) goto L_0x0047;
        r0 = defpackage.adnm.a();
        r1.append(r2);
        r1.append(r0);
        r0 = ", ";
        r1.append(r0);
        r0 = android.opengl.GLES20.glGetError();
        if (r0 == 0) goto L_0x0053;
        goto L_0x0011;
        r5 = new adjw;
        r0 = r1.toString();
        r5.<init>(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adhk.a(java.lang.String):void");
    }

    public static void a(int[] iArr) {
        GLES20.glGenRenderbuffers(1, iArr, 0);
        int i = 0;
        while (i <= 0) {
            if (iArr[0] != 0) {
                i++;
            } else {
                adhk.b("glGenRenderbuffers");
                throw new adjw("Failed to create render buffer. Did makeCurrent get called first?");
            }
        }
    }

    public static void b() {
        GLES20.glFinish();
    }

    public static void b(int i) {
        GLES20.glDrawArrays(i, 0, 4);
        adhk.a("glDrawArrays");
    }

    public static void b(int i, int i2, int i3, Buffer buffer) {
        GLES20.glReadPixels(0, 0, i, i2, i3, 5121, buffer);
    }

    public static void b(int i, int[] iArr) {
        GLES20.glGetProgramiv(i, 35714, iArr, 0);
    }

    private static void b(String str) {
        if (EGL14.eglGetCurrentContext().equals(EGL14.EGL_NO_CONTEXT)) {
            throw new adjw("Doesn't have current EGL context for GL operation: ".concat(String.valueOf(str)));
        }
    }

    public static void b(int[] iArr) {
        GLES20.glGetIntegerv(3379, iArr, 0);
    }

    public static int c() {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            return glCreateProgram;
        }
        adhk.b("glCreateProgram");
        throw new adjw("glCreateProgram failed");
    }

    public static void c(int i) {
        GLES20.glClear(i);
    }

    public static void c(int[] iArr) {
        GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static void d() {
        GLES20.glEnable(3042);
    }

    public static void d(int i) {
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
    }

    public static void d(int[] iArr) {
        GLES20.glScissor(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static void e() {
        GLES20.glBlendFunc(1, 771);
    }
}
