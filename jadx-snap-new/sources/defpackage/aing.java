package defpackage;

import defpackage.ainf.a;
import java.util.List;

/* renamed from: aing */
public abstract class aing implements ainf {
    private final aino a;

    public aing(aino aino) {
        akcr.b(aino, "driver");
        this.a = aino;
    }

    public static String a(int i, int i2) {
        if (i == 0) {
            return "()";
        }
        StringBuilder stringBuilder = new StringBuilder(ains.a(i, i2));
        stringBuilder.append("(?");
        stringBuilder.append(i2);
        i2 += i;
        for (int i3 = i2 + 1; i3 < i2; i3++) {
            stringBuilder.append(",?");
            stringBuilder.append(i3);
        }
        stringBuilder.append(')');
        Object stringBuilder2 = stringBuilder.toString();
        akcr.a(stringBuilder2, "StringBuilder(capacity).…builderAction).toString()");
        return stringBuilder2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:143:0x02fa in {9, 13, 17, 19, 25, 27, 29, 34, 36, 46, 50, 54, 55, 56, 62, 63, 66, 71, 72, 75, 76, 85, 89, 93, 95, 101, 103, 106, 109, 116, 120, 124, 125, 126, 132, 133, 135, 140, 141, 142} preds:[]
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
    public final void a(defpackage.akbl<? super defpackage.ainf.a, defpackage.ajxw> r9) {
        /*
        r8 = this;
        r0 = "\n\nRollback exception: ";
        r1 = "\nwith cause ";
        r2 = "Exception while rolling back from an exception.\nOriginal exception: ";
        r3 = "body";
        defpackage.akcr.b(r9, r3);
        r3 = r8.a;
        r3 = r3.newTransaction();
        r4 = r3.enclosingTransaction$sqldelight_runtime();
        r5 = 0;
        r6 = 1;
        r7 = r8;	 Catch:{ aind -> 0x01ac, Throwable -> 0x00d7 }
        r7 = (defpackage.ainf) r7;	 Catch:{ aind -> 0x01ac, Throwable -> 0x00d7 }
        r3.setTransacter$sqldelight_runtime(r7);	 Catch:{ aind -> 0x01ac, Throwable -> 0x00d7 }
        r9.invoke(r3);	 Catch:{ aind -> 0x01ac, Throwable -> 0x00d7 }
        r3.setSuccessful$sqldelight_runtime(r6);	 Catch:{ aind -> 0x01ac, Throwable -> 0x00d7 }
        r3.endTransaction$sqldelight_runtime();
        if (r4 != 0) goto L_0x009c;
        r9 = r3.getSuccessful$sqldelight_runtime();
        if (r9 == 0) goto L_0x0078;
        r9 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r9 != 0) goto L_0x0035;
        goto L_0x0078;
        r9 = r3.getQueriesToUpdate$sqldelight_runtime();
        r9 = (java.lang.Iterable) r9;
        r9 = r9.iterator();
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x004f;
        r0 = r9.next();
        r0 = (defpackage.ainb) r0;
        r0.b();
        goto L_0x003f;
        r9 = r3.getQueriesToUpdate$sqldelight_runtime();
        r9.clear();
        r9 = r3.getPostCommitHooks$sqldelight_runtime();
        r9 = (java.lang.Iterable) r9;
        r9 = r9.iterator();
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x0070;
        r0 = r9.next();
        r0 = (defpackage.akbk) r0;
        defpackage.ainh.a(r0);
        goto L_0x0060;
        r9 = r3.getPostCommitHooks$sqldelight_runtime();
        r9.clear();
        return;
        r9 = r3.getPostRollbackHooks$sqldelight_runtime();	 Catch:{ Throwable -> 0x009a }
        r9 = (java.lang.Iterable) r9;	 Catch:{ Throwable -> 0x009a }
        r9 = r9.iterator();	 Catch:{ Throwable -> 0x009a }
        r0 = r9.hasNext();	 Catch:{ Throwable -> 0x009a }
        if (r0 == 0) goto L_0x0092;	 Catch:{ Throwable -> 0x009a }
        r0 = r9.next();	 Catch:{ Throwable -> 0x009a }
        r0 = (defpackage.akbk) r0;	 Catch:{ Throwable -> 0x009a }
        defpackage.ainh.a(r0);	 Catch:{ Throwable -> 0x009a }
        goto L_0x0082;
        r9 = r3.getPostRollbackHooks$sqldelight_runtime();
        r9.clear();
        return;
        r9 = move-exception;
        throw r9;
        r9 = r3.getSuccessful$sqldelight_runtime();
        if (r9 == 0) goto L_0x00a9;
        r9 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r9 == 0) goto L_0x00a9;
        r5 = 1;
        r4.setChildrenSuccessful$sqldelight_runtime(r5);
        r9 = r4.getPostCommitHooks$sqldelight_runtime();
        r0 = r3.getPostCommitHooks$sqldelight_runtime();
        r0 = (java.util.Collection) r0;
        r9.addAll(r0);
        r9 = r4.getPostRollbackHooks$sqldelight_runtime();
        r0 = r3.getPostRollbackHooks$sqldelight_runtime();
        r0 = (java.util.Collection) r0;
        r9.addAll(r0);
        r9 = r4.getQueriesToUpdate$sqldelight_runtime();
        r0 = r3.getQueriesToUpdate$sqldelight_runtime();
        r0 = (java.util.Collection) r0;
        r9.addAll(r0);
        return;
        r9 = move-exception;
        goto L_0x024c;
        r9 = move-exception;
        r3.endTransaction$sqldelight_runtime();
        if (r4 != 0) goto L_0x016f;
        r4 = r3.getSuccessful$sqldelight_runtime();
        if (r4 == 0) goto L_0x012d;
        r4 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r4 != 0) goto L_0x00ea;
        goto L_0x012d;
        r0 = r3.getQueriesToUpdate$sqldelight_runtime();
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0104;
        r1 = r0.next();
        r1 = (defpackage.ainb) r1;
        r1.b();
        goto L_0x00f4;
        r0 = r3.getQueriesToUpdate$sqldelight_runtime();
        r0.clear();
        r0 = r3.getPostCommitHooks$sqldelight_runtime();
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0125;
        r1 = r0.next();
        r1 = (defpackage.akbk) r1;
        defpackage.ainh.a(r1);
        goto L_0x0115;
        r0 = r3.getPostCommitHooks$sqldelight_runtime();
        r0.clear();
        goto L_0x01a6;
        r4 = r3.getPostRollbackHooks$sqldelight_runtime();	 Catch:{ Throwable -> 0x014c }
        r4 = (java.lang.Iterable) r4;	 Catch:{ Throwable -> 0x014c }
        r4 = r4.iterator();	 Catch:{ Throwable -> 0x014c }
        r5 = r4.hasNext();	 Catch:{ Throwable -> 0x014c }
        if (r5 == 0) goto L_0x0147;	 Catch:{ Throwable -> 0x014c }
        r5 = r4.next();	 Catch:{ Throwable -> 0x014c }
        r5 = (defpackage.akbk) r5;	 Catch:{ Throwable -> 0x014c }
        defpackage.ainh.a(r5);	 Catch:{ Throwable -> 0x014c }
        goto L_0x0137;
        r0 = r3.getPostRollbackHooks$sqldelight_runtime();
        goto L_0x0129;
        r3 = move-exception;
        r4 = new java.lang.Throwable;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r2);
        r5.append(r9);
        r5.append(r1);
        r9 = r9.getCause();
        r5.append(r9);
        r5.append(r0);
        r5.append(r3);
        r9 = r5.toString();
        r4.<init>(r9, r3);
        throw r4;
        r0 = r3.getSuccessful$sqldelight_runtime();
        if (r0 == 0) goto L_0x017c;
        r0 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r0 == 0) goto L_0x017c;
        r5 = 1;
        r4.setChildrenSuccessful$sqldelight_runtime(r5);
        r0 = r4.getPostCommitHooks$sqldelight_runtime();
        r1 = r3.getPostCommitHooks$sqldelight_runtime();
        r1 = (java.util.Collection) r1;
        r0.addAll(r1);
        r0 = r4.getPostRollbackHooks$sqldelight_runtime();
        r1 = r3.getPostRollbackHooks$sqldelight_runtime();
        r1 = (java.util.Collection) r1;
        r0.addAll(r1);
        r0 = r4.getQueriesToUpdate$sqldelight_runtime();
        r1 = r3.getQueriesToUpdate$sqldelight_runtime();
        r1 = (java.util.Collection) r1;
        r0.addAll(r1);
        r0 = r9 instanceof defpackage.aind;
        if (r0 == 0) goto L_0x01ab;
        return;
        throw r9;
        r9 = move-exception;
        if (r4 != 0) goto L_0x0249;
        r9 = (java.lang.Throwable) r9;	 Catch:{ all -> 0x00d4 }
        r3.endTransaction$sqldelight_runtime();
        r4 = r3.getSuccessful$sqldelight_runtime();
        if (r4 == 0) goto L_0x0204;
        r4 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r4 != 0) goto L_0x01c1;
        goto L_0x0204;
        r9 = r3.getQueriesToUpdate$sqldelight_runtime();
        r9 = (java.lang.Iterable) r9;
        r9 = r9.iterator();
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x01db;
        r0 = r9.next();
        r0 = (defpackage.ainb) r0;
        r0.b();
        goto L_0x01cb;
        r9 = r3.getQueriesToUpdate$sqldelight_runtime();
        r9.clear();
        r9 = r3.getPostCommitHooks$sqldelight_runtime();
        r9 = (java.lang.Iterable) r9;
        r9 = r9.iterator();
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x01fc;
        r0 = r9.next();
        r0 = (defpackage.akbk) r0;
        defpackage.ainh.a(r0);
        goto L_0x01ec;
        r9 = r3.getPostCommitHooks$sqldelight_runtime();
        r9.clear();
        return;
        r4 = r3.getPostRollbackHooks$sqldelight_runtime();	 Catch:{ Throwable -> 0x0226 }
        r4 = (java.lang.Iterable) r4;	 Catch:{ Throwable -> 0x0226 }
        r4 = r4.iterator();	 Catch:{ Throwable -> 0x0226 }
        r5 = r4.hasNext();	 Catch:{ Throwable -> 0x0226 }
        if (r5 == 0) goto L_0x021e;	 Catch:{ Throwable -> 0x0226 }
        r5 = r4.next();	 Catch:{ Throwable -> 0x0226 }
        r5 = (defpackage.akbk) r5;	 Catch:{ Throwable -> 0x0226 }
        defpackage.ainh.a(r5);	 Catch:{ Throwable -> 0x0226 }
        goto L_0x020e;
        r9 = r3.getPostRollbackHooks$sqldelight_runtime();
        r9.clear();
        return;
        r3 = move-exception;
        r4 = new java.lang.Throwable;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r2);
        r5.append(r9);
        r5.append(r1);
        r9 = r9.getCause();
        r5.append(r9);
        r5.append(r0);
        r5.append(r3);
        r9 = r5.toString();
        r4.<init>(r9, r3);
        throw r4;
        r9 = (java.lang.Throwable) r9;	 Catch:{ all -> 0x00d4 }
        throw r9;	 Catch:{ all -> 0x00d4 }
        r3.endTransaction$sqldelight_runtime();
        if (r4 != 0) goto L_0x02c2;
        r0 = r3.getSuccessful$sqldelight_runtime();
        if (r0 == 0) goto L_0x02a1;
        r0 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r0 != 0) goto L_0x025e;
        goto L_0x02a1;
        r0 = r3.getQueriesToUpdate$sqldelight_runtime();
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0278;
        r1 = r0.next();
        r1 = (defpackage.ainb) r1;
        r1.b();
        goto L_0x0268;
        r0 = r3.getQueriesToUpdate$sqldelight_runtime();
        r0.clear();
        r0 = r3.getPostCommitHooks$sqldelight_runtime();
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0299;
        r1 = r0.next();
        r1 = (defpackage.akbk) r1;
        defpackage.ainh.a(r1);
        goto L_0x0289;
        r0 = r3.getPostCommitHooks$sqldelight_runtime();
        r0.clear();
        goto L_0x02f9;
        r0 = r3.getPostRollbackHooks$sqldelight_runtime();	 Catch:{ Throwable -> 0x02c0 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ Throwable -> 0x02c0 }
        r0 = r0.iterator();	 Catch:{ Throwable -> 0x02c0 }
        r1 = r0.hasNext();	 Catch:{ Throwable -> 0x02c0 }
        if (r1 == 0) goto L_0x02bb;	 Catch:{ Throwable -> 0x02c0 }
        r1 = r0.next();	 Catch:{ Throwable -> 0x02c0 }
        r1 = (defpackage.akbk) r1;	 Catch:{ Throwable -> 0x02c0 }
        defpackage.ainh.a(r1);	 Catch:{ Throwable -> 0x02c0 }
        goto L_0x02ab;
        r0 = r3.getPostRollbackHooks$sqldelight_runtime();
        goto L_0x029d;
        r9 = move-exception;
        throw r9;
        r0 = r3.getSuccessful$sqldelight_runtime();
        if (r0 == 0) goto L_0x02cf;
        r0 = r3.getChildrenSuccessful$sqldelight_runtime();
        if (r0 == 0) goto L_0x02cf;
        r5 = 1;
        r4.setChildrenSuccessful$sqldelight_runtime(r5);
        r0 = r4.getPostCommitHooks$sqldelight_runtime();
        r1 = r3.getPostCommitHooks$sqldelight_runtime();
        r1 = (java.util.Collection) r1;
        r0.addAll(r1);
        r0 = r4.getPostRollbackHooks$sqldelight_runtime();
        r1 = r3.getPostRollbackHooks$sqldelight_runtime();
        r1 = (java.util.Collection) r1;
        r0.addAll(r1);
        r0 = r4.getQueriesToUpdate$sqldelight_runtime();
        r1 = r3.getQueriesToUpdate$sqldelight_runtime();
        r1 = (java.util.Collection) r1;
        r0.addAll(r1);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aing.a(akbl):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List<? extends ainb<?>> list) {
        akcr.b(list, "queryList");
        a currentTransaction = this.a.currentTransaction();
        if (currentTransaction != null) {
            currentTransaction.getQueriesToUpdate$sqldelight_runtime().addAll(list);
            return;
        }
        for (ainb b : list) {
            b.b();
        }
    }
}
