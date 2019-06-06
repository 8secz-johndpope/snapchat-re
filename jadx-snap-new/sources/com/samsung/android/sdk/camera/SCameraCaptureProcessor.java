package com.samsung.android.sdk.camera;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.samsung.android.sdk.camera.delegator.AbstractSemCamera;
import com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor;
import com.samsung.android.sdk.camera.delegator.SemCameraCaptureProcessor10_1;
import com.samsung.android.sdk.camera.delegator.SemCameraCaptureProcessorDefault;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SCameraCaptureProcessor {
    public static final ProcessorParameter<Boolean> PARAMETER_ENABLE_FACE_BEAUTY = new ProcessorParameter("beauty_parameter");
    private static final String TAG = "SCameraCaptureProcessor";
    private static SCameraCaptureProcessor mSCameraCaptureProcessor;
    private boolean isSCameraProcessorInitialized = false;
    private CaptureCallback mAppCaptureCallback = null;
    private Handler mAppCaptureHandler;
    private android.hardware.camera2.CameraCaptureSession.CaptureCallback mAppPreviewCaptureCallback;
    private Context mContext;
    private List<ProcessorParameter> mParameterList;
    private PreviewCaptureCallback mPreviewCaptureCallback;
    private CaptureResult mPreviewCaptureResult;
    private AbstractSemCameraCaptureProcessor mSemCameraCaptureProcessor;
    private SemCaptureCallBack mSemCaptureCallBack;

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
    }

    class PreviewCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private PreviewCaptureCallback() {
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            Log.i(SCameraCaptureProcessor.TAG, "onCaptureBufferLost: frameNumber ".concat(String.valueOf(j)));
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                    }
                }
            }
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            SCameraCaptureProcessor.this.mPreviewCaptureResult = totalCaptureResult;
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                    }
                }
            }
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            String access$600 = SCameraCaptureProcessor.TAG;
            StringBuilder stringBuilder = new StringBuilder("onCaptureFailed: failure ");
            stringBuilder.append(captureFailure.getReason());
            stringBuilder.append("  mAppPreviewCaptureCallback: ");
            stringBuilder.append(SCameraCaptureProcessor.this.mAppPreviewCaptureCallback);
            Log.i(access$600, stringBuilder.toString());
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    }
                }
            }
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                    }
                }
            }
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            Log.i(SCameraCaptureProcessor.TAG, "onCaptureSequenceAborted: sequenceId ".concat(String.valueOf(i)));
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
            }
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    }
                }
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            SCameraCaptureProcessor sCameraCaptureProcessor = SCameraCaptureProcessor.this;
            if (sCameraCaptureProcessor != null) {
                synchronized (sCameraCaptureProcessor) {
                    if (SCameraCaptureProcessor.this.mAppPreviewCaptureCallback != null) {
                        SCameraCaptureProcessor.this.mAppPreviewCaptureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                    }
                }
            }
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

    class SemCaptureCallBack extends com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.CaptureCallback {
        private SemCaptureCallBack() {
        }

        public void onError(int i) {
            if (SCameraCaptureProcessor.this.mAppCaptureCallback != null) {
                SCameraCaptureProcessor.this.mAppCaptureCallback.onError(i);
            }
        }

        public void onPictureAvailable(ByteBuffer byteBuffer) {
            if (SCameraCaptureProcessor.this.mAppCaptureCallback != null) {
                SCameraCaptureProcessor.this.mAppCaptureCallback.onPictureAvailable(byteBuffer);
            }
        }

        public void onShutter() {
            if (SCameraCaptureProcessor.this.mAppCaptureCallback != null) {
                SCameraCaptureProcessor.this.mAppCaptureCallback.onShutter();
            }
        }
    }

    private SCameraCaptureProcessor() {
    }

    private void checkIsSCameraProcessorInitialized() {
        if (!this.isSCameraProcessorInitialized) {
            throw new IllegalStateException("SCameraCaptureProcessor not initialized");
        }
    }

    public static synchronized SCameraCaptureProcessor getInstance() {
        SCameraCaptureProcessor sCameraCaptureProcessor;
        synchronized (SCameraCaptureProcessor.class) {
            if (mSCameraCaptureProcessor == null) {
                mSCameraCaptureProcessor = new SCameraCaptureProcessor();
            }
            sCameraCaptureProcessor = mSCameraCaptureProcessor;
        }
        return sCameraCaptureProcessor;
    }

    private AbstractSemCameraCaptureProcessor getSemCameraCaptureProcessor() {
        if (this.mSemCameraCaptureProcessor == null) {
            int sepPlatformVersion = AbstractSemCamera.getSepPlatformVersion(this.mContext);
            Log.i(TAG, " getSemCameraCaptureProcessor SEP VERSION: ".concat(String.valueOf(sepPlatformVersion)));
            this.mSemCameraCaptureProcessor = sepPlatformVersion >= 100100 ? new SemCameraCaptureProcessor10_1() : new SemCameraCaptureProcessorDefault();
        }
        return this.mSemCameraCaptureProcessor;
    }

    private List<com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.CaptureParameter> getSemParameters(List<CaptureParameter> list) {
        String str;
        String str2;
        checkIsSCameraProcessorInitialized();
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            str = TAG;
            str2 = "getSemParameters: SemCaptureParametersSize: 0";
        } else {
            for (CaptureParameter captureParameter : list) {
                arrayList.add(new com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.CaptureParameter(captureParameter.mKey, captureParameter.mValue));
            }
            str = TAG;
            StringBuilder stringBuilder = new StringBuilder("getSemParameters: SemCaptureParametersSize: ");
            stringBuilder.append(arrayList.size());
            str2 = stringBuilder.toString();
        }
        Log.d(str, str2);
        return arrayList;
    }

    public synchronized CaptureRequest buildCaptureRequest(Builder builder) {
        Log.i(TAG, "buildCaptureRequest  : builder ".concat(String.valueOf(builder)));
        checkIsSCameraProcessorInitialized();
        return getSemCameraCaptureProcessor().buildCaptureRequest(builder);
    }

    public synchronized void capture(CameraCaptureSession cameraCaptureSession, CaptureCallback captureCallback, Handler handler, List<CaptureParameter> list) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("capture: parameters size: ");
        stringBuilder.append(list.size());
        Log.i(str, stringBuilder.toString());
        checkIsSCameraProcessorInitialized();
        this.mAppCaptureCallback = captureCallback;
        getSemCameraCaptureProcessor().capture(cameraCaptureSession, this.mPreviewCaptureResult, this.mSemCaptureCallBack, handler, getSemParameters(list));
    }

    public synchronized android.hardware.camera2.CameraCaptureSession.CaptureCallback createCaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        checkIsSCameraProcessorInitialized();
        this.mAppPreviewCaptureCallback = captureCallback;
        this.mAppCaptureHandler = handler;
        return this.mPreviewCaptureCallback;
    }

    public synchronized SessionConfiguration createSessionConfiguration(List<OutputConfiguration> list, StateCallback stateCallback, Handler handler) {
        checkIsSCameraProcessorInitialized();
        return getSemCameraCaptureProcessor().createSessionConfiguration(list, stateCallback, handler);
    }

    public synchronized CameraDevice.StateCallback createStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        checkIsSCameraProcessorInitialized();
        return getSemCameraCaptureProcessor().createStateCallback(stateCallback, handler);
    }

    public synchronized void deinitialize() {
        Log.i(TAG, "close");
        checkIsSCameraProcessorInitialized();
        getSemCameraCaptureProcessor().deinitialize();
        this.mAppCaptureCallback = null;
        this.mAppCaptureHandler = null;
        this.mPreviewCaptureResult = null;
        this.mAppPreviewCaptureCallback = null;
        this.mSemCaptureCallBack = null;
        this.mPreviewCaptureCallback = null;
        this.mParameterList = null;
        this.isSCameraProcessorInitialized = false;
    }

    public List<ProcessorParameter> getAvailableParameters() {
        checkIsSCameraProcessorInitialized();
        List<com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.ProcessorParameter> availableParameters = getSemCameraCaptureProcessor().getAvailableParameters();
        if (this.mParameterList == null) {
            this.mParameterList = new ArrayList();
            for (com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.ProcessorParameter processorParameter : availableParameters) {
                if (processorParameter == AbstractSemCameraCaptureProcessor.PARAMETER_ENABLE_FACE_BEAUTY) {
                    this.mParameterList.add(PARAMETER_ENABLE_FACE_BEAUTY);
                }
            }
        }
        return Collections.unmodifiableList(this.mParameterList);
    }

    public synchronized <T> T getProcessorParameter(ProcessorParameter<T> processorParameter) {
        if (processorParameter != PARAMETER_ENABLE_FACE_BEAUTY) {
            return null;
        }
        return getSemCameraCaptureProcessor().getProcessorParameter(AbstractSemCameraCaptureProcessor.PARAMETER_ENABLE_FACE_BEAUTY);
    }

    public synchronized void initialize(Context context, String str, Size size) {
        if (SCamera.getInstance().checkAvailability(context) == 0) {
            this.mContext = context;
            getSemCameraCaptureProcessor().initialize(context, str, size);
            this.mPreviewCaptureCallback = new PreviewCaptureCallback();
            this.mSemCaptureCallBack = new SemCaptureCallBack();
            this.isSCameraProcessorInitialized = true;
        } else {
            throw new UnsupportedOperationException("CameraSdk not supported");
        }
    }

    public synchronized <T> void setProcessorParameter(ProcessorParameter<T> processorParameter, T t) {
        checkIsSCameraProcessorInitialized();
        if (processorParameter != PARAMETER_ENABLE_FACE_BEAUTY) {
            return;
        }
        if (t instanceof Boolean) {
            getSemCameraCaptureProcessor().setProcessorParameter(AbstractSemCameraCaptureProcessor.PARAMETER_ENABLE_FACE_BEAUTY, (Boolean) t);
            return;
        }
        throw new IllegalArgumentException("argument for PARAMETER_ENABLE_FACE_BEAUTY should be of type Boolean");
    }
}
