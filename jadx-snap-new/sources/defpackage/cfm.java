package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: cfm */
final class cfm extends ajdp<Object> {
    private final boolean a;
    private final View b;

    /* renamed from: cfm$a */
    static final class a extends ajed implements OnAttachStateChangeListener {
        private final View a;
        private final boolean b;
        private final ajdv<? super Object> c;

        a(View view, boolean z, ajdv<? super Object> ajdv) {
            this.a = view;
            this.b = z;
            this.c = ajdv;
        }

        public final void onDispose() {
            this.a.removeOnAttachStateChangeListener(this);
        }

        public final void onViewAttachedToWindow(View view) {
            if (this.b && !isDisposed()) {
                this.c.a(cff.INSTANCE);
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!this.b && !isDisposed()) {
                this.c.a(cff.INSTANCE);
            }
        }
    }

    cfm(View view, boolean z) {
        this.b = view;
        this.a = z;
    }

    public final void a_(ajdv<? super Object> ajdv) {
        if (cfg.a(ajdv)) {
            ajej aVar = new a(this.b, this.a, ajdv);
            ajdv.a(aVar);
            this.b.addOnAttachStateChangeListener(aVar);
        }
    }
}
