package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;

/* renamed from: lsr */
public final class lsr extends ItemDecoration {
    private final Rect a;
    private final int b;

    public lsr(Rect rect, int i) {
        akcr.b(rect, "edgeItemSpacing");
        this.a = rect;
        this.b = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        akcr.b(rect, "outRect");
        akcr.b(view, "view");
        akcr.b(recyclerView, "parent");
        akcr.b(state, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            akcr.a();
        }
        int position = layoutManager.getPosition(view);
        int itemCount = layoutManager.getItemCount();
        int i = 1;
        int i2 = 0;
        Object obj = position == 0 ? 1 : null;
        if (position != itemCount - 1) {
            i = 0;
        }
        rect.left += obj != null ? this.a.left : this.b;
        position = rect.right;
        if (i != 0) {
            i2 = this.a.right;
        }
        rect.right = position + i2;
        rect.top += this.a.top;
        rect.bottom += this.a.bottom;
    }
}
