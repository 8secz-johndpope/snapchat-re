package com.snap.ui.view.scrollbar;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class SnapScrollBar$scrollListener$2 extends akcs implements akbk<AnonymousClass1> {
    final /* synthetic */ SnapScrollBar this$0;

    /* renamed from: com.snap.ui.view.scrollbar.SnapScrollBar$scrollListener$2$1 */
    public static final class AnonymousClass1 extends OnScrollListener {
        final /* synthetic */ SnapScrollBar$scrollListener$2 this$0;

        AnonymousClass1(SnapScrollBar$scrollListener$2 snapScrollBar$scrollListener$2) {
            this.this$0 = snapScrollBar$scrollListener$2;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            if (i == 0 && !this.this$0.this$0.isScrollingFromScrollBar()) {
                SnapScrollBar.access$getScrollBarIndicator$p(this.this$0.this$0).hideIndicatorTextView(SnapScrollBar.access$getHideScrollBarRunnable$p(this.this$0.this$0));
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            akcr.b(recyclerView, "recyclerView");
            if (Math.abs(i2) > 5) {
                this.this$0.this$0.showScrollBar();
            }
            this.this$0.this$0.updateScrollBarSize();
            this.this$0.this$0.updateIndicatorText();
            if (!this.this$0.this$0.isScrollingFromScrollBar()) {
                this.this$0.this$0.updateScrollBarProgress();
                if (Math.abs(i2) > 250) {
                    SnapScrollBar.access$getScrollBarIndicator$p(this.this$0.this$0).showIndicatorTextView(0.7f);
                }
            }
        }
    }

    SnapScrollBar$scrollListener$2(SnapScrollBar snapScrollBar) {
        this.this$0 = snapScrollBar;
        super(0);
    }

    public final AnonymousClass1 invoke() {
        return new AnonymousClass1(this);
    }
}
