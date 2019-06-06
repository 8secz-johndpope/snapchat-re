package com.addlive.impl.video;

import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.EncoderCallback;
import com.addlive.djinni.EncoderConfig;

public class Vp8HardwareEncoder extends AndroidVideoEncoder {
    private static final String ENCODER_MIME = "video/x-vnd.on2.vp8";
    private static String sEncoderName;

    public Vp8HardwareEncoder(EncoderConfig encoderConfig, EncoderCallback encoderCallback, VideoFrameReceiverLifecycle videoFrameReceiverLifecycle, Handler handler) {
        super(getVp8EncoderName(), encoderConfig, encoderCallback, videoFrameReceiverLifecycle, handler);
    }

    private static String getVp8EncoderName() {
        if (sEncoderName == null) {
            String str;
            if (VERSION.SDK_INT < 21) {
                str = "NO-CODEC";
            } else {
                str = CodecSupport.findEncoder(ENCODER_MIME, 360, 640, new Vp8CapabilityChecker());
            }
            sEncoderName = str;
        }
        return sEncoderName;
    }

    public static boolean hardwareEncoderAvailable() {
        return !getVp8EncoderName().equals("NO-CODEC");
    }

    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    public /* bridge */ /* synthetic */ void forceKeyFrame() {
        super.forceKeyFrame();
    }

    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public /* bridge */ /* synthetic */ void setBitRate(int i) {
        super.setBitRate(i);
    }

    public /* bridge */ /* synthetic */ void setResolution(int i, int i2) {
        super.setResolution(i, i2);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
