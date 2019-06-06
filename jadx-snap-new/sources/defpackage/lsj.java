package defpackage;

import defpackage.lrw.a;
import defpackage.lrw.a.c;
import defpackage.lsa.d;
import defpackage.mwa.b;
import java.util.Iterator;
import java.util.List;

/* renamed from: lsj */
public final class lsj {
    static final akbw<lsc, d, lsc> a = b.a;
    static final akbl<b, a.b> b = a.a;

    /* renamed from: lsj$b */
    static final class b extends akcs implements akbw<lsc, d, lsc> {
        public static final b a = new b();

        b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ajxm a;
            lsc lsc = (lsc) obj;
            d dVar = (d) obj2;
            akcr.b(lsc, "<name for destructuring parameter 0>");
            akcr.b(dVar, "current");
            d dVar2 = lsc.a;
            if ((dVar2 instanceof d.a) && (dVar instanceof d.a)) {
                int i;
                d.a aVar = (d.a) dVar2;
                d.a aVar2 = (d.a) dVar;
                int a2 = akcr.a(lsj.a(aVar), lsj.a(aVar2)) ^ 1;
                List a3 = aVar.a();
                List a4 = aVar2.a();
                Iterator it = a3.iterator();
                Iterator it2 = a4.iterator();
                while (true) {
                    i = 0;
                    if (it.hasNext()) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        mux mux = (mux) it2.next();
                        mux mux2 = (mux) it.next();
                        Object obj3 = (akcr.a(mux2.a, mux.a) && akcr.a(mux2.f, mux.f)) ? 1 : null;
                        if (obj3 == null) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        i = 1;
                    }
                }
                a = ajxs.a(Boolean.valueOf(i ^ 1), Boolean.valueOf(a2));
            } else {
                Boolean bool = Boolean.TRUE;
                a = ajxs.a(bool, bool);
            }
            return new lsc(dVar, ((Boolean) a.a).booleanValue(), ((Boolean) a.b).booleanValue());
        }
    }

    /* renamed from: lsj$a */
    static final class a extends akcs implements akbl<b, defpackage.lrw.a.b> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "status");
            int i = lsk.a[bVar.ordinal()];
            if (i == 1) {
                return defpackage.lrw.a.b.DONE;
            }
            if (i == 2) {
                return defpackage.lrw.a.b.IN_PROGRESS;
            }
            if (i == 3) {
                return defpackage.lrw.a.b.IDLE;
            }
            throw new ajxk();
        }
    }

    static final int a(List<? extends a> list) {
        for (Object next : list) {
            if (((a) next) instanceof c) {
                break;
            }
        }
        Object next2 = null;
        a aVar = (a) next2;
        if (aVar != null) {
            Integer a = lsj.a((List) list, aVar);
            if (a != null) {
                return a.intValue();
            }
        }
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0036 in {6, 7, 12, 13, 14, 16} preds:[]
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
    static final int a(java.util.List<? extends defpackage.lrw.a> r3, defpackage.mhs.b r4) {
        /*
        r0 = r3;	 Catch:{ all -> 0x0034 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0034 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0034 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x001f;	 Catch:{ all -> 0x0034 }
        r1 = r0.next();	 Catch:{ all -> 0x0034 }
        r2 = r1;	 Catch:{ all -> 0x0034 }
        r2 = (defpackage.lrw.a) r2;	 Catch:{ all -> 0x0034 }
        r2 = r2.d();	 Catch:{ all -> 0x0034 }
        r2 = defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x0034 }
        if (r2 == 0) goto L_0x0007;	 Catch:{ all -> 0x0034 }
        goto L_0x0020;	 Catch:{ all -> 0x0034 }
        r1 = 0;	 Catch:{ all -> 0x0034 }
        r1 = (defpackage.lrw.a) r1;	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x002f;	 Catch:{ all -> 0x0034 }
        r4 = defpackage.lsj.a(r3, r1);	 Catch:{ all -> 0x0034 }
        if (r4 == 0) goto L_0x002f;	 Catch:{ all -> 0x0034 }
        r3 = r4.intValue();	 Catch:{ all -> 0x0034 }
        goto L_0x0033;	 Catch:{ all -> 0x0034 }
        r3 = defpackage.lsj.a(r3);	 Catch:{ all -> 0x0034 }
        return r3;
        r3 = move-exception;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsj.a(java.util.List, mhs$b):int");
    }

    private static final Integer a(List<? extends a> list, a aVar) {
        int indexOf = list.indexOf(aVar);
        return indexOf == -1 ? null : Integer.valueOf(indexOf);
    }
}
