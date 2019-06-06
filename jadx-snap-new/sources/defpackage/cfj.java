package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;

/* renamed from: cfj */
final class cfj extends ajdp<cfi> {
    private final RecyclerView a;

    /* renamed from: cfj$a */
    final class a extends ajed {
        final OnScrollListener a;
        private final RecyclerView b;

        a(RecyclerView recyclerView, final ajdv<? super cfi> ajdv) {
            this.b = recyclerView;
            this.a = new OnScrollListener(cfj.this) {
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    if (!a.this.isDisposed()) {
                        ajdv.a(new cfh(recyclerView, i, i2));
                    }
                }
            };
        }

        public final void onDispose() {
            this.b.removeOnScrollListener(this.a);
        }
    }

    cfj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a_(ajdv<? super cfi> ajdv) {
        if (cfg.a(ajdv)) {
            ajej aVar = new a(this.a, ajdv);
            ajdv.a(aVar);
            this.a.addOnScrollListener(aVar.a);
        }
    }
}
