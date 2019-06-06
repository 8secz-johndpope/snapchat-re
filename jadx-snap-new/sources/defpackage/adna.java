package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import org.opencv.imgproc.Imgproc;

/* renamed from: adna */
public final class adna {
    private Boolean a;

    private static boolean a(String str, int i, Integer num) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder()) {
                Object obj;
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (!(obj == null || codecInfoAt.getName().startsWith("OMX.google."))) {
                    CodecCapabilities codecCapabilities = null;
                    try {
                        codecCapabilities = codecInfoAt.getCapabilitiesForType(str);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (codecCapabilities != null) {
                        for (CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                            if (codecProfileLevel.profile == i && (num == null || codecProfileLevel.level >= num.intValue())) {
                                return true;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a() {
        if (this.a == null) {
            boolean z = true;
            String str = "video/hevc";
            if (!(adna.a(str, 1, Integer.valueOf(Imgproc.FLOODFILL_FIXED_RANGE)) || adna.a(str, 2, Integer.valueOf(Imgproc.FLOODFILL_FIXED_RANGE)) || adna.a(str, 4096, Integer.valueOf(Imgproc.FLOODFILL_FIXED_RANGE)))) {
                z = false;
            }
            this.a = Boolean.valueOf(z);
        }
        return this.a.booleanValue();
    }
}
