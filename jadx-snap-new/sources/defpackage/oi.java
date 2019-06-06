package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.State;
import android.view.MotionEvent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: oi */
public final class oi extends ItemDecoration implements OnItemTouchListener {
    private static final int[] p = new int[]{16842919};
    private static final int[] q = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D = new 1();
    private final OnScrollListener E = new 2();
    final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    int f;
    int g;
    int h = 0;
    int i = 0;
    RecyclerView j;
    boolean k = false;
    boolean l = false;
    int m = 0;
    final ValueAnimator n = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
    int o = 0;
    private final int r;
    private final int s;
    private final int t;
    private final StateListDrawable u;
    private final Drawable v;
    private final int w;
    private final int x;
    private float y;
    private float z;

    /* renamed from: oi$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            oi oiVar = oi.this;
            int i = oiVar.o;
            if (i == 1) {
                oiVar.n.cancel();
            } else if (i != 2) {
                return;
            }
            oiVar.o = 3;
            oiVar.n.setFloatValues(new float[]{((Float) oiVar.n.getAnimatedValue()).floatValue(), MapboxConstants.MINIMUM_ZOOM});
            oiVar.n.setDuration(500);
            oiVar.n.start();
        }
    }

    /* renamed from: oi$a */
    class a extends AnimatorListenerAdapter {
        private boolean a;

        private a() {
            this.a = false;
        }

        /* synthetic */ a(oi oiVar, byte b) {
            this();
        }

        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            oi oiVar;
            if (this.a) {
                this.a = false;
            } else if (((Float) oi.this.n.getAnimatedValue()).floatValue() == MapboxConstants.MINIMUM_ZOOM) {
                oiVar = oi.this;
                oiVar.o = 0;
                oiVar.a(0);
            } else {
                oiVar = oi.this;
                oiVar.o = 2;
                oiVar.j.invalidate();
            }
        }
    }

    /* renamed from: oi$b */
    class b implements AnimatorUpdateListener {
        private b() {
        }

        /* synthetic */ b(oi oiVar, byte b) {
            this();
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            oi.this.b.setAlpha(floatValue);
            oi.this.c.setAlpha(floatValue);
            oi.this.j.invalidate();
        }
    }

    /* renamed from: oi$2 */
    class 2 extends OnScrollListener {
        2() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            oi oiVar = oi.this;
            i2 = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = oiVar.j.computeVerticalScrollRange();
            int i3 = oiVar.i;
            boolean z = computeVerticalScrollRange - i3 > 0 && oiVar.i >= oiVar.a;
            oiVar.k = z;
            int computeHorizontalScrollRange = oiVar.j.computeHorizontalScrollRange();
            int i4 = oiVar.h;
            boolean z2 = computeHorizontalScrollRange - i4 > 0 && oiVar.h >= oiVar.a;
            oiVar.l = z2;
            if (oiVar.k || oiVar.l) {
                if (oiVar.k) {
                    float f = (float) i3;
                    oiVar.e = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    oiVar.d = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (oiVar.l) {
                    float f2 = (float) i2;
                    float f3 = (float) i4;
                    oiVar.g = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    oiVar.f = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                if (oiVar.m == 0 || oiVar.m == 1) {
                    oiVar.a(1);
                }
                return;
            }
            if (oiVar.m != 0) {
                oiVar.a(0);
            }
        }
    }

    public oi(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.b = stateListDrawable;
        this.c = drawable;
        this.u = stateListDrawable2;
        this.v = drawable2;
        this.s = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.t = Math.max(i, drawable.getIntrinsicWidth());
        this.w = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.x = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.r = i3;
        this.b.setAlpha(255);
        this.c.setAlpha(255);
        this.n.addListener(new a(this, (byte) 0));
        this.n.addUpdateListener(new b(this, (byte) 0));
        RecyclerView recyclerView2 = this.j;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.j.removeOnItemTouchListener(this);
                this.j.removeOnScrollListener(this.E);
                c();
            }
            this.j = recyclerView;
            recyclerView = this.j;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.j.addOnItemTouchListener(this);
                this.j.addOnScrollListener(this.E);
            }
        }
    }

    private static int a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        i -= i3;
        int i5 = (int) (((f2 - f) / ((float) i4)) * ((float) i));
        i2 += i5;
        return (i2 >= i || i2 < 0) ? 0 : i5;
    }

    private boolean a() {
        return kb.a.j(this.j) == 1;
    }

    private boolean a(float f, float f2) {
        if (a() ? f > ((float) (this.s / 2)) : f < ((float) (this.h - this.s))) {
            int i = this.e;
            int i2 = this.d;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        int i = this.o;
        if (i != 0) {
            if (i == 3) {
                this.n.cancel();
            } else {
                return;
            }
        }
        this.o = 1;
        this.n.setFloatValues(new float[]{((Float) this.n.getAnimatedValue()).floatValue(), 1.0f});
        this.n.setDuration(500);
        this.n.setStartDelay(0);
        this.n.start();
    }

    private void b(int i) {
        c();
        this.j.postDelayed(this.D, (long) i);
    }

    private boolean b(float f, float f2) {
        if (f2 >= ((float) (this.i - this.w))) {
            int i = this.g;
            int i2 = this.f;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        this.j.removeCallbacks(this.D);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        int i2;
        if (i == 2 && this.m != 2) {
            this.b.setState(p);
            c();
        }
        if (i == 0) {
            this.j.invalidate();
        } else {
            b();
        }
        if (this.m != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.m = i;
        }
        this.b.setState(q);
        i2 = 1200;
        b(i2);
        this.m = i;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        if (this.h == this.j.getWidth() && this.i == this.j.getHeight()) {
            if (this.o != 0) {
                int i;
                int i2;
                int i3;
                int i4;
                if (this.k) {
                    i = this.h;
                    i2 = this.s;
                    i -= i2;
                    i3 = this.e;
                    i4 = this.d;
                    i3 -= i4 / 2;
                    this.b.setBounds(0, 0, i2, i4);
                    this.c.setBounds(0, 0, this.t, this.i);
                    if (a()) {
                        this.c.draw(canvas);
                        canvas.translate((float) this.s, (float) i3);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        i = this.s;
                    } else {
                        canvas.translate((float) i, MapboxConstants.MINIMUM_ZOOM);
                        this.c.draw(canvas);
                        canvas.translate(MapboxConstants.MINIMUM_ZOOM, (float) i3);
                        this.b.draw(canvas);
                    }
                    canvas.translate((float) (-i), (float) (-i3));
                }
                if (this.l) {
                    i = this.i;
                    i2 = this.w;
                    i -= i2;
                    i3 = this.g;
                    i4 = this.f;
                    i3 -= i4 / 2;
                    this.u.setBounds(0, 0, i4, i2);
                    this.v.setBounds(0, 0, this.h, this.x);
                    canvas.translate(MapboxConstants.MINIMUM_ZOOM, (float) i);
                    this.v.draw(canvas);
                    canvas.translate((float) i3, MapboxConstants.MINIMUM_ZOOM);
                    this.u.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i));
                }
            }
            return;
        }
        this.h = this.j.getWidth();
        this.i = this.j.getHeight();
        a(0);
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.m;
        if (i == 1) {
            boolean a = a(motionEvent.getX(), motionEvent.getY());
            boolean b = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a && !b) {
                return false;
            }
            if (b) {
                this.A = 1;
                this.z = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.A = 2;
                this.y = (float) ((int) motionEvent.getY());
            }
            a(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.m != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = a(motionEvent.getX(), motionEvent.getY());
                boolean b = b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.A = 1;
                        this.z = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.A = 2;
                        this.y = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.m == 2) {
                this.y = MapboxConstants.MINIMUM_ZOOM;
                this.z = MapboxConstants.MINIMUM_ZOOM;
                a(1);
                this.A = 0;
            } else {
                if (motionEvent.getAction() == 2 && this.m == 2) {
                    float x;
                    int[] iArr;
                    b();
                    if (this.A == 1) {
                        x = motionEvent.getX();
                        iArr = this.C;
                        int i = this.r;
                        iArr[0] = i;
                        iArr[1] = this.h - i;
                        x = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                        if (Math.abs(((float) this.g) - x) >= 2.0f) {
                            i = oi.a(this.z, x, iArr, this.j.computeHorizontalScrollRange(), this.j.computeHorizontalScrollOffset(), this.h);
                            if (i != 0) {
                                this.j.scrollBy(i, 0);
                            }
                            this.z = x;
                        }
                    }
                    if (this.A == 2) {
                        x = motionEvent.getY();
                        iArr = this.B;
                        int i2 = this.r;
                        iArr[0] = i2;
                        iArr[1] = this.i - i2;
                        x = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                        if (Math.abs(((float) this.e) - x) >= 2.0f) {
                            i2 = oi.a(this.y, x, iArr, this.j.computeVerticalScrollRange(), this.j.computeVerticalScrollOffset(), this.i);
                            if (i2 != 0) {
                                this.j.scrollBy(0, i2);
                            }
                            this.y = x;
                        }
                    }
                }
            }
        }
    }
}
