package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: mhn */
public final class mhn {
    private final ConcurrentHashMap<String, Set<ajej>> a = new ConcurrentHashMap();

    /* renamed from: mhn$a */
    static final class a extends akcs implements akbl<String, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((String) obj, "it");
            return Boolean.TRUE;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0048 in {8, 10, 13, 16} preds:[]
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
    private final synchronized java.util.Set<defpackage.ajej> b(defpackage.akbl<? super java.lang.String, java.lang.Boolean> r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x0043 }
        r0.<init>();	 Catch:{ all -> 0x0043 }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x0043 }
        r1 = r4.a;	 Catch:{ all -> 0x0043 }
        r1 = (java.util.Map) r1;	 Catch:{ all -> 0x0043 }
        r1 = r1.entrySet();	 Catch:{ all -> 0x0043 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0043 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x0041;	 Catch:{ all -> 0x0043 }
        r2 = r1.next();	 Catch:{ all -> 0x0043 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0043 }
        r3 = r2.getKey();	 Catch:{ all -> 0x0043 }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x0043 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0043 }
        r2 = (java.util.Set) r2;	 Catch:{ all -> 0x0043 }
        r3 = r5.invoke(r3);	 Catch:{ all -> 0x0043 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0043 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0043 }
        if (r3 == 0) goto L_0x0014;	 Catch:{ all -> 0x0043 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0043 }
        r0.addAll(r2);	 Catch:{ all -> 0x0043 }
        r1.remove();	 Catch:{ all -> 0x0043 }
        goto L_0x0014;
        monitor-exit(r4);
        return r0;
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0045 }
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhn.b(akbl):java.util.Set");
    }

    private synchronized void b(String str, Set<? extends ajej> set) {
        akcr.b(str, "key");
        akcr.b(set, "disposableSet");
        if ((set.isEmpty() ^ 1) != 0) {
            Object set2;
            Map map = this.a;
            Set set3 = (Set) this.a.get(str);
            if (set3 != null) {
                set2 = ajzu.b(set3, (Iterable) set2);
            }
            map.put(str, set2);
        }
    }

    public final synchronized Set<ajej> a(String str) {
        akcr.b(str, "key");
        return (Set) this.a.remove(str);
    }

    public final void a(akbl<? super String, Boolean> akbl) {
        akcr.b(akbl, "selector");
        Set b = b(akbl);
        Object entrySet = this.a.entrySet();
        akcr.a(entrySet, "disposables.entries");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) entrySet) {
            Object obj = (String) ((Entry) next).getKey();
            akcr.a(obj, "key");
            if ((((Boolean) akbl.invoke(obj)).booleanValue() ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Entry value : (List) arrayList) {
            ajyr.a(arrayList2, (Iterable) (Set) value.getValue());
        }
        for (ajej dispose : ajzu.a(b, (Iterable) (List) arrayList2)) {
            dispose.dispose();
        }
    }

    public final void a(String str, ajej ajej) {
        akcr.b(str, "key");
        akcr.b(ajej, "disposable");
        b(str, ajzs.a(ajej));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0052 in {4, 8, 11, 13, 16} preds:[]
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
    public final synchronized void a(java.lang.String r3, java.util.Set<? extends defpackage.ajej> r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "key";	 Catch:{ all -> 0x004f }
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x004f }
        r0 = "disposableSet";	 Catch:{ all -> 0x004f }
        defpackage.akcr.b(r4, r0);	 Catch:{ all -> 0x004f }
        r0 = r2.a;	 Catch:{ all -> 0x004f }
        r0 = r0.get(r3);	 Catch:{ all -> 0x004f }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x004f }
        if (r0 != 0) goto L_0x0019;	 Catch:{ all -> 0x004f }
        r0 = defpackage.ajyy.a;	 Catch:{ all -> 0x004f }
        r0 = (java.util.Set) r0;	 Catch:{ all -> 0x004f }
        r1 = "disposables[key] ?: emptySet()";	 Catch:{ all -> 0x004f }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x004f }
        r1 = r4;	 Catch:{ all -> 0x004f }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x004f }
        r0 = defpackage.ajzu.a(r0, r1);	 Catch:{ all -> 0x004f }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x004f }
        r0 = r0.iterator();	 Catch:{ all -> 0x004f }
        r1 = r0.hasNext();	 Catch:{ all -> 0x004f }
        if (r1 == 0) goto L_0x003b;	 Catch:{ all -> 0x004f }
        r1 = r0.next();	 Catch:{ all -> 0x004f }
        r1 = (defpackage.ajej) r1;	 Catch:{ all -> 0x004f }
        r1.dispose();	 Catch:{ all -> 0x004f }
        goto L_0x002b;	 Catch:{ all -> 0x004f }
        r0 = r4;	 Catch:{ all -> 0x004f }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x004f }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x004f }
        r0 = r0 ^ 1;	 Catch:{ all -> 0x004f }
        if (r0 == 0) goto L_0x004d;	 Catch:{ all -> 0x004f }
        r0 = r2.a;	 Catch:{ all -> 0x004f }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x004f }
        r0.put(r3, r4);	 Catch:{ all -> 0x004f }
        monitor-exit(r2);
        return;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhn.a(java.lang.String, java.util.Set):void");
    }
}
