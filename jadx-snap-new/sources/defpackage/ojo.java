package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.fth.a;

/* renamed from: ojo */
public enum ojo implements fth {
    MEDIA_CACHE_SIZE_MB(a.a((int) Callback.DEFAULT_DRAG_ANIMATION_DURATION)),
    MEDIA_CACHE_SIZE_FOR_SPECTACLES_USER_MB(a.a((int) ItemAnimator.FLAG_MOVED)),
    MEDIA_CACHE_SIZE_PERCENTAGE(a.a((float) MapboxConstants.MINIMUM_ZOOM)),
    THUMBNAIL_CACHE_SIZE_MB(a.a(50)),
    HAS_USED_SPECTACLES(a.a(false)),
    SNAPS_TAB_COLUMN_COUNT(a.a(4)),
    CLUSTERING_TYPE(a.a(ojm.BY_MONTH)),
    RECENTLY_ADDED_TIME_THRESHOLD(a.a(2)),
    DEBUG_OPTION_IN_ACTION_MENU_ENABLED(a.a(false)),
    FORCE_UPLOAD_ERROR_ENABLED(a.a(false)),
    INSTANT_SAVE_JOB(a.a(false)),
    FORCED_RESYNC_REQUIRED_DEVELOPER(a.a(false)),
    MEMORIES_PROGRESSIVE_DOWNLOAD(a.a(false)),
    BACKUP_ON_CELLULAR_ENABLED(a.a(false)),
    SAVING_OPTION(a.a(ojs.MEMORIES)),
    SAVING_OPTION_OVERRIDE(a.a(ojs.MEMORIES)),
    STORY_AUTO_SAVING(a.a(false)),
    SYNC_REQUIRED(a.a(false)),
    FORCED_RESYNC_REQUIRED(a.a(false)),
    MY_EYES_ONLY_ENABLED(a.a(false)),
    MY_EYES_ONLY_PASSPHRASE_ENABLED(a.a(false)),
    MY_EYES_ONLY_INVALID_UNLOCK_COUNT(a.a(0)),
    MY_EYES_ONLY_LAST_RATE_LIMIT_TIME(a.a(0)),
    HAS_SEEN_MEMORIES_SAVING_OPTIONS_PROMPT(a.a(false)),
    HAS_SEEN_SNAPS_V3_ONBOARDING(a.a(false)),
    TRANSCODING_DURABLE_JOB(a.a(false)),
    ALLOW_REMOVE_FILE_MANAGER_UNLOCKED_FILES(a.a(false)),
    FORCE_REMOVE_FILE_MANAGER_UNLOCKED_FILES(a.a(false)),
    HAS_REMOVED_FILE_MANAGER_UNLOCKED_FILES(a.a(false)),
    HAS_REMOVED_FILE_MANAGER_UNLOCKED_THUMBNAILS(a.a(false)),
    MP4_FAST_START_ENABLED(a.a(false)),
    MULTI_SELECT(a.a(false)),
    MULTI_SELECT_STORIES(a.a(false));
    
    private final a<?> delegate;

    private ojo(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.MEMORIES;
    }
}
