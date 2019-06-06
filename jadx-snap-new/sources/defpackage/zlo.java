package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.TakeSnapButton;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.PullToRefreshLayout;

/* renamed from: zlo */
public final class zlo implements zlt {
    final float a;
    final float b;
    boolean c;
    int d;
    final PullToRefreshLayout e;
    final ImageView f;
    final View g;
    final View h;
    boolean i;
    Animator j;
    DecelerateInterpolator k;
    AnimatorListener l;
    c m;
    b n;
    d o;
    float p = MapboxConstants.MINIMUM_ZOOM;
    private final Handler q = new Handler(Looper.getMainLooper());
    private final int r;
    private final int s;
    private final Drawable t;
    private TransitionDrawable u;
    private boolean v = false;
    private Runnable w;
    private Rect x;
    private int y;
    private final OnScrollListener z = new 1();

    /* renamed from: zlo$c */
    public interface c {
        boolean a();
    }

    /* renamed from: zlo$b */
    public interface b {
        void a(float f);
    }

    /* renamed from: zlo$d */
    public interface d {
        void a(int i);
    }

    /* renamed from: zlo$1 */
    class 1 extends OnScrollListener {
        private int a;

        1() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                zlo.this.b();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            if (!((i == 0 && i2 == 0) || computeVerticalScrollOffset == 0)) {
                computeVerticalScrollOffset = this.a + i2;
            }
            this.a = computeVerticalScrollOffset;
            if (zlo.this.o != null) {
                zlo.this.o.a(this.a);
            }
            zlo.this.b();
        }
    }

    /* renamed from: zlo$a */
    class a implements com.snapchat.android.framework.ui.views.PullToRefreshLayout.a {
        private a() {
        }

        /* synthetic */ a(zlo zlo, byte b) {
            this();
        }

        public final void a() {
            zlo zlo = zlo.this;
            if (zlo.k == null) {
                zlo.k = new DecelerateInterpolator(1.5f);
            }
            if (zlo.l == null) {
                zlo.l = new 2();
            }
            View view = zlo.h;
            Property property = View.TRANSLATION_Y;
            r3 = new float[2];
            boolean z = false;
            r3[0] = zlo.f.getTranslationY();
            r3[1] = (float) ((-zlo.f.getHeight()) - zlo.d);
            zlo.j = ObjectAnimator.ofFloat(view, property, r3).setDuration(500);
            zlo.j.setInterpolator(zlo.k);
            zlo.j.addListener(zlo.l);
            zlo.j.start();
            zlo.this.a((int) R.color.regular_yellow, false);
            zlo = zlo.this;
            if (zlo.m != null && zlo.this.m.a()) {
                z = true;
            }
            zlo.i = z;
        }

        public final void a(float f) {
            zlo zlo = zlo.this;
            zlo.p = f;
            if (zlo.n != null) {
                zlo.this.n.a(f);
            }
            if (zlo.this.j == null || !zlo.this.j.isStarted()) {
                View view;
                float height;
                zlo.this.f.setVisibility(0);
                zlo.this.g.setVisibility(0);
                if (f > zlo.this.b) {
                    if (zlo.this.c) {
                        zlo.this.f.setImageResource(R.drawable.neon_ptr_pulled);
                        zlo.this.c = false;
                    }
                    zlo.this.f.setTranslationY((f - ((float) zlo.this.f.getHeight())) + ((float) zlo.this.d));
                    view = zlo.this.g;
                    height = (f - ((float) zlo.this.g.getHeight())) + ((float) zlo.this.d);
                } else {
                    if (f > zlo.this.a) {
                        if (!zlo.this.c) {
                            zlo.this.f.setImageResource(R.drawable.neon_ptr_peeking);
                            zlo.this.c = true;
                        }
                        height = (((((zlo.this.b - zlo.this.a) - ((float) zlo.this.g.getHeight())) / (zlo.this.b - zlo.this.a)) * (f - zlo.this.a)) + zlo.this.a) + ((float) zlo.this.d);
                        zlo.this.f.setTranslationY((((((zlo.this.b - zlo.this.a) - ((float) zlo.this.f.getHeight())) / (zlo.this.b - zlo.this.a)) * (f - zlo.this.a)) + zlo.this.a) + ((float) zlo.this.d));
                        view = zlo.this.g;
                    }
                    zlo = zlo.this;
                    zlo.a(zlo.d(), (int) f);
                }
                view.setTranslationY(height);
                zlo = zlo.this;
                zlo.a(zlo.d(), (int) f);
            }
        }
    }

    /* renamed from: zlo$2 */
    class 2 extends AnimatorListenerAdapter {
        2() {
        }

        public final void onAnimationEnd(Animator animator) {
            zlo.this.h.setVisibility(8);
            zlo.this.f.setVisibility(0);
            zlo.this.g.setVisibility(0);
        }

        public final void onAnimationStart(Animator animator) {
            zlo.this.h.setVisibility(0);
            zlo.this.f.setVisibility(8);
            zlo.this.g.setVisibility(8);
        }
    }

    /* renamed from: zlo$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            zlo.this.c();
        }
    }

    public zlo(PullToRefreshLayout pullToRefreshLayout, int i) {
        this.e = pullToRefreshLayout;
        this.a = abtp.a(24.0f, this.e.getContext());
        this.b = abtp.a(72.0f, this.e.getContext());
        this.r = (int) abtp.a(8.0f, this.e.getContext());
        this.f = (ImageView) this.e.findViewById(R.id.neon_ptr_ghost);
        this.g = this.e.findViewById(R.id.neon_ptr_hands);
        this.h = this.e.findViewById(R.id.neon_ptr_launch);
        this.e.a(new a(this, (byte) 0));
        this.s = i;
        this.t = hh.a(this.e.getResources(), R.drawable.neon_ptr_top_rounded_corner_background, null);
        ((RecyclerView) this.e.b).addOnScrollListener(this.z);
        a(0);
    }

    private void a(int i) {
        this.d = i;
        this.y = i;
        this.f.setTranslationY(((float) this.d) + this.a);
        this.g.setTranslationY(((float) this.d) + this.a);
    }

    public final void a() {
        if (this.x != null) {
            RecyclerView recyclerView = (RecyclerView) this.e.b;
            recyclerView.setBackground(new InsetDrawable(this.t, this.x.left, this.x.top, this.x.right, this.x.bottom));
            recyclerView.setPadding(this.x.left, this.x.top, this.x.right, this.x.bottom);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        Context context = this.e.getContext();
        if (context != null) {
            if (this.u == null) {
                this.u = new TransitionDrawable(new Drawable[]{new ColorDrawable(), new ColorDrawable()});
            }
            int color = ContextCompat.getColor(context, i);
            int i2 = R.color.regular_red;
            if (z) {
                i2 = this.s;
            } else if (i == R.color.regular_yellow) {
                i2 = R.color.regular_green;
            } else if (i == R.color.regular_green) {
                i2 = R.color.regular_blue;
            } else if (i == R.color.regular_blue) {
                i2 = R.color.regular_purple;
            } else if (i != R.color.regular_purple) {
                i2 = i == R.color.regular_red ? R.color.regular_orange : R.color.regular_yellow;
            }
            i = ContextCompat.getColor(context, i2);
            ((ColorDrawable) this.u.getDrawable(0)).setColor(color);
            ((ColorDrawable) this.u.getDrawable(1)).setColor(i);
            a(this.u, (int) this.p);
            this.u.startTransition(TakeSnapButton.LONG_PRESS_TIME);
            this.q.removeCallbacks(this.w);
            this.w = z ? new 3() : new Runnable() {
                public final void run() {
                    if (zlo.this.e.getBackground() instanceof InsetDrawable) {
                        zlo zlo;
                        int i;
                        boolean z;
                        if (zlo.this.i) {
                            zlo = zlo.this;
                            i = i2;
                            z = false;
                        } else {
                            zlo = zlo.this;
                            i = i2;
                            z = true;
                        }
                        zlo.a(i, z);
                    }
                }
            };
            this.q.postDelayed(this.w, 500);
        }
    }

    public final void a(Rect rect) {
        this.x = rect;
        a(rect.top);
        View view = this.e.b;
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        view.setBackground(new InsetDrawable(this.t, rect.left, rect.top, rect.right, rect.bottom));
        b();
    }

    /* Access modifiers changed, original: final */
    public final void a(Drawable drawable, int i) {
        if (this.x != null) {
            Drawable drawable2 = drawable;
            this.e.setBackground(new InsetDrawable(drawable2, this.x.left, 0, this.x.right, (((this.e.b.getHeight() - this.x.top) - this.x.bottom) - this.r) - i));
            this.e.setPadding(0, 0, 0, 0);
        }
    }

    public final void a(b bVar) {
        this.n = bVar;
    }

    public final void a(c cVar) {
        this.m = cVar;
    }

    public final void a(d dVar) {
        this.o = dVar;
    }

    public final void a(boolean z) {
        if (this.v != z) {
            this.v = z;
            c();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.x != null) {
            RecyclerView recyclerView = (RecyclerView) this.e.b;
            int top = recyclerView.getChildCount() > 0 ? recyclerView.getChildAt(0).getTop() : this.x.top;
            int i = this.y;
            int i2 = this.r;
            if (top <= (-i2)) {
                top = -i2;
            } else if (top > this.x.top) {
                top = i;
            }
            if (this.y != top) {
                this.y = top;
                recyclerView.setBackground(new InsetDrawable(this.t, this.x.left, this.y, this.x.right, this.x.bottom));
                recyclerView.setPadding(this.x.left, this.x.top, this.x.right, this.x.bottom);
            }
        }
    }

    public final void c() {
        if (this.e != null) {
            a(d(), 0);
            this.i = false;
            this.q.removeCallbacks(this.w);
        }
    }

    /* Access modifiers changed, original: final */
    public final Drawable d() {
        return new ColorDrawable(this.v ? ContextCompat.getColor(this.e.getContext(), this.s) : 0);
    }

    public final void e() {
        this.i = false;
    }
}
