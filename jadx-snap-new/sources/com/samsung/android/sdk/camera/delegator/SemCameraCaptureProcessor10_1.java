package com.samsung.android.sdk.camera.delegator;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.util.Log;
import android.util.Size;
import com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.CaptureCallback;
import com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.ProcessorParameter;
import com.samsung.android.sep.camera.SemCameraCaptureProcessor;
import com.samsung.android.sep.camera.SemCameraCaptureProcessor.CaptureParameter;
import com.samsung.android.sep.camera.SemCameraCaptureProcessor.DynamicShotInfo;
import com.samsung.android.sep.camera.vendor.SemCameraCaptureRequestKey;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SemCameraCaptureProcessor10_1 extends AbstractSemCameraCaptureProcessor {
    private static final String TAG = "SemCameraCaptureProcessor10_1";
    private CameraCharacteristics mCharacteristics;
    private List<ProcessorParameter> mParameterList;
    private CaptureCallback mSDKCaptureCallback = null;
    private SemCameraCaptureProcessor mSemCameraCaptureProcessor;
    private SemCaptureCallBack mSemCaptureCallBack;

    class SemCaptureCallBack extends SemCameraCaptureProcessor.CaptureCallback {
        private SemCaptureCallBack() {
        }

        public void onError(int i) {
            Log.i(SemCameraCaptureProcessor10_1.TAG, " SemCaptureCallBack onError!!! ".concat(String.valueOf(i)));
            if (SemCameraCaptureProcessor10_1.this.mSDKCaptureCallback != null) {
                SemCameraCaptureProcessor10_1.this.mSDKCaptureCallback.onError(i);
            }
        }

        public void onPictureAvailable(ByteBuffer byteBuffer) {
            Log.i(SemCameraCaptureProcessor10_1.TAG, " SemCaptureCallBack onPictureAvailable!!! ".concat(String.valueOf(byteBuffer)));
            if (SemCameraCaptureProcessor10_1.this.mSDKCaptureCallback != null) {
                SemCameraCaptureProcessor10_1.this.mSDKCaptureCallback.onPictureAvailable(byteBuffer);
            }
        }

        public void onShutter() {
            if (SemCameraCaptureProcessor10_1.this.mSDKCaptureCallback != null) {
                SemCameraCaptureProcessor10_1.this.mSDKCaptureCallback.onShutter();
            }
        }
    }

    private CaptureRequest buildMultipleCaptureRequest(Builder builder) {
        Log.i(TAG, "buildMultipleCaptureRequest E");
        builder.set(SemCameraCaptureRequestKey.REQUEST_CONTROL_LIGHT_CONDITION_ENABLE_MODE, Integer.valueOf(1));
        builder.set(SemCameraCaptureRequestKey.CONTROL_LIVE_HDR_MODE, Integer.valueOf(2));
        setFaceDetectMode(builder);
        return builder.build();
    }

    private List<CaptureParameter> getSemParameters(List<AbstractSemCameraCaptureProcessor.CaptureParameter> list) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            str = TAG;
            str2 = "getSemParameters: SemCaptureParametersSize: 0";
        } else {
            for (AbstractSemCameraCaptureProcessor.CaptureParameter captureParameter : list) {
                arrayList.add(new CaptureParameter(captureParameter.getKey(), captureParameter.getValue()));
            }
            str = TAG;
            StringBuilder stringBuilder = new StringBuilder("getSemParameters: SemCaptureParametersSize: ");
            stringBuilder.append(arrayList.size());
            str2 = stringBuilder.toString();
        }
        Log.d(str, str2);
        return arrayList;
    }

    private void setFaceDetectMode(Builder builder) {
        CameraCharacteristics cameraCharacteristics = this.mCharacteristics;
        if (cameraCharacteristics != null) {
            Object obj = null;
            Object obj2 = null;
            for (int i : (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES)) {
                if (i == 2) {
                    obj = 1;
                } else if (i == 1) {
                    obj2 = 1;
                }
            }
            if (obj != null) {
                builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(2));
            } else if (obj2 != null) {
                builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(1));
            }
        }
    }

    public CaptureRequest buildCaptureRequest(Builder builder) {
        Log.i(TAG, "buildCaptureRequest  : builder ".concat(String.valueOf(builder)));
        SemCameraCaptureProcessor semCameraCaptureProcessor = this.mSemCameraCaptureProcessor;
        if (semCameraCaptureProcessor == null) {
            return builder.build();
        }
        try {
            builder = semCameraCaptureProcessor.buildCaptureRequest(builder);
            return builder;
        } catch (IllegalStateException unused) {
            return buildMultipleCaptureRequest(builder);
        }
    }

    public void capture(CameraCaptureSession cameraCaptureSession, CaptureResult captureResult, CaptureCallback captureCallback, Handler handler, List<AbstractSemCameraCaptureProcessor.CaptureParameter> list) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("capture: parameters size: ");
        stringBuilder.append(list.size());
        Log.i(str, stringBuilder.toString());
        this.mSDKCaptureCallback = captureCallback;
        SemCameraCaptureProcessor semCameraCaptureProcessor = this.mSemCameraCaptureProcessor;
        if (semCameraCaptureProcessor != null) {
            semCameraCaptureProcessor.capture(cameraCaptureSession, new DynamicShotInfo(captureResult), this.mSemCaptureCallBack, handler, getSemParameters(list));
        }
    }

    public SessionConfiguration createSessionConfiguration(List<OutputConfiguration> list, StateCallback stateCallback, Handler handler) {
        if (this.mSemCameraCaptureProcessor == null) {
            return null;
        }
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("createSessionConfiguration: outputConfigurations ");
        stringBuilder.append(list);
        stringBuilder.append("  stateCallback: ");
        stringBuilder.append(stateCallback);
        Log.i(str, stringBuilder.toString());
        return this.mSemCameraCaptureProcessor.createSessionConfiguration(list, stateCallback, handler);
    }

    public CameraDevice.StateCallback createStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        if (this.mSemCameraCaptureProcessor == null) {
            return null;
        }
        Log.i(TAG, "createStateCallback: appCallback ".concat(String.valueOf(stateCallback)));
        return this.mSemCameraCaptureProcessor.createStateCallback(stateCallback, handler);
    }

    public void deinitialize() {
        Log.i(TAG, "close");
        this.mSemCameraCaptureProcessor.deinitialize();
        this.mSDKCaptureCallback = null;
        this.mSemCaptureCallBack = null;
        this.mSemCameraCaptureProcessor = null;
        this.mCharacteristics = null;
    }

    public List<ProcessorParameter> getAvailableParameters() {
        List<SemCameraCaptureProcessor.ProcessorParameter> availableParameters = this.mSemCameraCaptureProcessor.getAvailableParameters();
        if (this.mParameterList == null) {
            this.mParameterList = new ArrayList();
            for (SemCameraCaptureProcessor.ProcessorParameter processorParameter : availableParameters) {
                if (processorParameter == SemCameraCaptureProcessor.PARAMETER_ENABLE_FACE_BEAUTY) {
                    this.mParameterList.add(PARAMETER_ENABLE_FACE_BEAUTY);
                }
            }
        }
        return Collections.unmodifiableList(this.mParameterList);
    }

    public <T> T getProcessorParameter(ProcessorParameter<T> processorParameter) {
        return processorParameter == PARAMETER_ENABLE_FACE_BEAUTY ? this.mSemCameraCaptureProcessor.getProcessorParameter(SemCameraCaptureProcessor.PARAMETER_ENABLE_FACE_BEAUTY) : null;
    }

    public void initialize(Context context, String str, Size size) {
        this.mSemCameraCaptureProcessor = SemCameraCaptureProcessor.getInstance();
        this.mSemCameraCaptureProcessor.initialize(context, str, size);
        this.mSemCaptureCallBack = new SemCaptureCallBack();
        this.mCharacteristics = ((CameraManager) context.getSystemService("camera")).getCameraCharacteristics(str);
    }

    public <T> void setProcessorParameter(ProcessorParameter<T> processorParameter, T t) {
        if (processorParameter == PARAMETER_ENABLE_FACE_BEAUTY) {
            this.mSemCameraCaptureProcessor.setProcessorParameter(SemCameraCaptureProcessor.PARAMETER_ENABLE_FACE_BEAUTY, (Boolean) t);
        }
    }
}
