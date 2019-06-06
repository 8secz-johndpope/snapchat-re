package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzd<T extends IInterface> {
    private static String[] zzgfi = new String[]{"service_esmobile", "service_googleme"};
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private final Looper zzalj;
    private final zzf zzfwk;
    private int zzgen;
    private long zzgeo;
    private long zzgep;
    private int zzgeq;
    private long zzger;
    private zzam zzges;
    private final zzag zzget;
    private final Object zzgeu;
    private zzay zzgev;
    protected zzj zzgew;
    private T zzgex;
    private final ArrayList<zzi<?>> zzgey;
    private zzl zzgez;
    private int zzgfa;
    private final zzf zzgfb;
    private final zzg zzgfc;
    private final int zzgfd;
    private final String zzgfe;
    private ConnectionResult zzgff;
    private boolean zzgfg;
    protected AtomicInteger zzgfh;

    protected zzd(Context context, Looper looper, int i, zzf zzf, zzg zzg, String str) {
        this(context, looper, zzag.zzcp(context), zzf.zzahf(), i, (zzf) zzbq.checkNotNull(zzf), (zzg) zzbq.checkNotNull(zzg), null);
    }

    protected zzd(Context context, Looper looper, zzag zzag, zzf zzf, int i, zzf zzf2, zzg zzg, String str) {
        this.mLock = new Object();
        this.zzgeu = new Object();
        this.zzgey = new ArrayList();
        this.zzgfa = 1;
        this.zzgff = null;
        this.zzgfg = false;
        this.zzgfh = new AtomicInteger(0);
        this.mContext = (Context) zzbq.checkNotNull(context, "Context must not be null");
        this.zzalj = (Looper) zzbq.checkNotNull(looper, "Looper must not be null");
        this.zzget = (zzag) zzbq.checkNotNull(zzag, "Supervisor must not be null");
        this.zzfwk = (zzf) zzbq.checkNotNull(zzf, "API availability must not be null");
        this.mHandler = new zzh(this, looper);
        this.zzgfd = i;
        this.zzgfb = zzf2;
        this.zzgfc = zzg;
        this.zzgfe = str;
    }

    private final void zza(int i, T t) {
        zzbq.checkArgument((i == 4 ? 1 : null) == (t != null ? 1 : null));
        synchronized (this.mLock) {
            this.zzgfa = i;
            this.zzgex = t;
            zzb(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    String zzamx;
                    String packageName;
                    if (!(this.zzgez == null || this.zzges == null)) {
                        zzamx = this.zzges.zzamx();
                        packageName = this.zzges.getPackageName();
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(zzamx).length() + 70) + String.valueOf(packageName).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(zzamx);
                        stringBuilder.append(" on ");
                        stringBuilder.append(packageName);
                        Log.e("GmsClient", stringBuilder.toString());
                        this.zzget.zza(this.zzges.zzamx(), this.zzges.getPackageName(), this.zzges.zzamu(), this.zzgez, zzalr());
                        this.zzgfh.incrementAndGet();
                    }
                    this.zzgez = new zzl(this, this.zzgfh.get());
                    this.zzges = new zzam(zzalq(), zzhm(), false, 129);
                    if (!this.zzget.zza(new zzah(this.zzges.zzamx(), this.zzges.getPackageName(), this.zzges.zzamu()), this.zzgez, zzalr())) {
                        zzamx = this.zzges.zzamx();
                        packageName = this.zzges.getPackageName();
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(zzamx).length() + 34) + String.valueOf(packageName).length());
                        stringBuilder2.append("unable to connect to service: ");
                        stringBuilder2.append(zzamx);
                        stringBuilder2.append(" on ");
                        stringBuilder2.append(packageName);
                        Log.e("GmsClient", stringBuilder2.toString());
                        zza(16, null, this.zzgfh.get());
                    }
                } else if (i == 4) {
                    zza((IInterface) t);
                }
            } else if (this.zzgez != null) {
                this.zzget.zza(zzhm(), zzalq(), 129, this.zzgez, zzalr());
                this.zzgez = null;
            }
        }
    }

    private final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzgfa != i) {
                return false;
            }
            zza(i2, (IInterface) t);
            return true;
        }
    }

    private final String zzalr() {
        String str = this.zzgfe;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    private final boolean zzalt() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzgfa == 3;
        }
        return z;
    }

    private final boolean zzalz() {
        if (this.zzgfg || TextUtils.isEmpty(zzhn()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(zzhn());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private final void zzce(int i) {
        if (zzalt()) {
            i = 5;
            this.zzgfg = true;
        } else {
            i = 4;
        }
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i, this.zzgfh.get(), 16));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0037 in {5, 15, 19, 23} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public void disconnect() {
        /*
        r4 = this;
        r0 = r4.zzgfh;
        r0.incrementAndGet();
        r0 = r4.zzgey;
        monitor-enter(r0);
        r1 = r4.zzgey;	 Catch:{ all -> 0x0034 }
        r1 = r1.size();	 Catch:{ all -> 0x0034 }
        r2 = 0;	 Catch:{ all -> 0x0034 }
        if (r2 >= r1) goto L_0x001f;	 Catch:{ all -> 0x0034 }
        r3 = r4.zzgey;	 Catch:{ all -> 0x0034 }
        r3 = r3.get(r2);	 Catch:{ all -> 0x0034 }
        r3 = (com.google.android.gms.common.internal.zzi) r3;	 Catch:{ all -> 0x0034 }
        r3.removeListener();	 Catch:{ all -> 0x0034 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0034 }
        goto L_0x000f;	 Catch:{ all -> 0x0034 }
        r1 = r4.zzgey;	 Catch:{ all -> 0x0034 }
        r1.clear();	 Catch:{ all -> 0x0034 }
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        r1 = r4.zzgeu;
        monitor-enter(r1);
        r0 = 0;
        r4.zzgev = r0;	 Catch:{ all -> 0x0031 }
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        r1 = 1;
        r4.zza(r1, r0);
        return;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0031 }
        throw r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzd.disconnect():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:59:0x0175 in {19, 21, 22, 23, 24, 25, 28, 29, 32, 33, 36, 42, 44, 45, 46, 49, 50, 54, 58} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void dump(java.lang.String r10, java.io.FileDescriptor r11, java.io.PrintWriter r12, java.lang.String[] r13) {
        /*
        r9 = this;
        r11 = r9.mLock;
        monitor-enter(r11);
        r13 = r9.zzgfa;	 Catch:{ all -> 0x0172 }
        r0 = r9.zzgex;	 Catch:{ all -> 0x0172 }
        monitor-exit(r11);	 Catch:{ all -> 0x0172 }
        r1 = r9.zzgeu;
        monitor-enter(r1);
        r11 = r9.zzgev;	 Catch:{ all -> 0x016f }
        monitor-exit(r1);	 Catch:{ all -> 0x016f }
        r1 = r12.append(r10);
        r2 = "mConnectState=";
        r1.append(r2);
        r1 = 2;
        r2 = 1;
        if (r13 == r2) goto L_0x0038;
        if (r13 == r1) goto L_0x0035;
        r3 = 3;
        if (r13 == r3) goto L_0x0032;
        r3 = 4;
        if (r13 == r3) goto L_0x002f;
        r3 = 5;
        if (r13 == r3) goto L_0x002c;
        r13 = "UNKNOWN";
        r12.print(r13);
        goto L_0x003b;
        r13 = "DISCONNECTING";
        goto L_0x0028;
        r13 = "CONNECTED";
        goto L_0x0028;
        r13 = "LOCAL_CONNECTING";
        goto L_0x0028;
        r13 = "REMOTE_CONNECTING";
        goto L_0x0028;
        r13 = "DISCONNECTED";
        goto L_0x0028;
        r13 = " mService=";
        r12.append(r13);
        if (r0 != 0) goto L_0x0048;
        r13 = "null";
        r12.append(r13);
        goto L_0x0065;
        r13 = r9.zzhn();
        r13 = r12.append(r13);
        r3 = "@";
        r13 = r13.append(r3);
        r0 = r0.asBinder();
        r0 = java.lang.System.identityHashCode(r0);
        r0 = java.lang.Integer.toHexString(r0);
        r13.append(r0);
        r13 = " mServiceBroker=";
        r12.append(r13);
        if (r11 != 0) goto L_0x0072;
        r11 = "null";
        r12.println(r11);
        goto L_0x0087;
        r13 = "IGmsServiceBroker@";
        r13 = r12.append(r13);
        r11 = r11.asBinder();
        r11 = java.lang.System.identityHashCode(r11);
        r11 = java.lang.Integer.toHexString(r11);
        r13.println(r11);
        r11 = new java.text.SimpleDateFormat;
        r13 = java.util.Locale.US;
        r0 = "yyyy-MM-dd HH:mm:ss.SSS";
        r11.<init>(r0, r13);
        r3 = r9.zzgep;
        r5 = 0;
        r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r13 <= 0) goto L_0x00ce;
        r13 = r12.append(r10);
        r0 = "lastConnectedTime=";
        r13 = r13.append(r0);
        r3 = r9.zzgep;
        r0 = new java.util.Date;
        r0.<init>(r3);
        r0 = r11.format(r0);
        r7 = java.lang.String.valueOf(r0);
        r7 = r7.length();
        r7 = r7 + 21;
        r8 = new java.lang.StringBuilder;
        r8.<init>(r7);
        r8.append(r3);
        r3 = " ";
        r8.append(r3);
        r8.append(r0);
        r0 = r8.toString();
        r13.println(r0);
        r3 = r9.zzgeo;
        r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r13 <= 0) goto L_0x0123;
        r13 = r12.append(r10);
        r0 = "lastSuspendedCause=";
        r13.append(r0);
        r13 = r9.zzgen;
        if (r13 == r2) goto L_0x00ee;
        if (r13 == r1) goto L_0x00eb;
        r13 = java.lang.String.valueOf(r13);
        r12.append(r13);
        goto L_0x00f1;
        r13 = "CAUSE_NETWORK_LOST";
        goto L_0x00e7;
        r13 = "CAUSE_SERVICE_DISCONNECTED";
        goto L_0x00e7;
        r13 = " lastSuspendedTime=";
        r13 = r12.append(r13);
        r0 = r9.zzgeo;
        r2 = new java.util.Date;
        r2.<init>(r0);
        r2 = r11.format(r2);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 21;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r4.append(r0);
        r0 = " ";
        r4.append(r0);
        r4.append(r2);
        r0 = r4.toString();
        r13.println(r0);
        r0 = r9.zzger;
        r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r13 <= 0) goto L_0x016e;
        r10 = r12.append(r10);
        r13 = "lastFailedStatus=";
        r10 = r10.append(r13);
        r13 = r9.zzgeq;
        r13 = com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(r13);
        r10.append(r13);
        r10 = " lastFailedTime=";
        r10 = r12.append(r10);
        r12 = r9.zzger;
        r0 = new java.util.Date;
        r0.<init>(r12);
        r11 = r11.format(r0);
        r0 = java.lang.String.valueOf(r11);
        r0 = r0.length();
        r0 = r0 + 21;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r1.append(r12);
        r12 = " ";
        r1.append(r12);
        r1.append(r11);
        r11 = r1.toString();
        r10.println(r11);
        return;
        r10 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x016f }
        throw r10;
        r10 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0172 }
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzd.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public Account getAccount() {
        return null;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzgfa == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            if (this.zzgfa != 2) {
                if (this.zzgfa != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzgeq = connectionResult.getErrorCode();
        this.zzger = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: protected */
    public void onConnectionSuspended(int i) {
        this.zzgen = i;
        this.zzgeo = System.currentTimeMillis();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(int i, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new zzo(this, i, null)));
    }

    /* Access modifiers changed, original: protected */
    public void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new zzn(this, i, iBinder, bundle)));
    }

    /* Access modifiers changed, original: protected */
    public void zza(T t) {
        this.zzgep = System.currentTimeMillis();
    }

    public final void zza(zzan zzan, Set<Scope> set) {
        Bundle zzabt = zzabt();
        zzz zzz = new zzz(this.zzgfd);
        zzz.zzggd = this.mContext.getPackageName();
        zzz.zzggg = zzabt;
        if (set != null) {
            zzz.zzggf = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (zzacc()) {
            zzz.zzggh = getAccount() != null ? getAccount() : new Account("<<default account>>", "com.google");
            if (zzan != null) {
                zzz.zzgge = zzan.asBinder();
            }
        } else if (zzalx()) {
            zzz.zzggh = getAccount();
        }
        zzz.zzggi = zzalu();
        try {
            synchronized (this.zzgeu) {
                if (this.zzgev != null) {
                    this.zzgev.zza(new zzk(this, this.zzgfh.get()), zzz);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            zzcd(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            zza(8, null, null, this.zzgfh.get());
        }
    }

    public void zza(zzj zzj) {
        this.zzgew = (zzj) zzbq.checkNotNull(zzj, "Connection progress callbacks cannot be null.");
        zza(2, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzj zzj, int i, PendingIntent pendingIntent) {
        this.zzgew = (zzj) zzbq.checkNotNull(zzj, "Connection progress callbacks cannot be null.");
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzgfh.get(), i, pendingIntent));
    }

    public void zza(zzp zzp) {
        zzp.zzako();
    }

    /* Access modifiers changed, original: protected */
    public Bundle zzabt() {
        return new Bundle();
    }

    public boolean zzacc() {
        return false;
    }

    public boolean zzacn() {
        return false;
    }

    public Bundle zzagp() {
        return null;
    }

    public boolean zzahn() {
        return true;
    }

    public final IBinder zzaho() {
        synchronized (this.zzgeu) {
            if (this.zzgev == null) {
                return null;
            }
            IBinder asBinder = this.zzgev.asBinder();
            return asBinder;
        }
    }

    public final String zzahp() {
        if (isConnected()) {
            zzam zzam = this.zzges;
            if (zzam != null) {
                return zzam.getPackageName();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* Access modifiers changed, original: protected */
    public String zzalq() {
        return "com.google.android.gms";
    }

    public final void zzals() {
        int isGooglePlayServicesAvailable = this.zzfwk.isGooglePlayServicesAvailable(this.mContext);
        if (isGooglePlayServicesAvailable != 0) {
            zza(1, null);
            zza(new zzm(this), isGooglePlayServicesAvailable, null);
            return;
        }
        zza(new zzm(this));
    }

    public zzc[] zzalu() {
        return new zzc[0];
    }

    public final void zzalv() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T zzalw() {
        IInterface iInterface;
        synchronized (this.mLock) {
            if (this.zzgfa != 5) {
                zzalv();
                zzbq.zza(this.zzgex != null, "Client is connected but service is null");
                iInterface = this.zzgex;
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public boolean zzalx() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public Set<Scope> zzaly() {
        return Collections.EMPTY_SET;
    }

    /* Access modifiers changed, original: 0000 */
    public void zzb(int i, T t) {
    }

    public final void zzcd(int i) {
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzgfh.get(), i));
    }

    public abstract T zzd(IBinder iBinder);

    public abstract String zzhm();

    public abstract String zzhn();
}
