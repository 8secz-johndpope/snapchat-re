package com.snap.ui.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajef;
import defpackage.ajwe;
import defpackage.ajxt;
import defpackage.akbl;
import defpackage.akcr;
import java.util.concurrent.Callable;

public class ViewStubWrapper<TView extends View> {
    private OnClickListener onClickListener;
    private OnInflatedListener<? super TView> onInflatedListener;
    private TView view;
    private final ViewStub viewStub;

    public interface OnInflatedListener<TView> {
        void onInflated(TView tView);
    }

    public ViewStubWrapper(ViewStub viewStub) {
        akcr.b(viewStub, "viewStub");
        this.viewStub = viewStub;
    }

    private final void onInflated(TView tView) {
        OnInflatedListener onInflatedListener = this.onInflatedListener;
        if (onInflatedListener != null) {
            onInflatedListener.onInflated(tView);
        }
        OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            tView.setOnClickListener(onClickListener);
        }
    }

    public final TView get() {
        View inflate;
        if (this.view == null) {
            inflate = this.viewStub.inflate();
            if (inflate != null) {
                this.view = inflate;
                inflate = this.view;
                if (inflate == null) {
                    akcr.a();
                }
                onInflated(inflate);
            } else {
                throw new ajxt("null cannot be cast to non-null type TView");
            }
        }
        inflate = this.view;
        if (inflate == null) {
            akcr.a();
        }
        return inflate;
    }

    public final TView getIfInflated() {
        return this.view;
    }

    public final ViewStub getViewStub() {
        return this.viewStub;
    }

    public final int getVisibility() {
        View view = this.view;
        return view != null ? view.getVisibility() : 8;
    }

    public final void inflateAsync(ajdw ajdw) {
        akcr.b(ajdw, "inflationScheduler");
        ajdx a = ajdx.c((Callable) new ViewStubWrapper$inflateAsync$1(this)).b(ajdw).a(ajef.a());
        akcr.a((Object) a, "Single.fromCallable({\n  …dSchedulers.mainThread())");
        ajwe.a(a, null, (akbl) new ViewStubWrapper$inflateAsync$2(this), 1);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        akcr.b(onClickListener, "onClick");
        this.onClickListener = onClickListener;
        View view = this.view;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void setOnInflatedListener(OnInflatedListener<? super TView> onInflatedListener) {
        akcr.b(onInflatedListener, "listener");
        this.onInflatedListener = onInflatedListener;
    }

    public void setVisibility(int i) {
        if (i != 8) {
            get().setVisibility(i);
            return;
        }
        View view = this.view;
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
