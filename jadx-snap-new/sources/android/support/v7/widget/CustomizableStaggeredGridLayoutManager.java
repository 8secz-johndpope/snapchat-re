package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import android.support.v7.widget.RecyclerView.LayoutManager.Properties;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.kk;
import defpackage.kk.b;
import defpackage.ok;
import defpackage.oq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class CustomizableStaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLayoutManager";
    public static final int VERTICAL = 1;
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private final Runnable mCheckForGapsRunnable;
    private int mFullSizeSpec;
    private int mGapStrategy = 2;
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private final ok mLayoutState;
    LazySpanLookup mLazySpanLookup = new LazySpanLookup();
    private int mOrientation;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition = -1;
    int mPendingScrollPositionOffset = Integer.MIN_VALUE;
    private int[] mPrefetchDistances;
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    boolean mReverseLayout = false;
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout = false;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount = -1;
    public Span[] mSpans;
    private final Rect mTmpRect = new Rect();

    public class AnchorInfo {
        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        int[] mSpanReferenceLines;
        boolean mValid;

        AnchorInfo() {
            reset();
        }

        /* Access modifiers changed, original: 0000 */
        public void assignCoordinateFromPadding() {
            this.mOffset = this.mLayoutFromEnd ? CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
        }

        /* Access modifiers changed, original: 0000 */
        public void assignCoordinateFromPadding(int i) {
            this.mOffset = this.mLayoutFromEnd ? CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - i : CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + i;
        }

        public int getOffset() {
            return this.mOffset;
        }

        public int getPosition() {
            return this.mPosition;
        }

        public int[] getSpanReferenceLines() {
            return this.mSpanReferenceLines;
        }

        /* Access modifiers changed, original: 0000 */
        public void reset() {
            this.mPosition = -1;
            this.mOffset = Integer.MIN_VALUE;
            this.mLayoutFromEnd = false;
            this.mInvalidateOffsets = false;
            this.mValid = false;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void saveSpanReferenceLines(Span[] spanArr) {
            int length = spanArr.length;
            int[] iArr = this.mSpanReferenceLines;
            if (iArr == null || iArr.length < length) {
                this.mSpanReferenceLines = new int[CustomizableStaggeredGridLayoutManager.this.mSpans.length];
            }
            for (int i = 0; i < length; i++) {
                this.mSpanReferenceLines[i] = spanArr[i].getStartLine(Integer.MIN_VALUE);
            }
        }

        public void setOffset(int i) {
            this.mOffset = i;
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        public void setSpanReferenceLines(int[] iArr) {
            this.mSpanReferenceLines = iArr;
        }
    }

    public static class LazySpanLookup {
        private static final int MIN_SIZE = 10;
        public int[] mData;
        List<a> mFullSpanItems;

        static class a implements Parcelable {
            public static final Creator<a> CREATOR = new Creator<a>() {
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new a[i];
                }
            };
            int a;
            int b;
            int[] c;
            boolean d;

            a() {
            }

            a(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.c = new int[readInt];
                    parcel.readIntArray(this.c);
                }
            }

            /* Access modifiers changed, original: final */
            public final int a(int i) {
                int[] iArr = this.c;
                return iArr == null ? 0 : iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder("FullSpanItem{mPosition=");
                stringBuilder.append(this.a);
                stringBuilder.append(", mGapDir=");
                stringBuilder.append(this.b);
                stringBuilder.append(", mHasUnwantedGapAfter=");
                stringBuilder.append(this.d);
                stringBuilder.append(", mGapPerSpan=");
                stringBuilder.append(Arrays.toString(this.c));
                stringBuilder.append('}');
                return stringBuilder.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.c);
            }
        }

        private int invalidateFullSpansAfter(int i) {
            if (this.mFullSpanItems == null) {
                return -1;
            }
            a fullSpanItem = getFullSpanItem(i);
            if (fullSpanItem != null) {
                this.mFullSpanItems.remove(fullSpanItem);
            }
            int size = this.mFullSpanItems.size();
            int i2 = 0;
            while (i2 < size) {
                if (((a) this.mFullSpanItems.get(i2)).a >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return -1;
            }
            a aVar = (a) this.mFullSpanItems.get(i2);
            this.mFullSpanItems.remove(i2);
            return aVar.a;
        }

        private void offsetFullSpansForAddition(int i, int i2) {
            List list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.mFullSpanItems.get(size);
                    if (aVar.a >= i) {
                        aVar.a += i2;
                    }
                }
            }
        }

        private void offsetFullSpansForRemoval(int i, int i2) {
            List list = this.mFullSpanItems;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.mFullSpanItems.get(size);
                    if (aVar.a >= i) {
                        if (aVar.a < i3) {
                            this.mFullSpanItems.remove(size);
                        } else {
                            aVar.a -= i2;
                        }
                    }
                }
            }
        }

        public void addFullSpanItem(a aVar) {
            if (this.mFullSpanItems == null) {
                this.mFullSpanItems = new ArrayList();
            }
            int size = this.mFullSpanItems.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = (a) this.mFullSpanItems.get(i);
                if (aVar2.a == aVar.a) {
                    this.mFullSpanItems.remove(i);
                }
                if (aVar2.a >= aVar.a) {
                    this.mFullSpanItems.add(i, aVar);
                    return;
                }
            }
            this.mFullSpanItems.add(aVar);
        }

        /* Access modifiers changed, original: 0000 */
        public void clear() {
            int[] iArr = this.mData;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mFullSpanItems = null;
        }

        public void ensureSize(int i) {
            int[] iArr = this.mData;
            if (iArr == null) {
                this.mData = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.mData, -1);
                return;
            }
            if (i >= iArr.length) {
                this.mData = new int[sizeForPosition(i)];
                System.arraycopy(iArr, 0, this.mData, 0, iArr.length);
                int[] iArr2 = this.mData;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public int forceInvalidateAfter(int i) {
            List list = this.mFullSpanItems;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.mFullSpanItems.get(size)).a >= i) {
                        this.mFullSpanItems.remove(size);
                    }
                }
            }
            return invalidateAfter(i);
        }

        public a getFirstFullSpanItemInRange(int i, int i2, int i3, boolean z) {
            List list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) this.mFullSpanItems.get(i4);
                if (aVar.a >= i2) {
                    return null;
                }
                if (aVar.a >= i && (i3 == 0 || aVar.b == i3 || (z && aVar.d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a getFullSpanItem(int i) {
            List list = this.mFullSpanItems;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.mFullSpanItems.get(size);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public int getSpan(int i, LayoutParams layoutParams) {
            int[] iArr = this.mData;
            return (iArr == null || i >= iArr.length) ? -1 : iArr[i];
        }

        /* Access modifiers changed, original: 0000 */
        public int invalidateAfter(int i) {
            int[] iArr = this.mData;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int invalidateFullSpansAfter = invalidateFullSpansAfter(i);
            if (invalidateFullSpansAfter == -1) {
                iArr = this.mData;
                Arrays.fill(iArr, i, iArr.length, -1);
                return this.mData.length;
            }
            invalidateFullSpansAfter++;
            Arrays.fill(this.mData, i, invalidateFullSpansAfter, -1);
            return invalidateFullSpansAfter;
        }

        /* Access modifiers changed, original: 0000 */
        public void offsetForAddition(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                ensureSize(i3);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.mData, i, i3, -1);
                offsetFullSpansForAddition(i, i2);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void offsetForRemoval(int i, int i2) {
            int[] iArr = this.mData;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                ensureSize(i3);
                int[] iArr2 = this.mData;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                iArr = this.mData;
                Arrays.fill(iArr, iArr.length - i2, iArr.length, -1);
                offsetFullSpansForRemoval(i, i2);
            }
        }

        public void setSpan(int i, Span span) {
            ensureSize(i);
            this.mData[i] = span.mIndex;
        }

        /* Access modifiers changed, original: 0000 */
        public int sizeForPosition(int i) {
            int length = this.mData.length;
            while (length <= i) {
                length <<= 1;
            }
            return length;
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
        int mAnchorPosition;
        List<a> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            this.mSpanOffsetsSize = parcel.readInt();
            int i = this.mSpanOffsetsSize;
            if (i > 0) {
                this.mSpanOffsets = new int[i];
                parcel.readIntArray(this.mSpanOffsets);
            }
            this.mSpanLookupSize = parcel.readInt();
            i = this.mSpanLookupSize;
            if (i > 0) {
                this.mSpanLookup = new int[i];
                parcel.readIntArray(this.mSpanLookup);
            }
            boolean z = false;
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.mLastLayoutRTL = z;
            this.mFullSpanItems = parcel.readArrayList(a.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }

        public int describeContents() {
            return 0;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout);
            parcel.writeInt(this.mAnchorLayoutFromEnd);
            parcel.writeInt(this.mLastLayoutRTL);
            parcel.writeList(this.mFullSpanItems);
        }
    }

    public class Span {
        public static final int INVALID_LINE = Integer.MIN_VALUE;
        int mCachedEnd = Integer.MIN_VALUE;
        int mCachedStart = Integer.MIN_VALUE;
        int mDeletedSize = 0;
        final int mIndex;
        ArrayList<View> mViews = new ArrayList();

        Span(int i) {
            this.mIndex = i;
        }

        /* Access modifiers changed, original: 0000 */
        public void appendToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(view);
            this.mCachedEnd = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void cacheReferenceLineAndClear(boolean z, int i) {
            int endLine = z ? getEndLine(Integer.MIN_VALUE) : getStartLine(Integer.MIN_VALUE);
            clear();
            if (endLine != Integer.MIN_VALUE) {
                if ((!z || endLine >= CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding()) && (z || endLine <= CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding())) {
                    if (i != Integer.MIN_VALUE) {
                        endLine += i;
                    }
                    this.mCachedEnd = endLine;
                    this.mCachedStart = endLine;
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void calculateCachedEnd() {
            ArrayList arrayList = this.mViews;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedEnd = CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan) {
                a fullSpanItem = CustomizableStaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition());
                if (fullSpanItem != null && fullSpanItem.b == 1) {
                    this.mCachedEnd += fullSpanItem.a(this.mIndex);
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void calculateCachedStart() {
            View view = (View) this.mViews.get(0);
            LayoutParams layoutParams = getLayoutParams(view);
            this.mCachedStart = CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan) {
                a fullSpanItem = CustomizableStaggeredGridLayoutManager.this.mLazySpanLookup.getFullSpanItem(layoutParams.getViewLayoutPosition());
                if (fullSpanItem != null && fullSpanItem.b == -1) {
                    this.mCachedStart -= fullSpanItem.a(this.mIndex);
                }
            }
        }

        public void clear() {
            this.mViews.clear();
            invalidateCache();
            this.mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition() {
            int size;
            int i;
            if (CustomizableStaggeredGridLayoutManager.this.mReverseLayout) {
                size = this.mViews.size() - 1;
                i = -1;
            } else {
                size = 0;
                i = this.mViews.size();
            }
            return findOneVisibleChild(size, i, true);
        }

        public int findFirstPartiallyVisibleItemPosition() {
            int size;
            int i;
            if (CustomizableStaggeredGridLayoutManager.this.mReverseLayout) {
                size = this.mViews.size() - 1;
                i = -1;
            } else {
                size = 0;
                i = this.mViews.size();
            }
            return findOnePartiallyVisibleChild(size, i, true);
        }

        public int findFirstVisibleItemPosition() {
            return CustomizableStaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(this.mViews.size() - 1, -1, false) : findOneVisibleChild(0, this.mViews.size(), false);
        }

        public int findLastCompletelyVisibleItemPosition() {
            int i;
            int size;
            if (CustomizableStaggeredGridLayoutManager.this.mReverseLayout) {
                i = 0;
                size = this.mViews.size();
            } else {
                i = this.mViews.size() - 1;
                size = -1;
            }
            return findOneVisibleChild(i, size, true);
        }

        public int findLastPartiallyVisibleItemPosition() {
            int i;
            int size;
            if (CustomizableStaggeredGridLayoutManager.this.mReverseLayout) {
                i = 0;
                size = this.mViews.size();
            } else {
                i = this.mViews.size() - 1;
                size = -1;
            }
            return findOnePartiallyVisibleChild(i, size, true);
        }

        public int findLastVisibleItemPosition() {
            return CustomizableStaggeredGridLayoutManager.this.mReverseLayout ? findOneVisibleChild(0, this.mViews.size(), false) : findOneVisibleChild(this.mViews.size() - 1, -1, false);
        }

        /* Access modifiers changed, original: 0000 */
        public int findOnePartiallyOrCompletelyVisibleChild(int i, int i2, boolean z, boolean z2, boolean z3) {
            int startAfterPadding = CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.mViews.get(i);
                int decoratedStart = CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
                Object obj = null;
                Object obj2 = (z3 ? decoratedStart > endAfterPadding : decoratedStart >= endAfterPadding) ? null : 1;
                if (z3 ? decoratedEnd < startAfterPadding : decoratedEnd <= startAfterPadding) {
                    obj = 1;
                }
                if (!(obj2 == null || obj == null)) {
                    if (z && z2) {
                        if (decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                        }
                    } else if (!z2 && decoratedStart >= startAfterPadding && decoratedEnd <= endAfterPadding) {
                    }
                    return CustomizableStaggeredGridLayoutManager.this.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        /* Access modifiers changed, original: 0000 */
        public int findOnePartiallyVisibleChild(int i, int i2, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i, i2, false, false, z);
        }

        /* Access modifiers changed, original: 0000 */
        public int findOneVisibleChild(int i, int i2, boolean z) {
            return findOnePartiallyOrCompletelyVisibleChild(i, i2, z, true, false);
        }

        public int getDeletedSize() {
            return this.mDeletedSize;
        }

        /* Access modifiers changed, original: 0000 */
        public int getEndLine() {
            int i = this.mCachedEnd;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        /* Access modifiers changed, original: 0000 */
        public int getEndLine(int i) {
            int i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedEnd();
            return this.mCachedEnd;
        }

        public View getFocusableViewAfter(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                i2 = this.mViews.size() - 1;
                while (i2 >= 0) {
                    View view2 = (View) this.mViews.get(i2);
                    if ((CustomizableStaggeredGridLayoutManager.this.mReverseLayout && CustomizableStaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!CustomizableStaggeredGridLayoutManager.this.mReverseLayout && CustomizableStaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i2--;
                    view = view2;
                }
            } else {
                i2 = this.mViews.size();
                int i3 = 0;
                while (i3 < i2) {
                    View view3 = (View) this.mViews.get(i3);
                    if ((CustomizableStaggeredGridLayoutManager.this.mReverseLayout && CustomizableStaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!CustomizableStaggeredGridLayoutManager.this.mReverseLayout && CustomizableStaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public int getIndex() {
            return this.mIndex;
        }

        /* Access modifiers changed, original: 0000 */
        public LayoutParams getLayoutParams(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* Access modifiers changed, original: 0000 */
        public int getStartLine() {
            int i = this.mCachedStart;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            if (this.mViews.isEmpty()) {
                return this.mCachedStart;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        /* Access modifiers changed, original: 0000 */
        public int getStartLine(int i) {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.mViews.size() == 0) {
                return i;
            }
            calculateCachedStart();
            return this.mCachedStart;
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidateCache() {
            this.mCachedStart = Integer.MIN_VALUE;
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: 0000 */
        public void onOffset(int i) {
            int i2 = this.mCachedStart;
            if (i2 != Integer.MIN_VALUE) {
                this.mCachedStart = i2 + i;
            }
            i2 = this.mCachedEnd;
            if (i2 != Integer.MIN_VALUE) {
                this.mCachedEnd = i2 + i;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void popEnd() {
            int size = this.mViews.size();
            View view = (View) this.mViews.remove(size - 1);
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.mCachedStart = Integer.MIN_VALUE;
            }
            this.mCachedEnd = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: 0000 */
        public void popStart() {
            View view = (View) this.mViews.remove(0);
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = null;
            if (this.mViews.size() == 0) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize -= CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            this.mCachedStart = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: 0000 */
        public void prependToSpan(View view) {
            LayoutParams layoutParams = getLayoutParams(view);
            layoutParams.mSpan = this;
            this.mViews.add(0, view);
            this.mCachedStart = Integer.MIN_VALUE;
            if (this.mViews.size() == 1) {
                this.mCachedEnd = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.mDeletedSize += CustomizableStaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        public void setLine(int i) {
            this.mCachedStart = i;
            this.mCachedEnd = i;
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        boolean mIsHeader;
        Span mSpan;

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

        public boolean getIssHeader() {
            return this.mIsHeader;
        }

        public final int getSpanIndex() {
            Span span = this.mSpan;
            return span == null ? -1 : span.mIndex;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }

        public void setIsHeader(boolean z) {
            this.mIsHeader = z;
        }
    }

    public CustomizableStaggeredGridLayoutManager(int i, int i2) {
        boolean z = true;
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = new Runnable() {
            public final void run() {
                CustomizableStaggeredGridLayoutManager.this.checkForGaps();
            }
        };
        this.mOrientation = i2;
        setSpanCount(i);
        if (this.mGapStrategy == 0) {
            z = false;
        }
        setAutoMeasureEnabled(z);
        this.mLayoutState = new ok();
        createOrientationHelpers();
    }

    public CustomizableStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = true;
        this.mSmoothScrollbarEnabled = true;
        this.mCheckForGapsRunnable = /* anonymous class already generated */;
        Properties properties = LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        if (this.mGapStrategy == 0) {
            z = false;
        }
        setAutoMeasureEnabled(z);
        this.mLayoutState = new ok();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].appendToSpan(view);
        }
    }

    private void applyPendingSavedState(AnchorInfo anchorInfo) {
        boolean z;
        if (this.mPendingSavedState.mSpanOffsetsSize > 0) {
            if (this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount) {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].clear();
                    int i2 = this.mPendingSavedState.mSpanOffsets[i];
                    if (i2 != Integer.MIN_VALUE) {
                        i2 += this.mPendingSavedState.mAnchorLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                    }
                    this.mSpans[i].setLine(i2);
                }
            } else {
                this.mPendingSavedState.invalidateSpanInfo();
                SavedState savedState = this.mPendingSavedState;
                savedState.mAnchorPosition = savedState.mVisibleAnchorPosition;
            }
        }
        this.mLastLayoutRTL = this.mPendingSavedState.mLastLayoutRTL;
        setReverseLayout(this.mPendingSavedState.mReverseLayout);
        resolveShouldLayoutReverse();
        if (this.mPendingSavedState.mAnchorPosition != -1) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
            z = this.mPendingSavedState.mAnchorLayoutFromEnd;
        } else {
            z = this.mShouldReverseLayout;
        }
        anchorInfo.mLayoutFromEnd = z;
        if (this.mPendingSavedState.mSpanLookupSize > 1) {
            this.mLazySpanLookup.mData = this.mPendingSavedState.mSpanLookup;
            this.mLazySpanLookup.mFullSpanItems = this.mPendingSavedState.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, ok okVar) {
        if (okVar.e == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
            } else {
                layoutParams.mSpan.appendToSpan(view);
            }
        } else if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.prependToSpan(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        } else {
            return (i < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
        }
    }

    private boolean checkSpanForGap(Span span) {
        return this.mShouldReverseLayout ? span.getEndLine() < this.mPrimaryOrientation.getEndAfterPadding() && !span.getLayoutParams((View) span.mViews.get(span.mViews.size() - 1)).mFullSpan : span.getStartLine() > this.mPrimaryOrientation.getStartAfterPadding() && !span.getLayoutParams((View) span.mViews.get(0)).mFullSpan;
    }

    private int computeScrollExtent(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return oq.a(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return oq.a(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        return oq.b(state, this.mPrimaryOrientation, findFirstVisibleItemClosestToStart(this.mSmoothScrollbarEnabled ^ 1), findFirstVisibleItemClosestToEnd(this.mSmoothScrollbarEnabled ^ 1), this, this.mSmoothScrollbarEnabled);
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private a createFullSpanItemFromEnd(int i) {
        a aVar = new a();
        aVar.c = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            aVar.c[i2] = i - this.mSpans[i2].getEndLine(i);
        }
        return aVar;
    }

    private a createFullSpanItemFromStart(int i) {
        a aVar = new a();
        aVar.c = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            aVar.c[i2] = this.mSpans[i2].getStartLine(i) - i;
        }
        return aVar;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    private int fill(Recycler recycler, ok okVar, State state) {
        int i;
        int span;
        Recycler recycler2 = recycler;
        ok okVar2 = okVar;
        int i2 = 0;
        this.mRemainingSpans.set(0, this.mSpanCount, true);
        if (this.mLayoutState.i) {
            i = okVar2.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = okVar2.e == 1 ? okVar2.g + okVar2.b : okVar2.f - okVar2.b;
        }
        updateAllRemainingSpans(okVar2.e, i);
        int endAfterPadding = this.mShouldReverseLayout ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
        Object obj = null;
        while (okVar.a(state) && (this.mLayoutState.i || !this.mRemainingSpans.isEmpty())) {
            Span nextSpan;
            int decoratedMeasurement;
            int i3;
            int decoratedMeasurement2;
            CustomizableStaggeredGridLayoutManager customizableStaggeredGridLayoutManager;
            View view;
            int i4;
            View a = okVar2.a(recycler2);
            LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            span = this.mLazySpanLookup.getSpan(viewLayoutPosition, layoutParams);
            Object obj2 = span == -1 ? 1 : null;
            if (obj2 != null) {
                nextSpan = layoutParams.mFullSpan ? this.mSpans[i2] : getNextSpan(okVar2);
                this.mLazySpanLookup.setSpan(viewLayoutPosition, nextSpan);
            } else {
                nextSpan = this.mSpans[span];
            }
            Span span2 = nextSpan;
            layoutParams.mSpan = span2;
            if (okVar2.e == 1) {
                addView(a);
            } else {
                addView(a, i2);
            }
            measureChildWithDecorationsAndMargin(a, layoutParams, i2);
            a createFullSpanItemFromEnd;
            if (okVar2.e == 1) {
                span = layoutParams.mFullSpan ? getMaxEnd(endAfterPadding) : span2.getEndLine(endAfterPadding);
                decoratedMeasurement = this.mPrimaryOrientation.getDecoratedMeasurement(a) + span;
                if (obj2 != null && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromEnd(span);
                    createFullSpanItemFromEnd.b = -1;
                    createFullSpanItemFromEnd.a = viewLayoutPosition;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i3 = decoratedMeasurement;
                decoratedMeasurement = span;
            } else {
                span = layoutParams.mFullSpan ? getMinStart(endAfterPadding) : span2.getStartLine(endAfterPadding);
                decoratedMeasurement = span - this.mPrimaryOrientation.getDecoratedMeasurement(a);
                if (obj2 != null && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromStart(span);
                    createFullSpanItemFromEnd.b = 1;
                    createFullSpanItemFromEnd.a = viewLayoutPosition;
                    this.mLazySpanLookup.addFullSpanItem(createFullSpanItemFromEnd);
                }
                i3 = span;
            }
            if (layoutParams.mFullSpan && okVar2.d == -1) {
                if (obj2 == null) {
                    if (((okVar2.e == 1 ? areAllEndsEqual() : areAllStartsEqual()) ^ 1) != 0) {
                        a fullSpanItem = this.mLazySpanLookup.getFullSpanItem(viewLayoutPosition);
                        if (fullSpanItem != null) {
                            fullSpanItem.d = true;
                        }
                    }
                }
                this.mLaidOutInvalidFullSpan = true;
            }
            attachViewToSpans(a, layoutParams, okVar2);
            if (isLayoutRTL() && this.mOrientation == 1) {
                viewLayoutPosition = layoutParams.mFullSpan ? this.mSecondaryOrientation.getEndAfterPadding() : this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - span2.mIndex) * this.mSizePerSpan);
                i2 = viewLayoutPosition;
                decoratedMeasurement2 = viewLayoutPosition - this.mSecondaryOrientation.getDecoratedMeasurement(a);
            } else {
                viewLayoutPosition = layoutParams.mFullSpan ? this.mSecondaryOrientation.getStartAfterPadding() : (span2.mIndex * this.mSizePerSpan) + this.mSecondaryOrientation.getStartAfterPadding();
                decoratedMeasurement2 = viewLayoutPosition;
                i2 = this.mSecondaryOrientation.getDecoratedMeasurement(a) + viewLayoutPosition;
            }
            if (this.mOrientation == 1) {
                customizableStaggeredGridLayoutManager = this;
                view = a;
                i4 = decoratedMeasurement2;
                decoratedMeasurement2 = decoratedMeasurement;
                decoratedMeasurement = i2;
            } else {
                customizableStaggeredGridLayoutManager = this;
                view = a;
                i4 = decoratedMeasurement;
                decoratedMeasurement = i3;
                i3 = i2;
            }
            customizableStaggeredGridLayoutManager.layoutDecoratedWithMargins(view, i4, decoratedMeasurement2, decoratedMeasurement, i3);
            if (layoutParams.mFullSpan) {
                updateAllRemainingSpans(this.mLayoutState.e, i);
            } else {
                updateRemainingSpans(span2, this.mLayoutState.e, i);
            }
            recycle(recycler2, this.mLayoutState);
            if (this.mLayoutState.h && a.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    this.mRemainingSpans.clear();
                } else {
                    this.mRemainingSpans.set(span2.mIndex, false);
                }
            }
            obj = 1;
            i2 = 0;
        }
        if (obj == null) {
            recycle(recycler2, this.mLayoutState);
        }
        span = this.mLayoutState.e == -1 ? this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding()) : getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        return span > 0 ? Math.min(okVar2.b, span) : 0;
    }

    private int findFirstReferenceChildPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private int findLastReferenceChildPosition(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    private void fixEndGap(Recycler recycler, State state, boolean z) {
        int maxEnd = getMaxEnd(Integer.MIN_VALUE);
        if (maxEnd != Integer.MIN_VALUE) {
            int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - maxEnd;
            if (endAfterPadding > 0) {
                endAfterPadding -= -scrollBy(-endAfterPadding, recycler, state);
                if (z && endAfterPadding > 0) {
                    this.mPrimaryOrientation.offsetChildren(endAfterPadding);
                }
            }
        }
    }

    private void fixStartGap(Recycler recycler, State state, boolean z) {
        int minStart = getMinStart(Integer.MAX_VALUE);
        if (minStart != Integer.MAX_VALUE) {
            minStart -= this.mPrimaryOrientation.getStartAfterPadding();
            if (minStart > 0) {
                minStart -= scrollBy(minStart, recycler, state);
                if (z && minStart > 0) {
                    this.mPrimaryOrientation.offsetChildren(-minStart);
                }
            }
        }
    }

    private int getMaxEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 > endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMaxStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 > startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private int getMinEnd(int i) {
        int endLine = this.mSpans[0].getEndLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int endLine2 = this.mSpans[i2].getEndLine(i);
            if (endLine2 < endLine) {
                endLine = endLine2;
            }
        }
        return endLine;
    }

    private int getMinStart(int i) {
        int startLine = this.mSpans[0].getStartLine(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int startLine2 = this.mSpans[i2].getStartLine(i);
            if (startLine2 < startLine) {
                startLine = startLine2;
            }
        }
        return startLine;
    }

    private Span getNextSpan(ok okVar) {
        int i;
        int i2;
        int i3 = -1;
        if (preferLastSpan(okVar.e)) {
            i = this.mSpanCount - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.mSpanCount;
            i2 = 1;
        }
        Span span = null;
        int i4;
        int startAfterPadding;
        Span span2;
        int endLine;
        if (okVar.e == 1) {
            i4 = Integer.MAX_VALUE;
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            while (i != i3) {
                span2 = this.mSpans[i];
                endLine = span2.getEndLine(startAfterPadding);
                if (endLine < i4) {
                    span = span2;
                    i4 = endLine;
                }
                i += i2;
            }
            return span;
        }
        i4 = Integer.MIN_VALUE;
        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        while (i != i3) {
            span2 = this.mSpans[i];
            endLine = span2.getStartLine(startAfterPadding);
            if (endLine > i4) {
                span = span2;
                i4 = endLine;
            }
            i += i2;
        }
        return span;
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.mTmpRect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        i = updateSpecWithExtra(i, layoutParams.leftMargin + this.mTmpRect.left, layoutParams.rightMargin + this.mTmpRect.right);
        i2 = updateSpecWithExtra(i2, layoutParams.topMargin + this.mTmpRect.top, layoutParams.bottomMargin + this.mTmpRect.bottom);
        if (z ? shouldReMeasureChild(view, i, i2, layoutParams) : shouldMeasureChild(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.mFullSpan) {
            if (this.mOrientation == 1) {
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), 0, layoutParams.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutParams.width, true), this.mFullSizeSpec, z);
            }
        } else if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, layoutParams.width, false), LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), 0, layoutParams.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), 0, layoutParams.width, true), LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    /* JADX WARNING: Missing block: B:85:0x0157, code skipped:
            if (checkForGaps() != false) goto L_0x015b;
     */
    private void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler r9, android.support.v7.widget.RecyclerView.State r10, boolean r11) {
        /*
        r8 = this;
        r0 = 0;
    L_0x0001:
        r1 = r8.mAnchorInfo;
        r2 = r8.mPendingSavedState;
        r3 = -1;
        if (r2 != 0) goto L_0x000c;
    L_0x0008:
        r2 = r8.mPendingScrollPosition;
        if (r2 == r3) goto L_0x0019;
    L_0x000c:
        r2 = r10.getItemCount();
        if (r2 != 0) goto L_0x0019;
    L_0x0012:
        r8.removeAndRecycleAllViews(r9);
        r1.reset();
        return;
    L_0x0019:
        r2 = r1.mValid;
        r4 = 1;
        if (r2 == 0) goto L_0x0029;
    L_0x001e:
        r2 = r8.mPendingScrollPosition;
        if (r2 != r3) goto L_0x0029;
    L_0x0022:
        r2 = r8.mPendingSavedState;
        if (r2 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r2 = 0;
        goto L_0x002a;
    L_0x0029:
        r2 = 1;
    L_0x002a:
        if (r2 == 0) goto L_0x0043;
    L_0x002c:
        r1.reset();
        r5 = r8.mPendingSavedState;
        if (r5 == 0) goto L_0x0037;
    L_0x0033:
        r8.applyPendingSavedState(r1);
        goto L_0x003e;
    L_0x0037:
        r8.resolveShouldLayoutReverse();
        r5 = r8.mShouldReverseLayout;
        r1.mLayoutFromEnd = r5;
    L_0x003e:
        r8.updateAnchorInfoForLayout(r10, r1);
        r1.mValid = r4;
    L_0x0043:
        r5 = r8.mPendingSavedState;
        if (r5 != 0) goto L_0x0060;
    L_0x0047:
        r5 = r8.mPendingScrollPosition;
        if (r5 != r3) goto L_0x0060;
    L_0x004b:
        r5 = r1.mLayoutFromEnd;
        r6 = r8.mLastLayoutFromEnd;
        if (r5 != r6) goto L_0x0059;
    L_0x0051:
        r5 = r8.isLayoutRTL();
        r6 = r8.mLastLayoutRTL;
        if (r5 == r6) goto L_0x0060;
    L_0x0059:
        r5 = r8.mLazySpanLookup;
        r5.clear();
        r1.mInvalidateOffsets = r4;
    L_0x0060:
        r5 = r8.getChildCount();
        if (r5 <= 0) goto L_0x00d1;
    L_0x0066:
        r5 = r8.mPendingSavedState;
        if (r5 == 0) goto L_0x006e;
    L_0x006a:
        r5 = r5.mSpanOffsetsSize;
        if (r5 > 0) goto L_0x00d1;
    L_0x006e:
        r5 = r1.mInvalidateOffsets;
        if (r5 == 0) goto L_0x0096;
    L_0x0072:
        r2 = 0;
    L_0x0073:
        r5 = r8.mSpanCount;
        if (r2 >= r5) goto L_0x0090;
    L_0x0077:
        r5 = r8.mSpans;
        r5 = r5[r2];
        r5.clear();
        r5 = r1.mOffset;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r5 == r6) goto L_0x008d;
    L_0x0084:
        r5 = r8.mSpans;
        r5 = r5[r2];
        r6 = r1.mOffset;
        r5.setLine(r6);
    L_0x008d:
        r2 = r2 + 1;
        goto L_0x0073;
    L_0x0090:
        r2 = r8.mAnchorInfo;
        r8.overrideAnchorAndSpanBeforeFill(r2);
        goto L_0x00d1;
    L_0x0096:
        if (r2 != 0) goto L_0x00b7;
    L_0x0098:
        r2 = r8.mAnchorInfo;
        r2 = r2.mSpanReferenceLines;
        if (r2 != 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00b7;
    L_0x009f:
        r2 = 0;
    L_0x00a0:
        r5 = r8.mSpanCount;
        if (r2 >= r5) goto L_0x00d1;
    L_0x00a4:
        r5 = r8.mSpans;
        r5 = r5[r2];
        r5.clear();
        r6 = r8.mAnchorInfo;
        r6 = r6.mSpanReferenceLines;
        r6 = r6[r2];
        r5.setLine(r6);
        r2 = r2 + 1;
        goto L_0x00a0;
    L_0x00b7:
        r2 = 0;
    L_0x00b8:
        r5 = r8.mSpanCount;
        if (r2 >= r5) goto L_0x00ca;
    L_0x00bc:
        r5 = r8.mSpans;
        r5 = r5[r2];
        r6 = r8.mShouldReverseLayout;
        r7 = r1.mOffset;
        r5.cacheReferenceLineAndClear(r6, r7);
        r2 = r2 + 1;
        goto L_0x00b8;
    L_0x00ca:
        r2 = r8.mAnchorInfo;
        r5 = r8.mSpans;
        r2.saveSpanReferenceLines(r5);
    L_0x00d1:
        r8.detachAndScrapAttachedViews(r9);
        r2 = r8.mLayoutState;
        r2.a = r0;
        r8.mLaidOutInvalidFullSpan = r0;
        r2 = r8.mSecondaryOrientation;
        r2 = r2.getTotalSpace();
        r8.updateMeasureSpecs(r2);
        r2 = r1.mPosition;
        r8.updateLayoutState(r2, r10);
        r2 = r1.mLayoutFromEnd;
        if (r2 == 0) goto L_0x00f8;
    L_0x00ec:
        r8.setLayoutStateDirection(r3);
        r2 = r8.mLayoutState;
        r8.fill(r9, r2, r10);
        r8.setLayoutStateDirection(r4);
        goto L_0x0103;
    L_0x00f8:
        r8.setLayoutStateDirection(r4);
        r2 = r8.mLayoutState;
        r8.fill(r9, r2, r10);
        r8.setLayoutStateDirection(r3);
    L_0x0103:
        r2 = r8.mLayoutState;
        r3 = r1.mPosition;
        r5 = r8.mLayoutState;
        r5 = r5.d;
        r3 = r3 + r5;
        r2.c = r3;
        r2 = r8.mLayoutState;
        r8.fill(r9, r2, r10);
        r8.repositionToWrapContentIfNecessary();
        r2 = r8.getChildCount();
        if (r2 <= 0) goto L_0x012d;
    L_0x011c:
        r2 = r8.mShouldReverseLayout;
        if (r2 == 0) goto L_0x0127;
    L_0x0120:
        r8.fixEndGap(r9, r10, r4);
        r8.fixStartGap(r9, r10, r0);
        goto L_0x012d;
    L_0x0127:
        r8.fixStartGap(r9, r10, r4);
        r8.fixEndGap(r9, r10, r0);
    L_0x012d:
        if (r11 == 0) goto L_0x015a;
    L_0x012f:
        r11 = r10.isPreLayout();
        if (r11 != 0) goto L_0x015a;
    L_0x0135:
        r11 = r8.mGapStrategy;
        if (r11 == 0) goto L_0x014b;
    L_0x0139:
        r11 = r8.getChildCount();
        if (r11 <= 0) goto L_0x014b;
    L_0x013f:
        r11 = r8.mLaidOutInvalidFullSpan;
        if (r11 != 0) goto L_0x0149;
    L_0x0143:
        r11 = r8.hasGapsToFix();
        if (r11 == 0) goto L_0x014b;
    L_0x0149:
        r11 = 1;
        goto L_0x014c;
    L_0x014b:
        r11 = 0;
    L_0x014c:
        if (r11 == 0) goto L_0x015a;
    L_0x014e:
        r11 = r8.mCheckForGapsRunnable;
        r8.removeCallbacks(r11);
        r11 = r8.checkForGaps();
        if (r11 == 0) goto L_0x015a;
    L_0x0159:
        goto L_0x015b;
    L_0x015a:
        r4 = 0;
    L_0x015b:
        r11 = r10.isPreLayout();
        if (r11 == 0) goto L_0x0166;
    L_0x0161:
        r11 = r8.mAnchorInfo;
        r11.reset();
    L_0x0166:
        r11 = r1.mLayoutFromEnd;
        r8.mLastLayoutFromEnd = r11;
        r11 = r8.isLayoutRTL();
        r8.mLastLayoutRTL = r11;
        if (r4 == 0) goto L_0x017a;
    L_0x0172:
        r11 = r8.mAnchorInfo;
        r11.reset();
        r11 = 0;
        goto L_0x0001;
    L_0x017a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, boolean):void");
    }

    private boolean preferLastSpan(int i) {
        if (this.mOrientation == 0) {
            return (i == -1) != this.mShouldReverseLayout;
        } else {
            return ((i == -1) == this.mShouldReverseLayout) == isLayoutRTL();
        }
    }

    private void prependViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].prependToSpan(view);
        }
    }

    private void recycle(Recycler recycler, ok okVar) {
        if (okVar.a && !okVar.i) {
            int maxStart;
            if (okVar.b == 0) {
                if (okVar.e == -1) {
                    recycleFromEnd(recycler, okVar.g);
                } else {
                    recycleFromStart(recycler, okVar.f);
                }
            } else if (okVar.e == -1) {
                maxStart = okVar.f - getMaxStart(okVar.f);
                recycleFromEnd(recycler, maxStart < 0 ? okVar.g : okVar.g - Math.min(maxStart, okVar.b));
            } else {
                maxStart = getMinEnd(okVar.g) - okVar.g;
                recycleFromStart(recycler, maxStart < 0 ? okVar.f : Math.min(maxStart, okVar.b) + okVar.f);
            }
        }
    }

    private void recycleFromEnd(Recycler recycler, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.mPrimaryOrientation.getDecoratedStart(childAt) < i || this.mPrimaryOrientation.getTransformedStartWithDecoration(childAt) < i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mFullSpan) {
                int i2 = 0;
                while (i2 < this.mSpanCount) {
                    if (this.mSpans[i2].mViews.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    this.mSpans[i3].popEnd();
                }
            } else if (layoutParams.mSpan.mViews.size() != 1) {
                layoutParams.mSpan.popEnd();
            } else {
                return;
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private void recycleFromStart(Recycler recycler, int i) {
        while (getChildCount() > 0) {
            int i2 = 0;
            View childAt = getChildAt(0);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > i || this.mPrimaryOrientation.getTransformedEndWithDecoration(childAt) > i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.mFullSpan) {
                int i3 = 0;
                while (i3 < this.mSpanCount) {
                    if (this.mSpans[i3].mViews.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                while (i2 < this.mSpanCount) {
                    this.mSpans[i2].popStart();
                    i2++;
                }
            } else if (layoutParams.mSpan.mViews.size() != 1) {
                layoutParams.mSpan.popStart();
            } else {
                return;
            }
            removeAndRecycleView(childAt, recycler);
        }
    }

    private void repositionToWrapContentIfNecessary() {
        if (this.mSecondaryOrientation.getMode() != AudioPlayer.INFINITY_LOOP_COUNT) {
            int i;
            int childCount = getChildCount();
            float f = MapboxConstants.MINIMUM_ZOOM;
            for (i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                float decoratedMeasurement = (float) this.mSecondaryOrientation.getDecoratedMeasurement(childAt);
                if (decoratedMeasurement >= f) {
                    if (((LayoutParams) childAt.getLayoutParams()).isFullSpan()) {
                        decoratedMeasurement /= (float) this.mSpanCount;
                    }
                    f = Math.max(f, decoratedMeasurement);
                }
            }
            i = this.mSizePerSpan;
            int round = Math.round(f * ((float) this.mSpanCount));
            if (this.mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
                round = Math.min(round, this.mSecondaryOrientation.getTotalSpace());
            }
            updateMeasureSpecs(round);
            if (this.mSizePerSpan != i) {
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt2 = getChildAt(i2);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (!layoutParams.mFullSpan) {
                        int i3;
                        int i4;
                        if (isLayoutRTL() && this.mOrientation == 1) {
                            i3 = (-((this.mSpanCount - 1) - layoutParams.mSpan.mIndex)) * this.mSizePerSpan;
                            i4 = (-((this.mSpanCount - 1) - layoutParams.mSpan.mIndex)) * i;
                        } else {
                            i3 = layoutParams.mSpan.mIndex * this.mSizePerSpan;
                            i4 = layoutParams.mSpan.mIndex * i;
                            if (this.mOrientation != 1) {
                                childAt2.offsetTopAndBottom(i3 - i4);
                            }
                        }
                        childAt2.offsetLeftAndRight(i3 - i4);
                    }
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

    private void setLayoutStateDirection(int i) {
        ok okVar = this.mLayoutState;
        okVar.e = i;
        int i2 = 1;
        if (this.mShouldReverseLayout != (i == -1)) {
            i2 = -1;
        }
        okVar.d = i2;
    }

    private void updateAllRemainingSpans(int i, int i2) {
        for (int i3 = 0; i3 < this.mSpanCount; i3++) {
            if (!this.mSpans[i3].mViews.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private boolean updateAnchorFromChildren(State state, AnchorInfo anchorInfo) {
        anchorInfo.mPosition = this.mLastLayoutFromEnd ? findLastReferenceChildPosition(state.getItemCount()) : findFirstReferenceChildPosition(state.getItemCount());
        anchorInfo.mOffset = Integer.MIN_VALUE;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    private void updateLayoutState(int r5, android.support.v7.widget.RecyclerView.State r6) {
        /*
        r4 = this;
        r0 = r4.mLayoutState;
        r1 = 0;
        r0.b = r1;
        r0.c = r5;
        r0 = r4.isSmoothScrolling();
        r2 = 1;
        if (r0 == 0) goto L_0x002e;
    L_0x000e:
        r6 = r6.getTargetScrollPosition();
        r0 = -1;
        if (r6 == r0) goto L_0x002e;
    L_0x0015:
        r0 = r4.mShouldReverseLayout;
        if (r6 >= r5) goto L_0x001b;
    L_0x0019:
        r5 = 1;
        goto L_0x001c;
    L_0x001b:
        r5 = 0;
    L_0x001c:
        if (r0 != r5) goto L_0x0025;
    L_0x001e:
        r5 = r4.mPrimaryOrientation;
        r5 = r5.getTotalSpace();
        goto L_0x002f;
    L_0x0025:
        r5 = r4.mPrimaryOrientation;
        r5 = r5.getTotalSpace();
        r6 = r5;
        r5 = 0;
        goto L_0x0030;
    L_0x002e:
        r5 = 0;
    L_0x002f:
        r6 = 0;
    L_0x0030:
        r0 = r4.getClipToPadding();
        if (r0 == 0) goto L_0x004d;
    L_0x0036:
        r0 = r4.mLayoutState;
        r3 = r4.mPrimaryOrientation;
        r3 = r3.getStartAfterPadding();
        r3 = r3 - r6;
        r0.f = r3;
        r6 = r4.mLayoutState;
        r0 = r4.mPrimaryOrientation;
        r0 = r0.getEndAfterPadding();
        r0 = r0 + r5;
        r6.g = r0;
        goto L_0x005d;
    L_0x004d:
        r0 = r4.mLayoutState;
        r3 = r4.mPrimaryOrientation;
        r3 = r3.getEnd();
        r3 = r3 + r5;
        r0.g = r3;
        r5 = r4.mLayoutState;
        r6 = -r6;
        r5.f = r6;
    L_0x005d:
        r5 = r4.mLayoutState;
        r5.h = r1;
        r5.a = r2;
        r6 = r4.mPrimaryOrientation;
        r6 = r6.getMode();
        if (r6 != 0) goto L_0x0074;
    L_0x006b:
        r6 = r4.mPrimaryOrientation;
        r6 = r6.getEnd();
        if (r6 != 0) goto L_0x0074;
    L_0x0073:
        r1 = 1;
    L_0x0074:
        r5.i = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.updateLayoutState(int, android.support.v7.widget.RecyclerView$State):void");
    }

    private void updateRemainingSpans(Span span, int i, int i2) {
        int deletedSize = span.getDeletedSize();
        if (i == -1) {
            if (span.getStartLine() + deletedSize <= i2) {
                this.mRemainingSpans.set(span.mIndex, false);
            }
            return;
        }
        if (span.getEndLine() - deletedSize >= i2) {
            this.mRemainingSpans.set(span.mIndex, false);
        }
    }

    private int updateSpecWithExtra(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == AudioPlayer.INFINITY_LOOP_COUNT) ? MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean areAllEndsEqual() {
        int endLine = this.mSpans[0].getEndLine(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].getEndLine(Integer.MIN_VALUE) != endLine) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean areAllStartsEqual() {
        int startLine = this.mSpans[0].getStartLine(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].getStartLine(Integer.MIN_VALUE) != startLine) {
                return false;
            }
        }
        return true;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean checkForGaps() {
        if (getChildCount() == 0 || this.mGapStrategy == 0 || !isAttachedToWindow()) {
            return false;
        }
        int lastChildPosition;
        int firstChildPosition;
        if (this.mShouldReverseLayout) {
            lastChildPosition = getLastChildPosition();
            firstChildPosition = getFirstChildPosition();
        } else {
            lastChildPosition = getFirstChildPosition();
            firstChildPosition = getLastChildPosition();
        }
        if (lastChildPosition == 0 && hasGapsToFix() != null) {
            this.mLazySpanLookup.clear();
        } else if (!this.mLaidOutInvalidFullSpan) {
            return false;
        } else {
            int i = this.mShouldReverseLayout ? -1 : 1;
            firstChildPosition++;
            a firstFullSpanItemInRange = this.mLazySpanLookup.getFirstFullSpanItemInRange(lastChildPosition, firstChildPosition, i, true);
            if (firstFullSpanItemInRange == null) {
                this.mLaidOutInvalidFullSpan = false;
                this.mLazySpanLookup.forceInvalidateAfter(firstChildPosition);
                return false;
            }
            a firstFullSpanItemInRange2 = this.mLazySpanLookup.getFirstFullSpanItemInRange(lastChildPosition, firstFullSpanItemInRange.a, -i, true);
            if (firstFullSpanItemInRange2 == null) {
                this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange.a);
            } else {
                this.mLazySpanLookup.forceInvalidateAfter(firstFullSpanItemInRange2.a + 1);
            }
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public boolean checkLayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, State state, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            prepareLayoutStateForDelta(i, state);
            int[] iArr = this.mPrefetchDistances;
            if (iArr == null || iArr.length < this.mSpanCount) {
                this.mPrefetchDistances = new int[this.mSpanCount];
            }
            i = 0;
            int i3 = 0;
            for (i2 = 0; i2 < this.mSpanCount; i2++) {
                int i4;
                int startLine;
                if (this.mLayoutState.d == -1) {
                    i4 = this.mLayoutState.f;
                    startLine = this.mSpans[i2].getStartLine(this.mLayoutState.f);
                } else {
                    i4 = this.mSpans[i2].getEndLine(this.mLayoutState.g);
                    startLine = this.mLayoutState.g;
                }
                i4 -= startLine;
                if (i4 >= 0) {
                    this.mPrefetchDistances[i3] = i4;
                    i3++;
                }
            }
            Arrays.sort(this.mPrefetchDistances, 0, i3);
            while (i < i3 && this.mLayoutState.a(state)) {
                layoutPrefetchRegistry.addPosition(this.mLayoutState.c, this.mPrefetchDistances[i]);
                ok okVar = this.mLayoutState;
                okVar.c += this.mLayoutState.d;
                i++;
            }
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
        i = calculateScrollDirectionForPosition(i);
        PointF pointF = new PointF();
        if (i == 0) {
            return null;
        }
        if (this.mOrientation == 0) {
            pointF.x = (float) i;
            pointF.y = MapboxConstants.MINIMUM_ZOOM;
        } else {
            pointF.x = MapboxConstants.MINIMUM_ZOOM;
            pointF.y = (float) i;
        }
        return pointF;
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003e in {1, 7, 8, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public int[] findFirstCompletelyVisibleItemPositions(int[] r4) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0007;
        r4 = r3.mSpanCount;
        r4 = new int[r4];
        goto L_0x000c;
        r0 = r4.length;
        r1 = r3.mSpanCount;
        if (r0 < r1) goto L_0x001f;
        r0 = 0;
        r1 = r3.mSpanCount;
        if (r0 >= r1) goto L_0x001e;
        r1 = r3.mSpans;
        r1 = r1[r0];
        r1 = r1.findFirstCompletelyVisibleItemPosition();
        r4[r0] = r1;
        r0 = r0 + 1;
        goto L_0x000d;
        return r4;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r3.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r4 = r4.length;
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(int[]):int[]");
    }

    /* Access modifiers changed, original: 0000 */
    public View findFirstVisibleItemClosestToEnd(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            int decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(childAt);
            if (decoratedEnd > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedEnd <= endAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* Access modifiers changed, original: 0000 */
    public View findFirstVisibleItemClosestToStart(boolean z) {
        int startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
        int endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int decoratedStart = this.mPrimaryOrientation.getDecoratedStart(childAt);
            if (this.mPrimaryOrientation.getDecoratedEnd(childAt) > startAfterPadding && decoratedStart < endAfterPadding) {
                if (decoratedStart >= startAfterPadding || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* Access modifiers changed, original: 0000 */
    public int findFirstVisibleItemPositionInt() {
        View findFirstVisibleItemClosestToEnd = this.mShouldReverseLayout ? findFirstVisibleItemClosestToEnd(true) : findFirstVisibleItemClosestToStart(true);
        return findFirstVisibleItemClosestToEnd == null ? -1 : getPosition(findFirstVisibleItemClosestToEnd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003e in {1, 7, 8, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public int[] findFirstVisibleItemPositions(int[] r4) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0007;
        r4 = r3.mSpanCount;
        r4 = new int[r4];
        goto L_0x000c;
        r0 = r4.length;
        r1 = r3.mSpanCount;
        if (r0 < r1) goto L_0x001f;
        r0 = 0;
        r1 = r3.mSpanCount;
        if (r0 >= r1) goto L_0x001e;
        r1 = r3.mSpans;
        r1 = r1[r0];
        r1 = r1.findFirstVisibleItemPosition();
        r4[r0] = r1;
        r0 = r0 + 1;
        goto L_0x000d;
        return r4;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r3.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r4 = r4.length;
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.findFirstVisibleItemPositions(int[]):int[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003e in {1, 7, 8, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public int[] findLastCompletelyVisibleItemPositions(int[] r4) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0007;
        r4 = r3.mSpanCount;
        r4 = new int[r4];
        goto L_0x000c;
        r0 = r4.length;
        r1 = r3.mSpanCount;
        if (r0 < r1) goto L_0x001f;
        r0 = 0;
        r1 = r3.mSpanCount;
        if (r0 >= r1) goto L_0x001e;
        r1 = r3.mSpans;
        r1 = r1[r0];
        r1 = r1.findLastCompletelyVisibleItemPosition();
        r4[r0] = r1;
        r0 = r0 + 1;
        goto L_0x000d;
        return r4;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r3.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r4 = r4.length;
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(int[]):int[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x003e in {1, 7, 8, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public int[] findLastVisibleItemPositions(int[] r4) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0007;
        r4 = r3.mSpanCount;
        r4 = new int[r4];
        goto L_0x000c;
        r0 = r4.length;
        r1 = r3.mSpanCount;
        if (r0 < r1) goto L_0x001f;
        r0 = 0;
        r1 = r3.mSpanCount;
        if (r0 >= r1) goto L_0x001e;
        r1 = r3.mSpans;
        r1 = r1[r0];
        r1 = r1.findLastVisibleItemPosition();
        r4[r0] = r1;
        r0 = r0 + 1;
        goto L_0x000d;
        return r4;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r3.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r4 = r4.length;
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.findLastVisibleItemPositions(int[]):int[]");
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
        return this.mOrientation == 1 ? this.mSpanCount : super.getColumnCountForAccessibility(recycler, state);
    }

    /* Access modifiers changed, original: 0000 */
    public int getFirstChildPosition() {
        return getChildCount() == 0 ? 0 : getPosition(getChildAt(0));
    }

    public int getGapStrategy() {
        return this.mGapStrategy;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLastChildPosition() {
        int childCount = getChildCount();
        return childCount == 0 ? 0 : getPosition(getChildAt(childCount - 1));
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public int getRowCountForAccessibility(Recycler recycler, State state) {
        return this.mOrientation == 0 ? this.mSpanCount : super.getRowCountForAccessibility(recycler, state);
    }

    public int getSpanCount() {
        return this.mSpanCount;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A:{RETURN} */
    public void handleUpdate(int r7, int r8, int r9) {
        /*
        r6 = this;
        r0 = r6.mShouldReverseLayout;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r6.getLastChildPosition();
        goto L_0x000d;
    L_0x0009:
        r0 = r6.getFirstChildPosition();
    L_0x000d:
        r1 = 8;
        if (r9 != r1) goto L_0x001b;
    L_0x0011:
        if (r7 >= r8) goto L_0x0016;
    L_0x0013:
        r2 = r8 + 1;
        goto L_0x001d;
    L_0x0016:
        r2 = r7 + 1;
        r3 = r2;
        r2 = r8;
        goto L_0x001f;
    L_0x001b:
        r2 = r7 + r8;
    L_0x001d:
        r3 = r2;
        r2 = r7;
    L_0x001f:
        r4 = r6.mLazySpanLookup;
        r4.invalidateAfter(r2);
        r4 = 1;
        if (r9 == r4) goto L_0x003e;
    L_0x0027:
        r5 = 2;
        if (r9 == r5) goto L_0x0038;
    L_0x002a:
        if (r9 == r1) goto L_0x002d;
    L_0x002c:
        goto L_0x0043;
    L_0x002d:
        r9 = r6.mLazySpanLookup;
        r9.offsetForRemoval(r7, r4);
        r7 = r6.mLazySpanLookup;
        r7.offsetForAddition(r8, r4);
        goto L_0x0043;
    L_0x0038:
        r9 = r6.mLazySpanLookup;
        r9.offsetForRemoval(r7, r8);
        goto L_0x0043;
    L_0x003e:
        r9 = r6.mLazySpanLookup;
        r9.offsetForAddition(r7, r8);
    L_0x0043:
        if (r3 > r0) goto L_0x0046;
    L_0x0045:
        return;
    L_0x0046:
        r7 = r6.mShouldReverseLayout;
        if (r7 == 0) goto L_0x004f;
    L_0x004a:
        r7 = r6.getFirstChildPosition();
        goto L_0x0053;
    L_0x004f:
        r7 = r6.getLastChildPosition();
    L_0x0053:
        if (r2 > r7) goto L_0x0058;
    L_0x0055:
        r6.requestLayout();
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.handleUpdate(int, int, int):void");
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:28:0x0073, code skipped:
            if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:32:0x0085, code skipped:
            if (r10 == r11) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:34:0x0089, code skipped:
            r10 = null;
     */
    public android.view.View hasGapsToFix() {
        /*
        r12 = this;
        r0 = r12.getChildCount();
        r1 = 1;
        r0 = r0 - r1;
        r2 = new java.util.BitSet;
        r3 = r12.mSpanCount;
        r2.<init>(r3);
        r3 = r12.mSpanCount;
        r4 = 0;
        r2.set(r4, r3, r1);
        r3 = r12.mOrientation;
        r5 = -1;
        if (r3 != r1) goto L_0x0020;
    L_0x0018:
        r3 = r12.isLayoutRTL();
        if (r3 == 0) goto L_0x0020;
    L_0x001e:
        r3 = 1;
        goto L_0x0021;
    L_0x0020:
        r3 = -1;
    L_0x0021:
        r6 = r12.mShouldReverseLayout;
        if (r6 == 0) goto L_0x0027;
    L_0x0025:
        r6 = -1;
        goto L_0x002b;
    L_0x0027:
        r0 = r0 + 1;
        r6 = r0;
        r0 = 0;
    L_0x002b:
        if (r0 >= r6) goto L_0x002e;
    L_0x002d:
        r5 = 1;
    L_0x002e:
        if (r0 == r6) goto L_0x00aa;
    L_0x0030:
        r7 = r12.getChildAt(r0);
        r8 = r7.getLayoutParams();
        r8 = (android.support.v7.widget.CustomizableStaggeredGridLayoutManager.LayoutParams) r8;
        r9 = r8.mSpan;
        r9 = r9.mIndex;
        r9 = r2.get(r9);
        if (r9 == 0) goto L_0x0054;
    L_0x0044:
        r9 = r8.mSpan;
        r9 = r12.checkSpanForGap(r9);
        if (r9 == 0) goto L_0x004d;
    L_0x004c:
        return r7;
    L_0x004d:
        r9 = r8.mSpan;
        r9 = r9.mIndex;
        r2.clear(r9);
    L_0x0054:
        r9 = r8.mFullSpan;
        if (r9 != 0) goto L_0x00a8;
    L_0x0058:
        r9 = r0 + r5;
        if (r9 == r6) goto L_0x00a8;
    L_0x005c:
        r9 = r12.getChildAt(r9);
        r10 = r12.mShouldReverseLayout;
        if (r10 == 0) goto L_0x0076;
    L_0x0064:
        r10 = r12.mPrimaryOrientation;
        r10 = r10.getDecoratedEnd(r7);
        r11 = r12.mPrimaryOrientation;
        r11 = r11.getDecoratedEnd(r9);
        if (r10 >= r11) goto L_0x0073;
    L_0x0072:
        return r7;
    L_0x0073:
        if (r10 != r11) goto L_0x0089;
    L_0x0075:
        goto L_0x0087;
    L_0x0076:
        r10 = r12.mPrimaryOrientation;
        r10 = r10.getDecoratedStart(r7);
        r11 = r12.mPrimaryOrientation;
        r11 = r11.getDecoratedStart(r9);
        if (r10 <= r11) goto L_0x0085;
    L_0x0084:
        return r7;
    L_0x0085:
        if (r10 != r11) goto L_0x0089;
    L_0x0087:
        r10 = 1;
        goto L_0x008a;
    L_0x0089:
        r10 = 0;
    L_0x008a:
        if (r10 == 0) goto L_0x00a8;
    L_0x008c:
        r9 = r9.getLayoutParams();
        r9 = (android.support.v7.widget.CustomizableStaggeredGridLayoutManager.LayoutParams) r9;
        r8 = r8.mSpan;
        r8 = r8.mIndex;
        r9 = r9.mSpan;
        r9 = r9.mIndex;
        r8 = r8 - r9;
        if (r8 >= 0) goto L_0x009f;
    L_0x009d:
        r8 = 1;
        goto L_0x00a0;
    L_0x009f:
        r8 = 0;
    L_0x00a0:
        if (r3 >= 0) goto L_0x00a4;
    L_0x00a2:
        r9 = 1;
        goto L_0x00a5;
    L_0x00a4:
        r9 = 0;
    L_0x00a5:
        if (r8 == r9) goto L_0x00a8;
    L_0x00a7:
        return r7;
    L_0x00a8:
        r0 = r0 + r5;
        goto L_0x002e;
    L_0x00aa:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.CustomizableStaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].onOffset(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].onOffset(i);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].clear();
        }
        recyclerView.requestLayout();
    }

    public View onFocusSearchFailed(View view, int i, Recycler recycler, State state) {
        if (getChildCount() == 0) {
            return null;
        }
        view = findContainingItemView(view);
        if (view == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        i = convertFocusDirectionToLayoutDirection(i);
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        View focusableViewAfter;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.mFullSpan;
        Span span = layoutParams.mSpan;
        int lastChildPosition = i == 1 ? getLastChildPosition() : getFirstChildPosition();
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(i);
        ok okVar = this.mLayoutState;
        okVar.c = okVar.d + lastChildPosition;
        this.mLayoutState.b = (int) (((float) this.mPrimaryOrientation.getTotalSpace()) * MAX_SCROLL_FACTOR);
        okVar = this.mLayoutState;
        okVar.h = true;
        int i2 = 0;
        okVar.a = false;
        fill(recycler, okVar, state);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        if (!z) {
            View focusableViewAfter2 = span.getFocusableViewAfter(lastChildPosition, i);
            if (!(focusableViewAfter2 == null || focusableViewAfter2 == view)) {
                return focusableViewAfter2;
            }
        }
        int i3;
        if (preferLastSpan(i)) {
            for (i3 = this.mSpanCount - 1; i3 >= 0; i3--) {
                focusableViewAfter = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, i);
                if (focusableViewAfter != null && focusableViewAfter != view) {
                    return focusableViewAfter;
                }
            }
        } else {
            for (i3 = 0; i3 < this.mSpanCount; i3++) {
                focusableViewAfter = this.mSpans[i3].getFocusableViewAfter(lastChildPosition, i);
                if (focusableViewAfter != null && focusableViewAfter != view) {
                    return focusableViewAfter;
                }
            }
        }
        Object obj = (this.mReverseLayout ^ 1) == (i == -1 ? 1 : 0) ? 1 : null;
        if (!z) {
            focusableViewAfter = findViewByPosition(obj != null ? span.findFirstPartiallyVisibleItemPosition() : span.findLastPartiallyVisibleItemPosition());
            if (!(focusableViewAfter == null || focusableViewAfter == view)) {
                return focusableViewAfter;
            }
        }
        if (preferLastSpan(i)) {
            for (i = this.mSpanCount - 1; i >= 0; i--) {
                if (i != span.mIndex) {
                    focusableViewAfter = findViewByPosition(obj != null ? this.mSpans[i].findFirstPartiallyVisibleItemPosition() : this.mSpans[i].findLastPartiallyVisibleItemPosition());
                    if (!(focusableViewAfter == null || focusableViewAfter == view)) {
                        return focusableViewAfter;
                    }
                }
            }
        } else {
            while (i2 < this.mSpanCount) {
                View findViewByPosition = findViewByPosition(obj != null ? this.mSpans[i2].findFirstPartiallyVisibleItemPosition() : this.mSpans[i2].findLastPartiallyVisibleItemPosition());
                if (findViewByPosition != null && findViewByPosition != view) {
                    return findViewByPosition;
                }
                i2++;
            }
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View findFirstVisibleItemClosestToStart = findFirstVisibleItemClosestToStart(false);
            View findFirstVisibleItemClosestToEnd = findFirstVisibleItemClosestToEnd(false);
            if (!(findFirstVisibleItemClosestToStart == null || findFirstVisibleItemClosestToEnd == null)) {
                int position = getPosition(findFirstVisibleItemClosestToStart);
                int position2 = getPosition(findFirstVisibleItemClosestToEnd);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(Recycler recycler, State state, View view, kk kkVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            int spanIndex;
            int i;
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int i2 = 1;
            int i3 = -1;
            if (this.mOrientation == 0) {
                spanIndex = layoutParams2.getSpanIndex();
                if (layoutParams2.mFullSpan) {
                    i2 = this.mSpanCount;
                }
                i3 = spanIndex;
                spanIndex = -1;
                i = -1;
            } else {
                spanIndex = layoutParams2.getSpanIndex();
                if (layoutParams2.mFullSpan) {
                    i = this.mSpanCount;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = 1;
                }
            }
            kkVar.a(b.a(i3, i2, spanIndex, i, layoutParams2.mFullSpan));
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, kkVar);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        handleUpdate(i, i2, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        handleUpdate(i, i2, 4);
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        onLayoutChildren(recycler, state, true);
    }

    public void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo.reset();
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
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        LazySpanLookup lazySpanLookup = this.mLazySpanLookup;
        int i = 0;
        if (lazySpanLookup == null || lazySpanLookup.mData == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = this.mLazySpanLookup.mData;
            savedState.mSpanLookupSize = savedState.mSpanLookup.length;
            savedState.mFullSpanItems = this.mLazySpanLookup.mFullSpanItems;
        }
        if (getChildCount() > 0) {
            savedState.mAnchorPosition = this.mLastLayoutFromEnd ? getLastChildPosition() : getFirstChildPosition();
            savedState.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            int i2 = this.mSpanCount;
            savedState.mSpanOffsetsSize = i2;
            savedState.mSpanOffsets = new int[i2];
            while (i < this.mSpanCount) {
                int endAfterPadding;
                if (this.mLastLayoutFromEnd) {
                    i2 = this.mSpans[i].getEndLine(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = i2;
                        i++;
                    }
                } else {
                    i2 = this.mSpans[i].getStartLine(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = i2;
                        i++;
                    }
                }
                i2 -= endAfterPadding;
                savedState.mSpanOffsets[i] = i2;
                i++;
            }
        } else {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            checkForGaps();
        }
    }

    public void overrideAnchorAndSpanBeforeFill(AnchorInfo anchorInfo) {
    }

    /* Access modifiers changed, original: 0000 */
    public void prepareLayoutStateForDelta(int i, State state) {
        int lastChildPosition;
        int i2;
        if (i > 0) {
            lastChildPosition = getLastChildPosition();
            i2 = 1;
        } else {
            lastChildPosition = getFirstChildPosition();
            i2 = -1;
        }
        this.mLayoutState.a = true;
        updateLayoutState(lastChildPosition, state);
        setLayoutStateDirection(i2);
        ok okVar = this.mLayoutState;
        okVar.c = lastChildPosition + okVar.d;
        this.mLayoutState.b = Math.abs(i);
    }

    /* Access modifiers changed, original: 0000 */
    public int scrollBy(int i, Recycler recycler, State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        prepareLayoutStateForDelta(i, state);
        int fill = fill(recycler, this.mLayoutState, state);
        if (this.mLayoutState.b >= fill) {
            i = i < 0 ? -fill : fill;
        }
        this.mPrimaryOrientation.offsetChildren(-i);
        this.mLastLayoutFromEnd = this.mShouldReverseLayout;
        ok okVar = this.mLayoutState;
        okVar.b = 0;
        recycle(recycler, okVar);
        return i;
    }

    public int scrollHorizontallyBy(int i, Recycler recycler, State state) {
        return scrollBy(i, recycler, state);
    }

    public void scrollToPosition(int i) {
        SavedState savedState = this.mPendingSavedState;
        if (!(savedState == null || savedState.mAnchorPosition == i)) {
            this.mPendingSavedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, Recycler recycler, State state) {
        return scrollBy(i, recycler, state);
    }

    public void setGapStrategy(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mGapStrategy) {
            if (i == 0 || i == 2) {
                this.mGapStrategy = i;
                setAutoMeasureEnabled(this.mGapStrategy != 0);
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public void setLazySpanLookup(LazySpanLookup lazySpanLookup) {
        this.mLazySpanLookup = lazySpanLookup;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int chooseSize;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize = LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i = LayoutManager.chooseSize(i, (this.mSizePerSpan * this.mSpanCount) + paddingLeft, getMinimumWidth());
        } else {
            i = LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize = LayoutManager.chooseSize(i2, (this.mSizePerSpan * this.mSpanCount) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i, chooseSize);
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation) {
                this.mOrientation = i;
                OrientationHelper orientationHelper = this.mPrimaryOrientation;
                this.mPrimaryOrientation = this.mSecondaryOrientation;
                this.mSecondaryOrientation = orientationHelper;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.mPendingSavedState;
        if (!(savedState == null || savedState.mReverseLayout == z)) {
            this.mPendingSavedState.mReverseLayout = z;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSpanCount(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.mSpanCount) {
            invalidateSpanAssignments();
            this.mSpanCount = i;
            this.mRemainingSpans = new BitSet(this.mSpanCount);
            this.mSpans = new Span[this.mSpanCount];
            for (i = 0; i < this.mSpanCount; i++) {
                this.mSpans[i] = new Span(i);
            }
            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean updateAnchorFromPendingData(State state, AnchorInfo anchorInfo) {
        boolean z = false;
        if (!state.isPreLayout()) {
            int i = this.mPendingScrollPosition;
            if (i != -1) {
                if (i < 0 || i >= state.getItemCount()) {
                    this.mPendingScrollPosition = -1;
                    this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                } else {
                    SavedState savedState = this.mPendingSavedState;
                    if (savedState == null || savedState.mAnchorPosition == -1 || this.mPendingSavedState.mSpanOffsetsSize <= 0) {
                        View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                        int decoratedEnd;
                        if (findViewByPosition != null) {
                            anchorInfo.mPosition = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                            int endAfterPadding;
                            if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                                if (anchorInfo.mLayoutFromEnd) {
                                    endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                                    decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                                } else {
                                    endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                                    decoratedEnd = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                                }
                                anchorInfo.mOffset = endAfterPadding - decoratedEnd;
                                return true;
                            } else if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                                anchorInfo.mOffset = anchorInfo.mLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                                return true;
                            } else {
                                endAfterPadding = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                                if (endAfterPadding < 0) {
                                    anchorInfo.mOffset = -endAfterPadding;
                                    return true;
                                }
                                endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                                if (endAfterPadding < 0) {
                                    anchorInfo.mOffset = endAfterPadding;
                                    return true;
                                }
                                anchorInfo.mOffset = Integer.MIN_VALUE;
                            }
                        } else {
                            anchorInfo.mPosition = this.mPendingScrollPosition;
                            decoratedEnd = this.mPendingScrollPositionOffset;
                            if (decoratedEnd == Integer.MIN_VALUE) {
                                if (calculateScrollDirectionForPosition(anchorInfo.mPosition) == 1) {
                                    z = true;
                                }
                                anchorInfo.mLayoutFromEnd = z;
                                anchorInfo.assignCoordinateFromPadding();
                            } else {
                                anchorInfo.assignCoordinateFromPadding(decoratedEnd);
                            }
                            anchorInfo.mInvalidateOffsets = true;
                        }
                    } else {
                        anchorInfo.mOffset = Integer.MIN_VALUE;
                        anchorInfo.mPosition = this.mPendingScrollPosition;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void updateAnchorInfoForLayout(State state, AnchorInfo anchorInfo) {
        if (!updateAnchorFromPendingData(state, anchorInfo) && !updateAnchorFromChildren(state, anchorInfo)) {
            anchorInfo.assignCoordinateFromPadding();
            anchorInfo.mPosition = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.getMode());
    }
}
