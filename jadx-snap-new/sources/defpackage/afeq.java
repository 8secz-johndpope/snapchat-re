package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afer.class)
/* renamed from: afeq */
public class afeq extends aemz implements aezk {
    @SerializedName("mobile")
    public String A;
    @SerializedName("mobile_verification_key")
    public String B;
    @SerializedName("enable_video_transcoding_android")
    public Boolean C;
    @SerializedName("reset_disabled_transcoding_state")
    public aewi D;
    @SerializedName("enable_image_transcoding")
    public Boolean E;
    @SerializedName("transcoding_profile_level_configuration_android")
    public Boolean F;
    @SerializedName("enable_lenses_android")
    public Boolean G;
    @SerializedName("enable_recording_hint_android")
    public Boolean H;
    @SerializedName("enable_fast_frame_rate_camera_initialization_android")
    public Boolean I;
    @SerializedName("gaussian_blur_level_android")
    public Integer J;
    @SerializedName("enable_save_story_to_gallery")
    public Boolean K;
    @SerializedName("birthday")
    public String L;
    @SerializedName("snap_p")
    public Integer M;
    @SerializedName("notification_privacy")
    public Integer N;
    @SerializedName("story_privacy")
    public String O;
    @SerializedName("quick_add_privacy")
    public String P;
    @SerializedName("sent")
    public Integer Q;
    @SerializedName("received")
    public Integer R;
    @SerializedName("score")
    public Integer S;
    @SerializedName("credits")
    public Integer T;
    @SerializedName("snaps")
    public List<aenb> U;
    @SerializedName("recents")
    public List<String> V;
    @SerializedName("last_updated")
    public Long W;
    @SerializedName("added_friends_timestamp")
    public Long X;
    @SerializedName("current_timestamp")
    public Long Y;
    @SerializedName("last_replayed_snap_timestamp")
    public Long Z;
    @SerializedName("video_filters_enabled")
    public Boolean aA;
    @SerializedName("image_player_enabled_android")
    public Boolean aB;
    @SerializedName("speed_filters_enabled_android")
    public Boolean aC = Boolean.TRUE;
    @SerializedName("reverse_filter_enabled_android")
    public Boolean aD = Boolean.TRUE;
    @SerializedName("smoothing_filter_enabled_android")
    public Boolean aE = Boolean.TRUE;
    @SerializedName("dirty_video_rendering_enabled_android")
    public Boolean aF = Boolean.FALSE;
    @SerializedName("video_decoder_texcoord_transformation_enabled_android")
    public Boolean aG = Boolean.FALSE;
    @SerializedName("pinnable_stickers_enabled_android")
    public Boolean aH = Boolean.FALSE;
    @SerializedName("camera2_limited_level_high_resolution_photo_enabled_android")
    public Boolean aI = Boolean.FALSE;
    @SerializedName("sc_media_recorder_enabled_android")
    public Boolean aJ = Boolean.TRUE;
    @SerializedName("sc_media_recorder_recommended_android")
    public Boolean aK = Boolean.TRUE;
    @SerializedName("android_media_recorder_surface_recording_enabled")
    public Boolean aL = Boolean.TRUE;
    @SerializedName("camera1_take_photo_api_blacklisted_android")
    public Boolean aM = Boolean.FALSE;
    @SerializedName("camera1_take_photo_api_whitelisted_android")
    public Boolean aN = Boolean.FALSE;
    @SerializedName("camera2_enabled_android")
    public Boolean aO = Boolean.FALSE;
    @SerializedName("gles3_allowed_android")
    public Boolean aP = Boolean.FALSE;
    @SerializedName("blur_after_downscale_enabled_android")
    public Boolean aQ = Boolean.FALSE;
    @SerializedName("amr_codec_enabled_android")
    public Boolean aR = Boolean.FALSE;
    @SerializedName("samsung_aac_enc_enabled_android")
    public Boolean aS = Boolean.FALSE;
    @SerializedName("audio_note_enabled_android")
    public Boolean aT = Boolean.TRUE;
    @SerializedName("video_note_enabled_android")
    public Boolean aU = Boolean.TRUE;
    @SerializedName("video_note_api_fallback_android")
    public Boolean aV = Boolean.FALSE;
    @SerializedName("chat_video_enabled_android")
    public Boolean aW = Boolean.TRUE;
    @SerializedName("video_thumbnail_enabled_android")
    public Boolean aX = Boolean.TRUE;
    @SerializedName("our_story_auths")
    public List<aeue> aY;
    @SerializedName("targeting")
    public Map<String, String> aZ;
    @SerializedName("snapchat_phone_number")
    public String aa;
    @SerializedName("searchable_by_phone_number")
    public Boolean ab;
    @SerializedName("should_call_to_verify_number")
    public Boolean ac;
    @SerializedName("should_text_to_verify_number")
    public Boolean ad;
    @SerializedName("seen_tooltips")
    public List<String> ae;
    @SerializedName("client_properties")
    public Map<String, String> af;
    @SerializedName("client_properties_v2")
    public List<aehh> ag;
    @SerializedName("feature_settings")
    public aeko ah;
    @SerializedName("ad_preferences")
    public afhb ai;
    @SerializedName("number_of_best_friends")
    public Integer aj;
    @SerializedName("study_settings")
    public Map<String, String> ak;
    @SerializedName("is_cash_active")
    public Boolean al;
    @SerializedName("cash_provider")
    public String am;
    @SerializedName("cash_customer_id")
    public String an;
    @SerializedName("allowed_to_use_cash")
    public String ao;
    @SerializedName("third_party_tracking_base_url")
    public String ap;
    @SerializedName("third_party_tracking_app_id")
    public String aq;
    @SerializedName("last_address_book_updated_date")
    public Long ar = Long.valueOf(0);
    @SerializedName("qr_path")
    public String as;
    @SerializedName("enable_location_mediacards")
    public Boolean at;
    @SerializedName("require_refreshing_profile_media")
    public Boolean au = Boolean.FALSE;
    @SerializedName("should_show_suggestion_prompt")
    public Boolean av;
    @SerializedName("suggestion_prompt_link")
    public String aw;
    @SerializedName("suggestion_prompt_text")
    public String ax;
    @SerializedName("suggestion_prompt_button_text")
    public String ay;
    @SerializedName("suggestion_prompt_duration_in_millis")
    public Long az;
    @SerializedName("e_snap_media")
    public Boolean bA;
    @SerializedName("video_recording_transcoding_configuration")
    public afgf bB;
    @SerializedName("story_count")
    public Integer bC;
    @SerializedName("front_camera_zoom_enabled_android")
    public Boolean bD = Boolean.FALSE;
    @SerializedName("display_name")
    public String bE;
    @SerializedName("camera2_take_photo_api_android")
    public Boolean bF = Boolean.FALSE;
    @SerializedName("enable_world_lens_grid")
    public Boolean bG = Boolean.TRUE;
    @SerializedName("nft_lo_timeout")
    public Float bH;
    @SerializedName("nft_hi_timeout")
    public Float bI;
    @SerializedName("country_code")
    public String bJ;
    @SerializedName("voip_device_token")
    public String bK;
    @SerializedName("sic_init")
    public String bL;
    @SerializedName("enabled_push_notifications")
    public Boolean bM;
    @SerializedName("sticker_visual_recommendation_enabled_android")
    public Boolean bN = Boolean.TRUE;
    @SerializedName("prestart_token")
    public String bO;
    @SerializedName("prestart_prefix")
    public String bP;
    @SerializedName("prestart_port")
    public String bQ;
    @SerializedName("prestart_hostname")
    public String bR;
    @SerializedName("feature_settings_response")
    public List<aekm> bS;
    @SerializedName("mob_stories_enabled")
    public String bT;
    @SerializedName("blizzard_config")
    public agaa bU;
    @SerializedName("friendmoji_blocked_keys")
    public List<String> bV;
    @SerializedName("client_prompts")
    public List<aevd> bW;
    @SerializedName("time_since_last_travel_model_change")
    public Integer bX;
    @SerializedName("reset_disabled_image_player_state")
    public aewi bY;
    @SerializedName("discover_content_disabled")
    public Boolean bZ = Boolean.FALSE;
    @SerializedName("ad_sources")
    public aecn ba;
    @SerializedName("ad_track_info")
    public aecp bb;
    @SerializedName("ad_products")
    public afhf bc;
    @SerializedName("industries")
    public List<String> bd;
    @SerializedName("raw_thumbnail_upload_enabled")
    public Boolean be;
    @SerializedName("is_sms_two_fa_enabled")
    public Boolean bf;
    @SerializedName("is_otp_two_fa_enabled")
    public Boolean bg;
    @SerializedName("is_two_fa_enabled")
    public Boolean bh;
    @SerializedName("two_fa_verified_device_num")
    public Integer bi;
    @SerializedName("two_fa_verified_devices")
    public List<ahfc> bj;
    @SerializedName("friendmoji_mutable_dict")
    public Map<String, aejy> bk;
    @SerializedName("friendmoji_read_only_dict")
    public Map<String, aejy> bl;
    @SerializedName("favorite_stickers")
    public List<aekk> bm;
    @SerializedName("verified_shared_publications")
    public List<aikk> bn;
    @SerializedName("enabled_iap_currencies")
    public List<String> bo;
    @SerializedName("enabled_lens_store_currencies")
    public List<String> bp;
    @SerializedName("client_prompt")
    @Deprecated
    public aevd bq;
    @SerializedName("notification_sound_setting")
    public String br;
    @SerializedName("ringing_sound")
    public String bs;
    @SerializedName("contacts_resync_request")
    public Integer bt;
    @SerializedName("gcs_sampling")
    public Integer bu;
    @SerializedName("snap_media_upload_connection_timeout")
    public Integer bv;
    @SerializedName("snap_media_upload_so_timeout")
    public Integer bw;
    @SerializedName("laguna_id")
    public String bx;
    @SerializedName("laguna_response")
    public ahga by;
    @SerializedName("has_used_laguna")
    public Boolean bz;
    @SerializedName("bitmoji_selfie_id")
    public String ca;
    @SerializedName("bitmoji_snapcode_selfie_id")
    public String cb;
    @SerializedName("d2s_media_download_enabled")
    public Boolean cc = Boolean.TRUE;
    @SerializedName("fidelius_latest_beta")
    public String cd;
    @SerializedName("studio_serial_number")
    public String ce;
    @SerializedName("enable_separate_lens_list_for_back_camera")
    public Boolean cf = Boolean.FALSE;
    @SerializedName("iso3166_alpha2_country_code")
    public String cg;
    @SerializedName("created")
    public Long ch;
    @SerializedName("unlockables_direct_auth_info")
    public aich ci;
    @SerializedName("is_popular")
    public Boolean cj;
    @SerializedName("business_account_id")
    public String ck;
    @SerializedName("study_settings_v2")
    public Map<String, Map<String, String>> cl;
    @SerializedName("enable_ar_core_android")
    public Boolean cm;
    @SerializedName("is_affected_by_gdpr")
    public Boolean cn;
    @SerializedName("registration_country_code")
    public String co;
    @SerializedName("is_s2r_eligible")
    public Boolean cp;
    @SerializedName("phone_number_country_code")
    public String cq;
    @SerializedName("display_username")
    public String cr;
    @SerializedName("logged")
    public Boolean q;
    @SerializedName("username")
    public String r;
    @SerializedName("user_id")
    public String s;
    @SerializedName("bitmoji_avatar_id")
    public String t;
    @SerializedName("bitmoji_hide_download_prompt")
    public Boolean u = Boolean.FALSE;
    @SerializedName("is_verified_user")
    public Boolean v;
    @SerializedName("auth_token")
    public String w;
    @SerializedName("device_token")
    public String x;
    @SerializedName("blizzard_token")
    public String y;
    @SerializedName("email")
    public String z;

    public final ahjw c() {
        return ahjw.a(this.P);
    }

    public final agdy d() {
        return agdy.a(this.bT);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afeq)) {
            afeq afeq = (afeq) obj;
            return super.equals(afeq) && Objects.equal(this.q, afeq.q) && Objects.equal(this.r, afeq.r) && Objects.equal(this.s, afeq.s) && Objects.equal(this.t, afeq.t) && Objects.equal(this.u, afeq.u) && Objects.equal(this.v, afeq.v) && Objects.equal(this.w, afeq.w) && Objects.equal(this.x, afeq.x) && Objects.equal(this.y, afeq.y) && Objects.equal(this.z, afeq.z) && Objects.equal(this.A, afeq.A) && Objects.equal(this.B, afeq.B) && Objects.equal(this.C, afeq.C) && Objects.equal(this.D, afeq.D) && Objects.equal(this.E, afeq.E) && Objects.equal(this.F, afeq.F) && Objects.equal(this.G, afeq.G) && Objects.equal(this.H, afeq.H) && Objects.equal(this.I, afeq.I) && Objects.equal(this.J, afeq.J) && Objects.equal(this.K, afeq.K) && Objects.equal(this.L, afeq.L) && Objects.equal(this.M, afeq.M) && Objects.equal(this.N, afeq.N) && Objects.equal(this.O, afeq.O) && Objects.equal(this.P, afeq.P) && Objects.equal(this.Q, afeq.Q) && Objects.equal(this.R, afeq.R) && Objects.equal(this.S, afeq.S) && Objects.equal(this.T, afeq.T) && Objects.equal(this.U, afeq.U) && Objects.equal(this.V, afeq.V) && Objects.equal(this.W, afeq.W) && Objects.equal(this.X, afeq.X) && Objects.equal(this.Y, afeq.Y) && Objects.equal(this.Z, afeq.Z) && Objects.equal(this.aa, afeq.aa) && Objects.equal(this.ab, afeq.ab) && Objects.equal(this.ac, afeq.ac) && Objects.equal(this.ad, afeq.ad) && Objects.equal(this.ae, afeq.ae) && Objects.equal(this.af, afeq.af) && Objects.equal(this.ag, afeq.ag) && Objects.equal(this.ah, afeq.ah) && Objects.equal(this.ai, afeq.ai) && Objects.equal(this.aj, afeq.aj) && Objects.equal(this.ak, afeq.ak) && Objects.equal(this.al, afeq.al) && Objects.equal(this.am, afeq.am) && Objects.equal(this.an, afeq.an) && Objects.equal(this.ao, afeq.ao) && Objects.equal(this.ap, afeq.ap) && Objects.equal(this.aq, afeq.aq) && Objects.equal(this.ar, afeq.ar) && Objects.equal(this.as, afeq.as) && Objects.equal(this.at, afeq.at) && Objects.equal(this.au, afeq.au) && Objects.equal(this.av, afeq.av) && Objects.equal(this.aw, afeq.aw) && Objects.equal(this.ax, afeq.ax) && Objects.equal(this.ay, afeq.ay) && Objects.equal(this.az, afeq.az) && Objects.equal(this.aA, afeq.aA) && Objects.equal(this.aB, afeq.aB) && Objects.equal(this.aC, afeq.aC) && Objects.equal(this.aD, afeq.aD) && Objects.equal(this.aE, afeq.aE) && Objects.equal(this.aF, afeq.aF) && Objects.equal(this.aG, afeq.aG) && Objects.equal(this.aH, afeq.aH) && Objects.equal(this.aI, afeq.aI) && Objects.equal(this.aJ, afeq.aJ) && Objects.equal(this.aK, afeq.aK) && Objects.equal(this.aL, afeq.aL) && Objects.equal(this.aM, afeq.aM) && Objects.equal(this.aN, afeq.aN) && Objects.equal(this.aO, afeq.aO) && Objects.equal(this.aP, afeq.aP) && Objects.equal(this.aQ, afeq.aQ) && Objects.equal(this.aR, afeq.aR) && Objects.equal(this.aS, afeq.aS) && Objects.equal(this.aT, afeq.aT) && Objects.equal(this.aU, afeq.aU) && Objects.equal(this.aV, afeq.aV) && Objects.equal(this.aW, afeq.aW) && Objects.equal(this.aX, afeq.aX) && Objects.equal(this.aY, afeq.aY) && Objects.equal(this.aZ, afeq.aZ) && Objects.equal(this.ba, afeq.ba) && Objects.equal(this.bb, afeq.bb) && Objects.equal(this.bc, afeq.bc) && Objects.equal(this.bd, afeq.bd) && Objects.equal(this.be, afeq.be) && Objects.equal(this.bf, afeq.bf) && Objects.equal(this.bg, afeq.bg) && Objects.equal(this.bh, afeq.bh) && Objects.equal(this.bi, afeq.bi) && Objects.equal(this.bj, afeq.bj) && Objects.equal(this.bk, afeq.bk) && Objects.equal(this.bl, afeq.bl) && Objects.equal(this.bm, afeq.bm) && Objects.equal(this.bn, afeq.bn) && Objects.equal(this.bo, afeq.bo) && Objects.equal(this.bp, afeq.bp) && Objects.equal(this.bq, afeq.bq) && Objects.equal(this.br, afeq.br) && Objects.equal(this.bs, afeq.bs) && Objects.equal(this.bt, afeq.bt) && Objects.equal(this.bu, afeq.bu) && Objects.equal(this.bv, afeq.bv) && Objects.equal(this.bw, afeq.bw) && Objects.equal(this.bx, afeq.bx) && Objects.equal(this.by, afeq.by) && Objects.equal(this.bz, afeq.bz) && Objects.equal(this.bA, afeq.bA) && Objects.equal(this.bB, afeq.bB) && Objects.equal(this.bC, afeq.bC) && Objects.equal(this.bD, afeq.bD) && Objects.equal(this.bE, afeq.bE) && Objects.equal(this.bF, afeq.bF) && Objects.equal(this.bG, afeq.bG) && Objects.equal(this.bH, afeq.bH) && Objects.equal(this.bI, afeq.bI) && Objects.equal(this.bJ, afeq.bJ) && Objects.equal(this.bK, afeq.bK) && Objects.equal(this.bL, afeq.bL) && Objects.equal(this.bM, afeq.bM) && Objects.equal(this.bN, afeq.bN) && Objects.equal(this.bO, afeq.bO) && Objects.equal(this.bP, afeq.bP) && Objects.equal(this.bQ, afeq.bQ) && Objects.equal(this.bR, afeq.bR) && Objects.equal(this.bS, afeq.bS) && Objects.equal(this.bT, afeq.bT) && Objects.equal(this.bU, afeq.bU) && Objects.equal(this.bV, afeq.bV) && Objects.equal(this.bW, afeq.bW) && Objects.equal(this.bX, afeq.bX) && Objects.equal(this.bY, afeq.bY) && Objects.equal(this.bZ, afeq.bZ) && Objects.equal(this.ca, afeq.ca) && Objects.equal(this.cb, afeq.cb) && Objects.equal(this.cc, afeq.cc) && Objects.equal(this.cd, afeq.cd) && Objects.equal(this.ce, afeq.ce) && Objects.equal(this.cf, afeq.cf) && Objects.equal(this.cg, afeq.cg) && Objects.equal(this.ch, afeq.ch) && Objects.equal(this.ci, afeq.ci) && Objects.equal(this.cj, afeq.cj) && Objects.equal(this.ck, afeq.ck) && Objects.equal(this.cl, afeq.cl) && Objects.equal(this.cm, afeq.cm) && Objects.equal(this.cn, afeq.cn) && Objects.equal(this.co, afeq.co) && Objects.equal(this.cp, afeq.cp) && Objects.equal(this.cq, afeq.cq) && Objects.equal(this.cr, afeq.cr);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Boolean bool = this.q;
        int i = 0;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.r;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.s;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.w;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.x;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.y;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.z;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.A;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.B;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.C;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aewi aewi = this.D;
        hashCode = (hashCode + (aewi == null ? 0 : aewi.hashCode())) * 31;
        bool = this.E;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.F;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.G;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.H;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.I;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.J;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.K;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.L;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.M;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.N;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.O;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.P;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.Q;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.R;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.S;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.T;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.U;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.V;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.W;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.X;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.Y;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.Z;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.aa;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.ab;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.ac;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.ad;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.ae;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.af;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        list = this.ag;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aeko aeko = this.ah;
        hashCode = (hashCode + (aeko == null ? 0 : aeko.hashCode())) * 31;
        afhb afhb = this.ai;
        hashCode = (hashCode + (afhb == null ? 0 : afhb.hashCode())) * 31;
        num = this.aj;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        map = this.ak;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.al;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.am;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.an;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.ao;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.ap;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.aq;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.ar;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.as;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.at;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.au;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.av;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.aw;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.ax;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.ay;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.az;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.aA;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aB;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aC;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aD;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aE;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aF;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aG;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aH;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aI;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aJ;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aK;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aL;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aM;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aN;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aO;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aP;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aQ;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aR;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aS;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aT;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aU;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aV;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aW;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.aX;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.aY;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        map = this.aZ;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        aecn aecn = this.ba;
        hashCode = (hashCode + (aecn == null ? 0 : aecn.hashCode())) * 31;
        aecp aecp = this.bb;
        hashCode = (hashCode + (aecp == null ? 0 : aecp.hashCode())) * 31;
        afhf afhf = this.bc;
        hashCode = (hashCode + (afhf == null ? 0 : afhf.hashCode())) * 31;
        list = this.bd;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.be;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.bf;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.bg;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.bh;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.bi;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        list = this.bj;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        map = this.bk;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.bl;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        list = this.bm;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.bn;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.bo;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.bp;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aevd aevd = this.bq;
        hashCode = (hashCode + (aevd == null ? 0 : aevd.hashCode())) * 31;
        str = this.br;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.bs;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.bt;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.bu;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.bv;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.bw;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.bx;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ahga ahga = this.by;
        hashCode = (hashCode + (ahga == null ? 0 : ahga.hashCode())) * 31;
        bool = this.bz;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.bA;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        afgf afgf = this.bB;
        hashCode = (hashCode + (afgf == null ? 0 : afgf.hashCode())) * 31;
        num = this.bC;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.bD;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.bE;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.bF;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.bG;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.bH;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.bI;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        str = this.bJ;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.bK;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.bL;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.bM;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.bN;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.bO;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.bP;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.bQ;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.bR;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list = this.bS;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.bT;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        agaa agaa = this.bU;
        hashCode = (hashCode + (agaa == null ? 0 : agaa.hashCode())) * 31;
        list = this.bV;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.bW;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        num = this.bX;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aewi = this.bY;
        hashCode = (hashCode + (aewi == null ? 0 : aewi.hashCode())) * 31;
        bool = this.bZ;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.ca;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.cb;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.cc;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.cd;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.ce;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.cf;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.cg;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.ch;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        aich aich = this.ci;
        hashCode = (hashCode + (aich == null ? 0 : aich.hashCode())) * 31;
        bool = this.cj;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.ck;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        map = this.cl;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.cm;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.cn;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.co;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.cp;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.cq;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.cr;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
