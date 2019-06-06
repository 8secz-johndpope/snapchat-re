package defpackage;

import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import com.snap.ui.view.recycler.LinearLayoutManagerCenterViewFinder;
import defpackage.mii.b;

/* renamed from: mhw */
public final class mhw extends ajdp<mii> {
    private final RecyclerView a;
    private final int b;

    /* renamed from: mhw$a */
    public static final class a extends ajed {
        final OnScrollListener a = new a(this);
        final ajdv<? super mii> b;
        final int c;
        private final RecyclerView d;

        /* renamed from: mhw$a$a */
        public static final class a extends OnScrollListener {
            private LinearLayoutManager a;
            private int b;
            private LinearLayoutManagerCenterViewFinder c = new LinearLayoutManagerCenterViewFinder(this.b);
            private mii d;
            private /* synthetic */ a e;

            a(a aVar) {
                this.e = aVar;
            }

            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                akcr.b(recyclerView, "recyclerView");
                if (this.a == null) {
                    LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    this.a = (LinearLayoutManager) layoutManager;
                }
                if (this.b == 0) {
                    i = (recyclerView.getLeft() + recyclerView.getRight()) / 2;
                    if (this.b != i) {
                        this.b = i;
                        this.c = new LinearLayoutManagerCenterViewFinder(i);
                    }
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                akcr.b(recyclerView, "rv");
                LinearLayoutManager linearLayoutManager = this.a;
                if (linearLayoutManager != null) {
                    View find = this.c.find(linearLayoutManager);
                    if (find != null) {
                        int abs = Math.abs(((find.getLeft() + find.getRight()) / 2) - this.b);
                        Object obj = (abs != 0 || i > 0) ? null : 1;
                        Object aVar = (obj != null || abs <= this.e.c) ? new defpackage.mii.a(recyclerView.getChildAdapterPosition(find)) : b.a;
                        if ((akcr.a(this.d, aVar) ^ 1) != 0 && !this.e.isDisposed()) {
                            this.e.b.a(aVar);
                            this.d = aVar;
                        }
                    }
                }
            }
        }

        public a(RecyclerView recyclerView, ajdv<? super mii> ajdv, int i) {
            akcr.b(recyclerView, "recyclerView");
            akcr.b(ajdv, "observer");
            this.d = recyclerView;
            this.b = ajdv;
            this.c = i;
        }

        public final void onDispose() {
            akbk akbk = mig.a;
            akcr.b(akbk, "lazyMessage");
            if (akcr.a(Looper.myLooper(), Looper.getMainLooper())) {
                this.d.removeOnScrollListener(this.a);
                return;
            }
            throw new IllegalStateException(akbk.invoke().toString());
        }
    }

    public mhw(RecyclerView recyclerView, int i) {
        akcr.b(recyclerView, "recyclerView");
        this.a = recyclerView;
        this.b = i;
    }

    public final void a_(ajdv<? super mii> ajdv) {
        akcr.b(ajdv, "observer");
        if (mig.a(ajdv)) {
            a aVar = new a(this.a, ajdv, this.b);
            ajdv.a((ajej) aVar);
            this.a.addOnScrollListener(aVar.a);
        }
    }
}
