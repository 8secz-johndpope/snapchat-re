package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.PlaybackSnapType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface PlaybackSnapViewModel {
    public static final String ADDVIEWDURATIONCOLUMN = "ALTER TABLE PlaybackSnapView\nADD COLUMN viewDurationMillis INTEGER";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS PlaybackSnapView(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    type INTEGER NOT NULL, -- type of Snap\n    snapRowId INTEGER NOT NULL, -- index into the appropriate Snap table\n    snapId TEXT NOT NULL,  -- the SnapId as text\n    viewStartTimestampMillis INTEGER NOT NULL, -- timestamp of view\n    viewDurationMillis INTEGER, -- Milliseconds of the snap the user has watched.\n    snapTimestampMillis INTEGER, -- timestamp of the Snap, if known\n    snapExpirationTimestampMillis INTEGER NOT NULL DEFAULT 0, -- expiration time of Snap\n\n    storyId TEXT,  -- if the Snap is part of a story\n    storyRowId INTEGER -- index into Story table, if known\n)";
    @Deprecated
    public static final String SNAPEXPIRATIONTIMESTAMPMILLIS = "snapExpirationTimestampMillis";
    @Deprecated
    public static final String SNAPID = "snapId";
    @Deprecated
    public static final String SNAPROWID = "snapRowId";
    @Deprecated
    public static final String SNAPTIMESTAMPMILLIS = "snapTimestampMillis";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String TABLE_NAME = "PlaybackSnapView";
    @Deprecated
    public static final String TYPE = "type";
    @Deprecated
    public static final String VIEWDURATIONMILLIS = "viewDurationMillis";
    @Deprecated
    public static final String VIEWSTARTTIMESTAMPMILLIS = "viewStartTimestampMillis";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends PlaybackSnapViewModel> {
        T create(long j, PlaybackSnapType playbackSnapType, long j2, String str, long j3, Long l, Long l2, long j4, String str2, Long l3);
    }

    public static final class Factory<T extends PlaybackSnapViewModel> {
        public final Creator<T> creator;
        public final ainu<PlaybackSnapType, Long> typeAdapter;

        final class SelectAllFromPlaybakcSnapViewQuery extends ainx {
            private final String[] snapId;

            SelectAllFromPlaybakcSnapViewQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT type, snapRowId, snapId, snapExpirationTimestampMillis, storyId, storyRowId\nFROM PlaybackSnapView\nWHERE snapId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa("PlaybackSnapView"));
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

        final class SelectRecentViewsForStoryQuery extends ainx {
            private final String storyId;

            SelectRecentViewsForStoryQuery(String str) {
                super("SELECT snapId\nFROM PlaybackSnapView\nWHERE storyId = ?1\nORDER BY viewStartTimestampMillis DESC", new aioa("PlaybackSnapView"));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.storyId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectViewedQuery extends ainx {
            private final String[] snapId;

            SelectViewedQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT snapId, viewStartTimestampMillis lastView\nFROM PlaybackSnapView\nWHERE snapId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa("PlaybackSnapView"));
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

        public Factory(Creator<T> creator, ainu<PlaybackSnapType, Long> ainu) {
            this.creator = creator;
            this.typeAdapter = ainu;
        }

        public final ainx selectAllFromPlaybakcSnapView(String[] strArr) {
            return new SelectAllFromPlaybakcSnapViewQuery(strArr);
        }

        public final <R extends SelectAllFromPlaybakcSnapViewModel> SelectAllFromPlaybakcSnapViewMapper<R, T> selectAllFromPlaybakcSnapViewMapper(SelectAllFromPlaybakcSnapViewCreator<R> selectAllFromPlaybakcSnapViewCreator) {
            return new SelectAllFromPlaybakcSnapViewMapper(selectAllFromPlaybakcSnapViewCreator, this);
        }

        public final ainx selectRecentViewsForStory(String str) {
            return new SelectRecentViewsForStoryQuery(str);
        }

        public final ainw<String> selectRecentViewsForStoryMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx selectViewed(String[] strArr) {
            return new SelectViewedQuery(strArr);
        }

        public final <R extends SelectViewedModel> SelectViewedMapper<R> selectViewedMapper(SelectViewedCreator<R> selectViewedCreator) {
            return new SelectViewedMapper(selectViewedCreator);
        }
    }

    public interface SelectAllFromPlaybakcSnapViewCreator<T extends SelectAllFromPlaybakcSnapViewModel> {
        T create(PlaybackSnapType playbackSnapType, long j, String str, long j2, String str2, Long l);
    }

    public interface SelectAllFromPlaybakcSnapViewModel {
        long snapExpirationTimestampMillis();

        String snapId();

        long snapRowId();

        String storyId();

        Long storyRowId();

        PlaybackSnapType type();
    }

    public interface SelectViewedCreator<T extends SelectViewedModel> {
        T create(String str, long j);
    }

    public interface SelectViewedModel {
        long lastView();

        String snapId();
    }

    public static final class Mapper<T extends PlaybackSnapViewModel> implements ainw<T> {
        private final Factory<T> playbackSnapViewModelFactory;

        public Mapper(Factory<T> factory) {
            this.playbackSnapViewModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.playbackSnapViewModelFactory.creator.create(cursor2.getLong(0), (PlaybackSnapType) this.playbackSnapViewModelFactory.typeAdapter.decode(Long.valueOf(cursor2.getLong(1))), cursor2.getLong(2), cursor2.getString(3), cursor2.getLong(4), cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5)), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.getLong(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)));
        }
    }

    public static final class SelectAllFromPlaybakcSnapViewMapper<T extends SelectAllFromPlaybakcSnapViewModel, T1 extends PlaybackSnapViewModel> implements ainw<T> {
        private final SelectAllFromPlaybakcSnapViewCreator<T> creator;
        private final Factory<T1> playbackSnapViewModelFactory;

        public SelectAllFromPlaybakcSnapViewMapper(SelectAllFromPlaybakcSnapViewCreator<T> selectAllFromPlaybakcSnapViewCreator, Factory<T1> factory) {
            this.creator = selectAllFromPlaybakcSnapViewCreator;
            this.playbackSnapViewModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create((PlaybackSnapType) this.playbackSnapViewModelFactory.typeAdapter.decode(Long.valueOf(cursor.getLong(0))), cursor.getLong(1), cursor.getString(2), cursor.getLong(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)));
        }
    }

    public static final class SelectViewedMapper<T extends SelectViewedModel> implements ainw<T> {
        private final SelectViewedCreator<T> creator;

        public SelectViewedMapper(SelectViewedCreator<T> selectViewedCreator) {
            this.creator = selectViewedCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1));
        }
    }

    public static final class DeletePlaybackViewState extends ainy {
        public DeletePlaybackViewState(pa paVar) {
            super("PlaybackSnapView", paVar.a("DELETE\nFROM PlaybackSnapView\nWHERE snapExpirationTimestampMillis < ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertPlaybackSnapView extends ainy {
        private final Factory<? extends PlaybackSnapViewModel> playbackSnapViewModelFactory;

        public InsertPlaybackSnapView(pa paVar, Factory<? extends PlaybackSnapViewModel> factory) {
            super("PlaybackSnapView", paVar.a("INSERT OR REPLACE INTO PlaybackSnapView(\n    type,\n    snapId,\n    snapRowId,\n    storyId,\n    storyRowId,\n    viewStartTimestampMillis,\n    viewDurationMillis,\n    snapTimestampMillis,\n    snapExpirationTimestampMillis\n)\nVALUES(?,?,?,?,?,?,?,?,?)"));
            this.playbackSnapViewModelFactory = factory;
        }

        public final void bind(PlaybackSnapType playbackSnapType, String str, long j, String str2, Long l, long j2, Long l2, Long l3, long j3) {
            bindLong(1, ((Long) this.playbackSnapViewModelFactory.typeAdapter.encode(playbackSnapType)).longValue());
            bindString(2, str);
            bindLong(3, j);
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            bindLong(6, j2);
            if (l2 == null) {
                bindNull(7);
            } else {
                bindLong(7, l2.longValue());
            }
            if (l3 == null) {
                bindNull(8);
            } else {
                bindLong(8, l3.longValue());
            }
            bindLong(9, j3);
        }
    }

    long _id();

    long snapExpirationTimestampMillis();

    String snapId();

    long snapRowId();

    Long snapTimestampMillis();

    String storyId();

    Long storyRowId();

    PlaybackSnapType type();

    Long viewDurationMillis();

    long viewStartTimestampMillis();
}
