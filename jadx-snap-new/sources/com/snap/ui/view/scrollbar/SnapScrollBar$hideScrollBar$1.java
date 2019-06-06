package com.snap.ui.view.scrollbar;

import android.animation.Animator;
import defpackage.abtx;
import defpackage.akcr;

public final class SnapScrollBar$hideScrollBar$1 extends abtx {
    final /* synthetic */ SnapScrollBar this$0;

    SnapScrollBar$hideScrollBar$1(SnapScrollBar snapScrollBar) {
        this.this$0 = snapScrollBar;
    }

    public final void onAnimationEnd(Animator animator) {
        akcr.b(animator, "animation");
        this.this$0.isDismissing = false;
        this.this$0.layout.setVisibility(4);
    }
}
