package com.snap.core.db.migrate;

import defpackage.akcr;
import defpackage.pa;

public final class MigrateDb_1036_11Kt {
    public static final void deleteDuplicateSnapViews(pa paVar) {
        akcr.b(paVar, "db");
        paVar.a();
        try {
            paVar.c("DELETE FROM PlaybackSnapView WHERE _id NOT IN (\n  SELECT MAX(_id) FROM PlaybackSnapView GROUP BY snapId);");
            paVar.d();
        } finally {
            paVar.c();
        }
    }
}
