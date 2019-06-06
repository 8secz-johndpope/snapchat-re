package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendLinkType;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: raa */
public final class raa implements AllUpdatesProcessor {
    private final ftl a;
    private final iqx b;
    private final ajwy<qxl> c;
    private final reg d;
    private final tnj e;

    public raa(ftl ftl, iqx iqx, ajwy<qxl> ajwy, reg reg, tnj tnj) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(iqx, "friendRepository");
        akcr.b(ajwy, "friendsFeedApi");
        akcr.b(reg, "newlyAddedFriendsProcessorUtil");
        akcr.b(tnj, "preferences");
        this.a = ftl;
        this.b = iqx;
        this.c = ajwy;
        this.d = reg;
        this.e = tnj;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        if (!this.a.a((fth) qyi.LOGIN_ADDED_OUTGOING_FRIENDS_TO_FEED) && !this.d.a()) {
            Collection f = ajzn.f(this.b.a(FriendLinkType.OUTGOING, this.d.b()));
            if (f != null) {
                int i = 0;
                Object[] toArray = f.toArray(new ajxm[0]);
                if (toArray != null) {
                    ajxm[] ajxmArr = (ajxm[]) toArray;
                    if (ajxmArr.length == 0) {
                        i = 1;
                    }
                    if ((i ^ 1) != 0) {
                        ((qxl) this.c.get()).a(dbTransaction, (ajxm[]) Arrays.copyOf(ajxmArr, ajxmArr.length));
                    }
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }
}
