package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.LayoutManager.Properties;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper.ViewDropHandler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.oq;
import java.util.List;

public class CustomLinearLayoutManager extends LayoutManager implements ScrollVectorProvider, ViewDropHandler {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final LayoutChunkResult mLayoutChunkResult;
    private b mLayoutState;
    int mOrientation;
    OrientationHelper mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public static class LayoutChunkResult {
        public int mConsumed;
        public boolean mFinished;
        public boolean mFocusable;
        public boolean mIgnoreConsumed;

        protected LayoutChunkResult() {
        }

        /* Access modifiers changed, original: 0000 */
        public void resetInternal() {
            this.mConsumed = 0;
            this.mFinished = false;
            this.mIgnoreConsumed = false;
            this.mFocusable = false;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.mAnchorLayoutFromEnd = z;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }

        public int describeContents() {
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd);
        }
    }

    class a {
        int a;
        int b;
        boolean c;
        boolean d;

        a() {
            a();
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
        }

        public final void a(View view) {
            int totalSpaceChange = CustomLinearLayoutManager.this.mOrientationHelper.getTotalSpaceChange();
            if (totalSpaceChange >= 0) {
                b(view);
                return;
            }
            this.a = CustomLinearLayoutManager.this.getPosition(view);
            int endAfterPadding;
            int decoratedMeasurement;
            if (this.c) {
                endAfterPadding = (CustomLinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view);
                this.b = CustomLinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - endAfterPadding;
                if (endAfterPadding > 0) {
                    decoratedMeasurement = this.b - CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedMeasurement(view);
                    totalSpaceChange = CustomLinearLayoutManager.this.mOrientationHelper.getStartAfterPadding();
                    decoratedMeasurement -= totalSpaceChange + Math.min(CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view) - totalSpaceChange, 0);
                    if (decoratedMeasurement < 0) {
                        this.b += Math.min(endAfterPadding, -decoratedMeasurement);
                    }
                }
                return;
            }
            endAfterPadding = CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view);
            decoratedMeasurement = endAfterPadding - CustomLinearLayoutManager.this.mOrientationHelper.getStartAfterPadding();
            this.b = endAfterPadding;
            if (decoratedMeasurement > 0) {
                int endAfterPadding2 = (CustomLinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - Math.min(0, (CustomLinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() - totalSpaceChange) - CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view))) - (endAfterPadding + CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedMeasurement(view));
                if (endAfterPadding2 < 0) {
                    this.b -= Math.min(decoratedMeasurement, -endAfterPadding2);
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            this.b = this.c ? CustomLinearLayoutManager.this.mOrientationHelper.getEndAfterPadding() : CustomLinearLayoutManager.this.mOrientationHelper.getStartAfterPadding();
        }

        public void b(View view) {
            this.b = this.c ? CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedEnd(view) + CustomLinearLayoutManager.this.mOrientationHelper.getTotalSpaceChange() : CustomLinearLayoutManager.this.mOrientationHelper.getDecoratedStart(view);
            this.a = CustomLinearLayoutManager.this.getPosition(view);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
            stringBuilder.append(this.a);
            stringBuilder.append(", mCoordinate=");
            stringBuilder.append(this.b);
            stringBuilder.append(", mLayoutFromEnd=");
            stringBuilder.append(this.c);
            stringBuilder.append(", mValid=");
            stringBuilder.append(this.d);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static class b {
        boolean a = true;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h = 0;
        boolean i = false;
        int j;
        List<ViewHolder> k = null;
        boolean l;

        b() {
        }

        private View b(View view) {
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((ViewHolder) this.k.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (!(view3 == view || layoutParams.isItemRemoved())) {
                    int viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.d) * this.e;
                    if (viewLayoutPosition >= 0 && viewLayoutPosition < i) {
                        if (viewLayoutPosition == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = viewLayoutPosition;
                    }
                }
            }
            return view2;
        }

        public final void a(View view) {
            view = b(view);
            this.d = view == null ? -1 : ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }
    }

    public CustomLinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public CustomLinearLayoutManager(Context context, int i, boolean z) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        setOrientation(i);
        setReverseLayout(z);
        setAutoMeasureEnabled(true);
    }

    public CustomLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new LayoutChunkResult();
        this.mInitialPrefetchItemCount = 2;
        Properties properties = LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
        setAutoMeasureEnabled(true);
    }

    private int computeScrollExtent(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        OrientationHelper orientationHelper = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ 1, true);
        return oq.a(state, orientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ 1, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        OrientationHelper orientationHelper = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ 1, true);
        return oq.a(state, orientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ 1, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        OrientationHelper orientationHelper = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(this.mSmoothScrollbarEnabled ^ 1, true);
        return oq.b(state, orientationHelper, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(this.mSmoothScrollbarEnabled ^ 1, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild(Recycler recycler, State state) {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(Recycler recycler, State state) {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        int i;
        int childCount;
        if (this.mShouldReverseLayout) {
            i = 0;
            childCount = getChildCount();
        } else {
            i = getChildCount() - 1;
            childCount = -1;
        }
        return findOneVisibleChild(i, childCount, z, z2);
    }

    private View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        int childCount;
        int i;
        if (this.mShouldReverseLayout) {
            childCount = getChildCount() - 1;
            i = -1;
        } else {
            childCount = 0;
            i = getChildCount();
        }
        return findOneVisibleChild(childCount, i, z, z2);
    }

    private View findLastPartiallyOrCompletelyInvisibleChild(Recycler recycler, State state) {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(Recycler recycler, State state) {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild(recycler, state) : findLastPartiallyOrCompletelyInvisibleChild(recycler, state);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild(recycler, state) : findFirstPartiallyOrCompletelyInvisibleChild(recycler, state);
    }

    private View findReferenceChildClosestToEnd(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(recycler, state) : findLastReferenceChild(recycler, state);
    }

    private View findReferenceChildClosestToStart(Recycler recycler, State state) {
        return this.mShouldReverseLayout ? findLastReferenceChild(recycler, state) : findFirstReferenceChild(recycler, state);
    }

    private int fixLayoutEndGap(int i, Recycler recycler, State state, boolean z) {
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i;
        if (endAfterPadding <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-endAfterPadding, recycler, state);
        i += i2;
        if (z) {
            int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i;
            if (endAfterPadding2 > 0) {
                this.mOrientationHelper.offsetChildren(endAfterPadding2);
                return endAfterPadding2 + i2;
            }
        }
        return i2;
    }

    private int fixLayoutStartGap(int i, Recycler recycler, State state, boolean z) {
        int startAfterPadding = i - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding <= 0) {
            return 0;
        }
        int i2 = -scrollBy(startAfterPadding, recycler, state);
        i += i2;
        if (z) {
            i -= this.mOrientationHelper.getStartAfterPadding();
            if (i > 0) {
                this.mOrientationHelper.offsetChildren(-i);
                i2 -= i;
            }
        }
        return i2;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(Recycler recycler, State state, int i, int i2) {
        Recycler recycler2 = recycler;
        State state2 = state;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            b bVar;
            List scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                ViewHolder viewHolder = (ViewHolder) scrapList.get(i5);
                if (!viewHolder.isRemoved()) {
                    int i6 = 1;
                    if ((viewHolder.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        i6 = -1;
                    }
                    if (i6 == -1) {
                        i3 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    } else {
                        i4 += this.mOrientationHelper.getDecoratedMeasurement(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.k = scrapList;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                bVar = this.mLayoutState;
                bVar.h = i3;
                bVar.c = 0;
                bVar.a(null);
                fill(recycler2, this.mLayoutState, state2, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                bVar = this.mLayoutState;
                bVar.h = i4;
                bVar.c = 0;
                bVar.a(null);
                fill(recycler2, this.mLayoutState, state2, false);
            }
            this.mLayoutState.k = null;
        }
    }

    private void logChildren() {
        String str = TAG;
        Log.d(str, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            StringBuilder stringBuilder = new StringBuilder("item ");
            stringBuilder.append(getPosition(childAt));
            stringBuilder.append(", coord:");
            stringBuilder.append(this.mOrientationHelper.getDecoratedStart(childAt));
            Log.d(str, stringBuilder.toString());
        }
        Log.d(str, "==============");
    }

    private void recycleByLayoutState(Recycler recycler, b bVar) {
        if (bVar.a && !bVar.l) {
            if (bVar.f == -1) {
                recycleViewsFromEnd(recycler, bVar.g);
                return;
            }
            recycleViewsFromStart(recycler, bVar.g);
        }
    }

    private void recycleChildren(Recycler recycler, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (i2--; i2 >= i; i2--) {
                    removeAndRecycleViewAt(i2, recycler);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        }
    }

    private void recycleViewsFromEnd(Recycler recycler, int i) {
        int childCount = getChildCount();
        if (i >= 0) {
            int end = this.mOrientationHelper.getEnd() - i;
            if (this.mShouldReverseLayout) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                        recycleChildren(recycler, 0, i2);
                        break;
                    }
                }
                return;
            }
            childCount--;
            for (i = childCount; i >= 0; i--) {
                View childAt2 = getChildAt(i);
                if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                    recycleChildren(recycler, childCount, i);
                    break;
                }
            }
        }
    }

    private void recycleViewsFromStart(Recycler recycler, int i) {
        if (i >= 0) {
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                childCount--;
                for (int i2 = childCount; i2 >= 0; i2--) {
                    View childAt = getChildAt(i2);
                    if (this.mOrientationHelper.getDecoratedEnd(childAt) > i || this.mOrientationHelper.getTransformedEndWithDecoration(childAt) > i) {
                        recycleChildren(recycler, childCount, i2);
                        break;
                    }
                }
                return;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (this.mOrientationHelper.getDecoratedEnd(childAt2) > i || this.mOrientationHelper.getTransformedEndWithDecoration(childAt2) > i) {
                    recycleChildren(recycler, 0, i3);
                    break;
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        boolean z = true;
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            z = this.mReverseLayout;
        } else if (this.mReverseLayout) {
            z = false;
        }
        this.mShouldReverseLayout = z;
    }

    private boolean updateAnchorFromChildren(Recycler recycler, State state, a aVar) {
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            LayoutParams layoutParams = (LayoutParams) focusedChild.getLayoutParams();
            Object obj = (layoutParams.isItemRemoved() || layoutParams.getViewLayoutPosition() < 0 || layoutParams.getViewLayoutPosition() >= state.getItemCount()) ? null : 1;
            if (obj != null) {
                aVar.a(focusedChild);
                return true;
            }
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        View findReferenceChildClosestToEnd = aVar.c ? findReferenceChildClosestToEnd(recycler, state) : findReferenceChildClosestToStart(recycler, state);
        if (findReferenceChildClosestToEnd == null) {
            return false;
        }
        aVar.b(findReferenceChildClosestToEnd);
        if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
            if (this.mOrientationHelper.getDecoratedStart(findReferenceChildClosestToEnd) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(findReferenceChildClosestToEnd) < this.mOrientationHelper.getStartAfterPadding()) {
                z = true;
            }
            if (z) {
                aVar.b = aVar.c ? this.mOrientationHelper.getEndAfterPadding() : this.mOrientationHelper.getStartAfterPadding();
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(State state, a aVar) {
        boolean z = false;
        if (!state.isPreLayout()) {
            int i = this.mPendingScrollPosition;
            if (i != -1) {
                if (i < 0 || i >= state.getItemCount()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                } else {
                    aVar.a = this.mPendingScrollPosition;
                    SavedState savedState = this.mPendingSavedState;
                    if (savedState != null && savedState.hasValidAnchor()) {
                        aVar.c = this.mPendingSavedState.mAnchorLayoutFromEnd;
                        aVar.b = aVar.c ? this.mOrientationHelper.getEndAfterPadding() - this.mPendingSavedState.mAnchorOffset : this.mOrientationHelper.getStartAfterPadding() + this.mPendingSavedState.mAnchorOffset;
                        return true;
                    } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                        View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                        if (findViewByPosition == null) {
                            if (getChildCount() > 0) {
                                if ((this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout) {
                                    z = true;
                                }
                                aVar.c = z;
                            }
                            aVar.b();
                        } else if (this.mOrientationHelper.getDecoratedMeasurement(findViewByPosition) > this.mOrientationHelper.getTotalSpace()) {
                            aVar.b();
                            return true;
                        } else if (this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding() < 0) {
                            aVar.b = this.mOrientationHelper.getStartAfterPadding();
                            aVar.c = false;
                            return true;
                        } else if (this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition) < 0) {
                            aVar.b = this.mOrientationHelper.getEndAfterPadding();
                            aVar.c = true;
                            return true;
                        } else {
                            aVar.b = aVar.c ? this.mOrientationHelper.getDecoratedEnd(findViewByPosition) + this.mOrientationHelper.getTotalSpaceChange() : this.mOrientationHelper.getDecoratedStart(findViewByPosition);
                        }
                        return true;
                    } else {
                        boolean z2 = this.mShouldReverseLayout;
                        aVar.c = z2;
                        aVar.b = z2 ? this.mOrientationHelper.getEndAfterPadding() - this.mPendingScrollPositionOffset : this.mOrientationHelper.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void updateAnchorInfoForLayout(Recycler recycler, State state, a aVar) {
        if (!updateAnchorFromPendingData(state, aVar) && !updateAnchorFromChildren(recycler, state, aVar)) {
            aVar.b();
            aVar.a = this.mStackFromEnd ? state.getItemCount() - 1 : 0;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, State state) {
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.h = getExtraLayoutSpace(state);
        b bVar = this.mLayoutState;
        bVar.f = i;
        int i3 = -1;
        View childClosestToEnd;
        if (i == 1) {
            bVar.h += this.mOrientationHelper.getEndPadding();
            childClosestToEnd = getChildClosestToEnd();
            bVar = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i3 = 1;
            }
            bVar.e = i3;
            this.mLayoutState.d = getPosition(childClosestToEnd) + this.mLayoutState.e;
            this.mLayoutState.b = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
            i = this.mOrientationHelper.getDecoratedEnd(childClosestToEnd) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            childClosestToEnd = getChildClosestToStart();
            bVar = this.mLayoutState;
            bVar.h += this.mOrientationHelper.getStartAfterPadding();
            bVar = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i3 = 1;
            }
            bVar.e = i3;
            this.mLayoutState.d = getPosition(childClosestToEnd) + this.mLayoutState.e;
            this.mLayoutState.b = this.mOrientationHelper.getDecoratedStart(childClosestToEnd);
            i = (-this.mOrientationHelper.getDecoratedStart(childClosestToEnd)) + this.mOrientationHelper.getStartAfterPadding();
        }
        bVar = this.mLayoutState;
        bVar.c = i2;
        if (z) {
            bVar.c -= i;
        }
        this.mLayoutState.g = i;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.getEndAfterPadding() - i2;
        this.mLayoutState.e = this.mShouldReverseLayout ? -1 : 1;
        b bVar = this.mLayoutState;
        bVar.d = i;
        bVar.f = 1;
        bVar.b = i2;
        bVar.g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.a, aVar.b);
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.getStartAfterPadding();
        b bVar = this.mLayoutState;
        bVar.d = i;
        bVar.e = this.mShouldReverseLayout ? 1 : -1;
        b bVar2 = this.mLayoutState;
        bVar2.f = -1;
        bVar2.b = i2;
        bVar2.g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.a, aVar.b);
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* Access modifiers changed, original: protected */
    public Pair<Integer, Integer> calculateExtraForStartEnd(int i) {
        int i2 = 0;
        if (this.mLayoutState.j >= 0) {
            i2 = i;
            i = 0;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, state);
            collectPrefetchPositionsForLayoutState(state, this.mLayoutState, layoutPrefetchRegistry);
        }
    }

    public void collectInitialPrefetchPositions(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        int i3 = -1;
        if (savedState == null || !savedState.hasValidAnchor()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = this.mPendingSavedState.mAnchorLayoutFromEnd;
            i2 = this.mPendingSavedState.mAnchorPosition;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            layoutPrefetchRegistry.addPosition(i2, 0);
            i2 += i3;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void collectPrefetchPositionsForLayoutState(State state, b bVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = bVar.d;
        if (i >= 0 && i < state.getItemCount()) {
            layoutPrefetchRegistry.addPosition(i, Math.max(0, bVar.g));
        }
    }

    public int computeHorizontalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(State state) {
        return computeScrollRange(state);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        return this.mOrientation == 0 ? new PointF((float) i2, MapboxConstants.MINIMUM_ZOOM) : new PointF(MapboxConstants.MINIMUM_ZOOM, (float) i2);
    }

    public int computeVerticalScrollExtent(State state) {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(State state) {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(State state) {
        return computeScrollRange(state);
    }

    /* Access modifiers changed, original: 0000 */
    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    /* Access modifiers changed, original: 0000 */
    public b createLayoutState() {
        return new b();
    }

    /* Access modifiers changed, original: 0000 */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
        if (this.mOrientationHelper == null) {
            this.mOrientationHelper = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int fill(Recycler recycler, b bVar, State state, boolean z) {
        int i = bVar.c;
        if (bVar.g != Integer.MIN_VALUE) {
            if (bVar.c < 0) {
                bVar.g += bVar.c;
            }
            recycleByLayoutState(recycler, bVar);
        }
        int i2 = bVar.c + bVar.h;
        LayoutChunkResult layoutChunkResult = this.mLayoutChunkResult;
        while (true) {
            if (!bVar.l && i2 <= 0) {
                break;
            }
            Object obj = (bVar.d < 0 || bVar.d >= state.getItemCount()) ? null : 1;
            if (obj == null) {
                break;
            }
            layoutChunkResult.resetInternal();
            layoutChunk(recycler, state, bVar, layoutChunkResult);
            if (!layoutChunkResult.mFinished) {
                bVar.b += layoutChunkResult.mConsumed * bVar.f;
                if (!(layoutChunkResult.mIgnoreConsumed && this.mLayoutState.k == null && state.isPreLayout())) {
                    bVar.c -= layoutChunkResult.mConsumed;
                    i2 -= layoutChunkResult.mConsumed;
                }
                if (bVar.g != Integer.MIN_VALUE) {
                    bVar.g += layoutChunkResult.mConsumed;
                    if (bVar.c < 0) {
                        bVar.g += bVar.c;
                    }
                    recycleByLayoutState(recycler, bVar);
                }
                if (z && layoutChunkResult.mFocusable) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - bVar.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        return findOneVisibleChild == null ? -1 : getPosition(findOneVisibleChild);
    }

    /* Access modifiers changed, original: 0000 */
    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        ensureLayoutState();
        Object obj = i2 > i ? 1 : i2 < i ? -1 : null;
        if (obj == null) {
            return getChildAt(i);
        }
        int i3;
        int i4;
        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i)) < this.mOrientationHelper.getStartAfterPadding()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).a(i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected */
    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.mOrientation == 0 ? this.mHorizontalBoundCheck : this.mVerticalBoundCheck).a(i, i2, i4, i3);
    }

    /* Access modifiers changed, original: 0000 */
    public View findReferenceChild(Recycler recycler, State state, int i, int i2, int i3) {
        ensureLayoutState();
        int startAfterPadding = this.mOrientationHelper.getStartAfterPadding();
        int endAfterPadding = this.mOrientationHelper.getEndAfterPadding();
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

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* Access modifiers changed, original: protected */
    public int getExtraLayoutSpace(State state) {
        return state.hasTargetScrollPosition() ? this.mOrientationHelper.getTotalSpace() : 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    /* Access modifiers changed, original: protected */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutChunk(Recycler recycler, State state, b bVar, LayoutChunkResult layoutChunkResult) {
        View view;
        if (bVar.k != null) {
            int size = bVar.k.size();
            for (int i = 0; i < size; i++) {
                view = ((ViewHolder) bVar.k.get(i)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && bVar.d == layoutParams.getViewLayoutPosition()) {
                    bVar.a(view);
                    break;
                }
            }
            view = null;
        } else {
            view = recycler.getViewForPosition(bVar.d);
            bVar.d += bVar.e;
        }
        if (view == null) {
            layoutChunkResult.mFinished = true;
            return;
        }
        int i2;
        int i3;
        int i4;
        int i5;
        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
        if (bVar.k == null) {
            if (this.mShouldReverseLayout == (bVar.f == -1)) {
                addView(view);
            } else {
                addView(view, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (bVar.f == -1)) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
        }
        measureChildWithMargins(view, 0, 0);
        layoutChunkResult.mConsumed = this.mOrientationHelper.getDecoratedMeasurement(view);
        int width;
        int decoratedMeasurementInOther;
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                width = getWidth() - getPaddingRight();
                decoratedMeasurementInOther = width - this.mOrientationHelper.getDecoratedMeasurementInOther(view);
            } else {
                decoratedMeasurementInOther = getPaddingLeft();
                width = this.mOrientationHelper.getDecoratedMeasurementInOther(view) + decoratedMeasurementInOther;
            }
            if (bVar.f == -1) {
                i2 = bVar.b - layoutChunkResult.mConsumed;
                i3 = width;
                i4 = decoratedMeasurementInOther;
                i5 = bVar.b;
            } else {
                i5 = bVar.b + layoutChunkResult.mConsumed;
                i3 = width;
                i4 = decoratedMeasurementInOther;
                i2 = bVar.b;
            }
        } else {
            width = getPaddingTop();
            decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(view) + width;
            if (bVar.f == -1) {
                i4 = bVar.b - layoutChunkResult.mConsumed;
                i2 = width;
                i5 = decoratedMeasurementInOther;
                i3 = bVar.b;
            } else {
                i3 = bVar.b + layoutChunkResult.mConsumed;
                i2 = width;
                i5 = decoratedMeasurementInOther;
                i4 = bVar.b;
            }
        }
        layoutDecoratedWithMargins(view, i4, i2, i3, i5);
        if (layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
            layoutChunkResult.mIgnoreConsumed = true;
        }
        layoutChunkResult.mFocusable = view.hasFocusable();
    }

    /* Access modifiers changed, original: 0000 */
    public void onAnchorReady(Recycler recycler, State state, a aVar, int i) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        resolveShouldLayoutReverse();
        if (getChildCount() == 0) {
            return null;
        }
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.getTotalSpace()) * MAX_SCROLL_FACTOR), false, state);
        b bVar = this.mLayoutState;
        bVar.g = Integer.MIN_VALUE;
        bVar.a = false;
        fill(recycler, bVar, state, true);
        View findPartiallyOrCompletelyInvisibleChildClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart(recycler, state) : findPartiallyOrCompletelyInvisibleChildClosestToEnd(recycler, state);
        view = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        return view.hasFocusable() ? findPartiallyOrCompletelyInvisibleChildClosestToStart == null ? null : view : findPartiallyOrCompletelyInvisibleChildClosestToStart;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        int i = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.hasValidAnchor()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.d || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.a();
            a aVar = this.mAnchorInfo;
            aVar.c = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, aVar);
            this.mAnchorInfo.d = true;
        } else if (focusedChild != null && (this.mOrientationHelper.getDecoratedStart(focusedChild) >= this.mOrientationHelper.getEndAfterPadding() || this.mOrientationHelper.getDecoratedEnd(focusedChild) <= this.mOrientationHelper.getStartAfterPadding())) {
            this.mAnchorInfo.a(focusedChild);
        }
        Pair calculateExtraForStartEnd = calculateExtraForStartEnd(getExtraLayoutSpace(state));
        int intValue = ((Integer) calculateExtraForStartEnd.first).intValue();
        intValue += this.mOrientationHelper.getStartAfterPadding();
        int intValue2 = ((Integer) calculateExtraForStartEnd.second).intValue() + this.mOrientationHelper.getEndPadding();
        if (state.isPreLayout()) {
            i2 = this.mPendingScrollPosition;
            if (!(i2 == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE)) {
                View findViewByPosition = findViewByPosition(i2);
                if (findViewByPosition != null) {
                    int endAfterPadding;
                    if (this.mShouldReverseLayout) {
                        endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(findViewByPosition);
                        i2 = this.mPendingScrollPositionOffset;
                    } else {
                        i2 = this.mOrientationHelper.getDecoratedStart(findViewByPosition) - this.mOrientationHelper.getStartAfterPadding();
                        endAfterPadding = this.mPendingScrollPositionOffset;
                    }
                    endAfterPadding -= i2;
                    if (endAfterPadding > 0) {
                        intValue += endAfterPadding;
                    } else {
                        intValue2 -= endAfterPadding;
                    }
                }
            }
        }
        if (this.mAnchorInfo.c ? this.mShouldReverseLayout : !this.mShouldReverseLayout) {
            i = 1;
        }
        onAnchorReady(recycler, state, this.mAnchorInfo, i);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.i = state.isPreLayout();
        b bVar;
        b bVar2;
        if (this.mAnchorInfo.c) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            bVar = this.mLayoutState;
            bVar.h = intValue;
            fill(recycler, bVar, state, false);
            i = this.mLayoutState.b;
            intValue = this.mLayoutState.d;
            if (this.mLayoutState.c > 0) {
                intValue2 += this.mLayoutState.c;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            bVar2 = this.mLayoutState;
            bVar2.h = intValue2;
            bVar2.d += this.mLayoutState.e;
            fill(recycler, this.mLayoutState, state, false);
            intValue2 = this.mLayoutState.b;
            if (this.mLayoutState.c > 0) {
                i2 = this.mLayoutState.c;
                updateLayoutStateToFillStart(intValue, i);
                bVar = this.mLayoutState;
                bVar.h = i2;
                fill(recycler, bVar, state, false);
                i = this.mLayoutState.b;
            }
            intValue = i;
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            bVar = this.mLayoutState;
            bVar.h = intValue2;
            fill(recycler, bVar, state, false);
            intValue2 = this.mLayoutState.b;
            i = this.mLayoutState.d;
            if (this.mLayoutState.c > 0) {
                intValue += this.mLayoutState.c;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            bVar2 = this.mLayoutState;
            bVar2.h = intValue;
            bVar2.d += this.mLayoutState.e;
            fill(recycler, this.mLayoutState, state, false);
            intValue = this.mLayoutState.b;
            if (this.mLayoutState.c > 0) {
                i2 = this.mLayoutState.c;
                updateLayoutStateToFillEnd(i, intValue2);
                b bVar3 = this.mLayoutState;
                bVar3.h = i2;
                fill(recycler, bVar3, state, false);
                intValue2 = this.mLayoutState.b;
            }
        }
        if (getChildCount() > 0) {
            if ((this.mShouldReverseLayout ^ this.mStackFromEnd) != 0) {
                i = fixLayoutEndGap(intValue2, recycler, state, true);
                intValue += i;
                intValue2 += i;
                i = fixLayoutStartGap(intValue, recycler, state, false);
            } else {
                i = fixLayoutStartGap(intValue, recycler, state, true);
                intValue += i;
                intValue2 += i;
                i = fixLayoutEndGap(intValue2, recycler, state, false);
            }
            intValue += i;
            intValue2 += i;
        }
        layoutForPredictiveAnimations(recycler, state, intValue, intValue2);
        if (state.isPreLayout()) {
            this.mAnchorInfo.a();
        } else {
            this.mOrientationHelper.onLayoutComplete();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.a();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            int i = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.mAnchorLayoutFromEnd = i;
            View childClosestToEnd;
            if (i != 0) {
                childClosestToEnd = getChildClosestToEnd();
                savedState.mAnchorOffset = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(childClosestToEnd);
                savedState.mAnchorPosition = getPosition(childClosestToEnd);
            } else {
                childClosestToEnd = getChildClosestToStart();
                savedState.mAnchorPosition = getPosition(childClosestToEnd);
                savedState.mAnchorOffset = this.mOrientationHelper.getDecoratedStart(childClosestToEnd) - this.mOrientationHelper.getStartAfterPadding();
            }
        } else {
            savedState.invalidateAnchor();
        }
        return savedState;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        i = getPosition(view);
        i2 = getPosition(view2);
        i = i < i2 ? 1 : -1;
        if (this.mShouldReverseLayout) {
            if (i == 1) {
                scrollToPositionWithOffset(i2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedStart(view2) + this.mOrientationHelper.getDecoratedMeasurement(view)));
            } else {
                scrollToPositionWithOffset(i2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
            }
        } else if (i == -1) {
            scrollToPositionWithOffset(i2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(i2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int scrollBy(int i, Recycler recycler, State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.a = true;
        ensureLayoutState();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, state);
        int fill = this.mLayoutState.g + fill(recycler, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.offsetChildren(-i);
        this.mLayoutState.j = i;
        return i;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        return this.mOrientation == 1 ? 0 : scrollBy(i, recycler, state);
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        return this.mOrientation == 0 ? 0 : scrollBy(i, recycler, state);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation) {
                this.mOrientation = i;
                this.mOrientationHelper = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:".concat(String.valueOf(i)));
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == AudioPlayer.INFINITY_LOOP_COUNT || getWidthMode() == AudioPlayer.INFINITY_LOOP_COUNT || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    /* Access modifiers changed, original: 0000 */
    public void validateChildOrder() {
        StringBuilder stringBuilder = new StringBuilder("validating child count ");
        stringBuilder.append(getChildCount());
        Log.d(TAG, stringBuilder.toString());
        if (getChildCount() > 0) {
            boolean z = false;
            int position = getPosition(getChildAt(0));
            int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
            String str = "detected invalid location";
            String str2 = "detected invalid position. loc invalid? ";
            int i;
            View childAt;
            int position2;
            int decoratedStart2;
            StringBuilder stringBuilder2;
            if (this.mShouldReverseLayout) {
                i = 1;
                while (i < getChildCount()) {
                    childAt = getChildAt(i);
                    position2 = getPosition(childAt);
                    decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                    if (position2 < position) {
                        logChildren();
                        stringBuilder2 = new StringBuilder(str2);
                        if (decoratedStart2 < decoratedStart) {
                            z = true;
                        }
                        stringBuilder2.append(z);
                        throw new RuntimeException(stringBuilder2.toString());
                    } else if (decoratedStart2 <= decoratedStart) {
                        i++;
                    } else {
                        logChildren();
                        throw new RuntimeException(str);
                    }
                }
                return;
            }
            i = 1;
            while (i < getChildCount()) {
                childAt = getChildAt(i);
                position2 = getPosition(childAt);
                decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    logChildren();
                    stringBuilder2 = new StringBuilder(str2);
                    if (decoratedStart2 < decoratedStart) {
                        z = true;
                    }
                    stringBuilder2.append(z);
                    throw new RuntimeException(stringBuilder2.toString());
                } else if (decoratedStart2 >= decoratedStart) {
                    i++;
                } else {
                    logChildren();
                    throw new RuntimeException(str);
                }
            }
        }
    }
}
