package com.snap.core.db;

import defpackage.ide;
import defpackage.idi;

public final class SnapDbInternalFeature extends ide {
    public static final SnapDbInternalFeature INSTANCE = new SnapDbInternalFeature();

    private SnapDbInternalFeature() {
        super("SnapDb", idi.APP_PLATFORM);
    }
}
