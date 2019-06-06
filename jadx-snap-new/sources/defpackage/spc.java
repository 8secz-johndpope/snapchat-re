package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.google.common.base.MoreObjects;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;
import defpackage.sjh.a;
import java.io.IOException;

/* renamed from: spc */
public abstract class spc extends slm {
    protected final abth a;
    private Context b;
    private absl c;
    private OperaScalableCircleMaskFrameLayout d;
    private sjn e;
    private sjh f;
    private tad g;
    private boolean h;

    /* renamed from: spc$1 */
    class 1 implements a {
        1() {
        }

        public final void a(ohz ohz) {
            spc.this.a(ohz);
        }

        public final void a(sqf sqf, Exception exception) {
            spc.this.a(exception);
        }
    }

    private spc(absl absl, Context context, OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout, abth abth) {
        this.e = sjn.NONE;
        this.h = false;
        this.b = context;
        this.c = absl;
        this.d = operaScalableCircleMaskFrameLayout;
        this.a = abth;
        this.d.addView(this.a);
    }

    public spc(Context context) {
        this(new absl(context), context, new OperaScalableCircleMaskFrameLayout(context), new abth(context));
    }

    public final sjn E() {
        return this.e;
    }

    public final boolean H() {
        sjh sjh = (sjh) this.I.a(sqh.cA);
        return sjh != null && sjh.b();
    }

    public final void a(float f) {
        sln.a(this.d, MapboxConstants.MINIMUM_ZOOM, f);
    }

    public void a(float f, float f2) {
        d(f);
    }

    public abstract void a(int i);

    /* Access modifiers changed, original: protected|final */
    public final void a(abtl abtl) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2 = (LayoutParams) MoreObjects.firstNonNull((LayoutParams) this.a.getLayoutParams(), new LayoutParams(-1, -1, 17));
        if (this.I.a(sqh.bZ, false)) {
            this.a.a(true);
            if (this.I.c(sqh.K)) {
                this.a.a = false;
            } else {
                this.a.a = true;
            }
            if (abtl != null) {
                int a = this.c.a();
                int c = this.c.c();
                MarginLayoutParams a2 = abti.a(this.b, a, c, abtl.b(), abtl.c(), a, c);
                layoutParams2.setMargins(a2.leftMargin, a2.topMargin, a2.rightMargin, a2.bottomMargin);
            }
            layoutParams = new LayoutParams(-1, -1);
        } else {
            this.a.a(false);
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams = new LayoutParams(-1, -2);
            layoutParams.gravity = ((sps) this.I.a(sqh.cw, sps.MIDDLE_CENTER)).a();
        }
        this.a.setLayoutParams(layoutParams2);
        a(layoutParams);
        a(0);
        this.e = sjn.FULLY_DISPLAYED;
        o();
    }

    public abstract void a(LayoutParams layoutParams);

    /* Access modifiers changed, original: final */
    public final void a(Exception exception) {
        Object a = exception instanceof IOException ? abyh.a((IOException) exception) : abyh.MEDIA_ERROR_PLAYBACK;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BaseOverlayBlobLayerViewController Exception: ");
        stringBuilder.append(exception != null ? exception.getMessage() : "Unknown reason");
        szw a2 = szw.a(skj.w, stringBuilder.toString(), skj.x, a);
        if (this.e == sjn.NONE) {
            this.e = sjn.FULLY_DISPLAYED;
        }
        C().a("OVERLAY_BLOB_LOAD_ERROR", this.H, a2);
        o();
    }

    public abstract void a(ohz ohz);

    public void ae_() {
        szw szw = this.I;
        this.f = (sjh) this.I.a(sqh.cA);
        m();
        a(8);
        this.e = sjn.NONE;
        if (this.f != null) {
            this.g = new tad(new 1());
            ohz a = this.f.a(this.g);
            if (a != null) {
                a(a);
            }
        } else {
            this.e = sjn.FULLY_DISPLAYED;
            o();
        }
        Boolean bool = (Boolean) szw.a(sqh.X);
        if (bool != null && bool.booleanValue()) {
            this.h = true;
        }
        this.d.a(this.G.b.y, "BOBLVC");
    }

    public abstract abtl b(ohz ohz);

    public void b() {
        super.b();
        this.e = sjn.NONE;
        tad tad = this.g;
        if (tad != null) {
            tad.a = true;
            this.g = null;
        }
        sjh sjh = this.f;
        if (sjh != null) {
            sjh.a();
            this.f = null;
        }
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        abth abth = this.a;
        abth.a = false;
        abth.a(false);
        this.a.setLayoutParams(layoutParams);
        a(8);
        n();
        d(1.0f);
        this.h = false;
    }

    public final void b(float f) {
        OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout = this.d;
        sln.a(operaScalableCircleMaskFrameLayout, (float) operaScalableCircleMaskFrameLayout.getWidth(), f);
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(float f) {
        this.a.setScaleX(f);
        this.a.setScaleY(f);
    }

    public final View e() {
        return this.d;
    }

    public final boolean h() {
        return false;
    }

    public abstract void m();

    public abstract void n();

    public abstract void o();
}
