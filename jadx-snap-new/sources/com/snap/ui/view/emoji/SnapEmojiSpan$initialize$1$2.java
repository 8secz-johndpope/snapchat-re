package com.snap.ui.view.emoji;

import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;

final class SnapEmojiSpan$initialize$1$2 extends akcq implements akbl<Throwable, ajxw> {
    SnapEmojiSpan$initialize$1$2(SnapEmojiSpan snapEmojiSpan) {
        super(1, snapEmojiSpan);
    }

    public final String getName() {
        return "onLoadFailed";
    }

    public final akej getOwner() {
        return akde.a(SnapEmojiSpan.class);
    }

    public final String getSignature() {
        return "onLoadFailed(Ljava/lang/Throwable;)V";
    }

    public final void invoke(Throwable th) {
        akcr.b(th, "p1");
        ((SnapEmojiSpan) this.receiver).onLoadFailed(th);
    }
}
