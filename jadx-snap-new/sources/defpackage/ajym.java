package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ajym */
public class ajym extends ajyl {
    public static final <T> int a(List<? extends T> list) {
        akcr.b(list, "receiver$0");
        return list.size() - 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x006b in {7, 9, 10, 12, 14, 16} preds:[]
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
    public static final <T extends java.lang.Comparable<? super T>> int a(java.util.List<? extends T> r3, T r4, int r5) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r3, r0);
        r0 = r3.size();
        r1 = ").";
        if (r5 < 0) goto L_0x0052;
        if (r5 > r0) goto L_0x0031;
        r0 = 0;
        r5 = r5 + -1;
        if (r0 > r5) goto L_0x002d;
        r1 = r0 + r5;
        r1 = r1 >>> 1;
        r2 = r3.get(r1);
        r2 = (java.lang.Comparable) r2;
        r2 = defpackage.ajzy.a(r2, r4);
        if (r2 >= 0) goto L_0x0027;
        r0 = r1 + 1;
        goto L_0x0012;
        if (r2 <= 0) goto L_0x002c;
        r5 = r1 + -1;
        goto L_0x0012;
        return r1;
        r0 = r0 + 1;
        r3 = -r0;
        return r3;
        r3 = new java.lang.IndexOutOfBoundsException;
        r4 = new java.lang.StringBuilder;
        r2 = "toIndex (";
        r4.<init>(r2);
        r4.append(r5);
        r5 = ") is greater than size (";
        r4.append(r5);
        r4.append(r0);
        r4.append(r1);
        r4 = r4.toString();
        r3.<init>(r4);
        r3 = (java.lang.Throwable) r3;
        throw r3;
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r0 = "fromIndex (0) is greater than toIndex (";
        r4.<init>(r0);
        r4.append(r5);
        r4.append(r1);
        r4 = r4.toString();
        r3.<init>(r4);
        r3 = (java.lang.Throwable) r3;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajym.a(java.util.List, java.lang.Comparable, int):int");
    }

    public static final akdy a(Collection<?> collection) {
        akcr.b(collection, "receiver$0");
        return new akdy(0, collection.size() - 1);
    }

    public static final <T> Collection<T> a(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return new ajyd(tArr, false);
    }

    public static final void a() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T> List<T> b(List<? extends T> list) {
        akcr.b(list, "receiver$0");
        int size = list.size();
        return size != 0 ? size != 1 ? list : ajyl.a(list.get(0)) : ajyw.a;
    }

    public static final <T> List<T> b(T... tArr) {
        akcr.b(tArr, "elements");
        return tArr.length > 0 ? ajyh.a((Object[]) tArr) : ajyw.a;
    }

    public static final void b() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final <T> List<T> c(T... tArr) {
        akcr.b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new ajyd(tArr, true));
    }

    public static final <T> ArrayList<T> d(T... tArr) {
        akcr.b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new ajyd(tArr, true));
    }

    public static final <T> List<T> e(T... tArr) {
        akcr.b(tArr, "elements");
        return ajyi.f(tArr);
    }
}
