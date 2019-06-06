package com.snap.core.db.migrate;

import defpackage.akcr;

public final class MigrateDB_1046_1Kt {
    public static final String PLAYBACK_SNAP_VIEW_TABLE_NAME = "PlaybackSnapView";

    public static final String get_MigrateDB_1046_1_copyTableValueStatement(String str) {
        akcr.b(str, "tableName");
        return "select _id, type, snapRowId, snapId, viewStartTimestampMillis, viewDurationMillis, snapTimestampMillis, COALESCE(snapExpirationTimestampMillis,0), storyId, storyRowId FROM ".concat(String.valueOf(str));
    }

    public static final String get_MigrateDB_1046_1_tableCreationStatement() {
        return "CREATE TABLE IF NOT EXISTS PlaybackSnapView(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    type INTEGER NOT NULL, -- type of Snap\n    snapRowId INTEGER NOT NULL, -- index into the appropriate Snap table\n    snapId TEXT NOT NULL,  -- the SnapId as text\n    viewStartTimestampMillis INTEGER NOT NULL, -- timestamp of view\n    viewDurationMillis INTEGER, -- Milliseconds of the snap the user has watched.\n    snapTimestampMillis INTEGER, -- timestamp of the Snap, if known\n    snapExpirationTimestampMillis INTEGER NOT NULL DEFAULT 0, -- expiration time of Snap, if known\n\n    storyId TEXT,  -- if the Snap is part of a story\n    storyRowId INTEGER -- index into Story table, if known\n);";
    }
}
