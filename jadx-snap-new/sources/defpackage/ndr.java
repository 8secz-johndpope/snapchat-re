package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ndr */
public final class ndr implements nde {
    final ajwy<dis> a;
    final ajwy<ncn> b;
    final ajwy<ncs> c;
    private final ajxe d = ajxh.a(new b(this));
    private final ajxe e = ajxh.a(new c(this));
    private final ajxe f = ajxh.a(new d(this));
    private final List<ndq> g = new ArrayList();
    private long h = 60000;
    private long i;

    /* renamed from: ndr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ndr$b */
    static final class b extends akcs implements akbk<dis> {
        private /* synthetic */ ndr a;

        b(ndr ndr) {
            this.a = ndr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dis) this.a.a.get();
        }
    }

    /* renamed from: ndr$c */
    static final class c extends akcs implements akbk<ncn> {
        private /* synthetic */ ndr a;

        c(ndr ndr) {
            this.a = ndr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ncn) this.a.b.get();
        }
    }

    /* renamed from: ndr$d */
    static final class d extends akcs implements akbk<ncs> {
        private /* synthetic */ ndr a;

        d(ndr ndr) {
            this.a = ndr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ncs) this.a.c.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ndr.class), "eventLogger", "getEventLogger()Lcom/snap/blizzard/EventLogger;"), new akdc(akde.a(ndr.class), "nycSharingManager", "getNycSharingManager()Lcom/snap/location/NycSharingManager;"), new akdc(akde.a(ndr.class), "userGdprProvider", "getUserGdprProvider()Lcom/snap/location/UserGDPRInformationProvider;")};
        a aVar = new a();
    }

    public ndr(ajwy<dis> ajwy, ajwy<ncn> ajwy2, ajwy<ncs> ajwy3) {
        akcr.b(ajwy, "eventLoggerProvider");
        akcr.b(ajwy2, "nycSharingManagerProvider");
        akcr.b(ajwy3, "userGdprProviderProvider");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:50:0x0152 in {3, 7, 8, 10, 11, 16, 19, 20, 23, 24, 28, 29, 30, 34, 39, 40, 41, 42, 43, 44, 46, 49} preds:[]
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
    public final synchronized void a(android.location.Location r15) {
        /*
        r14 = this;
        monitor-enter(r14);
        if (r15 != 0) goto L_0x0005;
        monitor-exit(r14);
        return;
        r0 = new ndq;	 Catch:{ all -> 0x014f }
        r0.<init>(r15);	 Catch:{ all -> 0x014f }
        r1 = r14.g;	 Catch:{ all -> 0x014f }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x014f }
        r2 = 1;	 Catch:{ all -> 0x014f }
        if (r1 == 0) goto L_0x0015;	 Catch:{ all -> 0x014f }
        r1 = 0;	 Catch:{ all -> 0x014f }
        goto L_0x0024;	 Catch:{ all -> 0x014f }
        r1 = r14.g;	 Catch:{ all -> 0x014f }
        r3 = r14.g;	 Catch:{ all -> 0x014f }
        r3 = r3.size();	 Catch:{ all -> 0x014f }
        r3 = r3 - r2;	 Catch:{ all -> 0x014f }
        r1 = r1.get(r3);	 Catch:{ all -> 0x014f }
        r1 = (defpackage.ndq) r1;	 Catch:{ all -> 0x014f }
        if (r1 != 0) goto L_0x002c;	 Catch:{ all -> 0x014f }
        r15 = r14.g;	 Catch:{ all -> 0x014f }
        r15.add(r0);	 Catch:{ all -> 0x014f }
        goto L_0x0060;	 Catch:{ all -> 0x014f }
        r3 = r15.getTime();	 Catch:{ all -> 0x014f }
        r5 = defpackage.ndq.d;	 Catch:{ all -> 0x014f }
        r3 = r3 / r5;	 Catch:{ all -> 0x014f }
        r15 = r1.a;	 Catch:{ all -> 0x014f }
        r5 = r15.getTime();	 Catch:{ all -> 0x014f }
        r7 = defpackage.ndq.d;	 Catch:{ all -> 0x014f }
        r5 = r5 / r7;	 Catch:{ all -> 0x014f }
        r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ all -> 0x014f }
        if (r15 <= 0) goto L_0x0060;	 Catch:{ all -> 0x014f }
        r15 = r1.b;	 Catch:{ all -> 0x014f }
        r7 = r15.id();	 Catch:{ all -> 0x014f }
        r15 = r0.b;	 Catch:{ all -> 0x014f }
        r9 = r15.id();	 Catch:{ all -> 0x014f }
        r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));	 Catch:{ all -> 0x014f }
        if (r15 == 0) goto L_0x0053;	 Catch:{ all -> 0x014f }
        r15 = r14.g;	 Catch:{ all -> 0x014f }
        goto L_0x0028;	 Catch:{ all -> 0x014f }
        r3 = r3 - r5;	 Catch:{ all -> 0x014f }
        r5 = 60;	 Catch:{ all -> 0x014f }
        r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ all -> 0x014f }
        if (r15 > 0) goto L_0x005d;	 Catch:{ all -> 0x014f }
        r1.c = r3;	 Catch:{ all -> 0x014f }
        goto L_0x0060;	 Catch:{ all -> 0x014f }
        r15 = r14.g;	 Catch:{ all -> 0x014f }
        goto L_0x0028;	 Catch:{ all -> 0x014f }
        r15 = r14.g;	 Catch:{ all -> 0x014f }
        r15 = r15.size();	 Catch:{ all -> 0x014f }
        r1 = 60;	 Catch:{ all -> 0x014f }
        r3 = 0;	 Catch:{ all -> 0x014f }
        if (r15 < r1) goto L_0x006d;	 Catch:{ all -> 0x014f }
        r15 = 1;	 Catch:{ all -> 0x014f }
        goto L_0x006e;	 Catch:{ all -> 0x014f }
        r15 = 0;	 Catch:{ all -> 0x014f }
        if (r15 != 0) goto L_0x0082;	 Catch:{ all -> 0x014f }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x014f }
        r6 = r14.i;	 Catch:{ all -> 0x014f }
        r4 = r4 - r6;	 Catch:{ all -> 0x014f }
        r6 = r14.h;	 Catch:{ all -> 0x014f }
        r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x014f }
        if (r15 < 0) goto L_0x007f;	 Catch:{ all -> 0x014f }
        r15 = 1;	 Catch:{ all -> 0x014f }
        goto L_0x0080;	 Catch:{ all -> 0x014f }
        r15 = 0;	 Catch:{ all -> 0x014f }
        if (r15 == 0) goto L_0x014d;	 Catch:{ all -> 0x014f }
        r15 = com.google.common.collect.Lists.newArrayList();	 Catch:{ all -> 0x014f }
        r1 = r14.g;	 Catch:{ all -> 0x014f }
        r1 = r1.iterator();	 Catch:{ all -> 0x014f }
        r4 = r1.hasNext();	 Catch:{ all -> 0x014f }
        r5 = 2;	 Catch:{ all -> 0x014f }
        if (r4 == 0) goto L_0x00d5;	 Catch:{ all -> 0x014f }
        r4 = r1.next();	 Catch:{ all -> 0x014f }
        r4 = (defpackage.ndq) r4;	 Catch:{ all -> 0x014f }
        r6 = java.util.Locale.US;	 Catch:{ all -> 0x014f }
        r7 = "Locale.US";	 Catch:{ all -> 0x014f }
        defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x014f }
        r7 = "%d+%d~%s";	 Catch:{ all -> 0x014f }
        r8 = 3;	 Catch:{ all -> 0x014f }
        r9 = new java.lang.Object[r8];	 Catch:{ all -> 0x014f }
        r10 = r4.a;	 Catch:{ all -> 0x014f }
        r10 = r10.getTime();	 Catch:{ all -> 0x014f }
        r12 = defpackage.ndq.d;	 Catch:{ all -> 0x014f }
        r10 = r10 / r12;	 Catch:{ all -> 0x014f }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014f }
        r9[r3] = r10;	 Catch:{ all -> 0x014f }
        r10 = r4.c;	 Catch:{ all -> 0x014f }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x014f }
        r9[r2] = r10;	 Catch:{ all -> 0x014f }
        r4 = r4.b;	 Catch:{ all -> 0x014f }
        r4 = r4.toToken();	 Catch:{ all -> 0x014f }
        r9[r5] = r4;	 Catch:{ all -> 0x014f }
        r4 = java.util.Arrays.copyOf(r9, r8);	 Catch:{ all -> 0x014f }
        r4 = java.lang.String.format(r6, r7, r4);	 Catch:{ all -> 0x014f }
        r5 = "java.lang.String.format(locale, format, *args)";	 Catch:{ all -> 0x014f }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x014f }
        r15.add(r4);	 Catch:{ all -> 0x014f }
        goto L_0x008c;	 Catch:{ all -> 0x014f }
        r1 = new aaod;	 Catch:{ all -> 0x014f }
        r1.<init>();	 Catch:{ all -> 0x014f }
        r3 = ",";	 Catch:{ all -> 0x014f }
        r3 = com.google.common.base.Joiner.on(r3);	 Catch:{ all -> 0x014f }
        r15 = (java.lang.Iterable) r15;	 Catch:{ all -> 0x014f }
        r15 = r3.join(r15);	 Catch:{ all -> 0x014f }
        r1.b(r15);	 Catch:{ all -> 0x014f }
        r15 = r0.b;	 Catch:{ all -> 0x014f }
        r15 = r15.toToken();	 Catch:{ all -> 0x014f }
        r1.a(r15);	 Catch:{ all -> 0x014f }
        r15 = r14.e;	 Catch:{ all -> 0x014f }
        r15 = r15.b();	 Catch:{ all -> 0x014f }
        r15 = (defpackage.ncn) r15;	 Catch:{ all -> 0x014f }
        r0 = r14.f;	 Catch:{ all -> 0x014f }
        r0 = r0.b();	 Catch:{ all -> 0x014f }
        r0 = (defpackage.ncs) r0;	 Catch:{ all -> 0x014f }
        r15 = r15.a(r0);	 Catch:{ all -> 0x014f }
        r0 = "nycSharingManager.getGDP…ettings(userGdprProvider)";	 Catch:{ all -> 0x014f }
        defpackage.akcr.a(r15, r0);	 Catch:{ all -> 0x014f }
        r0 = r15.a();	 Catch:{ all -> 0x014f }
        r3 = (long) r0;	 Catch:{ all -> 0x014f }
        r0 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x014f }
        r1.a(r0);	 Catch:{ all -> 0x014f }
        r0 = r15.c();	 Catch:{ all -> 0x014f }
        r1.c(r0);	 Catch:{ all -> 0x014f }
        r15 = r15.b();	 Catch:{ all -> 0x014f }
        if (r15 == 0) goto L_0x0132;	 Catch:{ all -> 0x014f }
        if (r15 == r2) goto L_0x012f;	 Catch:{ all -> 0x014f }
        if (r15 == r5) goto L_0x0129;	 Catch:{ all -> 0x014f }
        goto L_0x0135;	 Catch:{ all -> 0x014f }
        r15 = defpackage.aaoe.NO;	 Catch:{ all -> 0x014f }
        r1.a(r15);	 Catch:{ all -> 0x014f }
        goto L_0x0135;	 Catch:{ all -> 0x014f }
        r15 = defpackage.aaoe.YES;	 Catch:{ all -> 0x014f }
        goto L_0x012b;	 Catch:{ all -> 0x014f }
        r15 = defpackage.aaoe.UNKNOWN;	 Catch:{ all -> 0x014f }
        goto L_0x012b;	 Catch:{ all -> 0x014f }
        r15 = r14.d;	 Catch:{ all -> 0x014f }
        r15 = r15.b();	 Catch:{ all -> 0x014f }
        r15 = (defpackage.dis) r15;	 Catch:{ all -> 0x014f }
        r1 = (defpackage.aajt) r1;	 Catch:{ all -> 0x014f }
        r15.a(r1);	 Catch:{ all -> 0x014f }
        r15 = r14.g;	 Catch:{ all -> 0x014f }
        r15.clear();	 Catch:{ all -> 0x014f }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x014f }
        r14.i = r0;	 Catch:{ all -> 0x014f }
        monitor-exit(r14);
        return;
        r15 = move-exception;
        monitor-exit(r14);
        throw r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndr.a(android.location.Location):void");
    }
}
