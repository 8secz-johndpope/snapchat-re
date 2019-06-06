package com.snapchat.map.feature.carousel;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.absi.a;
import defpackage.acny;

public class MapCardsRecyclerView extends RecyclerView {
    public float a = 1.5f;
    public int b;

    public MapCardsRecyclerView(Context context) {
        super(context);
    }

    public MapCardsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight > 0) {
            Adapter adapter = getAdapter();
            int i = 0;
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int b = b();
            int e = a.a.e();
            int i2 = this.b;
            measuredHeight = ((measuredHeight - i2) - b) - e;
            if (itemCount > 1) {
                i = e;
            }
            setPadding(getPaddingLeft(), measuredHeight, getPaddingRight(), i2 + i);
        }
    }

    public final int b() {
        Adapter adapter = getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        Context context = getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.map_carousel_card_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.map_carousel_card_height);
        if (adapter instanceof acny) {
            acny acny = (acny) adapter;
            if (VERSION.SDK_INT >= 21) {
                dimensionPixelSize2 = acny.c();
            }
        }
        dimensionPixelSize2 = (int) (itemCount > 1 ? ((float) dimensionPixelSize) * this.a : (float) dimensionPixelSize2);
        LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return dimensionPixelSize2;
        }
        if (itemCount > 0) {
            View childAt = layoutManager.getChildAt(0);
            if (childAt != null) {
                dimensionPixelSize2 = childAt.getMeasuredHeight();
            }
        }
        if (itemCount <= 1) {
            return dimensionPixelSize2;
        }
        View childAt2 = layoutManager.getChildAt(1);
        if (childAt2 == null) {
            return dimensionPixelSize2;
        }
        float f = this.a - 1.0f;
        return f > MapboxConstants.MINIMUM_ZOOM ? (int) (((float) dimensionPixelSize2) + (((float) childAt2.getMeasuredHeight()) * f)) : dimensionPixelSize2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0 ? findChildViewUnder(motionEvent.getX(), motionEvent.getY()) != null ? super.onTouchEvent(motionEvent) : false : super.onTouchEvent(motionEvent);
    }
}
