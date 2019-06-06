package com.snap.discoverfeed.shared.recyclerview;

import android.support.v7.widget.CustomizableStaggeredGridLayoutManager;
import android.support.v7.widget.CustomizableStaggeredGridLayoutManager.AnchorInfo;
import android.support.v7.widget.CustomizableStaggeredGridLayoutManager.LayoutParams;
import android.support.v7.widget.CustomizableStaggeredGridLayoutManager.LazySpanLookup;
import android.view.View;
import defpackage.hpy;

public class FixedSpanStaggeredGridLayoutManager extends CustomizableStaggeredGridLayoutManager {

    public class b extends LazySpanLookup {
        public final int getSpan(int i, LayoutParams layoutParams) {
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                if (aVar.a != null) {
                    return aVar.a.a;
                }
            }
            return super.getSpan(i, layoutParams);
        }
    }

    public static class a extends LayoutParams {
        public hpy a;

        public a(int i, int i2) {
            super(i, i2);
        }
    }

    public FixedSpanStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
        setLazySpanLookup(new b());
    }

    private int a(int i) {
        View findViewByPosition = findViewByPosition(i);
        if (findViewByPosition == null || !(findViewByPosition.getLayoutParams() instanceof a)) {
            return Integer.MIN_VALUE;
        }
        a aVar = (a) findViewByPosition.getLayoutParams();
        return aVar.a == null ? Integer.MIN_VALUE : aVar.a.b;
    }

    public void handleUpdate(int i, int i2, int i3) {
        requestLayout();
    }

    public void overrideAnchorAndSpanBeforeFill(AnchorInfo anchorInfo) {
        int spanCount = getSpanCount();
        int position = anchorInfo.getPosition();
        if (position >= 0 && getItemCount() > 0 && anchorInfo.getSpanReferenceLines() != null) {
            int i = anchorInfo.getSpanReferenceLines()[position % spanCount];
            int a = a(position);
            if (i != Integer.MIN_VALUE && a != Integer.MIN_VALUE) {
                for (int i2 = position + 1; i2 < position + spanCount; i2++) {
                    int a2 = a(i2);
                    int i3 = i2 % spanCount;
                    if (anchorInfo.getSpanReferenceLines()[i3] == Integer.MIN_VALUE || a2 == Integer.MIN_VALUE) {
                        anchorInfo.getSpanReferenceLines()[i3] = i;
                    } else {
                        anchorInfo.getSpanReferenceLines()[i3] = (i - a) + a2;
                    }
                }
                for (position = 0; position < spanCount; position++) {
                    this.mSpans[position].clear();
                    this.mSpans[position].setLine(anchorInfo.getSpanReferenceLines()[position]);
                }
            }
        }
    }
}
