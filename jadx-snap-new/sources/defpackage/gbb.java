package defpackage;

import com.snap.core.db.api.SqlDelightDbClient;
import defpackage.ainf.a;
import defpackage.gbl.c;
import defpackage.gbl.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gbb */
public final class gbb implements gbc {
    final ajxe a = ajxh.a(new c(this));
    final ConcurrentHashMap<hwp, hwo> b;
    final ajxe c;
    final ajwl<gbe> d;
    final ajwy<hws> e;
    final zfw f;
    final ajwy<iha> g;
    final ajwy<gbg> h;
    final ajwy<gbl> i;
    final ajwy<sah> j;
    final ihh k;
    private AtomicBoolean l;
    private final ajwy<hwo> m;

    /* renamed from: gbb$c */
    static final class c extends akcs implements akbk<SqlDelightDbClient> {
        private /* synthetic */ gbb a;

        c(gbb gbb) {
            this.a = gbb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((gbl) this.a.i.get()).a();
        }
    }

    /* renamed from: gbb$d */
    static final class d extends akcs implements akbk<zfr> {
        private /* synthetic */ gbb a;

        d(gbb gbb) {
            this.a = gbb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.f.p();
        }
    }

    /* renamed from: gbb$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ gbb a;
        private /* synthetic */ String b;

        e(gbb gbb, String str) {
            this.a = gbb;
            this.b = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x006a in {3, 6, 8} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r4 = this;
            r0 = r4.a;
            r0 = r0.b;
            r0 = (java.util.Map) r0;
            r1 = new java.util.ArrayList;
            r2 = r0.size();
            r1.<init>(r2);
            r1 = (java.util.Collection) r1;
            r0 = r0.entrySet();
            r0 = r0.iterator();
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0041;
            r2 = r0.next();
            r2 = (java.util.Map.Entry) r2;
            r3 = r2.getValue();
            r3 = (defpackage.hwo) r3;
            r2 = r2.getKey();
            r2 = (defpackage.hwp) r2;
            r2 = r3.a(r2);
            r3 = r4.b;
            r2 = r2.get(r3);
            r2 = (defpackage.hwn) r2;
            r1.add(r2);
            goto L_0x0019;
            r1 = (java.util.List) r1;
            r1 = (java.lang.Iterable) r1;
            r0 = defpackage.ajyu.g(r1);
            r0 = defpackage.ajyu.g(r0);
            r0 = (defpackage.hwn) r0;
            if (r0 == 0) goto L_0x0052;
            return r0;
            r0 = new java.lang.IllegalArgumentException;
            r1 = new java.lang.StringBuilder;
            r2 = "Unknown job type: ";
            r1.<init>(r2);
            r2 = r4.b;
            r1.append(r2);
            r1 = r1.toString();
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gbb$e.call():java.lang.Object");
        }
    }

    /* renamed from: gbb$r */
    static final class r<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ gbb a;
        final /* synthetic */ hwg b;

        r(gbb gbb, hwg hwg) {
            this.a = gbb;
            this.b = hwg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final hwn hwn = (hwn) obj;
            akcr.b(hwn, "config");
            return hwn.d.a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ r a;

                public final /* synthetic */ Object apply(Object obj) {
                    hwm hwm = (hwm) obj;
                    akcr.b(hwm, "processor");
                    gbb gbb = this.a.a;
                    hwp hwp = hwn.b;
                    hwg hwg = this.a.b;
                    obj = ((SqlDelightDbClient) gbb.a.b()).runInTransaction("DurableJobManagerImpl:scheduleNewJob", new o(gbb, hwg, hwm)).b((ajeb) ((gbl) gbb.i.get()).a(hwp, hwg)).a((ajfc) new p(gbb, hwg, hwm)).a((ajdw) gbb.f.i()).f(new q(gbb, hwg, hwm));
                    akcr.a(obj, "dbClient.runInTransactio… single\n                }");
                    return obj;
                }
            });
        }
    }

    /* renamed from: gbb$o */
    static final class o extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ gbb a;
        private /* synthetic */ hwg b;
        private /* synthetic */ hwm c;

        o(gbb gbb, hwg hwg, hwm hwm) {
            this.a = gbb;
            this.b = hwg;
            this.c = hwm;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            gbg gbg = (gbg) this.a.h.get();
            String a = this.b.a();
            ide c = this.c.c();
            akcr.b(a, "jobName");
            akcr.b(c, "attributedFeature");
            gbg.a().c(iot.DURABLE_JOB_SUBMITTED.a("job_name", a).a("attribution", c.getName()), 1);
            this.c.d(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: gbb$p */
    static final class p<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gbb a;
        private /* synthetic */ hwg b;
        private /* synthetic */ hwm c;

        p(gbb gbb, hwg hwg, hwm hwm) {
            this.a = gbb;
            this.b = hwg;
            this.c = hwm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (String) obj;
            akcr.b(obj, "uuid");
            if (this.b.c.g) {
                this.c.a(String.valueOf(this.b.d), this.b.c.j);
            }
            Object a = ajcx.a((ajev) new n(this.a, obj, this.b));
            akcr.a(a, "Completable.fromAction {…leJob, attempt)\n        }");
            return a.a(obj);
        }
    }

    /* renamed from: gbb$q */
    static final class q<T, R> implements ajfc<T, R> {
        private /* synthetic */ gbb a;
        private /* synthetic */ hwg b;
        private /* synthetic */ hwm c;

        q(gbb gbb, hwg hwg, hwm hwm) {
            this.a = gbb;
            this.b = hwg;
            this.c = hwm;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "single");
            gbl gbl = (gbl) this.a.i.get();
            String a = this.b.a();
            akcr.b(a, "jobType");
            Long l = (Long) gbl.a().queryFirst("DurableJobRepository:countEnqueuedJobs", gbl.b().a().a(a, hwt.ENQUEUED));
            long longValue = l != null ? l.longValue() : 0;
            gbg gbg = (gbg) this.a.h.get();
            String a2 = this.b.a();
            ide c = this.c.c();
            akcr.b(a2, "jobName");
            akcr.b(c, "attributedFeature");
            gbg.a().b(iot.DURABLE_JOB_QUEUE_SIZE.a("job_name", a2).a("attribution", c.getName()), longValue);
            return str;
        }
    }

    /* renamed from: gbb$n */
    static final class n implements ajev {
        private /* synthetic */ gbb a;
        private /* synthetic */ String b;
        private /* synthetic */ hwg c;
        private /* synthetic */ int d = 0;

        n(gbb gbb, String str, hwg hwg) {
            this.a = gbb;
            this.b = str;
            this.c = hwg;
        }

        public final void run() {
            ((hws) this.a.e.get()).a(this.b, this.c);
        }
    }

    /* renamed from: gbb$k */
    static final class k<T, R> implements ajfc<T, R> {
        private /* synthetic */ gbb a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ String d;
        private /* synthetic */ String e;
        private /* synthetic */ int f;

        k(gbb gbb, String str, String str2, String str3, String str4, int i) {
            this.a = gbb;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = i;
        }

        private gay<hwg<?>> a(hwn hwn) {
            akcr.b(hwn, "jobProcessorConfig");
            try {
                Object a = ((iha) this.a.g.get()).a(this.c, hwn.c);
                hwh c = this.a.c(this.d);
                Object newInstance = hwn.a.getConstructor(new Class[]{hwh.class, hwn.c}).newInstance(new Object[]{c, a});
                if (newInstance != null) {
                    return new gay((hwg) newInstance, this.b, this.e, this.f);
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.durablejob.DurableJob<*>");
            } catch (Exception e) {
                throw e;
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((hwn) obj);
        }
    }

    /* renamed from: gbb$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final l a = new l();

        l() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            hwn hwn = (hwn) obj;
            akcr.b(hwn, "it");
            return hwn.d;
        }
    }

    /* renamed from: gbb$m */
    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ gbb a;
        final /* synthetic */ gay b;

        m(gbb gbb, gay gay) {
            this.a = gbb;
            this.b = gay;
        }

        public final /* synthetic */ Object apply(Object obj) {
            int i;
            String str;
            hwg hwg;
            hwh hwh;
            final hwm hwm = (hwm) obj;
            akcr.b(hwm, "processor");
            hwg hwg2 = this.b.a;
            hwh hwh2 = hwg2.c;
            int i2 = this.b.d;
            String str2 = this.b.c;
            if (hwh2.g) {
                hwm.d();
            }
            gbb gbb = this.a;
            gay gay = this.b;
            int i3 = gay.d;
            hwg hwg3 = gay.a;
            String str3 = gay.c;
            gbl gbl = (gbl) gbb.i.get();
            akcr.b(str3, "uuid");
            gbm gbm = (gbm) gbl.a().queryFirst("DurableJobRepository:getJobByUUID", gbl.b().a().a(str3));
            if (gbm != null) {
                long a = gbb.k.a() - gbm.d();
                gbg gbg = (gbg) gbb.h.get();
                String a2 = hwg3.a();
                ide c = hwm.c();
                i = i2;
                akcr.b(a2, "jobName");
                akcr.b(c, "attributedFeature");
                str = str2;
                hwg = hwg2;
                String str4 = "job_name";
                hwh = hwh2;
                String str5 = "attribution";
                gbg.a().c(iot.DURABLE_JOB_STARTED.a(str4, a2).a(str5, c.getName()), 1);
                gbg.a().a(iot.DURABLE_JOB_QUEUE_LATENCY.a(str4, a2).a(str5, c.getName()), a);
            } else {
                hwg = hwg2;
                hwh = hwh2;
                i = i2;
                str = str2;
                new StringBuilder("Record not found in the db for job ").append(hwg3.getClass().getSimpleName());
            }
            Object a3 = ((gbl) gbb.i.get()).a(str3, hwt.RUNNING, i3).a(Boolean.TRUE).a((ajfc) new h(gbb, hwm, hwg3)).a((ajdw) (zfr) gbb.c.b()).c((ajfb) new i(gbb, hwm, hwg3, gbb.k.c(), str3)).a((ajfc) new j(gbb, str3, gay));
            akcr.a(a3, "durableJobRepository.get…alse) }\n                }");
            final hwh hwh3 = hwh;
            final hwg hwg4 = hwg;
            final String str6 = str;
            final hwm hwm2 = hwm;
            final int i4 = i;
            final hwh hwh4 = hwh3;
            return a3.a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ m a;

                public final /* synthetic */ Object apply(Object obj) {
                    obj = (gbd) obj;
                    akcr.b(obj, "result");
                    return (hwh3.h && obj.b && !obj.c) ? this.a.a.a(this.a.b.a).a(obj) : ajdx.b(obj);
                }
            }).h(new ajfc<Throwable, ajeb<? extends gbd>>(this) {
                final /* synthetic */ m a;

                /* renamed from: gbb$m$2$1 */
                static final class 1<V> implements Callable<gbd> {
                    private /* synthetic */ 2 a;

                    1(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object call() {
                        gay gay = this.a.a.b;
                        int i = i4 + 1;
                        hwg hwg = gay.a;
                        String str = gay.b;
                        String str2 = gay.c;
                        akcr.b(hwg, "job");
                        akcr.b(str, "jobIdentifier");
                        akcr.b(str2, "uuid");
                        return new gbd(new gay(hwg, str, str2, i), false, true);
                    }
                }

                /* renamed from: gbb$m$2$2 */
                static final class 2<V> implements Callable<gbd> {
                    private /* synthetic */ 2 a;

                    2(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object call() {
                        return new gbd(this.a.a.b, false, false);
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:18:0x0141  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0132  */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
                    /*
                    r10 = this;
                    r11 = (java.lang.Throwable) r11;
                    r0 = "it";
                    defpackage.akcr.b(r11, r0);
                    r0 = r10.a;
                    r0 = r0.a;
                    r0 = r0.j;
                    r0 = r0.get();
                    r0 = (defpackage.sah) r0;
                    r0 = r0.a(r11);
                    r1 = r2;
                    r1 = r1.getClass();
                    r1.getSimpleName();
                    r1 = r11 instanceof java.util.concurrent.TimeoutException;
                    r2 = "attribution";
                    r3 = "job_name";
                    r4 = "attributedFeature";
                    r5 = "jobName";
                    if (r1 == 0) goto L_0x005f;
                L_0x002c:
                    r1 = r10.a;
                    r1 = r1.a;
                    r1 = r1.h;
                    r1 = r1.get();
                    r1 = (defpackage.gbg) r1;
                    r6 = r2;
                    r6 = r6.a();
                    r7 = r4;
                    r7 = r7.c();
                    defpackage.akcr.b(r6, r5);
                    defpackage.akcr.b(r7, r4);
                    r1 = r1.a();
                    r8 = defpackage.iot.DURABLE_JOB_TIMED_OUT;
                    r6 = r8.a(r3, r6);
                    r7 = r7.getName();
                    r6 = r6.a(r2, r7);
                    r1.c(r6, 1);
                L_0x005f:
                    r1 = "processor";
                    r6 = 1;
                    if (r0 != 0) goto L_0x0076;
                L_0x0064:
                    r0 = r10.a;
                    r0 = r0.a;
                    r7 = r4;
                    defpackage.akcr.a(r7, r1);
                    r11 = r0.a(r7, r11);
                    if (r11 == 0) goto L_0x0074;
                L_0x0073:
                    goto L_0x0076;
                L_0x0074:
                    r11 = 0;
                    goto L_0x0077;
                L_0x0076:
                    r11 = 1;
                L_0x0077:
                    if (r11 == 0) goto L_0x00db;
                L_0x0079:
                    r11 = r5;
                    r0 = r2;
                    r0 = r0.c;
                    r0 = r0.a;
                    if (r11 >= r0) goto L_0x00db;
                L_0x0083:
                    r11 = r10.a;
                    r11 = r11.a;
                    r11 = r11.h;
                    r11 = r11.get();
                    r11 = (defpackage.gbg) r11;
                    r0 = r2;
                    r0 = r0.a();
                    r1 = r4;
                    r1 = r1.c();
                    defpackage.akcr.b(r0, r5);
                    defpackage.akcr.b(r1, r4);
                    r11 = r11.a();
                    r4 = defpackage.iot.DURABLE_JOB_RETRIED;
                    r0 = r4.a(r3, r0);
                    r1 = r1.getName();
                    r0 = r0.a(r2, r1);
                    r11.c(r0, 1);
                    r11 = r10.a;
                    r11 = r11.a;
                    r11 = r11.i;
                    r11 = r11.get();
                    r11 = (defpackage.gbl) r11;
                    r0 = r3;
                    r1 = defpackage.hwt.ENQUEUED;
                    r2 = r5;
                    r2 = r2 + r6;
                    r11 = r11.a(r0, r1, r2);
                    r0 = new gbb$m$2$1;
                    r0.<init>(r10);
                L_0x00d2:
                    r0 = (java.util.concurrent.Callable) r0;
                    r11 = r11.c(r0);
                    r11 = (defpackage.ajeb) r11;
                    return r11;
                L_0x00db:
                    r11 = r10.a;
                    r11 = r11.a;
                    r0 = r3;
                    r6 = r2;
                    r7 = r4;
                    defpackage.akcr.a(r7, r1);
                    r1 = r11.h;
                    r1 = r1.get();
                    r1 = (defpackage.gbg) r1;
                    r8 = r6.a();
                    r9 = r7.c();
                    defpackage.akcr.b(r8, r5);
                    defpackage.akcr.b(r9, r4);
                    r1 = r1.a();
                    r4 = defpackage.iot.DURABLE_JOB_FAILED;
                    r3 = r4.a(r3, r8);
                    r4 = r9.getName();
                    r2 = r3.a(r2, r4);
                    r1.c(r2, 1);
                    r1 = r7.c(r6);
                    r2 = "DurableJobProcessor:failedJob";
                    r1 = defpackage.igs.a(r1, r2);
                    r11 = r11.e(r0);
                    r11 = (defpackage.ajdb) r11;
                    r11 = r1.b(r11);
                    r0 = "processor.onFailedJob(du…ndThen(completeJob(uuid))";
                    defpackage.akcr.a(r11, r0);
                    r0 = r6;
                    r0 = r0.h;
                    if (r0 == 0) goto L_0x0141;
                L_0x0132:
                    r0 = r10.a;
                    r0 = r0.a;
                    r1 = r10.a;
                    r1 = r1.b;
                    r1 = r1.a;
                    r0 = r0.a(r1);
                    goto L_0x014c;
                L_0x0141:
                    r0 = defpackage.ajhn.a;
                    r0 = defpackage.ajvo.a(r0);
                    r1 = "Completable.complete()";
                    defpackage.akcr.a(r0, r1);
                L_0x014c:
                    r0 = (defpackage.ajdb) r0;
                    r11 = r11.b(r0);
                    r0 = new gbb$m$2$2;
                    r0.<init>(r10);
                    goto L_0x00d2;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.gbb$m$2.apply(java.lang.Object):java.lang.Object");
                }
            }).b((ajev) new ajev() {
                public final void run() {
                    if (hwh3.g) {
                        hwm.a(String.valueOf(hwg4.d));
                    }
                }
            });
        }
    }

    /* renamed from: gbb$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gbb a;
        private /* synthetic */ hwm b;
        private /* synthetic */ hwg c;

        h(gbb gbb, hwm hwm, hwg hwg) {
            this.a = gbb;
            this.b = hwm;
            this.c = hwg;
        }

        private ajdx a(Boolean bool) {
            akcr.b(bool, "it");
            return this.b.a(this.c).b((ajdw) this.a.f.b());
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((Boolean) obj);
        }
    }

    /* renamed from: gbb$i */
    static final class i<T> implements ajfb<Object> {
        private /* synthetic */ gbb a;
        private /* synthetic */ hwm b;
        private /* synthetic */ hwg c;
        private /* synthetic */ long d;
        private /* synthetic */ String e;

        i(gbb gbb, hwm hwm, hwg hwg, long j, String str) {
            this.a = gbb;
            this.b = hwm;
            this.c = hwg;
            this.d = j;
            this.e = str;
        }

        public final void accept(Object obj) {
            this.b.b(this.c);
            gbg gbg = (gbg) this.a.h.get();
            long c = this.a.k.c() - this.d;
            String a = this.c.a();
            ide c2 = this.b.c();
            akcr.b(a, "jobName");
            akcr.b(c2, "attributedFeature");
            gbg.a().a(iot.DURABLE_JOB_RUN_TIME_LATENCY.a("job_name", a).a("attribution", c2.getName()), c);
            this.a.d.a(new gbe(this.e, obj));
        }
    }

    /* renamed from: gbb$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ gay a;
        private /* synthetic */ gbb b;
        private /* synthetic */ String c;

        /* renamed from: gbb$j$1 */
        static final class 1<V> implements Callable<gbd> {
            private /* synthetic */ j a;

            1(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object call() {
                return new gbd(this.a.a, true, false);
            }
        }

        j(gbb gbb, String str, gay gay) {
            this.b = gbb;
            this.c = str;
            this.a = gay;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b(obj, "it");
            return this.b.e(this.c).c((Callable) new 1(this));
        }
    }

    /* renamed from: gbb$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ gbb a;
        private /* synthetic */ hwp b;

        a(gbb gbb, hwp hwp) {
            this.a = gbb;
            this.b = hwp;
        }

        public final /* synthetic */ Object call() {
            gbl gbl = (gbl) this.a.i.get();
            hwp hwp = this.b;
            akcr.b(hwp, "scope");
            return gbl.a().queryAsList("DurableJobRepository:getAllUniqueTagsForScope", gbl.b().a().a(hwp));
        }
    }

    /* renamed from: gbb$b */
    static final class b<T, R> implements ajfc<List<? extends String>, ajdb> {
        private /* synthetic */ gbb a;

        b(gbb gbb) {
            this.a = gbb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "tags");
            return ((hws) this.a.e.get()).a(list);
        }
    }

    /* renamed from: gbb$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            hwn hwn = (hwn) obj;
            akcr.b(hwn, "it");
            return hwn.d;
        }
    }

    /* renamed from: gbb$g */
    static final class g<T, R> implements ajfc<hwm<? super hwg<?>, ?>, ajdb> {
        private /* synthetic */ hwg a;

        g(hwg hwg) {
            this.a = hwg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            hwm hwm = (hwm) obj;
            akcr.b(hwm, "it");
            if (this.a.c.g) {
                hwm.a(String.valueOf(this.a.d), this.a.c.j);
            }
            return igs.a(hwm.e(this.a), "DurableJobProcessor:onJobQueued");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gbb.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/SqlDelightDbClient;"), new akdc(akde.a(gbb.class), "dbScheduler", "getDbScheduler()Lcom/snap/taskexecution/scheduling/HandlerScheduler;")};
    }

    public gbb(ajwy<hws> ajwy, zfw zfw, ajwy<iha> ajwy2, ajwy<gbg> ajwy3, ajwy<gbl> ajwy4, ajwy<sah> ajwy5, ihh ihh, ajwy<hwo> ajwy6) {
        akcr.b(ajwy, "durableJobScheduler");
        akcr.b(zfw, "schedulers");
        akcr.b(ajwy2, "serializationHelper");
        akcr.b(ajwy3, "durableJobAnalytics");
        akcr.b(ajwy4, "durableJobRepository");
        akcr.b(ajwy5, "noNetworkExponentialBackOffController");
        akcr.b(ihh, "clock");
        akcr.b(ajwy6, "appScopeJobRegistry");
        this.e = ajwy;
        this.f = zfw;
        this.g = ajwy2;
        this.h = ajwy3;
        this.i = ajwy4;
        this.j = ajwy5;
        this.k = ihh;
        this.m = ajwy6;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(hwp.APP_SCOPE, this.m.get());
        this.b = concurrentHashMap;
        this.l = new AtomicBoolean(false);
        this.c = ajxh.a(new d(this));
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.d = ajwl;
    }

    private final ajdx<String> c(hwg<?> hwg) {
        Object a = f(hwg.a()).a((ajfc) new r(this, hwg));
        akcr.a(a, "getProcessorConfig(durab…      }\n                }");
        return a;
    }

    private final ajdx<hwn> f(String str) {
        Object c = ajdx.c((Callable) new e(this, str));
        akcr.a(c, "Single.fromCallable {\n  …jobIdentifier\")\n        }");
        return c;
    }

    public final ajcx a(hwg<?> hwg) {
        akcr.b(hwg, "durableJob");
        Object e = c((hwg) hwg).e();
        akcr.a(e, "submitJobInternal(durableJob).ignoreElement()");
        return e;
    }

    public final ajcx a(hwp hwp) {
        Object a;
        String str;
        akcr.b(hwp, "scope");
        if (this.b.get(hwp) == null) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            a = ajdx.c((Callable) new a(this, hwp)).e((ajfc) new b(this));
            str = "Single.fromCallable { du…l(tags)\n                }";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajcx a(String str) {
        akcr.b(str, "uniqueTag");
        return ((hws) this.e.get()).a(ajyl.a(str));
    }

    public final ajcx a(List<String> list) {
        String str = "groupTags";
        akcr.b(list, str);
        if (list.isEmpty()) {
            Object a = ajvo.a(ajhn.a);
            akcr.a(a, "Completable.complete()");
            return a;
        }
        akcr.b(list, str);
        gbl gbl = (gbl) this.i.get();
        akcr.b(list, str);
        return gbl.a().runInTransaction("DurableJobManagerImpl:deleteJobsByGroupTags", new d(gbl, list));
    }

    public final ajdx<gbd> a(gay<?> gay) {
        akcr.b(gay, "activeJob");
        Object a = f(gay.b).a((ajfc) l.a).a((ajfc) new m(this, gay));
        akcr.a(a, "getProcessorConfig(activ…      }\n                }");
        return a;
    }

    public final ajdx<gay<?>> a(String str, String str2, int i, String str3, String str4) {
        akcr.b(str, "jobIdentifier");
        akcr.b(str2, "uuid");
        akcr.b(str3, "metadataString");
        akcr.b(str4, "jobConfigString");
        Object f = f(str).f(new k(this, str, str3, str4, str2, i));
        akcr.a(f, "getProcessorConfig(jobId…ttempt)\n                }");
        return f;
    }

    public final void a() {
        if (this.l.compareAndSet(false, true)) {
            for (Entry value : this.b.entrySet()) {
                Iterator it = ((hwo) value.getValue()).a.keySet().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            ((hws) this.e.get()).b();
        }
    }

    public final void a(hwp hwp, ajwy<hwo> ajwy) {
        akcr.b(hwp, "scope");
        akcr.b(ajwy, "registry");
        if (!this.l.get()) {
            Map map = this.b;
            Object obj = ajwy.get();
            akcr.a(obj, "registry.get()");
            map.put(hwp, obj);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(hwm<?, ?> hwm, Throwable th) {
        if (hwm.a(th)) {
            return true;
        }
        Throwable cause = th.getCause();
        return (cause == null || (akcr.a((Object) cause, (Object) th) ^ 1) == 0 || !a((hwm) hwm, cause)) ? false : true;
    }

    public final ajcx b(hwg<?> hwg) {
        akcr.b(hwg, "durableJob");
        Object e = f(hwg.a()).a((ajfc) f.a).e((ajfc) new g(hwg));
        akcr.a(e, "getProcessorConfig(durab…ueued\")\n                }");
        return e;
    }

    public final ajcx b(List<String> list) {
        String str = "uniqueTags";
        akcr.b(list, str);
        gbl gbl = (gbl) this.i.get();
        akcr.b(list, str);
        return gbl.a().runInTransaction("DurableJobManagerImpl:deleteJobs", new c(gbl, list));
    }

    public final void b() {
        if (this.l.compareAndSet(true, false)) {
            ((hws) this.e.get()).dispose();
        }
    }

    public final boolean b(String str) {
        akcr.b(str, "uniqueTag");
        return ((gbl) this.i.get()).b(str);
    }

    public final ajcx c() {
        return ((hws) this.e.get()).c();
    }

    /* Access modifiers changed, original: final */
    public final hwh c(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (hwh) ((iha) this.g.get()).a(str, hwh.class);
        } catch (Exception e) {
            throw e;
        }
    }

    public final long d() {
        gbl gbl = (gbl) this.i.get();
        Long l = (Long) gbl.a().queryFirst("DurableJobRepository:countRunnableJobs", gbl.b().a().a(gbl.d.a()));
        return l != null ? l.longValue() : 0;
    }

    public final gbm d(String str) {
        akcr.b(str, "uniqueTag");
        return ((gbl) this.i.get()).a(str);
    }

    public final ajcx e(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        gbl gbl = (gbl) this.i.get();
        akcr.b(str, str2);
        return gbl.a().runInTransaction("DurableJobManagerImpl:completeJob", new gbl.a(gbl, str));
    }

    public final ajdp<Long> e() {
        gbl gbl = (gbl) this.i.get();
        return gbl.a().queryAndMapToOne("durableJob:observeJobCount", gbl.b().a().b());
    }

    public final ajdp<List<String>> f() {
        gbl gbl = (gbl) this.i.get();
        return gbl.a().queryAndMapToList("durableJob:getAllUniqueTags", gbl.b().a().a());
    }
}
