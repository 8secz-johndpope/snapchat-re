package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;

/* renamed from: drd */
public final class drd implements dpf {
    public ftl a;
    private final Map<dnd, Supplier<Boolean>> b = ImmutableMap.builder().put(dnd.NATIVE_FRONT_FACING_ZOOM_ENABLED, Suppliers.memoize(new -$$Lambda$drd$jJeaKtmxU2bmt-51eayWzcUHMRA(this))).build();
    private final Map<dnd, Supplier<Integer>> c = ImmutableMap.builder().put(dnd.MODIFIED_MAX_ZOOM_ENABLED, Suppliers.memoize(new -$$Lambda$drd$vdOO3qmCodhhVZaVg1-rBN3756Y(this))).build();

    private /* synthetic */ Integer aw() {
        return this.a.a(dnd.MODIFIED_MAX_ZOOM_ENABLED) ? Integer.valueOf(99) : null;
    }

    private /* synthetic */ Boolean ax() {
        return Boolean.valueOf(this.a.a(dnd.NATIVE_FRONT_FACING_ZOOM_ENABLED));
    }

    public final boolean A() {
        return this.a.a(dnd.SC_MEDIA_RECORDER_RECOMMENDED);
    }

    public final boolean B() {
        return this.a.a(dnd.SC_MEDIA_RECORDER_ENABLED);
    }

    public final boolean C() {
        return this.a.a(dnd.OFF_SCREEN_SCREENSHOT_ENABLED);
    }

    public final Optional<Boolean> D() {
        return Optional.absent();
    }

    public final boolean E() {
        return this.a.a(dnd.ANDROID_MEDIA_RECORDER_SURFACE_RECORDING_ENABLED);
    }

    public final boolean F() {
        return this.a.a(dnd.HIGH_CONSTANT_FPS_SCHEME_ENABLED);
    }

    public final int G() {
        return this.a.f(dnd.BUFFER_COUNT_FOR_MULTIPLE_FRAME_BUFFER);
    }

    public final boolean H() {
        return this.a.f(dnd.PREVIEW_RESOLUTION_PROVIDER) == 0;
    }

    public final boolean I() {
        return this.a.f(dnd.RECORDING_RESOLUTION_PROVIDER) == 0;
    }

    public final boolean J() {
        return this.a.f(dnd.PICTURE_RESOLUTION_PROVIDER) == 0;
    }

    public final int K() {
        return this.a.f(dnd.PREVIEW_RESOLUTION_UPPER_BOUND);
    }

    public final String L() {
        return this.a.y(dnd.CAMERA2_PICTURE_MODE).name();
    }

    public final int M() {
        return this.a.f(dnd.NO_TRANSCODING_TARGET_HEIGHT);
    }

    public final int N() {
        return this.a.f(dnd.CAMERA2_LOWLIGHT_ISO_THRESHOLD);
    }

    public final int O() {
        return this.a.f(dnd.VIDEO_RECORDING_PLAYBACK_ORIENTATION_HINT);
    }

    public final boolean P() {
        return this.a.a(dnd.IMAGE_READER_OR_PB_SURFACE_READER_SUPPORT);
    }

    public final int Q() {
        return this.a.f(dnd.CAMERA_ROTATION_CONSTANT);
    }

    public final boolean R() {
        return this.a.a(dnd.FORCE_FACE_STATISTICS_FOR_FACE_PRIORITY) && this.a.a(dnd.ENABLE_FACE_PRIORITY);
    }

    public final Collection<abtl> S() {
        return (Collection) this.a.o(dnd.BUGGY_PREVIEW_SIZES);
    }

    public final boolean T() {
        return this.a.a(dnd.SHOULD_SET_NULL_ISO_CAMERA2);
    }

    public final boolean U() {
        return this.a.a(dnd.CAMERA2_ISO_BUG_DETECTION);
    }

    public final boolean V() {
        return this.a.a(dnd.CAMERA2_LOWLIGHT_MODE_ENABLED);
    }

    public final boolean W() {
        return this.a.a(dnd.FORCE_CAMERA_30_FPS);
    }

    public final boolean X() {
        return this.a.a(dnd.SAMSUNG_AAC_CODEC_ENABLED);
    }

    public final boolean Y() {
        return this.a.a(dnd.MEDIA_QUALITY_AUTOMATION_TEST_ENABLED);
    }

    public final boolean Z() {
        return this.a.a(dnd.USE_TRANSCODING);
    }

    public final boolean a() {
        return this.a.a(dnd.USE_CAMERA2);
    }

    public final boolean a(boolean z) {
        return this.a.a(z ? dnd.CAMERA1_FRONT_FACING_TAKE_PICTURE_API_WITH_FLASH : dnd.CAMERA1_BACK_FACING_TAKE_PICTURE_API_WITH_FLASH);
    }

    public final boolean a(boolean z, boolean z2) {
        if (z2) {
            return this.a.a(z ? dnd.CAMERA1_MAIN_CAMERA_FRONT_FACING_TAKE_PICTURE_API : dnd.CAMERA1_MAIN_CAMERA_BACK_FACING_TAKE_PICTURE_API);
        }
        return this.a.a(z ? dnd.CAMERA1_FEED_CAMERA_FRONT_FACING_TAKE_PICTURE_API : dnd.CAMERA1_FEED_CAMERA_BACK_FACING_TAKE_PICTURE_API);
    }

    public final String aa() {
        return Z() ? "LOCAL_ENABLED" : "LOCAL_DISABLED";
    }

    public final boolean ab() {
        return this.a.a(dnd.MEDIA_RECORDER_USE_SINGLETON_THREAD);
    }

    public final boolean ac() {
        return this.a.a(dnd.AUDIO_BUFFER_ENABLED);
    }

    public final int ad() {
        return this.a.f(dnd.RECORDER_GOP_SIZE);
    }

    public final boolean ae() {
        return this.a.a(dnd.ENABLE_FACE_PRIORITY);
    }

    public final boolean af() {
        return this.a.a(dnd.ENABLE_TAP_TO_EXPOSURE);
    }

    public final boolean ag() {
        return this.a.a(dnd.ENABLE_FACE_ACCESSIBILITY);
    }

    public final int ah() {
        return this.a.f(dnd.FACE_ACCESSIBILITY_EDGE_PIXEL);
    }

    public final long ai() {
        return (long) this.a.f(dnd.FACE_ACCESSIBILITY_INTERVAL_MS);
    }

    public final long aj() {
        return (long) this.a.f(dnd.FACE_ACCESSIBILITY_ANNOUNCEMENT_DELAY_MS);
    }

    public final boolean ak() {
        return this.a.a(dnd.ENABLE_CAMERA2_OIS);
    }

    public final boolean al() {
        return this.a.a(dnd.ENABLE_SHUTTER_PRIORITY);
    }

    public final int am() {
        return this.a.f(dnd.SHUTTER_PRIORITY_ISO_MAX_THRESHOLD);
    }

    public final long an() {
        return this.a.h(dnd.SHUTTER_PRIORITY_EXPOSURE_MAX_THRESHOLD_NS);
    }

    public final ajdx<Boolean> ao() {
        return this.a.b(dnd.IS_CODEC_LEASING_ENGINE_ENABLED_IN_MUSHROOM);
    }

    public final ajdx<Long> ap() {
        return this.a.i(dnd.CODEC_LEASE_TIMEOUT_THRESHOLD);
    }

    public final boolean aq() {
        return this.a.a(dnd.ENABLE_SOFTWARE_ENCODER);
    }

    public final boolean ar() {
        return this.a.a(dnd.ENABLE_CONSTANT_QUALITY_MODE_RECORDING);
    }

    public final int as() {
        return this.a.f(dnd.CAMERA2_SUGGESTED_HARDWARE_LEVEL);
    }

    public final boolean at() {
        return this.a.a(dnd.SHOULD_RECORDER_REQUEST_IFRAME_MANUALLY);
    }

    public final boolean au() {
        return this.a.a(dnd.FORCE_TO_USE_SOFTWARE_RECORDING);
    }

    public final boolean av() {
        return this.a.a(dnd.PREPARE_EGL_BEFORE_CREATING_TEXTURE);
    }

    public final long b(boolean z) {
        return this.a.h(z ? dnd.CAMERA1_FRONT_FACING_TAKE_PICTURE_API_TIMEOUT_MS : dnd.CAMERA1_BACK_FACING_TAKE_PICTURE_API_TIMEOUT_MS);
    }

    public final boolean b() {
        return this.a.a(dnd.ASYNC_RELEASE_CAMERA);
    }

    public final Optional<Boolean> c() {
        Object obj;
        int f = this.a.f(dnd.TAKE_PICTURE_METHOD);
        if (f == 0) {
            obj = Boolean.FALSE;
        } else if (f != 1) {
            return Optional.absent();
        } else {
            obj = Boolean.TRUE;
        }
        return Optional.of(obj);
    }

    public final boolean c(boolean z) {
        return this.a.a(z ? dnd.CAMERA1_TAKE_PICTURE_API_FRONT_FACING_NEW_TIMEOUT_CONTROL_STATE : dnd.CAMERA1_TAKE_PICTURE_API_BACK_FACING_NEW_TIMEOUT_CONTROL_STATE);
    }

    public final long d() {
        return this.a.h(dnd.CAMERA1_TAKE_PICTURE_NO_CALLBACK_WAITING_MS);
    }

    public final long d(boolean z) {
        return this.a.h(z ? dnd.CAMERA1_TAKE_PICTURE_API_FRONT_FACING_NEW_TIMEOUT_CONTROL_TIMEOUT_MS : dnd.CAMERA1_TAKE_PICTURE_API_BACK_FACING_NEW_TIMEOUT_CONTROL_TIMEOUT_MS);
    }

    public final int e() {
        return this.a.f(dnd.SUGGESTED_BITRATE);
    }

    public final boolean e(boolean z) {
        return this.a.a(z ? dnd.IS_CAMERA2_ZSL_ENABLED_FRONT_FACING : dnd.IS_CAMERA2_ZSL_ENABLED_BACK_FACING);
    }

    public final boolean f() {
        return this.a.a(dnd.IS_CAMERA1_ZSL_ENABLED);
    }

    public final boolean f(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA1_FRONT_FACING_RECORDING_HINT_TIMING;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA1_BACK_FACING_RECORDING_HINT_TIMING;
        }
        return ftl.f(fth) == 0;
    }

    public final boolean g() {
        return this.a.a(dnd.GLES3_ALLOWED);
    }

    public final boolean g(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA1_FRONT_FACING_RECORDING_HINT_TIMING;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA1_BACK_FACING_RECORDING_HINT_TIMING;
        }
        return ftl.f(fth) == 1;
    }

    public final float h() {
        return this.a.c(dnd.CAMERA2_LOWLIGHT_COMPENSATION_VALUE);
    }

    public final int h(boolean z) {
        return this.a.f(z ? dnd.CAMERA1_FRONT_FACING_PICTURE_TARGET_HEIGHT : dnd.CAMERA1_BACK_FACING_PICTURE_TARGET_HEIGHT);
    }

    public final int i(boolean z) {
        return this.a.f(z ? dnd.CAMERA2_GPU_PHOTO_TARGET_HEIGHT : dnd.CAMERA2_JPEG_PICTURE_TARGET_HEIGHT);
    }

    public final boolean i() {
        return this.a.a(dnd.CAMERA2_STILL_CAPTURE_INTENT_ENABLED);
    }

    public final int j() {
        return this.a.f(dnd.PICTURE_NOISE_REDUCTION_MODE_OVERRIDE);
    }

    public final abtl j(boolean z) {
        return (abtl) this.a.o(z ? dnd.FRONT_FACING_PREVIEW_RESOLUTION_OVERRIDE : dnd.BACK_FACING_PREVIEW_RESOLUTION_OVERRIDE);
    }

    public final abtl k(boolean z) {
        return (abtl) this.a.o(z ? dnd.FRONT_FACING_RECORDING_RESOLUTION_OVERRIDE : dnd.BACK_FACING_RECORDING_RESOLUTION_OVERRIDE);
    }

    public final boolean k() {
        return ((Boolean) ((Supplier) this.b.get(dnd.NATIVE_FRONT_FACING_ZOOM_ENABLED)).get()).booleanValue();
    }

    public final abtl l(boolean z) {
        return (abtl) this.a.o(z ? dnd.FRONT_FACING_PICTURE_RESOLUTION_OVERRIDE : dnd.BACK_FACING_PICTURE_RESOLUTION_OVERRIDE);
    }

    public final boolean l() {
        return this.a.a(dnd.VIDEO_STABILIZATION_ENABLED);
    }

    public final abpr m(boolean z) {
        return (abpr) this.a.o(z ? dnd.FRONT_SENSOR_SIZE : dnd.BACK_SENSOR_SIZE);
    }

    public final boolean m() {
        return this.a.a(dnd.AUTO_FOCUS_WITH_TORCH_ENABLED);
    }

    public final String n() {
        return "ois-supported";
    }

    public final boolean n(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA2_FRONT_FACING_TAKE_PICTURE_API_WITH_FLASH;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA2_BACK_FACING_TAKE_PICTURE_API_WITH_FLASH;
        }
        return ftl.a(fth);
    }

    public final String o() {
        return "ois";
    }

    public final boolean o(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA2_FRONT_FACING_TAKE_PICTURE_API_STATE;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA2_BACK_FACING_TAKE_PICTURE_API_STATE;
        }
        return ftl.a(fth);
    }

    public final String p() {
        return "still";
    }

    public final boolean p(boolean z) {
        return !z ? false : this.a.a(dnd.CAMERA1_FRONT_FACING_SHARPNESS_ADJUSTMENT_ENABLED);
    }

    public final float q(boolean z) {
        return z ? this.a.c(dnd.CAMERA1_FRONT_FACING_SHARPNESS_PERCENTAGE) : -1.0f;
    }

    public final String q() {
        return "off";
    }

    public final boolean r() {
        return this.a.a(dnd.MULTIPLE_FRAME_BUFFER_ENABLED);
    }

    public final boolean r(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA1_FRONT_FACING_SHOULD_DISABLE_SHUTTER_SOUND;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA1_BACK_FACING_SHOULD_DISABLE_SHUTTER_SOUND;
        }
        return ftl.a(fth);
    }

    public final boolean s() {
        return this.a.a(dnd.USE_IMAGE_READER_FOR_SCREENSHOT);
    }

    public final boolean s(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA1_FRONT_FACING_SHOULD_DISABLE_SHUTTER_SOUND_BY_NULL_SHUTTER_CALLBACK;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA1_BACK_FACING_SHOULD_DISABLE_SHUTTER_SOUND_BY_NULL_SHUTTER_CALLBACK;
        }
        return ftl.a(fth);
    }

    public final long t(boolean z) {
        ftl ftl;
        fth fth;
        if (z) {
            ftl = this.a;
            fth = dnd.CAMERA1_FRONT_FACING_MOCK_SHUTTER_CALLBACK_TIME_MS;
        } else {
            ftl = this.a;
            fth = dnd.CAMERA1_BACK_FACING_MOCK_SHUTTER_CALLBACK_TIME_MS;
        }
        return ftl.h(fth);
    }

    public final boolean t() {
        return this.a.a(dnd.VIDEO_HIGH_QUALITY_RECORDING);
    }

    public final boolean u() {
        return this.a.a(dnd.VIDEO_HIGH_BITRATE_RECORDING);
    }

    public final boolean u(boolean z) {
        return this.a.a(z ? dnd.ENABLE_SAMSUNG_CAMERA_SDK_FRONT_FACING : dnd.ENABLE_SAMSUNG_CAMERA_SDK_BACK_FACING);
    }

    public final boolean v() {
        return this.a.a(dnd.DISABLE_DISTORTION_CORRECTION);
    }

    public final boolean w() {
        return this.a.a(dnd.CAN_SET_JPEG_THUMBNAIL_SIZE_TO_ZERO);
    }

    public final Integer x() {
        return (Integer) ((Supplier) this.c.get(dnd.MODIFIED_MAX_ZOOM_ENABLED)).get();
    }

    public final int y() {
        return this.a.f(dnd.LIGHT_MODE_CONTROLLER_WINDOW_SIZE);
    }

    public final int z() {
        return this.a.f(dnd.AUTOFOCUS_TIMEOUT);
    }
}
