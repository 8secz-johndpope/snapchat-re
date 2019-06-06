package com.snap.ui.view.placeholder;

import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import com.snapchat.android.R;
import defpackage.ajfb;
import defpackage.hh;

final class NeonPlaceholderViewFactory$createPlaceholderView$1$disposable$1<T> implements ajfb<Rect> {
    final /* synthetic */ View $this_apply;

    NeonPlaceholderViewFactory$createPlaceholderView$1$disposable$1(View view) {
        this.$this_apply = view;
    }

    public final void accept(Rect rect) {
        this.$this_apply.setBackground(new InsetDrawable(hh.a(this.$this_apply.getResources(), R.drawable.neon_ptr_top_rounded_corner_background, null), rect.left, rect.top + this.$this_apply.getResources().getDimensionPixelOffset(R.dimen.neon_header_height), rect.right, rect.bottom));
    }
}
