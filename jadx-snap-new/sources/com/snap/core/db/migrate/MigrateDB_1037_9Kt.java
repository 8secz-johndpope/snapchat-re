package com.snap.core.db.migrate;

import defpackage.akcr;
import defpackage.pa;

public final class MigrateDB_1037_9Kt {
    public static final void deleteOldStickerMessages(pa paVar) {
        akcr.b(paVar, "db");
        paVar.a();
        try {
            paVar.c("\n            DELETE FROM Message\n            WHERE type IN ('sticker', 'sticker_v2', 'sticker_v3')\n        ");
            paVar.d();
        } finally {
            paVar.c();
        }
    }
}
