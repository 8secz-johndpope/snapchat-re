package com.looksery.sdk;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.android.gms.vision.face.FaceDetector.Builder;
import java.nio.ByteBuffer;

public class LSFaceDetectorWrapper {
    private static final boolean DEBUG_SAVE_IMAGE = false;
    private static final String TAG = "LSFaceDetectorWrapper";
    private FaceDetector mDetector;

    public LSFaceDetectorWrapper(Context context, boolean z) {
        try {
            this.mDetector = new Builder(context).setClassificationType(0).setMode(z ? 1 : 0).setTrackingEnabled(false).build();
            if (!this.mDetector.isOperational()) {
                release();
            }
        } catch (Throwable th) {
            release();
            Log.e(TAG, "Can't make google's FaceDetector, it will not be used", th);
        }
    }

    public static LSFaceDetectorWrapper createFaceDetector(Context context, boolean z) {
        return new LSFaceDetectorWrapper(context, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A:{SYNTHETIC, Splitter:B:19:0x0063} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A:{SYNTHETIC, Splitter:B:25:0x006a} */
    @android.annotation.SuppressLint({"SdCardPath"})
    private void saveFrameImageToDisk(com.google.android.gms.vision.Frame r11) {
        /*
        r10 = this;
        r0 = r11.getMetadata();
        r0 = r0.getFormat();
        r1 = r11.getMetadata();
        r1 = r1.getWidth();
        r2 = r11.getMetadata();
        r8 = r2.getHeight();
        r11 = r11.getGrayscaleImageData();
        r2 = 17;
        if (r0 != r2) goto L_0x006e;
    L_0x0020:
        r0 = 0;
        r11.position(r0);
        r2 = r11.remaining();
        r3 = new byte[r2];
        r11.get(r3, r0, r2);
        r11.position(r0);
        r11 = 0;
        r9 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0057, all -> 0x0053 }
        r2 = "/sdcard/face_detector.jpg";
        r9.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0057, all -> 0x0053 }
        r11 = new android.graphics.YuvImage;	 Catch:{ FileNotFoundException -> 0x0051 }
        r4 = 17;
        r7 = 0;
        r2 = r11;
        r5 = r1;
        r6 = r8;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ FileNotFoundException -> 0x0051 }
        r2 = new android.graphics.Rect;	 Catch:{ FileNotFoundException -> 0x0051 }
        r2.<init>(r0, r0, r1, r8);	 Catch:{ FileNotFoundException -> 0x0051 }
        r0 = 100;
        r11.compressToJpeg(r2, r0, r9);	 Catch:{ FileNotFoundException -> 0x0051 }
        r9.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0050:
        return;
    L_0x0051:
        r11 = move-exception;
        goto L_0x005a;
    L_0x0053:
        r0 = move-exception;
        r9 = r11;
        r11 = r0;
        goto L_0x0068;
    L_0x0057:
        r0 = move-exception;
        r9 = r11;
        r11 = r0;
    L_0x005a:
        r0 = "LSFaceDetectorWrapper";
        r1 = "saveFrameImageToDisk: could not save image to disc";
        android.util.Log.e(r0, r1, r11);	 Catch:{ all -> 0x0067 }
        if (r9 == 0) goto L_0x0066;
    L_0x0063:
        r9.close();	 Catch:{ IOException -> 0x0066 }
    L_0x0066:
        return;
    L_0x0067:
        r11 = move-exception;
    L_0x0068:
        if (r9 == 0) goto L_0x006d;
    L_0x006a:
        r9.close();	 Catch:{ IOException -> 0x006d }
    L_0x006d:
        throw r11;
    L_0x006e:
        r11 = new java.lang.RuntimeException;
        r0 = java.lang.String.valueOf(r0);
        r1 = "Unsupported format: ";
        r0 = r1.concat(r0);
        r11.<init>(r0);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.LSFaceDetectorWrapper.saveFrameImageToDisk(com.google.android.gms.vision.Frame):void");
    }

    public float[] detectFacesOnImage(int i, int i2, ByteBuffer byteBuffer) {
        if (this.mDetector == null) {
            return null;
        }
        SparseArray detect = this.mDetector.detect(new Frame.Builder().setImageData(byteBuffer, i, i2, 17).build());
        i2 = detect.size();
        float[] fArr = new float[(i2 << 2)];
        for (int i3 = 0; i3 < i2; i3++) {
            Face face = (Face) detect.valueAt(i3);
            int i4 = i3 << 2;
            fArr[i4] = face.getPosition().x;
            fArr[i4 + 1] = face.getPosition().y;
            fArr[i4 + 2] = face.getWidth();
            fArr[i4 + 3] = face.getHeight();
        }
        return fArr;
    }

    public boolean isOperational() {
        return this.mDetector != null;
    }

    public void release() {
        FaceDetector faceDetector = this.mDetector;
        if (faceDetector != null) {
            faceDetector.release();
            this.mDetector = null;
        }
    }
}
