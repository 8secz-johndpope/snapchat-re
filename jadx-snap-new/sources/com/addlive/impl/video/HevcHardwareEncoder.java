package com.addlive.impl.video;

import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.EncoderCallback;
import com.addlive.djinni.EncoderConfig;
import com.addlive.djinni.FrameData;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class HevcHardwareEncoder extends AndroidVideoEncoder {
    private static final String ENCODER_MIME = "video/hevc";
    private static String sEncoderName;
    private ByteBuffer mCodecConfigPacket = null;

    HevcHardwareEncoder(EncoderConfig encoderConfig, EncoderCallback encoderCallback, VideoFrameReceiverLifecycle videoFrameReceiverLifecycle, Handler handler) {
        super(getHevcEncoderName(), encoderConfig, encoderCallback, videoFrameReceiverLifecycle, handler);
    }

    private static String getHevcEncoderName() {
        if (sEncoderName == null) {
            sEncoderName = VERSION.SDK_INT < 21 ? "NO-CODEC" : CodecSupport.findEncoder(ENCODER_MIME, 360, 640);
        }
        return sEncoderName;
    }

    public static boolean hardwareEncoderAvailable() {
        return !getHevcEncoderName().equals("NO-CODEC");
    }

    /* Access modifiers changed, original: 0000 */
    public int deliverEncodedFrame(ByteBuffer byteBuffer, int i, int i2, long j, int i3) {
        int i4 = 0;
        if ((i3 & 2) != 0) {
            this.mCodecConfigPacket = ByteBuffer.allocateDirect(byteBuffer.remaining());
            this.mCodecConfigPacket.put(byteBuffer).rewind();
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = (i3 & 1) != 0;
        if (z) {
            ByteBuffer byteBuffer2 = this.mCodecConfigPacket;
            if (byteBuffer2 != null) {
                arrayList.add(byteBuffer2);
                i4 = 0 + this.mCodecConfigPacket.remaining();
            }
        }
        arrayList.add(byteBuffer.slice());
        i4 += byteBuffer.remaining();
        this.mEncoderCallback.onFrameEncoded(new FrameData(arrayList, i, i2, j, z));
        return i4;
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
