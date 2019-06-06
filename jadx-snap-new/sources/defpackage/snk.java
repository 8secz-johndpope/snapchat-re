package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.google.common.base.Predicate;
import com.snap.opera.view.FitWidthImageView;
import defpackage.siw.a;
import defpackage.siw.b;
import defpackage.siw.c;

/* renamed from: snk */
public class snk extends smz {
    public static final Predicate<sqh> l = new 1();
    final FitWidthImageView k;
    private final ski m;
    private final ski n;
    private final ski o;

    /* renamed from: snk$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            sqh sqh = (sqh) obj;
            return (sqh.c(sqh.cn, sqc.DEFAULT_OPERA_IMAGE_PLAYER) == sqc.DEFAULT_OPERA_IMAGE_PLAYER ? 1 : null) != null && (sqh.c(sqh.H, spu.BITMAP) == spu.GIF ? 1 : null) == null;
        }
    }

    /* renamed from: snk$2 */
    class 2 implements ski {
        2() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (snk.this.d) {
                snk.this.k.b(false);
                snk.this.K();
            }
        }
    }

    /* renamed from: snk$3 */
    class 3 implements ski {
        3() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            if (snk.this.d) {
                snk.this.k.b(true);
                snk.this.L();
            }
        }
    }

    /* renamed from: snk$4 */
    class 4 implements ski {
        4() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            snk.this.k.setVisibility(8);
        }
    }

    snk(Context context) {
        this(context, new FitWidthImageView(context));
    }

    private snk(Context context, FitWidthImageView fitWidthImageView) {
        super(context);
        this.m = new 2();
        this.n = new 3();
        this.o = new 4();
        this.k = fitWidthImageView;
        this.k.setMinimumWidth(1);
        this.k.setMinimumHeight(1);
        this.a.addView(this.k);
    }

    private void L() {
        this.k.a();
        this.k.setOnLongClickListener(new -$$Lambda$snk$WMC6Qr_j2ITZ8uk6QWVM-9sBLS8(this));
    }

    /* Access modifiers changed, original: final */
    public final void K() {
        this.k.b();
        this.k.setOnLongClickListener(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(LayoutParams layoutParams) {
        this.k.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(c cVar) {
        if (J()) {
            a((View) this.k);
        }
        this.k.setImageBitmap(cVar.c());
        I();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(sqf sqf, int i, int i2, a aVar) {
        this.b.a();
        b a = (i <= 0 || i2 <= 0) ? D().a(sqf.a, sqf.b, aVar) : ((this.d || i <= this.k.a || i2 <= this.k.b) && (i >= this.k.a || i2 >= this.k.b)) ? D().a(sqf.a, sqf.b, i, i2, aVar) : D().a(sqf.a, sqf.b, this.k.a, this.k.b, aVar);
        this.b.a(a);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        if (szw.a(sqh.G, false)) {
            new Handler().post(new -$$Lambda$vl57ahfYe0mxeLngI_oSesUNtmA(this));
        }
    }

    public final void a(szw szw) {
        super.a(szw);
        this.k.setVisibility(0);
        if (this.d) {
            L();
            z().a((Object) this, szw.a(skb.g, Boolean.TRUE));
        }
        C().a("FOLD_LAYER_CONTENT_INTO_SHAPE", this.o);
    }

    public final void ae_() {
        super.ae_();
        C().a("CONTEXT_MENU_MODE_WILL_ENTER", this.m);
        C().a("CONTEXT_MENU_MODE_WILL_EXIT", this.n);
        this.k.b(this.d);
        this.k.setMinimumWidth(1);
        this.k.setMinimumHeight(1);
        if (!J()) {
            FitWidthImageView fitWidthImageView;
            ScaleType scaleType;
            abtg.a aVar = (abtg.a) this.I.c(sqh.F, abtg.a.FILL_WIDTH);
            if (aVar == abtg.a.FILL_WIDTH) {
                fitWidthImageView = this.k;
                fitWidthImageView.c = true;
                scaleType = ScaleType.FIT_CENTER;
            } else if (aVar == abtg.a.CENTER_CROP) {
                fitWidthImageView = this.k;
                fitWidthImageView.c = false;
                scaleType = ScaleType.CENTER_CROP;
            } else {
                fitWidthImageView = this.k;
                fitWidthImageView.c = false;
                fitWidthImageView.setScaleType(ScaleType.FIT_CENTER);
            }
            fitWidthImageView.setScaleType(scaleType);
        }
    }

    public final void b() {
        super.b();
        this.k.c = true;
        D().a(this.k);
        this.k.b(false);
        C().b("CONTEXT_MENU_MODE_WILL_ENTER", this.m);
        C().b("CONTEXT_MENU_MODE_WILL_EXIT", this.n);
    }

    public final void b(szw szw) {
        super.b(szw);
        if (this.d) {
            K();
        }
        C().c(this.o);
    }

    public final String f() {
        return "IMAGE";
    }

    public final boolean h() {
        return true;
    }
}
