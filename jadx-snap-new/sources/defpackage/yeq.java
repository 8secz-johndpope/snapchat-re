package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: yeq */
public final class yeq implements yew {
    private static final String l = l;
    private static final String m = m;
    private static final String n = n;
    private static final String o = o;
    private static final String p = "1";
    private static final Charset q = Charset.forName("US-ASCII");
    private static final String r = r;
    private static final String s = s;
    private static final String t = t;
    private static final String u = u;
    private static final String v = v;
    private static final String w = w;
    private final File a = new File(this.i, l);
    private final File b = new File(this.i, m);
    private final File c = new File(this.i, n);
    private Writer d;
    private int e;
    private final LinkedHashMap<String, yep> f = new LinkedHashMap(0, 0.75f, true);
    private long g;
    private long h;
    private final File i;
    private final int j;
    private final ihh k;

    /* renamed from: yeq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public yeq(File file, int i, ihh ihh) {
        akcr.b(file, "directory");
        akcr.b(ihh, "clock");
        this.i = file;
        this.j = i;
        this.k = ihh;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x009a in {3, 13, 14, 16, 17, 25, 27, 29, 31, 33} preds:[]
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
    private static long a(java.lang.String r4, int r5) {
        /*
        r0 = -1;
        if (r5 != r0) goto L_0x0006;
        r4 = 0;
        return r4;
        r0 = 1;
        r5 = r5 + r0;
        if (r4 == 0) goto L_0x0092;
        r5 = r4.substring(r5);
        r1 = "(this as java.lang.String).substring(startIndex)";
        defpackage.akcr.a(r5, r1);
        r5 = (java.lang.CharSequence) r5;
        r1 = new akfr;
        r2 = " ";
        r1.<init>(r2);
        r2 = 0;
        r5 = r1.a(r5, r2);
        r1 = r5.isEmpty();
        if (r1 != 0) goto L_0x0054;
        r1 = r5.size();
        r1 = r5.listIterator(r1);
        r3 = r1.hasPrevious();
        if (r3 == 0) goto L_0x0054;
        r3 = r1.previous();
        r3 = (java.lang.String) r3;
        r3 = (java.lang.CharSequence) r3;
        r3 = r3.length();
        if (r3 != 0) goto L_0x0045;
        r3 = 1;
        goto L_0x0046;
        r3 = 0;
        if (r3 != 0) goto L_0x002f;
        r5 = (java.lang.Iterable) r5;
        r1 = r1.nextIndex();
        r1 = r1 + r0;
        r5 = defpackage.ajyu.c(r5, r1);
        goto L_0x0058;
        r5 = defpackage.ajyw.a;
        r5 = (java.util.List) r5;
        r5 = (java.util.Collection) r5;
        if (r5 == 0) goto L_0x008a;
        r1 = new java.lang.String[r2];
        r5 = r5.toArray(r1);
        if (r5 == 0) goto L_0x0082;
        r5 = (java.lang.String[]) r5;
        r1 = r5.length;
        if (r1 != r0) goto L_0x0070;
        r4 = r5[r2];
        r4 = java.lang.Long.parseLong(r4);
        return r4;
        r5 = new java.io.IOException;
        r4 = java.lang.String.valueOf(r4);
        r0 = "Unexpected journal line: ";
        r4 = r0.concat(r4);
        r5.<init>(r4);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        r4 = new ajxt;
        r5 = "null cannot be cast to non-null type kotlin.Array<T>";
        r4.<init>(r5);
        throw r4;
        r4 = new ajxt;
        r5 = "null cannot be cast to non-null type java.util.Collection<T>";
        r4.<init>(r5);
        throw r4;
        r4 = new ajxt;
        r5 = "null cannot be cast to non-null type java.lang.String";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeq.a(java.lang.String, int):long");
    }

    private static IOException a(String[] strArr, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder("unexpected journal line: ");
        stringBuilder.append(Arrays.toString(strArr));
        throw new IOException(stringBuilder.toString(), th);
    }

    private final Writer a() {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.a, true), q));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:77:0x0155 in {10, 12, 14, 17, 33, 34, 36, 37, 43, 45, 47, 49, 53, 57, 62, 63, 65, 70, 72, 74, 76} preds:[]
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
    private final void a(java.util.Map<java.lang.String, defpackage.yep> r10, java.lang.String r11, boolean r12) {
        /*
        r9 = this;
        r0 = r11;
        r0 = (java.lang.CharSequence) r0;
        r1 = 32;
        r2 = 0;
        r3 = 6;
        r3 = defpackage.akgc.a(r0, r1, r2, r2, r3);
        r4 = "Unexpected journal line: ";
        r5 = -1;
        if (r3 == r5) goto L_0x0145;
        r6 = r3 + 1;
        r7 = 4;
        r0 = defpackage.akgc.a(r0, r1, r6, r2, r7);
        r1 = "(this as java.lang.String).substring(startIndex)";
        r7 = "null cannot be cast to non-null type java.lang.String";
        if (r0 != r5) goto L_0x0040;
        if (r11 == 0) goto L_0x003a;
        r6 = r11.substring(r6);
        defpackage.akcr.a(r6, r1);
        r8 = t;
        r8 = r8.length();
        if (r3 != r8) goto L_0x004b;
        r8 = t;
        r8 = defpackage.akgb.b(r11, r8, r2);
        if (r8 == 0) goto L_0x004b;
        r10.remove(r6);
        return;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        if (r11 == 0) goto L_0x013f;
        r6 = r11.substring(r6, r0);
        r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        defpackage.akcr.a(r6, r8);
        r8 = r10.get(r6);
        r8 = (defpackage.yep) r8;
        if (r8 != 0) goto L_0x005b;
        r8 = new yep;
        r8.<init>(r6);
        r10.put(r6, r8);
        r10 = 1;
        if (r0 == r5) goto L_0x00e7;
        r6 = r;
        r6 = r6.length();
        if (r3 != r6) goto L_0x00e7;
        r6 = r;
        r6 = defpackage.akgb.b(r11, r6, r2);
        if (r6 == 0) goto L_0x00e7;
        r0 = r0 + r10;
        if (r11 == 0) goto L_0x00e1;
        r11 = r11.substring(r0);
        defpackage.akcr.a(r11, r1);
        r11 = (java.lang.CharSequence) r11;
        r12 = new akfr;
        r0 = " ";
        r12.<init>(r0);
        r11 = r12.a(r11, r2);
        r12 = r11.isEmpty();
        if (r12 != 0) goto L_0x00b8;
        r12 = r11.size();
        r12 = r11.listIterator(r12);
        r0 = r12.hasPrevious();
        if (r0 == 0) goto L_0x00b8;
        r0 = r12.previous();
        r0 = (java.lang.String) r0;
        r0 = (java.lang.CharSequence) r0;
        r0 = r0.length();
        if (r0 != 0) goto L_0x00a9;
        r0 = 1;
        goto L_0x00aa;
        r0 = 0;
        if (r0 != 0) goto L_0x0093;
        r11 = (java.lang.Iterable) r11;
        r12 = r12.nextIndex();
        r12 = r12 + r10;
        r10 = defpackage.ajyu.c(r11, r12);
        goto L_0x00bc;
        r10 = defpackage.ajyw.a;
        r10 = (java.util.List) r10;
        r10 = (java.util.Collection) r10;
        if (r10 == 0) goto L_0x00d9;
        r11 = new java.lang.String[r2];
        r10 = r10.toArray(r11);
        if (r10 == 0) goto L_0x00d1;
        r10 = (java.lang.String[]) r10;
        r11 = 0;
        r8.f = r11;
        defpackage.yeq.a(r8, r10);
        return;
        r10 = new ajxt;
        r11 = "null cannot be cast to non-null type kotlin.Array<T>";
        r10.<init>(r11);
        throw r10;
        r10 = new ajxt;
        r11 = "null cannot be cast to non-null type java.util.Collection<T>";
        r10.<init>(r11);
        throw r10;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        r1 = s;
        r1 = defpackage.yeq.a(r1, r11, r3);
        if (r1 == 0) goto L_0x00f7;
        r10 = defpackage.yeq.a(r11, r0);
        r8.b(r10);
        return;
        r1 = u;
        r1 = defpackage.yeq.a(r1, r11, r3);
        if (r1 == 0) goto L_0x0107;
        r10 = defpackage.yeq.a(r11, r0);
        r8.a(r10);
        return;
        if (r0 != r5) goto L_0x011b;
        r1 = v;
        r1 = defpackage.yeq.a(r1, r11, r3);
        if (r1 == 0) goto L_0x011b;
        if (r12 == 0) goto L_0x0114;
        goto L_0x0118;
        r11 = r8.e;
        r2 = r11 + 1;
        r8.e = r2;
        return;
        if (r0 != r5) goto L_0x012f;
        r12 = w;
        r12 = defpackage.yeq.a(r12, r11, r3);
        if (r12 == 0) goto L_0x012f;
        r11 = r8.e;
        r11 = r11 - r10;
        r10 = java.lang.Math.max(r11, r2);
        r8.e = r10;
        return;
        r10 = new java.io.IOException;
        r11 = java.lang.String.valueOf(r11);
        r11 = r4.concat(r11);
        r10.<init>(r11);
        r10 = (java.lang.Throwable) r10;
        throw r10;
        r10 = new ajxt;
        r10.<init>(r7);
        throw r10;
        r10 = new java.io.IOException;
        r11 = java.lang.String.valueOf(r11);
        r11 = r4.concat(r11);
        r10.<init>(r11);
        r10 = (java.lang.Throwable) r10;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeq.a(java.util.Map, java.lang.String, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0083 in {10, 11, 14, 15, 17, 19, 22, 24} preds:[]
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
    private static void a(defpackage.yep r6, java.lang.String[] r7) {
        /*
        r0 = "entry";
        defpackage.akcr.b(r6, r0);
        r0 = "strings";
        defpackage.akcr.b(r7, r0);
        r0 = r7.length;
        r1 = 2;
        if (r0 < r1) goto L_0x007b;
        r0 = 0;
        r2 = r7[r0];	 Catch:{ NumberFormatException -> 0x0071 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0071 }
        r6.b = r2;	 Catch:{ NumberFormatException -> 0x0071 }
        r2 = r7.length;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r6.b;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r2 < r3) goto L_0x0061;	 Catch:{ NumberFormatException -> 0x0071 }
        r2 = r7.length;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r6.b;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r3 + r1;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r2 > r3) goto L_0x0051;	 Catch:{ NumberFormatException -> 0x0071 }
        r2 = r7.length;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r6.b;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r3 + r1;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r2 != r3) goto L_0x0034;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = r7.length;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = r1 + -1;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = r7[r1];	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = java.lang.Long.parseLong(r1);	 Catch:{ NumberFormatException -> 0x0071 }
        r6.d = r1;	 Catch:{ NumberFormatException -> 0x0071 }
        goto L_0x0038;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = 0;	 Catch:{ NumberFormatException -> 0x0071 }
        r6.d = r1;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = new long[r1];	 Catch:{ NumberFormatException -> 0x0071 }
        r6.c = r1;	 Catch:{ NumberFormatException -> 0x0071 }
        r1 = r6.b;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r0 >= r1) goto L_0x0050;	 Catch:{ NumberFormatException -> 0x0071 }
        r2 = r6.c;	 Catch:{ NumberFormatException -> 0x0071 }
        r3 = r0 + 1;	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = r7[r3];	 Catch:{ NumberFormatException -> 0x0071 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0071 }
        r2[r0] = r4;	 Catch:{ NumberFormatException -> 0x0071 }
        r0 = r3;	 Catch:{ NumberFormatException -> 0x0071 }
        goto L_0x0040;	 Catch:{ NumberFormatException -> 0x0071 }
        return;	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x0071 }
        r0 = "Too many values";	 Catch:{ NumberFormatException -> 0x0071 }
        r6.<init>(r0);	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = defpackage.yeq.a(r7, r6);	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ NumberFormatException -> 0x0071 }
        throw r6;	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = new java.lang.IllegalArgumentException;	 Catch:{ NumberFormatException -> 0x0071 }
        r0 = "Not enough values";	 Catch:{ NumberFormatException -> 0x0071 }
        r6.<init>(r0);	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = defpackage.yeq.a(r7, r6);	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = (java.lang.Throwable) r6;	 Catch:{ NumberFormatException -> 0x0071 }
        throw r6;	 Catch:{ NumberFormatException -> 0x0071 }
        r6 = move-exception;
        r6 = (java.lang.Throwable) r6;
        r6 = defpackage.yeq.a(r7, r6);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        r6 = 0;
        r6 = defpackage.yeq.a(r7, r6);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeq.a(yep, java.lang.String[]):void");
    }

    private static boolean a(String str, String str2, int i) {
        return i == str.length() && akgb.b(str2, str, false);
    }

    private static String e(yep yep) {
        akcr.b(yep, "entry");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        stringBuilder.append(yep.c.length);
        for (long j : yep.c) {
            stringBuilder.append(' ');
            stringBuilder.append(j);
        }
        if (yep.d > 0) {
            stringBuilder.append(' ');
            stringBuilder.append(yep.d);
        }
        Object stringBuilder2 = stringBuilder.toString();
        akcr.a(stringBuilder2, "result.toString()");
        return stringBuilder2;
    }

    public final yep a(String str) {
        akcr.b(str, "key");
        return (yep) this.f.get(str);
    }

    public final void a(String str, long j, long j2) {
        akcr.b(str, "key");
        a(str);
        this.e++;
        Writer writer = this.d;
        if (writer == null) {
            akcr.a("journalWriter");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(u);
        stringBuilder.append(' ');
        stringBuilder.append(str);
        stringBuilder.append(' ');
        stringBuilder.append(this.k.a());
        stringBuilder.append(10);
        writer.append(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b9 A:{Catch:{ all -> 0x0112, Exception -> 0x0117 }} */
    public final void a(java.util.Map<java.lang.String, ? extends defpackage.yep> r10) {
        /*
        r9 = this;
        r0 = "\n";
        r1 = 1;
        if (r10 == 0) goto L_0x0013;
    L_0x0005:
        r2 = r9.f;
        r2 = defpackage.akcr.a(r2, r10);
        r2 = r2 ^ r1;
        if (r2 == 0) goto L_0x0013;
    L_0x000e:
        r2 = r9.f;
        r2.putAll(r10);
    L_0x0013:
        r10 = new java.io.BufferedWriter;	 Catch:{ Exception -> 0x0117 }
        r2 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x0117 }
        r3 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x0117 }
        r4 = r9.b;	 Catch:{ Exception -> 0x0117 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x0117 }
        r3 = (java.io.OutputStream) r3;	 Catch:{ Exception -> 0x0117 }
        r4 = q;	 Catch:{ Exception -> 0x0117 }
        r2.<init>(r3, r4);	 Catch:{ Exception -> 0x0117 }
        r2 = (java.io.Writer) r2;	 Catch:{ Exception -> 0x0117 }
        r10.<init>(r2);	 Catch:{ Exception -> 0x0117 }
        r2 = o;	 Catch:{ all -> 0x0112 }
        r10.write(r2);	 Catch:{ all -> 0x0112 }
        r10.write(r0);	 Catch:{ all -> 0x0112 }
        r2 = p;	 Catch:{ all -> 0x0112 }
        r10.write(r2);	 Catch:{ all -> 0x0112 }
        r10.write(r0);	 Catch:{ all -> 0x0112 }
        r2 = r9.j;	 Catch:{ all -> 0x0112 }
        r2 = java.lang.Integer.toString(r2);	 Catch:{ all -> 0x0112 }
        r10.write(r2);	 Catch:{ all -> 0x0112 }
        r10.write(r0);	 Catch:{ all -> 0x0112 }
        r10.write(r0);	 Catch:{ all -> 0x0112 }
        r2 = r9.f;	 Catch:{ all -> 0x0112 }
        r2 = r2.values();	 Catch:{ all -> 0x0112 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0112 }
    L_0x0053:
        r3 = r2.hasNext();	 Catch:{ all -> 0x0112 }
        r4 = 0;
        if (r3 == 0) goto L_0x00d8;
    L_0x005a:
        r3 = r2.next();	 Catch:{ all -> 0x0112 }
        r3 = (defpackage.yep) r3;	 Catch:{ all -> 0x0112 }
        r5 = r3.f;	 Catch:{ all -> 0x0112 }
        r6 = " ";
        if (r5 == 0) goto L_0x008b;
    L_0x0066:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0112 }
        r5.<init>();	 Catch:{ all -> 0x0112 }
        r7 = s;	 Catch:{ all -> 0x0112 }
        r5.append(r7);	 Catch:{ all -> 0x0112 }
        r5.append(r6);	 Catch:{ all -> 0x0112 }
        r7 = r3.a;	 Catch:{ all -> 0x0112 }
        r5.append(r7);	 Catch:{ all -> 0x0112 }
        r5.append(r6);	 Catch:{ all -> 0x0112 }
        r7 = r3.h;	 Catch:{ all -> 0x0112 }
        r5.append(r7);	 Catch:{ all -> 0x0112 }
        r5.append(r0);	 Catch:{ all -> 0x0112 }
        r5 = r5.toString();	 Catch:{ all -> 0x0112 }
    L_0x0087:
        r10.write(r5);	 Catch:{ all -> 0x0112 }
        goto L_0x00b5;
    L_0x008b:
        r5 = r3.c;	 Catch:{ all -> 0x0112 }
        if (r5 == 0) goto L_0x00b5;
    L_0x008f:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0112 }
        r5.<init>();	 Catch:{ all -> 0x0112 }
        r7 = r;	 Catch:{ all -> 0x0112 }
        r5.append(r7);	 Catch:{ all -> 0x0112 }
        r5.append(r6);	 Catch:{ all -> 0x0112 }
        r7 = r3.a;	 Catch:{ all -> 0x0112 }
        r5.append(r7);	 Catch:{ all -> 0x0112 }
        r7 = "entry";
        defpackage.akcr.a(r3, r7);	 Catch:{ all -> 0x0112 }
        r7 = defpackage.yeq.e(r3);	 Catch:{ all -> 0x0112 }
        r5.append(r7);	 Catch:{ all -> 0x0112 }
        r5.append(r0);	 Catch:{ all -> 0x0112 }
        r5 = r5.toString();	 Catch:{ all -> 0x0112 }
        goto L_0x0087;
    L_0x00b5:
        r5 = r3.e;	 Catch:{ all -> 0x0112 }
    L_0x00b7:
        if (r4 >= r5) goto L_0x0053;
    L_0x00b9:
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0112 }
        r7.<init>();	 Catch:{ all -> 0x0112 }
        r8 = v;	 Catch:{ all -> 0x0112 }
        r7.append(r8);	 Catch:{ all -> 0x0112 }
        r7.append(r6);	 Catch:{ all -> 0x0112 }
        r8 = r3.a;	 Catch:{ all -> 0x0112 }
        r7.append(r8);	 Catch:{ all -> 0x0112 }
        r7.append(r0);	 Catch:{ all -> 0x0112 }
        r7 = r7.toString();	 Catch:{ all -> 0x0112 }
        r10.write(r7);	 Catch:{ all -> 0x0112 }
        r4 = r4 + 1;
        goto L_0x00b7;
    L_0x00d8:
        r10.close();	 Catch:{ Exception -> 0x0117 }
        r10 = r9;
        r10 = (defpackage.yeq) r10;	 Catch:{ Exception -> 0x0117 }
        r10 = r10.d;	 Catch:{ Exception -> 0x0117 }
        if (r10 == 0) goto L_0x00ee;
    L_0x00e2:
        r10 = r9.d;	 Catch:{ Exception -> 0x0117 }
        if (r10 != 0) goto L_0x00eb;
    L_0x00e6:
        r0 = "journalWriter";
        defpackage.akcr.a(r0);	 Catch:{ Exception -> 0x0117 }
    L_0x00eb:
        r10.close();	 Catch:{ Exception -> 0x0117 }
    L_0x00ee:
        r10 = r9.a;	 Catch:{ Exception -> 0x0117 }
        r10 = r10.exists();	 Catch:{ Exception -> 0x0117 }
        if (r10 == 0) goto L_0x00fd;
    L_0x00f6:
        r10 = r9.a;	 Catch:{ Exception -> 0x0117 }
        r0 = r9.c;	 Catch:{ Exception -> 0x0117 }
        defpackage.yev.a(r10, r0, r1);	 Catch:{ Exception -> 0x0117 }
    L_0x00fd:
        r10 = r9.b;	 Catch:{ Exception -> 0x0117 }
        r0 = r9.a;	 Catch:{ Exception -> 0x0117 }
        defpackage.yev.a(r10, r0, r4);	 Catch:{ Exception -> 0x0117 }
        r10 = r9.c;	 Catch:{ Exception -> 0x0117 }
        r10.delete();	 Catch:{ Exception -> 0x0117 }
        r10 = r9.a();	 Catch:{ Exception -> 0x0117 }
        r9.d = r10;	 Catch:{ Exception -> 0x0117 }
        r9.e = r4;	 Catch:{ Exception -> 0x0117 }
        return;
    L_0x0112:
        r0 = move-exception;
        r10.close();	 Catch:{ Exception -> 0x0117 }
        throw r0;	 Catch:{ Exception -> 0x0117 }
    L_0x0117:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeq.a(java.util.Map):void");
    }

    public final void a(yep yep) {
        akcr.b(yep, "entry");
        this.g -= yep.a();
        this.f.remove(yep.a);
        this.e++;
        Writer writer = this.d;
        if (writer == null) {
            akcr.a("journalWriter");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(t);
        stringBuilder.append(' ');
        stringBuilder.append(yep.a);
        stringBuilder.append(10);
        writer.append(stringBuilder.toString());
        k();
    }

    public final void a(yep yep, long j) {
        akcr.b(yep, "entry");
        this.g = (this.g - j) + yep.a();
        if (yep.e > 0) {
            this.h = (this.h - j) + yep.a();
        }
        Map map = this.f;
        Object obj = yep.a;
        akcr.a(obj, "entry.key");
        map.put(obj, yep);
        this.e++;
        Writer writer = this.d;
        if (writer == null) {
            akcr.a("journalWriter");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(r);
        stringBuilder.append(' ');
        stringBuilder.append(yep.a);
        stringBuilder.append(yeq.e(yep));
        stringBuilder.append(10);
        writer.write(stringBuilder.toString());
        k();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:80:0x0176 in {4, 5, 9, 10, 14, 15, 32, 35, 39, 40, 42, 44, 47, 53, 54, 64, 67, 68, 71, 73, 75, 78, 79} preds:[]
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
    public final boolean a(boolean r10, boolean r11) {
        /*
        r9 = this;
        r0 = ", ";
        r1 = r9.c;
        r1 = r1.exists();
        r2 = 0;
        r3 = 0;
        if (r1 == 0) goto L_0x0022;
        r11 = r9.a;
        r11 = r11.exists();
        if (r11 == 0) goto L_0x001a;
        r11 = r9.c;
        r11.delete();
        goto L_0x0030;
        r11 = r9.c;
        r1 = r9.a;
        defpackage.yev.a(r11, r1, r3);
        goto L_0x0030;
        r1 = r9.a;
        r1 = r1.exists();
        if (r1 != 0) goto L_0x0030;
        if (r11 == 0) goto L_0x002f;
        r9.a(r2);
        return r3;
        r11 = 1;
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x004a }
        r4 = "readJournal: ";	 Catch:{ Exception -> 0x004a }
        r1.<init>(r4);	 Catch:{ Exception -> 0x004a }
        r4 = r9.i;	 Catch:{ Exception -> 0x004a }
        r4 = r4.getName();	 Catch:{ Exception -> 0x004a }
        r1.append(r4);	 Catch:{ Exception -> 0x004a }
        r1 = r1.toString();	 Catch:{ Exception -> 0x004a }
        defpackage.in.a(r1);	 Catch:{ Exception -> 0x004a }
        r1 = 1;
        goto L_0x004b;
        r1 = 0;
        r4 = new yfb;	 Catch:{ all -> 0x0164 }
        r5 = new java.io.FileInputStream;	 Catch:{ all -> 0x0164 }
        r6 = r9.a;	 Catch:{ all -> 0x0164 }
        r5.<init>(r6);	 Catch:{ all -> 0x0164 }
        r5 = (java.io.InputStream) r5;	 Catch:{ all -> 0x0164 }
        r6 = q;	 Catch:{ all -> 0x0164 }
        r4.<init>(r5, r6);	 Catch:{ all -> 0x0164 }
        r2 = r4.a();	 Catch:{ all -> 0x0162 }
        r5 = r4.a();	 Catch:{ all -> 0x0162 }
        r6 = r4.a();	 Catch:{ all -> 0x0162 }
        r7 = r4.a();	 Catch:{ all -> 0x0162 }
        r8 = o;	 Catch:{ all -> 0x0162 }
        r8 = r8.equals(r2);	 Catch:{ all -> 0x0162 }
        if (r8 == 0) goto L_0x013b;	 Catch:{ all -> 0x0162 }
        r8 = p;	 Catch:{ all -> 0x0162 }
        r8 = r8.equals(r5);	 Catch:{ all -> 0x0162 }
        if (r8 == 0) goto L_0x013b;	 Catch:{ all -> 0x0162 }
        r8 = r9.j;	 Catch:{ all -> 0x0162 }
        r8 = java.lang.Integer.toString(r8);	 Catch:{ all -> 0x0162 }
        r6 = defpackage.akcr.a(r8, r6);	 Catch:{ all -> 0x0162 }
        r6 = r6 ^ r11;	 Catch:{ all -> 0x0162 }
        if (r6 != 0) goto L_0x013b;	 Catch:{ all -> 0x0162 }
        r6 = "";	 Catch:{ all -> 0x0162 }
        r6 = defpackage.akcr.a(r6, r7);	 Catch:{ all -> 0x0162 }
        r6 = r6 ^ r11;
        if (r6 != 0) goto L_0x013b;
        r0 = 0;
        if (r1 == 0) goto L_0x0099;
        r2 = "readJournalLine";	 Catch:{ all -> 0x00aa }
        defpackage.in.a(r2);	 Catch:{ all -> 0x00aa }
        r2 = r9.f;	 Catch:{ EOFException -> 0x00b9, IOException -> 0x00b1 }
        r2 = (java.util.Map) r2;	 Catch:{ EOFException -> 0x00b9, IOException -> 0x00b1 }
        r5 = r4.a();	 Catch:{ EOFException -> 0x00b9, IOException -> 0x00b1 }
        r6 = "reader.readLine()";	 Catch:{ EOFException -> 0x00b9, IOException -> 0x00b1 }
        defpackage.akcr.a(r5, r6);	 Catch:{ EOFException -> 0x00b9, IOException -> 0x00b1 }
        r9.a(r2, r5, r10);	 Catch:{ EOFException -> 0x00b9, IOException -> 0x00b1 }
        goto L_0x00b1;
        r10 = move-exception;
        if (r1 == 0) goto L_0x00b0;
        defpackage.in.a();	 Catch:{ all -> 0x0162 }
        throw r10;	 Catch:{ all -> 0x0162 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0162 }
        if (r1 == 0) goto L_0x0092;	 Catch:{ all -> 0x0162 }
        defpackage.in.a();	 Catch:{ all -> 0x0162 }
        goto L_0x0092;	 Catch:{ all -> 0x0162 }
        if (r1 == 0) goto L_0x00be;	 Catch:{ all -> 0x0162 }
        defpackage.in.a();	 Catch:{ all -> 0x0162 }
        r10 = r4.b();	 Catch:{ all -> 0x0162 }
        if (r10 == 0) goto L_0x00e4;	 Catch:{ all -> 0x0162 }
        r10 = r9.f;	 Catch:{ all -> 0x0162 }
        r10 = (java.util.Map) r10;	 Catch:{ all -> 0x0162 }
        r9.a(r10);	 Catch:{ all -> 0x0162 }
        r10 = r9.f;	 Catch:{ all -> 0x0162 }
        r10 = r10.size();	 Catch:{ all -> 0x0162 }
        r0 = r0 - r10;	 Catch:{ all -> 0x0162 }
        r9.e = r0;	 Catch:{ all -> 0x0162 }
        r10 = r9.b;
        defpackage.yev.a(r10);
        r4 = (java.io.Closeable) r4;
        defpackage.yev.a(r4);
        if (r1 == 0) goto L_0x00e3;
        defpackage.in.a();
        return r3;
        r10 = r9.a();	 Catch:{ all -> 0x0162 }
        r9.d = r10;	 Catch:{ all -> 0x0162 }
        r10 = r9.f;	 Catch:{ all -> 0x0162 }
        r10 = r10.size();	 Catch:{ all -> 0x0162 }
        r0 = r0 - r10;	 Catch:{ all -> 0x0162 }
        r9.e = r0;	 Catch:{ all -> 0x0162 }
        r10 = r9.f;	 Catch:{ all -> 0x0162 }
        r10 = r10.values();	 Catch:{ all -> 0x0162 }
        r10 = r10.iterator();	 Catch:{ all -> 0x0162 }
        r0 = r10.hasNext();	 Catch:{ all -> 0x0162 }
        if (r0 == 0) goto L_0x012b;	 Catch:{ all -> 0x0162 }
        r0 = r10.next();	 Catch:{ all -> 0x0162 }
        r2 = "i.next()";	 Catch:{ all -> 0x0162 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x0162 }
        r0 = (defpackage.yep) r0;	 Catch:{ all -> 0x0162 }
        r2 = r0.b();	 Catch:{ all -> 0x0162 }
        if (r2 == 0) goto L_0x00fd;	 Catch:{ all -> 0x0162 }
        r2 = r9.g;	 Catch:{ all -> 0x0162 }
        r5 = r0.a();	 Catch:{ all -> 0x0162 }
        r2 = r2 + r5;	 Catch:{ all -> 0x0162 }
        r9.g = r2;	 Catch:{ all -> 0x0162 }
        r2 = r0.e;	 Catch:{ all -> 0x0162 }
        if (r2 <= 0) goto L_0x00fd;	 Catch:{ all -> 0x0162 }
        r2 = r9.h;	 Catch:{ all -> 0x0162 }
        r5 = r0.a();	 Catch:{ all -> 0x0162 }
        r2 = r2 + r5;	 Catch:{ all -> 0x0162 }
        r9.h = r2;	 Catch:{ all -> 0x0162 }
        goto L_0x00fd;
        r10 = r9.b;
        defpackage.yev.a(r10);
        r4 = (java.io.Closeable) r4;
        defpackage.yev.a(r4);
        if (r1 == 0) goto L_0x013a;
        defpackage.in.a();
        return r11;
        r10 = new java.io.IOException;	 Catch:{ all -> 0x0162 }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0162 }
        r3 = "unexpected journal header: [";	 Catch:{ all -> 0x0162 }
        r11.<init>(r3);	 Catch:{ all -> 0x0162 }
        r11.append(r2);	 Catch:{ all -> 0x0162 }
        r11.append(r0);	 Catch:{ all -> 0x0162 }
        r11.append(r5);	 Catch:{ all -> 0x0162 }
        r11.append(r0);	 Catch:{ all -> 0x0162 }
        r11.append(r7);	 Catch:{ all -> 0x0162 }
        r0 = "]";	 Catch:{ all -> 0x0162 }
        r11.append(r0);	 Catch:{ all -> 0x0162 }
        r11 = r11.toString();	 Catch:{ all -> 0x0162 }
        r10.<init>(r11);	 Catch:{ all -> 0x0162 }
        r10 = (java.lang.Throwable) r10;	 Catch:{ all -> 0x0162 }
        throw r10;	 Catch:{ all -> 0x0162 }
        r10 = move-exception;
        goto L_0x0166;
        r10 = move-exception;
        r4 = r2;
        r11 = r9.b;
        defpackage.yev.a(r11);
        r4 = (java.io.Closeable) r4;
        defpackage.yev.a(r4);
        if (r1 == 0) goto L_0x0175;
        defpackage.in.a();
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeq.a(boolean, boolean):boolean");
    }

    public final void b(yep yep) {
        akcr.b(yep, "entry");
        Map map = this.f;
        Object obj = yep.a;
        akcr.a(obj, "entry.key");
        map.put(obj, yep);
        Writer writer = this.d;
        String str = "journalWriter";
        if (writer == null) {
            akcr.a(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.append(' ');
        stringBuilder.append(yep.a);
        stringBuilder.append(' ');
        stringBuilder.append(this.k.a());
        stringBuilder.append(10);
        writer.write(stringBuilder.toString());
        int i = yep.e;
        for (int i2 = 0; i2 < i; i2++) {
            Writer writer2 = this.d;
            if (writer2 == null) {
                akcr.a(str);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(v);
            stringBuilder2.append(' ');
            stringBuilder2.append(yep.a);
            stringBuilder2.append(10);
            writer2.append(stringBuilder2.toString());
        }
        Writer writer3 = this.d;
        if (writer3 == null) {
            akcr.a(str);
        }
        writer3.flush();
    }

    public final long c() {
        return this.g;
    }

    public final void c(yep yep) {
        akcr.b(yep, "entry");
        String str = yep.a;
        akcr.a((Object) str, "entry.key");
        yep a = a(str);
        if (a != null) {
            if (a.e == 0) {
                this.h += a.a();
            }
            a.e++;
            this.e++;
            Writer writer = this.d;
            if (writer == null) {
                akcr.a("journalWriter");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(v);
            stringBuilder.append(' ');
            stringBuilder.append(yep.a);
            stringBuilder.append(10);
            writer.append(stringBuilder.toString());
            k();
        }
    }

    public final long d() {
        return this.h;
    }

    public final void d(yep yep) {
        akcr.b(yep, "entry");
        String str = yep.a;
        akcr.a((Object) str, "entry.key");
        yep a = a(str);
        if (a != null) {
            a.e--;
            if (a.e == 0) {
                this.h -= a.a();
            }
            this.e++;
            Writer writer = this.d;
            if (writer == null) {
                akcr.a("journalWriter");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(w);
            stringBuilder.append(' ');
            stringBuilder.append(yep.a);
            stringBuilder.append(10);
            writer.append(stringBuilder.toString());
            k();
        }
    }

    public final List<yep> e() {
        Object values = this.f.values();
        akcr.a(values, "lruEntries.values");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) values) {
            if ((((yep) next).f != null ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public final Map<String, yep> f() {
        return this.f;
    }

    public final Set<String> g() {
        Object keySet = this.f.keySet();
        akcr.a(keySet, "lruEntries.keys");
        return keySet;
    }

    public final Iterator<yep> h() {
        Object values = this.f.values();
        akcr.a(values, "lruEntries.values");
        Iterable<yep> iterable = (Iterable) values;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (yep add : iterable) {
            arrayList.add(add);
        }
        return ((List) arrayList).listIterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0018 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    public final java.util.List<defpackage.yep> i() {
        /*
        r9 = this;
        r0 = r9.f;
        r0 = r0.values();
        r1 = "lruEntries.values";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
    L_0x0018:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x004d;
    L_0x001e:
        r2 = r0.next();
        r3 = r2;
        r3 = (defpackage.yep) r3;
        r4 = r3.d;
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x0039;
    L_0x002d:
        r4 = r3.d;
        r6 = r9.k;
        r6 = r6.a();
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 < 0) goto L_0x0044;
    L_0x0039:
        r4 = "it";
        defpackage.akcr.a(r3, r4);
        r3 = r3.b();
        if (r3 != 0) goto L_0x0046;
    L_0x0044:
        r3 = 1;
        goto L_0x0047;
    L_0x0046:
        r3 = 0;
    L_0x0047:
        if (r3 == 0) goto L_0x0018;
    L_0x0049:
        r1.add(r2);
        goto L_0x0018;
    L_0x004d:
        r1 = (java.util.List) r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeq.i():java.util.List");
    }

    public final void j() {
        if (this.d != null) {
            Writer writer = this.d;
            if (writer == null) {
                akcr.a("journalWriter");
            }
            writer.close();
        }
    }

    public final void k() {
        Writer writer = this.d;
        if (writer == null) {
            akcr.a("journalWriter");
        }
        writer.flush();
    }

    public final boolean m() {
        int i = this.e;
        return i >= MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS && i >= this.f.size();
    }

    public final void n() {
        yev.a(this.a);
        yev.a(this.c);
        yev.a(this.b);
    }
}
