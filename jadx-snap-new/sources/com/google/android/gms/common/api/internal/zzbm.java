package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzcyj;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import defpackage.iw;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jcodec.containers.mp4.boxes.Box;

public final class zzbm implements Callback {
    private static final Object sLock = new Object();
    public static final Status zzfzg = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zzfzh = new Status(4, "The user must be signed in to make this API call.");
    private static zzbm zzfzj;
    private final Context mContext;
    private final Handler mHandler;
    private final GoogleApiAvailability zzftg;
    private final Map<zzh<?>, zzbo<?>> zzfwg = new ConcurrentHashMap(5, 0.75f, 1);
    private long zzfyf = 120000;
    private long zzfyg = 5000;
    private long zzfzi = TelemetryConstants.FLUSH_DELAY_MS;
    private int zzfzk = -1;
    private final AtomicInteger zzfzl = new AtomicInteger(1);
    private final AtomicInteger zzfzm = new AtomicInteger(0);
    private zzah zzfzn = null;
    private final Set<zzh<?>> zzfzo = new iw();
    private final Set<zzh<?>> zzfzp = new iw();

    private zzbm(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.mContext = context;
        this.mHandler = new Handler(looper, this);
        this.zzftg = googleApiAvailability;
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static zzbm zzajy() {
        zzbm zzbm;
        synchronized (sLock) {
            zzbq.checkNotNull(zzfzj, "Must guarantee manager is non-null before using getInstance");
            zzbm = zzfzj;
        }
        return zzbm;
    }

    private final void zzakb() {
        for (zzh remove : this.zzfzp) {
            ((zzbo) this.zzfwg.remove(remove)).signOut();
        }
        this.zzfzp.clear();
    }

    private final void zzb(GoogleApi<?> googleApi) {
        zzh zzahv = googleApi.zzahv();
        zzbo zzbo = (zzbo) this.zzfwg.get(zzahv);
        if (zzbo == null) {
            zzbo = new zzbo(this, googleApi);
            this.zzfwg.put(zzahv, zzbo);
        }
        if (zzbo.zzacc()) {
            this.zzfzp.add(zzahv);
        }
        zzbo.connect();
    }

    public static zzbm zzck(Context context) {
        zzbm zzbm;
        synchronized (sLock) {
            if (zzfzj == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zzfzj = new zzbm(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            zzbm = zzfzj;
        }
        return zzbm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    public final boolean handleMessage(android.os.Message r8) {
        /*
        r7 = this;
        r0 = r8.what;
        r1 = 1;
        r2 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        r4 = "GoogleApiManager";
        r5 = 0;
        switch(r0) {
            case 1: goto L_0x01f6;
            case 2: goto L_0x01a3;
            case 3: goto L_0x0186;
            case 4: goto L_0x013c;
            case 5: goto L_0x00ae;
            case 6: goto L_0x007f;
            case 7: goto L_0x0076;
            case 8: goto L_0x013c;
            case 9: goto L_0x005d;
            case 10: goto L_0x0058;
            case 11: goto L_0x003f;
            case 12: goto L_0x0026;
            case 13: goto L_0x013c;
            default: goto L_0x000c;
        };
    L_0x000c:
        r8 = r8.what;
        r0 = 31;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Unknown message id: ";
        r1.append(r0);
        r1.append(r8);
        r8 = r1.toString();
        android.util.Log.w(r4, r8);
        r8 = 0;
        return r8;
    L_0x0026:
        r0 = r7.zzfwg;
        r2 = r8.obj;
        r0 = r0.containsKey(r2);
        if (r0 == 0) goto L_0x022d;
    L_0x0030:
        r0 = r7.zzfwg;
        r8 = r8.obj;
        r8 = r0.get(r8);
        r8 = (com.google.android.gms.common.api.internal.zzbo) r8;
        r8.zzakm();
        goto L_0x022d;
    L_0x003f:
        r0 = r7.zzfwg;
        r2 = r8.obj;
        r0 = r0.containsKey(r2);
        if (r0 == 0) goto L_0x022d;
    L_0x0049:
        r0 = r7.zzfwg;
        r8 = r8.obj;
        r8 = r0.get(r8);
        r8 = (com.google.android.gms.common.api.internal.zzbo) r8;
        r8.zzajr();
        goto L_0x022d;
    L_0x0058:
        r7.zzakb();
        goto L_0x022d;
    L_0x005d:
        r0 = r7.zzfwg;
        r2 = r8.obj;
        r0 = r0.containsKey(r2);
        if (r0 == 0) goto L_0x022d;
    L_0x0067:
        r0 = r7.zzfwg;
        r8 = r8.obj;
        r8 = r0.get(r8);
        r8 = (com.google.android.gms.common.api.internal.zzbo) r8;
        r8.resume();
        goto L_0x022d;
    L_0x0076:
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.api.GoogleApi) r8;
        r7.zzb(r8);
        goto L_0x022d;
    L_0x007f:
        r8 = r7.mContext;
        r8 = r8.getApplicationContext();
        r8 = r8 instanceof android.app.Application;
        if (r8 == 0) goto L_0x022d;
    L_0x0089:
        r8 = r7.mContext;
        r8 = r8.getApplicationContext();
        r8 = (android.app.Application) r8;
        com.google.android.gms.common.api.internal.zzk.zza(r8);
        r8 = com.google.android.gms.common.api.internal.zzk.zzaij();
        r0 = new com.google.android.gms.common.api.internal.zzbn;
        r0.<init>(r7);
        r8.zza(r0);
        r8 = com.google.android.gms.common.api.internal.zzk.zzaij();
        r8 = r8.zzbi(r1);
        if (r8 != 0) goto L_0x022d;
    L_0x00aa:
        r7.zzfzi = r2;
        goto L_0x022d;
    L_0x00ae:
        r0 = r8.arg1;
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.ConnectionResult) r8;
        r2 = r7.zzfwg;
        r2 = r2.values();
        r2 = r2.iterator();
    L_0x00be:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00d1;
    L_0x00c4:
        r3 = r2.next();
        r3 = (com.google.android.gms.common.api.internal.zzbo) r3;
        r6 = r3.getInstanceId();
        if (r6 != r0) goto L_0x00be;
    L_0x00d0:
        goto L_0x00d2;
    L_0x00d1:
        r3 = r5;
    L_0x00d2:
        if (r3 == 0) goto L_0x011a;
    L_0x00d4:
        r0 = new com.google.android.gms.common.api.Status;
        r2 = 17;
        r4 = r7.zzftg;
        r5 = r8.getErrorCode();
        r4 = r4.getErrorString(r5);
        r8 = r8.getErrorMessage();
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r5 = r5 + 69;
        r6 = java.lang.String.valueOf(r8);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Error resolution was canceled by the user, original error message: ";
        r6.append(r5);
        r6.append(r4);
        r4 = ": ";
        r6.append(r4);
        r6.append(r8);
        r8 = r6.toString();
        r0.<init>(r2, r8);
        r3.zzw(r0);
        goto L_0x022d;
    L_0x011a:
        r8 = 76;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r8);
        r8 = "Could not find API instance ";
        r2.append(r8);
        r2.append(r0);
        r8 = " while trying to fail enqueued calls.";
        r2.append(r8);
        r8 = r2.toString();
        r0 = new java.lang.Exception;
        r0.<init>();
        android.util.Log.wtf(r4, r8, r0);
        goto L_0x022d;
    L_0x013c:
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.api.internal.zzcp) r8;
        r0 = r7.zzfwg;
        r2 = r8.zzgba;
        r2 = r2.zzahv();
        r0 = r0.get(r2);
        r0 = (com.google.android.gms.common.api.internal.zzbo) r0;
        if (r0 != 0) goto L_0x0163;
    L_0x0150:
        r0 = r8.zzgba;
        r7.zzb(r0);
        r0 = r7.zzfwg;
        r2 = r8.zzgba;
        r2 = r2.zzahv();
        r0 = r0.get(r2);
        r0 = (com.google.android.gms.common.api.internal.zzbo) r0;
    L_0x0163:
        r2 = r0.zzacc();
        if (r2 == 0) goto L_0x017f;
    L_0x0169:
        r2 = r7.zzfzm;
        r2 = r2.get();
        r3 = r8.zzgaz;
        if (r2 == r3) goto L_0x017f;
    L_0x0173:
        r8 = r8.zzgay;
        r2 = zzfzg;
        r8.zzs(r2);
        r0.signOut();
        goto L_0x022d;
    L_0x017f:
        r8 = r8.zzgay;
        r0.zza(r8);
        goto L_0x022d;
    L_0x0186:
        r8 = r7.zzfwg;
        r8 = r8.values();
        r8 = r8.iterator();
    L_0x0190:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x022d;
    L_0x0196:
        r0 = r8.next();
        r0 = (com.google.android.gms.common.api.internal.zzbo) r0;
        r0.zzaki();
        r0.connect();
        goto L_0x0190;
    L_0x01a3:
        r8 = r8.obj;
        r8 = (com.google.android.gms.common.api.internal.zzj) r8;
        r0 = r8.zzaii();
        r0 = r0.iterator();
    L_0x01af:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x022d;
    L_0x01b5:
        r2 = r0.next();
        r2 = (com.google.android.gms.common.api.internal.zzh) r2;
        r3 = r7.zzfwg;
        r3 = r3.get(r2);
        r3 = (com.google.android.gms.common.api.internal.zzbo) r3;
        if (r3 != 0) goto L_0x01d0;
    L_0x01c5:
        r0 = new com.google.android.gms.common.ConnectionResult;
        r3 = 13;
        r0.<init>(r3);
        r8.zza(r2, r0, r5);
        goto L_0x022d;
    L_0x01d0:
        r4 = r3.isConnected();
        if (r4 == 0) goto L_0x01e4;
    L_0x01d6:
        r4 = com.google.android.gms.common.ConnectionResult.zzfqt;
        r3 = r3.zzaix();
        r3 = r3.zzahp();
        r8.zza(r2, r4, r3);
        goto L_0x01af;
    L_0x01e4:
        r4 = r3.zzakj();
        if (r4 == 0) goto L_0x01f2;
    L_0x01ea:
        r3 = r3.zzakj();
        r8.zza(r2, r3, r5);
        goto L_0x01af;
    L_0x01f2:
        r3.zza(r8);
        goto L_0x01af;
    L_0x01f6:
        r8 = r8.obj;
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x0202;
    L_0x0200:
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x0202:
        r7.zzfzi = r2;
        r8 = r7.mHandler;
        r0 = 12;
        r8.removeMessages(r0);
        r8 = r7.zzfwg;
        r8 = r8.keySet();
        r8 = r8.iterator();
    L_0x0215:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x022d;
    L_0x021b:
        r2 = r8.next();
        r2 = (com.google.android.gms.common.api.internal.zzh) r2;
        r3 = r7.mHandler;
        r2 = r3.obtainMessage(r0, r2);
        r4 = r7.zzfzi;
        r3.sendMessageDelayed(r2, r4);
        goto L_0x0215;
    L_0x022d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzbm.handleMessage(android.os.Message):boolean");
    }

    /* Access modifiers changed, original: final */
    public final PendingIntent zza(zzh<?> zzh, int i) {
        zzbo zzbo = (zzbo) this.zzfwg.get(zzh);
        if (zzbo == null) {
            return null;
        }
        zzcyj zzakn = zzbo.zzakn();
        return zzakn == null ? null : PendingIntent.getActivity(this.mContext, i, zzakn.getSignInIntent(), Box.MAX_BOX_SIZE);
    }

    public final Task<Map<zzh<?>, String>> zza(Iterable<? extends GoogleApi<?>> iterable) {
        zzj zzj = new zzj(iterable);
        for (GoogleApi googleApi : iterable) {
            zzbo zzbo = (zzbo) this.zzfwg.get(googleApi.zzahv());
            if (zzbo == null || !zzbo.isConnected()) {
                Handler handler = this.mHandler;
                handler.sendMessage(handler.obtainMessage(2, zzj));
                return zzj.getTask();
            }
            zzj.zza(googleApi.zzahv(), ConnectionResult.zzfqt, zzbo.zzaix().zzahp());
        }
        return zzj.getTask();
    }

    public final void zza(ConnectionResult connectionResult, int i) {
        if (!zzc(connectionResult, i)) {
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void zza(GoogleApi<?> googleApi) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final <O extends ApiOptions, TResult> void zza(GoogleApi<O> googleApi, int i, zzde<zzb, TResult> zzde, TaskCompletionSource<TResult> taskCompletionSource, zzda zzda) {
        zze zze = new zze(i, zzde, taskCompletionSource, zzda);
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new zzcp(zze, this.zzfzm.get(), googleApi)));
    }

    public final <O extends ApiOptions> void zza(GoogleApi<O> googleApi, int i, zzm<? extends Result, zzb> zzm) {
        zzc zzc = new zzc(i, zzm);
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new zzcp(zzc, this.zzfzm.get(), googleApi)));
    }

    public final void zza(zzah zzah) {
        synchronized (sLock) {
            if (this.zzfzn != zzah) {
                this.zzfzn = zzah;
                this.zzfzo.clear();
                this.zzfzo.addAll(zzah.zzajf());
            }
        }
    }

    public final void zzaih() {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final int zzaka() {
        return this.zzfzl.getAndIncrement();
    }

    /* Access modifiers changed, original: final */
    public final void zzb(zzah zzah) {
        synchronized (sLock) {
            if (this.zzfzn == zzah) {
                this.zzfzn = null;
                this.zzfzo.clear();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zzc(ConnectionResult connectionResult, int i) {
        return this.zzftg.zza(this.mContext, connectionResult, i);
    }
}
