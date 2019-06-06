package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FriendLinkType;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface FriendTestModel {

    public static final class Factory<T1 extends FriendModel> {
        com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        final class SelectFriendTestDataByUserIdQuery extends ainx {
            private final String userId;

            SelectFriendTestDataByUserIdQuery(String str) {
                super("SELECT\n    userId,\n    username,\n    _id,\n    friendLinkType\nFROM Friend\nWHERE userId = ?1", new aioa(FriendModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.userId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectFriendTestDataByUsernameQuery extends ainx {
            private final String username;

            SelectFriendTestDataByUsernameQuery(String str) {
                super("SELECT\n    userId,\n    username,\n    _id,\n    friendLinkType\nFROM Friend\nWHERE username = ?1", new aioa(FriendModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        public Factory(com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.friendModelFactory = factory;
        }

        public final ainx selectFriendTestDataByUserId(String str) {
            return new SelectFriendTestDataByUserIdQuery(str);
        }

        public final <R extends SelectFriendTestDataByUserIdModel> SelectFriendTestDataByUserIdMapper<R, T1> selectFriendTestDataByUserIdMapper(SelectFriendTestDataByUserIdCreator<R> selectFriendTestDataByUserIdCreator) {
            return new SelectFriendTestDataByUserIdMapper(selectFriendTestDataByUserIdCreator, this.friendModelFactory);
        }

        public final ainx selectFriendTestDataByUsername(String str) {
            return new SelectFriendTestDataByUsernameQuery(str);
        }

        public final <R extends SelectFriendTestDataByUsernameModel> SelectFriendTestDataByUsernameMapper<R, T1> selectFriendTestDataByUsernameMapper(SelectFriendTestDataByUsernameCreator<R> selectFriendTestDataByUsernameCreator) {
            return new SelectFriendTestDataByUsernameMapper(selectFriendTestDataByUsernameCreator, this.friendModelFactory);
        }
    }

    public interface SelectFriendTestDataByUserIdCreator<T extends SelectFriendTestDataByUserIdModel> {
        T create(String str, String str2, long j, FriendLinkType friendLinkType);
    }

    public interface SelectFriendTestDataByUserIdModel {
        long _id();

        FriendLinkType friendLinkType();

        String userId();

        String username();
    }

    public interface SelectFriendTestDataByUsernameCreator<T extends SelectFriendTestDataByUsernameModel> {
        T create(String str, String str2, long j, FriendLinkType friendLinkType);
    }

    public interface SelectFriendTestDataByUsernameModel {
        long _id();

        FriendLinkType friendLinkType();

        String userId();

        String username();
    }

    public static final class SelectFriendTestDataByUserIdMapper<T extends SelectFriendTestDataByUserIdModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectFriendTestDataByUserIdCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public SelectFriendTestDataByUserIdMapper(SelectFriendTestDataByUserIdCreator<T> selectFriendTestDataByUserIdCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = selectFriendTestDataByUserIdCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.getString(1), cursor.getLong(2), cursor.isNull(3) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(3))));
        }
    }

    public static final class SelectFriendTestDataByUsernameMapper<T extends SelectFriendTestDataByUsernameModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectFriendTestDataByUsernameCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public SelectFriendTestDataByUsernameMapper(SelectFriendTestDataByUsernameCreator<T> selectFriendTestDataByUsernameCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = selectFriendTestDataByUsernameCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.getString(1), cursor.getLong(2), cursor.isNull(3) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(3))));
        }
    }
}
