package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Supplier;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.abtg.a;
import defpackage.szw.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Observer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sqh */
public final class sqh extends szw implements szd {
    public static final b<sqf> A = new b("image_media_info");
    public static final b<sps> B = new b("image_docking");
    public static final b<Boolean> C = new b("image_zoom_enabled");
    public static final b<Integer> D = new b("image_width");
    public static final b<Integer> E = new b("image_height");
    public static final b<a> F = new b("image_scale_type");
    public static final b<Boolean> G = new b("reload_image");
    public static final b<spu> H = new b("image_type");
    public static final b<Boolean> I = new b("blurring_context_menu");
    public static final b<Boolean> J = new b("mute_on_entering_context_menu");
    public static final b<sqf> K = new b("overlay_image_media_info");
    public static final b<sps> L = new b("overlay_image_docking");
    public static final b<String> M = new b("arrow_text");
    public static final b<Integer> N = new b("arrow_opacity");
    public static final b<Boolean> O = new b("arrow_gradient");
    public static final b<spm> P = new b("arrow_direction");
    public static final b<Boolean> Q = new b("arrow_animate");
    public static final b<Integer> R = new b("arrow_color");
    public static final b<String> S = new b("remote_video_id");
    public static final b<Boolean> T = new b("remote_video_disable_controls");
    public static final b<spo> U = new b("remote_video_caption_mode");
    public static final b<sqk> V = new b("perspective_change_metadata");
    public static final b<sqf> W = new b("rotating_video_media_info");
    public static final b<Boolean> X = new b("pinchable_content");
    public static final b<Float> Y = new b("rotating_content_scale");
    public static final b<Boolean> Z = new b("IS_SPECTACLE");
    public static final b<spn> a = new b("auto_advance_mode");
    public static final b<Boolean> aA = new b("remote_page_prerender_on_top_snap", Boolean.FALSE);
    public static final b<String> aB = new b("remote_page_url_bar_loading_text");
    public static final b<Boolean> aC = new b("remote_page_use_webview_standardization", Boolean.FALSE);
    public static final b<Boolean> aD = new b("remote_page_disallow_side_swipes", Boolean.FALSE);
    public static final b<Boolean> aE = new b("remote_page_allow_multiple_urls", Boolean.FALSE);
    public static final b<Long> aF = new b("remote_page_multi_web_url_count", null);
    public static final b<Long> aG = new b("remote_page_multi_web_url_index_pos", null);
    public static final b<spw> aH = new b("remote_page_interaction_type", null);
    public static final b<String> aI = new b("remote_page_safe_browsing_validation_token", null);
    public static final b<Boolean> aJ = new b("remote_page_use_scroller", Boolean.TRUE);
    public static final b<Boolean> aK = new b("webview_enable_performance_logging", Boolean.FALSE);
    public static final b<sqf> aL = new b("chrome_custom_tabs_page_url");
    public static final b<sqf> aM = new b("simple_page_url");
    public static final b<String> aN = new b("simple_page_js_initialize_function");
    public static final b<String> aO = new b("simple_page_js_initialize_params");
    public static final b<spp> aP = new b("card_interaction_card_model");
    public static final b<Long> aQ = new b("card_interaction_timeout_threshold");
    public static final b<Boolean> aR = new b("deep_link_attachment_card_view");
    public static final b<String> aS = new b("deep_link_webview_fallback_url");
    public static final b<sqr> aT = new b("swipe_to_camera_model");
    public static final b<String> aU = new b("publisher_name");
    public static final b<String> aV = new b("publisher_footer_text");
    public static final b<String> aW = new b("publisher_edition_id");
    public static final b<String> aX = new b("discover_snap_id");
    public static final b<Boolean> aY = new b("discover_should_link_to_longform");
    public static final b<String> aZ = new b("ad_id");
    public static final b<String> aa = new b("local_web_page_uri");
    public static final b<Map<String, String>> ab = new b("local_web_page_uri_mapping");
    public static final b<String> ac = new b("horizontal_icon_uri");
    public static final b<Boolean> ad = new b("show_subscription_footer");
    public static final b<String> ae = new b("subscription_id");
    public static final b<Integer> af = new b("secondary_color");
    public static final b<tcn> ag = new b("subscribe_source");
    public static final b<Boolean> ah = new b("auto_fill_user_info_provider");
    public static final b<sqf> ai = new b("remote_page_url");
    public static final b<Boolean> aj = new b("remote_page_show_share_button");
    public static final b<sqn> ak = new b("remote_page_show_url_bar");
    public static final b<Boolean> al = new b("remote_page_safety_check_blocking");
    public static final b<UUID> am = new b("remote_page_preload_token");
    public static final b<Boolean> an = new b("remote_page_load_on_visible");
    public static final b<Boolean> ao = new b("remote_page_should_preload_html");
    public static final b<Boolean> ap = new b("remote_page_allow_preload_header");
    public static final b<Boolean> aq = new b("remote_page_allow_hiding_url_bar_on_first_load");
    public static final b<Boolean> ar = new b("remote_page_allow_on_show_on_hide_js_callback");
    public static final b<Boolean> as = new b("remote_page_use_immersive_mode");
    public static final b<Boolean> at = new b("remote_page_allow_javascript_injection", Boolean.FALSE);
    public static final b<Boolean> au = new b("skip_first_safe_browsing_url_check", Boolean.FALSE);
    public static final b<Boolean> av = new b("skip_open_deep_link_url_alert", Boolean.FALSE);
    public static final b<String> aw = new b("webview_no_network_text", "Please check your network connection.");
    public static final b<String> ax = new b("webview_generic_error_text", "Something went wrong.");
    public static final b<String> ay = new b("webview_retry_load_text", "Tap to retry");
    public static final b<String> az = new b("webview_warning_title", "Oops!");
    public static final b<Long> b = new b("auto_advance_time_ms");
    public static final b<String> bA = new b("loading_error_button_text");
    public static final b<Integer> bB = new b("loading_color");
    public static final b<Long> bC = new b("loading_fadeout_ms");
    public static final b<srl> bD = new b("text_overlay");
    public static final b<Boolean> bE = new b("has_chrome", Boolean.FALSE);
    public static final b<String> bF = new b("chrome_display_name");
    public static final b<String> bG = new b("chrome_emoji");
    public static final b<CharSequence> bH = new b("chrome_subtitle");
    public static final b<sqf> bI = new b("chrome_subtitle_icon_url");
    public static final b<Integer> bJ = new b("chrome_secondary_text_icon");
    public static final b<String> bK = new b("chrome_timestamp");
    public static final b<Boolean> bL = new b("chrome_hide_timestamp_in_context_menu");
    public static final b<String> bM = new b("chrome_location_text");
    public static final b<srg.a> bN = new b("chrome_display_icon", srg.a.NO_ICON);
    public static final b<Boolean> bO = new b("should_fade_in_brand_name", Boolean.FALSE);
    public static final b<sqf> bP = new b("chrome_icon_url");
    public static final b<sqt> bQ = new b("timer_shape");
    public static final b<squ> bR = new b("timer_style");
    public static final b<Float> bS = new b("duration_sec");
    public static final b<Float> bT = new b("total_start_time_sec");
    public static final b<Float> bU = new b("total_duration_sec");
    public static final b<Integer> bV = new b("timer_loading_color");
    public static final b<Integer> bW = new b("timer_total_items");
    public static final b<Integer> bX = new b("timer_remaining_items");
    public static final b<sqs> bY = new b("timer_mode", sqs.STATIC);
    public static final b<Boolean> bZ = new b("should_frame");
    public static final b<String> ba = new b("app_install_title");
    public static final b<sqf> bb = new b("app_install_icon_media_info");
    public static final b<String> bc = new b("app_install_package_id");
    public static final b<Map<String, String>> bd = new b("app_install_store_params");
    public static final b<sqe> be = new b("interaction_zone");
    public static final b<spw> bf = new b("interaction_zone_ui_type");
    public static final b<Long> bg = new b("interaction_zone_active_index");
    public static final b<Integer> bh = new b("unskippable_duration_time_in_ms");
    public static final b<Integer> bi = new b("unskippable_resume_progress");
    public static final b<Boolean> bj = new b("is_starting_new_ad_session", Boolean.FALSE);
    public static final b<Boolean> bk = new b("unskippable_tap_left_enabled", Boolean.TRUE);
    public static final b<sqa> bl = new b("loading_state", sqa.LOADED);
    public static final b<Float> bm = new b("loading_progress", null);
    public static final b<Integer> bn = new b("loading_bg_color");
    public static final b<String> bo = new b("loading_subtext");
    public static final b<Boolean> bp = new b("loading_non_retryable_error");
    public static final b<String> bq = new b("debug_media_error_type");
    public static final b<String> br = new b("debug_media_error_desc");
    public static final b<sqf> bs = new b("loading_image_uri");
    public static final b<Integer> bt = new b("loading_image_rotation");
    public static final b<Bitmap> bu = new b("loading_image_bitmap");
    public static final b<Boolean> bv = new b("loading_hide_spinner_on_image_load");
    public static final b<sjv> bw = new b("loading_strategy", sjv.HIDE_ON_MEDIA_LOADED);
    public static final b<Object> bx = new b("logo_state");
    public static final b<String> by = new b("loading_error_header_text");
    public static final b<String> bz = new b("loading_error_sub_text");
    public static final b<Boolean> c = new b("skip_disabled");
    public static final b<sjh> cA = new b("overlay_blob_supplier");
    public static final b<List<sre>> cB = new b("action_menu_options");
    @Deprecated
    public static final b<Boolean> cC = new b("action_menu_button_enabled");
    @Deprecated
    public static final b<Boolean> cD = new b("action_menu_subscribable_user");
    @Deprecated
    public static final b<Boolean> cE = new b("action_menu_has_clicked_subscribe_button");
    @Deprecated
    public static final b<Boolean> cF = new b("action_menu_has_existing_subscriptions");
    public static final b<Boolean> cG = new b("action_menu_button_disabled");
    public static final b<Boolean> cH = new b("subscription_button_enabled");
    public static final b<Boolean> cI = new b("has_existing_subscriptions");
    public static final b<String> cJ = new b("collection_id");
    public static final b<String> cK = new b("collection_type");
    public static final b<Long> cL = new b("collection_position");
    public static final b<Boolean> cM = new b("is_placeholder", Boolean.FALSE);
    public static final b<sqo> cN = new b("lens_animation_params");
    public static final b<Boolean> cO = new b("show_snappable_event_dispatching_layer");
    public static final b<PointF> cP = new b("lens_on_screen_tap");
    public static final b<spr> cQ = new b("navigation_direction");
    public static final b<Supplier<adiv>> cR = new b("render_pass_supplier");
    public static final b<String> cS = new b("download_consumption_source", null);
    public static final b<Boolean> cT = new b("PLAYBACK_ITEM_LOADED");
    public static final b<aajl> cU = new b("PLAYBACK_ITEM_LOADSTATE");
    public static final b<Long> cV = new b("PLAYBACK_MEDIA_SIZE_BYTE");
    public static final b<Boolean> cW = new b("lower_threshold_for_swipe_up", Boolean.FALSE);
    private static final AtomicInteger cZ = new AtomicInteger();
    public static final b<Boolean> ca = new b("should_rotate");
    public static final b<String> cb = new b("newport_media_id");
    public static final b<Boolean> cc = new b("use_newport_viewer");
    public static final b<Boolean> cd = new b("should_rotate_image");
    public static final b<sqj> ce = new b("opera_video_player_type", sqj.DEFAULT_OPERA_PLAYER);
    public static final b<Double> cf = new b("video_playback_rate");
    public static final b<String> cg = new b("sound_tools_effect_path");
    public static final b<String> ch = new b("visual_filter_type");
    public static final b<List<ofx>> ci = new b("opera_pinnable_collection", Collections.emptyList());
    public static final b<abtl> cj = new b("video_resolution", null);
    public static final b<ofq> ck = new b("sc_media_player_render_pass_supplier");
    public static final b<oen> cl = new b("sc_media_player_audio_frame_processing_pass_supplier");
    public static final b<acaj> cm = new b("snap_crop_transform_data");
    public static final b<sqc> cn = new b("opera_image_player_type", sqc.DEFAULT_OPERA_IMAGE_PLAYER);
    public static final b<List<?>> co = new b("debug_item_list");
    public static final b<Integer> cp;
    public static final b<Integer> cq;
    public static final b<String> cr = new b("tutorial_viewed_event_name");
    public static final b<spl.a> cs = new b("tutorial_behavior", spl.f);
    public static final b<String> ct = new b("interstitial_viewed_event_name");
    public static final b<spx> cu = new b("interstitial_behavior", spx.BLOCKING);
    public static final b<sqf> cv = new b(MessageMediaRefModel.URI);
    public static final b<sps> cw = new b("docking");
    public static final b<srf> cx = new b("context_menu");
    public static final b<srg> cy = new b("opera_context_menu_appearance");
    public static final b<Boolean> cz = new b("disable_context_menu_header_click", Boolean.FALSE);
    public static final b<Boolean> d = new b("swipe_left_disabled");
    public static final b<Boolean> e = new b("swipe_forward_disabled");
    public static final b<Boolean> f = new b("touch_disabled");
    public static final b<Integer> g = new b("primary_color");
    public static final b<Integer> h = new b("background_color");
    public static final b<Boolean> i = new b("swipe_disabled");
    public static final b<Integer> j = new b("opera_content_index");
    public static final b<List<spr>> k = new b("override_next_directions");
    public static final b<List<spr>> l = new b("override_previous_directions");
    public static final b<Boolean> m = new b("close_viewer_for_tap_navigation");
    public static final b<sqf> n = new b("video_media_info");
    public static final b<sps> o = new b("video_docking");
    public static final b<sql> p = new b("video_playback_mode");
    public static final b<Integer> q = new b("video_resume_time");
    public static final b<Integer> r = new b("video_duration_ms");
    public static final b<String> s = new b("video_progress_label_text");
    public static final b<Boolean> t = new b("video_progress_v2_enabled");
    public static final b<sqf> u = new b("video_first_frame_media_info");
    public static final b<sps> v = new b("video_first_frame_docking");
    public static final b<Boolean> w = new b("video_first_frame_rotatable");
    public static final b<Boolean> x = new b("video_controller_enabled");
    public static final b<Boolean> y = new b("video_has_audio");
    public static final b<a> z = new b("video_scale_type");
    public final String cX;
    private final int da;
    private String db;

    static {
        b bVar = new b("video_local_path");
        bVar = new b("deep_link_attachment_headline");
        bVar = new b("discover_deep_link_status");
        bVar = new b("has_moment_chrome", Boolean.FALSE);
        bVar = new b("moment_logo_url", null);
        bVar = new b("has_moment_live_update", null);
        String str = "tutorial_layout_resource_id";
        cp = new b(str);
        cq = new b(str);
        bVar = new b("context_menu_hide_edit_send");
        str = "";
        bVar = new b("lens_id", str);
        bVar = new b("lens_metadata", str);
        bVar = new b("lens_params_is_direct_snap", Boolean.TRUE);
        bVar = new b("lens_opera_model_param");
        bVar = new b("lens_story_recipient_user_name");
        bVar = new b("lens_story_mischief_conversation_id");
        bVar = new b("lens_snap_is_last");
    }

    public sqh() {
        this(abpu.a().toString());
    }

    public sqh(String str) {
        this(str, cZ.incrementAndGet());
    }

    private sqh(String str, int i) {
        this.cX = str;
        this.da = i;
    }

    public sqh(sqh sqh) {
        this(sqh.cX, sqh.da);
        a((szw) sqh);
    }

    public final String a() {
        return this.cX;
    }

    @Deprecated
    public final boolean a(sqh sqh) {
        if (Objects.equal(this, sqh)) {
            return false;
        }
        b((szw) sqh);
        setChanged();
        notifyObservers();
        return true;
    }

    @Deprecated
    public final synchronized void addObserver(Observer observer) {
        super.addObserver(observer);
    }

    public final int b() {
        return this.da;
    }

    public final String c() {
        return MoreObjects.toStringHelper("OperaPageModel").add("id", this.cX).add("permId", this.da).add("params", f()).toString();
    }

    /* JADX WARNING: Missing block: B:12:0x0024, code skipped:
            return false;
     */
    public final boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        if (r3 != r4) goto L_0x0004;
    L_0x0002:
        r4 = 1;
        return r4;
    L_0x0004:
        r0 = 0;
        if (r4 == 0) goto L_0x0024;
    L_0x0007:
        r1 = r3.getClass();
        r2 = r4.getClass();
        if (r1 == r2) goto L_0x0012;
    L_0x0011:
        goto L_0x0024;
    L_0x0012:
        r1 = super.equals(r4);
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        return r0;
    L_0x0019:
        r4 = (defpackage.sqh) r4;
        r0 = r3.cX;
        r4 = r4.cX;
        r4 = com.google.common.base.Objects.equal(r0, r4);
        return r4;
    L_0x0024:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(super.hashCode()), this.cX);
    }

    public final String toString() {
        if (this.db == null) {
            String str = "permId";
            this.db = MoreObjects.toStringHelper("OperaPageModel").add("id", this.cX).add(str, this.da).toString();
        }
        return this.db;
    }
}
