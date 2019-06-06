package defpackage;

import com.snap.core.db.AllUpdatesProcessor;

/* renamed from: ylf */
public final class ylf implements AllUpdatesProcessor {
    private final ajxe a;
    private final ajxe b;

    /* renamed from: ylf$b */
    static final class b extends akcq implements akbk<yid> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yid) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ylf$a */
    static final class a extends akcq implements akbk<yib> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (yib) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ylf.class), "storyRepository", "getStoryRepository()Lcom/snap/stories/api/StoryRepository;"), new akdc(akde.a(ylf.class), "storiesResponseProcessor", "getStoriesResponseProcessor()Lcom/snap/stories/api/StoriesResponseProcessor;")};
    }

    public ylf(ajwy<yid> ajwy, ajwy<yib> ajwy2) {
        akcr.b(ajwy, "storyRepositoryProvider");
        akcr.b(ajwy2, "storiesResponseProcessorProvider");
        this.a = ajxh.a(new b(ajwy));
        this.b = ajxh.a(new a(ajwy2));
    }

    public final yid a() {
        return (yid) this.a.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x008d in {10, 11, 13, 17, 18, 22, 24, 25, 27} preds:[]
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
    public final void applyUpdates(defpackage.aecy r4, com.snap.core.db.api.SnapDb r5, com.snap.core.db.api.DbTransaction r6) {
        /*
        r3 = this;
        r0 = "updates";
        defpackage.akcr.b(r4, r0);
        r0 = "database";
        defpackage.akcr.b(r5, r0);
        r5 = "tx";
        defpackage.akcr.b(r6, r5);
        if (r4 == 0) goto L_0x006e;
        r5 = r4.g;	 Catch:{ all -> 0x008b }
        if (r5 == 0) goto L_0x006e;	 Catch:{ all -> 0x008b }
        r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x008b }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x008b }
        r0.<init>();	 Catch:{ all -> 0x008b }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x008b }
        r5 = r5.iterator();	 Catch:{ all -> 0x008b }
        r1 = r5.hasNext();	 Catch:{ all -> 0x008b }
        if (r1 == 0) goto L_0x003c;	 Catch:{ all -> 0x008b }
        r1 = r5.next();	 Catch:{ all -> 0x008b }
        r2 = r1;	 Catch:{ all -> 0x008b }
        r2 = (defpackage.ahaz) r2;	 Catch:{ all -> 0x008b }
        r2 = r2.D;	 Catch:{ all -> 0x008b }
        if (r2 == 0) goto L_0x0035;	 Catch:{ all -> 0x008b }
        r2 = 1;	 Catch:{ all -> 0x008b }
        goto L_0x0036;	 Catch:{ all -> 0x008b }
        r2 = 0;	 Catch:{ all -> 0x008b }
        if (r2 == 0) goto L_0x0022;	 Catch:{ all -> 0x008b }
        r0.add(r1);	 Catch:{ all -> 0x008b }
        goto L_0x0022;	 Catch:{ all -> 0x008b }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x008b }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x008b }
        r5 = 10;	 Catch:{ all -> 0x008b }
        r5 = defpackage.ajyn.a(r0, r5);	 Catch:{ all -> 0x008b }
        r5 = defpackage.ajzm.a(r5);	 Catch:{ all -> 0x008b }
        r1 = 16;	 Catch:{ all -> 0x008b }
        r5 = defpackage.akef.b(r5, r1);	 Catch:{ all -> 0x008b }
        r1 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x008b }
        r1.<init>(r5);	 Catch:{ all -> 0x008b }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x008b }
        r5 = r0.iterator();	 Catch:{ all -> 0x008b }
        r0 = r5.hasNext();	 Catch:{ all -> 0x008b }
        if (r0 == 0) goto L_0x0073;	 Catch:{ all -> 0x008b }
        r0 = r5.next();	 Catch:{ all -> 0x008b }
        r2 = r0;	 Catch:{ all -> 0x008b }
        r2 = (defpackage.ahaz) r2;	 Catch:{ all -> 0x008b }
        r2 = r2.D;	 Catch:{ all -> 0x008b }
        r1.put(r2, r0);	 Catch:{ all -> 0x008b }
        goto L_0x005b;	 Catch:{ all -> 0x008b }
        r5 = defpackage.ajyx.a;	 Catch:{ all -> 0x008b }
        r1 = r5;	 Catch:{ all -> 0x008b }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x008b }
        if (r4 == 0) goto L_0x0081;	 Catch:{ all -> 0x008b }
        r5 = r4.e;	 Catch:{ all -> 0x008b }
        if (r5 == 0) goto L_0x0081;	 Catch:{ all -> 0x008b }
        r0 = r3.b();	 Catch:{ all -> 0x008b }
        r2 = 0;	 Catch:{ all -> 0x008b }
        r0.a(r5, r1, r6, r2);	 Catch:{ all -> 0x008b }
        if (r4 == 0) goto L_0x008a;	 Catch:{ all -> 0x008b }
        r5 = r3.a();	 Catch:{ all -> 0x008b }
        r5.a(r4, r6);	 Catch:{ all -> 0x008b }
        return;
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylf.applyUpdates(aecy, com.snap.core.db.api.SnapDb, com.snap.core.db.api.DbTransaction):void");
    }

    public final yib b() {
        return (yib) this.b.b();
    }
}
