package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedKind;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface SequenceNumbersModel {
    public static final String CREATEINDEX = "CREATE UNIQUE INDEX IF NOT EXISTS sequence_number_user_idx ON SequenceNumbers(feedRowId, username)";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SequenceNumbers(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL,\n    username TEXT NOT NULL,\n\n    -- latest sequence number of a user received from the server.\n    -- Also used in 1-on-1 conversations.\n    serverLatest INTEGER,\n\n    -- earliest sequence number of a user received from the server.\n    -- Is used in groups to mark earliest known sequence number\n    serverEarliest INTEGER,\n\n    -- latest sequence number of a user the app processed.\n    -- Is used to avoid processing the same message again.\n    processedLatest INTEGER,\n\n    -- earliest sequence number of a user the app processed.\n    -- Is used to avoid processing the same message again.\n    processedEarliest INTEGER,\n\n    updateNumber INTEGER\n)";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String PROCESSEDEARLIEST = "processedEarliest";
    @Deprecated
    public static final String PROCESSEDLATEST = "processedLatest";
    @Deprecated
    public static final String SERVEREARLIEST = "serverEarliest";
    @Deprecated
    public static final String SERVERLATEST = "serverLatest";
    @Deprecated
    public static final String TABLE_NAME = "SequenceNumbers";
    @Deprecated
    public static final String UPDATENUMBER = "updateNumber";
    @Deprecated
    public static final String USERNAME = "username";
    @Deprecated
    public static final String _ID = "_id";

    public static final class Factory<T extends SequenceNumbersModel> {
        public final Creator<T> creator;

        final class SelectSequenceNumbersForDeltaMultipleQuery extends ainx {
            private final String[] key;

            SelectSequenceNumbersForDeltaMultipleQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\nFeed.key,\nSequenceNumbers.username,\nSequenceNumbers.serverEarliest,\nSequenceNumbers.serverLatest,\nSequenceNumbers.processedEarliest,\nSequenceNumbers.processedLatest,\nSequenceNumbers.updateNumber\nFROM Feed\nINNER JOIN SequenceNumbers ON Feed._id = SequenceNumbers.feedRowId\nWHERE Feed.key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME, SequenceNumbersModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
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

        final class SelectSequenceNumbersForDeltaSingleFeedItemQuery extends ainx {
            private final String key;

            SelectSequenceNumbersForDeltaSingleFeedItemQuery(String str) {
                super("SELECT\nSequenceNumbers.*\nFROM Feed\nINNER JOIN SequenceNumbers ON Feed._id = SequenceNumbers.feedRowId\nWHERE Feed.key = ?1", new aioa(FeedModel.TABLE_NAME, SequenceNumbersModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class SelectSequenceNumbersForFeedByKeyQuery extends ainx {
            private final String key;

            SelectSequenceNumbersForFeedByKeyQuery(String str) {
                super("SELECT SequenceNumbers.*\nFROM SequenceNumbers\nINNER JOIN Feed ON Feed._id = SequenceNumbers.feedRowId\nWHERE Feed.key = ?1", new aioa(SequenceNumbersModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class SelectSequenceNumbersForLaterContentQuery extends ainx {
            private final boolean laterContentExists;

            SelectSequenceNumbersForLaterContentQuery(boolean z) {
                super("SELECT\nFeed._id,\nFeed.key,\nFeed.kind AS feedKind,\nSequenceNumbers.*\nFROM Feed\nINNER JOIN SequenceNumbers ON Feed._id = SequenceNumbers.feedRowId\nWHERE Feed.laterContentExists = ?1", new aioa(FeedModel.TABLE_NAME, SequenceNumbersModel.TABLE_NAME));
                this.laterContentExists = z;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.laterContentExists ? 1 : 0);
            }
        }

        final class SelectSequenceNumbersForUsernameQuery extends ainx {
            private final long feedRowId;
            private final String username;

            SelectSequenceNumbersForUsernameQuery(long j, String str) {
                super("SELECT *\nFROM SequenceNumbers\nWHERE SequenceNumbers.feedRowId = ?1\nAND SequenceNumbers.username = ?2", new aioa(SequenceNumbersModel.TABLE_NAME));
                this.feedRowId = j;
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
                pcVar.bindString(2, this.username);
            }
        }

        final class SelectSequenceNumbersQuery extends ainx {
            private final long feedRowId;

            SelectSequenceNumbersQuery(long j) {
                super("SELECT *\nFROM SequenceNumbers\nWHERE feedRowId = ?1", new aioa(SequenceNumbersModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectSequenceNumbers(long j) {
            return new SelectSequenceNumbersQuery(j);
        }

        public final ainx selectSequenceNumbersForDelta() {
            return new ainx("SELECT\nFeed._id,\nFeed.key,\nFeed.kind AS feedKind,\nSequenceNumbers.*\nFROM Feed\nINNER JOIN SequenceNumbers ON Feed._id = SequenceNumbers.feedRowId", new aioa(FeedModel.TABLE_NAME, SequenceNumbersModel.TABLE_NAME));
        }

        public final <R extends SelectSequenceNumbersForDeltaModel<T>, T1 extends FeedModel> SelectSequenceNumbersForDeltaMapper<T, R, T1> selectSequenceNumbersForDeltaMapper(SelectSequenceNumbersForDeltaCreator<T, R> selectSequenceNumbersForDeltaCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory) {
            return new SelectSequenceNumbersForDeltaMapper(selectSequenceNumbersForDeltaCreator, factory, this);
        }

        public final ainx selectSequenceNumbersForDeltaMultiple(String[] strArr) {
            return new SelectSequenceNumbersForDeltaMultipleQuery(strArr);
        }

        public final <R extends SelectSequenceNumbersForDeltaMultipleModel> SelectSequenceNumbersForDeltaMultipleMapper<R> selectSequenceNumbersForDeltaMultipleMapper(SelectSequenceNumbersForDeltaMultipleCreator<R> selectSequenceNumbersForDeltaMultipleCreator) {
            return new SelectSequenceNumbersForDeltaMultipleMapper(selectSequenceNumbersForDeltaMultipleCreator);
        }

        public final ainx selectSequenceNumbersForDeltaSingleFeedItem(String str) {
            return new SelectSequenceNumbersForDeltaSingleFeedItemQuery(str);
        }

        public final Mapper<T> selectSequenceNumbersForDeltaSingleFeedItemMapper() {
            return new Mapper(this);
        }

        public final ainx selectSequenceNumbersForFeedByKey(String str) {
            return new SelectSequenceNumbersForFeedByKeyQuery(str);
        }

        public final Mapper<T> selectSequenceNumbersForFeedByKeyMapper() {
            return new Mapper(this);
        }

        public final ainx selectSequenceNumbersForLaterContent(boolean z) {
            return new SelectSequenceNumbersForLaterContentQuery(z);
        }

        public final <R extends SelectSequenceNumbersForLaterContentModel<T>, T1 extends FeedModel> SelectSequenceNumbersForLaterContentMapper<T, R, T1> selectSequenceNumbersForLaterContentMapper(SelectSequenceNumbersForLaterContentCreator<T, R> selectSequenceNumbersForLaterContentCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory) {
            return new SelectSequenceNumbersForLaterContentMapper(selectSequenceNumbersForLaterContentCreator, factory, this);
        }

        public final ainx selectSequenceNumbersForUsername(long j, String str) {
            return new SelectSequenceNumbersForUsernameQuery(j, str);
        }

        public final Mapper<T> selectSequenceNumbersForUsernameMapper() {
            return new Mapper(this);
        }

        public final Mapper<T> selectSequenceNumbersMapper() {
            return new Mapper(this);
        }
    }

    public interface Creator<T extends SequenceNumbersModel> {
        T create(long j, long j2, String str, Long l, Long l2, Long l3, Long l4, Long l5);
    }

    public interface SelectSequenceNumbersForDeltaCreator<T4 extends SequenceNumbersModel, T extends SelectSequenceNumbersForDeltaModel<T4>> {
        T create(long j, String str, FeedKind feedKind, T4 t4);
    }

    public interface SelectSequenceNumbersForDeltaMultipleCreator<T extends SelectSequenceNumbersForDeltaMultipleModel> {
        T create(String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5);
    }

    public interface SelectSequenceNumbersForDeltaModel<T4 extends SequenceNumbersModel> {
        T4 SequenceNumbers();

        long _id();

        FeedKind feedKind();

        String key();
    }

    public static final class SelectSequenceNumbersForDeltaMapper<T4 extends SequenceNumbersModel, T extends SelectSequenceNumbersForDeltaModel<T4>, T1 extends FeedModel> implements ainw<T> {
        private final SelectSequenceNumbersForDeltaCreator<T4, T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final Factory<T4> sequenceNumbersModelFactory;

        public SelectSequenceNumbersForDeltaMapper(SelectSequenceNumbersForDeltaCreator<T4, T> selectSequenceNumbersForDeltaCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, Factory<T4> factory2) {
            this.creator = selectSequenceNumbersForDeltaCreator;
            this.feedModelFactory = factory;
            this.sequenceNumbersModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(2))), this.sequenceNumbersModelFactory.creator.create(cursor2.getLong(3), cursor2.getLong(4), cursor2.getString(5), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7)), cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8)), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10))));
        }
    }

    public static final class SelectSequenceNumbersForDeltaMultipleMapper<T extends SelectSequenceNumbersForDeltaMultipleModel> implements ainw<T> {
        private final SelectSequenceNumbersForDeltaMultipleCreator<T> creator;

        public SelectSequenceNumbersForDeltaMultipleMapper(SelectSequenceNumbersForDeltaMultipleCreator<T> selectSequenceNumbersForDeltaMultipleCreator) {
            this.creator = selectSequenceNumbersForDeltaMultipleCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)));
        }
    }

    public interface SelectSequenceNumbersForDeltaMultipleModel {
        String key();

        Long processedEarliest();

        Long processedLatest();

        Long serverEarliest();

        Long serverLatest();

        Long updateNumber();

        String username();
    }

    public interface SelectSequenceNumbersForLaterContentCreator<T4 extends SequenceNumbersModel, T extends SelectSequenceNumbersForLaterContentModel<T4>> {
        T create(long j, String str, FeedKind feedKind, T4 t4);
    }

    public interface SelectSequenceNumbersForLaterContentModel<T4 extends SequenceNumbersModel> {
        T4 SequenceNumbers();

        long _id();

        FeedKind feedKind();

        String key();
    }

    public static final class Mapper<T extends SequenceNumbersModel> implements ainw<T> {
        private final Factory<T> sequenceNumbersModelFactory;

        public Mapper(Factory<T> factory) {
            this.sequenceNumbersModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.sequenceNumbersModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1), cursor.getString(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)), cursor.isNull(7) ? null : Long.valueOf(cursor.getLong(7)));
        }
    }

    public static final class SelectSequenceNumbersForLaterContentMapper<T4 extends SequenceNumbersModel, T extends SelectSequenceNumbersForLaterContentModel<T4>, T1 extends FeedModel> implements ainw<T> {
        private final SelectSequenceNumbersForLaterContentCreator<T4, T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final Factory<T4> sequenceNumbersModelFactory;

        public SelectSequenceNumbersForLaterContentMapper(SelectSequenceNumbersForLaterContentCreator<T4, T> selectSequenceNumbersForLaterContentCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, Factory<T4> factory2) {
            this.creator = selectSequenceNumbersForLaterContentCreator;
            this.feedModelFactory = factory;
            this.sequenceNumbersModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(2))), this.sequenceNumbersModelFactory.creator.create(cursor2.getLong(3), cursor2.getLong(4), cursor2.getString(5), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7)), cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8)), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10))));
        }
    }

    public static final class ClearSequenceNumbersForGroup extends ainy {
        public ClearSequenceNumbersForGroup(pa paVar) {
            super(SequenceNumbersModel.TABLE_NAME, paVar.a("DELETE FROM SequenceNumbers\nWHERE feedRowId = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class DropAllSequenceNumbers extends ainy {
        public DropAllSequenceNumbers(pa paVar) {
            super(SequenceNumbersModel.TABLE_NAME, paVar.a("DELETE FROM SequenceNumbers"));
        }
    }

    public static final class RemoveSequenceNumbersForUser extends ainy {
        public RemoveSequenceNumbersForUser(pa paVar) {
            super(SequenceNumbersModel.TABLE_NAME, paVar.a("DELETE FROM SequenceNumbers\nWHERE feedRowId=? AND username=?"));
        }

        public final void bind(long j, String str) {
            bindLong(1, j);
            bindString(2, str);
        }
    }

    long _id();

    long feedRowId();

    Long processedEarliest();

    Long processedLatest();

    Long serverEarliest();

    Long serverLatest();

    Long updateNumber();

    String username();
}
