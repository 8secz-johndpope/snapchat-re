package defpackage;

import android.content.Context;
import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.ainf.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: iay */
public final class iay implements hyj {
    private final Context a;
    private final Map<String, icd> b = Collections.synchronizedMap(new LinkedHashMap(5, 0.75f, true));
    private final hzu c;
    private final Object d;
    private final ajwy<hyk> e;
    private volatile boolean f;

    public iay(Context context, SqlDelightDbManager sqlDelightDbManager, ajwy<hyk> ajwy) {
        this.a = context;
        this.c = new hzu(sqlDelightDbManager, ajwy);
        this.d = new Object();
        this.e = ajwy;
    }

    private /* synthetic */ Boolean a(String str, String str2, a aVar) {
        this.c.a(str);
        this.b.remove(str);
        this.a.deleteDatabase(str2);
        return Boolean.TRUE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x002f in {6, 8, 11} preds:[]
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
    private java.util.List<java.lang.String> f() {
        /*
        r4 = this;
        r0 = r4.b;
        monitor-enter(r0);
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x002c }
        r2 = r4.b;	 Catch:{ all -> 0x002c }
        r2 = r2.size();	 Catch:{ all -> 0x002c }
        r1.<init>(r2);	 Catch:{ all -> 0x002c }
        r2 = r4.b;	 Catch:{ all -> 0x002c }
        r2 = r2.values();	 Catch:{ all -> 0x002c }
        r2 = r2.iterator();	 Catch:{ all -> 0x002c }
        r3 = r2.hasNext();	 Catch:{ all -> 0x002c }
        if (r3 == 0) goto L_0x002a;	 Catch:{ all -> 0x002c }
        r3 = r2.next();	 Catch:{ all -> 0x002c }
        r3 = (defpackage.icd) r3;	 Catch:{ all -> 0x002c }
        r3 = r3.a;	 Catch:{ all -> 0x002c }
        r1.add(r3);	 Catch:{ all -> 0x002c }
        goto L_0x0018;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return r1;	 Catch:{ all -> 0x002c }
        r1 = move-exception;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iay.f():java.util.List");
    }

    public final String a(String str) {
        a();
        synchronized (this.b) {
            icd icd = (icd) this.b.get(str);
            ((hyk) this.e.get()).a(icd != null, this.b.size());
            str = icd != null ? icd.a : null;
        }
        return str;
    }

    public final void a() {
        if (!this.f) {
            synchronized (this.d) {
                if (!this.f) {
                    synchronized (this.b) {
                        for (icd icd : this.c.c()) {
                            this.b.put(icd.b, icd);
                        }
                    }
                    this.f = true;
                }
            }
        }
    }

    public final boolean a(icd icd) {
        boolean booleanValue;
        a();
        synchronized (this.b) {
            Boolean bool = (Boolean) this.c.a().callInTransactionImmediately("FideliusDeviceManagerImpl::addFideliusDeviceUser", new -$$Lambda$iay$jS1HbhrXx89wKn0CH8_39WROn0I(this, icd));
            booleanValue = bool == null ? false : bool.booleanValue();
        }
        return booleanValue;
    }

    public final boolean a(String str, String str2) {
        boolean booleanValue;
        synchronized (this.b) {
            Boolean bool = (Boolean) this.c.a().callInTransactionImmediately("FideliusDeviceManagerImpl::removeFideliusDeviceAndDatabase", new -$$Lambda$iay$9owzqKmH_cyVQFDROgH0PMKAsPw(this, str, str2));
            booleanValue = bool == null ? false : bool.booleanValue();
        }
        return booleanValue;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0031 in {6, 8, 11} preds:[]
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
    public final java.util.List<java.lang.String> b() {
        /*
        r4 = this;
        r4.a();
        r0 = r4.b;
        monitor-enter(r0);
        r1 = r4.b;	 Catch:{ all -> 0x002e }
        r1 = r1.size();	 Catch:{ all -> 0x002e }
        r1 = com.google.common.collect.Lists.newArrayListWithExpectedSize(r1);	 Catch:{ all -> 0x002e }
        r2 = r4.b;	 Catch:{ all -> 0x002e }
        r2 = r2.values();	 Catch:{ all -> 0x002e }
        r2 = r2.iterator();	 Catch:{ all -> 0x002e }
        r3 = r2.hasNext();	 Catch:{ all -> 0x002e }
        if (r3 == 0) goto L_0x002c;	 Catch:{ all -> 0x002e }
        r3 = r2.next();	 Catch:{ all -> 0x002e }
        r3 = (defpackage.icd) r3;	 Catch:{ all -> 0x002e }
        r3 = r3.b;	 Catch:{ all -> 0x002e }
        r1.add(r3);	 Catch:{ all -> 0x002e }
        goto L_0x001a;	 Catch:{ all -> 0x002e }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r1;	 Catch:{ all -> 0x002e }
        r1 = move-exception;	 Catch:{ all -> 0x002e }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iay.b():java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0030 in {6, 9, 13} preds:[]
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
    public final java.util.List<java.lang.String> c() {
        /*
        r4 = this;
        r4.a();
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = r4.b;
        monitor-enter(r1);
        r2 = r4.b;	 Catch:{ all -> 0x002d }
        r2 = r2.values();	 Catch:{ all -> 0x002d }
        r2 = r2.iterator();	 Catch:{ all -> 0x002d }
        r3 = r2.hasNext();	 Catch:{ all -> 0x002d }
        if (r3 == 0) goto L_0x0027;	 Catch:{ all -> 0x002d }
        r3 = r2.next();	 Catch:{ all -> 0x002d }
        r3 = (defpackage.icd) r3;	 Catch:{ all -> 0x002d }
        r3 = r3.a;	 Catch:{ all -> 0x002d }
        r0.add(r3);	 Catch:{ all -> 0x002d }
        goto L_0x0015;	 Catch:{ all -> 0x002d }
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        r0 = com.google.common.collect.Lists.newArrayList(r0);
        return r0;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002d }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iay.c():java.util.List");
    }

    public final void d() {
        a();
        synchronized (this.b) {
            this.c.a().callInTransactionImmediately("FideliusDeviceManagerImpl::saveNewDeviceOrder", new -$$Lambda$iay$dhAZctY2EcXBJ97hhtnaTeX2LYI(this));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0038 in {8, 11, 14} preds:[]
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
    public final boolean e() {
        /*
        r4 = this;
        r4.a();
        r0 = r4.b;
        monitor-enter(r0);
        r1 = r4.f();	 Catch:{ all -> 0x0035 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0035 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x0026;	 Catch:{ all -> 0x0035 }
        r2 = r1.next();	 Catch:{ all -> 0x0035 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0035 }
        r3 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x0035 }
        if (r3 != 0) goto L_0x000e;	 Catch:{ all -> 0x0035 }
        r3 = r4.a;	 Catch:{ all -> 0x0035 }
        r3.deleteDatabase(r2);	 Catch:{ all -> 0x0035 }
        goto L_0x000e;	 Catch:{ all -> 0x0035 }
        r1 = r4.b;	 Catch:{ all -> 0x0035 }
        r1.clear();	 Catch:{ all -> 0x0035 }
        r1 = r4.a;	 Catch:{ all -> 0x0035 }
        r2 = "fidelius_database.db";	 Catch:{ all -> 0x0035 }
        r1 = r1.deleteDatabase(r2);	 Catch:{ all -> 0x0035 }
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        return r1;	 Catch:{ all -> 0x0035 }
        r1 = move-exception;	 Catch:{ all -> 0x0035 }
        monitor-exit(r0);	 Catch:{ all -> 0x0035 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iay.e():boolean");
    }
}
