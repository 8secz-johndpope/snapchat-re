package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.record.FriendModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface FriendFiltersModel {

    public interface GetFriendInfoCreator<T extends GetFriendInfoModel> {
        T create(String str, String str2, Long l, CalendarDate calendarDate);
    }

    public static final class Factory<T1 extends FriendModel> {
        com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        final class GetFriendInfoQuery extends ainx {
            private final String username;

            GetFriendInfoQuery(String str) {
                super("SELECT friendmojiCategories, bitmojiAvatarId, streakExpiration, birthday\nFROM Friend\nWHERE username=?1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        public Factory(com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.friendModelFactory = factory;
        }

        public final ainx getFriendInfo(String str) {
            return new GetFriendInfoQuery(str);
        }

        public final <R extends GetFriendInfoModel> GetFriendInfoMapper<R, T1> getFriendInfoMapper(GetFriendInfoCreator<R> getFriendInfoCreator) {
            return new GetFriendInfoMapper(getFriendInfoCreator, this.friendModelFactory);
        }
    }

    public static final class GetFriendInfoMapper<T extends GetFriendInfoModel, T1 extends FriendModel> implements ainw<T> {
        private final GetFriendInfoCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public GetFriendInfoMapper(GetFriendInfoCreator<T> getFriendInfoCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = getFriendInfoCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetFriendInfoCreator getFriendInfoCreator = this.creator;
            CalendarDate calendarDate = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            Long valueOf = cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2));
            if (!cursor.isNull(3)) {
                calendarDate = (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor.getLong(3)));
            }
            return getFriendInfoCreator.create(string, string2, valueOf, calendarDate);
        }
    }

    public interface GetFriendInfoModel {
        CalendarDate birthday();

        String bitmojiAvatarId();

        String friendmojiCategories();

        Long streakExpiration();
    }
}
