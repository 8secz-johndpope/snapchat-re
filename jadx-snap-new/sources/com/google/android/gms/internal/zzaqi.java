package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.zzs;

@zzabh
final class zzaqi {
    private static Boolean zzdsv;

    private zzaqi() {
    }

    @TargetApi(19)
    static void zza(WebView webView, String str) {
        if (zzs.zzanv() && zzb(webView)) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String str2 = "javascript:";
        str = String.valueOf(str);
        webView.loadUrl(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    @android.annotation.TargetApi(19)
    private static boolean zzb(android.webkit.WebView r3) {
        /*
        r0 = com.google.android.gms.internal.zzaqi.class;
        monitor-enter(r0);
        r1 = zzdsv;	 Catch:{ all -> 0x001e }
        if (r1 != 0) goto L_0x0016;
    L_0x0007:
        r1 = "(function(){})()";
        r2 = 0;
        r3.evaluateJavascript(r1, r2);	 Catch:{ IllegalStateException -> 0x0012 }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ IllegalStateException -> 0x0012 }
        zzdsv = r3;	 Catch:{ IllegalStateException -> 0x0012 }
        goto L_0x0016;
    L_0x0012:
        r3 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x001e }
        zzdsv = r3;	 Catch:{ all -> 0x001e }
    L_0x0016:
        r3 = zzdsv;	 Catch:{ all -> 0x001e }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x001e }
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        return r3;
    L_0x001e:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001e }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaqi.zzb(android.webkit.WebView):boolean");
    }
}
