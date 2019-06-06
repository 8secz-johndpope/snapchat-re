package com.snap.map.composer;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.views.ComposerRecyclableView;
import defpackage.akcr;

@Keep
public final class MapComposerAvatarView extends MapBitmojiImageView implements ComposerRecyclableView {
    public MapComposerAvatarView(Context context) {
        akcr.b(context, "context");
        super(context);
    }
}
