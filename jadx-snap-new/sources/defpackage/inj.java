package defpackage;

import com.snapchat.client.graphene.ClientMetricsProcessor;
import java.util.ArrayList;

/* renamed from: inj */
public final class inj implements ing, ini {
    final ftl a;
    final ifb b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new a(this));
    private final ajwy<gqr> e;

    /* renamed from: inj$b */
    static final class b extends akcs implements akbk<ClientMetricsProcessor> {
        private /* synthetic */ inj a;

        b(inj inj) {
            this.a = inj;
            super(0);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0134 in {7, 14, 16, 17, 20, 22, 24, 26, 28} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private com.snapchat.client.graphene.ClientMetricsProcessor a() {
            /*
            r11 = this;
            r0 = com.snapchat.client.ClientLoader.checkIfLoadedOrTryToLoad();	 Catch:{ all -> 0x0132 }
            r1 = r0.success;
            if (r1 == 0) goto L_0x010a;
            r0 = defpackage.ink.values();	 Catch:{ all -> 0x0108 }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r2 = r0.length;	 Catch:{ all -> 0x0108 }
            r1.<init>(r2);	 Catch:{ all -> 0x0108 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0108 }
            r2 = r0.length;	 Catch:{ all -> 0x0108 }
            r3 = 0;	 Catch:{ all -> 0x0108 }
            r4 = 0;	 Catch:{ all -> 0x0108 }
            if (r4 >= r2) goto L_0x0025;	 Catch:{ all -> 0x0108 }
            r5 = r0[r4];	 Catch:{ all -> 0x0108 }
            r5 = r5.name();	 Catch:{ all -> 0x0108 }
            r1.add(r5);	 Catch:{ all -> 0x0108 }
            r4 = r4 + 1;	 Catch:{ all -> 0x0108 }
            goto L_0x0017;	 Catch:{ all -> 0x0108 }
            r1 = (java.util.List) r1;	 Catch:{ all -> 0x0108 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0108 }
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r0.<init>();	 Catch:{ all -> 0x0108 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0108 }
            r0 = defpackage.ajyu.b(r1, r0);	 Catch:{ all -> 0x0108 }
            r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0108 }
            r1 = defpackage.ink.values();	 Catch:{ all -> 0x0108 }
            r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r4 = r1.length;	 Catch:{ all -> 0x0108 }
            r2.<init>(r4);	 Catch:{ all -> 0x0108 }
            r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0108 }
            r4 = r1.length;	 Catch:{ all -> 0x0108 }
            r5 = 0;	 Catch:{ all -> 0x0108 }
            if (r5 >= r4) goto L_0x008c;	 Catch:{ all -> 0x0108 }
            r6 = r1[r5];	 Catch:{ all -> 0x0108 }
            r6 = r6.a();	 Catch:{ all -> 0x0108 }
            r7 = "it.metrics";	 Catch:{ all -> 0x0108 }
            defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0108 }
            r7 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r8 = r6.length;	 Catch:{ all -> 0x0108 }
            r7.<init>(r8);	 Catch:{ all -> 0x0108 }
            r7 = (java.util.Collection) r7;	 Catch:{ all -> 0x0108 }
            r8 = r6.length;	 Catch:{ all -> 0x0108 }
            r9 = 0;	 Catch:{ all -> 0x0108 }
            if (r9 >= r8) goto L_0x0075;	 Catch:{ all -> 0x0108 }
            r10 = r6[r9];	 Catch:{ all -> 0x0108 }
            if (r10 == 0) goto L_0x006d;	 Catch:{ all -> 0x0108 }
            r10 = (java.lang.Enum) r10;	 Catch:{ all -> 0x0108 }
            r10 = r10.name();	 Catch:{ all -> 0x0108 }
            r7.add(r10);	 Catch:{ all -> 0x0108 }
            r9 = r9 + 1;	 Catch:{ all -> 0x0108 }
            goto L_0x005b;	 Catch:{ all -> 0x0108 }
            r0 = new ajxt;	 Catch:{ all -> 0x0108 }
            r1 = "null cannot be cast to non-null type kotlin.Enum<*>";	 Catch:{ all -> 0x0108 }
            r0.<init>(r1);	 Catch:{ all -> 0x0108 }
            throw r0;	 Catch:{ all -> 0x0108 }
            r7 = (java.util.List) r7;	 Catch:{ all -> 0x0108 }
            r7 = (java.lang.Iterable) r7;	 Catch:{ all -> 0x0108 }
            r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r6.<init>();	 Catch:{ all -> 0x0108 }
            r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x0108 }
            r6 = defpackage.ajyu.b(r7, r6);	 Catch:{ all -> 0x0108 }
            r6 = (java.util.ArrayList) r6;	 Catch:{ all -> 0x0108 }
            r2.add(r6);	 Catch:{ all -> 0x0108 }
            r5 = r5 + 1;	 Catch:{ all -> 0x0108 }
            goto L_0x0044;	 Catch:{ all -> 0x0108 }
            r2 = (java.util.List) r2;	 Catch:{ all -> 0x0108 }
            r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0108 }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r1.<init>();	 Catch:{ all -> 0x0108 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0108 }
            r1 = defpackage.ajyu.b(r2, r1);	 Catch:{ all -> 0x0108 }
            r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x0108 }
            r6 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0108 }
            r6.<init>(r0);	 Catch:{ all -> 0x0108 }
            r0 = defpackage.ink.values();	 Catch:{ all -> 0x0108 }
            r0 = r0.length;	 Catch:{ all -> 0x0108 }
            r0 = com.snapchat.client.graphene.ConfigureClientMetrics.allClientPartitions(r0);	 Catch:{ all -> 0x0108 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0108 }
            r6.addAll(r0);	 Catch:{ all -> 0x0108 }
            r7 = new java.util.ArrayList;	 Catch:{ all -> 0x0108 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0108 }
            r7.<init>(r1);	 Catch:{ all -> 0x0108 }
            r0 = com.snapchat.client.graphene.ConfigureClientMetrics.allClientMetrics();	 Catch:{ all -> 0x0108 }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0108 }
            r7.addAll(r0);	 Catch:{ all -> 0x0108 }
            r0 = new com.snapchat.client.graphene.StartupConfiguration;	 Catch:{ all -> 0x0108 }
            r1 = r11.a;	 Catch:{ all -> 0x0108 }
            r1 = r1.a;	 Catch:{ all -> 0x0108 }
            r2 = defpackage.ima.BUFFER_SIZE_BYTES;	 Catch:{ all -> 0x0108 }
            r2 = (defpackage.fth) r2;	 Catch:{ all -> 0x0108 }
            r3 = r1.f(r2);	 Catch:{ all -> 0x0108 }
            r1 = r11.a;	 Catch:{ all -> 0x0108 }
            r1 = r1.a;	 Catch:{ all -> 0x0108 }
            r2 = defpackage.ima.RESEVOIR_SIZE;	 Catch:{ all -> 0x0108 }
            r2 = (defpackage.fth) r2;	 Catch:{ all -> 0x0108 }
            r4 = r1.f(r2);	 Catch:{ all -> 0x0108 }
            r5 = new com.snapchat.client.graphene.ApplicationInformation;	 Catch:{ all -> 0x0108 }
            r1 = r11.a;	 Catch:{ all -> 0x0108 }
            r1 = r1.b;	 Catch:{ all -> 0x0108 }
            r1 = r1.h();	 Catch:{ all -> 0x0108 }
            r2 = r11.a;	 Catch:{ all -> 0x0108 }
            r2 = r2.b;	 Catch:{ all -> 0x0108 }
            r2 = r2.k();	 Catch:{ all -> 0x0108 }
            if (r2 != 0) goto L_0x00f2;	 Catch:{ all -> 0x0108 }
            r2 = "PROD";	 Catch:{ all -> 0x0108 }
            r8 = com.snapchat.client.graphene.OperatingSystem.OS_ANDROID;	 Catch:{ all -> 0x0108 }
            r9 = r11.a;	 Catch:{ all -> 0x0108 }
            r9 = r9.b;	 Catch:{ all -> 0x0108 }
            r9 = r9.c();	 Catch:{ all -> 0x0108 }
            r5.<init>(r1, r2, r8, r9);	 Catch:{ all -> 0x0108 }
            r2 = r0;	 Catch:{ all -> 0x0108 }
            r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0108 }
            r0 = com.snapchat.client.graphene.ClientMetricsProcessor.getInstance(r0);	 Catch:{ all -> 0x0108 }
            return r0;
            r0 = move-exception;
            throw r0;
            r1 = new java.lang.Exception;
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = r0.errorType;
            r2.append(r3);
            r3 = 32;
            r2.append(r3);
            r4 = r0.errorName;
            r2.append(r4);
            r2.append(r3);
            r0 = r0.errorReason;
            r2.append(r0);
            r0 = r2.toString();
            r1.<init>(r0);
            r1 = (java.lang.Throwable) r1;
            throw r1;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.inj$b.a():com.snapchat.client.graphene.ClientMetricsProcessor");
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: inj$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ inj a;

        a(inj inj) {
            this.a = inj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.a.a((fth) ima.LOG_METRICS_FRAME));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(inj.class), "nativeProcessor", "getNativeProcessor()Lcom/snapchat/client/graphene/ClientMetricsProcessor;"), new akdc(akde.a(inj.class), "frameLoggingEnabled", "getFrameLoggingEnabled()Z")};
    }

    public inj(ftl ftl, ajwy<gqr> ajwy, ifb ifb) {
        akcr.b(ftl, "config");
        akcr.b(ajwy, "exceptionTracker");
        akcr.b(ifb, "userAgent");
        this.a = ftl;
        this.e = ajwy;
        this.b = ifb;
    }

    private final ClientMetricsProcessor c() {
        return (ClientMetricsProcessor) this.c.b();
    }

    public final long a(int i, int i2, int i3, ArrayList<String> arrayList, long j) {
        akcr.b(arrayList, "dimensions");
        return c().enqueue(i, i2, i3, arrayList, j);
    }

    public final ClientMetricsProcessor a() {
        return c();
    }

    /* JADX WARNING: Missing block: B:26:0x0058, code skipped:
            return null;
     */
    public final synchronized byte[] a(java.lang.String r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = "username";
        defpackage.akcr.b(r6, r0);	 Catch:{ all -> 0x005d }
        r0 = 0;
        r1 = r5.c();	 Catch:{ UnsatisfiedLinkError -> 0x0017 }
        r2 = new com.snapchat.client.graphene.FlushContext;	 Catch:{ UnsatisfiedLinkError -> 0x0017 }
        r2.<init>(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0017 }
        r6 = r1.flushWithContext(r2);	 Catch:{ UnsatisfiedLinkError -> 0x0017 }
        goto L_0x0036;
    L_0x0015:
        r6 = move-exception;
        goto L_0x005c;
    L_0x0017:
        r6 = move-exception;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0015 }
        r2 = 21;
        if (r1 >= r2) goto L_0x0059;
    L_0x001e:
        r1 = r5.e;	 Catch:{ all -> 0x0015 }
        r1 = r1.get();	 Catch:{ all -> 0x0015 }
        r1 = (defpackage.gqr) r1;	 Catch:{ all -> 0x0015 }
        r2 = defpackage.gqt.HIGH;	 Catch:{ all -> 0x0015 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ all -> 0x0015 }
        r3 = defpackage.imo.a;	 Catch:{ all -> 0x0015 }
        r4 = "nativeMetricProcessorFlush";
        r3 = r3.callsite(r4);	 Catch:{ all -> 0x0015 }
        r1.a(r2, r6, r3);	 Catch:{ all -> 0x0015 }
        r6 = r0;
    L_0x0036:
        r1 = r5.d;	 Catch:{ all -> 0x005d }
        r1 = r1.b();	 Catch:{ all -> 0x005d }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x005d }
        r1.booleanValue();	 Catch:{ all -> 0x005d }
        if (r6 == 0) goto L_0x0057;
    L_0x0043:
        r1 = r6.getDiagnostics();	 Catch:{ all -> 0x005d }
        if (r1 == 0) goto L_0x0057;
    L_0x0049:
        r1 = r1.getEnqueueOps();	 Catch:{ all -> 0x005d }
        if (r1 <= 0) goto L_0x0055;
    L_0x004f:
        r6 = r6.getFrame();	 Catch:{ all -> 0x005d }
        monitor-exit(r5);
        return r6;
    L_0x0055:
        monitor-exit(r5);
        return r0;
    L_0x0057:
        monitor-exit(r5);
        return r0;
    L_0x0059:
        r6 = (java.lang.Throwable) r6;	 Catch:{ all -> 0x0015 }
        throw r6;	 Catch:{ all -> 0x0015 }
    L_0x005c:
        throw r6;	 Catch:{ all -> 0x005d }
    L_0x005d:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.inj.a(java.lang.String):byte[]");
    }

    public final synchronized long b() {
        return c().compact();
    }
}
