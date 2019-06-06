package defpackage;

import android.os.Build;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.SparseArray;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: abyn */
public final class abyn {
    public static final SparseArray<String> a = new SparseArray();
    public static final SparseArray<String> b = new SparseArray();
    private static final Set<Integer> c = (Build.MODEL.contains("SM-G900H") ? ImmutableSet.of(Integer.valueOf(700)) : ImmutableSet.of());

    static {
        a.put(1, "MEDIA_INFO_UNKNOWN");
        a.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        a.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        a.put(701, "MEDIA_INFO_BUFFERING_START");
        a.put(702, "MEDIA_INFO_BUFFERING_END");
        a.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        a.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        a.put(802, "MEDIA_INFO_METADATA_UPDATE");
        a.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        a.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        b.put(1, "MEDIA_ERROR_UNKNOWN");
        b.put(100, "MEDIA_ERROR_SERVER_DIED");
        b.put(Callback.DEFAULT_DRAG_ANIMATION_DURATION, "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK");
        b.put(-1004, "MEDIA_ERROR_IO");
        b.put(-1007, "MEDIA_ERROR_MALFORMED");
        b.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        b.put(-110, "MEDIA_ERROR_TIMED_OUT");
    }

    public static String a(SparseArray<String> sparseArray, int i) {
        String str = (String) sparseArray.get(i);
        return str == null ? "UNKNOWN" : str;
    }

    public static boolean a(int i) {
        return c.contains(Integer.valueOf(i));
    }

    public static abyh b(int i) {
        if (!(i == -1010 || i == -1007)) {
            if (i != -1004) {
                if (i == -110) {
                    return abyh.MEDIA_ERROR_TIMEOUT;
                }
                if (i != 100) {
                    if (i != Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                        return abyh.MEDIA_ERROR_PLAYBACK;
                    }
                }
            }
            return abyh.MEDIA_ERROR_IO;
        }
        return abyh.MEDIA_ERROR_SOURCE;
    }
}
