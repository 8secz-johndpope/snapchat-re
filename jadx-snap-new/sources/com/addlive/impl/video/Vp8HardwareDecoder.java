package com.addlive.impl.video;

import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.DecoderCallback;
import com.addlive.djinni.DecoderConfig;
import com.addlive.djinni.FrameData;

public class Vp8HardwareDecoder extends AndroidVideoDecoder {
    private static final String DECODER_MIME = "video/x-vnd.on2.vp8";
    private static String sDecoderName;

    public Vp8HardwareDecoder(DecoderConfig decoderConfig, DecoderCallback decoderCallback, Handler handler) {
        super(decoderConfig, decoderCallback, handler);
    }

    private static String getVp8DecoderName() {
        if (sDecoderName == null) {
            sDecoderName = VERSION.SDK_INT < 21 ? "NO-CODEC" : CodecSupport.findDecoder(DECODER_MIME);
        }
        return sDecoderName;
    }

    public static boolean hardwareDecoderAvailable() {
        return !getVp8DecoderName().equals("NO-CODEC");
    }

    public /* bridge */ /* synthetic */ void decodeFrame(FrameData frameData) {
        super.decodeFrame(frameData);
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }
}
