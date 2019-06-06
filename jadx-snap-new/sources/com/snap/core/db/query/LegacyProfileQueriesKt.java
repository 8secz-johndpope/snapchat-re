package com.snap.core.db.query;

import com.snap.core.db.query.LegacyProfileQueries.FriendProfileDataRecord;
import defpackage.akcr;
import defpackage.akgc;
import java.util.List;

public final class LegacyProfileQueriesKt {
    public static final String getFirstName(FriendProfileDataRecord friendProfileDataRecord) {
        akcr.b(friendProfileDataRecord, "receiver$0");
        String friendDisplayName = friendProfileDataRecord.friendDisplayName();
        if (friendDisplayName != null) {
            List a = akgc.a((CharSequence) friendDisplayName, new String[]{" "}, 0, 6);
            if (a != null) {
                return (String) a.get(0);
            }
        }
        return null;
    }
}
