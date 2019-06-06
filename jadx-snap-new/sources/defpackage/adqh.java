package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.Uninterruptibles;
import defpackage.qph.a.a;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;

/* renamed from: adqh */
public final class adqh implements adpy, adpz {
    private static final String[] a = new String[]{"TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"};
    private static final int b = ((int) (Math.log(60.0d) / Math.log(2.0d)));
    private final ajwy<ifa> A;
    private final ajwy<ilv> B;
    private String C;
    private final ajwy<Context> c;
    private final ajwy<gpb> d;
    private final ajwy<adqp> e;
    private final Handler f;
    private final Runnable g;
    private final Runnable h;
    private final Runnable i;
    private final adqc j = new adqc();
    private aesz k;
    private long l;
    private final AtomicLong m;
    private final AtomicReference<qqc> n;
    private final Set<qqd> o;
    private SSLSocket p;
    private UUID q;
    private adqa r;
    private adqb s;
    private final adqf t;
    private final adqg u;
    private final ScheduledExecutorService v;
    private final adqe w;
    private final adqd x;
    private final ajwy<iha> y;
    private final ajwy<adqi> z;

    /* renamed from: adqh$a */
    enum a {
        TIMED_OUT,
        SSL_HANDSHAKE_FAILURE,
        WRONG_SERVER,
        UNKNOWN_FAILURE,
        GATEWAY_INFO_UNAVAILABLE,
        AUTHENTICATION_FAILURE
    }

    static {
        -$$Lambda$adqh$UqOVRT19V8hik9F1rhi_v8w46G8 -__lambda_adqh_uqovrt19v8hik9f1rhi_v8w46g8 = -$$Lambda$adqh$UqOVRT19V8hik9F1rhi_v8w46G8.INSTANCE;
    }

    public adqh(ajwy<Context> ajwy, ajwy<gpb> ajwy2, ajwy<iha> ajwy3, ajwy<adqp> ajwy4, ajwy<adqi> ajwy5, ajwy<ifa> ajwy6, ajwy<ilv> ajwy7) {
        this.c = ajwy;
        this.e = ajwy4;
        this.z = ajwy5;
        this.d = ajwy2;
        this.A = ajwy6;
        this.B = ajwy7;
        HandlerThread handlerThread = new HandlerThread("SecureChatSessionV2HandlerThread");
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
        this.n = new AtomicReference(qqc.STOPPED);
        this.o = Sets.newCopyOnWriteArraySet();
        this.k = null;
        this.m = new AtomicLong(0);
        this.y = ajwy3;
        this.v = Executors.newSingleThreadScheduledExecutor();
        this.w = new adqe(this, this.v);
        this.x = new adqd(this.v);
        a(this.w);
        a(this.j);
        this.u = new adqg(this.x);
        this.u.f.add(this);
        this.u.start();
        this.t = new adqf();
        this.t.c.add(this);
        this.t.a(this.x);
        this.t.a(this.w);
        this.t.start();
        this.g = new -$$Lambda$adqh$ZuimR8UYOWurtmpT2IvaEHJyiGY(this);
        this.h = new -$$Lambda$adqh$pemZ3PbunUK_LL5gZGT4W1-wFPo(this);
        this.i = new -$$Lambda$adqh$317JPOZbedUeR-lta4cOkbDZMFY(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0063 in {7, 8, 10, 12} preds:[]
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
    private javax.net.ssl.SSLSocket a(java.lang.String r8, int r9) {
        /*
        r7 = this;
        r0 = r7.z;
        r0 = r0.get();
        r0 = (defpackage.adqi) r0;
        r0 = r0.a;
        if (r0 == 0) goto L_0x005b;
        r0 = r0.getSocketFactory();
        r0 = r0.createSocket();
        r0 = (javax.net.ssl.SSLSocket) r0;
        r1 = 1;
        r0.setUseClientMode(r1);
        r0.setTcpNoDelay(r1);
        r2 = new java.net.InetSocketAddress;
        r2.<init>(r8, r9);
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r0.connect(r2, r8);
        r8 = r0.getSSLParameters();
        r9 = r8.getCipherSuites();
        r9 = com.google.common.collect.Lists.newArrayList(r9);
        r2 = a;
        r3 = 0;
        r4 = 0;
        r5 = 2;
        if (r4 >= r5) goto L_0x0048;
        r5 = r2[r4];
        r6 = r9.remove(r5);
        if (r6 == 0) goto L_0x0045;
        r9.add(r3, r5);
        r4 = r4 + 1;
        goto L_0x0037;
        r9 = defpackage.adqh.a(r9);
        r8.setCipherSuites(r9);
        r0.setSSLParameters(r8);
        r8 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0.setSoTimeout(r8);
        r0.setKeepAlive(r1);
        return r0;
        r8 = new java.io.IOException;
        r9 = "createSSLSocket failed to get sslContext!";
        r8.<init>(r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqh.a(java.lang.String, int):javax.net.ssl.SSLSocket");
    }

    private synchronized void a(long j) {
        this.f.removeCallbacks(this.g);
        this.f.postDelayed(this.g, j);
    }

    private void a(qqc qqc) {
        if (((qqc) this.n.getAndSet(qqc)) != qqc) {
            for (qqd a : this.o) {
                a.a(qqc);
            }
        }
    }

    private void a(boolean z) {
        if (z && h() == qqc.STOPPED) {
            a(qqc.SUSPENDED);
            return;
        }
        if (!(h() == qqc.SUSPENDED || h() == qqc.STOPPED)) {
            a(z ? qqc.SUSPENDED : qqc.STOPPED);
            this.m.set(0);
            m();
        }
    }

    private static String[] a(List<String> list) {
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!str.toUpperCase(Locale.US).contains("EXPORT")) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private qqc h() {
        return (qqc) this.n.get();
    }

    private void i() {
        if (h() != qqc.CONNECTED && h() != qqc.SUSPENDED) {
            a k = k();
            if (f()) {
                this.m.set(0);
                return;
            }
            ilv ilv = (ilv) this.B.get();
            String qqc = h().toString();
            String aVar = k.toString();
            String l = l();
            akcr.b(qqc, "connectingState");
            akcr.b(aVar, "failureReason");
            String str = "reachability";
            akcr.b(l, str);
            ioy ioy = ioy.SCCP_CONNECTION_FAILURE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(qqc);
            stringBuilder.append('_');
            stringBuilder.append(aVar);
            ilv.c(ioy.a("failure_reason", stringBuilder.toString()).a(str, l), 1);
            if (k == a.WRONG_SERVER || k == a.AUTHENTICATION_FAILURE) {
                this.m.set(0);
            } else {
                this.m.incrementAndGet();
            }
            m();
            a(j());
        }
    }

    private long j() {
        TimeUnit timeUnit;
        long j;
        if (this.m.get() - 1 > ((long) b)) {
            timeUnit = TimeUnit.SECONDS;
            j = 60;
        } else {
            timeUnit = TimeUnit.SECONDS;
            j = (long) Math.pow(2.0d, (double) (this.m.get() - 1));
        }
        return timeUnit.toMillis(j);
    }

    private a k() {
        abmr.a("openSocketConnection() must be called from background thread.");
        String l = l();
        ilv ilv = (ilv) this.B.get();
        int intValue = this.m.intValue();
        String str = "reachability";
        akcr.b(l, str);
        String str2 = "attempts";
        ilv.c(ioy.SCCP_CONNECTION_ATTEMPT.a(str2, (Enum) a.a(intValue)).a(str, l), 1);
        a(qqc.CONNECTING);
        if (this.k == null) {
            this.k = ((adqp) this.e.get()).a();
        }
        aesz aesz = this.k;
        if (aesz == null || Strings.isNullOrEmpty(aesz.b)) {
            return a.GATEWAY_INFO_UNAVAILABLE;
        }
        String[] split = this.k.b.split(":");
        Pair pair = new Pair(split[0], Integer.valueOf(Integer.parseInt(split[1])));
        String str3 = (String) pair.first;
        int intValue2 = ((Integer) pair.second).intValue();
        this.l = System.currentTimeMillis();
        a aVar = a.UNKNOWN_FAILURE;
        try {
            this.p = a(str3, intValue2);
            UUID nameUUIDFromBytes = UUID.nameUUIDFromBytes(this.p.getSession().getId());
            boolean equal = Objects.equal(this.q, nameUUIDFromBytes);
            this.q = nameUUIDFromBytes;
            this.p.startHandshake();
            str3 = ((gpb) this.d.get()).b();
            if (this.C == null) {
                this.C = adqr.a((Context) this.c.get());
            }
            String str4 = this.C;
            aexp aexp = this.k.a;
            if ("".equals(str4)) {
                str4 = "unknown";
            }
            aehn aehn = (aehn) adqs.b(aesm.a.CONNECT);
            if (aehn != null) {
                aehn.a = str3;
                aehn.b = "android";
                aehn.c = Integer.toString(VERSION.SDK_INT);
                aehn.d = str4;
                aehn.e = aexp;
                iha iha = (iha) this.y.get();
                this.r = new adqa(this.p.getInputStream(), iha);
                this.s = new adqb(this.p.getOutputStream(), iha);
                this.s.a(aehn);
                aesm a = this.r.a();
                if (aesm.a.a(a.o) == aesm.a.CONNECT_RESPONSE) {
                    aehp aehp = (aehp) a;
                    if (gjp.a(aehp.a)) {
                        adqf adqf = this.t;
                        adqa adqa = this.r;
                        adqf.a.clear();
                        adqf.a.offer(adqa);
                        adqg adqg = this.u;
                        adqb adqb = this.s;
                        adqg.c.clear();
                        adqg.c.offer(adqb);
                        a(qqc.CONNECTED);
                        ilv = (ilv) this.B.get();
                        intValue = this.m.intValue();
                        akcr.b(l, str);
                        ilv.c(ioy.SCCP_CONNECTION_SUCCESS.a(str2, (Enum) a.a(intValue)).a(str, l), 1);
                        ilv = (ilv) this.B.get();
                        akcr.b(l, str);
                        ilv.a(ioy.SCCP_CONNECTION_LATENCY.a("session_reused", equal).a(str, l), System.currentTimeMillis() - this.l);
                    } else if (TextUtils.equals("wrong_server", aehp.b)) {
                        if (aehp.c != null) {
                            ((adqp) this.e.get()).a(String.format(Locale.US, "%s:%d", new Object[]{aehp.c.a, aehp.c.b}));
                            this.k = null;
                        }
                        aVar = a.WRONG_SERVER;
                    } else if (TextUtils.equals("authentication_failure", aehp.b)) {
                        this.k = ((adqp) this.e.get()).b();
                        aVar = a.AUTHENTICATION_FAILURE;
                    }
                    return aVar;
                }
                StringBuilder stringBuilder = new StringBuilder("Expected CONNECT_RESPONSE, but got: ");
                stringBuilder.append(a.o);
                throw new IllegalStateException(stringBuilder.toString());
            }
            throw new RuntimeException("Failure to specify a message type will result in a null pointer exception");
        } catch (SSLHandshakeException unused) {
            aVar = a.SSL_HANDSHAKE_FAILURE;
        } catch (SocketTimeoutException unused2) {
            aVar = a.TIMED_OUT;
        } catch (Exception unused3) {
        }
    }

    private String l() {
        return ((ifa) this.A.get()).d();
    }

    private void m() {
        abqt.a(this.s);
        abqt.a(this.r);
        abqt.a(this.p);
        this.u.interrupt();
        this.t.interrupt();
        this.r = null;
        this.s = null;
        this.p = null;
        this.x.a();
    }

    private /* synthetic */ void n() {
        a(false);
        adqg adqg = this.u;
        adqg.d.set(true);
        adqg.interrupt();
        Uninterruptibles.joinUninterruptibly(adqg);
        adqg.c.clear();
        this.u.f.remove(this);
        adqf adqf = this.t;
        adqf.b.set(true);
        adqf.interrupt();
        Uninterruptibles.joinUninterruptibly(adqf);
        adqf.a.clear();
        this.t.c.remove(this);
        this.t.b(this.x);
        this.t.b(this.w);
        b(this.w);
        b(this.j);
        this.v.shutdown();
    }

    private /* synthetic */ void o() {
        a(true);
    }

    private /* synthetic */ void p() {
        a(false);
    }

    public final void a() {
        if (h() == qqc.CONNECTED) {
            d();
        }
    }

    public final void a(adpx adpx) {
        this.t.a(adpx);
    }

    public final void a(aesm aesm, qqe qqe) {
        psd psd;
        String str;
        adqg adqg = this.u;
        if (adqg.d.get()) {
            psd = psd.ERROR;
            str = "Output stream has been stopped, fast failing.";
        } else if (adqg.e.get() == adqg.a.CONNECTED || adqs.a(aesm)) {
            adqg.a.a(aesm, qqe);
            if (!adqg.b.offer(aesm)) {
                adqg.a.a(aesm.p, psd.MESSAGE_QUEUE_FULL, "Couldn't add message to full message queue");
            }
            return;
        } else {
            psd = psd.NO_CONNECTION;
            str = "Output stream not connected, and message does not require an ACK, fast failing.";
        }
        qqe.onWriteCompleted(psd, str);
    }

    public final void a(qqd qqd) {
        this.o.add(qqd);
    }

    public final synchronized void b() {
        this.m.set(0);
        a(j());
    }

    public final void b(adpx adpx) {
        this.t.b(adpx);
    }

    public final void b(qqd qqd) {
        this.o.remove(qqd);
    }

    public final synchronized void c() {
        this.f.removeCallbacks(this.g);
        this.f.removeCallbacks(this.h);
        this.f.post(this.h);
    }

    public final synchronized void d() {
        c();
        b();
    }

    public final synchronized void e() {
        this.f.removeCallbacksAndMessages(null);
        this.f.post(new -$$Lambda$adqh$GOVq19KENOtFLSZxmB69e7vNJt8(this));
    }

    public final boolean f() {
        return h() == qqc.CONNECTED;
    }

    public final adqc g() {
        return this.j;
    }
}
