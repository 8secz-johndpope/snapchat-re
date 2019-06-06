package com.snapcv.fastdnn;

import defpackage.aime;
import defpackage.aimf;
import defpackage.aimg;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class FastDnn {
    private final aimg nativeBridge;

    public FastDnn() {
        checkNativeLibrariesLoaded();
        long nativeInit = nativeInit();
        if (nativeInit != 0) {
            this.nativeBridge = new aimg(nativeInit, new Runnable() {
                public void run() {
                    FastDnn.this.nativeRelease();
                }
            });
            return;
        }
        throw new aime("FastDnn native init failed");
    }

    public FastDnn(Options options) {
        this();
        setOptions(options);
    }

    private static void checkNativeLibrariesLoaded() {
        if (!aimf.a()) {
            throw new aime("Native libraries aren't loaded");
        }
    }

    private native long nativeInit();

    private native boolean nativeLoadModel(String str, String str2, String str3, int i, int i2, int i3, int i4, String[] strArr);

    private native HashMap<String, Tensor> nativePredict(String str, String str2, int i, int i2, int i3, int i4, ByteBuffer byteBuffer, boolean z);

    private native void nativeRelease();

    private native void nativeSetOptions(boolean z, float[] fArr, boolean z2, float f);

    public final long getNativeHandle() {
        return this.nativeBridge.b;
    }

    public final boolean loadModel(ModelParameters modelParameters) {
        TensorShape inputDimensions = modelParameters.getInputDimensions();
        return nativeLoadModel(modelParameters.getBackendType().name(), modelParameters.getModelFilePath(), modelParameters.getInputLayerName(), inputDimensions.getWidth(), inputDimensions.getHeight(), inputDimensions.getChannels(), inputDimensions.getBatches(), modelParameters.getOutputLayerNames());
    }

    public final Map<String, Tensor> predict(Tensor tensor, boolean z) {
        TensorShape shape = tensor.getShape();
        TensorFormat format = tensor.getFormat();
        return nativePredict(format.getDataLayout().name(), format.getDataType().name(), shape.getWidth(), shape.getHeight(), shape.getChannels(), shape.getBatches(), tensor.getData(), z);
    }

    public final void setOptions(Options options) {
        nativeSetOptions(options.isMeanSubtractionEnabled(), options.getMean(), options.isScaleEnabled(), options.getScale());
    }
}
