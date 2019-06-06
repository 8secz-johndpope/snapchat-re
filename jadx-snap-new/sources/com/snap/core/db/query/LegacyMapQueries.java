package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.MapModel.Factory;
import com.snap.core.db.query.MapModel.GetFriendByUserIdCreator;
import com.snap.core.db.query.MapModel.GetFriendByUserIdModel;
import defpackage.ainw;
import defpackage.akbu;
import defpackage.akco;
import defpackage.akcr;

@AutoValue
public abstract class LegacyMapQueries implements MapModel {
    public static final Companion Companion = new Companion();
    private static final Factory<com.snap.core.db.record.FriendRecord> FACTORY;
    private static final ainw<FriendRecord> GET_FRIEND_FROM_USERID_MAPPER;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Factory<com.snap.core.db.record.FriendRecord> getFACTORY() {
            return LegacyMapQueries.FACTORY;
        }

        public final ainw<FriendRecord> getGET_FRIEND_FROM_USERID_MAPPER() {
            return LegacyMapQueries.GET_FRIEND_FROM_USERID_MAPPER;
        }
    }

    @AutoValue
    public static abstract class FriendRecord implements GetFriendByUserIdModel {
    }

    static {
        Factory factory = new Factory(com.snap.core.db.record.FriendRecord.FACTORY);
        FACTORY = factory;
        akbu akbu = LegacyMapQueries$Companion$GET_FRIEND_FROM_USERID_MAPPER$1.INSTANCE;
        if (akbu != null) {
            akbu = new LegacyMapQueriesKt$sam$com_snap_core_db_query_MapModel_GetFriendByUserIdCreator$0(akbu);
        }
        Object friendByUserIdMapper = factory.getFriendByUserIdMapper((GetFriendByUserIdCreator) akbu);
        akcr.a(friendByUserIdMapper, "FACTORY.getFriendByUserI…yMapQueries_FriendRecord)");
        GET_FRIEND_FROM_USERID_MAPPER = (ainw) friendByUserIdMapper;
    }
}
