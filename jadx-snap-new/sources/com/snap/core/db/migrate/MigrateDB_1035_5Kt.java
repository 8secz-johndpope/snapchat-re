package com.snap.core.db.migrate;

import defpackage.akcr;
import defpackage.pa;

public final class MigrateDB_1035_5Kt {
    public static final void updateDiscoverStorySnapTableSchema(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("PRAGMA foreign_keys=off");
        paVar.a();
        try {
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN streamingMediaKey TEXT");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN streamingMediaIv TEXT");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN streamingMetadataUrl TEXT");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN featureType INTEGER DEFAULT 0 NOT NULL");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN displayName TEXT");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN thumbnailUrl TEXT");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN shareable INTEGER NOT NULL DEFAULT 0");
            paVar.c("ALTER TABLE DiscoverStorySnap ADD COLUMN dynamicSnapSource INTEGER NOT NULL DEFAULT 0");
            paVar.c("ALTER TABLE DiscoverStorySnap RENAME TO old_DiscoverStorySnap");
            paVar.c("CREATE TABLE IF NOT EXISTS DiscoverStorySnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER NOT NULL,\n    rawSnapId TEXT NOT NULL,\n    creationTimestampMs INTEGER NOT NULL,\n    expirationTimestampMs INTEGER NOT NULL,\n    title TEXT,\n    subTitles TEXT,\n    attachmentUrl TEXT,\n    lensId TEXT,\n    snapSource TEXT,\n    hasSnappablesMetadata INTEGER DEFAULT 0 NOT NULL,\n    /* media info */\n    mediaType INTEGER NOT NULL,\n    mediaId TEXT,\n    mediaUrl TEXT,\n    mediaKey TEXT,\n    mediaIv TEXT,\n    duration INTEGER NOT NULL,\n    isZipped INTEGER DEFAULT 0 NOT NULL,\n    isInfiniteDuration INTEGER DEFAULT 0  NOT NULL,\n\n    streamingMediaKey TEXT,\n    streamingMediaIv TEXT,\n    streamingMetadataUrl TEXT,\n\n    featureType INTEGER NOT NULL,\n    displayName TEXT,\n    thumbnailUrl TEXT,\n    shareable INTEGER NOT NULL DEFAULT 0,\n    dynamicSnapSource INTEGER NOT NULL DEFAULT 0,\n    unique (rawSnapId, featureType)\n)");
            paVar.c("INSERT INTO DiscoverStorySnap SELECT * FROM old_DiscoverStorySnap");
            paVar.c("DROP TABLE old_DiscoverStorySnap");
            paVar.d();
            paVar.c("PRAGMA foreign_keys=on");
        } finally {
            paVar.c();
        }
    }

    public static final void upgradePublisherSnapPageTableSchema(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("PRAGMA foreign_keys=off");
        paVar.a();
        try {
            paVar.c("ALTER TABLE PublisherSnapPage ADD COLUMN featureType INTEGER DEFAULT 0 NOT NULL");
            paVar.c("ALTER TABLE PublisherSnapPage RENAME TO old_PublisherSnapPage");
            paVar.c("CREATE TABLE IF NOT EXISTS PublisherSnapPage (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    pageId INTEGER NOT NULL,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER NOT NULL,\n    editionId INTEGER NOT NULL,\n    publisherName TEXT,\n    snapType INTEGER NOT NULL,\n    url TEXT,\n    pageHash TEXT,\n    adType INTEGER,\n    -- Rich media info\n    swipeUpKey TEXT,\n    shareable  INTEGER DEFAULT 0 NOT NULL,\n    isAutoAdvance INTEGER DEFAULT 0 NOT NULL,\n    isSkippable INTEGER DEFAULT 0 NOT NULL,\n    slugType TEXT,\n\n    featureType INTEGER NOT NULL,\n    unique (pageId, featureType)\n)");
            paVar.c("INSERT INTO PublisherSnapPage SELECT * FROM old_PublisherSnapPage");
            paVar.c("DROP TABLE old_PublisherSnapPage");
            paVar.d();
            paVar.c("PRAGMA foreign_keys=on");
        } finally {
            paVar.c();
        }
    }
}
