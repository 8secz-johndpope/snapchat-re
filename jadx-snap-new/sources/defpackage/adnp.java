package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.google.common.base.Preconditions;

/* renamed from: adnp */
public final class adnp {
    public static final adnp a = new adnp();

    private adnp() {
    }

    public static MediaCodecInfo a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String equalsIgnoreCase : codecInfoAt.getSupportedTypes()) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static String a(MediaFormat mediaFormat) {
        adni.a("Type is %s", mediaFormat.getString("mime"));
        return mediaFormat.getString("mime");
    }

    public static void a() {
        try {
            abmr.a("Should not initialize the MediaCodecInfoList in main thread");
            MediaCodecList.getCodecCount();
        } catch (Exception unused) {
        }
    }

    public static MediaCodec b(String str) {
        try {
            return (MediaCodec) Preconditions.checkNotNull(MediaCodec.createByCodecName(str), "null codec");
        } catch (Exception e) {
            throw new adkd(e);
        }
    }
}
