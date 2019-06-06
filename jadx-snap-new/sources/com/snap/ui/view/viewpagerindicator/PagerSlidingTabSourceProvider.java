package com.snap.ui.view.viewpagerindicator;

import java.util.List;

public interface PagerSlidingTabSourceProvider {
    List<PagerSlidingTabSource> getTabs();

    boolean isTabSourceProviderEnabled();
}
