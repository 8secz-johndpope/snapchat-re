package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.LegacyStorySnapQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.ThumbnailDetails;
import java.util.Set;

@ftr(a = "story_thumb/story_snap/*/*/*/*/*")
/* renamed from: yjs */
public final class yjs extends yjg {

    /* renamed from: yjs$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ yjv a;

        b(yjv yjv) {
            this.a = yjv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ThumbnailDetails thumbnailDetails = (ThumbnailDetails) obj;
            akcr.b(thumbnailDetails, "details");
            return new yjx(thumbnailDetails.snapId(), this.a, thumbnailDetails.mediaId(), thumbnailDetails.thumbnailUrl(), thumbnailDetails.largeThumbnailUrl(), thumbnailDetails.mediaKey(), thumbnailDetails.thumbnailIv());
        }
    }

    /* renamed from: yjs$a */
    static final class a extends akcq implements akbl<Cursor, ThumbnailDetails> {
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
            return (ThumbnailDetails) ((ainw) this.receiver).map(cursor);
        }
    }

    public yjs(yjt yjt, SnapDb snapDb, gee gee, zgb zgb, yju yju) {
        akcr.b(yjt, "storiesThumbnailContentType");
        akcr.b(snapDb, "snapDb");
        akcr.b(gee, "contentManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(yju, "storyThumbnailDeletionHandler");
        super(snapDb, yjt, gee, yju, zgb);
    }

    public final ajdx<yjx> a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String str = (String) uri.getPathSegments().get(2);
        String str2 = (String) uri.getPathSegments().get(3);
        Object obj = uri.getPathSegments().get(4);
        akcr.a(obj, "uri.pathSegments[4]");
        int parseInt = Integer.parseInt((String) obj);
        Object obj2 = uri.getPathSegments().get(5);
        akcr.a(obj2, "uri.pathSegments[5]");
        yjv yjv = Boolean.parseBoolean((String) obj2) ? yjv.LARGE : yjv.DEFAULT;
        Object thumbnailForStorySnap = StorySnapRecord.FACTORY.getThumbnailForStorySnap(StoryRecord.FACTORY, str, str2, StoryKind.values()[parseInt]);
        akcr.a(thumbnailForStorySnap, "StorySnapRecord.FACTORY.…lues()[storyKindOrdinal])");
        obj2 = a().queryAndMapToOneOrError("StorySnapThumbnailUriHandler", thumbnailForStorySnap, new a(LegacyStorySnapQueries.GET_THUMBNAIL_MAPPER)).f(new b(yjv));
        akcr.a(obj2, "dbClient.queryAndMapToOn…ilIv())\n                }");
        return obj2;
    }

    public final Set<gdy> b(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String str = (String) uri.getPathSegments().get(6);
        return akcr.a(str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null, Boolean.TRUE) ? ajzs.a(gdy.PREFER_FALLBACK_URI) : super.b(uri);
    }
}
