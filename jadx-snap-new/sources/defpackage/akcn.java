package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: akcn */
public final class akcn {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        akcr.b(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        Object[] objArr = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr[i] = it.next();
            if (i2 >= objArr.length) {
                if (!it.hasNext()) {
                    return objArr;
                }
                i = ((i2 * 3) + 1) >>> 1;
                if (i <= i2) {
                    if (i2 < 2147483645) {
                        i = 2147483645;
                    } else {
                        throw new OutOfMemoryError();
                    }
                }
                objArr = Arrays.copyOf(objArr, i);
                akcr.a((Object) objArr, "Arrays.copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object copyOf = Arrays.copyOf(objArr, i2);
                akcr.a(copyOf, "Arrays.copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x0096 in {6, 7, 12, 13, 16, 19, 24, 28, 30, 31, 36, 38, 39, 41, 43} preds:[]
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
    public static final java.lang.Object[] a(java.util.Collection<?> r5, java.lang.Object[] r6) {
        /*
        r0 = "collection";
        defpackage.akcr.b(r5, r0);
        if (r6 == 0) goto L_0x008e;
        r0 = r5.size();
        r1 = 0;
        r2 = 0;
        if (r0 != 0) goto L_0x0015;
        r5 = r6.length;
        if (r5 <= 0) goto L_0x0014;
        r6[r2] = r1;
        return r6;
        r5 = r5.iterator();
        r3 = r5.hasNext();
        if (r3 != 0) goto L_0x0025;
        r5 = r6.length;
        if (r5 <= 0) goto L_0x0024;
        r6[r2] = r1;
        return r6;
        r3 = r6.length;
        if (r0 > r3) goto L_0x002a;
        r0 = r6;
        goto L_0x003a;
        r3 = r6.getClass();
        r3 = r3.getComponentType();
        r0 = java.lang.reflect.Array.newInstance(r3, r0);
        if (r0 == 0) goto L_0x0086;
        r0 = (java.lang.Object[]) r0;
        r3 = r2 + 1;
        r4 = r5.next();
        r0[r2] = r4;
        r2 = r0.length;
        if (r3 < r2) goto L_0x006f;
        r2 = r5.hasNext();
        if (r2 != 0) goto L_0x004c;
        return r0;
        r2 = r3 * 3;
        r2 = r2 + 1;
        r2 = r2 >>> 1;
        r4 = 2147483645; // 0x7ffffffd float:NaN double:1.060997894E-314;
        if (r2 > r3) goto L_0x0065;
        if (r3 >= r4) goto L_0x005d;
        r2 = 2147483645; // 0x7ffffffd float:NaN double:1.060997894E-314;
        goto L_0x0065;
        r5 = new java.lang.OutOfMemoryError;
        r5.<init>();
        r5 = (java.lang.Throwable) r5;
        throw r5;
        r0 = java.util.Arrays.copyOf(r0, r2);
        r2 = "Arrays.copyOf(result, newSize)";
        defpackage.akcr.a(r0, r2);
        goto L_0x0084;
        r2 = r5.hasNext();
        if (r2 != 0) goto L_0x0084;
        if (r0 != r6) goto L_0x007a;
        r6[r3] = r1;
        return r6;
        r5 = java.util.Arrays.copyOf(r0, r3);
        r6 = "Arrays.copyOf(result, size)";
        defpackage.akcr.a(r5, r6);
        return r5;
        r2 = r3;
        goto L_0x003a;
        r5 = new ajxt;
        r6 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        r5.<init>(r6);
        throw r5;
        r5 = new java.lang.NullPointerException;
        r5.<init>();
        r5 = (java.lang.Throwable) r5;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcn.a(java.util.Collection, java.lang.Object[]):java.lang.Object[]");
    }
}
