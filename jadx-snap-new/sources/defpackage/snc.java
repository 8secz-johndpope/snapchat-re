package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snap.opera.view.market.CardInteractionLayerView;
import com.snap.opera.view.market.CardInteractionLayerView.AnonymousClass2;
import com.snap.opera.view.web.OperaWebView;
import com.snapchat.android.R;
import defpackage.siw.c;
import defpackage.szw.b;
import defpackage.tdx.a;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: snc */
public class snc extends slm implements a {
    private ConcurrentLinkedQueue<String> A;
    private final ski B = new -$$Lambda$snc$uWhn0GZnP-TkaHTaBZMR9JMFrUo(this);
    private siw.a C = new 2();
    final Supplier<GestureDetector> a;
    final int b;
    final sjc c;
    final CardInteractionLayerView d;
    sjn e = sjn.NONE;
    spp f;
    boolean g = false;
    boolean h = false;
    private final b i;
    private Context j;
    private final abvb k;
    private Runnable l;
    private sjm m;
    private Runnable n;
    private Rect o;
    private szw p = new szw();
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private abns t;
    private long u;
    private long v;
    private boolean w = false;
    private long x = 1500;
    private tdx y;
    private aipn<OperaWebView> z;

    /* renamed from: snc$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            snc.this.a(abns.AUTO_ADVANCE);
            snc.this.a(false);
        }
    }

    /* renamed from: snc$3 */
    class 3 implements Runnable {
        3() {
        }

        public final void run() {
            snc.this.a(abns.AUTO_ADVANCE);
            snc.this.a(false);
        }
    }

    /* renamed from: snc$c */
    final class c extends SimpleOnGestureListener {
        private c() {
        }

        /* synthetic */ c(snc snc, byte b) {
            this();
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            snc.this.e().cancelLongPress();
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent == null || motionEvent2 == null || snc.this.h) {
                return false;
            }
            if (snc.this.g) {
                return true;
            }
            if (motionEvent.getY() - motionEvent2.getY() <= ((float) snc.this.b) || snc.this.d.a) {
                if (motionEvent.getY() - motionEvent2.getY() < ((float) snc.this.b) && snc.this.d.a) {
                    snc.this.d(true);
                    return true;
                }
                return false;
            }
            snc.this.m();
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return snc.a(snc.this, motionEvent);
        }
    }

    /* renamed from: snc$2 */
    class 2 implements siw.a {
        2() {
        }

        public final void a(String str, ImageView imageView, int i, int i2, c cVar) {
            snc.this.c.b(cVar);
            CardInteractionLayerView cardInteractionLayerView = snc.this.d;
            cardInteractionLayerView.g.setText(snc.this.f.f);
            cardInteractionLayerView.h.setText(null);
            snc snc = snc.this;
            snc.e = sjn.FULLY_DISPLAYED;
            if (snc.F != sjo.DESTROYED) {
                snc.z().m();
                snc.z().n();
            }
        }

        public final void a(String str, ImageView imageView, Exception exception) {
            if (snc.this.f.c != null && snc.this.f.c.c) {
                szw a = szw.a(skj.w, exception != null ? exception.getMessage() : "Unknown reason", skj.x, abyh.MEDIA_ERROR_MISSING_FILE);
                if (snc.this.F != sjo.DESTROYED) {
                    snc.this.z().b(a);
                }
            }
        }
    }

    /* renamed from: snc$a */
    class a implements abvb {
        private a() {
        }

        /* synthetic */ a(snc snc, byte b) {
            this();
        }

        public final boolean a() {
            return false;
        }

        public final boolean a(int i) {
            return snc.this.d.a;
        }
    }

    /* renamed from: snc$b */
    class b implements abvp {
        private b() {
        }

        /* synthetic */ b(snc snc, byte b) {
            this();
        }

        public final boolean a(MotionEvent motionEvent) {
            return motionEvent.getActionMasked() == 0;
        }

        public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
            return snc.a(snc.this, motionEvent);
        }

        public final boolean b(ViewGroup viewGroup, MotionEvent motionEvent) {
            ((GestureDetector) snc.this.a.get()).onTouchEvent(motionEvent);
            if (!snc.this.g) {
                return false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                snc.this.g = false;
            }
            return true;
        }
    }

    public snc(Context context) {
        this.j = context;
        this.d = (CardInteractionLayerView) View.inflate(context, R.layout.card_interaction_layer_view, null);
        this.i = new b(this, (byte) 0);
        this.k = new a(this, (byte) 0);
        this.a = Suppliers.memoize(new -$$Lambda$snc$_XUx53M-6Ovz9jXTd7ehr4Xyc_I(this, context));
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A = new ConcurrentLinkedQueue();
        this.z = new tdi(context, OperaWebView.class);
        this.y = new tdx();
        this.c = new sjc("CardInteractionViewerController");
    }

    private /* synthetic */ void a(String str, szw szw, szw szw2) {
        if (!this.h) {
            if (!this.w) {
                m();
            }
            this.g = false;
        }
    }

    static /* synthetic */ boolean a(snc snc, MotionEvent motionEvent) {
        return (snc.g || snc.d.a) && (snc.g || !snc.o.contains((int) motionEvent.getX(), (int) motionEvent.getY()));
    }

    private void b(boolean z) {
        this.p.d();
        this.p.b(skb.h, Boolean.valueOf(z));
        this.p.b(skb.a, Boolean.valueOf(z));
        this.p.b(skb.i, Boolean.valueOf(z));
        this.p.b(skb.j, Boolean.valueOf(z));
        this.p.b(skb.d, z ? sqb.LOOP : sqb.PLAY);
        this.d.post(new -$$Lambda$snc$gudbc8K5LG_jqbNCWAhYOZ-uQng(this, z));
    }

    private boolean b(String str) {
        try {
            if (this.f.e) {
                Intent parseUri = Intent.parseUri(str, 1);
                ComponentName resolveActivity = parseUri.resolveActivity(this.j.getPackageManager());
                if (resolveActivity != null && resolveActivity.getPackageName().equalsIgnoreCase(this.f.a)) {
                    this.j.startActivity(parseUri);
                    c(false);
                    return true;
                }
            }
        } catch (URISyntaxException unused) {
            StringBuilder stringBuilder = new StringBuilder("URISyntaxException occurred in parsing the deep link uri: ");
            stringBuilder.append(this.f.d);
            str = stringBuilder.toString();
            if (this.F != sjo.DESTROYED) {
                z().b(szw.a(skj.w, str, skj.x, abyh.MEDIA_ERROR_VALIDATION));
            }
        }
        return false;
    }

    private void c(boolean z) {
        if (z) {
            this.r = true;
        } else {
            this.q = true;
        }
    }

    private void d(boolean z) {
        this.v = System.currentTimeMillis();
        this.d.removeCallbacks(this.n);
        this.d.a();
        b(false);
        if (this.F != sjo.DESTROYED) {
            z().c(false);
        }
        if (z) {
            szw szw = new szw();
            if (this.f.g == 1) {
                f(szw);
                a(abns.SWIPE_DOWN);
            }
            this.g = true;
        }
        this.w = false;
    }

    private /* synthetic */ void e(boolean z) {
        if (this.F != sjo.DESTROYED) {
            z().a((Object) this, this.p);
            if (!z) {
                z().a((Object) this);
            }
        }
    }

    private void f(szw szw) {
        if (szw != null) {
            srb srb = (srb) szw.a(skj.a);
            szw.b(skj.aQ, Boolean.TRUE);
            szw.b(skj.ae, Boolean.valueOf(this.q));
            szw.b(skj.af, Boolean.valueOf(this.r));
            b bVar = skj.ag;
            boolean z = this.s && (srb == srb.TAP_ARROW || srb == srb.SWIPE_FRONT);
            szw.b(bVar, Boolean.valueOf(z));
            szw.b(skj.ah, Boolean.TRUE);
            szw.b(skj.aR, this.t);
            szw.b(skj.aS, Long.valueOf(n()));
        }
    }

    private void m() {
        float height;
        float e;
        if (this.l == null) {
            this.l = new -$$Lambda$snc$xpBGKHsnTcNP87OpoDibyZTvtIg(this);
        }
        CardInteractionLayerView cardInteractionLayerView = this.d;
        Runnable runnable = this.l;
        cardInteractionLayerView.f.setVisibility(0);
        cardInteractionLayerView.i.animate().alpha(1.0f).setDuration(300);
        if (absn.a.a.c()) {
            height = ((float) (cardInteractionLayerView.b - cardInteractionLayerView.f.getHeight())) - cardInteractionLayerView.c;
            e = (float) absi.a.a.e();
        } else {
            height = (float) (cardInteractionLayerView.b - cardInteractionLayerView.f.getHeight());
            e = cardInteractionLayerView.c;
        }
        cardInteractionLayerView.f.animate().y(height - e).alpha(1.0f).setDuration(300).setListener(new AnonymousClass2(runnable));
        this.g = true;
        b(true);
        if (this.F != sjo.DESTROYED) {
            z().c(true);
        }
    }

    private long n() {
        long j = this.u;
        if (j == 0) {
            return 0;
        }
        long j2 = this.v;
        return j2 == 0 ? System.currentTimeMillis() - this.u : j2 - j;
    }

    private /* synthetic */ void o() {
        szw szw = new szw();
        if (this.f.g == 1) {
            if (this.n == null) {
                this.n = new 3();
            }
            this.d.postDelayed(this.n, this.x);
            tdx tdx = this.y;
            if (tdx != null) {
                tdx.a(this.f.d);
            }
            f(szw);
        }
        this.u = System.currentTimeMillis();
        this.v = 0;
        if (this.o == null) {
            int[] iArr = new int[2];
            this.d.f.getLocationOnScreen(iArr);
            this.o = new Rect();
            Rect rect = this.o;
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.bottom = rect.top + this.d.f.getHeight();
            Rect rect2 = this.o;
            rect2.right = rect2.left + this.d.f.getWidth();
        }
        C().a("CARD_INTERACTION_CARD_SWIPED_UP", this.H, szw);
        this.w = true;
        this.g = false;
    }

    public final sjn E() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final void a(abns abns) {
        if (this.t == null) {
            this.t = abns;
        } else if (abns == abns.TAP) {
            this.t = abns;
        } else {
            if (abns == abns.AUTO_ADVANCE && this.t == abns.SWIPE_DOWN) {
                this.t = abns.AUTO_ADVANCE;
            }
        }
    }

    public final void a(String str) {
        spp spp = this.f;
        if (spp != null && spp.g == 1 && !TextUtils.isEmpty(str) && !this.A.contains(str)) {
            this.A.add(str);
        }
    }

    public final void a(szw szw) {
        C().a("UP_ARROW_CLICKED", this.B);
        if (this.f.g == 1 && !TextUtils.isEmpty(this.f.d) && !this.A.contains(this.f.d)) {
            this.A.add(this.f.d);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        spp spp = this.f;
        if (spp != null) {
            if (spp.d != null && this.m.a(this.f.d, true, true)) {
                c(false);
            } else if (!TextUtils.isEmpty(this.f.a)) {
                Iterator it = this.A.iterator();
                while (it.hasNext()) {
                    if (b((String) it.next())) {
                        return;
                    }
                }
                if (!z || this.A.size() > 1) {
                    szi.a(this.j, this.f.a);
                    c(true);
                    return;
                }
                if (this.n == null) {
                    this.n = new 1();
                    this.d.postDelayed(this.n, 1000);
                }
            }
        }
    }

    public final void ae_() {
        sjd sjd = A().b;
        this.m = sjd.g;
        this.f = (spp) this.H.a(sqh.aP);
        boolean z = true;
        if (!(this.f.g != 1 || this.f.c == null || TextUtils.isEmpty(this.f.c.a))) {
            if (A().b.b != null) {
                this.c.a(D().a(this.f.c.a, this.f.c.b, this.d.d, this.C));
            }
            this.d.e.setVisibility(0);
            this.d.f.setOnClickListener(new -$$Lambda$snc$v4tRnuB83buqvWOTJx7UIB0450s(this));
            if (this.f.e || this.f.h != spp.a.WEBVIEW) {
                z = false;
            }
            this.h = z;
            this.s = this.h;
            this.x = ((Long) this.H.c(sqh.aQ, Long.valueOf(1500))).longValue();
            aipn aipn = this.z;
            if (aipn != null) {
                teh.a((WebView) aipn.get());
                this.y.a((OperaWebView) this.z.get(), sjd.h, (String) this.H.a(sqh.aI), null, true, false, false, false, false, false, ((Boolean) this.H.a(sqh.au)).booleanValue(), ((Boolean) this.H.a(sqh.aK)).booleanValue());
                this.y.r = this;
            }
        }
    }

    public final void b() {
        super.b();
        this.c.b();
        if (this.f.g == 1) {
            D().a(this.d.d);
            this.y.r = null;
        }
        this.f = null;
        this.e = sjn.NONE;
    }

    public final void b(szw szw) {
        if (this.f.g == 1) {
            f(szw);
        }
        C().b("UP_ARROW_CLICKED", this.B);
        d(false);
        this.h = false;
        this.q = false;
        this.r = false;
        this.t = null;
        this.u = 0;
        this.v = 0;
        this.A.clear();
    }

    public final View e() {
        return this.d;
    }

    public final String f() {
        return "CARD_INTERACTION";
    }

    public final boolean h() {
        return true;
    }

    public final abvp k() {
        return this.i;
    }

    public final abvb l() {
        return this.k;
    }
}
