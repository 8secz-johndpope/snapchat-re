package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.brightcove.player.model.Video.Fields;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzaid;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzcw;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzli;
import com.google.android.gms.internal.zzlu;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zzms;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzyx;
import com.google.android.gms.internal.zzzd;
import java.util.Map;
import java.util.concurrent.Future;

@zzabh
public final class zzbn extends zzlu {
    private final Context mContext;
    private zzli zzapd;
    private final zzala zzapq;
    private final zzko zzasd;
    private final Future<zzcv> zzase = zzaid.zza(zzaid.zzdfi, new zzbq(this));
    private final zzbs zzasf;
    private WebView zzasg = new WebView(this.mContext);
    private zzcv zzash;
    private AsyncTask<Void, Void, String> zzasi;

    public zzbn(Context context, zzko zzko, String str, zzala zzala) {
        this.mContext = context;
        this.zzapq = zzala;
        this.zzasd = zzko;
        this.zzasf = new zzbs(str);
        zzk(0);
        this.zzasg.setVerticalScrollBarEnabled(false);
        this.zzasg.getSettings().setJavaScriptEnabled(true);
        this.zzasg.setWebViewClient(new zzbo(this));
        this.zzasg.setOnTouchListener(new zzbp(this));
    }

    private final String zzw(String str) {
        if (this.zzash == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzash.zza(parse, this.mContext, null, null);
        } catch (zzcw e) {
            zzaky.zzc("Unable to process ad data", e);
        }
        return parse.toString();
    }

    private final void zzx(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.mContext.startActivity(intent);
    }

    public final void destroy() {
        zzbq.zzgn("destroy must be called on the main UI thread.");
        this.zzasi.cancel(true);
        this.zzase.cancel(true);
        this.zzasg.destroy();
        this.zzasg = null;
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final zzmm getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isReady() {
        return false;
    }

    public final void pause() {
        zzbq.zzgn("pause must be called on the main UI thread.");
    }

    public final void resume() {
        zzbq.zzgn("resume must be called on the main UI thread.");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void setManualImpressionsEnabled(boolean z) {
    }

    public final void setUserId(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final void stopLoading() {
    }

    public final void zza(zzafc zzafc) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzko zzko) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzlf zzlf) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzli zzli) {
        this.zzapd = zzli;
    }

    public final void zza(zzly zzly) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzme zzme) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzms zzms) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzns zzns) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzpb zzpb) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzyx zzyx) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzzd zzzd, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzb(zzkk zzkk) {
        zzbq.checkNotNull(this.zzasg, "This Search Ad has already been torn down");
        this.zzasf.zza(zzkk, this.zzapq);
        this.zzasi = new zzbr(this, null).execute(new Void[0]);
        return true;
    }

    public final IObjectWrapper zzbp() {
        zzbq.zzgn("getAdFrame must be called on the main UI thread.");
        return zzn.zzz(this.zzasg);
    }

    public final zzko zzbq() {
        return this.zzasd;
    }

    public final void zzbs() {
        throw new IllegalStateException("Unused method");
    }

    public final zzly zzcc() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzli zzcd() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String zzco() {
        return null;
    }

    /* Access modifiers changed, original: final */
    public final String zzeb() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) zzlc.zzio().zzd(zzoi.zzbtp));
        builder.appendQueryParameter("query", this.zzasf.getQuery());
        builder.appendQueryParameter(Fields.PUBLISHER_ID, this.zzasf.zzee());
        Map zzef = this.zzasf.zzef();
        for (String str : zzef.keySet()) {
            builder.appendQueryParameter(str, (String) zzef.get(str));
        }
        Uri build = builder.build();
        zzcv zzcv = this.zzash;
        if (zzcv != null) {
            try {
                build = zzcv.zza(build, this.mContext);
            } catch (zzcw e) {
                zzaky.zzc("Unable to process ad data", e);
            }
        }
        String zzec = zzec();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzec).length() + 1) + String.valueOf(encodedQuery).length());
        stringBuilder.append(zzec);
        stringBuilder.append("#");
        stringBuilder.append(encodedQuery);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final String zzec() {
        Object zzed = this.zzasf.zzed();
        if (TextUtils.isEmpty(zzed)) {
            zzed = "www.google.com";
        }
        String str = (String) zzlc.zzio().zzd(zzoi.zzbtp);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzed).length() + 8) + String.valueOf(str).length());
        stringBuilder.append("https://");
        stringBuilder.append(zzed);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final void zzk(int i) {
        if (this.zzasg != null) {
            this.zzasg.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* Access modifiers changed, original: final */
    public final int zzv(String str) {
        str = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            zzlc.zzij();
            return zzako.zza(this.mContext, Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
