package com.snap.ui.view.viewpagerindicator;

import java.util.List;

public interface PagerSlidingTabSource {
    PagerSlidingTabPositionRange getAdapterItemPositionRange();

    List<PagerSlidingTabSource> getChildTabs();

    int getId();

    Integer getSubTitleLayoutResId();

    String getTitle();

    Integer getTitleResId();
}
