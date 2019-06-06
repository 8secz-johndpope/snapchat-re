package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zpv */
public final class zpv implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "enabled";
            builder.put(zpt.UNLOCKABLES_GATING_ENABLED, new hxh("UNLOCKABLES_GATING", str, true));
            String str2 = "isEnabled";
            builder.put(zpt.UNLOCKABLES_SUPPLY_GTQ_CHECKSUM_REQUEST, new hxh("GTQ_SUPPLY_CHECKSUM_MUSHROOM", str2, true));
            builder.put(zpt.UNLOCKABLES_PROCESS_GTQ_CHECKSUM_RESPONSE, new hxh("GTQ_PROCESS_CHECKSUM_MUSHROOM", str2, true));
            builder.put(zpt.UNLOCKABLES_NETWORK_REQUEST_ENABLED, new hxh("Unlockables_Network_Request_Mushroom", "Enable", true));
            builder.put(zpt.GEOFILTER_ALLOW_GEOFILTER_PAGE_SECTION_UPDATE, new hxh("geofilter_allow_geofilter_page_section_update", str, true));
            builder.put(zpt.UNLOCKABLES_LOCATION_LISTENING_WINDOW_SECONDS, new hxh("Unlockables_Location_Update_Listening_Window", "listeningWindowSeconds", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
