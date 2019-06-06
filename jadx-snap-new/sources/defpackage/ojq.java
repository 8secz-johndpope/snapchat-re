package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ojq */
public final class ojq implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(ojo.BACKUP_ON_CELLULAR_ENABLED, new hxo("gallery_back_up_on_cellular", hxr.FEATURE_SETTING));
            builder.put(ojo.SAVING_OPTION, new hxo("gallery_snap_save_option", hxr.FEATURE_SETTING));
            builder.put(ojo.STORY_AUTO_SAVING, new hxo("gallery_story_auto_saving", hxr.FEATURE_SETTING));
            builder.put(ojo.SYNC_REQUIRED, new hxo("gallery_sync_required", hxr.FEATURE_SETTING));
            builder.put(ojo.FORCED_RESYNC_REQUIRED, new hxo("gallery_forced_sync_required", hxr.FEATURE_SETTING));
            builder.put(ojo.MY_EYES_ONLY_ENABLED, new hxo("gallery_private_gallery_enabled", hxr.FEATURE_SETTING));
            builder.put(ojo.MY_EYES_ONLY_PASSPHRASE_ENABLED, new hxo("gallery_top_secret_private_gallery_enabled", hxr.FEATURE_SETTING));
            builder.put(ojo.HAS_SEEN_SNAPS_V3_ONBOARDING, new hxo("snaps_v3_onboarding", hxr.TOOLTIP));
            this.a = builder.build();
        }
        return this.a;
    }
}
