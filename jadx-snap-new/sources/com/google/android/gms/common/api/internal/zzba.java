package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.zzf;
import com.google.android.gms.internal.zzcyj;
import com.google.android.gms.internal.zzcyk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class zzba extends GoogleApiClient implements zzcd {
    private final Context mContext;
    private final Looper zzalj;
    private final int zzfte;
    private final GoogleApiAvailability zzftg;
    private zza<? extends zzcyj, zzcyk> zzfth;
    private boolean zzftk;
    private final Lock zzfwa;
    private zzr zzfwf;
    private Map<Api<?>, Boolean> zzfwi;
    final Queue<zzm<?, ?>> zzfwo = new LinkedList();
    private final zzae zzfyc;
    private zzcc zzfyd = null;
    private volatile boolean zzfye;
    private long zzfyf = 120000;
    private long zzfyg = 5000;
    private final zzbf zzfyh;
    private zzbx zzfyi;
    final Map<zzc<?>, zze> zzfyj;
    Set<Scope> zzfyk = new HashSet();
    private final zzcm zzfyl = new zzcm();
    private final ArrayList<zzt> zzfym;
    private Integer zzfyn = null;
    Set<zzdh> zzfyo = null;
    final zzdk zzfyp;
    private final zzaf zzfyq = new zzbb(this);

    public zzba(Context context, Lock lock, Looper looper, zzr zzr, GoogleApiAvailability googleApiAvailability, zza<? extends zzcyj, zzcyk> zza, Map<Api<?>, Boolean> map, List<ConnectionCallbacks> list, List<OnConnectionFailedListener> list2, Map<zzc<?>, zze> map2, int i, int i2, ArrayList<zzt> arrayList, boolean z) {
        Looper looper2 = looper;
        this.mContext = context;
        this.zzfwa = lock;
        this.zzftk = false;
        this.zzfyc = new zzae(looper, this.zzfyq);
        this.zzalj = looper2;
        this.zzfyh = new zzbf(this, looper);
        this.zzftg = googleApiAvailability;
        this.zzfte = i;
        if (this.zzfte >= 0) {
            this.zzfyn = Integer.valueOf(i2);
        }
        this.zzfwi = map;
        this.zzfyj = map2;
        this.zzfym = arrayList;
        this.zzfyp = new zzdk(this.zzfyj);
        for (ConnectionCallbacks registerConnectionCallbacks : list) {
            this.zzfyc.registerConnectionCallbacks(registerConnectionCallbacks);
        }
        for (OnConnectionFailedListener registerConnectionFailedListener : list2) {
            this.zzfyc.registerConnectionFailedListener(registerConnectionFailedListener);
        }
        this.zzfwf = zzr;
        this.zzfth = zza;
    }

    private final void resume() {
        this.zzfwa.lock();
        try {
            if (this.zzfye) {
                zzajq();
            }
            this.zzfwa.unlock();
        } catch (Throwable th) {
            this.zzfwa.unlock();
        }
    }

    public static int zza(Iterable<zze> iterable, boolean z) {
        Object obj = null;
        Object obj2 = null;
        for (zze zze : iterable) {
            if (zze.zzacc()) {
                obj = 1;
            }
            if (zze.zzacn()) {
                obj2 = 1;
            }
        }
        return obj != null ? (obj2 == null || !z) ? 1 : 2 : 3;
    }

    private final void zzajq() {
        this.zzfyc.zzamt();
        this.zzfyd.connect();
    }

    private final void zzajr() {
        this.zzfwa.lock();
        try {
            if (zzajs()) {
                zzajq();
            }
            this.zzfwa.unlock();
        } catch (Throwable th) {
            this.zzfwa.unlock();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x011c in {2, 7, 13, 16, 21, 26, 28, 35, 37, 39, 41, 43} preds:[]
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
    private final void zzbu(int r14) {
        /*
        r13 = this;
        r0 = r13.zzfyn;
        if (r0 != 0) goto L_0x000b;
        r0 = java.lang.Integer.valueOf(r14);
        r13.zzfyn = r0;
        goto L_0x0011;
        r0 = r0.intValue();
        if (r0 != r14) goto L_0x00dc;
        r0 = r13.zzfyd;
        if (r0 == 0) goto L_0x0016;
        return;
        r0 = r13.zzfyj;
        r0 = r0.values();
        r0 = r0.iterator();
        r1 = 0;
        r2 = 0;
        r3 = r0.hasNext();
        r4 = 1;
        if (r3 == 0) goto L_0x003e;
        r3 = r0.next();
        r3 = (com.google.android.gms.common.api.Api.zze) r3;
        r5 = r3.zzacc();
        if (r5 == 0) goto L_0x0036;
        r1 = 1;
        r3 = r3.zzacn();
        if (r3 == 0) goto L_0x0022;
        r2 = 1;
        goto L_0x0022;
        r0 = r13.zzfyn;
        r0 = r0.intValue();
        if (r0 == r4) goto L_0x0088;
        r3 = 2;
        if (r0 == r3) goto L_0x004b;
        r1 = 3;
        goto L_0x008c;
        if (r1 == 0) goto L_0x008c;
        r0 = r13.zzftk;
        if (r0 == 0) goto L_0x006e;
        r12 = new com.google.android.gms.common.api.internal.zzaa;
        r1 = r13.mContext;
        r2 = r13.zzfwa;
        r3 = r13.zzalj;
        r4 = r13.zzftg;
        r5 = r13.zzfyj;
        r6 = r13.zzfwf;
        r7 = r13.zzfwi;
        r8 = r13.zzfth;
        r9 = r13.zzfym;
        r11 = 1;
        r0 = r12;
        r10 = r13;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r13.zzfyd = r12;
        return;
        r0 = r13.mContext;
        r2 = r13.zzfwa;
        r3 = r13.zzalj;
        r4 = r13.zzftg;
        r5 = r13.zzfyj;
        r6 = r13.zzfwf;
        r7 = r13.zzfwi;
        r8 = r13.zzfth;
        r9 = r13.zzfym;
        r1 = r13;
        r0 = com.google.android.gms.common.api.internal.zzv.zza(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r13.zzfyd = r0;
        return;
        if (r1 == 0) goto L_0x00d4;
        if (r2 != 0) goto L_0x00cc;
        r0 = r13.zzftk;
        if (r0 == 0) goto L_0x00af;
        if (r2 != 0) goto L_0x00af;
        r12 = new com.google.android.gms.common.api.internal.zzaa;
        r1 = r13.mContext;
        r2 = r13.zzfwa;
        r3 = r13.zzalj;
        r4 = r13.zzftg;
        r5 = r13.zzfyj;
        r6 = r13.zzfwf;
        r7 = r13.zzfwi;
        r8 = r13.zzfth;
        r9 = r13.zzfym;
        r11 = 0;
        r0 = r12;
        r10 = r13;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r13.zzfyd = r12;
        return;
        r12 = new com.google.android.gms.common.api.internal.zzbi;
        r1 = r13.mContext;
        r3 = r13.zzfwa;
        r4 = r13.zzalj;
        r5 = r13.zzftg;
        r6 = r13.zzfyj;
        r7 = r13.zzfwf;
        r8 = r13.zzfwi;
        r9 = r13.zzfth;
        r10 = r13.zzfym;
        r0 = r12;
        r2 = r13;
        r11 = r13;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r13.zzfyd = r12;
        return;
        r0 = new java.lang.IllegalStateException;
        r1 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.";
        r0.<init>(r1);
        throw r0;
        r0 = new java.lang.IllegalStateException;
        r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.";
        r0.<init>(r1);
        throw r0;
        r0 = new java.lang.IllegalStateException;
        r1 = zzbv(r14);
        r2 = r13.zzfyn;
        r2 = r2.intValue();
        r2 = zzbv(r2);
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 51;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r3 = r3 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Cannot use sign-in mode: ";
        r4.append(r3);
        r4.append(r1);
        r1 = ". Mode was already set to ";
        r4.append(r1);
        r4.append(r2);
        r1 = r4.toString();
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzba.zzbu(int):void");
    }

    private static String zzbv(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final void connect() {
        this.zzfwa.lock();
        try {
            boolean z = false;
            if (this.zzfte >= 0) {
                if (this.zzfyn != null) {
                    z = true;
                }
                zzbq.zza(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zzfyn == null) {
                this.zzfyn = Integer.valueOf(zza(this.zzfyj.values(), false));
            } else if (this.zzfyn.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(this.zzfyn.intValue());
        } finally {
            this.zzfwa.unlock();
        }
    }

    public final void connect(int i) {
        this.zzfwa.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Illegal sign-in mode: ");
            stringBuilder.append(i);
            zzbq.checkArgument(z, stringBuilder.toString());
            zzbu(i);
            zzajq();
        } finally {
            this.zzfwa.unlock();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0051 in {4, 8, 12, 15, 18} preds:[]
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
        r3 = this;
        r0 = r3.zzfwa;
        r0.lock();
        r0 = r3.zzfyp;	 Catch:{ all -> 0x004a }
        r0.release();	 Catch:{ all -> 0x004a }
        r0 = r3.zzfyd;	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x0013;	 Catch:{ all -> 0x004a }
        r0 = r3.zzfyd;	 Catch:{ all -> 0x004a }
        r0.disconnect();	 Catch:{ all -> 0x004a }
        r0 = r3.zzfyl;	 Catch:{ all -> 0x004a }
        r0.release();	 Catch:{ all -> 0x004a }
        r0 = r3.zzfwo;	 Catch:{ all -> 0x004a }
        r0 = r0.iterator();	 Catch:{ all -> 0x004a }
        r1 = r0.hasNext();	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0032;	 Catch:{ all -> 0x004a }
        r1 = r0.next();	 Catch:{ all -> 0x004a }
        r1 = (com.google.android.gms.common.api.internal.zzm) r1;	 Catch:{ all -> 0x004a }
        r2 = 0;	 Catch:{ all -> 0x004a }
        r1.zza(r2);	 Catch:{ all -> 0x004a }
        r1.cancel();	 Catch:{ all -> 0x004a }
        goto L_0x001e;	 Catch:{ all -> 0x004a }
        r0 = r3.zzfwo;	 Catch:{ all -> 0x004a }
        r0.clear();	 Catch:{ all -> 0x004a }
        r0 = r3.zzfyd;	 Catch:{ all -> 0x004a }
        if (r0 != 0) goto L_0x0041;
        r0 = r3.zzfwa;
        r0.unlock();
        return;
        r3.zzajs();	 Catch:{ all -> 0x004a }
        r0 = r3.zzfyc;	 Catch:{ all -> 0x004a }
        r0.zzams();	 Catch:{ all -> 0x004a }
        goto L_0x003b;
        r0 = move-exception;
        r1 = r3.zzfwa;
        r1.unlock();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzba.disconnect():void");
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.mContext);
        printWriter.append(str).append("mResuming=").print(this.zzfye);
        printWriter.append(" mWorkQueue.size()=").print(this.zzfwo.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zzfyp.zzgbs.size());
        zzcc zzcc = this.zzfyd;
        if (zzcc != null) {
            zzcc.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final Looper getLooper() {
        return this.zzalj;
    }

    public final boolean isConnected() {
        zzcc zzcc = this.zzfyd;
        return zzcc != null && zzcc.isConnected();
    }

    public final void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.zzfyc.registerConnectionCallbacks(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.zzfyc.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public final void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        this.zzfyc.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public final void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        this.zzfyc.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    public final <C extends zze> C zza(zzc<C> zzc) {
        zze zze = (zze) this.zzfyj.get(zzc);
        zzbq.checkNotNull(zze, "Appropriate Api was not requested.");
        return zze;
    }

    public final void zza(zzdh zzdh) {
        this.zzfwa.lock();
        try {
            if (this.zzfyo == null) {
                this.zzfyo = new HashSet();
            }
            this.zzfyo.add(zzdh);
        } finally {
            this.zzfwa.unlock();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zzajs() {
        if (!this.zzfye) {
            return false;
        }
        this.zzfye = false;
        this.zzfyh.removeMessages(2);
        this.zzfyh.removeMessages(1);
        zzbx zzbx = this.zzfyi;
        if (zzbx != null) {
            zzbx.unregister();
            this.zzfyi = null;
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzajt() {
        this.zzfwa.lock();
        try {
            if (this.zzfyo == null) {
                return false;
            }
            int isEmpty = this.zzfyo.isEmpty() ^ 1;
            this.zzfwa.unlock();
            return isEmpty;
        } finally {
            this.zzfwa.unlock();
        }
    }

    /* Access modifiers changed, original: final */
    public final String zzaju() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x003e in {6, 7, 10, 13, 15, 18} preds:[]
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
    public final void zzb(com.google.android.gms.common.api.internal.zzdh r3) {
        /*
        r2 = this;
        r0 = r2.zzfwa;
        r0.lock();
        r0 = r2.zzfyo;	 Catch:{ all -> 0x0037 }
        r1 = "GoogleApiClientImpl";
        if (r0 != 0) goto L_0x0016;
        r3 = "Attempted to remove pending transform when no transforms are registered.";	 Catch:{ all -> 0x0037 }
        r0 = new java.lang.Exception;	 Catch:{ all -> 0x0037 }
        r0.<init>();	 Catch:{ all -> 0x0037 }
        android.util.Log.wtf(r1, r3, r0);	 Catch:{ all -> 0x0037 }
        goto L_0x0031;	 Catch:{ all -> 0x0037 }
        r0 = r2.zzfyo;	 Catch:{ all -> 0x0037 }
        r3 = r0.remove(r3);	 Catch:{ all -> 0x0037 }
        if (r3 != 0) goto L_0x0026;	 Catch:{ all -> 0x0037 }
        r3 = "Failed to remove pending transform - this may lead to memory leaks!";	 Catch:{ all -> 0x0037 }
        r0 = new java.lang.Exception;	 Catch:{ all -> 0x0037 }
        r0.<init>();	 Catch:{ all -> 0x0037 }
        goto L_0x0012;	 Catch:{ all -> 0x0037 }
        r3 = r2.zzajt();	 Catch:{ all -> 0x0037 }
        if (r3 != 0) goto L_0x0031;	 Catch:{ all -> 0x0037 }
        r3 = r2.zzfyd;	 Catch:{ all -> 0x0037 }
        r3.zzais();	 Catch:{ all -> 0x0037 }
        r3 = r2.zzfwa;
        r3.unlock();
        return;
        r3 = move-exception;
        r0 = r2.zzfwa;
        r0.unlock();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzba.zzb(com.google.android.gms.common.api.internal.zzdh):void");
    }

    public final void zzc(ConnectionResult connectionResult) {
        if (!zzf.zzd(this.mContext, connectionResult.getErrorCode())) {
            zzajs();
        }
        if (!this.zzfye) {
            this.zzfyc.zzk(connectionResult);
            this.zzfyc.zzams();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x006e in {2, 3, 6, 7, 12, 14, 17, 20} preds:[]
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
    public final <A extends com.google.android.gms.common.api.Api.zzb, R extends com.google.android.gms.common.api.Result, T extends com.google.android.gms.common.api.internal.zzm<R, A>> T zzd(T r5) {
        /*
        r4 = this;
        r0 = r5.zzahm();
        if (r0 == 0) goto L_0x0008;
        r0 = 1;
        goto L_0x0009;
        r0 = 0;
        r1 = "This task can not be enqueued (it's probably a Batch or malformed)";
        com.google.android.gms.common.internal.zzbq.checkArgument(r0, r1);
        r0 = r4.zzfyj;
        r1 = r5.zzahm();
        r0 = r0.containsKey(r1);
        r1 = r5.zzaht();
        if (r1 == 0) goto L_0x0027;
        r1 = r5.zzaht();
        r1 = r1.getName();
        goto L_0x0029;
        r1 = "the API";
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 65;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "GoogleApiClient is not configured to use ";
        r3.append(r2);
        r3.append(r1);
        r1 = " required for this call.";
        r3.append(r1);
        r1 = r3.toString();
        com.google.android.gms.common.internal.zzbq.checkArgument(r0, r1);
        r0 = r4.zzfwa;
        r0.lock();
        r0 = r4.zzfyd;	 Catch:{ all -> 0x0067 }
        if (r0 != 0) goto L_0x0060;	 Catch:{ all -> 0x0067 }
        r0 = r4.zzfwo;	 Catch:{ all -> 0x0067 }
        r0.add(r5);	 Catch:{ all -> 0x0067 }
        r0 = r4.zzfwa;
        r0.unlock();
        return r5;
        r0 = r4.zzfyd;	 Catch:{ all -> 0x0067 }
        r5 = r0.zzd(r5);	 Catch:{ all -> 0x0067 }
        goto L_0x005a;
        r5 = move-exception;
        r0 = r4.zzfwa;
        r0.unlock();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzba.zzd(com.google.android.gms.common.api.internal.zzm):com.google.android.gms.common.api.internal.zzm");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0095 in {2, 3, 6, 7, 18, 20, 22, 24, 27} preds:[]
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
    public final <A extends com.google.android.gms.common.api.Api.zzb, T extends com.google.android.gms.common.api.internal.zzm<? extends com.google.android.gms.common.api.Result, A>> T zze(T r5) {
        /*
        r4 = this;
        r0 = r5.zzahm();
        if (r0 == 0) goto L_0x0008;
        r0 = 1;
        goto L_0x0009;
        r0 = 0;
        r1 = "This task can not be executed (it's probably a Batch or malformed)";
        com.google.android.gms.common.internal.zzbq.checkArgument(r0, r1);
        r0 = r4.zzfyj;
        r1 = r5.zzahm();
        r0 = r0.containsKey(r1);
        r1 = r5.zzaht();
        if (r1 == 0) goto L_0x0027;
        r1 = r5.zzaht();
        r1 = r1.getName();
        goto L_0x0029;
        r1 = "the API";
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 65;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "GoogleApiClient is not configured to use ";
        r3.append(r2);
        r3.append(r1);
        r1 = " required for this call.";
        r3.append(r1);
        r1 = r3.toString();
        com.google.android.gms.common.internal.zzbq.checkArgument(r0, r1);
        r0 = r4.zzfwa;
        r0.lock();
        r0 = r4.zzfyd;	 Catch:{ all -> 0x008e }
        if (r0 == 0) goto L_0x0086;	 Catch:{ all -> 0x008e }
        r0 = r4.zzfye;	 Catch:{ all -> 0x008e }
        if (r0 == 0) goto L_0x007f;	 Catch:{ all -> 0x008e }
        r0 = r4.zzfwo;	 Catch:{ all -> 0x008e }
        r0.add(r5);	 Catch:{ all -> 0x008e }
        r0 = r4.zzfwo;	 Catch:{ all -> 0x008e }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x008e }
        if (r0 != 0) goto L_0x0079;	 Catch:{ all -> 0x008e }
        r0 = r4.zzfwo;	 Catch:{ all -> 0x008e }
        r0 = r0.remove();	 Catch:{ all -> 0x008e }
        r0 = (com.google.android.gms.common.api.internal.zzm) r0;	 Catch:{ all -> 0x008e }
        r1 = r4.zzfyp;	 Catch:{ all -> 0x008e }
        r1.zzb(r0);	 Catch:{ all -> 0x008e }
        r1 = com.google.android.gms.common.api.Status.zzfts;	 Catch:{ all -> 0x008e }
        r0.zzu(r1);	 Catch:{ all -> 0x008e }
        goto L_0x005e;
        r0 = r4.zzfwa;
        r0.unlock();
        return r5;
        r0 = r4.zzfyd;	 Catch:{ all -> 0x008e }
        r5 = r0.zze(r5);	 Catch:{ all -> 0x008e }
        goto L_0x0079;	 Catch:{ all -> 0x008e }
        r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x008e }
        r0 = "GoogleApiClient is not connected yet.";	 Catch:{ all -> 0x008e }
        r5.<init>(r0);	 Catch:{ all -> 0x008e }
        throw r5;	 Catch:{ all -> 0x008e }
        r5 = move-exception;
        r0 = r4.zzfwa;
        r0.unlock();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzba.zze(com.google.android.gms.common.api.internal.zzm):com.google.android.gms.common.api.internal.zzm");
    }

    public final void zzf(int i, boolean z) {
        if (!(i != 1 || z || this.zzfye)) {
            this.zzfye = true;
            if (this.zzfyi == null) {
                this.zzfyi = GoogleApiAvailability.zza(this.mContext.getApplicationContext(), new zzbg(this));
            }
            zzbf zzbf = this.zzfyh;
            zzbf.sendMessageDelayed(zzbf.obtainMessage(1), this.zzfyf);
            zzbf = this.zzfyh;
            zzbf.sendMessageDelayed(zzbf.obtainMessage(2), this.zzfyg);
        }
        this.zzfyp.zzald();
        this.zzfyc.zzcf(i);
        this.zzfyc.zzams();
        if (i == 2) {
            zzajq();
        }
    }

    public final void zzk(Bundle bundle) {
        while (!this.zzfwo.isEmpty()) {
            zze((zzm) this.zzfwo.remove());
        }
        this.zzfyc.zzl(bundle);
    }
}
