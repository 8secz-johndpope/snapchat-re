package defpackage;

import com.google.gson.reflect.TypeToken;
import defpackage.fth.a;
import java.util.List;

/* renamed from: jic */
public enum jic implements fth {
    SHOW_QUICK_ADD_UNIT(a.a(false)),
    ENABLE_BIRTHDAY_PARTY(a.a(false)),
    IS_EMAIL_VERIFIED(a.a(false)),
    PENDING_EMAIL(a.a(r2)),
    LAST_SEEN_ADDED_ME_TIMESTAMP(a.a(0)),
    LAST_TIME_TO_SEE_RESURRECTION_ADDED_ME_TIMESTAMP(a.a(0)),
    LAST_SEEN_ADDED_ME_TAKE_OVER_TIMESTAMP(a.a(0)),
    INAPP_PHONE_NUMBER(a.a(r2)),
    INAPP_COUNTRY_CODE(a.a(r2)),
    IS_SMS_TFA_ENABLED(a.a(false)),
    IS_OTP_TFA_ENABLED(a.a(false)),
    SNAP_SCORE(a.a(0)),
    IS_CONTACT_SYNC_ENABLED(a.a(true)),
    TFA_VERIFIED_DEVICES(a.a(new 1().getType(), "[]")),
    PHONE_VERIFICATION_SMS_FORMAT(a.a(r2)),
    ADDED_FRIENDS_SYNC_TOKEN(a.a(r2)),
    SUGGESTED_FRIEND_SYNC_VERSION(a.a(0)),
    SUGGESTED_FRIEND_FIND_TIMESTAMPS(a.a(0)),
    LAST_PERMISSION_REPORT_TIMESTAMP(a.a(0)),
    USER_SEGMENT_LIST_INFO(a.a(new 2().getType(), r2)),
    DEFAULT_EMOJI_SKIN_TONE(a.a(r2)),
    HAS_SEEN_ENABLE_PUSH_NOTIFICATION_PROMPT(a.a(false)),
    HAS_SEEN_VERIFY_PHONE_NUMBER_PROMPT(a.a(false)),
    FEED_HEADER_PROMPT_V2_STATE_SYNC(a.a("CLIENT_DEFAULT")),
    HAS_SEEN_SYNC_CONTACT_PROMPT(a.a(false)),
    SHOULD_RESET_TOP_PROMPTS_SYNCED_STATE(a.a(false)),
    EMOJI_SKIN_TONE_PICKER_ENABLED(a.a(false)),
    HAS_SEEN_VERIFY_EMAIL_ADDRESS_PROMPT(a.a(false)),
    HAS_DISMISSED_ENABLE_PUSH_NOTIFICATION_PROMPT(a.a(false)),
    HAS_DISMISSED_VERIFY_PHONE_NUMBER_PROMPT(a.a(false)),
    HAS_DISMISSED_SYNC_CONTACT_PROMPT(a.a(false)),
    HAS_DISMISSED_VERIFY_EMAIL_ADDRESS_PROMPT(a.a(false)),
    HAS_DISMISSED_BIRTHDAY_PROMPT(a.a(false)),
    HAS_DISMISSED_GROUPS_PROMPT(a.a(false)),
    HAS_DISMISSED_REGISTER_TO_VOTE_PROMPT(a.a(false)),
    HAS_SEEN_CARD_BIRTHDAY_PROMPT(a.a(false)),
    HAS_SEEN_CARD_GROUPS_PROMPT(a.a(false)),
    HAS_SEEN_CARD_REGISTER_TO_VOTE_PROMPT(a.a(false)),
    NUM_SNAPS_SENT(a.a(0)),
    NUM_SNAPS_RECEIVED(a.a(0)),
    IS_NEW_CARD_ENABLE_PUSH_NOTIFICATION_PROMPT(a.a(true)),
    IS_NEW_CARD_VERIFY_PHONE_NUMBER_PROMPT(a.a(true)),
    IS_NEW_CARD_SYNC_CONTACT_PROMPT(a.a(true)),
    IS_NEW_CARD_VERIFY_EMAIL_ADDRESS_PROMPT(a.a(true)),
    IS_NEW_CARD_BIRTHDAY_PROMPT(a.a(true)),
    IS_NEW_CARD_GROUPS_PROMPT(a.a(true)),
    IS_NEW_CARD_REGISTER_TO_VOTE_PROMPT(a.a(true)),
    REGISTER_TO_VOTE_PAGE_LINK(a.a(r2)),
    SNAPCODE_IN_PROFILE(a.a(true)),
    USER_QR_PATH(a.a(r2)),
    RECENTS_INIT_SIZE_KEY(a.a(15)),
    RECENTS_INCREMENT_KEY(a.a(5)),
    RECENTS_MAX_SIZE_KEY(a.a(29)),
    NEW_PROFILE_ACTIVITY_CARDS(a.a(false)),
    ANDROID_RESURRECT_TRIGGER_BADGE(a.a(false)),
    SEND_TO_PRESELECT_RECIPIENTS_IN_CREATE_GROUP(a.a(false)),
    SEND_TO_SECTIONS_IN_ORDER_LOADING(a.a(false)),
    SEND_TO_SCROLLBAR_V2_ENABLE(a.a(false)),
    SEND_TO_LAST_SNAP_RECIPIENTS_BUTTON_TYPE(a.a(0)),
    SEND_TO_NEW_GROUP_SECTION(a.a(false)),
    SEND_TO_SDL(a.a(false)),
    SEND_TO_SDL_STORIES(a.a(false)),
    ST_SEARCH_V2_ENABLE(a.a(false)),
    ST_SELECTION_V2_ENABLE(a.a(false)),
    ST_NEW_USER_EXPERIENCE_V2_ENABLE(a.a(false)),
    HAS_SEEN_BEST_OF_SPECTACLES_DIALOG(a.a(false)),
    FORCE_SHOW_ALL_PROFILE_PROMPT(a.a(false)),
    IS_SEARCHABLE_BY_PHONE_NUMBER(a.a(true)),
    IS_NOTIFICATION_CAMPAIGN_ENABLED(a.a(true)),
    IS_INCOMING_FRIENDS_DELTA_SYNC_ENABLED(a.a(true)),
    MUSHROOM_OPTED_IN(a.a(false)),
    MUSHROOM_AB_ENABLED(a.a(false)),
    MUSHROOM_EXP_ENABLED(a.a(false)),
    MUSHROOM_AB_ENABLE_SETTINGS_OPT_OUT(a.a(false)),
    MUSHROOM_EXP_ENABLE_SETTINGS_OPT_OUT(a.a(false)),
    CUSTOM_EMOJI_IN_SETTINGS(a.a(false)),
    RES_14_DAY_IN_MS(a.a(-1)),
    RES_7_DAY_IN_MS(a.a(-1)),
    TOAST_FRIENDING_STATUS(a.a(false)),
    TOAST_QUICK_ADD_FRIENDS_SEEN(a.a(false)),
    SERVER_CONFIGS_ETAG(a.a(r2)),
    ALL_UPDATES_CHECKSUM(a.a(r2)),
    ALL_UPDATES_CHECKSUM_ENABLED(a.a(false)),
    IS_ADD_FRIENDS_V11(a.a(false)),
    ADDED_ME_POST_ACCEPT_V2_TYPE(a.a(0)),
    QUICK_ADD_ROWS_IN_DF(a.a(1)),
    QUICK_ADD_IN_DF_V2(a.a(true)),
    APP_FAMILY_ON_LOGOUT(a.a(a.RANDOM)),
    APP_BADGE_FOR_FRIEND_REQUEST_TYPE(a.a(1)),
    LAST_FULL_CONTACT_SYNC_TIMESTAMP_MS(a.a(0)),
    FULL_CONTACT_SYNC_REPEATEDLY(a.a(false));
    
    public final a<?> delegate;

    /* renamed from: jic$a */
    public enum a {
        private static final /* synthetic */ a[] $VALUES = null;
        public static final a MUSHROOM = null;
        public static final a OG = null;
        public static final a RANDOM = null;

        static {
            RANDOM = new a("RANDOM", 0);
            MUSHROOM = new a("MUSHROOM", 1);
            OG = new a("OG", 2);
            $VALUES = new a[]{RANDOM, MUSHROOM, OG};
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: jic$1 */
    static class 1 extends TypeToken<List<ahfc>> {
        1() {
        }
    }

    /* renamed from: jic$2 */
    static class 2 extends TypeToken<List<String>> {
        2() {
        }
    }

    private jic(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.IDENTITY;
    }
}
