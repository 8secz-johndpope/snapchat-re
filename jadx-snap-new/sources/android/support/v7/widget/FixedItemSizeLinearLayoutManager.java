package android.support.v7.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager.LayoutChunkResult;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.view.View;

public class FixedItemSizeLinearLayoutManager extends LinearLayoutManager {
    private static final String TAG = "LinearLayoutManager";

    public FixedItemSizeLinearLayoutManager(Context context) {
        super(context);
    }

    public FixedItemSizeLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public FixedItemSizeLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    private boolean isChangedWithoutPayload(LayoutParams layoutParams) {
        return layoutParams.isItemChanged() && (layoutParams.mViewHolder.mPayloads == null || layoutParams.mViewHolder.mPayloads.isEmpty());
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutChunk(Recycler recycler, State state, b bVar, LayoutChunkResult layoutChunkResult) {
        View a = bVar.a(recycler);
        if (a == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        int decoratedMeasurementInOther;
        int i;
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (bVar.k == null) {
            if (this.mShouldReverseLayout == (bVar.f == -1)) {
                addView(a);
            } else {
                addView(a, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (bVar.f == -1)) {
                addDisappearingView(a);
            } else {
                addDisappearingView(a, 0);
            }
        }
        measureChildWithMargins(a, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(a);
        int width;
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                width = getWidth() - getPaddingRight();
                decoratedMeasurementInOther = width - this.mOrientationHelper.getDecoratedMeasurementInOther(a);
            } else {
                decoratedMeasurementInOther = getPaddingLeft();
                width = this.mOrientationHelper.getDecoratedMeasurementInOther(a) + decoratedMeasurementInOther;
            }
            if (bVar.f == -1) {
                i = bVar.b - layoutChunkResult.mConsumed;
                i2 = width;
                i3 = bVar.b;
            } else {
                i3 = bVar.b + layoutChunkResult.mConsumed;
                i2 = width;
                i = bVar.b;
            }
        } else {
            width = getPaddingTop();
            decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(a) + width;
            if (bVar.f == -1) {
                i = width;
                i2 = bVar.b;
                i3 = decoratedMeasurementInOther;
                decoratedMeasurementInOther = bVar.b - layoutChunkResult.mConsumed;
            } else {
                i2 = bVar.b + layoutChunkResult.mConsumed;
                i = width;
                i3 = decoratedMeasurementInOther;
                decoratedMeasurementInOther = bVar.b;
            }
        }
        layoutDecoratedWithMargins(a, decoratedMeasurementInOther, i, i2, i3);
        if (layoutParams.isItemRemoved() || isChangedWithoutPayload(layoutParams)) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = a.hasFocusable();
    }
}
