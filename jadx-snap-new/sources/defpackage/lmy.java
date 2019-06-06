package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;
import defpackage.mzk.c;
import defpackage.mzk.d.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: lmy */
public final class lmy implements mzk {
    final ReentrantLock a = new ReentrantLock();
    Map<b, a> b = ajyx.a;
    private final ajec<c, c> c = new b(this);
    private final ajcx d = this.e.a((mzk.b) mzk.b.a.a.a).a(this.c).e().d();
    private final mzk e;

    /* renamed from: lmy$b */
    static final class b<Upstream, Downstream> implements ajec<c, c> {
        final /* synthetic */ lmy a;

        /* renamed from: lmy$b$1 */
        static final class 1<T> implements ajfb<c> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                c cVar = (c) obj;
                if (cVar instanceof c.a) {
                    Lock lock = this.a.a.a;
                    lock.lock();
                    try {
                        lmy lmy = this.a.a;
                        lmy.b = ajzm.a(lmy.b, ((c.a) cVar).a);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }

        b(lmy lmy) {
            this.a = lmy;
        }

        public final /* synthetic */ ajeb apply(ajdx ajdx) {
            akcr.b(ajdx, "upstream");
            return ajdx.c((ajfb) new 1(this));
        }
    }

    /* renamed from: lmy$d */
    static final class d<V> implements Callable<c> {
        private /* synthetic */ lmy a;
        private /* synthetic */ mzk.b b;

        d(lmy lmy, mzk.b bVar) {
            this.a = lmy;
            this.b = bVar;
        }

        public final /* synthetic */ Object call() {
            c.a aVar;
            Collection<b> collection = ((mzk.b.a.b) this.b).a;
            if (collection.isEmpty()) {
                aVar = new c.a(ajyx.a);
            } else {
                Map map = this.a.b;
                HashMap hashMap = new HashMap(collection.size());
                for (b bVar : collection) {
                    a aVar2 = (a) map.get(bVar);
                    if (aVar2 != null) {
                        hashMap.put(bVar, aVar2);
                    }
                }
                aVar = new c.a(hashMap);
            }
            return aVar;
        }
    }

    /* renamed from: lmy$a */
    static final class a implements ajev {
        private /* synthetic */ lmy a;
        private /* synthetic */ b b;

        a(lmy lmy, b bVar) {
            this.a = lmy;
            this.b = bVar;
        }

        public final void run() {
            Lock lock = this.a.a;
            lock.lock();
            try {
                defpackage.mzk.d.a aVar = (defpackage.mzk.d.a) this.a.b.get(this.b);
                lmy lmy = this.a;
                lmy.b = ajzm.a(lmy.b, ajxs.a(this.b, aVar != null ? new defpackage.mzk.d.a(aVar.a, aVar.b + 1) : new defpackage.mzk.d.a(this.b, 1)));
            } finally {
                lock.unlock();
            }
        }
    }

    /* renamed from: lmy$c */
    static final class c<V> implements Callable<defpackage.mzk.c> {
        private /* synthetic */ lmy a;

        c(lmy lmy) {
            this.a = lmy;
        }

        public final /* synthetic */ Object call() {
            return new defpackage.mzk.c.a(this.a.b);
        }
    }

    public lmy(mzk mzk) {
        akcr.b(mzk, "repository");
        this.e = mzk;
    }

    public final ajcx a(b bVar) {
        akcr.b(bVar, DiscoverStorySnapModel.LENSID);
        Object b = this.d.b((ajdb) this.e.a(bVar)).b((ajev) new a(this, bVar));
        akcr.a(b, "impressionsSupplier.andT…      }\n                }");
        return b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x003a in {2, 4, 7, 9} preds:[]
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
    public final defpackage.ajdx<defpackage.mzk.c> a(defpackage.mzk.b r3) {
        /*
        r2 = this;
        r0 = "criteria";
        defpackage.akcr.b(r3, r0);
        r0 = defpackage.mzk.b.a.a.a;
        r0 = defpackage.akcr.a(r3, r0);
        if (r0 == 0) goto L_0x0020;
        r3 = r2.d;
        r0 = new lmy$c;
        r0.<init>(r2);
        r0 = (java.util.concurrent.Callable) r0;
        r3 = r3.c(r0);
        r0 = "impressionsSupplier.toSi…ssion(impressionsCache) }";
        defpackage.akcr.a(r3, r0);
        return r3;
        r0 = r3 instanceof defpackage.mzk.b.a.b;
        if (r0 == 0) goto L_0x0034;
        r0 = r2.d;
        r1 = new lmy$d;
        r1.<init>(r2, r3);
        r1 = (java.util.concurrent.Callable) r1;
        r3 = r0.c(r1);
        r0 = "impressionsSupplier.toSi…          }\n            }";
        goto L_0x001c;
        r3 = new ajxk;
        r3.<init>();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmy.a(mzk$b):ajdx");
    }
}
