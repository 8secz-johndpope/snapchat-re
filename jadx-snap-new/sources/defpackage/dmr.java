package defpackage;

import com.google.common.io.BaseEncoding;
import com.google.protobuf.nano.MessageNano;
import defpackage.tnj.a;

/* renamed from: dmr */
public final class dmr implements dmn {
    private final dlx a;
    private final dlz b;
    private final ihh c;
    private final tnj d;
    private final tnk e;

    public dmr(dlx dlx, dlz dlz, ihh ihh, tnj tnj, tnk tnk) {
        this.a = dlx;
        this.b = dlz;
        this.c = ihh;
        this.d = tnj;
        this.e = tnk;
    }

    private /* synthetic */ void a(long j, Throwable th) {
        long a = this.c.a() - j;
        String str = th == null ? "success" : "fail";
        this.a.a(inp.NETWORK_MAPPING_DISK_TIME, a, "type", "write", "outcome", str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0098 in {6, 9, 11, 15, 18, 21} preds:[]
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
    private defpackage.dml<defpackage.acgd> b(boolean r17) {
        /*
        r16 = this;
        r1 = r16;
        r2 = "outcome";
        r3 = "read";
        r4 = "type";
        r5 = java.lang.System.currentTimeMillis();
        r7 = "success";
        r0 = r1.e;	 Catch:{ all -> 0x0084 }
        r8 = defpackage.dmr.c(r17);	 Catch:{ all -> 0x0084 }
        r0 = r0.f(r8);	 Catch:{ all -> 0x0084 }
        r8 = r0.isPresent();	 Catch:{ all -> 0x0084 }
        r9 = 0;	 Catch:{ all -> 0x0084 }
        if (r8 == 0) goto L_0x0081;	 Catch:{ all -> 0x0084 }
        r8 = r0.get();	 Catch:{ all -> 0x0084 }
        r8 = (java.lang.String) r8;	 Catch:{ all -> 0x0084 }
        r8 = com.google.common.base.Strings.isNullOrEmpty(r8);	 Catch:{ all -> 0x0084 }
        if (r8 == 0) goto L_0x002c;	 Catch:{ all -> 0x0084 }
        goto L_0x0081;	 Catch:{ all -> 0x0084 }
        r8 = r1.b;	 Catch:{ all -> 0x0084 }
        r0 = r0.get();	 Catch:{ all -> 0x0084 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0084 }
        r0 = r8.b(r0);	 Catch:{ all -> 0x0084 }
        r11 = r0.b;	 Catch:{ all -> 0x0084 }
        if (r11 != 0) goto L_0x0051;	 Catch:{ all -> 0x0084 }
        r0 = "fail";	 Catch:{ all -> 0x0084 }
        r7 = r1.c;
        r7 = r7.a();
        r7 = r7 - r5;
        r5 = r1.a;
        r6 = defpackage.inp.NETWORK_MAPPING_DISK_TIME;
        r0 = new java.lang.String[]{r4, r3, r2, r0};
        r5.a(r6, r7, r0);
        return r9;
        r8 = new dml;	 Catch:{ all -> 0x0084 }
        r12 = r0.c;	 Catch:{ all -> 0x0084 }
        r15 = r0.d;	 Catch:{ all -> 0x0084 }
        r10 = r8;	 Catch:{ all -> 0x0084 }
        r14 = r17;	 Catch:{ all -> 0x0084 }
        r10.<init>(r11, r12, r14, r15);	 Catch:{ all -> 0x0084 }
        r0 = r1.c;	 Catch:{ all -> 0x0084 }
        r9 = r0.a();	 Catch:{ all -> 0x0084 }
        r9 = r9 - r5;	 Catch:{ all -> 0x0084 }
        r0 = r1.a;	 Catch:{ all -> 0x0084 }
        r11 = defpackage.inp.NETWORK_MAPPING_DISK_TIME;	 Catch:{ all -> 0x0084 }
        r12 = 0;	 Catch:{ all -> 0x0084 }
        r12 = new java.lang.String[r12];	 Catch:{ all -> 0x0084 }
        r0.a(r11, r9, r12);	 Catch:{ all -> 0x0084 }
        r0 = r1.c;
        r9 = r0.a();
        r9 = r9 - r5;
        r0 = r1.a;
        r5 = defpackage.inp.NETWORK_MAPPING_DISK_TIME;
        r2 = new java.lang.String[]{r4, r3, r2, r7};
        r0.a(r5, r9, r2);
        return r8;
        r0 = "not_found";	 Catch:{ all -> 0x0084 }
        goto L_0x003e;
        r0 = move-exception;
        r8 = r1.c;
        r8 = r8.a();
        r8 = r8 - r5;
        r5 = r1.a;
        r6 = defpackage.inp.NETWORK_MAPPING_DISK_TIME;
        r2 = new java.lang.String[]{r4, r3, r2, r7};
        r5.a(r6, r8, r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmr.b(boolean):dml");
    }

    private static dmj c(boolean z) {
        return z ? dmj.CACHED_NETWORK_MAPPING_PROD : dmj.CACHED_NETWORK_MAPPING_DEV;
    }

    private /* synthetic */ dml d(boolean z) {
        return b(z);
    }

    public final ajcx a(dml<acgd> dml) {
        long a = this.c.a();
        acek acek = new acek();
        acek.b = (acgd) dml.a();
        acek.c = dml.a;
        acek.a |= 1;
        String str = dml.b;
        if (str != null) {
            acek.d = str;
            acek.a |= 2;
            String encode = BaseEncoding.base64().encode(MessageNano.toByteArray(acek));
            a b = this.d.b();
            b.a(dmr.c(dml.c), encode);
            return b.c().b(new -$$Lambda$dmr$8TENoLW9ipWdF8CK93r0Co7yYlw(this, a));
        }
        throw new NullPointerException();
    }

    public final ajdj<dml<acgd>> a(boolean z) {
        return ajdj.b(new -$$Lambda$dmr$ypXZdMjYO7dgPfeSqGN-bWOkv8o(this, z));
    }
}
