package com.snap.ui.view.viewpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abkw.a;
import defpackage.abtp;
import defpackage.jz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final int[] ATTRS = new int[]{16842901, 16842904, 16842903};
    private static final int DEFAULT_ROUND_CORNER_RADIUS_DP = 6;
    private static final int SYSTEM_TEXT_COLOR = 1;
    private static final int SYSTEM_TEXT_SIZE = 0;
    private static final Integer TAB_VIEW_TYPE_ICON = Integer.valueOf(2);
    private static final Integer TAB_VIEW_TYPE_TEXT = Integer.valueOf(1);
    private static final Integer TAB_VIEW_TYPE_TEXT_BADGING = Integer.valueOf(4);
    private static final Integer TAB_VIEW_TYPE_TEXT_GROUP = Integer.valueOf(3);
    private static final String TAG = "PagerSlidingTabStrip";
    private static final int WHITE_ARGB = -1;
    protected int currentPosition;
    protected float currentPositionOffset;
    private final LayoutParams defaultTabLayoutParams;
    public e delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private final Paint dividerPaint;
    private int dividerWidth;
    private final LayoutParams expandedTabLayoutParams;
    private int inactiveTabTextColor;
    private int indicatorColor;
    protected int indicatorCornerRadii;
    protected int indicatorHeight;
    protected int indicatorPaddingBottom;
    protected final List<Integer> indicatorSizes;
    private int lastScrollX;
    private Locale locale;
    private final List<PagerSlidingTabPositionRange> mAdapterItemInPrimaryTabPositions;
    private final ArgbEvaluator mArgbEvaluator;
    private final Path mCrop;
    private final AtomicReference<PagerSlidingTabSource> mParentTab;
    private final List<PagerSlidingTabPositionRange> mPrimaryTabInAdapterItemPositions;
    private final float[] mRadii;
    private final RectF mRectF;
    private final boolean mRtlLayout;
    private final Rect mTextBounds;
    protected float nonSelectedAlpha;
    private final PageListener pageListener;
    private final OnScrollListener pageScrollListener;
    protected ViewPager pager;
    private final Paint rectPaint;
    protected RecyclerView recyclerView;
    private int roundCornerRadiusDp;
    private int scrollOffset;
    protected float selectedAlpha;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    protected int tabCount;
    private int tabPadding;
    private int tabPaddingBottom;
    private PagerSlidingTabSourceProvider tabSourceProvider;
    private int tabStripBackgroundColor;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    protected final LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    protected int underlineHeight;

    static class GlobalLayoutListener implements OnGlobalLayoutListener {
        private final WeakReference<ViewPager> mPagerRef;
        private final WeakReference<PagerSlidingTabStrip> mTabStripRef;

        private GlobalLayoutListener(PagerSlidingTabStrip pagerSlidingTabStrip, ViewPager viewPager) {
            this.mTabStripRef = new WeakReference(pagerSlidingTabStrip);
            this.mPagerRef = new WeakReference(viewPager);
        }

        /* synthetic */ GlobalLayoutListener(PagerSlidingTabStrip pagerSlidingTabStrip, ViewPager viewPager, AnonymousClass1 anonymousClass1) {
            this(pagerSlidingTabStrip, viewPager);
        }

        public void onGlobalLayout() {
            View view = (PagerSlidingTabStrip) this.mTabStripRef.get();
            if (view != null) {
                abtp.a(view, (OnGlobalLayoutListener) this);
                ViewPager viewPager = (ViewPager) this.mPagerRef.get();
                if (viewPager != null) {
                    int b = viewPager.b();
                    view.setCurrentPosition(b);
                    view.scrollToChild(b, MapboxConstants.MINIMUM_ZOOM);
                }
            }
        }
    }

    public interface IconTabProvider {
        Pair<Integer, Integer> getPageIconResIdPair(int i);
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPosition;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPosition = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, AnonymousClass1 anonymousClass1) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPosition);
        }
    }

    public interface TabWithBadgingProvider {
        String getBadgeText(int i);

        String getText(int i);
    }

    public interface TextGroupTabProvider {
        int getMainTextSize();

        Pair<String, String> getTextPair(int i);
    }

    class PageListener implements e {
        private PageListener() {
        }

        /* synthetic */ PageListener(PagerSlidingTabStrip pagerSlidingTabStrip, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.scrollToChild(pagerSlidingTabStrip.pager.b(), MapboxConstants.MINIMUM_ZOOM);
            }
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip.currentPositionOffset = f;
            pagerSlidingTabStrip.setCurrentPosition(i);
            if (i >= 0) {
                PagerSlidingTabStrip.this.scrollToChild(i, f);
            }
            PagerSlidingTabStrip.this.invalidate();
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrolled(i, f, i2);
            }
        }

        public void onPageSelected(int i) {
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageSelected(i);
            }
        }
    }

    class PageScrollListener extends OnScrollListener {
        private PageScrollListener() {
        }

        /* synthetic */ PageScrollListener(PagerSlidingTabStrip pagerSlidingTabStrip, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                i = recyclerView.getWidth();
                if (i != 0) {
                    PagerSlidingTabStrip.this.scrollToChild(((PagerSlidingTabStrip.this.mRtlLayout ? recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollOffset() : recyclerView.computeHorizontalScrollOffset()) / i) - PagerSlidingTabStrip.this.mRtlLayout, MapboxConstants.MINIMUM_ZOOM);
                }
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            i = recyclerView.getWidth();
            if (i != 0) {
                i2 = PagerSlidingTabStrip.this.mRtlLayout ? recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollOffset() : recyclerView.computeHorizontalScrollOffset();
                int access$300 = (i2 / i) - PagerSlidingTabStrip.this.mRtlLayout;
                float f = (((float) (i2 % i)) * 1.0f) / ((float) i);
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.currentPositionOffset = f;
                pagerSlidingTabStrip.setCurrentPosition(access$300);
                PagerSlidingTabStrip.this.scrollToChild(access$300, f);
                PagerSlidingTabStrip.this.invalidate();
            }
        }
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        super(context, attributeSet, i);
        this.mRectF = new RectF();
        this.pageListener = new PageListener(this, null);
        this.pageScrollListener = new PageScrollListener(this, null);
        boolean z = false;
        this.currentPosition = 0;
        this.currentPositionOffset = MapboxConstants.MINIMUM_ZOOM;
        this.mTextBounds = new Rect();
        this.roundCornerRadiusDp = 6;
        this.indicatorColor = -10066330;
        this.underlineColor = 436207616;
        this.dividerColor = 436207616;
        this.tabStripBackgroundColor = -1;
        this.shouldExpand = false;
        this.textAllCaps = true;
        this.scrollOffset = 52;
        this.indicatorHeight = 8;
        this.indicatorPaddingBottom = 5;
        this.indicatorCornerRadii = 0;
        this.underlineHeight = 2;
        this.dividerPadding = 12;
        this.tabPadding = 24;
        this.dividerWidth = 1;
        this.selectedAlpha = 1.0f;
        this.nonSelectedAlpha = 0.5f;
        this.tabTextSize = 12;
        this.tabTextColor = -10066330;
        this.inactiveTabTextColor = Integer.MIN_VALUE;
        this.mArgbEvaluator = new ArgbEvaluator();
        this.tabTypeface = null;
        this.tabTypefaceStyle = 1;
        this.lastScrollX = 0;
        this.shadowRadius = 3.0f;
        this.shadowDx = MapboxConstants.MINIMUM_ZOOM;
        this.shadowDy = MapboxConstants.MINIMUM_ZOOM;
        double alpha = (double) Color.alpha(-1);
        Double.isNaN(alpha);
        this.shadowColor = Color.argb((int) (alpha * 0.7d), 0, 0, 0);
        this.tabPaddingBottom = 0;
        this.tabBackgroundResId = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        this.indicatorSizes = new ArrayList();
        this.mPrimaryTabInAdapterItemPositions = new ArrayList();
        this.mAdapterItemInPrimaryTabPositions = new ArrayList();
        this.mParentTab = new AtomicReference();
        this.tabsContainer = new LinearLayout(context2);
        this.tabsContainer.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.scrollOffset = (int) TypedValue.applyDimension(1, (float) this.scrollOffset, displayMetrics);
        this.indicatorHeight = (int) TypedValue.applyDimension(1, (float) this.indicatorHeight, displayMetrics);
        this.indicatorPaddingBottom = (int) TypedValue.applyDimension(1, (float) this.indicatorPaddingBottom, displayMetrics);
        this.indicatorCornerRadii = (int) TypedValue.applyDimension(1, (float) this.indicatorCornerRadii, displayMetrics);
        this.underlineHeight = (int) TypedValue.applyDimension(1, (float) this.underlineHeight, displayMetrics);
        this.dividerPadding = (int) TypedValue.applyDimension(1, (float) this.dividerPadding, displayMetrics);
        this.tabPadding = (int) TypedValue.applyDimension(1, (float) this.tabPadding, displayMetrics);
        this.tabPaddingBottom = (int) TypedValue.applyDimension(1, (float) this.tabPaddingBottom, displayMetrics);
        this.dividerWidth = (int) TypedValue.applyDimension(1, (float) this.dividerWidth, displayMetrics);
        this.tabTextSize = (int) TypedValue.applyDimension(2, (float) this.tabTextSize, displayMetrics);
        this.shadowRadius = TypedValue.applyDimension(1, this.shadowRadius, displayMetrics);
        this.shadowDx = TypedValue.applyDimension(1, this.shadowDx, displayMetrics);
        this.shadowDy = TypedValue.applyDimension(1, this.shadowDy, displayMetrics);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, ATTRS);
        this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(0, this.tabTextSize);
        this.tabTextColor = obtainStyledAttributes.getColor(1, this.tabTextColor);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, a.c);
        this.roundCornerRadiusDp = obtainStyledAttributes2.getInt(8, this.roundCornerRadiusDp);
        this.indicatorColor = obtainStyledAttributes2.getColor(3, this.indicatorColor);
        this.underlineColor = obtainStyledAttributes2.getColor(22, this.underlineColor);
        this.dividerColor = obtainStyledAttributes2.getColor(0, this.dividerColor);
        this.tabStripBackgroundColor = obtainStyledAttributes2.getColor(19, this.tabStripBackgroundColor);
        this.indicatorHeight = obtainStyledAttributes2.getDimensionPixelSize(5, this.indicatorHeight);
        this.indicatorPaddingBottom = obtainStyledAttributes2.getDimensionPixelSize(6, this.indicatorPaddingBottom);
        this.indicatorCornerRadii = obtainStyledAttributes2.getDimensionPixelSize(4, this.indicatorCornerRadii);
        this.underlineHeight = obtainStyledAttributes2.getDimensionPixelSize(23, this.underlineHeight);
        this.dividerPadding = obtainStyledAttributes2.getDimensionPixelSize(1, this.dividerPadding);
        this.tabPadding = obtainStyledAttributes2.getDimensionPixelSize(18, this.tabPadding);
        this.tabPaddingBottom = obtainStyledAttributes2.getDimensionPixelSize(17, this.tabPaddingBottom);
        this.tabBackgroundResId = obtainStyledAttributes2.getResourceId(16, this.tabBackgroundResId);
        this.shouldExpand = obtainStyledAttributes2.getBoolean(15, this.shouldExpand);
        this.scrollOffset = obtainStyledAttributes2.getDimensionPixelSize(9, this.scrollOffset);
        this.textAllCaps = obtainStyledAttributes2.getBoolean(21, this.textAllCaps);
        this.selectedAlpha = obtainStyledAttributes2.getFloat(10, this.selectedAlpha);
        this.nonSelectedAlpha = obtainStyledAttributes2.getFloat(7, this.nonSelectedAlpha);
        this.shadowRadius = obtainStyledAttributes2.getFloat(14, this.shadowRadius);
        this.shadowDx = obtainStyledAttributes2.getFloat(12, this.shadowDx);
        this.shadowDy = obtainStyledAttributes2.getFloat(13, this.shadowDy);
        this.shadowColor = obtainStyledAttributes2.getColor(11, this.shadowColor);
        this.inactiveTabTextColor = obtainStyledAttributes2.getColor(2, this.inactiveTabTextColor);
        obtainStyledAttributes2.recycle();
        this.rectPaint = new Paint();
        this.rectPaint.setAntiAlias(true);
        this.rectPaint.setStyle(Style.FILL);
        this.dividerPaint = new Paint();
        this.dividerPaint.setAntiAlias(true);
        this.dividerPaint.setStrokeWidth((float) this.dividerWidth);
        this.defaultTabLayoutParams = new LayoutParams(-2, -1);
        this.expandedTabLayoutParams = new LayoutParams(-2, -1, 1.0f);
        if (this.locale == null) {
            this.locale = getResources().getConfiguration().locale;
        }
        this.mCrop = new Path();
        float f = ((float) this.roundCornerRadiusDp) * getResources().getDisplayMetrics().density;
        this.mRadii = new float[]{f, f, f, f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            z = true;
        }
        this.mRtlLayout = z;
    }

    private void addIconTab(int i, int i2, int i3) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setTag(TAB_VIEW_TYPE_ICON);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setImageResource(i2);
        frameLayout.addView(imageView);
        imageView = new ImageView(getContext());
        imageView.setScaleType(ScaleType.CENTER);
        imageView.setImageResource(i3);
        frameLayout.addView(imageView);
        addTab(i, frameLayout);
        this.indicatorSizes.add(Integer.valueOf(Math.max(getResources().getDrawable(i2).getIntrinsicWidth(), getResources().getDrawable(i3).getIntrinsicWidth())));
    }

    private void addTab(int i, View view) {
        final int adapterItemPosition = getAdapterItemPosition(i);
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (PagerSlidingTabStrip.this.pager != null) {
                    PagerSlidingTabStrip.this.pager.b(adapterItemPosition);
                }
                if (PagerSlidingTabStrip.this.recyclerView != null) {
                    PagerSlidingTabStrip.this.recyclerView.smoothScrollToPosition(adapterItemPosition);
                }
            }
        });
        adapterItemPosition = this.tabPadding;
        view.setPadding(adapterItemPosition, 0, adapterItemPosition, this.tabPaddingBottom);
        view.setBackgroundResource(this.tabBackgroundResId);
        this.tabsContainer.addView(view, i, this.shouldExpand ? this.expandedTabLayoutParams : this.defaultTabLayoutParams);
    }

    private void addTextGroupTab(int i, TextGroupTabProvider textGroupTabProvider) {
        Pair textPair = textGroupTabProvider.getTextPair(i);
        String str = (String) textPair.first;
        String str2 = (String) textPair.second;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setTag(TAB_VIEW_TYPE_TEXT_GROUP);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        TextView createTextView = createTextView(str, textGroupTabProvider.getMainTextSize());
        TextView createTextView2 = createTextView(str2, this.tabTextSize);
        int i2 = 0;
        createTextView.setIncludeFontPadding(false);
        createTextView2.setIncludeFontPadding(false);
        linearLayout.addView(createTextView);
        linearLayout.addView(createTextView2);
        if (TextUtils.isEmpty(str)) {
            i2 = 8;
        }
        createTextView.setVisibility(i2);
        addTab(i, linearLayout);
        measureTextTabIndicatorWidth(createTextView2);
    }

    private void addTextTab(int i, String str) {
        TextView createTextView = createTextView(str, this.tabTextSize);
        createTextView.setTag(TAB_VIEW_TYPE_TEXT);
        addTab(i, createTextView);
        measureTextTabIndicatorWidth(createTextView);
    }

    private void addTextWithBadgingTab(int i, TabWithBadgingProvider tabWithBadgingProvider) {
        TabWithBadging tabWithBadging = new TabWithBadging(getContext());
        tabWithBadging.setTag(TAB_VIEW_TYPE_TEXT_BADGING);
        String badgeText = tabWithBadgingProvider.getBadgeText(i);
        tabWithBadging.setTitleText(tabWithBadgingProvider.getText(i));
        tabWithBadging.setBadgingText(badgeText);
        styleTextView(tabWithBadging.getTitleTextView(), this.tabTextSize);
        addTab(i, tabWithBadging);
        measureTextTabIndicatorWidth(tabWithBadging.getTitleTextView());
    }

    private TextView createTextView(String str, int i) {
        SnapFontTextView snapFontTextView = new SnapFontTextView(getContext());
        snapFontTextView.setText(str);
        styleTextView(snapFontTextView, i);
        return snapFontTextView;
    }

    private int getAdapterItemPosition(int i) {
        int i2 = 0;
        if (i >= this.mPrimaryTabInAdapterItemPositions.size()) {
            return 0;
        }
        PagerSlidingTabSource pagerSlidingTabSource = (PagerSlidingTabSource) this.mParentTab.get();
        if (pagerSlidingTabSource != null) {
            i2 = pagerSlidingTabSource.getAdapterItemPositionRange().getStartPosition();
        }
        return ((PagerSlidingTabPositionRange) this.mPrimaryTabInAdapterItemPositions.get(i)).getStartPosition() + i2;
    }

    private String getTabTitle(PagerSlidingTabSource pagerSlidingTabSource) {
        if (pagerSlidingTabSource == null) {
            return "";
        }
        String title = pagerSlidingTabSource.getTitle();
        if (title != null) {
            return title;
        }
        Integer titleResId = pagerSlidingTabSource.getTitleResId();
        return titleResId == null ? "Tab" : getContext().getString(titleResId.intValue());
    }

    private void measureTextTabIndicatorWidth(TextView textView) {
        TextPaint paint = textView.getPaint();
        String charSequence = textView.getText().toString();
        if (this.textAllCaps) {
            charSequence = charSequence.toUpperCase(Locale.getDefault());
        }
        paint.getTextBounds(charSequence, 0, charSequence.length(), this.mTextBounds);
        this.indicatorSizes.add(Integer.valueOf(this.mTextBounds.width()));
    }

    private void populateAsPrimaryTab() {
        PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider = this.tabSourceProvider;
        if (pagerSlidingTabSourceProvider == null || !pagerSlidingTabSourceProvider.isTabSourceProviderEnabled()) {
            jz jzVar = this.pager.b;
            if (jzVar instanceof PagerSlidingTabSourceProvider) {
                PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider2 = (PagerSlidingTabSourceProvider) jzVar;
                if (pagerSlidingTabSourceProvider2.isTabSourceProviderEnabled()) {
                    populateAsPrimaryTabFromSourceProvider(pagerSlidingTabSourceProvider2);
                    return;
                }
            }
            populateAsPrimaryTabFromStandardPagerAdapter(jzVar);
            return;
        }
        populateAsPrimaryTabFromSourceProvider(pagerSlidingTabSourceProvider);
    }

    private void populateAsPrimaryTabFromSourceProvider(PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider) {
        List<PagerSlidingTabSource> tabs = pagerSlidingTabSourceProvider.getTabs();
        this.tabCount = tabs.size();
        int i = 0;
        int i2 = 0;
        for (PagerSlidingTabSource pagerSlidingTabSource : tabs) {
            List childTabs = pagerSlidingTabSource.getChildTabs();
            int max = Math.max(1, childTabs.size()) + i;
            this.mPrimaryTabInAdapterItemPositions.add(new PagerSlidingTabPositionRange(i, max - 1));
            if (childTabs.isEmpty()) {
                this.mAdapterItemInPrimaryTabPositions.add(new PagerSlidingTabPositionRange(i2, i2 + 1));
            } else {
                i = 0;
                while (i < childTabs.size()) {
                    this.mAdapterItemInPrimaryTabPositions.add(new PagerSlidingTabPositionRange(i2, (i == childTabs.size() - 1 ? 1 : 0) + i2));
                    i++;
                }
            }
            addTextTab(i2, getTabTitle(pagerSlidingTabSource));
            i2++;
            i = max;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    private void populateAsPrimaryTabFromStandardPagerAdapter(defpackage.jz r7) {
        /*
        r6 = this;
        r0 = r7.getCount();
        r6.tabCount = r0;
        r0 = 0;
        r1 = 0;
    L_0x0008:
        r2 = r6.tabCount;
        if (r1 >= r2) goto L_0x0070;
    L_0x000c:
        r2 = r6.mPrimaryTabInAdapterItemPositions;
        r3 = new com.snap.ui.view.viewpagerindicator.PagerSlidingTabPositionRange;
        r3.<init>(r1, r1);
        r2.add(r3);
        r2 = r6.mAdapterItemInPrimaryTabPositions;
        r3 = new com.snap.ui.view.viewpagerindicator.PagerSlidingTabPositionRange;
        r4 = r1 + 1;
        r3.<init>(r1, r4);
        r2.add(r3);
        r2 = r7 instanceof com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.TextGroupTabProvider;
        if (r2 == 0) goto L_0x002d;
    L_0x0026:
        r2 = r7;
        r2 = (com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.TextGroupTabProvider) r2;
        r6.addTextGroupTab(r1, r2);
        goto L_0x006e;
    L_0x002d:
        r2 = r7 instanceof com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.TabWithBadgingProvider;
        if (r2 == 0) goto L_0x0038;
    L_0x0031:
        r2 = r7;
        r2 = (com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.TabWithBadgingProvider) r2;
        r6.addTextWithBadgingTab(r1, r2);
        goto L_0x006e;
    L_0x0038:
        r2 = r7.getPageTitle(r1);
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 == 0) goto L_0x0064;
    L_0x0042:
        r3 = r7 instanceof com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.IconTabProvider;
        if (r3 == 0) goto L_0x0064;
    L_0x0046:
        r3 = r7;
        r3 = (com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.IconTabProvider) r3;
        r3 = r3.getPageIconResIdPair(r1);
        if (r3 == 0) goto L_0x0064;
    L_0x004f:
        r5 = r3.first;
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r3 = r3.second;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r6.addIconTab(r1, r5, r3);
        r3 = 1;
        goto L_0x0065;
    L_0x0064:
        r3 = 0;
    L_0x0065:
        if (r3 != 0) goto L_0x006e;
    L_0x0067:
        r2 = r2.toString();
        r6.addTextTab(r1, r2);
    L_0x006e:
        r1 = r4;
        goto L_0x0008;
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.populateAsPrimaryTabFromStandardPagerAdapter(jz):void");
    }

    private void populateAsSecondaryTab(PagerSlidingTabSource pagerSlidingTabSource) {
        List childTabs = pagerSlidingTabSource.getChildTabs();
        this.tabCount = childTabs.size();
        int i = 0;
        while (i < childTabs.size()) {
            this.mPrimaryTabInAdapterItemPositions.add(new PagerSlidingTabPositionRange(i, i));
            int i2 = i + 1;
            this.mAdapterItemInPrimaryTabPositions.add(new PagerSlidingTabPositionRange(i, i2));
            addTextTab(i, getTabTitle((PagerSlidingTabSource) childTabs.get(i)));
            i = i2;
        }
    }

    private void styleTextView(TextView textView, int i) {
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor);
        textView.setTextSize(0, (float) i);
        textView.setTypeface(this.tabTypeface, this.tabTypefaceStyle);
        if (this.textAllCaps) {
            textView.setAllCaps(true);
        }
    }

    /* JADX WARNING: Missing block: B:13:0x006a, code skipped:
            if (r8 == (r0 + 1)) goto L_0x006c;
     */
    private void updateTabStyles() {
        /*
        r13 = this;
        r0 = r13.currentPosition;
        r0 = r13.getTabPosition(r0);
        r1 = r13.currentPosition;
        r1 = r13.getNextTabPosition(r1);
        r2 = 0;
        if (r0 != r1) goto L_0x0011;
    L_0x000f:
        r1 = 0;
        goto L_0x0013;
    L_0x0011:
        r1 = r13.currentPositionOffset;
    L_0x0013:
        r3 = r13.mArgbEvaluator;
        r4 = r13.tabTextColor;
        r4 = java.lang.Integer.valueOf(r4);
        r5 = r13.inactiveTabTextColor;
        r5 = java.lang.Integer.valueOf(r5);
        r3 = r3.evaluate(r1, r4, r5);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r4 = r13.mArgbEvaluator;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = r5 - r1;
        r7 = r13.tabTextColor;
        r7 = java.lang.Integer.valueOf(r7);
        r8 = r13.inactiveTabTextColor;
        r8 = java.lang.Integer.valueOf(r8);
        r4 = r4.evaluate(r6, r7, r8);
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r7 = 0;
        r8 = 0;
    L_0x0049:
        r9 = r13.tabCount;
        if (r8 >= r9) goto L_0x00fd;
    L_0x004d:
        r9 = r13.tabsContainer;
        r9 = r9.getChildAt(r8);
        r10 = TAB_VIEW_TYPE_TEXT;
        r11 = r9.getTag();
        r10 = r10.equals(r11);
        if (r10 == 0) goto L_0x0078;
    L_0x005f:
        r9 = (android.widget.TextView) r9;
        if (r8 != r0) goto L_0x0068;
    L_0x0063:
        r9.setTextColor(r3);
        goto L_0x00f9;
    L_0x0068:
        r10 = r0 + 1;
        if (r8 != r10) goto L_0x0071;
    L_0x006c:
        r9.setTextColor(r4);
        goto L_0x00f9;
    L_0x0071:
        r10 = r13.inactiveTabTextColor;
        r9.setTextColor(r10);
        goto L_0x00f9;
    L_0x0078:
        r10 = TAB_VIEW_TYPE_ICON;
        r11 = r9.getTag();
        r10 = r10.equals(r11);
        r11 = 1;
        if (r10 == 0) goto L_0x00aa;
    L_0x0085:
        r9 = (android.view.ViewGroup) r9;
        r10 = r9.getChildAt(r7);
        r9 = r9.getChildAt(r11);
        if (r8 != r0) goto L_0x0098;
    L_0x0091:
        r10.setAlpha(r6);
        r9.setAlpha(r1);
        goto L_0x00f9;
    L_0x0098:
        r11 = r0 + 1;
        if (r8 != r11) goto L_0x00a3;
    L_0x009c:
        r10.setAlpha(r1);
        r9.setAlpha(r6);
        goto L_0x00f9;
    L_0x00a3:
        r10.setAlpha(r2);
        r9.setAlpha(r5);
        goto L_0x00f9;
    L_0x00aa:
        r10 = TAB_VIEW_TYPE_TEXT_GROUP;
        r12 = r9.getTag();
        r10 = r10.equals(r12);
        if (r10 == 0) goto L_0x00d8;
    L_0x00b6:
        r9 = (android.view.ViewGroup) r9;
        r10 = r9.getChildAt(r7);
        r10 = (android.widget.TextView) r10;
        r9 = r9.getChildAt(r11);
        r9 = (android.widget.TextView) r9;
        if (r8 != r0) goto L_0x00ca;
    L_0x00c6:
        r10.setTextColor(r3);
        goto L_0x0063;
    L_0x00ca:
        r11 = r0 + 1;
        if (r8 != r11) goto L_0x00d2;
    L_0x00ce:
        r10.setTextColor(r4);
        goto L_0x006c;
    L_0x00d2:
        r11 = r13.inactiveTabTextColor;
        r10.setTextColor(r11);
        goto L_0x0071;
    L_0x00d8:
        r10 = TAB_VIEW_TYPE_TEXT_BADGING;
        r11 = r9.getTag();
        r10 = r10.equals(r11);
        if (r10 == 0) goto L_0x00f9;
    L_0x00e4:
        r9 = (com.snap.ui.view.viewpagerindicator.TabWithBadging) r9;
        if (r8 != r0) goto L_0x00ec;
    L_0x00e8:
        r9.setTextColor(r3);
        goto L_0x00f9;
    L_0x00ec:
        r10 = r0 + 1;
        if (r8 != r10) goto L_0x00f4;
    L_0x00f0:
        r9.setTextColor(r4);
        goto L_0x00f9;
    L_0x00f4:
        r10 = r13.inactiveTabTextColor;
        r9.setTextColor(r10);
    L_0x00f9:
        r8 = r8 + 1;
        goto L_0x0049;
    L_0x00fd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.viewpagerindicator.PagerSlidingTabStrip.updateTabStyles():void");
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dispatchDrawInternally(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDrawInternally(Canvas canvas) {
        if (!(isInEditMode() || this.tabCount == 0)) {
            int height = getHeight();
            this.rectPaint.setColor(this.indicatorColor);
            int tabPosition = getTabPosition(this.currentPosition);
            View childAt = this.tabsContainer.getChildAt(tabPosition);
            if (childAt != null) {
                float left = (float) childAt.getLeft();
                float right = (float) childAt.getRight();
                int nextTabPosition = getNextTabPosition(this.currentPosition);
                View childAt2 = nextTabPosition < this.tabCount ? this.tabsContainer.getChildAt(nextTabPosition) : null;
                if (this.currentPositionOffset > MapboxConstants.MINIMUM_ZOOM && childAt2 != null) {
                    float left2 = (float) childAt2.getLeft();
                    float right2 = (float) childAt2.getRight();
                    float f = this.currentPositionOffset;
                    left = (left2 * f) + ((1.0f - f) * left);
                    right = (right2 * f) + ((1.0f - f) * right);
                }
                left += (float) getPaddingLeft();
                left += ((right + ((float) getPaddingLeft())) - left) / 2.0f;
                float indicatorWidth = (childAt2 != null ? ((1.0f - this.currentPositionOffset) * ((float) getIndicatorWidth(tabPosition))) + (this.currentPositionOffset * ((float) getIndicatorWidth(nextTabPosition))) : (float) getIndicatorWidth(tabPosition)) / 2.0f;
                float f2 = left - indicatorWidth;
                float f3 = left + indicatorWidth;
                this.rectPaint.setAlpha(Math.round(this.selectedAlpha * 255.0f));
                int i;
                if (VERSION.SDK_INT > 21) {
                    tabPosition = height - this.indicatorHeight;
                    i = this.indicatorPaddingBottom;
                    float f4 = (float) (tabPosition - i);
                    float f5 = (float) (height - i);
                    tabPosition = this.indicatorCornerRadii;
                    canvas.drawRoundRect(f2, f4, f3, f5, (float) tabPosition, (float) tabPosition, this.rectPaint);
                } else {
                    tabPosition = height - this.indicatorHeight;
                    i = this.indicatorPaddingBottom;
                    canvas.drawRect(f2, (float) (tabPosition - i), f3, (float) (height - i), this.rectPaint);
                }
                if (this.underlineHeight > 0) {
                    this.rectPaint.setColor(this.underlineColor);
                    canvas.drawRect(MapboxConstants.MINIMUM_ZOOM, (float) (height - this.underlineHeight), (float) this.tabsContainer.getWidth(), (float) height, this.rectPaint);
                }
                this.dividerPaint.setColor(this.dividerColor);
                for (tabPosition = 0; tabPosition < this.tabCount - 1; tabPosition++) {
                    childAt = this.tabsContainer.getChildAt(tabPosition);
                    canvas.drawLine((float) childAt.getRight(), (float) this.dividerPadding, (float) childAt.getRight(), (float) (height - this.dividerPadding), this.dividerPaint);
                }
            }
        }
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    /* Access modifiers changed, original: protected */
    public int getIndicatorWidth(int i) {
        return ((Integer) this.indicatorSizes.get(i)).intValue();
    }

    /* Access modifiers changed, original: protected */
    public int getNextTabPosition(int i) {
        PagerSlidingTabSource pagerSlidingTabSource = (PagerSlidingTabSource) this.mParentTab.get();
        if (pagerSlidingTabSource != null) {
            i -= pagerSlidingTabSource.getAdapterItemPositionRange().getStartPosition();
            if (i < 0) {
                return 0;
            }
        }
        return i >= this.mAdapterItemInPrimaryTabPositions.size() ? 0 : ((PagerSlidingTabPositionRange) this.mAdapterItemInPrimaryTabPositions.get(i)).getEndPosition();
    }

    public PagerSlidingTabSource getParentTab() {
        return (PagerSlidingTabSource) this.mParentTab.get();
    }

    /* Access modifiers changed, original: protected */
    public int getTabPosition(int i) {
        PagerSlidingTabSource pagerSlidingTabSource = (PagerSlidingTabSource) this.mParentTab.get();
        if (pagerSlidingTabSource != null) {
            i -= pagerSlidingTabSource.getAdapterItemPositionRange().getStartPosition();
            if (i < 0) {
                return 0;
            }
        }
        return i >= this.mAdapterItemInPrimaryTabPositions.size() ? 0 : ((PagerSlidingTabPositionRange) this.mAdapterItemInPrimaryTabPositions.get(i)).getStartPosition();
    }

    public int getTextColor() {
        return this.tabTextColor;
    }

    public int getTextSize() {
        return this.tabTextSize;
    }

    public boolean isTextAllCaps() {
        return this.textAllCaps;
    }

    public void notifyDataSetChanged() {
        this.indicatorSizes.clear();
        this.tabsContainer.removeAllViews();
        this.mPrimaryTabInAdapterItemPositions.clear();
        this.mAdapterItemInPrimaryTabPositions.clear();
        if (this.pager == null && this.recyclerView == null) {
            this.tabCount = 0;
            this.currentPosition = 0;
            return;
        }
        PagerSlidingTabSource pagerSlidingTabSource = (PagerSlidingTabSource) this.mParentTab.get();
        if (pagerSlidingTabSource == null) {
            populateAsPrimaryTab();
        } else {
            populateAsSecondaryTab(pagerSlidingTabSource);
        }
        updateTabStyles();
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(new GlobalLayoutListener(this, viewPager, null));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        this.mCrop.reset();
        this.mRectF.set((float) getScrollX(), MapboxConstants.MINIMUM_ZOOM, (float) (getWidth() + getScrollX()), (float) getHeight());
        this.mCrop.addRoundRect(this.mRectF, this.mRadii, Direction.CW);
        this.mCrop.setFillType(FillType.WINDING);
        canvas.clipPath(this.mCrop);
        canvas.drawARGB(Color.alpha(this.tabStripBackgroundColor), Color.red(this.tabStripBackgroundColor), Color.green(this.tabStripBackgroundColor), Color.blue(this.tabStripBackgroundColor));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentPosition(savedState.currentPosition);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.currentPosition;
        return savedState;
    }

    public void onTabSelected(int i) {
        setCurrentPosition(i);
        if (i >= 0 && i < this.tabsContainer.getChildCount()) {
            scrollToChild(i, MapboxConstants.MINIMUM_ZOOM);
        }
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void scrollToChild(int i, float f) {
        if (this.tabCount != 0) {
            int tabPosition = getTabPosition(i);
            int nextTabPosition = getNextTabPosition(i);
            View childAt = this.tabsContainer.getChildAt(tabPosition);
            if (childAt != null) {
                int width = (f == MapboxConstants.MINIMUM_ZOOM || tabPosition == nextTabPosition) ? 0 : (int) (f * ((float) childAt.getWidth()));
                tabPosition = childAt.getLeft() + width;
                if (i > 0 || width > 0) {
                    tabPosition -= this.scrollOffset;
                }
                if (tabPosition != this.lastScrollX) {
                    this.lastScrollX = tabPosition;
                    scrollTo(tabPosition, 0);
                }
            }
        }
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        int i = 0;
        this.tabsContainer.setClickable(false);
        while (i < this.tabsContainer.getChildCount()) {
            this.tabsContainer.getChildAt(i).setClickable(z);
            i++;
        }
    }

    public void setCurrentPosition(int i) {
        this.currentPosition = i;
        int tabPosition = getTabPosition(i);
        float f = tabPosition == getNextTabPosition(i) ? MapboxConstants.MINIMUM_ZOOM : this.currentPositionOffset;
        float f2 = 1.0f - f;
        float f3 = this.selectedAlpha;
        float f4 = f2 * f3;
        float f5 = this.nonSelectedAlpha;
        f4 += f * f5;
        f = (f * f3) + (f2 * f5);
        for (int i2 = 0; i2 < this.tabCount; i2++) {
            View childAt = this.tabsContainer.getChildAt(i2);
            if (childAt != null) {
                if (i2 == tabPosition) {
                    childAt.setAlpha(f4);
                } else if (i2 == tabPosition + 1) {
                    childAt.setAlpha(f);
                } else {
                    childAt.setAlpha(this.nonSelectedAlpha);
                }
            }
        }
        updateTabStyles();
    }

    public void setInactiveTextColor(int i) {
        this.inactiveTabTextColor = i;
    }

    public void setOnPageChangeListener(e eVar) {
        this.delegatePageListener = eVar;
    }

    public void setParentTab(PagerSlidingTabSource pagerSlidingTabSource) {
        this.mParentTab.set(pagerSlidingTabSource);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.pageScrollListener);
            }
            this.recyclerView = recyclerView;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(this.pageScrollListener);
            }
            notifyDataSetChanged();
        }
    }

    public void setTabSourceProvider(PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider) {
        this.tabSourceProvider = pagerSlidingTabSourceProvider;
    }

    public void setTextColor(int i) {
        this.tabTextColor = i;
        updateTabStyles();
    }

    public void setTextSize(int i) {
        this.tabTextSize = i;
        updateTabStyles();
    }

    public void setTypeface(Typeface typeface, int i) {
        this.tabTypeface = typeface;
        this.tabTypefaceStyle = i;
        updateTabStyles();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.pager;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.b(this.pageListener);
            }
            this.pager = viewPager;
            if (viewPager != null) {
                if (this.tabSourceProvider == null && viewPager.b == null) {
                    throw new IllegalStateException("ViewPager does not have adapter instance.");
                }
                viewPager.a(this.pageListener);
            }
            notifyDataSetChanged();
        }
    }
}
