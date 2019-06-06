package com.snap.core.db.query;

import com.snap.core.db.query.SendToModel.GetGroupsCreator;
import com.snap.core.db.query.SendToModel.GetGroupsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$HsVO0j96eL8P9G_h5C1pABW0dbI implements GetGroupsCreator {
    public static final /* synthetic */ -$$Lambda$HsVO0j96eL8P9G_h5C1pABW0dbI INSTANCE = new -$$Lambda$HsVO0j96eL8P9G_h5C1pABW0dbI();

    private /* synthetic */ -$$Lambda$HsVO0j96eL8P9G_h5C1pABW0dbI() {
    }

    public final GetGroupsModel create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3) {
        return new AutoValue_LegacySendToQueries_Group(j, str, str2, str3, str4, str5, str6, str7, str8, l, l2, l3);
    }
}
