package com.snap.ui.view.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class PagerSlidingTabContainer extends LinearLayout {
    public static final int DEFAULT_OFFSCREEN_PAGE_LIMIT = 50;
    private RecyclerView mContentRecyclerView;
    private ViewPager mContentViewPager;
    private e mOnPageChangeListenerForCascadingScrollController;
    private OnScrollListener mOnScrollListenerForCascadingScrollController;
    private PagerSlidingTabStrip mPrimaryTab;
    private ViewPager mSecondaryTabsViewPager;
    private PagerSlidingTabSecondaryViewPagerAdapter mSecondaryViewPagerAdapter;

    public PagerSlidingTabContainer(Context context) {
        this(context, null);
    }

    public PagerSlidingTabContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
    }

    public void dispose() {
        removeAllViews();
        PagerSlidingTabStrip pagerSlidingTabStrip = this.mPrimaryTab;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setTabSourceProvider(null);
            pagerSlidingTabStrip.setViewPager(null);
            pagerSlidingTabStrip.setRecyclerView(null);
            this.mPrimaryTab = null;
        }
        ViewPager viewPager = this.mContentViewPager;
        if (viewPager != null) {
            this.mContentViewPager = null;
        }
        e eVar = this.mOnPageChangeListenerForCascadingScrollController;
        if (eVar != null) {
            if (viewPager != null) {
                viewPager.b(eVar);
            }
            this.mOnPageChangeListenerForCascadingScrollController = null;
        }
        RecyclerView recyclerView = this.mContentRecyclerView;
        if (recyclerView != null) {
            this.mContentRecyclerView = null;
        }
        OnScrollListener onScrollListener = this.mOnScrollListenerForCascadingScrollController;
        if (onScrollListener != null) {
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(onScrollListener);
            }
            this.mOnScrollListenerForCascadingScrollController = null;
        }
        viewPager = this.mSecondaryTabsViewPager;
        if (viewPager != null) {
            viewPager.a(null);
            this.mSecondaryTabsViewPager = null;
        }
    }

    public void initialize(ViewPager viewPager, PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider, e eVar, int i, int i2, int i3) {
        this.mContentViewPager = viewPager;
        this.mPrimaryTab = (PagerSlidingTabStrip) LayoutInflater.from(getContext()).inflate(i, this, false);
        addView(this.mPrimaryTab);
        this.mPrimaryTab.setTabSourceProvider(pagerSlidingTabSourceProvider);
        this.mPrimaryTab.setViewPager(viewPager);
        this.mPrimaryTab.setOnPageChangeListener(eVar);
        this.mSecondaryTabsViewPager = (ViewPager) LayoutInflater.from(getContext()).inflate(i3, this, false);
        addView(this.mSecondaryTabsViewPager);
        this.mSecondaryViewPagerAdapter = new PagerSlidingTabSecondaryViewPagerAdapter(viewPager, pagerSlidingTabSourceProvider, i2);
        this.mSecondaryTabsViewPager.c(50);
        this.mSecondaryTabsViewPager.a(this.mSecondaryViewPagerAdapter);
        this.mOnPageChangeListenerForCascadingScrollController = new PagerSlidingTabCascadingScrollController(viewPager, this.mSecondaryTabsViewPager, this.mSecondaryViewPagerAdapter).getOnPageChangeListener();
        viewPager.a(this.mOnPageChangeListenerForCascadingScrollController);
    }

    public void initialize(RecyclerView recyclerView, PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider, int i, int i2, int i3) {
        this.mContentRecyclerView = recyclerView;
        this.mPrimaryTab = (PagerSlidingTabStrip) LayoutInflater.from(getContext()).inflate(i, this, false);
        addView(this.mPrimaryTab);
        this.mPrimaryTab.setTabSourceProvider(pagerSlidingTabSourceProvider);
        this.mPrimaryTab.setRecyclerView(recyclerView);
        this.mSecondaryTabsViewPager = (ViewPager) LayoutInflater.from(getContext()).inflate(i3, this, false);
        addView(this.mSecondaryTabsViewPager);
        this.mSecondaryViewPagerAdapter = new PagerSlidingTabSecondaryViewPagerAdapter(recyclerView, pagerSlidingTabSourceProvider, i2);
        this.mSecondaryTabsViewPager.c(50);
        this.mSecondaryTabsViewPager.a(this.mSecondaryViewPagerAdapter);
        this.mOnScrollListenerForCascadingScrollController = new PagerSlidingTabCascadingScrollController(null, this.mSecondaryTabsViewPager, this.mSecondaryViewPagerAdapter).getOnScrollListener();
        recyclerView.addOnScrollListener(this.mOnScrollListenerForCascadingScrollController);
    }

    public void update() {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.mPrimaryTab;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.notifyDataSetChanged();
        }
        PagerSlidingTabSecondaryViewPagerAdapter pagerSlidingTabSecondaryViewPagerAdapter = this.mSecondaryViewPagerAdapter;
        if (pagerSlidingTabSecondaryViewPagerAdapter != null) {
            pagerSlidingTabSecondaryViewPagerAdapter.notifyDataSetChanged();
        }
    }
}
