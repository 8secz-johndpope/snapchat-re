package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.record.PostableStoryModel.DeletePostableStoryByKey;
import com.snap.core.db.record.PostableStoryModel.InsertPostableStory;
import com.snap.core.db.record.PostableStoryModel.UpdatePostableStory;
import com.snap.core.db.record.PostableStoryRecord;
import defpackage.ihx.a;
import org.opencv.imgproc.Imgproc;

/* renamed from: yln */
public final class yln {
    public final DbClient a;
    public final ihx<DeletePostableStoryByKey> b = new ihx(new a(this));
    private final ihx<UpdatePostableStory> c = new ihx(new c(this));
    private final ihx<InsertPostableStory> d = new ihx(new b(this));

    /* renamed from: yln$c */
    static final class c<T> implements a<T> {
        private /* synthetic */ yln a;

        c(yln yln) {
            this.a = yln;
        }

        public final /* synthetic */ Object initialize() {
            return new UpdatePostableStory(this.a.a.getWritableDatabase(), PostableStoryRecord.FACTORY);
        }
    }

    /* renamed from: yln$b */
    static final class b<T> implements a<T> {
        private /* synthetic */ yln a;

        b(yln yln) {
            this.a = yln;
        }

        public final /* synthetic */ Object initialize() {
            return new InsertPostableStory(this.a.a.getWritableDatabase(), PostableStoryRecord.FACTORY);
        }
    }

    /* renamed from: yln$a */
    static final class a<T> implements defpackage.ihx.a<T> {
        private /* synthetic */ yln a;

        a(yln yln) {
            this.a = yln;
        }

        public final /* synthetic */ Object initialize() {
            return new DeletePostableStoryByKey(this.a.a.getWritableDatabase());
        }
    }

    public yln(SnapDb snapDb) {
        akcr.b(snapDb, "snapDb");
        this.a = snapDb.getDbClient((ide) yhy.j);
    }

    private void a(DbTransaction dbTransaction, long j, String str, String str2, GroupStoryRankType groupStoryRankType, Long l, Long l2, String str3, PrivacyType privacyType) {
        DbTransaction dbTransaction2 = dbTransaction;
        akcr.b(dbTransaction2, "tx");
        akcr.b(str, "storyId");
        dbTransaction.checkInTransaction();
        ((UpdatePostableStory) this.c.get()).bind(str, str2, groupStoryRankType, null, null, l, l2, null, str3, privacyType, Long.valueOf(j));
        DbClient dbClient = this.a;
        Object obj = this.c.get();
        akcr.a(obj, "postableStoryMetadataUpdate.get()");
        if (dbClient.executeUpdateDelete((ainy) obj, dbTransaction2) <= 0) {
            ((InsertPostableStory) this.d.get()).bind(str, Long.valueOf(j), str2, groupStoryRankType, null, null, l, l2, null, str3, privacyType);
            dbClient = this.a;
            obj = this.d.get();
            akcr.a(obj, "postableStoryMetadataInsert.get()");
            dbClient.executeInsert((ainy) obj, dbTransaction2);
        }
    }

    public static /* synthetic */ void a(yln yln, DbTransaction dbTransaction, long j, String str, String str2, GroupStoryRankType groupStoryRankType, Long l, Long l2, String str3, PrivacyType privacyType, int i) {
        int i2 = i;
        yln.a(dbTransaction, j, str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : groupStoryRankType, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : l2, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? null : str3, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? null : privacyType);
    }
}
