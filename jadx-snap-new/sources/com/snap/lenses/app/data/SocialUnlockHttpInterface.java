package com.snap.lenses.app.data;

import defpackage.aibg;
import defpackage.aibi;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxy;

public interface SocialUnlockHttpInterface {
    @akxy(a = "/lens/social/metadata")
    ajdx<aibi> fetchLens(@akxk aibg aibg);

    @akxy(a = "/lens/social/unlock")
    ajdx<aibi> unlockLens(@akxk aibg aibg);
}
