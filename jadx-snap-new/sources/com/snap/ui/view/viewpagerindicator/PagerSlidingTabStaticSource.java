package com.snap.ui.view.viewpagerindicator;

import defpackage.akmc;
import defpackage.akmd;
import java.util.List;

public class PagerSlidingTabStaticSource implements PagerSlidingTabSource {
    private final PagerSlidingTabPositionRange mAdapterItemPositionRange;
    private final List<PagerSlidingTabSource> mChildTabs;
    private final int mId;
    private final Integer mSubTitleLayoutResId;
    private final String mTitle;
    private final Integer mTitleResId;

    public PagerSlidingTabStaticSource(int i, Integer num, Integer num2, PagerSlidingTabPositionRange pagerSlidingTabPositionRange, List<PagerSlidingTabSource> list) {
        this(i, null, num, num2, pagerSlidingTabPositionRange, list);
    }

    public PagerSlidingTabStaticSource(int i, String str, PagerSlidingTabPositionRange pagerSlidingTabPositionRange, List<PagerSlidingTabSource> list) {
        this(i, str, null, null, pagerSlidingTabPositionRange, list);
    }

    public PagerSlidingTabStaticSource(int i, String str, Integer num, Integer num2, PagerSlidingTabPositionRange pagerSlidingTabPositionRange, List<PagerSlidingTabSource> list) {
        this.mId = i;
        this.mTitle = str;
        this.mTitleResId = num;
        this.mSubTitleLayoutResId = num2;
        this.mAdapterItemPositionRange = pagerSlidingTabPositionRange;
        this.mChildTabs = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PagerSlidingTabStaticSource pagerSlidingTabStaticSource = (PagerSlidingTabStaticSource) obj;
        return new akmc().a(this.mId, pagerSlidingTabStaticSource.getId()).a(this.mTitleResId, pagerSlidingTabStaticSource.getTitleResId()).a(this.mSubTitleLayoutResId, pagerSlidingTabStaticSource.getSubTitleLayoutResId()).a(this.mAdapterItemPositionRange, pagerSlidingTabStaticSource.getAdapterItemPositionRange()).a(this.mChildTabs, pagerSlidingTabStaticSource.getChildTabs()).a;
    }

    public PagerSlidingTabPositionRange getAdapterItemPositionRange() {
        return this.mAdapterItemPositionRange;
    }

    public List<PagerSlidingTabSource> getChildTabs() {
        return this.mChildTabs;
    }

    public int getId() {
        return this.mId;
    }

    public Integer getSubTitleLayoutResId() {
        return this.mSubTitleLayoutResId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public Integer getTitleResId() {
        return this.mTitleResId;
    }

    public int hashCode() {
        return new akmd().a(this.mId).a(this.mTitleResId).a(this.mSubTitleLayoutResId).a(this.mAdapterItemPositionRange).a(this.mChildTabs).a;
    }
}
