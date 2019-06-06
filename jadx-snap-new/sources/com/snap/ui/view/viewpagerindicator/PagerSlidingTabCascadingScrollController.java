package com.snap.ui.view.viewpagerindicator;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;

public class PagerSlidingTabCascadingScrollController {
    private final ViewPager mPrimaryTabViewPager;
    private final boolean mRtlLayout;
    private final ViewPager mSecondaryTabViewPager;
    private final PagerSlidingTabSecondaryViewPagerAdapter mSecondaryTabViewPagerAdapter;

    public PagerSlidingTabCascadingScrollController(ViewPager viewPager, ViewPager viewPager2, PagerSlidingTabSecondaryViewPagerAdapter pagerSlidingTabSecondaryViewPagerAdapter) {
        this.mPrimaryTabViewPager = viewPager;
        this.mSecondaryTabViewPager = viewPager2;
        this.mSecondaryTabViewPagerAdapter = pagerSlidingTabSecondaryViewPagerAdapter;
        int layoutDirection = viewPager2.getResources().getConfiguration().getLayoutDirection();
        boolean z = true;
        if (layoutDirection != 1) {
            z = false;
        }
        this.mRtlLayout = z;
    }

    private void handlePageScrollIdle(int i) {
        Integer adapterItemToPrimaryTabPosition = this.mSecondaryTabViewPagerAdapter.getAdapterItemToPrimaryTabPosition(i);
        if (adapterItemToPrimaryTabPosition != null) {
            this.mSecondaryTabViewPager.b(adapterItemToPrimaryTabPosition.intValue());
        }
    }

    private void handlePageScrollOffset(int i, float f) {
        Integer adapterItemToPrimaryTabPosition = this.mSecondaryTabViewPagerAdapter.getAdapterItemToPrimaryTabPosition(i);
        Boolean adapterItemScrollable = this.mSecondaryTabViewPagerAdapter.getAdapterItemScrollable(i);
        if (!(adapterItemToPrimaryTabPosition == null || adapterItemScrollable == null)) {
            View view = null;
            for (int i2 = 0; i2 < this.mSecondaryTabViewPager.getChildCount(); i2++) {
                View childAt = this.mSecondaryTabViewPager.getChildAt(i2);
                Integer num = (Integer) childAt.getTag(PagerSlidingTabSecondaryViewPagerAdapter.VIEW_POSITION_TAG);
                if (num != null && num.intValue() == adapterItemToPrimaryTabPosition.intValue()) {
                    view = childAt;
                    break;
                }
            }
            if (view != null) {
                this.mSecondaryTabViewPager.scrollTo(view.getLeft() + (adapterItemScrollable.booleanValue() ? (int) (f * ((float) view.getWidth())) : 0), 0);
            }
        }
    }

    public e getOnPageChangeListener() {
        return new e() {
            public void onPageScrollStateChanged(int i) {
                if (i == 0 && PagerSlidingTabCascadingScrollController.this.mPrimaryTabViewPager != null) {
                    PagerSlidingTabCascadingScrollController pagerSlidingTabCascadingScrollController = PagerSlidingTabCascadingScrollController.this;
                    pagerSlidingTabCascadingScrollController.handlePageScrollIdle(pagerSlidingTabCascadingScrollController.mPrimaryTabViewPager.b());
                }
            }

            public void onPageScrolled(int i, float f, int i2) {
                PagerSlidingTabCascadingScrollController.this.handlePageScrollOffset(i, f);
            }

            public void onPageSelected(int i) {
            }
        };
    }

    public OnScrollListener getOnScrollListener() {
        return new OnScrollListener() {
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    i = recyclerView.getWidth();
                    if (i != 0) {
                        PagerSlidingTabCascadingScrollController.this.handlePageScrollIdle(((PagerSlidingTabCascadingScrollController.this.mRtlLayout ? recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollOffset() : recyclerView.computeHorizontalScrollOffset()) / i) - PagerSlidingTabCascadingScrollController.this.mRtlLayout);
                    }
                }
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                i = recyclerView.getWidth();
                if (i != 0) {
                    i2 = PagerSlidingTabCascadingScrollController.this.mRtlLayout ? recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollOffset() : recyclerView.computeHorizontalScrollOffset();
                    PagerSlidingTabCascadingScrollController.this.handlePageScrollOffset((i2 / i) - PagerSlidingTabCascadingScrollController.this.mRtlLayout, (((float) (i2 % i)) * 1.0f) / ((float) i));
                }
            }
        };
    }
}
