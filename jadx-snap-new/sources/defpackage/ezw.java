package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ezw */
public final class ezw implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(ezu.HAS_SEEN_CHAT_DOCK_TOOLTIP, new hxo("has_seen_dock_tooltip", hxr.TOOLTIP));
            builder.put(ezu.HAS_SEEN_VPL_TOOLTIP, new hxo("has_seen_vpl_tooltip", hxr.TOOLTIP));
            builder.put(ezu.HAS_ENABLED_VPL, new hxo("has_enabled_vpl", hxr.TOOLTIP));
            builder.put(ezu.HAS_SEEN_RING_TOOLTIP, new hxo("has_seen_ring_tooltip", hxr.TOOLTIP));
            builder.put(ezu.HAS_ENABLED_RING, new hxo("has_enabled_ring", hxr.TOOLTIP));
            builder.put(ezu.HAS_SEEN_DRAWER_DIALOG, new hxo("has_seen_drawer_dialog", hxr.TOOLTIP));
            builder.put(ezu.HAS_SEEN_DRAWER_TOOLTIP, new hxo("has_seen_drawer_tooltip", hxr.TOOLTIP));
            builder.put(ezu.HAS_OPENED_DRAWER, new hxo("has_opened_drawer", hxr.TOOLTIP));
            builder.put(ezu.LAST_LOAD_APP_LIST_TIMESTAMP, new hxo("last_load_app_list_timestamp", hxr.CLIENT_PROPERTY));
            this.a = builder.build();
        }
        return this.a;
    }
}
