package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.snap.opera.view.web.OperaWebView;
import com.snapchat.android.framework.ui.views.ScWebView;
import defpackage.iha.a;
import defpackage.spi.b;
import java.util.Map;

/* renamed from: spj */
public class spj extends slm {
    final aipn<OperaWebView> a;
    final iha b = a.a;
    private final spk c;
    private final spi d;
    private final b e = new 1();
    private final spi.a f = new 2();
    private final ski g = new 4();
    private final ski h = new 5();

    /* renamed from: spj$1 */
    class 1 implements b {
        1() {
        }

        public final void a(String str, Map<String, Object> map) {
            if (spj.this.F == sjo.STARTED) {
                spj.this.C().a("ON_POST_MESSAGE", spj.this.H, szw.a(skl.a, str, skl.b, map));
            }
        }
    }

    /* renamed from: spj$2 */
    class 2 implements spi.a {
        2() {
        }

        public final void a(String str) {
            spj.this.C().a("ON_MALFORMED_PARAMS", spj.this.H, szw.a(skl.a, (Object) str));
        }
    }

    /* renamed from: spj$4 */
    class 4 implements ski {
        4() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            str = (String) szw2.a(skl.a);
            String str2 = (String) szw2.a(skl.c);
            sph sph = (sph) szw2.a(skl.d);
            spj spj = spj.this;
            ((OperaWebView) spj.a.get()).post(new Runnable(str2, str, spj.b.b(sph)) {
                public final void run() {
                    WebView webView = (WebView) spj.this.a.get();
                    if (webView != null) {
                        webView.evaluateJavascript(String.format("try{%s(\"%s\", %s)}catch(error){}", new Object[]{r3, r4, r5}), null);
                    }
                }
            });
        }
    }

    /* renamed from: spj$5 */
    class 5 implements ski {
        5() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            str = (String) szw2.a(skl.c);
            String str2 = (String) szw2.a(skl.e);
            Object a = szw2.a(skl.f);
            spj spj = spj.this;
            ((OperaWebView) spj.a.get()).post(/* anonymous class already generated */);
        }
    }

    public spj(Context context) {
        this.a = new tdi(context, OperaWebView.class);
        this.c = new spk();
        this.d = new spi();
        spi spi = this.d;
        b bVar = this.e;
        spi.a aVar = this.f;
        spi.a = bVar;
        spi.b = aVar;
    }

    public final void a(szw szw) {
        C().a("SEND_JAVASCRIPT_CALLBACK", this.g);
        C().a("SEND_JAVASCRIPT", this.h);
    }

    public final void ae_() {
        super.ae_();
        ((OperaWebView) this.a.get()).setWebViewClient(this.c);
        ((OperaWebView) this.a.get()).addJavascriptInterface(this.d, "androidJavascriptBridge");
        this.c.a.set(true);
        String str = (String) this.I.a(sqh.aN);
        String str2 = (String) this.I.a(sqh.aO);
        if (!(abps.b(str) || abps.b(str2))) {
            spk spk = this.c;
            synchronized (spk.b) {
                spk.c = str;
                spk.d = str2;
            }
        }
        str = ((sqf) this.I.a(sqh.aM)).a;
        WebSettings settings = ((OperaWebView) this.a.get()).getSettings();
        if (settings != null) {
            if (!settings.getJavaScriptEnabled()) {
                ((OperaWebView) this.a.get()).stopLoading();
            }
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
        }
        ((OperaWebView) this.a.get()).loadUrl(str);
    }

    public final void b() {
        super.b();
        teh.a((ScWebView) this.a.get());
        spk spk = this.c;
        synchronized (spk.b) {
            spk.c = null;
            spk.d = null;
        }
    }

    public final void b(szw szw) {
        C().b("SEND_JAVASCRIPT", this.h);
        C().b("SEND_JAVASCRIPT_CALLBACK", this.g);
    }

    public final View e() {
        ((OperaWebView) this.a.get()).setBackgroundColor(0);
        return (View) this.a.get();
    }

    public final String f() {
        return "SIMPLE_WEB";
    }
}
