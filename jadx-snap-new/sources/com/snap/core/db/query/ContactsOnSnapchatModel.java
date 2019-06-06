package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.record.ContactModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;

public interface ContactsOnSnapchatModel {

    public static final class Factory {
        public final ainx selectContactsOnSnapchat() {
            return new ainx("SELECT\n    Friend._id,\n    Friend.username,\n    Friend.userId,\n    Friend.displayName,\n    Friend.bitmojiSelfieId,\n    Friend.bitmojiAvatarId,\n    Contact.added AS isAdded,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp\nFROM Friend\nINNER JOIN Contact ON Friend._id = Contact.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON (Story.userName = Friend.username AND Story.kind = 0)\nWHERE Contact.isSnapchatter = 1  AND Friend.friendLinkType != 2\nORDER BY Friend.displayName COLLATE NOCASE", new aioa(FriendModel.TABLE_NAME, ContactModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
        }

        public final <R extends SelectContactsOnSnapchatModel> SelectContactsOnSnapchatMapper<R> selectContactsOnSnapchatMapper(SelectContactsOnSnapchatCreator<R> selectContactsOnSnapchatCreator) {
            return new SelectContactsOnSnapchatMapper(selectContactsOnSnapchatCreator);
        }
    }

    public interface SelectContactsOnSnapchatCreator<T extends SelectContactsOnSnapchatModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, boolean z, Long l, Boolean bool, Long l2, Long l3);
    }

    public interface SelectContactsOnSnapchatModel {
        long _id();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        boolean isAdded();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Long storyRowId();

        Boolean storyViewed();

        String userId();

        String username();
    }

    public static final class SelectContactsOnSnapchatMapper<T extends SelectContactsOnSnapchatModel> implements ainw<T> {
        private final SelectContactsOnSnapchatCreator<T> creator;

        public SelectContactsOnSnapchatMapper(SelectContactsOnSnapchatCreator<T> selectContactsOnSnapchatCreator) {
            this.creator = selectContactsOnSnapchatCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectContactsOnSnapchatCreator selectContactsOnSnapchatCreator = this.creator;
            boolean z = false;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            boolean z2 = cursor2.getInt(6) == 1;
            Long valueOf = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            if (cursor2.isNull(8)) {
                bool = null;
            } else {
                if (cursor2.getInt(8) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return selectContactsOnSnapchatCreator.create(j, string, string2, string3, string4, string5, z2, valueOf, bool, cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)));
        }
    }
}
