package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: tun */
public final class tun implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "enabled";
            builder.put(tum.SKY_FILTER, new hxh("sky_filter_mushroom", str, true));
            builder.put(tum.PREVIEW_PAGE_PRELOAD, new hxh("preview_page_preload", str, true));
            String str2 = "dynamic_caption_mushroom";
            builder.put(tum.DYNAMIC_CAPTIONS_V25, new hxh(str2, str, true));
            builder.put(tum.SNAP_CROP_ENABLED, new hxh("mushroom_snap_crop", str, true));
            String str3 = "enable_hardware_rendering";
            builder.put(tum.CAPTION_HARDWARE_RENDERING, new hxh(str2, str3, true));
            builder.put(tum.PREVIEW_UX, new hxh("PREVIEW_UX", str, true));
            builder.put(tum.TOOL_BUTTON_LONG_PRESS_ENABLED, new hxh("preview_action_buttons_mushroom", str, true));
            str2 = "dynamic_caption_mushroom_nonlatin";
            builder.put(tum.DYNAMIC_CAPTIONS_NONLATIN, new hxh(str2, str, true));
            builder.put(tum.CAPTION_HARDWARE_RENDERING_NONLATIN, new hxh(str2, str3, true));
            builder.put(tum.SHOW_CAPTION_CAROUSEL_AFTER_KEYBOARD, new hxh("caption_tool_init_improvement_mushroom", "carousel_after_keyboard", true));
            builder.put(tum.BLACK_SCREEN_ANIMATION, new hxh("lighter_capture_animation_android", str, true));
            builder.put(tum.ANDROID_PREVIEW_SWIPE_DOWN_TO_DISMISS, new hxh("ANDROID_PREVIEW_GESTURE_NAVIGATION", "isSwipeDownDismissEnabled", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
