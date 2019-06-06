package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: ov */
public final class ov implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    public static ov b;
    public static ov c;
    public final View a;
    private final CharSequence d;
    private final Runnable e = new 1();
    private final Runnable f = new 2();
    private int g;
    private int h;
    private ow i;
    private boolean j;

    /* renamed from: ov$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            ov.this.a(false);
        }
    }

    /* renamed from: ov$2 */
    class 2 implements Runnable {
        2() {
        }

        public final void run() {
            ov.this.a();
        }
    }

    public ov(View view, CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public static void a(ov ovVar) {
        ov ovVar2 = b;
        if (ovVar2 != null) {
            ovVar2.c();
        }
        b = ovVar;
        if (ovVar != null) {
            b.b();
        }
    }

    private void b() {
        this.a.postDelayed(this.e, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void c() {
        this.a.removeCallbacks(this.e);
    }

    public final void a() {
        if (c == this) {
            c = null;
            ow owVar = this.i;
            if (owVar != null) {
                owVar.a();
                this.i = null;
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (b == this) {
            ov.a(null);
        }
        this.a.removeCallbacks(this.f);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (kb.a.r(this.a)) {
            long j;
            ov.a(null);
            ov ovVar = c;
            if (ovVar != null) {
                ovVar.a();
            }
            c = this;
            this.j = z;
            this.i = new ow(this.a.getContext());
            this.i.a(this.a, this.g, this.h, this.j, this.d);
            this.a.addOnAttachStateChangeListener(this);
            if (this.j) {
                j = 2500;
            } else {
                j = ((kb.a.m(this.a) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.a.removeCallbacks(this.f);
            this.a.postDelayed(this.f, j);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
            }
        } else if (this.a.isEnabled() && this.i == null) {
            this.g = (int) motionEvent.getX();
            this.h = (int) motionEvent.getY();
            ov.a(this);
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        a(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
