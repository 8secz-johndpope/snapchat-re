package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.jk;
import defpackage.jp;
import defpackage.kb;
import defpackage.ma;
import defpackage.mm;
import defpackage.mp;
import defpackage.mz;
import defpackage.nb;
import defpackage.ng;
import defpackage.nm;
import defpackage.nq;
import defpackage.op;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private static final String TAG = "Toolbar";
    private defpackage.ng.a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private op mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private a mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private defpackage.mz.a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final android.support.v7.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private nq mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class LayoutParams extends defpackage.lj.a {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.mViewType = 0;
            this.gravity = i3;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((defpackage.lj.a) layoutParams);
            this.mViewType = 0;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.mViewType = 0;
            copyMarginsFromCompat(marginLayoutParams);
        }

        public LayoutParams(defpackage.lj.a aVar) {
            super(aVar);
            this.mViewType = 0;
        }

        /* Access modifiers changed, original: 0000 */
        public void copyMarginsFromCompat(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class SavedState extends jk {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int expandedMenuItemId;
        boolean isOverflowOpen;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen);
        }
    }

    class a implements ng {
        nb a;
        private mz b;

        a() {
        }

        public final void a(Context context, mz mzVar) {
            mz mzVar2 = this.b;
            if (mzVar2 != null) {
                nb nbVar = this.a;
                if (nbVar != null) {
                    mzVar2.b(nbVar);
                }
            }
            this.b = mzVar;
        }

        public final void a(mz mzVar, boolean z) {
        }

        public final void a(defpackage.ng.a aVar) {
        }

        public final boolean a() {
            return false;
        }

        public final boolean a(nm nmVar) {
            return false;
        }

        public final void b(boolean z) {
            if (this.a != null) {
                mz mzVar = this.b;
                Object obj = null;
                if (mzVar != null) {
                    int size = mzVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.b.getItem(i) == this.a) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    c(this.a);
                }
            }
        }

        public final boolean b(nb nbVar) {
            Toolbar toolbar;
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            ViewParent viewParent = Toolbar.this;
            if (parent != viewParent) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewParent.mCollapseButtonView);
                }
                toolbar = Toolbar.this;
                toolbar.addView(toolbar.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = nbVar.getActionView();
            this.a = nbVar;
            parent = Toolbar.this.mExpandedActionView.getParent();
            viewParent = Toolbar.this;
            if (parent != viewParent) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewParent.mExpandedActionView);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.gravity = 8388611 | (Toolbar.this.mButtonGravity & 112);
                generateDefaultLayoutParams.mViewType = 2;
                Toolbar.this.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                toolbar = Toolbar.this;
                toolbar.addView(toolbar.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            nbVar.d(true);
            if (Toolbar.this.mExpandedActionView instanceof mm) {
                ((mm) Toolbar.this.mExpandedActionView).onActionViewExpanded();
            }
            return true;
        }

        public final boolean c(nb nbVar) {
            if (Toolbar.this.mExpandedActionView instanceof mm) {
                ((mm) Toolbar.this.mExpandedActionView).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mCollapseButtonView);
            toolbar = Toolbar.this;
            toolbar.mExpandedActionView = null;
            toolbar.addChildrenForExpandedActionView();
            this.a = null;
            Toolbar.this.requestLayout();
            nbVar.d(false);
            return true;
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new android.support.v7.widget.ActionMenuView.OnMenuItemClickListener() {
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return Toolbar.this.mOnMenuItemClickListener != null ? Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem) : false;
            }
        };
        this.mShowOverflowMenuRunnable = new Runnable() {
            public final void run() {
                Toolbar.this.showOverflowMenu();
            }
        };
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, defpackage.lx.a.A, i, 0);
        this.mTitleTextAppearance = obtainStyledAttributes.getResourceId(27, 0);
        this.mSubtitleTextAppearance = obtainStyledAttributes.getResourceId(18, 0);
        this.mGravity = obtainStyledAttributes.getInteger(0, this.mGravity);
        this.mButtonGravity = obtainStyledAttributes.getInteger(2, 48);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(21, 0);
        if (obtainStyledAttributes.hasValue(26)) {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(26, dimensionPixelOffset);
        }
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset;
        }
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(22, -1);
        if (dimensionPixelOffset >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset;
        }
        this.mMaxButtonHeight = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        ensureContentInsets();
        this.mContentInsets.b(dimensionPixelSize, dimensionPixelSize2);
        if (!(dimensionPixelOffset == Integer.MIN_VALUE && dimensionPixelOffset2 == Integer.MIN_VALUE)) {
            this.mContentInsets.a(dimensionPixelOffset, dimensionPixelOffset2);
        }
        this.mContentInsetStartWithNavigation = obtainStyledAttributes.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = obtainStyledAttributes.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.mCollapseIcon = obtainStyledAttributes.getDrawable(4);
        this.mCollapseDescription = obtainStyledAttributes.getText(3);
        CharSequence text = obtainStyledAttributes.getText(20);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        text = obtainStyledAttributes.getText(17);
        if (!TextUtils.isEmpty(text)) {
            setSubtitle(text);
        }
        this.mPopupContext = getContext();
        setPopupTheme(obtainStyledAttributes.getResourceId(16, 0));
        Drawable drawable = obtainStyledAttributes.getDrawable(15);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        text = obtainStyledAttributes.getText(14);
        if (!TextUtils.isEmpty(text)) {
            setNavigationContentDescription(text);
        }
        drawable = obtainStyledAttributes.getDrawable(11);
        if (drawable != null) {
            setLogo(drawable);
        }
        text = obtainStyledAttributes.getText(12);
        if (!TextUtils.isEmpty(text)) {
            setLogoDescription(text);
        }
        if (obtainStyledAttributes.hasValue(28)) {
            setTitleTextColor(obtainStyledAttributes.getColor(28, -1));
        }
        if (obtainStyledAttributes.hasValue(19)) {
            setSubtitleTextColor(obtainStyledAttributes.getColor(19, -1));
        }
        obtainStyledAttributes.recycle();
    }

    private void addCustomViewsWithGravity(List<View> list, int i) {
        Object obj = kb.a.j(this) == 1 ? 1 : null;
        int childCount = getChildCount();
        i = jp.a(i, kb.a.j(this));
        list.clear();
        View childAt;
        if (obj != null) {
            for (childCount--; childCount >= 0; childCount--) {
                childAt = getChildAt(childCount);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == i) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            childAt = getChildAt(i2);
            LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams2.gravity) == i) {
                list.add(childAt);
            }
        }
    }

    private void addSystemView(View view, boolean z) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        generateDefaultLayoutParams.mViewType = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.mHiddenViews.add(view);
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new op();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            mz mzVar = (mz) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new a();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            mzVar.a(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            this.mMenuView = new ActionMenuView(getContext());
            this.mMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i) {
        int j = kb.a.j(this);
        i = jp.a(i, j) & 7;
        return (i == 1 || i == 3 || i == 5) ? i : j == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        i = i > 0 ? (measuredHeight - i) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i;
        }
        i = getPaddingTop();
        childVerticalGravity = getPaddingBottom();
        int height = getHeight();
        int i2 = (((height - i) - childVerticalGravity) - measuredHeight) / 2;
        if (i2 < layoutParams.topMargin) {
            i2 = layoutParams.topMargin;
        } else {
            height = (((height - childVerticalGravity) - measuredHeight) - i2) - i;
            if (height < layoutParams.bottomMargin) {
                i2 = Math.max(0, i2 - (layoutParams.bottomMargin - height));
            }
        }
        return i + i2;
    }

    private int getChildVerticalGravity(int i) {
        i &= 112;
        return (i == 16 || i == 48 || i == 80) ? i : this.mGravity & 112;
    }

    private int getHorizontalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return (VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin) + (VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin);
    }

    private MenuInflater getMenuInflater() {
        return new mp(getContext());
    }

    private int getVerticalMargins(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        i2 = 0;
        i = 0;
        while (i2 < size) {
            View view = (View) list.get(i2);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i4;
            i4 = layoutParams.rightMargin - i3;
            i3 = Math.max(0, i5);
            int max = Math.max(0, i4);
            i5 = Math.max(0, -i5);
            i += (i3 + view.getMeasuredWidth()) + max;
            i2++;
            i3 = Math.max(0, -i4);
            i4 = i5;
        }
        return i;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private static boolean isCustomView(View view) {
        return ((LayoutParams) view.getLayoutParams()).mViewType == 0;
    }

    private int layoutChildLeft(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        i += Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i, childTop, i + i2, view.getMeasuredHeight() + childTop);
        return i + (i2 + layoutParams.rightMargin);
    }

    private int layoutChildRight(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        i -= Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int childTop = getChildTop(view, i2);
        i2 = view.getMeasuredWidth();
        view.layout(i - i2, childTop, i, view.getMeasuredHeight() + childTop);
        return i - (i2 + layoutParams.leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        i = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        i2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        i3 = MeasureSpec.getMode(i2);
        if (i3 != AudioPlayer.INFINITY_LOOP_COUNT && i5 >= 0) {
            if (i3 != 0) {
                i5 = Math.min(MeasureSpec.getSize(i2), i5);
            }
            i2 = MeasureSpec.makeMeasureSpec(i5, AudioPlayer.INFINITY_LOOP_COUNT);
        }
        view.measure(i, i2);
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* Access modifiers changed, original: 0000 */
    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView((View) this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.mMenuView;
            if (actionMenuView != null && actionMenuView.isOverflowReserved()) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void collapseActionView() {
        a aVar = this.mExpandedMenuPresenter;
        nb nbVar = aVar == null ? null : aVar.a;
        if (nbVar != null) {
            nbVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            this.mCollapseButtonView = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    Toolbar.this.collapseActionView();
                }
            });
        }
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof defpackage.lj.a ? new LayoutParams((defpackage.lj.a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getContentInsetEnd() {
        op opVar = this.mContentInsets;
        return opVar != null ? opVar.g ? opVar.a : opVar.b : 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        op opVar = this.mContentInsets;
        return opVar != null ? opVar.a : 0;
    }

    public int getContentInsetRight() {
        op opVar = this.mContentInsets;
        return opVar != null ? opVar.b : 0;
    }

    public int getContentInsetStart() {
        op opVar = this.mContentInsets;
        return opVar != null ? opVar.g ? opVar.b : opVar.a : 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    public int getCurrentContentInsetEnd() {
        /*
        r3 = this;
        r0 = r3.mMenuView;
        r1 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x0005:
        r0 = r0.peekMenu();
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r0 = r0.hasVisibleItems();
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        r0 = 1;
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        if (r0 == 0) goto L_0x0025;
    L_0x0016:
        r0 = r3.getContentInsetEnd();
        r2 = r3.mContentInsetEndWithActions;
        r1 = java.lang.Math.max(r2, r1);
        r0 = java.lang.Math.max(r0, r1);
        return r0;
    L_0x0025:
        r0 = r3.getContentInsetEnd();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return kb.a.j(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return kb.a.j(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        return imageView != null ? imageView.getDrawable() : null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        return imageView != null ? imageView.getContentDescription() : null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        return imageButton != null ? imageButton.getContentDescription() : null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        return imageButton != null ? imageButton.getDrawable() : null;
    }

    /* Access modifiers changed, original: 0000 */
    public nq getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    /* Access modifiers changed, original: 0000 */
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        a aVar = this.mExpandedMenuPresenter;
        return (aVar == null || aVar.a == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        TextView textView = this.mTitleTextView;
        if (textView == null) {
            return false;
        }
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a9 A:{LOOP_END, LOOP:0: B:101:0x02a7->B:102:0x02a9} */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02cb A:{LOOP_END, LOOP:1: B:104:0x02c9->B:105:0x02cb} */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0305 A:{LOOP_END, LOOP:2: B:112:0x0303->B:113:0x0305} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bc  */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        r18 = this;
        r0 = r18;
        r1 = defpackage.kb.a;
        r1 = r1.j(r0);
        r2 = 1;
        r3 = 0;
        if (r1 != r2) goto L_0x000e;
    L_0x000c:
        r1 = 1;
        goto L_0x000f;
    L_0x000e:
        r1 = 0;
    L_0x000f:
        r4 = r18.getWidth();
        r5 = r18.getHeight();
        r6 = r18.getPaddingLeft();
        r7 = r18.getPaddingRight();
        r8 = r18.getPaddingTop();
        r9 = r18.getPaddingBottom();
        r10 = r4 - r7;
        r11 = r0.mTempMargins;
        r11[r2] = r3;
        r11[r3] = r3;
        r12 = defpackage.kb.a;
        r12 = r12.f(r0);
        if (r12 < 0) goto L_0x003e;
    L_0x0037:
        r13 = r23 - r21;
        r12 = java.lang.Math.min(r12, r13);
        goto L_0x003f;
    L_0x003e:
        r12 = 0;
    L_0x003f:
        r13 = r0.mNavButtonView;
        r13 = r0.shouldLayout(r13);
        if (r13 == 0) goto L_0x0059;
    L_0x0047:
        if (r1 == 0) goto L_0x0052;
    L_0x0049:
        r13 = r0.mNavButtonView;
        r13 = r0.layoutChildRight(r13, r10, r11, r12);
        r14 = r13;
        r13 = r6;
        goto L_0x005b;
    L_0x0052:
        r13 = r0.mNavButtonView;
        r13 = r0.layoutChildLeft(r13, r6, r11, r12);
        goto L_0x005a;
    L_0x0059:
        r13 = r6;
    L_0x005a:
        r14 = r10;
    L_0x005b:
        r15 = r0.mCollapseButtonView;
        r15 = r0.shouldLayout(r15);
        if (r15 == 0) goto L_0x0072;
    L_0x0063:
        if (r1 == 0) goto L_0x006c;
    L_0x0065:
        r15 = r0.mCollapseButtonView;
        r14 = r0.layoutChildRight(r15, r14, r11, r12);
        goto L_0x0072;
    L_0x006c:
        r15 = r0.mCollapseButtonView;
        r13 = r0.layoutChildLeft(r15, r13, r11, r12);
    L_0x0072:
        r15 = r0.mMenuView;
        r15 = r0.shouldLayout(r15);
        if (r15 == 0) goto L_0x0089;
    L_0x007a:
        if (r1 == 0) goto L_0x0083;
    L_0x007c:
        r15 = r0.mMenuView;
        r13 = r0.layoutChildLeft(r15, r13, r11, r12);
        goto L_0x0089;
    L_0x0083:
        r15 = r0.mMenuView;
        r14 = r0.layoutChildRight(r15, r14, r11, r12);
    L_0x0089:
        r15 = r18.getCurrentContentInsetLeft();
        r16 = r18.getCurrentContentInsetRight();
        r2 = r15 - r13;
        r2 = java.lang.Math.max(r3, r2);
        r11[r3] = r2;
        r2 = r10 - r14;
        r2 = r16 - r2;
        r2 = java.lang.Math.max(r3, r2);
        r17 = 1;
        r11[r17] = r2;
        r2 = java.lang.Math.max(r13, r15);
        r10 = r10 - r16;
        r10 = java.lang.Math.min(r14, r10);
        r13 = r0.mExpandedActionView;
        r13 = r0.shouldLayout(r13);
        if (r13 == 0) goto L_0x00c6;
    L_0x00b7:
        if (r1 == 0) goto L_0x00c0;
    L_0x00b9:
        r13 = r0.mExpandedActionView;
        r10 = r0.layoutChildRight(r13, r10, r11, r12);
        goto L_0x00c6;
    L_0x00c0:
        r13 = r0.mExpandedActionView;
        r2 = r0.layoutChildLeft(r13, r2, r11, r12);
    L_0x00c6:
        r13 = r0.mLogoView;
        r13 = r0.shouldLayout(r13);
        if (r13 == 0) goto L_0x00dd;
    L_0x00ce:
        if (r1 == 0) goto L_0x00d7;
    L_0x00d0:
        r13 = r0.mLogoView;
        r10 = r0.layoutChildRight(r13, r10, r11, r12);
        goto L_0x00dd;
    L_0x00d7:
        r13 = r0.mLogoView;
        r2 = r0.layoutChildLeft(r13, r2, r11, r12);
    L_0x00dd:
        r13 = r0.mTitleTextView;
        r13 = r0.shouldLayout(r13);
        r14 = r0.mSubtitleTextView;
        r14 = r0.shouldLayout(r14);
        if (r13 == 0) goto L_0x0104;
    L_0x00eb:
        r15 = r0.mTitleTextView;
        r15 = r15.getLayoutParams();
        r15 = (android.support.v7.widget.Toolbar.LayoutParams) r15;
        r3 = r15.topMargin;
        r22 = r7;
        r7 = r0.mTitleTextView;
        r7 = r7.getMeasuredHeight();
        r3 = r3 + r7;
        r7 = r15.bottomMargin;
        r3 = r3 + r7;
        r7 = 0;
        r3 = r3 + r7;
        goto L_0x0107;
    L_0x0104:
        r22 = r7;
        r3 = 0;
    L_0x0107:
        if (r14 == 0) goto L_0x0121;
    L_0x0109:
        r7 = r0.mSubtitleTextView;
        r7 = r7.getLayoutParams();
        r7 = (android.support.v7.widget.Toolbar.LayoutParams) r7;
        r15 = r7.topMargin;
        r16 = r4;
        r4 = r0.mSubtitleTextView;
        r4 = r4.getMeasuredHeight();
        r15 = r15 + r4;
        r4 = r7.bottomMargin;
        r15 = r15 + r4;
        r3 = r3 + r15;
        goto L_0x0123;
    L_0x0121:
        r16 = r4;
    L_0x0123:
        if (r13 != 0) goto L_0x012f;
    L_0x0125:
        if (r14 == 0) goto L_0x0128;
    L_0x0127:
        goto L_0x012f;
    L_0x0128:
        r17 = r6;
        r21 = r12;
    L_0x012c:
        r7 = 0;
        goto L_0x0299;
    L_0x012f:
        if (r13 == 0) goto L_0x0134;
    L_0x0131:
        r4 = r0.mTitleTextView;
        goto L_0x0136;
    L_0x0134:
        r4 = r0.mSubtitleTextView;
    L_0x0136:
        if (r14 == 0) goto L_0x013b;
    L_0x0138:
        r7 = r0.mSubtitleTextView;
        goto L_0x013d;
    L_0x013b:
        r7 = r0.mTitleTextView;
    L_0x013d:
        r4 = r4.getLayoutParams();
        r4 = (android.support.v7.widget.Toolbar.LayoutParams) r4;
        r7 = r7.getLayoutParams();
        r7 = (android.support.v7.widget.Toolbar.LayoutParams) r7;
        if (r13 == 0) goto L_0x0153;
    L_0x014b:
        r15 = r0.mTitleTextView;
        r15 = r15.getMeasuredWidth();
        if (r15 > 0) goto L_0x015d;
    L_0x0153:
        if (r14 == 0) goto L_0x0161;
    L_0x0155:
        r15 = r0.mSubtitleTextView;
        r15 = r15.getMeasuredWidth();
        if (r15 <= 0) goto L_0x0161;
    L_0x015d:
        r17 = r6;
        r15 = 1;
        goto L_0x0164;
    L_0x0161:
        r17 = r6;
        r15 = 0;
    L_0x0164:
        r6 = r0.mGravity;
        r6 = r6 & 112;
        r21 = r12;
        r12 = 48;
        if (r6 == r12) goto L_0x01ad;
    L_0x016e:
        r12 = 80;
        if (r6 == r12) goto L_0x01a1;
    L_0x0172:
        r6 = r5 - r8;
        r6 = r6 - r9;
        r6 = r6 - r3;
        r6 = r6 / 2;
        r12 = r4.topMargin;
        r23 = r2;
        r2 = r0.mTitleMarginTop;
        r12 = r12 + r2;
        if (r6 >= r12) goto L_0x0188;
    L_0x0181:
        r2 = r4.topMargin;
        r3 = r0.mTitleMarginTop;
        r6 = r2 + r3;
        goto L_0x019f;
    L_0x0188:
        r5 = r5 - r9;
        r5 = r5 - r3;
        r5 = r5 - r6;
        r5 = r5 - r8;
        r2 = r4.bottomMargin;
        r3 = r0.mTitleMarginBottom;
        r2 = r2 + r3;
        if (r5 >= r2) goto L_0x019f;
    L_0x0193:
        r2 = r7.bottomMargin;
        r3 = r0.mTitleMarginBottom;
        r2 = r2 + r3;
        r2 = r2 - r5;
        r6 = r6 - r2;
        r2 = 0;
        r6 = java.lang.Math.max(r2, r6);
    L_0x019f:
        r8 = r8 + r6;
        goto L_0x01ba;
    L_0x01a1:
        r23 = r2;
        r5 = r5 - r9;
        r2 = r7.bottomMargin;
        r5 = r5 - r2;
        r2 = r0.mTitleMarginBottom;
        r5 = r5 - r2;
        r8 = r5 - r3;
        goto L_0x01ba;
    L_0x01ad:
        r23 = r2;
        r2 = r18.getPaddingTop();
        r3 = r4.topMargin;
        r2 = r2 + r3;
        r3 = r0.mTitleMarginTop;
        r8 = r2 + r3;
    L_0x01ba:
        if (r1 == 0) goto L_0x022f;
    L_0x01bc:
        if (r15 == 0) goto L_0x01c2;
    L_0x01be:
        r3 = r0.mTitleMarginStart;
        r1 = 1;
        goto L_0x01c4;
    L_0x01c2:
        r1 = 1;
        r3 = 0;
    L_0x01c4:
        r2 = r11[r1];
        r3 = r3 - r2;
        r2 = 0;
        r4 = java.lang.Math.max(r2, r3);
        r10 = r10 - r4;
        r3 = -r3;
        r3 = java.lang.Math.max(r2, r3);
        r11[r1] = r3;
        if (r13 == 0) goto L_0x01fa;
    L_0x01d6:
        r1 = r0.mTitleTextView;
        r1 = r1.getLayoutParams();
        r1 = (android.support.v7.widget.Toolbar.LayoutParams) r1;
        r2 = r0.mTitleTextView;
        r2 = r2.getMeasuredWidth();
        r2 = r10 - r2;
        r3 = r0.mTitleTextView;
        r3 = r3.getMeasuredHeight();
        r3 = r3 + r8;
        r4 = r0.mTitleTextView;
        r4.layout(r2, r8, r10, r3);
        r4 = r0.mTitleMarginEnd;
        r2 = r2 - r4;
        r1 = r1.bottomMargin;
        r8 = r3 + r1;
        goto L_0x01fb;
    L_0x01fa:
        r2 = r10;
    L_0x01fb:
        if (r14 == 0) goto L_0x0223;
    L_0x01fd:
        r1 = r0.mSubtitleTextView;
        r1 = r1.getLayoutParams();
        r1 = (android.support.v7.widget.Toolbar.LayoutParams) r1;
        r3 = r1.topMargin;
        r8 = r8 + r3;
        r3 = r0.mSubtitleTextView;
        r3 = r3.getMeasuredWidth();
        r3 = r10 - r3;
        r4 = r0.mSubtitleTextView;
        r4 = r4.getMeasuredHeight();
        r4 = r4 + r8;
        r5 = r0.mSubtitleTextView;
        r5.layout(r3, r8, r10, r4);
        r3 = r0.mTitleMarginEnd;
        r3 = r10 - r3;
        r1 = r1.bottomMargin;
        goto L_0x0224;
    L_0x0223:
        r3 = r10;
    L_0x0224:
        if (r15 == 0) goto L_0x022b;
    L_0x0226:
        r1 = java.lang.Math.min(r2, r3);
        r10 = r1;
    L_0x022b:
        r2 = r23;
        goto L_0x012c;
    L_0x022f:
        if (r15 == 0) goto L_0x0234;
    L_0x0231:
        r3 = r0.mTitleMarginStart;
        goto L_0x0235;
    L_0x0234:
        r3 = 0;
    L_0x0235:
        r7 = 0;
        r1 = r11[r7];
        r3 = r3 - r1;
        r1 = java.lang.Math.max(r7, r3);
        r2 = r23 + r1;
        r1 = -r3;
        r1 = java.lang.Math.max(r7, r1);
        r11[r7] = r1;
        if (r13 == 0) goto L_0x026b;
    L_0x0248:
        r1 = r0.mTitleTextView;
        r1 = r1.getLayoutParams();
        r1 = (android.support.v7.widget.Toolbar.LayoutParams) r1;
        r3 = r0.mTitleTextView;
        r3 = r3.getMeasuredWidth();
        r3 = r3 + r2;
        r4 = r0.mTitleTextView;
        r4 = r4.getMeasuredHeight();
        r4 = r4 + r8;
        r5 = r0.mTitleTextView;
        r5.layout(r2, r8, r3, r4);
        r5 = r0.mTitleMarginEnd;
        r3 = r3 + r5;
        r1 = r1.bottomMargin;
        r8 = r4 + r1;
        goto L_0x026c;
    L_0x026b:
        r3 = r2;
    L_0x026c:
        if (r14 == 0) goto L_0x0292;
    L_0x026e:
        r1 = r0.mSubtitleTextView;
        r1 = r1.getLayoutParams();
        r1 = (android.support.v7.widget.Toolbar.LayoutParams) r1;
        r4 = r1.topMargin;
        r8 = r8 + r4;
        r4 = r0.mSubtitleTextView;
        r4 = r4.getMeasuredWidth();
        r4 = r4 + r2;
        r5 = r0.mSubtitleTextView;
        r5 = r5.getMeasuredHeight();
        r5 = r5 + r8;
        r6 = r0.mSubtitleTextView;
        r6.layout(r2, r8, r4, r5);
        r5 = r0.mTitleMarginEnd;
        r4 = r4 + r5;
        r1 = r1.bottomMargin;
        goto L_0x0293;
    L_0x0292:
        r4 = r2;
    L_0x0293:
        if (r15 == 0) goto L_0x0299;
    L_0x0295:
        r2 = java.lang.Math.max(r3, r4);
    L_0x0299:
        r1 = r0.mTempViews;
        r3 = 3;
        r0.addCustomViewsWithGravity(r1, r3);
        r1 = r0.mTempViews;
        r1 = r1.size();
        r3 = r2;
        r2 = 0;
    L_0x02a7:
        if (r2 >= r1) goto L_0x02ba;
    L_0x02a9:
        r4 = r0.mTempViews;
        r4 = r4.get(r2);
        r4 = (android.view.View) r4;
        r12 = r21;
        r3 = r0.layoutChildLeft(r4, r3, r11, r12);
        r2 = r2 + 1;
        goto L_0x02a7;
    L_0x02ba:
        r12 = r21;
        r1 = r0.mTempViews;
        r2 = 5;
        r0.addCustomViewsWithGravity(r1, r2);
        r1 = r0.mTempViews;
        r1 = r1.size();
        r2 = 0;
    L_0x02c9:
        if (r2 >= r1) goto L_0x02da;
    L_0x02cb:
        r4 = r0.mTempViews;
        r4 = r4.get(r2);
        r4 = (android.view.View) r4;
        r10 = r0.layoutChildRight(r4, r10, r11, r12);
        r2 = r2 + 1;
        goto L_0x02c9;
    L_0x02da:
        r1 = r0.mTempViews;
        r2 = 1;
        r0.addCustomViewsWithGravity(r1, r2);
        r1 = r0.mTempViews;
        r1 = r0.getViewListMeasuredWidth(r1, r11);
        r4 = r16 - r17;
        r4 = r4 - r22;
        r4 = r4 / 2;
        r6 = r17 + r4;
        r2 = r1 / 2;
        r2 = r6 - r2;
        r1 = r1 + r2;
        if (r2 >= r3) goto L_0x02f6;
    L_0x02f5:
        goto L_0x02fd;
    L_0x02f6:
        if (r1 <= r10) goto L_0x02fc;
    L_0x02f8:
        r1 = r1 - r10;
        r3 = r2 - r1;
        goto L_0x02fd;
    L_0x02fc:
        r3 = r2;
    L_0x02fd:
        r1 = r0.mTempViews;
        r1 = r1.size();
    L_0x0303:
        if (r7 >= r1) goto L_0x0314;
    L_0x0305:
        r2 = r0.mTempViews;
        r2 = r2.get(r7);
        r2 = (android.view.View) r2;
        r3 = r0.layoutChildLeft(r2, r3, r11, r12);
        r7 = r7 + 1;
        goto L_0x0303;
    L_0x0314:
        r1 = r0.mTempViews;
        r1.clear();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        int max;
        int combineMeasuredStates;
        int measuredHeight;
        int combineMeasuredStates2;
        int[] iArr = this.mTempMargins;
        if (ViewUtils.isLayoutRtl(this)) {
            i3 = 1;
            i4 = 0;
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            max = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            combineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            max = 0;
            combineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            max = Math.max(max, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = Math.max(currentContentInsetStart, measuredWidth) + 0;
        iArr[i3] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i, max2, i2, 0, this.mMaxButtonHeight);
            measuredWidth = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            max = Math.max(max, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth = 0;
        }
        currentContentInsetStart = getCurrentContentInsetEnd();
        i3 = max2 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[i4] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mExpandedActionView)) {
            i3 += measureChildCollapseMargins(this.mExpandedActionView, i, i3, i2, 0, iArr);
            max = Math.max(max, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            i3 += measureChildCollapseMargins(this.mLogoView, i, i3, i2, 0, iArr);
            max = Math.max(max, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        i4 = getChildCount();
        max2 = max;
        max = i3;
        for (i3 = 0; i3 < i4; i3++) {
            View childAt = getChildAt(i3);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType == 0 && shouldLayout(childAt)) {
                max += measureChildCollapseMargins(childAt, i, max, i2, 0, iArr);
                max2 = Math.max(max2, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, childAt.getMeasuredState());
            }
        }
        i3 = this.mTitleMarginTop + this.mTitleMarginBottom;
        i4 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i, max + i4, i2, i3, iArr);
            measuredWidth = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.mTitleTextView.getMeasuredState());
            combineMeasuredStates = measuredWidth;
        } else {
            combineMeasuredStates2 = combineMeasuredStates;
            combineMeasuredStates = 0;
            measuredHeight = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            int i5 = measuredHeight + i3;
            i3 = combineMeasuredStates2;
            combineMeasuredStates = Math.max(combineMeasuredStates, measureChildCollapseMargins(this.mSubtitleTextView, i, max + i4, i2, i5, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            combineMeasuredStates2 = View.combineMeasuredStates(i3, this.mSubtitleTextView.getMeasuredState());
        } else {
            i3 = combineMeasuredStates2;
        }
        max += combineMeasuredStates;
        measuredWidth = Math.max(max2, measuredHeight) + (getPaddingTop() + getPaddingBottom());
        int i6 = i;
        currentContentInsetStart = View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i6, -16777216 & combineMeasuredStates2);
        measuredWidth = View.resolveSizeAndState(Math.max(measuredWidth, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16);
        if (shouldCollapse()) {
            measuredWidth = 0;
        }
        setMeasuredDimension(currentContentInsetStart, measuredWidth);
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            ActionMenuView actionMenuView = this.mMenuView;
            Menu peekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
            if (!(savedState.expandedMenuItemId == 0 || this.mExpandedMenuPresenter == null || peekMenu == null)) {
                MenuItem findItem = peekMenu.findItem(savedState.expandedMenuItemId);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (savedState.isOverflowOpen) {
                postShowOverflowMenu();
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        ensureContentInsets();
        op opVar = this.mContentInsets;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != opVar.g) {
            opVar.g = z;
            if (!opVar.h) {
                opVar.a = opVar.e;
                opVar.b = opVar.f;
            } else if (z) {
                opVar.a = opVar.d != Integer.MIN_VALUE ? opVar.d : opVar.e;
                opVar.b = opVar.c != Integer.MIN_VALUE ? opVar.c : opVar.f;
            } else {
                opVar.a = opVar.c != Integer.MIN_VALUE ? opVar.c : opVar.e;
                opVar.b = opVar.d != Integer.MIN_VALUE ? opVar.d : opVar.f;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        a aVar = this.mExpandedMenuPresenter;
        if (!(aVar == null || aVar.a == null)) {
            savedState.expandedMenuItemId = this.mExpandedMenuPresenter.a.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).mViewType == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.b(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        ensureContentInsets();
        this.mContentInsets.a(i, i2);
    }

    public void setLogo(int i) {
        setLogo(ma.b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        ImageView imageView;
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(mz mzVar, nq nqVar) {
        if (mzVar != null || this.mMenuView != null) {
            ensureMenuView();
            mz peekMenu = this.mMenuView.peekMenu();
            if (peekMenu != mzVar) {
                if (peekMenu != null) {
                    peekMenu.b(this.mOuterActionMenuPresenter);
                    peekMenu.b(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new a();
                }
                nqVar.k = true;
                if (mzVar != null) {
                    mzVar.a((ng) nqVar, this.mPopupContext);
                    mzVar.a(this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    nqVar.a(this.mPopupContext, null);
                    this.mExpandedMenuPresenter.a(this.mPopupContext, null);
                    nqVar.b(true);
                    this.mExpandedMenuPresenter.b(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(nqVar);
                this.mOuterActionMenuPresenter = nqVar;
            }
        }
    }

    public void setMenuCallbacks(defpackage.ng.a aVar, defpackage.mz.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ma.b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        ImageButton imageButton;
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
                return;
            }
            this.mPopupContext = new ContextThemeWrapper(getContext(), i);
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        TextView textView;
        if (TextUtils.isEmpty(charSequence)) {
            textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                this.mSubtitleTextView = new AppCompatTextView(context);
                this.mSubtitleTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mSubtitleTextColor;
                if (i2 != 0) {
                    this.mSubtitleTextView.setTextColor(i2);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        }
        textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.mSubtitleTextColor = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        if (TextUtils.isEmpty(charSequence)) {
            textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                this.mTitleTextView = new AppCompatTextView(context);
                this.mTitleTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                int i2 = this.mTitleTextColor;
                if (i2 != 0) {
                    this.mTitleTextView.setTextColor(i2);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        }
        textView = this.mTitleTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.mTitleTextColor = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }
}
