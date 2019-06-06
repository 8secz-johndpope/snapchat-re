package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.CardType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface StorySubscriptionModel {
    public static final String ADDADDEDTIMESTAMPCOLUMN = "ALTER TABLE StorySubscription\nADD COLUMN addedTimestamp INTEGER NOT NULL DEFAULT 0";
    @Deprecated
    public static final String ADDEDTIMESTAMPMS = "addedTimestampMs";
    public static final String ADDISNOTIFOPTEDINCOLUMN = "ALTER TABLE StorySubscription\nADD COLUMN isNotifOptedIn INTEGER DEFAULT 0";
    @Deprecated
    public static final String CARDTYPE = "cardType";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StorySubscription (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyId TEXT NOT NULL UNIQUE, --StoryIds.fromRawCard\n    isSubscribed INTEGER,\n    cardType INTEGER NOT NULL,\n    addedTimestampMs INTEGER NOT NULL DEFAULT 0,\n    isNotifOptedIn INTEGER DEFAULT 0\n)";
    @Deprecated
    public static final String ISNOTIFOPTEDIN = "isNotifOptedIn";
    @Deprecated
    public static final String ISSUBSCRIBED = "isSubscribed";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String TABLE_NAME = "StorySubscription";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends StorySubscriptionModel> {
        T create(long j, String str, Boolean bool, CardType cardType, long j2, Boolean bool2);
    }

    public static final class Factory<T extends StorySubscriptionModel> {
        public final ainu<CardType, Long> cardTypeAdapter;
        public final Creator<T> creator;

        final class GetIsOptedInByStoryIdQuery extends ainx {
            private final String storyId;

            GetIsOptedInByStoryIdQuery(String str) {
                super("SELECT isNotifOptedIn\nFROM StorySubscription\nWHERE storyId = ?1", new aioa(StorySubscriptionModel.TABLE_NAME));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
            }
        }

        final class GetIsSubscribedByStoryIdQuery extends ainx {
            private final String storyId;

            GetIsSubscribedByStoryIdQuery(String str) {
                super("SELECT isSubscribed\nFROM StorySubscription\nWHERE storyId = ?1", new aioa(StorySubscriptionModel.TABLE_NAME));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
            }
        }

        final class SelectSubscriptionInfoQuery extends ainx {
            private final String storyId;

            SelectSubscriptionInfoQuery(String str) {
                super("SELECT *\nFROM StorySubscription\nWHERE storyId = ?1", new aioa(StorySubscriptionModel.TABLE_NAME));
                this.storyId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
            }
        }

        public Factory(Creator<T> creator, ainu<CardType, Long> ainu) {
            this.creator = creator;
            this.cardTypeAdapter = ainu;
        }

        public final ainx getHasSubscriptions() {
            return new ainx("SELECT COUNT(*)\nFROM StorySubscription\nWHERE isSubscribed = 1", new aioa(StorySubscriptionModel.TABLE_NAME));
        }

        public final ainw<Long> getHasSubscriptionsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getIsOptedInByStoryId(String str) {
            return new GetIsOptedInByStoryIdQuery(str);
        }

        public final ainw<Boolean> getIsOptedInByStoryIdMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.isNull(0)) {
                        return null;
                    }
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }

        public final ainx getIsSubscribedByStoryId(String str) {
            return new GetIsSubscribedByStoryIdQuery(str);
        }

        public final ainw<Boolean> getIsSubscribedByStoryIdMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.isNull(0)) {
                        return null;
                    }
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }

        public final ainx selectAllFromStorySubscription() {
            return new ainx("SELECT *\nFROM StorySubscription", new aioa(StorySubscriptionModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllFromStorySubscriptionMapper() {
            return new Mapper(this);
        }

        public final ainx selectSubscriptionInfo(String str) {
            return new SelectSubscriptionInfoQuery(str);
        }

        public final Mapper<T> selectSubscriptionInfoMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends StorySubscriptionModel> implements ainw<T> {
        private final Factory<T> storySubscriptionModelFactory;

        public Mapper(Factory<T> factory) {
            this.storySubscriptionModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Creator creator = this.storySubscriptionModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            if (cursor.isNull(2)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor.getInt(2) == 1);
            }
            CardType cardType = (CardType) this.storySubscriptionModelFactory.cardTypeAdapter.decode(Long.valueOf(cursor.getLong(3)));
            long j2 = cursor.getLong(4);
            if (cursor.isNull(5)) {
                bool2 = null;
            } else {
                if (cursor.getInt(5) == 1) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            }
            return creator.create(j, string, bool, cardType, j2, bool2);
        }
    }

    public static final class ClearUnsubscribedOlderThan extends ainy {
        public ClearUnsubscribedOlderThan(pa paVar) {
            super(StorySubscriptionModel.TABLE_NAME, paVar.a("DELETE FROM StorySubscription\nWHERE addedTimestampMs < ? AND isSubscribed == 0"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertOrReplaceSubscription extends ainy {
        private final Factory<? extends StorySubscriptionModel> storySubscriptionModelFactory;

        public InsertOrReplaceSubscription(pa paVar, Factory<? extends StorySubscriptionModel> factory) {
            super(StorySubscriptionModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO StorySubscription(\n    storyId,\n    isSubscribed,\n    isNotifOptedIn,\n    cardType,\n    addedTimestampMs)\nVALUES(?, ?, ?, ?, ?)"));
            this.storySubscriptionModelFactory = factory;
        }

        public final void bind(String str, Boolean bool, Boolean bool2, CardType cardType, long j) {
            bindString(1, str);
            long j2 = 1;
            if (bool == null) {
                bindNull(2);
            } else {
                bindLong(2, bool.booleanValue() ? 1 : 0);
            }
            if (bool2 == null) {
                bindNull(3);
            } else {
                if (!bool2.booleanValue()) {
                    j2 = 0;
                }
                bindLong(3, j2);
            }
            bindLong(4, ((Long) this.storySubscriptionModelFactory.cardTypeAdapter.encode(cardType)).longValue());
            bindLong(5, j);
        }
    }

    public static final class UpdateNotifOptIn extends ainy {
        public UpdateNotifOptIn(pa paVar) {
            super(StorySubscriptionModel.TABLE_NAME, paVar.a("UPDATE StorySubscription\nSET isNotifOptedIn = ?\nWHERE storyId = ?"));
        }

        public final void bind(Boolean bool, String str) {
            if (bool == null) {
                bindNull(1);
            } else {
                bindLong(1, bool.booleanValue() ? 1 : 0);
            }
            bindString(2, str);
        }
    }

    public static final class UpdateSubscribe extends ainy {
        public UpdateSubscribe(pa paVar) {
            super(StorySubscriptionModel.TABLE_NAME, paVar.a("UPDATE StorySubscription\nSET isSubscribed = ?\nWHERE storyId = ?"));
        }

        public final void bind(Boolean bool, String str) {
            if (bool == null) {
                bindNull(1);
            } else {
                bindLong(1, bool.booleanValue() ? 1 : 0);
            }
            bindString(2, str);
        }
    }

    long _id();

    long addedTimestampMs();

    CardType cardType();

    Boolean isNotifOptedIn();

    Boolean isSubscribed();

    String storyId();
}
