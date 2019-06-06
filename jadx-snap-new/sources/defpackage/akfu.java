package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: akfu */
public class akfu {

    /* renamed from: akfu$a */
    static final class a extends akcs implements akbl<String, String> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "line");
            return str;
        }
    }

    /* renamed from: akfu$b */
    static final class b extends akcs implements akbl<String, String> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "line");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00ff in {7, 10, 13, 19, 20, 21, 27, 29, 32, 33, 35, 36, 38, 40} preds:[]
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
    public static final java.lang.String a(java.lang.String r17, java.lang.String r18) {
        /*
        r0 = r17;
        r1 = r18;
        r2 = "receiver$0";
        defpackage.akcr.b(r0, r2);
        r3 = "marginPrefix";
        defpackage.akcr.b(r1, r3);
        defpackage.akcr.b(r0, r2);
        r4 = "";
        r5 = "newIndent";
        defpackage.akcr.b(r4, r5);
        defpackage.akcr.b(r1, r3);
        r3 = r1;
        r3 = (java.lang.CharSequence) r3;
        r3 = defpackage.akgb.a(r3);
        r3 = r3 ^ 1;
        if (r3 == 0) goto L_0x00f1;
        r3 = r0;
        r3 = (java.lang.CharSequence) r3;
        r3 = defpackage.akgc.g(r3);
        r0 = r17.length();
        r5 = r3.size();
        r6 = 0;
        r5 = r5 * r6;
        r0 = r0 + r5;
        r4 = defpackage.akfu.d(r4);
        r5 = defpackage.ajym.a(r3);
        r3 = (java.lang.Iterable) r3;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r7 = (java.util.Collection) r7;
        r3 = r3.iterator();
        r8 = 0;
        r9 = r3.hasNext();
        if (r9 == 0) goto L_0x00c8;
        r9 = r3.next();
        r10 = r8 + 1;
        if (r8 >= 0) goto L_0x005f;
        defpackage.ajym.a();
        r9 = (java.lang.String) r9;
        r11 = 0;
        if (r8 == 0) goto L_0x0066;
        if (r8 != r5) goto L_0x0071;
        r8 = r9;
        r8 = (java.lang.CharSequence) r8;
        r8 = defpackage.akgb.a(r8);
        if (r8 == 0) goto L_0x0071;
        r8 = r11;
        goto L_0x00c1;
        r8 = r9;
        r8 = (java.lang.CharSequence) r8;
        r12 = r8.length();
        r13 = 0;
        r14 = -1;
        if (r13 >= r12) goto L_0x008c;
        r15 = r8.charAt(r13);
        r15 = defpackage.akfn.a(r15);
        r15 = r15 ^ 1;
        if (r15 == 0) goto L_0x0089;
        goto L_0x008d;
        r13 = r13 + 1;
        goto L_0x0079;
        r13 = -1;
        if (r13 == r14) goto L_0x00b6;
        defpackage.akcr.b(r9, r2);
        r8 = "prefix";
        defpackage.akcr.b(r1, r8);
        r8 = r9.startsWith(r1, r13);
        if (r8 == 0) goto L_0x00b6;
        r8 = r18.length();
        r13 = r13 + r8;
        if (r9 == 0) goto L_0x00ae;
        r11 = r9.substring(r13);
        r8 = "(this as java.lang.String).substring(startIndex)";
        defpackage.akcr.a(r11, r8);
        goto L_0x00b6;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type java.lang.String";
        r0.<init>(r1);
        throw r0;
        if (r11 == 0) goto L_0x00c0;
        r8 = r4.invoke(r11);
        r8 = (java.lang.String) r8;
        if (r8 != 0) goto L_0x00c1;
        r8 = r9;
        if (r8 == 0) goto L_0x00c6;
        r7.add(r8);
        r8 = r10;
        goto L_0x004e;
        r7 = (java.util.List) r7;
        r8 = r7;
        r8 = (java.lang.Iterable) r8;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r9 = r1;
        r9 = (java.lang.Appendable) r9;
        r0 = "\n";
        r10 = r0;
        r10 = (java.lang.CharSequence) r10;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r0 = defpackage.ajyu.a(r8, r9, r10, r11, r12, r13, r14, r15, r16);
        r0 = (java.lang.StringBuilder) r0;
        r0 = r0.toString();
        r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()";
        defpackage.akcr.a(r0, r1);
        return r0;
        r0 = new java.lang.IllegalArgumentException;
        r1 = "marginPrefix must be non-blank string.";
        r1 = r1.toString();
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akfu.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final String b(String str) {
        akcr.b(str, "receiver$0");
        return akfu.b(str, "");
    }

    public static final String b(String str, String str2) {
        akcr.b(str, "receiver$0");
        akcr.b(str2, "newIndent");
        List g = akgc.g(str);
        Iterable iterable = g;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if ((akgb.a((String) next) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
        for (String c : iterable2) {
            arrayList2.add(Integer.valueOf(akfu.c(c)));
        }
        Integer num = (Integer) ajyu.s((List) arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * g.size());
        akbl d = akfu.d(str2);
        int a = ajym.a(g);
        Collection arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                ajym.a();
            }
            Object next22 = (String) next22;
            if ((i == 0 || i == a) && akgb.a((CharSequence) next22)) {
                next22 = null;
            } else {
                String a2 = akge.a(next22, intValue);
                if (a2 != null) {
                    a2 = (String) d.invoke(a2);
                    if (a2 != null) {
                        next22 = a2;
                    }
                }
            }
            if (next22 != null) {
                arrayList3.add(next22);
            }
            i = i2;
        }
        Object stringBuilder = ((StringBuilder) ajyu.a((List) arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124)).toString();
        akcr.a(stringBuilder, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return stringBuilder;
    }

    private static final int c(String str) {
        CharSequence charSequence = str;
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            if ((akfn.a(charSequence.charAt(i)) ^ 1) != 0) {
                break;
            }
            i++;
        }
        i = -1;
        return i == -1 ? str.length() : i;
    }

    private static final akbl<String, String> d(String str) {
        return (((CharSequence) str).length() == 0 ? 1 : null) != null ? a.a : new b(str);
    }
}
