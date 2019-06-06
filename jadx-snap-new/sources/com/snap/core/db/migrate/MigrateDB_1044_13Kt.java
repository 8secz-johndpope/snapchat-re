package com.snap.core.db.migrate;

public final class MigrateDB_1044_13Kt {
    public static final String getStorySubscriptionTableCreateStatement_1044_14() {
        return "CREATE TABLE IF NOT EXISTS StorySubscription( \n _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \nstoryId TEXT NOT NULL UNIQUE, --StoryIds.fromRawCard, \nisSubscribed INTEGER, \ncardType INTEGER NOT NULL, \naddedTimestampMs INTEGER NOT NULL DEFAULT 0, \nisNotifOptedIn INTEGER DEFAULT 0)";
    }
}
