package com.samsung.android.sdk.camera.delegator;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.util.Size;
import com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.CaptureCallback;
import com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.CaptureParameter;
import com.samsung.android.sdk.camera.delegator.AbstractSemCameraCaptureProcessor.ProcessorParameter;
import java.util.List;

public class SemCameraCaptureProcessorDefault extends AbstractSemCameraCaptureProcessor {
    public CaptureRequest buildCaptureRequest(Builder builder) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public void capture(CameraCaptureSession cameraCaptureSession, CaptureResult captureResult, CaptureCallback captureCallback, Handler handler, List<CaptureParameter> list) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public SessionConfiguration createSessionConfiguration(List<OutputConfiguration> list, StateCallback stateCallback, Handler handler) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public CameraDevice.StateCallback createStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public void deinitialize() {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public List<ProcessorParameter> getAvailableParameters() {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public <T> T getProcessorParameter(ProcessorParameter<T> processorParameter) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public void initialize(Context context, String str, Size size) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }

    public <T> void setProcessorParameter(ProcessorParameter<T> processorParameter, T t) {
        throw new UnsupportedOperationException("SEP VERSION NOT SUPPORTED!!!");
    }
}
