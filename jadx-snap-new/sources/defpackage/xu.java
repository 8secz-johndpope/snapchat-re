package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braintreepayments.api.threedsecure.ThreeDSecureWebViewActivity;

/* renamed from: xu */
public final class xu extends WebViewClient {
    private ThreeDSecureWebViewActivity a;

    public xu(ThreeDSecureWebViewActivity threeDSecureWebViewActivity) {
        this.a = threeDSecureWebViewActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.a(webView.getTitle());
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (str.contains("html/authentication_complete_frame")) {
            webView.stopLoading();
            this.a.a(xf.a(Uri.parse(str).getQueryParameter("auth_response")));
            return;
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.stopLoading();
        this.a.a(xf.b(str));
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        webView.stopLoading();
        this.a.a(xf.b(sslError.toString()));
    }
}
