package android.support.v7.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.Pair;
import android.view.View;

public class ReverseLinearLayoutManager extends CustomLinearLayoutManager {

    class a extends a {
        a() {
            super();
        }

        public final void b(View view) {
            this.b = this.c ? ReverseLinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view) : ReverseLinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view);
            this.a = ReverseLinearLayoutManager.this.getPosition(view);
        }
    }

    public ReverseLinearLayoutManager(Context context) {
        super(context, 1, true);
        this.mAnchorInfo = new a();
    }

    /* Access modifiers changed, original: protected */
    public Pair<Integer, Integer> calculateExtraForStartEnd(int i) {
        return new Pair(Integer.valueOf(i), Integer.valueOf(0));
    }

    /* Access modifiers changed, original: 0000 */
    public View findReferenceChild(Recycler recycler, State state, int i, int i2, int i3) {
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getTotalSpaceChange();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.getDecoratedStart(childAt) < endAfterPadding && this.mOrientationHelper.getDecoratedEnd(childAt) >= startAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public boolean supportsPredictiveItemAnimations() {
        return super.supportsPredictiveItemAnimations() && getPaddingBottom() < getHeight();
    }
}
