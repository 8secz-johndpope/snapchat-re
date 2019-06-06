package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: vjw */
public final class vjw implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(vju.ANIMATED_IMAGE_MAX_DIMENSION, "camera-config-provider.mushroom-animated-image-max-dimension");
            builder.put(vju.ENABLE_SOFTWARE_CODEC_ALLTIME, "camera-config-provider.software-decoder-transcoding");
            builder.put(vju.ENABLE_SOFTWARE_CODEC_RETRY, "camera-config-provider.software-decoder-transcoding-retry");
            builder.put(vju.ENABLE_SOFTWARE_ENCODE_CODEC, "camera-config-provider.software-encoder-transcoding");
            builder.put(vju.ENABLE_SOFTWARE_DECODE_CODEC, "camera-config-provider.software-decoder-transcoding-mode");
            builder.put(vju.TRANSCODING_MAX_ATTEMPTS, "camera-config-provider.mushroom-transcoding-max-attempts");
            builder.put(vju.ENABLE_SERIAL_TASK_EXECUTION, "camera-config-provider.mushroom-serial-task-execution");
            builder.put(vju.LAGUNA_HD_SENDING_RESOLUTION, "camera-config-provider.lagunahd-sending-resolution");
            builder.put(vju.LAGUNA_SENDING_BITRATE, "camera-config-provider.laguna-sending-bitrate");
            builder.put(vju.MALIBU_SENDING_RESOLUTION, "camera-config-provider.malibu-sending-resolution");
            this.a = builder.build();
        }
        return this.a;
    }
}
