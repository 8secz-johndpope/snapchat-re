package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: cfq */
final class cfq extends ajdp<MotionEvent> {
    private final View a;
    private final ajfl<? super MotionEvent> b;

    /* renamed from: cfq$a */
    static final class a extends ajed implements OnTouchListener {
        private final View a;
        private final ajfl<? super MotionEvent> b;
        private final ajdv<? super MotionEvent> c;

        a(View view, ajfl<? super MotionEvent> ajfl, ajdv<? super MotionEvent> ajdv) {
            this.a = view;
            this.b = ajfl;
            this.c = ajdv;
        }

        public final void onDispose() {
            this.a.setOnTouchListener(null);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!isDisposed()) {
                try {
                    if (this.b.test(motionEvent)) {
                        this.c.a((Object) motionEvent);
                        return true;
                    }
                } catch (Exception e) {
                    this.c.a(e);
                    dispose();
                }
            }
            return false;
        }
    }

    cfq(View view, ajfl<? super MotionEvent> ajfl) {
        this.a = view;
        this.b = ajfl;
    }

    public final void a_(ajdv<? super MotionEvent> ajdv) {
        if (cfg.a(ajdv)) {
            ajej aVar = new a(this.a, this.b, ajdv);
            ajdv.a(aVar);
            this.a.setOnTouchListener(aVar);
        }
    }
}
