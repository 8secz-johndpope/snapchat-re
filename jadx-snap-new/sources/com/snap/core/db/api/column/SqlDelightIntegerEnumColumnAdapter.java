package com.snap.core.db.api.column;

import com.google.common.base.Preconditions;
import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.aina;
import defpackage.akcr;

public final class SqlDelightIntegerEnumColumnAdapter<T extends Enum<T>> implements aina<T, Long> {
    private final Class<T> cls;

    public SqlDelightIntegerEnumColumnAdapter(Class<T> cls) {
        akcr.b(cls, "cls");
        this.cls = cls;
        boolean isAssignableFrom = IntegerEnumColumn.class.isAssignableFrom(this.cls);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.cls);
        stringBuilder.append(" must extend IntegerEnumColumn");
        Preconditions.checkArgument(isAssignableFrom, stringBuilder.toString(), new Object[0]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0041 in {6, 7, 10, 11, 13, 15} preds:[]
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
    public final T decode(long r9) {
        /*
        r8 = this;
        r0 = r8.cls;
        r0 = r0.getEnumConstants();
        r1 = "cls.enumConstants";
        defpackage.akcr.a(r0, r1);
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
        if (r3 >= r1) goto L_0x0037;
        r4 = r0[r3];
        r5 = r4;
        r5 = (java.lang.Enum) r5;
        if (r5 == 0) goto L_0x002f;
        r6 = r5;
        r6 = (com.snap.core.db.api.model.IntegerEnumColumn) r6;
        r6 = r6.getIntValue();
        r7 = (int) r9;
        if (r6 != r7) goto L_0x0023;
        r6 = 1;
        goto L_0x0024;
        r6 = 0;
        if (r6 == 0) goto L_0x002c;
        r9 = "cls.enumConstants.first … databaseValue?.toInt() }";
        defpackage.akcr.a(r4, r9);
        return r5;
        r3 = r3 + 1;
        goto L_0x000e;
        r9 = new ajxt;
        r10 = "null cannot be cast to non-null type com.snap.core.db.api.model.IntegerEnumColumn";
        r9.<init>(r10);
        throw r9;
        r9 = new java.util.NoSuchElementException;
        r10 = "Array contains no element matching the predicate.";
        r9.<init>(r10);
        r9 = (java.lang.Throwable) r9;
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.column.SqlDelightIntegerEnumColumnAdapter.decode(long):java.lang.Enum");
    }

    public final Long encode(T t) {
        akcr.b(t, "value");
        return Long.valueOf((long) ((IntegerEnumColumn) t).getIntValue());
    }
}
