package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.moe.b;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: lcm */
public final class lcm implements ajej, moe {
    private final gej a;
    private final String b;
    private final /* synthetic */ ajej c;

    public lcm(final gej gej, String str) {
        akcr.b(gej, "contentResult");
        akcr.b(str, MessageMediaRefModel.URI);
        Object a = ajek.a((ajev) new ajev() {
            public final void run() {
                gej.close();
            }
        });
        akcr.a(a, "Disposables.fromAction { contentResult.close() }");
        this.c = a;
        this.a = gej;
        this.b = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0085 in {10, 11, 14, 16, 18, 20, 22} preds:[]
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
    private final defpackage.gdt h(java.lang.String r6) {
        /*
        r5 = this;
        r0 = r5.a;
        r1 = r0.a();
        if (r1 == 0) goto L_0x0054;
        r1 = r5.i(r6);	 Catch:{ all -> 0x0052 }
        r0 = r0.c();	 Catch:{ all -> 0x0050 }
        r2 = "assets";	 Catch:{ all -> 0x0050 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x0050 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0050 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0050 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x0038;	 Catch:{ all -> 0x0050 }
        r2 = r0.next();	 Catch:{ all -> 0x0050 }
        r3 = r2;	 Catch:{ all -> 0x0050 }
        r3 = (defpackage.gdt) r3;	 Catch:{ all -> 0x0050 }
        r4 = "it";	 Catch:{ all -> 0x0050 }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0050 }
        r3 = r3.a();	 Catch:{ all -> 0x0050 }
        r3 = defpackage.akcr.a(r3, r1);	 Catch:{ all -> 0x0050 }
        if (r3 == 0) goto L_0x001b;	 Catch:{ all -> 0x0050 }
        goto L_0x0039;	 Catch:{ all -> 0x0050 }
        r2 = 0;	 Catch:{ all -> 0x0050 }
        r2 = (defpackage.gdt) r2;	 Catch:{ all -> 0x0050 }
        if (r2 == 0) goto L_0x003e;	 Catch:{ all -> 0x0050 }
        return r2;	 Catch:{ all -> 0x0050 }
        r0 = new java.io.IOException;	 Catch:{ all -> 0x0050 }
        r1 = "cannot find file for ";	 Catch:{ all -> 0x0050 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0050 }
        r6 = r1.concat(r6);	 Catch:{ all -> 0x0050 }
        r0.<init>(r6);	 Catch:{ all -> 0x0050 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0050 }
        throw r0;	 Catch:{ all -> 0x0050 }
        r6 = move-exception;
        throw r6;
        r6 = move-exception;
        throw r6;
        r6 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r1 = "asking for ";
        r0.<init>(r1);
        r1 = r5.b;
        r0.append(r1);
        r1 = " on unsuccessful ";
        r0.append(r1);
        r1 = r5.a;
        r0.append(r1);
        r0 = r0.toString();
        r1 = r5.a;
        r1 = r1.e();
        r2 = "contentResult.failureReason";
        defpackage.akcr.a(r1, r2);
        r1 = r1.c();
        r6.<init>(r0, r1);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcm.h(java.lang.String):gdt");
    }

    private final String i(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.b.length();
        int length2 = str.length();
        Object obj = 1;
        while (length < length2) {
            char charAt = str.charAt(length);
            Object obj2 = charAt == '/' ? 1 : null;
            if (obj2 == null || obj == null) {
                stringBuilder.append(charAt);
            }
            length++;
            obj = obj2;
        }
        Object stringBuilder2 = stringBuilder.toString();
        akcr.a(stringBuilder2, "stringBuilder.toString()");
        return stringBuilder2;
    }

    private static String j(String str) {
        if (akgc.b((CharSequence) str, '/')) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('/');
        return stringBuilder.toString();
    }

    public final String a(String str) {
        akcr.b(str, MessageMediaRefModel.URI);
        Object uri = h(str).d().toString();
        akcr.a(uri, "findAssetDescriptor(uri).uri.toString()");
        akcr.a(uri, "trace(\"\") {\n        find…uri).uri.toString()\n    }");
        return uri;
    }

    public final AssetFileDescriptor b(String str) {
        akcr.b(str, MessageMediaRefModel.URI);
        Object d = h(str).d();
        akcr.a(d, "findAssetDescriptor(uri).uri");
        return new AssetFileDescriptor(ParcelFileDescriptor.open(new File(d.getPath()), SQLiteDatabase.CREATE_IF_NECESSARY), 0, -1);
    }

    public final InputStream c(String str) {
        akcr.b(str, MessageMediaRefModel.URI);
        Object b = h(str).b();
        akcr.a(b, "findAssetDescriptor(uri).openStream()");
        return b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0064 in {11, 17, 18, 20, 21, 22, 24} preds:[]
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
    public final boolean d(java.lang.String r6) {
        /*
        r5 = this;
        r0 = "uri";
        defpackage.akcr.b(r6, r0);
        r0 = r5.isDisposed();	 Catch:{ all -> 0x0062 }
        r1 = 1;	 Catch:{ all -> 0x0062 }
        r2 = 0;	 Catch:{ all -> 0x0062 }
        if (r0 != 0) goto L_0x0060;	 Catch:{ all -> 0x0062 }
        r0 = r5.a;	 Catch:{ all -> 0x0062 }
        r0 = r0.a();	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0060;	 Catch:{ all -> 0x0062 }
        r0 = r5.b;	 Catch:{ all -> 0x0062 }
        r0 = defpackage.akgb.b(r6, r0, r2);	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0060;	 Catch:{ all -> 0x0062 }
        r6 = r5.i(r6);	 Catch:{ all -> 0x0062 }
        r0 = r5.a;	 Catch:{ all -> 0x0062 }
        r0 = r0.c();	 Catch:{ all -> 0x0062 }
        r3 = "contentResult.assets";	 Catch:{ all -> 0x0062 }
        defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x0062 }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0062 }
        r3 = r0 instanceof java.util.Collection;	 Catch:{ all -> 0x0062 }
        if (r3 == 0) goto L_0x003b;	 Catch:{ all -> 0x0062 }
        r3 = r0;	 Catch:{ all -> 0x0062 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0062 }
        r3 = r3.isEmpty();	 Catch:{ all -> 0x0062 }
        if (r3 != 0) goto L_0x005c;	 Catch:{ all -> 0x0062 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0062 }
        r3 = r0.hasNext();	 Catch:{ all -> 0x0062 }
        if (r3 == 0) goto L_0x005c;	 Catch:{ all -> 0x0062 }
        r3 = r0.next();	 Catch:{ all -> 0x0062 }
        r3 = (defpackage.gdt) r3;	 Catch:{ all -> 0x0062 }
        r4 = "it";	 Catch:{ all -> 0x0062 }
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0062 }
        r3 = r3.a();	 Catch:{ all -> 0x0062 }
        r3 = defpackage.akcr.a(r3, r6);	 Catch:{ all -> 0x0062 }
        if (r3 == 0) goto L_0x003f;
        r6 = 1;
        goto L_0x005d;
        r6 = 0;
        if (r6 == 0) goto L_0x0060;
        goto L_0x0061;
        r1 = 0;
        return r1;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcm.d(java.lang.String):boolean");
    }

    public final void dispose() {
        this.c.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x00e9 in {5, 11, 21, 22, 24, 28, 30, 32} preds:[]
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
    public final int e(java.lang.String r6) {
        /*
        r5 = this;
        r0 = "uri";
        defpackage.akcr.b(r6, r0);
        r0 = r5.a;
        r1 = r0.a();
        if (r1 == 0) goto L_0x00b8;
        r6 = r5.i(r6);
        r6 = defpackage.lcm.j(r6);
        r0 = r0.c();
        r1 = "assets";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = 10;
        r2 = defpackage.ajyn.a(r0, r2);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0053;
        r2 = r0.next();
        r2 = (defpackage.gdt) r2;
        r3 = "it";
        defpackage.akcr.a(r2, r3);
        r2 = r2.a();
        r3 = "it.name";
        defpackage.akcr.a(r2, r3);
        r2 = defpackage.lcm.j(r2);
        r1.add(r2);
        goto L_0x0031;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r1 = r1.iterator();
        r2 = r1.hasNext();
        r3 = 0;
        if (r2 == 0) goto L_0x007a;
        r2 = r1.next();
        r4 = r2;
        r4 = (java.lang.String) r4;
        r3 = defpackage.akgb.b(r4, r6, r3);
        if (r3 == 0) goto L_0x0062;
        r0.add(r2);
        goto L_0x0062;
        r0 = (java.util.List) r0;
        r1 = r0;
        r1 = (java.util.Collection) r1;
        r1 = r1.isEmpty();
        r2 = 1;
        r1 = r1 ^ r2;
        if (r1 == 0) goto L_0x00ae;
        r1 = r0;
        r1 = (java.lang.Iterable) r1;
        r4 = r1;
        r4 = (java.util.Collection) r4;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x00aa;
        r1 = r1.iterator();
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x00aa;
        r4 = r1.next();
        r4 = (java.lang.String) r4;
        r4 = defpackage.akcr.a(r4, r6);
        if (r4 != 0) goto L_0x0097;
        goto L_0x00ab;
        r3 = 1;
        if (r3 == 0) goto L_0x00ae;
        return r2;
        r6 = r0.isEmpty();
        if (r6 == 0) goto L_0x00b6;
        r6 = 3;
        return r6;
        r6 = 2;
        return r6;
        r6 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r1 = "asking for ";
        r0.<init>(r1);
        r1 = r5.b;
        r0.append(r1);
        r1 = " on unsuccessful ";
        r0.append(r1);
        r1 = r5.a;
        r0.append(r1);
        r0 = r0.toString();
        r1 = r5.a;
        r1 = r1.e();
        r2 = "contentResult.failureReason";
        defpackage.akcr.a(r1, r2);
        r1 = r1.c();
        r6.<init>(r0, r1);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcm.e(java.lang.String):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x010b in {5, 13, 14, 16, 24, 25, 27, 28, 29, 31, 33} preds:[]
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
    public final java.util.List<java.lang.String> f(java.lang.String r10) {
        /*
        r9 = this;
        r0 = "uri";
        defpackage.akcr.b(r10, r0);
        r0 = r9.a;
        r1 = r0.a();
        if (r1 == 0) goto L_0x00da;
        r10 = r9.i(r10);
        r10 = defpackage.lcm.j(r10);
        r0 = r0.c();
        r1 = "assets";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = 10;
        r3 = defpackage.ajyn.a(r0, r2);
        r1.<init>(r3);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x0053;
        r3 = r0.next();
        r3 = (defpackage.gdt) r3;
        r4 = "it";
        defpackage.akcr.a(r3, r4);
        r3 = r3.a();
        r4 = "it.name";
        defpackage.akcr.a(r3, r4);
        r3 = defpackage.lcm.j(r3);
        r1.add(r3);
        goto L_0x0031;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.Collection) r0;
        r1 = r1.iterator();
        r3 = r1.hasNext();
        r4 = 1;
        r5 = 0;
        if (r3 == 0) goto L_0x0086;
        r3 = r1.next();
        r6 = r3;
        r6 = (java.lang.String) r6;
        r7 = defpackage.akcr.a(r6, r10);
        r7 = r7 ^ r4;
        if (r7 == 0) goto L_0x007f;
        r6 = defpackage.akgb.b(r6, r10, r5);
        if (r6 == 0) goto L_0x007f;
        goto L_0x0080;
        r4 = 0;
        if (r4 == 0) goto L_0x0062;
        r0.add(r3);
        goto L_0x0062;
        r0 = (java.util.List) r0;
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = defpackage.ajyn.a(r0, r2);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x00d1;
        r2 = r0.next();
        r2 = (java.lang.String) r2;
        r3 = r10;
        r3 = (java.lang.CharSequence) r3;
        r2 = defpackage.akgc.a(r2, r3);
        r3 = r2.length();
        r6 = 0;
        if (r6 >= r3) goto L_0x00cd;
        r7 = r2.charAt(r6);
        r8 = 47;
        if (r7 == r8) goto L_0x00bd;
        r7 = 1;
        goto L_0x00be;
        r7 = 0;
        if (r7 != 0) goto L_0x00ca;
        r2 = r2.substring(r5, r6);
        r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
        defpackage.akcr.a(r2, r3);
        goto L_0x00cd;
        r6 = r6 + 1;
        goto L_0x00b1;
        r1.add(r2);
        goto L_0x0099;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r10 = defpackage.ajyu.o(r1);
        return r10;
        r10 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r1 = "asking for ";
        r0.<init>(r1);
        r1 = r9.b;
        r0.append(r1);
        r1 = " on unsuccessful ";
        r0.append(r1);
        r1 = r9.a;
        r0.append(r1);
        r0 = r0.toString();
        r1 = r9.a;
        r1 = r1.e();
        r2 = "contentResult.failureReason";
        defpackage.akcr.a(r1, r2);
        r1 = r1.c();
        r10.<init>(r0, r1);
        r10 = (java.lang.Throwable) r10;
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcm.f(java.lang.String):java.util.List");
    }

    public final b g(String str) {
        akcr.b(str, MessageMediaRefModel.URI);
        if (akcr.a((Object) str, this.b)) {
            gdu gdu = this.a.f().g;
            long j = gdu != null ? gdu.b : 0;
            Object c = this.a.c();
            akcr.a(c, "contentResult.assets");
            c = ajyu.f((List) c);
            akcr.a(c, "contentResult.assets.first()");
            return new b(j, ((gdt) c).c().lastModified());
        }
        gdt h = h(str);
        return new b(h.e(), h.c().lastModified());
    }

    public final boolean isDisposed() {
        return this.c.isDisposed();
    }
}
