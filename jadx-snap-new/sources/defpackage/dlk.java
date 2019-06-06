package defpackage;

/* renamed from: dlk */
public class dlk implements Runnable {
    private final ajxe a;
    private final ajxe b;
    private final ygh c;
    private final ilv d;

    /* renamed from: dlk$c */
    static final class c extends akcq implements akbk<ygi> {
        c(ajwy ajwy) {
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
            return (ygi) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: dlk$b */
    static final class b extends akcq implements akbk<dlt> {
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
            return (dlt) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: dlk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(dlk.class), "fileManager", "getFileManager()Lcom/snap/storage/filemanager/FileManager;"), new akdc(akde.a(dlk.class), "blizzardUploadQueue", "getBlizzardUploadQueue()Lcom/snap/blizzard/v2/uploader/BlizzardUploadQueue;")};
        a aVar = new a();
    }

    public dlk(ajwy<ygi> ajwy, ajwy<dlt> ajwy2, ygh ygh, ilv ilv) {
        akcr.b(ajwy, "fileManagerProvider");
        akcr.b(ajwy2, "blizzardUploadQueueProvider");
        akcr.b(ygh, "fileGroup");
        akcr.b(ilv, "graphene");
        this.c = ygh;
        this.d = ilv;
        this.a = ajxh.a(new c(ajwy));
        this.b = ajxh.a(new b(ajwy2));
    }

    private final ygi a() {
        return (ygi) this.a.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0089 in {7, 9, 14, 15, 17} preds:[]
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
    public void run() {
        /*
        r6 = this;
        r0 = r6.a();	 Catch:{ all -> 0x0087 }
        r1 = r6.c;	 Catch:{ all -> 0x0087 }
        r1 = com.google.common.collect.ImmutableSet.of(r1);	 Catch:{ all -> 0x0087 }
        r1 = (java.util.Set) r1;	 Catch:{ all -> 0x0087 }
        r2 = 0;	 Catch:{ all -> 0x0087 }
        r0.a(r1, r2);	 Catch:{ all -> 0x0087 }
        r0 = r6.a();	 Catch:{ all -> 0x0087 }
        r1 = r6.c;	 Catch:{ all -> 0x0087 }
        r1 = (defpackage.ygl) r1;	 Catch:{ all -> 0x0087 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x0087 }
        r1 = "fileManager.getAllIdsByGroup(fileGroup)";	 Catch:{ all -> 0x0087 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0087 }
        r1 = r6.d;	 Catch:{ all -> 0x0087 }
        r3 = defpackage.ino.FILES_ON_DISK_AT_STARTUP;	 Catch:{ all -> 0x0087 }
        r3 = (defpackage.ily) r3;	 Catch:{ all -> 0x0087 }
        r4 = r0.size();	 Catch:{ all -> 0x0087 }
        r4 = (long) r4;	 Catch:{ all -> 0x0087 }
        r1.b(r3, r4);	 Catch:{ all -> 0x0087 }
        r1 = defpackage.dlm.d;	 Catch:{ all -> 0x0087 }
        r1 = (java.util.Comparator) r1;	 Catch:{ all -> 0x0087 }
        r2 = new defpackage.dlm[r2];	 Catch:{ all -> 0x0087 }
        r1 = defpackage.ajzs.a(r1, r2);	 Catch:{ all -> 0x0087 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0087 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0087 }
        if (r2 == 0) goto L_0x0060;	 Catch:{ all -> 0x0087 }
        r2 = r0.next();	 Catch:{ all -> 0x0087 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0087 }
        r3 = "fileId";	 Catch:{ IllegalArgumentException -> 0x0056 }
        defpackage.akcr.a(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r2 = defpackage.dln.a.a(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        r1.add(r2);	 Catch:{ IllegalArgumentException -> 0x0056 }
        goto L_0x003d;
    L_0x0056:
        r2 = r6.d;	 Catch:{ all -> 0x0087 }
        r3 = defpackage.ino.FILENAME_MALFORMED;	 Catch:{ all -> 0x0087 }
        r3 = (defpackage.ily) r3;	 Catch:{ all -> 0x0087 }
        r2.c(r3, 1);	 Catch:{ all -> 0x0087 }
        goto L_0x003d;	 Catch:{ all -> 0x0087 }
        r0 = r1.iterator();	 Catch:{ all -> 0x0087 }
        r1 = "fileListSorted.iterator()";	 Catch:{ all -> 0x0087 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0087 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0086;	 Catch:{ all -> 0x0087 }
        r1 = r0.next();	 Catch:{ all -> 0x0087 }
        r1 = (defpackage.dlm) r1;	 Catch:{ all -> 0x0087 }
        r2 = r6.b;	 Catch:{ all -> 0x0087 }
        r2 = r2.b();	 Catch:{ all -> 0x0087 }
        r2 = (defpackage.dlt) r2;	 Catch:{ all -> 0x0087 }
        r3 = "fileMetadata";	 Catch:{ all -> 0x0087 }
        defpackage.akcr.a(r1, r3);	 Catch:{ all -> 0x0087 }
        r2.a(r1);	 Catch:{ all -> 0x0087 }
        goto L_0x0069;
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlk.run():void");
    }
}
