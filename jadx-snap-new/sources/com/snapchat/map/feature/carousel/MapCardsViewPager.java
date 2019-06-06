package com.snapchat.map.feature.carousel;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abtp;

public class MapCardsViewPager extends ViewPager {
    private boolean d = false;

    public MapCardsViewPager(Context context) {
        super(context);
        a(true);
    }

    public MapCardsViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(true);
    }

    public final void a(boolean z) {
        setClipToPadding(false);
        int a = (int) abtp.a((float) (z ? 10 : 20), getContext());
        setPadding(a, 0, a, 0);
    }

    public final void b(boolean z) {
        View e = e();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RecyclerView) {
                childAt = (RecyclerView) childAt;
                if (z || childAt != e) {
                    childAt.smoothScrollToPosition(0);
                }
            }
        }
    }

    public final View e() {
        int b = super.b();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Object tag = childAt.getTag(R.id.position_id);
            if (tag != null && tag.equals(Integer.valueOf(b))) {
                return childAt;
            }
        }
        return null;
    }

    public final void f() {
        animate().translationY(MapboxConstants.MINIMUM_ZOOM).setDuration(200).start();
    }

    public final void g() {
        this.d = true;
    }

    public void onMeasure(int i, int i2) {
        if (this.d) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            if (i3 != 0) {
                i2 = MeasureSpec.makeMeasureSpec(i3, AudioPlayer.INFINITY_LOOP_COUNT);
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View e = e();
            if ((e instanceof RecyclerView) && ((RecyclerView) e).findChildViewUnder(motionEvent.getX(), motionEvent.getY()) == null) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
