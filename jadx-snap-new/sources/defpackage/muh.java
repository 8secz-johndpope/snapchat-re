package defpackage;

import defpackage.mip.l;
import defpackage.mwe.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: muh */
public final class muh implements mwe {
    final ConcurrentHashMap<a, ajde<List<mux>>> a = new ConcurrentHashMap();
    private final mwe b;

    /* renamed from: muh$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00b0 in {8, 9, 13, 23, 28, 29, 31, 33, 35} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private static java.util.List<defpackage.mux> a(java.util.List<defpackage.mux> r9) {
            /*
            r0 = "lenses";
            defpackage.akcr.b(r9, r0);
            r0 = r9.size();	 Catch:{ all -> 0x00ae }
            r1 = 1;	 Catch:{ all -> 0x00ae }
            if (r0 > r1) goto L_0x0029;	 Catch:{ all -> 0x00ae }
            r0 = r9;	 Catch:{ all -> 0x00ae }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x00ae }
            r0 = r0.isEmpty();	 Catch:{ all -> 0x00ae }
            r0 = r0 ^ r1;	 Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0028;	 Catch:{ all -> 0x00ae }
            r0 = defpackage.ajyu.f(r9);	 Catch:{ all -> 0x00ae }
            r0 = (defpackage.mux) r0;	 Catch:{ all -> 0x00ae }
            r0 = r0.i;	 Catch:{ all -> 0x00ae }
            r0 = r0.a;	 Catch:{ all -> 0x00ae }
            r1 = defpackage.mvb.NONE;	 Catch:{ all -> 0x00ae }
            if (r0 != r1) goto L_0x0028;	 Catch:{ all -> 0x00ae }
            r9 = defpackage.ajyw.a;	 Catch:{ all -> 0x00ae }
            r9 = (java.util.List) r9;	 Catch:{ all -> 0x00ae }
            return r9;	 Catch:{ all -> 0x00ae }
            r0 = com.google.common.collect.HashMultimap.create();	 Catch:{ all -> 0x00ae }
            r2 = r9;	 Catch:{ all -> 0x00ae }
            r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x00ae }
            r2 = r2.iterator();	 Catch:{ all -> 0x00ae }
            r3 = r2.hasNext();	 Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x004a;	 Catch:{ all -> 0x00ae }
            r3 = r2.next();	 Catch:{ all -> 0x00ae }
            r3 = (defpackage.mux) r3;	 Catch:{ all -> 0x00ae }
            r4 = r3.a;	 Catch:{ all -> 0x00ae }
            r3 = r3.i;	 Catch:{ all -> 0x00ae }
            r3 = r3.a;	 Catch:{ all -> 0x00ae }
            r0.put(r4, r3);	 Catch:{ all -> 0x00ae }
            goto L_0x0034;	 Catch:{ all -> 0x00ae }
            r2 = com.google.common.collect.HashMultimap.create();	 Catch:{ all -> 0x00ae }
            r9 = (java.lang.Iterable) r9;	 Catch:{ all -> 0x00ae }
            r3 = new java.util.ArrayList;	 Catch:{ all -> 0x00ae }
            r3.<init>();	 Catch:{ all -> 0x00ae }
            r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x00ae }
            r9 = r9.iterator();	 Catch:{ all -> 0x00ae }
            r4 = r9.hasNext();	 Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x00ab;	 Catch:{ all -> 0x00ae }
            r4 = r9.next();	 Catch:{ all -> 0x00ae }
            r5 = r4;	 Catch:{ all -> 0x00ae }
            r5 = (defpackage.mux) r5;	 Catch:{ all -> 0x00ae }
            r6 = r5.a;	 Catch:{ all -> 0x00ae }
            r7 = r5.i;	 Catch:{ all -> 0x00ae }
            r7 = r7.a;	 Catch:{ all -> 0x00ae }
            r6 = r2.containsEntry(r6, r7);	 Catch:{ all -> 0x00ae }
            r7 = 0;	 Catch:{ all -> 0x00ae }
            if (r6 != 0) goto L_0x00a5;	 Catch:{ all -> 0x00ae }
            r6 = r5.a;	 Catch:{ all -> 0x00ae }
            r8 = defpackage.mvb.MIXED_FACING;	 Catch:{ all -> 0x00ae }
            r6 = r2.containsEntry(r6, r8);	 Catch:{ all -> 0x00ae }
            if (r6 != 0) goto L_0x00a5;	 Catch:{ all -> 0x00ae }
            r6 = r5.i;	 Catch:{ all -> 0x00ae }
            r6 = r6.a;	 Catch:{ all -> 0x00ae }
            r8 = defpackage.mvb.NONE;	 Catch:{ all -> 0x00ae }
            if (r6 != r8) goto L_0x0088;	 Catch:{ all -> 0x00ae }
            goto L_0x00a5;	 Catch:{ all -> 0x00ae }
            r6 = r5.a;	 Catch:{ all -> 0x00ae }
            r8 = defpackage.mvb.MIXED_FACING;	 Catch:{ all -> 0x00ae }
            r6 = r0.containsEntry(r6, r8);	 Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x009b;	 Catch:{ all -> 0x00ae }
            r6 = r5.i;	 Catch:{ all -> 0x00ae }
            r6 = r6.a;	 Catch:{ all -> 0x00ae }
            r8 = defpackage.mvb.MIXED_FACING;	 Catch:{ all -> 0x00ae }
            if (r6 == r8) goto L_0x009b;	 Catch:{ all -> 0x00ae }
            goto L_0x00a5;	 Catch:{ all -> 0x00ae }
            r6 = r5.a;	 Catch:{ all -> 0x00ae }
            r5 = r5.i;	 Catch:{ all -> 0x00ae }
            r5 = r5.a;	 Catch:{ all -> 0x00ae }
            r2.put(r6, r5);	 Catch:{ all -> 0x00ae }
            r7 = 1;	 Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x005b;	 Catch:{ all -> 0x00ae }
            r3.add(r4);	 Catch:{ all -> 0x00ae }
            goto L_0x005b;	 Catch:{ all -> 0x00ae }
            r3 = (java.util.List) r3;	 Catch:{ all -> 0x00ae }
            return r3;
            r9 = move-exception;
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.muh$c.a(java.util.List):java.util.List");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return c.a((List) obj);
        }
    }

    /* renamed from: muh$a */
    static final class a<T> implements ajfb<akuy> {
        private /* synthetic */ muh a;
        private /* synthetic */ defpackage.mwe.a b;

        a(muh muh, defpackage.mwe.a aVar) {
            this.a = muh;
            this.b = aVar;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: muh$b */
    static final class b implements ajev {
        private /* synthetic */ muh a;
        private /* synthetic */ a b;

        b(muh muh, a aVar) {
            this.a = muh;
            this.b = aVar;
        }

        public final void run() {
            this.a.a.remove(this.b);
        }
    }

    public muh(mwe mwe) {
        akcr.b(mwe, "repository");
        this.b = mwe;
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        ConcurrentMap concurrentMap = this.a;
        Object obj = concurrentMap.get(aVar);
        if (obj == null) {
            obj = this.b.a(aVar).d((ajfc) c.a);
            String str = "repository.query(queryCr…  }\n                    }";
            akcr.a(obj, str);
            String str2 = "DeduplicationLensRepository#query";
            akcr.b(obj, "receiver$0");
            akcr.b(str2, "sectionName");
            obj = obj.a((ajdi) new l(mip.a(str2)));
            akcr.a(obj, "this.compose { upstream …}\n                }\n    }");
            Object aVar2 = new a(this, aVar);
            Object obj2 = ajfu.f;
            Object obj3 = ajfu.c;
            ajfv.a(aVar2, "onSubscribe is null");
            ajfv.a(obj2, "onRequest is null");
            ajfv.a(obj3, "onCancel is null");
            obj = ajvo.a(new ajjh(obj, aVar2, obj2, obj3)).a((ajev) new b(this, aVar));
            akcr.a(obj, str);
            akcr.b(obj, "$receiver");
            obj = obj.a((ajdi) cfb.a());
            akcr.a(obj, "compose(ReplayingShare.instance<T>())");
            Object putIfAbsent = concurrentMap.putIfAbsent(aVar, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        akcr.a(obj, "ongoingQueries.getOrPut(…              }\n        }");
        return (ajde) obj;
    }
}
