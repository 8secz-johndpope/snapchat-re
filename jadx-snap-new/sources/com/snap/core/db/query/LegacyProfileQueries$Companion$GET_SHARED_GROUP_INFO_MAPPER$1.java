package com.snap.core.db.query;

import defpackage.akbw;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class LegacyProfileQueries$Companion$GET_SHARED_GROUP_INFO_MAPPER$1 extends akcq implements akbw<Long, Long, AutoValue_LegacyProfileQueries_SharedGroupInfo> {
    public static final LegacyProfileQueries$Companion$GET_SHARED_GROUP_INFO_MAPPER$1 INSTANCE = new LegacyProfileQueries$Companion$GET_SHARED_GROUP_INFO_MAPPER$1();

    LegacyProfileQueries$Companion$GET_SHARED_GROUP_INFO_MAPPER$1() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_LegacyProfileQueries_SharedGroupInfo.class);
    }

    public final String getSignature() {
        return "<init>(JJ)V";
    }

    public final AutoValue_LegacyProfileQueries_SharedGroupInfo invoke(long j, long j2) {
        return new AutoValue_LegacyProfileQueries_SharedGroupInfo(j, j2);
    }
}
