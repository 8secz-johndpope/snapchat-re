package com.snap.ui.view;

import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class ViewStubWrapper$inflateAsync$2 extends akcs implements akbl<TView, ajxw> {
    final /* synthetic */ ViewStubWrapper this$0;

    ViewStubWrapper$inflateAsync$2(ViewStubWrapper viewStubWrapper) {
        this.this$0 = viewStubWrapper;
        super(1);
    }

    public final void invoke(TView tView) {
        this.this$0.view = tView;
        ViewParent parent = this.this$0.getViewStub().getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(this.this$0.getViewStub());
            viewGroup.removeViewInLayout(this.this$0.getViewStub());
            LayoutParams layoutParams = this.this$0.getViewStub().getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(tView, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(tView, indexOfChild);
            }
            ViewStubWrapper viewStubWrapper = this.this$0;
            akcr.a((Object) tView, "inflatedView");
            viewStubWrapper.onInflated(tView);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
