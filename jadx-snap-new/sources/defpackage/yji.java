package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.LegacyStorySnapQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.SelectFriendStorySnapForThumbnailRecord;

@ftr(a = "friend_story_thumb/*/*/#")
/* renamed from: yji */
public final class yji extends yjg {

    /* renamed from: yji$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ yjv a;

        b(yjv yjv) {
            this.a = yjv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SelectFriendStorySnapForThumbnailRecord selectFriendStorySnapForThumbnailRecord = (SelectFriendStorySnapForThumbnailRecord) obj;
            akcr.b(selectFriendStorySnapForThumbnailRecord, "details");
            return new yjx(selectFriendStorySnapForThumbnailRecord.snapId(), this.a, selectFriendStorySnapForThumbnailRecord.mediaId(), selectFriendStorySnapForThumbnailRecord.thumbnailUrl(), selectFriendStorySnapForThumbnailRecord.largeThumbnailUrl(), selectFriendStorySnapForThumbnailRecord.mediaKey(), selectFriendStorySnapForThumbnailRecord.thumbnailIv());
        }
    }

    /* renamed from: yji$a */
    static final class a extends akcq implements akbl<Cursor, SelectFriendStorySnapForThumbnailRecord> {
        a(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (SelectFriendStorySnapForThumbnailRecord) ((ainw) this.receiver).map(cursor);
        }
    }

    public yji(yjt yjt, SnapDb snapDb, gee gee, zgb zgb, yju yju) {
        akcr.b(yjt, "storiesThumbnailContentType");
        akcr.b(snapDb, "snapDb");
        akcr.b(gee, "contentManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(yju, "storyThumbnailDeletionHandler");
        super(snapDb, yjt, gee, yju, zgb);
    }

    public final ajdx<yjx> a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String str = ((String) uri.getPathSegments().get(1)).toString();
        yjv valueOf = yjv.valueOf(((String) uri.getPathSegments().get(2)).toString());
        Object selectFriendStorySnapForThumbnail = StorySnapRecord.FACTORY.selectFriendStorySnapForThumbnail(str);
        akcr.a(selectFriendStorySnapForThumbnail, "StorySnapRecord.FACTORY.…napForThumbnail(username)");
        Object f = a().queryAndMapToOneOrError("FriendStoryThumbnailUriHandler", selectFriendStorySnapForThumbnail, new a(LegacyStorySnapQueries.SELECT_THUMBNAIL_FRIEND_STORY_SNAP_MAPPER)).f(new b(valueOf));
        akcr.a(f, "dbClient.queryAndMapToOn…ilIv())\n                }");
        return f;
    }
}
