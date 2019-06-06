package defpackage;

import com.brightcove.player.event.Event;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: hme */
public final class hme<T> {
    final AtomicBoolean a = new AtomicBoolean(true);
    public final Object b = new Object();
    public final Set<hmj> c = new LinkedHashSet();
    final Map<hmj, ajej> d = new LinkedHashMap();
    private final hmg e;
    private final hmo<T> f;
    private final hmm g;

    /* renamed from: hme$c */
    static final class c extends akcs implements akbl<hmj, Boolean> {
        private /* synthetic */ hme a;

        c(hme hme) {
            this.a = hme;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hmj hmj = (hmj) obj;
            akcr.b(hmj, "it");
            return Boolean.valueOf(hmj.d >= 0.75f);
        }
    }

    /* renamed from: hme$a */
    static final class a<T> implements ajfb<Integer> {
        private /* synthetic */ hme a;
        private /* synthetic */ hmj b;

        a(hme hme, hmj hmj) {
            this.a = hme;
            this.b = hmj;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            hme hme = this.a;
            hmj hmj = this.b;
            akcr.a(obj, "it");
            obj = obj.intValue() > 0 ? 1 : null;
            synchronized (hme.b) {
                if (obj != null) {
                    hme.c.add(hmj);
                }
                hme.d.remove(hmj);
            }
            if (obj != null) {
                hme.a();
            }
        }
    }

    /* renamed from: hme$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ hme a;
        private /* synthetic */ hmj b;

        b(hme hme, hmj hmj) {
            this.a = hme;
            this.b = hmj;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            hme hme = this.a;
            hmj hmj = this.b;
            akcr.a(obj, "it");
            synchronized (hme.b) {
                hme.d.remove(hmj);
            }
        }
    }

    public hme(hmg hmg, hmo<T> hmo, hmm hmm) {
        akcr.b(hmg, "snapshot");
        akcr.b(hmo, "downloader");
        akcr.b(hmm, Event.CONFIGURATION);
        this.e = hmg;
        this.f = hmo;
        this.g = hmm;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x00a4 in {2, 9, 23, 27, 29, 33, 36, 38, 41} preds:[]
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
    final void a() {
        /*
        r8 = this;
        r0 = r8.a;
        r0 = r0.get();
        if (r0 != 0) goto L_0x0009;
        return;
        r0 = r8.b;
        monitor-enter(r0);
        r1 = r8.g;	 Catch:{ all -> 0x00a1 }
        r1 = r1.c;	 Catch:{ all -> 0x00a1 }
        r2 = r8.d;	 Catch:{ all -> 0x00a1 }
        r2 = r2.size();	 Catch:{ all -> 0x00a1 }
        r1 = r1 - r2;	 Catch:{ all -> 0x00a1 }
        r2 = 0;	 Catch:{ all -> 0x00a1 }
        r1 = java.lang.Math.max(r1, r2);	 Catch:{ all -> 0x00a1 }
        if (r1 != 0) goto L_0x0020;
        monitor-exit(r0);
        return;
        r2 = r8.e;	 Catch:{ all -> 0x00a1 }
        r2 = r2.a();	 Catch:{ all -> 0x00a1 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x00a1 }
        r2 = defpackage.ajyu.v(r2);	 Catch:{ all -> 0x00a1 }
        r3 = r8.c;	 Catch:{ all -> 0x00a1 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x00a1 }
        r2 = defpackage.akfh.a(r2, r3);	 Catch:{ all -> 0x00a1 }
        r3 = r8.d;	 Catch:{ all -> 0x00a1 }
        r3 = r3.keySet();	 Catch:{ all -> 0x00a1 }
        r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x00a1 }
        r2 = defpackage.akfh.a(r2, r3);	 Catch:{ all -> 0x00a1 }
        r3 = new hme$c;	 Catch:{ all -> 0x00a1 }
        r3.<init>(r8);	 Catch:{ all -> 0x00a1 }
        r3 = (defpackage.akbl) r3;	 Catch:{ all -> 0x00a1 }
        r2 = defpackage.akfh.a(r2, r3);	 Catch:{ all -> 0x00a1 }
        r1 = defpackage.akfh.b(r2, r1);	 Catch:{ all -> 0x00a1 }
        r1 = r1.iterator();	 Catch:{ all -> 0x00a1 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x00a1 }
        if (r2 == 0) goto L_0x009f;	 Catch:{ all -> 0x00a1 }
        r2 = r1.next();	 Catch:{ all -> 0x00a1 }
        r2 = (defpackage.hmj) r2;	 Catch:{ all -> 0x00a1 }
        r3 = r8.b;	 Catch:{ all -> 0x009d }
        monitor-enter(r3);	 Catch:{ all -> 0x009d }
        r4 = r8.c;	 Catch:{ all -> 0x009a }
        r4 = r4.contains(r2);	 Catch:{ all -> 0x009a }
        if (r4 == 0) goto L_0x006c;
        monitor-exit(r3);	 Catch:{ all -> 0x009d }
        goto L_0x0053;
        r4 = r8.d;	 Catch:{ all -> 0x009a }
        r4 = r4.containsKey(r2);	 Catch:{ all -> 0x009a }
        if (r4 == 0) goto L_0x0075;	 Catch:{ all -> 0x009a }
        goto L_0x006a;	 Catch:{ all -> 0x009a }
        r4 = r8.d;	 Catch:{ all -> 0x009a }
        r5 = r8.f;	 Catch:{ all -> 0x009a }
        r6 = r2.e;	 Catch:{ all -> 0x009a }
        r5 = r5.a(r6);	 Catch:{ all -> 0x009a }
        r6 = new hme$a;	 Catch:{ all -> 0x009a }
        r6.<init>(r8, r2);	 Catch:{ all -> 0x009a }
        r6 = (defpackage.ajfb) r6;	 Catch:{ all -> 0x009a }
        r7 = new hme$b;	 Catch:{ all -> 0x009a }
        r7.<init>(r8, r2);	 Catch:{ all -> 0x009a }
        r7 = (defpackage.ajfb) r7;	 Catch:{ all -> 0x009a }
        r5 = r5.a(r6, r7);	 Catch:{ all -> 0x009a }
        r6 = "downloader.prefetch(stor…) }\n                    )";	 Catch:{ all -> 0x009a }
        defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x009a }
        r4.put(r2, r5);	 Catch:{ all -> 0x009a }
        goto L_0x006a;
        r1 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x009d }
        throw r1;	 Catch:{ all -> 0x009d }
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00a1 }
        monitor-exit(r0);
        return;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hme.a():void");
    }
}
