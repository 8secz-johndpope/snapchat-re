package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import defpackage.aivn.a;
import defpackage.aivn.b;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aixd */
final class aixd extends aivn {
    static final Logger a = Logger.getLogger(aixd.class.getName());
    static boolean b = Boolean.parseBoolean(r);
    static boolean c = Boolean.parseBoolean(s);
    static boolean d = Boolean.parseBoolean(t);
    static boolean e = Boolean.parseBoolean(u);
    static final e f = aixd.a(aixd.class.getClassLoader());
    static final /* synthetic */ boolean p = (aixd.class.desiredAssertionStatus() ^ 1);
    private static final Set<String> q = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));
    private static final String r = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    final aiyk g;
    final Random h = new Random();
    volatile a i = b.INSTANCE;
    final AtomicReference<d> j = new AtomicReference();
    final String k;
    final int l;
    boolean m;
    boolean n;
    b o;
    private final String w;
    private final aiyy.b<ExecutorService> x;
    private ExecutorService y;
    private final Runnable z = new 1();

    /* renamed from: aixd$b */
    enum b implements a {
        ;

        private b(String str) {
        }

        public final List<InetAddress> a(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* renamed from: aixd$a */
    interface a {
        List<InetAddress> a(String str);
    }

    /* renamed from: aixd$1 */
    class 1 implements Runnable {
        1() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:118:0x01a6 in {6, 22, 25, 37, 39, 40, 41, 47, 57, 60, 62, 65, 67, 68, 75, 78, 87, 90, 99, 102, 109, 113, 117} preds:[]
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
            r11 = this;
            r0 = defpackage.aixd.this;
            monitor-enter(r0);
            r1 = defpackage.aixd.this;	 Catch:{ all -> 0x01a3 }
            r1 = r1.m;	 Catch:{ all -> 0x01a3 }
            if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x01a3 }
            monitor-exit(r0);	 Catch:{ all -> 0x01a3 }
            return;	 Catch:{ all -> 0x01a3 }
            r1 = defpackage.aixd.this;	 Catch:{ all -> 0x01a3 }
            r1 = r1.o;	 Catch:{ all -> 0x01a3 }
            r2 = defpackage.aixd.this;	 Catch:{ all -> 0x01a3 }
            r3 = 1;	 Catch:{ all -> 0x01a3 }
            r2.n = r3;	 Catch:{ all -> 0x01a3 }
            monitor-exit(r0);	 Catch:{ all -> 0x01a3 }
            r0 = 0;
            r2 = defpackage.aixd.this;	 Catch:{ all -> 0x0196 }
            r2 = r2.k;	 Catch:{ all -> 0x0196 }
            r4 = defpackage.aixd.this;	 Catch:{ all -> 0x0196 }
            r4 = r4.l;	 Catch:{ all -> 0x0196 }
            r2 = java.net.InetSocketAddress.createUnresolved(r2, r4);	 Catch:{ all -> 0x0196 }
            r4 = defpackage.aixd.this;	 Catch:{ IOException -> 0x016a }
            r4 = r4.g;	 Catch:{ IOException -> 0x016a }
            r4 = r4.a(r2);	 Catch:{ IOException -> 0x016a }
            if (r4 == 0) goto L_0x004b;
            r3 = new aiuw;	 Catch:{ all -> 0x0196 }
            r5 = new aiyn;	 Catch:{ all -> 0x0196 }
            r5.<init>(r2, r4);	 Catch:{ all -> 0x0196 }
            r3.<init>(r5);	 Catch:{ all -> 0x0196 }
            r2 = java.util.Collections.singletonList(r3);	 Catch:{ all -> 0x0196 }
            r3 = defpackage.aiud.b;	 Catch:{ all -> 0x0196 }
            r1.a(r2, r3);	 Catch:{ all -> 0x0196 }
            r1 = defpackage.aixd.this;
            monitor-enter(r1);
            r2 = defpackage.aixd.this;	 Catch:{ all -> 0x0048 }
            r2.n = r0;	 Catch:{ all -> 0x0048 }
            monitor-exit(r1);	 Catch:{ all -> 0x0048 }
            return;	 Catch:{ all -> 0x0048 }
            r0 = move-exception;	 Catch:{ all -> 0x0048 }
            monitor-exit(r1);	 Catch:{ all -> 0x0048 }
            throw r0;
            r2 = defpackage.aixd.b;	 Catch:{ Exception -> 0x013e }
            r4 = defpackage.aixd.c;	 Catch:{ Exception -> 0x013e }
            r5 = defpackage.aixd.this;	 Catch:{ Exception -> 0x013e }
            r5 = r5.k;	 Catch:{ Exception -> 0x013e }
            r2 = defpackage.aixd.a(r2, r4, r5);	 Catch:{ Exception -> 0x013e }
            r4 = 0;	 Catch:{ Exception -> 0x013e }
            if (r2 == 0) goto L_0x0084;	 Catch:{ Exception -> 0x013e }
            r2 = defpackage.aixd.this;	 Catch:{ Exception -> 0x013e }
            r2 = r2.j;	 Catch:{ Exception -> 0x013e }
            r2 = r2.get();	 Catch:{ Exception -> 0x013e }
            r2 = (defpackage.aixd.d) r2;	 Catch:{ Exception -> 0x013e }
            if (r2 != 0) goto L_0x0085;	 Catch:{ Exception -> 0x013e }
            r5 = defpackage.aixd.f;	 Catch:{ Exception -> 0x013e }
            if (r5 == 0) goto L_0x0085;	 Catch:{ Exception -> 0x013e }
            r2 = defpackage.aixd.p;	 Catch:{ Exception -> 0x013e }
            if (r2 != 0) goto L_0x007d;	 Catch:{ Exception -> 0x013e }
            r2 = defpackage.aixd.f;	 Catch:{ Exception -> 0x013e }
            r2 = r2.b();	 Catch:{ Exception -> 0x013e }
            if (r2 != 0) goto L_0x0077;	 Catch:{ Exception -> 0x013e }
            goto L_0x007d;	 Catch:{ Exception -> 0x013e }
            r2 = new java.lang.AssertionError;	 Catch:{ Exception -> 0x013e }
            r2.<init>();	 Catch:{ Exception -> 0x013e }
            throw r2;	 Catch:{ Exception -> 0x013e }
            r2 = defpackage.aixd.f;	 Catch:{ Exception -> 0x013e }
            r2 = r2.a();	 Catch:{ Exception -> 0x013e }
            goto L_0x0085;	 Catch:{ Exception -> 0x013e }
            r2 = r4;	 Catch:{ Exception -> 0x013e }
            r5 = defpackage.aixd.this;	 Catch:{ Exception -> 0x013e }
            r5 = r5.i;	 Catch:{ Exception -> 0x013e }
            r6 = defpackage.aixd.d;	 Catch:{ Exception -> 0x013e }
            r7 = defpackage.aixd.e;	 Catch:{ Exception -> 0x013e }
            r8 = defpackage.aixd.this;	 Catch:{ Exception -> 0x013e }
            r8 = r8.k;	 Catch:{ Exception -> 0x013e }
            r2 = defpackage.aixd.a(r5, r2, r6, r7, r8);	 Catch:{ Exception -> 0x013e }
            r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0196 }
            r5.<init>();	 Catch:{ all -> 0x0196 }
            r6 = r2.a;	 Catch:{ all -> 0x0196 }
            r6 = r6.iterator();	 Catch:{ all -> 0x0196 }
            r7 = r6.hasNext();	 Catch:{ all -> 0x0196 }
            if (r7 == 0) goto L_0x00be;	 Catch:{ all -> 0x0196 }
            r7 = r6.next();	 Catch:{ all -> 0x0196 }
            r7 = (java.net.InetAddress) r7;	 Catch:{ all -> 0x0196 }
            r8 = new aiuw;	 Catch:{ all -> 0x0196 }
            r9 = new java.net.InetSocketAddress;	 Catch:{ all -> 0x0196 }
            r10 = defpackage.aixd.this;	 Catch:{ all -> 0x0196 }
            r10 = r10.l;	 Catch:{ all -> 0x0196 }
            r9.<init>(r7, r10);	 Catch:{ all -> 0x0196 }
            r8.<init>(r9);	 Catch:{ all -> 0x0196 }
            r5.add(r8);	 Catch:{ all -> 0x0196 }
            goto L_0x00a0;	 Catch:{ all -> 0x0196 }
            r6 = r2.c;	 Catch:{ all -> 0x0196 }
            r5.addAll(r6);	 Catch:{ all -> 0x0196 }
            r6 = defpackage.aiud.a();	 Catch:{ all -> 0x0196 }
            r7 = r2.b;	 Catch:{ all -> 0x0196 }
            r7 = r7.isEmpty();	 Catch:{ all -> 0x0196 }
            if (r7 != 0) goto L_0x011a;
            r2 = r2.b;	 Catch:{ RuntimeException -> 0x0108 }
            r2 = defpackage.aixd.a(r2);	 Catch:{ RuntimeException -> 0x0108 }
            r2 = r2.iterator();	 Catch:{ RuntimeException -> 0x0108 }
            r3 = r2.hasNext();	 Catch:{ RuntimeException -> 0x0108 }
            if (r3 == 0) goto L_0x0112;	 Catch:{ RuntimeException -> 0x0108 }
            r3 = r2.next();	 Catch:{ RuntimeException -> 0x0108 }
            r3 = (java.util.Map) r3;	 Catch:{ RuntimeException -> 0x0108 }
            r7 = defpackage.aixd.this;	 Catch:{ RuntimeException -> 0x00f3 }
            r7 = r7.h;	 Catch:{ RuntimeException -> 0x00f3 }
            r8 = defpackage.aixd.d();	 Catch:{ RuntimeException -> 0x00f3 }
            r3 = defpackage.aixd.a(r3, r7, r8);	 Catch:{ RuntimeException -> 0x00f3 }
            r4 = r3;
            goto L_0x0105;
            r7 = move-exception;
            r8 = defpackage.aixd.a;	 Catch:{ RuntimeException -> 0x0108 }
            r9 = java.util.logging.Level.WARNING;	 Catch:{ RuntimeException -> 0x0108 }
            r10 = "Bad service config choice ";	 Catch:{ RuntimeException -> 0x0108 }
            r3 = java.lang.String.valueOf(r3);	 Catch:{ RuntimeException -> 0x0108 }
            r3 = r10.concat(r3);	 Catch:{ RuntimeException -> 0x0108 }
            r8.log(r9, r3, r7);	 Catch:{ RuntimeException -> 0x0108 }
            if (r4 == 0) goto L_0x00d9;
            goto L_0x0112;
            r2 = move-exception;
            r3 = defpackage.aixd.a;	 Catch:{ all -> 0x0196 }
            r7 = java.util.logging.Level.WARNING;	 Catch:{ all -> 0x0196 }
            r8 = "Can't parse service Configs";	 Catch:{ all -> 0x0196 }
            r3.log(r7, r8, r2);	 Catch:{ all -> 0x0196 }
            if (r4 == 0) goto L_0x012b;	 Catch:{ all -> 0x0196 }
            r2 = defpackage.aixn.a;	 Catch:{ all -> 0x0196 }
            r6.a(r2, r4);	 Catch:{ all -> 0x0196 }
            goto L_0x012b;	 Catch:{ all -> 0x0196 }
            r2 = defpackage.aixd.a;	 Catch:{ all -> 0x0196 }
            r4 = java.util.logging.Level.FINE;	 Catch:{ all -> 0x0196 }
            r7 = "No TXT records found for {0}";	 Catch:{ all -> 0x0196 }
            r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0196 }
            r8 = defpackage.aixd.this;	 Catch:{ all -> 0x0196 }
            r8 = r8.k;	 Catch:{ all -> 0x0196 }
            r3[r0] = r8;	 Catch:{ all -> 0x0196 }
            r2.log(r4, r7, r3);	 Catch:{ all -> 0x0196 }
            r2 = r6.a();	 Catch:{ all -> 0x0196 }
            r1.a(r5, r2);	 Catch:{ all -> 0x0196 }
            r1 = defpackage.aixd.this;
            monitor-enter(r1);
            r2 = defpackage.aixd.this;	 Catch:{ all -> 0x013b }
            r2.n = r0;	 Catch:{ all -> 0x013b }
            monitor-exit(r1);	 Catch:{ all -> 0x013b }
            return;	 Catch:{ all -> 0x013b }
            r0 = move-exception;	 Catch:{ all -> 0x013b }
            monitor-exit(r1);	 Catch:{ all -> 0x013b }
            throw r0;
            r2 = move-exception;
            r3 = defpackage.aivw.j;	 Catch:{ all -> 0x0196 }
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0196 }
            r5 = "Unable to resolve host ";	 Catch:{ all -> 0x0196 }
            r4.<init>(r5);	 Catch:{ all -> 0x0196 }
            r5 = defpackage.aixd.this;	 Catch:{ all -> 0x0196 }
            r5 = r5.k;	 Catch:{ all -> 0x0196 }
            r4.append(r5);	 Catch:{ all -> 0x0196 }
            r4 = r4.toString();	 Catch:{ all -> 0x0196 }
            r3 = r3.a(r4);	 Catch:{ all -> 0x0196 }
            r2 = r3.b(r2);	 Catch:{ all -> 0x0196 }
            r1.a(r2);	 Catch:{ all -> 0x0196 }
            r1 = defpackage.aixd.this;
            monitor-enter(r1);
            r2 = defpackage.aixd.this;	 Catch:{ all -> 0x0167 }
            r2.n = r0;	 Catch:{ all -> 0x0167 }
            monitor-exit(r1);	 Catch:{ all -> 0x0167 }
            return;	 Catch:{ all -> 0x0167 }
            r0 = move-exception;	 Catch:{ all -> 0x0167 }
            monitor-exit(r1);	 Catch:{ all -> 0x0167 }
            throw r0;
            r2 = move-exception;
            r3 = defpackage.aivw.j;	 Catch:{ all -> 0x0196 }
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0196 }
            r5 = "Unable to resolve host ";	 Catch:{ all -> 0x0196 }
            r4.<init>(r5);	 Catch:{ all -> 0x0196 }
            r5 = defpackage.aixd.this;	 Catch:{ all -> 0x0196 }
            r5 = r5.k;	 Catch:{ all -> 0x0196 }
            r4.append(r5);	 Catch:{ all -> 0x0196 }
            r4 = r4.toString();	 Catch:{ all -> 0x0196 }
            r3 = r3.a(r4);	 Catch:{ all -> 0x0196 }
            r2 = r3.b(r2);	 Catch:{ all -> 0x0196 }
            r1.a(r2);	 Catch:{ all -> 0x0196 }
            r1 = defpackage.aixd.this;
            monitor-enter(r1);
            r2 = defpackage.aixd.this;	 Catch:{ all -> 0x0193 }
            r2.n = r0;	 Catch:{ all -> 0x0193 }
            monitor-exit(r1);	 Catch:{ all -> 0x0193 }
            return;	 Catch:{ all -> 0x0193 }
            r0 = move-exception;	 Catch:{ all -> 0x0193 }
            monitor-exit(r1);	 Catch:{ all -> 0x0193 }
            throw r0;
            r1 = move-exception;
            r2 = defpackage.aixd.this;
            monitor-enter(r2);
            r3 = defpackage.aixd.this;	 Catch:{ all -> 0x01a0 }
            r3.n = r0;	 Catch:{ all -> 0x01a0 }
            monitor-exit(r2);	 Catch:{ all -> 0x01a0 }
            throw r1;
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x01a0 }
            throw r0;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x01a3 }
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aixd$1.run():void");
        }
    }

    /* renamed from: aixd$d */
    interface d {
        List<String> a();

        List<aiuw> b();
    }

    /* renamed from: aixd$c */
    static final class c {
        final List<? extends InetAddress> a;
        final List<String> b;
        final List<aiuw> c;

        c(List<? extends InetAddress> list, List<String> list2, List<aiuw> list3) {
            this.a = Collections.unmodifiableList((List) Preconditions.checkNotNull(list, "addresses"));
            this.b = Collections.unmodifiableList((List) Preconditions.checkNotNull(list2, "txtRecords"));
            this.c = Collections.unmodifiableList((List) Preconditions.checkNotNull(list3, "balancerAddresses"));
        }
    }

    /* renamed from: aixd$e */
    interface e {
        d a();

        Throwable b();
    }

    static {
        String str = "false";
        s = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", str);
        t = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_grpclb", str);
        u = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", str);
    }

    aixd(String str, aiud aiud, aiyy.b<ExecutorService> bVar, aiyk aiyk) {
        int intValue;
        this.x = bVar;
        StringBuilder stringBuilder = new StringBuilder("//");
        stringBuilder.append((String) Preconditions.checkNotNull(str, "name"));
        Object create = URI.create(stringBuilder.toString());
        Preconditions.checkArgument(create.getHost() != null, "Invalid DNS name: %s", (Object) str);
        this.w = (String) Preconditions.checkNotNull(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.k = create.getHost();
        if (create.getPort() == -1) {
            Integer num = (Integer) aiud.a(a.a);
            if (num != null) {
                intValue = num.intValue();
            } else {
                stringBuilder = new StringBuilder("name '");
                stringBuilder.append(str);
                stringBuilder.append("' doesn't contain a port, and default port is not set in params");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        intValue = create.getPort();
        this.l = intValue;
        this.g = aiyk;
    }

    static c a(a aVar, d dVar, boolean z, boolean z2, String str) {
        Throwable e;
        Throwable e2;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        Throwable e3 = null;
        try {
            emptyList = aVar.a(str);
            e = null;
        } catch (Exception e4) {
            e = e4;
        }
        if (dVar != null) {
            if (z) {
                try {
                    emptyList2 = dVar.b();
                } catch (Exception e5) {
                    e2 = e5;
                }
            }
            e2 = null;
            if (z2) {
                Object obj = null;
                Object obj2 = (z && e2 == null) ? null : 1;
                if (!(e == null || obj2 == null)) {
                    obj = 1;
                }
                if (obj == null) {
                    try {
                        emptyList3 = dVar.a();
                    } catch (Exception e6) {
                        e3 = e6;
                    }
                }
            }
        } else {
            e2 = null;
        }
        String str2 = "ServiceConfig resolution failure";
        String str3 = "Balancer resolution failure";
        String str4 = "Address resolution failure";
        if (e != null) {
            if (e2 == null) {
                try {
                    if (!emptyList2.isEmpty()) {
                    }
                } catch (Throwable th) {
                    if (e != null) {
                        a.log(Level.FINE, str4, e);
                    }
                    if (e2 != null) {
                        a.log(Level.FINE, str3, e2);
                    }
                    if (e3 != null) {
                        a.log(Level.FINE, str2, e3);
                    }
                }
            }
            Throwables.throwIfUnchecked(e);
            throw new RuntimeException(e);
        }
        if (e != null) {
            a.log(Level.FINE, str4, e);
        }
        if (e2 != null) {
            a.log(Level.FINE, str3, e2);
        }
        if (e3 != null) {
            a.log(Level.FINE, str2, e3);
        }
        return new c(emptyList, emptyList3, emptyList2);
    }

    private static e a(ClassLoader classLoader) {
        Throwable e;
        Logger logger;
        Level level;
        String str;
        try {
            try {
            } catch (Exception e2) {
                e = e2;
                logger = a;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
                logger.log(level, str, e);
                return null;
            }
            try {
                e eVar = (e) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, classLoader).asSubclass(e.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (eVar.b() != null) {
                    a.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", eVar.b());
                }
                return eVar;
            } catch (Exception e3) {
                e = e3;
                logger = a;
                level = Level.FINE;
                str = "Can't construct JndiResourceResolverFactory, skipping.";
                logger.log(level, str, e);
                return null;
            }
        } catch (ClassNotFoundException e4) {
            e = e4;
            logger = a;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
            logger.log(level, str, e);
            return null;
        }
    }

    static List<Map<String, Object>> a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("_grpc_config=")) {
                try {
                    Object a = aixw.a(str.substring(13));
                    if (a instanceof List) {
                        List<Object> list2 = (List) a;
                        for (Object obj : list2) {
                            if (!(obj instanceof Map)) {
                                throw new IOException("wrong element type ".concat(String.valueOf(a)));
                            }
                        }
                        arrayList.addAll(list2);
                    } else {
                        throw new IOException("wrong type ".concat(String.valueOf(a)));
                    }
                } catch (IOException e) {
                    a.log(Level.WARNING, "Bad service config: ".concat(String.valueOf(str)), e);
                }
            } else {
                a.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    static Map<String, Object> a(Map<String, Object> map, Random random, String str) {
        Object obj;
        for (Object obj2 : map.entrySet()) {
            Verify.verify(q.contains(obj2.getKey()), "Bad key: %s", obj2);
        }
        String str2 = "clientLanguage";
        List<String> b = !map.containsKey(str2) ? null : aiyx.b(aiyx.a(map, str2));
        Object obj22 = 1;
        if (!(b == null || b.isEmpty())) {
            for (String equalsIgnoreCase : b) {
                if ("java".equalsIgnoreCase(equalsIgnoreCase)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                return null;
            }
        }
        str2 = "percentage";
        obj = !map.containsKey(str2) ? null : aiyx.c(map, str2);
        if (obj != null) {
            int intValue = obj.intValue();
            boolean z = intValue >= 0 && intValue <= 100;
            Verify.verify(z, "Bad percentage: %s", obj);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        String str3 = "clientHostname";
        List<String> b2 = !map.containsKey(str3) ? null : aiyx.b(aiyx.a(map, str3));
        if (!(b2 == null || b2.isEmpty())) {
            for (String str22 : b2) {
                if (str22.equals(str)) {
                    break;
                }
            }
            obj22 = null;
            if (obj22 == null) {
                return null;
            }
        }
        return aiyx.b(map, "serviceConfig");
    }

    static boolean a(boolean z, boolean z2, String str) {
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(":")) {
            return false;
        }
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '.') {
                int i3 = (charAt < '0' || charAt > '9') ? 0 : 1;
                i &= i3;
            }
        }
        return i == 0;
    }

    static String d() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return v;
    }

    private void e() {
        if (!this.n && !this.m) {
            this.y.execute(this.z);
        }
    }

    public final String a() {
        return this.w;
    }

    public final synchronized void a(b bVar) {
        Preconditions.checkState(this.o == null, "already started");
        this.y = (ExecutorService) aiyy.a.a(this.x);
        this.o = (b) Preconditions.checkNotNull(bVar, "listener");
        e();
    }

    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.m;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r2);
        return;
    L_0x0007:
        r0 = 1;
        r2.m = r0;	 Catch:{ all -> 0x001c }
        r0 = r2.y;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x001a;
    L_0x000e:
        r0 = r2.x;	 Catch:{ all -> 0x001c }
        r1 = r2.y;	 Catch:{ all -> 0x001c }
        r0 = defpackage.aiyy.a(r0, r1);	 Catch:{ all -> 0x001c }
        r0 = (java.util.concurrent.ExecutorService) r0;	 Catch:{ all -> 0x001c }
        r2.y = r0;	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r2);
        return;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixd.b():void");
    }

    public final synchronized void c() {
        Preconditions.checkState(this.o != null, "not started");
        e();
    }
}
