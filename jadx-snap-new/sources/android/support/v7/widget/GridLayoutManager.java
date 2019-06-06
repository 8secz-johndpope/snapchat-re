package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager.LayoutChunkResult;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.kk;
import defpackage.kk.b;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_SPAN_COUNT = -1;
    private static final String TAG = "GridLayoutManager";
    int[] mCachedBorders;
    final Rect mDecorInsets = new Rect();
    boolean mPendingSpanCountChange = false;
    final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
    final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
    View[] mSet;
    int mSpanCount = -1;
    SpanSizeLookup mSpanSizeLookup = new DefaultSpanSizeLookup();

    public static abstract class SpanSizeLookup {
        private boolean mCacheSpanIndices = false;
        final SparseIntArray mSpanIndexCache = new SparseIntArray();

        /* Access modifiers changed, original: 0000 */
        public int findReferenceIndexFromCache(int i) {
            int size = this.mSpanIndexCache.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.mSpanIndexCache.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            i2--;
            return (i2 < 0 || i2 >= this.mSpanIndexCache.size()) ? -1 : this.mSpanIndexCache.keyAt(i2);
        }

        /* Access modifiers changed, original: 0000 */
        public int getCachedSpanIndex(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            i2 = getSpanIndex(i, i2);
            this.mSpanIndexCache.put(i, i2);
            return i2;
        }

        public int getSpanGroupIndex(int i, int i2) {
            int spanSize = getSpanSize(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int spanSize2 = getSpanSize(i5);
                i3 += spanSize2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = spanSize2;
                }
            }
            return i3 + spanSize > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A:{RETURN} */
        public int getSpanIndex(int r6, int r7) {
            /*
            r5 = this;
            r0 = r5.getSpanSize(r6);
            r1 = 0;
            if (r0 != r7) goto L_0x0008;
        L_0x0007:
            return r1;
        L_0x0008:
            r2 = r5.mCacheSpanIndices;
            if (r2 == 0) goto L_0x0026;
        L_0x000c:
            r2 = r5.mSpanIndexCache;
            r2 = r2.size();
            if (r2 <= 0) goto L_0x0026;
        L_0x0014:
            r2 = r5.findReferenceIndexFromCache(r6);
            if (r2 < 0) goto L_0x0026;
        L_0x001a:
            r3 = r5.mSpanIndexCache;
            r3 = r3.get(r2);
            r4 = r5.getSpanSize(r2);
            r3 = r3 + r4;
            goto L_0x0036;
        L_0x0026:
            r2 = 0;
            r3 = 0;
        L_0x0028:
            if (r2 >= r6) goto L_0x0039;
        L_0x002a:
            r4 = r5.getSpanSize(r2);
            r3 = r3 + r4;
            if (r3 != r7) goto L_0x0033;
        L_0x0031:
            r3 = 0;
            goto L_0x0036;
        L_0x0033:
            if (r3 <= r7) goto L_0x0036;
        L_0x0035:
            r3 = r4;
        L_0x0036:
            r2 = r2 + 1;
            goto L_0x0028;
        L_0x0039:
            r0 = r0 + r3;
            if (r0 > r7) goto L_0x003d;
        L_0x003c:
            return r3;
        L_0x003d:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager$SpanSizeLookup.getSpanIndex(int, int):int");
        }

        public abstract int getSpanSize(int i);

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanIndexCacheEnabled(boolean z) {
            this.mCacheSpanIndices = z;
        }
    }

    public static final class DefaultSpanSizeLookup extends SpanSizeLookup {
        public final int getSpanIndex(int i, int i2) {
            return i % i2;
        }

        public final int getSpanSize(int i) {
            return 1;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        int mSpanIndex = -1;
        int mSpanSize = 0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        setSpanCount(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setSpanCount(LayoutManager.getProperties(context, attributeSet, i, i2).spanCount);
    }

    private void assignSpans(Recycler recycler, State state, int i, int i2, boolean z) {
        int i3;
        i2 = 0;
        int i4 = -1;
        if (z) {
            i4 = i;
            i = 0;
            i3 = 1;
        } else {
            i--;
            i3 = -1;
        }
        while (i != i4) {
            View view = this.mSet[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpanSize = getSpanSize(recycler, state, getPosition(view));
            layoutParams.mSpanIndex = i2;
            i2 += layoutParams.mSpanSize;
            i += i3;
        }
    }

    private void cachePreLayoutSpanMapping() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.mPreLayoutSpanSizeCache.put(viewLayoutPosition, layoutParams.getSpanSize());
            this.mPreLayoutSpanIndexCache.put(viewLayoutPosition, layoutParams.getSpanIndex());
        }
    }

    private void calculateItemBorders(int i) {
        this.mCachedBorders = calculateItemBorders(this.mCachedBorders, this.mSpanCount, i);
    }

    static int[] calculateItemBorders(int[] iArr, int i, int i2) {
        int i3 = 1;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        i2 %= i;
        int i6 = 0;
        while (i3 <= i) {
            int i7;
            i4 += i2;
            if (i4 <= 0 || i - i4 >= i2) {
                i7 = i5;
            } else {
                i7 = i5 + 1;
                i4 -= i;
            }
            i6 += i7;
            iArr[i3] = i6;
            i3++;
        }
        return iArr;
    }

    private void clearPreLayoutSpanMappingCache() {
        this.mPreLayoutSpanSizeCache.clear();
        this.mPreLayoutSpanIndexCache.clear();
    }

    private void ensureAnchorIsInCorrectSpan(Recycler recycler, State state, a aVar, int i) {
        Object obj = i == 1 ? 1 : null;
        int spanIndex = getSpanIndex(recycler, state, aVar.b);
        if (obj != null) {
            while (spanIndex > 0 && aVar.b > 0) {
                aVar.b--;
                spanIndex = getSpanIndex(recycler, state, aVar.b);
            }
            return;
        }
        i = state.getItemCount() - 1;
        int i2 = aVar.b;
        while (i2 < i) {
            int i3 = i2 + 1;
            int spanIndex2 = getSpanIndex(recycler, state, i3);
            if (spanIndex2 <= spanIndex) {
                break;
            }
            i2 = i3;
            spanIndex = spanIndex2;
        }
        aVar.b = i2;
    }

    private void ensureViewSet() {
        View[] viewArr = this.mSet;
        if (viewArr == null || viewArr.length != this.mSpanCount) {
            this.mSet = new View[this.mSpanCount];
        }
    }

    private int getSpanGroupIndex(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanGroupIndex(i, this.mSpanCount);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanGroupIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. ".concat(String.valueOf(i)));
        return 0;
    }

    private int getSpanIndex(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getCachedSpanIndex(i, this.mSpanCount);
        }
        int i2 = this.mPreLayoutSpanIndexCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getCachedSpanIndex(convertPreLayoutPositionToPostLayout, this.mSpanCount);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:".concat(String.valueOf(i)));
        return 0;
    }

    private int getSpanSize(Recycler recycler, State state, int i) {
        if (!state.isPreLayout()) {
            return this.mSpanSizeLookup.getSpanSize(i);
        }
        int i2 = this.mPreLayoutSpanSizeCache.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.mSpanSizeLookup.getSpanSize(convertPreLayoutPositionToPostLayout);
        }
        Log.w(TAG, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:".concat(String.valueOf(i)));
        return 1;
    }

    private void guessMeasurement(float f, int i) {
        calculateItemBorders(Math.max(Math.round(f * ((float) this.mSpanCount)), i));
    }

    private void measureChild(View view, int i, boolean z) {
        int childMeasureSpec;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i2 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
        int i3 = ((rect.left + rect.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
        int spaceForSpanRange = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.mOrientation == 1) {
            i = LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i3, layoutParams.width, false);
            childMeasureSpec = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getHeightMode(), i2, layoutParams.height, true);
        } else {
            i = LayoutManager.getChildMeasureSpec(spaceForSpanRange, i, i2, layoutParams.height, false);
            int childMeasureSpec2 = LayoutManager.getChildMeasureSpec(this.mOrientationHelper.getTotalSpace(), getWidthMode(), i3, layoutParams.width, true);
            childMeasureSpec = i;
            i = childMeasureSpec2;
        }
        measureChildWithDecorationsAndMargin(view, i, childMeasureSpec, z);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        android.support.v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void updateMeasurements() {
        int width;
        int paddingLeft;
        if (getOrientation() == 1) {
            width = getWidth() - getPaddingRight();
            paddingLeft = getPaddingLeft();
        } else {
            width = getHeight() - getPaddingBottom();
            paddingLeft = getPaddingTop();
        }
        calculateItemBorders(width - paddingLeft);
    }

    public boolean checkLayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* Access modifiers changed, original: 0000 */
    public void collectPrefetchPositionsForLayoutState(State state, b bVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.mSpanCount;
        for (int i2 = 0; i2 < this.mSpanCount && bVar.a(state) && i > 0; i2++) {
            int i3 = bVar.d;
            layoutPrefetchRegistry.addPosition(i3, Math.max(0, bVar.g));
            i -= this.mSpanSizeLookup.getSpanSize(i3);
            bVar.d += bVar.e;
        }
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
            if (position >= 0 && position < i3 && getSpanIndex(recycler, state, position) == 0) {
                if (((android.support.v7.widget.RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
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

    public android.support.v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getColumnCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 1 ? this.mSpanCount : state.getItemCount() <= 0 ? 0 : getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    public int getRowCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 0 ? this.mSpanCount : state.getItemCount() <= 0 ? 0 : getSpanGroupIndex(recycler, state, state.getItemCount() - 1) + 1;
    }

    /* Access modifiers changed, original: 0000 */
    public int getSpaceForSpanRange(int i, int i2) {
        int[] iArr;
        if (this.mOrientation == 1 && isLayoutRTL()) {
            iArr = this.mCachedBorders;
            int i3 = this.mSpanCount;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        iArr = this.mCachedBorders;
        return iArr[i2 + i] - iArr[i];
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    public SpanSizeLookup getSpanSizeLookup() {
        return this.mSpanSizeLookup;
    }

    /* Access modifiers changed, original: 0000 */
    public void layoutChunk(Recycler recycler, State state, b bVar, LayoutChunkResult layoutChunkResult) {
        int i;
        int spanSize;
        Recycler recycler2 = recycler;
        State state2 = state;
        b bVar2 = bVar;
        LayoutChunkResult layoutChunkResult2 = layoutChunkResult;
        int modeInOther = this.mOrientationHelper.getModeInOther();
        Object obj = modeInOther != AudioPlayer.INFINITY_LOOP_COUNT ? 1 : null;
        int i2 = getChildCount() > 0 ? this.mCachedBorders[this.mSpanCount] : 0;
        if (obj != null) {
            updateMeasurements();
        }
        boolean z = bVar2.e == 1;
        int i3 = this.mSpanCount;
        if (!z) {
            i3 = getSpanIndex(recycler2, state2, bVar2.d) + getSpanSize(recycler2, state2, bVar2.d);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.mSpanCount && bVar2.a(state2) && i3 > 0) {
            i = bVar2.d;
            spanSize = getSpanSize(recycler2, state2, i);
            if (spanSize <= this.mSpanCount) {
                i3 -= spanSize;
                if (i3 < 0) {
                    break;
                }
                View a = bVar2.a(recycler2);
                if (a == null) {
                    break;
                }
                i4 += spanSize;
                this.mSet[i5] = a;
                i5++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Item at position ");
                stringBuilder.append(i);
                stringBuilder.append(" requires ");
                stringBuilder.append(spanSize);
                stringBuilder.append(" spans but GridLayoutManager has only ");
                stringBuilder.append(this.mSpanCount);
                stringBuilder.append(" spans.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i5 == 0) {
            layoutChunkResult2.mFinished = true;
            return;
        }
        View view;
        int decoratedMeasurement;
        float f = MapboxConstants.MINIMUM_ZOOM;
        int i6 = i5;
        assignSpans(recycler, state, i5, i4, z);
        int i7 = 0;
        for (i3 = 0; i3 < i6; i3++) {
            boolean z2;
            view = this.mSet[i3];
            if (bVar2.k != null) {
                z2 = false;
                if (z) {
                    addDisappearingView(view);
                } else {
                    addDisappearingView(view, 0);
                }
            } else if (z) {
                addView(view);
                z2 = false;
            } else {
                z2 = false;
                addView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.mDecorInsets);
            measureChild(view, modeInOther, z2);
            i = this.mOrientationHelper.getDecoratedMeasurement(view);
            if (i > i7) {
                i7 = i;
            }
            float decoratedMeasurementInOther = (((float) this.mOrientationHelper.getDecoratedMeasurementInOther(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).mSpanSize);
            if (decoratedMeasurementInOther > f) {
                f = decoratedMeasurementInOther;
            }
        }
        if (obj != null) {
            guessMeasurement(f, i2);
            i7 = 0;
            for (i3 = 0; i3 < i6; i3++) {
                view = this.mSet[i3];
                measureChild(view, AudioPlayer.INFINITY_LOOP_COUNT, true);
                decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurement(view);
                if (decoratedMeasurement > i7) {
                    i7 = decoratedMeasurement;
                }
            }
        }
        for (i3 = 0; i3 < i6; i3++) {
            view = this.mSet[i3];
            if (this.mOrientationHelper.getDecoratedMeasurement(view) != i7) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                Rect rect = layoutParams.mDecorInsets;
                i5 = ((rect.top + rect.bottom) + layoutParams.topMargin) + layoutParams.bottomMargin;
                modeInOther = ((rect.left + rect.right) + layoutParams.leftMargin) + layoutParams.rightMargin;
                i4 = getSpaceForSpanRange(layoutParams.mSpanIndex, layoutParams.mSpanSize);
                if (this.mOrientation == 1) {
                    i = LayoutManager.getChildMeasureSpec(i4, AudioPlayer.INFINITY_LOOP_COUNT, modeInOther, layoutParams.width, false);
                    i4 = MeasureSpec.makeMeasureSpec(i7 - i5, AudioPlayer.INFINITY_LOOP_COUNT);
                } else {
                    modeInOther = MeasureSpec.makeMeasureSpec(i7 - modeInOther, AudioPlayer.INFINITY_LOOP_COUNT);
                    i4 = LayoutManager.getChildMeasureSpec(i4, AudioPlayer.INFINITY_LOOP_COUNT, i5, layoutParams.height, false);
                    i = modeInOther;
                }
                measureChildWithDecorationsAndMargin(view, i, i4, true);
            }
        }
        int i8 = 0;
        layoutChunkResult2.mConsumed = i7;
        if (this.mOrientation != 1) {
            if (bVar2.f == -1) {
                i3 = bVar2.b;
                i = i3 - i7;
            } else {
                i3 = bVar2.b;
                i = i3;
                i3 = i7 + i3;
            }
            i7 = 0;
            decoratedMeasurement = 0;
        } else if (bVar2.f == -1) {
            i3 = bVar2.b;
            i7 = i3 - i7;
            decoratedMeasurement = i3;
            i3 = 0;
            i = 0;
        } else {
            i3 = bVar2.b;
            decoratedMeasurement = i7 + i3;
            i = 0;
            i7 = i3;
            i3 = 0;
        }
        while (i8 < i6) {
            int i9;
            int decoratedMeasurementInOther2;
            View view2 = this.mSet[i8];
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (this.mOrientation != 1) {
                i7 = getPaddingTop() + this.mCachedBorders[layoutParams2.mSpanIndex];
                decoratedMeasurement = this.mOrientationHelper.getDecoratedMeasurementInOther(view2) + i7;
            } else if (isLayoutRTL()) {
                i3 = getPaddingLeft() + this.mCachedBorders[this.mSpanCount - layoutParams2.mSpanIndex];
                i = i3 - this.mOrientationHelper.getDecoratedMeasurementInOther(view2);
            } else {
                i3 = getPaddingLeft() + this.mCachedBorders[layoutParams2.mSpanIndex];
                spanSize = i3;
                i2 = i7;
                i9 = decoratedMeasurement;
                decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(view2) + i3;
                layoutDecoratedWithMargins(view2, spanSize, i2, decoratedMeasurementInOther2, i9);
                if (!layoutParams2.isItemRemoved() || layoutParams2.isItemChanged()) {
                    layoutChunkResult2.mIgnoreConsumed = true;
                }
                layoutChunkResult2.mFocusable |= view2.hasFocusable();
                i8++;
                i = spanSize;
                i7 = i2;
                i3 = decoratedMeasurementInOther2;
                decoratedMeasurement = i9;
            }
            decoratedMeasurementInOther2 = i3;
            i2 = i7;
            i9 = decoratedMeasurement;
            spanSize = i;
            layoutDecoratedWithMargins(view2, spanSize, i2, decoratedMeasurementInOther2, i9);
            if (layoutParams2.isItemRemoved()) {
            }
            layoutChunkResult2.mIgnoreConsumed = true;
            layoutChunkResult2.mFocusable |= view2.hasFocusable();
            i8++;
            i = spanSize;
            i7 = i2;
            i3 = decoratedMeasurementInOther2;
            decoratedMeasurement = i9;
        }
        Arrays.fill(this.mSet, null);
    }

    /* Access modifiers changed, original: 0000 */
    public void onAnchorReady(Recycler recycler, State state, a aVar, int i) {
        super.onAnchorReady(recycler, state, aVar, i);
        updateMeasurements();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            ensureAnchorIsInCorrectSpan(recycler, state, aVar, i);
        }
        ensureViewSet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARNING: Missing block: B:53:0x00d5, code skipped:
            if (r13 == (r2 > r8)) goto L_0x00b1;
     */
    /* JADX WARNING: Missing block: B:64:0x00f5, code skipped:
            if (r13 == r14) goto L_0x00b9;
     */
    public android.view.View onFocusSearchFailed(android.view.View r23, int r24, android.support.v7.widget.RecyclerView.Recycler r25, android.support.v7.widget.RecyclerView.State r26) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r25;
        r2 = r26;
        r3 = r22.findContainingItemView(r23);
        r4 = 0;
        if (r3 != 0) goto L_0x000e;
    L_0x000d:
        return r4;
    L_0x000e:
        r5 = r3.getLayoutParams();
        r5 = (android.support.v7.widget.GridLayoutManager.LayoutParams) r5;
        r6 = r5.mSpanIndex;
        r7 = r5.mSpanIndex;
        r5 = r5.mSpanSize;
        r7 = r7 + r5;
        r5 = super.onFocusSearchFailed(r23, r24, r25, r26);
        if (r5 != 0) goto L_0x0022;
    L_0x0021:
        return r4;
    L_0x0022:
        r5 = r24;
        r5 = r0.convertFocusDirectionToLayoutDirection(r5);
        r9 = 1;
        if (r5 != r9) goto L_0x002d;
    L_0x002b:
        r5 = 1;
        goto L_0x002e;
    L_0x002d:
        r5 = 0;
    L_0x002e:
        r10 = r0.mShouldReverseLayout;
        if (r5 == r10) goto L_0x0034;
    L_0x0032:
        r5 = 1;
        goto L_0x0035;
    L_0x0034:
        r5 = 0;
    L_0x0035:
        r10 = -1;
        if (r5 == 0) goto L_0x0040;
    L_0x0038:
        r5 = r22.getChildCount();
        r5 = r5 - r9;
        r11 = -1;
        r12 = -1;
        goto L_0x0047;
    L_0x0040:
        r5 = r22.getChildCount();
        r11 = r5;
        r5 = 0;
        r12 = 1;
    L_0x0047:
        r13 = r0.mOrientation;
        if (r13 != r9) goto L_0x0053;
    L_0x004b:
        r13 = r22.isLayoutRTL();
        if (r13 == 0) goto L_0x0053;
    L_0x0051:
        r13 = 1;
        goto L_0x0054;
    L_0x0053:
        r13 = 0;
    L_0x0054:
        r14 = r0.getSpanGroupIndex(r1, r2, r5);
        r10 = r4;
        r8 = -1;
        r15 = 0;
        r16 = 0;
        r17 = -1;
    L_0x005f:
        if (r5 == r11) goto L_0x0141;
    L_0x0061:
        r9 = r0.getSpanGroupIndex(r1, r2, r5);
        r1 = r0.getChildAt(r5);
        if (r1 == r3) goto L_0x0141;
    L_0x006b:
        r18 = r1.hasFocusable();
        if (r18 == 0) goto L_0x0085;
    L_0x0071:
        if (r9 == r14) goto L_0x0085;
    L_0x0073:
        if (r4 == 0) goto L_0x0077;
    L_0x0075:
        goto L_0x0141;
    L_0x0077:
        r18 = r3;
        r20 = r8;
        r19 = r11;
        r23 = r14;
        r8 = r16;
        r11 = r17;
        goto L_0x012d;
    L_0x0085:
        r9 = r1.getLayoutParams();
        r9 = (android.support.v7.widget.GridLayoutManager.LayoutParams) r9;
        r2 = r9.mSpanIndex;
        r18 = r3;
        r3 = r9.mSpanIndex;
        r19 = r11;
        r11 = r9.mSpanSize;
        r3 = r3 + r11;
        r11 = r1.hasFocusable();
        if (r11 == 0) goto L_0x00a1;
    L_0x009c:
        if (r2 != r6) goto L_0x00a1;
    L_0x009e:
        if (r3 != r7) goto L_0x00a1;
    L_0x00a0:
        return r1;
    L_0x00a1:
        r11 = r1.hasFocusable();
        if (r11 == 0) goto L_0x00a9;
    L_0x00a7:
        if (r4 == 0) goto L_0x00b1;
    L_0x00a9:
        r11 = r1.hasFocusable();
        if (r11 != 0) goto L_0x00bb;
    L_0x00af:
        if (r10 != 0) goto L_0x00bb;
    L_0x00b1:
        r20 = r8;
        r23 = r14;
        r8 = r16;
        r11 = r17;
    L_0x00b9:
        r14 = 1;
        goto L_0x0101;
    L_0x00bb:
        r11 = java.lang.Math.max(r2, r6);
        r20 = java.lang.Math.min(r3, r7);
        r11 = r20 - r11;
        r20 = r1.hasFocusable();
        if (r20 == 0) goto L_0x00d8;
    L_0x00cb:
        if (r11 <= r15) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00b1;
    L_0x00ce:
        if (r11 != r15) goto L_0x00f8;
    L_0x00d0:
        if (r2 <= r8) goto L_0x00d4;
    L_0x00d2:
        r11 = 1;
        goto L_0x00d5;
    L_0x00d4:
        r11 = 0;
    L_0x00d5:
        if (r13 != r11) goto L_0x00f8;
    L_0x00d7:
        goto L_0x00b1;
    L_0x00d8:
        if (r4 != 0) goto L_0x00f8;
    L_0x00da:
        r20 = r8;
        r23 = r14;
        r8 = 0;
        r14 = 1;
        r21 = r0.isViewPartiallyVisible(r1, r8, r14);
        if (r21 == 0) goto L_0x00fc;
    L_0x00e6:
        r8 = r16;
        if (r11 <= r8) goto L_0x00ed;
    L_0x00ea:
        r11 = r17;
        goto L_0x0101;
    L_0x00ed:
        if (r11 != r8) goto L_0x00fe;
    L_0x00ef:
        r11 = r17;
        if (r2 <= r11) goto L_0x00f4;
    L_0x00f3:
        goto L_0x00f5;
    L_0x00f4:
        r14 = 0;
    L_0x00f5:
        if (r13 != r14) goto L_0x0100;
    L_0x00f7:
        goto L_0x00b9;
    L_0x00f8:
        r20 = r8;
        r23 = r14;
    L_0x00fc:
        r8 = r16;
    L_0x00fe:
        r11 = r17;
    L_0x0100:
        r14 = 0;
    L_0x0101:
        if (r14 == 0) goto L_0x012d;
    L_0x0103:
        r14 = r1.hasFocusable();
        if (r14 == 0) goto L_0x011c;
    L_0x0109:
        r4 = r9.mSpanIndex;
        r3 = java.lang.Math.min(r3, r7);
        r2 = java.lang.Math.max(r2, r6);
        r3 = r3 - r2;
        r15 = r3;
        r16 = r8;
        r17 = r11;
        r8 = r4;
        r4 = r1;
        goto L_0x0133;
    L_0x011c:
        r8 = r9.mSpanIndex;
        r3 = java.lang.Math.min(r3, r7);
        r2 = java.lang.Math.max(r2, r6);
        r3 = r3 - r2;
        r10 = r1;
        r16 = r3;
        r17 = r8;
        goto L_0x0131;
    L_0x012d:
        r16 = r8;
        r17 = r11;
    L_0x0131:
        r8 = r20;
    L_0x0133:
        r5 = r5 + r12;
        r14 = r23;
        r1 = r25;
        r2 = r26;
        r3 = r18;
        r11 = r19;
        r9 = 1;
        goto L_0x005f;
    L_0x0141:
        if (r4 == 0) goto L_0x0144;
    L_0x0143:
        return r4;
    L_0x0144:
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):android.view.View");
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, kk kkVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            Object a;
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int spanGroupIndex = getSpanGroupIndex(recycler, state, layoutParams2.getViewLayoutPosition());
            boolean z = false;
            int spanIndex;
            int spanSize;
            if (this.mOrientation == 0) {
                spanIndex = layoutParams2.getSpanIndex();
                spanSize = layoutParams2.getSpanSize();
                if (this.mSpanCount > 1 && layoutParams2.getSpanSize() == this.mSpanCount) {
                    z = true;
                }
                a = b.a(spanIndex, spanSize, spanGroupIndex, 1, z);
            } else {
                spanIndex = layoutParams2.getSpanIndex();
                spanSize = layoutParams2.getSpanSize();
                if (this.mSpanCount > 1 && layoutParams2.getSpanSize() == this.mSpanCount) {
                    z = true;
                }
                a = b.a(spanGroupIndex, 1, spanIndex, spanSize, z);
            }
            kkVar.a(a);
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, kkVar);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.mSpanSizeLookup.invalidateSpanIndexCache();
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        if (state.isPreLayout()) {
            cachePreLayoutSpanMapping();
        }
        super.onLayoutChildren(recycler, state);
        clearPreLayoutSpanMappingCache();
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingSpanCountChange = false;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        updateMeasurements();
        ensureViewSet();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        if (this.mCachedBorders == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize = LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.mCachedBorders;
            i = LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i = LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.mCachedBorders;
            chooseSize = LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i, chooseSize);
    }

    public void setSpanCount(int i) {
        if (i != this.mSpanCount) {
            this.mPendingSpanCountChange = true;
            if (i > 0) {
                this.mSpanCount = i;
                this.mSpanSizeLookup.invalidateSpanIndexCache();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i)));
        }
    }

    public void setSpanSizeLookup(SpanSizeLookup spanSizeLookup) {
        this.mSpanSizeLookup = spanSizeLookup;
    }

    public void setStackFromEnd(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.mPendingSpanCountChange;
    }
}
