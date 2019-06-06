package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: akii */
public final class akii {
    boolean a;
    boolean b;
    private final List<akhd> c;
    private int d = 0;

    public akii(List<akhd> list) {
        this.c = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.d; i < this.c.size(); i++) {
            if (((akhd) this.c.get(i)).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0061 in {4, 5, 6, 9, 11} preds:[]
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
    public final defpackage.akhd a(javax.net.ssl.SSLSocket r5) {
        /*
        r4 = this;
        r0 = r4.d;
        r1 = r4.c;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x0020;
        r2 = r4.c;
        r2 = r2.get(r0);
        r2 = (defpackage.akhd) r2;
        r3 = r2.a(r5);
        if (r3 == 0) goto L_0x001d;
        r0 = r0 + 1;
        r4.d = r0;
        goto L_0x0021;
        r0 = r0 + 1;
        goto L_0x0008;
        r2 = 0;
        if (r2 == 0) goto L_0x0031;
        r0 = r4.b(r5);
        r4.a = r0;
        r0 = defpackage.akhz.a;
        r1 = r4.b;
        r0.a(r2, r5, r1);
        return r2;
        r0 = new java.net.UnknownServiceException;
        r1 = new java.lang.StringBuilder;
        r2 = "Unable to find acceptable protocols. isFallback=";
        r1.<init>(r2);
        r2 = r4.b;
        r1.append(r2);
        r2 = ", modes=";
        r1.append(r2);
        r2 = r4.c;
        r1.append(r2);
        r2 = ", supported protocols=";
        r1.append(r2);
        r5 = r5.getEnabledProtocols();
        r5 = java.util.Arrays.toString(r5);
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akii.a(javax.net.ssl.SSLSocket):akhd");
    }
}
