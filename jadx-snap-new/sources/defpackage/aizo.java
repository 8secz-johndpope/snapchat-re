package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import defpackage.aiva.c;
import defpackage.aiva.d;
import defpackage.aixo.b;
import defpackage.aizi.a;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: aizo */
class aizo implements aiwx, a {
    private static final Map<ajaf, aivw> C;
    private static final aizn[] D = new aizn[0];
    static final Logger a = Logger.getLogger(aizo.class.getName());
    c A;
    final aiym B;
    private final String E;
    private final Random F = new Random();
    private final Supplier<Stopwatch> G;
    private final aivc H = aivc.a(getClass().getName());
    private int I;
    private final aiyv J;
    private final int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ScheduledExecutorService O;
    private final aizf P;
    final InetSocketAddress b;
    final String c;
    aiyd.a d;
    aizi e;
    aizu f;
    final Object g = new Object();
    final Map<Integer, aizn> h = new HashMap();
    final Executor i;
    int j;
    a k;
    aiud l = aiud.b;
    aivw m;
    aixs n;
    SSLSocketFactory o;
    HostnameVerifier p;
    Socket q;
    int r = 0;
    LinkedList<aizn> s = new LinkedList();
    final aizx t;
    aixx u;
    boolean v;
    long w;
    long x;
    boolean y;
    final Runnable z;

    /* renamed from: aizo$a */
    class a implements defpackage.ajag.a, Runnable {
        private ajag a;
        private boolean b = true;

        a(ajag ajag) {
            this.a = ajag;
        }

        public final void a(int i) {
            aizo.this.e.a(i, ajaf.PROTOCOL_ERROR);
        }

        /* JADX WARNING: Missing block: B:22:0x005a, code skipped:
            if (r0 == null) goto L_0x006d;
     */
        /* JADX WARNING: Missing block: B:23:0x005c, code skipped:
            defpackage.aizo.a(r7.c, defpackage.ajaf.PROTOCOL_ERROR, "Received window_update for unknown stream: ".concat(java.lang.String.valueOf(r8)));
     */
        /* JADX WARNING: Missing block: B:24:0x006d, code skipped:
            return;
     */
        public final void a(int r8, long r9) {
            /*
            r7 = this;
            r0 = 0;
            r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
            if (r2 != 0) goto L_0x0024;
        L_0x0006:
            r9 = "Received 0 flow control window increment.";
            if (r8 != 0) goto L_0x0012;
        L_0x000a:
            r8 = defpackage.aizo.this;
            r10 = defpackage.ajaf.PROTOCOL_ERROR;
            r8.a(0, r10, defpackage.aizo.a(r10).b(r9));
            return;
        L_0x0012:
            r0 = defpackage.aizo.this;
            r10 = defpackage.aivw.i;
            r2 = r10.a(r9);
            r3 = 1;
            r4 = 0;
            r5 = defpackage.ajaf.PROTOCOL_ERROR;
            r6 = 0;
            r1 = r8;
            r0.a(r1, r2, r3, r4, r5, r6);
            return;
        L_0x0024:
            r0 = 0;
            r1 = defpackage.aizo.this;
            r1 = r1.g;
            monitor-enter(r1);
            if (r8 != 0) goto L_0x0037;
        L_0x002c:
            r8 = defpackage.aizo.this;	 Catch:{ all -> 0x006e }
            r8 = r8.f;	 Catch:{ all -> 0x006e }
            r0 = 0;
            r10 = (int) r9;	 Catch:{ all -> 0x006e }
            r8.a(r0, r10);	 Catch:{ all -> 0x006e }
            monitor-exit(r1);	 Catch:{ all -> 0x006e }
            return;
        L_0x0037:
            r2 = defpackage.aizo.this;	 Catch:{ all -> 0x006e }
            r2 = r2.h;	 Catch:{ all -> 0x006e }
            r3 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x006e }
            r2 = r2.get(r3);	 Catch:{ all -> 0x006e }
            r2 = (defpackage.aizn) r2;	 Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0050;
        L_0x0047:
            r3 = defpackage.aizo.this;	 Catch:{ all -> 0x006e }
            r3 = r3.f;	 Catch:{ all -> 0x006e }
            r10 = (int) r9;	 Catch:{ all -> 0x006e }
            r3.a(r2, r10);	 Catch:{ all -> 0x006e }
            goto L_0x0059;
        L_0x0050:
            r9 = defpackage.aizo.this;	 Catch:{ all -> 0x006e }
            r9 = r9.a(r8);	 Catch:{ all -> 0x006e }
            if (r9 != 0) goto L_0x0059;
        L_0x0058:
            r0 = 1;
        L_0x0059:
            monitor-exit(r1);	 Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x006d;
        L_0x005c:
            r9 = defpackage.aizo.this;
            r10 = defpackage.ajaf.PROTOCOL_ERROR;
            r8 = java.lang.String.valueOf(r8);
            r0 = "Received window_update for unknown stream: ";
            r8 = r0.concat(r8);
            r9.a(0, r10, defpackage.aizo.a(r10).b(r8));
        L_0x006d:
            return;
        L_0x006e:
            r8 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x006e }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo$a.a(int, long):void");
        }

        public final void a(int i, ajaf ajaf) {
            aivw b = aizo.a(ajaf).b("Rst Stream");
            boolean z = b.m == defpackage.aivw.a.CANCELLED || b.m == defpackage.aivw.a.DEADLINE_EXCEEDED;
            aizo.this.a(i, b, ajaf == ajaf.REFUSED_STREAM ? 2 : 1, z, null, null);
        }

        public final void a(int i, ajaf ajaf, akkg akkg) {
            aivw a;
            if (ajaf == ajaf.ENHANCE_YOUR_CALM) {
                aizo.a.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", new Object[]{this, akkg.a()}));
                if ("too_many_pings".equals(akkg.a())) {
                    aizo.this.z.run();
                }
            }
            long j = (long) ajaf.httpCode;
            b bVar = (j >= ((long) b.codeMap.length) || j < 0) ? null : b.codeMap[(int) j];
            if (bVar == null) {
                int i2 = b.INTERNAL_ERROR.status.m.value;
                aivw a2 = (i2 < 0 || i2 > aivw.a.size()) ? aivw.d.a("Unknown code ".concat(String.valueOf(i2))) : (aivw) aivw.a.get(i2);
                a = a2.a("Unrecognized HTTP/2 error code: ".concat(String.valueOf(j)));
            } else {
                a = bVar.status;
            }
            a = a.b("Received Goaway");
            if (akkg.g() > 0) {
                a = a.b(akkg.a());
            }
            aizo.this.a(i, null, a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:35:0x0088 in {6, 15, 16, 17, 19, 21, 22, 25, 28, 31, 34} preds:[]
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
        public final void a(defpackage.ajam r10) {
            /*
            r9 = this;
            r0 = defpackage.aizo.this;
            r0 = r0.g;
            monitor-enter(r0);
            r1 = 4;
            r2 = r10.a(r1);	 Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0014;	 Catch:{ all -> 0x0085 }
            r2 = r10.d;	 Catch:{ all -> 0x0085 }
            r1 = r2[r1];	 Catch:{ all -> 0x0085 }
            r2 = defpackage.aizo.this;	 Catch:{ all -> 0x0085 }
            r2.r = r1;	 Catch:{ all -> 0x0085 }
            r1 = 7;	 Catch:{ all -> 0x0085 }
            r2 = r10.a(r1);	 Catch:{ all -> 0x0085 }
            r3 = 0;	 Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x0060;	 Catch:{ all -> 0x0085 }
            r2 = r10.d;	 Catch:{ all -> 0x0085 }
            r1 = r2[r1];	 Catch:{ all -> 0x0085 }
            r2 = defpackage.aizo.this;	 Catch:{ all -> 0x0085 }
            r2 = r2.f;	 Catch:{ all -> 0x0085 }
            if (r1 < 0) goto L_0x0050;	 Catch:{ all -> 0x0085 }
            r4 = r2.c;	 Catch:{ all -> 0x0085 }
            r4 = r1 - r4;	 Catch:{ all -> 0x0085 }
            r2.c = r1;	 Catch:{ all -> 0x0085 }
            r1 = r2.a;	 Catch:{ all -> 0x0085 }
            r1 = r1.d();	 Catch:{ all -> 0x0085 }
            r5 = r1.length;	 Catch:{ all -> 0x0085 }
            r6 = 0;	 Catch:{ all -> 0x0085 }
            if (r6 >= r5) goto L_0x004c;	 Catch:{ all -> 0x0085 }
            r7 = r1[r6];	 Catch:{ all -> 0x0085 }
            r8 = r7.g;	 Catch:{ all -> 0x0085 }
            r8 = (defpackage.aizu.a) r8;	 Catch:{ all -> 0x0085 }
            if (r8 != 0) goto L_0x0046;	 Catch:{ all -> 0x0085 }
            r8 = new aizu$a;	 Catch:{ all -> 0x0085 }
            r8.<init>(r2, r7);	 Catch:{ all -> 0x0085 }
            r7.g = r8;	 Catch:{ all -> 0x0085 }
            goto L_0x0049;	 Catch:{ all -> 0x0085 }
            r8.b(r4);	 Catch:{ all -> 0x0085 }
            r6 = r6 + 1;	 Catch:{ all -> 0x0085 }
            goto L_0x0034;	 Catch:{ all -> 0x0085 }
            if (r4 <= 0) goto L_0x0060;	 Catch:{ all -> 0x0085 }
            r1 = 1;	 Catch:{ all -> 0x0085 }
            goto L_0x0061;	 Catch:{ all -> 0x0085 }
            r10 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0085 }
            r2 = "Invalid initial window size: ";	 Catch:{ all -> 0x0085 }
            r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0085 }
            r1 = r2.concat(r1);	 Catch:{ all -> 0x0085 }
            r10.<init>(r1);	 Catch:{ all -> 0x0085 }
            throw r10;	 Catch:{ all -> 0x0085 }
            r1 = 0;	 Catch:{ all -> 0x0085 }
            r2 = r9.b;	 Catch:{ all -> 0x0085 }
            if (r2 == 0) goto L_0x006e;	 Catch:{ all -> 0x0085 }
            r2 = defpackage.aizo.this;	 Catch:{ all -> 0x0085 }
            r2 = r2.d;	 Catch:{ all -> 0x0085 }
            r2.a();	 Catch:{ all -> 0x0085 }
            r9.b = r3;	 Catch:{ all -> 0x0085 }
            r2 = defpackage.aizo.this;	 Catch:{ all -> 0x0085 }
            r2 = r2.e;	 Catch:{ all -> 0x0085 }
            r2.a(r10);	 Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x007e;	 Catch:{ all -> 0x0085 }
            r10 = defpackage.aizo.this;	 Catch:{ all -> 0x0085 }
            r10 = r10.f;	 Catch:{ all -> 0x0085 }
            r10.b();	 Catch:{ all -> 0x0085 }
            r10 = defpackage.aizo.this;	 Catch:{ all -> 0x0085 }
            r10.a();	 Catch:{ all -> 0x0085 }
            monitor-exit(r0);	 Catch:{ all -> 0x0085 }
            return;	 Catch:{ all -> 0x0085 }
            r10 = move-exception;	 Catch:{ all -> 0x0085 }
            monitor-exit(r0);	 Catch:{ all -> 0x0085 }
            throw r10;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo$a.a(ajam):void");
        }

        public final void a(boolean z, int i, int i2) {
            if (z) {
                aixs aixs;
                long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
                synchronized (aizo.this.g) {
                    if (aizo.this.n == null) {
                        aizo.a.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (aizo.this.n.a == j) {
                        aixs = aizo.this.n;
                        aizo.this.n = null;
                    } else {
                        aizo.a.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", new Object[]{Long.valueOf(aizo.this.n.a), Long.valueOf(j)}));
                    }
                    aixs = null;
                }
                if (aixs != null) {
                    aixs.a();
                }
                return;
            }
            aizo.this.e.a(true, i, i2);
        }

        public final void a(boolean z, int i, akkf akkf, int i2) {
            aizn b = aizo.this.b(i);
            if (b != null) {
                long j = (long) i2;
                akkf.a(j);
                akkd akkd = new akkd();
                akkd.a_(akkf.c(), j);
                synchronized (aizo.this.g) {
                    b.i.a(akkd, z);
                }
            } else if (aizo.this.a(i)) {
                aizo.this.e.a(i, ajaf.INVALID_STREAM);
                akkf.f((long) i2);
            } else {
                aizo.this.a(0, ajaf.PROTOCOL_ERROR, aizo.a(ajaf.PROTOCOL_ERROR).b("Received data for unknown stream: ".concat(String.valueOf(i))));
                return;
            }
            aizo aizo = aizo.this;
            aizo.j += i2;
            if (aizo.this.j >= 32767) {
                aizo.this.e.a(0, (long) aizo.this.j);
                aizo.this.j = 0;
            }
        }

        public final void a(boolean z, int i, List<ajai> list) {
            Object obj;
            synchronized (aizo.this.g) {
                aizn aizn = (aizn) aizo.this.h.get(Integer.valueOf(i));
                if (aizn != null) {
                    aizn.i.a((List) list, z);
                } else if (aizo.this.a(i)) {
                    aizo.this.e.a(i, ajaf.INVALID_STREAM);
                } else {
                    obj = 1;
                }
                obj = null;
            }
            if (obj != null) {
                aizo.this.a(0, ajaf.PROTOCOL_ERROR, aizo.a(ajaf.PROTOCOL_ERROR).b("Received header for unknown stream: ".concat(String.valueOf(i))));
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x00b0 in {2, 9, 13, 15, 17, 19, 27, 29, 32, 33, 36, 38, 41, 42} preds:[]
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
        public final void run() {
            /*
            r8 = this;
            r0 = "Exception closing frame reader";
            r1 = java.lang.Thread.currentThread();
            r1 = r1.getName();
            r2 = defpackage.aixo.a;
            if (r2 != 0) goto L_0x0017;
            r2 = java.lang.Thread.currentThread();
            r3 = "OkHttpClientTransport";
            r2.setName(r3);
            r2 = 0;
            r3 = r8.a;	 Catch:{ Throwable -> 0x0060 }
            r3 = r3.a(r8);	 Catch:{ Throwable -> 0x0060 }
            if (r3 == 0) goto L_0x002e;	 Catch:{ Throwable -> 0x0060 }
            r3 = defpackage.aizo.this;	 Catch:{ Throwable -> 0x0060 }
            r3 = r3.u;	 Catch:{ Throwable -> 0x0060 }
            if (r3 == 0) goto L_0x0017;	 Catch:{ Throwable -> 0x0060 }
            r3 = defpackage.aizo.this;	 Catch:{ Throwable -> 0x0060 }
            r3 = r3.u;	 Catch:{ Throwable -> 0x0060 }
            r3.b();	 Catch:{ Throwable -> 0x0060 }
            goto L_0x0017;	 Catch:{ Throwable -> 0x0060 }
            r3 = defpackage.aizo.this;	 Catch:{ Throwable -> 0x0060 }
            r4 = defpackage.ajaf.INTERNAL_ERROR;	 Catch:{ Throwable -> 0x0060 }
            r5 = defpackage.aivw.j;	 Catch:{ Throwable -> 0x0060 }
            r6 = "End of stream or IOException";	 Catch:{ Throwable -> 0x0060 }
            r5 = r5.a(r6);	 Catch:{ Throwable -> 0x0060 }
            r3.a(r2, r4, r5);	 Catch:{ Throwable -> 0x0060 }
            r2 = r8.a;	 Catch:{ IOException -> 0x0043 }
            r2.close();	 Catch:{ IOException -> 0x0043 }
            goto L_0x004b;
            r2 = move-exception;
            r3 = defpackage.aizo.a;
            r4 = java.util.logging.Level.INFO;
            r3.log(r4, r0, r2);
            r0 = defpackage.aizo.this;
            r0 = r0.d;
            r0.b();
            r0 = defpackage.aixo.a;
            if (r0 != 0) goto L_0x008e;
            r0 = java.lang.Thread.currentThread();
            r0.setName(r1);
            return;
            r2 = move-exception;
            goto L_0x008f;
            r3 = move-exception;
            r4 = defpackage.aizo.this;	 Catch:{ all -> 0x005e }
            r5 = defpackage.ajaf.PROTOCOL_ERROR;	 Catch:{ all -> 0x005e }
            r6 = defpackage.aivw.j;	 Catch:{ all -> 0x005e }
            r7 = "error in frame handler";	 Catch:{ all -> 0x005e }
            r6 = r6.a(r7);	 Catch:{ all -> 0x005e }
            r3 = r6.b(r3);	 Catch:{ all -> 0x005e }
            r4.a(r2, r5, r3);	 Catch:{ all -> 0x005e }
            r2 = r8.a;	 Catch:{ IOException -> 0x007a }
            r2.close();	 Catch:{ IOException -> 0x007a }
            goto L_0x0082;
            r2 = move-exception;
            r3 = defpackage.aizo.a;
            r4 = java.util.logging.Level.INFO;
            r3.log(r4, r0, r2);
            r0 = defpackage.aizo.this;
            r0 = r0.d;
            r0.b();
            r0 = defpackage.aixo.a;
            if (r0 != 0) goto L_0x008e;
            goto L_0x0056;
            return;
            r3 = r8.a;	 Catch:{ IOException -> 0x0095 }
            r3.close();	 Catch:{ IOException -> 0x0095 }
            goto L_0x009d;
            r3 = move-exception;
            r4 = defpackage.aizo.a;
            r5 = java.util.logging.Level.INFO;
            r4.log(r5, r0, r3);
            r0 = defpackage.aizo.this;
            r0 = r0.d;
            r0.b();
            r0 = defpackage.aixo.a;
            if (r0 != 0) goto L_0x00af;
            r0 = java.lang.Thread.currentThread();
            r0.setName(r1);
            throw r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo$a.run():void");
        }
    }

    /* renamed from: aizo$1 */
    class 1 implements aizf.b {
        1() {
        }
    }

    /* renamed from: aizo$2 */
    class 2 implements Runnable {

        /* renamed from: aizo$2$1 */
        class 1 implements akkv {
            1() {
            }

            public final long a(akkd akkd, long j) {
                return -1;
            }

            public final akkw a() {
                return akkw.f;
            }

            public final void close() {
            }
        }

        2() {
        }

        public final void run() {
            int i = Integer.MAX_VALUE;
            SSLSession sSLSession = null;
            if ((aizo.this.b == null ? 1 : null) != null) {
                aizo aizo = aizo.this;
                aizo.k = new a(sSLSession);
                aizo.this.i.execute(aizo.this.k);
                synchronized (aizo.this.g) {
                    aizo.this.r = Integer.MAX_VALUE;
                    aizo.this.a();
                }
                aizo.this.e.a((ajah) sSLSession, aizo.this.q);
                sSLSession.set(sSLSession);
                return;
            }
            akkf a = akko.a(new 1());
            ajak ajak = new ajak();
            akke a2;
            try {
                Socket socket = aizo.this.B == null ? new Socket(aizo.this.b.getAddress(), aizo.this.b.getPort()) : aizo.this.a(aizo.this.b, aizo.this.B.a, aizo.this.B.b, aizo.this.B.c);
                if (aizo.this.o != null) {
                    List list;
                    Object obj;
                    SSLSocketFactory sSLSocketFactory = aizo.this.o;
                    HostnameVerifier hostnameVerifier = aizo.this.p;
                    aizo aizo2 = aizo.this;
                    URI b = aixo.b(aizo2.c);
                    String host = b.getHost() != null ? b.getHost() : aizo2.c;
                    aizo aizo3 = aizo.this;
                    URI b2 = aixo.b(aizo3.c);
                    int port = b2.getPort() != -1 ? b2.getPort() : aizo3.b.getPort();
                    aizx aizx = aizo.this.t;
                    Preconditions.checkNotNull(sSLSocketFactory, "sslSocketFactory");
                    Preconditions.checkNotNull(socket, "socket");
                    Preconditions.checkNotNull(aizx, "spec");
                    socket = (SSLSocket) sSLSocketFactory.createSocket(socket, host, port, true);
                    aizx b3 = new aizx.a(aizx).a(aizx.c != null ? (String[]) ajae.a(String.class, aizx.c, socket.getEnabledCipherSuites()) : sSLSession).b((String[]) ajae.a(String.class, aizx.d, socket.getEnabledProtocols())).b();
                    socket.setEnabledProtocols(b3.d);
                    String[] strArr = b3.c;
                    if (strArr != null) {
                        socket.setEnabledCipherSuites(strArr);
                    }
                    aizp aizp = aizp.b;
                    if (aizx.e) {
                        list = aizr.a;
                    }
                    Object a3 = aizp.a(socket, host, list);
                    List list2 = aizr.a;
                    if (a3.equals(ajac.HTTP_1_0.protocol)) {
                        obj = ajac.HTTP_1_0;
                    } else if (a3.equals(ajac.HTTP_1_1.protocol)) {
                        obj = ajac.HTTP_1_1;
                    } else if (a3.equals(ajac.HTTP_2.protocol)) {
                        obj = ajac.HTTP_2;
                    } else if (a3.equals(ajac.GRPC_EXP.protocol)) {
                        obj = ajac.GRPC_EXP;
                    } else if (a3.equals(ajac.SPDY_3.protocol)) {
                        obj = ajac.SPDY_3;
                    } else {
                        throw new IOException("Unexpected protocol: ".concat(String.valueOf(a3)));
                    }
                    boolean contains = list2.contains(obj);
                    StringBuilder stringBuilder = new StringBuilder("Only ");
                    stringBuilder.append(aizr.a);
                    stringBuilder.append(" are supported, but negotiated protocol is %s");
                    Preconditions.checkState(contains, stringBuilder.toString(), a3);
                    if (hostnameVerifier == null) {
                        hostnameVerifier = aizz.a;
                    }
                    String substring = (host.startsWith("[") && host.endsWith("]")) ? host.substring(1, host.length() - 1) : host;
                    if (hostnameVerifier.verify(substring, socket.getSession())) {
                        sSLSession = socket.getSession();
                    } else {
                        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(String.valueOf(host)));
                    }
                }
                socket.setTcpNoDelay(true);
                a = akko.a(akko.b(socket));
                a2 = akko.a(akko.a(socket));
                aizo.this.l = aiud.a().a(aiuz.a, socket.getRemoteSocketAddress()).a(aiuz.b, socket.getLocalSocketAddress()).a(aiuz.c, sSLSession).a(aixn.c, sSLSession == null ? aivt.NONE : aivt.PRIVACY_AND_INTEGRITY).a();
                synchronized (aizo.this.g) {
                    aizo.this.q = (Socket) Preconditions.checkNotNull(socket, "socket");
                    aizo.this.r = i;
                    aizo.this.a();
                    if (sSLSession != null) {
                        aizo.this.A = new c(new d(sSLSession));
                    }
                }
                ajah a4 = ajak.a(a2);
                aizo.this.e.a(a4, aizo.this.q);
                try {
                    a4.a();
                    a4.b(new ajam());
                } catch (Exception e) {
                    aizo.this.a(e);
                }
            } catch (aivx e2) {
                aizo aizo4 = aizo.this;
                sSLSession = ajaf.INTERNAL_ERROR;
                aizo4.a(0, (ajaf) sSLSession, e2.a);
            } catch (Exception e3) {
                aizo.this.a(e3);
            } finally {
                aizo aizo5 = aizo.this;
                i = new a(ajak.a(a));
                aizo5.k = i;
                Executor executor = aizo.this.i;
                a2 = aizo.this.k;
                executor.execute(a2);
            }
        }
    }

    static {
        EnumMap enumMap = new EnumMap(ajaf.class);
        enumMap.put(ajaf.NO_ERROR, aivw.i.a("No error: A GRPC status of OK should have been sent"));
        enumMap.put(ajaf.PROTOCOL_ERROR, aivw.i.a("Protocol error"));
        enumMap.put(ajaf.INTERNAL_ERROR, aivw.i.a("Internal error"));
        enumMap.put(ajaf.FLOW_CONTROL_ERROR, aivw.i.a("Flow control error"));
        enumMap.put(ajaf.STREAM_CLOSED, aivw.i.a("Stream closed"));
        enumMap.put(ajaf.FRAME_TOO_LARGE, aivw.i.a("Frame too large"));
        enumMap.put(ajaf.REFUSED_STREAM, aivw.j.a("Refused stream"));
        enumMap.put(ajaf.CANCEL, aivw.c.a("Cancelled"));
        enumMap.put(ajaf.COMPRESSION_ERROR, aivw.i.a("Compression error"));
        enumMap.put(ajaf.CONNECT_ERROR, aivw.i.a("Connect error"));
        enumMap.put(ajaf.ENHANCE_YOUR_CALM, aivw.h.a("Enhance your calm"));
        enumMap.put(ajaf.INADEQUATE_SECURITY, aivw.f.a("Inadequate security"));
        C = Collections.unmodifiableMap(enumMap);
    }

    aizo(InetSocketAddress inetSocketAddress, String str, String str2, Executor executor, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, aizx aizx, int i, aiym aiym, Runnable runnable, aizf aizf) {
        this.b = (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "address");
        this.c = str;
        this.K = i;
        this.i = (Executor) Preconditions.checkNotNull(executor, "executor");
        this.J = new aiyv(executor);
        this.I = 3;
        this.o = sSLSocketFactory;
        this.p = hostnameVerifier;
        this.t = (aizx) Preconditions.checkNotNull(aizx, "connectionSpec");
        this.G = aixo.o;
        StringBuilder stringBuilder = new StringBuilder();
        if (str2 != null) {
            stringBuilder.append(str2);
            stringBuilder.append(' ');
        }
        stringBuilder.append("grpc-java-");
        stringBuilder.append("okhttp");
        stringBuilder.append('/');
        stringBuilder.append("1.16.0");
        this.E = stringBuilder.toString();
        this.B = aiym;
        this.z = (Runnable) Preconditions.checkNotNull(runnable, "tooManyPingsRunnable");
        this.P = (aizf) Preconditions.checkNotNull(aizf);
        synchronized (this.g) {
            this.P.d = (aizf.b) Preconditions.checkNotNull(new 1());
        }
    }

    static aivw a(ajaf ajaf) {
        aivw aivw = (aivw) C.get(ajaf);
        if (aivw != null) {
            return aivw;
        }
        aivw = aivw.d;
        StringBuilder stringBuilder = new StringBuilder("Unknown http2 error code: ");
        stringBuilder.append(ajaf.httpCode);
        return aivw.a(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x003d in {6, 8} preds:[]
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
    private static java.lang.String a(defpackage.akkv r8) {
        /*
        r0 = new akkd;
        r0.<init>();
        r1 = 1;
        r3 = r8.a(r0, r1);
        r5 = -1;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0021;
        r3 = r0.b;
        r3 = r3 - r1;
        r1 = r0.b(r3);
        r2 = 10;
        if (r1 != r2) goto L_0x0005;
        r8 = r0.p();
        return r8;
        r8 = new java.io.EOFException;
        r1 = new java.lang.StringBuilder;
        r2 = "\\n not found: ";
        r1.<init>(r2);
        r0 = r0.m();
        r0 = r0.e();
        r1.append(r0);
        r0 = r1.toString();
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo.a(akkv):java.lang.String");
    }

    private void f() {
        if (this.m != null && this.h.isEmpty() && this.s.isEmpty() && !this.M) {
            this.M = true;
            aixx aixx = this.u;
            if (aixx != null) {
                aixx.e();
                this.O = (ScheduledExecutorService) aiyy.a(aixo.n, this.O);
            }
            aixs aixs = this.n;
            if (aixs != null) {
                aixs.a(h());
                this.n = null;
            }
            if (!this.L) {
                this.L = true;
                this.e.a(0, ajaf.NO_ERROR, new byte[0]);
            }
            this.e.close();
        }
    }

    private void g() {
        if (this.N && this.s.isEmpty() && this.h.isEmpty()) {
            this.N = false;
            this.d.a(false);
            aixx aixx = this.u;
            if (aixx != null) {
                aixx.d();
            }
        }
    }

    private Throwable h() {
        synchronized (this.g) {
            aivx d;
            if (this.m != null) {
                d = this.m.d();
                return d;
            }
            d = aivw.j.a("Connection closed").d();
            return d;
        }
    }

    public final Runnable a(aiyd.a aVar) {
        this.d = (aiyd.a) Preconditions.checkNotNull(aVar, "listener");
        if (this.v) {
            this.O = (ScheduledExecutorService) aiyy.a.a(aixo.n);
            this.u = new aixx(new aixx.a(this), this.O, this.w, this.x, this.y);
            this.u.a();
        }
        this.e = new aizi(this, this.J);
        this.f = new aizu(this, this.e);
        this.J.execute(new 2());
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:82:0x01fd in {4, 5, 16, 19, 21, 24, 27, 28, 41, 46, 54, 58, 61, 63, 66, 68, 70, 72, 74, 76, 78, 81} preds:[]
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
    final java.net.Socket a(java.net.InetSocketAddress r12, java.net.InetSocketAddress r13, java.lang.String r14, java.lang.String r15) {
        /*
        r11 = this;
        r0 = "\r\n";
        r1 = r13.getAddress();	 Catch:{ IOException -> 0x01eb }
        if (r1 == 0) goto L_0x0016;	 Catch:{ IOException -> 0x01eb }
        r1 = new java.net.Socket;	 Catch:{ IOException -> 0x01eb }
        r2 = r13.getAddress();	 Catch:{ IOException -> 0x01eb }
        r13 = r13.getPort();	 Catch:{ IOException -> 0x01eb }
        r1.<init>(r2, r13);	 Catch:{ IOException -> 0x01eb }
        goto L_0x0023;	 Catch:{ IOException -> 0x01eb }
        r1 = new java.net.Socket;	 Catch:{ IOException -> 0x01eb }
        r2 = r13.getHostName();	 Catch:{ IOException -> 0x01eb }
        r13 = r13.getPort();	 Catch:{ IOException -> 0x01eb }
        r1.<init>(r2, r13);	 Catch:{ IOException -> 0x01eb }
        r13 = 1;	 Catch:{ IOException -> 0x01eb }
        r1.setTcpNoDelay(r13);	 Catch:{ IOException -> 0x01eb }
        r2 = defpackage.akko.b(r1);	 Catch:{ IOException -> 0x01eb }
        r3 = defpackage.akko.a(r1);	 Catch:{ IOException -> 0x01eb }
        r3 = defpackage.akko.a(r3);	 Catch:{ IOException -> 0x01eb }
        r4 = new aimn$a;	 Catch:{ IOException -> 0x01eb }
        r4.<init>();	 Catch:{ IOException -> 0x01eb }
        r5 = "https";	 Catch:{ IOException -> 0x01eb }
        r4.a = r5;	 Catch:{ IOException -> 0x01eb }
        r5 = r12.getHostName();	 Catch:{ IOException -> 0x01eb }
        r6 = "host == null";
        if (r5 == 0) goto L_0x01e5;
        r7 = r5.length();	 Catch:{ IOException -> 0x01eb }
        r7 = defpackage.aimn.a(r5, r7);	 Catch:{ IOException -> 0x01eb }
        r8 = "[";	 Catch:{ IOException -> 0x01eb }
        r8 = r7.startsWith(r8);	 Catch:{ IOException -> 0x01eb }
        r9 = 0;	 Catch:{ IOException -> 0x01eb }
        if (r8 == 0) goto L_0x007d;	 Catch:{ IOException -> 0x01eb }
        r8 = "]";	 Catch:{ IOException -> 0x01eb }
        r8 = r7.endsWith(r8);	 Catch:{ IOException -> 0x01eb }
        if (r8 == 0) goto L_0x007d;	 Catch:{ IOException -> 0x01eb }
        r8 = r7.length();	 Catch:{ IOException -> 0x01eb }
        r8 = r8 - r13;	 Catch:{ IOException -> 0x01eb }
        r7 = defpackage.aimn.a.a(r7, r8);	 Catch:{ IOException -> 0x01eb }
        if (r7 != 0) goto L_0x0069;	 Catch:{ IOException -> 0x01eb }
        goto L_0x0092;	 Catch:{ IOException -> 0x01eb }
        r7 = r7.getAddress();	 Catch:{ IOException -> 0x01eb }
        r8 = r7.length;	 Catch:{ IOException -> 0x01eb }
        r9 = 16;	 Catch:{ IOException -> 0x01eb }
        if (r8 != r9) goto L_0x0077;	 Catch:{ IOException -> 0x01eb }
        r9 = defpackage.aimn.a.a(r7);	 Catch:{ IOException -> 0x01eb }
        goto L_0x0092;	 Catch:{ IOException -> 0x01eb }
        r12 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x01eb }
        r12.<init>();	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r7 = defpackage.aimn.a.a(r7);	 Catch:{ IOException -> 0x01eb }
        if (r7 != 0) goto L_0x0084;	 Catch:{ IOException -> 0x01eb }
        goto L_0x0092;	 Catch:{ IOException -> 0x01eb }
        r8 = r7.length();	 Catch:{ IOException -> 0x01eb }
        r10 = "\u0000\t\n\r #%/:?@[\\]";	 Catch:{ IOException -> 0x01eb }
        r10 = defpackage.aimn.a(r7, r8, r10);	 Catch:{ IOException -> 0x01eb }
        if (r10 == r8) goto L_0x0091;	 Catch:{ IOException -> 0x01eb }
        goto L_0x0092;	 Catch:{ IOException -> 0x01eb }
        r9 = r7;	 Catch:{ IOException -> 0x01eb }
        if (r9 == 0) goto L_0x01d5;	 Catch:{ IOException -> 0x01eb }
        r4.d = r9;	 Catch:{ IOException -> 0x01eb }
        r12 = r12.getPort();	 Catch:{ IOException -> 0x01eb }
        if (r12 <= 0) goto L_0x01c5;	 Catch:{ IOException -> 0x01eb }
        r5 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;	 Catch:{ IOException -> 0x01eb }
        if (r12 > r5) goto L_0x01c5;	 Catch:{ IOException -> 0x01eb }
        r4.e = r12;	 Catch:{ IOException -> 0x01eb }
        r12 = r4.a;	 Catch:{ IOException -> 0x01eb }
        if (r12 == 0) goto L_0x01bd;	 Catch:{ IOException -> 0x01eb }
        r12 = r4.d;	 Catch:{ IOException -> 0x01eb }
        if (r12 == 0) goto L_0x01b7;	 Catch:{ IOException -> 0x01eb }
        r12 = new aimn;	 Catch:{ IOException -> 0x01eb }
        r5 = 0;	 Catch:{ IOException -> 0x01eb }
        r12.<init>(r4, r5);	 Catch:{ IOException -> 0x01eb }
        r4 = new aimp$a;	 Catch:{ IOException -> 0x01eb }
        r4.<init>();	 Catch:{ IOException -> 0x01eb }
        r4.a = r12;	 Catch:{ IOException -> 0x01eb }
        r6 = "Host";	 Catch:{ IOException -> 0x01eb }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01eb }
        r7.<init>();	 Catch:{ IOException -> 0x01eb }
        r8 = r12.a;	 Catch:{ IOException -> 0x01eb }
        r7.append(r8);	 Catch:{ IOException -> 0x01eb }
        r8 = ":";	 Catch:{ IOException -> 0x01eb }
        r7.append(r8);	 Catch:{ IOException -> 0x01eb }
        r12 = r12.b;	 Catch:{ IOException -> 0x01eb }
        r7.append(r12);	 Catch:{ IOException -> 0x01eb }
        r12 = r7.toString();	 Catch:{ IOException -> 0x01eb }
        r12 = r4.a(r6, r12);	 Catch:{ IOException -> 0x01eb }
        r4 = "User-Agent";	 Catch:{ IOException -> 0x01eb }
        r6 = r11.E;	 Catch:{ IOException -> 0x01eb }
        r12 = r12.a(r4, r6);	 Catch:{ IOException -> 0x01eb }
        if (r14 == 0) goto L_0x00eb;	 Catch:{ IOException -> 0x01eb }
        if (r15 == 0) goto L_0x00eb;	 Catch:{ IOException -> 0x01eb }
        r4 = "Proxy-Authorization";	 Catch:{ IOException -> 0x01eb }
        r14 = defpackage.aiml.a(r14, r15);	 Catch:{ IOException -> 0x01eb }
        r12.a(r4, r14);	 Catch:{ IOException -> 0x01eb }
        r14 = r12.a;	 Catch:{ IOException -> 0x01eb }
        if (r14 == 0) goto L_0x01af;	 Catch:{ IOException -> 0x01eb }
        r14 = new aimp;	 Catch:{ IOException -> 0x01eb }
        r14.<init>(r12, r5);	 Catch:{ IOException -> 0x01eb }
        r12 = r14.a;	 Catch:{ IOException -> 0x01eb }
        r15 = "CONNECT %s:%d HTTP/1.1";	 Catch:{ IOException -> 0x01eb }
        r4 = 2;	 Catch:{ IOException -> 0x01eb }
        r6 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x01eb }
        r7 = r12.a;	 Catch:{ IOException -> 0x01eb }
        r6[r5] = r7;	 Catch:{ IOException -> 0x01eb }
        r12 = r12.b;	 Catch:{ IOException -> 0x01eb }
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ IOException -> 0x01eb }
        r6[r13] = r12;	 Catch:{ IOException -> 0x01eb }
        r12 = java.lang.String.format(r15, r6);	 Catch:{ IOException -> 0x01eb }
        r12 = r3.b(r12);	 Catch:{ IOException -> 0x01eb }
        r12.b(r0);	 Catch:{ IOException -> 0x01eb }
        r12 = r14.b;	 Catch:{ IOException -> 0x01eb }
        r12 = r12.a;	 Catch:{ IOException -> 0x01eb }
        r12 = r12.length;	 Catch:{ IOException -> 0x01eb }
        r12 = r12 / r4;	 Catch:{ IOException -> 0x01eb }
        r15 = 0;	 Catch:{ IOException -> 0x01eb }
        if (r15 >= r12) goto L_0x013b;	 Catch:{ IOException -> 0x01eb }
        r6 = r14.b;	 Catch:{ IOException -> 0x01eb }
        r6 = r6.a(r15);	 Catch:{ IOException -> 0x01eb }
        r6 = r3.b(r6);	 Catch:{ IOException -> 0x01eb }
        r7 = ": ";	 Catch:{ IOException -> 0x01eb }
        r6 = r6.b(r7);	 Catch:{ IOException -> 0x01eb }
        r7 = r14.b;	 Catch:{ IOException -> 0x01eb }
        r7 = r7.b(r15);	 Catch:{ IOException -> 0x01eb }
        r6 = r6.b(r7);	 Catch:{ IOException -> 0x01eb }
        r6.b(r0);	 Catch:{ IOException -> 0x01eb }
        r15 = r15 + 1;	 Catch:{ IOException -> 0x01eb }
        goto L_0x0119;	 Catch:{ IOException -> 0x01eb }
        r3.b(r0);	 Catch:{ IOException -> 0x01eb }
        r3.flush();	 Catch:{ IOException -> 0x01eb }
        r12 = defpackage.aizo.a(r2);	 Catch:{ IOException -> 0x01eb }
        r12 = defpackage.aimt.a(r12);	 Catch:{ IOException -> 0x01eb }
        r14 = defpackage.aizo.a(r2);	 Catch:{ IOException -> 0x01eb }
        r15 = "";	 Catch:{ IOException -> 0x01eb }
        r14 = r14.equals(r15);	 Catch:{ IOException -> 0x01eb }
        if (r14 == 0) goto L_0x0149;	 Catch:{ IOException -> 0x01eb }
        r14 = r12.a;	 Catch:{ IOException -> 0x01eb }
        r15 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x01eb }
        if (r14 < r15) goto L_0x0162;	 Catch:{ IOException -> 0x01eb }
        r14 = r12.a;	 Catch:{ IOException -> 0x01eb }
        r15 = 300; // 0x12c float:4.2E-43 double:1.48E-321;	 Catch:{ IOException -> 0x01eb }
        if (r14 >= r15) goto L_0x0162;	 Catch:{ IOException -> 0x01eb }
        return r1;	 Catch:{ IOException -> 0x01eb }
        r14 = new akkd;	 Catch:{ IOException -> 0x01eb }
        r14.<init>();	 Catch:{ IOException -> 0x01eb }
        r1.shutdownOutput();	 Catch:{ IOException -> 0x0170 }
        r6 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ IOException -> 0x0170 }
        r2.a(r14, r6);	 Catch:{ IOException -> 0x0170 }
        goto L_0x0186;
        r15 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01eb }
        r2 = "Unable to read body: ";	 Catch:{ IOException -> 0x01eb }
        r0.<init>(r2);	 Catch:{ IOException -> 0x01eb }
        r15 = r15.toString();	 Catch:{ IOException -> 0x01eb }
        r0.append(r15);	 Catch:{ IOException -> 0x01eb }
        r15 = r0.toString();	 Catch:{ IOException -> 0x01eb }
        r14.b(r15);	 Catch:{ IOException -> 0x01eb }
        r1.close();	 Catch:{ IOException -> 0x0189 }
    L_0x0189:
        r15 = "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s";	 Catch:{ IOException -> 0x01eb }
        r0 = 3;	 Catch:{ IOException -> 0x01eb }
        r0 = new java.lang.Object[r0];	 Catch:{ IOException -> 0x01eb }
        r1 = r12.a;	 Catch:{ IOException -> 0x01eb }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ IOException -> 0x01eb }
        r0[r5] = r1;	 Catch:{ IOException -> 0x01eb }
        r12 = r12.b;	 Catch:{ IOException -> 0x01eb }
        r0[r13] = r12;	 Catch:{ IOException -> 0x01eb }
        r12 = r14.n();	 Catch:{ IOException -> 0x01eb }
        r0[r4] = r12;	 Catch:{ IOException -> 0x01eb }
        r12 = java.lang.String.format(r15, r0);	 Catch:{ IOException -> 0x01eb }
        r13 = defpackage.aivw.j;	 Catch:{ IOException -> 0x01eb }
        r12 = r13.a(r12);	 Catch:{ IOException -> 0x01eb }
        r12 = r12.d();	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r12 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x01eb }
        r13 = "url == null";	 Catch:{ IOException -> 0x01eb }
        r12.<init>(r13);	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r12 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x01eb }
        r12.<init>(r6);	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r12 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x01eb }
        r13 = "scheme == null";	 Catch:{ IOException -> 0x01eb }
        r12.<init>(r13);	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r13 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x01eb }
        r14 = "unexpected port: ";	 Catch:{ IOException -> 0x01eb }
        r12 = java.lang.String.valueOf(r12);	 Catch:{ IOException -> 0x01eb }
        r12 = r14.concat(r12);	 Catch:{ IOException -> 0x01eb }
        r13.<init>(r12);	 Catch:{ IOException -> 0x01eb }
        throw r13;	 Catch:{ IOException -> 0x01eb }
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x01eb }
        r13 = "unexpected host: ";	 Catch:{ IOException -> 0x01eb }
        r14 = java.lang.String.valueOf(r5);	 Catch:{ IOException -> 0x01eb }
        r13 = r13.concat(r14);	 Catch:{ IOException -> 0x01eb }
        r12.<init>(r13);	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r12 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x01eb }
        r12.<init>(r6);	 Catch:{ IOException -> 0x01eb }
        throw r12;	 Catch:{ IOException -> 0x01eb }
        r12 = move-exception;
        r13 = defpackage.aivw.j;
        r14 = "Failed trying to connect with proxy";
        r13 = r13.a(r14);
        r12 = r13.b(r12);
        r12 = r12.d();
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo.a(java.net.InetSocketAddress, java.net.InetSocketAddress, java.lang.String, java.lang.String):java.net.Socket");
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, aivw aivw, int i2, boolean z, ajaf ajaf, aivl aivl) {
        synchronized (this.g) {
            aizn aizn = (aizn) this.h.remove(Integer.valueOf(i));
            if (aizn != null) {
                if (ajaf != null) {
                    this.e.a(i, ajaf.CANCEL);
                }
                if (aivw != null) {
                    aizn.c cVar = aizn.i;
                    if (aivl == null) {
                        aivl = new aivl();
                    }
                    cVar.a(aivw, i2, z, aivl);
                }
                if (!a()) {
                    f();
                    g();
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0083 in {5, 10, 16, 20, 23, 26} preds:[]
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
    final void a(int r7, defpackage.ajaf r8, defpackage.aivw r9) {
        /*
        r6 = this;
        r0 = r6.g;
        monitor-enter(r0);
        r1 = r6.m;	 Catch:{ all -> 0x0080 }
        if (r1 != 0) goto L_0x000e;	 Catch:{ all -> 0x0080 }
        r6.m = r9;	 Catch:{ all -> 0x0080 }
        r1 = r6.d;	 Catch:{ all -> 0x0080 }
        r1.a(r9);	 Catch:{ all -> 0x0080 }
        r1 = 1;	 Catch:{ all -> 0x0080 }
        r2 = 0;	 Catch:{ all -> 0x0080 }
        if (r8 == 0) goto L_0x001f;	 Catch:{ all -> 0x0080 }
        r3 = r6.L;	 Catch:{ all -> 0x0080 }
        if (r3 != 0) goto L_0x001f;	 Catch:{ all -> 0x0080 }
        r6.L = r1;	 Catch:{ all -> 0x0080 }
        r3 = r6.e;	 Catch:{ all -> 0x0080 }
        r4 = new byte[r2];	 Catch:{ all -> 0x0080 }
        r3.a(r2, r8, r4);	 Catch:{ all -> 0x0080 }
        r8 = r6.h;	 Catch:{ all -> 0x0080 }
        r8 = r8.entrySet();	 Catch:{ all -> 0x0080 }
        r8 = r8.iterator();	 Catch:{ all -> 0x0080 }
        r3 = r8.hasNext();	 Catch:{ all -> 0x0080 }
        r4 = 2;	 Catch:{ all -> 0x0080 }
        if (r3 == 0) goto L_0x0056;	 Catch:{ all -> 0x0080 }
        r3 = r8.next();	 Catch:{ all -> 0x0080 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x0080 }
        r5 = r3.getKey();	 Catch:{ all -> 0x0080 }
        r5 = (java.lang.Integer) r5;	 Catch:{ all -> 0x0080 }
        r5 = r5.intValue();	 Catch:{ all -> 0x0080 }
        if (r5 <= r7) goto L_0x0029;	 Catch:{ all -> 0x0080 }
        r8.remove();	 Catch:{ all -> 0x0080 }
        r3 = r3.getValue();	 Catch:{ all -> 0x0080 }
        r3 = (defpackage.aizn) r3;	 Catch:{ all -> 0x0080 }
        r3 = r3.i;	 Catch:{ all -> 0x0080 }
        r5 = new aivl;	 Catch:{ all -> 0x0080 }
        r5.<init>();	 Catch:{ all -> 0x0080 }
        r3.a(r9, r4, r2, r5);	 Catch:{ all -> 0x0080 }
        goto L_0x0029;	 Catch:{ all -> 0x0080 }
        r7 = r6.s;	 Catch:{ all -> 0x0080 }
        r7 = r7.iterator();	 Catch:{ all -> 0x0080 }
        r8 = r7.hasNext();	 Catch:{ all -> 0x0080 }
        if (r8 == 0) goto L_0x0073;	 Catch:{ all -> 0x0080 }
        r8 = r7.next();	 Catch:{ all -> 0x0080 }
        r8 = (defpackage.aizn) r8;	 Catch:{ all -> 0x0080 }
        r8 = r8.i;	 Catch:{ all -> 0x0080 }
        r2 = new aivl;	 Catch:{ all -> 0x0080 }
        r2.<init>();	 Catch:{ all -> 0x0080 }
        r8.a(r9, r4, r1, r2);	 Catch:{ all -> 0x0080 }
        goto L_0x005c;	 Catch:{ all -> 0x0080 }
        r7 = r6.s;	 Catch:{ all -> 0x0080 }
        r7.clear();	 Catch:{ all -> 0x0080 }
        r6.g();	 Catch:{ all -> 0x0080 }
        r6.f();	 Catch:{ all -> 0x0080 }
        monitor-exit(r0);	 Catch:{ all -> 0x0080 }
        return;	 Catch:{ all -> 0x0080 }
        r7 = move-exception;	 Catch:{ all -> 0x0080 }
        monitor-exit(r0);	 Catch:{ all -> 0x0080 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo.a(int, ajaf, aivw):void");
    }

    public final void a(aivw aivw) {
        synchronized (this.g) {
            if (this.m != null) {
                return;
            }
            this.m = aivw;
            this.d.a(this.m);
            f();
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0049, code skipped:
            if (r1 == null) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:18:0x004b, code skipped:
            r11.e.a(false, (int) (r3 >>> 32), (int) r3);
     */
    /* JADX WARNING: Missing block: B:19:0x0056, code skipped:
            monitor-enter(r6);
     */
    /* JADX WARNING: Missing block: B:22:0x0059, code skipped:
            if (r6.c != false) goto L_0x0062;
     */
    /* JADX WARNING: Missing block: B:23:0x005b, code skipped:
            r6.b.put(r12, r13);
     */
    /* JADX WARNING: Missing block: B:24:0x0060, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:25:0x0061, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:27:0x0064, code skipped:
            if (r6.d == null) goto L_0x006d;
     */
    /* JADX WARNING: Missing block: B:28:0x0066, code skipped:
            r12 = defpackage.aixs.a(r12, r6.d);
     */
    /* JADX WARNING: Missing block: B:29:0x006d, code skipped:
            r12 = defpackage.aixs.a(r12, r6.e);
     */
    /* JADX WARNING: Missing block: B:30:0x0073, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:31:0x0074, code skipped:
            defpackage.aixs.a(r13, r12);
     */
    /* JADX WARNING: Missing block: B:32:0x0077, code skipped:
            return;
     */
    public final void a(defpackage.aiwu.a r12, java.util.concurrent.Executor r13) {
        /*
        r11 = this;
        r0 = r11.e;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        goto L_0x0009;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        com.google.common.base.Preconditions.checkState(r0);
        r3 = 0;
        r0 = r11.g;
        monitor-enter(r0);
        r5 = r11.M;	 Catch:{ all -> 0x007b }
        if (r5 == 0) goto L_0x001e;
    L_0x0015:
        r1 = r11.h();	 Catch:{ all -> 0x007b }
        defpackage.aixs.a(r12, r13, r1);	 Catch:{ all -> 0x007b }
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        return;
    L_0x001e:
        r5 = r11.n;	 Catch:{ all -> 0x007b }
        if (r5 == 0) goto L_0x0027;
    L_0x0022:
        r1 = r11.n;	 Catch:{ all -> 0x007b }
        r6 = r1;
        r1 = 0;
        goto L_0x0048;
    L_0x0027:
        r3 = r11.F;	 Catch:{ all -> 0x007b }
        r3 = r3.nextLong();	 Catch:{ all -> 0x007b }
        r5 = r11.G;	 Catch:{ all -> 0x007b }
        r5 = r5.get();	 Catch:{ all -> 0x007b }
        r5 = (com.google.common.base.Stopwatch) r5;	 Catch:{ all -> 0x007b }
        r5.start();	 Catch:{ all -> 0x007b }
        r6 = new aixs;	 Catch:{ all -> 0x007b }
        r6.<init>(r3, r5);	 Catch:{ all -> 0x007b }
        r11.n = r6;	 Catch:{ all -> 0x007b }
        r5 = r11.P;	 Catch:{ all -> 0x007b }
        r7 = r5.c;	 Catch:{ all -> 0x007b }
        r9 = 1;
        r7 = r7 + r9;
        r5.c = r7;	 Catch:{ all -> 0x007b }
    L_0x0048:
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        if (r1 == 0) goto L_0x0056;
    L_0x004b:
        r0 = r11.e;
        r1 = 32;
        r7 = r3 >>> r1;
        r1 = (int) r7;
        r4 = (int) r3;
        r0.a(r2, r1, r4);
    L_0x0056:
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x0078 }
        if (r0 != 0) goto L_0x0062;
    L_0x005b:
        r0 = r6.b;	 Catch:{ all -> 0x0078 }
        r0.put(r12, r13);	 Catch:{ all -> 0x0078 }
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        return;
    L_0x0062:
        r0 = r6.d;	 Catch:{ all -> 0x0078 }
        if (r0 == 0) goto L_0x006d;
    L_0x0066:
        r0 = r6.d;	 Catch:{ all -> 0x0078 }
        r12 = defpackage.aixs.a(r12, r0);	 Catch:{ all -> 0x0078 }
        goto L_0x0073;
    L_0x006d:
        r0 = r6.e;	 Catch:{ all -> 0x0078 }
        r12 = defpackage.aixs.a(r12, r0);	 Catch:{ all -> 0x0078 }
    L_0x0073:
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        defpackage.aixs.a(r13, r12);
        return;
    L_0x0078:
        r12 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        throw r12;
    L_0x007b:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo.a(aiwu$a, java.util.concurrent.Executor):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(aizn aizn) {
        Preconditions.checkState(aizn.h == -1, "StreamId already assigned");
        this.h.put(Integer.valueOf(this.I), aizn);
        e();
        aizn.i.b(this.I);
        if (!(aizn.d.a == aivm.c.UNARY || aizn.d.a == aivm.c.SERVER_STREAMING) || aizn.j) {
            this.e.b();
        }
        int i = this.I;
        if (i >= 2147483645) {
            this.I = Integer.MAX_VALUE;
            a(Integer.MAX_VALUE, ajaf.NO_ERROR, aivw.j.a("Stream ids exhausted"));
            return;
        }
        this.I = i + 2;
    }

    public final void a(Throwable th) {
        Preconditions.checkNotNull(th, "failureCause");
        a(0, ajaf.INTERNAL_ERROR, aivw.j.b(th));
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        boolean z = false;
        while (!this.s.isEmpty() && this.h.size() < this.r) {
            a((aizn) this.s.poll());
            z = true;
        }
        return z;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i) {
        boolean z;
        synchronized (this.g) {
            z = true;
            if (i >= this.I || (i & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    public final aivc b() {
        return this.H;
    }

    /* Access modifiers changed, original: final */
    public final aizn b(int i) {
        aizn aizn;
        synchronized (this.g) {
            aizn = (aizn) this.h.get(Integer.valueOf(i));
        }
        return aizn;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x005f in {6, 10, 13, 16} preds:[]
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
    public final void b(defpackage.aivw r6) {
        /*
        r5 = this;
        r5.a(r6);
        r0 = r5.g;
        monitor-enter(r0);
        r1 = r5.h;	 Catch:{ all -> 0x005c }
        r1 = r1.entrySet();	 Catch:{ all -> 0x005c }
        r1 = r1.iterator();	 Catch:{ all -> 0x005c }
        r2 = r1.hasNext();	 Catch:{ all -> 0x005c }
        if (r2 == 0) goto L_0x0031;	 Catch:{ all -> 0x005c }
        r2 = r1.next();	 Catch:{ all -> 0x005c }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x005c }
        r1.remove();	 Catch:{ all -> 0x005c }
        r2 = r2.getValue();	 Catch:{ all -> 0x005c }
        r2 = (defpackage.aizn) r2;	 Catch:{ all -> 0x005c }
        r2 = r2.i;	 Catch:{ all -> 0x005c }
        r3 = 0;	 Catch:{ all -> 0x005c }
        r4 = new aivl;	 Catch:{ all -> 0x005c }
        r4.<init>();	 Catch:{ all -> 0x005c }
        r2.a(r6, r3, r4);	 Catch:{ all -> 0x005c }
        goto L_0x0010;	 Catch:{ all -> 0x005c }
        r1 = r5.s;	 Catch:{ all -> 0x005c }
        r1 = r1.iterator();	 Catch:{ all -> 0x005c }
        r2 = r1.hasNext();	 Catch:{ all -> 0x005c }
        if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x005c }
        r2 = r1.next();	 Catch:{ all -> 0x005c }
        r2 = (defpackage.aizn) r2;	 Catch:{ all -> 0x005c }
        r2 = r2.i;	 Catch:{ all -> 0x005c }
        r3 = 1;	 Catch:{ all -> 0x005c }
        r4 = new aivl;	 Catch:{ all -> 0x005c }
        r4.<init>();	 Catch:{ all -> 0x005c }
        r2.a(r6, r3, r4);	 Catch:{ all -> 0x005c }
        goto L_0x0037;	 Catch:{ all -> 0x005c }
        r6 = r5.s;	 Catch:{ all -> 0x005c }
        r6.clear();	 Catch:{ all -> 0x005c }
        r5.g();	 Catch:{ all -> 0x005c }
        r5.f();	 Catch:{ all -> 0x005c }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        return;	 Catch:{ all -> 0x005c }
        r6 = move-exception;	 Catch:{ all -> 0x005c }
        monitor-exit(r0);	 Catch:{ all -> 0x005c }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizo.b(aivw):void");
    }

    /* Access modifiers changed, original: final */
    public final void b(aizn aizn) {
        this.s.remove(aizn);
        g();
    }

    public final aiud c() {
        return this.l;
    }

    /* Access modifiers changed, original: final */
    public final aizn[] d() {
        aizn[] aiznArr;
        synchronized (this.g) {
            aiznArr = (aizn[]) this.h.values().toArray(D);
        }
        return aiznArr;
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        if (!this.N) {
            this.N = true;
            this.d.a(true);
            aixx aixx = this.u;
            if (aixx != null) {
                aixx.c();
            }
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("logId", this.H.a).add("address", this.b).toString();
    }
}
