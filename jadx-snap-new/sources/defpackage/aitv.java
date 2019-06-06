package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aitv */
public final class aitv {
    private final AtomicReference<aity> a;
    private final CountDownLatch b;
    private aitx c;
    private boolean d;

    /* renamed from: aitv$a */
    public static class a {
        public static final aitv a = new aitv();
    }

    private aitv() {
        this.a = new AtomicReference();
        this.b = new CountDownLatch(1);
        this.d = false;
    }

    /* synthetic */ aitv(byte b) {
        this();
    }

    private void a(aity aity) {
        this.a.set(aity);
        this.b.countDown();
    }

    public final synchronized aitv a(aiqo aiqo, airm airm, aisx aisx, String str, String str2, String str3) {
        aiqo aiqo2 = aiqo;
        synchronized (this) {
            if (this.d) {
                return this;
            }
            if (this.c == null) {
                Context context = aiqo2.f;
                String str4 = airm.d;
                aird aird = new aird();
                String a = aird.a(context);
                String d = airm.d();
                airq airq = new airq();
                aitp aitp = new aitp();
                aitn aitn = new aitn(aiqo2);
                String e = airf.e(context);
                String str5 = str3;
                aitq aitq = new aitq(aiqo2, str5, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{str4}), aisx);
                str5 = airm.b();
                String a2 = airm.a(VERSION.INCREMENTAL);
                str4 = airm.a(VERSION.RELEASE);
                String str6 = str4;
                aitq aitq2 = aitq;
                String a3 = airm.a();
                this.c = new aito(aiqo, new aiua(a, str5, a2, str6, a3, airf.a(airf.g(context)), str2, str, airi.a(d).id, e), airq, aitp, aitn, aitq2);
            }
            this.d = true;
            return this;
        }
    }

    public final aity a() {
        try {
            this.b.await();
            return (aity) this.a.get();
        } catch (InterruptedException unused) {
            aiqj.a().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0014 in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean b() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.c;	 Catch:{ all -> 0x0011 }
        r0 = r0.a();	 Catch:{ all -> 0x0011 }
        r1.a(r0);	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x000f;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x000d;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitv.b():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0024 in {4, 6, 8, 9, 12} preds:[]
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
    public final synchronized boolean c() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.c;	 Catch:{ all -> 0x0021 }
        r1 = defpackage.aitw.SKIP_CACHE_LOOKUP;	 Catch:{ all -> 0x0021 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0021 }
        r5.a(r0);	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001a;	 Catch:{ all -> 0x0021 }
        r1 = defpackage.aiqj.a();	 Catch:{ all -> 0x0021 }
        r2 = "Fabric";	 Catch:{ all -> 0x0021 }
        r3 = "Failed to force reload of settings from Crashlytics.";	 Catch:{ all -> 0x0021 }
        r4 = 0;	 Catch:{ all -> 0x0021 }
        r1.c(r2, r3, r4);	 Catch:{ all -> 0x0021 }
        if (r0 == 0) goto L_0x001f;
        r0 = 1;
        monitor-exit(r5);
        return r0;
        r0 = 0;
        goto L_0x001d;
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitv.c():boolean");
    }
}
