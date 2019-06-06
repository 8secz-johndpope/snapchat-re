package com.snap.core.db.migrate;

import defpackage.akcr;
import defpackage.pa;

public final class MigrateDB_1037_8Kt {
    public static final void cleanLocalMessageState(pa paVar) {
        akcr.b(paVar, "db");
        paVar.a();
        try {
            paVar.c("\n            DELETE FROM LocalMessageAction\n            WHERE actionType IN (0, 1, 2, 5)\n        ");
            paVar.c("\n            DELETE FROM Message\n            WHERE clientStatus NOT IN (1, 5)\n        ");
            paVar.c("\n            DELETE FROM MultiRecipientSendingSnap\n        ");
            paVar.c("\n            DELETE FROM InteractionMessages\n            WHERE messageType IN (0, 1)\n        ");
            paVar.c("\n            DELETE FROM Feed\n            WHERE displayInteractionType IN ('WAITING_TO_SEND','FAILED_TO_SEND')\n        ");
            paVar.d();
        } finally {
            paVar.c();
        }
    }
}
