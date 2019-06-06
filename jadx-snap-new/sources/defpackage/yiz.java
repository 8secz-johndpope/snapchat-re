package defpackage;

import com.google.gson.reflect.TypeToken;
import com.snap.core.db.column.PrivacyType;
import defpackage.fth.a;
import java.util.List;
import java.util.Set;

/* renamed from: yiz */
public enum yiz implements fth {
    MY_STORY_PRIVACY(a.a(PrivacyType.EVERYONE)),
    MY_STORY_PRIVACY_CUSTOM_USER_BLACKLIST(a.a(new 1().getType(), r3)),
    IS_NOTIFICATION_CAMPAIGN_ENABLED(a.a(true)),
    FRIEND_STORY_NOTIFICATION_TIMEOUT_MIN(a.a(-1)),
    FRIEND_STORY_NOTIFICATION_ICON(a.a(false)),
    OPT_IN_FRIEND_NOTIFICATION_ENABLED(a.a(false)),
    STORY_SNAP_CONTENT_CACHE_SIZE_BYTES(a.a(52428800)),
    STORY_VIDEO_MEDIA_SELECTION(a.a("NORMAL_COMPRESSION")),
    USE_COF_USER_STORY_VIDEO_MEDIA_SELECTION(a.a(false)),
    FRIEND_AND_PRIVATE_STORIES_INTERWEAVE(a.a(false)),
    SEEN_MY_STORY_ONBOARDING(a.a(false)),
    SEEN_OUR_STORY_ONBOARDING(a.a(false)),
    SHOW_GEO_STORY_ONBOARDING(a.a(new 2().getType(), r3)),
    GEO_STORIES_POSTABLE(a.a(false)),
    IS_ENTIRE_STORY_SAVING_ENABLED(a.a(false)),
    SENDTO_CUSTOM_STORIES_ABOVE_FOLD_RECENCY_HR(a.a(0)),
    SENDTO_CUSTOM_STORIES_ABOVE_FOLD_MAX_CNT(a.a(0)),
    ENABLE_PRIVATE_STORY_BUTTON_IN_SEND_TO(a.a(false)),
    SHOW_PRIVATE_STORY_RECENTS_SECTION(a.a(false));
    
    private final a<?> delegate;

    /* renamed from: yiz$1 */
    static class 1 extends TypeToken<List<yiw>> {
        1() {
        }
    }

    /* renamed from: yiz$2 */
    static class 2 extends TypeToken<Set<String>> {
        2() {
        }
    }

    private yiz(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.STORIES;
    }
}
