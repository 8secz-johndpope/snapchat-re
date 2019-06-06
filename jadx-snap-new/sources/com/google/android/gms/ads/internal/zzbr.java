package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzbr extends AsyncTask<Void, Void, String> {
    private /* synthetic */ zzbn zzasj;

    private zzbr(zzbn zzbn) {
        this.zzasj = zzbn;
    }

    /* synthetic */ zzbr(zzbn zzbn, zzbo zzbo) {
        this(zzbn);
    }

    private final String zza(Void... voidArr) {
        try {
            this.zzasj.zzash = (zzcv) this.zzasj.zzase.get(((Long) zzlc.zzio().zzd(zzoi.zzbtr)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            zzaky.zzc("Failed to load ad data", e);
        } catch (TimeoutException unused) {
            zzaky.zzcz("Timed out waiting for ad data");
        }
        return this.zzasj.zzeb();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return zza((Void[]) objArr);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.zzasj.zzasg != null && str != null) {
            this.zzasj.zzasg.loadUrl(str);
        }
    }
}
