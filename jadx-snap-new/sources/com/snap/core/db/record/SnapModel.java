package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.MessageClientStatus;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;

public interface SnapModel {
    public static final String ADDATTACHMENTURL = "ALTER TABLE Snap\nADD COLUMN attachmentUrl TEXT";
    public static final String ADDCOGNACATTACHMENTURI = "ALTER TABLE Snap\nADD COLUMN cognacAttachmentUri TEXT";
    @Deprecated
    public static final String ATTACHMENTURL = "attachmentUrl";
    @Deprecated
    public static final String COGNACATTACHMENTURI = "cognacAttachmentUri";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Snap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    -- for 1-1 snaps, received snap id ends with 'r', sent snap id should end with 's' --\n    -- for group snaps, received/sent snap ids are UUID --\n    snapId TEXT NOT NULL UNIQUE,\n    timestamp INTEGER NOT NULL,\n\n    mediaId TEXT,\n    mediaIv TEXT,\n    mediaKey TEXT,\n    snapType INTEGER NOT NULL,\n    mediaUrl TEXT,\n    durationInMs INTEGER NOT NULL,\n    attachmentUrl TEXT,\n    cognacAttachmentUri TEXT,\n\n    zipped INTEGER,\n\n    -- @Deprecated: this field is not stable, use StorySnap.storyRowId instead\n    -- There can be more than one linked storyRowId, as there exists a 1:N relationship between Snap and Story records\n    storyRowId INTEGER,\n    isInfiniteDuration INTEGER NOT NULL DEFAULT 0,\n    groupType TEXT\n)";
    @Deprecated
    public static final String DURATIONINMS = "durationInMs";
    @Deprecated
    public static final String GROUPTYPE = "groupType";
    @Deprecated
    public static final String ISINFINITEDURATION = "isInfiniteDuration";
    @Deprecated
    public static final String MEDIAID = "mediaId";
    @Deprecated
    public static final String MEDIAIV = "mediaIv";
    @Deprecated
    public static final String MEDIAKEY = "mediaKey";
    @Deprecated
    public static final String MEDIAURL = "mediaUrl";
    @Deprecated
    public static final String SNAPID = "snapId";
    @Deprecated
    public static final String SNAPTYPE = "snapType";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String TABLE_NAME = "Snap";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String ZIPPED = "zipped";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends SnapModel> {
        T create(long j, String str, long j2, String str2, String str3, String str4, gcp gcp, String str5, long j3, String str6, String str7, Boolean bool, Long l, boolean z, String str8);
    }

    public static final class Factory<T extends SnapModel> {
        public final Creator<T> creator;
        public final ainu<gcp, Long> snapTypeAdapter;

        final class DeleteSnapsByRowIdsQuery extends ainx {
            private final long[] _id;

            DeleteSnapsByRowIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Snap\nWHERE _id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(SnapModel.TABLE_NAME));
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this._id;
                int length = jArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class DeleteSnapsBySnapIdsQuery extends ainx {
            private final String[] snapId;

            DeleteSnapsBySnapIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Snap\nWHERE snapId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(SnapModel.TABLE_NAME));
                this.snapId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.snapId;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetSnapRowIdBySnapIdQuery extends ainx {
            private final String snapId;

            GetSnapRowIdBySnapIdQuery(String str) {
                super("SELECT _id\nFROM Snap\nWHERE snapId = ?1", new aioa(SnapModel.TABLE_NAME));
                this.snapId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.snapId);
            }
        }

        final class SelectSnapsForPlayingQuery extends ainx {
            private final String groupType;
            private final long storyRowId;

            SelectSnapsForPlayingQuery(long j, String str) {
                super("SELECT Snap._id AS id,\n   snapId,\n   timestamp,\n   mediaId,\n   mediaIv,\n   mediaKey,\n   snapType,\n   mediaUrl,\n   durationInMs,\n   zipped,\n   isInfiniteDuration,\n   groupType\n FROM Snap\n JOIN StorySnap ON Snap._id = StorySnap.snapRowId\n WHERE StorySnap.storyRowId=?1 AND groupType=?2\n ORDER BY timestamp ASC", new aioa(SnapModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.storyRowId = j;
                this.groupType = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                String str = this.groupType;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<gcp, Long> ainu) {
            this.creator = creator;
            this.snapTypeAdapter = ainu;
        }

        public final ainx deleteSnapsByRowIds(long[] jArr) {
            return new DeleteSnapsByRowIdsQuery(jArr);
        }

        public final ainx deleteSnapsBySnapIds(String[] strArr) {
            return new DeleteSnapsBySnapIdsQuery(strArr);
        }

        public final ainx getSnapRowIdBySnapId(String str) {
            return new GetSnapRowIdBySnapIdQuery(str);
        }

        public final ainw<Long> getSnapRowIdBySnapIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectSnapsForPlaying(long j, String str) {
            return new SelectSnapsForPlayingQuery(j, str);
        }

        public final <R extends SelectSnapsForPlayingModel> SelectSnapsForPlayingMapper<R, T> selectSnapsForPlayingMapper(SelectSnapsForPlayingCreator<R> selectSnapsForPlayingCreator) {
            return new SelectSnapsForPlayingMapper(selectSnapsForPlayingCreator, this);
        }
    }

    public interface SelectSnapsForPlayingCreator<T extends SelectSnapsForPlayingModel> {
        T create(long j, String str, long j2, String str2, String str3, String str4, gcp gcp, String str5, long j3, Boolean bool, boolean z, String str6);
    }

    public interface SelectSnapsForPlayingModel {
        long durationInMs();

        String groupType();

        long id();

        boolean isInfiniteDuration();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        String snapId();

        gcp snapType();

        long timestamp();

        Boolean zipped();
    }

    public static final class Mapper<T extends SnapModel> implements ainw<T> {
        private final Factory<T> snapModelFactory;

        public Mapper(Factory<T> factory) {
            this.snapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            Creator creator = this.snapModelFactory.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            long j2 = cursor2.getLong(2);
            String string2 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string3 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            long j3 = cursor2.getLong(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string7 = cursor2.isNull(10) ? null : cursor2.getString(10);
            if (cursor2.isNull(11)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(11) == 1);
            }
            return creator.create(j, string, j2, string2, string3, string4, gcp, string5, j3, string6, string7, bool, cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)), cursor2.getInt(13) == 1, cursor2.isNull(14) ? null : cursor2.getString(14));
        }
    }

    public static final class SelectSnapsForPlayingMapper<T extends SelectSnapsForPlayingModel, T1 extends SnapModel> implements ainw<T> {
        private final SelectSnapsForPlayingCreator<T> creator;
        private final Factory<T1> snapModelFactory;

        public SelectSnapsForPlayingMapper(SelectSnapsForPlayingCreator<T> selectSnapsForPlayingCreator, Factory<T1> factory) {
            this.creator = selectSnapsForPlayingCreator;
            this.snapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectSnapsForPlayingCreator selectSnapsForPlayingCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            long j2 = cursor2.getLong(2);
            String string2 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string3 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string4 = cursor2.isNull(5) ? null : cursor2.getString(5);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            long j3 = cursor2.getLong(8);
            if (cursor2.isNull(9)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            return selectSnapsForPlayingCreator.create(j, string, j2, string2, string3, string4, gcp, string5, j3, bool, cursor2.getInt(10) == 1, cursor2.isNull(11) ? null : cursor2.getString(11));
        }
    }

    public static final class DeleteAllMessagingSnapsInSnapTable extends ainy {
        public DeleteAllMessagingSnapsInSnapTable(pa paVar) {
            super(SnapModel.TABLE_NAME, paVar.a("DELETE FROM Snap\nWHERE EXISTS (\n    SELECT *\n    FROM MessagingSnap\n    WHERE Snap._id = MessagingSnap.snapRowId\n)"));
        }
    }

    public static final class DeleteFailedSnapsNotInConversation extends ainy {
        private final com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> messageModelFactory;

        public DeleteFailedSnapsNotInConversation(pa paVar, com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> factory) {
            super(SnapModel.TABLE_NAME, paVar.a("DELETE FROM Snap\nWHERE _id IN (\n    SELECT snapRowId FROM MessagingSnap WHERE MessagingSnap.messageRowId IN\n        ( SELECT _id FROM Message WHERE clientStatus=?1 AND feedRowId=?2 AND key NOT IN (?3))\n)"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, Long l, String str) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            bindString(3, str);
        }
    }

    public static final class DeleteSnapMetadata extends ainy {
        public DeleteSnapMetadata(pa paVar) {
            super(SnapModel.TABLE_NAME, paVar.a("DELETE FROM Snap\nWHERE snapId LIKE ?||'%'"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class DeleteSnapsFromConversationWithStatus extends ainy {
        private final com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> messageModelFactory;

        public DeleteSnapsFromConversationWithStatus(pa paVar, com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> factory) {
            super(SnapModel.TABLE_NAME, paVar.a("DELETE FROM Snap\nWHERE _id IN (\n    SELECT snapRowId FROM MessagingSnap WHERE MessagingSnap.messageRowId IN\n    ( SELECT _id FROM Message WHERE clientStatus=?1 AND feedRowId=?2 )\n)"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, Long l) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
        }
    }

    public static final class InsertSnapMetadata extends ainy {
        private final Factory<? extends SnapModel> snapModelFactory;

        public InsertSnapMetadata(pa paVar, Factory<? extends SnapModel> factory) {
            super(SnapModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO Snap(\n    snapId,\n    timestamp,\n    mediaId,\n    mediaIv,\n    mediaKey,\n    snapType,\n    mediaUrl,\n    durationInMs,\n    zipped,\n    groupType,\n    isInfiniteDuration,\n    attachmentUrl,\n    cognacAttachmentUri\n)\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)"));
            this.snapModelFactory = factory;
        }

        public final void bind(String str, long j, String str2, String str3, String str4, gcp gcp, String str5, long j2, Boolean bool, String str6, boolean z, String str7, String str8) {
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            String str15 = str8;
            String str16 = str;
            bindString(1, str);
            long j3 = j;
            bindLong(2, j);
            if (str9 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (str10 == null) {
                bindNull(4);
            } else {
                bindString(4, str10);
            }
            if (str11 == null) {
                bindNull(5);
            } else {
                bindString(5, str11);
            }
            bindLong(6, ((Long) this.snapModelFactory.snapTypeAdapter.encode(gcp)).longValue());
            if (str12 == null) {
                bindNull(7);
            } else {
                bindString(7, str12);
            }
            bindLong(8, j2);
            long j4 = 1;
            if (bool == null) {
                bindNull(9);
            } else {
                bindLong(9, bool.booleanValue() ? 1 : 0);
            }
            if (str13 == null) {
                bindNull(10);
            } else {
                bindString(10, str13);
            }
            if (!z) {
                j4 = 0;
            }
            bindLong(11, j4);
            if (str14 == null) {
                bindNull(12);
            } else {
                bindString(12, str14);
            }
            if (str15 == null) {
                bindNull(13);
            } else {
                bindString(13, str15);
            }
        }
    }

    public static final class UpdateFiKeyIvForKey extends ainy {
        public UpdateFiKeyIvForKey(pa paVar) {
            super(SnapModel.TABLE_NAME, paVar.a("UPDATE Snap\nSET\nmediaKey = ?\nWHERE snapId LIKE ?||'%'"));
        }

        public final void bind(String str, String str2) {
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
        }
    }

    long _id();

    String attachmentUrl();

    String cognacAttachmentUri();

    long durationInMs();

    String groupType();

    boolean isInfiniteDuration();

    String mediaId();

    String mediaIv();

    String mediaKey();

    String mediaUrl();

    String snapId();

    gcp snapType();

    Long storyRowId();

    long timestamp();

    Boolean zipped();
}
