package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface FriendsFeedScoreModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FriendsFeedScore(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL UNIQUE,\n    score REAL,\n    -- interaction age calculated from previous ranking run.\n    prevInteractionAgeSecs REAL\n)";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String PREVINTERACTIONAGESECS = "prevInteractionAgeSecs";
    @Deprecated
    public static final String SCORE = "score";
    @Deprecated
    public static final String TABLE_NAME = "FriendsFeedScore";
    @Deprecated
    public static final String _ID = "_id";

    public static final class ClearAllScores extends ainy {
        public ClearAllScores(pa paVar) {
            super(FriendsFeedScoreModel.TABLE_NAME, paVar.a("DELETE FROM FriendsFeedScore"));
        }
    }

    public static final class SetAllScoresByRecency extends ainy {
        public SetAllScoresByRecency(pa paVar) {
            super(FriendsFeedScoreModel.TABLE_NAME, paVar.a("INSERT INTO FriendsFeedScore(feedRowId, score)\nSELECT\n    Feed._id,\n    (sortingTimestamp - strftime('%s','now') * 1000) -- stored as a float, make relative to now\nFROM Feed\nWHERE Feed.hidden = 0"));
        }
    }

    public interface Creator<T extends FriendsFeedScoreModel> {
        T create(long j, long j2, Float f, Float f2);
    }

    public static final class Factory<T extends FriendsFeedScoreModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectAllFeedsForScoring() {
            return new ainx("SELECT\n    Feed._id,\n    Feed.key AS feedKey,\n    Feed.friendRowId,\n    Feed.lastInteractionTimestamp,\n    Feed.storySkipCount,\n    Feed.displayInteractionType,\n    Feed.kind,\n    Feed.lastReadTimestamp,\n    Friend.streakLength,\n    Friend.streakExpiration,\n    Friend.username,\n    Friend.friendLinkType,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    Friend.birthday,\n    FriendsFeedScore.score AS prevScore,\n    FriendsFeedScore.prevInteractionAgeSecs,\n    FriendsFeedServerSignals.serverSignals,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp\nFROM\nFeed\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON (Feed.storyRowId = Story._id AND Feed.groupStoryMuted = 0 AND (Friend.storyMuted IS NULL OR Friend.storyMuted = 0))\nLEFT OUTER JOIN FriendsFeedServerSignals ON Feed._id = FriendsFeedServerSignals.feedRowId\nLEFT OUTER JOIN FriendsFeedScore ON Feed._id = FriendsFeedScore.feedRowId\nWHERE Feed.hidden = 0", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, FriendsFeedServerSignalsModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME));
        }

        public final <R extends SelectAllFeedsForScoringModel, T1 extends FeedModel, T2 extends FriendModel> SelectAllFeedsForScoringMapper<R, T1, T2> selectAllFeedsForScoringMapper(SelectAllFeedsForScoringCreator<R> selectAllFeedsForScoringCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            return new SelectAllFeedsForScoringMapper(selectAllFeedsForScoringCreator, factory, factory2);
        }
    }

    public interface SelectAllFeedsForScoringCreator<T extends SelectAllFeedsForScoringModel> {
        T create(long j, String str, Long l, Long l2, long j2, String str2, FeedKind feedKind, Long l3, Integer num, Long l4, String str3, FriendLinkType friendLinkType, Long l5, Long l6, CalendarDate calendarDate, Float f, Float f2, String str4, Boolean bool, Long l7);
    }

    public interface SelectAllFeedsForScoringModel {
        long _id();

        Long addedTimestamp();

        CalendarDate birthday();

        String displayInteractionType();

        String feedKey();

        FriendLinkType friendLinkType();

        Long friendRowId();

        FeedKind kind();

        Long lastInteractionTimestamp();

        Long lastReadTimestamp();

        Float prevInteractionAgeSecs();

        Float prevScore();

        Long reverseAddedTimestamp();

        String serverSignals();

        Long storyLatestTimestamp();

        long storySkipCount();

        Boolean storyViewed();

        Long streakExpiration();

        Integer streakLength();

        String username();
    }

    public static final class Mapper<T extends FriendsFeedScoreModel> implements ainw<T> {
        private final Factory<T> friendsFeedScoreModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendsFeedScoreModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.friendsFeedScoreModelFactory.creator;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            Float f = null;
            Float valueOf = cursor.isNull(2) ? null : Float.valueOf(cursor.getFloat(2));
            if (!cursor.isNull(3)) {
                f = Float.valueOf(cursor.getFloat(3));
            }
            return creator.create(j, j2, valueOf, f);
        }
    }

    public static final class SelectAllFeedsForScoringMapper<T extends SelectAllFeedsForScoringModel, T1 extends FeedModel, T2 extends FriendModel> implements ainw<T> {
        private final SelectAllFeedsForScoringCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;

        public SelectAllFeedsForScoringMapper(SelectAllFeedsForScoringCreator<T> selectAllFeedsForScoringCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = selectAllFeedsForScoringCreator;
            this.feedModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectAllFeedsForScoringCreator selectAllFeedsForScoringCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            Long valueOf = cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2));
            Long valueOf2 = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            long j2 = cursor2.getLong(4);
            String string2 = cursor2.isNull(5) ? null : cursor2.getString(5);
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            Long valueOf3 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            Integer valueOf4 = cursor2.isNull(8) ? null : Integer.valueOf(cursor2.getInt(8));
            Long valueOf5 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            String string3 = cursor2.isNull(10) ? null : cursor2.getString(10);
            FriendLinkType friendLinkType = cursor2.isNull(11) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            Long valueOf6 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            Long valueOf7 = cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13));
            CalendarDate calendarDate = cursor2.isNull(14) ? null : (CalendarDate) this.friendModelFactory.birthdayAdapter.decode(Long.valueOf(cursor2.getLong(14)));
            Float valueOf8 = cursor2.isNull(15) ? null : Float.valueOf(cursor2.getFloat(15));
            Float valueOf9 = cursor2.isNull(16) ? null : Float.valueOf(cursor2.getFloat(16));
            String string4 = cursor2.isNull(17) ? null : cursor2.getString(17);
            if (cursor2.isNull(18)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(18) == 1);
            }
            return selectAllFeedsForScoringCreator.create(j, string, valueOf, valueOf2, j2, string2, feedKind, valueOf3, valueOf4, valueOf5, string3, friendLinkType, valueOf6, valueOf7, calendarDate, valueOf8, valueOf9, string4, bool, cursor2.isNull(19) ? null : Long.valueOf(cursor2.getLong(19)));
        }
    }

    public static final class ClearOldScores extends ainy {
        public ClearOldScores(pa paVar) {
            super(FriendsFeedScoreModel.TABLE_NAME, paVar.a("DELETE FROM FriendsFeedScore\nWHERE feedRowId IN (\n  SELECT FriendsFeedScore.feedRowId\n  FROM FriendsFeedScore\n  LEFT JOIN FeedItemSyncState ON FriendsFeedScore.feedRowId=FeedItemSyncState.feedRowId WHERE\n  FeedItemSyncState.feedRowId IS NULL\n)"));
        }
    }

    public static final class ReplaceScore extends ainy {
        public ReplaceScore(pa paVar) {
            super(FriendsFeedScoreModel.TABLE_NAME, paVar.a("REPLACE INTO FriendsFeedScore(feedRowId,score,prevInteractionAgeSecs)\nVALUES(?,?,?)"));
        }

        public final void bind(long j, Float f, Float f2) {
            bindLong(1, j);
            if (f == null) {
                bindNull(2);
            } else {
                bindDouble(2, (double) f.floatValue());
            }
            if (f2 == null) {
                bindNull(3);
            } else {
                bindDouble(3, (double) f2.floatValue());
            }
        }
    }

    long _id();

    long feedRowId();

    Float prevInteractionAgeSecs();

    Float score();
}
