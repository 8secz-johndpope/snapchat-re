package defpackage;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import defpackage.aivd.a;
import defpackage.aivl.e;
import defpackage.aiwb.c;
import java.nio.charset.Charset;

/* renamed from: aixr */
public abstract class aixr extends c {
    private static final a<Integer> j = new 1();
    private static final e<Integer> k = aivd.a(":status", j);
    private aivw l;
    private aivl m;
    private Charset n = Charsets.UTF_8;
    private boolean o;

    /* renamed from: aixr$1 */
    class 1 implements a<Integer> {
        1() {
        }
    }

    protected aixr(int i, aiza aiza, aizf aizf) {
        super(i, aiza, aizf);
    }

    private static aivw c(aivl aivl) {
        Integer num = (Integer) aivl.a(k);
        if (num == null) {
            return aivw.i.a("Missing HTTP status code");
        }
        String str = (String) aivl.a(aixo.g);
        if (aixo.a(str)) {
            return null;
        }
        return aixo.a(num.intValue()).b("invalid content-type: ".concat(String.valueOf(str)));
    }

    private static Charset d(aivl aivl) {
        String str = (String) aivl.a(aixo.g);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.UTF_8;
    }

    private static void e(aivl aivl) {
        aivl.b(k);
        aivl.b(aive.b);
        aivl.b(aive.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:71:0x0189 in {3, 10, 11, 22, 23, 30, 31, 35, 36, 42, 45, 46, 47, 52, 53, 55, 59, 60, 61, 64, 65, 69, 70} preds:[]
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
    protected final void a(defpackage.aivl r7) {
        /*
        r6 = this;
        r0 = "headers";
        com.google.common.base.Preconditions.checkNotNull(r7, r0);
        r0 = r6.l;
        r1 = "headers: ";
        if (r0 == 0) goto L_0x001a;
        r7 = java.lang.String.valueOf(r7);
        r7 = r1.concat(r7);
        r7 = r0.b(r7);
        r6.l = r7;
        return;
        r0 = r6.o;	 Catch:{ all -> 0x016d }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x016d }
        r0 = defpackage.aivw.i;	 Catch:{ all -> 0x016d }
        r2 = "Received headers twice";	 Catch:{ all -> 0x016d }
        r0 = r0.a(r2);	 Catch:{ all -> 0x016d }
        r6.l = r0;	 Catch:{ all -> 0x016d }
        r0 = r6.l;
        if (r0 == 0) goto L_0x0042;
        r2 = java.lang.String.valueOf(r7);
        r1 = r1.concat(r2);
        r0 = r0.b(r1);
        r6.l = r0;
        r6.m = r7;
        r7 = defpackage.aixr.d(r7);
        r6.n = r7;
        return;
        r0 = k;	 Catch:{ all -> 0x016d }
        r0 = r7.a(r0);	 Catch:{ all -> 0x016d }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x016d }
        if (r0 == 0) goto L_0x0078;	 Catch:{ all -> 0x016d }
        r2 = r0.intValue();	 Catch:{ all -> 0x016d }
        r3 = 100;	 Catch:{ all -> 0x016d }
        if (r2 < r3) goto L_0x0078;	 Catch:{ all -> 0x016d }
        r0 = r0.intValue();	 Catch:{ all -> 0x016d }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 >= r2) goto L_0x0078;
        r0 = r6.l;
        if (r0 == 0) goto L_0x0077;
        r2 = java.lang.String.valueOf(r7);
        r1 = r1.concat(r2);
        r0 = r0.b(r1);
        r6.l = r0;
        r6.m = r7;
        r7 = defpackage.aixr.d(r7);
        r6.n = r7;
        return;
        r0 = 1;
        r6.o = r0;	 Catch:{ all -> 0x016d }
        r2 = defpackage.aixr.c(r7);	 Catch:{ all -> 0x016d }
        r6.l = r2;	 Catch:{ all -> 0x016d }
        r2 = r6.l;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x00a0;
        r0 = r6.l;
        if (r0 == 0) goto L_0x009f;
        r2 = java.lang.String.valueOf(r7);
        r1 = r1.concat(r2);
        r0 = r0.b(r1);
        r6.l = r0;
        r6.m = r7;
        r7 = defpackage.aixr.d(r7);
        r6.n = r7;
        return;
        defpackage.aixr.e(r7);	 Catch:{ all -> 0x016d }
        r2 = r6.e;	 Catch:{ all -> 0x016d }
        r3 = 0;	 Catch:{ all -> 0x016d }
        if (r2 != 0) goto L_0x00aa;	 Catch:{ all -> 0x016d }
        r2 = 1;	 Catch:{ all -> 0x016d }
        goto L_0x00ab;	 Catch:{ all -> 0x016d }
        r2 = 0;	 Catch:{ all -> 0x016d }
        r4 = "Received headers on closed stream";	 Catch:{ all -> 0x016d }
        com.google.common.base.Preconditions.checkState(r2, r4);	 Catch:{ all -> 0x016d }
        r2 = defpackage.aixo.e;	 Catch:{ all -> 0x016d }
        r2 = r7.a(r2);	 Catch:{ all -> 0x016d }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x016d }
        r4 = r6.b;	 Catch:{ all -> 0x016d }
        if (r4 == 0) goto L_0x00fd;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x00fd;	 Catch:{ all -> 0x016d }
        r4 = "gzip";	 Catch:{ all -> 0x016d }
        r4 = r2.equalsIgnoreCase(r4);	 Catch:{ all -> 0x016d }
        if (r4 == 0) goto L_0x00dd;	 Catch:{ all -> 0x016d }
        r2 = new aixp;	 Catch:{ all -> 0x016d }
        r2.<init>();	 Catch:{ all -> 0x016d }
        r4 = r6.f;	 Catch:{ all -> 0x016d }
        r4.a(r2);	 Catch:{ all -> 0x016d }
        r2 = new aiwg;	 Catch:{ all -> 0x016d }
        r4 = r6.f;	 Catch:{ all -> 0x016d }
        r4 = (defpackage.aiye) r4;	 Catch:{ all -> 0x016d }
        r2.<init>(r6, r6, r4);	 Catch:{ all -> 0x016d }
        r6.f = r2;	 Catch:{ all -> 0x016d }
        r2 = 1;	 Catch:{ all -> 0x016d }
        goto L_0x00fe;	 Catch:{ all -> 0x016d }
        r4 = "identity";	 Catch:{ all -> 0x016d }
        r4 = r2.equalsIgnoreCase(r4);	 Catch:{ all -> 0x016d }
        if (r4 != 0) goto L_0x00fd;	 Catch:{ all -> 0x016d }
        r4 = defpackage.aivw.i;	 Catch:{ all -> 0x016d }
        r5 = "Can't find full stream decompressor for %s";	 Catch:{ all -> 0x016d }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x016d }
        r0[r3] = r2;	 Catch:{ all -> 0x016d }
        r0 = java.lang.String.format(r5, r0);	 Catch:{ all -> 0x016d }
        r0 = r4.a(r0);	 Catch:{ all -> 0x016d }
        r0 = r0.c();	 Catch:{ all -> 0x016d }
        r6.a(r0);	 Catch:{ all -> 0x016d }
        goto L_0x0152;	 Catch:{ all -> 0x016d }
        r2 = 0;	 Catch:{ all -> 0x016d }
        r4 = defpackage.aixo.c;	 Catch:{ all -> 0x016d }
        r4 = r7.a(r4);	 Catch:{ all -> 0x016d }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x016d }
        if (r4 == 0) goto L_0x014d;	 Catch:{ all -> 0x016d }
        r5 = r6.c;	 Catch:{ all -> 0x016d }
        r5 = r5.b;	 Catch:{ all -> 0x016d }
        r5 = r5.get(r4);	 Catch:{ all -> 0x016d }
        r5 = (defpackage.aiuu.a) r5;	 Catch:{ all -> 0x016d }
        if (r5 == 0) goto L_0x0117;	 Catch:{ all -> 0x016d }
        r5 = r5.a;	 Catch:{ all -> 0x016d }
        goto L_0x0118;	 Catch:{ all -> 0x016d }
        r5 = 0;	 Catch:{ all -> 0x016d }
        if (r5 != 0) goto L_0x012f;	 Catch:{ all -> 0x016d }
        r2 = defpackage.aivw.i;	 Catch:{ all -> 0x016d }
        r5 = "Can't find decompressor for %s";	 Catch:{ all -> 0x016d }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x016d }
        r0[r3] = r4;	 Catch:{ all -> 0x016d }
        r0 = java.lang.String.format(r5, r0);	 Catch:{ all -> 0x016d }
        r0 = r2.a(r0);	 Catch:{ all -> 0x016d }
        r0 = r0.c();	 Catch:{ all -> 0x016d }
        goto L_0x00f9;	 Catch:{ all -> 0x016d }
        r0 = defpackage.aiul.b.a;	 Catch:{ all -> 0x016d }
        if (r5 == r0) goto L_0x014d;	 Catch:{ all -> 0x016d }
        if (r2 == 0) goto L_0x0148;	 Catch:{ all -> 0x016d }
        r0 = defpackage.aivw.i;	 Catch:{ all -> 0x016d }
        r2 = "Full stream and gRPC message encoding cannot both be set";	 Catch:{ all -> 0x016d }
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x016d }
        r2 = java.lang.String.format(r2, r3);	 Catch:{ all -> 0x016d }
        r0 = r0.a(r2);	 Catch:{ all -> 0x016d }
        r0 = r0.c();	 Catch:{ all -> 0x016d }
        goto L_0x00f9;	 Catch:{ all -> 0x016d }
        r0 = r6.f;	 Catch:{ all -> 0x016d }
        r0.a(r5);	 Catch:{ all -> 0x016d }
        r0 = r6.a;	 Catch:{ all -> 0x016d }
        r0.a(r7);	 Catch:{ all -> 0x016d }
        r0 = r6.l;
        if (r0 == 0) goto L_0x016c;
        r2 = java.lang.String.valueOf(r7);
        r1 = r1.concat(r2);
        r0 = r0.b(r1);
        r6.l = r0;
        r6.m = r7;
        r7 = defpackage.aixr.d(r7);
        r6.n = r7;
        return;
        r0 = move-exception;
        r2 = r6.l;
        if (r2 == 0) goto L_0x0188;
        r3 = java.lang.String.valueOf(r7);
        r1 = r1.concat(r3);
        r1 = r2.b(r1);
        r6.l = r1;
        r6.m = r7;
        r7 = defpackage.aixr.d(r7);
        r6.n = r7;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixr.a(aivl):void");
    }

    public abstract void a(aivw aivw, aivl aivl);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00a4 in {4, 5, 7, 10, 16, 19, 21, 24, 26, 27, 28, 30, 31} preds:[]
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
    protected final void a(defpackage.aiyo r7, boolean r8) {
        /*
        r6 = this;
        r0 = r6.l;
        r1 = 0;
        if (r0 == 0) goto L_0x004c;
        r2 = new java.lang.StringBuilder;
        r3 = "DATA-----------------------------\n";
        r2.<init>(r3);
        r3 = r6.n;
        r4 = "charset";
        com.google.common.base.Preconditions.checkNotNull(r3, r4);
        r4 = "buffer";
        com.google.common.base.Preconditions.checkNotNull(r7, r4);
        r4 = r7.b();
        r5 = new byte[r4];
        r7.a(r5, r1, r4);
        r1 = new java.lang.String;
        r1.<init>(r5, r3);
        r2.append(r1);
        r1 = r2.toString();
        r0 = r0.b(r1);
        r6.l = r0;
        r7.close();
        r7 = r6.l;
        r7 = r7.n;
        r7 = r7.length();
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r7 > r0) goto L_0x0044;
        if (r8 == 0) goto L_0x009c;
        r7 = r6.l;
        r8 = r6.m;
        r6.a(r7, r8);
        return;
        r0 = r6.o;
        if (r0 != 0) goto L_0x005e;
        r7 = defpackage.aivw.i;
        r8 = "headers not received before payload";
        r7 = r7.a(r8);
        r8 = new aivl;
        r8.<init>();
        goto L_0x0048;
        r0 = "frame";
        com.google.common.base.Preconditions.checkNotNull(r7, r0);
        r0 = 1;
        r2 = r6.e;	 Catch:{ all -> 0x009d }
        if (r2 == 0) goto L_0x0075;	 Catch:{ all -> 0x009d }
        r2 = defpackage.aiwb.a;	 Catch:{ all -> 0x009d }
        r3 = java.util.logging.Level.INFO;	 Catch:{ all -> 0x009d }
        r4 = "Received data on closed stream";	 Catch:{ all -> 0x009d }
        r2.log(r3, r4);	 Catch:{ all -> 0x009d }
        r7.close();
        goto L_0x0082;
        r0 = r6.f;	 Catch:{ Throwable -> 0x007e }
        r0.a(r7);	 Catch:{ Throwable -> 0x007e }
        goto L_0x0082;
        r8 = move-exception;
        r0 = 0;
        goto L_0x009e;
        r0 = move-exception;
        r6.a(r0);	 Catch:{ all -> 0x007b }
        if (r8 == 0) goto L_0x009c;
        r7 = defpackage.aivw.i;
        r8 = "Received unexpected EOS on DATA frame from server.";
        r7 = r7.a(r8);
        r6.l = r7;
        r7 = new aivl;
        r7.<init>();
        r6.m = r7;
        r7 = r6.l;
        r8 = r6.m;
        r6.a(r7, r1, r8);
        return;
        r8 = move-exception;
        if (r0 == 0) goto L_0x00a3;
        r7.close();
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixr.a(aiyo, boolean):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(aivl aivl) {
        Preconditions.checkNotNull(aivl, "trailers");
        if (this.l == null && !this.o) {
            this.l = aixr.c(aivl);
            if (this.l != null) {
                this.m = aivl;
            }
        }
        aivw aivw = this.l;
        if (aivw != null) {
            this.l = aivw.b("trailers: ".concat(String.valueOf(aivl)));
            a(this.l, this.m);
            return;
        }
        String str;
        aivw = (aivw) aivl.a(aive.b);
        if (aivw != null) {
            str = (String) aivl.a(aive.a);
        } else if (this.o) {
            aivw = aivw.d;
            str = "missing GRPC status in response";
        } else {
            Integer num = (Integer) aivl.a(k);
            aivw = (num != null ? aixo.a(num.intValue()) : aivw.i.a("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
            aixr.e(aivl);
            a(aivl, aivw);
        }
        aivw = aivw.a(str);
        aixr.e(aivl);
        a(aivl, aivw);
    }
}
