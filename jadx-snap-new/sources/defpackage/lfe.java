package defpackage;

import defpackage.gdx.a;
import defpackage.gdx.b;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: lfe */
public final class lfe implements gfl {
    private final akbl<a, b> a;
    private final akbl<String, mwp.a> b;
    private final akbl<String, String> c;

    /* renamed from: lfe$1 */
    static final class 1 extends akcs implements akbl<String, String> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return str;
        }
    }

    public lfe() {
        this(null, null, null, 7);
    }

    private lfe(akbl<? super a, ? extends b> akbl, akbl<? super String, ? extends mwp.a> akbl2, akbl<? super String, String> akbl3) {
        akcr.b(akbl, "cacheEditorFactory");
        akcr.b(akbl2, "validation");
        akcr.b(akbl3, "entryNameTransformer");
        this.a = akbl;
        this.b = akbl2;
        this.c = akbl3;
    }

    public /* synthetic */ lfe(akbl akbl, akbl akbl2, akbl akbl3, int i) {
        if ((i & 1) != 0) {
            akbl = ghw.a(-1);
        }
        if ((i & 2) != 0) {
            akbl2 = lel.a.a;
        }
        if ((i & 4) != 0) {
            akbl3 = 1.a;
        }
        this(akbl, akbl2, akbl3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x005e in {5, 9, 11} preds:[]
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
    private static java.lang.String a(java.util.List<java.lang.String> r3, java.security.MessageDigest r4) {
        /*
        r3 = (java.lang.Iterable) r3;
        r3 = defpackage.ajyu.i(r3);
        r0 = r3.isEmpty();
        r1 = "";
        if (r0 != 0) goto L_0x0032;
        r0 = r3.size();
        r3 = r3.listIterator(r0);
        r0 = r3.hasPrevious();
        if (r0 == 0) goto L_0x0032;
        r0 = r3.previous();
        r0 = (java.lang.String) r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r2.append(r1);
        r1 = r2.toString();
        goto L_0x0016;
        r3 = com.google.common.base.Charsets.UTF_8;
        r0 = "Charsets.UTF_8";
        defpackage.akcr.a(r3, r0);
        if (r1 == 0) goto L_0x0056;
        r3 = r1.getBytes(r3);
        r0 = "(this as java.lang.String).getBytes(charset)";
        defpackage.akcr.a(r3, r0);
        r3 = r4.digest(r3);
        r4 = com.google.common.io.BaseEncoding.base16();
        r3 = r4.encode(r3);
        r4 = "hashes.sorted()\n        …ncoding.base16()::encode)";
        defpackage.akcr.a(r3, r4);
        return r3;
        r3 = new ajxt;
        r4 = "null cannot be cast to non-null type java.lang.String";
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfe.a(java.util.List, java.security.MessageDigest):java.lang.String");
    }

    public final gez a(gej gej, a aVar) {
        akcr.b(gej, "result");
        akcr.b(aVar, "cacheEntry");
        if (!gej.a()) {
            Object e = gej.e();
            akcr.a(e, "result.failureReason");
            throw new IllegalArgumentException("Invalid content result to import", e.c());
        } else if (gej.c().size() <= 0) {
            throw new IllegalArgumentException("Empty content result");
        } else if (gej.c().size() <= 1) {
            Closeable b = gej.b();
            try {
                Object obj = (InputStream) b;
                akcr.a(obj, "it");
                gez a = a(obj, aVar, null);
                akax.a(b, null);
                return a;
            } catch (Throwable th) {
                akax.a(b, th);
            }
        } else {
            throw new IllegalArgumentException("Only one asset expected");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:121:0x018c in {6, 7, 18, 19, 27, 29, 31, 40, 44, 46, 48, 50, 51, 53, 56, 57, 60, 61, 63, 65, 67, 71, 73, 74, 76, 77, 79, 80, 83, 84, 91, 95, 97, 99, 101, 103, 104, 106, 109, 111, 114, 116, 118, 120} preds:[]
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
    public final defpackage.gez a(java.io.InputStream r19, defpackage.gdx.a r20, java.util.Map<java.lang.String, java.lang.String> r21) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r20;
        r3 = "inputStream";
        defpackage.akcr.b(r0, r3);
        r3 = "cacheEntry";
        defpackage.akcr.b(r2, r3);
        r3 = "SHA-256";
        r3 = java.security.MessageDigest.getInstance(r3);
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new java.util.ArrayList;
        r5.<init>();
        r6 = r1.a;
        r6 = r6.invoke(r2);
        r6 = (defpackage.gdx.b) r6;
        r7 = r6.a();	 Catch:{ Exception -> 0x0180 }
        r7 = (java.io.Closeable) r7;	 Catch:{ Exception -> 0x0180 }
        r9 = r7;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r9 = (java.io.OutputStream) r9;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10 = r0 instanceof java.util.zip.ZipInputStream;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        if (r10 != 0) goto L_0x0037;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10 = 0;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        goto L_0x0038;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10 = r0;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10 = (java.util.zip.ZipInputStream) r10;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        if (r10 != 0) goto L_0x0131;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10 = new abnr;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10.<init>(r0);	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r10 = (java.io.Closeable) r10;	 Catch:{ Throwable -> 0x0173, all -> 0x016e }
        r0 = r10;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r0 = (defpackage.abnr) r0;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r11 = r0;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r11 = (java.util.zip.ZipInputStream) r11;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r12 = r11.getNextEntry();	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        if (r12 == 0) goto L_0x011b;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13 = r12.isDirectory();	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        if (r13 != 0) goto L_0x010a;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13 = r12.getName();	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r14 = "zipEntry.name";	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        defpackage.akcr.a(r13, r14);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r14 = "/";	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r15 = "receiver$0";	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        defpackage.akcr.b(r13, r15);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r15 = "delimiter";	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        defpackage.akcr.b(r14, r15);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r15 = "missingDelimiterValue";	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        defpackage.akcr.b(r13, r15);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r15 = r13;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r15 = (java.lang.CharSequence) r15;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r14 = defpackage.akgc.a(r15, r14, defpackage.akgc.d(r15));	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r15 = -1;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        if (r14 != r15) goto L_0x007a;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        goto L_0x0089;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r14 = r14 + 1;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r8 = r13.length();	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13 = r13.substring(r14, r8);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)";	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        defpackage.akcr.a(r13, r8);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13 = (java.lang.CharSequence) r13;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r8 = 46;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r8 = defpackage.akgc.a(r13, r8);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        if (r8 != 0) goto L_0x010a;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r8 = r6.a();	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13 = r8 instanceof java.io.BufferedOutputStream;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r14 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r13 == 0) goto L_0x00a7;
        r8 = (java.io.BufferedOutputStream) r8;	 Catch:{ Throwable -> 0x00a1, all -> 0x0122 }
        r13 = r8;
        goto L_0x00ac;
        r0 = move-exception;
        r8 = r0;
        r16 = r6;
        goto L_0x012b;
        r13 = new java.io.BufferedOutputStream;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13.<init>(r8, r14);	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r13 = (java.io.Closeable) r13;	 Catch:{ Throwable -> 0x0127, all -> 0x0122 }
        r8 = r13;	 Catch:{ Throwable -> 0x0100, all -> 0x00fb }
        r8 = (java.io.BufferedOutputStream) r8;	 Catch:{ Throwable -> 0x0100, all -> 0x00fb }
        r15 = r0;	 Catch:{ Throwable -> 0x0100, all -> 0x00fb }
        r15 = (java.io.InputStream) r15;	 Catch:{ Throwable -> 0x0100, all -> 0x00fb }
        r14 = new byte[r14];	 Catch:{ Throwable -> 0x0100, all -> 0x00fb }
        r16 = r6;
        r6 = r15.read(r14);	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r17 = r15;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r15 = -1;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        if (r6 == r15) goto L_0x00cb;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r15 = 0;	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r8.write(r14, r15, r6);	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r3.update(r14, r15, r6);	 Catch:{ Throwable -> 0x00f9, all -> 0x00f7 }
        r15 = r17;
        goto L_0x00b8;
        r6 = 0;
        defpackage.akax.a(r13, r6);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6 = r5;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6 = (java.util.Collection) r6;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r8 = r1.c;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r12 = r12.getName();	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r13 = "entry.name";	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        defpackage.akcr.a(r12, r13);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r8 = r8.invoke(r12);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6.add(r8);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6 = r4;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6 = (java.util.Collection) r6;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r8 = com.google.common.io.BaseEncoding.base16();	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r12 = r3.digest();	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r8 = r8.encode(r12);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6.add(r8);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        goto L_0x010c;
        r0 = move-exception;
        goto L_0x00fe;
        r0 = move-exception;
        goto L_0x0103;
        r0 = move-exception;
        r16 = r6;
        r8 = 0;
        goto L_0x0106;
        r0 = move-exception;
        r16 = r6;
        r8 = r0;
        throw r8;	 Catch:{ all -> 0x0105 }
        r0 = move-exception;
        defpackage.akax.a(r13, r8);	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        throw r0;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r16 = r6;	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r0.closeEntry();	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r12 = r11.getNextEntry();	 Catch:{ Throwable -> 0x0119, all -> 0x0117 }
        r6 = r16;
        goto L_0x004d;
        r0 = move-exception;
        goto L_0x0125;
        r0 = move-exception;
        goto L_0x012a;
        r16 = r6;
        r6 = 0;
        defpackage.akax.a(r10, r6);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        goto L_0x0133;
        r0 = move-exception;
        r16 = r6;
        r8 = 0;
        goto L_0x012d;
        r0 = move-exception;
        r16 = r6;
        r8 = r0;
        throw r8;	 Catch:{ all -> 0x012c }
        r0 = move-exception;
        defpackage.akax.a(r10, r8);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        throw r0;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r16 = r6;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = r1.b;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r4 = (java.util.List) r4;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r6 = "digest";	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        defpackage.akcr.a(r3, r6);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r4 = defpackage.lfe.a(r4, r3);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = r0.invoke(r4);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = (defpackage.mwp.a) r0;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r4 = r0 instanceof defpackage.mwp.a.a;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        if (r4 != 0) goto L_0x0162;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = r2.d;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = r0.b();	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = (defpackage.iha) r0;	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r0 = r0.a(r5);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        defpackage.aklc.a(r0, r9);	 Catch:{ Throwable -> 0x016c, all -> 0x016a }
        r6 = 0;
        defpackage.akax.a(r7, r6);	 Catch:{ Exception -> 0x017e }
        r0 = r16.b();	 Catch:{ Exception -> 0x017e }
        return r0;
        r6 = 0;
        r0 = (defpackage.mwp.a.a) r0;	 Catch:{ Throwable -> 0x016c, all -> 0x0168 }
        r0 = r0.a;	 Catch:{ Throwable -> 0x016c, all -> 0x0168 }
        throw r0;	 Catch:{ Throwable -> 0x016c, all -> 0x0168 }
        r0 = move-exception;
        goto L_0x017a;
        r0 = move-exception;
        goto L_0x0171;
        r0 = move-exception;
        goto L_0x0176;
        r0 = move-exception;
        r16 = r6;
        r6 = 0;
        goto L_0x017a;
        r0 = move-exception;
        r16 = r6;
        r8 = r0;
        throw r8;	 Catch:{ all -> 0x0178 }
        r0 = move-exception;
        r6 = r8;
        defpackage.akax.a(r7, r6);	 Catch:{ Exception -> 0x017e }
        throw r0;	 Catch:{ Exception -> 0x017e }
        r0 = move-exception;
        goto L_0x0183;
        r0 = move-exception;
        r16 = r6;
        r3.reset();
        r16.c();
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfe.a(java.io.InputStream, gdx$a, java.util.Map):gez");
    }

    public final gfl.a a() {
        return null;
    }
}
