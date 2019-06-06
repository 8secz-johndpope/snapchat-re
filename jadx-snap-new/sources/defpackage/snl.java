package defpackage;

import android.content.Context;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: snl */
public abstract class snl extends slm {
    private final float a;
    private boolean b;
    private boolean c;
    private float d;

    snl(float f) {
        this.b = true;
        this.c = false;
        this.d = 1.0f;
        this.a = f;
    }

    protected snl(Context context) {
        this((float) abtp.a(context));
    }

    private void b(float f, float f2) {
        sln.b(e(), f2);
        sln.c(e(), f, f2);
    }

    private void m() {
        View e;
        int i = 0;
        Object obj = (!this.b || this.c) ? null : 1;
        if (obj == null || this.d <= 1.0E-6f) {
            e().setAlpha(MapboxConstants.MINIMUM_ZOOM);
            e = e();
            i = 4;
        } else {
            e().setAlpha(this.d);
            e = e();
        }
        e.setVisibility(i);
    }

    public final void C_() {
        a(false);
    }

    public final void a(float f) {
        b(this.a, f);
    }

    public void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        if (this.b) {
            e().setVisibility(0);
        }
    }

    public final void a(szo szo) {
        this.c = true;
        a(false);
        m();
    }

    public final void a(szw szw) {
        a(true);
    }

    public abstract void a(boolean z);

    public void a_(szw szw) {
        if (szw.c(skb.h)) {
            this.b = szw.a(skb.h, false) ^ 1;
        } else {
            this.b = true;
        }
        this.d = szw.a(skb.b, 1.0f);
        m();
    }

    public void ae_() {
        this.d = 1.0f;
        this.b = true;
        this.c = false;
    }

    public void b() {
        super.b();
        e().setVisibility(8);
        a(false);
    }

    public final void b(float f) {
        b(-this.a, f);
    }

    public void b(szw szw) {
        a(false);
    }

    public void c(float f) {
        e().setAlpha(Math.max(MapboxConstants.MINIMUM_ZOOM, 1.0f - (f * 4.0f)));
    }

    public final void c(szw szw) {
        a(true);
    }

    public final void e(szw szw) {
        this.c = false;
        a(true);
        m();
    }

    public boolean h() {
        return true;
    }
}
