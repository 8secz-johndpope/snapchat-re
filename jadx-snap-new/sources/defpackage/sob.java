package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.web.OperaWebView;
import com.snapchat.android.framework.ui.views.ScWebView;
import defpackage.ahsp.a;
import defpackage.szc.b;

/* renamed from: sob */
public class sob extends slm implements b {
    private final tds a;
    private boolean b;
    private int c;

    /* renamed from: sob$1 */
    class 1 implements abvb {
        1() {
        }

        public final boolean a() {
            return true;
        }

        public final boolean a(int i) {
            return false;
        }
    }

    sob(Context context) {
        this(new tds(context));
    }

    private sob(tds tds) {
        this.b = false;
        this.a = tds;
    }

    public final void C_() {
        this.a.d();
    }

    public final boolean F() {
        return this.a.F || !this.b;
    }

    public final boolean G() {
        return true;
    }

    public final void T_() {
    }

    public final void a(float f) {
        sln.a(this.a.c, MapboxConstants.MINIMUM_ZOOM, f);
    }

    public final void a(int i, float f, PointF pointF, float f2) {
        float f3 = f;
        PointF pointF2 = pointF;
        float f4 = f2;
        tds tds = this.a;
        int i2 = this.c;
        if (!tds.k.a) {
            int height;
            if (pointF2 == null || !(i2 == 2 || i2 == 1)) {
                tef tef;
                if (i2 == 3) {
                    tef = tds.g;
                    float f5 = -f3;
                    if (((double) f5) < -0.5d) {
                        f5 += 1.0f;
                        height = (int) ((((float) tef.b.getHeight()) * f5) + ((f5 * 2.0f) * ((float) tef.e.getHeight())));
                        tef.c(-height);
                    }
                } else if (i2 == 4) {
                    tef = tds.g;
                    if (((double) f3) < 0.5d) {
                        height = (int) ((((float) tef.b.getHeight()) * f3) + ((((float) tef.e.getHeight()) * f3) * 2.0f));
                        tef.c(-height);
                    }
                }
                tef.c();
                tef.d();
            } else {
                tef tef2 = tds.g;
                if (tef2.p) {
                    tef2.e.setVisibility(0);
                    tef2.e.setPivotX(pointF2.x);
                    tef2.e.setPivotY(pointF2.y);
                    tef2.e.setRotation(-f4);
                    tef2.e.setTranslationY((-(Math.abs(f2) / 15.0f)) * ((float) tef2.e.getHeight()));
                }
                tef2.c.setPivotX(pointF2.x);
                tef2.c.setPivotY(pointF2.y);
                tef2.c.setRotation(-f4);
            }
            height = tds.c.getHeight();
            if (i2 == 3) {
                if (((double) f3) < 0.5d || !tds.y || tds.g.p) {
                    tds.a(8, 0);
                } else {
                    tds.a(0, -((int) (((float) height) * (1.0f - f3))));
                }
            } else if (i2 == 4) {
                if (((double) f3) >= 0.5d) {
                    tds.b(8, 0);
                } else {
                    tds.b(0, -((int) (((float) height) * f3)));
                }
            } else if (i2 == 2 || i2 == 1) {
                tds.b(8, 0);
            }
        }
    }

    public final void a(int i, int i2, Point point) {
        tds tds = this.a;
        if (!tds.k.a) {
            if (tds.w) {
                tds.s.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            }
            ted ted = tds.h;
            ted.b.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            ted.a.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            tef tef = tds.g;
            tef.e.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            tef.e.setRotation(MapboxConstants.MINIMUM_ZOOM);
            tef.c.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
            tef.c.setRotation(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final void a(int i, int i2, boolean z) {
        this.c = i2;
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        boolean z = true;
        boolean z2 = this.F != sjo.STARTED;
        tds tds = this.a;
        if (!TextUtils.equals(tds.u.cX, sqh.cX)) {
            tds.I.setVisibility(8);
        }
        tds.u = sqh;
        tds.v = szw;
        tds.m.b = tds.u;
        tds.p.a(sqh, z2);
        tds.q.a(tds.u);
        tds.g.m = tds.u;
        tdp tdp = tds.n;
        boolean booleanValue = ((Boolean) sqh.a(sqh.aJ)).booleanValue();
        if (booleanValue != (tdp.c.f != null)) {
            tea tea;
            if (booleanValue) {
                tea = tdp.c;
                Preconditions.checkNotNull(tdp);
                tea.f = tdp;
                tdp.a((abvp) tea.b);
                tdp.a(tea.a);
            } else {
                tea = tdp.c;
                Preconditions.checkArgument(tea.f == tdp);
                tdp.b((abvp) tea.b);
                tdp.b(tea.a);
                tea.f = null;
            }
        }
        if (sqh.c(sqh.aE)) {
            String str = ((sqf) sqh.a(sqh.ai)).a;
            if (!TextUtils.isEmpty(str)) {
                tds.x = true;
                tef tef = tds.g;
                if (!str.equals(tef.n)) {
                    tef.n = str;
                }
            }
        }
        if (sqh.a(sqh.P) == null) {
            z = false;
        }
        this.b = z;
        sqn sqn = (sqn) szw.a(sqh.ak, sqn.NEVER);
        tef tef2 = this.a.g;
        if (sqn != tef2.q) {
            tef2.q = sqn;
            CharSequence text = tef2.d.getText();
            tef2.b(text != null ? text.toString() : "", false);
        }
    }

    public final void a(szo szo) {
        this.a.d();
    }

    public final void a(szw szw) {
        tds tds = this.a;
        tdx tdx = tds.f;
        tdx.f = System.currentTimeMillis();
        if (tdx.c != null) {
            tdx.c.onResume();
        }
        tdx.b.m = true;
        if (tdx.i) {
            if (tdx.g) {
                tdh.b(tdx.c);
            } else {
                tdx.h = true;
            }
        }
        if (tdx.w) {
            tdx.a();
        }
        if (tds.x) {
            tds.x = false;
            if (tds.A) {
                tds.A = false;
            }
            tds.f.a(tds.g.n);
        }
        tds.q.c();
        tds.n.b();
        tdg tdg = tds.q;
        tdg.c.add(tds.r);
        tds.l.a = true;
        if (!tds.k.a && tds.g.p) {
            tds.f();
        }
        this.a.y = false;
        if (((Boolean) this.H.c(sqh.aC, Boolean.FALSE)).booleanValue()) {
            szw = new szw();
            szw.b(skb.g, Boolean.TRUE);
            if (this.F != sjo.DESTROYED) {
                z().a((Object) this, szw);
            }
        }
    }

    public final void ae_() {
        this.a.a(A().b);
        this.a.y = true;
        z().a((b) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    public final boolean af_() {
        /*
        r5 = this;
        r0 = r5.a;
        r1 = r0.i;
        r1 = r1.a;
        r1 = r1.getVisibility();
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        r1 = 1;
        goto L_0x0011;
    L_0x0010:
        r1 = 0;
    L_0x0011:
        if (r1 == 0) goto L_0x0018;
    L_0x0013:
        r0.a();
    L_0x0016:
        r0 = 1;
        goto L_0x0063;
    L_0x0018:
        r1 = r0.q;
        if (r1 == 0) goto L_0x0025;
    L_0x001c:
        r1 = r0.q;
        r1 = r1.e();
        if (r1 == 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0016;
    L_0x0025:
        r1 = r0.d;
        r1 = r1.get();
        r1 = (com.snap.opera.view.web.OperaWebView) r1;
        r1 = r1.canGoBack();
        if (r1 == 0) goto L_0x0053;
    L_0x0033:
        r1 = r0.d;
        r1 = r1.get();
        r1 = (com.snap.opera.view.web.OperaWebView) r1;
        r1 = r1.copyBackForwardList();
        r1 = r1.getCurrentItem();
        if (r1 == 0) goto L_0x0053;
    L_0x0045:
        r1 = r1.getUrl();
        r4 = "about:blank";
        r1 = r4.equals(r1);
        if (r1 != 0) goto L_0x0053;
    L_0x0051:
        r1 = 1;
        goto L_0x0054;
    L_0x0053:
        r1 = 0;
    L_0x0054:
        if (r1 == 0) goto L_0x0062;
    L_0x0056:
        r0 = r0.d;
        r0 = r0.get();
        r0 = (com.snap.opera.view.web.OperaWebView) r0;
        r0.goBack();
        goto L_0x0016;
    L_0x0062:
        r0 = 0;
    L_0x0063:
        if (r0 != 0) goto L_0x006d;
    L_0x0065:
        r0 = super.af_();
        if (r0 == 0) goto L_0x006c;
    L_0x006b:
        goto L_0x006d;
    L_0x006c:
        return r2;
    L_0x006d:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sob.af_():boolean");
    }

    public final void b() {
        super.b();
        this.a.y = false;
        z().b((b) this);
        tds tds = this.a;
        tds.l.a = false;
        tds.t.removeView(tds.o);
        tds.n.a(null);
        if (tds.e != null) {
            tds.n.removeView(tds.e);
            tds.e = null;
        }
        tds.p.a();
        tds.q.b();
        tds.q.f();
        tdx tdx = tds.f;
        tdx.n = false;
        tdx.j = a.OK;
        tdx.s = 8;
        tdx.l = null;
        tdx.z = new szw();
        tdx.b.b();
        tdx.b.b = null;
        tdx.b.c = null;
        tdx.b.n = false;
        tdx.b.o = false;
        tdx.c = null;
        tdx.t = null;
        tdx.g = false;
        tdx.h = false;
        tdx.i = false;
        tdx.u = false;
        tdx.x = -1;
        tdx.y = -1;
        tds.f.d = null;
        tds.f.e.a();
        ted ted = tds.h;
        ted.c = null;
        ted.d = null;
        teh.a((ScWebView) tds.d.get());
        ((OperaWebView) tds.d.get()).setOnTouchListener(null);
        ((OperaWebView) tds.d.get()).a = false;
        ((OperaWebView) tds.d.get()).setBackgroundColor(-1);
        tds.m.a();
        teg teg = tds.m;
        teg.d = 0;
        teg.c = 0;
        tds.k.a(false);
        tds.k.b = null;
        tds.b = null;
        tds.A = false;
        tds.J = false;
    }

    public final void b(float f) {
        sln.a(this.a.c, (float) this.a.c.getWidth(), f);
    }

    public final void b(Canvas canvas, int i) {
        this.a.n.a(canvas);
    }

    public final void b(szw szw) {
        szw szw2 = szw;
        tds tds = this.a;
        tds.q.d();
        tds.n.a(szw2);
        tds.q.c.remove(tds.r);
        tdx tdx = tds.f;
        long currentTimeMillis = System.currentTimeMillis();
        if (tdx.i) {
            tdh.a(tdx.c, "onSnapchatPageHide", "");
        }
        tdx.b.m = false;
        if (szw2 != null) {
            boolean z;
            boolean z2;
            long j = tdx.b.e;
            if (VERSION.SDK_INT >= 24 || tdx.b.h == 1) {
                tdx.b();
            }
            long j2 = 0;
            if (j == 0) {
                j2 = currentTimeMillis - tdx.f;
                z = false;
                z2 = false;
            } else {
                z = tdx.f > j;
                z2 = currentTimeMillis > j;
                long j3 = j - tdx.f;
                if (j3 >= 0) {
                    j2 = j3;
                }
            }
            szw2.b(skj.N, Boolean.valueOf(z));
            szw2.b(skj.O, Boolean.valueOf(z2));
            szw2.b(skj.P, Long.valueOf(j2));
            szw2.b(skj.Q, Long.valueOf((long) tdx.b.f));
            szw2.b(skj.R, Long.valueOf((long) tdx.b.g));
            tdx.z.b(skj.X, Long.valueOf(tdx.f));
            tdx.z.b(skj.Y, Long.valueOf(currentTimeMillis));
            tdx.z.b(skj.Z, Long.valueOf(tdx.b.d));
            tdx.z.b(skj.aa, Long.valueOf(j));
            if (!z) {
                tdx.c();
            }
        }
        if (tdx.c != null) {
            if (tdx.w) {
                tdx.c.loadUrl("about:blank");
                tdx.b.b();
            } else {
                tdx.c.onPause();
            }
        }
        szw2.b(skj.aD, Integer.valueOf(0));
        szw2.b(skj.aE, Integer.valueOf(0));
        ViewGroup viewGroup = tds.c;
        InputMethodManager inputMethodManager = (InputMethodManager) tds.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(viewGroup.getWindowToken(), 0);
        }
        tds.l.a = false;
        tds.G.cancel();
        if (tds.z) {
            tds.z = false;
            if (tds.E != null) {
                tds.E.dismiss();
                tds.E = null;
            }
        }
        if (tds.B) {
            tds.x = true;
            if (szw2 != null) {
                szw2.b(skj.aV, tds.u.a(sqh.aF));
                szw2.b(skj.aU, tds.u.a(sqh.aG));
                szw2.b(skj.aX, tds.u.a(sqh.aH));
                szw2.b(skj.aW, spv.WEB_VIEW);
            }
        }
        z().a(this);
    }

    public final void c(szw szw) {
        this.a.e();
    }

    public final View e() {
        return this.a.c;
    }

    public final void e(szw szw) {
        this.a.e();
    }

    public final String f() {
        return "REMOTE_WEB_PAGE";
    }

    public final boolean h() {
        return true;
    }

    public final abvb l() {
        return ((Boolean) this.H.c(sqh.aD, Boolean.FALSE)).booleanValue() ? new 1() : null;
    }
}
