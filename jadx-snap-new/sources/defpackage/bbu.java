package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;

@TargetApi(16)
/* renamed from: bbu */
public final class bbu {
    public final String a;
    public final CodecCapabilities b;
    public final boolean c;

    bbu(String str, CodecCapabilities codecCapabilities) {
        this.a = str;
        this.b = codecCapabilities;
        boolean z = codecCapabilities != null && bku.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.c = z;
    }
}
