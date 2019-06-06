package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface FriendsFeedSharedSignalsModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FriendsFeedSharedSignals(\n    _id INTEGER NOT NULL PRIMARY KEY DEFAULT 0,\n    userSignals TEXT,\n    previousRankingRunTimestamp INTEGER,\n    previousFullRankingRunTimestamp INTEGER,\n    paginationPrevMinScore REAL\n)";
    @Deprecated
    public static final String PAGINATIONPREVMINSCORE = "paginationPrevMinScore";
    @Deprecated
    public static final String PREVIOUSFULLRANKINGRUNTIMESTAMP = "previousFullRankingRunTimestamp";
    @Deprecated
    public static final String PREVIOUSRANKINGRUNTIMESTAMP = "previousRankingRunTimestamp";
    @Deprecated
    public static final String TABLE_NAME = "FriendsFeedSharedSignals";
    @Deprecated
    public static final String USERSIGNALS = "userSignals";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends FriendsFeedSharedSignalsModel> {
        T create(long j, String str, Long l, Long l2, Float f);
    }

    public static final class Factory<T extends FriendsFeedSharedSignalsModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getSharedSignalsForFeed() {
            return new ainx("SELECT *\nFROM FriendsFeedSharedSignals", new aioa(FriendsFeedSharedSignalsModel.TABLE_NAME));
        }

        public final Mapper<T> getSharedSignalsForFeedMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends FriendsFeedSharedSignalsModel> implements ainw<T> {
        private final Factory<T> friendsFeedSharedSignalsModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendsFeedSharedSignalsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.friendsFeedSharedSignalsModelFactory.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : Float.valueOf(cursor.getFloat(4)));
        }
    }

    public static final class ReplaceRankingRunMetadata extends ainy {
        public ReplaceRankingRunMetadata(pa paVar) {
            super(FriendsFeedSharedSignalsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FriendsFeedSharedSignals(_id, userSignals, previousRankingRunTimestamp, paginationPrevMinScore, previousFullRankingRunTimestamp)\nVALUES(1, (SELECT userSignals FROM FriendsFeedSharedSignals WHERE _id = 1), ?, ?, ?)"));
        }

        public final void bind(Long l, Float f, Long l2) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (f == null) {
                bindNull(2);
            } else {
                bindDouble(2, (double) f.floatValue());
            }
            if (l2 == null) {
                bindNull(3);
            } else {
                bindLong(3, l2.longValue());
            }
        }
    }

    public static final class ReplaceUserSignals extends ainy {
        public ReplaceUserSignals(pa paVar) {
            super(FriendsFeedSharedSignalsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FriendsFeedSharedSignals(_id, userSignals, previousRankingRunTimestamp, paginationPrevMinScore, previousFullRankingRunTimestamp)\nVALUES(1,\n?,\n(SELECT previousRankingRunTimestamp FROM FriendsFeedSharedSignals WHERE _id = 1),\n(SELECT paginationPrevMinScore FROM FriendsFeedSharedSignals WHERE _id = 1),\n(SELECT previousFullRankingRunTimestamp FROM FriendsFeedSharedSignals WHERE _id = 1))"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    long _id();

    Float paginationPrevMinScore();

    Long previousFullRankingRunTimestamp();

    Long previousRankingRunTimestamp();

    String userSignals();
}
