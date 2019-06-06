package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: adgg */
public final class adgg implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(adgf.MEDIA_PLAYER_USE_MP4METADATA_DEFAULT, new hxh("MEDIA_PLAYER_USE_MP4METADATA_DEFAULT", str, true));
            builder.put(adgf.ENABLE_NEW_IMAGE_PLAYER, new hxh("IMAGE_PLAYER_REDESIGN", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
