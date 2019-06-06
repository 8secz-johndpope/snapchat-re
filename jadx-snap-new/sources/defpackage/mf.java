package defpackage;

import android.support.v7.widget.RecyclerView.Adapter;

/* renamed from: mf */
public final class mf implements mi {
    private final Adapter a;

    public mf(Adapter adapter) {
        this.a = adapter;
    }

    public final void onChanged(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }

    public final void onInserted(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    public final void onMoved(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    public final void onRemoved(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }
}
