package com.snap.ui.view.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import defpackage.jz;
import java.util.ArrayList;
import java.util.List;

public class PagerSlidingTabSecondaryViewPagerAdapter extends jz {
    public static final int VIEW_POSITION_TAG = "VIEW_POSITION_TAG".hashCode();
    private final List<Boolean> mAdapterItemScrollable;
    private final List<Integer> mAdapterItemToPrimaryTabPositions;
    private final RecyclerView mPrimaryTabRecyclerView;
    private final ViewPager mPrimaryTabViewPager;
    private final List<PagerSlidingTabSource> mPrimaryTabs;
    private final PagerSlidingTabSourceProvider mTabSourceProvider;
    private final int mTabViewLayoutId;
    private final Object mUpdateLock;

    protected PagerSlidingTabSecondaryViewPagerAdapter(ViewPager viewPager, RecyclerView recyclerView, PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider, int i) {
        this.mPrimaryTabViewPager = viewPager;
        this.mPrimaryTabRecyclerView = recyclerView;
        this.mTabSourceProvider = pagerSlidingTabSourceProvider;
        this.mTabViewLayoutId = i;
        this.mPrimaryTabs = new ArrayList();
        this.mAdapterItemToPrimaryTabPositions = new ArrayList();
        this.mAdapterItemScrollable = new ArrayList();
        this.mUpdateLock = new Object();
    }

    public PagerSlidingTabSecondaryViewPagerAdapter(ViewPager viewPager, PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider, int i) {
        this(viewPager, null, pagerSlidingTabSourceProvider, i);
    }

    public PagerSlidingTabSecondaryViewPagerAdapter(RecyclerView recyclerView, PagerSlidingTabSourceProvider pagerSlidingTabSourceProvider, int i) {
        this(null, recyclerView, pagerSlidingTabSourceProvider, i);
    }

    private View createDummyView(Context context, int i) {
        View view = new View(context);
        view.setLayoutParams(new LayoutParams(-1, 0));
        view.setTag(VIEW_POSITION_TAG, Integer.valueOf(i));
        return view;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public Boolean getAdapterItemScrollable(int i) {
        synchronized (this.mUpdateLock) {
            if (i >= this.mAdapterItemScrollable.size()) {
                return null;
            }
            Boolean bool = (Boolean) this.mAdapterItemScrollable.get(i);
            return bool;
        }
    }

    public Integer getAdapterItemToPrimaryTabPosition(int i) {
        synchronized (this.mUpdateLock) {
            if (i >= this.mAdapterItemToPrimaryTabPositions.size()) {
                return null;
            }
            Integer num = (Integer) this.mAdapterItemToPrimaryTabPositions.get(i);
            return num;
        }
    }

    public int getCount() {
        return this.mPrimaryTabs.size();
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (i >= this.mPrimaryTabs.size()) {
            return createDummyView(viewGroup.getContext(), i);
        }
        PagerSlidingTabSource pagerSlidingTabSource = (PagerSlidingTabSource) this.mPrimaryTabs.get(i);
        Integer subTitleLayoutResId = pagerSlidingTabSource.getSubTitleLayoutResId();
        List childTabs = pagerSlidingTabSource.getChildTabs();
        if (subTitleLayoutResId == null && childTabs.isEmpty()) {
            View createDummyView = createDummyView(viewGroup.getContext(), i);
            viewGroup.addView(createDummyView);
            return createDummyView;
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setTag(VIEW_POSITION_TAG, Integer.valueOf(i));
        viewGroup.addView(linearLayout);
        if (!childTabs.isEmpty()) {
            PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) LayoutInflater.from(viewGroup.getContext()).inflate(this.mTabViewLayoutId, linearLayout, false);
            linearLayout.addView(pagerSlidingTabStrip);
            pagerSlidingTabStrip.setParentTab(pagerSlidingTabSource);
            ViewPager viewPager = this.mPrimaryTabViewPager;
            if (viewPager != null) {
                pagerSlidingTabStrip.setViewPager(viewPager);
            }
            RecyclerView recyclerView = this.mPrimaryTabRecyclerView;
            if (recyclerView != null) {
                pagerSlidingTabStrip.setRecyclerView(recyclerView);
            }
        }
        if (subTitleLayoutResId != null) {
            linearLayout.addView(LayoutInflater.from(viewGroup.getContext()).inflate(subTitleLayoutResId.intValue(), linearLayout, false));
        }
        return linearLayout;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0092 in {6, 7, 16, 17, 20, 21, 25} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public void notifyDataSetChanged() {
        /*
        r9 = this;
        r0 = r9.mTabSourceProvider;
        r0 = r0.getTabs();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r0.iterator();
        r4 = 0;
        r5 = 0;
        r6 = r3.hasNext();
        if (r6 == 0) goto L_0x004e;
        r6 = r3.next();
        r6 = (com.snap.ui.view.viewpagerindicator.PagerSlidingTabSource) r6;
        r6 = r6.getAdapterItemPositionRange();
        r7 = r6.getStartPosition();
        r8 = r6.getEndPosition();
        if (r7 >= r8) goto L_0x003f;
        r8 = java.lang.Integer.valueOf(r5);
        r1.add(r8);
        r8 = java.lang.Boolean.FALSE;
        r2.add(r8);
        r7 = r7 + 1;
        goto L_0x002a;
        r6 = java.lang.Integer.valueOf(r5);
        r1.add(r6);
        r6 = java.lang.Boolean.TRUE;
        r2.add(r6);
        r5 = r5 + 1;
        goto L_0x0016;
        r3 = r9.mUpdateLock;
        monitor-enter(r3);
        r5 = r9.mPrimaryTabs;	 Catch:{ all -> 0x008f }
        r5 = r5.equals(r0);	 Catch:{ all -> 0x008f }
        if (r5 == 0) goto L_0x0069;	 Catch:{ all -> 0x008f }
        r5 = r9.mAdapterItemToPrimaryTabPositions;	 Catch:{ all -> 0x008f }
        r5 = r5.equals(r1);	 Catch:{ all -> 0x008f }
        if (r5 == 0) goto L_0x0069;	 Catch:{ all -> 0x008f }
        r5 = r9.mAdapterItemScrollable;	 Catch:{ all -> 0x008f }
        r5 = r5.equals(r2);	 Catch:{ all -> 0x008f }
        if (r5 != 0) goto L_0x0088;	 Catch:{ all -> 0x008f }
        r4 = r9.mPrimaryTabs;	 Catch:{ all -> 0x008f }
        r4.clear();	 Catch:{ all -> 0x008f }
        r4 = r9.mPrimaryTabs;	 Catch:{ all -> 0x008f }
        r4.addAll(r0);	 Catch:{ all -> 0x008f }
        r0 = r9.mAdapterItemToPrimaryTabPositions;	 Catch:{ all -> 0x008f }
        r0.clear();	 Catch:{ all -> 0x008f }
        r0 = r9.mAdapterItemToPrimaryTabPositions;	 Catch:{ all -> 0x008f }
        r0.addAll(r1);	 Catch:{ all -> 0x008f }
        r0 = r9.mAdapterItemScrollable;	 Catch:{ all -> 0x008f }
        r0.clear();	 Catch:{ all -> 0x008f }
        r0 = r9.mAdapterItemScrollable;	 Catch:{ all -> 0x008f }
        r0.addAll(r2);	 Catch:{ all -> 0x008f }
        r4 = 1;	 Catch:{ all -> 0x008f }
        monitor-exit(r3);	 Catch:{ all -> 0x008f }
        if (r4 == 0) goto L_0x008e;
        super.notifyDataSetChanged();
        return;
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x008f }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.viewpagerindicator.PagerSlidingTabSecondaryViewPagerAdapter.notifyDataSetChanged():void");
    }
}
