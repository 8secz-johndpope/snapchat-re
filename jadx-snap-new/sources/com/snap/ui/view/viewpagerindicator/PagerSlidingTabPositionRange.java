package com.snap.ui.view.viewpagerindicator;

import defpackage.akmc;
import defpackage.akmd;

public class PagerSlidingTabPositionRange {
    private final int mEndPosition;
    private final int mStartPosition;

    public PagerSlidingTabPositionRange(int i, int i2) {
        this.mStartPosition = i;
        this.mEndPosition = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PagerSlidingTabPositionRange pagerSlidingTabPositionRange = (PagerSlidingTabPositionRange) obj;
        return new akmc().a(this.mStartPosition, pagerSlidingTabPositionRange.getStartPosition()).a(this.mEndPosition, pagerSlidingTabPositionRange.getEndPosition()).a;
    }

    public int getEndPosition() {
        return this.mEndPosition;
    }

    public int getStartPosition() {
        return this.mStartPosition;
    }

    public int hashCode() {
        return new akmd().a(this.mStartPosition).a(this.mEndPosition).a;
    }
}
