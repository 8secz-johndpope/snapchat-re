package com.snap.composer;

import defpackage.ide;
import defpackage.idi;

public final class ComposerFeature extends ide {
    public static final ComposerFeature INSTANCE = new ComposerFeature();

    private ComposerFeature() {
        super("Composer", idi.MAPS);
    }
}
