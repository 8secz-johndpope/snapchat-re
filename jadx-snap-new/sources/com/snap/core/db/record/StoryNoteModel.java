package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.StoryNoteType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface StoryNoteModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StoryNote (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    snapId TEXT NOT NULL,\n    storySnapRowId INTEGER NOT NULL,\n    timestamp INTEGER,\n    viewer TEXT NOT NULL,\n    isFriendViewPublic INTEGER,\n    isScreenShotted INTEGER NOT NULL,\n    noteType INTEGER,\n    isSaved INTEGER DEFAULT 0 NOT NULL\n)";
    public static final String DROPTABLE = "DROP TABLE StoryNote";
    @Deprecated
    public static final String ISFRIENDVIEWPUBLIC = "isFriendViewPublic";
    @Deprecated
    public static final String ISSAVED = "isSaved";
    @Deprecated
    public static final String ISSCREENSHOTTED = "isScreenShotted";
    @Deprecated
    public static final String NOTETYPE = "noteType";
    @Deprecated
    public static final String SNAPID = "snapId";
    @Deprecated
    public static final String STORYSNAPROWID = "storySnapRowId";
    @Deprecated
    public static final String TABLE_NAME = "StoryNote";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String VIEWER = "viewer";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends StoryNoteModel> {
        T create(long j, String str, long j2, Long l, String str2, Boolean bool, boolean z, StoryNoteType storyNoteType, boolean z2);
    }

    public static final class Factory<T extends StoryNoteModel> {
        public final Creator<T> creator;
        public final ainu<StoryNoteType, Long> noteTypeAdapter;

        final class RemoveStoryNotesByStorySnapRowIdsQuery extends ainx {
            private final long[] storySnapRowId;

            RemoveStoryNotesByStorySnapRowIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM StoryNote\nWHERE storySnapRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StoryNoteModel.TABLE_NAME));
                this.storySnapRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.storySnapRowId;
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

        final class SelectStoryNotesQuery extends ainx {
            private final String snapId;

            SelectStoryNotesQuery(String str) {
                super("SELECT timestamp,\n    viewer,\n    isFriendViewPublic,\n    isScreenShotted,\n    noteType,\n    isSaved\nFROM StoryNote\nWHERE snapId =?1", new aioa(StoryNoteModel.TABLE_NAME));
                this.snapId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.snapId);
            }
        }

        final class SelectStoryNotesViewerSearchQuery extends ainx {
            private final Long currentTimeMs;
            private final String displayName;
            private final String snapId;
            private final String viewer;

            SelectStoryNotesViewerSearchQuery(Long l, String str, String str2, String str3) {
                super("SELECT\n    StoryNote._id,\n    viewer,\n    isScreenShotted,\n    isSaved,\n    Friend.displayName AS friendDisplayName,\n    Friend.userId AS friendUserId,\n    Friend.username AS friendUsername,\n    Friend.bitmojiAvatarId AS friendBitmojiAvatarId,\n    Friend.bitmojiSelfieId AS friendBitmojiSelfieId,\n    Friend.storyMuted,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp\nFROM StoryNote\nLEFT OUTER JOIN Friend AS Friend ON StoryNote.viewer = Friend.username\nLEFT OUTER JOIN (\n    SELECT\n      StoryViewActiveSnaps._id,\n      StoryViewActiveSnaps.storyId,\n      StoryViewActiveSnaps.storyRowIdNullable,\n      StoryViewActiveSnaps.viewed,\n      StoryViewActiveSnaps.latestTimeStamp\n      FROM StoryViewActiveSnaps\n      WHERE StoryViewActiveSnaps.kind = 0 AND StoryViewActiveSnaps.latestExpirationTimestamp > ?1\n) AS Story ON Friend.username = Story.storyId\nWHERE snapId=?2 AND (\n    (Friend.displayName IS NULL AND viewer LIKE ?3) OR\n    (Friend.displayName IS NOT NULL AND Friend.displayName LIKE ?4)\n)\nORDER BY StoryNote.noteType ASC,\n    StoryNote.timestamp DESC", new aioa(StoryNoteModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.currentTimeMs = l;
                this.snapId = str;
                this.viewer = str2;
                this.displayName = str3;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.currentTimeMs;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindString(2, this.snapId);
                pcVar.bindString(3, this.viewer);
                String str = this.displayName;
                if (str != null) {
                    pcVar.bindString(4, str);
                } else {
                    pcVar.bindNull(4);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<StoryNoteType, Long> ainu) {
            this.creator = creator;
            this.noteTypeAdapter = ainu;
        }

        public final ainx removeStoryNotesByStorySnapRowIds(long[] jArr) {
            return new RemoveStoryNotesByStorySnapRowIdsQuery(jArr);
        }

        public final ainx selectStoryNotes(String str) {
            return new SelectStoryNotesQuery(str);
        }

        public final <R extends SelectStoryNotesModel> SelectStoryNotesMapper<R, T> selectStoryNotesMapper(SelectStoryNotesCreator<R> selectStoryNotesCreator) {
            return new SelectStoryNotesMapper(selectStoryNotesCreator, this);
        }

        public final ainx selectStoryNotesViewerSearch(Long l, String str, String str2, String str3) {
            return new SelectStoryNotesViewerSearchQuery(l, str, str2, str3);
        }

        public final <R extends SelectStoryNotesViewerSearchModel> SelectStoryNotesViewerSearchMapper<R> selectStoryNotesViewerSearchMapper(SelectStoryNotesViewerSearchCreator<R> selectStoryNotesViewerSearchCreator) {
            return new SelectStoryNotesViewerSearchMapper(selectStoryNotesViewerSearchCreator);
        }
    }

    public interface SelectStoryNotesCreator<T extends SelectStoryNotesModel> {
        T create(Long l, String str, Boolean bool, boolean z, StoryNoteType storyNoteType, boolean z2);
    }

    public interface SelectStoryNotesModel {
        Boolean isFriendViewPublic();

        boolean isSaved();

        boolean isScreenShotted();

        StoryNoteType noteType();

        Long timestamp();

        String viewer();
    }

    public interface SelectStoryNotesViewerSearchCreator<T extends SelectStoryNotesViewerSearchModel> {
        T create(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, Boolean bool, Long l, Boolean bool2, Long l2);
    }

    public interface SelectStoryNotesViewerSearchModel {
        long _id();

        String friendBitmojiAvatarId();

        String friendBitmojiSelfieId();

        String friendDisplayName();

        String friendUserId();

        String friendUsername();

        boolean isSaved();

        boolean isScreenShotted();

        Long storyLatestTimestamp();

        Boolean storyMuted();

        Long storyRowId();

        Boolean storyViewed();

        String viewer();
    }

    public static final class Mapper<T extends StoryNoteModel> implements ainw<T> {
        private final Factory<T> storyNoteModelFactory;

        public Mapper(Factory<T> factory) {
            this.storyNoteModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            Creator creator = this.storyNoteModelFactory.creator;
            boolean z = false;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            long j2 = cursor2.getLong(2);
            StoryNoteType storyNoteType = null;
            Long valueOf = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            String string2 = cursor2.getString(4);
            if (cursor2.isNull(5)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(5) == 1);
            }
            boolean z2 = cursor2.getInt(6) == 1;
            if (!cursor2.isNull(7)) {
                storyNoteType = (StoryNoteType) this.storyNoteModelFactory.noteTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            }
            StoryNoteType storyNoteType2 = storyNoteType;
            if (cursor2.getInt(8) == 1) {
                z = true;
            }
            return creator.create(j, string, j2, valueOf, string2, bool, z2, storyNoteType2, z);
        }
    }

    public static final class SelectStoryNotesMapper<T extends SelectStoryNotesModel, T1 extends StoryNoteModel> implements ainw<T> {
        private final SelectStoryNotesCreator<T> creator;
        private final Factory<T1> storyNoteModelFactory;

        public SelectStoryNotesMapper(SelectStoryNotesCreator<T> selectStoryNotesCreator, Factory<T1> factory) {
            this.creator = selectStoryNotesCreator;
            this.storyNoteModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            SelectStoryNotesCreator selectStoryNotesCreator = this.creator;
            StoryNoteType storyNoteType = null;
            Long valueOf = cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
            String string = cursor.getString(1);
            if (cursor.isNull(2)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor.getInt(2) == 1);
            }
            boolean z = cursor.getInt(3) == 1;
            if (!cursor.isNull(4)) {
                storyNoteType = (StoryNoteType) this.storyNoteModelFactory.noteTypeAdapter.decode(Long.valueOf(cursor.getLong(4)));
            }
            return selectStoryNotesCreator.create(valueOf, string, bool, z, storyNoteType, cursor.getInt(5) == 1);
        }
    }

    public static final class SelectStoryNotesViewerSearchMapper<T extends SelectStoryNotesViewerSearchModel> implements ainw<T> {
        private final SelectStoryNotesViewerSearchCreator<T> creator;

        public SelectStoryNotesViewerSearchMapper(SelectStoryNotesViewerSearchCreator<T> selectStoryNotesViewerSearchCreator) {
            this.creator = selectStoryNotesViewerSearchCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            SelectStoryNotesViewerSearchCreator selectStoryNotesViewerSearchCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            boolean z = cursor2.getInt(2) == 1;
            boolean z2 = cursor2.getInt(3) == 1;
            String string2 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string3 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string4 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string6 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (cursor2.isNull(9)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            Long valueOf = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            if (cursor2.isNull(11)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(11) == 1);
            }
            return selectStoryNotesViewerSearchCreator.create(j, string, z, z2, string2, string3, string4, string5, string6, bool, valueOf, bool2, cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)));
        }
    }

    public static final class InsertOrReplaceStoryNote extends ainy {
        private final Factory<? extends StoryNoteModel> storyNoteModelFactory;

        public InsertOrReplaceStoryNote(pa paVar, Factory<? extends StoryNoteModel> factory) {
            super(StoryNoteModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO StoryNote(snapId, storySnapRowId, timestamp, viewer, isFriendViewPublic, isScreenShotted, noteType, isSaved)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?)"));
            this.storyNoteModelFactory = factory;
        }

        public final void bind(String str, long j, Long l, String str2, Boolean bool, boolean z, StoryNoteType storyNoteType, boolean z2) {
            bindString(1, str);
            bindLong(2, j);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            bindString(4, str2);
            j = 1;
            if (bool == null) {
                bindNull(5);
            } else {
                bindLong(5, bool.booleanValue() ? 1 : 0);
            }
            bindLong(6, z ? 1 : 0);
            if (storyNoteType == null) {
                bindNull(7);
            } else {
                bindLong(7, ((Long) this.storyNoteModelFactory.noteTypeAdapter.encode(storyNoteType)).longValue());
            }
            if (!z2) {
                j = 0;
            }
            bindLong(8, j);
        }
    }

    long _id();

    Boolean isFriendViewPublic();

    boolean isSaved();

    boolean isScreenShotted();

    StoryNoteType noteType();

    String snapId();

    long storySnapRowId();

    Long timestamp();

    String viewer();
}
