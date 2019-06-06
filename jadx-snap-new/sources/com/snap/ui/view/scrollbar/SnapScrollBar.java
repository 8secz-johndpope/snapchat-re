package com.snap.ui.view.scrollbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SnapScrollBar extends FrameLayout {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(SnapScrollBar.class), "scrollListener", "getScrollListener()Landroid/support/v7/widget/RecyclerView$OnScrollListener;")};
    public static final Companion Companion = new Companion();
    private static final long FADE_IN_ANIMATION_DURATION = 200;
    public static final int INDICATOR_TEXT_TYPE_LAST = 0;
    public static final int INDICATOR_TEXT_TYPE_UNDER_INDICATOR = 1;
    private static final int SCROLL_BAR_INDICATOR_TEXT_TRIGGER_VELOCITY = 250;
    private static final int SCROLL_BAR_TRACK_TRIGGER_VELOCITY = 5;
    private static final float SHOWN_FRACTION_LONG = 1.0f;
    private static final float SHOWN_FRACTION_SHORT = 0.7f;
    private static final String TAG = "SnapScrollBar";
    private ContentHeightLookup contentHeightLookup;
    private Runnable hideScrollBarRunnable;
    private IndicatorTextLookup indicatorTextLookup;
    private int indicatorTextType;
    private boolean isDismissing;
    private final boolean isRtlLayout;
    private boolean isScrollingFromScrollBar;
    private boolean isShowing;
    private float lastTouchX;
    private float lastTouchY;
    private final View layout;
    private boolean moveNavigationEnabled;
    private float progress;
    private RecyclerView recyclerView;
    private final int screenHeight;
    private SnapScrollBarIndicator scrollBarIndicator;
    private final int scrollBarTouchableExtraPadding;
    private final View scrollBarTrack;
    private final int scrollBarTrackPaddingBottom;
    private final int scrollBarTrackPaddingTop;
    private final ajxe scrollListener$delegate;
    private final int touchSlop;
    private int trackHeight;
    private final RectF trackRectF;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorTextType {
    }

    public interface IndicatorTextLookup {
        String getScrollIndicatorTextForItem(int i);
    }

    /* renamed from: com.snap.ui.view.scrollbar.SnapScrollBar$1 */
    static final class AnonymousClass1 implements Runnable {
        final /* synthetic */ SnapScrollBar this$0;

        AnonymousClass1(SnapScrollBar snapScrollBar) {
            this.this$0 = snapScrollBar;
        }

        public final void run() {
            this.this$0.hideScrollBar();
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public interface ContentHeightLookup {
        int getCurrentHeightFromItem(int i);

        int getItemPositionAtHeight(int i);

        int getTotalContentHeight();
    }

    public static final class UniformContentHeightLookup implements ContentHeightLookup {
        static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(UniformContentHeightLookup.class), "itemSize", "getItemSize()I")};
        private final Adapter<?> adapter;
        private final int columns;
        private final ajxe itemSize$delegate;
        private final int spacing;

        public UniformContentHeightLookup(Adapter<?> adapter, int i, int i2, int i3) {
            akcr.b(adapter, "adapter");
            this.adapter = adapter;
            this.columns = i;
            this.spacing = i2;
            this.itemSize$delegate = ajxh.a(new SnapScrollBar$UniformContentHeightLookup$itemSize$2(this, i3));
        }

        private final int getItemSize() {
            return ((Number) this.itemSize$delegate.b()).intValue();
        }

        public final int getCurrentHeightFromItem(int i) {
            i /= this.columns;
            int itemSize = getItemSize();
            int i2 = this.spacing;
            return (i * (itemSize + i2)) + i2;
        }

        public final int getItemPositionAtHeight(int i) {
            return (int) (((float) this.adapter.getItemCount()) * (((float) i) / ((float) getTotalContentHeight())));
        }

        public final int getTotalContentHeight() {
            return getCurrentHeightFromItem(this.adapter.getItemCount());
        }
    }

    public SnapScrollBar(Context context) {
        akcr.b(context, "context");
        this(context, null);
    }

    public SnapScrollBar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, 0);
    }

    public SnapScrollBar(Context context, AttributeSet attributeSet, int i) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet, i);
        this.trackRectF = new RectF();
        this.scrollListener$delegate = ajxh.a(new SnapScrollBar$scrollListener$2(this));
        boolean z = false;
        setWillNotDraw(false);
        Object context2 = getContext();
        akcr.a(context2, str);
        this.scrollBarTouchableExtraPadding = context2.getResources().getDimensionPixelOffset(R.dimen.default_gap_1_5x);
        context2 = getContext();
        akcr.a(context2, str);
        this.scrollBarTrackPaddingTop = context2.getResources().getDimensionPixelOffset(R.dimen.scroll_bar_track_padding_top);
        context2 = getContext();
        akcr.a(context2, str);
        this.scrollBarTrackPaddingBottom = context2.getResources().getDimensionPixelOffset(R.dimen.scroll_bar_track_padding_bottom);
        context2 = ViewConfiguration.get(getContext());
        akcr.a(context2, "ViewConfiguration.get(context)");
        this.touchSlop = context2.getScaledTouchSlop();
        context2 = getContext();
        akcr.a(context2, str);
        context2 = context2.getResources();
        akcr.a(context2, "context.resources");
        this.screenHeight = context2.getDisplayMetrics().heightPixels;
        context2 = getResources();
        akcr.a(context2, "resources");
        context2 = context2.getConfiguration();
        akcr.a(context2, "resources.configuration");
        if (context2.getLayoutDirection() == 1) {
            z = true;
        }
        this.isRtlLayout = z;
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            systemService = ((LayoutInflater) systemService).inflate(R.layout.scroll_bar, this);
            akcr.a(systemService, "layoutInflater.inflate(R.layout.scroll_bar, this)");
            this.layout = systemService;
            systemService = findViewById(R.id.scroll_bar_indicator);
            akcr.a(systemService, "findViewById(R.id.scroll_bar_indicator)");
            this.scrollBarIndicator = (SnapScrollBarIndicator) systemService;
            systemService = findViewById(R.id.scroll_bar_track);
            akcr.a(systemService, "findViewById(R.id.scroll_bar_track)");
            this.scrollBarTrack = systemService;
            this.hideScrollBarRunnable = new AnonymousClass1(this);
            this.layout.setAlpha(MapboxConstants.MINIMUM_ZOOM);
            this.progress = MapboxConstants.MINIMUM_ZOOM;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public static final /* synthetic */ Runnable access$getHideScrollBarRunnable$p(SnapScrollBar snapScrollBar) {
        Runnable runnable = snapScrollBar.hideScrollBarRunnable;
        if (runnable == null) {
            akcr.a("hideScrollBarRunnable");
        }
        return runnable;
    }

    public static final /* synthetic */ SnapScrollBarIndicator access$getScrollBarIndicator$p(SnapScrollBar snapScrollBar) {
        SnapScrollBarIndicator snapScrollBarIndicator = snapScrollBar.scrollBarIndicator;
        if (snapScrollBarIndicator == null) {
            akcr.a("scrollBarIndicator");
        }
        return snapScrollBarIndicator;
    }

    private final ajxm<Integer, Integer> calculateRecyclerViewScrollPositionAndOffset(float f) {
        ContentHeightLookup contentHeightLookup = this.contentHeightLookup;
        if (contentHeightLookup == null) {
            return new ajxm(Integer.valueOf(0), Integer.valueOf(0));
        }
        int totalContentHeight = (int) (((float) (contentHeightLookup.getTotalContentHeight() - this.screenHeight)) * f);
        int itemPositionAtHeight = contentHeightLookup.getItemPositionAtHeight(totalContentHeight);
        return new ajxm(Integer.valueOf(itemPositionAtHeight), Integer.valueOf(contentHeightLookup.getCurrentHeightFromItem(itemPositionAtHeight) - totalContentHeight));
    }

    private final View getItemUnderIndicator(float f) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Object childAt = recyclerView.getChildAt(i);
                akcr.a(childAt, "child");
                if (f >= childAt.getY() + ((float) recyclerView.getTop()) && f <= (childAt.getY() + ((float) recyclerView.getTop())) + ((float) childAt.getHeight())) {
                    return childAt;
                }
            }
        }
        return null;
    }

    private final OnScrollListener getScrollListener() {
        return (OnScrollListener) this.scrollListener$delegate.b();
    }

    private static /* synthetic */ void indicatorTextType$annotations() {
    }

    private final void setScrollingFromScrollBar(boolean z) {
        this.isScrollingFromScrollBar = z;
    }

    private final void updateIndicatorPositionFromTouchEvent(MotionEvent motionEvent) {
        float scrollBarViewMinimumY = getScrollBarViewMinimumY();
        float scrollBarViewMaximumY = getScrollBarViewMaximumY();
        if (getBottomActionBarHeight() == 0) {
            scrollBarViewMaximumY -= (float) getHeaderViewTopMargin();
        }
        int[] iArr = new int[2];
        this.scrollBarTrack.getLocationOnScreen(iArr);
        float rawY = motionEvent.getRawY() - ((float) iArr[1]);
        SnapScrollBarIndicator snapScrollBarIndicator = this.scrollBarIndicator;
        String str = "scrollBarIndicator";
        if (snapScrollBarIndicator == null) {
            akcr.a(str);
        }
        rawY -= ((float) snapScrollBarIndicator.getHeight()) / 2.0f;
        if (rawY < scrollBarViewMinimumY) {
            this.progress = MapboxConstants.MINIMUM_ZOOM;
            rawY = scrollBarViewMinimumY;
        } else if (rawY > scrollBarViewMaximumY) {
            this.progress = 1.0f;
            rawY = scrollBarViewMaximumY;
        } else {
            this.progress = (rawY - scrollBarViewMinimumY) / (scrollBarViewMaximumY - scrollBarViewMinimumY);
        }
        SnapScrollBarIndicator snapScrollBarIndicator2 = this.scrollBarIndicator;
        if (snapScrollBarIndicator2 == null) {
            akcr.a(str);
        }
        snapScrollBarIndicator2.setY(rawY);
    }

    private final void updateIndicatorText() {
        int i = this.indicatorTextType;
        if (i == 0) {
            updateIndicatorTextWithLastVisibleItem();
        } else if (i == 1) {
            updateIndicatorTextWithItemUnderIndicator();
        }
    }

    /* JADX WARNING: Missing block: B:21:0x004a, code skipped:
            if (r0 == null) goto L_0x004c;
     */
    private final void updateIndicatorTextWithItemUnderIndicator() {
        /*
        r4 = this;
        r0 = r4.recyclerView;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r0.getLayoutManager();
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        r0 = r0 instanceof android.support.v7.widget.LinearLayoutManager;
        if (r0 == 0) goto L_0x0076;
    L_0x000e:
        r0 = r4.scrollBarIndicator;
        r1 = "scrollBarIndicator";
        if (r0 != 0) goto L_0x0017;
    L_0x0014:
        defpackage.akcr.a(r1);
    L_0x0017:
        r0 = r0.getY();
        r2 = r4.layout;
        r2 = r2.getTop();
        r2 = (float) r2;
        r0 = r0 + r2;
        r2 = r4.scrollBarIndicator;
        if (r2 != 0) goto L_0x002a;
    L_0x0027:
        defpackage.akcr.a(r1);
    L_0x002a:
        r2 = r2.getHeight();
        r2 = (float) r2;
        r0 = r0 + r2;
        r0 = r4.getItemUnderIndicator(r0);
        r2 = r4.recyclerView;
        if (r2 == 0) goto L_0x003d;
    L_0x0038:
        r0 = r2.getChildAdapterPosition(r0);
        goto L_0x003e;
    L_0x003d:
        r0 = -1;
    L_0x003e:
        r2 = "";
        if (r0 < 0) goto L_0x006c;
    L_0x0042:
        r3 = r4.indicatorTextLookup;
        if (r3 == 0) goto L_0x004c;
    L_0x0046:
        r0 = r3.getScrollIndicatorTextForItem(r0);
        if (r0 != 0) goto L_0x004d;
    L_0x004c:
        r0 = r2;
    L_0x004d:
        r3 = r0;
        r3 = (java.lang.CharSequence) r3;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0061;
    L_0x0056:
        r2 = r4.scrollBarIndicator;
        if (r2 != 0) goto L_0x005d;
    L_0x005a:
        defpackage.akcr.a(r1);
    L_0x005d:
        r2.setIndicatorText(r0);
        return;
    L_0x0061:
        r0 = r4.scrollBarIndicator;
        if (r0 != 0) goto L_0x0068;
    L_0x0065:
        defpackage.akcr.a(r1);
    L_0x0068:
        r0.setIndicatorText(r2);
        return;
    L_0x006c:
        r0 = r4.scrollBarIndicator;
        if (r0 != 0) goto L_0x0073;
    L_0x0070:
        defpackage.akcr.a(r1);
    L_0x0073:
        r0.setIndicatorText(r2);
    L_0x0076:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.scrollbar.SnapScrollBar.updateIndicatorTextWithItemUnderIndicator():void");
    }

    /* JADX WARNING: Missing block: B:11:0x001e, code skipped:
            if (r0 == null) goto L_0x0020;
     */
    private final void updateIndicatorTextWithLastVisibleItem() {
        /*
        r3 = this;
        r0 = r3.recyclerView;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r0.getLayoutManager();
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        r1 = r0 instanceof android.support.v7.widget.LinearLayoutManager;
        if (r1 == 0) goto L_0x0037;
    L_0x000e:
        r0 = (android.support.v7.widget.LinearLayoutManager) r0;
        r0 = r0.findLastVisibleItemPosition();
        if (r0 < 0) goto L_0x0037;
    L_0x0016:
        r1 = r3.indicatorTextLookup;
        if (r1 == 0) goto L_0x0020;
    L_0x001a:
        r0 = r1.getScrollIndicatorTextForItem(r0);
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        r0 = "";
    L_0x0022:
        r1 = r0;
        r1 = (java.lang.CharSequence) r1;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0037;
    L_0x002b:
        r1 = r3.scrollBarIndicator;
        if (r1 != 0) goto L_0x0034;
    L_0x002f:
        r2 = "scrollBarIndicator";
        defpackage.akcr.a(r2);
    L_0x0034:
        r1.setIndicatorText(r0);
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.scrollbar.SnapScrollBar.updateIndicatorTextWithLastVisibleItem():void");
    }

    private final void updateScrollBarIndicatorPositionFromLayoutUpdate() {
        float scrollBarViewMinimumY = getScrollBarViewMinimumY();
        float scrollBarViewMaximumY = getScrollBarViewMaximumY();
        if (getBottomActionBarHeight() == 0) {
            scrollBarViewMaximumY -= (float) getHeaderViewTopMargin();
        }
        float f = (this.progress * (scrollBarViewMaximumY - scrollBarViewMinimumY)) + scrollBarViewMinimumY;
        SnapScrollBarIndicator snapScrollBarIndicator = this.scrollBarIndicator;
        if (snapScrollBarIndicator == null) {
            akcr.a("scrollBarIndicator");
        }
        snapScrollBarIndicator.setY(f);
    }

    private final void updateScrollBarSize() {
        int i;
        int height = this.layout.getHeight();
        int i2 = this.trackHeight;
        if (getBottomActionBarHeight() > 0) {
            i = this.scrollBarTrackPaddingBottom;
        } else {
            height -= this.scrollBarTrackPaddingBottom;
            i = getHeaderViewTopMargin();
        }
        this.trackHeight = height - i;
        if (i2 != this.trackHeight) {
            invalidate();
            updateScrollBarIndicatorPositionFromLayoutUpdate();
        }
    }

    public final void attachToRecyclerView(RecyclerView recyclerView, ContentHeightLookup contentHeightLookup, IndicatorTextLookup indicatorTextLookup) {
        akcr.b(recyclerView, "recyclerView");
        akcr.b(contentHeightLookup, "contentHeightLookup");
        akcr.b(indicatorTextLookup, "indicatorTextLookup");
        attachToRecyclerView(recyclerView, contentHeightLookup, indicatorTextLookup, 0);
    }

    public final void attachToRecyclerView(RecyclerView recyclerView, ContentHeightLookup contentHeightLookup, IndicatorTextLookup indicatorTextLookup, int i) {
        akcr.b(recyclerView, "recyclerView");
        akcr.b(contentHeightLookup, "contentHeightLookup");
        akcr.b(indicatorTextLookup, "indicatorTextLookup");
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(getScrollListener());
        }
        this.recyclerView = recyclerView;
        this.indicatorTextLookup = indicatorTextLookup;
        this.contentHeightLookup = contentHeightLookup;
        this.indicatorTextType = i;
        recyclerView.addOnScrollListener(getScrollListener());
    }

    public final int getBottomActionBarHeight() {
        return 0;
    }

    public final int getHeaderViewTopMargin() {
        return 0;
    }

    public final float getScrollBarViewMaximumY() {
        float height = ((float) this.layout.getHeight()) + getScrollBarViewMinimumY();
        int i = this.scrollBarTrackPaddingTop + this.scrollBarTrackPaddingBottom;
        SnapScrollBarIndicator snapScrollBarIndicator = this.scrollBarIndicator;
        if (snapScrollBarIndicator == null) {
            akcr.a("scrollBarIndicator");
        }
        return height - ((float) (i + snapScrollBarIndicator.getHeight()));
    }

    public final float getScrollBarViewMinimumY() {
        float y = this.layout.getY();
        if (!(this.layout.getLayoutParams() instanceof MarginLayoutParams)) {
            return y;
        }
        LayoutParams layoutParams = this.layout.getLayoutParams();
        if (layoutParams != null) {
            return y - ((float) ((MarginLayoutParams) layoutParams).topMargin);
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void hideScrollBar() {
        if (!this.isDismissing && this.layout.getVisibility() != 4) {
            this.isDismissing = true;
            this.isShowing = false;
            this.layout.animate().cancel();
            Object animate = this.layout.animate();
            akcr.a(animate, "layout.animate()");
            animate.setStartDelay(2000);
            this.layout.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(FADE_IN_ANIMATION_DURATION).setListener(new SnapScrollBar$hideScrollBar$1(this)).start();
        }
    }

    public final boolean isScrollBarDisabled() {
        ContentHeightLookup contentHeightLookup = this.contentHeightLookup;
        return contentHeightLookup == null || contentHeightLookup.getTotalContentHeight() < this.screenHeight * 2;
    }

    public final boolean isScrollingFromScrollBar() {
        return this.isScrollingFromScrollBar;
    }

    /* JADX WARNING: Missing block: B:30:0x0086, code skipped:
            if (r0 <= (r7 + ((float) r4.getWidth()))) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:35:0x0096, code skipped:
            if (r0 >= r7.getIndicatorX()) goto L_0x0098;
     */
    /* JADX WARNING: Missing block: B:37:0x009a, code skipped:
            r7 = null;
     */
    public final boolean isTouchingOnScrollBarIndicator(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = "event";
        defpackage.akcr.b(r7, r0);
        r0 = r7.getX();
        r7 = r7.getY();
        r1 = r6.isRtlLayout;
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x002a;
    L_0x0013:
        r1 = r6.scrollBarTrack;
        r1 = r1.getX();
        r4 = r6.scrollBarTrack;
        r4 = r4.getWidth();
        r4 = (float) r4;
        r1 = r1 + r4;
        r4 = r6.scrollBarTouchableExtraPadding;
        r4 = (float) r4;
        r1 = r1 + r4;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 > 0) goto L_0x003a;
    L_0x0029:
        goto L_0x0038;
    L_0x002a:
        r1 = r6.scrollBarTrack;
        r1 = r1.getX();
        r4 = r6.scrollBarTouchableExtraPadding;
        r4 = (float) r4;
        r1 = r1 - r4;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 < 0) goto L_0x003a;
    L_0x0038:
        r1 = 1;
        goto L_0x003b;
    L_0x003a:
        r1 = 0;
    L_0x003b:
        r4 = r6.scrollBarIndicator;
        r5 = "scrollBarIndicator";
        if (r4 != 0) goto L_0x0044;
    L_0x0041:
        defpackage.akcr.a(r5);
    L_0x0044:
        r4 = r4.getY();
        r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x009f;
    L_0x004c:
        r4 = r6.scrollBarIndicator;
        if (r4 != 0) goto L_0x0053;
    L_0x0050:
        defpackage.akcr.a(r5);
    L_0x0053:
        r4 = r4.getY();
        r7 = r7 - r4;
        r4 = r6.scrollBarIndicator;
        if (r4 != 0) goto L_0x005f;
    L_0x005c:
        defpackage.akcr.a(r5);
    L_0x005f:
        r4 = r4.getHeight();
        r4 = (float) r4;
        r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x009f;
    L_0x0068:
        r7 = r6.isRtlLayout;
        if (r7 == 0) goto L_0x0089;
    L_0x006c:
        r7 = r6.scrollBarIndicator;
        if (r7 != 0) goto L_0x0073;
    L_0x0070:
        defpackage.akcr.a(r5);
    L_0x0073:
        r7 = r7.getIndicatorX();
        r4 = r6.scrollBarIndicator;
        if (r4 != 0) goto L_0x007e;
    L_0x007b:
        defpackage.akcr.a(r5);
    L_0x007e:
        r4 = r4.getWidth();
        r4 = (float) r4;
        r7 = r7 + r4;
        r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r7 > 0) goto L_0x009a;
    L_0x0088:
        goto L_0x0098;
    L_0x0089:
        r7 = r6.scrollBarIndicator;
        if (r7 != 0) goto L_0x0090;
    L_0x008d:
        defpackage.akcr.a(r5);
    L_0x0090:
        r7 = r7.getIndicatorX();
        r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r7 < 0) goto L_0x009a;
    L_0x0098:
        r7 = 1;
        goto L_0x009b;
    L_0x009a:
        r7 = 0;
    L_0x009b:
        if (r7 == 0) goto L_0x009f;
    L_0x009d:
        r7 = 1;
        goto L_0x00a0;
    L_0x009f:
        r7 = 0;
    L_0x00a0:
        if (r1 != 0) goto L_0x00a6;
    L_0x00a2:
        if (r7 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a6;
    L_0x00a5:
        return r3;
    L_0x00a6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.scrollbar.SnapScrollBar.isTouchingOnScrollBarIndicator(android.view.MotionEvent):boolean");
    }

    public final void onDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        this.trackRectF.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) canvas.getWidth(), (float) this.trackHeight);
        canvas.clipRect(this.trackRectF);
        super.onDraw(canvas);
    }

    public final void onScrollBarScrollProgressChanged(float f) {
        RecyclerView recyclerView = this.recyclerView;
        LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            try {
                ajxm calculateRecyclerViewScrollPositionAndOffset = calculateRecyclerViewScrollPositionAndOffset(f);
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(((Number) calculateRecyclerViewScrollPositionAndOffset.a).intValue(), ((Number) calculateRecyclerViewScrollPositionAndOffset.b).intValue());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Missing block: B:6:0x0012, code skipped:
            if (r0 != 3) goto L_0x0077;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r0 = "event";
        defpackage.akcr.b(r5, r0);
        r0 = r5.getAction();
        r1 = 1;
        if (r0 == 0) goto L_0x0063;
    L_0x000c:
        if (r0 == r1) goto L_0x005f;
    L_0x000e:
        r2 = 2;
        if (r0 == r2) goto L_0x0015;
    L_0x0011:
        r5 = 3;
        if (r0 == r5) goto L_0x005f;
    L_0x0014:
        goto L_0x0077;
    L_0x0015:
        r0 = r4.moveNavigationEnabled;
        if (r0 != 0) goto L_0x0040;
    L_0x0019:
        r0 = r5.getX();
        r2 = r5.getY();
        r3 = r4.lastTouchX;
        r3 = r3 - r0;
        r0 = java.lang.Math.abs(r3);
        r3 = r4.touchSlop;
        r3 = (float) r3;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x003e;
    L_0x002f:
        r0 = r4.lastTouchY;
        r0 = r0 - r2;
        r0 = java.lang.Math.abs(r0);
        r2 = r4.touchSlop;
        r2 = (float) r2;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x003e;
    L_0x003d:
        return r1;
    L_0x003e:
        r4.moveNavigationEnabled = r1;
    L_0x0040:
        r4.requestDisallowInterceptTouchEvent(r1);
        r4.updateIndicatorPositionFromTouchEvent(r5);
        r4.isScrollingFromScrollBar = r1;
        r5 = r4.scrollBarIndicator;
        if (r5 != 0) goto L_0x0051;
    L_0x004c:
        r0 = "scrollBarIndicator";
        defpackage.akcr.a(r0);
    L_0x0051:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5.showIndicatorTextView(r0);
        r4.showScrollBar();
        r5 = r4.progress;
        r4.onScrollBarScrollProgressChanged(r5);
        goto L_0x0077;
    L_0x005f:
        r4.resetScrollBarTouchState();
        goto L_0x0077;
    L_0x0063:
        r0 = r4.isTouchingOnScrollBarIndicator(r5);
        if (r0 != 0) goto L_0x006b;
    L_0x0069:
        r5 = 0;
        return r5;
    L_0x006b:
        r0 = r5.getX();
        r4.lastTouchX = r0;
        r5 = r5.getY();
        r4.lastTouchY = r5;
    L_0x0077:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.scrollbar.SnapScrollBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void resetScrollBarTouchState() {
        requestDisallowInterceptTouchEvent(false);
        this.isScrollingFromScrollBar = false;
        SnapScrollBarIndicator snapScrollBarIndicator = this.scrollBarIndicator;
        if (snapScrollBarIndicator == null) {
            akcr.a("scrollBarIndicator");
        }
        Runnable runnable = this.hideScrollBarRunnable;
        if (runnable == null) {
            akcr.a("hideScrollBarRunnable");
        }
        snapScrollBarIndicator.hideIndicatorTextView(runnable);
        this.lastTouchX = MapboxConstants.MINIMUM_ZOOM;
        this.lastTouchY = MapboxConstants.MINIMUM_ZOOM;
        this.moveNavigationEnabled = false;
    }

    public final void setScrollBarIndicatorImageSource(Drawable drawable) {
        akcr.b(drawable, "drawable");
        SnapScrollBarIndicator snapScrollBarIndicator = this.scrollBarIndicator;
        if (snapScrollBarIndicator == null) {
            akcr.a("scrollBarIndicator");
        }
        snapScrollBarIndicator.setIndicatorImageDrawable(drawable);
    }

    public final void setScrollBarIndicatorTextBackground(Drawable drawable) {
        akcr.b(drawable, "drawable");
        SnapScrollBarIndicator snapScrollBarIndicator = this.scrollBarIndicator;
        if (snapScrollBarIndicator == null) {
            akcr.a("scrollBarIndicator");
        }
        snapScrollBarIndicator.setIndicatorTextBackground(drawable);
    }

    public final void showScrollBar() {
        if (this.recyclerView != null) {
            String str = "layout.animate()";
            if (this.isDismissing) {
                this.layout.animate().cancel();
                Object animate = this.layout.animate();
                akcr.a(animate, str);
                animate.setStartDelay(0);
            }
            if (!(this.isShowing || this.layout.getVisibility() == 0 || isScrollBarDisabled())) {
                this.isShowing = true;
                this.isDismissing = false;
                this.layout.animate().cancel();
                Object animate2 = this.layout.animate();
                akcr.a(animate2, str);
                animate2.setStartDelay(0);
                this.layout.setVisibility(0);
                this.layout.animate().alpha(1.0f).setDuration(FADE_IN_ANIMATION_DURATION).setListener(new SnapScrollBar$showScrollBar$1(this)).start();
            }
        }
    }

    public final void updateScrollBarProgress() {
        ContentHeightLookup contentHeightLookup = this.contentHeightLookup;
        if (contentHeightLookup != null) {
            RecyclerView recyclerView = this.recyclerView;
            LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            if (layoutManager instanceof LinearLayoutManager) {
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1) {
                    View findViewByPosition = layoutManager.findViewByPosition(findFirstVisibleItemPosition);
                    float y = findViewByPosition != null ? findViewByPosition.getY() : MapboxConstants.MINIMUM_ZOOM;
                    int totalContentHeight = contentHeightLookup.getTotalContentHeight();
                    int currentHeightFromItem = contentHeightLookup.getCurrentHeightFromItem(findFirstVisibleItemPosition);
                    if (y < MapboxConstants.MINIMUM_ZOOM) {
                        currentHeightFromItem += (int) Math.abs(y);
                    }
                    totalContentHeight -= this.screenHeight;
                    float min = ((float) Math.min(totalContentHeight, Math.max(0, currentHeightFromItem))) / ((float) totalContentHeight);
                    if (min < MapboxConstants.MINIMUM_ZOOM) {
                        min = MapboxConstants.MINIMUM_ZOOM;
                    } else if (min > 1.0f) {
                        min = 1.0f;
                    }
                    this.progress = min;
                    updateScrollBarIndicatorPositionFromLayoutUpdate();
                }
            }
        }
    }
}
