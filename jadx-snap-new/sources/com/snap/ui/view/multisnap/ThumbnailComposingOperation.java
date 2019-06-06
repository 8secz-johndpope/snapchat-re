package com.snap.ui.view.multisnap;

import com.google.common.base.Optional;
import defpackage.ajdx;
import defpackage.ajej;
import defpackage.jwj;
import defpackage.kaz;

public interface ThumbnailComposingOperation extends ajej {
    ThumbnailComposingOperation clone(String str);

    ajdx<Optional<kaz<jwj>>> getCompositeBitmap(kaz<jwj> kaz);
}
