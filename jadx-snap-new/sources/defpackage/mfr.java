package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: mfr */
public final class mfr implements OnTouchListener {
    private MotionEvent a;
    private boolean b;
    private Runnable c;
    private final View d;

    /* renamed from: mfr$a */
    static final class a implements Runnable {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final void run() {
            this.a.performClick();
        }
    }

    public mfr(View view) {
        akcr.b(view, "dispatchTo");
        this.d = view;
    }

    private final void a(View view) {
        Runnable runnable = this.c;
        if (runnable != null) {
            this.c = null;
            view.removeCallbacks(runnable);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        akcr.b(view, "v");
        akcr.b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.b) {
                        MotionEvent motionEvent2 = this.a;
                        if (motionEvent2 != null) {
                            float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
                            Object obj = ViewConfiguration.get(view.getContext());
                            akcr.a(obj, "ViewConfiguration.get(view.context)");
                            if (abs > ((float) obj.getScaledTouchSlop())) {
                                z = true;
                            }
                            if (z) {
                                a(view);
                                mfs.a(this.d, motionEvent2);
                                this.b = true;
                            }
                        }
                    }
                    return mfs.a(this.d, motionEvent);
                } else if (actionMasked != 3) {
                    return false;
                }
            }
            a(view);
            if (!this.b) {
                this.b = false;
                this.a = null;
                view.performClick();
                return true;
            }
            return mfs.a(this.d, motionEvent);
        }
        this.b = false;
        this.a = MotionEvent.obtain(motionEvent);
        Runnable aVar = new a(view);
        view.postDelayed(aVar, ((long) ViewConfiguration.getLongPressTimeout()) / 2);
        this.c = aVar;
        return true;
    }
}
