package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ojp */
public final class ojp implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "GALLERY_ON_DEMAND_DROID";
            builder.put(ojo.MEDIA_CACHE_SIZE_MB, new hxh(str, "MAX_USAGE_MB", true));
            builder.put(ojo.MEDIA_CACHE_SIZE_FOR_SPECTACLES_USER_MB, new hxh(str, "LAGUNA_MAX_USAGE_MB", true));
            builder.put(ojo.MEDIA_CACHE_SIZE_PERCENTAGE, new hxh(str, "MEDIA_CACHE_PERCENTAGE", true));
            builder.put(ojo.THUMBNAIL_CACHE_SIZE_MB, new hxh(str, "THUMBNAILS_MAX_MB", true));
            builder.put(ojo.MEMORIES_PROGRESSIVE_DOWNLOAD, new hxh("MEMORIES_ANDROID_PROGRESSIVE_DOWNLOAD", "ENABLED_MUSHROOM", true));
            str = "ENABLED";
            builder.put(ojo.TRANSCODING_DURABLE_JOB, new hxh("MEMORIES_ANDROID_DURABLE_JOB_TRANSCODING", str, true));
            String str2 = "MEMORIES_ANDROID_WIPE_FILE_MANAGER";
            builder.put(ojo.ALLOW_REMOVE_FILE_MANAGER_UNLOCKED_FILES, new hxh(str2, str, true));
            builder.put(ojo.FORCE_REMOVE_FILE_MANAGER_UNLOCKED_FILES, new hxh(str2, "FORCE_ENABLED", true));
            builder.put(ojo.MP4_FAST_START_ENABLED, new hxh("MP4_FAST_START", str, true));
            builder.put(ojo.MULTI_SELECT, new hxh("MEMORIES_ANDROID_SELECT_MODE", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
