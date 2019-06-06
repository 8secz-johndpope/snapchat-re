package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.map.feature.slider.ScalingZoomSliderIndicatorView;
import com.snapchat.map.feature.slider.ScalingZoomSliderIndicatorView.AnonymousClass2;

/* renamed from: actr */
public final class actr {
    private int A;
    private int B;
    private boolean C = true;
    cgi a = null;
    public View b;
    View c;
    final Rect d = new Rect();
    ScalingZoomSliderIndicatorView e;
    aclg f;
    OnTouchListener g;
    boolean h;
    boolean i;
    boolean j;
    float k;
    float l;
    float m;
    float n;
    int o = 3;
    boolean p;
    aclu q;
    public boolean r = false;
    int s;
    final AnimatorSet t = new AnimatorSet();
    double u;
    public boolean v;
    a w;
    private View x;
    private int y;
    private int z;

    /* renamed from: actr$2 */
    class 2 implements OnTouchListener {
        2() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 2) {
                return false;
            }
            acmj j = actr.this.f.a.j();
            if (j == null) {
                return false;
            }
            int rawY = (int) ((motionEvent.getRawY() - ((float) actr.this.b.getTop())) - ((float) (actr.this.e.getHeight() / 2)));
            int a = (int) (((float) (actr.this.c.getBottom() - actr.this.e.getHeight())) + ((float) actr.this.B));
            if (rawY < ((int) (((float) actr.this.c.getTop()) - ((float) actr.this.B))) || rawY > a) {
                return false;
            }
            actr.this.e.setY((float) rawY);
            float y = (actr.this.l - motionEvent.getY()) * (18.0f / ((float) actr.this.c.getHeight()));
            double i = j.i();
            double d = (double) y;
            Double.isNaN(d);
            float f = (float) (i + d);
            if (actr.this.a == null) {
                j.a((double) f);
            } else {
                j.a(actr.this.a, (double) f);
            }
            actr.this.p = true;
            return true;
        }
    }

    /* renamed from: actr$3 */
    class 3 extends AnimatorListenerAdapter {
        3() {
        }

        public final void onAnimationEnd(Animator animator) {
            actr.this.b.setVisibility(4);
        }
    }

    /* renamed from: actr$4 */
    class 4 extends AnimatorListenerAdapter {
        4() {
        }

        public final void onAnimationEnd(Animator animator) {
            actr.d(actr.this).start();
        }
    }

    /* renamed from: actr$a */
    public interface a {
        void a();
    }

    /* renamed from: actr$1 */
    class 1 extends adbw {
        1() {
        }

        private void b() {
            if (!actr.this.v) {
                if (actr.this.o == 1) {
                    actr.this.e.b();
                }
                aclb aclb = actr.this.f.a.d;
                if (aclb.e) {
                    double d = aclb.c;
                    if (Math.abs(actr.this.u - d) != 0.0d) {
                        actr actr = actr.this;
                        actr.u = d;
                        if (actr.o == 1) {
                            actr.this.b();
                            double height = (double) actr.this.c.getHeight();
                            Double.isNaN(height);
                            actr.this.e.setY(Math.min((((float) (actr.this.c.getBottom() - actr.this.e.getHeight())) + ((float) actr.this.B)), Math.max((((float) actr.this.c.getTop()) - ((float) actr.this.B)), (((float) actr.this.c.getHeight()) - ((float) ((height / 18.0d) * d))) - (((float) actr.this.e.getHeight()) / 2.0f))));
                            if (actr.this.b.getVisibility() != 0) {
                                actr.this.a().start();
                            }
                            return;
                        }
                        if (actr.this.o == 2) {
                            actr.c(actr.this);
                        }
                    }
                }
            }
        }

        public final void a(acmj acmj) {
            b();
        }

        public final void b(acmj acmj) {
            b();
        }
    }

    /* renamed from: actr$b */
    class b extends adbw {
        private long a;

        private b() {
        }

        /* synthetic */ b(actr actr, byte b) {
            this();
        }

        public final boolean a(View view, MotionEvent motionEvent) {
            if (actr.this.v) {
                return false;
            }
            int action = motionEvent.getAction();
            MotionEvent motionEvent2;
            if (action != 0) {
                cgi cgi = null;
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            return false;
                        }
                        if (actr.this.i) {
                            actr.this.i = false;
                            return false;
                        }
                    } else if (actr.this.o == 1) {
                        return false;
                    } else {
                        actr actr;
                        ViewGroup k;
                        if (actr.this.o == 2) {
                            actr.this.g.onTouch(view, motionEvent);
                            actr.this.k = motionEvent.getX();
                            actr.this.l = motionEvent.getY();
                        } else {
                            motionEvent2 = motionEvent;
                            float x = motionEvent.getX();
                            float y = motionEvent.getY();
                            float abs = Math.abs(y - actr.this.m);
                            float abs2 = Math.abs(x - actr.this.n);
                            if (abs2 >= ((float) actr.this.s) || abs >= ((float) actr.this.s)) {
                                if (abs2 <= ((float) actr.this.s) || abs2 <= abs * 2.0f) {
                                    boolean contains = actr.this.d.contains((int) x, (int) y);
                                    if ((abs > abs2 * 2.0f ? 1 : null) != null && contains) {
                                        if (actr.this.w != null) {
                                            actr.this.w.a();
                                        }
                                        actr.this.f.g.a(null, null);
                                        acmj j = actr.this.f.a.j();
                                        actr actr2 = actr.this;
                                        if (j != null) {
                                            cgi = j.e();
                                        }
                                        actr2.a = cgi;
                                        actr actr3 = actr.this;
                                        actr3.b();
                                        if (actr3.b.getVisibility() != 0) {
                                            actr3.a().start();
                                        }
                                        ScalingZoomSliderIndicatorView scalingZoomSliderIndicatorView = actr3.e;
                                        scalingZoomSliderIndicatorView.a();
                                        if (scalingZoomSliderIndicatorView.e != null) {
                                            scalingZoomSliderIndicatorView.e.removeAllUpdateListeners();
                                            scalingZoomSliderIndicatorView.e.removeAllListeners();
                                            scalingZoomSliderIndicatorView.e.cancel();
                                            scalingZoomSliderIndicatorView.e.end();
                                        }
                                        scalingZoomSliderIndicatorView.e = ValueAnimator.ofInt(new int[]{scalingZoomSliderIndicatorView.d, scalingZoomSliderIndicatorView.c});
                                        scalingZoomSliderIndicatorView.e.setDuration(100);
                                        scalingZoomSliderIndicatorView.e.addUpdateListener(new AnimatorUpdateListener() {
                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                ScalingZoomSliderIndicatorView.a(ScalingZoomSliderIndicatorView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                                            }
                                        });
                                        scalingZoomSliderIndicatorView.e.start();
                                        actr = actr.this;
                                        actr.o = 2;
                                        actr.k = x;
                                        actr.l = y;
                                    }
                                } else {
                                    k = actr.this.f.a.k();
                                    if (k != null) {
                                        actr = actr.this;
                                        actr.h = true;
                                        actr.o = 1;
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        k.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                                        actr actr4 = actr.this;
                                        actr4.k = MapboxConstants.MINIMUM_ZOOM;
                                        actr4.l = MapboxConstants.MINIMUM_ZOOM;
                                        actr4.m = MapboxConstants.MINIMUM_ZOOM;
                                        actr4.n = MapboxConstants.MINIMUM_ZOOM;
                                    }
                                }
                            }
                        }
                        if (actr.this.j && SystemClock.elapsedRealtime() - this.a > 200) {
                            k = actr.this.f.a.k();
                            if (k == null) {
                                return true;
                            }
                            actr = actr.this;
                            actr.i = true;
                            actr.j = false;
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            k.onTouchEvent(MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                        }
                        return true;
                    }
                }
                boolean z = actr.this.o == 2;
                if (z) {
                    actr actr5 = actr.this;
                    ScalingZoomSliderIndicatorView scalingZoomSliderIndicatorView2 = actr5.e;
                    4 4 = new 4();
                    if (scalingZoomSliderIndicatorView2.f == null || !scalingZoomSliderIndicatorView2.f.isRunning()) {
                        boolean z2 = scalingZoomSliderIndicatorView2.d < scalingZoomSliderIndicatorView2.b;
                        int i = z2 ? scalingZoomSliderIndicatorView2.a : scalingZoomSliderIndicatorView2.b;
                        scalingZoomSliderIndicatorView2.f = ValueAnimator.ofInt(new int[]{scalingZoomSliderIndicatorView2.d, i});
                        scalingZoomSliderIndicatorView2.f.setDuration(100);
                        scalingZoomSliderIndicatorView2.f.addUpdateListener(new AnimatorUpdateListener() {
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ScalingZoomSliderIndicatorView.a(ScalingZoomSliderIndicatorView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        scalingZoomSliderIndicatorView2.f.addListener(new AnonymousClass2(z2, 4));
                        if (z2) {
                            scalingZoomSliderIndicatorView2.f.addListener(4);
                        }
                        scalingZoomSliderIndicatorView2.f.start();
                    }
                } else if (actr.this.b.getVisibility() == 0 && !actr.this.t.isRunning()) {
                    actr.d(actr.this).start();
                }
                actr actr6 = actr.this;
                actr6.a = null;
                actr6.o = 3;
                actr6.k = MapboxConstants.MINIMUM_ZOOM;
                actr6.l = MapboxConstants.MINIMUM_ZOOM;
                actr6.m = MapboxConstants.MINIMUM_ZOOM;
                actr6.n = MapboxConstants.MINIMUM_ZOOM;
                if (actr6.p) {
                    actr6 = actr.this;
                    actr6.p = false;
                    if (actr6.q != null) {
                        aclq aclq = actr.this.q.b.d;
                        aclq.e++;
                    }
                }
                return z;
            }
            motionEvent2 = motionEvent;
            if (actr.this.h) {
                actr.this.h = false;
                return false;
            } else if (actr.this.d.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                actr.this.k = motionEvent.getX();
                actr.this.l = motionEvent.getY();
                actr.this.n = motionEvent.getX();
                actr.this.m = motionEvent.getY();
                this.a = SystemClock.elapsedRealtime();
                actr.this.j = true;
                return false;
            } else {
                actr.this.o = 1;
                return false;
            }
        }
    }

    private void c() {
        this.x.getGlobalVisibleRect(this.d);
        int dimensionPixelSize = this.f.g().getDimensionPixelSize(R.dimen.emoji_container_height);
        int width = this.e.getWidth() - this.y;
        int height = (this.e.getHeight() - dimensionPixelSize) / 2;
        this.B = height;
        width /= 2;
        this.e.a(height, width, dimensionPixelSize, this.z, this.A, this.y);
        this.e.setX((((this.c.getX() - ((float) this.e.getWidth())) + ((float) width)) + ((float) ((this.z - this.c.getWidth()) / 2))) + ((float) this.c.getWidth()));
        this.e.requestLayout();
        this.b.setVisibility(4);
    }

    static /* synthetic */ void c(actr actr) {
        acmj j = actr.f.a.j();
        Drawable drawable = null;
        if (j != null) {
            double i = j.i();
            int i2 = i < 2.0d ? R.drawable.slider_rocket : (i < 2.0d || i >= 4.0d) ? (i < 4.0d || i >= 7.0d) ? (i < 7.0d || i >= 10.0d) ? (i < 10.0d || i >= 13.0d) ? (i < 13.0d || i >= 16.0d) ? R.drawable.slider_shoe : R.drawable.slider_bee : R.drawable.slider_bird : R.drawable.slider_helicopter : R.drawable.slider_plane : R.drawable.slider_sattelite;
            drawable = VERSION.SDK_INT >= 21 ? actr.f.g().getDrawable(i2, null) : actr.f.g().getDrawable(i2);
        }
        ScalingZoomSliderIndicatorView scalingZoomSliderIndicatorView = actr.e;
        scalingZoomSliderIndicatorView.h = drawable;
        scalingZoomSliderIndicatorView.invalidate();
    }

    static /* synthetic */ AnimatorSet d(actr actr) {
        actr.t.removeAllListeners();
        actr.t.cancel();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actr.b, "alpha", new float[]{MapboxConstants.MINIMUM_ZOOM});
        ofFloat.setDuration(100);
        ofFloat.addListener(new 3());
        ofFloat.setStartDelay(2000);
        actr.t.play(ofFloat);
        return actr.t;
    }

    /* Access modifiers changed, original: final */
    public final ObjectAnimator a() {
        this.b.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "alpha", new float[]{1.0f});
        ofFloat.setDuration(100);
        return ofFloat;
    }

    public final void a(aclg aclg, Resources resources, View view, a aVar, aclu aclu) {
        view = new abur(view, (int) R.id.map_zoom_slider, (int) R.id.map_zoom_slider).a();
        if (view != null) {
            this.r = true;
            this.q = aclu;
            this.b = view;
            this.w = aVar;
            this.f = aclg;
            this.f.a.a(new 1());
            this.y = resources.getDimensionPixelSize(R.dimen.emoji_container_max_width);
            this.z = resources.getDimensionPixelSize(R.dimen.touch_bar_view_width) << 1;
            this.A = resources.getDimensionPixelSize(R.dimen.slider_width_emoji);
            this.s = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.e = (ScalingZoomSliderIndicatorView) view.findViewById(R.id.emoji_container);
            this.x = view.findViewById(R.id.touch_bar);
            this.c = view.findViewById(R.id.touch_bar_view);
            this.g = new 2();
            aclg.a.a(new b(this, (byte) 0));
        }
    }

    public final void a(ajei ajei) {
        if (this.C) {
            this.C = false;
            if (this.x.getWidth() != 0) {
                c();
                return;
            }
            View view = this.b;
            cfg.a(view, "view == null");
            ajei.a(new cfo(view).c(1).f(new -$$Lambda$actr$EH9IaYO2fArIPSS9vTucsv5Ux9I(this)));
        }
    }

    public final void b() {
        this.e.a();
        this.t.removeAllListeners();
        if (this.t.isRunning()) {
            this.t.cancel();
            this.t.end();
        }
    }
}
