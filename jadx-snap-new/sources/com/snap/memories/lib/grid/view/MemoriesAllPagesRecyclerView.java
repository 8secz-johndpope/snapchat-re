package com.snap.memories.lib.grid.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class MemoriesAllPagesRecyclerView extends RecyclerView {
    public boolean a = true;
    private final ajxe b = ajxh.a(new a(this));
    private int c;
    private int d;
    private int e;

    static final class a extends akcs implements akbk<Integer> {
        private /* synthetic */ MemoriesAllPagesRecyclerView a;

        a(MemoriesAllPagesRecyclerView memoriesAllPagesRecyclerView) {
            this.a = memoriesAllPagesRecyclerView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = ViewConfiguration.get(this.a.getContext());
            akcr.a(obj, "ViewConfiguration.get(this.context)");
            return Integer.valueOf(obj.getScaledTouchSlop());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(MemoriesAllPagesRecyclerView.class), "touchSlop", "getTouchSlop()I");
    }

    public MemoriesAllPagesRecyclerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    private final int a() {
        return ((Number) this.b.b()).intValue();
    }

    public final boolean canScrollVertically(int i) {
        return !this.a ? true : super.canScrollVertically(i);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3)) {
            this.e = 0;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.c = (int) motionEvent.getX();
            this.d = (int) motionEvent.getY();
            stopScroll();
        } else if (action == 1) {
            this.e = 0;
        } else if (action == 2) {
            action = this.e;
            if (action != 0) {
                return action == 1;
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                x = Math.abs(x - ((float) this.c));
                y = Math.abs(y - ((float) this.d));
                if (y > ((float) a()) && y > x) {
                    this.e = 2;
                } else if (x > ((float) a())) {
                    this.e = 1;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
