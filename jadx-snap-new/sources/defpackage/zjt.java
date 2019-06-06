package defpackage;

import com.brightcove.player.media.CuePointFields;
import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Queues;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: zjt */
public final class zjt extends zgi implements achk<zjm, zjk> {
    volatile b a;
    volatile zjm b;
    final achb<zjm, zjk> c;
    private final Queue<a> d = Queues.synchronizedQueue(EvictingQueue.create(20));
    private final zfw e = zgb.a(zjc.a.callsite("NavigationBreadcrumbReporter"));
    private final ajwy<ppm> f;

    /* renamed from: zjt$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: zjt$a */
    static abstract class a {

        /* renamed from: zjt$a$b */
        public static final class b extends a {
            final Date a;
            final zjm b;
            final zjm c;

            public b(Date date, zjm zjm, zjm zjm2) {
                akcr.b(date, CuePointFields.TIME);
                akcr.b(zjm, "sourcePageType");
                akcr.b(zjm2, "destinationPageType");
                super();
                this.a = date;
                this.b = zjm;
                this.c = zjm2;
            }

            public final Date a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x0029;
            L_0x0002:
                r0 = r3 instanceof defpackage.zjt.a.b;
                if (r0 == 0) goto L_0x0027;
            L_0x0006:
                r3 = (defpackage.zjt.a.b) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x0012:
                r0 = r2.b;
                r1 = r3.b;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x0027;
            L_0x001c:
                r0 = r2.c;
                r3 = r3.c;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x0027;
            L_0x0026:
                goto L_0x0029;
            L_0x0027:
                r3 = 0;
                return r3;
            L_0x0029:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zjt$a$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Date date = this.a;
                int i = 0;
                int hashCode = (date != null ? date.hashCode() : 0) * 31;
                zjm zjm = this.b;
                hashCode = (hashCode + (zjm != null ? zjm.hashCode() : 0)) * 31;
                zjm = this.c;
                if (zjm != null) {
                    i = zjm.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("NavigatingEvent(time=");
                stringBuilder.append(this.a);
                stringBuilder.append(", sourcePageType=");
                stringBuilder.append(this.b);
                stringBuilder.append(", destinationPageType=");
                stringBuilder.append(this.c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: zjt$a$c */
        public static final class c extends a {
            final Date a;
            final zjm b;

            public c(Date date, zjm zjm) {
                akcr.b(date, CuePointFields.TIME);
                akcr.b(zjm, "pageType");
                super();
                this.a = date;
                this.b = zjm;
            }

            public final Date a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.zjt.a.c;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.zjt.a.c) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r3 = 0;
                return r3;
            L_0x001f:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zjt$a$c.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Date date = this.a;
                int i = 0;
                int hashCode = (date != null ? date.hashCode() : 0) * 31;
                zjm zjm = this.b;
                if (zjm != null) {
                    i = zjm.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("NewPageEvent(time=");
                stringBuilder.append(this.a);
                stringBuilder.append(", pageType=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: zjt$a$a */
        public static final class a extends a {
            final Date a;
            final b b;

            public a(Date date, b bVar) {
                akcr.b(date, CuePointFields.TIME);
                akcr.b(bVar, "lifecycle");
                super();
                this.a = date;
                this.b = bVar;
            }

            public final Date a() {
                return this.a;
            }

            /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
            public final boolean equals(java.lang.Object r3) {
                /*
                r2 = this;
                if (r2 == r3) goto L_0x001f;
            L_0x0002:
                r0 = r3 instanceof defpackage.zjt.a.a;
                if (r0 == 0) goto L_0x001d;
            L_0x0006:
                r3 = (defpackage.zjt.a.a) r3;
                r0 = r2.a;
                r1 = r3.a;
                r0 = defpackage.akcr.a(r0, r1);
                if (r0 == 0) goto L_0x001d;
            L_0x0012:
                r0 = r2.b;
                r3 = r3.b;
                r3 = defpackage.akcr.a(r0, r3);
                if (r3 == 0) goto L_0x001d;
            L_0x001c:
                goto L_0x001f;
            L_0x001d:
                r3 = 0;
                return r3;
            L_0x001f:
                r3 = 1;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zjt$a$a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                Date date = this.a;
                int i = 0;
                int hashCode = (date != null ? date.hashCode() : 0) * 31;
                b bVar = this.b;
                if (bVar != null) {
                    i = bVar.hashCode();
                }
                return hashCode + i;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("ActivityLifecycleEvent(time=");
                stringBuilder.append(this.a);
                stringBuilder.append(", lifecycle=");
                stringBuilder.append(this.b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public abstract Date a();
    }

    /* renamed from: zjt$d */
    static final class d implements ajev {
        private /* synthetic */ zjt a;

        d(zjt zjt) {
            this.a = zjt;
        }

        public final void run() {
            this.a.a(b.ON_DESTROY);
            this.a.c.b((achk) this.a);
        }
    }

    /* renamed from: zjt$c */
    static final class c implements ajev {
        private /* synthetic */ zjt a;

        c(zjt zjt) {
            this.a = zjt;
        }

        public final void run() {
            this.a.a(b.ON_PAUSE);
        }
    }

    static {
        b bVar = new b();
    }

    public zjt(zgk<b> zgk, achb<zjm, zjk> achb, ajwy<ppm> ajwy, zgb zgb) {
        akcr.b(zgk, "taskScoper");
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "memoryInfo");
        akcr.b(zgb, "schedulersProvider");
        super(zgk);
        this.c = achb;
        this.f = ajwy;
    }

    private static Queue<a> a(Queue<a> queue) {
        LinkedList linkedList = new LinkedList();
        for (a aVar : queue) {
            Object cVar;
            boolean z = aVar instanceof c;
            String str = CuePointFields.TIME;
            Date date;
            if (z) {
                c cVar2 = (c) aVar;
                date = cVar2.a;
                zjm zjm = cVar2.b;
                akcr.b(date, str);
                akcr.b(zjm, "pageType");
                cVar = new c(date, zjm);
            } else if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                date = aVar2.a;
                b bVar = aVar2.b;
                akcr.b(date, str);
                akcr.b(bVar, "lifecycle");
                cVar = new a(date, bVar);
            }
            linkedList.add(cVar);
        }
        return linkedList;
    }

    public final ajej a() {
        a(b.ON_RESUME);
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction {…Event.ON_PAUSE)\n        }");
        return a;
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.l) {
            Object instance = Calendar.getInstance();
            akcr.a(instance, "Calendar.getInstance()");
            instance = instance.getTime();
            akcr.a(instance, "Calendar.getInstance().time");
            Object e = achi.e.e();
            akcr.a(e, "navigationEvent.sourcePage.pageType");
            zjm zjm = (zjm) e;
            Object e2 = achi.f.e();
            akcr.a(e2, "navigationEvent.destinationPage.pageType");
            this.a = new b(instance, zjm, (zjm) e2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(b bVar) {
        Object instance = Calendar.getInstance();
        akcr.a(instance, "Calendar.getInstance()");
        instance = instance.getTime();
        akcr.a(instance, "Calendar.getInstance().time");
        this.d.add(new a(instance, bVar));
    }

    public final ajej b() {
        a(b.ON_CREATE);
        Object a = ajek.a((ajev) new d(this));
        akcr.a(a, "Disposables.fromAction {…ubscriber(this)\n        }");
        return a;
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.j) {
            this.a = null;
            this.b = (zjm) achi.f.e();
            Object e = achi.f.e();
            akcr.a(e, "navigationEvent.destinationPage.pageType");
            zjm zjm = (zjm) e;
            Object instance = Calendar.getInstance();
            akcr.a(instance, "Calendar.getInstance()");
            instance = instance.getTime();
            akcr.a(instance, "Calendar.getInstance().time");
            this.d.add(new c(instance, zjm));
        }
    }

    public final void c() {
        this.c.a((achk) this);
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.j) {
            this.a = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x00d4 in {7, 8, 14, 15, 18, 20, 21, 24} preds:[]
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
    public final java.util.List<defpackage.ailj> d() {
        /*
        r8 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
        r1 = r8.d;
        r2 = "eventEvictingQueue";
        defpackage.akcr.a(r1, r2);
        monitor-enter(r1);
        r2 = r8.d;	 Catch:{ all -> 0x00d1 }
        r3 = "eventEvictingQueue";	 Catch:{ all -> 0x00d1 }
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x00d1 }
        r2 = defpackage.zjt.a(r2);	 Catch:{ all -> 0x00d1 }
        monitor-exit(r1);
        r1 = r8.a;
        if (r1 == 0) goto L_0x003a;
        r3 = r1.a;
        r4 = r1.b;
        r1 = r1.c;
        r5 = "time";
        defpackage.akcr.b(r3, r5);
        r5 = "sourcePageType";
        defpackage.akcr.b(r4, r5);
        r5 = "destinationPageType";
        defpackage.akcr.b(r1, r5);
        r5 = new zjt$a$b;
        r5.<init>(r3, r4, r1);
        goto L_0x003b;
        r5 = 0;
        r2 = (java.lang.Iterable) r2;
        r1 = r2.iterator();
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x009e;
        r2 = r1.next();
        r2 = (defpackage.zjt.a) r2;
        r3 = r2 instanceof defpackage.zjt.a.c;
        if (r3 == 0) goto L_0x007e;
        r3 = new ailj;
        r3.<init>();
        r4 = r2.a();
        r6 = r4.getTime();
        r4 = java.lang.Long.valueOf(r6);
        r3.a = r4;
        r4 = new java.lang.StringBuilder;
        r6 = "Land on ";
        r4.<init>(r6);
        r2 = (defpackage.zjt.a.c) r2;
        r2 = r2.b;
        r2 = r2.c;
        r4.append(r2);
        r2 = r4.toString();
        r3.b = r2;
        r0.add(r3);
        goto L_0x0041;
        r3 = r2 instanceof defpackage.zjt.a.a;
        if (r3 == 0) goto L_0x0041;
        r3 = new ailj;
        r3.<init>();
        r4 = r2.a();
        r6 = r4.getTime();
        r4 = java.lang.Long.valueOf(r6);
        r3.a = r4;
        r2 = (defpackage.zjt.a.a) r2;
        r2 = r2.b;
        r2 = r2.name();
        goto L_0x0078;
        if (r5 == 0) goto L_0x00d0;
        r1 = new ailj;
        r1.<init>();
        r2 = r5.a;
        r2 = r2.getTime();
        r2 = java.lang.Long.valueOf(r2);
        r1.a = r2;
        r2 = new java.lang.StringBuilder;
        r3 = "Currently navigating from ";
        r2.<init>(r3);
        r3 = r5.b;
        r2.append(r3);
        r3 = " to ";
        r2.append(r3);
        r3 = r5.c;
        r2.append(r3);
        r2 = r2.toString();
        r1.b = r2;
        r0.add(r1);
        return r0;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjt.d():java.util.List");
    }

    public final String e() {
        achb achb = this.c;
        if (achb.b == null) {
            return "";
        }
        acgs acgs = achb.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        Object d = acgs.d();
        akcr.a(d, "navigationManager.navigationStack");
        d = d.g();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" TOP PAGE -> \r\n");
        akcr.a(d, "navigationStack");
        for (Object obj : (Iterable) d) {
            stringBuilder.append(" * ");
            akcr.a(obj, "it");
            stringBuilder.append(obj.e());
            stringBuilder.append("\r\n");
        }
        stringBuilder.append(" <- BOTTOM PAGE \r\n");
        d = stringBuilder.toString();
        akcr.a(d, "stringBuilder.toString()");
        return d;
    }
}
