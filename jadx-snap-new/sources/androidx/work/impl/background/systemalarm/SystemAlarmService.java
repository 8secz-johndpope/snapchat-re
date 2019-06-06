package androidx.work.impl.background.systemalarm;

import android.arch.lifecycle.LifecycleService;
import android.content.Intent;
import defpackage.pq;
import defpackage.pz;
import defpackage.qo;
import defpackage.qo.b;

public class SystemAlarmService extends LifecycleService implements b {
    private static final String a = pq.a("SystemAlarmService");
    private qo b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0058 in {12, 14, 18} preds:[]
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
    public final void a() {
        /*
        r6 = this;
        r0 = defpackage.pq.a();
        r1 = a;
        r2 = 0;
        r3 = new java.lang.Throwable[r2];
        r4 = "All commands completed in dispatcher";
        r0.a(r1, r4, r3);
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = defpackage.sk.b;
        monitor-enter(r1);
        r3 = defpackage.sk.b;	 Catch:{ all -> 0x0055 }
        r0.putAll(r3);	 Catch:{ all -> 0x0055 }
        monitor-exit(r1);	 Catch:{ all -> 0x0055 }
        r1 = r0.keySet();
        r1 = r1.iterator();
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0051;
        r3 = r1.next();
        r3 = (android.os.PowerManager.WakeLock) r3;
        if (r3 == 0) goto L_0x0024;
        r4 = r3.isHeld();
        if (r4 == 0) goto L_0x0024;
        r4 = 1;
        r4 = new java.lang.Object[r4];
        r3 = r0.get(r3);
        r4[r2] = r3;
        r3 = "WakeLock held for %s";
        r3 = java.lang.String.format(r3, r4);
        r4 = defpackage.pq.a();
        r5 = defpackage.sk.a;
        r4.b(r5, r3);
        goto L_0x0024;
        r6.stopSelf();
        return;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0055 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.SystemAlarmService.a():void");
    }

    public void onCreate() {
        super.onCreate();
        this.b = new qo(this);
        qo qoVar = this.b;
        if (qoVar.i != null) {
            pq.a().c(qo.a, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        qoVar.i = this;
    }

    public void onDestroy() {
        super.onDestroy();
        pz pzVar = this.b;
        pzVar.d.b(pzVar);
        pzVar.i = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            this.b.a(intent, i2);
        }
        return 3;
    }
}
