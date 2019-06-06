package com.samsung.android.sdk.camera.delegator;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.util.Size;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class AbstractSemCameraCaptureProcessor {
    public static final ProcessorParameter<Boolean> PARAMETER_ENABLE_FACE_BEAUTY = new ProcessorParameter("beauty_parameter");
    protected static final String TAG = "AbstractSemCameraCaptureProcessor";

    public static abstract class CaptureCallback {
        public static final int ERROR_CAPTURE_FAILED = 1;
        public static final int ERROR_PROCESSING_FAILED = 2;

        public abstract void onError(int i);

        public abstract void onPictureAvailable(ByteBuffer byteBuffer);

        public abstract void onShutter();
    }

    public static class CaptureParameter {
        private final Key mKey;
        private final Object mValue;

        public <T> CaptureParameter(Key<T> key, T t) {
            this.mKey = key;
            this.mValue = t;
        }

        public Key getKey() {
            return this.mKey;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    public static final class ProcessorParameter<T> {
        private String mName;

        ProcessorParameter(String str) {
            this.mName = str;
        }

        public final String getName() {
            return this.mName;
        }
    }

    public abstract CaptureRequest buildCaptureRequest(Builder builder);

    public abstract void capture(CameraCaptureSession cameraCaptureSession, CaptureResult captureResult, CaptureCallback captureCallback, Handler handler, List<CaptureParameter> list);

    public abstract SessionConfiguration createSessionConfiguration(List<OutputConfiguration> list, StateCallback stateCallback, Handler handler);

    public abstract CameraDevice.StateCallback createStateCallback(CameraDevice.StateCallback stateCallback, Handler handler);

    public abstract void deinitialize();

    public abstract List<ProcessorParameter> getAvailableParameters();

    public abstract <T> T getProcessorParameter(ProcessorParameter<T> processorParameter);

    public abstract void initialize(Context context, String str, Size size);

    public abstract <T> void setProcessorParameter(ProcessorParameter<T> processorParameter, T t);
}
