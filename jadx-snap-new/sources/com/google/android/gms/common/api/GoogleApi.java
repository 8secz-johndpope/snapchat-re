package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.internal.zzah;
import com.google.android.gms.common.api.internal.zzbm;
import com.google.android.gms.common.api.internal.zzbo;
import com.google.android.gms.common.api.internal.zzbw;
import com.google.android.gms.common.api.internal.zzcv;
import com.google.android.gms.common.api.internal.zzda;
import com.google.android.gms.common.api.internal.zzde;
import com.google.android.gms.common.api.internal.zzg;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.api.internal.zzm;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class GoogleApi<O extends ApiOptions> {
    private final Context mContext;
    private final int mId;
    private final Looper zzalj;
    private final Api<O> zzfop;
    private final O zzfsm;
    private final zzh<O> zzfsn;
    private final GoogleApiClient zzfso;
    private final zzda zzfsp;
    protected final zzbm zzfsq;

    public static class zza {
        public static final zza zzfsr = new zzd().zzahy();
        public final zzda zzfss;
        public final Looper zzfst;

        private zza(zzda zzda, Account account, Looper looper) {
            this.zzfss = zzda;
            this.zzfst = looper;
        }

        /* synthetic */ zza(zzda zzda, Account account, Looper looper, zzc zzc) {
            this(zzda, null, looper);
        }
    }

    public GoogleApi(Activity activity, Api<O> api, O o, zza zza) {
        zzbq.checkNotNull(activity, "Null activity is not permitted.");
        zzbq.checkNotNull(api, "Api must not be null.");
        zzbq.checkNotNull(zza, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = activity.getApplicationContext();
        this.zzfop = api;
        this.zzfsm = o;
        this.zzalj = zza.zzfst;
        this.zzfsn = zzh.zza(this.zzfop, this.zzfsm);
        this.zzfso = new zzbw(this);
        this.zzfsq = zzbm.zzck(this.mContext);
        this.mId = this.zzfsq.zzaka();
        this.zzfsp = zza.zzfss;
        zzah.zza(activity, this.zzfsq, this.zzfsn);
        this.zzfsq.zza(this);
    }

    @Deprecated
    public GoogleApi(Activity activity, Api<O> api, O o, zzda zzda) {
        this(activity, (Api) api, (ApiOptions) o, new zzd().zza(zzda).zza(activity.getMainLooper()).zzahy());
    }

    protected GoogleApi(Context context, Api<O> api, Looper looper) {
        zzbq.checkNotNull(context, "Null context is not permitted.");
        zzbq.checkNotNull(api, "Api must not be null.");
        zzbq.checkNotNull(looper, "Looper must not be null.");
        this.mContext = context.getApplicationContext();
        this.zzfop = api;
        this.zzfsm = null;
        this.zzalj = looper;
        this.zzfsn = zzh.zzb(api);
        this.zzfso = new zzbw(this);
        this.zzfsq = zzbm.zzck(this.mContext);
        this.mId = this.zzfsq.zzaka();
        this.zzfsp = new zzg();
    }

    public GoogleApi(Context context, Api<O> api, O o, zza zza) {
        zzbq.checkNotNull(context, "Null context is not permitted.");
        zzbq.checkNotNull(api, "Api must not be null.");
        zzbq.checkNotNull(zza, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = context.getApplicationContext();
        this.zzfop = api;
        this.zzfsm = o;
        this.zzalj = zza.zzfst;
        this.zzfsn = zzh.zza(this.zzfop, this.zzfsm);
        this.zzfso = new zzbw(this);
        this.zzfsq = zzbm.zzck(this.mContext);
        this.mId = this.zzfsq.zzaka();
        this.zzfsp = zza.zzfss;
        this.zzfsq.zza(this);
    }

    @Deprecated
    public GoogleApi(Context context, Api<O> api, O o, zzda zzda) {
        this(context, (Api) api, (ApiOptions) o, new zzd().zza(zzda).zzahy());
    }

    private final <A extends zzb, T extends zzm<? extends Result, A>> T zza(int i, T t) {
        t.zzaiq();
        this.zzfsq.zza(this, i, t);
        return t;
    }

    private final <TResult, A extends zzb> Task<TResult> zza(int i, zzde<A, TResult> zzde) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzfsq.zza(this, i, zzde, taskCompletionSource, this.zzfsp);
        return taskCompletionSource.getTask();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    private final com.google.android.gms.common.internal.zzs zzahx() {
        /*
        r3 = this;
        r0 = new com.google.android.gms.common.internal.zzs;
        r0.<init>();
        r1 = r3.zzfsm;
        r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
        if (r2 == 0) goto L_0x0018;
    L_0x000b:
        r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1;
        r1 = r1.getGoogleSignInAccount();
        if (r1 == 0) goto L_0x0018;
    L_0x0013:
        r1 = r1.getAccount();
        goto L_0x0026;
    L_0x0018:
        r1 = r3.zzfsm;
        r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions;
        if (r2 == 0) goto L_0x0025;
    L_0x001e:
        r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) r1;
        r1 = r1.getAccount();
        goto L_0x0026;
    L_0x0025:
        r1 = 0;
    L_0x0026:
        r0 = r0.zze(r1);
        r1 = r3.zzfsm;
        r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions;
        if (r2 == 0) goto L_0x003d;
    L_0x0030:
        r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1;
        r1 = r1.getGoogleSignInAccount();
        if (r1 == 0) goto L_0x003d;
    L_0x0038:
        r1 = r1.zzacf();
        goto L_0x0041;
    L_0x003d:
        r1 = java.util.Collections.emptySet();
    L_0x0041:
        r0 = r0.zze(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApi.zzahx():com.google.android.gms.common.internal.zzs");
    }

    public final int getInstanceId() {
        return this.mId;
    }

    public final Looper getLooper() {
        return this.zzalj;
    }

    public zze zza(Looper looper, zzbo<O> zzbo) {
        return this.zzfop.zzahl().zza(this.mContext, looper, zzahx().zzgo(this.mContext.getPackageName()).zzgp(this.mContext.getClass().getName()).zzamn(), this.zzfsm, zzbo, zzbo);
    }

    public zzcv zza(Context context, Handler handler) {
        return new zzcv(context, handler, zzahx().zzamn());
    }

    public final <A extends zzb, T extends zzm<? extends Result, A>> T zza(T t) {
        return zza(0, (zzm) t);
    }

    public final Api<O> zzaht() {
        return this.zzfop;
    }

    public final zzh<O> zzahv() {
        return this.zzfsn;
    }

    public final GoogleApiClient zzahw() {
        return this.zzfso;
    }

    public final <A extends zzb, T extends zzm<? extends Result, A>> T zzb(T t) {
        return zza(1, (zzm) t);
    }

    public final <TResult, A extends zzb> Task<TResult> zzb(zzde<A, TResult> zzde) {
        return zza(1, (zzde) zzde);
    }
}
