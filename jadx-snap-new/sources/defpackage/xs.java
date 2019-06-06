package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import com.braintreepayments.api.threedsecure.ThreeDSecureWebViewActivity;

/* renamed from: xs */
public final class xs extends WebChromeClient {
    private ThreeDSecureWebViewActivity a;

    public xs(ThreeDSecureWebViewActivity threeDSecureWebViewActivity) {
        this.a = threeDSecureWebViewActivity;
    }

    public final void onCloseWindow(WebView webView) {
        this.a.a();
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        xt xtVar = new xt(this.a.getApplicationContext());
        xtVar.a(this.a);
        this.a.a(xtVar);
        ((WebViewTransport) message.obj).setWebView(xtVar);
        message.sendToTarget();
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        ThreeDSecureWebViewActivity threeDSecureWebViewActivity;
        boolean z;
        super.onProgressChanged(webView, i);
        if (i < 100) {
            this.a.setProgress(i);
            threeDSecureWebViewActivity = this.a;
            z = true;
        } else {
            threeDSecureWebViewActivity = this.a;
            z = false;
        }
        threeDSecureWebViewActivity.setProgressBarVisibility(z);
    }
}
