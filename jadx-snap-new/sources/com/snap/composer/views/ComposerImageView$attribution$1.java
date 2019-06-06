package com.snap.composer.views;

import com.snap.composer.ComposerFeature;
import defpackage.ajyl;
import defpackage.ide;
import defpackage.idl;
import java.util.List;

public final class ComposerImageView$attribution$1 implements idl {
    private final List<String> a = ajyl.a("composer");

    ComposerImageView$attribution$1() {
    }

    public final ide getFeature() {
        return ComposerFeature.INSTANCE;
    }

    public final List<String> getHierarchy() {
        return this.a;
    }
}
