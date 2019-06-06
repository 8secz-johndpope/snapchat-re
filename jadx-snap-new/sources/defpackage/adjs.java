package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.CodecException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Surface;

/* renamed from: adjs */
public final class adjs {
    private final MediaFormat a;
    private final Surface b;
    private final MediaCrypto c = null;
    private final int d;

    public adjs(MediaFormat mediaFormat, Surface surface, int i) {
        this.a = mediaFormat;
        this.b = surface;
        this.d = i;
    }

    public final void a(MediaCodec mediaCodec) {
        String str = null;
        try {
            mediaCodec.configure(this.a, this.b, null, this.d);
        } catch (IllegalStateException e) {
            Object obj = (VERSION.SDK_INT < 21 || !(e instanceof CodecException)) ? null : 1;
            if (obj != null) {
                CodecException codecException = (CodecException) e;
                if (VERSION.SDK_INT >= 23) {
                    codecException.getErrorCode();
                }
            }
            String format = String.format("Failed to configure codec: %s format:%s, surface:%s, crypto:%s, flags:%d", new Object[]{e, this.a, this.b, null, Integer.valueOf(this.d)});
            String message = e.getMessage();
            String str2 = "Error ";
            if (!TextUtils.isEmpty(message) && message.contains(str2)) {
                str = message.substring(message.indexOf(str2) + 6);
            }
            throw new adjy(format, str);
        }
    }
}
