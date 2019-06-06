package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.record.FriendModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;

public interface LocationSharingModel {

    public static final class Factory<T1 extends FriendModel> {
        com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public Factory(com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.friendModelFactory = factory;
        }

        public final ainx getFriendsLinkType() {
            return new ainx("SELECT\n    userId,\n    username,\n    displayName,\n    friendLinkType\nFROM Friend\nWHERE friendLinkType IS NOT 1\nOR addedTimestamp IS NOT 0", new aioa(FriendModel.TABLE_NAME));
        }

        public final <R extends GetFriendsLinkTypeModel> GetFriendsLinkTypeMapper<R, T1> getFriendsLinkTypeMapper(GetFriendsLinkTypeCreator<R> getFriendsLinkTypeCreator) {
            return new GetFriendsLinkTypeMapper(getFriendsLinkTypeCreator, this.friendModelFactory);
        }
    }

    public static final class GetFriendsLinkTypeMapper<T extends GetFriendsLinkTypeModel, T1 extends FriendModel> implements ainw<T> {
        private final GetFriendsLinkTypeCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetFriendsLinkTypeMapper(GetFriendsLinkTypeCreator<T> getFriendsLinkTypeCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getFriendsLinkTypeCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetFriendsLinkTypeCreator getFriendsLinkTypeCreator = this.creator;
            FriendLinkType friendLinkType = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.getString(1);
            String string3 = cursor.isNull(2) ? null : cursor.getString(2);
            if (!cursor.isNull(3)) {
                friendLinkType = (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(3)));
            }
            return getFriendsLinkTypeCreator.create(string, string2, string3, friendLinkType);
        }
    }

    public interface GetFriendsLinkTypeCreator<T extends GetFriendsLinkTypeModel> {
        T create(String str, String str2, String str3, FriendLinkType friendLinkType);
    }

    public interface GetFriendsLinkTypeModel {
        String displayName();

        FriendLinkType friendLinkType();

        String userId();

        String username();
    }
}
