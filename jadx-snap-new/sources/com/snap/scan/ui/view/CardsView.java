package com.snap.scan.ui.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.AttributeSet;
import com.snap.ui.view.recycler.RecyclerViewCenterViewLock;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.vwr;

public final class CardsView extends RecyclerView implements android.support.design.widget.CoordinatorLayout.a {
    public akbk<ajxw> a;

    public static final class b extends Callback {
        private /* synthetic */ CardsView a;
        private /* synthetic */ LayoutManager b;

        b(CardsView cardsView, LayoutManager layoutManager) {
            this.a = cardsView;
            this.b = layoutManager;
        }

        public final int getMovementFlags(RecyclerView recyclerView, ViewHolder viewHolder) {
            akcr.b(recyclerView, "recyclerView");
            akcr.b(viewHolder, "viewHolder");
            return Callback.makeMovementFlags(0, 48);
        }

        public final boolean isLongPressDragEnabled() {
            return false;
        }

        public final boolean onMove(RecyclerView recyclerView, ViewHolder viewHolder, ViewHolder viewHolder2) {
            akcr.b(recyclerView, "recyclerView");
            akcr.b(viewHolder, "viewHolder");
            akcr.b(viewHolder2, "target");
            return false;
        }

        public final void onSwiped(ViewHolder viewHolder, int i) {
            akcr.b(viewHolder, "viewHolder");
            if (this.a.getAdapter() != null) {
                Object adapter = this.a.getAdapter();
                akcr.a(adapter, "adapter");
                if (adapter.getItemCount() == 1) {
                    CardsView.a(this.a);
                    return;
                }
                this.a.getAdapter().notifyItemRemoved(this.b.getPosition(viewHolder.itemView));
            }
        }
    }

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ CardsView a;

        a(CardsView cardsView) {
            this.a = cardsView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            CardsView.a(this.a);
            return ajxw.a;
        }
    }

    public CardsView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private CardsView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public static final /* synthetic */ ajxw a(CardsView cardsView) {
        akbk akbk = cardsView.a;
        return akbk != null ? (ajxw) akbk.invoke() : null;
    }

    public final android.support.design.widget.CoordinatorLayout.b<?> a() {
        return new CardBehavior(new a(this), (byte) 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object context = getContext();
        akcr.a(context, "context");
        LayoutManager cardsLayoutManager = new CardsLayoutManager(context);
        setLayoutManager(cardsLayoutManager);
        addOnScrollListener(new RecyclerViewCenterViewLock(0, null, 2, null));
        addItemDecoration(new vwr(30));
        new ItemTouchHelper(new b(this, cardsLayoutManager)).attachToRecyclerView(this);
    }
}
