package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class zzaj implements ServiceConnection {
    private ComponentName mComponentName;
    private int mState = 2;
    private IBinder zzgfp;
    private final Set<ServiceConnection> zzgha = new HashSet();
    private boolean zzghb;
    private final zzah zzghc;
    private /* synthetic */ zzai zzghd;

    public zzaj(zzai zzai, zzah zzah) {
        this.zzghd = zzai;
        this.zzghc = zzah;
    }

    public final IBinder getBinder() {
        return this.zzgfp;
    }

    public final ComponentName getComponentName() {
        return this.mComponentName;
    }

    public final int getState() {
        return this.mState;
    }

    public final boolean isBound() {
        return this.zzghb;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0034 in {6, 9, 12} preds:[]
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
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
        r4 = this;
        r0 = r4.zzghd;
        r0 = r0.zzggw;
        monitor-enter(r0);
        r1 = r4.zzghd;	 Catch:{ all -> 0x0031 }
        r1 = r1.mHandler;	 Catch:{ all -> 0x0031 }
        r2 = r4.zzghc;	 Catch:{ all -> 0x0031 }
        r3 = 1;	 Catch:{ all -> 0x0031 }
        r1.removeMessages(r3, r2);	 Catch:{ all -> 0x0031 }
        r4.zzgfp = r6;	 Catch:{ all -> 0x0031 }
        r4.mComponentName = r5;	 Catch:{ all -> 0x0031 }
        r1 = r4.zzgha;	 Catch:{ all -> 0x0031 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0031 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0031 }
        if (r2 == 0) goto L_0x002d;	 Catch:{ all -> 0x0031 }
        r2 = r1.next();	 Catch:{ all -> 0x0031 }
        r2 = (android.content.ServiceConnection) r2;	 Catch:{ all -> 0x0031 }
        r2.onServiceConnected(r5, r6);	 Catch:{ all -> 0x0031 }
        goto L_0x001d;	 Catch:{ all -> 0x0031 }
        r4.mState = r3;	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;	 Catch:{ all -> 0x0031 }
        r5 = move-exception;	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzaj.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0036 in {6, 9, 12} preds:[]
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
    public final void onServiceDisconnected(android.content.ComponentName r5) {
        /*
        r4 = this;
        r0 = r4.zzghd;
        r0 = r0.zzggw;
        monitor-enter(r0);
        r1 = r4.zzghd;	 Catch:{ all -> 0x0033 }
        r1 = r1.mHandler;	 Catch:{ all -> 0x0033 }
        r2 = 1;	 Catch:{ all -> 0x0033 }
        r3 = r4.zzghc;	 Catch:{ all -> 0x0033 }
        r1.removeMessages(r2, r3);	 Catch:{ all -> 0x0033 }
        r1 = 0;	 Catch:{ all -> 0x0033 }
        r4.zzgfp = r1;	 Catch:{ all -> 0x0033 }
        r4.mComponentName = r5;	 Catch:{ all -> 0x0033 }
        r1 = r4.zzgha;	 Catch:{ all -> 0x0033 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0033 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0033 }
        if (r2 == 0) goto L_0x002e;	 Catch:{ all -> 0x0033 }
        r2 = r1.next();	 Catch:{ all -> 0x0033 }
        r2 = (android.content.ServiceConnection) r2;	 Catch:{ all -> 0x0033 }
        r2.onServiceDisconnected(r5);	 Catch:{ all -> 0x0033 }
        goto L_0x001e;	 Catch:{ all -> 0x0033 }
        r5 = 2;	 Catch:{ all -> 0x0033 }
        r4.mState = r5;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        return;	 Catch:{ all -> 0x0033 }
        r5 = move-exception;	 Catch:{ all -> 0x0033 }
        monitor-exit(r0);	 Catch:{ all -> 0x0033 }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzaj.onServiceDisconnected(android.content.ComponentName):void");
    }

    public final void zza(ServiceConnection serviceConnection, String str) {
        this.zzghd.zzggx;
        this.zzghd.mApplicationContext;
        this.zzghc.zzcq(this.zzghd.mApplicationContext);
        this.zzgha.add(serviceConnection);
    }

    public final boolean zza(ServiceConnection serviceConnection) {
        return this.zzgha.contains(serviceConnection);
    }

    public final boolean zzamv() {
        return this.zzgha.isEmpty();
    }

    public final void zzb(ServiceConnection serviceConnection, String str) {
        this.zzghd.zzggx;
        this.zzghd.mApplicationContext;
        this.zzgha.remove(serviceConnection);
    }

    public final void zzgr(String str) {
        this.mState = 3;
        this.zzghb = this.zzghd.zzggx.zza(this.zzghd.mApplicationContext, str, this.zzghc.zzcq(this.zzghd.mApplicationContext), this, this.zzghc.zzamu());
        if (this.zzghb) {
            this.zzghd.mHandler.sendMessageDelayed(this.zzghd.mHandler.obtainMessage(1, this.zzghc), this.zzghd.zzggz);
            return;
        }
        this.mState = 2;
        try {
            this.zzghd.zzggx;
            this.zzghd.mApplicationContext.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void zzgs(String str) {
        this.zzghd.mHandler.removeMessages(1, this.zzghc);
        this.zzghd.zzggx;
        this.zzghd.mApplicationContext.unbindService(this);
        this.zzghb = false;
        this.mState = 2;
    }
}
