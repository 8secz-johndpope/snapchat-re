package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.zzf;
import com.google.android.gms.internal.zzcyj;
import com.google.android.gms.internal.zzcyk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class zzaa implements zzcc {
    private final Looper zzalj;
    private final zzbm zzfsq;
    private final Lock zzfwa;
    private final zzr zzfwf;
    private final Map<zzc<?>, zzz<?>> zzfwg = new HashMap();
    private final Map<zzc<?>, zzz<?>> zzfwh = new HashMap();
    private final Map<Api<?>, Boolean> zzfwi;
    private final zzba zzfwj;
    private final zzf zzfwk;
    private final Condition zzfwl;
    private final boolean zzfwm;
    private final boolean zzfwn;
    private final Queue<zzm<?, ?>> zzfwo = new LinkedList();
    private boolean zzfwp;
    private Map<zzh<?>, ConnectionResult> zzfwq;
    private Map<zzh<?>, ConnectionResult> zzfwr;
    private zzad zzfws;
    private ConnectionResult zzfwt;

    public zzaa(Context context, Lock lock, Looper looper, zzf zzf, Map<zzc<?>, zze> map, zzr zzr, Map<Api<?>, Boolean> map2, zza<? extends zzcyj, zzcyk> zza, ArrayList<zzt> arrayList, zzba zzba, boolean z) {
        this.zzfwa = lock;
        this.zzalj = looper;
        this.zzfwl = lock.newCondition();
        this.zzfwk = zzf;
        this.zzfwj = zzba;
        this.zzfwi = map2;
        this.zzfwf = zzr;
        this.zzfwm = z;
        HashMap hashMap = new HashMap();
        for (Api api : map2.keySet()) {
            hashMap.put(api.zzahm(), api);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zzt zzt = (zzt) obj;
            hashMap2.put(zzt.zzfop, zzt);
        }
        boolean z2 = true;
        Object obj2 = null;
        Object obj3 = 1;
        Object obj4 = null;
        for (Entry entry : map.entrySet()) {
            Object obj5;
            Object obj6;
            Object obj7;
            Api api2 = (Api) hashMap.get(entry.getKey());
            zze zze = (zze) entry.getValue();
            if (zze.zzahn()) {
                if (((Boolean) this.zzfwi.get(api2)).booleanValue()) {
                    obj5 = obj3;
                    obj6 = obj4;
                } else {
                    obj5 = obj3;
                    obj6 = 1;
                }
                obj7 = 1;
            } else {
                obj7 = obj2;
                obj6 = obj4;
                obj5 = null;
            }
            zzz zzz = r1;
            zzz zzz2 = new zzz(context, api2, looper, zze, (zzt) hashMap2.get(api2), zzr, zza);
            this.zzfwg.put((zzc) entry.getKey(), zzz);
            if (zze.zzacc()) {
                this.zzfwh.put((zzc) entry.getKey(), zzz);
            }
            obj4 = obj6;
            obj3 = obj5;
            obj2 = obj7;
        }
        if (!(obj2 != null && obj3 == null && obj4 == null)) {
            z2 = false;
        }
        this.zzfwn = z2;
        this.zzfsq = zzbm.zzajy();
    }

    private final boolean zza(zzz<?> zzz, ConnectionResult connectionResult) {
        return !connectionResult.isSuccess() && !connectionResult.hasResolution() && ((Boolean) this.zzfwi.get(zzz.zzaht())).booleanValue() && zzz.zzaix().zzahn() && this.zzfwk.isUserResolvableError(connectionResult.getErrorCode());
    }

    private final void zzaiz() {
        zzba zzba;
        Set emptySet;
        zzr zzr = this.zzfwf;
        if (zzr == null) {
            zzba = this.zzfwj;
            emptySet = Collections.emptySet();
        } else {
            emptySet = new HashSet(zzr.zzamf());
            Map zzamh = this.zzfwf.zzamh();
            for (Api api : zzamh.keySet()) {
                ConnectionResult connectionResult = getConnectionResult(api);
                if (connectionResult != null && connectionResult.isSuccess()) {
                    emptySet.addAll(((zzt) zzamh.get(api)).zzenh);
                }
            }
            zzba = this.zzfwj;
        }
        zzba.zzfyk = emptySet;
    }

    private final void zzaja() {
        while (!this.zzfwo.isEmpty()) {
            zze((zzm) this.zzfwo.remove());
        }
        this.zzfwj.zzk(null);
    }

    private final ConnectionResult zzajb() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i = 0;
        int i2 = 0;
        for (zzz zzz : this.zzfwg.values()) {
            Api zzaht = zzz.zzaht();
            ConnectionResult connectionResult3 = (ConnectionResult) this.zzfwq.get(zzz.zzahv());
            if (!connectionResult3.isSuccess() && (!((Boolean) this.zzfwi.get(zzaht)).booleanValue() || connectionResult3.hasResolution() || this.zzfwk.isUserResolvableError(connectionResult3.getErrorCode()))) {
                int priority;
                if (connectionResult3.getErrorCode() == 4 && this.zzfwm) {
                    priority = zzaht.zzahk().getPriority();
                    if (connectionResult2 == null || i2 > priority) {
                        connectionResult2 = connectionResult3;
                        i2 = priority;
                    }
                } else {
                    priority = zzaht.zzahk().getPriority();
                    if (connectionResult == null || i > priority) {
                        connectionResult = connectionResult3;
                        i = priority;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    private final ConnectionResult zzb(zzc<?> zzc) {
        this.zzfwa.lock();
        try {
            zzz zzz = (zzz) this.zzfwg.get(zzc);
            if (this.zzfwq == null || zzz == null) {
                this.zzfwa.unlock();
                return null;
            }
            ConnectionResult connectionResult = (ConnectionResult) this.zzfwq.get(zzz.zzahv());
            return connectionResult;
        } finally {
            this.zzfwa.unlock();
        }
    }

    private final <T extends zzm<? extends Result, ? extends zzb>> boolean zzg(T t) {
        zzc zzahm = t.zzahm();
        ConnectionResult zzb = zzb(zzahm);
        if (zzb == null || zzb.getErrorCode() != 4) {
            return false;
        }
        t.zzu(new Status(4, null, this.zzfsq.zza(((zzz) this.zzfwg.get(zzahm)).zzahv(), System.identityHashCode(this.zzfwj))));
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0043 in {5, 9, 12} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void connect() {
        /*
        r4 = this;
        r0 = r4.zzfwa;
        r0.lock();
        r0 = r4.zzfwp;	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x000f;
        r0 = r4.zzfwa;
        r0.unlock();
        return;
        r0 = 1;
        r4.zzfwp = r0;	 Catch:{ all -> 0x003c }
        r0 = 0;	 Catch:{ all -> 0x003c }
        r4.zzfwq = r0;	 Catch:{ all -> 0x003c }
        r4.zzfwr = r0;	 Catch:{ all -> 0x003c }
        r4.zzfws = r0;	 Catch:{ all -> 0x003c }
        r4.zzfwt = r0;	 Catch:{ all -> 0x003c }
        r1 = r4.zzfsq;	 Catch:{ all -> 0x003c }
        r1.zzaih();	 Catch:{ all -> 0x003c }
        r1 = r4.zzfsq;	 Catch:{ all -> 0x003c }
        r2 = r4.zzfwg;	 Catch:{ all -> 0x003c }
        r2 = r2.values();	 Catch:{ all -> 0x003c }
        r1 = r1.zza(r2);	 Catch:{ all -> 0x003c }
        r2 = new com.google.android.gms.internal.zzbic;	 Catch:{ all -> 0x003c }
        r3 = r4.zzalj;	 Catch:{ all -> 0x003c }
        r2.<init>(r3);	 Catch:{ all -> 0x003c }
        r3 = new com.google.android.gms.common.api.internal.zzac;	 Catch:{ all -> 0x003c }
        r3.<init>(r4);	 Catch:{ all -> 0x003c }
        r1.addOnCompleteListener(r2, r3);	 Catch:{ all -> 0x003c }
        goto L_0x0009;
        r0 = move-exception;
        r1 = r4.zzfwa;
        r1.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzaa.connect():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0043 in {4, 8, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void disconnect() {
        /*
        r2 = this;
        r0 = r2.zzfwa;
        r0.lock();
        r0 = 0;
        r2.zzfwp = r0;	 Catch:{ all -> 0x003c }
        r0 = 0;	 Catch:{ all -> 0x003c }
        r2.zzfwq = r0;	 Catch:{ all -> 0x003c }
        r2.zzfwr = r0;	 Catch:{ all -> 0x003c }
        r1 = r2.zzfws;	 Catch:{ all -> 0x003c }
        if (r1 == 0) goto L_0x0018;	 Catch:{ all -> 0x003c }
        r1 = r2.zzfws;	 Catch:{ all -> 0x003c }
        r1.cancel();	 Catch:{ all -> 0x003c }
        r2.zzfws = r0;	 Catch:{ all -> 0x003c }
        r2.zzfwt = r0;	 Catch:{ all -> 0x003c }
        r1 = r2.zzfwo;	 Catch:{ all -> 0x003c }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x003c }
        if (r1 != 0) goto L_0x0031;	 Catch:{ all -> 0x003c }
        r1 = r2.zzfwo;	 Catch:{ all -> 0x003c }
        r1 = r1.remove();	 Catch:{ all -> 0x003c }
        r1 = (com.google.android.gms.common.api.internal.zzm) r1;	 Catch:{ all -> 0x003c }
        r1.zza(r0);	 Catch:{ all -> 0x003c }
        r1.cancel();	 Catch:{ all -> 0x003c }
        goto L_0x001a;	 Catch:{ all -> 0x003c }
        r0 = r2.zzfwl;	 Catch:{ all -> 0x003c }
        r0.signalAll();	 Catch:{ all -> 0x003c }
        r0 = r2.zzfwa;
        r0.unlock();
        return;
        r0 = move-exception;
        r1 = r2.zzfwa;
        r1.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzaa.disconnect():void");
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final ConnectionResult getConnectionResult(Api<?> api) {
        return zzb(api.zzahm());
    }

    public final boolean isConnected() {
        this.zzfwa.lock();
        try {
            boolean z = this.zzfwq != null && this.zzfwt == null;
            this.zzfwa.unlock();
            return z;
        } catch (Throwable th) {
            this.zzfwa.unlock();
        }
    }

    public final void zzais() {
    }

    public final <A extends zzb, R extends Result, T extends zzm<R, A>> T zzd(T t) {
        if (this.zzfwm && zzg((zzm) t)) {
            return t;
        }
        if (isConnected()) {
            this.zzfwj.zzfyp.zzb(t);
            return ((zzz) this.zzfwg.get(t.zzahm())).zza(t);
        }
        this.zzfwo.add(t);
        return t;
    }

    public final <A extends zzb, T extends zzm<? extends Result, A>> T zze(T t) {
        zzc zzahm = t.zzahm();
        if (this.zzfwm && zzg((zzm) t)) {
            return t;
        }
        this.zzfwj.zzfyp.zzb(t);
        return ((zzz) this.zzfwg.get(zzahm)).zzb((zzm) t);
    }
}
