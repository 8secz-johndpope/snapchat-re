package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: acbp */
public class acbp extends WebViewClient {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0048 A:{SYNTHETIC, Splitter:B:29:0x0048} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A:{SYNTHETIC, Splitter:B:21:0x0041} */
    private static java.lang.String a(android.content.Context r4, java.lang.String r5) {
        /*
        r0 = 0;
        r4 = r4.getAssets();	 Catch:{ Exception -> 0x0045, all -> 0x003d }
        r4 = r4.open(r5);	 Catch:{ Exception -> 0x0045, all -> 0x003d }
        r5 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r1 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r1.<init>(r4);	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r5.<init>(r1);	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r1.<init>();	 Catch:{ Exception -> 0x0046, all -> 0x003b }
    L_0x0018:
        r2 = r5.readLine();	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        if (r2 == 0) goto L_0x0029;
    L_0x001e:
        r3 = "^\\s*//.*";
        r3 = r2.matches(r3);	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        if (r3 != 0) goto L_0x0029;
    L_0x0026:
        r1.append(r2);	 Catch:{ Exception -> 0x0046, all -> 0x003b }
    L_0x0029:
        if (r2 != 0) goto L_0x0018;
    L_0x002b:
        r5.close();	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r4.close();	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        r5 = r1.toString();	 Catch:{ Exception -> 0x0046, all -> 0x003b }
        if (r4 == 0) goto L_0x003a;
    L_0x0037:
        r4.close();	 Catch:{ IOException -> 0x003a }
    L_0x003a:
        return r5;
    L_0x003b:
        r5 = move-exception;
        goto L_0x003f;
    L_0x003d:
        r5 = move-exception;
        r4 = r0;
    L_0x003f:
        if (r4 == 0) goto L_0x0044;
    L_0x0041:
        r4.close();	 Catch:{ IOException -> 0x0044 }
    L_0x0044:
        throw r5;
    L_0x0045:
        r4 = r0;
    L_0x0046:
        if (r4 == 0) goto L_0x004b;
    L_0x0048:
        r4.close();	 Catch:{ IOException -> 0x004b }
    L_0x004b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acbp.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        str = acbp.a(webView.getContext(), "WebviewJavascriptBridge.js");
        if (str != null) {
            webView.loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}
