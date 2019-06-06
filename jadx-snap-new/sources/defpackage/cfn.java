package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: cfn */
final class cfn extends ajdp<Object> {
    private final View a;

    /* renamed from: cfn$a */
    static final class a extends ajed implements OnClickListener {
        private final View a;
        private final ajdv<? super Object> b;

        a(View view, ajdv<? super Object> ajdv) {
            this.a = view;
            this.b = ajdv;
        }

        public final void onClick(View view) {
            if (!isDisposed()) {
                this.b.a(cff.INSTANCE);
            }
        }

        public final void onDispose() {
            this.a.setOnClickListener(null);
        }
    }

    cfn(View view) {
        this.a = view;
    }

    public final void a_(ajdv<? super Object> ajdv) {
        if (cfg.a(ajdv)) {
            ajej aVar = new a(this.a, ajdv);
            ajdv.a(aVar);
            this.a.setOnClickListener(aVar);
        }
    }
}
