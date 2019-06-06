package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.FaceDetectionListener;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.ShutterCallback;
import java.io.IOException;

/* renamed from: dwj */
final class dwj extends ieo {
    private final Camera a;

    dwj(Camera camera) {
        this.a = camera;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0031 in {8, 11, 12, 15, 18} preds:[]
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
    public static android.hardware.Camera.CameraInfo[] l() {
        /*
        r0 = android.hardware.Camera.getNumberOfCameras();	 Catch:{ RuntimeException -> 0x002a }
        if (r0 == 0) goto L_0x0022;
        r1 = new android.hardware.Camera.CameraInfo[r0];
        r2 = 0;
        if (r2 >= r0) goto L_0x0021;
        r3 = new android.hardware.Camera$CameraInfo;
        r3.<init>();
        r1[r2] = r3;
        r3 = r1[r2];	 Catch:{ RuntimeException -> 0x001a }
        android.hardware.Camera.getCameraInfo(r2, r3);	 Catch:{ RuntimeException -> 0x001a }
        r2 = r2 + 1;
        goto L_0x0009;
        r0 = move-exception;
        r1 = new ecr;
        r1.<init>(r0);
        throw r1;
        return r1;
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x002a }
        r1 = "Number of cameras = 0";	 Catch:{ RuntimeException -> 0x002a }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x002a }
        throw r0;	 Catch:{ RuntimeException -> 0x002a }
        r0 = move-exception;
        r1 = new ecr;
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwj.l():android.hardware.Camera$CameraInfo[]");
    }

    public final void a() {
        this.a.release();
    }

    public final void a(int i) {
        o();
        try {
            this.a.setDisplayOrientation(i);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(SurfaceTexture surfaceTexture) {
        o();
        try {
            this.a.setPreviewTexture(surfaceTexture);
        } catch (IOException | RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(AutoFocusCallback autoFocusCallback) {
        o();
        try {
            this.a.autoFocus(autoFocusCallback);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(FaceDetectionListener faceDetectionListener) {
        o();
        try {
            this.a.setFaceDetectionListener(faceDetectionListener);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(Parameters parameters) {
        o();
        try {
            this.a.setParameters(parameters);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(PreviewCallback previewCallback) {
        o();
        try {
            this.a.setPreviewCallbackWithBuffer(previewCallback);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(ShutterCallback shutterCallback, PictureCallback pictureCallback) {
        o();
        try {
            this.a.takePicture(shutterCallback, null, null, pictureCallback);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void a(byte[] bArr) {
        o();
        try {
            this.a.addCallbackBuffer(bArr);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final Camera b() {
        o();
        return this.a;
    }

    public final void c() {
        o();
        try {
            this.a.unlock();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void d() {
        o();
        try {
            this.a.lock();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void e() {
        o();
        try {
            this.a.reconnect();
        } catch (IOException | RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final Parameters f() {
        o();
        try {
            return this.a.getParameters();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void g() {
        o();
        try {
            this.a.startPreview();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void h() {
        o();
        try {
            this.a.stopPreview();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void i() {
        o();
        try {
            this.a.startFaceDetection();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void j() {
        o();
        try {
            this.a.stopFaceDetection();
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }

    public final void k() {
        o();
        try {
            this.a.enableShutterSound(false);
        } catch (RuntimeException e) {
            throw new ecr(e);
        }
    }
}
