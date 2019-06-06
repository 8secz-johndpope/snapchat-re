package com.snap.ui.avatar;

import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import defpackage.aipn;
import defpackage.akbk;
import defpackage.akcs;
import defpackage.ide;
import defpackage.zgu;

final class AvatarCache$snapDb$2 extends akcs implements akbk<DbClient> {
    final /* synthetic */ aipn $snapDbLazy;

    AvatarCache$snapDb$2(aipn aipn) {
        this.$snapDbLazy = aipn;
        super(0);
    }

    public final DbClient invoke() {
        return ((SnapDb) this.$snapDbLazy.get()).getDbClient((ide) zgu.a);
    }
}
