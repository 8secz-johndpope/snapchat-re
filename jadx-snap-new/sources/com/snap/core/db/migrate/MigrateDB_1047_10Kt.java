package com.snap.core.db.migrate;

import com.snap.core.db.SnapDbSchema.Tables;
import defpackage.ajxm;
import defpackage.akcr;
import defpackage.pa;

public final class MigrateDB_1047_10Kt {
    public static final void removeDanglingReferencesPointingToFriendAndFeedTable(pa paVar) {
        String str;
        akcr.b(paVar, "db");
        r1 = new ajxm[9];
        String str2 = "friendRowId";
        int i = 0;
        r1[0] = new ajxm(Tables.BEST_FRIEND, str2);
        r1[1] = new ajxm(Tables.CONTACTS, str2);
        r1[2] = new ajxm(Tables.FEED, str2);
        r1[3] = new ajxm(Tables.FEED_MEMBER, str2);
        r1[4] = new ajxm(Tables.FRIEND_WHO_ADDDED_ME, str2);
        r1[5] = new ajxm(Tables.SUGGESTED_FRIEND, str2);
        r1[6] = new ajxm(Tables.SUGGESTED_FRIEND_PLACEMENT, str2);
        r1[7] = new ajxm(Tables.NETWORK_MESSAGE, "senderId");
        r1[8] = new ajxm(Tables.LOCAL_MESSAGE_ACTION, "senderUserId");
        Tables[] tablesArr = new Tables[]{Tables.FEED_ITEM_SYNC_STATE, Tables.FEED_MEMBER, Tables.FEED_AST, Tables.FRIENDS_FEED_SERVER_SIGNAL, Tables.INTERACTION_MESSAGES, Tables.MESSAGE, Tables.MESSAGING_SNAP, Tables.PENDING_SNAP, Tables.SEEN_SEQUENCE_NUMBERS, Tables.SEQUENCE_NUMBERS};
        int i2 = 0;
        while (true) {
            str = "DELETE FROM ";
            if (i2 >= 9) {
                break;
            }
            ajxm ajxm = r1[i2];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(((Tables) ajxm.a).getTableName());
            stringBuilder.append(" WHERE ");
            stringBuilder.append((String) ajxm.b);
            stringBuilder.append(" NOT IN (SELECT _id FROM Friend)");
            paVar.c(stringBuilder.toString());
            i2++;
        }
        while (i < 10) {
            Tables tables = tablesArr[i];
            StringBuilder stringBuilder2 = new StringBuilder(str);
            stringBuilder2.append(tables.getTableName());
            stringBuilder2.append(" WHERE feedRowId NOT IN (SELECT _id FROM Feed)");
            paVar.c(stringBuilder2.toString());
            i++;
        }
        paVar.c("DELETE FROM FriendSyncState");
        paVar.c("DELETE FROM FeedSyncState");
    }
}
