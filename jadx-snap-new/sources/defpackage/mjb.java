package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.looksery.sdk.ProfilingSessionReceiver;
import java.util.Map;

/* renamed from: mjb */
public final class mjb implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(mja.CAMERA_LENS_DEACTIVATE_ON_CLOSE, new hxh("LENSES_CAMERA_DEACTIVATE_ON_CLOSE", str, true));
            String str2 = "LENS_3D_FACE_ESTIMATION";
            builder.put(mja.TRACKING_DATA_NAME, new hxh(str2, "tag", true));
            builder.put(mja.TRACKING_DATA_CHECKSUM, new hxh(str2, "checksum", true));
            str2 = "enabled";
            builder.put(mja.LENS_SCHEDULED_PROTO_FETCH_ENABLED, new hxh("LENS_SCHEDULED_PROTO_FETCH_ENABLED", str2, true));
            builder.put(mja.ENABLE_EXTERNAL_IMAGES, new hxh("LENS_EXTERNAL_IMAGES", str2, true));
            builder.put(mja.LENS_EXPLORER_NATIVE_ENABLED, new hxh("LENS_MUSHROOM_NATIVE_LENS_EXPLORER", str2, true));
            builder.put(mja.LENS_EXPLORER_ENABLE_CREATOR_PROFILE, new hxh("IMPALA_LENS_CREATOR_PROFILES_ANDROID", str2, true));
            builder.put(mja.LENSES_FOREGROUND_PREFETCH_ENABLED, new hxh("LENS_MUSHROOM_PREFETCH", str2, true));
            builder.put(mja.LENSES_FOREGROUND_PREFETCH_RUN_IN_BACKGROUND, new hxh("LENS_MUSHROOM_PREFETCH_RUN_IN_BACKGROUND", str2, true));
            String str3 = "MDP_MUSHROOM_BG_PREFETCH_LENS";
            builder.put(mja.LENSES_BACKGROUND_PREFETCH_ENABLED, new hxh(str3, str2, true));
            builder.put(mja.LENSES_BACKGROUND_PREFETCH_DELAY_MINUTES, new hxh(str3, "DELAY_TIME_MINUTES", true));
            builder.put(mja.LENSES_BACKGROUND_PREFETCH_AFTER_MIDNIGHT_JITTER_MINUTES, new hxh(str3, "PREFETCH_AFTER_MIDNIGHT_JITTER_MINUTES", true));
            builder.put(mja.LENSES_BACKGROUND_PREFETCH_NUM_RETRIES, new hxh(str3, "NUM_RETRIES", true));
            builder.put(mja.LENSES_BACKGROUND_PREFETCH_TIMEOUT_MINUTES, new hxh(str3, "TIMEOUT_MINUTES", true));
            builder.put(mja.LENSES_ACTIVE_USER_EXPIRATION_TIME_IN_MINUTES, new hxh("LENS_MUSHROOM_PREFETCH_ACTIVE_USER", "expiration_time_minutes", true));
            builder.put(mja.DEACTIVATE_LENSES_AFTER_SNAP_SEND, new hxh("DEACTIVATE_LENSES_AFTER_SNAP_SEND", str, true));
            str = "LENS_CORE_DEVICE_CLUSTERING_MAPPING_EXPERIMENT_MR";
            builder.put(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_ENABLED, new hxh(str, "LENS_CORE_DEVICE_CLUSTERING_ENABLED", true));
            builder.put(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_LOW_END_START, new hxh(str, "LENS_CORE_DEVICE_CLUSTERING_LOW_END_START", true));
            builder.put(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_MID_END_START, new hxh(str, "LENS_CORE_DEVICE_CLUSTERING_MID_END_START", true));
            builder.put(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_HIGH_END_START, new hxh(str, "LENS_CORE_DEVICE_CLUSTERING_HIGH_END_START", true));
            str3 = "SERVER_UNKNOWN_DEVICE_CLUSTER";
            builder.put(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_SERVER_UNKNOWN, new hxh(str, str3, true));
            str = "LENS_CORE_DEVICE_CLUSTERING_FEATURE_GATING_MR_V1";
            builder.put(mja.FEATURE_GATING_DEVICE_CLUSTER_ENABLED, new hxh(str, "IS_DEVICE_CLUSTERING_FEATURE_GATING_ENABLED", true));
            builder.put(mja.FEATURE_GATING_DEVICE_CLUSTER_LOW_END_START, new hxh(str, "LOW_END_START_VARIABLE", true));
            builder.put(mja.FEATURE_GATING_DEVICE_CLUSTER_MID_END_START, new hxh(str, "MID_END_START_VARIABLE", true));
            builder.put(mja.FEATURE_GATING_DEVICE_CLUSTER_HIGH_END_START, new hxh(str, "HIGH_END_START_VARIABLE", true));
            builder.put(mja.FEATURE_GATING_DEVICE_CLUSTER_SERVER_UNKNOWN, new hxh(str, str3, true));
            builder.put(mja.MOVE_SPONSORED_GEO_LENSES_TO_BACK, new hxh("LOOKSERY_SPONSORED_GEO_BACK", "force_back_section", true));
            builder.put(mja.LENSES_WEATHER_DATA_ENABLED, new hxh("LENS_WEATHER_DATA", str2, true));
            builder.put(mja.LENSES_RETAIN_LENS_ASSETS, new hxh("LENS_ASSETS_INSTANT_ACCESS_ANDROID", str2, true));
            str = "LENSCORE_PROCESSING_ASYNC_TRACKING_ANDROID_V3";
            builder.put(mja.LENS_PROCESSING_ASYNC_TRACKING_ANDROID_ASYNC_TRACKING_ENABLED, new hxh(str, "async_tracking_enabled", true));
            builder.put(mja.LENS_PROCESSING_ASYNC_TRACKING_ANDROID_ASYNC_TEXREAD_ENABLED, new hxh(str, "face_detect_async_texture_read_enabled", true));
            str = "LENSCORE_HIGH_ACCURACY_FACE_DETECTION";
            builder.put(mja.LENSCORE_HIGH_ACCURACY_FACE_DETECTION_RETRY_TIME, new hxh(str, "retry_time", true));
            builder.put(mja.LENSCORE_HIGH_ACCURACY_FACE_DETECTION_LOAD_PRIORITY, new hxh(str, "load_priority", true));
            builder.put(mja.LENSCORE_HIGH_ACCURACY_FACE_DETECTION_MODE, new hxh(str, ProfilingSessionReceiver.EXTRA_STRING_FIELD_MODE, true));
            str = "LENSCORE_SECOND_FACE_DETECTION_THROTTLE";
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS_HE_ANDROID_MULTIPLIER, new hxh(str, "throttle_ticks_he_android_multiplier", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS_ME_ANDROID_MULTIPLIER, new hxh(str, "throttle_ticks_me_android_multiplier", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS_LE_ANDROID_MULTIPLIER, new hxh(str, "throttle_ticks_le_android_multiplier", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIME_HE_ANDROID_MULTIPLIER, new hxh(str, "throttle_time_he_android_multiplier", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIME_ME_ANDROID_MULTIPLIER, new hxh(str, "throttle_time_me_android_multiplier", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIME_LE_ANDROID_MULTIPLIER, new hxh(str, "throttle_time_le_android_multiplier", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIMES_MILLIS, new hxh(str, "throttle_times_millis", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_STATES_COUNT, new hxh(str, "throttle_states_count", true));
            builder.put(mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS, new hxh(str, "throttle_ticks", true));
            builder.put(mja.LENSCORE_FRAMEBUFFER_FETCH_WHITELIST, new hxh("LENSCORE_FRAMEBUFFER_FETCH_WHITELIST_EXPERIMENT", "framebuffer_fetch_whitelist_extension_gpus", true));
            builder.put(mja.LENSCORE_ASYNC_MIPMAP, new hxh("LENSCORE_ASYNC_MIPMAP_ABTEST_NAME", "kAsyncMipmapABTestKey", true));
            str = "LOOKSERY_SNAPPABLES_VARIABLE";
            builder.put(mja.LENSCORE_SNAPPABLES_CONTEXT_R1, new hxh("LENSCORE_SNAPPABLES_CONTEXT_R1", str, true));
            builder.put(mja.LENSCORE_SNAPPABLES_CONTEXT_R2, new hxh("LENSCORE_SNAPPABLES_CONTEXT_R2", str, true));
            builder.put(mja.LENSCORE_SNAPPABLES_CONTEXT_R3, new hxh("LENSCORE_SNAPPABLES_CONTEXT_R3", str, true));
            builder.put(mja.CLEAR_LENS_PERSISTENT_STORE_SETTINGS_OPTION, new hxh("CLEAR_LENS_PERSISTENT_STORE", "data_clearing_option_enabled", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
