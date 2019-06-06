package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;

/* renamed from: ftl */
public final class ftl {
    private final List<aipn<ftk>> a;
    private final ajdx<iha> b;

    public ftl(List<aipn<ftk>> list, ajdx<iha> ajdx) {
        this.a = list;
        this.b = ajdx;
        a(zgb.a(ftf.a.callsite("CompositeConfigurationProvider")));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0060 in {9, 11, 13, 15} preds:[]
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
    private /* synthetic */ java.lang.Long A(defpackage.fth r4) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x005e }
        r0 = r0.b;	 Catch:{ all -> 0x005e }
        r1 = defpackage.fti.LONG;	 Catch:{ all -> 0x005e }
        if (r0 != r1) goto L_0x0044;	 Catch:{ all -> 0x005e }
        r0 = r3.a;	 Catch:{ all -> 0x005e }
        r0 = r0.iterator();	 Catch:{ all -> 0x005e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x005e }
        r1 = r0.next();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.get();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.e(r4);	 Catch:{ all -> 0x005e }
        r2 = r1.isPresent();	 Catch:{ all -> 0x005e }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x005e }
        r4 = r1.get();	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Long) r4;	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.a;	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Number) r4;	 Catch:{ all -> 0x005e }
        r0 = r4.longValue();	 Catch:{ all -> 0x005e }
        r4 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x005e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r2 = "Attempting to get long for configuration of type ";	 Catch:{ all -> 0x005e }
        r1.<init>(r2);	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.b;	 Catch:{ all -> 0x005e }
        r1.append(r4);	 Catch:{ all -> 0x005e }
        r4 = r1.toString();	 Catch:{ all -> 0x005e }
        r0.<init>(r4);	 Catch:{ all -> 0x005e }
        throw r0;	 Catch:{ all -> 0x005e }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.A(fth):java.lang.Long");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0060 in {9, 11, 13, 15} preds:[]
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
    private /* synthetic */ java.lang.Integer B(defpackage.fth r4) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x005e }
        r0 = r0.b;	 Catch:{ all -> 0x005e }
        r1 = defpackage.fti.INTEGER;	 Catch:{ all -> 0x005e }
        if (r0 != r1) goto L_0x0044;	 Catch:{ all -> 0x005e }
        r0 = r3.a;	 Catch:{ all -> 0x005e }
        r0 = r0.iterator();	 Catch:{ all -> 0x005e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x005e }
        r1 = r0.next();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.get();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.d(r4);	 Catch:{ all -> 0x005e }
        r2 = r1.isPresent();	 Catch:{ all -> 0x005e }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x005e }
        r4 = r1.get();	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Integer) r4;	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.a;	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Number) r4;	 Catch:{ all -> 0x005e }
        r4 = r4.intValue();	 Catch:{ all -> 0x005e }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x005e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r2 = "Attempting to get int for configuration of type ";	 Catch:{ all -> 0x005e }
        r1.<init>(r2);	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.b;	 Catch:{ all -> 0x005e }
        r1.append(r4);	 Catch:{ all -> 0x005e }
        r4 = r1.toString();	 Catch:{ all -> 0x005e }
        r0.<init>(r4);	 Catch:{ all -> 0x005e }
        throw r0;	 Catch:{ all -> 0x005e }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.B(fth):java.lang.Integer");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0060 in {9, 11, 13, 15} preds:[]
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
    private /* synthetic */ java.lang.Double C(defpackage.fth r4) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x005e }
        r0 = r0.b;	 Catch:{ all -> 0x005e }
        r1 = defpackage.fti.DOUBLE;	 Catch:{ all -> 0x005e }
        if (r0 != r1) goto L_0x0044;	 Catch:{ all -> 0x005e }
        r0 = r3.a;	 Catch:{ all -> 0x005e }
        r0 = r0.iterator();	 Catch:{ all -> 0x005e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x005e }
        r1 = r0.next();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.get();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.c(r4);	 Catch:{ all -> 0x005e }
        r2 = r1.isPresent();	 Catch:{ all -> 0x005e }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x005e }
        r4 = r1.get();	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Double) r4;	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.a;	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Number) r4;	 Catch:{ all -> 0x005e }
        r0 = r4.doubleValue();	 Catch:{ all -> 0x005e }
        r4 = java.lang.Double.valueOf(r0);	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x005e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r2 = "Attempting to get double for configuration of type ";	 Catch:{ all -> 0x005e }
        r1.<init>(r2);	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.b;	 Catch:{ all -> 0x005e }
        r1.append(r4);	 Catch:{ all -> 0x005e }
        r4 = r1.toString();	 Catch:{ all -> 0x005e }
        r0.<init>(r4);	 Catch:{ all -> 0x005e }
        throw r0;	 Catch:{ all -> 0x005e }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.C(fth):java.lang.Double");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0060 in {9, 11, 13, 15} preds:[]
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
    private /* synthetic */ java.lang.Float D(defpackage.fth r4) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x005e }
        r0 = r0.b;	 Catch:{ all -> 0x005e }
        r1 = defpackage.fti.FLOAT;	 Catch:{ all -> 0x005e }
        if (r0 != r1) goto L_0x0044;	 Catch:{ all -> 0x005e }
        r0 = r3.a;	 Catch:{ all -> 0x005e }
        r0 = r0.iterator();	 Catch:{ all -> 0x005e }
        r1 = r0.hasNext();	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x005e }
        r1 = r0.next();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.get();	 Catch:{ all -> 0x005e }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x005e }
        r1 = r1.b(r4);	 Catch:{ all -> 0x005e }
        r2 = r1.isPresent();	 Catch:{ all -> 0x005e }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x005e }
        r4 = r1.get();	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Float) r4;	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.a;	 Catch:{ all -> 0x005e }
        r4 = (java.lang.Number) r4;	 Catch:{ all -> 0x005e }
        r4 = r4.floatValue();	 Catch:{ all -> 0x005e }
        r4 = java.lang.Float.valueOf(r4);	 Catch:{ all -> 0x005e }
        return r4;	 Catch:{ all -> 0x005e }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x005e }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r2 = "Attempting to get float for configuration of type ";	 Catch:{ all -> 0x005e }
        r1.<init>(r2);	 Catch:{ all -> 0x005e }
        r4 = r4.a();	 Catch:{ all -> 0x005e }
        r4 = r4.b;	 Catch:{ all -> 0x005e }
        r1.append(r4);	 Catch:{ all -> 0x005e }
        r4 = r1.toString();	 Catch:{ all -> 0x005e }
        r0.<init>(r4);	 Catch:{ all -> 0x005e }
        throw r0;	 Catch:{ all -> 0x005e }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.D(fth):java.lang.Float");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0058 in {9, 11, 13, 15} preds:[]
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
    private /* synthetic */ java.lang.Boolean E(defpackage.fth r4) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x0056 }
        r0 = r0.b;	 Catch:{ all -> 0x0056 }
        r1 = defpackage.fti.BOOLEAN;	 Catch:{ all -> 0x0056 }
        if (r0 != r1) goto L_0x003c;	 Catch:{ all -> 0x0056 }
        r0 = r3.a;	 Catch:{ all -> 0x0056 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0056 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0056 }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x0056 }
        r1 = r0.next();	 Catch:{ all -> 0x0056 }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x0056 }
        r1 = r1.get();	 Catch:{ all -> 0x0056 }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x0056 }
        r1 = r1.a(r4);	 Catch:{ all -> 0x0056 }
        r2 = r1.isPresent();	 Catch:{ all -> 0x0056 }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x0056 }
        r4 = r1.get();	 Catch:{ all -> 0x0056 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x0056 }
        return r4;	 Catch:{ all -> 0x0056 }
        r4 = r4.a();	 Catch:{ all -> 0x0056 }
        r4 = r4.a;	 Catch:{ all -> 0x0056 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x0056 }
        return r4;	 Catch:{ all -> 0x0056 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0056 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0056 }
        r2 = "Attempting to get boolean for configuration of type ";	 Catch:{ all -> 0x0056 }
        r1.<init>(r2);	 Catch:{ all -> 0x0056 }
        r4 = r4.a();	 Catch:{ all -> 0x0056 }
        r4 = r4.b;	 Catch:{ all -> 0x0056 }
        r1.append(r4);	 Catch:{ all -> 0x0056 }
        r4 = r1.toString();	 Catch:{ all -> 0x0056 }
        r0.<init>(r4);	 Catch:{ all -> 0x0056 }
        throw r0;	 Catch:{ all -> 0x0056 }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.E(fth):java.lang.Boolean");
    }

    private <T> ajdp<T> a(fth fth, ajfc<Object, T> ajfc) {
        return ajdp.a(new -$$Lambda$ftl$4-OJTNQQzeVyKeY-q12sHJEHLs4(this, fth, ajfc));
    }

    private static ftk a(aipn<ftk> aipn) {
        return (ftk) aipn.get();
    }

    private /* synthetic */ Object a(fth fth, ajfc ajfc, Object[] objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Optional optional = (Optional) objArr[i];
            if (optional.isPresent()) {
                ((ftk) ((aipn) this.a.get(i)).get()).h(fth);
                try {
                    optional = ajfc.apply(optional.get());
                    if (optional != null) {
                        return optional;
                    }
                } catch (ClassCastException e) {
                    ftk ftk = (ftk) ((aipn) this.a.get(i)).get();
                    ClassCastException classCastException = new ClassCastException(String.format(Locale.US, "%s attempted a bad cast for value {%s}. Error: %s", new Object[]{ftk.getClass().getSimpleName(), optional.get(), e.getMessage()}));
                    classCastException.setStackTrace(e.getStackTrace());
                    try {
                        classCastException.initCause(e.getCause());
                    } catch (Exception unused) {
                    }
                    throw classCastException;
                }
            }
        }
        return ajfc.apply(fth.a().a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0065 in {10, 12, 14, 16} preds:[]
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
    private <T> T a(defpackage.fth r4, com.google.common.base.Function<java.lang.String, T> r5) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x0063 }
        r0 = r0.b;	 Catch:{ all -> 0x0063 }
        r1 = defpackage.fti.STRING;	 Catch:{ all -> 0x0063 }
        if (r0 != r1) goto L_0x0044;	 Catch:{ all -> 0x0063 }
        r0 = r3.a;	 Catch:{ all -> 0x0063 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0063 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0063 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ all -> 0x0063 }
        r1 = r0.next();	 Catch:{ all -> 0x0063 }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x0063 }
        r1 = r1.get();	 Catch:{ all -> 0x0063 }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x0063 }
        r1 = r1.f(r4);	 Catch:{ all -> 0x0063 }
        r2 = r1.isPresent();	 Catch:{ all -> 0x0063 }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x0063 }
        r1 = r1.get();	 Catch:{ all -> 0x0063 }
        r1 = r5.apply(r1);	 Catch:{ all -> 0x0063 }
        if (r1 == 0) goto L_0x0010;	 Catch:{ all -> 0x0063 }
        return r1;	 Catch:{ all -> 0x0063 }
        r4 = r4.a();	 Catch:{ all -> 0x0063 }
        r4 = r4.a;	 Catch:{ all -> 0x0063 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0063 }
        r4 = r5.apply(r4);	 Catch:{ all -> 0x0063 }
        return r4;	 Catch:{ all -> 0x0063 }
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0063 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0063 }
        r1 = "Attempting to get object for configuration of type ";	 Catch:{ all -> 0x0063 }
        r0.<init>(r1);	 Catch:{ all -> 0x0063 }
        r4 = r4.a();	 Catch:{ all -> 0x0063 }
        r4 = r4.b;	 Catch:{ all -> 0x0063 }
        r0.append(r4);	 Catch:{ all -> 0x0063 }
        r4 = " (needs to be STRING)";	 Catch:{ all -> 0x0063 }
        r0.append(r4);	 Catch:{ all -> 0x0063 }
        r4 = r0.toString();	 Catch:{ all -> 0x0063 }
        r5.<init>(r4);	 Catch:{ all -> 0x0063 }
        throw r5;	 Catch:{ all -> 0x0063 }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.a(fth, com.google.common.base.Function):java.lang.Object");
    }

    private void a(zfw zfw) {
        for (aipn -__lambda_ftl_pcxboy5ahcbxcztcu8aon9xtwz4 : this.a) {
            ajcx.a(new -$$Lambda$ftl$pcXboY5AHCbXCztCU8aoN9XtwZ4(this, -__lambda_ftl_pcxboy5ahcbxcztcu8aon9xtwz4)).b((ajdw) zfw.b()).e();
        }
    }

    private <T> ajdp<T> b(fth fth, ajfc<Object, T> ajfc) {
        Iterable newArrayListWithCapacity = Lists.newArrayListWithCapacity(this.a.size());
        for (aipn aipn : this.a) {
            ajdp g = ((ftk) aipn.get()).g(fth);
            if (g != null) {
                newArrayListWithCapacity.add(g);
            }
        }
        if (!newArrayListWithCapacity.isEmpty()) {
            return ajdp.a(newArrayListWithCapacity, new -$$Lambda$ftl$NRYLkBz0oxNYqZXuVMMOGaqnmJI(this, fth, ajfc)).j(ajfu.a);
        }
        Object fth2;
        try {
            fth2 = ajdp.b(ajfc.apply(fth2.a().a));
            return fth2;
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid default for key ".concat(String.valueOf(fth2)), e);
        }
    }

    private /* synthetic */ ajdt c(fth fth, ajfc ajfc) {
        return b(fth, ajfc);
    }

    private <T> ajdp<T> x(fth fth) {
        return a(fth, -$$Lambda$ftl$2oZtTxuTBo3iBXU6gXzh8OtBpaE.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0058 in {9, 11, 13, 15} preds:[]
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
    private /* synthetic */ java.lang.String z(defpackage.fth r4) {
        /*
        r3 = this;
        r0 = r4.a();	 Catch:{ all -> 0x0056 }
        r0 = r0.b;	 Catch:{ all -> 0x0056 }
        r1 = defpackage.fti.STRING;	 Catch:{ all -> 0x0056 }
        if (r0 != r1) goto L_0x003c;	 Catch:{ all -> 0x0056 }
        r0 = r3.a;	 Catch:{ all -> 0x0056 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0056 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0056 }
        if (r1 == 0) goto L_0x0033;	 Catch:{ all -> 0x0056 }
        r1 = r0.next();	 Catch:{ all -> 0x0056 }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x0056 }
        r1 = r1.get();	 Catch:{ all -> 0x0056 }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x0056 }
        r1 = r1.f(r4);	 Catch:{ all -> 0x0056 }
        r2 = r1.isPresent();	 Catch:{ all -> 0x0056 }
        if (r2 == 0) goto L_0x0010;	 Catch:{ all -> 0x0056 }
        r4 = r1.get();	 Catch:{ all -> 0x0056 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0056 }
        return r4;	 Catch:{ all -> 0x0056 }
        r4 = r4.a();	 Catch:{ all -> 0x0056 }
        r4 = r4.a;	 Catch:{ all -> 0x0056 }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x0056 }
        return r4;	 Catch:{ all -> 0x0056 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0056 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0056 }
        r2 = "Attempting to get string for configuration of type ";	 Catch:{ all -> 0x0056 }
        r1.<init>(r2);	 Catch:{ all -> 0x0056 }
        r4 = r4.a();	 Catch:{ all -> 0x0056 }
        r4 = r4.b;	 Catch:{ all -> 0x0056 }
        r1.append(r4);	 Catch:{ all -> 0x0056 }
        r4 = r1.toString();	 Catch:{ all -> 0x0056 }
        r0.<init>(r4);	 Catch:{ all -> 0x0056 }
        throw r0;	 Catch:{ all -> 0x0056 }
        r4 = move-exception;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.z(fth):java.lang.String");
    }

    @Deprecated
    public final boolean a(fth fth) {
        return ((Boolean) b(fth).b()).booleanValue();
    }

    public final ajdx<Boolean> b(fth fth) {
        return ajdx.c(new -$$Lambda$ftl$6eb1FPEkUVChvsR4k4nBn8XeBJs(this, fth));
    }

    @Deprecated
    public final float c(fth fth) {
        return ((Float) d(fth).b()).floatValue();
    }

    public final ajdx<Float> d(fth fth) {
        return ajdx.c(new -$$Lambda$ftl$KLwvN5QTu3R-bmIHdzWs7d-yxO0(this, fth));
    }

    @Deprecated
    public final double e(fth fth) {
        return ((Double) ajdx.c(new -$$Lambda$ftl$4X5nafAApNUt0hkKi4kjBXc7kF4(this, fth)).b()).doubleValue();
    }

    @Deprecated
    public final int f(fth fth) {
        return ((Integer) g(fth).b()).intValue();
    }

    public final ajdx<Integer> g(fth fth) {
        return ajdx.c(new -$$Lambda$ftl$-8GEJn6mZFSmf727JG8aEJlkXDo(this, fth));
    }

    @Deprecated
    public final long h(fth fth) {
        return ((Long) i(fth).b()).longValue();
    }

    public final ajdx<Long> i(fth fth) {
        return ajdx.c(new -$$Lambda$ftl$JE4bkJyFDn2KfCGVIhUrdAFvwXI(this, fth));
    }

    @Deprecated
    public final String j(fth fth) {
        return (String) k(fth).b();
    }

    public final ajdx<String> k(fth fth) {
        return ajdx.c(new -$$Lambda$ftl$wUUt8q8C8zYjb69LcjhnrIn8faY(this, fth));
    }

    @Deprecated
    public final <T extends Enum<T>> T l(fth fth) {
        return y(fth);
    }

    public final <T extends Enum<T>> ajdx<T> m(fth fth) {
        return ajdx.c(new -$$Lambda$ftl$Sx6VOQaFj-cOFxAy_c3_IsbE-W8(this, fth));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x009f in {13, 15, 17, 19, 21} preds:[]
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
    /* renamed from: n */
    public final <T extends java.lang.Enum<T>> T y(defpackage.fth r5) {
        /*
        r4 = this;
        r0 = r5.a();	 Catch:{ all -> 0x009d }
        r0 = r0.b;	 Catch:{ all -> 0x009d }
        r1 = defpackage.fti.STRING;	 Catch:{ all -> 0x009d }
        if (r0 != r1) goto L_0x007e;	 Catch:{ all -> 0x009d }
        r0 = r5.a();	 Catch:{ all -> 0x009d }
        r0 = r0.c;	 Catch:{ all -> 0x009d }
        r0 = defpackage.ftj.a(r0);	 Catch:{ all -> 0x009d }
        if (r0 == 0) goto L_0x005c;	 Catch:{ all -> 0x009d }
        r1 = r4.a;	 Catch:{ all -> 0x009d }
        r1 = r1.iterator();	 Catch:{ all -> 0x009d }
        r2 = r1.hasNext();	 Catch:{ all -> 0x009d }
        if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x009d }
        r2 = r1.next();	 Catch:{ all -> 0x009d }
        r2 = (defpackage.aipn) r2;	 Catch:{ all -> 0x009d }
        r2 = r2.get();	 Catch:{ all -> 0x009d }
        r2 = (defpackage.ftk) r2;	 Catch:{ all -> 0x009d }
        r2 = r2.f(r5);	 Catch:{ all -> 0x009d }
        r3 = r2.isPresent();	 Catch:{ all -> 0x009d }
        if (r3 == 0) goto L_0x001c;	 Catch:{ all -> 0x009d }
        r2 = r2.get();	 Catch:{ all -> 0x009d }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x009d }
        r2 = com.google.common.base.Enums.getIfPresent(r0, r2);	 Catch:{ all -> 0x009d }
        r3 = r2.isPresent();	 Catch:{ all -> 0x009d }
        if (r3 == 0) goto L_0x001c;	 Catch:{ all -> 0x009d }
        r5 = r2.get();	 Catch:{ all -> 0x009d }
        r5 = (java.lang.Enum) r5;	 Catch:{ all -> 0x009d }
        return r5;	 Catch:{ all -> 0x009d }
        r5 = r5.a();	 Catch:{ all -> 0x009d }
        r5 = r5.a;	 Catch:{ all -> 0x009d }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x009d }
        r5 = java.lang.Enum.valueOf(r0, r5);	 Catch:{ all -> 0x009d }
        return r5;	 Catch:{ all -> 0x009d }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x009d }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009d }
        r2 = "Attempting to get enum for key ";	 Catch:{ all -> 0x009d }
        r1.<init>(r2);	 Catch:{ all -> 0x009d }
        r1.append(r5);	 Catch:{ all -> 0x009d }
        r2 = " with non-enum type ";	 Catch:{ all -> 0x009d }
        r1.append(r2);	 Catch:{ all -> 0x009d }
        r5 = r5.a();	 Catch:{ all -> 0x009d }
        r5 = r5.c;	 Catch:{ all -> 0x009d }
        r1.append(r5);	 Catch:{ all -> 0x009d }
        r5 = r1.toString();	 Catch:{ all -> 0x009d }
        r0.<init>(r5);	 Catch:{ all -> 0x009d }
        throw r0;	 Catch:{ all -> 0x009d }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x009d }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009d }
        r2 = "Attempting to get enum for configuration of type ";	 Catch:{ all -> 0x009d }
        r1.<init>(r2);	 Catch:{ all -> 0x009d }
        r5 = r5.a();	 Catch:{ all -> 0x009d }
        r5 = r5.b;	 Catch:{ all -> 0x009d }
        r1.append(r5);	 Catch:{ all -> 0x009d }
        r5 = " (needs to be STRING)";	 Catch:{ all -> 0x009d }
        r1.append(r5);	 Catch:{ all -> 0x009d }
        r5 = r1.toString();	 Catch:{ all -> 0x009d }
        r0.<init>(r5);	 Catch:{ all -> 0x009d }
        throw r0;	 Catch:{ all -> 0x009d }
        r5 = move-exception;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.y(fth):java.lang.Enum");
    }

    public final <T> T o(fth fth) {
        if (fth.a().c != null) {
            return a(fth, new -$$Lambda$ftl$U9cR46mKQrb8HiVEtBTYaWGCECo(this, fth));
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to get Gson object for key ");
        stringBuilder.append(fth);
        stringBuilder.append(" with no Java type, has configuration type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdp<Boolean> p(fth fth) {
        if (fth.a().b == fti.BOOLEAN) {
            return x(fth);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to observe boolean for configuration of type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdp<Float> q(fth fth) {
        if (fth.a().b == fti.FLOAT) {
            return x(fth).p(-$$Lambda$DEOxTSrcf2L_4rWMK1H5aGhTOzs.INSTANCE);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to observe float for configuration of type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdp<Double> r(fth fth) {
        if (fth.a().b == fti.DOUBLE) {
            return x(fth).p(-$$Lambda$G7C30wRgV5MwkfLEK-nbYbZU6iU.INSTANCE);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to observe double for configuration of type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdp<Integer> s(fth fth) {
        if (fth.a().b == fti.INTEGER) {
            return x(fth).p(-$$Lambda$6taHV-D_hbTf15iUV_mpRGu7CHE.INSTANCE);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to observe int for configuration of type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdp<Long> t(fth fth) {
        if (fth.a().b == fti.LONG) {
            return x(fth).p(-$$Lambda$ALvPRyEizXyE-byRa-aXobUa4bs.INSTANCE);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to observe long for configuration of type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdp<String> u(fth fth) {
        if (fth.a().b == fti.STRING) {
            return x(fth);
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to observe string for configuration of type ");
        stringBuilder.append(fth.a().b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final <T extends Enum<T>> ajdp<T> v(fth fth) {
        if (fth.a().b == fti.STRING) {
            Type type = fth.a().c;
            if (type != null && ftj.b(type)) {
                return a(fth, new -$$Lambda$ftl$j_LsVkDsP1H8MTdfjq8X6NC6NmU(type));
            }
            throw new IllegalArgumentException("Attempting to get enum for configuration without enumClass set");
        }
        StringBuilder stringBuilder = new StringBuilder("Attempting to get enum for configuration of type ");
        stringBuilder.append(fth.a().b);
        stringBuilder.append(" (needs to be STRING)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x001f in {5, 6, 8} preds:[]
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
    public final void w(defpackage.fth r3) {
        /*
        r2 = this;
        r0 = r2.a;	 Catch:{ all -> 0x001d }
        r0 = r0.iterator();	 Catch:{ all -> 0x001d }
        r1 = r0.hasNext();	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x001d }
        r1 = r0.next();	 Catch:{ all -> 0x001d }
        r1 = (defpackage.aipn) r1;	 Catch:{ all -> 0x001d }
        r1 = r1.get();	 Catch:{ all -> 0x001d }
        r1 = (defpackage.ftk) r1;	 Catch:{ all -> 0x001d }
        r1.i(r3);	 Catch:{ all -> 0x001d }
        goto L_0x0006;
        return;
        r3 = move-exception;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftl.w(fth):void");
    }
}
