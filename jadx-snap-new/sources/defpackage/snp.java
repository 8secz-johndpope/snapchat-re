package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.brightcove.player.media.MediaService;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.web.OperaWebView;
import com.snapchat.android.framework.ui.views.ScWebView;
import defpackage.szc.b;
import defpackage.tdj.a;
import defpackage.tdk.2;
import defpackage.tdk.3;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: snp */
public class snp extends slm {
    private final tdk a;
    private final b b = new 1();

    /* renamed from: snp$1 */
    class 1 implements b {
        1() {
        }

        public final void T_() {
        }

        public final void a(int i, float f, PointF pointF, float f2) {
        }

        public final void a(int i, int i2, Point point) {
            if (i == 4) {
                snp.this.z().a(2);
            }
        }

        public final void a(int i, int i2, boolean z) {
            if (i != 4) {
                return;
            }
            if (i2 == 2 || i2 == 1) {
                snp.this.z().a(1);
            }
        }
    }

    snp(Context context) {
        this.a = new tdk(context);
    }

    public final void C_() {
        this.a.i.g();
    }

    public final boolean F() {
        return false;
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        tdk tdk = this.a;
        boolean z = this.F != sjo.STARTED;
        tdk.i.a((szw) sqh);
        tdk.j.a(sqh, z);
    }

    public final void a(szo szo) {
        this.a.i.g();
    }

    public final void a(szw szw) {
        A();
        tdk tdk = this.a;
        try {
            if (abss.a().g() && tdk.g.get() != null && ((OperaWebView) tdk.g.get()).a() == 0) {
                ((OperaWebView) tdk.g.get()).post(new 3());
            }
        } catch (IllegalStateException unused) {
        }
        tdk.i.c();
        tdk.h.b();
    }

    public final void ae_() {
        tdk tdk = this.a;
        sjd sjd = A().b;
        sju z = z();
        ((OperaWebView) tdk.g.get()).a(false, false);
        tdk.h.a((OperaWebView) tdk.g.get());
        ((OperaWebView) tdk.g.get()).onResume();
        ((OperaWebView) tdk.g.get()).setWebViewClient(tdk.a);
        ((OperaWebView) tdk.g.get()).setWebChromeClient(new 2());
        WebView webView = (WebView) tdk.g.get();
        webView.setOnLongClickListener(new teh.2());
        WebSettings settings = webView.getSettings();
        settings.setBlockNetworkLoads(true);
        settings.setAllowFileAccess(true);
        settings.setSaveFormData(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(false);
        settings.setLoadWithOverviewMode(true);
        tdk.c = sjd.f;
        tdk.j.a(sjd.b, sjd.d);
        tdk.d = z;
        tdk.i.a(sjd.d, sjd.b, sjd.e, sjd.y);
        z().a(2);
        A();
        tdk = this.a;
        szw szw = this.H;
        tdk.b.a("addInlineVideos");
        String str = (String) Preconditions.checkNotNull(szw.d(sqh.aa));
        tdk.b.a(new tej(tdk.i, tdk.c, str));
        tdk.j.a(szw);
        tdk.i.a(szw);
        String format = String.format("http://%s.com/%s/", new Object[]{abpu.a().toString(), abpu.a().toString()});
        sqf sqf = (sqf) szw.a(sqh.cv);
        Map map = (Map) szw.a(sqh.ab);
        tdj tdj = tdk.a;
        tdj.c = (a) Preconditions.checkNotNull(tdk.k);
        tdj.a = Uri.parse((String) Preconditions.checkNotNull(format));
        tdj.b = Uri.parse((String) Preconditions.checkNotNull(str));
        tdj.d = map;
        Preconditions.checkArgument("file".equalsIgnoreCase(tdj.b.getScheme()));
        Preconditions.checkArgument(MediaService.DEFAULT_MEDIA_DELIVERY.equalsIgnoreCase(tdj.a.getScheme()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format);
        stringBuilder.append(sqf.a);
        format = stringBuilder.toString();
        tdk.e = format;
        ((OperaWebView) tdk.g.get()).loadUrl(format);
        z().a(this.b);
    }

    public final boolean af_() {
        return this.a.i.e() || super.af_();
    }

    public final void b() {
        super.b();
        tdk tdk = this.a;
        tdj tdj = tdk.a;
        tdj.c = null;
        tdj.a = null;
        tdj.b = null;
        tdj.d = null;
        teh.a((ScWebView) tdk.g.get());
        tdk.i.f();
        tdk.b.a();
        tdk = this.a;
        tdk.h.a(null);
        tdk.c = null;
        tdk.j.a();
        tdk.i.b();
        z().b(this.b);
    }

    public final void b(Canvas canvas, int i) {
        tdk tdk = this.a;
        tdk.h.a(canvas);
        tdg tdg = tdk.i;
        i = ((OperaWebView) tdk.g.get()).getScrollY();
        for (Entry entry : tdg.a.entrySet()) {
            View view = (View) entry.getKey();
            if (view.getBottom() >= i && view.getTop() <= tdg.j + i) {
                canvas.translate(MapboxConstants.MINIMUM_ZOOM, (float) (view.getTop() - i));
                ((tbr) entry.getValue()).a(canvas);
                canvas.translate(MapboxConstants.MINIMUM_ZOOM, (float) (i - view.getTop()));
            }
        }
    }

    public final void b(szw szw) {
        tdk tdk = this.a;
        tdk.i.d();
        tdk.h.a(szw);
    }

    public final void c(szw szw) {
        this.a.i.h();
    }

    public final View e() {
        return this.a.f;
    }

    public final void e(szw szw) {
        this.a.i.h();
    }

    public final String f() {
        return "LOCAL_WEB_PAGE";
    }

    public final boolean h() {
        return true;
    }
}
