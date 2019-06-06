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
import defpackage.ok;
import defpackage.oq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {
    static final boolean DEBUG = false;
    @Deprecated
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "StaggeredGridLManager";
    public static final int VERTICAL = 1;
    private final a mAnchorInfo = new a();
    private final Runnable mCheckForGapsRunnable = new Runnable() {
        public final void run() {
            StaggeredGridLayoutManager.this.checkForGaps();
        }
    };
    private int mFullSizeSpec;
    private int mGapStrategy = 2;
    private boolean mLaidOutInvalidFullSpan = false;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private final ok mLayoutState;
    b mLazySpanLookup = new b();
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
    private boolean mSmoothScrollbarEnabled = true;
    private int mSpanCount = -1;
    c[] mSpans;
    private final Rect mTmpRect = new Rect();

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

    class a {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        a() {
            a();
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            this.b = this.c ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
        }
    }

    static class b {
        int[] a;
        List<a> b;

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

        b() {
        }

        private void c(int i, int i2) {
            List list = this.b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.b.get(size);
                    if (aVar.a >= i) {
                        if (aVar.a < i3) {
                            this.b.remove(size);
                        } else {
                            aVar.a -= i2;
                        }
                    }
                }
            }
        }

        private void d(int i, int i2) {
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.b.get(size);
                    if (aVar.a >= i) {
                        aVar.a += i2;
                    }
                }
            }
        }

        private int e(int i) {
            int length = this.a.length;
            while (length <= i) {
                length <<= 1;
            }
            return length;
        }

        private int f(int i) {
            if (this.b == null) {
                return -1;
            }
            a d = d(i);
            if (d != null) {
                this.b.remove(d);
            }
            int size = this.b.size();
            int i2 = 0;
            while (i2 < size) {
                if (((a) this.b.get(i2)).a >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return -1;
            }
            a aVar = (a) this.b.get(i2);
            this.b.remove(i2);
            return aVar.a;
        }

        /* Access modifiers changed, original: final */
        public final int a(int i) {
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.b.get(size)).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return b(i);
        }

        public final a a(int i, int i2, int i3) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) this.b.get(i4);
                if (aVar.a >= i2) {
                    return null;
                }
                if (aVar.a >= i && (i3 == 0 || aVar.b == i3 || aVar.d)) {
                    return aVar;
                }
            }
            return null;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        /* Access modifiers changed, original: final */
        public final void a(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                iArr = this.a;
                Arrays.fill(iArr, iArr.length - i2, iArr.length, -1);
                c(i, i2);
            }
        }

        public final void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = (a) this.b.get(i);
                if (aVar2.a == aVar.a) {
                    this.b.remove(i);
                }
                if (aVar2.a >= aVar.a) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        /* Access modifiers changed, original: final */
        public final int b(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int f = f(i);
            if (f == -1) {
                iArr = this.a;
                Arrays.fill(iArr, i, iArr.length, -1);
                return this.a.length;
            }
            f++;
            Arrays.fill(this.a, i, f, -1);
            return f;
        }

        /* Access modifiers changed, original: final */
        public final void b(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                c(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                d(i, i2);
            }
        }

        /* Access modifiers changed, original: final */
        public final void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.a, -1);
                return;
            }
            if (i >= iArr.length) {
                this.a = new int[e(i)];
                System.arraycopy(iArr, 0, this.a, 0, iArr.length);
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        public final a d(int i) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    class c {
        ArrayList<View> a = new ArrayList();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        c(int i) {
            this.e = i;
        }

        private int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int startAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding();
            int endAfterPadding = StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int decoratedStart = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
                int decoratedEnd = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
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
                    return StaggeredGridLayoutManager.this.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        private int b(int i, int i2) {
            return a(i, i2, false, false, true);
        }

        private void h() {
            View view = (View) this.a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.b = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedStart(view);
            if (layoutParams.mFullSpan) {
                a d = StaggeredGridLayoutManager.this.mLazySpanLookup.d(layoutParams.getViewLayoutPosition());
                if (d != null && d.b == -1) {
                    this.b -= d.a(this.e);
                }
            }
        }

        private void i() {
            ArrayList arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.c = StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutParams.mFullSpan) {
                a d = StaggeredGridLayoutManager.this.mLazySpanLookup.d(layoutParams.getViewLayoutPosition());
                if (d != null && d.b == 1) {
                    this.c += d.a(this.e);
                }
            }
        }

        private void j() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            h();
            return this.b;
        }

        /* Access modifiers changed, original: final */
        public final int a(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            h();
            return this.b;
        }

        /* Access modifiers changed, original: final */
        public final int a(int i, int i2, boolean z) {
            return a(i, i2, z, true, false);
        }

        public final View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                i2 = this.a.size() - 1;
                while (i2 >= 0) {
                    View view2 = (View) this.a.get(i2);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) >= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i2--;
                    view = view2;
                }
            } else {
                i2 = this.a.size();
                int i3 = 0;
                while (i3 < i2) {
                    View view3 = (View) this.a.get(i3);
                    if ((StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) <= i) || ((!StaggeredGridLayoutManager.this.mReverseLayout && StaggeredGridLayoutManager.this.getPosition(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* Access modifiers changed, original: final */
        public final void a(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpan = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.d += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        /* Access modifiers changed, original: final */
        public final int b() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            i();
            return this.c;
        }

        /* Access modifiers changed, original: final */
        public final int b(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            i();
            return this.c;
        }

        /* Access modifiers changed, original: final */
        public final void b(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpan = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.d += StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            this.a.clear();
            j();
            this.d = 0;
        }

        /* Access modifiers changed, original: final */
        public final void c(int i) {
            this.b = i;
            this.c = i;
        }

        /* Access modifiers changed, original: final */
        public final void d() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpan = null;
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        /* Access modifiers changed, original: final */
        public final void d(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                this.c = i2 + i;
            }
        }

        /* Access modifiers changed, original: final */
        public final void e() {
            View view = (View) this.a.remove(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpan = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.d -= StaggeredGridLayoutManager.this.mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            this.b = Integer.MIN_VALUE;
        }

        public final int f() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                size = this.a.size() - 1;
                i = -1;
            } else {
                size = 0;
                i = this.a.size();
            }
            return b(size, i);
        }

        public final int g() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.mReverseLayout) {
                i = 0;
                size = this.a.size();
            } else {
                i = this.a.size() - 1;
                size = -1;
            }
            return b(i, size);
        }
    }

    public static class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        c mSpan;

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

        public final int getSpanIndex() {
            c cVar = this.mSpan;
            return cVar == null ? -1 : cVar.e;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.mOrientation = i2;
        setSpanCount(i);
        this.mLayoutState = new ok();
        createOrientationHelpers();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Properties properties = LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.orientation);
        setSpanCount(properties.spanCount);
        setReverseLayout(properties.reverseLayout);
        this.mLayoutState = new ok();
        createOrientationHelpers();
    }

    private void appendViewToAllSpans(View view) {
        for (int i = this.mSpanCount - 1; i >= 0; i--) {
            this.mSpans[i].b(view);
        }
    }

    private void applyPendingSavedState(a aVar) {
        boolean z;
        if (this.mPendingSavedState.mSpanOffsetsSize > 0) {
            if (this.mPendingSavedState.mSpanOffsetsSize == this.mSpanCount) {
                for (int i = 0; i < this.mSpanCount; i++) {
                    this.mSpans[i].c();
                    int i2 = this.mPendingSavedState.mSpanOffsets[i];
                    if (i2 != Integer.MIN_VALUE) {
                        i2 += this.mPendingSavedState.mAnchorLayoutFromEnd ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                    }
                    this.mSpans[i].c(i2);
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
        aVar.c = z;
        if (this.mPendingSavedState.mSpanLookupSize > 1) {
            this.mLazySpanLookup.a = this.mPendingSavedState.mSpanLookup;
            this.mLazySpanLookup.b = this.mPendingSavedState.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutParams, ok okVar) {
        if (okVar.e == 1) {
            if (layoutParams.mFullSpan) {
                appendViewToAllSpans(view);
            } else {
                layoutParams.mSpan.b(view);
            }
        } else if (layoutParams.mFullSpan) {
            prependViewToAllSpans(view);
        } else {
            layoutParams.mSpan.a(view);
        }
    }

    private int calculateScrollDirectionForPosition(int i) {
        if (getChildCount() == 0) {
            return this.mShouldReverseLayout ? 1 : -1;
        } else {
            return (i < getFirstChildPosition()) != this.mShouldReverseLayout ? -1 : 1;
        }
    }

    private boolean checkSpanForGap(c cVar) {
        return this.mShouldReverseLayout ? cVar.b() < this.mPrimaryOrientation.getEndAfterPadding() && !((LayoutParams) ((View) cVar.a.get(cVar.a.size() - 1)).getLayoutParams()).mFullSpan : cVar.a() > this.mPrimaryOrientation.getStartAfterPadding() && !((LayoutParams) ((View) cVar.a.get(0)).getLayoutParams()).mFullSpan;
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
            aVar.c[i2] = i - this.mSpans[i2].b(i);
        }
        return aVar;
    }

    private a createFullSpanItemFromStart(int i) {
        a aVar = new a();
        aVar.c = new int[this.mSpanCount];
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            aVar.c[i2] = this.mSpans[i2].a(i) - i;
        }
        return aVar;
    }

    private void createOrientationHelpers() {
        this.mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, this.mOrientation);
        this.mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - this.mOrientation);
    }

    private int fill(Recycler recycler, ok okVar, State state) {
        int i;
        int i2;
        Recycler recycler2 = recycler;
        ok okVar2 = okVar;
        int i3 = 0;
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
            c nextSpan;
            int decoratedMeasurement;
            int i4;
            int decoratedMeasurement2;
            StaggeredGridLayoutManager staggeredGridLayoutManager;
            View view;
            int i5;
            View a = okVar2.a(recycler2);
            LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            b bVar = this.mLazySpanLookup;
            i2 = (bVar.a == null || viewLayoutPosition >= bVar.a.length) ? -1 : bVar.a[viewLayoutPosition];
            Object obj2 = i2 == -1 ? 1 : null;
            if (obj2 != null) {
                nextSpan = layoutParams.mFullSpan ? this.mSpans[i3] : getNextSpan(okVar2);
                b bVar2 = this.mLazySpanLookup;
                bVar2.c(viewLayoutPosition);
                bVar2.a[viewLayoutPosition] = nextSpan.e;
            } else {
                nextSpan = this.mSpans[i2];
            }
            c cVar = nextSpan;
            layoutParams.mSpan = cVar;
            if (okVar2.e == 1) {
                addView(a);
            } else {
                addView(a, i3);
            }
            measureChildWithDecorationsAndMargin(a, layoutParams, i3);
            a createFullSpanItemFromEnd;
            if (okVar2.e == 1) {
                i2 = layoutParams.mFullSpan ? getMaxEnd(endAfterPadding) : cVar.b(endAfterPadding);
                decoratedMeasurement = this.mPrimaryOrientation.getDecoratedMeasurement(a) + i2;
                if (obj2 != null && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromEnd(i2);
                    createFullSpanItemFromEnd.b = -1;
                    createFullSpanItemFromEnd.a = viewLayoutPosition;
                    this.mLazySpanLookup.a(createFullSpanItemFromEnd);
                }
                i4 = decoratedMeasurement;
                decoratedMeasurement = i2;
            } else {
                i2 = layoutParams.mFullSpan ? getMinStart(endAfterPadding) : cVar.a(endAfterPadding);
                decoratedMeasurement = i2 - this.mPrimaryOrientation.getDecoratedMeasurement(a);
                if (obj2 != null && layoutParams.mFullSpan) {
                    createFullSpanItemFromEnd = createFullSpanItemFromStart(i2);
                    createFullSpanItemFromEnd.b = 1;
                    createFullSpanItemFromEnd.a = viewLayoutPosition;
                    this.mLazySpanLookup.a(createFullSpanItemFromEnd);
                }
                i4 = i2;
            }
            if (layoutParams.mFullSpan && okVar2.d == -1) {
                if (obj2 == null) {
                    if (((okVar2.e == 1 ? areAllEndsEqual() : areAllStartsEqual()) ^ 1) != 0) {
                        a d = this.mLazySpanLookup.d(viewLayoutPosition);
                        if (d != null) {
                            d.d = true;
                        }
                    }
                }
                this.mLaidOutInvalidFullSpan = true;
            }
            attachViewToSpans(a, layoutParams, okVar2);
            if (isLayoutRTL() && this.mOrientation == 1) {
                viewLayoutPosition = layoutParams.mFullSpan ? this.mSecondaryOrientation.getEndAfterPadding() : this.mSecondaryOrientation.getEndAfterPadding() - (((this.mSpanCount - 1) - cVar.e) * this.mSizePerSpan);
                i3 = viewLayoutPosition;
                decoratedMeasurement2 = viewLayoutPosition - this.mSecondaryOrientation.getDecoratedMeasurement(a);
            } else {
                viewLayoutPosition = layoutParams.mFullSpan ? this.mSecondaryOrientation.getStartAfterPadding() : (cVar.e * this.mSizePerSpan) + this.mSecondaryOrientation.getStartAfterPadding();
                decoratedMeasurement2 = viewLayoutPosition;
                i3 = this.mSecondaryOrientation.getDecoratedMeasurement(a) + viewLayoutPosition;
            }
            if (this.mOrientation == 1) {
                staggeredGridLayoutManager = this;
                view = a;
                i5 = decoratedMeasurement2;
                decoratedMeasurement2 = decoratedMeasurement;
                decoratedMeasurement = i3;
            } else {
                staggeredGridLayoutManager = this;
                view = a;
                i5 = decoratedMeasurement;
                decoratedMeasurement = i4;
                i4 = i3;
            }
            staggeredGridLayoutManager.layoutDecoratedWithMargins(view, i5, decoratedMeasurement2, decoratedMeasurement, i4);
            if (layoutParams.mFullSpan) {
                updateAllRemainingSpans(this.mLayoutState.e, i);
            } else {
                updateRemainingSpans(cVar, this.mLayoutState.e, i);
            }
            recycle(recycler2, this.mLayoutState);
            if (this.mLayoutState.h && a.hasFocusable()) {
                if (layoutParams.mFullSpan) {
                    this.mRemainingSpans.clear();
                } else {
                    this.mRemainingSpans.set(cVar.e, false);
                }
            }
            obj = 1;
            i3 = 0;
        }
        if (obj == null) {
            recycle(recycler2, this.mLayoutState);
        }
        i2 = this.mLayoutState.e == -1 ? this.mPrimaryOrientation.getStartAfterPadding() - getMinStart(this.mPrimaryOrientation.getStartAfterPadding()) : getMaxEnd(this.mPrimaryOrientation.getEndAfterPadding()) - this.mPrimaryOrientation.getEndAfterPadding();
        return i2 > 0 ? Math.min(okVar2.b, i2) : 0;
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
        int b = this.mSpans[0].b(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int b2 = this.mSpans[i2].b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    private int getMaxStart(int i) {
        int a = this.mSpans[0].a(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int a2 = this.mSpans[i2].a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    private int getMinEnd(int i) {
        int b = this.mSpans[0].b(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int b2 = this.mSpans[i2].b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    private int getMinStart(int i) {
        int a = this.mSpans[0].a(i);
        for (int i2 = 1; i2 < this.mSpanCount; i2++) {
            int a2 = this.mSpans[i2].a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    private c getNextSpan(ok okVar) {
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
        c cVar = null;
        int i4;
        int startAfterPadding;
        c cVar2;
        int b;
        if (okVar.e == 1) {
            i4 = Integer.MAX_VALUE;
            startAfterPadding = this.mPrimaryOrientation.getStartAfterPadding();
            while (i != i3) {
                cVar2 = this.mSpans[i];
                b = cVar2.b(startAfterPadding);
                if (b < i4) {
                    cVar = cVar2;
                    i4 = b;
                }
                i += i2;
            }
            return cVar;
        }
        i4 = Integer.MIN_VALUE;
        startAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
        while (i != i3) {
            cVar2 = this.mSpans[i];
            b = cVar2.a(startAfterPadding);
            if (b > i4) {
                cVar = cVar2;
                i4 = b;
            }
            i += i2;
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A:{RETURN} */
    private void handleUpdate(int r7, int r8, int r9) {
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
        r4.b(r2);
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
        r9.a(r7, r4);
        r7 = r6.mLazySpanLookup;
        r7.b(r8, r4);
        goto L_0x0043;
    L_0x0038:
        r9 = r6.mLazySpanLookup;
        r9.a(r7, r8);
        goto L_0x0043;
    L_0x003e:
        r9 = r6.mLazySpanLookup;
        r9.b(r7, r8);
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.handleUpdate(int, int, int):void");
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
                measureChildWithDecorationsAndMargin(view, this.mFullSizeSpec, LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
            } else {
                measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), this.mFullSizeSpec, z);
            }
        } else if (this.mOrientation == 1) {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getWidthMode(), 0, layoutParams.width, false), LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), layoutParams.height, true), z);
        } else {
            measureChildWithDecorationsAndMargin(view, LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), layoutParams.width, true), LayoutManager.getChildMeasureSpec(this.mSizePerSpan, getHeightMode(), 0, layoutParams.height, false), z);
        }
    }

    /* JADX WARNING: Missing block: B:106:0x019e, code skipped:
            if (checkForGaps() != false) goto L_0x01a2;
     */
    private void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler r12, android.support.v7.widget.RecyclerView.State r13, boolean r14) {
        /*
        r11 = this;
        r0 = 0;
    L_0x0001:
        r1 = r11.mAnchorInfo;
        r2 = r11.mPendingSavedState;
        r3 = -1;
        if (r2 != 0) goto L_0x000c;
    L_0x0008:
        r2 = r11.mPendingScrollPosition;
        if (r2 == r3) goto L_0x0019;
    L_0x000c:
        r2 = r13.getItemCount();
        if (r2 != 0) goto L_0x0019;
    L_0x0012:
        r11.removeAndRecycleAllViews(r12);
        r1.a();
        return;
    L_0x0019:
        r2 = r1.e;
        r4 = 1;
        if (r2 == 0) goto L_0x0029;
    L_0x001e:
        r2 = r11.mPendingScrollPosition;
        if (r2 != r3) goto L_0x0029;
    L_0x0022:
        r2 = r11.mPendingSavedState;
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
        r1.a();
        r5 = r11.mPendingSavedState;
        if (r5 == 0) goto L_0x0037;
    L_0x0033:
        r11.applyPendingSavedState(r1);
        goto L_0x003e;
    L_0x0037:
        r11.resolveShouldLayoutReverse();
        r5 = r11.mShouldReverseLayout;
        r1.c = r5;
    L_0x003e:
        r11.updateAnchorInfoForLayout(r13, r1);
        r1.e = r4;
    L_0x0043:
        r5 = r11.mPendingSavedState;
        if (r5 != 0) goto L_0x0060;
    L_0x0047:
        r5 = r11.mPendingScrollPosition;
        if (r5 != r3) goto L_0x0060;
    L_0x004b:
        r5 = r1.c;
        r6 = r11.mLastLayoutFromEnd;
        if (r5 != r6) goto L_0x0059;
    L_0x0051:
        r5 = r11.isLayoutRTL();
        r6 = r11.mLastLayoutRTL;
        if (r5 == r6) goto L_0x0060;
    L_0x0059:
        r5 = r11.mLazySpanLookup;
        r5.a();
        r1.d = r4;
    L_0x0060:
        r5 = r11.getChildCount();
        if (r5 <= 0) goto L_0x0118;
    L_0x0066:
        r5 = r11.mPendingSavedState;
        if (r5 == 0) goto L_0x006e;
    L_0x006a:
        r5 = r5.mSpanOffsetsSize;
        if (r5 > 0) goto L_0x0118;
    L_0x006e:
        r5 = r1.d;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r5 == 0) goto L_0x0090;
    L_0x0074:
        r2 = 0;
    L_0x0075:
        r5 = r11.mSpanCount;
        if (r2 >= r5) goto L_0x0118;
    L_0x0079:
        r5 = r11.mSpans;
        r5 = r5[r2];
        r5.c();
        r5 = r1.b;
        if (r5 == r6) goto L_0x008d;
    L_0x0084:
        r5 = r11.mSpans;
        r5 = r5[r2];
        r7 = r1.b;
        r5.c(r7);
    L_0x008d:
        r2 = r2 + 1;
        goto L_0x0075;
    L_0x0090:
        if (r2 != 0) goto L_0x00b1;
    L_0x0092:
        r2 = r11.mAnchorInfo;
        r2 = r2.f;
        if (r2 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00b1;
    L_0x0099:
        r2 = 0;
    L_0x009a:
        r5 = r11.mSpanCount;
        if (r2 >= r5) goto L_0x0118;
    L_0x009e:
        r5 = r11.mSpans;
        r5 = r5[r2];
        r5.c();
        r6 = r11.mAnchorInfo;
        r6 = r6.f;
        r6 = r6[r2];
        r5.c(r6);
        r2 = r2 + 1;
        goto L_0x009a;
    L_0x00b1:
        r2 = 0;
    L_0x00b2:
        r5 = r11.mSpanCount;
        if (r2 >= r5) goto L_0x00f1;
    L_0x00b6:
        r5 = r11.mSpans;
        r5 = r5[r2];
        r7 = r11.mShouldReverseLayout;
        r8 = r1.b;
        if (r7 == 0) goto L_0x00c5;
    L_0x00c0:
        r9 = r5.b(r6);
        goto L_0x00c9;
    L_0x00c5:
        r9 = r5.a(r6);
    L_0x00c9:
        r5.c();
        if (r9 == r6) goto L_0x00ee;
    L_0x00ce:
        if (r7 == 0) goto L_0x00da;
    L_0x00d0:
        r10 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r10 = r10.mPrimaryOrientation;
        r10 = r10.getEndAfterPadding();
        if (r9 < r10) goto L_0x00ee;
    L_0x00da:
        if (r7 != 0) goto L_0x00e7;
    L_0x00dc:
        r7 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r7 = r7.mPrimaryOrientation;
        r7 = r7.getStartAfterPadding();
        if (r9 <= r7) goto L_0x00e7;
    L_0x00e6:
        goto L_0x00ee;
    L_0x00e7:
        if (r8 == r6) goto L_0x00ea;
    L_0x00e9:
        r9 = r9 + r8;
    L_0x00ea:
        r5.c = r9;
        r5.b = r9;
    L_0x00ee:
        r2 = r2 + 1;
        goto L_0x00b2;
    L_0x00f1:
        r2 = r11.mAnchorInfo;
        r5 = r11.mSpans;
        r7 = r5.length;
        r8 = r2.f;
        if (r8 == 0) goto L_0x00ff;
    L_0x00fa:
        r8 = r2.f;
        r8 = r8.length;
        if (r8 >= r7) goto L_0x0108;
    L_0x00ff:
        r8 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r8 = r8.mSpans;
        r8 = r8.length;
        r8 = new int[r8];
        r2.f = r8;
    L_0x0108:
        r8 = 0;
    L_0x0109:
        if (r8 >= r7) goto L_0x0118;
    L_0x010b:
        r9 = r2.f;
        r10 = r5[r8];
        r10 = r10.a(r6);
        r9[r8] = r10;
        r8 = r8 + 1;
        goto L_0x0109;
    L_0x0118:
        r11.detachAndScrapAttachedViews(r12);
        r2 = r11.mLayoutState;
        r2.a = r0;
        r11.mLaidOutInvalidFullSpan = r0;
        r2 = r11.mSecondaryOrientation;
        r2 = r2.getTotalSpace();
        r11.updateMeasureSpecs(r2);
        r2 = r1.a;
        r11.updateLayoutState(r2, r13);
        r2 = r1.c;
        if (r2 == 0) goto L_0x013f;
    L_0x0133:
        r11.setLayoutStateDirection(r3);
        r2 = r11.mLayoutState;
        r11.fill(r12, r2, r13);
        r11.setLayoutStateDirection(r4);
        goto L_0x014a;
    L_0x013f:
        r11.setLayoutStateDirection(r4);
        r2 = r11.mLayoutState;
        r11.fill(r12, r2, r13);
        r11.setLayoutStateDirection(r3);
    L_0x014a:
        r2 = r11.mLayoutState;
        r3 = r1.a;
        r5 = r11.mLayoutState;
        r5 = r5.d;
        r3 = r3 + r5;
        r2.c = r3;
        r2 = r11.mLayoutState;
        r11.fill(r12, r2, r13);
        r11.repositionToWrapContentIfNecessary();
        r2 = r11.getChildCount();
        if (r2 <= 0) goto L_0x0174;
    L_0x0163:
        r2 = r11.mShouldReverseLayout;
        if (r2 == 0) goto L_0x016e;
    L_0x0167:
        r11.fixEndGap(r12, r13, r4);
        r11.fixStartGap(r12, r13, r0);
        goto L_0x0174;
    L_0x016e:
        r11.fixStartGap(r12, r13, r4);
        r11.fixEndGap(r12, r13, r0);
    L_0x0174:
        if (r14 == 0) goto L_0x01a1;
    L_0x0176:
        r14 = r13.isPreLayout();
        if (r14 != 0) goto L_0x01a1;
    L_0x017c:
        r14 = r11.mGapStrategy;
        if (r14 == 0) goto L_0x0192;
    L_0x0180:
        r14 = r11.getChildCount();
        if (r14 <= 0) goto L_0x0192;
    L_0x0186:
        r14 = r11.mLaidOutInvalidFullSpan;
        if (r14 != 0) goto L_0x0190;
    L_0x018a:
        r14 = r11.hasGapsToFix();
        if (r14 == 0) goto L_0x0192;
    L_0x0190:
        r14 = 1;
        goto L_0x0193;
    L_0x0192:
        r14 = 0;
    L_0x0193:
        if (r14 == 0) goto L_0x01a1;
    L_0x0195:
        r14 = r11.mCheckForGapsRunnable;
        r11.removeCallbacks(r14);
        r14 = r11.checkForGaps();
        if (r14 == 0) goto L_0x01a1;
    L_0x01a0:
        goto L_0x01a2;
    L_0x01a1:
        r4 = 0;
    L_0x01a2:
        r14 = r13.isPreLayout();
        if (r14 == 0) goto L_0x01ad;
    L_0x01a8:
        r14 = r11.mAnchorInfo;
        r14.a();
    L_0x01ad:
        r14 = r1.c;
        r11.mLastLayoutFromEnd = r14;
        r14 = r11.isLayoutRTL();
        r11.mLastLayoutRTL = r14;
        if (r4 == 0) goto L_0x01c1;
    L_0x01b9:
        r14 = r11.mAnchorInfo;
        r14.a();
        r14 = 0;
        goto L_0x0001;
    L_0x01c1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, boolean):void");
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
            this.mSpans[i].a(view);
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
                    if (this.mSpans[i2].a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.mSpanCount; i3++) {
                    this.mSpans[i3].d();
                }
            } else if (layoutParams.mSpan.a.size() != 1) {
                layoutParams.mSpan.d();
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
                    if (this.mSpans[i3].a.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                while (i2 < this.mSpanCount) {
                    this.mSpans[i2].e();
                    i2++;
                }
            } else if (layoutParams.mSpan.a.size() != 1) {
                layoutParams.mSpan.e();
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
                            i3 = (-((this.mSpanCount - 1) - layoutParams.mSpan.e)) * this.mSizePerSpan;
                            i4 = (-((this.mSpanCount - 1) - layoutParams.mSpan.e)) * i;
                        } else {
                            i3 = layoutParams.mSpan.e * this.mSizePerSpan;
                            i4 = layoutParams.mSpan.e * i;
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
            if (!this.mSpans[i3].a.isEmpty()) {
                updateRemainingSpans(this.mSpans[i3], i, i2);
            }
        }
    }

    private boolean updateAnchorFromChildren(State state, a aVar) {
        aVar.a = this.mLastLayoutFromEnd ? findLastReferenceChildPosition(state.getItemCount()) : findFirstReferenceChildPosition(state.getItemCount());
        aVar.b = Integer.MIN_VALUE;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.updateLayoutState(int, android.support.v7.widget.RecyclerView$State):void");
    }

    private void updateRemainingSpans(c cVar, int i, int i2) {
        int i3 = cVar.d;
        if (i == -1) {
            if (cVar.a() + i3 <= i2) {
                this.mRemainingSpans.set(cVar.e, false);
            }
            return;
        }
        if (cVar.b() - i3 >= i2) {
            this.mRemainingSpans.set(cVar.e, false);
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
        int b = this.mSpans[0].b(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean areAllStartsEqual() {
        int a = this.mSpans[0].a(Integer.MIN_VALUE);
        for (int i = 1; i < this.mSpanCount; i++) {
            if (this.mSpans[i].a(Integer.MIN_VALUE) != a) {
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
            this.mLazySpanLookup.a();
        } else if (!this.mLaidOutInvalidFullSpan) {
            return false;
        } else {
            int i = this.mShouldReverseLayout ? -1 : 1;
            firstChildPosition++;
            a a = this.mLazySpanLookup.a(lastChildPosition, firstChildPosition, i);
            if (a == null) {
                this.mLaidOutInvalidFullSpan = false;
                this.mLazySpanLookup.a(firstChildPosition);
                return false;
            }
            a a2 = this.mLazySpanLookup.a(lastChildPosition, a.a, -i);
            if (a2 == null) {
                this.mLazySpanLookup.a(a.a);
            } else {
                this.mLazySpanLookup.a(a2.a + 1);
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
                int a;
                if (this.mLayoutState.d == -1) {
                    i4 = this.mLayoutState.f;
                    a = this.mSpans[i2].a(this.mLayoutState.f);
                } else {
                    i4 = this.mSpans[i2].b(this.mLayoutState.g);
                    a = this.mLayoutState.g;
                }
                i4 -= a;
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0059 in {1, 9, 10, 11, 12, 14} preds:[]
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
    public int[] findFirstCompletelyVisibleItemPositions(int[] r7) {
        /*
        r6 = this;
        if (r7 != 0) goto L_0x0007;
        r7 = r6.mSpanCount;
        r7 = new int[r7];
        goto L_0x000c;
        r0 = r7.length;
        r1 = r6.mSpanCount;
        if (r0 < r1) goto L_0x003a;
        r0 = 0;
        r1 = 0;
        r2 = r6.mSpanCount;
        if (r1 >= r2) goto L_0x0039;
        r2 = r6.mSpans;
        r2 = r2[r1];
        r3 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r3 = r3.mReverseLayout;
        r4 = 1;
        if (r3 == 0) goto L_0x002a;
        r3 = r2.a;
        r3 = r3.size();
        r3 = r3 - r4;
        r5 = -1;
        r2 = r2.a(r3, r5, r4);
        goto L_0x0034;
        r3 = r2.a;
        r3 = r3.size();
        r2 = r2.a(r0, r3, r4);
        r7[r1] = r2;
        r1 = r1 + 1;
        goto L_0x000e;
        return r7;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r6.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r7 = r7.length;
        r1.append(r7);
        r7 = r1.toString();
        r0.<init>(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(int[]):int[]");
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0059 in {1, 9, 10, 11, 12, 14} preds:[]
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
    public int[] findFirstVisibleItemPositions(int[] r6) {
        /*
        r5 = this;
        if (r6 != 0) goto L_0x0007;
        r6 = r5.mSpanCount;
        r6 = new int[r6];
        goto L_0x000c;
        r0 = r6.length;
        r1 = r5.mSpanCount;
        if (r0 < r1) goto L_0x003a;
        r0 = 0;
        r1 = 0;
        r2 = r5.mSpanCount;
        if (r1 >= r2) goto L_0x0039;
        r2 = r5.mSpans;
        r2 = r2[r1];
        r3 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r3 = r3.mReverseLayout;
        if (r3 == 0) goto L_0x002a;
        r3 = r2.a;
        r3 = r3.size();
        r3 = r3 + -1;
        r4 = -1;
        r2 = r2.a(r3, r4, r0);
        goto L_0x0034;
        r3 = r2.a;
        r3 = r3.size();
        r2 = r2.a(r0, r3, r0);
        r6[r1] = r2;
        r1 = r1 + 1;
        goto L_0x000e;
        return r6;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r5.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r6 = r6.length;
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.findFirstVisibleItemPositions(int[]):int[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0059 in {1, 9, 10, 11, 12, 14} preds:[]
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
    public int[] findLastCompletelyVisibleItemPositions(int[] r7) {
        /*
        r6 = this;
        if (r7 != 0) goto L_0x0007;
        r7 = r6.mSpanCount;
        r7 = new int[r7];
        goto L_0x000c;
        r0 = r7.length;
        r1 = r6.mSpanCount;
        if (r0 < r1) goto L_0x003a;
        r0 = 0;
        r1 = 0;
        r2 = r6.mSpanCount;
        if (r1 >= r2) goto L_0x0039;
        r2 = r6.mSpans;
        r2 = r2[r1];
        r3 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r3 = r3.mReverseLayout;
        r4 = 1;
        if (r3 == 0) goto L_0x0028;
        r3 = r2.a;
        r3 = r3.size();
        r2 = r2.a(r0, r3, r4);
        goto L_0x0034;
        r3 = r2.a;
        r3 = r3.size();
        r3 = r3 - r4;
        r5 = -1;
        r2 = r2.a(r3, r5, r4);
        r7[r1] = r2;
        r1 = r1 + 1;
        goto L_0x000e;
        return r7;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r6.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r7 = r7.length;
        r1.append(r7);
        r7 = r1.toString();
        r0.<init>(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(int[]):int[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0059 in {1, 9, 10, 11, 12, 14} preds:[]
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
    public int[] findLastVisibleItemPositions(int[] r6) {
        /*
        r5 = this;
        if (r6 != 0) goto L_0x0007;
        r6 = r5.mSpanCount;
        r6 = new int[r6];
        goto L_0x000c;
        r0 = r6.length;
        r1 = r5.mSpanCount;
        if (r0 < r1) goto L_0x003a;
        r0 = 0;
        r1 = 0;
        r2 = r5.mSpanCount;
        if (r1 >= r2) goto L_0x0039;
        r2 = r5.mSpans;
        r2 = r2[r1];
        r3 = android.support.v7.widget.StaggeredGridLayoutManager.this;
        r3 = r3.mReverseLayout;
        if (r3 == 0) goto L_0x0027;
        r3 = r2.a;
        r3 = r3.size();
        r2 = r2.a(r0, r3, r0);
        goto L_0x0034;
        r3 = r2.a;
        r3 = r3.size();
        r3 = r3 + -1;
        r4 = -1;
        r2 = r2.a(r3, r4, r0);
        r6[r1] = r2;
        r1 = r1 + 1;
        goto L_0x000e;
        return r6;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Provided int[]'s size must be more than or equal to span count. Expected:";
        r1.<init>(r2);
        r2 = r5.mSpanCount;
        r1.append(r2);
        r2 = ", array size:";
        r1.append(r2);
        r6 = r6.length;
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.findLastVisibleItemPositions(int[]):int[]");
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
        r8 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) r8;
        r9 = r8.mSpan;
        r9 = r9.e;
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
        r9 = r9.e;
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
        r9 = (android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) r9;
        r8 = r8.mSpan;
        r8 = r8.e;
        r9 = r9.mSpan;
        r9 = r9.e;
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.hasGapsToFix():android.view.View");
    }

    public void invalidateSpanAssignments() {
        this.mLazySpanLookup.a();
        requestLayout();
    }

    public boolean isAutoMeasureEnabled() {
        return this.mGapStrategy != 0;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].d(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.mSpanCount; i2++) {
            this.mSpans[i2].d(i);
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        removeCallbacks(this.mCheckForGapsRunnable);
        for (int i = 0; i < this.mSpanCount; i++) {
            this.mSpans[i].c();
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
        View a;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.mFullSpan;
        c cVar = layoutParams.mSpan;
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
            View a2 = cVar.a(lastChildPosition, i);
            if (!(a2 == null || a2 == view)) {
                return a2;
            }
        }
        int i3;
        if (preferLastSpan(i)) {
            for (i3 = this.mSpanCount - 1; i3 >= 0; i3--) {
                a = this.mSpans[i3].a(lastChildPosition, i);
                if (a != null && a != view) {
                    return a;
                }
            }
        } else {
            for (i3 = 0; i3 < this.mSpanCount; i3++) {
                a = this.mSpans[i3].a(lastChildPosition, i);
                if (a != null && a != view) {
                    return a;
                }
            }
        }
        Object obj = (this.mReverseLayout ^ 1) == (i == -1 ? 1 : 0) ? 1 : null;
        if (!z) {
            a = findViewByPosition(obj != null ? cVar.f() : cVar.g());
            if (!(a == null || a == view)) {
                return a;
            }
        }
        if (preferLastSpan(i)) {
            for (i = this.mSpanCount - 1; i >= 0; i--) {
                if (i != cVar.e) {
                    a = findViewByPosition(obj != null ? this.mSpans[i].f() : this.mSpans[i].g());
                    if (!(a == null || a == view)) {
                        return a;
                    }
                }
            }
        } else {
            while (i2 < this.mSpanCount) {
                View findViewByPosition = findViewByPosition(obj != null ? this.mSpans[i2].f() : this.mSpans[i2].g());
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
            kkVar.a(defpackage.kk.b.a(i3, i2, spanIndex, i, layoutParams2.mFullSpan));
            return;
        }
        super.onInitializeAccessibilityNodeInfoForItem(view, kkVar);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        handleUpdate(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.mLazySpanLookup.a();
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
        savedState.mReverseLayout = this.mReverseLayout;
        savedState.mAnchorLayoutFromEnd = this.mLastLayoutFromEnd;
        savedState.mLastLayoutRTL = this.mLastLayoutRTL;
        b bVar = this.mLazySpanLookup;
        int i = 0;
        if (bVar == null || bVar.a == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = this.mLazySpanLookup.a;
            savedState.mSpanLookupSize = savedState.mSpanLookup.length;
            savedState.mFullSpanItems = this.mLazySpanLookup.b;
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
                    i2 = this.mSpans[i].b(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding();
                    } else {
                        savedState.mSpanOffsets[i] = i2;
                        i++;
                    }
                } else {
                    i2 = this.mSpans[i].a(Integer.MIN_VALUE);
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
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
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
            this.mSpans = new c[this.mSpanCount];
            for (i = 0; i < this.mSpanCount; i++) {
                this.mSpans[i] = new c(i);
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
    public boolean updateAnchorFromPendingData(State state, a aVar) {
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
                            aVar.a = this.mShouldReverseLayout ? getLastChildPosition() : getFirstChildPosition();
                            int endAfterPadding;
                            if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                                if (aVar.c) {
                                    endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPendingScrollPositionOffset;
                                    decoratedEnd = this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                                } else {
                                    endAfterPadding = this.mPrimaryOrientation.getStartAfterPadding() + this.mPendingScrollPositionOffset;
                                    decoratedEnd = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition);
                                }
                                aVar.b = endAfterPadding - decoratedEnd;
                                return true;
                            } else if (this.mPrimaryOrientation.getDecoratedMeasurement(findViewByPosition) > this.mPrimaryOrientation.getTotalSpace()) {
                                aVar.b = aVar.c ? this.mPrimaryOrientation.getEndAfterPadding() : this.mPrimaryOrientation.getStartAfterPadding();
                                return true;
                            } else {
                                endAfterPadding = this.mPrimaryOrientation.getDecoratedStart(findViewByPosition) - this.mPrimaryOrientation.getStartAfterPadding();
                                if (endAfterPadding < 0) {
                                    aVar.b = -endAfterPadding;
                                    return true;
                                }
                                endAfterPadding = this.mPrimaryOrientation.getEndAfterPadding() - this.mPrimaryOrientation.getDecoratedEnd(findViewByPosition);
                                if (endAfterPadding < 0) {
                                    aVar.b = endAfterPadding;
                                    return true;
                                }
                                aVar.b = Integer.MIN_VALUE;
                            }
                        } else {
                            aVar.a = this.mPendingScrollPosition;
                            decoratedEnd = this.mPendingScrollPositionOffset;
                            if (decoratedEnd == Integer.MIN_VALUE) {
                                if (calculateScrollDirectionForPosition(aVar.a) == 1) {
                                    z = true;
                                }
                                aVar.c = z;
                                aVar.b();
                            } else {
                                aVar.b = aVar.c ? StaggeredGridLayoutManager.this.mPrimaryOrientation.getEndAfterPadding() - decoratedEnd : StaggeredGridLayoutManager.this.mPrimaryOrientation.getStartAfterPadding() + decoratedEnd;
                            }
                            aVar.d = true;
                        }
                    } else {
                        aVar.b = Integer.MIN_VALUE;
                        aVar.a = this.mPendingScrollPosition;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public void updateAnchorInfoForLayout(State state, a aVar) {
        if (!updateAnchorFromPendingData(state, aVar) && !updateAnchorFromChildren(state, aVar)) {
            aVar.b();
            aVar.a = 0;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updateMeasureSpecs(int i) {
        this.mSizePerSpan = i / this.mSpanCount;
        this.mFullSizeSpec = MeasureSpec.makeMeasureSpec(i, this.mSecondaryOrientation.getMode());
    }
}
