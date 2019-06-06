package com.snap.core.db.api;

import defpackage.akeb;

public final class TransactionTrackerKt {
    private static final long TRANSACTION_TRACK_THRESHOLD_MILLIS = 60000;

    private static final long intersection(akeb akeb, akeb akeb2) {
        return Math.max(0, Math.min(akeb.b, akeb2.b) - Math.max(akeb.a, akeb2.a));
    }
}
