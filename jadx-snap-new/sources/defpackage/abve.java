package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.common.base.Preconditions;
import com.snap.ui.view.TakeSnapButton;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abve */
public class abve implements abvp {
    public c a;
    public int b;
    private final List<abva> c = new ArrayList();
    private final int d;
    private VelocityTracker e;
    private int f;
    private int g;
    private boolean h;
    private boolean i = true;

    /* renamed from: abve$c */
    public interface c {
        boolean a(int i);

        boolean a(int i, int i2, int i3, int i4, int i5);

        boolean a(ViewGroup viewGroup, int i, int i2);
    }

    /* renamed from: abve$a */
    public static class a implements c {
        public final boolean a(int i) {
            return false;
        }

        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return false;
        }

        public final boolean a(ViewGroup viewGroup, int i, int i2) {
            return false;
        }
    }

    /* renamed from: abve$b */
    public static abstract class b implements c {
        public final boolean a(int i) {
            return false;
        }
    }

    /* renamed from: abve$d */
    public static class d implements c {
        private final int a = TakeSnapButton.LONG_PRESS_TIME;
        private final int b;

        public d(Context context) {
            this.b = (int) abso.a(true, 500.0f, context);
        }

        public final boolean a(int i) {
            int i2 = this.b;
            return i < (-i2) || i > i2;
        }

        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return Math.abs(i2 - i4) >= i5;
        }

        public boolean a(ViewGroup viewGroup, int i, int i2) {
            i = viewGroup.getChildCount();
            for (int i3 = 0; i3 < i; i3++) {
                if (abup.a(viewGroup.getChildAt(i3))) {
                    return true;
                }
            }
            return false;
        }
    }

    public abve(Context context, c cVar) {
        this.a = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.b = viewConfiguration.getScaledTouchSlop();
    }

    private void b() {
        VelocityTracker velocityTracker = this.e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.e = null;
        }
    }

    private void b(MotionEvent motionEvent) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        this.e.addMovement(motionEvent);
    }

    private void c(ViewGroup viewGroup, MotionEvent motionEvent) {
        this.h = true;
        ViewParent parent = viewGroup.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.g = (int) motionEvent.getY();
        this.f = (int) motionEvent.getX();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            ((abva) this.c.get(size)).a(this.f, this.g);
        }
        b(motionEvent);
    }

    public final void a() {
        this.c.clear();
    }

    public final void a(abva abva) {
        this.c.add(abva);
    }

    public final boolean a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0 && !this.c.isEmpty();
    }

    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        Preconditions.checkNotNull(this.a);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = (int) motionEvent.getY();
            this.f = (int) motionEvent.getX();
            if (this.i && motionEvent.getPointerCount() <= 1 && this.b == 0 && !this.a.a(viewGroup, this.f, this.g)) {
                c(viewGroup, motionEvent);
                return true;
            }
        } else if (actionMasked == 2 && this.i && motionEvent.getPointerCount() <= 1 && this.a.a(this.f, this.g, (int) motionEvent.getX(), (int) motionEvent.getY(), this.b) && !this.a.a(viewGroup, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            c(viewGroup, motionEvent);
            return true;
        }
        return false;
    }

    public final boolean b(ViewGroup viewGroup, MotionEvent motionEvent) {
        Preconditions.checkNotNull(this.a);
        int actionMasked = motionEvent.getActionMasked();
        int size;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.h && motionEvent.getPointerCount() <= 1 && this.a.a(this.f, this.g, (int) motionEvent.getX(), (int) motionEvent.getY(), this.b)) {
                    c(viewGroup, motionEvent);
                }
                if (this.h) {
                    b(motionEvent);
                    for (size = this.c.size() - 1; size >= 0; size--) {
                        ((abva) this.c.get(size)).b((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
                }
            } else if (actionMasked == 3 && this.h) {
                for (size = this.c.size() - 1; size >= 0; size--) {
                    ((abva) this.c.get(size)).a();
                }
            }
            return this.h;
        }
        if (this.h) {
            int i;
            boolean z;
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker == null) {
                size = 0;
                i = 0;
                z = false;
            } else {
                velocityTracker.computeCurrentVelocity(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, (float) this.d);
                i = (int) velocityTracker.getXVelocity();
                size = (int) velocityTracker.getYVelocity();
                z = this.a.a(size);
            }
            for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
                ((abva) this.c.get(size2)).a(z, i, size);
            }
        }
        return this.h;
        this.h = false;
        b();
        return this.h;
    }
}
