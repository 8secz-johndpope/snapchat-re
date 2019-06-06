package com.snapchat.labscv;

import android.util.Log;
import com.snapchat.labscv.DepthSystemDefs.InputType;
import com.snapchat.labscv.DepthSystemDefs.LutType;
import defpackage.aime;
import defpackage.aimf;
import java.util.ArrayList;
import org.opencv.core.Mat;

public class DepthSystem {
    private static volatile boolean isNativeLibrariesLoaded;
    private long nativeDepthSystemPtr;

    public DepthSystem(boolean z, InputType inputType, LutType lutType, String str, String str2, String str3) {
        checkNativeLibrariesLoaded();
        this.nativeDepthSystemPtr = nativeInitWithLut(z, inputType.ordinal(), lutType.ordinal(), str, str2, str3);
    }

    public DepthSystem(boolean z, String str) {
        checkNativeLibrariesLoaded();
        this.nativeDepthSystemPtr = nativeInitWithCalibration(z, str);
    }

    public DepthSystem(boolean z, boolean z2, String str, String str2, String str3) {
        checkNativeLibrariesLoaded();
        this.nativeDepthSystemPtr = nativeInitWithLutWithAlignment(z, z2, str, str2, str3);
    }

    public DepthSystem(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, double[] dArr, ImuDataRaw imuDataRaw, String str5) {
        checkNativeLibrariesLoaded();
        double[] dArr2 = dArr;
        this.nativeDepthSystemPtr = nativeInitWithDepth(z, z2, str, str2, str3, str4, i, dArr2, dArr2.length, imuDataRaw, str5);
    }

    private static void checkNativeLibrariesLoaded() {
        if (!isNativeLibrariesLoaded) {
            if (aimf.a() && loadLabsCVLib()) {
                isNativeLibrariesLoaded = true;
                return;
            }
            throw new aime("Native libraries aren't loaded.");
        }
    }

    public static void extractImuData(String str) {
        nativeExtractImuData(str);
    }

    private static boolean loadLabsCVLib() {
        try {
            System.loadLibrary(BuildConfig.LIB_LABSCV_NAME);
            return true;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to load native libraries: ");
            stringBuilder.append(e.getMessage());
            Log.e("DepthSystem", stringBuilder.toString());
            return false;
        }
    }

    private native boolean nativeExtractCalibration(long j, CalibrationData calibrationData);

    private static native void nativeExtractImuData(String str);

    private native boolean nativeExtractLut(long j, long j2, long j3);

    private native boolean nativeExtractLutForStereoImage(long j, long j2, long j3, long j4);

    private native boolean nativeExtractLutForStereoImageWithAlignment(long j, long j2, long j3, long j4, long j5, long j6);

    private native boolean nativeExtractLutWithAlignment(long j, long j2, long j3, long j4, long j5);

    private native boolean nativeExtractStereoLut(long j, long j2);

    private native String nativeGetLastError(long j);

    private native long nativeInitWithCalibration(boolean z, String str);

    private native long nativeInitWithDepth(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, double[] dArr, int i2, ImuDataRaw imuDataRaw, String str5);

    private native long nativeInitWithLut(boolean z, int i, int i2, String str, String str2, String str3);

    private native long nativeInitWithLutWithAlignment(boolean z, boolean z2, String str, String str2, String str3);

    private static native boolean nativeReadAlignmentData(String str, ArrayList<AlignmentFrameData> arrayList);

    private static native boolean nativeReadCameraData(String str, CameraData cameraData, CameraData cameraData2);

    private static native boolean nativeReadData(int i, String str, int i2, long j);

    private static native boolean nativeReadDepthData(String str, long j);

    private static native boolean nativeReadSixdofData(String str, ArrayList<SixdofFrameData> arrayList);

    private static native boolean nativeReadTimestampData(String str, double[] dArr, int i);

    private native void nativeRelease(long j);

    public static boolean readAlignmentData(String str, AlignmentData alignmentData) {
        return nativeReadAlignmentData(str, alignmentData.alignmentData);
    }

    public static boolean readCameraData(String str, CameraData cameraData, CameraData cameraData2) {
        return nativeReadCameraData(str, cameraData, cameraData2);
    }

    public static boolean readData(DepthDataType depthDataType, String str, DepthDataType depthDataType2, Mat mat) {
        return nativeReadData(depthDataType.ordinal(), str, depthDataType2.ordinal(), mat.getNativeObjAddr());
    }

    public static boolean readDepthData(String str, Mat mat) {
        return nativeReadDepthData(str, mat.getNativeObjAddr());
    }

    public static boolean readSixdofData(String str, SixdofData sixdofData) {
        return nativeReadSixdofData(str, sixdofData.sixdofData);
    }

    public static boolean readTimestampData(String str, double[] dArr) {
        return nativeReadTimestampData(str, dArr, dArr.length);
    }

    public boolean extractCalibrationData(CalibrationData calibrationData) {
        long j = this.nativeDepthSystemPtr;
        return j == 0 ? false : nativeExtractCalibration(j, calibrationData);
    }

    public boolean extractLut(Mat mat) {
        long j = this.nativeDepthSystemPtr;
        return j == 0 ? false : nativeExtractStereoLut(j, mat.getNativeObjAddr());
    }

    public boolean extractLut(Mat mat, Mat mat2) {
        long j = this.nativeDepthSystemPtr;
        if (j == 0) {
            return false;
        }
        return nativeExtractLut(j, mat.getNativeObjAddr(), mat2.getNativeObjAddr());
    }

    public boolean extractLut(Mat mat, Mat mat2, Mat mat3) {
        long j = this.nativeDepthSystemPtr;
        if (j == 0) {
            return false;
        }
        return nativeExtractLutForStereoImage(j, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr());
    }

    public boolean extractLut(Mat mat, Mat mat2, Mat mat3, Mat mat4) {
        long j = this.nativeDepthSystemPtr;
        if (j == 0) {
            return false;
        }
        return nativeExtractLutWithAlignment(j, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr(), mat4.getNativeObjAddr());
    }

    public boolean extractLut(Mat mat, Mat mat2, Mat mat3, Mat mat4, Mat mat5) {
        long j = this.nativeDepthSystemPtr;
        if (j == 0) {
            return false;
        }
        return nativeExtractLutForStereoImageWithAlignment(j, mat.getNativeObjAddr(), mat2.getNativeObjAddr(), mat3.getNativeObjAddr(), mat4.getNativeObjAddr(), mat5.getNativeObjAddr());
    }

    public String getLastError() {
        return nativeGetLastError(this.nativeDepthSystemPtr);
    }

    public void release() {
        synchronized (this) {
            if (this.nativeDepthSystemPtr != 0) {
                nativeRelease(this.nativeDepthSystemPtr);
                this.nativeDepthSystemPtr = 0;
            }
        }
    }
}
