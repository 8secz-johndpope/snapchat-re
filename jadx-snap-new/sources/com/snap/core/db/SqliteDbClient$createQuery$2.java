package com.snap.core.db;

import com.snap.core.db.api.androidxSqlbrite.AndroidxToSupportSQLiteQuery;
import defpackage.ad;
import defpackage.aimv;
import defpackage.aimw;
import defpackage.aimz.c;
import defpackage.ainx;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajfc;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import java.util.Set;

final class SqliteDbClient$createQuery$2 extends akcs implements akbk<ajdp<c>> {
    final /* synthetic */ ainx $statement;
    final /* synthetic */ Set $tables;
    final /* synthetic */ SqliteDbClient this$0;

    /* renamed from: com.snap.core.db.SqliteDbClient$createQuery$2$1 */
    static final class AnonymousClass1<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ SqliteDbClient$createQuery$2 this$0;

        AnonymousClass1(SqliteDbClient$createQuery$2 sqliteDbClient$createQuery$2) {
            this.this$0 = sqliteDbClient$createQuery$2;
        }

        public final aimw apply(aimv aimv) {
            akcr.b(aimv, "it");
            return aimv.a((Iterable) this.this$0.$tables, (ad) new AndroidxToSupportSQLiteQuery(this.this$0.$statement));
        }
    }

    SqliteDbClient$createQuery$2(SqliteDbClient sqliteDbClient, Set set, ainx ainx) {
        this.this$0 = sqliteDbClient;
        this.$tables = set;
        this.$statement = ainx;
        super(0);
    }

    public final ajdp<c> invoke() {
        Object d = this.this$0.getBriteDbSingle().d((ajfc) new AnonymousClass1(this));
        akcr.a(d, "briteDbSingle.flatMapObs…SQLiteQuery(statement)) }");
        return d;
    }
}
