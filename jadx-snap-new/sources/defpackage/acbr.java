package defpackage;

import android.webkit.JavascriptInterface;
import defpackage.acbq.1;

/* renamed from: acbr */
public final class acbr {
    public static final String JAVASCRIPT_INTERFACE_NAME = "Android";
    private final acbq mWebView;

    public acbr(acbq acbq) {
        this.mWebView = acbq;
    }

    @JavascriptInterface
    public final void callHandler(String str) {
        acbq acbq = this.mWebView;
        acbq.e.a(ajcx.a(new 1(str)).b((ajdw) acbq.d.b()).e());
    }
}
