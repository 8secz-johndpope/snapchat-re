package com.snap.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.ajxt;
import java.util.concurrent.Callable;

final class ViewStubWrapper$inflateAsync$1<V> implements Callable<T> {
    final /* synthetic */ ViewStubWrapper this$0;

    ViewStubWrapper$inflateAsync$1(ViewStubWrapper viewStubWrapper) {
        this.this$0 = viewStubWrapper;
    }

    public final TView call() {
        LayoutInflater layoutInflater = this.this$0.getViewStub().getLayoutInflater();
        int layoutResource = this.this$0.getViewStub().getLayoutResource();
        ViewParent parent = this.this$0.getViewStub().getParent();
        if (parent != null) {
            View inflate = layoutInflater.inflate(layoutResource, (ViewGroup) parent, false);
            if (inflate != null) {
                return inflate;
            }
            throw new ajxt("null cannot be cast to non-null type TView");
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
