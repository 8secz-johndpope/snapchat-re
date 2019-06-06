package com.snap.ui.view.recycler;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import defpackage.akcr;

public final class LinearLayoutManagerCenterViewFinder {
    private final int centerPivot;

    public LinearLayoutManagerCenterViewFinder(int i) {
        this.centerPivot = i;
    }

    public final View find(LinearLayoutManager linearLayoutManager) {
        akcr.b(linearLayoutManager, "lm");
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        Object obj = 1;
        View view = null;
        int i = 0;
        while (findFirstVisibleItemPosition <= linearLayoutManager.findLastVisibleItemPosition() && obj != null) {
            View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
            if (findViewByPosition == null) {
                break;
            }
            int left;
            int right;
            if (linearLayoutManager.getOrientation() == 0) {
                left = findViewByPosition.getLeft();
                right = findViewByPosition.getRight();
            } else {
                left = findViewByPosition.getTop();
                right = findViewByPosition.getBottom();
            }
            left = Math.abs(this.centerPivot - ((left + right) / 2));
            if (left <= i || findFirstVisibleItemPosition == linearLayoutManager.findFirstVisibleItemPosition()) {
                view = findViewByPosition;
                i = left;
            } else {
                obj = null;
            }
            findFirstVisibleItemPosition++;
        }
        return view;
    }
}
