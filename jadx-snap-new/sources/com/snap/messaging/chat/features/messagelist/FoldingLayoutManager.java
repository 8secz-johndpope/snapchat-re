package com.snap.messaging.chat.features.messagelist;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.ReverseLinearLayoutManager;
import android.util.SparseIntArray;
import android.view.View;
import defpackage.abpf;
import defpackage.abtp;
import defpackage.ajwr;
import defpackage.akcr;

public final class FoldingLayoutManager extends ReverseLinearLayoutManager {
    public final SparseIntArray a = new SparseIntArray();
    public int b = abtp.b(this.i);
    public int c;
    public int d;
    public boolean e;
    public final ajwr<Integer> f;
    private final OrientationHelper g = OrientationHelper.createOrientationHelper(this, getOrientation());
    private final Handler h = new Handler();
    private final Context i;

    static final class a implements Runnable {
        private /* synthetic */ FoldingLayoutManager a;

        a(FoldingLayoutManager foldingLayoutManager) {
            this.a = foldingLayoutManager;
        }

        public final void run() {
            this.a.requestLayout();
        }
    }

    public FoldingLayoutManager(Context context) {
        akcr.b(context, "context");
        super(context);
        this.i = context;
        Object ajwr = new ajwr();
        akcr.a(ajwr, "SingleSubject.create<Int>()");
        this.f = ajwr;
    }

    public final void a() {
        int i = this.c;
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (i4 > getHeight() - this.d) {
                i2 = i3 - 1;
                break;
            } else {
                i4 += this.a.get(i3);
                i3++;
            }
        }
        if (this.a.size() > 0) {
            this.f.b_(Integer.valueOf(i2));
        }
        i = abpf.a(getHeight() - i4, this.d, getHeight());
        if (i != this.b) {
            this.b = i;
            requestLayout();
        }
    }

    public final View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        Object obj = this.g;
        String str = "orientationHelper";
        akcr.a(obj, str);
        int startAfterPadding = obj.getStartAfterPadding();
        Object obj2 = this.g;
        akcr.a(obj2, str);
        int end = obj2.getEnd();
        int i3 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int decoratedStart = this.g.getDecoratedStart(childAt);
            int decoratedEnd = this.g.getDecoratedEnd(childAt);
            if (decoratedStart < end && decoratedEnd > startAfterPadding) {
                if (!z) {
                    return childAt;
                }
                if (decoratedStart >= startAfterPadding && decoratedEnd <= end) {
                    return childAt;
                }
                if (z2 && view == null) {
                    view = childAt;
                }
            }
            i += i3;
        }
        return view;
    }

    public final int getExtraLayoutSpace(State state) {
        return abtp.b(this.i);
    }

    public final int getPaddingBottom() {
        return this.b;
    }

    public final void measureChildWithMargins(View view, int i, int i2) {
        akcr.b(view, "child");
        super.measureChildWithMargins(view, i, i2);
        this.a.put(getPosition(view), view.getMeasuredHeight());
    }

    public final void onLayoutCompleted(State state) {
        super.onLayoutCompleted(state);
        a();
        if (this.e) {
            this.e = false;
            scrollToPositionWithOffset(0, this.b);
            this.h.post(new a(this));
        }
    }
}
