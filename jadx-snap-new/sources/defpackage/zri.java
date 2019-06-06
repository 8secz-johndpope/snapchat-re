package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.BriteDatabaseExtensionsKt;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel.Factory;
import com.snap.core.db.record.UnlockablesModel.UpdateExpirationTime;
import com.snap.core.db.record.UnlockablesModel.UpdateRemovedLocallyUnlockable;
import com.snap.core.db.record.UnlockablesModel.UpsertLocIndependentUnlockable;
import com.snap.core.db.record.UnlockablesModel.UpsertUnlockable;
import com.snap.core.db.record.UnlockablesRecord;
import com.snap.core.db.record.UnlockablesRecord.BasicUnlockable;
import com.snap.core.db.record.UnlockablesRecord.SimpleUnlockable;
import com.snap.core.db.record.UnlockablesRecord.UnlockableChecksum;
import com.snapchat.soju.android.Geofence;
import defpackage.zpq.d;
import defpackage.zss.a;
import defpackage.zss.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: zri */
public final class zri implements d {
    final ajxe a = ajxh.a(new ac(this));
    final SnapDb b;
    final ajdx<iha> c;
    final ilv d;
    final ihh e;
    final ftl f;
    private final ajxe g = ajxh.a(new a(this));
    private final ajxe h = ajxh.a(new ai(this));
    private final ajxe i = ajxh.a(new ah(this));
    private final ajxe j = ajxh.a(new ag(this));
    private final ajxe k = ajxh.a(new y(this));
    private final zgb l;

    /* renamed from: zri$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ zri a;

        a(zri zri) {
            this.a = zri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.getDbClient((ide) zpy.a);
        }
    }

    /* renamed from: zri$ai */
    static final class ai extends akcs implements akbk<UpsertUnlockable> {
        private /* synthetic */ zri a;

        ai(zri zri) {
            this.a = zri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpsertUnlockable(this.a.b().getWritableDatabase(), UnlockablesRecord.Companion.getFACTORY());
        }
    }

    /* renamed from: zri$ah */
    static final class ah extends akcs implements akbk<UpsertLocIndependentUnlockable> {
        private /* synthetic */ zri a;

        ah(zri zri) {
            this.a = zri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpsertLocIndependentUnlockable(this.a.b().getWritableDatabase(), UnlockablesRecord.Companion.getFACTORY());
        }
    }

    /* renamed from: zri$ag */
    static final class ag extends akcs implements akbk<UpdateRemovedLocallyUnlockable> {
        private /* synthetic */ zri a;

        ag(zri zri) {
            this.a = zri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateRemovedLocallyUnlockable(this.a.b().getWritableDatabase());
        }
    }

    /* renamed from: zri$ac */
    static final class ac extends akcs implements akbk<UpdateExpirationTime> {
        private /* synthetic */ zri a;

        ac(zri zri) {
            this.a = zri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new UpdateExpirationTime(this.a.b().getWritableDatabase());
        }
    }

    /* renamed from: zri$y */
    static final class y extends akcs implements akbk<zfw> {
        private /* synthetic */ zri a;

        y(zri zri) {
            this.a = zri;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zpy.a.callsite("UnlockablesRepository"));
        }
    }

    /* renamed from: zri$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if ((((UnlockableChecksum) next).checksum() != null ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            Iterable<UnlockableChecksum> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (UnlockableChecksum unlockableChecksum : iterable) {
                Long valueOf = Long.valueOf(unlockableChecksum.unlockableId());
                byte[] checksum = unlockableChecksum.checksum();
                if (checksum == null) {
                    akcr.a();
                }
                arrayList2.add(ajxs.a(valueOf, checksum));
            }
            return ajzm.a((Iterable) (List) arrayList2);
        }
    }

    /* renamed from: zri$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zri$h */
    static final class h<T, R> implements ajfc<Throwable, Map<Long, ? extends byte[]>> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajyx.a;
        }
    }

    /* renamed from: zri$l */
    static final class l<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ zri a;

        l(zri zri) {
            this.a = zri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            zss zss = (zss) obj;
            akcr.b(zss, "it");
            long a = this.a.e.a();
            String str = "Observable.fromCallable …ame end\")\n        }\n    }";
            String str2;
            if (zss instanceof a) {
                str2 = "UnlockablesRepository.GetByTypeIds";
                obj = ajdp.b((Callable) new p(str2)).u(new q(str2, this.a, a, ((a) zss).b));
            } else {
                ajdp b;
                str2 = "UnlockablesRepository.GetByType[";
                zri zri;
                PersistableUnlockableType a2;
                StringBuilder stringBuilder;
                t tVar;
                if (zss instanceof b) {
                    zri = this.a;
                    a2 = zss.a();
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(a2);
                    stringBuilder.append(']');
                    str2 = stringBuilder.toString();
                    b = ajdp.b((Callable) new s(str2));
                    tVar = new t(str2, zri, a2, a);
                } else {
                    zri = this.a;
                    a2 = zss.a();
                    Set a3 = ajzs.a(zss.b());
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(a2);
                    stringBuilder.append("]andUnlockMechanism[");
                    stringBuilder.append(a3);
                    stringBuilder.append(']');
                    str2 = stringBuilder.toString();
                    b = ajdp.b((Callable) new v(str2));
                    tVar = new w(str2, zri, a2, a, a3);
                }
                obj = b.u(r0);
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: zri$m */
    static final class m<T, R> implements ajfc<T, R> {
        public static final m a = new m();

        m() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Iterable<BasicUnlockable> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (BasicUnlockable basicUnlockable : iterable) {
                long unlockableId = basicUnlockable.unlockableId();
                Object type = basicUnlockable.type();
                akcr.a(type, "record.type()");
                Object unlockMechanism = basicUnlockable.unlockMechanism();
                akcr.a(unlockMechanism, "record.unlockMechanism()");
                Long expirationTime = basicUnlockable.expirationTime();
                if (expirationTime == null) {
                    expirationTime = Long.valueOf(0);
                }
                long longValue = expirationTime.longValue();
                Object data = basicUnlockable.data();
                akcr.a(data, "record.data()");
                arrayList.add(new zso(unlockableId, type, unlockMechanism, longValue, data, basicUnlockable.dataVersion(), basicUnlockable.checksum()));
            }
            return (List) arrayList;
        }
    }

    /* renamed from: zri$n */
    static final class n<T> implements ajfb<List<? extends zso>> {
        private /* synthetic */ zss a;

        n(zss zss) {
            this.a = zss;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "it");
            if ((((Collection) obj).isEmpty() ^ 1) != 0) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* renamed from: zri$o */
    static final class o<T> implements ajfb<Throwable> {
        private /* synthetic */ zss a;

        o(zss zss) {
            this.a = zss;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zri$s */
    public static final class s<V> implements Callable<T> {
        private /* synthetic */ String a;

        public s(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(zgo.a());
        }
    }

    /* renamed from: zri$t */
    public static final class t<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ String a;
        private /* synthetic */ zri b;
        private /* synthetic */ PersistableUnlockableType c;
        private /* synthetic */ long d;

        public t(String str, zri zri, PersistableUnlockableType persistableUnlockableType, long j) {
            this.a = str;
            this.b = zri;
            this.c = persistableUnlockableType;
            this.d = j;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Integer num = (Integer) obj;
            akcr.b(num, "cookie");
            DbClient b = this.b.b();
            Object selectByType = UnlockablesRecord.Companion.getFACTORY().selectByType(this.c, Long.valueOf(this.d));
            akcr.a(selectByType, "UnlockablesRecord.FACTOR…e(type, currentTimestamp)");
            return b.queryAndMapToList(selectByType, u.a).a((ajev) new ajev(this) {
                private /* synthetic */ t a;

                public final void run() {
                    Object obj = num;
                    akcr.a(obj, "cookie");
                    zgo.a(obj.intValue());
                }
            });
        }
    }

    /* renamed from: zri$e */
    static final class e extends akcs implements akbl<Cursor, UnlockableChecksum> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (UnlockableChecksum) UnlockablesRecord.Companion.getUNLOCKABLE_CHECKSUM_MAPPER().map(cursor);
        }
    }

    /* renamed from: zri$u */
    static final class u extends akcs implements akbl<Cursor, BasicUnlockable> {
        public static final u a = new u();

        u() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (BasicUnlockable) UnlockablesRecord.Companion.getBASIC_UNLOCKABLE_MAPPER().map(cursor);
        }
    }

    /* renamed from: zri$x */
    static final class x extends akcs implements akbl<Cursor, BasicUnlockable> {
        public static final x a = new x();

        x() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (BasicUnlockable) UnlockablesRecord.Companion.getBASIC_UNLOCKABLE_MAPPER().map(cursor);
        }
    }

    /* renamed from: zri$v */
    public static final class v<V> implements Callable<T> {
        private /* synthetic */ String a;

        public v(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(zgo.a());
        }
    }

    /* renamed from: zri$w */
    public static final class w<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ String a;
        private /* synthetic */ zri b;
        private /* synthetic */ PersistableUnlockableType c;
        private /* synthetic */ long d;
        private /* synthetic */ Set e;

        public w(String str, zri zri, PersistableUnlockableType persistableUnlockableType, long j, Set set) {
            this.a = str;
            this.b = zri;
            this.c = persistableUnlockableType;
            this.d = j;
            this.e = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Integer num = (Integer) obj;
            akcr.b(num, "cookie");
            DbClient b = this.b.b();
            Factory factory = UnlockablesRecord.Companion.getFACTORY();
            PersistableUnlockableType persistableUnlockableType = this.c;
            Long valueOf = Long.valueOf(this.d);
            Collection collection = this.e;
            if (collection != null) {
                Object[] toArray = collection.toArray(new UnlockMechanism[0]);
                if (toArray != null) {
                    Object selectByTypeAndUnlockMechanism = factory.selectByTypeAndUnlockMechanism(persistableUnlockableType, valueOf, (UnlockMechanism[]) toArray);
                    akcr.a(selectByTypeAndUnlockMechanism, "UnlockablesRecord.FACTOR…echanisms.toTypedArray())");
                    return b.queryAndMapToList(selectByTypeAndUnlockMechanism, x.a).a((ajev) new ajev(this) {
                        private /* synthetic */ w a;

                        public final void run() {
                            Object obj = num;
                            akcr.a(obj, "cookie");
                            zgo.a(obj.intValue());
                        }
                    });
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
        }
    }

    /* renamed from: zri$aj */
    static final class aj<T, R> implements ajfc<T, R> {
        private /* synthetic */ zri a;
        private /* synthetic */ zsk.a b;

        aj(zri zri, zsk.a aVar) {
            this.a = zri;
            this.b = aVar;
        }

        private List<zso> a(iha iha) {
            akcr.b(iha, "it");
            return this.b.a(this.a.d, iha);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((iha) obj);
        }
    }

    /* renamed from: zri$ak */
    static final class ak<T, R> implements ajfc<List<? extends zso>, ajdb> {
        final /* synthetic */ zri a;

        ak(zri zri) {
            this.a = zri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "databaseModelList");
            return this.a.b().runInTransaction("UnlockablesRepository:write:LocIndependentUnlockablesResponse.SyncAll", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ ak a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    long a = this.a.a.e.a();
                    Object obj2 = list;
                    akcr.a(obj2, "databaseModelList");
                    int i = 0;
                    for (Object obj22 : (Iterable) obj22) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ajym.a();
                        }
                        zso zso = (zso) obj22;
                        Long valueOf = Long.valueOf(this.a.a.a(zso.a, zso.b, zso.c, zso.e, zso.f, Long.valueOf(zso.d), a, i, dbTransaction));
                        if ((((Number) valueOf).longValue() >= 0 ? 1 : null) == null) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            valueOf.longValue();
                        }
                        i = i2;
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: zri$al */
    static final class al<T> implements ajfb<Throwable> {
        public static final al a = new al();

        al() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zri$aa */
    static final class aa<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ zri a;
        final /* synthetic */ zsu b;

        /* renamed from: zri$aa$1 */
        static final class 1 extends akcs implements akbl<DbTransaction, ajxw> {
            private /* synthetic */ aa a;

            1(aa aaVar) {
                this.a = aaVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                DbTransaction dbTransaction = (DbTransaction) obj;
                akcr.b(dbTransaction, "tx");
                for (aebs aebs : this.a.b.m) {
                    long a = zsp.a(Long.valueOf(aebs.c), this.a.b.b);
                    zri zri = this.a.a;
                    long j = aebs.a;
                    Object b = zri.b();
                    akcr.a(b, "db");
                    UpdateExpirationTime updateExpirationTime = (UpdateExpirationTime) zri.a.b();
                    updateExpirationTime.bind(Long.valueOf(a), j);
                    BriteDatabaseExtensionsKt.executeUpdate(b, updateExpirationTime, dbTransaction);
                }
                return ajxw.a;
            }
        }

        aa(zri zri, zsu zsu) {
            this.a = zri;
            this.b = zsu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx runInTransaction;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldProcessChecksum");
            if (bool.booleanValue()) {
                runInTransaction = this.a.b().runInTransaction("UnlockablesRepository:updateAllExpirationTimes", new 1(this));
            } else {
                runInTransaction = ajvo.a(ajhn.a);
            }
            return runInTransaction;
        }
    }

    /* renamed from: zri$ab */
    static final class ab<T> implements ajfb<Throwable> {
        public static final ab a = new ab();

        ab() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zri$i */
    public static final class i<V> implements Callable<T> {
        private /* synthetic */ String a;

        public i(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(zgo.a());
        }
    }

    /* renamed from: zri$j */
    public static final class j<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ String a;
        private /* synthetic */ zri b;

        public j(String str, zri zri) {
            this.a = str;
            this.b = zri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Integer num = (Integer) obj;
            akcr.b(num, "cookie");
            DbClient b = this.b.b();
            Object selectAllFromUnlockables = UnlockablesRecord.Companion.getFACTORY().selectAllFromUnlockables();
            akcr.a(selectAllFromUnlockables, "UnlockablesRecord.FACTOR…electAllFromUnlockables()");
            return b.queryAndMapToList(selectAllFromUnlockables, k.a).a((ajev) new ajev(this) {
                private /* synthetic */ j a;

                public final void run() {
                    Object obj = num;
                    akcr.a(obj, "cookie");
                    zgo.a(obj.intValue());
                }
            });
        }
    }

    /* renamed from: zri$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ zri a;
        private /* synthetic */ zsu b;

        b(zri zri, zsu zsu) {
            this.a = zri;
            this.b = zsu;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:85:0x01e9 in {5, 11, 12, 15, 19, 25, 26, 28, 29, 33, 39, 40, 42, 43, 47, 55, 58, 62, 69, 71, 72, 74, 75, 76, 80, 82, 84} preds:[]
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
        private java.util.Set<java.lang.Long> a(java.util.List<? extends com.snap.core.db.record.UnlockablesRecord.SimpleUnlockable> r14) {
            /*
            r13 = this;
            r0 = "dbRecords";
            defpackage.akcr.b(r14, r0);
            r0 = r14;	 Catch:{ all -> 0x01e7 }
            r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x01e7 }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x01e7 }
            r2 = 10;	 Catch:{ all -> 0x01e7 }
            r3 = defpackage.ajyn.a(r0, r2);	 Catch:{ all -> 0x01e7 }
            r1.<init>(r3);	 Catch:{ all -> 0x01e7 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x01e7 }
            r0 = r0.iterator();	 Catch:{ all -> 0x01e7 }
            r3 = r0.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r3 == 0) goto L_0x0039;	 Catch:{ all -> 0x01e7 }
            r3 = r0.next();	 Catch:{ all -> 0x01e7 }
            r3 = (com.snap.core.db.record.UnlockablesRecord.SimpleUnlockable) r3;	 Catch:{ all -> 0x01e7 }
            r4 = r3.unlockableId();	 Catch:{ all -> 0x01e7 }
            r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01e7 }
            r3 = r3.checksum();	 Catch:{ all -> 0x01e7 }
            r3 = defpackage.ajxs.a(r4, r3);	 Catch:{ all -> 0x01e7 }
            r1.add(r3);	 Catch:{ all -> 0x01e7 }
            goto L_0x0019;	 Catch:{ all -> 0x01e7 }
            r1 = (java.util.List) r1;	 Catch:{ all -> 0x01e7 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x01e7 }
            r0 = defpackage.ajzm.a(r1);	 Catch:{ all -> 0x01e7 }
            r1 = r13.b;	 Catch:{ all -> 0x01e7 }
            r1 = r1.m;	 Catch:{ all -> 0x01e7 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x01e7 }
            r1 = r1.iterator();	 Catch:{ all -> 0x01e7 }
            r3 = r1.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r3 == 0) goto L_0x008c;	 Catch:{ all -> 0x01e7 }
            r3 = r1.next();	 Catch:{ all -> 0x01e7 }
            r3 = (defpackage.aebs) r3;	 Catch:{ all -> 0x01e7 }
            r4 = r3.a;	 Catch:{ all -> 0x01e7 }
            r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01e7 }
            r4 = r0.containsKey(r4);	 Catch:{ all -> 0x01e7 }
            if (r4 != 0) goto L_0x006f;	 Catch:{ all -> 0x01e7 }
            r3 = r13.a;	 Catch:{ all -> 0x01e7 }
            r3 = r3.d;	 Catch:{ all -> 0x01e7 }
            r4 = defpackage.ipg.CHECKSUM_MISSING;	 Catch:{ all -> 0x01e7 }
            r4 = (defpackage.ily) r4;	 Catch:{ all -> 0x01e7 }
            r3.c(r4, 1);	 Catch:{ all -> 0x01e7 }
            goto L_0x004b;	 Catch:{ all -> 0x01e7 }
            r4 = r3.b;	 Catch:{ all -> 0x01e7 }
            r5 = r3.a;	 Catch:{ all -> 0x01e7 }
            r3 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x01e7 }
            r3 = r0.get(r3);	 Catch:{ all -> 0x01e7 }
            r3 = (byte[]) r3;	 Catch:{ all -> 0x01e7 }
            r3 = java.util.Arrays.equals(r4, r3);	 Catch:{ all -> 0x01e7 }
            if (r3 != 0) goto L_0x004b;	 Catch:{ all -> 0x01e7 }
            r3 = r13.a;	 Catch:{ all -> 0x01e7 }
            r3 = r3.d;	 Catch:{ all -> 0x01e7 }
            r4 = defpackage.ipg.CHECKSUM_MISMATCH;	 Catch:{ all -> 0x01e7 }
            r4 = (defpackage.ily) r4;	 Catch:{ all -> 0x01e7 }
            goto L_0x006b;	 Catch:{ all -> 0x01e7 }
            r0 = new java.util.LinkedHashSet;	 Catch:{ all -> 0x01e7 }
            r0.<init>();	 Catch:{ all -> 0x01e7 }
            r0 = (java.util.Set) r0;	 Catch:{ all -> 0x01e7 }
            r1 = r13.b;	 Catch:{ all -> 0x01e7 }
            r1 = r1.f;	 Catch:{ all -> 0x01e7 }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x01e7 }
            r3 = r1 instanceof java.util.Collection;	 Catch:{ all -> 0x01e7 }
            r4 = 1;	 Catch:{ all -> 0x01e7 }
            r5 = 0;	 Catch:{ all -> 0x01e7 }
            if (r3 == 0) goto L_0x00a8;	 Catch:{ all -> 0x01e7 }
            r3 = r1;	 Catch:{ all -> 0x01e7 }
            r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x01e7 }
            r3 = r3.isEmpty();	 Catch:{ all -> 0x01e7 }
            if (r3 != 0) goto L_0x00c7;	 Catch:{ all -> 0x01e7 }
            r1 = r1.iterator();	 Catch:{ all -> 0x01e7 }
            r3 = r1.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r3 == 0) goto L_0x00c7;	 Catch:{ all -> 0x01e7 }
            r3 = r1.next();	 Catch:{ all -> 0x01e7 }
            r3 = (defpackage.aerj) r3;	 Catch:{ all -> 0x01e7 }
            r3 = r3.a();	 Catch:{ all -> 0x01e7 }
            r6 = defpackage.aerj.a.UNLOCKABLE_LOW_SENSITIVITY;	 Catch:{ all -> 0x01e7 }
            if (r3 != r6) goto L_0x00c2;	 Catch:{ all -> 0x01e7 }
            r3 = 1;	 Catch:{ all -> 0x01e7 }
            goto L_0x00c3;	 Catch:{ all -> 0x01e7 }
            r3 = 0;	 Catch:{ all -> 0x01e7 }
            if (r3 == 0) goto L_0x00ac;	 Catch:{ all -> 0x01e7 }
            r1 = 1;	 Catch:{ all -> 0x01e7 }
            goto L_0x00c8;	 Catch:{ all -> 0x01e7 }
            r1 = 0;	 Catch:{ all -> 0x01e7 }
            r3 = r13.b;	 Catch:{ all -> 0x01e7 }
            r3 = r3.f;	 Catch:{ all -> 0x01e7 }
            r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x01e7 }
            r6 = r3 instanceof java.util.Collection;	 Catch:{ all -> 0x01e7 }
            if (r6 == 0) goto L_0x00db;	 Catch:{ all -> 0x01e7 }
            r6 = r3;	 Catch:{ all -> 0x01e7 }
            r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x01e7 }
            r6 = r6.isEmpty();	 Catch:{ all -> 0x01e7 }
            if (r6 != 0) goto L_0x00fa;	 Catch:{ all -> 0x01e7 }
            r3 = r3.iterator();	 Catch:{ all -> 0x01e7 }
            r6 = r3.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r6 == 0) goto L_0x00fa;	 Catch:{ all -> 0x01e7 }
            r6 = r3.next();	 Catch:{ all -> 0x01e7 }
            r6 = (defpackage.aerj) r6;	 Catch:{ all -> 0x01e7 }
            r6 = r6.a();	 Catch:{ all -> 0x01e7 }
            r7 = defpackage.aerj.a.UNLOCKABLE_HIGH_SENSITIVITY;	 Catch:{ all -> 0x01e7 }
            if (r6 != r7) goto L_0x00f5;	 Catch:{ all -> 0x01e7 }
            r6 = 1;	 Catch:{ all -> 0x01e7 }
            goto L_0x00f6;	 Catch:{ all -> 0x01e7 }
            r6 = 0;	 Catch:{ all -> 0x01e7 }
            if (r6 == 0) goto L_0x00df;	 Catch:{ all -> 0x01e7 }
            r3 = 1;	 Catch:{ all -> 0x01e7 }
            goto L_0x00fb;	 Catch:{ all -> 0x01e7 }
            r3 = 0;	 Catch:{ all -> 0x01e7 }
            r6 = r13.a;	 Catch:{ all -> 0x01e7 }
            r6 = r6.e;	 Catch:{ all -> 0x01e7 }
            r6 = r6.a();	 Catch:{ all -> 0x01e7 }
            r8 = r13.b;	 Catch:{ all -> 0x01e7 }
            r8 = r8.m;	 Catch:{ all -> 0x01e7 }
            r8 = (java.lang.Iterable) r8;	 Catch:{ all -> 0x01e7 }
            r9 = new java.util.ArrayList;	 Catch:{ all -> 0x01e7 }
            r10 = defpackage.ajyn.a(r8, r2);	 Catch:{ all -> 0x01e7 }
            r9.<init>(r10);	 Catch:{ all -> 0x01e7 }
            r9 = (java.util.Collection) r9;	 Catch:{ all -> 0x01e7 }
            r8 = r8.iterator();	 Catch:{ all -> 0x01e7 }
            r10 = r8.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r10 == 0) goto L_0x012e;	 Catch:{ all -> 0x01e7 }
            r10 = r8.next();	 Catch:{ all -> 0x01e7 }
            r10 = (defpackage.aebs) r10;	 Catch:{ all -> 0x01e7 }
            r10 = r10.a;	 Catch:{ all -> 0x01e7 }
            r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x01e7 }
            r9.add(r10);	 Catch:{ all -> 0x01e7 }
            goto L_0x0118;	 Catch:{ all -> 0x01e7 }
            r9 = (java.util.List) r9;	 Catch:{ all -> 0x01e7 }
            r9 = (java.lang.Iterable) r9;	 Catch:{ all -> 0x01e7 }
            r8 = defpackage.ajyu.m(r9);	 Catch:{ all -> 0x01e7 }
            r14 = (java.lang.Iterable) r14;	 Catch:{ all -> 0x01e7 }
            r14 = r14.iterator();	 Catch:{ all -> 0x01e7 }
            r9 = r14.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r9 == 0) goto L_0x01b2;	 Catch:{ all -> 0x01e7 }
            r9 = r14.next();	 Catch:{ all -> 0x01e7 }
            r9 = (com.snap.core.db.record.UnlockablesRecord.SimpleUnlockable) r9;	 Catch:{ all -> 0x01e7 }
            r10 = r9.expirationTime();	 Catch:{ all -> 0x01e7 }
            if (r10 == 0) goto L_0x01a9;	 Catch:{ all -> 0x01e7 }
            r10 = r9.expirationTime();	 Catch:{ all -> 0x01e7 }
            if (r10 != 0) goto L_0x0157;	 Catch:{ all -> 0x01e7 }
            defpackage.akcr.a();	 Catch:{ all -> 0x01e7 }
            r10 = r10.longValue();	 Catch:{ all -> 0x01e7 }
            r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));	 Catch:{ all -> 0x01e7 }
            if (r12 > 0) goto L_0x0160;	 Catch:{ all -> 0x01e7 }
            goto L_0x01a9;	 Catch:{ all -> 0x01e7 }
            r10 = r9.lowSensitivity();	 Catch:{ all -> 0x01e7 }
            if (r10 == r1) goto L_0x016c;	 Catch:{ all -> 0x01e7 }
            r10 = r9.highSensitivity();	 Catch:{ all -> 0x01e7 }
            if (r10 != r3) goto L_0x013c;	 Catch:{ all -> 0x01e7 }
            r10 = r9.unlockableId();	 Catch:{ all -> 0x01e7 }
            r10 = java.lang.Long.valueOf(r10);	 Catch:{ all -> 0x01e7 }
            r10 = r8.contains(r10);	 Catch:{ all -> 0x01e7 }
            if (r10 != 0) goto L_0x013c;	 Catch:{ all -> 0x01e7 }
            r10 = r9.unlockMechanism();	 Catch:{ all -> 0x01e7 }
            r11 = com.snap.core.db.column.UnlockMechanism.SNAP_CODE;	 Catch:{ all -> 0x01e7 }
            if (r10 == r11) goto L_0x013c;	 Catch:{ all -> 0x01e7 }
            r10 = r9.geofence();	 Catch:{ all -> 0x01e7 }
            r11 = r13.b;	 Catch:{ all -> 0x01e7 }
            r11 = r11.c;	 Catch:{ all -> 0x01e7 }
            if (r10 != 0) goto L_0x018e;	 Catch:{ all -> 0x01e7 }
            r10 = 1;	 Catch:{ all -> 0x01e7 }
            goto L_0x019b;	 Catch:{ all -> 0x01e7 }
            if (r11 == 0) goto L_0x019a;	 Catch:{ all -> 0x01e7 }
            r12 = new nbq;	 Catch:{ all -> 0x01e7 }
            r12.<init>(r10);	 Catch:{ all -> 0x01e7 }
            r10 = r12.a(r11);	 Catch:{ all -> 0x01e7 }
            goto L_0x019b;	 Catch:{ all -> 0x01e7 }
            r10 = 0;	 Catch:{ all -> 0x01e7 }
            if (r10 == 0) goto L_0x013c;	 Catch:{ all -> 0x01e7 }
            r9 = r9.unlockableId();	 Catch:{ all -> 0x01e7 }
            r9 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x01e7 }
            r0.add(r9);	 Catch:{ all -> 0x01e7 }
            goto L_0x013c;	 Catch:{ all -> 0x01e7 }
            r9 = r9.unlockableId();	 Catch:{ all -> 0x01e7 }
            r9 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x01e7 }
            goto L_0x01a5;	 Catch:{ all -> 0x01e7 }
            r14 = r13.b;	 Catch:{ all -> 0x01e7 }
            r14 = r14.e;	 Catch:{ all -> 0x01e7 }
            r14 = (java.lang.Iterable) r14;	 Catch:{ all -> 0x01e7 }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x01e7 }
            r2 = defpackage.ajyn.a(r14, r2);	 Catch:{ all -> 0x01e7 }
            r1.<init>(r2);	 Catch:{ all -> 0x01e7 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x01e7 }
            r14 = r14.iterator();	 Catch:{ all -> 0x01e7 }
            r2 = r14.hasNext();	 Catch:{ all -> 0x01e7 }
            if (r2 == 0) goto L_0x01df;	 Catch:{ all -> 0x01e7 }
            r2 = r14.next();	 Catch:{ all -> 0x01e7 }
            r2 = (java.lang.String) r2;	 Catch:{ all -> 0x01e7 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ all -> 0x01e7 }
            r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x01e7 }
            r1.add(r2);	 Catch:{ all -> 0x01e7 }
            goto L_0x01c7;	 Catch:{ all -> 0x01e7 }
            r1 = (java.util.List) r1;	 Catch:{ all -> 0x01e7 }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x01e7 }
            r0.addAll(r1);	 Catch:{ all -> 0x01e7 }
            return r0;
            r14 = move-exception;
            throw r14;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zri$b.a(java.util.List):java.util.Set");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: zri$c */
    static final class c<T, R> implements ajfc<Set<Long>, ajdb> {
        final /* synthetic */ zri a;

        c(zri zri) {
            this.a = zri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            final Set set = (Set) obj;
            akcr.b(set, "deleteIdSet");
            if (set.isEmpty()) {
                a = ajvo.a(ajhn.a);
            } else {
                a = this.a.b().runInTransaction("UnlockablesRepository:deleteInvalidData", new akbl<DbTransaction, ajxw>(this) {
                    private /* synthetic */ c a;

                    /* JADX WARNING: Missing block: B:15:?, code skipped:
            defpackage.akax.a(r3, r0);
     */
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                        /*
                        r2 = this;
                        r3 = (com.snap.core.db.api.DbTransaction) r3;
                        r0 = "it";
                        defpackage.akcr.b(r3, r0);
                        r3 = r2.a;
                        r3 = r3.a;
                        r0 = r3;
                        r1 = "deleteIdSet";
                        defpackage.akcr.a(r0, r1);
                        r1 = com.snap.core.db.record.UnlockablesRecord.Companion;	 Catch:{ all -> 0x0046 }
                        r1 = r1.getFACTORY();	 Catch:{ all -> 0x0046 }
                        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0046 }
                        r0 = defpackage.ajyu.g(r0);	 Catch:{ all -> 0x0046 }
                        r0 = r1.deleteUnlockablesByIds(r0);	 Catch:{ all -> 0x0046 }
                        r1 = "UnlockablesRecord.FACTOR…ockableIds.toLongArray())";
                        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0046 }
                        r3 = r3.b();	 Catch:{ all -> 0x0046 }
                        r3 = r3.query(r0);	 Catch:{ all -> 0x0046 }
                        r3 = (java.io.Closeable) r3;	 Catch:{ all -> 0x0046 }
                        r0 = 0;
                        r1 = r3;
                        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0040 }
                        r1.getCount();	 Catch:{ Throwable -> 0x0040 }
                        defpackage.akax.a(r3, r0);	 Catch:{ all -> 0x0046 }
                        r3 = defpackage.ajxw.a;
                        return r3;
                    L_0x003e:
                        r1 = move-exception;
                        goto L_0x0042;
                    L_0x0040:
                        r0 = move-exception;
                        throw r0;	 Catch:{ all -> 0x003e }
                    L_0x0042:
                        defpackage.akax.a(r3, r0);	 Catch:{ all -> 0x0046 }
                        throw r1;	 Catch:{ all -> 0x0046 }
                    L_0x0046:
                        r3 = move-exception;
                        throw r3;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.zri$c$1.invoke(java.lang.Object):java.lang.Object");
                    }
                });
            }
            return a;
        }
    }

    /* renamed from: zri$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zri$ad */
    static final class ad<V> implements Callable<T> {
        private /* synthetic */ zri a;
        private /* synthetic */ zsu b;

        ad(zri zri, zsu zsu) {
            this.a = zri;
            this.b = zsu;
        }

        public final /* synthetic */ Object call() {
            return zrl.a(this.b, this.a.d);
        }
    }

    /* renamed from: zri$ae */
    static final class ae<T, R> implements ajfc<List<? extends zso>, ajdb> {
        final /* synthetic */ zri a;

        ae(zri zri) {
            this.a = zri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "databaseModelList");
            return this.a.b().runInTransaction("writeUnlockablesResponse", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ ae a;

                public final /* synthetic */ Object invoke(Object obj) {
                    DbTransaction dbTransaction = (DbTransaction) obj;
                    akcr.b(dbTransaction, "tx");
                    Object obj2 = list;
                    akcr.a(obj2, "databaseModelList");
                    for (zso zso : (Iterable) obj2) {
                        Long valueOf = Long.valueOf(this.a.a.a(zso.a, zso.b, UnlockMechanism.LOCATION, zso.e, zso.f, zso.h, zso.i, zso.g, Long.valueOf(zso.d), zso.j, dbTransaction));
                        if ((((Number) valueOf).longValue() >= 0 ? 1 : null) == null) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            valueOf.longValue();
                        }
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: zri$af */
    static final class af<T> implements ajfb<Throwable> {
        public static final af a = new af();

        af() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zri$k */
    static final class k extends akcs implements akbl<Cursor, SimpleUnlockable> {
        public static final k a = new k();

        k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (SimpleUnlockable) UnlockablesRecord.Companion.getSIMPLE_UNLOCKABLE_MAPPER().map(cursor);
        }
    }

    /* renamed from: zri$p */
    public static final class p<V> implements Callable<T> {
        private /* synthetic */ String a;

        public p(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(zgo.a());
        }
    }

    /* renamed from: zri$q */
    public static final class q<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ String a;
        private /* synthetic */ zri b;
        private /* synthetic */ long c;
        private /* synthetic */ Set d;

        public q(String str, zri zri, long j, Set set) {
            this.a = str;
            this.b = zri;
            this.c = j;
            this.d = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Integer num = (Integer) obj;
            akcr.b(num, "cookie");
            DbClient b = this.b.b();
            Object selectByIds = UnlockablesRecord.Companion.getFACTORY().selectByIds(Long.valueOf(this.c), ajyu.g((Collection) this.d));
            akcr.a(selectByIds, "UnlockablesRecord.FACTOR…stamp, ids.toLongArray())");
            return b.queryAndMapToList(selectByIds, r.a).a((ajev) new ajev(this) {
                private /* synthetic */ q a;

                public final void run() {
                    Object obj = num;
                    akcr.a(obj, "cookie");
                    zgo.a(obj.intValue());
                }
            });
        }
    }

    /* renamed from: zri$z */
    static final class z<T, R> implements ajfc<zsv.a, ajdb> {
        final /* synthetic */ zri a;

        z(zri zri) {
            this.a = zri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final zsv.a aVar = (zsv.a) obj;
            akcr.b(aVar, "updateQuery");
            return this.a.b().runInTransaction("UnlockablesRepository:update", new akbl<DbTransaction, ajxw>(this) {
                private /* synthetic */ z a;

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((DbTransaction) obj, "it");
                    if (aVar instanceof zsv.a.a) {
                        this.a.a.a(Long.parseLong(aVar.a()), ((zsv.a.a) aVar).a);
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: zri$r */
    static final class r extends akcs implements akbl<Cursor, BasicUnlockable> {
        public static final r a = new r();

        r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "cursor");
            return (BasicUnlockable) UnlockablesRecord.Companion.getBASIC_UNLOCKABLE_MAPPER().map(cursor);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zri.class), "db", "getDb()Lcom/snap/core/db/api/DbClient;"), new akdc(akde.a(zri.class), "upsertUnlockable", "getUpsertUnlockable()Lcom/snap/core/db/record/UnlockablesModel$UpsertUnlockable;"), new akdc(akde.a(zri.class), "upsertLocIndependentUnlockable", "getUpsertLocIndependentUnlockable()Lcom/snap/core/db/record/UnlockablesModel$UpsertLocIndependentUnlockable;"), new akdc(akde.a(zri.class), "updateRemovedLocallyUnlockable", "getUpdateRemovedLocallyUnlockable()Lcom/snap/core/db/record/UnlockablesModel$UpdateRemovedLocallyUnlockable;"), new akdc(akde.a(zri.class), "updateExpirationTime", "getUpdateExpirationTime()Lcom/snap/core/db/record/UnlockablesModel$UpdateExpirationTime;"), new akdc(akde.a(zri.class), "schedules", "getSchedules()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public zri(SnapDb snapDb, zgb zgb, ajdx<iha> ajdx, ilv ilv, ihh ihh, ftl ftl) {
        akcr.b(snapDb, "snapDb");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajdx, "serializationHelperSingle");
        akcr.b(ilv, "graphene");
        akcr.b(ihh, "clock");
        akcr.b(ftl, "configProvider");
        this.b = snapDb;
        this.l = zgb;
        this.c = ajdx;
        this.d = ilv;
        this.e = ihh;
        this.f = ftl;
    }

    /* Access modifiers changed, original: final */
    public final int a(long j, boolean z) {
        Object b = b();
        akcr.a(b, "db");
        UpdateRemovedLocallyUnlockable updateRemovedLocallyUnlockable = (UpdateRemovedLocallyUnlockable) this.j.b();
        updateRemovedLocallyUnlockable.bind(z, j);
        return BriteDatabaseExtensionsKt.executeUpdate(b, updateRemovedLocallyUnlockable);
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, Long l, long j3, int i, DbTransaction dbTransaction) {
        Throwable th;
        try {
            DbClient b = b();
            try {
                UpsertLocIndependentUnlockable upsertLocIndependentUnlockable = (UpsertLocIndependentUnlockable) this.i.b();
                upsertLocIndependentUnlockable.bind(j, persistableUnlockableType, unlockMechanism, bArr, j2, l, j3, i, null);
                return b.executeInsert(upsertLocIndependentUnlockable, dbTransaction);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, boolean z, boolean z2, Geofence geofence, Long l, byte[] bArr2, DbTransaction dbTransaction) {
        Throwable th;
        try {
            DbClient b = b();
            try {
                UpsertUnlockable upsertUnlockable = (UpsertUnlockable) this.h.b();
                upsertUnlockable.bind(j, persistableUnlockableType, unlockMechanism, bArr, j2, z, z2, geofence, l, bArr2);
                return b.executeInsert(upsertUnlockable, dbTransaction);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final ajcx a(zsv.a aVar) {
        akcr.b(aVar, "query");
        Object e = ajdx.b((Object) aVar).e((ajfc) new z(this));
        akcr.a(e, "Single.just(query)\n     …      }\n                }");
        return e;
    }

    public final ajdp<Map<Long, byte[]>> a() {
        DbClient b = b();
        Object selectChecksum = UnlockablesRecord.Companion.getFACTORY().selectChecksum();
        akcr.a(selectChecksum, "UnlockablesRecord.FACTORY.selectChecksum()");
        Object r = b.queryAndMapToList(selectChecksum, e.a).p(f.a).c((ajfb) g.a).r(h.a);
        akcr.a(r, "db.queryAndMapToList(Unl…rrorReturn { emptyMap() }");
        return r;
    }

    public final ajdp<List<zso>> a(zss zss) {
        akcr.b(zss, "query");
        Object c = ajdx.b((Object) zss).a((ajdw) c().i()).d((ajfc) new l(this)).a((ajdw) c().b()).p(m.a).d((ajfb) new n(zss)).c((ajfb) new o(zss));
        akcr.a(c, "Single.just(query)\n     …ery.name} failed: $it\") }");
        return c;
    }

    /* Access modifiers changed, original: final */
    public final DbClient b() {
        return (DbClient) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        return (zfw) this.k.b();
    }
}
