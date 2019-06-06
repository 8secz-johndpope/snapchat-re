package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.KeyEvent.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: ejj */
public final class ejj implements Callback, OnTouchListener {
    final View a;
    private final dpd b;
    private final View c;
    private final ejl d;
    private final Supplier<Boolean> e;
    private final Supplier<Rect> f = new 1();
    private int g;
    private boolean h = false;
    private float i = MapboxConstants.MINIMUM_ZOOM;
    private float j = Float.NaN;
    private Predicate<MotionEvent> k;

    /* renamed from: ejj$1 */
    class 1 implements Supplier<Rect> {
        private final int[] a = new int[2];
        private final Rect b = new Rect();

        1() {
        }

        public final /* synthetic */ Object get() {
            ejj.this.a.getLocationOnScreen(this.a);
            Rect rect = this.b;
            int[] iArr = this.a;
            rect.set(iArr[0], iArr[1], (int) (((float) iArr[0]) + (((float) ejj.this.a.getWidth()) * ejj.this.a.getScaleX())), (int) (((float) this.a[1]) + (((float) ejj.this.a.getHeight()) * ejj.this.a.getScaleY())));
            return this.b;
        }
    }

    public ejj(dpd dpd, View view, View view2, ejl ejl, Supplier<Boolean> supplier) {
        this.b = dpd;
        this.a = view;
        this.c = view2;
        this.d = ejl;
        this.e = supplier;
        this.k = Predicates.alwaysFalse();
        this.g = -1;
    }

    private /* synthetic */ void a() {
        this.k = null;
    }

    private static boolean a(int i) {
        return i == 24 || i == 25 || i == 27 || i == 66;
    }

    private boolean a(int i, KeyEvent keyEvent) {
        if (!((Boolean) this.e.get()).booleanValue()) {
            return false;
        }
        if (this.g == -1 && keyEvent.getAction() == 0 && ejj.a(i)) {
            this.g = i;
            this.b.c();
        } else if (this.g == i && keyEvent.getAction() == 1) {
            this.b.d();
            this.g = -1;
        }
        return ejj.a(i);
    }

    private boolean a(MotionEvent motionEvent) {
        return ((Rect) this.f.get()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    private static boolean a(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        motionEvent.setLocation(motionEvent.getRawX() - ((float) iArr[0]), motionEvent.getRawY() - ((float) iArr[1]));
        return view.dispatchTouchEvent(motionEvent);
    }

    private boolean b(MotionEvent motionEvent) {
        return this.d.a().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final ajej a(Predicate<MotionEvent> predicate) {
        this.k = predicate;
        return ajek.a(new -$$Lambda$ejj$i9pPZuQ_OsG0Zf2_qd0AyG0MwI4(this));
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return a(i, keyEvent);
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return a(i, keyEvent);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (a(motionEvent)) {
                this.b.a();
            } else if (b(motionEvent)) {
                this.b.h();
            }
            this.i = Math.min(MapboxConstants.MINIMUM_ZOOM, motionEvent.getY());
            this.j = motionEvent.getX();
            this.h = false;
            return true;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            if (b(motionEvent)) {
                this.b.i();
            } else {
                this.b.b();
            }
            if (!this.h) {
                return true;
            }
        } else if (actionMasked != 2) {
            return false;
        } else {
            if (!this.h) {
                Object obj = (motionEvent.getEventTime() - motionEvent.getDownTime() >= 190 || Math.abs(this.j - motionEvent.getX()) <= ((float) ViewConfiguration.get(this.a.getContext()).getScaledTouchSlop())) ? null : 1;
                if (obj == null || !this.k.apply(motionEvent)) {
                    if (a(motionEvent)) {
                        this.b.f();
                    } else if (b(motionEvent)) {
                        this.b.e();
                    } else {
                        this.b.g();
                    }
                    float min = Math.min(MapboxConstants.MINIMUM_ZOOM, motionEvent.getY());
                    this.b.a(this.i - min);
                    this.i = min;
                    return true;
                }
                this.h = true;
                motionEvent.setAction(0);
            }
        }
        return ejj.a(motionEvent, this.c);
    }
}
