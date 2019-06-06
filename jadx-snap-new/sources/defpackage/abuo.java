package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abuo */
public class abuo {
    private final List<a> a = new ArrayList();
    private float b;
    public int c = 0;
    private float d;
    private float e;
    private float f;
    private int g;
    private VelocityTracker h = null;
    private int i;
    private int j;

    /* renamed from: abuo$a */
    public interface a {
        void a();

        void a(float f, float f2, float f3, float f4);

        void b();

        void c();
    }

    private boolean a() {
        VelocityTracker velocityTracker = this.h;
        velocityTracker.computeCurrentVelocity(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, (float) this.g);
        int yVelocity = (int) velocityTracker.getYVelocity();
        int xVelocity = (int) velocityTracker.getXVelocity();
        return (xVelocity > this.i && this.c == 3) || ((xVelocity < (-this.i) && this.c == 4) || (yVelocity > this.j && this.c == 2));
    }

    private void b() {
        this.c = 0;
        VelocityTracker velocityTracker = this.h;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h = null;
        }
    }

    private void b(float f, float f2) {
        this.e = f / ((float) d());
        this.f = f2 / ((float) d());
    }

    private void c(MotionEvent motionEvent) {
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
        this.h.addMovement(motionEvent);
    }

    private boolean d(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX() - this.b) > this.e || motionEvent.getY() - this.d > this.f;
    }

    public final void a(float f, float f2) {
        this.b = f;
        this.d = f2;
    }

    public final void a(a aVar) {
        if (!this.a.contains(aVar)) {
            this.a.add(aVar);
        }
    }

    public final void a(Context context) {
        this.g = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.i = abso.a(700.0f, context);
        this.j = abso.a(200.0f, context);
    }

    public final void a(MotionEvent motionEvent) {
        c(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (y - this.d > this.f) {
            this.c = 2;
        }
        if (e()) {
            for (int i = 0; i < this.a.size(); i++) {
                ((a) this.a.get(i)).b();
            }
            a(x, y);
        }
    }

    public final void a(View view) {
        b((float) view.getWidth(), (float) view.getHeight());
    }

    public final void b(MotionEvent motionEvent) {
        c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    g();
                }
                return;
            }
            for (action = 0; action < this.a.size(); action++) {
                ((a) this.a.get(action)).a(motionEvent.getX() - this.b, motionEvent.getY() - this.d, motionEvent.getX(), motionEvent.getY());
            }
        } else if (a() || d(motionEvent)) {
            f();
        } else {
            g();
        }
    }

    /* Access modifiers changed, original: protected */
    public int d() {
        return 8;
    }

    public final boolean e() {
        int i = this.c;
        return i == 3 || i == 4 || i == 2;
    }

    public final void f() {
        b();
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).a();
        }
    }

    public final void g() {
        b();
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).c();
        }
    }
}
