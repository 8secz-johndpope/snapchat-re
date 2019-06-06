package defpackage;

import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.ainf.a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yek */
public final class yek implements yew {
    long a;
    final String b;
    final LinkedList<yez> c;
    long d;
    long e;
    final SqlDelightDbManager f;
    final ihh g;
    private final String h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final HashMap<String, yep> l;
    private final ajwo<ajxw> m;
    private ajej n;
    private final yem o;
    private final zgb p;
    private final long q;

    /* renamed from: yek$b */
    abstract class b<T> implements akdh, Iterator<T> {
        long a;
        private final long b = 25;
        private int c;

        public abstract List<T> a();

        public abstract void b();

        public boolean hasNext() {
            synchronized (yek.this) {
                if (this.c < a().size()) {
                    return true;
                }
                this.c = 0;
                b();
                int isEmpty = a().isEmpty() ^ 1;
                return isEmpty;
            }
        }

        public T next() {
            List a = a();
            int i = this.c;
            this.c = i + 1;
            return a.get(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: yek$l */
    static final class l extends akcs implements akbk<SqlDelightDbClient> {
        private /* synthetic */ yek a;

        l(yek yek) {
            this.a = yek;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.f.getDbClient(yfe.a.callsite("db-journal"));
        }
    }

    /* renamed from: yek$v */
    static final class v extends akcs implements akbk<zfw> {
        private /* synthetic */ yek a;

        v(yek yek) {
            this.a = yek;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(yet.a.callsite("DbJournal"));
        }
    }

    /* renamed from: yek$t */
    static final class t extends akcs implements akbk<yfa> {
        private /* synthetic */ yek a;

        t(yek yek) {
            this.a = yek;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ainf database = this.a.a().getDatabase();
            if (database != null) {
                return (yfa) database;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.storage.cache.StorageDatabase");
        }
    }

    /* renamed from: yek$i */
    static final class i extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;

        i(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            SqlDelightDbClient a = this.a.a();
            yfp a2 = this.a.b().a();
            Object obj2 = this.a.b;
            String str = "path";
            akcr.a(obj2, str);
            ainb a3 = a2.a(obj2);
            String str2 = "DbJournal:createOrOpenJournal";
            yfn yfn = (yfn) a.queryFirst(str2, a3);
            if (yfn != null) {
                this.a.a = yfn.a();
                this.a.d = yfn.b();
                this.a.e = yfn.c();
            } else {
                yfp a4 = this.a.b().a();
                Object obj3 = this.a.b;
                akcr.a(obj3, str);
                a4.b(obj3);
                a = this.a.a();
                a2 = this.a.b().a();
                Object obj4 = this.a.b;
                akcr.a(obj4, str);
                yfn = (yfn) a.queryFirst(str2, a2.a(obj4));
                if (yfn != null) {
                    this.a.a = yfn.a();
                }
                yek yek = this.a;
                yek.d = 0;
                yek.e = 0;
            }
            return ajxw.a;
        }
    }

    /* renamed from: yek$a */
    final class a extends b<yep> {
        private List<? extends yep> b = ajyw.a;
        private final String c;
        private final akbw<Long, Long, ainb<yfq>> d;
        private /* synthetic */ yek e;

        public a(yek yek, String str, akbw<? super Long, ? super Long, ? extends ainb<? extends yfq>> akbw) {
            akcr.b(str, "traceLabel");
            akcr.b(akbw, "pagedQueryGenerator");
            this.e = yek;
            super();
            this.c = str;
            this.d = akbw;
        }

        public final List<yep> a() {
            return this.b;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x006a in {8, 13, 17, 20} preds:[]
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
        public final void b() {
            /*
            r7 = this;
            r0 = "";
            defpackage.in.a(r0);
            r0 = r7.e;	 Catch:{ all -> 0x0065 }
            monitor-enter(r0);	 Catch:{ all -> 0x0065 }
            r1 = r7.d;	 Catch:{ all -> 0x0062 }
            r2 = 25;	 Catch:{ all -> 0x0062 }
            r4 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x0062 }
            r5 = r7.a;	 Catch:{ all -> 0x0062 }
            r5 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x0062 }
            r1 = r1.invoke(r4, r5);	 Catch:{ all -> 0x0062 }
            r1 = (defpackage.ainb) r1;	 Catch:{ all -> 0x0062 }
            r4 = r7.a;	 Catch:{ all -> 0x0062 }
            r4 = r4 + r2;	 Catch:{ all -> 0x0062 }
            r7.a = r4;	 Catch:{ all -> 0x0062 }
            r2 = r7.e;	 Catch:{ all -> 0x0062 }
            r2 = r2.a();	 Catch:{ all -> 0x0062 }
            r3 = "DbJournal:PagedEntryIterator:fetchEntries";	 Catch:{ all -> 0x0062 }
            r1 = r2.queryAsList(r3, r1);	 Catch:{ all -> 0x0062 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0062 }
            r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0062 }
            r3 = 10;	 Catch:{ all -> 0x0062 }
            r3 = defpackage.ajyn.a(r1, r3);	 Catch:{ all -> 0x0062 }
            r2.<init>(r3);	 Catch:{ all -> 0x0062 }
            r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0062 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0062 }
            r3 = r1.hasNext();	 Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0054;	 Catch:{ all -> 0x0062 }
            r3 = r1.next();	 Catch:{ all -> 0x0062 }
            r3 = (defpackage.yfq) r3;	 Catch:{ all -> 0x0062 }
            r3 = defpackage.yek.b(r3);	 Catch:{ all -> 0x0062 }
            r2.add(r3);	 Catch:{ all -> 0x0062 }
            goto L_0x0040;	 Catch:{ all -> 0x0062 }
            r2 = (java.util.List) r2;	 Catch:{ all -> 0x0062 }
            r1 = "<set-?>";	 Catch:{ all -> 0x0062 }
            defpackage.akcr.b(r2, r1);	 Catch:{ all -> 0x0062 }
            r7.b = r2;	 Catch:{ all -> 0x0062 }
            monitor-exit(r0);	 Catch:{ all -> 0x0065 }
            defpackage.in.a();
            return;
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0065 }
            throw r1;	 Catch:{ all -> 0x0065 }
            r0 = move-exception;
            defpackage.in.a();
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yek$a.b():void");
        }
    }

    /* renamed from: yek$c */
    final class c extends b<String> {
        private List<String> b = ajyw.a;
        private final String c;
        private final akbw<Long, Long, ainb<String>> d;
        private /* synthetic */ yek e;

        public c(yek yek, String str, akbw<? super Long, ? super Long, ? extends ainb<String>> akbw) {
            akcr.b(str, "traceLabel");
            akcr.b(akbw, "pagedQueryGenerator");
            this.e = yek;
            super();
            this.c = str;
            this.d = akbw;
        }

        public final List<String> a() {
            return this.b;
        }

        public final void b() {
            in.a("");
            try {
                synchronized (this.e) {
                    ainb ainb = (ainb) this.d.invoke(Long.valueOf(25), Long.valueOf(this.a));
                    this.a += 25;
                    List queryAsList = this.e.a().queryAsList("DbJournal:PagedKeyIterator", ainb);
                    akcr.b(queryAsList, "<set-?>");
                    this.b = queryAsList;
                }
                in.a();
            } catch (Throwable th) {
                in.a();
            }
        }
    }

    /* renamed from: yek$j */
    static final class j<T> implements ajfb<ajxw> {
        private /* synthetic */ yek a;

        j(yek yek) {
            this.a = yek;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.k();
        }
    }

    /* renamed from: yek$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: yek$r */
    static final class r extends akcs implements akbl<a, List<? extends yep>> {
        final /* synthetic */ yek a;

        /* renamed from: yek$r$1 */
        static final class 1 extends akcs implements akbw<Long, Long, ainb<? extends yfq>> {
            private /* synthetic */ r a;

            1(r rVar) {
                this.a = rVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return this.a.a.b().b().a(this.a.a.a, yfk.DIRTY, Long.valueOf(this.a.a.g.a()), ((Number) obj).longValue(), ((Number) obj2).longValue());
            }
        }

        r(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            return akfh.d(akff.a((Iterator) new a(this.a, "getInvalid", new 1(this))));
        }
    }

    /* renamed from: yek$p */
    static final class p extends akcs implements akbl<a, Set<? extends String>> {
        final /* synthetic */ yek a;

        /* renamed from: yek$p$1 */
        static final class 1 extends akcs implements akbw<Long, Long, ainb<? extends String>> {
            private /* synthetic */ p a;

            1(p pVar) {
                this.a = pVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return this.a.a.b().b().b(this.a.a.a, ((Number) obj).longValue(), ((Number) obj2).longValue());
            }
        }

        p(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            return akfh.f(akff.a((Iterator) new c(this.a, "getAllKeys", new 1(this))));
        }
    }

    /* renamed from: yek$q */
    static final class q extends akcs implements akbl<a, a> {
        final /* synthetic */ yek a;

        /* renamed from: yek$q$1 */
        static final class 1 extends akcs implements akbw<Long, Long, ainb<? extends yfq>> {
            private /* synthetic */ q a;

            1(q qVar) {
                this.a = qVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return this.a.a.b().b().c(this.a.a.a, ((Number) obj).longValue(), ((Number) obj2).longValue());
            }
        }

        q(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            return new a(this.a, "fetchOld", new 1(this));
        }
    }

    /* renamed from: yek$g */
    static final class g extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ yep b;

        g(yek yek, yep yep) {
            this.a = yek;
            this.b = yep;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            yfo b = this.a.b().b();
            long j = this.a.a;
            Object obj2 = this.b.a;
            String str = obj2;
            akcr.a(obj2, "entry.key");
            long j2 = this.b.g;
            int i = this.b.b;
            long j3 = (long) this.b.e;
            yfk yfk = yfk.DIRTY;
            long a = this.a.g.a();
            long a2 = this.a.g.a();
            long a3 = this.b.a();
            yfj yfj = r1;
            yfo yfo = b;
            Object obj3 = this.b.c;
            long j4 = j;
            akcr.a(obj3, "entry.lengths");
            yfj yfj2 = new yfj(obj3);
            yfo.a(j4, str, j2, i, j3, yfk, a, a2, a3, yfj, Long.valueOf(this.b.d));
            this.a.l();
            return ajxw.a;
        }
    }

    /* renamed from: yek$d */
    static final class d extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ long b;
        private /* synthetic */ yep c;

        d(yek yek, long j, yep yep) {
            this.a = yek;
            this.b = j;
            this.c = yep;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            this.a.b().a().a(this.a.d, this.a.e, this.a.a);
            yfo b = this.a.b().b();
            long j = this.a.a;
            Object obj2 = this.c.a;
            String str = obj2;
            akcr.a(obj2, "entry.key");
            long j2 = this.c.g;
            int i = this.c.b;
            long j3 = (long) this.c.e;
            yfk yfk = yfk.CLEAN;
            long a = this.a.g.a();
            long a2 = this.a.g.a();
            long a3 = this.c.a();
            yfj yfj = r1;
            yfo yfo = b;
            Object obj3 = this.c.c;
            long j4 = j;
            akcr.a(obj3, "entry.lengths");
            yfj yfj2 = new yfj(obj3);
            yfo.a(j4, str, j2, i, j3, yfk, a, a2, a3, yfj, Long.valueOf(this.c.d));
            this.a.l();
            return ajxw.a;
        }
    }

    /* renamed from: yek$n */
    static final class n extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;

        n(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            for (yez yez : this.a.c) {
                if (yez.c == -1) {
                    this.a.b().b().a(yez.b, this.a.a, yez.a);
                } else {
                    this.a.b().b().a(yez.b, Long.valueOf(yez.c), this.a.a, yez.a);
                }
            }
            this.a.c.clear();
            return ajxw.a;
        }
    }

    /* renamed from: yek$s */
    static final class s extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ boolean b;
        private /* synthetic */ boolean c;

        s(yek yek, boolean z, boolean z2) {
            this.a = yek;
            this.b = z;
            this.c = z2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            yek yek = this.a;
            yek.e = 0;
            yek.b().a().a(this.a.d, 0, this.a.a);
            this.a.b().b().a(this.a.a);
            return ajxw.a;
        }
    }

    /* renamed from: yek$f */
    static final class f extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ yep b;

        f(yek yek, yep yep) {
            this.a = yek;
            this.b = yep;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            this.a.b().a().a(this.a.d, this.a.e, this.a.a);
            yfo b = this.a.b().b();
            long j = this.a.a;
            Object obj2 = this.b.a;
            akcr.a(obj2, "entry.key");
            b.d(j, obj2);
            this.a.l();
            return ajxw.a;
        }
    }

    /* renamed from: yek$e */
    static final class e extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ yep b;

        e(yek yek, yep yep) {
            this.a = yek;
            this.b = yep;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            this.a.b().a().a(this.a.d, this.a.e, this.a.a);
            yfo b = this.a.b().b();
            long j = this.a.a;
            Object obj2 = this.b.a;
            akcr.a(obj2, "entry.key");
            b.b(j, obj2);
            this.a.l();
            return ajxw.a;
        }
    }

    /* renamed from: yek$h */
    static final class h extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ yep b;

        h(yek yek, yep yep) {
            this.a = yek;
            this.b = yep;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            this.a.b().a().a(this.a.d, this.a.e, this.a.a);
            yfo b = this.a.b().b();
            long j = this.a.a;
            Object obj2 = this.b.a;
            akcr.a(obj2, "entry.key");
            b.c(j, obj2);
            this.a.l();
            return ajxw.a;
        }
    }

    /* renamed from: yek$m */
    static final class m extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;

        m(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            yfp a = this.a.b().a();
            Object obj2 = this.a.b;
            akcr.a(obj2, "path");
            a.c(obj2);
            this.a.b().b().b(this.a.a);
            return ajxw.a;
        }
    }

    /* renamed from: yek$o */
    static final class o extends akcs implements akbl<a, Map<String, ? extends yep>> {
        final /* synthetic */ yek a;

        /* renamed from: yek$o$1 */
        static final class 1 extends akcs implements akbw<Long, Long, ainb<? extends yfq>> {
            private /* synthetic */ o a;

            1(o oVar) {
                this.a = oVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                return this.a.a.b().b().a(this.a.a.a, ((Number) obj).longValue(), ((Number) obj2).longValue());
            }
        }

        o(yek yek) {
            this.a = yek;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "it");
            Map linkedHashMap = new LinkedHashMap();
            for (yep yep : akff.a((Iterator) new a(this.a, "getAllEntries", new 1(this)))) {
                ajxm ajxm = new ajxm(yep.a, yep);
                linkedHashMap.put(ajxm.a, ajxm.b);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: yek$u */
    static final class u extends akcs implements akbl<a, ajxw> {
        private /* synthetic */ yek a;
        private /* synthetic */ Map b;

        u(yek yek, Map map) {
            this.a = yek;
            this.b = map;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((a) obj, "tx");
            this.a.b().b().b(this.a.a);
            for (yep yep : this.b.values()) {
                if (yep.f != null) {
                    this.a.b(yep);
                } else if (yep.c != null) {
                    this.a.a(yep, 0);
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yek.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/SqlDelightDbClient;"), new akdc(akde.a(yek.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(yek.class), "queryWrapper", "getQueryWrapper()Lcom/snap/storage/cache/StorageDatabase;")};
    }

    private yek(File file, yem yem, zgb zgb, SqlDelightDbManager sqlDelightDbManager, ihh ihh) {
        akcr.b(file, "directory");
        akcr.b(yem, "sharedContext");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(sqlDelightDbManager, "dbManager");
        akcr.b(ihh, "clock");
        this.o = yem;
        this.p = zgb;
        this.f = sqlDelightDbManager;
        this.g = ihh;
        this.q = 2000;
        this.a = -1;
        this.h = file.getName();
        this.b = file.getCanonicalPath();
        this.i = ajxh.a(ajxj.PUBLICATION, new l(this));
        this.j = ajxh.a(ajxj.PUBLICATION, new v(this));
        this.k = ajxh.a(ajxj.PUBLICATION, new t(this));
        this.l = new HashMap();
        this.c = new LinkedList();
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Unit>()");
        this.m = ajwo;
        ajwo = ajfq.INSTANCE;
        akcr.a(ajwo, "Disposables.disposed()");
        this.n = ajwo;
    }

    public /* synthetic */ yek(File file, yem yem, zgb zgb, SqlDelightDbManager sqlDelightDbManager, ihh ihh, byte b) {
        this(file, yem, zgb, sqlDelightDbManager, ihh);
    }

    /* JADX WARNING: Missing block: B:9:0x0051, code skipped:
            if (r1 == null) goto L_0x0053;
     */
    private static defpackage.yep b(defpackage.yfq r6) {
        /*
        r0 = new yep;
        r1 = r6.a();
        r2 = r6.c();
        r0.<init>(r1, r2);
        r1 = r6.i();
        r2 = 0;
        if (r1 == 0) goto L_0x001a;
    L_0x0015:
        r4 = r1.longValue();
        goto L_0x001b;
    L_0x001a:
        r4 = r2;
    L_0x001b:
        r0.d = r4;
        r1 = r6.d();
        r4 = defpackage.yel.a;
        r1 = r1.ordinal();
        r1 = r4[r1];
        r4 = 1;
        if (r1 == r4) goto L_0x002d;
    L_0x002c:
        goto L_0x0064;
    L_0x002d:
        r1 = 0;
        r0.f = r1;
        r4 = r6.b();
        r0.g = r4;
        r4 = r6.g();
        r1 = (int) r4;
        r0.e = r1;
        r4 = r6.f();
        r0.i = r4;
        r4 = r6.e();
        r0.h = r4;
        r1 = r6.h();
        if (r1 == 0) goto L_0x0053;
    L_0x004f:
        r1 = r1.a;
        if (r1 != 0) goto L_0x0062;
    L_0x0053:
        r6 = r6.c();
        r1 = new long[r6];
        r6 = 0;
        r4 = r1.length;
    L_0x005b:
        if (r6 >= r4) goto L_0x0062;
    L_0x005d:
        r1[r6] = r2;
        r6 = r6 + 1;
        goto L_0x005b;
    L_0x0062:
        r0.c = r1;
    L_0x0064:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yek.b(yfq):yep");
    }

    private final zfw o() {
        return (zfw) this.j.b();
    }

    private final void p() {
        synchronized (this.o) {
            a().runInTransactionImmediately("DbJournal:createOrOpenJournal", new i(this));
        }
        Object a = this.m.b(2000, TimeUnit.MILLISECONDS, (ajdw) o().b()).b((ajdw) o().f()).a((ajdw) o().f()).a((ajfb) new j(this), (ajfb) k.a);
        akcr.a(a, "debouncedKick\n          …ueue\")\n                })");
        this.n = a;
    }

    private final void q() {
        if ((this.a >= 0 ? 1 : null) == null) {
            throw new IllegalStateException("Journal is not opened".toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final SqlDelightDbClient a() {
        return (SqlDelightDbClient) this.i.b();
    }

    public final yep a(String str) {
        akcr.b(str, "key");
        q();
        yep yep = (yep) this.l.get(str);
        if (yep != null) {
            return yep;
        }
        yfq yfq = (yfq) a().queryFirst("DbJournal", b().b().a(this.a, str));
        return yfq != null ? yek.b(yfq) : null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0042 in {9, 11, 15, 18, 20} preds:[]
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
    public final void a(java.lang.String r11, long r12, long r14) {
        /*
        r10 = this;
        r0 = "key";
        defpackage.akcr.b(r11, r0);
        r0 = r10.o;	 Catch:{ all -> 0x0040 }
        monitor-enter(r0);	 Catch:{ all -> 0x0040 }
        r10.q();	 Catch:{ all -> 0x003d }
        r1 = r10.g;	 Catch:{ all -> 0x003d }
        r6 = r1.a();	 Catch:{ all -> 0x003d }
        r8 = r6 + r14;	 Catch:{ all -> 0x003d }
        r1 = 0;	 Catch:{ all -> 0x003d }
        r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1));	 Catch:{ all -> 0x003d }
        if (r3 < 0) goto L_0x002c;	 Catch:{ all -> 0x003d }
        r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));	 Catch:{ all -> 0x003d }
        if (r14 <= 0) goto L_0x002c;	 Catch:{ all -> 0x003d }
        r12 = r10.c;	 Catch:{ all -> 0x003d }
        r13 = new yez;	 Catch:{ all -> 0x003d }
        r4 = r10.a;	 Catch:{ all -> 0x003d }
        r2 = r13;	 Catch:{ all -> 0x003d }
        r3 = r11;	 Catch:{ all -> 0x003d }
        r2.<init>(r3, r4, r6, r8);	 Catch:{ all -> 0x003d }
        r12.add(r13);	 Catch:{ all -> 0x003d }
        goto L_0x0038;	 Catch:{ all -> 0x003d }
        r12 = r10.c;	 Catch:{ all -> 0x003d }
        r13 = new yez;	 Catch:{ all -> 0x003d }
        r4 = r10.a;	 Catch:{ all -> 0x003d }
        r2 = r13;	 Catch:{ all -> 0x003d }
        r3 = r11;	 Catch:{ all -> 0x003d }
        r2.<init>(r3, r4, r6);	 Catch:{ all -> 0x003d }
        goto L_0x0028;	 Catch:{ all -> 0x003d }
        r10.l();	 Catch:{ all -> 0x003d }
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return;	 Catch:{ all -> 0x0040 }
        r11 = move-exception;	 Catch:{ all -> 0x0040 }
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        throw r11;	 Catch:{ all -> 0x0040 }
        r11 = move-exception;
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yek.a(java.lang.String, long, long):void");
    }

    public final void a(Map<String, ? extends yep> map) {
        synchronized (this.o) {
            if (map != null) {
                a().runInTransactionImmediately("DbJournal:rebuildJournal", new u(this, map));
            }
        }
    }

    public final void a(yep yep) {
        akcr.b(yep, "entry");
        synchronized (this.o) {
            q();
            this.d -= yep.a();
            a().runInTransactionImmediately("DbJournal:addRemove", new f(this, yep));
        }
    }

    public final void a(yep yep, long j) {
        akcr.b(yep, "entry");
        synchronized (this.o) {
            q();
            this.d = (this.d - j) + yep.a();
            if (yep.e > 0) {
                this.e = (this.e - j) + yep.a();
            }
            this.l.remove(yep.a);
            a().runInTransactionImmediately("DbJournal:addEndEdit", new d(this, j, yep));
        }
    }

    public final boolean a(boolean z, boolean z2) {
        yfo b = b().b();
        String str = this.b;
        akcr.a((Object) str, "path");
        Long l = (Long) a().queryFirst("DbJournal:open", b.a(str));
        if ((l != null ? l.longValue() : 0) == 0) {
            if (z2) {
                p();
            }
            return false;
        }
        p();
        if (z) {
            synchronized (this.o) {
                a().runInTransactionImmediately("DbJournal:unlocklocked", new s(this, z2, z));
            }
        }
        return true;
    }

    /* Access modifiers changed, original: final */
    public final yfa b() {
        return (yfa) this.k.b();
    }

    public final void b(yep yep) {
        akcr.b(yep, "entry");
        synchronized (this.o) {
            q();
            Map map = this.l;
            Object obj = yep.a;
            akcr.a(obj, "entry.key");
            map.put(obj, yep);
            a().runInTransactionImmediately("DbJournal:addStartEdit", new g(this, yep));
        }
    }

    public final long c() {
        return this.d;
    }

    public final void c(yep yep) {
        akcr.b(yep, "entry");
        synchronized (this.o) {
            q();
            if (yep.e == 0) {
                this.e += yep.a();
            }
            yep.e++;
            a().runInTransactionImmediately("DbJournal:addLock", new e(this, yep));
        }
    }

    public final long d() {
        return this.e;
    }

    public final void d(yep yep) {
        akcr.b(yep, "entry");
        synchronized (this.o) {
            q();
            if (yep.e == 1) {
                this.e -= yep.a();
            }
            yep.e--;
            a().runInTransactionImmediately("DbJournal:addUnlock", new h(this, yep));
        }
    }

    public final List<yep> e() {
        Object values = this.l.values();
        akcr.a(values, "openedEntries.values");
        return ajyu.k((Iterable) values);
    }

    public final Map<String, yep> f() {
        Map<String, yep> map;
        q();
        synchronized (this.o) {
            map = (Map) a().callInTransactionImmediately("DbJournal:transaction:getAllEntries", new o(this));
            if (map == null) {
                map = ajyx.a;
            }
        }
        return map;
    }

    public final Set<String> g() {
        Set<String> set;
        q();
        synchronized (this.o) {
            set = (Set) a().callInTransactionImmediately("DbJournal:transaction:getAllKeys", new p(this));
            if (set == null) {
                set = ajyy.a;
            }
        }
        return set;
    }

    public final Iterator<yep> h() {
        Iterator<yep> it;
        q();
        synchronized (this.o) {
            a aVar = (a) a().callInTransactionImmediately("DbJournal:transaction:fetchOld", new q(this));
            it = aVar != null ? aVar : ajyw.a.iterator();
        }
        return it;
    }

    public final List<yep> i() {
        List<yep> list;
        q();
        synchronized (this.o) {
            list = (List) a().callInTransactionImmediately("DbJournal:transaction:getInvalid", new r(this));
            if (list == null) {
                list = ajyw.a;
            }
        }
        return list;
    }

    public final void j() {
        this.n.dispose();
        k();
        this.a = -1;
    }

    public final void k() {
        synchronized (this.o) {
            if (this.c.size() > 0) {
                a().runInTransactionImmediately("DbJournal:flush", new n(this));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void l() {
        synchronized (this.o) {
            if (this.c.size() > MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
                k();
            } else if (this.c.size() > 0) {
                this.m.a(ajxw.a);
            }
        }
    }

    public final boolean m() {
        return false;
    }

    public final void n() {
        synchronized (this.o) {
            a().runInTransactionImmediately("DbJournal:delete", new m(this));
        }
    }
}
