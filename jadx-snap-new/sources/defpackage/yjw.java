package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.common.base.Optional;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.LegacyStorySnapQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByStoryRowIdRecord;

@ftr(a = "story_thumb/#/*/*")
/* renamed from: yjw */
public final class yjw extends yjg {

    /* renamed from: yjw$a */
    static final class a extends akcs implements akbl<Cursor, Optional<SelectStorySnapForThumbnailByStoryRowIdRecord>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "it");
            return Optional.of(LegacyStorySnapQueries.SELECT_THUMBNAIL_STORY_SNAP_BY_STORY_ROW_ID_MAPPER.map(cursor));
        }
    }

    /* renamed from: yjw$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ yjv a;

        b(yjv yjv) {
            this.a = yjv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "details");
            return optional.isPresent() ? new yjx(((SelectStorySnapForThumbnailByStoryRowIdRecord) optional.get()).snapId(), this.a, ((SelectStorySnapForThumbnailByStoryRowIdRecord) optional.get()).mediaId(), ((SelectStorySnapForThumbnailByStoryRowIdRecord) optional.get()).thumbnailUrl(), ((SelectStorySnapForThumbnailByStoryRowIdRecord) optional.get()).largeThumbnailUrl(), ((SelectStorySnapForThumbnailByStoryRowIdRecord) optional.get()).mediaKey(), ((SelectStorySnapForThumbnailByStoryRowIdRecord) optional.get()).thumbnailIv()) : yjz.a;
        }
    }

    public yjw(yjt yjt, SnapDb snapDb, gee gee, zgb zgb, yju yju) {
        akcr.b(yjt, "storiesThumbnailContentType");
        akcr.b(snapDb, "snapDb");
        akcr.b(gee, "contentManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(yju, "storyThumbnailDeletionHandler");
        super(snapDb, yjt, gee, yju, zgb);
    }

    public final ajdx<yjx> a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        long parseLong = Long.parseLong((String) obj);
        yjv valueOf = yjv.valueOf(((String) uri.getPathSegments().get(3)).toString());
        obj = StorySnapRecord.FACTORY.selectStorySnapForThumbnailByStoryRowId(parseLong);
        akcr.a(obj, "StorySnapRecord.FACTORY.…nailByStoryRowId(storyId)");
        Object f = a().queryAndMapToOneOrDefault("StoryThumbnailUriHandlerKt", obj, a.a, Optional.absent()).f(new b(valueOf));
        akcr.a(f, "dbClient.queryAndMapToOn…_THUMBNAIL_INFO\n        }");
        return f;
    }
}
