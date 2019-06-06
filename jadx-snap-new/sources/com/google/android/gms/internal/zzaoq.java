package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONObject;

@zzabh
public final class zzaoq extends FrameLayout implements zzaof {
    private final zzaof zzdqk;
    private final zzane zzdql;

    public zzaoq(zzaof zzaof) {
        super(zzaof.getContext());
        this.zzdqk = zzaof;
        this.zzdql = new zzane(zzaof.zztv(), this, this);
        zzapu zzua = this.zzdqk.zzua();
        if (zzua != null) {
            zzua.zzk(this);
        }
        addView(this.zzdqk.getView());
    }

    public final void destroy() {
        this.zzdqk.destroy();
    }

    public final OnClickListener getOnClickListener() {
        return this.zzdqk.getOnClickListener();
    }

    public final String getRequestId() {
        return this.zzdqk.getRequestId();
    }

    public final int getRequestedOrientation() {
        return this.zzdqk.getRequestedOrientation();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.zzdqk.getWebView();
    }

    public final boolean isDestroyed() {
        return this.zzdqk.isDestroyed();
    }

    public final void loadData(String str, String str2, String str3) {
        this.zzdqk.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzdqk.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.zzdqk.loadUrl(str);
    }

    public final void onPause() {
        this.zzdql.onPause();
        this.zzdqk.onPause();
    }

    public final void onResume() {
        this.zzdqk.onResume();
    }

    public final void setContext(Context context) {
        this.zzdqk.setContext(context);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.zzdqk.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.zzdqk.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.zzdqk.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzdqk.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzdqk.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.zzdqk.stopLoading();
    }

    public final void zza(zzc zzc) {
        this.zzdqk.zza(zzc);
    }

    public final void zza(zzd zzd) {
        this.zzdqk.zza(zzd);
    }

    public final void zza(zzaou zzaou) {
        this.zzdqk.zza(zzaou);
    }

    public final void zza(zzaqa zzaqa) {
        this.zzdqk.zza(zzaqa);
    }

    public final void zza(zzgu zzgu) {
        this.zzdqk.zza(zzgu);
    }

    public final void zza(String str, zzt<? super zzaof> zzt) {
        this.zzdqk.zza(str, (zzt) zzt);
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzdqk.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzdqk.zza(str, jSONObject);
    }

    public final void zza(boolean z, int i) {
        this.zzdqk.zza(z, i);
    }

    public final void zza(boolean z, int i, String str) {
        this.zzdqk.zza(z, i, str);
    }

    public final void zza(boolean z, int i, String str, String str2) {
        this.zzdqk.zza(z, i, str, str2);
    }

    public final void zzag(int i) {
        this.zzdqk.zzag(i);
    }

    public final void zzag(boolean z) {
        this.zzdqk.zzag(z);
    }

    public final void zzah(boolean z) {
        this.zzdqk.zzah(z);
    }

    public final void zzai(boolean z) {
        this.zzdqk.zzai(z);
    }

    public final void zzaj(boolean z) {
        this.zzdqk.zzaj(z);
    }

    public final void zzak(boolean z) {
        this.zzdqk.zzak(z);
    }

    public final void zzb(zzd zzd) {
        this.zzdqk.zzb(zzd);
    }

    public final void zzb(zzpt zzpt) {
        this.zzdqk.zzb(zzpt);
    }

    public final void zzb(String str, zzt<? super zzaof> zzt) {
        this.zzdqk.zzb(str, (zzt) zzt);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.zzdqk.zzb(str, jSONObject);
    }

    public final zzv zzbo() {
        return this.zzdqk.zzbo();
    }

    public final void zzc(String str, String str2, String str3) {
        this.zzdqk.zzc(str, str2, str3);
    }

    public final void zzcp() {
        this.zzdqk.zzcp();
    }

    public final void zzcq() {
        this.zzdqk.zzcq();
    }

    public final void zzde(String str) {
        this.zzdqk.zzde(str);
    }

    public final void zznn() {
        this.zzdqk.zznn();
    }

    public final void zzno() {
        this.zzdqk.zzno();
    }

    public final zzane zztg() {
        return this.zzdql;
    }

    public final zzaou zzth() {
        return this.zzdqk.zzth();
    }

    public final zzot zzti() {
        return this.zzdqk.zzti();
    }

    public final Activity zztj() {
        return this.zzdqk.zztj();
    }

    public final zzou zztk() {
        return this.zzdqk.zztk();
    }

    public final zzala zztl() {
        return this.zzdqk.zztl();
    }

    public final int zztm() {
        return getMeasuredHeight();
    }

    public final int zztn() {
        return getMeasuredWidth();
    }

    public final void zztt() {
        this.zzdqk.zztt();
    }

    public final void zztu() {
        this.zzdqk.zztu();
    }

    public final Context zztv() {
        return this.zzdqk.zztv();
    }

    public final zzd zztw() {
        return this.zzdqk.zztw();
    }

    public final zzd zztx() {
        return this.zzdqk.zztx();
    }

    public final zzaqa zzty() {
        return this.zzdqk.zzty();
    }

    public final String zztz() {
        return this.zzdqk.zztz();
    }

    public final zzapu zzua() {
        return this.zzdqk.zzua();
    }

    public final boolean zzub() {
        return this.zzdqk.zzub();
    }

    public final zzcv zzuc() {
        return this.zzdqk.zzuc();
    }

    public final boolean zzud() {
        return this.zzdqk.zzud();
    }

    public final void zzue() {
        this.zzdql.onDestroy();
        this.zzdqk.zzue();
    }

    public final boolean zzuf() {
        return this.zzdqk.zzuf();
    }

    public final boolean zzug() {
        return this.zzdqk.zzug();
    }

    public final boolean zzuh() {
        return this.zzdqk.zzuh();
    }

    public final void zzui() {
        this.zzdqk.zzui();
    }

    public final void zzuj() {
        this.zzdqk.zzuj();
    }

    public final zzpt zzuk() {
        return this.zzdqk.zzuk();
    }

    public final void zzul() {
        setBackgroundColor(0);
        this.zzdqk.setBackgroundColor(0);
    }

    public final void zzum() {
        TextView textView = new TextView(getContext());
        Resources resources = zzbt.zzep().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }
}
