package com.google.android.gms.internal;

import android.content.Context;

@zzabh
public abstract class zzzi extends zzahs {
    protected final Context mContext;
    protected final Object mLock = new Object();
    protected final zzzn zzcoa;
    protected final zzahe zzcob;
    protected zzacj zzcoc;
    protected final Object zzcoe = new Object();

    protected zzzi(Context context, zzahe zzahe, zzzn zzzn) {
        super(true);
        this.mContext = context;
        this.zzcob = zzahe;
        this.zzcoc = zzahe.zzdcw;
        this.zzcoa = zzzn;
    }

    public void onStop() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0063 in {6, 13, 14, 15, 18, 20, 21, 24, 27} preds:[]
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
    public final void zzdo() {
        /*
        r5 = this;
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = "AdRendererBackgroundTask started.";	 Catch:{ all -> 0x0060 }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ all -> 0x0060 }
        r1 = r5.zzcob;	 Catch:{ all -> 0x0060 }
        r1 = r1.errorCode;	 Catch:{ all -> 0x0060 }
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ zzzl -> 0x0014 }
        r5.zze(r2);	 Catch:{ zzzl -> 0x0014 }
        goto L_0x0050;
        r1 = move-exception;
        r2 = r1.getErrorCode();	 Catch:{ all -> 0x0060 }
        r3 = 3;	 Catch:{ all -> 0x0060 }
        if (r2 == r3) goto L_0x0028;	 Catch:{ all -> 0x0060 }
        r3 = -1;	 Catch:{ all -> 0x0060 }
        if (r2 != r3) goto L_0x0020;	 Catch:{ all -> 0x0060 }
        goto L_0x0028;	 Catch:{ all -> 0x0060 }
        r1 = r1.getMessage();	 Catch:{ all -> 0x0060 }
        com.google.android.gms.internal.zzaky.zzcz(r1);	 Catch:{ all -> 0x0060 }
        goto L_0x002f;	 Catch:{ all -> 0x0060 }
        r1 = r1.getMessage();	 Catch:{ all -> 0x0060 }
        com.google.android.gms.internal.zzaky.zzcy(r1);	 Catch:{ all -> 0x0060 }
        r1 = r5.zzcoc;	 Catch:{ all -> 0x0060 }
        if (r1 != 0) goto L_0x003b;	 Catch:{ all -> 0x0060 }
        r1 = new com.google.android.gms.internal.zzacj;	 Catch:{ all -> 0x0060 }
        r1.<init>(r2);	 Catch:{ all -> 0x0060 }
        r5.zzcoc = r1;	 Catch:{ all -> 0x0060 }
        goto L_0x0045;	 Catch:{ all -> 0x0060 }
        r1 = new com.google.android.gms.internal.zzacj;	 Catch:{ all -> 0x0060 }
        r3 = r5.zzcoc;	 Catch:{ all -> 0x0060 }
        r3 = r3.zzcic;	 Catch:{ all -> 0x0060 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0060 }
        goto L_0x0038;	 Catch:{ all -> 0x0060 }
        r1 = com.google.android.gms.internal.zzaij.zzdfn;	 Catch:{ all -> 0x0060 }
        r3 = new com.google.android.gms.internal.zzzj;	 Catch:{ all -> 0x0060 }
        r3.<init>(r5);	 Catch:{ all -> 0x0060 }
        r1.post(r3);	 Catch:{ all -> 0x0060 }
        r1 = r2;	 Catch:{ all -> 0x0060 }
        r1 = r5.zzy(r1);	 Catch:{ all -> 0x0060 }
        r2 = com.google.android.gms.internal.zzaij.zzdfn;	 Catch:{ all -> 0x0060 }
        r3 = new com.google.android.gms.internal.zzzk;	 Catch:{ all -> 0x0060 }
        r3.<init>(r5, r1);	 Catch:{ all -> 0x0060 }
        r2.post(r3);	 Catch:{ all -> 0x0060 }
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return;	 Catch:{ all -> 0x0060 }
        r1 = move-exception;	 Catch:{ all -> 0x0060 }
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzzi.zzdo():void");
    }

    public abstract void zze(long j);

    public abstract zzahd zzy(int i);
}
