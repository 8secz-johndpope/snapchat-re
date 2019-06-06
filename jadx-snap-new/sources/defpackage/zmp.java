package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zmp */
public final class zmp extends OnScrollListener {
    private final Set<OnScrollListener> a = new HashSet();
    private final ajwo<Integer> b = new ajwo();
    private final ajwo<Pair<Integer, Integer>> c = new ajwo();

    public final ajdp<Integer> a() {
        return this.b;
    }

    public final void a(OnScrollListener onScrollListener) {
        this.a.add(onScrollListener);
    }

    public final ajdp<Pair<Integer, Integer>> b() {
        return this.c;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        for (OnScrollListener onScrollStateChanged : this.a) {
            onScrollStateChanged.onScrollStateChanged(recyclerView, i);
        }
        this.b.a(Integer.valueOf(i));
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        for (OnScrollListener onScrolled : this.a) {
            onScrolled.onScrolled(recyclerView, i, i2);
        }
        this.c.a(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
