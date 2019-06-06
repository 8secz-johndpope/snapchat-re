package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: dne */
public final class dne implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ANDROID_CAMERA2_AND_TAKEPICTURE_API_v2";
            String str2 = "ENABLED";
            builder.put(dnd.USE_CAMERA2, new hxh(str, str2, true));
            builder.put(dnd.ASYNC_RELEASE_CAMERA, new hxh("ANDROID_RELEASE_CAMERA", "async_release", true));
            String str3 = "MUSHROOM_CAMERA1_TAKE_PICTURE_API";
            builder.put(dnd.CAMERA1_MAIN_CAMERA_FRONT_FACING_TAKE_PICTURE_API, new hxh(str3, "main_front_enabled", true));
            builder.put(dnd.CAMERA1_MAIN_CAMERA_BACK_FACING_TAKE_PICTURE_API, new hxh(str3, "main_back_enabled", true));
            builder.put(dnd.CAMERA1_FEED_CAMERA_FRONT_FACING_TAKE_PICTURE_API, new hxh(str3, "feed_front_enabled", true));
            builder.put(dnd.CAMERA1_FEED_CAMERA_BACK_FACING_TAKE_PICTURE_API, new hxh(str3, "feed_back_enabled", true));
            String str4 = "PARAM_FRONT_FACING";
            builder.put(dnd.CAMERA2_FRONT_FACING_TAKE_PICTURE_API_STATE, new hxh(str, str4, true));
            String str5 = "PARAM_BACK_FACING";
            builder.put(dnd.CAMERA2_BACK_FACING_TAKE_PICTURE_API_STATE, new hxh(str, str5, true));
            str = "front_timeout";
            builder.put(dnd.CAMERA1_FRONT_FACING_TAKE_PICTURE_API_TIMEOUT_MS, new hxh(str3, str, true));
            String str6 = "back_timeout";
            builder.put(dnd.CAMERA1_BACK_FACING_TAKE_PICTURE_API_TIMEOUT_MS, new hxh(str3, str6, true));
            str3 = "ANDROID_CAMERA1_TAKE_PICTURE_API_NEW_TIMEOUT_CONTROL";
            builder.put(dnd.CAMERA1_TAKE_PICTURE_API_FRONT_FACING_NEW_TIMEOUT_CONTROL_STATE, new hxh(str3, "front_enabled", true));
            builder.put(dnd.CAMERA1_TAKE_PICTURE_API_BACK_FACING_NEW_TIMEOUT_CONTROL_STATE, new hxh(str3, "back_enabled", true));
            builder.put(dnd.CAMERA1_TAKE_PICTURE_API_FRONT_FACING_NEW_TIMEOUT_CONTROL_TIMEOUT_MS, new hxh(str3, str, true));
            builder.put(dnd.CAMERA1_TAKE_PICTURE_API_BACK_FACING_NEW_TIMEOUT_CONTROL_TIMEOUT_MS, new hxh(str3, str6, true));
            str = "ANDROID_CAMERA1_FRONT_FACING_SHARPNESS";
            builder.put(dnd.CAMERA1_FRONT_FACING_SHARPNESS_ADJUSTMENT_ENABLED, new hxh(str, str2, true));
            builder.put(dnd.CAMERA1_FRONT_FACING_SHARPNESS_PERCENTAGE, new hxh(str, "sharpness_percentage", true));
            builder.put(dnd.SUGGESTED_BITRATE, new hxh("PIXEL_HIGH_BITRATE_RECORDING", "SUGGESTED_BITRATE", true));
            str = "ANDROID_CAMERA2_ZSL_EXPERIMENT";
            builder.put(dnd.IS_CAMERA2_ZSL_ENABLED_FRONT_FACING, new hxh(str, str4, true));
            builder.put(dnd.IS_CAMERA2_ZSL_ENABLED_BACK_FACING, new hxh(str, str5, true));
            builder.put(dnd.CAMERA2_ISO_BUG_DETECTION, new hxh("ANDROID_CAMERA2_ISO_BUG_DETECTION", str2, true));
            builder.put(dnd.MEDIA_RECORDER_USE_SINGLETON_THREAD, new hxh("CAMERA_THREAD", "RECORDER_SINGLETON_THREAD", true));
            builder.put(dnd.AUDIO_BUFFER_ENABLED, new hxh("RECORDER_AUDIO_BUFFER", str2, true));
            builder.put(dnd.RECORDER_GOP_SIZE, new hxh("RECORDER_GOP_SIZE", "GOP_SIZE", true));
            str = "ANDROID_SAMSUNG_CAMERA_SDK";
            builder.put(dnd.ENABLE_SAMSUNG_CAMERA_SDK_FRONT_FACING, new hxh(str, "FRONT_FACING", true));
            builder.put(dnd.ENABLE_SAMSUNG_CAMERA_SDK_BACK_FACING, new hxh(str, "BACK_FACING", true));
            str = "ANDROID_CAMERA_MODE_EXPERIMENT";
            builder.put(dnd.BATCH_CAPTURE, new hxh(str, "BATCH_CAPTURE", true));
            builder.put(dnd.RESET_AFTER_CAPTURE, new hxh(str, "RESET_AFTER_CAPTURE", true));
            builder.put(dnd.ENABLE_COUNT_DOWN_TIMER, new hxh(str, "TIMER", true));
            builder.put(dnd.ENABLE_PORTRAIT_MODE, new hxh(str, "PORTRAIT", true));
            builder.put(dnd.ENABLE_GRID_LEVEL, new hxh(str, "GRID_LEVEL", true));
            builder.put(dnd.ENABLE_FACE_PRIORITY, new hxh("FACE_PRIORITY_EXPERIMENT_V2", "PARAM_FACE_PRIORITY", true));
            builder.put(dnd.ENABLE_TAP_TO_EXPOSURE, new hxh("ANDROID_TAP_TO_EXPOSURE", str2, true));
            str3 = "FACE_ACCESSIBILITY_EXPERIMENT";
            builder.put(dnd.ENABLE_FACE_ACCESSIBILITY, new hxh(str3, str2, true));
            builder.put(dnd.FACE_ACCESSIBILITY_INTERVAL_MS, new hxh(str3, "PARAM_INTERVAL_MS", true));
            builder.put(dnd.FACE_ACCESSIBILITY_ANNOUNCEMENT_DELAY_MS, new hxh(str3, "PARAM_ANNOUNCEMENT_DELAY_MS", true));
            builder.put(dnd.ENABLE_MEDIA_RECOVERY, new hxh("ANDROID_SNAP_RECOVERY", str2, true));
            builder.put(dnd.ENABLE_BATCH_CAPTURE_RECOVERY, new hxh(str, "BATCH_RECOVERY", true));
            builder.put(dnd.MEDIA_RECOVERY_TIMEOUT, new hxh("ANDROID_SNAP_RECOVERY", "CAPTURE_TO_RECOVER_THRESHOLD", true));
            str = "enabled";
            builder.put(dnd.ENABLE_UNIFIED_CAMERA_OPEN, new hxh("ANDROID_UNIFIED_CAMERA_OPEN", str, true));
            builder.put(dnd.EARLY_INIT_RECORDER_ENABLED, new hxh("MUSHROOM_EARLY_INIT_RECORDER", str2, true));
            builder.put(dnd.DELAY_RELEASE_RECORDER_MS, new hxh("MUSHROOM_EARLY_INIT_RECORDER", "DELAY_RELEASE_RECORDER_MS", true));
            builder.put(dnd.START_IMAGE_PREVIEW_ON_TOUCH_UP, new hxh("lighter_capture_animation_android", str, true));
            builder.put(dnd.PREPARE_EGL_BEFORE_CREATING_TEXTURE, new hxh("PREPARE_EGL_BEFORE_CREATING_TEXTURE", str2, true));
            builder.put(dnd.OPEN_CAMERA_ON_CAMERA_PAGE_ONLY, new hxh("ANDROID_OPEN_CAMERA_ON_CAMERA_PAGE_ONLY", str2, true));
            builder.put(dnd.FRIENDS_SWIPE_TEACHING_TOOLTIP_ENABLED, new hxh("ANDROID_FRIENDS_SWIPE_TEACHING_TOOLTIP", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
