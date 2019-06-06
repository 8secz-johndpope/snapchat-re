package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: qpz */
public final class qpz implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(qpy.ENABLE_SNAP_DATA_REFACTOR, new hxh("mushroom_snap_data_flow_refactor", "ENABLED", true));
            builder.put(qpy.CHAT_MEDIA_PREFETCH_NUM, new hxh("MESSAGING_MEDIA_PREFETCH", "CHAT_MEDIA_PREFETCH_NUM", true));
            builder.put(qpy.ENABLE_STATIC_MEDIA_THUMBNAILS, new hxh("CHAT_STATIC_THUMBNAIL_ANDROID", "CHAT_MEDIA_ENABLED", true));
            String str = "enabled";
            builder.put(qpy.EXOPLAYER_IN_CHAT, new hxh("exoplayer_in_chat", str, true));
            builder.put(qpy.UPDATE_SEQUENCE_NUMBERS_ON_GROUP_VERSION_CHANGE, new hxh("update_sequence_numbers_on_group_version_change", str, true));
            builder.put(qpy.PRELOAD_CHAT_VIEW_MODELS, new hxh("preload_chat_view_models", str, true));
            builder.put(qpy.ENABLE_ADD_FRIEND_FOR_SHARE, new hxh("add_friend_for_shared_card", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
