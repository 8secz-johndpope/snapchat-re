package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;

@zzabh
public final class zzakk {
    private boolean zzaje = false;
    private Context zzajv;
    private final BroadcastReceiver zzdhw = new zzakl(this);
    private final Map<BroadcastReceiver, IntentFilter> zzdhx = new WeakHashMap();
    private boolean zzdhy;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0036 in {8, 10, 13} preds:[]
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
    private final synchronized void zzc(android.content.Context r5, android.content.Intent r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.zzdhx;	 Catch:{ all -> 0x0033 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0033 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0033 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0033 }
        if (r1 == 0) goto L_0x0031;	 Catch:{ all -> 0x0033 }
        r1 = r0.next();	 Catch:{ all -> 0x0033 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0033 }
        r2 = r1.getValue();	 Catch:{ all -> 0x0033 }
        r2 = (android.content.IntentFilter) r2;	 Catch:{ all -> 0x0033 }
        r3 = r6.getAction();	 Catch:{ all -> 0x0033 }
        r2 = r2.hasAction(r3);	 Catch:{ all -> 0x0033 }
        if (r2 == 0) goto L_0x000b;	 Catch:{ all -> 0x0033 }
        r1 = r1.getKey();	 Catch:{ all -> 0x0033 }
        r1 = (android.content.BroadcastReceiver) r1;	 Catch:{ all -> 0x0033 }
        r1.onReceive(r5, r6);	 Catch:{ all -> 0x0033 }
        goto L_0x000b;
        monitor-exit(r4);
        return;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzakk.zzc(android.content.Context, android.content.Intent):void");
    }

    public final synchronized void initialize(Context context) {
        if (!this.zzaje) {
            this.zzajv = context.getApplicationContext();
            if (this.zzajv == null) {
                this.zzajv = context;
            }
            zzoi.initialize(this.zzajv);
            this.zzdhy = ((Boolean) zzlc.zzio().zzd(zzoi.zzbsu)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzajv.registerReceiver(this.zzdhw, intentFilter);
            this.zzaje = true;
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.zzdhy) {
            this.zzdhx.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.zzdhy) {
            this.zzdhx.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
