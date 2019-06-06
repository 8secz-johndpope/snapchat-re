package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: gvx */
public final class gvx implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(gvt.CATEGORY_SECTIONS, "category-sections");
            builder.put(gvt.DF_INITIAL_PAGE_DB_CACHE, "df-initial-page-db-cache");
            builder.put(gvt.FRIEND_TEACHING_BUTTON_ENABLED, "friend-teaching-button-enabled");
            builder.put(gvt.FRIEND_TEACHING_BUTTON_COOLDOWN_HOURS, "friend-teaching-button-cooldown-hours");
            builder.put(gvt.FRIEND_TEACHING_BUTTON_TRIGGER_HOURS, "friend-teaching-button-trigger-hours");
            builder.put(gvt.FRIEND_TEACHING_BUTTON_NUM_UNVIEWED_STORIES, "friend-teaching-button-num-unviewed-stories");
            builder.put(gvt.RANKING_SERVER_CONFIG_STUDIES, "cheetah_discover_ranking_config.studies");
            this.a = builder.build();
        }
        return this.a;
    }
}
