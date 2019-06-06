package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: smx */
public class smx extends slm {
    private tap a;
    private final float b;
    private boolean c;

    /* renamed from: smx$1 */
    class 1 implements OnClickListener {
        1() {
        }

        public final void onClick(View view) {
            smx.this.C().a("UP_ARROW_CLICKED", smx.this.H);
        }
    }

    smx(Context context) {
        this.a = new tap(context, spm.UP);
        this.b = (float) abtp.a(context);
    }

    private void b(float f, float f2) {
        sln.a(this.a, f2);
        sln.c(this.a, f, f2);
    }

    private void m() {
        tap tap = this.a;
        if (tap != null && this.c != tap.p) {
            tap = this.a;
            tap.p = this.c;
            tap.e();
        }
    }

    public final void a(float f) {
        b(this.b, f);
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        this.c = this.I.a(sqh.O, false);
        m();
    }

    public final void a(szw szw) {
        this.a.a();
    }

    public final void a_(szw szw) {
        super.a_(szw);
        if (szw.c(skb.j)) {
            if (szw.a(skb.j, false)) {
                this.a.b();
                return;
            }
            this.a.a();
        }
    }

    public final void ae_() {
        this.a.t = this.G.b.b;
        this.a.n = this.I.d(sqh.M);
        this.a.m = Math.min(Math.max(this.I.a(sqh.N, 255), 0), 255);
        this.a.o = (spm) this.I.a(sqh.P, spm.UP);
        this.a.p = this.I.a(sqh.O, false);
        this.a.q = this.I.a(sqh.Q, true);
        this.a.s = this.I.a(sqh.R, -1);
        this.a.e();
        tap tap = this.a;
        tap.b.setOnClickListener(new 1());
        m();
    }

    public final void b() {
        super.b();
        tap tap = this.a;
        Preconditions.checkState(Looper.myLooper() == Looper.getMainLooper(), "Must be run on main thread");
        tap.c.setImageDrawable(null);
        tap.d();
        tap.c();
        this.a.setAlpha(1.0f);
    }

    public final void b(float f) {
        b(-this.b, f);
    }

    public final void b(szw szw) {
        this.a.b();
    }

    public final void c(float f) {
        this.a.setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, 1.0f - (f * 4.0f)));
    }

    public final View e() {
        return this.a;
    }

    public final void e(szw szw) {
        this.a.setAlpha(1.0f);
    }

    public final String f() {
        return "ARROW";
    }

    public final boolean h() {
        return true;
    }
}
