package com.snap.core.db.query;

import com.snap.core.db.query.SearchModel.GetSearchSuggestedFriendsCreator;
import com.snap.core.db.query.SearchModel.GetSearchSuggestedFriendsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Bs4L1iFGoTPc6OSvFGB4j8tIGDs implements GetSearchSuggestedFriendsCreator {
    public static final /* synthetic */ -$$Lambda$Bs4L1iFGoTPc6OSvFGB4j8tIGDs INSTANCE = new -$$Lambda$Bs4L1iFGoTPc6OSvFGB4j8tIGDs();

    private /* synthetic */ -$$Lambda$Bs4L1iFGoTPc6OSvFGB4j8tIGDs() {
    }

    public final GetSearchSuggestedFriendsModel create(long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Long l, Long l2, Long l3, Boolean bool, boolean z2, boolean z3, String str7, String str8) {
        return new AutoValue_LegacySearchQueries_SuggestedFriend(j, str, str2, str3, str4, str5, str6, z, l, l2, l3, bool, z2, z3, str7, str8);
    }
}
