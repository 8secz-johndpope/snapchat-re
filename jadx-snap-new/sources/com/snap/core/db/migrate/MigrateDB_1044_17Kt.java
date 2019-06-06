package com.snap.core.db.migrate;

import defpackage.akcr;

public final class MigrateDB_1044_17Kt {
    public static final String POSTABLE_STORY_TABLE_NAME_1045_1 = "PostableStory";

    public static final String get_MigrateDB_1045_1_PostableStoryTableSchema() {
        return "CREATE TABLE IF NOT EXISTS PostableStory (\n\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER, -- as DatabaseKey<Story>\n    subtext TEXT,\n    isSpectaclesStory INTEGER,\n    geofence TEXT,\n    groupStoryRankType INTEGER,\n    customTitle TEXT,\n    hasActiveStory INTEGER,\n    lastActionTimestamp INTEGER,\n    mostRecentPostTimestamp INTEGER,\n    creationTimestamp INTEGER,\n    thumbnailUrl TEXT,\n    myStoryPrivacyOverride INTEGER,\n    thirdPartyAppStoryTtl INTEGER);";
    }

    public static final String get_MigrateDB_1045_1_copyTableValue_statement(String str) {
        akcr.b(str, "tableName");
        return "select _id, storyId, storyRowId, subtext, isSpectaclesStory, geofence, groupStoryRankType, customTitle, hasActiveStory, lastActionTimestamp, mostRecentPostTimestamp, creationTimestamp, thumbnailUrl, myStoryPrivacyOverride, thirdPartyAppStoryTtl FROM ".concat(String.valueOf(str));
    }
}
