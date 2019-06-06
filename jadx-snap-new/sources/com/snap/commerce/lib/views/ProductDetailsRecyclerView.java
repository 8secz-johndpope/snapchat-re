package com.snap.commerce.lib.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajwo;
import defpackage.frm;
import defpackage.zfw;
import defpackage.zmf;
import java.util.concurrent.TimeUnit;

public class ProductDetailsRecyclerView extends RecyclerView {
    zmf a;
    final LinearLayoutManager b = new LinearLayoutManager(getContext(), 1, false);
    zfw c;
    final ajei d = new ajei();
    public final ajwo<frm> e = new ajwo();
    private MotionEvent f;

    public ProductDetailsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a(View view, MotionEvent motionEvent) {
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.bottom -= getScrollY();
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private View b() {
        return this.b.findViewByPosition(0);
    }

    private boolean b(MotionEvent motionEvent) {
        return (motionEvent == null || this.a == null || !a(b(), motionEvent)) ? false : true;
    }

    public final void a() {
        if (this.c != null) {
            int computeVerticalScrollOffset = computeVerticalScrollOffset();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, -50});
            ofInt.setDuration(400);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new -$$Lambda$ProductDetailsRecyclerView$cwc3H8U6R6f5RRAghc0a6uza7L4(this, computeVerticalScrollOffset));
            ofInt.addListener(new AnimatorListenerAdapter() {
                private /* synthetic */ void a() {
                    ProductDetailsRecyclerView.this.smoothScrollToPosition(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    ProductDetailsRecyclerView.this.d.a(ajcx.a(new -$$Lambda$ProductDetailsRecyclerView$1$GRKqC5EFCENOGSUsnjtEoI_opVQ(this)).b(500, TimeUnit.MILLISECONDS).b((ajdw) ProductDetailsRecyclerView.this.c.l()).e());
                }
            });
            ofInt.start();
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        return !b(motionEvent);
    }

    public boolean canScrollVertically(int i) {
        return a(this.f);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.f = MotionEvent.obtain(motionEvent);
        }
        return a(b(), motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a == null ? super.onTouchEvent(motionEvent) : !b(motionEvent) && super.onTouchEvent(motionEvent);
    }
}
