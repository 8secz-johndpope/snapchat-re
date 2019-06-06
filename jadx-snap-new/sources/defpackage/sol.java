package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.v4.content.ContextCompat;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.media.VideoProgressBarViewV1;
import com.snap.opera.view.media.VideoProgressBarViewV2;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snapchat.android.R;
import defpackage.szw.b;

/* renamed from: sol */
public class sol extends som {
    public static final Predicate<sqh> B = new 2();
    final Supplier<GestureDetector> A;
    final Runnable C = new 3();
    private int P;
    private final abvp Q = new 4();
    private final ski R = new 5();
    int q;
    int r;
    long s;
    final VideoProgressBarViewV1 t;
    final VideoProgressBarViewV2 u;
    tbv v;
    final float w;
    boolean x;
    boolean y;
    CountDownTimer z;

    /* renamed from: sol$2 */
    static class 2 implements Predicate<sqh> {
        2() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sqj) ((sqh) obj).c(sqh.ce, sqj.DEFAULT_OPERA_PLAYER)) == sqj.UNSKIPPABLE_VIDEO_PLAYER;
        }
    }

    /* renamed from: sol$4 */
    class 4 implements abvp {
        4() {
        }

        public final boolean a(MotionEvent motionEvent) {
            return motionEvent.getActionMasked() == 0;
        }

        public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
            return false;
        }

        public final boolean b(ViewGroup viewGroup, MotionEvent motionEvent) {
            if (!sol.this.Q() || sol.this.z().h() || (sol.this.y && sol.a(sol.this, motionEvent.getX()))) {
                return false;
            }
            ((GestureDetector) sol.this.A.get()).onTouchEvent(motionEvent);
            return true;
        }
    }

    /* renamed from: sol$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            if (sol.this.q <= 0) {
                sol.this.S();
            } else {
                double currentTimeMillis = (double) (System.currentTimeMillis() - sol.this.s);
                double d = (double) sol.this.q;
                Double.isNaN(currentTimeMillis);
                Double.isNaN(d);
                int i = sol.this.r + ((int) ((currentTimeMillis / d) * 1000.0d));
                if (i < MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
                    sol.this.v.setVisibility(0);
                    sol.this.v.a(i);
                    currentTimeMillis = (double) (MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL - i);
                    Double.isNaN(currentTimeMillis);
                    currentTimeMillis /= 1000.0d;
                    d = (double) sol.this.q;
                    Double.isNaN(d);
                    sol.this.v.b((int) Math.round(currentTimeMillis * d));
                } else {
                    sol.this.v.setVisibility(8);
                    sol.this.v.a((int) MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
                    sol.this.c(false);
                    if (sol.this.K) {
                        sol.this.C().a("UNSKIPPABLE_PROGRESS_FINISHED", sol.this.H);
                    }
                    return;
                }
            }
            sol.this.v.postDelayed(sol.this.C, 10);
        }
    }

    /* renamed from: sol$5 */
    class 5 implements ski {
        5() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            sol.this.v.removeCallbacks(sol.this.C);
            sol.this.C().a("UNSKIPPABLE_AD_PAUSE", sol.this.H, szw.a(skj.be, Integer.valueOf(sol.this.v.b())));
        }
    }

    /* renamed from: sol$a */
    final class a extends SimpleOnGestureListener {

        /* renamed from: sol$a$1 */
        class 1 extends CountDownTimer {
            1() {
                super(1500, 1500);
            }

            public final void onFinish() {
                if (sol.this.u.c()) {
                    sol.b(sol.this, MapboxConstants.MINIMUM_ZOOM);
                }
            }

            public final void onTick(long j) {
            }
        }

        private a() {
        }

        /* synthetic */ a(sol sol, byte b) {
            this();
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            sol.this.C().a("UNSKIPPABLE_VIDEO_TAP_INTERCEPTED", sol.this.H);
            boolean z = false;
            if (sol.this.x) {
                VideoProgressBarViewV2 videoProgressBarViewV2 = sol.this.u;
                if ((videoProgressBarViewV2.b.getHeight() != videoProgressBarViewV2.a ? 1 : null) == null) {
                    VideoProgressBarViewV2.a(videoProgressBarViewV2.c, ContextCompat.getColor(videoProgressBarViewV2.getContext(), R.color.snapchat_yellow), 255);
                    if (videoProgressBarViewV2.e != null) {
                        videoProgressBarViewV2.e.cancel();
                    }
                    videoProgressBarViewV2.e = new CountDownTimer() {
                        public final void onFinish() {
                            VideoProgressBarViewV2.a(VideoProgressBarViewV2.this.c, ContextCompat.getColor(VideoProgressBarViewV2.this.getContext(), R.color.white), 255);
                        }

                        public final void onTick(long j) {
                        }
                    }.start();
                } else {
                    tda.a(videoProgressBarViewV2.b, videoProgressBarViewV2.a, 300, new abtx() {
                        public final void onAnimationEnd(Animator animator) {
                            VideoProgressBarViewV2.this.d.setVisibility(0);
                        }
                    });
                    tda.a(videoProgressBarViewV2.c, videoProgressBarViewV2.a, 300, null);
                    z = true;
                }
                if (z) {
                    sol sol = sol.this;
                    sol.b(sol, sol.w);
                } else if (sol.this.z != null) {
                    sol.this.z.cancel();
                }
                sol.this.z = new 1().start();
            } else {
                VideoProgressBarViewV1 videoProgressBarViewV1 = sol.this.t;
                int i = videoProgressBarViewV1.e.booleanValue() ? videoProgressBarViewV1.c : videoProgressBarViewV1.b;
                if (videoProgressBarViewV1.d.getHeight() == videoProgressBarViewV1.a) {
                    z = true;
                }
                if (!z) {
                    i = videoProgressBarViewV1.a;
                }
                videoProgressBarViewV1.c(i);
                sol.this.c(z);
            }
            return true;
        }
    }

    sol(final Context context) {
        super(context);
        this.t = (VideoProgressBarViewV1) View.inflate(context, R.layout.video_progress_bar_view, null);
        this.u = (VideoProgressBarViewV2) View.inflate(context, R.layout.video_progress_bar_view_v2, null);
        this.v = this.t;
        this.w = context.getResources().getDimension(R.dimen.video_progress_bar_v2_max_height);
        this.A = Suppliers.memoize(new Supplier<GestureDetector>() {
            public final /* synthetic */ Object get() {
                return new GestureDetector(context, new a(sol.this, (byte) 0));
            }
        });
    }

    private void R() {
        this.v.a();
        this.v.removeCallbacks(this.C);
        CountDownTimer countDownTimer = this.z;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private void S() {
        if (this.o != null) {
            int i = this.o.l;
            if (i > 0) {
                this.q = i;
            }
        }
    }

    static /* synthetic */ void b(sol sol, float f) {
        if (sol.K && !sol.z().h()) {
            sol.z().a((Object) sol, szw.a(skb.m, Float.valueOf(f), skb.n, Float.valueOf(f)));
        }
    }

    public final void C_() {
        super.C_();
        R();
        C().a("UNSKIPPABLE_AD_PAUSE", this.H, szw.a(skj.be, Integer.valueOf(this.v.b())));
    }

    /* Access modifiers changed, original: protected|final */
    public final void N() {
        tbv tbv;
        int i = 0;
        if (((Boolean) this.H.a(sqh.bj)).booleanValue()) {
            this.s = System.currentTimeMillis();
            this.r = ((Integer) this.H.c(sqh.bi, Integer.valueOf(0))).intValue();
        }
        this.v.a(this.r);
        int b = this.v.b();
        if (b < 0 || b >= MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
            tbv = this.v;
            i = 4;
        } else {
            tbv = this.v;
        }
        tbv.setVisibility(i);
        C().a("SHOW_AD_INFO", this.R);
        sxn sxn = this.o;
        i = this.P;
        if (i != 0) {
            sxn.k = i;
        }
        sxn.a(true);
        if (this.q <= 0) {
            S();
        }
        this.v.post(this.C);
    }

    /* Access modifiers changed, original: protected|final */
    public final void O() {
        this.o.a(this.P);
    }

    /* Access modifiers changed, original: final */
    public final boolean Q() {
        return this.v.getVisibility() == 0;
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        b bVar = sqh.q;
        Integer valueOf = Integer.valueOf(0);
        this.P = ((Integer) sqh.c(bVar, valueOf)).intValue();
        this.q = ((Integer) sqh.c(sqh.bh, valueOf)).intValue();
        this.x = ((Boolean) sqh.c(sqh.t, Boolean.FALSE)).booleanValue();
        this.y = ((Boolean) sqh.c(sqh.bk, Boolean.TRUE)).booleanValue();
        this.v = this.x ? this.u : this.t;
        this.v.a((String) sqh.c(sqh.s, ""));
    }

    public final void a(szo szo) {
        this.v.a();
        if (this.K) {
            z().a((Object) this, szw.a(skb.l, Boolean.FALSE));
        }
    }

    public final void a(szw szw) {
        super.a(szw);
    }

    public final void ae_() {
        super.ae_();
        this.b.addView(this.v);
        this.v.a(0);
    }

    public final void b() {
        super.b();
        this.b.removeView(this.t);
        this.b.removeView(this.u);
    }

    public final void b(szw szw) {
        this.P = K();
        super.b(szw);
        c(false);
        R();
        this.v.setVisibility(4);
        C().c(this.R);
        z().a((Object) this);
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        if (!(this.x || !this.K || z().h())) {
            z().a((Object) this, szw.a(skb.j, Boolean.valueOf(z), skb.l, Boolean.valueOf(z)));
        }
    }

    public final void f(szw szw) {
        super.f(szw);
        if (szw != null) {
            szw.b(skj.v, Long.valueOf((long) K()));
            szw.b(skj.be, Integer.valueOf(this.v.b()));
            szw.b(skj.bf, Boolean.valueOf(Q()));
        }
    }

    public final abvp k() {
        return this.Q;
    }
}
