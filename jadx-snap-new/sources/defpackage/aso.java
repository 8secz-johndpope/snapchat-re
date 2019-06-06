package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aso */
final class aso implements UncaughtExceptionHandler {
    final AtomicBoolean a = new AtomicBoolean(false);
    private final a b;
    private final b c;
    private final boolean d;
    private final UncaughtExceptionHandler e;

    /* renamed from: aso$a */
    interface a {
        void a(b bVar, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: aso$b */
    interface b {
        aity a();
    }

    public aso(a aVar, b bVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = aVar;
        this.c = bVar;
        this.d = z;
        this.e = uncaughtExceptionHandler;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0045 in {2, 4, 10, 12} preds:[]
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
    public final void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
        r6 = this;
        r0 = "Crashlytics completed exception processing. Invoking default exception handler.";
        r1 = "CrashlyticsCore";
        r2 = r6.a;
        r3 = 1;
        r2.set(r3);
        r2 = 0;
        r3 = r6.b;	 Catch:{ Exception -> 0x0028 }
        r4 = r6.c;	 Catch:{ Exception -> 0x0028 }
        r5 = r6.d;	 Catch:{ Exception -> 0x0028 }
        r3.a(r4, r7, r8, r5);	 Catch:{ Exception -> 0x0028 }
        r3 = defpackage.aiqj.a();
        r3.a(r1, r0);
        r0 = r6.e;
        r0.uncaughtException(r7, r8);
        r7 = r6.a;
        r7.set(r2);
        return;
        r3 = move-exception;
        goto L_0x0033;
        r3 = move-exception;
        r4 = defpackage.aiqj.a();	 Catch:{ all -> 0x0026 }
        r5 = "An error occurred in the uncaught exception handler";	 Catch:{ all -> 0x0026 }
        r4.c(r1, r5, r3);	 Catch:{ all -> 0x0026 }
        goto L_0x0014;
        r4 = defpackage.aiqj.a();
        r4.a(r1, r0);
        r0 = r6.e;
        r0.uncaughtException(r7, r8);
        r7 = r6.a;
        r7.set(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aso.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
