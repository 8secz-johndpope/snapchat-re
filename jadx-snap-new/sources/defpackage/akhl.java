package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: akhl */
public final class akhl {
    public final String[] a;

    /* renamed from: akhl$a */
    public static final class a {
        final List<String> a = new ArrayList(20);

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00a1 in {9, 11, 18, 20, 22, 23, 25, 27, 29} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private static void d(java.lang.String r9, java.lang.String r10) {
            /*
            if (r9 == 0) goto L_0x0099;
            r0 = r9.isEmpty();
            if (r0 != 0) goto L_0x0091;
            r0 = r9.length();
            r1 = 0;
            r2 = 0;
            r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
            r4 = 2;
            r5 = 3;
            r6 = 1;
            if (r2 >= r0) goto L_0x003e;
            r7 = r9.charAt(r2);
            r8 = 32;
            if (r7 <= r8) goto L_0x0022;
            if (r7 >= r3) goto L_0x0022;
            r2 = r2 + 1;
            goto L_0x000e;
            r10 = new java.lang.IllegalArgumentException;
            r0 = new java.lang.Object[r5];
            r3 = java.lang.Integer.valueOf(r7);
            r0[r1] = r3;
            r1 = java.lang.Integer.valueOf(r2);
            r0[r6] = r1;
            r0[r4] = r9;
            r9 = "Unexpected char %#04x at %d in header name: %s";
            r9 = defpackage.akib.a(r9, r0);
            r10.<init>(r9);
            throw r10;
            if (r10 == 0) goto L_0x0078;
            r0 = r10.length();
            r2 = 0;
            if (r2 >= r0) goto L_0x0077;
            r7 = r10.charAt(r2);
            r8 = 31;
            if (r7 > r8) goto L_0x0053;
            r8 = 9;
            if (r7 != r8) goto L_0x0058;
            if (r7 >= r3) goto L_0x0058;
            r2 = r2 + 1;
            goto L_0x0045;
            r0 = new java.lang.IllegalArgumentException;
            r3 = 4;
            r3 = new java.lang.Object[r3];
            r7 = java.lang.Integer.valueOf(r7);
            r3[r1] = r7;
            r1 = java.lang.Integer.valueOf(r2);
            r3[r6] = r1;
            r3[r4] = r9;
            r3[r5] = r10;
            r9 = "Unexpected char %#04x at %d in %s value: %s";
            r9 = defpackage.akib.a(r9, r3);
            r0.<init>(r9);
            throw r0;
            return;
            r10 = new java.lang.NullPointerException;
            r0 = new java.lang.StringBuilder;
            r1 = "value for name ";
            r0.<init>(r1);
            r0.append(r9);
            r9 = " == null";
            r0.append(r9);
            r9 = r0.toString();
            r10.<init>(r9);
            throw r10;
            r9 = new java.lang.IllegalArgumentException;
            r10 = "name is empty";
            r9.<init>(r10);
            throw r9;
            r9 = new java.lang.NullPointerException;
            r10 = "name == null";
            r9.<init>(r10);
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akhl$a.d(java.lang.String, java.lang.String):void");
        }

        public final a a(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase((String) this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a a(String str, String str2) {
            a.d(str, str2);
            return b(str, str2);
        }

        public final akhl a() {
            return new akhl(this);
        }

        /* Access modifiers changed, original: final */
        public final a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public final a c(String str, String str2) {
            a.d(str, str2);
            a(str);
            b(str, str2);
            return this;
        }
    }

    akhl(a aVar) {
        this.a = (String[]) aVar.a.toArray(new String[aVar.a.size()]);
    }

    private akhl(String[] strArr) {
        this.a = strArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x008e in {14, 16, 18, 20, 22} preds:[]
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
    public static defpackage.akhl a(java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
        if (r7 == 0) goto L_0x0086;
        r0 = r7.size();
        r0 = r0 << 1;
        r0 = new java.lang.String[r0];
        r7 = r7.entrySet();
        r7 = r7.iterator();
        r1 = 0;
        r2 = 0;
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x0080;
        r3 = r7.next();
        r3 = (java.util.Map.Entry) r3;
        r4 = r3.getKey();
        if (r4 == 0) goto L_0x0078;
        r4 = r3.getValue();
        if (r4 == 0) goto L_0x0078;
        r4 = r3.getKey();
        r4 = (java.lang.String) r4;
        r4 = r4.trim();
        r3 = r3.getValue();
        r3 = (java.lang.String) r3;
        r3 = r3.trim();
        r5 = r4.length();
        if (r5 == 0) goto L_0x005c;
        r5 = r4.indexOf(r1);
        r6 = -1;
        if (r5 != r6) goto L_0x005c;
        r5 = r3.indexOf(r1);
        if (r5 != r6) goto L_0x005c;
        r0[r2] = r4;
        r4 = r2 + 1;
        r0[r4] = r3;
        r2 = r2 + 2;
        goto L_0x0014;
        r7 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Unexpected header: ";
        r0.<init>(r1);
        r0.append(r4);
        r1 = ": ";
        r0.append(r1);
        r0.append(r3);
        r0 = r0.toString();
        r7.<init>(r0);
        throw r7;
        r7 = new java.lang.IllegalArgumentException;
        r0 = "Headers cannot be null";
        r7.<init>(r0);
        throw r7;
        r7 = new akhl;
        r7.<init>(r0);
        return r7;
        r7 = new java.lang.NullPointerException;
        r0 = "headers == null";
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhl.a(java.util.Map):akhl");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0071 in {7, 9, 19, 21, 23, 25} preds:[]
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
    public static defpackage.akhl a(java.lang.String... r6) {
        /*
        r0 = r6.length;
        r0 = r0 % 2;
        if (r0 != 0) goto L_0x0069;
        r6 = r6.clone();
        r6 = (java.lang.String[]) r6;
        r0 = 0;
        r1 = 0;
        r2 = r6.length;
        if (r1 >= r2) goto L_0x0027;
        r2 = r6[r1];
        if (r2 == 0) goto L_0x001f;
        r2 = r6[r1];
        r2 = r2.trim();
        r6[r1] = r2;
        r1 = r1 + 1;
        goto L_0x000d;
        r6 = new java.lang.IllegalArgumentException;
        r0 = "Headers cannot be null";
        r6.<init>(r0);
        throw r6;
        r1 = 0;
        r2 = r6.length;
        if (r1 >= r2) goto L_0x0063;
        r2 = r6[r1];
        r3 = r1 + 1;
        r3 = r6[r3];
        r4 = r2.length();
        if (r4 == 0) goto L_0x0047;
        r4 = r2.indexOf(r0);
        r5 = -1;
        if (r4 != r5) goto L_0x0047;
        r4 = r3.indexOf(r0);
        if (r4 != r5) goto L_0x0047;
        r1 = r1 + 2;
        goto L_0x0028;
        r6 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Unexpected header: ";
        r0.<init>(r1);
        r0.append(r2);
        r1 = ": ";
        r0.append(r1);
        r0.append(r3);
        r0 = r0.toString();
        r6.<init>(r0);
        throw r6;
        r0 = new akhl;
        r0.<init>(r6);
        return r0;
        r6 = new java.lang.IllegalArgumentException;
        r0 = "Expected alternating header names and values";
        r6.<init>(r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akhl.a(java.lang.String[]):akhl");
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final a a() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public final String a(int i) {
        return this.a[i << 1];
    }

    public final String a(String str) {
        return akhl.a(this.a, str);
    }

    public final String b(int i) {
        return this.a[(i << 1) + 1];
    }

    public final List<String> b(String str) {
        int length = this.a.length / 2;
        List list = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (list == null) {
                    list = new ArrayList(2);
                }
                list.add(b(i));
            }
        }
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public final Map<String, List<String>> b() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            String toLowerCase = a(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(toLowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(toLowerCase, list);
            }
            list.add(b(i));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof akhl) && Arrays.equals(((akhl) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(a(i));
            stringBuilder.append(": ");
            stringBuilder.append(b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
