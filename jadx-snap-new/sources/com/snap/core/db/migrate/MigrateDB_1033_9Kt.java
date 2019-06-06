package com.snap.core.db.migrate;

public final class MigrateDB_1033_9Kt {
    public static final String getCreatePublisherSnapPageTableStatement() {
        return "CREATE TABLE IF NOT EXISTS PublisherSnapPage (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,pageId INTEGER UNIQUE NOT NULL,storyId TEXT NOT NULL,storyRowId INTEGER NOT NULL,editionId INTEGER NOT NULL,publisherName TEXT,snapType INTEGER NOT NULL,url TEXT,pageHash TEXT,adType INTEGER,swipeUpKey TEXT,shareable  INTEGER DEFAULT 0 NOT NULL,isAutoAdvance INTEGER DEFAULT 0 NOT NULL,isSkippable INTEGER DEFAULT 0 NOT NULL,slugType TEXT)";
    }
}
