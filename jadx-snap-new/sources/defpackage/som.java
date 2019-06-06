package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.Predicate;
import com.snap.opera.shared.view.TextureVideoView;
import com.snap.opera.shared.view.TextureVideoViewExtended;
import com.snap.opera.view.FitWidthImageView;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.absp.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: som */
public class som extends sna {
    public static final Predicate<sqh> O = -$$Lambda$som$r0455YU11IaNIW5eExUd48goUY0.INSTANCE;
    LoadingSpinnerView D;
    ViewGroup E;
    FrameLayout L;
    OperaScalableCircleMaskFrameLayout M;
    boolean N;
    private final TextureVideoView q;
    private tbn r;
    private final AtomicReference<List<a>> s;
    private final Runnable t;

    /* renamed from: som$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            if (som.this.N && som.this.F == sjo.STARTED) {
                if (som.this.E == null) {
                    LayoutInflater layoutInflater = (LayoutInflater) som.this.a.getSystemService("layout_inflater");
                    if (layoutInflater != null) {
                        View inflate = layoutInflater.inflate(R.layout.loading_screen_layout, som.this.b);
                        som.this.L = (FrameLayout) inflate.findViewById(R.id.loading_screen);
                        som.this.E = (ViewGroup) inflate.findViewById(R.id.loading_layout);
                        som.this.D = (LoadingSpinnerView) inflate.findViewById(R.id.loading_screen_progress_bar);
                        som.this.M = (OperaScalableCircleMaskFrameLayout) inflate.findViewById(R.id.loading_background_image_container);
                    }
                }
                if (som.this.D != null) {
                    som.this.D.b(1);
                    som.this.D.a(true);
                }
                if (som.this.E != null) {
                    som.this.E.setVisibility(0);
                }
                if (som.this.L != null) {
                    som.this.L.setVisibility(0);
                }
                if (som.this.M != null && som.this.G != null) {
                    som.this.M.a(som.this.A().b.y, "VLVC");
                }
            }
        }
    }

    /* renamed from: som$a */
    public static class a {
        long a;
        private final long b;
        private final long c;

        a(long j, long j2) {
            this.b = j;
            this.c = j2;
        }

        public final long a() {
            return this.a - this.b;
        }
    }

    som(Context context) {
        this(context, new absl(context), new FitWidthImageView(context), new tah(), a.a);
    }

    private som(Context context, absl absl, FitWidthImageView fitWidthImageView, tah tah, absp absp) {
        super(context, absl, fitWidthImageView, tah, absp, new abth(context));
        this.s = new AtomicReference();
        this.t = new 1();
        this.q = new TextureVideoViewExtended(context);
        this.q.s = "VideoLayerViewController";
        this.c.addView(this.q, 0, new LayoutParams(-1, -1, 17));
    }

    private void Q() {
        long j = (E() != sjn.FULLY_DISPLAYED || this.q.getBufferPercentage() <= 0 || this.q.getBufferPercentage() >= 100) ? 500 : 200;
        this.c.postDelayed(this.t, j);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        tbn tbn = this.r;
        if (tbn != null) {
            tbn.setLayoutParams(layoutParams);
        }
        this.q.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        super.a(z);
        if (this.N != z) {
            if (this.q.getBufferPercentage() > 0 && this.q.getBufferPercentage() < 100) {
                skh C;
                szw szw;
                String str;
                if (z) {
                    C = C();
                    szw = this.H;
                    str = "STREAMING_MEDIA_BUFFERING";
                } else {
                    C = C();
                    szw = this.H;
                    str = "STREAMING_MEDIA_BUFFERING_DONE";
                }
                C.a(str, szw);
            }
            this.N = z;
            if (this.N && this.F == sjo.STARTED) {
                Q();
            } else if (!this.N) {
                this.c.removeCallbacks(this.t);
                LoadingSpinnerView loadingSpinnerView = this.D;
                if (loadingSpinnerView != null) {
                    loadingSpinnerView.b(3);
                    this.D.a(false);
                }
                ViewGroup viewGroup = this.E;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                FrameLayout frameLayout = this.L;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            List list = (List) this.s.get();
            if (this.F == sjo.STARTED && list != null) {
                int size = list.size() - 1;
                if (this.N) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long K = (long) K();
                    if (K > 0) {
                        list.add(new a(elapsedRealtime, K));
                    }
                } else if (size >= 0 && ((a) list.get(size)).a == 0) {
                    ((a) list.get(size)).a = SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public void b() {
        super.b();
        this.N = false;
        this.q.t = null;
    }

    public void b(szw szw) {
        super.b(szw);
        sqf sqf = (sqf) this.I.a(sqh.n);
        boolean a = sqf.a();
        List list = (List) this.s.get();
        int size = list == null ? -1 : list.size() - 1;
        if (size >= 0 && ((a) list.get(size)).a == 0) {
            ((a) list.get(size)).a = SystemClock.elapsedRealtime();
        }
        szw a2 = szw.a(skj.m, list, skj.n, Boolean.valueOf(a), skj.o, Boolean.valueOf(this.N));
        if (a && sqf.d != null) {
            a2.b(skj.p, sqf.d.a.e());
        }
        C().a("BUFFERING_EVENTS_COLLECTED", this.H, a2);
        a(false);
    }

    public final String f() {
        return "VIDEO";
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        if (!this.F.a()) {
            sxn sxn;
            View view;
            Object obj = (!this.I.a(sqh.x, false) || this.F.a()) ? null : 1;
            this.s.set(new ArrayList());
            this.q.t = A().b;
            if (obj != null) {
                if (this.r == null) {
                    this.r = new tbn(this.c.getContext());
                    this.c.addView(this.r, 0, new LayoutParams(-1, -1, 17));
                }
                this.o = new sxi();
                this.r.setVisibility(0);
                this.q.setVisibility(4);
                sxn = this.o;
                view = this.r;
            } else {
                this.o = new sxn();
                tbn tbn = this.r;
                if (tbn != null) {
                    tbn.setVisibility(4);
                }
                this.q.setVisibility(0);
                sxn = this.o;
                view = this.q;
            }
            sxn.a(view);
        }
    }

    public final void n() {
        super.n();
        if (this.N) {
            Q();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean p() {
        return !szu.a.EXOPLAYER.a();
    }
}
