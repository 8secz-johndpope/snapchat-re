package com.snap.core.db.query;

import com.snap.core.db.query.LegacyMapQueries.FriendRecord;
import defpackage.akcr;
import defpackage.akgc;
import java.util.List;

public final class LegacyMapQueriesKt {
    public static final String getFirstName(FriendRecord friendRecord) {
        akcr.b(friendRecord, "receiver$0");
        String friendDisplayName = friendRecord.friendDisplayName();
        if (friendDisplayName != null) {
            List a = akgc.a((CharSequence) friendDisplayName, new String[]{" "}, 0, 6);
            if (a != null) {
                return (String) a.get(0);
            }
        }
        return null;
    }
}
