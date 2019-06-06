package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ageb;
import defpackage.agec;
import defpackage.ageh;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;
import java.util.List;

public interface MobStoryMetadataModel {
    @Deprecated
    public static final String CREATETIMESTAMP = "createTimestamp";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS MobStoryMetadata (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyRowId INTEGER NOT NULL,\n    creatorFriendRowId INTEGER, -- row id of mob story creator in Friend table\n    creatorUserId TEXT, -- from server response, prefer data from Friend table via creatorFriendRowId if available\n    creatorUsername TEXT, -- from server response, prefer data from Friend table via creatorFriendRowId if available\n    creatorDisplayName TEXT, -- from server response, prefer data from Friend table via creatorFriendRowId if available\n    createTimestamp INTEGER,\n    displayName TEXT,\n    subText TEXT,\n    storyType INTEGER NOT NULL,\n    typeExtraData BLOB NOT NULL,\n    usersWithAbilities BLOB\n)";
    @Deprecated
    public static final String CREATORDISPLAYNAME = "creatorDisplayName";
    @Deprecated
    public static final String CREATORFRIENDROWID = "creatorFriendRowId";
    @Deprecated
    public static final String CREATORUSERID = "creatorUserId";
    @Deprecated
    public static final String CREATORUSERNAME = "creatorUsername";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String STORYTYPE = "storyType";
    @Deprecated
    public static final String SUBTEXT = "subText";
    @Deprecated
    public static final String TABLE_NAME = "MobStoryMetadata";
    @Deprecated
    public static final String TYPEEXTRADATA = "typeExtraData";
    @Deprecated
    public static final String USERSWITHABILITIES = "usersWithAbilities";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends MobStoryMetadataModel> {
        T create(long j, long j2, Long l, String str, String str2, String str3, Long l2, String str4, String str5, ageb ageb, agec agec, List<ageh> list);
    }

    public interface SelectMobStoryMetadataCreator<T extends SelectMobStoryMetadataModel> {
        T create(long j, long j2, String str, String str2, String str3, Long l, String str4, String str5, ageb ageb, agec agec, List<ageh> list, String str6);
    }

    public static final class Factory<T extends MobStoryMetadataModel> {
        public final Creator<T> creator;
        public final ainu<ageb, Long> storyTypeAdapter;
        public final ainu<agec, byte[]> typeExtraDataAdapter;
        public final ainu<List<ageh>, byte[]> usersWithAbilitiesAdapter;

        final class SelectMobStoryMetadataQuery extends ainx {
            private final String storyId;

            SelectMobStoryMetadataQuery(String str) {
                super("SELECT MobStoryMetadata._id,\n    MobStoryMetadata.storyRowId,\n    MobStoryMetadata.creatorUserId,\n    MobStoryMetadata.creatorUsername,\n    COALESCE(Friend.displayName, MobStoryMetadata.creatorDisplayName) AS creatorDisplayName,\n    MobStoryMetadata.createTimestamp,\n    MobStoryMetadata.displayName,\n    MobStoryMetadata.subText,\n    MobStoryMetadata.storyType,\n    MobStoryMetadata.typeExtraData,\n    MobStoryMetadata.usersWithAbilities,\n    Story.storyId\nFROM MobStoryMetadata\nJOIN Story ON (Story._id = MobStoryMetadata.storyRowId)\nLEFT OUTER JOIN Friend ON (Friend._id = MobStoryMetadata.creatorFriendRowId)\nWHERE Story.storyId = ?1", new aioa(MobStoryMetadataModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
            }
        }

        final class SelectMobStoryMetadataRowIdByStoryIdQuery extends ainx {
            private final String storyId;

            SelectMobStoryMetadataRowIdByStoryIdQuery(String str) {
                super("SELECT MobStoryMetadata._id\nFROM MobStoryMetadata\nJOIN Story ON (Story._id = MobStoryMetadata.storyRowId)\nWHERE Story.storyId = ?1", new aioa(MobStoryMetadataModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
            }
        }

        public Factory(Creator<T> creator, ainu<ageb, Long> ainu, ainu<agec, byte[]> ainu2, ainu<List<ageh>, byte[]> ainu3) {
            this.creator = creator;
            this.storyTypeAdapter = ainu;
            this.typeExtraDataAdapter = ainu2;
            this.usersWithAbilitiesAdapter = ainu3;
        }

        public final ainx selectMobStoryMetadata(String str) {
            return new SelectMobStoryMetadataQuery(str);
        }

        public final <R extends SelectMobStoryMetadataModel> SelectMobStoryMetadataMapper<R, T> selectMobStoryMetadataMapper(SelectMobStoryMetadataCreator<R> selectMobStoryMetadataCreator) {
            return new SelectMobStoryMetadataMapper(selectMobStoryMetadataCreator, this);
        }

        public final ainx selectMobStoryMetadataRowIdByStoryId(String str) {
            return new SelectMobStoryMetadataRowIdByStoryIdQuery(str);
        }

        public final ainw<Long> selectMobStoryMetadataRowIdByStoryIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }
    }

    public static final class SelectMobStoryMetadataMapper<T extends SelectMobStoryMetadataModel, T1 extends MobStoryMetadataModel> implements ainw<T> {
        private final SelectMobStoryMetadataCreator<T> creator;
        private final Factory<T1> mobStoryMetadataModelFactory;

        public SelectMobStoryMetadataMapper(SelectMobStoryMetadataCreator<T> selectMobStoryMetadataCreator, Factory<T1> factory) {
            this.creator = selectMobStoryMetadataCreator;
            this.mobStoryMetadataModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            agec agec;
            List list;
            Cursor cursor2 = cursor;
            SelectMobStoryMetadataCreator selectMobStoryMetadataCreator = this.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            String string = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string2 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string3 = cursor2.isNull(4) ? null : cursor2.getString(4);
            Long valueOf = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            String string4 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            ageb ageb = (ageb) this.mobStoryMetadataModelFactory.storyTypeAdapter.decode(Long.valueOf(cursor2.getLong(8)));
            agec agec2 = (agec) this.mobStoryMetadataModelFactory.typeExtraDataAdapter.decode(cursor2.getBlob(9));
            if (cursor2.isNull(10)) {
                agec = agec2;
                list = null;
            } else {
                agec = agec2;
                list = (List) this.mobStoryMetadataModelFactory.usersWithAbilitiesAdapter.decode(cursor2.getBlob(10));
            }
            return selectMobStoryMetadataCreator.create(j, j2, string, string2, string3, valueOf, string4, string5, ageb, agec, list, cursor2.getString(11));
        }
    }

    public interface SelectMobStoryMetadataModel {
        long _id();

        Long createTimestamp();

        String creatorDisplayName();

        String creatorUserId();

        String creatorUsername();

        String displayName();

        String storyId();

        long storyRowId();

        ageb storyType();

        String subText();

        agec typeExtraData();

        List<ageh> usersWithAbilities();
    }

    public static final class Mapper<T extends MobStoryMetadataModel> implements ainw<T> {
        private final Factory<T> mobStoryMetadataModelFactory;

        public Mapper(Factory<T> factory) {
            this.mobStoryMetadataModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.mobStoryMetadataModelFactory.creator.create(cursor2.getLong(0), cursor2.getLong(1), cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2)), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), (ageb) this.mobStoryMetadataModelFactory.storyTypeAdapter.decode(Long.valueOf(cursor2.getLong(9))), (agec) this.mobStoryMetadataModelFactory.typeExtraDataAdapter.decode(cursor2.getBlob(10)), cursor2.isNull(11) ? null : (List) this.mobStoryMetadataModelFactory.usersWithAbilitiesAdapter.decode(cursor2.getBlob(11)));
        }
    }

    public static final class DeleteMobStoryMetadata extends ainy {
        public DeleteMobStoryMetadata(pa paVar) {
            super(MobStoryMetadataModel.TABLE_NAME, paVar.a("DELETE FROM MobStoryMetadata\nWHERE storyRowId = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertMobStoryMetadata extends ainy {
        private final Factory<? extends MobStoryMetadataModel> mobStoryMetadataModelFactory;

        public InsertMobStoryMetadata(pa paVar, Factory<? extends MobStoryMetadataModel> factory) {
            super(MobStoryMetadataModel.TABLE_NAME, paVar.a("INSERT INTO MobStoryMetadata(\n    storyRowId,\n    creatorFriendRowId,\n    creatorUserId,\n    creatorUsername,\n    creatorDisplayName,\n    createTimestamp,\n    displayName,\n    subText,\n    storyType,\n    typeExtraData,\n    usersWithAbilities\n)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.mobStoryMetadataModelFactory = factory;
        }

        public final void bind(long j, Long l, String str, String str2, String str3, Long l2, String str4, String str5, ageb ageb, agec agec, List<ageh> list) {
            bindLong(1, j);
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            if (str == null) {
                bindNull(3);
            } else {
                bindString(3, str);
            }
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
            if (str3 == null) {
                bindNull(5);
            } else {
                bindString(5, str3);
            }
            if (l2 == null) {
                bindNull(6);
            } else {
                bindLong(6, l2.longValue());
            }
            if (str4 == null) {
                bindNull(7);
            } else {
                bindString(7, str4);
            }
            if (str5 == null) {
                bindNull(8);
            } else {
                bindString(8, str5);
            }
            bindLong(9, ((Long) this.mobStoryMetadataModelFactory.storyTypeAdapter.encode(ageb)).longValue());
            bindBlob(10, (byte[]) this.mobStoryMetadataModelFactory.typeExtraDataAdapter.encode(agec));
            if (list == null) {
                bindNull(11);
            } else {
                bindBlob(11, (byte[]) this.mobStoryMetadataModelFactory.usersWithAbilitiesAdapter.encode(list));
            }
        }
    }

    public static final class UpdateMobStoryMetadata extends ainy {
        private final Factory<? extends MobStoryMetadataModel> mobStoryMetadataModelFactory;

        public UpdateMobStoryMetadata(pa paVar, Factory<? extends MobStoryMetadataModel> factory) {
            super(MobStoryMetadataModel.TABLE_NAME, paVar.a("UPDATE MobStoryMetadata\nSET creatorDisplayName = ?,\n    displayName = ?,\n    subText = ?,\n    typeExtraData = ?,\n    usersWithAbilities = ?\nWHERE _id = ?"));
            this.mobStoryMetadataModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, agec agec, List<ageh> list, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            bindBlob(4, (byte[]) this.mobStoryMetadataModelFactory.typeExtraDataAdapter.encode(agec));
            if (list == null) {
                bindNull(5);
            } else {
                bindBlob(5, (byte[]) this.mobStoryMetadataModelFactory.usersWithAbilitiesAdapter.encode(list));
            }
            bindLong(6, j);
        }
    }

    long _id();

    Long createTimestamp();

    String creatorDisplayName();

    Long creatorFriendRowId();

    String creatorUserId();

    String creatorUsername();

    String displayName();

    long storyRowId();

    ageb storyType();

    String subText();

    agec typeExtraData();

    List<ageh> usersWithAbilities();
}
