package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: cfr */
final class cfr extends ajdp<Object> {
    private final View a;

    /* renamed from: cfr$a */
    static final class a extends ajed implements OnGlobalLayoutListener {
        private final View a;
        private final ajdv<? super Object> b;

        a(View view, ajdv<? super Object> ajdv) {
            this.a = view;
            this.b = ajdv;
        }

        public final void onDispose() {
            this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        public final void onGlobalLayout() {
            if (!isDisposed()) {
                this.b.a(cff.INSTANCE);
            }
        }
    }

    cfr(View view) {
        this.a = view;
    }

    public final void a_(ajdv<? super Object> ajdv) {
        if (cfg.a(ajdv)) {
            ajej aVar = new a(this.a, ajdv);
            ajdv.a(aVar);
            this.a.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        }
    }
}
