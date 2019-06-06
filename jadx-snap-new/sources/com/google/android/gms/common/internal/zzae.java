package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzae implements Callback {
    private final Handler mHandler;
    private final Object mLock = new Object();
    private final zzaf zzggl;
    private final ArrayList<ConnectionCallbacks> zzggm = new ArrayList();
    private ArrayList<ConnectionCallbacks> zzggn = new ArrayList();
    private final ArrayList<OnConnectionFailedListener> zzggo = new ArrayList();
    private volatile boolean zzggp = false;
    private final AtomicInteger zzggq = new AtomicInteger(0);
    private boolean zzggr = false;

    public zzae(Looper looper, zzaf zzaf) {
        this.zzggl = zzaf;
        this.mHandler = new Handler(looper, this);
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) message.obj;
            synchronized (this.mLock) {
                if (this.zzggp && this.zzggl.isConnected() && this.zzggm.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(this.zzggl.zzagp());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("GmsClientEvents", stringBuilder.toString(), new Exception());
        return false;
    }

    public final void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        zzbq.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (this.zzggm.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder.append("registerConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.zzggm.add(connectionCallbacks);
            }
        }
        if (this.zzggl.isConnected()) {
            Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        zzbq.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (this.zzggo.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.zzggo.add(onConnectionFailedListener);
            }
        }
    }

    public final void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        zzbq.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (!this.zzggm.remove(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
                stringBuilder.append("unregisterConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else if (this.zzggr) {
                this.zzggn.add(connectionCallbacks);
            }
        }
    }

    public final void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        zzbq.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (!this.zzggo.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 57);
                stringBuilder.append("unregisterConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" not found");
                Log.w("GmsClientEvents", stringBuilder.toString());
            }
        }
    }

    public final void zzams() {
        this.zzggp = false;
        this.zzggq.incrementAndGet();
    }

    public final void zzamt() {
        this.zzggp = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0062 in {2, 3, 15, 18, 21} preds:[]
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
    public final void zzcf(int r9) {
        /*
        r8 = this;
        r0 = android.os.Looper.myLooper();
        r1 = r8.mHandler;
        r1 = r1.getLooper();
        r2 = 0;
        r3 = 1;
        if (r0 != r1) goto L_0x0010;
        r0 = 1;
        goto L_0x0011;
        r0 = 0;
        r1 = "onUnintentionalDisconnection must only be called on the Handler thread";
        com.google.android.gms.common.internal.zzbq.zza(r0, r1);
        r0 = r8.mHandler;
        r0.removeMessages(r3);
        r0 = r8.mLock;
        monitor-enter(r0);
        r8.zzggr = r3;	 Catch:{ all -> 0x005f }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x005f }
        r3 = r8.zzggm;	 Catch:{ all -> 0x005f }
        r1.<init>(r3);	 Catch:{ all -> 0x005f }
        r3 = r8.zzggq;	 Catch:{ all -> 0x005f }
        r3 = r3.get();	 Catch:{ all -> 0x005f }
        r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x005f }
        r4 = r1.size();	 Catch:{ all -> 0x005f }
        r5 = 0;	 Catch:{ all -> 0x005f }
        if (r5 >= r4) goto L_0x0056;	 Catch:{ all -> 0x005f }
        r6 = r1.get(r5);	 Catch:{ all -> 0x005f }
        r5 = r5 + 1;	 Catch:{ all -> 0x005f }
        r6 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r6;	 Catch:{ all -> 0x005f }
        r7 = r8.zzggp;	 Catch:{ all -> 0x005f }
        if (r7 == 0) goto L_0x0056;	 Catch:{ all -> 0x005f }
        r7 = r8.zzggq;	 Catch:{ all -> 0x005f }
        r7 = r7.get();	 Catch:{ all -> 0x005f }
        if (r7 != r3) goto L_0x0056;	 Catch:{ all -> 0x005f }
        r7 = r8.zzggm;	 Catch:{ all -> 0x005f }
        r7 = r7.contains(r6);	 Catch:{ all -> 0x005f }
        if (r7 == 0) goto L_0x0034;	 Catch:{ all -> 0x005f }
        r6.onConnectionSuspended(r9);	 Catch:{ all -> 0x005f }
        goto L_0x0034;	 Catch:{ all -> 0x005f }
        r9 = r8.zzggn;	 Catch:{ all -> 0x005f }
        r9.clear();	 Catch:{ all -> 0x005f }
        r8.zzggr = r2;	 Catch:{ all -> 0x005f }
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        return;	 Catch:{ all -> 0x005f }
        r9 = move-exception;	 Catch:{ all -> 0x005f }
        monitor-exit(r0);	 Catch:{ all -> 0x005f }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzae.zzcf(int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x005b in {2, 3, 13, 16, 18, 20, 23} preds:[]
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
    public final void zzk(com.google.android.gms.common.ConnectionResult r8) {
        /*
        r7 = this;
        r0 = android.os.Looper.myLooper();
        r1 = r7.mHandler;
        r1 = r1.getLooper();
        r2 = 0;
        r3 = 1;
        if (r0 != r1) goto L_0x0010;
        r0 = 1;
        goto L_0x0011;
        r0 = 0;
        r1 = "onConnectionFailure must only be called on the Handler thread";
        com.google.android.gms.common.internal.zzbq.zza(r0, r1);
        r0 = r7.mHandler;
        r0.removeMessages(r3);
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0058 }
        r3 = r7.zzggo;	 Catch:{ all -> 0x0058 }
        r1.<init>(r3);	 Catch:{ all -> 0x0058 }
        r3 = r7.zzggq;	 Catch:{ all -> 0x0058 }
        r3 = r3.get();	 Catch:{ all -> 0x0058 }
        r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x0058 }
        r4 = r1.size();	 Catch:{ all -> 0x0058 }
        if (r2 >= r4) goto L_0x0056;	 Catch:{ all -> 0x0058 }
        r5 = r1.get(r2);	 Catch:{ all -> 0x0058 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0058 }
        r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5;	 Catch:{ all -> 0x0058 }
        r6 = r7.zzggp;	 Catch:{ all -> 0x0058 }
        if (r6 == 0) goto L_0x0054;	 Catch:{ all -> 0x0058 }
        r6 = r7.zzggq;	 Catch:{ all -> 0x0058 }
        r6 = r6.get();	 Catch:{ all -> 0x0058 }
        if (r6 == r3) goto L_0x0048;	 Catch:{ all -> 0x0058 }
        goto L_0x0054;	 Catch:{ all -> 0x0058 }
        r6 = r7.zzggo;	 Catch:{ all -> 0x0058 }
        r6 = r6.contains(r5);	 Catch:{ all -> 0x0058 }
        if (r6 == 0) goto L_0x0031;	 Catch:{ all -> 0x0058 }
        r5.onConnectionFailed(r8);	 Catch:{ all -> 0x0058 }
        goto L_0x0031;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return;	 Catch:{ all -> 0x0058 }
        r8 = move-exception;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzae.zzk(com.google.android.gms.common.ConnectionResult):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x0081 in {2, 3, 9, 10, 13, 14, 25, 28, 31} preds:[]
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
    public final void zzl(android.os.Bundle r9) {
        /*
        r8 = this;
        r0 = android.os.Looper.myLooper();
        r1 = r8.mHandler;
        r1 = r1.getLooper();
        r2 = 0;
        r3 = 1;
        if (r0 != r1) goto L_0x0010;
        r0 = 1;
        goto L_0x0011;
        r0 = 0;
        r1 = "onConnectionSuccess must only be called on the Handler thread";
        com.google.android.gms.common.internal.zzbq.zza(r0, r1);
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = r8.zzggr;	 Catch:{ all -> 0x007e }
        if (r1 != 0) goto L_0x001f;	 Catch:{ all -> 0x007e }
        r1 = 1;	 Catch:{ all -> 0x007e }
        goto L_0x0020;	 Catch:{ all -> 0x007e }
        r1 = 0;	 Catch:{ all -> 0x007e }
        com.google.android.gms.common.internal.zzbq.checkState(r1);	 Catch:{ all -> 0x007e }
        r1 = r8.mHandler;	 Catch:{ all -> 0x007e }
        r1.removeMessages(r3);	 Catch:{ all -> 0x007e }
        r8.zzggr = r3;	 Catch:{ all -> 0x007e }
        r1 = r8.zzggn;	 Catch:{ all -> 0x007e }
        r1 = r1.size();	 Catch:{ all -> 0x007e }
        if (r1 != 0) goto L_0x0033;	 Catch:{ all -> 0x007e }
        goto L_0x0034;	 Catch:{ all -> 0x007e }
        r3 = 0;	 Catch:{ all -> 0x007e }
        com.google.android.gms.common.internal.zzbq.checkState(r3);	 Catch:{ all -> 0x007e }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x007e }
        r3 = r8.zzggm;	 Catch:{ all -> 0x007e }
        r1.<init>(r3);	 Catch:{ all -> 0x007e }
        r3 = r8.zzggq;	 Catch:{ all -> 0x007e }
        r3 = r3.get();	 Catch:{ all -> 0x007e }
        r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x007e }
        r4 = r1.size();	 Catch:{ all -> 0x007e }
        r5 = 0;	 Catch:{ all -> 0x007e }
        if (r5 >= r4) goto L_0x0075;	 Catch:{ all -> 0x007e }
        r6 = r1.get(r5);	 Catch:{ all -> 0x007e }
        r5 = r5 + 1;	 Catch:{ all -> 0x007e }
        r6 = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r6;	 Catch:{ all -> 0x007e }
        r7 = r8.zzggp;	 Catch:{ all -> 0x007e }
        if (r7 == 0) goto L_0x0075;	 Catch:{ all -> 0x007e }
        r7 = r8.zzggl;	 Catch:{ all -> 0x007e }
        r7 = r7.isConnected();	 Catch:{ all -> 0x007e }
        if (r7 == 0) goto L_0x0075;	 Catch:{ all -> 0x007e }
        r7 = r8.zzggq;	 Catch:{ all -> 0x007e }
        r7 = r7.get();	 Catch:{ all -> 0x007e }
        if (r7 != r3) goto L_0x0075;	 Catch:{ all -> 0x007e }
        r7 = r8.zzggn;	 Catch:{ all -> 0x007e }
        r7 = r7.contains(r6);	 Catch:{ all -> 0x007e }
        if (r7 != 0) goto L_0x004b;	 Catch:{ all -> 0x007e }
        r6.onConnected(r9);	 Catch:{ all -> 0x007e }
        goto L_0x004b;	 Catch:{ all -> 0x007e }
        r9 = r8.zzggn;	 Catch:{ all -> 0x007e }
        r9.clear();	 Catch:{ all -> 0x007e }
        r8.zzggr = r2;	 Catch:{ all -> 0x007e }
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        return;	 Catch:{ all -> 0x007e }
        r9 = move-exception;	 Catch:{ all -> 0x007e }
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzae.zzl(android.os.Bundle):void");
    }
}
