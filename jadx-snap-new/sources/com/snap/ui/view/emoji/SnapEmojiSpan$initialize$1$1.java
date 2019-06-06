package com.snap.ui.view.emoji;

import android.graphics.drawable.Drawable;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;

final class SnapEmojiSpan$initialize$1$1 extends akcq implements akbl<Drawable, ajxw> {
    SnapEmojiSpan$initialize$1$1(SnapEmojiSpan snapEmojiSpan) {
        super(1, snapEmojiSpan);
    }

    public final String getName() {
        return "setEmojiDrawable";
    }

    public final akej getOwner() {
        return akde.a(SnapEmojiSpan.class);
    }

    public final String getSignature() {
        return "setEmojiDrawable(Landroid/graphics/drawable/Drawable;)V";
    }

    public final void invoke(Drawable drawable) {
        akcr.b(drawable, "p1");
        ((SnapEmojiSpan) this.receiver).setEmojiDrawable(drawable);
    }
}
