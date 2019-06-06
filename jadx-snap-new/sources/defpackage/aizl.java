package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aiyy.b;
import defpackage.aizx.a;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: aizl */
public final class aizl extends aiwc<aizl> {
    static final b<ExecutorService> p = new 1();
    private static aizx q = new a(aizx.a).a(aizw.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, aizw.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aizw.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, aizw.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aizw.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, aizw.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, aizw.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, aizw.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).a(ajad.TLS_1_2).a().b();
    private SSLSocketFactory r;
    private aizx s = q;
    private a t = a.TLS;
    private long u = Long.MAX_VALUE;
    private long v = aixo.j;

    /* renamed from: aizl$a */
    enum a {
        TLS,
        PLAINTEXT
    }

    /* renamed from: aizl$b */
    static final class b implements aiwv {
        private final Executor a;
        private final boolean b;
        private final boolean c;
        private final aizf.a d;
        private final SSLSocketFactory e;
        private final HostnameVerifier f;
        private final aizx g;
        private final int h;
        private final boolean i;
        private final aiwh j;
        private final long k;
        private final boolean l;
        private final ScheduledExecutorService m;
        private boolean n;

        private b(Executor executor, ScheduledExecutorService scheduledExecutorService, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, aizx aizx, int i, boolean z, long j, long j2, boolean z2, aizf.a aVar) {
            this.c = true;
            if (this.c) {
                scheduledExecutorService = (ScheduledExecutorService) aiyy.a.a(aixo.n);
            } else {
                scheduledExecutorService = null;
            }
            this.m = scheduledExecutorService;
            this.e = sSLSocketFactory;
            this.f = null;
            this.g = aizx;
            this.h = i;
            this.i = z;
            this.j = new aiwh("keepalive time nanos", j);
            this.k = j2;
            this.l = false;
            this.b = true;
            this.d = (aizf.a) Preconditions.checkNotNull(aVar, "transportTracerFactory");
            if (this.b) {
                this.a = (Executor) aiyy.a.a(aizl.p);
                return;
            }
            this.a = null;
        }

        /* synthetic */ b(SSLSocketFactory sSLSocketFactory, aizx aizx, int i, boolean z, long j, long j2, aizf.a aVar) {
            this(null, null, sSLSocketFactory, null, aizx, i, z, j, j2, false, aVar);
        }

        public final aiwx a(SocketAddress socketAddress, aiwv.a aVar) {
            aiwv.a aVar2 = aVar;
            if (this.n) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            aiwh aiwh = this.j;
            final aiwh.a aVar3 = new aiwh.a(aiwh, aiwh.c.get(), (byte) 0);
            1 1 = new Runnable() {
                public final void run() {
                    aiwh.a aVar = aVar3;
                    long max = Math.max(aVar.a << 1, aVar.a);
                    boolean compareAndSet = aiwh.this.c.compareAndSet(aVar.a, max);
                    if (!aiwh.a.b && aiwh.this.c.get() < max) {
                        throw new AssertionError();
                    } else if (compareAndSet) {
                        aiwh.a.log(Level.WARNING, "Increased {0} to {1}", new Object[]{aiwh.this.b, Long.valueOf(max)});
                    }
                }
            };
            aizo aizo = new aizo((InetSocketAddress) socketAddress, aVar2.a, aVar2.b, this.a, this.e, this.f, this.g, this.h, aVar2.c, 1, new aizf(this.d.a, (byte) 0));
            if (this.i) {
                long j = aVar3.a;
                long j2 = this.k;
                boolean z = this.l;
                aizo.v = true;
                aizo.w = j;
                aizo.x = j2;
                aizo.y = z;
            }
            return aizo;
        }

        public final ScheduledExecutorService a() {
            return this.m;
        }

        public final void close() {
            if (!this.n) {
                this.n = true;
                if (this.c) {
                    aiyy.a(aixo.n, this.m);
                }
                if (this.b) {
                    aiyy.a(aizl.p, (ExecutorService) this.a);
                }
            }
        }
    }

    /* renamed from: aizl$1 */
    class 1 implements b<ExecutorService> {
        1() {
        }

        public final /* synthetic */ Object a() {
            return Executors.newCachedThreadPool(aixo.c("grpc-okhttp-%d"));
        }

        public final /* synthetic */ void a(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    }

    /* renamed from: aizl$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[a.values().length];
        private static /* synthetic */ int[] b = new int[aizk.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.aizl.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.aizl.a.PLAINTEXT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.aizl.a.TLS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = defpackage.aizk.a();
            r2 = r2.length;
            r2 = new int[r2];
            b = r2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x002d }
            r3 = 0;
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x002d }
        L_0x002d:
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aizl$2.<clinit>():void");
        }
    }

    static {
        new aimk.a(aimk.a).a(aimj.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, aimj.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, aimj.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, aimj.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, aimj.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, aimj.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, aimj.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, aimj.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).a(aimr.TLS_1_2).a().b();
        TimeUnit.DAYS.toNanos(1000);
    }

    aizl(String str) {
        super(str);
    }

    private SSLSocketFactory e() {
        int i = 2.a[this.t.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            try {
                if (this.r == null) {
                    SSLContext instance;
                    if (aixo.a) {
                        instance = SSLContext.getInstance("TLS", ajab.b.c);
                        TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        instance2.init(null);
                        instance.init(null, instance2.getTrustManagers(), SecureRandom.getInstance("SHA1PRNG", ajab.b.c));
                    } else {
                        instance = SSLContext.getInstance("Default", ajab.b.c);
                    }
                    this.r = instance.getSocketFactory();
                }
                return this.r;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown negotiation type: ");
        stringBuilder.append(this.t);
        throw new RuntimeException(stringBuilder.toString());
    }

    public final /* bridge */ /* synthetic */ aivj a() {
        this.t = a.TLS;
        return this;
    }

    public final aiwv c() {
        return new b(e(), this.s, this.o, this.u != Long.MAX_VALUE, this.u, this.v, this.n);
    }

    public final aiud d() {
        int i = 2.a[this.t.ordinal()];
        if (i == 1) {
            i = 80;
        } else if (i == 2) {
            i = 443;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.t);
            stringBuilder.append(" not handled");
            throw new AssertionError(stringBuilder.toString());
        }
        return aiud.a().a(aivn.a.a, Integer.valueOf(i)).a();
    }
}
