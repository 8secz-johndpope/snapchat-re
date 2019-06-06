package com.addlive.impl.video;

import android.os.Handler;
import android.os.HandlerThread;
import com.addlive.djinni.DecoderCallback;
import com.addlive.djinni.DecoderConfig;
import com.addlive.djinni.EncoderCallback;
import com.addlive.djinni.EncoderConfig;
import com.addlive.djinni.ExternalDecoder;
import com.addlive.djinni.ExternalEncoder;
import com.addlive.djinni.ExternalVideoService;
import com.addlive.impl.SoftwareVideoEncoderFrameReceiver;
import java.util.concurrent.atomic.AtomicInteger;

public class AndroidVideoService extends ExternalVideoService {
    private static Object sSharedEglLock = new Object();
    private final Handler mCodecHandler;
    private VideoFrameReceiverLifecycle mFrameReceiverLifecycle;
    private AtomicInteger mRefCount = new AtomicInteger(0);
    private SoftwareVideoEncoderFrameReceiver mSoftwareFrameReceiver;

    public AndroidVideoService() {
        HandlerThread handlerThread = new HandlerThread("VideoCodecThread");
        handlerThread.start();
        this.mCodecHandler = new Handler(handlerThread.getLooper());
    }

    public static Object getSharedEglLock() {
        return sSharedEglLock;
    }

    public static void setSharedEglLock(Object obj) {
        if (obj != null) {
            sSharedEglLock = obj;
        }
    }

    public ExternalDecoder createDecoder(DecoderConfig decoderConfig, DecoderCallback decoderCallback) {
        if ("video/x-vnd.on2.vp8".equals(decoderConfig.getMimeType())) {
            return new Vp8HardwareDecoder(decoderConfig, decoderCallback, this.mCodecHandler);
        }
        if ("video/avc".equals(decoderConfig.getMimeType())) {
            return new AvcHardwareDecoder(decoderConfig, decoderCallback, this.mCodecHandler);
        }
        return "video/hevc".equals(decoderConfig.getMimeType()) ? new HevcHardwareDecoder(decoderConfig, decoderCallback, this.mCodecHandler) : null;
    }

    public ExternalEncoder createEncoder(EncoderConfig encoderConfig, EncoderCallback encoderCallback) {
        if ("video/x-vnd.on2.vp8".equals(encoderConfig.getMimeType())) {
            return new Vp8HardwareEncoder(encoderConfig, encoderCallback, this.mFrameReceiverLifecycle, this.mCodecHandler);
        }
        if ("video/avc".equals(encoderConfig.getMimeType())) {
            return new AvcHardwareEncoder(encoderConfig, encoderCallback, this.mFrameReceiverLifecycle, this.mCodecHandler);
        }
        return "video/hevc".equals(encoderConfig.getMimeType()) ? new HevcHardwareEncoder(encoderConfig, encoderCallback, this.mFrameReceiverLifecycle, this.mCodecHandler) : null;
    }

    public void notifyStartSoftwareEncoder() {
        if (this.mRefCount.incrementAndGet() == 1) {
            this.mSoftwareFrameReceiver = new SoftwareVideoEncoderFrameReceiver(this.mFrameReceiverLifecycle);
        }
    }

    public void notifyStopSoftwareEncoder() {
        if (this.mRefCount.decrementAndGet() == 0) {
            this.mSoftwareFrameReceiver.dispose();
            this.mSoftwareFrameReceiver = null;
        }
    }

    public void setFrameReceiverListener(VideoFrameReceiverLifecycle videoFrameReceiverLifecycle) {
        this.mFrameReceiverLifecycle = videoFrameReceiverLifecycle;
    }
}
