package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzw;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;

@zzabh
@TargetApi(11)
public class zzapc extends WebChromeClient {
    private final zzaof zzcct;

    public zzapc(zzaof zzaof) {
        this.zzcct = zzaof;
    }

    private static Context zza(WebView webView) {
        if (!(webView instanceof zzaof)) {
            return webView.getContext();
        }
        zzaof zzaof = (zzaof) webView;
        Activity zztj = zzaof.zztj();
        return zztj != null ? zztj : zzaof.getContext();
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            AlertDialog create;
            if (!(this.zzcct == null || this.zzcct.zzua() == null || this.zzcct.zzua().zzun() == null)) {
                zzw zzun = this.zzcct.zzua().zzun();
                if (!(zzun == null || zzun.zzcz())) {
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str3).length());
                    stringBuilder.append("window.");
                    stringBuilder.append(str);
                    stringBuilder.append("('");
                    stringBuilder.append(str3);
                    stringBuilder.append("')");
                    zzun.zzt(stringBuilder.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                create = builder.setView(linearLayout).setPositiveButton(17039370, new zzapi(jsPromptResult, editText)).setNegativeButton(17039360, new zzaph(jsPromptResult)).setOnCancelListener(new zzapg(jsPromptResult)).create();
            } else {
                create = builder.setMessage(str3).setPositiveButton(17039370, new zzapf(jsResult)).setNegativeButton(17039360, new zzape(jsResult)).setOnCancelListener(new zzapd(jsResult)).create();
            }
            create.show();
        } catch (BadTokenException e) {
            zzaky.zzc("Fail to display Dialog.", e);
        }
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzaof) {
            zzd zztw = ((zzaof) webView).zztw();
            if (zztw == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                zztw.close();
                return;
            }
        }
        str = "Tried to close a WebView that wasn't an AdWebView.";
        zzaky.zzcz(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(message).length() + 19) + String.valueOf(sourceId).length());
        stringBuilder.append("JS: ");
        stringBuilder.append(message);
        stringBuilder.append(" (");
        stringBuilder.append(sourceId);
        stringBuilder.append(":");
        stringBuilder.append(lineNumber);
        stringBuilder.append(")");
        message = stringBuilder.toString();
        if (message.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzapj.zzdsf[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzaky.e(message);
        } else if (i == 2) {
            zzaky.zzcz(message);
        } else if (i == 3 || i == 4 || i != 5) {
            zzaky.zzcy(message);
        } else {
            zzaky.zzby(message);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zzcct.zzua() instanceof WebViewClient) {
            webView2.setWebViewClient((WebViewClient) this.zzcct.zzua());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            boolean z;
            zzbt.zzel();
            if (!zzaij.zzd(this.zzcct.getContext(), this.zzcct.getContext().getPackageName(), PermissionsManager.FINE_LOCATION_PERMISSION)) {
                zzbt.zzel();
                if (!zzaij.zzd(this.zzcct.getContext(), this.zzcct.getContext().getPackageName(), PermissionsManager.COARSE_LOCATION_PERMISSION)) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzd zztw = this.zzcct.zztw();
        if (zztw == null) {
            zzaky.zzcz("Could not get ad overlay when hiding custom view.");
        } else {
            zztw.zzng();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        j += 131072;
        if (5242880 - j2 < j) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        zza(view, -1, customViewCallback);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(View view, int i, CustomViewCallback customViewCallback) {
        zzd zztw = this.zzcct.zztw();
        if (zztw == null) {
            zzaky.zzcz("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zztw.zza(view, customViewCallback);
        zztw.setRequestedOrientation(i);
    }
}
