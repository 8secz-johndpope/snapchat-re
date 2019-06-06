package defpackage;

import java.util.Locale;

/* renamed from: sec */
public enum sec {
    STATUS_BAR,
    SCREENSHOT_EVERYWHERE,
    SCREENSHOT(sdw.MESSAGING),
    REPLAY(sdw.MESSAGING),
    CHAT(sdw.MESSAGING),
    TYPING(sdw.MESSAGING),
    CHAT_SCREENSHOT(sdw.MESSAGING),
    LOCK_SCREEN_OPEN_CHAT_AUDIO(sdw.LOCAL_ONLY),
    MISCHIEF_LOCK_SCREEN_OPEN_CHAT_AUDIO(sdw.LOCAL_ONLY),
    LOCK_SCREEN_OPEN_CHAT_VIDEO(sdw.LOCAL_ONLY),
    MISCHIEF_LOCK_SCREEN_OPEN_CHAT_VIDEO(sdw.LOCAL_ONLY),
    LOCK_SCREEN_ACCEPT_AUDIO_CALL(sdw.LOCAL_ONLY),
    MISCHIEF_LOCK_SCREEN_ACCEPT_AUDIO_CALL(sdw.LOCAL_ONLY),
    LOCK_SCREEN_ACCEPT_VIDEO_CALL(sdw.LOCAL_ONLY),
    MISCHIEF_LOCK_SCREEN_ACCEPT_VIDEO_CALL(sdw.LOCAL_ONLY),
    INITIATE_AUDIO(sdw.TALK),
    ABANDON_AUDIO(sdw.TALK),
    INITIATE_VIDEO(sdw.TALK),
    ABANDON_VIDEO(sdw.TALK),
    MISCHIEF_INITIATE_AUDIO(sdw.TALK),
    MISCHIEF_ABANDON_AUDIO(sdw.TALK),
    MISCHIEF_INITIATE_VIDEO(sdw.TALK),
    MISCHIEF_ABANDON_VIDEO(sdw.TALK),
    MISCHIEF_CALL_UPDATED_AUDIO(sdw.TALK),
    MISCHIEF_CALL_UPDATED_VIDEO(sdw.TALK),
    SAVE_CAMERA_ROLL(sdw.MESSAGING),
    HERE_SCREENSHOT,
    SNAP(sdw.MESSAGING),
    SNAP_SENDING(sdw.LOCAL_ONLY),
    ADDFRIEND(sdw.IDENTITY),
    FETCH_SUGGESTED_FRIENDS(sdw.IDENTITY),
    AVAILABLE_FRIEND_SUGGESTIONS(sdw.IDENTITY),
    RECENTLY_JOINED_SUGGESTION(sdw.IDENTITY),
    REGISTRATION_REENGAGEMENT(sdw.IDENTITY),
    EMAIL_VERIFIED,
    STORIES(sdw.STORIES),
    FRIEND_STORIES_POST(sdw.STORIES),
    PING(sdw.NONE),
    MISCHIEF_CHAT(sdw.MESSAGING),
    MISCHIEF_SNAP(sdw.MESSAGING),
    MISCHIEF_TYPING(sdw.MESSAGING),
    MISCHIEF_CHAT_SCREENSHOT(sdw.MESSAGING),
    MISCHIEF_CAMERA_ROLL_SAVE(sdw.MESSAGING),
    MISCHIEF_SNAP_SCREENSHOT(sdw.MESSAGING),
    MISCHIEF_REPLAY(sdw.MESSAGING),
    MISCHIEF_RENAME(sdw.MESSAGING),
    MISCHIEF_ADD_PARTICIPANT(sdw.MESSAGING),
    CHAT_REPLY(sdw.MESSAGING),
    ADD_COLLABORATOR_TO_OWNER,
    ADD_COLLABORATOR_TO_COLLABORATOR,
    BATTERY_SAVE_MODE,
    FAILED_SNAP_AND_CHAT,
    FAILED_CHAT_NOT_FRIENDS,
    DEBUG_ANR,
    DEBUG_GENERAL,
    FEED(sdw.MESSAGING),
    LAGUNA_BACK_COMPATIBLE,
    LAGUNA_TRANSFER_COMPLETE,
    LAGUNA_TRANSFER_INTERRUPTED,
    LAGUNA_TRANSFER_COMPLETE_DIRECT_TO_PREVIEW,
    LAGUNA_UPDATE_COMPLETE,
    LAGUNA_UPDATE_FAILED,
    SPECTACLES_ERROR_REPORT,
    SNAP_ADS_PORTAL,
    SNAPSTREAK_UPDATE,
    DOGOOD_APPROVED,
    DOGOOD_PAYMENT_REQUIRED,
    DOGOOD_REJECTED,
    DOGOOD_LIVE,
    DOGOOD_PAYMENT_ISSUE,
    DOGOOD_LENS_APPROVED,
    DOGOOD_LENS_PAYMENT_REQUIRED,
    DOGOOD_LENS_REJECTED,
    DOGOOD_LENS_LIVE,
    DOGOOD_LENS_PAYMENT_ISSUE,
    MEMORIES_PENDING_BACKUP,
    MEMORIES_SAVE_FAILED,
    MEMORIES_SAVE_SUCCESS,
    EXPORT_STARTED(sdw.LOCAL_ONLY),
    EXPORT_SUCCESS(sdw.LOCAL_ONLY),
    EXPORT_FAILED(sdw.LOCAL_ONLY),
    IMPALA_PENDING_INVITE(sdw.IMPALA),
    IMPALA_ADDED_AS_MEMBER(sdw.IMPALA),
    IMPALA_INVITE_ACCEPTED(sdw.IMPALA),
    IMPALA_STORY_CONTRIBUTION(sdw.IMPALA),
    IMPALA_PROFILE_UPDATED(sdw.IMPALA),
    IMPALA_ROLE_UPDATED(sdw.IMPALA),
    STUDIO_LENS_PREVIEW_UPDATE(sdw.LENS_STUDIO),
    FIDELIUS_RETRY(sdw.FIDELIUS),
    LOCATION_SHARING_REMINDER,
    GHOST_MODE_TIMER_DONE,
    CHECKIN_ADDED(sdw.LOCAL_ONLY),
    TRY_LENSES(sdw.LENSES),
    LENSES_IN_APP(sdw.LOCAL_ONLY),
    COGNAC_LOCAL_NOTIFICATION(sdw.COGNAC),
    COGNAC_INITIATE_INVITE(sdw.COGNAC),
    COGNAC_OPEN(sdw.COGNAC),
    COGNAC_LAUNCH(sdw.COGNAC),
    COGNAC_TERMINATE(sdw.COGNAC),
    STORY_NOTIFICATION_RECEIVED(sdw.DISCOVER_FEED),
    CONNECTIVITY(sdw.LOCAL_ONLY),
    FAILED_TO_ERASE(sdw.LOCAL_ONLY),
    LOW_DISK(sdw.LOCAL_ONLY),
    UNKNOWN(sdw.NONE);
    
    public static final a Companion = null;
    public final sdw group;

    /* renamed from: sec$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static sec a(String str) {
            akcr.b(str, "name");
            if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
                return sec.UNKNOWN;
            }
            sec valueOf;
            try {
                Object obj = Locale.US;
                akcr.a(obj, "Locale.US");
                Object toUpperCase = str.toUpperCase(obj);
                akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
                valueOf = sec.valueOf(toUpperCase);
            } catch (IllegalArgumentException unused) {
                valueOf = sec.UNKNOWN;
            }
            return valueOf;
        }
    }

    static {
        Companion = new a();
    }

    private sec(sdw sdw) {
        akcr.b(sdw, "group");
        this.group = sdw;
    }

    public final boolean a() {
        switch (sed.a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                return false;
        }
    }

    public final boolean b() {
        int i = sed.b[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean c() {
        int i = sed.c[ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean d() {
        if (!(c() || b())) {
            int i = sed.d[ordinal()];
            Object obj = (i == 1 || i == 2) ? 1 : null;
            return obj != null;
        }
    }
}
