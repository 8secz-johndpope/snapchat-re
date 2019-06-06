package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.ref.WeakReference;

/* renamed from: spl */
public class spl extends slm {
    public static final a f = new 4();
    final ViewGroup a;
    final szw b;
    a c;
    boolean d;
    sjp e;
    private final Context g;
    private final ski h;
    private final ski i;
    private boolean j;
    private final OnClickListener k = new 2();

    /* renamed from: spl$4 */
    static class 4 implements a {
        4() {
        }

        public final void a(final spl spl) {
            spl.a(spl, 0);
            spl.b.b(skb.f, Boolean.TRUE);
            spl.z().a((Object) spl, spl.b);
            spl.a.post(new Runnable() {
                public final void run() {
                    if (spl.F.a()) {
                        spl.z().i();
                    }
                }
            });
        }

        public final void b(spl spl) {
        }

        public final void c(spl spl) {
        }

        public final void d(spl spl) {
            spl.z().j();
        }
    }

    /* renamed from: spl$5 */
    static class 5 implements a {
        5() {
        }

        public final void a(spl spl) {
        }

        public final void b(spl spl) {
            if (spl.F == sjo.STARTED || spl.F == sjo.PAUSED) {
                spl.z().j();
            }
        }

        public final void c(spl spl) {
            spl.a(spl, 300);
        }

        public final void d(spl spl) {
        }
    }

    /* renamed from: spl$a */
    public interface a {
        void a(spl spl);

        void b(spl spl);

        void c(spl spl);

        void d(spl spl);
    }

    /* renamed from: spl$2 */
    class 2 implements OnClickListener {
        2() {
        }

        public final void onClick(View view) {
            spl.this.m();
        }
    }

    /* renamed from: spl$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            spl spl = spl.this;
            spl.d = false;
            if (spl.F == sjo.STOPPING_GRACEFULLY && spl.this.e != null) {
                spl.this.e.a();
            }
        }
    }

    /* renamed from: spl$1 */
    class 1 implements ski {
        1() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (spl.this.F == sjo.STARTED) {
                spl.this.m();
            }
        }
    }

    /* renamed from: spl$b */
    static class b implements ski {
        private final WeakReference<spl> a;

        private b(spl spl) {
            this.a = new WeakReference(spl);
        }

        /* synthetic */ b(spl spl, byte b) {
            this(spl);
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            spl spl = (spl) this.a.get();
            if (spl != null && spl.F == sjo.STARTED) {
                spl.c.c(spl);
            }
        }
    }

    static {
        5 5 = new 5();
    }

    public spl(Context context) {
        this.g = context;
        this.a = new FrameLayout(context);
        this.b = new szw();
        this.j = true;
        this.c = f;
        this.h = new 1();
        this.i = new b(this, (byte) 0);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.c = (a) this.H.a(sqh.cs);
        this.c.b(this);
    }

    public final void a(szw szw) {
        super.a(szw);
        C().a("DISMISS_TUTORIAL", this.h);
        this.c.a(this);
    }

    public final void ae_() {
        this.a.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.c = (a) this.H.a(sqh.cs);
        C().a("VIDEO_PLAYBACK_STARTED", this.i);
    }

    public final void b() {
        super.b();
        this.e = null;
        z().a((Object) this);
        C().c(this.h);
        C().c(this.i);
    }

    public final void b(szw szw) {
        String d = this.H.d(sqh.cr);
        if (!(this.j || d == null)) {
            C().a(d, this.H);
        }
        m();
        this.d = false;
        this.e = null;
    }

    public final void b(szw szw, sjp sjp) {
        this.e = sjp;
        if (!this.d) {
            m();
        }
    }

    public final View e() {
        return this.a;
    }

    public final String f() {
        return "PERSPECTIVE_CHANGE_TUTORIAL";
    }

    public final boolean h() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void m() {
        if (!this.j) {
            this.j = true;
            this.c.d(this);
            this.d = true;
            this.a.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(300).withEndAction(new 3());
            this.a.setOnClickListener(null);
            this.a.setClickable(false);
            this.a.removeAllViews();
            String d = this.H.d(sqh.cr);
            if (d != null) {
                C().a(d, this.H);
            }
            this.b.b(skb.f, Boolean.FALSE);
            z().a((Object) this, this.b);
            C().c(this.h);
        }
    }
}
