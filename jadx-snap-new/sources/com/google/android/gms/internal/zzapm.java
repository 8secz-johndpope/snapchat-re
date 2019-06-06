package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbt;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzabh
@TargetApi(11)
public class zzapm extends zzaog {
    public zzapm(zzaof zzaof, boolean z) {
        super(zzaof, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        String str2 = "UTF-8";
        if (webView instanceof zzaof) {
            zzaof zzaof = (zzaof) webView;
            if (this.zzaop != null) {
                this.zzaop.zza(str, map, 1);
            }
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (zzaof.zzua() != null) {
                zzaof.zzua().zznj();
            }
            zzny zzny = zzaof.zzty().zzvl() ? zzoi.zzbnb : zzaof.zzud() ? zzoi.zzbna : zzoi.zzbmz;
            String str3 = (String) zzlc.zzio().zzd(zzny);
            try {
                Context context = zzaof.getContext();
                String str4 = zzaof.zztl().zzcu;
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", zzbt.zzel().zzl(context, str4));
                hashMap.put("Cache-Control", "max-stale=3600");
                str3 = (String) new zzajr(context).zzb(str3, hashMap).get(60, TimeUnit.SECONDS);
                return str3 == null ? null : new WebResourceResponse("application/javascript", str2, new ByteArrayInputStream(str3.getBytes(str2)));
            } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
                str = "Could not fetch MRAID JS. ";
                str3 = String.valueOf(e.getMessage());
                zzaky.zzcz(str3.length() != 0 ? str.concat(str3) : new String(str));
                return null;
            }
        }
        zzaky.zzcz("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
