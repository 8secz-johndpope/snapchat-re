package com.addlive.impl.video;

import android.os.Build.VERSION;
import android.os.Handler;
import com.addlive.djinni.EncoderCallback;
import com.addlive.djinni.EncoderConfig;
import com.addlive.djinni.FrameData;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class AvcHardwareEncoder extends AndroidVideoEncoder {
    private static final String ENCODER_MIME = "video/avc";
    private static String sEncoderName;
    private ArrayList<ByteBuffer> mCodecConfigChunks;
    private ByteBuffer mCodecConfigPacket = null;

    AvcHardwareEncoder(EncoderConfig encoderConfig, EncoderCallback encoderCallback, VideoFrameReceiverLifecycle videoFrameReceiverLifecycle, Handler handler) {
        super(getAvcEncoderName(), encoderConfig, encoderCallback, videoFrameReceiverLifecycle, handler);
    }

    private static String getAvcEncoderName() {
        if (sEncoderName == null) {
            String str;
            if (VERSION.SDK_INT < 21) {
                str = "NO-CODEC";
            } else {
                str = CodecSupport.findEncoder(ENCODER_MIME, 360, 640, new AvcCapabilityChecker());
            }
            sEncoderName = str;
        }
        return sEncoderName;
    }

    public static boolean hardwareEncoderAvailable() {
        return !getAvcEncoderName().equals("NO-CODEC");
    }

    private ArrayList<ByteBuffer> parseConfigPacket(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        int i = 16777215;
        ByteBuffer byteBuffer2 = null;
        int i2 = 0;
        while (byteBuffer.remaining() > 0) {
            i = (i << 8) | byteBuffer.get();
            if (i == 1) {
                if (byteBuffer2 != null) {
                    byteBuffer2.limit((byteBuffer.position() - 4) - i2);
                    arrayList.add(byteBuffer2);
                }
                int position = byteBuffer.position();
                i2 = position - 4;
                byteBuffer.position(i2);
                ByteBuffer slice = byteBuffer.slice();
                byteBuffer.position(position);
                byteBuffer2 = slice;
            }
        }
        if (byteBuffer2 != null) {
            arrayList.add(byteBuffer2);
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public int deliverEncodedFrame(ByteBuffer byteBuffer, int i, int i2, long j, int i3) {
        int i4 = 0;
        if ((i3 & 2) != 0) {
            this.mCodecConfigPacket = ByteBuffer.allocateDirect(byteBuffer.remaining());
            this.mCodecConfigPacket.put(byteBuffer).rewind();
            this.mCodecConfigChunks = parseConfigPacket(this.mCodecConfigPacket);
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = (i3 & 1) != 0;
        if (z) {
            ArrayList arrayList2 = this.mCodecConfigChunks;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
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
