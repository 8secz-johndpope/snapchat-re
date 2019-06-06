package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import defpackage.aivh.b;
import defpackage.aivh.e;
import defpackage.aivh.f;
import defpackage.aiwm.a;
import defpackage.aiwr.d;
import defpackage.aixu.c;
import defpackage.aiys.o;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: aiyb */
final class aiyb extends aivi implements aivb<Object> {
    private static Pattern O = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    static final Logger a = Logger.getLogger(aiyb.class.getName());
    static final aivw b = aivw.j.a("Channel shutdown invoked");
    static final aivw c = aivw.j.a("Subchannel shutdown invoked");
    volatile boolean A;
    volatile boolean B;
    final a C;
    final aiwm D;
    final aiwq E;
    final aiva F;
    final o G = new o();
    final long H;
    final long I;
    final aixt<Object> J = new f(this, (byte) 0);
    ScheduledFuture<?> K;
    j L;
    aiwk M;
    final d N = new d(this, (byte) 0);
    private final aivh.a P;
    private final Executor Q;
    private final aiyi<? extends Executor> R;
    private final aiyi<? extends Executor> S;
    private int T;
    private boolean U;
    private final long V;
    private boolean W;
    private final Set<Object> X = new HashSet(1, 0.75f);
    private final CountDownLatch Y = new CountDownLatch(1);
    private boolean Z;
    private final aiyd.a aa = new e(this, (byte) 0);
    private final aiyr ab;
    final aivc d = aivc.a(getClass().getName());
    final String e;
    final aivn.a f;
    final aiud g;
    final aiwv h;
    final aizd i;
    final aiwp j = new k(this, (byte) 0);
    final aiuu k;
    final aiun l;
    final Supplier<Stopwatch> m;
    final aiwy n = new aiwy();
    final aiyw o;
    final aiwk.a p;
    final aiug q;
    final String r;
    aivn s;
    h t;
    volatile f u;
    boolean v;
    final Set<aixu> w = new HashSet(16, 0.75f);
    final aixb x;
    final n y = new n(this, (byte) 0);
    final AtomicBoolean z = new AtomicBoolean(false);

    /* renamed from: aiyb$k */
    final class k extends aiwp {
        private k() {
        }

        /* synthetic */ k(aiyb aiyb, byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final void a(Throwable th) {
            super.a(th);
            aiyb aiyb = aiyb.this;
            if (!aiyb.v) {
                aiyb.v = true;
                aiyb.b(true);
                aiyb.a(false);
                aiyb.a(new c(th));
                aiyb.n.a(aiuo.TRANSIENT_FAILURE);
            }
        }
    }

    /* renamed from: aiyb$e */
    final class e implements aiyd.a {
        private e() {
        }

        /* synthetic */ e(aiyb aiyb, byte b) {
            this();
        }

        public final void a() {
        }

        public final void a(aivw aivw) {
            Preconditions.checkState(aiyb.this.z.get(), "Channel must have been shut down");
        }

        public final void a(boolean z) {
            aiyb.this.J.a(aiyb.this.x, z);
        }

        public final void b() {
            Preconditions.checkState(aiyb.this.z.get(), "Channel must have been shut down");
            aiyb aiyb = aiyb.this;
            aiyb.A = true;
            aiyb.a(false);
            aiyb.a(aiyb.this);
        }
    }

    /* renamed from: aiyb$f */
    final class f extends aixt<Object> {
        private f() {
        }

        /* synthetic */ f(aiyb aiyb, byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            aiyb.this.c();
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            if (!aiyb.this.z.get()) {
                aiyb.this.d();
            }
        }
    }

    /* renamed from: aiyb$n */
    final class n {
        final Object a;
        Collection<aiws> b;

        private n() {
            this.a = new Object();
            this.b = new HashSet();
        }

        /* synthetic */ n(aiyb aiyb, byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final aivw a(aiys<?> aiys) {
            synchronized (this.a) {
                this.b.add(aiys);
            }
            return null;
        }
    }

    /* renamed from: aiyb$d */
    final class d implements defpackage.aiwr.d {

        /* renamed from: aiyb$d$a */
        final class a implements Runnable {
            a() {
            }

            public final void run() {
                aiyb.this.c();
            }
        }

        /* renamed from: aiyb$d$b */
        final class b extends aiys<ReqT> {
            private /* synthetic */ aivm t;
            private /* synthetic */ aivl u;
            private /* synthetic */ aiuf v;
            private /* synthetic */ aiuq w;
            private /* synthetic */ d x;

            b(d dVar, aivm aivm, aivl aivl, aiuf aiuf, aiuq aiuq) {
                d dVar2 = dVar;
                aiuf aiuf2 = aiuf;
                this.x = dVar2;
                this.t = aivm;
                this.u = aivl;
                this.v = aiuf2;
                this.w = aiuq;
                super(aivm, aivl, aiyb.this.G, aiyb.this.H, aiyb.this.I, aiyb.a(aiyb.this, aiuf2), aiyb.this.h.a(), (aiyt.a) aiuf2.a(aiyw.h), (aixq.a) aiuf2.a(aiyw.i), null);
            }

            /* Access modifiers changed, original: final */
            public final aivw a() {
                return aiyb.this.y.a(this);
            }

            /* Access modifiers changed, original: final */
            public final aiws a(aiuk.a aVar, aivl aivl) {
                aiuf a = this.v.a(aVar);
                aiwu a2 = this.x.a(new aiyj(this.t, aivl, a));
                aiuq c = this.w.c();
                try {
                    aiws a3 = a2.a(this.t, aivl, a);
                    return a3;
                } finally {
                    this.w.a(c);
                }
            }

            /* Access modifiers changed, original: final */
            public final void b() {
                n nVar = aiyb.this.y;
                synchronized (nVar.a) {
                    nVar.b.remove(this);
                    if (nVar.b.isEmpty()) {
                        nVar.b = new HashSet();
                    }
                }
            }
        }

        private d() {
        }

        /* synthetic */ d(aiyb aiyb, byte b) {
            this();
        }

        public final aiwu a(defpackage.aivh.d dVar) {
            f fVar = aiyb.this.u;
            if (!aiyb.this.z.get()) {
                if (fVar == null) {
                    aiyb.this.j.a(new a()).a();
                } else {
                    aiwu a = aixo.a(fVar.a(dVar), dVar.a().h);
                    if (a != null) {
                        return a;
                    }
                }
            }
            return aiyb.this.x;
        }

        public final <ReqT> aiys<ReqT> a(aivm<ReqT, ?> aivm, aiuf aiuf, aivl aivl, aiuq aiuq) {
            Preconditions.checkState(false, "retry should be enabled");
            return new b(this, aivm, aivl, aiuf, aiuq);
        }
    }

    /* renamed from: aiyb$l */
    class l extends aiug {
        private final String a;

        private l(String str) {
            this.a = (String) Preconditions.checkNotNull(str, "authority");
        }

        /* synthetic */ l(aiyb aiyb, String str, byte b) {
            this(str);
        }

        public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf) {
            aiwr aiwr = new aiwr(aivm, aiyb.a(aiyb.this, aiuf), aiuf, aiyb.this.N, aiyb.this.B ? null : aiyb.this.h.a(), aiyb.this.D, false);
            aiwr.g = false;
            aiwr.h = aiyb.this.k;
            aiwr.i = aiyb.this.l;
            return aiwr;
        }

        public final String a() {
            return this.a;
        }
    }

    /* renamed from: aiyb$g */
    class g implements Runnable {
        private g() {
        }

        /* synthetic */ g(aiyb aiyb, byte b) {
            this();
        }

        public final void run() {
            aiyb aiyb = aiyb.this;
            aiyb.a.log(Level.FINE, "[{0}] Entering idle mode", aiyb.d);
            aiyb.a(true);
            aiyb.x.a(null);
            aiyb.s = aiyb.a(aiyb.e, aiyb.f, aiyb.g);
            aiyb.n.a(aiuo.IDLE);
            if (aiyb.J.a()) {
                aiyb.c();
            }
        }
    }

    /* renamed from: aiyb$a */
    final class a implements Executor {
        a() {
        }

        public final void execute(Runnable runnable) {
            aiyb.this.j.a(runnable);
            aiyb.this.j.a();
        }
    }

    /* renamed from: aiyb$b */
    final class b implements a {
        private /* synthetic */ aizd a;

        b(aizd aizd) {
            this.a = aizd;
        }

        public final aiwm a() {
            return new aiwm(this.a);
        }
    }

    /* renamed from: aiyb$h */
    class h extends b {
        aivh a;
        final aivn b;

        /* renamed from: aiyb$h$b */
        final class b extends c {
            private /* synthetic */ m a;

            b(m mVar) {
                this.a = mVar;
            }

            /* Access modifiers changed, original: final */
            public final void a(aiup aiup) {
                h hVar = h.this;
                if (aiup.a == aiuo.TRANSIENT_FAILURE || aiup.a == aiuo.IDLE) {
                    hVar.b.c();
                }
                hVar = h.this;
                if (hVar == aiyb.this.t) {
                    h.this.a.a(this.a, aiup);
                }
            }

            /* Access modifiers changed, original: final */
            public final void a(aixu aixu) {
                aiyb.this.w.remove(aixu);
                aiva.b(aiyb.this.F.d, aixu);
                aiyb.a(aiyb.this);
            }

            /* Access modifiers changed, original: final */
            public final void b(aixu aixu) {
                aiyb.this.J.a(aixu, true);
            }

            /* Access modifiers changed, original: final */
            public final void c(aixu aixu) {
                aiyb.this.J.a(aixu, false);
            }
        }

        /* renamed from: aiyb$h$a */
        final class a implements Runnable {
            private /* synthetic */ aixu a;

            a(aixu aixu) {
                this.a = aixu;
            }

            public final void run() {
                if (aiyb.this.A) {
                    this.a.a(aiyb.b);
                }
                if (!aiyb.this.B) {
                    aiyb.this.w.add(this.a);
                }
            }
        }

        /* renamed from: aiyb$h$c */
        final class c implements Runnable {
            private /* synthetic */ f a;
            private /* synthetic */ aiuo b;

            c(f fVar, aiuo aiuo) {
                this.a = fVar;
                this.b = aiuo;
            }

            public final void run() {
                h hVar = h.this;
                if (hVar == aiyb.this.t) {
                    aiyb.this.a(this.a);
                    if (this.b != aiuo.SHUTDOWN) {
                        aiyb.this.n.a(this.b);
                    }
                }
            }
        }

        h(aivn aivn) {
            this.b = (aivn) Preconditions.checkNotNull(aivn, "NameResolver");
        }

        public final void a(aiuo aiuo, f fVar) {
            Preconditions.checkNotNull(aiuo, "newState");
            Preconditions.checkNotNull(fVar, "newPicker");
            a(new c(fVar, aiuo));
        }

        public final void a(e eVar, List<aiuw> list) {
            Preconditions.checkArgument(eVar instanceof m, "subchannel must have been returned from createSubchannel");
            aixu aixu = ((m) eVar).a;
            Preconditions.checkNotNull(list, "newAddressGroups");
            aixu.a(list, "newAddressGroups contains null entry");
            Preconditions.checkArgument(list.isEmpty() ^ 1, "newAddressGroups is empty");
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            try {
                aiyd aiyd;
                synchronized (aixu.g) {
                    SocketAddress c = aixu.i.c();
                    aixu.d dVar = aixu.i;
                    dVar.a = unmodifiableList;
                    dVar.b();
                    if ((aixu.r.a != aiuo.READY && aixu.r.a != aiuo.CONNECTING) || aixu.i.a(c)) {
                        aiyd = null;
                    } else if (aixu.r.a == aiuo.READY) {
                        aiyd = aixu.q;
                        aixu.q = null;
                        aixu.i.b();
                        aixu.a(aiuo.IDLE);
                    } else {
                        aiyd = aixu.p;
                        aixu.p = null;
                        aixu.i.b();
                        aixu.c();
                    }
                }
                aixu.h.a();
                if (aiyd != null) {
                    aiyd.a(aivw.j.a("InternalSubchannel closed transport due to address change"));
                }
            } catch (Throwable th) {
                aixu.h.a();
            }
        }

        public final void a(Runnable runnable) {
            aiyb.this.j.a(runnable).a();
        }
    }

    /* renamed from: aiyb$m */
    final class m extends aiwf {
        aixu a;
        private Object b = new Object();
        private aiud c;
        private boolean d;
        private ScheduledFuture<?> e;

        /* renamed from: aiyb$m$a */
        final class a implements Runnable {
            a() {
            }

            public final void run() {
                m.this.a.a(aiyb.c);
            }
        }

        m(aiud aiud) {
            this.c = (aiud) Preconditions.checkNotNull(aiud, "attrs");
        }

        /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            return;
     */
        public final void a() {
            /*
            r6 = this;
            r0 = r6.b;
            monitor-enter(r0);
            r1 = r6.d;	 Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x001d;
        L_0x0007:
            r1 = defpackage.aiyb.this;	 Catch:{ all -> 0x004d }
            r1 = r1.A;	 Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x001b;
        L_0x000d:
            r1 = r6.e;	 Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x001b;
        L_0x0011:
            r1 = r6.e;	 Catch:{ all -> 0x004d }
            r2 = 0;
            r1.cancel(r2);	 Catch:{ all -> 0x004d }
            r1 = 0;
            r6.e = r1;	 Catch:{ all -> 0x004d }
            goto L_0x0020;
        L_0x001b:
            monitor-exit(r0);	 Catch:{ all -> 0x004d }
            return;
        L_0x001d:
            r1 = 1;
            r6.d = r1;	 Catch:{ all -> 0x004d }
        L_0x0020:
            r1 = defpackage.aiyb.this;	 Catch:{ all -> 0x004d }
            r1 = r1.A;	 Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0044;
        L_0x0026:
            r1 = defpackage.aiyb.this;	 Catch:{ all -> 0x004d }
            r1 = r1.h;	 Catch:{ all -> 0x004d }
            r1 = r1.a();	 Catch:{ all -> 0x004d }
            r2 = new aixy;	 Catch:{ all -> 0x004d }
            r3 = new aiyb$m$a;	 Catch:{ all -> 0x004d }
            r3.<init>();	 Catch:{ all -> 0x004d }
            r2.<init>(r3);	 Catch:{ all -> 0x004d }
            r3 = 5;
            r5 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x004d }
            r1 = r1.schedule(r2, r3, r5);	 Catch:{ all -> 0x004d }
            r6.e = r1;	 Catch:{ all -> 0x004d }
            monitor-exit(r0);	 Catch:{ all -> 0x004d }
            return;
        L_0x0044:
            monitor-exit(r0);	 Catch:{ all -> 0x004d }
            r0 = r6.a;
            r1 = defpackage.aiyb.b;
            r0.a(r1);
            return;
        L_0x004d:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x004d }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyb$m.a():void");
        }

        public final void b() {
            this.a.a();
        }

        public final List<aiuw> c() {
            return this.a.e();
        }

        public final aiud d() {
            return this.c;
        }

        /* Access modifiers changed, original: final */
        public final aiwu e() {
            return this.a.a();
        }

        public final String toString() {
            return this.a.b().toString();
        }
    }

    /* renamed from: aiyb$i */
    class i implements aivn.b {
        final h a;

        /* renamed from: aiyb$i$b */
        final class b implements Runnable {
            private /* synthetic */ Map a;
            private /* synthetic */ aiud b;
            private /* synthetic */ List c;

            b(Map map, aiud aiud, List list) {
                this.a = map;
                this.b = aiud;
                this.c = list;
            }

            public final void run() {
                String str = "method";
                String str2 = "service";
                String str3 = "name";
                String str4 = "methodConfig";
                if (i.this.a == aiyb.this.t) {
                    aiwk aiwk = null;
                    aiyb.this.M = null;
                    if (this.a != null) {
                        try {
                            aiyw aiyw = aiyb.this.o;
                            Map map = this.a;
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            List<Object> a = !map.containsKey(str4) ? null : aiyx.a(aiyx.a(map, str4));
                            if (a == null) {
                                aiyw.a.log(Level.FINE, "No method configs found, skipping");
                            } else {
                                for (Object obj : a) {
                                    aiyw.e eVar = new aiyw.e(obj, aiyw.d, aiyw.e, aiyw.f);
                                    List<Map> a2 = !obj.containsKey(str3) ? aiwk : aiyx.a(aiyx.a(obj, str3));
                                    boolean z = (a2 == null || a2.isEmpty()) ? false : true;
                                    Preconditions.checkArgument(z, "no names in method config %s", obj);
                                    for (Map map2 : a2) {
                                        Object d = !map2.containsKey(str2) ? aiwk : aiyx.d(map2, str2);
                                        Preconditions.checkArgument(!Strings.isNullOrEmpty(d), "missing service name");
                                        String d2 = !map2.containsKey(str) ? null : aiyx.d(map2, str);
                                        if (Strings.isNullOrEmpty(d2)) {
                                            Preconditions.checkArgument(!hashMap2.containsKey(d), "Duplicate service %s", d);
                                            hashMap2.put(d, eVar);
                                        } else {
                                            Object a3 = aivm.a(d, d2);
                                            Preconditions.checkArgument(!hashMap.containsKey(a3), "Duplicate method name %s", a3);
                                            hashMap.put(a3, eVar);
                                        }
                                        aiwk = null;
                                    }
                                }
                                aiyw.b.set(Collections.unmodifiableMap(hashMap));
                                aiyw.c.set(Collections.unmodifiableMap(hashMap2));
                            }
                            aiyw.g = true;
                        } catch (RuntimeException e) {
                            Logger logger = aiyb.a;
                            Level level = Level.WARNING;
                            StringBuilder stringBuilder = new StringBuilder("[");
                            stringBuilder.append(aiyb.this.b());
                            stringBuilder.append("] Unexpected exception from parsing service config");
                            logger.log(level, stringBuilder.toString(), e);
                        }
                    }
                    i.this.a.a.a(this.c, this.b);
                }
            }
        }

        /* renamed from: aiyb$i$a */
        final class a implements Runnable {
            private /* synthetic */ aivw a;

            a(aivw aivw) {
                this.a = aivw;
            }

            public final void run() {
                if (i.this.a == aiyb.this.t) {
                    i.this.a.a.a(this.a);
                    if (aiyb.this.K == null) {
                        if (aiyb.this.M == null) {
                            aiyb.this.M = aiyb.this.p.a();
                        }
                        long a = aiyb.this.M.a();
                        if (aiyb.a.isLoggable(Level.FINE)) {
                            aiyb.a.log(Level.FINE, "[{0}] Scheduling DNS resolution backoff for {1} ns", new Object[]{aiyb.this.d, Long.valueOf(a)});
                        }
                        aiyb.this.L = new j();
                        aiyb.this.K = aiyb.this.h.a().schedule(aiyb.this.L, a, TimeUnit.NANOSECONDS);
                    }
                }
            }
        }

        i(h hVar) {
            this.a = hVar;
        }

        public final void a(aivw aivw) {
            Preconditions.checkArgument(aivw.b() ^ 1, "the error status must not be OK");
            aiyb.a.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{aiyb.this.b(), aivw});
            aiyb.this.j.a(new a(aivw)).a();
        }

        public final void a(List<aiuw> list, aiud aiud) {
            if (list.isEmpty()) {
                a(aivw.j.a("NameResolver returned an empty list"));
                return;
            }
            if (aiyb.a.isLoggable(Level.FINE)) {
                aiyb.a.log(Level.FINE, "[{0}] resolved address: {1}, config={2}", new Object[]{aiyb.this.b(), list, aiud});
            }
            this.a.a(new b((Map) aiud.a(aixn.a), aiud, list));
        }
    }

    /* renamed from: aiyb$j */
    class j implements Runnable {
        boolean a;

        j() {
        }

        public final void run() {
            if (!this.a) {
                aiyb aiyb = aiyb.this;
                aiyb.K = null;
                aiyb.L = null;
                if (aiyb.s != null) {
                    aiyb.this.s.c();
                }
            }
        }
    }

    /* renamed from: aiyb$c */
    final class c extends f {
        private final defpackage.aivh.c a;
        private /* synthetic */ Throwable b;

        c(Throwable th) {
            this.b = th;
            aivw b = aivw.i.a("Panic! This is a bug!").b(this.b);
            Preconditions.checkArgument(b.b() ^ 1, "drop status shouldn't be OK");
            this.a = new defpackage.aivh.c(null, b, true);
        }

        public final defpackage.aivh.c a(aivh.d dVar) {
            return this.a;
        }
    }

    static {
        aivw.j.a("Channel shutdownNow invoked");
    }

    aiyb(aiwc<?> aiwc, aiwv aiwv, aiwk.a aVar, aiyi<? extends Executor> aiyi, Supplier<Stopwatch> supplier, List<aiui> list, aizd aizd) {
        this.e = (String) Preconditions.checkNotNull(aiwc.d, "target");
        this.f = aiwc.c;
        this.g = (aiud) Preconditions.checkNotNull(aiwc.d(), "nameResolverParams");
        this.s = aiyb.a(this.e, this.f, this.g);
        this.i = (aizd) Preconditions.checkNotNull(aizd, "timeProvider");
        this.T = 0;
        this.E = null;
        this.P = new aiwj(null, aizd);
        this.R = (aiyi) Preconditions.checkNotNull(aiwc.b, "executorPool");
        this.S = (aiyi) Preconditions.checkNotNull(aiyi, "oobExecutorPool");
        this.Q = (Executor) Preconditions.checkNotNull(this.R.a(), "executor");
        this.x = new aixb(this.Q, this.j);
        this.x.a(this.aa);
        this.p = aVar;
        this.h = new aiwl(aiwv, this.Q);
        this.Z = false;
        this.o = new aiyw(false, aiwc.i, aiwc.j);
        this.q = aiuj.a(aiuj.a(new l(this, this.s.a(), (byte) 0), this.o), (List) list);
        this.m = (Supplier) Preconditions.checkNotNull(supplier, "stopwatchSupplier");
        if (aiwc.h != -1) {
            Preconditions.checkArgument(aiwc.h >= aiwc.a, "invalid idleTimeoutMillis %s", aiwc.h);
        }
        this.V = aiwc.h;
        this.ab = new aiyr(new g(this, (byte) 0), new a(), this.h.a(), (Stopwatch) supplier.get());
        this.U = false;
        this.k = (aiuu) Preconditions.checkNotNull(aiwc.f, "decompressorRegistry");
        this.l = (aiun) Preconditions.checkNotNull(aiwc.g, "compressorRegistry");
        this.r = aiwc.e;
        this.I = aiwc.k;
        this.H = aiwc.l;
        this.C = new b(aizd);
        this.D = this.C.a();
        this.F = (aiva) Preconditions.checkNotNull(aiwc.m);
        aiva.a(this.F.c, this);
        a.log(Level.FINE, "[{0}] Created with target {1}", new Object[]{this.d, this.e});
    }

    static aivn a(String str, aivn.a aVar, aiud aiud) {
        URI uri;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            stringBuilder.append(e.getMessage());
            uri = null;
        }
        if (uri != null) {
            aivn a = aVar.a(uri, aiud);
            if (a != null) {
                return a;
            }
        }
        String str2 = "";
        if (!O.matcher(str).matches()) {
            try {
                aivn a2 = aVar.a(new URI(aVar.a(), str2, "/".concat(String.valueOf(str)), null), aiud);
                if (a2 != null) {
                    return a2;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (stringBuilder.length() > 0) {
            StringBuilder stringBuilder2 = new StringBuilder(" (");
            stringBuilder2.append(stringBuilder);
            stringBuilder2.append(")");
            str2 = stringBuilder2.toString();
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    public final <ReqT, RespT> aiuh<ReqT, RespT> a(aivm<ReqT, RespT> aivm, aiuf aiuf) {
        return this.q.a(aivm, aiuf);
    }

    public final String a() {
        return this.q.a();
    }

    /* Access modifiers changed, original: final */
    public final void a(f fVar) {
        this.u = fVar;
        this.x.a(fVar);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z) {
            Preconditions.checkState(this.s != null, "nameResolver is null");
            Preconditions.checkState(this.t != null, "lbHelper is null");
        }
        if (this.s != null) {
            ScheduledFuture scheduledFuture = this.K;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.L.a = true;
                this.K = null;
                this.L = null;
                this.M = null;
            }
            this.s.b();
            this.s = null;
            this.W = false;
        }
        h hVar = this.t;
        if (hVar != null) {
            hVar.a.a();
            this.t = null;
        }
        this.u = null;
    }

    public final aivc b() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        this.ab.a(z);
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (!(this.z.get() || this.v)) {
            if (this.J.a()) {
                b(false);
            } else {
                d();
            }
            if (this.t == null) {
                a.log(Level.FINE, "[{0}] Exiting idle mode", this.d);
                this.t = new h(this.s);
                h hVar = this.t;
                hVar.a = this.P.a(hVar);
                i iVar = new i(this.t);
                try {
                    this.s.a(iVar);
                    this.W = true;
                } catch (Throwable th) {
                    iVar.a(aivw.a(th));
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        long j = this.V;
        if (j != -1) {
            this.ab.a(j, TimeUnit.MILLISECONDS);
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("logId", this.d.a).add("target", this.e).toString();
    }
}
