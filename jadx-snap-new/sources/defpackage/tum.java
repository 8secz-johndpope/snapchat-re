package defpackage;

import defpackage.fth.a;
import java.lang.reflect.Type;

/* renamed from: tum */
public enum tum implements fth {
    IMAGE_TIMER_DEFAULT_VALUE(a.a(0)),
    VIDEO_TIMER_LOOP_PLAYBACK(a.a(false)),
    COLOR_PICKER_DEFAULT_COLOR_STATE(a.a((Type) tov.class, "{}")),
    SOUND_TOOLS_USE_AUTOTUNE_TO_REPLACE_OWL(a.a(false)),
    DRAWING_SMOOTHING_ENABLED(a.a(true)),
    DRAWING_SMOOTHING_WINDOW_SIZE(a.a(3)),
    USER_TAGGING(a.a(true)),
    DRAWING_V2(a.a(false)),
    SKY_FILTER(a.a(false)),
    PREVIEW_PAGE_PRELOAD(a.a(true)),
    PINNABLE_CAPTION_ENABLED(a.a(true)),
    DYNAMIC_CAPTIONS_V25(a.a(false)),
    FAST_MOTION_FILTER_ENABLED(a.a(false)),
    SNAP_CROP_ENABLED(a.a(false)),
    CAPTION_HARDWARE_RENDERING(a.a(false)),
    VENUE_FILTERS_ENABLED(a.a(true)),
    PREVIEW_UX(a.a(false)),
    TOOL_BUTTON_LONG_PRESS_ENABLED(a.a(false)),
    DYNAMIC_CAPTIONS_NONLATIN(a.a(false)),
    CAPTION_HARDWARE_RENDERING_NONLATIN(a.a(false)),
    HAS_SEEN_DIRECT_POST_STORY_WARNING(a.a(false)),
    SHOW_CAPTION_CAROUSEL_AFTER_KEYBOARD(a.a(false)),
    BLACK_SCREEN_ANIMATION(a.a(false)),
    LENSES_IN_FILTER_CAROUSEL(a.a(false)),
    CAPTION_BAR(a.a(false)),
    HAS_SEEN_CAPTION_ONBOARDING_MESSAGE(a.a(false)),
    HAS_SEEN_SWIPE_FILTERS_ONBOARDING_MESSAGE(a.a(false)),
    HAS_SEEN_SOUND_TOOLS_TOOLTIP(a.a(false)),
    HAS_SEEN_AUTO_STICKER_GENERATION_TOOLTIP(a.a(false)),
    HAS_SEEN_HOMETAB_PICKER_TOOLTIP(a.a(false)),
    HAS_SEEN_UNLOCKABLE_STICKER_TOOLTIP(a.a(false)),
    HAS_SEEN_ANIMATED_STICKER_TOOLTIP(a.a(false)),
    HAS_SEEN_OR_USED_SNAP_CROP_TOOLTIP(a.a(false)),
    HAS_SEEN_GIPHY_STICKER_TOOLTIP(a.a(false)),
    FACE_CRAFT_TOOLTIP(a.a(false)),
    HAS_SEEN_MULTISNAP_DELETION_DIALOG(a.a(false)),
    HAS_SEEN_MULTISNAP_TRIMMING_TOOLTIP(a.a(false)),
    HAS_SEEN_POST_STORY_DIALOG(a.a(false)),
    ANDROID_PREVIEW_SWIPE_DOWN_TO_DISMISS(a.a(false)),
    LAST_USED_BRUSH_COLOR(a.a(0)),
    EMOJI_BRUSH_EMOJI_LIST(a.a("")),
    LAST_FETCH_EMOJI_BRUSH_RESOURCE_TIMESTAMP(a.a(0)),
    HAS_SEEN_NEW_EMOJI_BRUSH_LIST(a.a(false)),
    EMOJI_BRUSH_EMOJI_LIST_VERSION(a.a("0")),
    CLIPBOARD_DETECTOR_OPTION_SELECTED(a.a(false)),
    CLIPBOARD_DETECTOR_ENABLED(a.a(false));
    
    private final a<?> delegate;

    private tum(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.PREVIEW;
    }
}
