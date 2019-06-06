package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hmg */
public final class hmg {
    final ajwl<List<hmj>> a;
    final ajwl<List<hmj>> b;
    private final ConcurrentHashMap<hmh, List<hmj>> c = new ConcurrentHashMap();
    private final Comparator<a> d;

    /* renamed from: hmg$b */
    static final class b<T> implements Comparator<a> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            int a = akcr.a(aVar.b.b, aVar2.b.b);
            int a2 = akcr.a(aVar.a.priority, aVar2.a.priority);
            return a != 0 ? a : a2 != 0 ? a2 : akcr.a(aVar.b.c, aVar2.b.c);
        }
    }

    /* renamed from: hmg$c */
    static final class c extends akcs implements akbl<a, hmj> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            return aVar.b;
        }
    }

    /* renamed from: hmg$a */
    static final class a {
        final hmh a;
        final hmj b;

        public a(hmh hmh, hmj hmj) {
            akcr.b(hmh, "section");
            akcr.b(hmj, "story");
            this.a = hmh;
            this.b = hmj;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.hmg.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.hmg.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hmg$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            hmh hmh = this.a;
            int i = 0;
            int hashCode = (hmh != null ? hmh.hashCode() : 0) * 31;
            hmj hmj = this.b;
            if (hmj != null) {
                i = hmj.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SortableStory(section=");
            stringBuilder.append(this.a);
            stringBuilder.append(", story=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public hmg() {
        Object ajwl = new ajwl();
        String str = "BehaviorSubject.create<List<Story>>()";
        akcr.a(ajwl, str);
        this.a = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.b = ajwl;
        this.d = b.a;
    }

    public final ajxw a(hmh hmh, List<hmj> list) {
        akcr.b(hmh, "section");
        akcr.b(list, "stories");
        Object obj = (List) this.c.put(hmh, list);
        if (obj == null) {
            obj = ajyw.a;
        }
        akcr.a(obj, "storiesBySection.put(section, stories) ?: listOf()");
        Object e = ajyu.e(list, (Iterable) obj);
        if ((((Collection) e).isEmpty() ^ 1) == 0) {
            e = null;
        }
        if (e != null) {
            this.a.a(e);
        }
        obj = ajyu.e((Iterable) obj, list);
        if ((((Collection) obj).isEmpty() ^ 1) == 0) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.b.a(obj);
        return ajxw.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0085 in {7, 8, 10, 12} preds:[]
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
    public final java.util.List<defpackage.hmj> a() {
        /*
        r7 = this;
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0083 }
        r0.<init>();	 Catch:{ all -> 0x0083 }
        r0 = (java.util.List) r0;	 Catch:{ all -> 0x0083 }
        r1 = r7.c;	 Catch:{ all -> 0x0083 }
        r1 = r1.entrySet();	 Catch:{ all -> 0x0083 }
        r2 = "storiesBySection.entries";	 Catch:{ all -> 0x0083 }
        defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x0083 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0083 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0083 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0083 }
        if (r2 == 0) goto L_0x006a;	 Catch:{ all -> 0x0083 }
        r2 = r1.next();	 Catch:{ all -> 0x0083 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0083 }
        r3 = r2.getKey();	 Catch:{ all -> 0x0083 }
        r4 = "entry.key";	 Catch:{ all -> 0x0083 }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0083 }
        r3 = (defpackage.hmh) r3;	 Catch:{ all -> 0x0083 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0083 }
        r4 = "entry.value";	 Catch:{ all -> 0x0083 }
        defpackage.akcr.a(r2, r4);	 Catch:{ all -> 0x0083 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0083 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0083 }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0083 }
        r5 = 10;	 Catch:{ all -> 0x0083 }
        r5 = defpackage.ajyn.a(r2, r5);	 Catch:{ all -> 0x0083 }
        r4.<init>(r5);	 Catch:{ all -> 0x0083 }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x0083 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0083 }
        r5 = r2.hasNext();	 Catch:{ all -> 0x0083 }
        if (r5 == 0) goto L_0x0062;	 Catch:{ all -> 0x0083 }
        r5 = r2.next();	 Catch:{ all -> 0x0083 }
        r5 = (defpackage.hmj) r5;	 Catch:{ all -> 0x0083 }
        r6 = new hmg$a;	 Catch:{ all -> 0x0083 }
        r6.<init>(r3, r5);	 Catch:{ all -> 0x0083 }
        r4.add(r6);	 Catch:{ all -> 0x0083 }
        goto L_0x004d;	 Catch:{ all -> 0x0083 }
        r4 = (java.util.List) r4;	 Catch:{ all -> 0x0083 }
        r4 = (java.util.Collection) r4;	 Catch:{ all -> 0x0083 }
        r0.addAll(r4);	 Catch:{ all -> 0x0083 }
        goto L_0x0018;	 Catch:{ all -> 0x0083 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0083 }
        r0 = defpackage.ajyu.v(r0);	 Catch:{ all -> 0x0083 }
        r1 = r7.d;	 Catch:{ all -> 0x0083 }
        r0 = defpackage.akfh.a(r0, r1);	 Catch:{ all -> 0x0083 }
        r1 = defpackage.hmg.c.a;	 Catch:{ all -> 0x0083 }
        r1 = (defpackage.akbl) r1;	 Catch:{ all -> 0x0083 }
        r0 = defpackage.akfh.c(r0, r1);	 Catch:{ all -> 0x0083 }
        r0 = defpackage.akfh.d(r0);	 Catch:{ all -> 0x0083 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmg.a():java.util.List");
    }

    public final void a(hmh hmh) {
        akcr.b(hmh, "section");
        Object obj = (List) this.c.remove(hmh);
        if (obj == null) {
            obj = ajyw.a;
        }
        akcr.a(obj, "storiesBySection.remove(section) ?: listOf()");
        if ((((Collection) obj).isEmpty() ^ 1) == 0) {
            obj = null;
        }
        if (obj != null) {
            this.b.a(obj);
        }
    }
}
