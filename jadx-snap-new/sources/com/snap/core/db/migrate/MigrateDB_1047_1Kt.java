package com.snap.core.db.migrate;

public final class MigrateDB_1047_1Kt {
    private static final String createForeignKeyEnabledMessageTable() {
        return " CREATE TABLE IF NOT EXISTS Message_new(\n                    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n                    key TEXT NOT NULL UNIQUE,\n                    feedRowId INTEGER REFERENCES Feed(_id) ON DELETE CASCADE,\n                    timestamp INTEGER NOT NULL,\n                    seenTimestamp INTEGER,\n                    senderId INTEGER,\n                    clientStatus TEXT,\n                    sequenceNumber INTEGER,\n                    type TEXT,\n                    cryptoKey TEXT,\n                    cryptoIV TEXT,\n                    mediaId TEXT,\n                    mediaType TEXT,\n                    mediaUrl TEXT,\n                    mediaWidth INTEGER,\n                    mediaHeight INTEGER,\n                    mediaOwner TEXT,\n                    mediaTimerSec REAL,\n                    mediaIsInfinite INTEGER,\n                    mediaZipped INTEGER,\n                    mediaVenueId TEXT,\n                    mediaSourceId TEXT,\n                    payloadId INTEGER,\n                    content BLOB,\n                    preserved INTEGER NOT NULL,\n                    savedStates TEXT,\n                    released INTEGER NOT NULL DEFAULT 0,\n                    messageOrderingKey TEXT,\n                    screenshottedOrReplayed TEXT,\n                    snapServerStatus TEXT,\n                    lastInteractionTimestamp INTEGER,\n                    viewerList BLOB\n            );";
    }

    private static final String createForeignKeyEnabledMessagingSnapTable() {
        return "CREATE TABLE IF NOT EXISTS MessagingSnap_new (\n                    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n                    snapRowId INTEGER NOT NULL REFERENCES Snap(_id) ON DELETE CASCADE,\n                    messageRowId INTEGER NOT NULL REFERENCES Message(_id) ON DELETE CASCADE,\n                    feedRowId INTEGER REFERENCES Feed(_id) ON DELETE CASCADE,\n                    serverStatus TEXT,\n                    secondaryTimestamp INTEGER,\n                    pendingDeliveredTimestamp INTEGER,\n                    orientation INTEGER,\n                    sendStartTimestamp INTEGER,\n                    -- interactions including screenshot/replay --\n                    lastInteractionTimestamp INTEGER,\n                    screenshottedOrReplayed TEXT,\n                    -- list of friendRowId --\n                    viewerList TEXT,\n                    senderId INTEGER,\n                    broadcast INTEGER,\n                    broadcastUrl TEXT,\n                    broadcastSecondaryText TEXT,\n                    broadcastHideTimer INTEGER,\n                    esId TEXT,\n                    egData TEXT,\n                    replyMedia TEXT,\n                    -- metadata for geofilter analytics\n                    geofilterMetadata TEXT,\n                    -- metadata for Snappable lenses\n                    snappableLensMetadata TEXT,\n                    directDownloadUrl TEXT\n            );";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0095 in {5, 9, 12, 15} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static final void enableForeignKeyForMessageAndMessagingSnapTable(defpackage.pa r2, com.snap.core.db.api.DbSchemaVersionController r3) {
        /*
        r0 = "db";
        defpackage.akcr.b(r2, r0);
        r0 = "schemaVersionController";
        defpackage.akcr.b(r3, r0);
        r0 = "PRAGMA foreign_keys=off;";
        r2.c(r0);
        r2.a();
        r0 = "Message";	 Catch:{ all -> 0x0090 }
        r0 = r3.getTableConstraints(r0, r2);	 Catch:{ all -> 0x0090 }
        r1 = createForeignKeyEnabledMessageTable();	 Catch:{ all -> 0x0090 }
        r2.c(r1);	 Catch:{ all -> 0x0090 }
        r1 = " INSERT INTO Message_new SELECT * FROM Message where Message.feedRowId IN (select Feed._id from Feed);";	 Catch:{ all -> 0x0090 }
        r2.c(r1);	 Catch:{ all -> 0x0090 }
        r1 = " DROP TABLE Message;";	 Catch:{ all -> 0x0090 }
        r2.c(r1);	 Catch:{ all -> 0x0090 }
        r1 = " ALTER TABLE Message_new RENAME TO Message;";	 Catch:{ all -> 0x0090 }
        r2.c(r1);	 Catch:{ all -> 0x0090 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0090 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0046;	 Catch:{ all -> 0x0090 }
        r1 = r0.next();	 Catch:{ all -> 0x0090 }
        r1 = (com.snap.core.db.api.ConstraintSpec) r1;	 Catch:{ all -> 0x0090 }
        r1 = r1.getSqlStatement();	 Catch:{ all -> 0x0090 }
        r2.c(r1);	 Catch:{ all -> 0x0090 }
        goto L_0x0032;	 Catch:{ all -> 0x0090 }
        r0 = "MessagingSnap";	 Catch:{ all -> 0x0090 }
        r3 = r3.getTableConstraints(r0, r2);	 Catch:{ all -> 0x0090 }
        r0 = createForeignKeyEnabledMessagingSnapTable();	 Catch:{ all -> 0x0090 }
        r2.c(r0);	 Catch:{ all -> 0x0090 }
        r0 = "INSERT INTO MessagingSnap_new SELECT * FROM MessagingSnap where\n\t\t\tMessagingSnap.feedRowId IN  (SELECT Feed._id from Feed)\n\t\t\tAND\n\t\t\tMessagingSnap.snapRowId IN (SELECT Snap._id from Snap)\n\t\t\tAND\n\t\t\tMessagingSnap.messageRowId IN (SELECT Message._id from Message);";	 Catch:{ all -> 0x0090 }
        r2.c(r0);	 Catch:{ all -> 0x0090 }
        r0 = " DROP TABLE MessagingSnap;";	 Catch:{ all -> 0x0090 }
        r2.c(r0);	 Catch:{ all -> 0x0090 }
        r0 = " ALTER TABLE MessagingSnap_new RENAME TO MessagingSnap;";	 Catch:{ all -> 0x0090 }
        r2.c(r0);	 Catch:{ all -> 0x0090 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0090 }
        r0 = r3.hasNext();	 Catch:{ all -> 0x0090 }
        if (r0 == 0) goto L_0x007a;	 Catch:{ all -> 0x0090 }
        r0 = r3.next();	 Catch:{ all -> 0x0090 }
        r0 = (com.snap.core.db.api.ConstraintSpec) r0;	 Catch:{ all -> 0x0090 }
        r0 = r0.getSqlStatement();	 Catch:{ all -> 0x0090 }
        r2.c(r0);	 Catch:{ all -> 0x0090 }
        goto L_0x0066;	 Catch:{ all -> 0x0090 }
        r3 = " CREATE INDEX IF NOT EXISTS snapRowIdIndex ON MessagingSnap(snapRowId);";	 Catch:{ all -> 0x0090 }
        r2.c(r3);	 Catch:{ all -> 0x0090 }
        r3 = " CREATE INDEX IF NOT EXISTS messageRowIdIndex ON MessagingSnap(messageRowId);";	 Catch:{ all -> 0x0090 }
        r2.c(r3);	 Catch:{ all -> 0x0090 }
        r2.d();	 Catch:{ all -> 0x0090 }
        r2.c();
        r3 = "PRAGMA foreign_keys=on;";
        r2.c(r3);
        return;
        r3 = move-exception;
        r2.c();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.migrate.MigrateDB_1047_1Kt.enableForeignKeyForMessageAndMessagingSnapTable(pa, com.snap.core.db.api.DbSchemaVersionController):void");
    }
}
