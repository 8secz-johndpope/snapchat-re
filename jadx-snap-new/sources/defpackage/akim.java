package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: akim */
public final class akim {
    final akgt a;
    final akik b;
    private final akgx c;
    private final akhi d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<akhx> h = new ArrayList();

    /* renamed from: akim$a */
    public static final class a {
        final List<akhx> a;
        int b = 0;

        a(List<akhx> list) {
            this.a = list;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }

    public akim(akgt akgt, akik akik, akgx akgx, akhi akhi) {
        List singletonList;
        this.a = akgt;
        this.b = akik;
        this.c = akgx;
        this.d = akhi;
        akhm akhm = akgt.a;
        Proxy proxy = akgt.g;
        if (proxy != null) {
            singletonList = Collections.singletonList(proxy);
        } else {
            singletonList = this.a.f.select(akhm.b());
            if (singletonList == null || singletonList.isEmpty()) {
                singletonList = akib.a(Proxy.NO_PROXY);
            } else {
                singletonList = akib.a(singletonList);
            }
        }
        this.e = singletonList;
        this.f = 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00db in {4, 9, 10, 11, 13, 14, 21, 26, 27, 29, 31} preds:[]
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
    private void a(java.net.Proxy r7) {
        /*
        r6 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6.g = r0;
        r0 = r7.type();
        r1 = java.net.Proxy.Type.DIRECT;
        if (r0 == r1) goto L_0x004e;
        r0 = r7.type();
        r1 = java.net.Proxy.Type.SOCKS;
        if (r0 != r1) goto L_0x0018;
        goto L_0x004e;
        r0 = r7.address();
        r1 = r0 instanceof java.net.InetSocketAddress;
        if (r1 == 0) goto L_0x0036;
        r0 = (java.net.InetSocketAddress) r0;
        r1 = r0.getAddress();
        if (r1 != 0) goto L_0x002d;
        r1 = r0.getHostName();
        goto L_0x0031;
        r1 = r1.getHostAddress();
        r0 = r0.getPort();
        goto L_0x005a;
        r7 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Proxy.address() is not an InetSocketAddress: ";
        r1.<init>(r2);
        r0 = r0.getClass();
        r1.append(r0);
        r0 = r1.toString();
        r7.<init>(r0);
        throw r7;
        r0 = r6.a;
        r0 = r0.a;
        r1 = r0.b;
        r0 = r6.a;
        r0 = r0.a;
        r0 = r0.c;
        if (r0 <= 0) goto L_0x00ba;
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r0 > r2) goto L_0x00ba;
        r7 = r7.type();
        r2 = java.net.Proxy.Type.SOCKS;
        if (r7 != r2) goto L_0x0073;
        r7 = r6.g;
        r0 = java.net.InetSocketAddress.createUnresolved(r1, r0);
        r7.add(r0);
        return;
        r7 = r6.a;
        r7 = r7.b;
        r7 = r7.a(r1);
        r2 = r7.isEmpty();
        if (r2 != 0) goto L_0x009c;
        r1 = 0;
        r2 = r7.size();
        if (r1 >= r2) goto L_0x009b;
        r3 = r7.get(r1);
        r3 = (java.net.InetAddress) r3;
        r4 = r6.g;
        r5 = new java.net.InetSocketAddress;
        r5.<init>(r3, r0);
        r4.add(r5);
        r1 = r1 + 1;
        goto L_0x0086;
        return;
        r7 = new java.net.UnknownHostException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r6.a;
        r2 = r2.b;
        r0.append(r2);
        r2 = " returned no addresses for ";
        r0.append(r2);
        r0.append(r1);
        r0 = r0.toString();
        r7.<init>(r0);
        throw r7;
        r7 = new java.net.SocketException;
        r2 = new java.lang.StringBuilder;
        r3 = "No route to ";
        r2.<init>(r3);
        r2.append(r1);
        r1 = ":";
        r2.append(r1);
        r2.append(r0);
        r0 = "; port is out of range";
        r2.append(r0);
        r0 = r2.toString();
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akim.a(java.net.Proxy):void");
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    public final boolean a() {
        return c() || !this.h.isEmpty();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x009b in {11, 12, 13, 16, 18, 21, 23, 25} preds:[]
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
    public final defpackage.akim.a b() {
        /*
        r7 = this;
        r0 = r7.a();
        if (r0 == 0) goto L_0x0095;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r7.c();
        if (r1 == 0) goto L_0x007f;
        r1 = r7.c();
        if (r1 == 0) goto L_0x005b;
        r1 = r7.e;
        r2 = r7.f;
        r3 = r2 + 1;
        r7.f = r3;
        r1 = r1.get(r2);
        r1 = (java.net.Proxy) r1;
        r7.a(r1);
        r2 = 0;
        r3 = r7.g;
        r3 = r3.size();
        if (r2 >= r3) goto L_0x0054;
        r4 = new akhx;
        r5 = r7.a;
        r6 = r7.g;
        r6 = r6.get(r2);
        r6 = (java.net.InetSocketAddress) r6;
        r4.<init>(r5, r1, r6);
        r5 = r7.b;
        r5 = r5.c(r4);
        if (r5 == 0) goto L_0x004e;
        r5 = r7.h;
        r5.add(r4);
        goto L_0x0051;
        r0.add(r4);
        r2 = r2 + 1;
        goto L_0x002f;
        r1 = r0.isEmpty();
        if (r1 != 0) goto L_0x000b;
        goto L_0x007f;
        r0 = new java.net.SocketException;
        r1 = new java.lang.StringBuilder;
        r2 = "No route to ";
        r1.<init>(r2);
        r2 = r7.a;
        r2 = r2.a;
        r2 = r2.b;
        r1.append(r2);
        r2 = "; exhausted proxy configurations: ";
        r1.append(r2);
        r2 = r7.e;
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x008f;
        r1 = r7.h;
        r0.addAll(r1);
        r1 = r7.h;
        r1.clear();
        r1 = new akim$a;
        r1.<init>(r0);
        return r1;
        r0 = new java.util.NoSuchElementException;
        r0.<init>();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akim.b():akim$a");
    }
}
