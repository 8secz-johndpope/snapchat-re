package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: spa */
public abstract class spa extends slm {
    protected static final spb g = new 4();
    private static spb m = new 5();
    final ski a;
    final ViewGroup b;
    final szw c;
    spb d;
    boolean e;
    sjp f;
    private Context h;
    private final ski i;
    private boolean j;
    private View k;
    private final OnClickListener l = new 2();

    /* renamed from: spa$4 */
    static class 4 implements spb {
        4() {
        }

        private void e(spa spa) {
            spa.c.b(skb.f, Boolean.FALSE);
            spa.z().a((Object) this, spa.c);
            spa.C().c(spa.a);
        }

        public final void a(final spa spa) {
            spa.a(0);
            spa.c.b(skb.f, Boolean.TRUE);
            spa.z().a((Object) spa, spa.c);
            spa.b.post(new Runnable() {
                public final void run() {
                    if (spa.F.a()) {
                        spa.z().i();
                    }
                }
            });
        }

        public final void b(spa spa) {
        }

        public final void c(spa spa) {
            spa.z().j();
            e(spa);
        }

        public final void d(spa spa) {
            e(spa);
        }
    }

    /* renamed from: spa$5 */
    static class 5 implements spb {
        5() {
        }

        public final void a(spa spa) {
        }

        public final void b(spa spa) {
            spa.a(300);
        }

        public final void c(spa spa) {
        }

        public final void d(spa spa) {
        }
    }

    /* renamed from: spa$2 */
    class 2 implements OnClickListener {
        2() {
        }

        public final void onClick(View view) {
            spa.this.m();
        }
    }

    /* renamed from: spa$a */
    static class a implements ski {
        private final WeakReference<spa> a;

        private a(spa spa) {
            this.a = new WeakReference(spa);
        }

        /* synthetic */ a(spa spa, byte b) {
            this(spa);
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            spa spa = (spa) this.a.get();
            if (spa != null && spa.F == sjo.STARTED) {
                spa.d.b(spa);
            }
        }
    }

    /* renamed from: spa$1 */
    class 1 implements ski {
        1() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (spa.this.F == sjo.STARTED) {
                spa.this.m();
            }
        }
    }

    /* renamed from: spa$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            spa spa = spa.this;
            spa.e = false;
            spa.b.removeAllViewsInLayout();
            if (spa.this.F == sjo.STOPPING_GRACEFULLY && spa.this.f != null) {
                spa.this.f.a();
            }
        }
    }

    protected spa(Context context, spb spb) {
        this.h = context;
        this.b = new FrameLayout(context);
        this.b.setBackgroundColor(-16777216);
        this.c = new szw();
        this.d = spb;
        this.i = new a(this, (byte) 0);
        this.a = new 1();
    }

    private boolean n() {
        this.b.removeAllViewsInLayout();
        if (!a(this.b)) {
            return false;
        }
        this.k = this.b.getChildAt(0);
        this.k.setVisibility(0);
        this.k.setOnClickListener(this.l);
        this.k.setOnTouchListener(null);
        this.j = false;
        return true;
    }

    public final void a(float f) {
        this.b.setPivotX(MapboxConstants.MINIMUM_ZOOM);
        ViewGroup viewGroup = this.b;
        viewGroup.setPivotY(((float) viewGroup.getHeight()) / 2.0f);
        this.b.setScaleX(sln.a(f) + 0.001f);
        this.b.setScaleY(sln.a(f) + 0.001f);
        View view = this.k;
        if (view != null) {
            view.setAlpha(sln.b(f));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j) {
        if (this.j && n()) {
            this.b.animate().alpha(1.0f).setDuration(j);
        }
    }

    public final void a(szw szw) {
        super.a(szw);
        if (szw != null) {
            String d = this.H.d(sqh.ct);
            if (d != null) {
                szw.b(skj.aO, d);
            }
        }
        this.d.a(this);
    }

    public abstract boolean a(ViewGroup viewGroup);

    public final void ae_() {
        n();
        spx spx = (spx) this.H.a(sqh.cu);
        if (spx != null) {
            spb spb;
            if (spx == spx.BLOCKING) {
                spb = g;
            } else if (spx == spx.NONBLOCKING) {
                spb = m;
            }
            this.d = spb;
        }
        C().a("DISMISS_INTERSTITIAL", this.a);
        C().a("VIDEO_PLAYBACK_STARTED", this.i);
    }

    public final void b() {
        super.b();
        this.f = null;
        z().a((Object) this);
        C().c(this.a);
        C().c(this.i);
    }

    public final void b(float f) {
        ViewGroup viewGroup = this.b;
        viewGroup.setPivotX((float) viewGroup.getWidth());
        viewGroup = this.b;
        viewGroup.setPivotY(((float) viewGroup.getHeight()) / 2.0f);
        this.b.setScaleX(sln.a(f) + 0.001f);
        this.b.setScaleY(sln.a(f) + 0.001f);
        View view = this.k;
        if (view != null) {
            view.setAlpha(sln.b(f));
        }
    }

    public final void b(szw szw) {
        String d = this.H.d(sqh.ct);
        if (!(this.j || d == null || szw == null)) {
            Object obj = (srb) szw.a(skj.a);
            if (obj != null) {
                szw.b(skj.aP, d);
                C().a(d, this.H, szw.a(skj.a, obj));
            } else if (abss.a().b()) {
                throw new IllegalArgumentException("viewExitMethod is missing in onStop");
            }
        }
        this.d.d(this);
        this.e = false;
        this.f = null;
    }

    public final void b(szw szw, sjp sjp) {
        this.f = sjp;
        if (!this.e) {
            m();
        }
    }

    public final View e() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final void m() {
        if (!this.j) {
            this.j = true;
            this.d.c(this);
            this.e = true;
            this.b.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(300).withEndAction(new 3());
            this.b.setOnClickListener(null);
            this.b.setOnTouchListener(null);
            this.b.setClickable(false);
            String d = this.H.d(sqh.ct);
            if (d != null) {
                C().a(d, this.H, szw.a(skj.a, srb.TAP));
            }
        }
    }
}
