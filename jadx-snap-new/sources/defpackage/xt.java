package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.braintreepayments.api.threedsecure.ThreeDSecureWebViewActivity;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: xt */
public final class xt extends WebView {
    public xt(Context context) {
        super(context);
    }

    public final void a(ThreeDSecureWebViewActivity threeDSecureWebViewActivity) {
        setId(16908312);
        WebSettings settings = getSettings();
        settings.setUserAgentString("braintree/android/2.7.0");
        settings.setCacheMode(1);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(new xs(threeDSecureWebViewActivity));
        setWebViewClient(new xu(threeDSecureWebViewActivity));
    }
}
