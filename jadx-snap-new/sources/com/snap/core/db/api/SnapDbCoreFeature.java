package com.snap.core.db.api;

import defpackage.ide;
import defpackage.idi;

public final class SnapDbCoreFeature extends ide {
    public static final SnapDbCoreFeature INSTANCE = new SnapDbCoreFeature();

    private SnapDbCoreFeature() {
        super("DbLogger", idi.APP_PLATFORM);
    }
}
