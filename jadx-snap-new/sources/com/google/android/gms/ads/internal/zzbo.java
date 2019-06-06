package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;

final class zzbo extends WebViewClient {
    private /* synthetic */ zzbn zzasj;

    zzbo(zzbn zzbn) {
        this.zzasj = zzbn;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.zzasj.zzapd != null) {
            try {
                this.zzasj.zzapd.onAdFailedToLoad(0);
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zzasj.zzec())) {
            return false;
        }
        String str2 = "Could not call AdListener.onAdFailedToLoad().";
        if (str.startsWith((String) zzlc.zzio().zzd(zzoi.zzbtm))) {
            if (this.zzasj.zzapd != null) {
                try {
                    this.zzasj.zzapd.onAdFailedToLoad(3);
                } catch (RemoteException e) {
                    zzaky.zzc(str2, e);
                }
            }
            this.zzasj.zzk(0);
            return true;
        }
        if (str.startsWith((String) zzlc.zzio().zzd(zzoi.zzbtn))) {
            if (this.zzasj.zzapd != null) {
                try {
                    this.zzasj.zzapd.onAdFailedToLoad(0);
                } catch (RemoteException e2) {
                    zzaky.zzc(str2, e2);
                }
            }
            this.zzasj.zzk(0);
            return true;
        }
        if (str.startsWith((String) zzlc.zzio().zzd(zzoi.zzbto))) {
            if (this.zzasj.zzapd != null) {
                try {
                    this.zzasj.zzapd.onAdLoaded();
                } catch (RemoteException e22) {
                    zzaky.zzc("Could not call AdListener.onAdLoaded().", e22);
                }
            }
            this.zzasj.zzk(this.zzasj.zzv(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.zzasj.zzapd != null) {
                try {
                    this.zzasj.zzapd.onAdLeftApplication();
                } catch (RemoteException e222) {
                    zzaky.zzc("Could not call AdListener.onAdLeftApplication().", e222);
                }
            }
            this.zzasj.zzx(this.zzasj.zzw(str));
            return true;
        }
    }
}
