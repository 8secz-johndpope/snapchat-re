package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaq;
import com.google.android.gms.common.internal.zzbq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zzfvb = new zzs();
    @KeepName
    private zzb mResultGuardian;
    private Status mStatus;
    private boolean zzam;
    private final CountDownLatch zzapc;
    private R zzftm;
    private final Object zzfvc;
    private zza<R> zzfvd;
    private WeakReference<GoogleApiClient> zzfve;
    private final ArrayList<com.google.android.gms.common.api.PendingResult.zza> zzfvf;
    private ResultCallback<? super R> zzfvg;
    private final AtomicReference<zzdn> zzfvh;
    private volatile boolean zzfvi;
    private boolean zzfvj;
    private zzaq zzfvk;
    private volatile zzdh<R> zzfvl;
    private boolean zzfvm;

    public static class zza<R extends Result> extends Handler {
        public zza() {
            this(Looper.getMainLooper());
        }

        public zza(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.zzd(result);
                    throw e;
                }
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Don't know how to handle message: ");
                stringBuilder.append(i2);
                Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).zzv(Status.zzftt);
            }
        }

        public final void zza(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }
    }

    final class zzb {
        private zzb() {
        }

        /* synthetic */ zzb(BasePendingResult basePendingResult, zzs zzs) {
            this();
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            BasePendingResult.zzd(BasePendingResult.this.zzftm);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zzfvc = new Object();
        this.zzapc = new CountDownLatch(1);
        this.zzfvf = new ArrayList();
        this.zzfvh = new AtomicReference();
        this.zzfvm = false;
        this.zzfvd = new zza(Looper.getMainLooper());
        this.zzfve = new WeakReference(null);
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.zzfvc = new Object();
        this.zzapc = new CountDownLatch(1);
        this.zzfvf = new ArrayList();
        this.zzfvh = new AtomicReference();
        this.zzfvm = false;
        this.zzfvd = new zza(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zzfve = new WeakReference(googleApiClient);
    }

    private final R get() {
        Result result;
        synchronized (this.zzfvc) {
            zzbq.zza(!this.zzfvi, "Result has already been consumed.");
            zzbq.zza(isReady(), "Result is not ready.");
            result = this.zzftm;
            this.zzftm = null;
            this.zzfvg = null;
            this.zzfvi = true;
        }
        zzdn zzdn = (zzdn) this.zzfvh.getAndSet(null);
        if (zzdn != null) {
            zzdn.zzc(this);
        }
        return result;
    }

    private final void zzc(R r) {
        this.zzftm = r;
        this.zzfvk = null;
        this.zzapc.countDown();
        this.mStatus = this.zzftm.getStatus();
        if (this.zzam) {
            this.zzfvg = null;
        } else if (this.zzfvg != null) {
            this.zzfvd.removeMessages(2);
            this.zzfvd.zza(this.zzfvg, get());
        } else if (this.zzftm instanceof Releasable) {
            this.mResultGuardian = new zzb(this, null);
        }
        ArrayList arrayList = this.zzfvf;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.google.android.gms.common.api.PendingResult.zza) obj).zzr(this.mStatus);
        }
        this.zzfvf.clear();
    }

    public static void zzd(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }

    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            zzbq.zzgw("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        zzbq.zza(this.zzfvi ^ 1, "Result has already been consumed.");
        if (this.zzfvl != null) {
            z = false;
        }
        zzbq.zza(z, "Cannot await if then() has been called.");
        try {
            if (!this.zzapc.await(j, timeUnit)) {
                zzv(Status.zzftt);
            }
        } catch (InterruptedException unused) {
            zzv(Status.zzftr);
        }
        zzbq.zza(isReady(), "Result is not ready.");
        return get();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Missing block: B:17:0x0029, code skipped:
            return;
     */
    public void cancel() {
        /*
        r2 = this;
        r0 = r2.zzfvc;
        monitor-enter(r0);
        r1 = r2.zzam;	 Catch:{ all -> 0x002a }
        if (r1 != 0) goto L_0x0028;
    L_0x0007:
        r1 = r2.zzfvi;	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x0028;
    L_0x000c:
        r1 = r2.zzfvk;	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        r1 = r2.zzfvk;	 Catch:{ RemoteException -> 0x0015 }
        r1.cancel();	 Catch:{ RemoteException -> 0x0015 }
    L_0x0015:
        r1 = r2.zzftm;	 Catch:{ all -> 0x002a }
        zzd(r1);	 Catch:{ all -> 0x002a }
        r1 = 1;
        r2.zzam = r1;	 Catch:{ all -> 0x002a }
        r1 = com.google.android.gms.common.api.Status.zzftu;	 Catch:{ all -> 0x002a }
        r1 = r2.zzb(r1);	 Catch:{ all -> 0x002a }
        r2.zzc(r1);	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x0028:
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x002a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zzfvc) {
            z = this.zzam;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zzapc.getCount() == 0;
    }

    public final void setResult(R r) {
        synchronized (this.zzfvc) {
            if (this.zzfvj || this.zzam) {
                zzd(r);
                return;
            }
            isReady();
            boolean z = true;
            zzbq.zza(!isReady(), "Results have already been set");
            if (this.zzfvi) {
                z = false;
            }
            zzbq.zza(z, "Result has already been consumed");
            zzc(r);
        }
    }

    /* JADX WARNING: Missing block: B:25:0x003e, code skipped:
            return;
     */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
        r5 = this;
        r0 = r5.zzfvc;
        monitor-enter(r0);
        if (r6 != 0) goto L_0x000a;
    L_0x0005:
        r6 = 0;
        r5.zzfvg = r6;	 Catch:{ all -> 0x003f }
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x000a:
        r1 = r5.zzfvi;	 Catch:{ all -> 0x003f }
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0012;
    L_0x0010:
        r1 = 1;
        goto L_0x0013;
    L_0x0012:
        r1 = 0;
    L_0x0013:
        r4 = "Result has already been consumed.";
        com.google.android.gms.common.internal.zzbq.zza(r1, r4);	 Catch:{ all -> 0x003f }
        r1 = r5.zzfvl;	 Catch:{ all -> 0x003f }
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001e;
    L_0x001d:
        r2 = 0;
    L_0x001e:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.zzbq.zza(r2, r1);	 Catch:{ all -> 0x003f }
        r1 = r5.isCanceled();	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x002b:
        r1 = r5.isReady();	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x003b;
    L_0x0031:
        r1 = r5.zzfvd;	 Catch:{ all -> 0x003f }
        r2 = r5.get();	 Catch:{ all -> 0x003f }
        r1.zza(r6, r2);	 Catch:{ all -> 0x003f }
        goto L_0x003d;
    L_0x003b:
        r5.zzfvg = r6;	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;
    L_0x003f:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    public final void zza(com.google.android.gms.common.api.PendingResult.zza zza) {
        zzbq.checkArgument(zza != null, "Callback cannot be null.");
        synchronized (this.zzfvc) {
            if (isReady()) {
                zza.zzr(this.mStatus);
            } else {
                this.zzfvf.add(zza);
            }
        }
    }

    public final void zza(zzdn zzdn) {
        this.zzfvh.set(zzdn);
    }

    public final Integer zzaid() {
        return null;
    }

    public final boolean zzaip() {
        boolean isCanceled;
        synchronized (this.zzfvc) {
            if (((GoogleApiClient) this.zzfve.get()) == null || !this.zzfvm) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zzaiq() {
        boolean z = this.zzfvm || ((Boolean) zzfvb.get()).booleanValue();
        this.zzfvm = z;
    }

    public abstract R zzb(Status status);

    public final void zzv(Status status) {
        synchronized (this.zzfvc) {
            if (!isReady()) {
                setResult(zzb(status));
                this.zzfvj = true;
            }
        }
    }
}
