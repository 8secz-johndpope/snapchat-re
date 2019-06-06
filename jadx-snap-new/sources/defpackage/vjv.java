package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: vjv */
public final class vjv implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(vju.MEMORIES_BACKUP_BITRATE, new hxh("mushroom_transcoding_memories_backup", "bitrate", true));
            builder.put(vju.HIGH_QUALITY_EXPORT, new hxh("mushroom_high_quality_export", "ENABLED", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
