package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.ads.internal.js.zzm;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONObject;

@zzabh
public interface zzaof extends zza, zzm, zzbm, zzann, zzapa, zzapb, zzapo, zzapr, zzaps, zzapt, zzgv {
    void destroy();

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    void setBackgroundColor(int i);

    void setContext(Context context);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    void zza(zzd zzd);

    void zza(zzaou zzaou);

    void zza(zzaqa zzaqa);

    void zza(String str, zzt<? super zzaof> zzt);

    void zza(String str, Map<String, ?> map);

    void zza(String str, JSONObject jSONObject);

    void zzag(int i);

    void zzah(boolean z);

    void zzai(boolean z);

    void zzaj(boolean z);

    void zzak(boolean z);

    void zzb(zzd zzd);

    void zzb(zzpt zzpt);

    void zzb(String str, zzt<? super zzaof> zzt);

    void zzb(String str, JSONObject jSONObject);

    zzv zzbo();

    void zzc(String str, String str2, String str3);

    void zzde(String str);

    void zznn();

    zzaou zzth();

    Activity zztj();

    zzou zztk();

    zzala zztl();

    void zztt();

    void zztu();

    Context zztv();

    zzd zztw();

    zzd zztx();

    zzaqa zzty();

    String zztz();

    zzapu zzua();

    boolean zzub();

    zzcv zzuc();

    boolean zzud();

    void zzue();

    boolean zzuf();

    boolean zzug();

    boolean zzuh();

    void zzui();

    void zzuj();

    zzpt zzuk();

    void zzul();

    void zzum();
}
