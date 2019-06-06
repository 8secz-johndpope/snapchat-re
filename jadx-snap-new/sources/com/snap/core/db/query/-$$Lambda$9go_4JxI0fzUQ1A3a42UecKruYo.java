package com.snap.core.db.query;

import com.snap.core.db.query.SearchModel.GetSearchGroupsCreator;
import com.snap.core.db.query.SearchModel.GetSearchGroupsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$9go_4JxI0fzUQ1A3a42UecKruYo implements GetSearchGroupsCreator {
    public static final /* synthetic */ -$$Lambda$9go_4JxI0fzUQ1A3a42UecKruYo INSTANCE = new -$$Lambda$9go_4JxI0fzUQ1A3a42UecKruYo();

    private /* synthetic */ -$$Lambda$9go_4JxI0fzUQ1A3a42UecKruYo() {
    }

    public final GetSearchGroupsModel create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, Boolean bool2) {
        return new AutoValue_LegacySearchQueries_Group(j, str, str2, str3, str4, str5, str6, str7, str8, str9, l, l2, l3, l4, l5, bool, bool2);
    }
}
