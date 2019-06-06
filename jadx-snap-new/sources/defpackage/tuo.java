package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: tuo */
public final class tuo implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(tum.HAS_SEEN_CAPTION_ONBOARDING_MESSAGE, new hxo(EventType.CAPTION, hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE, new hxo("swipe_filters", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_SOUND_TOOLS_TOOLTIP, new hxo("sound_tools_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_AUTO_STICKER_GENERATION_TOOLTIP, new hxo("sticker_facecut_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_HOMETAB_PICKER_TOOLTIP, new hxo("hometab_picker_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_UNLOCKABLE_STICKER_TOOLTIP, new hxo("unlockable_sticker_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_ANIMATED_STICKER_TOOLTIP, new hxo("animated_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_OR_USED_SNAP_CROP_TOOLTIP, new hxo("snap_crop_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_GIPHY_STICKER_TOOLTIP, new hxo("giphy_sticker_tooltip", hxr.TOOLTIP));
            builder.put(tum.FACE_CRAFT_TOOLTIP, new hxo("face_craft", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_MULTISNAP_DELETION_DIALOG, new hxo("multisnap_deletion_dialog", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_MULTISNAP_TRIMMING_TOOLTIP, new hxo("multisnap_trimming_tooltip", hxr.TOOLTIP));
            builder.put(tum.HAS_SEEN_POST_STORY_DIALOG, new hxo("post_story", hxr.TOOLTIP));
            this.a = builder.build();
        }
        return this.a;
    }
}
