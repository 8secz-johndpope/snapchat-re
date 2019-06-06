package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.CharmDataSourceType;
import com.snap.core.db.column.CharmOwnerType;
import com.snap.core.db.column.Friendmojis;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface CharmsModel {
    public static final String ADDCOLUMNBITMOJITEMPLATEUSER1IDMETADATA = "ALTER TABLE Charms\nADD COLUMN bitmojiTemplateUser1Id TEXT";
    public static final String ADDCOLUMNBITMOJITEMPLATEUSER2IDMETADATA = "ALTER TABLE Charms\nADD COLUMN bitmojiTemplateUser2Id TEXT";
    public static final String ADDCOLUMNDESCRIPTIONVARIABLESMETADATA = "ALTER TABLE Charms\nADD COLUMN descriptionVariablesMetadata TEXT";
    public static final String ADDCOLUMNDISPLAYCOUNT = "ALTER TABLE Charms\nADD COLUMN displayCount INTEGER";
    @Deprecated
    public static final String BITMOJITEMPLATEUSER1ID = "bitmojiTemplateUser1Id";
    @Deprecated
    public static final String BITMOJITEMPLATEUSER2ID = "bitmojiTemplateUser2Id";
    @Deprecated
    public static final String CHARMID = "charmId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Charms(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    ownerId TEXT NOT NULL,\n    charmId INTEGER NOT NULL,\n    ownerType INTEGER NOT NULL DEFAULT 0,\n    displayName TEXT NOT NULL,\n    descriptionTemplate TEXT NOT NULL,\n    descriptionVariables TEXT,  -- array of variables\n    descriptionVariablesMetadata TEXT, -- array of variable metadata\n\n    dialogButtonText TEXT,\n    hideable INTEGER NOT NULL DEFAULT 0,\n    displayOrder INTEGER NOT NULL DEFAULT 0,\n    unviewed INTEGER NOT NULL DEFAULT 0,\n\n    staticImageStickerId TEXT NOT NULL,\n\n    solomojiTemplateId TEXT,\n    friendmojiTemplateId TEXT,\n    bitmojiTemplateUser1Id TEXT,\n    bitmojiTemplateUser2Id TEXT,\n\n    locale TEXT NOT NULL,\n    source INTEGER NOT NULL DEFAULT 0,\n    hidden INTEGER NOT NULL DEFAULT 0,\n\n    displayCount INTEGER,\n\n    UNIQUE(ownerId, charmId)\n)";
    @Deprecated
    public static final String DESCRIPTIONTEMPLATE = "descriptionTemplate";
    @Deprecated
    public static final String DESCRIPTIONVARIABLES = "descriptionVariables";
    @Deprecated
    public static final String DESCRIPTIONVARIABLESMETADATA = "descriptionVariablesMetadata";
    @Deprecated
    public static final String DIALOGBUTTONTEXT = "dialogButtonText";
    @Deprecated
    public static final String DISPLAYCOUNT = "displayCount";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    @Deprecated
    public static final String DISPLAYORDER = "displayOrder";
    @Deprecated
    public static final String FRIENDMOJITEMPLATEID = "friendmojiTemplateId";
    @Deprecated
    public static final String HIDDEN = "hidden";
    @Deprecated
    public static final String HIDEABLE = "hideable";
    @Deprecated
    public static final String LOCALE = "locale";
    @Deprecated
    public static final String OWNERID = "ownerId";
    @Deprecated
    public static final String OWNERTYPE = "ownerType";
    @Deprecated
    public static final String SOLOMOJITEMPLATEID = "solomojiTemplateId";
    @Deprecated
    public static final String SOURCE = "source";
    @Deprecated
    public static final String STATICIMAGESTICKERID = "staticImageStickerId";
    @Deprecated
    public static final String TABLE_NAME = "Charms";
    @Deprecated
    public static final String UNVIEWED = "unviewed";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends CharmsModel> {
        T create(long j, String str, long j2, CharmOwnerType charmOwnerType, String str2, String str3, String str4, String str5, String str6, long j3, long j4, long j5, String str7, String str8, String str9, String str10, String str11, String str12, CharmDataSourceType charmDataSourceType, long j6, Long l);
    }

    public static final class Factory<T extends CharmsModel> {
        public final Creator<T> creator;
        public final ainu<CharmOwnerType, Long> ownerTypeAdapter;
        public final ainu<CharmDataSourceType, Long> sourceAdapter;

        final class RemoveCharmWithIdsQuery extends ainx {
            private final long[] charmId;
            private final String ownerId;
            private final CharmDataSourceType source;

            RemoveCharmWithIdsQuery(String str, CharmDataSourceType charmDataSourceType, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Charms\nWHERE ownerId = ?1\nAND source = ?2\nAND charmId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(CharmsModel.TABLE_NAME));
                this.ownerId = str;
                this.source = charmDataSourceType;
                this.charmId = jArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.ownerId);
                pcVar.bindLong(2, ((Long) Factory.this.sourceAdapter.encode(this.source)).longValue());
                long[] jArr = this.charmId;
                int length = jArr.length;
                int i = 3;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectCharmDataFromFriendForUserIdQuery extends ainx {
            private final String userId;

            SelectCharmDataFromFriendForUserIdQuery(String str) {
                super("SELECT\n    Friend.friendmojiCategories,\n    Friend.friendmojis,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.birthday,\n    Feed.lastInteractionTimestamp,\n    Feed.displayInteractionType\nFROM Friend\nLEFT JOIN Feed AS Feed ON Feed.friendRowId = Friend._id\nWHERE Friend.userId = ?1", new aioa(FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
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

        final class SelectCharmsListForOwnerIdQuery extends ainx {
            private final String ownerId;

            SelectCharmsListForOwnerIdQuery(String str) {
                super("SELECT\n    ownerId,\n    charmId,\n    displayName,\n    descriptionTemplate,\n    descriptionVariables,\n    descriptionVariablesMetadata,\n    hideable,\n    displayOrder,\n    unviewed,\n    staticImageStickerId,\n    solomojiTemplateId,\n    friendmojiTemplateId,\n    bitmojiTemplateUser1Id,\n    bitmojiTemplateUser2Id,\n    displayCount\nFROM Charms\nWHERE ownerId = ?1\nAND hidden = 0\nORDER BY unviewed DESC, displayOrder ASC, displayName ASC", new aioa(CharmsModel.TABLE_NAME));
                this.ownerId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.ownerId);
            }
        }

        final class SelectRemoteCharmsDeletedStateForOwnerIdQuery extends ainx {
            private final String ownerId;

            SelectRemoteCharmsDeletedStateForOwnerIdQuery(String str) {
                super("SELECT\n    ownerId,\n    charmId,\n    hidden\nFROM Charms\nWHERE ownerId = ?1\nAND hidden > 0\nAND source = 1 -- remote\nORDER BY charmId", new aioa(CharmsModel.TABLE_NAME));
                this.ownerId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.ownerId);
            }
        }

        final class SelectRemoteCharmsViewedStateForOwnerIdQuery extends ainx {
            private final String ownerId;

            SelectRemoteCharmsViewedStateForOwnerIdQuery(String str) {
                super("SELECT\n    ownerId,\n    charmId,\n    unviewed\nFROM Charms\nWHERE ownerId = ?1\nAND unviewed = 0\nAND source = 1 -- remote\nORDER BY charmId", new aioa(CharmsModel.TABLE_NAME));
                this.ownerId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.ownerId);
            }
        }

        final class SetSoftDeletionForCharmsWithIdsForOwnerQuery extends ainx {
            private final long[] charmId;
            private final long hidden;
            private final String ownerId;

            SetSoftDeletionForCharmsWithIdsForOwnerQuery(long j, String str, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("UPDATE Charms\nSET hidden = ?1\nWHERE ownerId = ?2\nAND charmId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(CharmsModel.TABLE_NAME));
                this.hidden = j;
                this.ownerId = str;
                this.charmId = jArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.hidden);
                pcVar.bindString(2, this.ownerId);
                long[] jArr = this.charmId;
                int length = jArr.length;
                int i = 3;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SetUnviewedOnCharmIdsQuery extends ainx {
            private final long[] charmId;
            private final String ownerId;
            private final long unviewed;

            SetUnviewedOnCharmIdsQuery(long j, String str, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("UPDATE Charms\nSET unviewed = ?1\nWHERE ownerId = ?2 AND charmId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(CharmsModel.TABLE_NAME));
                this.unviewed = j;
                this.ownerId = str;
                this.charmId = jArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.unviewed);
                pcVar.bindString(2, this.ownerId);
                long[] jArr = this.charmId;
                int length = jArr.length;
                int i = 3;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public Factory(Creator<T> creator, ainu<CharmOwnerType, Long> ainu, ainu<CharmDataSourceType, Long> ainu2) {
            this.creator = creator;
            this.ownerTypeAdapter = ainu;
            this.sourceAdapter = ainu2;
        }

        public final ainx removeCharmWithIds(String str, CharmDataSourceType charmDataSourceType, long[] jArr) {
            return new RemoveCharmWithIdsQuery(str, charmDataSourceType, jArr);
        }

        public final ainx selectCharmDataFromFriendForUserId(String str) {
            return new SelectCharmDataFromFriendForUserIdQuery(str);
        }

        public final <R extends SelectCharmDataFromFriendForUserIdModel, T1 extends FriendModel> SelectCharmDataFromFriendForUserIdMapper<R, T1> selectCharmDataFromFriendForUserIdMapper(SelectCharmDataFromFriendForUserIdCreator<R> selectCharmDataFromFriendForUserIdCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            return new SelectCharmDataFromFriendForUserIdMapper(selectCharmDataFromFriendForUserIdCreator, factory);
        }

        public final ainx selectCharmsListForOwnerId(String str) {
            return new SelectCharmsListForOwnerIdQuery(str);
        }

        public final <R extends SelectCharmsListForOwnerIdModel> SelectCharmsListForOwnerIdMapper<R> selectCharmsListForOwnerIdMapper(SelectCharmsListForOwnerIdCreator<R> selectCharmsListForOwnerIdCreator) {
            return new SelectCharmsListForOwnerIdMapper(selectCharmsListForOwnerIdCreator);
        }

        public final ainx selectRemoteCharmsDeletedStateForOwnerId(String str) {
            return new SelectRemoteCharmsDeletedStateForOwnerIdQuery(str);
        }

        public final <R extends SelectRemoteCharmsDeletedStateForOwnerIdModel> SelectRemoteCharmsDeletedStateForOwnerIdMapper<R> selectRemoteCharmsDeletedStateForOwnerIdMapper(SelectRemoteCharmsDeletedStateForOwnerIdCreator<R> selectRemoteCharmsDeletedStateForOwnerIdCreator) {
            return new SelectRemoteCharmsDeletedStateForOwnerIdMapper(selectRemoteCharmsDeletedStateForOwnerIdCreator);
        }

        public final ainx selectRemoteCharmsViewedStateForOwnerId(String str) {
            return new SelectRemoteCharmsViewedStateForOwnerIdQuery(str);
        }

        public final <R extends SelectRemoteCharmsViewedStateForOwnerIdModel> SelectRemoteCharmsViewedStateForOwnerIdMapper<R> selectRemoteCharmsViewedStateForOwnerIdMapper(SelectRemoteCharmsViewedStateForOwnerIdCreator<R> selectRemoteCharmsViewedStateForOwnerIdCreator) {
            return new SelectRemoteCharmsViewedStateForOwnerIdMapper(selectRemoteCharmsViewedStateForOwnerIdCreator);
        }

        public final ainx setSoftDeletionForCharmsWithIdsForOwner(long j, String str, long[] jArr) {
            return new SetSoftDeletionForCharmsWithIdsForOwnerQuery(j, str, jArr);
        }

        public final ainx setUnviewedOnCharmIds(long j, String str, long[] jArr) {
            return new SetUnviewedOnCharmIdsQuery(j, str, jArr);
        }
    }

    public interface SelectCharmDataFromFriendForUserIdCreator<T extends SelectCharmDataFromFriendForUserIdModel> {
        T create(String str, Friendmojis friendmojis, Long l, Long l2, Integer num, Long l3, CalendarDate calendarDate, Long l4, String str2);
    }

    public interface SelectCharmDataFromFriendForUserIdModel {
        Long addedTimestamp();

        CalendarDate birthday();

        String displayInteractionType();

        String friendmojiCategories();

        Friendmojis friendmojis();

        Long lastInteractionTimestamp();

        Long reverseAddedTimestamp();

        Long streakExpiration();

        Integer streakLength();
    }

    public interface SelectCharmsListForOwnerIdCreator<T extends SelectCharmsListForOwnerIdModel> {
        T create(String str, long j, String str2, String str3, String str4, String str5, long j2, long j3, long j4, String str6, String str7, String str8, String str9, String str10, Long l);
    }

    public interface SelectCharmsListForOwnerIdModel {
        String bitmojiTemplateUser1Id();

        String bitmojiTemplateUser2Id();

        long charmId();

        String descriptionTemplate();

        String descriptionVariables();

        String descriptionVariablesMetadata();

        Long displayCount();

        String displayName();

        long displayOrder();

        String friendmojiTemplateId();

        long hideable();

        String ownerId();

        String solomojiTemplateId();

        String staticImageStickerId();

        long unviewed();
    }

    public interface SelectRemoteCharmsDeletedStateForOwnerIdCreator<T extends SelectRemoteCharmsDeletedStateForOwnerIdModel> {
        T create(String str, long j, long j2);
    }

    public interface SelectRemoteCharmsDeletedStateForOwnerIdModel {
        long charmId();

        long hidden();

        String ownerId();
    }

    public interface SelectRemoteCharmsViewedStateForOwnerIdCreator<T extends SelectRemoteCharmsViewedStateForOwnerIdModel> {
        T create(String str, long j, long j2);
    }

    public interface SelectRemoteCharmsViewedStateForOwnerIdModel {
        long charmId();

        String ownerId();

        long unviewed();
    }

    public static final class Mapper<T extends CharmsModel> implements ainw<T> {
        private final Factory<T> charmsModelFactory;

        public Mapper(Factory<T> factory) {
            this.charmsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.charmsModelFactory.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getLong(2), (CharmOwnerType) this.charmsModelFactory.ownerTypeAdapter.decode(Long.valueOf(cursor2.getLong(3))), cursor2.getString(4), cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.getLong(9), cursor2.getLong(10), cursor2.getLong(11), cursor2.getString(12), cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : cursor2.getString(15), cursor2.isNull(16) ? null : cursor2.getString(16), cursor2.getString(17), (CharmDataSourceType) this.charmsModelFactory.sourceAdapter.decode(Long.valueOf(cursor2.getLong(18))), cursor2.getLong(19), cursor2.isNull(20) ? null : Long.valueOf(cursor2.getLong(20)));
        }
    }

    public static final class SelectCharmDataFromFriendForUserIdMapper<T extends SelectCharmDataFromFriendForUserIdModel, T1 extends FriendModel> implements ainw<T> {
        private final SelectCharmDataFromFriendForUserIdCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T1> friendModelFactory;

        public SelectCharmDataFromFriendForUserIdMapper(SelectCharmDataFromFriendForUserIdCreator<T> selectCharmDataFromFriendForUserIdCreator, com.snap.core.db.record.FriendModel.Factory<T1> factory) {
            this.creator = selectCharmDataFromFriendForUserIdCreator;
            this.friendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.isNull(1) ? null : (Friendmojis) this.friendModelFactory.friendmojisAdapter.decode(cursor.getString(1)), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : Integer.valueOf(cursor.getInt(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)), cursor.isNull(6) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor.getLong(6))), cursor.isNull(7) ? null : Long.valueOf(cursor.getLong(7)), cursor.isNull(8) ? null : cursor.getString(8));
        }
    }

    public static final class SelectCharmsListForOwnerIdMapper<T extends SelectCharmsListForOwnerIdModel> implements ainw<T> {
        private final SelectCharmsListForOwnerIdCreator<T> creator;

        public SelectCharmsListForOwnerIdMapper(SelectCharmsListForOwnerIdCreator<T> selectCharmsListForOwnerIdCreator) {
            this.creator = selectCharmsListForOwnerIdCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getString(0), cursor2.getLong(1), cursor2.getString(2), cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.getLong(6), cursor2.getLong(7), cursor2.getLong(8), cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14)));
        }
    }

    public static final class SelectRemoteCharmsDeletedStateForOwnerIdMapper<T extends SelectRemoteCharmsDeletedStateForOwnerIdModel> implements ainw<T> {
        private final SelectRemoteCharmsDeletedStateForOwnerIdCreator<T> creator;

        public SelectRemoteCharmsDeletedStateForOwnerIdMapper(SelectRemoteCharmsDeletedStateForOwnerIdCreator<T> selectRemoteCharmsDeletedStateForOwnerIdCreator) {
            this.creator = selectRemoteCharmsDeletedStateForOwnerIdCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1), cursor.getLong(2));
        }
    }

    public static final class SelectRemoteCharmsViewedStateForOwnerIdMapper<T extends SelectRemoteCharmsViewedStateForOwnerIdModel> implements ainw<T> {
        private final SelectRemoteCharmsViewedStateForOwnerIdCreator<T> creator;

        public SelectRemoteCharmsViewedStateForOwnerIdMapper(SelectRemoteCharmsViewedStateForOwnerIdCreator<T> selectRemoteCharmsViewedStateForOwnerIdCreator) {
            this.creator = selectRemoteCharmsViewedStateForOwnerIdCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1), cursor.getLong(2));
        }
    }

    public static final class InsertCharm extends ainy {
        private final Factory<? extends CharmsModel> charmsModelFactory;

        public InsertCharm(pa paVar, Factory<? extends CharmsModel> factory) {
            super(CharmsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Charms(\n    ownerId,\n    charmId,\n    ownerType,\n    displayName,\n    descriptionTemplate,\n    descriptionVariables,\n    descriptionVariablesMetadata,\n    dialogButtonText,\n    hideable,\n    displayOrder,\n    unviewed,\n    staticImageStickerId,\n    solomojiTemplateId,\n    friendmojiTemplateId,\n    bitmojiTemplateUser1Id,\n    bitmojiTemplateUser2Id,\n    locale,\n    source,\n    hidden,\n    displayCount\n)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.charmsModelFactory = factory;
        }

        public final void bind(String str, long j, CharmOwnerType charmOwnerType, String str2, String str3, String str4, String str5, String str6, long j2, long j3, long j4, String str7, String str8, String str9, String str10, String str11, String str12, CharmDataSourceType charmDataSourceType, long j5, Long l) {
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            String str16 = str8;
            String str17 = str9;
            String str18 = str10;
            String str19 = str11;
            String str20 = str;
            bindString(1, str);
            long j6 = j;
            bindLong(2, j);
            CharmOwnerType charmOwnerType2 = charmOwnerType;
            bindLong(3, ((Long) this.charmsModelFactory.ownerTypeAdapter.encode(charmOwnerType)).longValue());
            bindString(4, str2);
            bindString(5, str3);
            if (str13 == null) {
                bindNull(6);
            } else {
                bindString(6, str13);
            }
            if (str14 == null) {
                bindNull(7);
            } else {
                bindString(7, str14);
            }
            if (str15 == null) {
                bindNull(8);
            } else {
                bindString(8, str15);
            }
            bindLong(9, j2);
            bindLong(10, j3);
            bindLong(11, j4);
            bindString(12, str7);
            if (str16 == null) {
                bindNull(13);
            } else {
                bindString(13, str16);
            }
            if (str17 == null) {
                bindNull(14);
            } else {
                bindString(14, str17);
            }
            if (str18 == null) {
                bindNull(15);
            } else {
                bindString(15, str18);
            }
            if (str19 == null) {
                bindNull(16);
            } else {
                bindString(16, str19);
            }
            bindString(17, str12);
            bindLong(18, ((Long) this.charmsModelFactory.sourceAdapter.encode(charmDataSourceType)).longValue());
            bindLong(19, j5);
            if (l == null) {
                bindNull(20);
            } else {
                bindLong(20, l.longValue());
            }
        }
    }

    public static final class InsertLocalCharm extends ainy {
        private final Factory<? extends CharmsModel> charmsModelFactory;

        public InsertLocalCharm(pa paVar, Factory<? extends CharmsModel> factory) {
            super(CharmsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Charms(\n    ownerId,\n    charmId,\n    ownerType,\n    displayName,\n    descriptionTemplate,\n    descriptionVariables,\n    dialogButtonText,\n    hideable,\n    displayOrder,\n    unviewed,\n    staticImageStickerId,\n    solomojiTemplateId,\n    friendmojiTemplateId,\n    bitmojiTemplateUser1Id,\n    bitmojiTemplateUser2Id,\n    locale,\n    source,\n    hidden,\n    displayCount\n)\nVALUES(\n    ?, ?, ?, ?, ?, ?, ?, ?,\n    COALESCE((SELECT displayOrder FROM Charms WHERE charmId = ? AND ownerId = ?), ?),\n    COALESCE((SELECT unviewed FROM Charms WHERE charmId = ? AND ownerId = ?), ?),\n    ?, ?, ?, ?, ?, ?, ?,\n    (SELECT hidden FROM Charms WHERE charmId = ? AND ownerId = ?),\n    ?\n)"));
            this.charmsModelFactory = factory;
        }

        public final void bind(String str, long j, CharmOwnerType charmOwnerType, String str2, String str3, String str4, String str5, long j2, long j3, String str6, Object obj, long j4, String str7, Object obj2, String str8, String str9, String str10, String str11, String str12, String str13, CharmDataSourceType charmDataSourceType, long j5, String str14, Long l) {
            String str15 = str4;
            String str16 = str5;
            Object obj3 = obj;
            Object obj4 = obj2;
            String str17 = str9;
            String str18 = str10;
            String str19 = str11;
            String str20 = str12;
            String str21 = str;
            bindString(1, str);
            bindLong(2, j);
            bindLong(3, ((Long) this.charmsModelFactory.ownerTypeAdapter.encode(charmOwnerType)).longValue());
            bindString(4, str2);
            bindString(5, str3);
            if (str15 == null) {
                bindNull(6);
            } else {
                bindString(6, str15);
            }
            if (str16 == null) {
                bindNull(7);
            } else {
                bindString(7, str16);
            }
            bindLong(8, j2);
            bindLong(9, j3);
            bindString(10, str6);
            long j6 = 0;
            if (obj3 == null) {
                bindNull(11);
            } else if (obj3 instanceof String) {
                bindString(11, (String) obj3);
            } else if ((obj3 instanceof Float) || (obj3 instanceof Double)) {
                bindDouble(11, ((Double) obj3).doubleValue());
            } else {
                long longValue;
                if ((obj3 instanceof Integer) || (obj3 instanceof Short) || (obj3 instanceof Long)) {
                    longValue = ((Long) obj3).longValue();
                } else if (obj3 instanceof Boolean) {
                    longValue = ((Boolean) obj3).booleanValue() ? 1 : 0;
                } else if (obj3 instanceof byte[]) {
                    bindBlob(11, (byte[]) obj3);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg11");
                }
                bindLong(11, longValue);
            }
            bindLong(12, j4);
            bindString(13, str7);
            if (obj4 == null) {
                bindNull(14);
            } else if (obj4 instanceof String) {
                bindString(14, (String) obj4);
            } else if ((obj4 instanceof Float) || (obj4 instanceof Double)) {
                bindDouble(14, ((Double) obj4).doubleValue());
            } else if ((obj4 instanceof Integer) || (obj4 instanceof Short) || (obj4 instanceof Long)) {
                bindLong(14, ((Long) obj4).longValue());
            } else if (obj4 instanceof Boolean) {
                if (((Boolean) obj4).booleanValue()) {
                    j6 = 1;
                }
                bindLong(14, j6);
            } else if (obj4 instanceof byte[]) {
                bindBlob(14, (byte[]) obj4);
            } else {
                throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg14");
            }
            bindString(15, str8);
            if (str17 == null) {
                bindNull(16);
            } else {
                bindString(16, str17);
            }
            if (str18 == null) {
                bindNull(17);
            } else {
                bindString(17, str18);
            }
            if (str19 == null) {
                bindNull(18);
            } else {
                bindString(18, str19);
            }
            if (str20 == null) {
                bindNull(19);
            } else {
                bindString(19, str20);
            }
            bindString(20, str13);
            bindLong(21, ((Long) this.charmsModelFactory.sourceAdapter.encode(charmDataSourceType)).longValue());
            bindLong(22, j5);
            bindString(23, str14);
            if (l == null) {
                bindNull(24);
            } else {
                bindLong(24, l.longValue());
            }
        }
    }

    public static final class RemoveCharmsForOwner extends ainy {
        private final Factory<? extends CharmsModel> charmsModelFactory;

        public RemoveCharmsForOwner(pa paVar, Factory<? extends CharmsModel> factory) {
            super(CharmsModel.TABLE_NAME, paVar.a("DELETE FROM Charms\nWHERE ownerId = ?\nAND source = ?"));
            this.charmsModelFactory = factory;
        }

        public final void bind(String str, CharmDataSourceType charmDataSourceType) {
            bindString(1, str);
            bindLong(2, ((Long) this.charmsModelFactory.sourceAdapter.encode(charmDataSourceType)).longValue());
        }
    }

    long _id();

    String bitmojiTemplateUser1Id();

    String bitmojiTemplateUser2Id();

    long charmId();

    String descriptionTemplate();

    String descriptionVariables();

    String descriptionVariablesMetadata();

    String dialogButtonText();

    Long displayCount();

    String displayName();

    long displayOrder();

    String friendmojiTemplateId();

    long hidden();

    long hideable();

    String locale();

    String ownerId();

    CharmOwnerType ownerType();

    String solomojiTemplateId();

    CharmDataSourceType source();

    String staticImageStickerId();

    long unviewed();
}
