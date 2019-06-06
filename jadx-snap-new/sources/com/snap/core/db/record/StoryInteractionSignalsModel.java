package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface StoryInteractionSignalsModel {
    @Deprecated
    public static final String CORPUS = "corpus";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StoryInteractionSignals (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    storyId TEXT NOT NULL,\n    corpus INTEGER NOT NULL,\n\n    -- Profile Action Signals\n    lastFavoriteTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastUnfavoriteTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastHideTimestampSecs INTEGER NOT NULL DEFAULT 0,\n\n    -- View signals\n    shortViewsScore REAL NOT NULL DEFAULT 0,\n    shortViewsScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    longViewsScore REAL NOT NULL DEFAULT 0,\n    longViewsScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastLongViewVersion INTEGER NOT NULL DEFAULT -2147483648,\n\n    -- Impression Signals\n    shortImpressionScore REAL NOT NULL DEFAULT 0,\n    shortImpressionScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    longImpressionsScore REAL NOT NULL DEFAULT 0,\n    longImpressionsScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastLongImpressionVersion INTEGER NOT NULL DEFAULT -2147483648,\n    qualifiedLongImpressionScore REAL NOT NULL DEFAULT 0,\n    qualifiedLongImpressionScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n\n    -- Tap Story key\n    longViewTapStoryKey INTEGER NOT NULL DEFAULT 0,\n\n    -- New Signals\n    tapStoryKey INTEGER NOT NULL DEFAULT 0,\n    lastViewVersion INTEGER NOT NULL DEFAULT 0,\n    numWatches INTEGER NOT NULL DEFAULT 0,\n    maxSnapCompletionPercent REAL NOT NULL DEFAULT 0,\n    maxTotalTimeWatched REAL NOT NULL DEFAULT 0,\n    lastViewNumSnapsInStory INTEGER NOT NULL DEFAULT 0,\n    lastStoryLengthSeconds INTEGER NOT NULL DEFAULT 0,\n    isSubscribed INTEGER NOT NULL DEFAULT 0,\n    isHidden INTEGER NOT NULL DEFAULT 0,\n    lastVersionLongImpressionCount INTEGER NOT NULL DEFAULT 0,\n    lastWatchedIndex INTEGER NOT NULL DEFAULT 0,\n    numSnapsViewedFromLatestVersion INTEGER NOT NULL DEFAULT 0,\n    totalImpressionTime REAL NOT NULL DEFAULT 0,\n    numSnapsViewedScore REAL NOT NULL DEFAULT 0,\n    numSnapsViewedScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    totalWatchTimeScore REAL NOT NULL DEFAULT 0,\n    totalWatchTimeScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    totalImpressionTimeScore REAL NOT NULL DEFAULT 0,\n    totalImpressionTimeScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n\n    -- For expiration\n    lastUpdatedTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    UNIQUE(storyId) ON CONFLICT IGNORE\n)";
    @Deprecated
    public static final String ISHIDDEN = "isHidden";
    @Deprecated
    public static final String ISSUBSCRIBED = "isSubscribed";
    @Deprecated
    public static final String LASTFAVORITETIMESTAMPSECS = "lastFavoriteTimestampSecs";
    @Deprecated
    public static final String LASTHIDETIMESTAMPSECS = "lastHideTimestampSecs";
    @Deprecated
    public static final String LASTLONGIMPRESSIONVERSION = "lastLongImpressionVersion";
    @Deprecated
    public static final String LASTLONGVIEWVERSION = "lastLongViewVersion";
    @Deprecated
    public static final String LASTSTORYLENGTHSECONDS = "lastStoryLengthSeconds";
    @Deprecated
    public static final String LASTUNFAVORITETIMESTAMPSECS = "lastUnfavoriteTimestampSecs";
    @Deprecated
    public static final String LASTUPDATEDTIMESTAMPSECS = "lastUpdatedTimestampSecs";
    @Deprecated
    public static final String LASTVERSIONLONGIMPRESSIONCOUNT = "lastVersionLongImpressionCount";
    @Deprecated
    public static final String LASTVIEWNUMSNAPSINSTORY = "lastViewNumSnapsInStory";
    @Deprecated
    public static final String LASTVIEWVERSION = "lastViewVersion";
    @Deprecated
    public static final String LASTWATCHEDINDEX = "lastWatchedIndex";
    @Deprecated
    public static final String LONGIMPRESSIONSSCORE = "longImpressionsScore";
    @Deprecated
    public static final String LONGIMPRESSIONSSCORETIMESTAMPSECS = "longImpressionsScoreTimestampSecs";
    @Deprecated
    public static final String LONGVIEWSSCORE = "longViewsScore";
    @Deprecated
    public static final String LONGVIEWSSCORETIMESTAMPSECS = "longViewsScoreTimestampSecs";
    @Deprecated
    public static final String LONGVIEWTAPSTORYKEY = "longViewTapStoryKey";
    @Deprecated
    public static final String MAXSNAPCOMPLETIONPERCENT = "maxSnapCompletionPercent";
    @Deprecated
    public static final String MAXTOTALTIMEWATCHED = "maxTotalTimeWatched";
    @Deprecated
    public static final String NUMSNAPSVIEWEDFROMLATESTVERSION = "numSnapsViewedFromLatestVersion";
    @Deprecated
    public static final String NUMSNAPSVIEWEDSCORE = "numSnapsViewedScore";
    @Deprecated
    public static final String NUMSNAPSVIEWEDSCORETIMESTAMPSECS = "numSnapsViewedScoreTimestampSecs";
    @Deprecated
    public static final String NUMWATCHES = "numWatches";
    @Deprecated
    public static final String QUALIFIEDLONGIMPRESSIONSCORE = "qualifiedLongImpressionScore";
    @Deprecated
    public static final String QUALIFIEDLONGIMPRESSIONSCORETIMESTAMPSECS = "qualifiedLongImpressionScoreTimestampSecs";
    @Deprecated
    public static final String SHORTIMPRESSIONSCORE = "shortImpressionScore";
    @Deprecated
    public static final String SHORTIMPRESSIONSCORETIMESTAMPSECS = "shortImpressionScoreTimestampSecs";
    @Deprecated
    public static final String SHORTVIEWSSCORE = "shortViewsScore";
    @Deprecated
    public static final String SHORTVIEWSSCORETIMESTAMPSECS = "shortViewsScoreTimestampSecs";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String TABLE_NAME = "StoryInteractionSignals";
    @Deprecated
    public static final String TAPSTORYKEY = "tapStoryKey";
    @Deprecated
    public static final String TOTALIMPRESSIONTIME = "totalImpressionTime";
    @Deprecated
    public static final String TOTALIMPRESSIONTIMESCORE = "totalImpressionTimeScore";
    @Deprecated
    public static final String TOTALIMPRESSIONTIMESCORETIMESTAMPSECS = "totalImpressionTimeScoreTimestampSecs";
    @Deprecated
    public static final String TOTALWATCHTIMESCORE = "totalWatchTimeScore";
    @Deprecated
    public static final String TOTALWATCHTIMESCORETIMESTAMPSECS = "totalWatchTimeScoreTimestampSecs";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends StoryInteractionSignalsModel> {
        T create(long j, String str, long j2, long j3, long j4, long j5, double d, long j6, double d2, long j7, long j8, double d3, long j9, double d4, long j10, long j11, double d5, long j12, long j13, long j14, long j15, long j16, double d6, double d7, long j17, long j18, boolean z, boolean z2, long j19, long j20, long j21, double d8, double d9, long j22, double d10, long j23, double d11, long j24, long j25);
    }

    public static final class Factory<T extends StoryInteractionSignalsModel> {
        public final Creator<T> creator;

        final class BulkSelectSignalsQuery extends ainx {
            private final String[] storyId;

            BulkSelectSignalsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM StoryInteractionSignals\nWHERE storyId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(StoryInteractionSignalsModel.TABLE_NAME));
                this.storyId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.storyId;
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

        final class GetRecentTapsWithLongViewQuery extends ainx {
            private final long arg1;

            GetRecentTapsWithLongViewQuery(long j) {
                super("SELECT longViewTapStoryKey FROM StoryInteractionSignals\nWHERE longViewTapStoryKey != 0\nORDER BY longViewsScoreTimestampSecs DESC LIMIT ?1", new aioa(StoryInteractionSignalsModel.TABLE_NAME));
                this.arg1 = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.arg1);
            }
        }

        final class GetUserStoryInteractionFeaturesQuery extends ainx {
            private final long arg3;
            private final double longImpressionsScore;
            private final long numWatches;

            GetUserStoryInteractionFeaturesQuery(double d, long j, long j2) {
                super("SELECT * FROM StoryInteractionSignals\nWHERE longImpressionsScore > ?1 OR numWatches > ?2\nORDER BY maxSnapCompletionPercent, lastUpdatedTimestampSecs DESC LIMIT ?3", new aioa(StoryInteractionSignalsModel.TABLE_NAME));
                this.longImpressionsScore = d;
                this.numWatches = j;
                this.arg3 = j2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindDouble(1, this.longImpressionsScore);
                pcVar.bindLong(2, this.numWatches);
                pcVar.bindLong(3, this.arg3);
            }
        }

        final class SelectRowIdByStoryIdQuery extends ainx {
            private final String storyId;

            SelectRowIdByStoryIdQuery(String str) {
                super("SELECT _id FROM StoryInteractionSignals\nWHERE storyId = ?1", new aioa(StoryInteractionSignalsModel.TABLE_NAME));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
            }
        }

        final class SelectSignalByRowIdQuery extends ainx {
            private final long _id;

            SelectSignalByRowIdQuery(long j) {
                super("SELECT * FROM StoryInteractionSignals\nWHERE _id = ?1", new aioa(StoryInteractionSignalsModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx bulkSelectSignals(String[] strArr) {
            return new BulkSelectSignalsQuery(strArr);
        }

        public final Mapper<T> bulkSelectSignalsMapper() {
            return new Mapper(this);
        }

        public final ainx getCorpusInteractionFeatures() {
            return new ainx("SELECT\n    corpus,\n    SUM(longImpressionsScore) sumLongImpressionScore,\n    SUM(shortImpressionScore) sumShortImpressionScore,\n    SUM(longViewsScore) sumLongViewsScore,\n    SUM(shortViewsScore) sumShortViewsScore,\n    SUM(isHidden) numHides,\n    SUM(isSubscribed) numSubscribes\nFROM StoryInteractionSignals\nGROUP BY corpus", new aioa(StoryInteractionSignalsModel.TABLE_NAME));
        }

        public final <R extends GetCorpusInteractionFeaturesModel> GetCorpusInteractionFeaturesMapper<R> getCorpusInteractionFeaturesMapper(GetCorpusInteractionFeaturesCreator<R> getCorpusInteractionFeaturesCreator) {
            return new GetCorpusInteractionFeaturesMapper(getCorpusInteractionFeaturesCreator);
        }

        public final ainx getRecentTapsWithLongView(long j) {
            return new GetRecentTapsWithLongViewQuery(j);
        }

        public final ainw<Long> getRecentTapsWithLongViewMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getUserStoryInteractionFeatures(double d, long j, long j2) {
            return new GetUserStoryInteractionFeaturesQuery(d, j, j2);
        }

        public final Mapper<T> getUserStoryInteractionFeaturesMapper() {
            return new Mapper(this);
        }

        public final ainx selectAllSignals() {
            return new ainx("SELECT * FROM StoryInteractionSignals", new aioa(StoryInteractionSignalsModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllSignalsMapper() {
            return new Mapper(this);
        }

        public final ainx selectRowIdByStoryId(String str) {
            return new SelectRowIdByStoryIdQuery(str);
        }

        public final ainw<Long> selectRowIdByStoryIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectSignalByRowId(long j) {
            return new SelectSignalByRowIdQuery(j);
        }

        public final Mapper<T> selectSignalByRowIdMapper() {
            return new Mapper(this);
        }
    }

    public interface GetCorpusInteractionFeaturesCreator<T extends GetCorpusInteractionFeaturesModel> {
        T create(long j, double d, double d2, double d3, double d4, long j2, long j3);
    }

    public interface GetCorpusInteractionFeaturesModel {
        long corpus();

        long numHides();

        long numSubscribes();

        double sumLongImpressionScore();

        double sumLongViewsScore();

        double sumShortImpressionScore();

        double sumShortViewsScore();
    }

    public static final class GetCorpusInteractionFeaturesMapper<T extends GetCorpusInteractionFeaturesModel> implements ainw<T> {
        private final GetCorpusInteractionFeaturesCreator<T> creator;

        public GetCorpusInteractionFeaturesMapper(GetCorpusInteractionFeaturesCreator<T> getCorpusInteractionFeaturesCreator) {
            this.creator = getCorpusInteractionFeaturesCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getDouble(1), cursor2.getDouble(2), cursor2.getDouble(3), cursor2.getDouble(4), cursor2.getLong(5), cursor2.getLong(6));
        }
    }

    public static final class Mapper<T extends StoryInteractionSignalsModel> implements ainw<T> {
        private final Factory<T> storyInteractionSignalsModelFactory;

        public Mapper(Factory<T> factory) {
            this.storyInteractionSignalsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.storyInteractionSignalsModelFactory.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getLong(2), cursor2.getLong(3), cursor2.getLong(4), cursor2.getLong(5), cursor2.getDouble(6), cursor2.getLong(7), cursor2.getDouble(8), cursor2.getLong(9), cursor2.getLong(10), cursor2.getDouble(11), cursor2.getLong(12), cursor2.getDouble(13), cursor2.getLong(14), cursor2.getLong(15), cursor2.getDouble(16), cursor2.getLong(17), cursor2.getLong(18), cursor2.getLong(19), cursor2.getLong(20), cursor2.getLong(21), cursor2.getDouble(22), cursor2.getDouble(23), cursor2.getLong(24), cursor2.getLong(25), cursor2.getInt(26) == 1, cursor2.getInt(27) == 1, cursor2.getLong(28), cursor2.getLong(29), cursor2.getLong(30), cursor2.getDouble(31), cursor2.getDouble(32), cursor2.getLong(33), cursor2.getDouble(34), cursor2.getLong(35), cursor2.getDouble(36), cursor2.getLong(37), cursor2.getLong(38));
        }
    }

    public static final class DeleteSignalsBeforeTimeSeconds extends ainy {
        public DeleteSignalsBeforeTimeSeconds(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("DELETE FROM StoryInteractionSignals\nWHERE lastUpdatedTimestampSecs <= ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertOrIgnoreSignal extends ainy {
        public InsertOrIgnoreSignal(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO StoryInteractionSignals(\n    storyId,\n    corpus,\n    lastViewVersion,\n    tapStoryKey,\n    isSubscribed,\n    lastUpdatedTimestampSecs\n) VALUES (?, ?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, long j, long j2, long j3, boolean z, long j4) {
            bindString(1, str);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
            bindLong(5, z ? 1 : 0);
            bindLong(6, j4);
        }
    }

    public static final class MaybeResetSignalsForNewVersion extends ainy {
        public MaybeResetSignalsForNewVersion(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET maxTotalTimeWatched = 0,\n    numWatches = 0,\n    lastViewNumSnapsInStory = 0,\n    lastStoryLengthSeconds = 0,\n    maxSnapCompletionPercent = 0,\n    lastVersionLongImpressionCount = 0,\n    numSnapsViewedFromLatestVersion = 0,\n    totalImpressionTime = 0,\n    lastViewVersion = ?\nWHERE storyId = ? AND lastViewVersion != ?"));
        }

        public final void bind(long j, String str, long j2) {
            bindLong(1, j);
            bindString(2, str);
            bindLong(3, j2);
        }
    }

    public static final class UpdateFavoriteStory extends ainy {
        public UpdateFavoriteStory(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    lastUnfavoriteTimestampSecs = 0,\n    lastFavoriteTimestampSecs = ?,\n    isSubscribed = 1,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(long j, long j2, long j3) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, j3);
        }
    }

    public static final class UpdateHideStory extends ainy {
        public UpdateHideStory(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    isHidden = 1,\n    lastHideTimestampSecs = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(long j, long j2, long j3) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, j3);
        }
    }

    public static final class UpdateLongImpression extends ainy {
        public UpdateLongImpression(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    longImpressionsScore = ?,\n    longImpressionsScoreTimestampSecs = ?,\n    lastLongImpressionVersion = ?,\n    lastVersionLongImpressionCount = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, long j2, long j3, long j4, long j5) {
            bindDouble(1, d);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
            bindLong(5, j4);
            bindLong(6, j5);
        }
    }

    public static final class UpdateLongViewsScore extends ainy {
        public UpdateLongViewsScore(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    longViewsScore = ?,\n    longViewsScoreTimestampSecs = ?,\n    lastLongViewVersion = ?,\n    longViewTapStoryKey = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, long j2, long j3, long j4, long j5) {
            bindDouble(1, d);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
            bindLong(5, j4);
            bindLong(6, j5);
        }
    }

    public static final class UpdateNumSnapsViewedScore extends ainy {
        public UpdateNumSnapsViewedScore(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET numSnapsViewedScore = ?,\n    numSnapsViewedScoreTimestampSecs = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, long j2, long j3) {
            bindDouble(1, d);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
        }
    }

    public static final class UpdateQualifiedLongImpression extends ainy {
        public UpdateQualifiedLongImpression(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET qualifiedLongImpressionScore = ?,\n    qualifiedLongImpressionScoreTimestampSecs = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, long j2, long j3) {
            bindDouble(1, d);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
        }
    }

    public static final class UpdateShortImpression extends ainy {
        public UpdateShortImpression(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    shortImpressionScore = ?,\n    shortImpressionScoreTimestampSecs = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, long j2, long j3) {
            bindDouble(1, d);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
        }
    }

    public static final class UpdateShortViewsScore extends ainy {
        public UpdateShortViewsScore(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET shortViewsScore = ?,\n    shortViewsScoreTimestampSecs = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, long j2, long j3) {
            bindDouble(1, d);
            bindLong(2, j);
            bindLong(3, j2);
            bindLong(4, j3);
        }
    }

    public static final class UpdateTotalImpression extends ainy {
        public UpdateTotalImpression(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    totalImpressionTime = ?,\n    totalImpressionTimeScore = ?,\n    totalImpressionTimeScoreTimestampSecs = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, double d2, long j, long j2, long j3) {
            bindDouble(1, d);
            bindDouble(2, d2);
            bindLong(3, j);
            bindLong(4, j2);
            bindLong(5, j3);
        }
    }

    public static final class UpdateTotalWatchTimeScore extends ainy {
        public UpdateTotalWatchTimeScore(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET totalWatchTimeScore = ?,\n    totalWatchTimeScoreTimestampSecs = ?,\n    maxTotalTimeWatched = ?,\n    numWatches = ?,\n    lastStoryLengthSeconds = ?,\n    numSnapsViewedFromLatestVersion = ?,\n    maxSnapCompletionPercent = ?,\n    lastWatchedIndex = ?,\n    lastViewNumSnapsInStory = ?,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j, double d2, long j2, long j3, long j4, double d3, long j5, long j6, long j7, long j8) {
            double d4 = d;
            bindDouble(1, d);
            long j9 = j;
            bindLong(2, j);
            d4 = d2;
            bindDouble(3, d2);
            j9 = j2;
            bindLong(4, j2);
            j9 = j3;
            bindLong(5, j3);
            bindLong(6, j4);
            bindDouble(7, d3);
            bindLong(8, j5);
            bindLong(9, j6);
            bindLong(10, j7);
            bindLong(11, j8);
        }
    }

    public static final class UpdateUnfavoriteStory extends ainy {
        public UpdateUnfavoriteStory(pa paVar) {
            super(StoryInteractionSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryInteractionSignals\nSET\n    lastFavoriteTimestampSecs = 0,\n    lastUnfavoriteTimestampSecs = ?,\n    isSubscribed = 0,\n    lastUpdatedTimestampSecs = ?\nWHERE _id = ?"));
        }

        public final void bind(long j, long j2, long j3) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, j3);
        }
    }

    long _id();

    long corpus();

    boolean isHidden();

    boolean isSubscribed();

    long lastFavoriteTimestampSecs();

    long lastHideTimestampSecs();

    long lastLongImpressionVersion();

    long lastLongViewVersion();

    long lastStoryLengthSeconds();

    long lastUnfavoriteTimestampSecs();

    long lastUpdatedTimestampSecs();

    long lastVersionLongImpressionCount();

    long lastViewNumSnapsInStory();

    long lastViewVersion();

    long lastWatchedIndex();

    double longImpressionsScore();

    long longImpressionsScoreTimestampSecs();

    long longViewTapStoryKey();

    double longViewsScore();

    long longViewsScoreTimestampSecs();

    double maxSnapCompletionPercent();

    double maxTotalTimeWatched();

    long numSnapsViewedFromLatestVersion();

    double numSnapsViewedScore();

    long numSnapsViewedScoreTimestampSecs();

    long numWatches();

    double qualifiedLongImpressionScore();

    long qualifiedLongImpressionScoreTimestampSecs();

    double shortImpressionScore();

    long shortImpressionScoreTimestampSecs();

    double shortViewsScore();

    long shortViewsScoreTimestampSecs();

    String storyId();

    long tapStoryKey();

    double totalImpressionTime();

    double totalImpressionTimeScore();

    long totalImpressionTimeScoreTimestampSecs();

    double totalWatchTimeScore();

    long totalWatchTimeScoreTimestampSecs();
}
