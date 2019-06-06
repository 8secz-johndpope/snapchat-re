package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: adgh */
public final class adgh implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(adgf.SHOULD_COMPENSATE_SILENT_BUFFER, "camera-config-provider.should-compensate-silent-buffer");
            builder.put(adgf.PLAYER_VIDEO_DECODER_OPERATING_RATE, "camera-config-provider.player-video-decoder-operating-rate");
            builder.put(adgf.TRANSCODING_VIDEO_DECODER_OPERATING_RATE, "camera-config-provider.transcoding-video-decoder-operating-rate");
            builder.put(adgf.SHOULD_CODEC_DROP_FRAME, "camera-config-provider.should-codec-drop-frame");
            builder.put(adgf.THUMBNAILS_FORCE_HARDWARE, "camera-config-provider.mushroom-thumbnails-force-hardware");
            this.a = builder.build();
        }
        return this.a;
    }
}
