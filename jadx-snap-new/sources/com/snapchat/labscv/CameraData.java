package com.snapchat.labscv;

public class CameraData {
    private static final int CAMERA_EXTRINSICS_SIZE = 16;
    double focalLength;
    float height;
    final float[] leftCameraExtrinsics = new float[16];
    float principalPointX;
    float principalPointY;
    final float[] rightCameraExtrinsics = new float[16];
    float width;

    /* Access modifiers changed, original: 0000 */
    public void setFields(float f, float f2, double d, float f3, float f4, float[] fArr, float[] fArr2) {
        this.width = f;
        this.height = f2;
        this.focalLength = d;
        this.principalPointX = f3;
        this.principalPointY = f4;
        System.arraycopy(fArr, 0, this.leftCameraExtrinsics, 0, 16);
        System.arraycopy(fArr2, 0, this.rightCameraExtrinsics, 0, 16);
    }
}
