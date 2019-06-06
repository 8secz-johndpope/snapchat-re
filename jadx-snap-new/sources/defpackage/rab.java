package defpackage;

import com.google.common.primitives.Longs;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.FeedSyncStateRecord;
import java.util.List;

/* renamed from: rab */
public final class rab {
    private final SnapDb a;
    private final DbClient b;
    private final tnj c;
    private final ftl d;
    private final quk e;

    public rab(SnapDb snapDb, tnj tnj, ftl ftl, quk quk) {
        this.a = snapDb;
        this.b = snapDb.getDbClient((ide) qxo.b);
        this.c = tnj;
        this.d = ftl;
        this.e = quk;
    }

    public final ajdx<String> a() {
        return this.a.firstElement(FeedSyncStateRecord.FACTORY.getValue(), FeedSyncStateRecord.FACTORY.getValueMapper()).d((Object) "");
    }

    public final void a(long j) {
        this.c.b().a(qyi.LAST_FULL_SYNC_TIME_SECONDS, Long.valueOf(j)).b();
    }

    public final void a(String str) {
        this.c.b().a(qyi.DELTA_SYNC_TOKEN, str).b();
    }

    public final void a(List<Long> list) {
        this.e.a(Longs.toArray(list), false);
    }

    public final void a(boolean z) {
        this.c.b().a(qyi.SHOULD_FORCE_CLEAR_DATA_ON_NEXT_SYNC, Boolean.valueOf(z)).b();
    }

    public final String b() {
        return this.d.j(qyi.DELTA_SYNC_TOKEN);
    }

    public final void b(String str) {
        this.c.b().a(qyi.CONVERSATION_CHECKSUM, str).b();
    }

    public final String c() {
        return this.d.j(qyi.CONVERSATION_CHECKSUM);
    }

    public final long d() {
        return this.d.h(qyi.LAST_FULL_SYNC_TIME_SECONDS);
    }

    public final boolean e() {
        return this.d.a(qyi.SHOULD_FORCE_CLEAR_DATA_ON_NEXT_SYNC);
    }
}
