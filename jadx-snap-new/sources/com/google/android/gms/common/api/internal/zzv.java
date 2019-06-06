package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.zzf;
import com.google.android.gms.internal.zzcyj;
import com.google.android.gms.internal.zzcyk;
import defpackage.iv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import org.jcodec.containers.mp4.boxes.Box;

final class zzv implements zzcc {
    private final Context mContext;
    private final Looper zzalj;
    private final zzba zzfvq;
    private final zzbi zzfvr;
    private final zzbi zzfvs;
    private final Map<zzc<?>, zzbi> zzfvt;
    private final Set<zzcu> zzfvu = Collections.newSetFromMap(new WeakHashMap());
    private final zze zzfvv;
    private Bundle zzfvw;
    private ConnectionResult zzfvx = null;
    private ConnectionResult zzfvy = null;
    private boolean zzfvz = false;
    private final Lock zzfwa;
    private int zzfwb = 0;

    private zzv(Context context, zzba zzba, Lock lock, Looper looper, zzf zzf, Map<zzc<?>, zze> map, Map<zzc<?>, zze> map2, zzr zzr, zza<? extends zzcyj, zzcyk> zza, zze zze, ArrayList<zzt> arrayList, ArrayList<zzt> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.mContext = context;
        this.zzfvq = zzba;
        this.zzfwa = lock;
        this.zzalj = looper;
        this.zzfvv = zze;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        zzf zzf2 = zzf;
        zzbi zzbi = r3;
        zzbi zzbi2 = new zzbi(context2, this.zzfvq, lock2, looper2, zzf2, map2, null, map4, null, arrayList2, new zzx(this, null));
        this.zzfvr = zzbi;
        this.zzfvs = new zzbi(context2, this.zzfvq, lock2, looper2, zzf2, map, zzr, map3, zza, arrayList, new zzy(this, null));
        iv ivVar = new iv();
        for (zzc put : map2.keySet()) {
            ivVar.put(put, this.zzfvr);
        }
        for (zzc put2 : map.keySet()) {
            ivVar.put(put2, this.zzfvs);
        }
        this.zzfvt = Collections.unmodifiableMap(ivVar);
    }

    public static zzv zza(Context context, zzba zzba, Lock lock, Looper looper, zzf zzf, Map<zzc<?>, zze> map, zzr zzr, Map<Api<?>, Boolean> map2, zza<? extends zzcyj, zzcyk> zza, ArrayList<zzt> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        iv ivVar = new iv();
        iv ivVar2 = new iv();
        zze zze = null;
        for (Entry entry : map.entrySet()) {
            zze zze2 = (zze) entry.getValue();
            if (zze2.zzacn()) {
                zze = zze2;
            }
            if (zze2.zzacc()) {
                ivVar.put((zzc) entry.getKey(), zze2);
            } else {
                ivVar2.put((zzc) entry.getKey(), zze2);
            }
        }
        zzbq.zza(ivVar.isEmpty() ^ 1, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        iv ivVar3 = new iv();
        iv ivVar4 = new iv();
        for (Api api : map2.keySet()) {
            zzc zzahm = api.zzahm();
            if (ivVar.containsKey(zzahm)) {
                ivVar3.put(api, (Boolean) map3.get(api));
            } else if (ivVar2.containsKey(zzahm)) {
                ivVar4.put(api, (Boolean) map3.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            zzt zzt = (zzt) obj;
            if (ivVar3.containsKey(zzt.zzfop)) {
                arrayList2.add(zzt);
            } else if (ivVar4.containsKey(zzt.zzfop)) {
                arrayList3.add(zzt);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zzv(context, zzba, lock, looper, zzf, ivVar, ivVar2, zzr, zza, zze, arrayList2, arrayList3, ivVar3, ivVar4);
    }

    private final void zza(ConnectionResult connectionResult) {
        int i = this.zzfwb;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zzfwb = 0;
            }
            this.zzfvq.zzc(connectionResult);
        }
        zzaiu();
        this.zzfwb = 0;
    }

    private final void zzait() {
        ConnectionResult connectionResult;
        if (zzb(this.zzfvx)) {
            if (zzb(this.zzfvy) || zzaiv()) {
                int i = this.zzfwb;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.zzfwb = 0;
                        return;
                    }
                    this.zzfvq.zzk(this.zzfvw);
                }
                zzaiu();
                this.zzfwb = 0;
                return;
            }
            connectionResult = this.zzfvy;
            if (connectionResult != null) {
                if (this.zzfwb == 1) {
                    zzaiu();
                    return;
                }
                zza(connectionResult);
                this.zzfvr.disconnect();
            }
        } else if (this.zzfvx == null || !zzb(this.zzfvy)) {
            connectionResult = this.zzfvx;
            if (!(connectionResult == null || this.zzfvy == null)) {
                if (this.zzfvs.zzfzb < this.zzfvr.zzfzb) {
                    connectionResult = this.zzfvy;
                }
                zza(connectionResult);
            }
        } else {
            this.zzfvs.disconnect();
            zza(this.zzfvx);
        }
    }

    private final void zzaiu() {
        for (zzcu zzacm : this.zzfvu) {
            zzacm.zzacm();
        }
        this.zzfvu.clear();
    }

    private final boolean zzaiv() {
        ConnectionResult connectionResult = this.zzfvy;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final PendingIntent zzaiw() {
        return this.zzfvv == null ? null : PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zzfvq), this.zzfvv.getSignInIntent(), Box.MAX_BOX_SIZE);
    }

    private static boolean zzb(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    private final void zze(int i, boolean z) {
        this.zzfvq.zzf(i, z);
        this.zzfvy = null;
        this.zzfvx = null;
    }

    private final boolean zzf(zzm<? extends Result, ? extends zzb> zzm) {
        zzc zzahm = zzm.zzahm();
        zzbq.checkArgument(this.zzfvt.containsKey(zzahm), "GoogleApiClient is not configured to use the API required for this call.");
        return ((zzbi) this.zzfvt.get(zzahm)).equals(this.zzfvs);
    }

    private final void zzj(Bundle bundle) {
        Bundle bundle2 = this.zzfvw;
        if (bundle2 == null) {
            this.zzfvw = bundle;
            return;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public final void connect() {
        this.zzfwb = 2;
        this.zzfvz = false;
        this.zzfvy = null;
        this.zzfvx = null;
        this.zzfvr.connect();
        this.zzfvs.connect();
    }

    public final void disconnect() {
        this.zzfvy = null;
        this.zzfvx = null;
        this.zzfwb = 0;
        this.zzfvr.disconnect();
        this.zzfvs.disconnect();
        zzaiu();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = ":";
        printWriter.append(str).append("authClient").println(str2);
        String str3 = "  ";
        this.zzfvs.dump(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(str2);
        this.zzfvr.dump(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
    }

    public final boolean isConnected() {
        this.zzfwa.lock();
        try {
            boolean z = true;
            if (!(this.zzfvr.isConnected() && (this.zzfvs.isConnected() || zzaiv() || this.zzfwb == 1))) {
                z = false;
            }
            this.zzfwa.unlock();
            return z;
        } catch (Throwable th) {
            this.zzfwa.unlock();
        }
    }

    public final void zzais() {
        this.zzfvr.zzais();
        this.zzfvs.zzais();
    }

    public final <A extends zzb, R extends Result, T extends zzm<R, A>> T zzd(T t) {
        if (!zzf((zzm) t)) {
            return this.zzfvr.zzd(t);
        }
        if (!zzaiv()) {
            return this.zzfvs.zzd(t);
        }
        t.zzu(new Status(4, null, zzaiw()));
        return t;
    }

    public final <A extends zzb, T extends zzm<? extends Result, A>> T zze(T t) {
        if (!zzf((zzm) t)) {
            return this.zzfvr.zze(t);
        }
        if (!zzaiv()) {
            return this.zzfvs.zze(t);
        }
        t.zzu(new Status(4, null, zzaiw()));
        return t;
    }
}
