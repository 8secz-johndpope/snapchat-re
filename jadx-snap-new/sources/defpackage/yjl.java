package defpackage;

import android.net.Uri;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel;
import defpackage.gfr.a;

/* renamed from: yjl */
public final class yjl {
    static {
        yjl yjl = new yjl();
    }

    private yjl() {
    }

    public static final Uri a(long j, long j2, yjv yjv) {
        akcr.b(yjv, "thumbnailSize");
        Object build = a.b().buildUpon().appendPath("story_thumb").appendPath(String.valueOf(j)).appendPath(String.valueOf(j2)).appendPath(yjv.name()).build();
        akcr.a(build, "SnapContentBaseUriProvid…\n                .build()");
        return build;
    }

    public static final Uri a(long j, long j2, boolean z) {
        return yjl.a(j, j2, z ? yjv.LARGE : yjv.DEFAULT);
    }

    public static Uri a(String str, String str2, StoryKind storyKind) {
        akcr.b(str, StorySnapModel.CLIENTID);
        akcr.b(str2, "storyId");
        akcr.b(storyKind, "storyKind");
        Object build = a.b().buildUpon().appendPath("story").appendPath(str).appendPath(str2).appendPath(String.valueOf(storyKind.ordinal())).appendQueryParameter("re_encrypt", "false").build();
        akcr.a(build, "SnapContentBaseUriProvid…\n                .build()");
        return build;
    }

    public static final Uri a(String str, String str2, StoryKind storyKind, boolean z, boolean z2) {
        akcr.b(str, StorySnapModel.CLIENTID);
        akcr.b(str2, "storyId");
        akcr.b(storyKind, "storyKind");
        Object build = a.b().buildUpon().appendPath("story_thumb").appendPath("story_snap").appendPath(str).appendPath(str2).appendPath(String.valueOf(storyKind.ordinal())).appendPath(String.valueOf(z)).appendPath(String.valueOf(z2)).build();
        akcr.a(build, "SnapContentBaseUriProvid…\n                .build()");
        return build;
    }

    public static final Uri a(String str, yjv yjv, long j) {
        akcr.b(str, "username");
        akcr.b(yjv, "thumbnailSize");
        Object build = a.b().buildUpon().appendPath("friend_story_thumb").appendPath(str).appendPath(yjv.name()).appendPath(String.valueOf(j)).build();
        akcr.a(build, "SnapContentBaseUriProvid…\n                .build()");
        return build;
    }
}
