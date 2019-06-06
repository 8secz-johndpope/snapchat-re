package defpackage;

import com.brightcove.player.event.Event;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.record.DdmlDataRecord;
import com.snap.ddml.lib.FetchModelsAndTrainDurableJob;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: gut */
public final class gut extends zgi {
    final ajxe a;
    final ajei b = new ajei();
    final ftl c;
    private final ajxe d;
    private final ajxe e;

    /* renamed from: gut$b */
    static final class b extends akcq implements akbk<hwl> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hwl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: gut$a */
    static final class a extends akcq implements akbk<gur> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gur) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: gut$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(gus.a, "DdmlLifeCycleObserver");
        }
    }

    /* renamed from: gut$d */
    static final class d implements ajev {
        private /* synthetic */ gut a;

        d(gut gut) {
            this.a = gut;
        }

        public final void run() {
            this.a.b.a();
        }
    }

    /* renamed from: gut$c */
    static final class c implements ajev {
        final /* synthetic */ gut a;

        /* renamed from: gut$c$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object call() {
                if (!this.a.a.c.a((fth) gup.ENABLE_DDML_TRAINING)) {
                    return new String[0];
                }
                DbClient a = ((gur) this.a.a.d.b()).a();
                Object obj = DdmlDataRecord.FACTORY;
                String str = "DdmlDataRecord.FACTORY";
                akcr.a(obj, str);
                obj = obj.getOldestRecordTimestamp();
                akcr.a(obj, "DdmlDataRecord.FACTORY.oldestRecordTimestamp");
                Object obj2 = DdmlDataRecord.TIMESTAMP;
                akcr.a(obj2, "DdmlDataRecord.TIMESTAMP");
                Long l = (Long) a.queryFirst(obj, obj2);
                if (l == null || System.currentTimeMillis() - l.longValue() <= TimeUnit.HOURS.toMillis((long) this.a.a.c.f(gup.DDML_DATA_RENTENTION))) {
                    return new String[0];
                }
                a = ((gur) this.a.a.d.b()).a();
                obj = DdmlDataRecord.FACTORY;
                akcr.a(obj, str);
                obj = obj.getDataIds();
                akcr.a(obj, "DdmlDataRecord.FACTORY.dataIds");
                Object obj3 = DdmlDataRecord.DATAIDS;
                akcr.a(obj3, "DdmlDataRecord.DATAIDS");
                Collection g = ajyu.g((Iterable) a.query(obj, obj3));
                if (g != null) {
                    Object[] toArray = g.toArray(new String[0]);
                    if (toArray != null) {
                        return (String[]) toArray;
                    }
                    throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                }
                throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
            }
        }

        /* renamed from: gut$c$2 */
        static final class 2<T> implements ajfl<String[]> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                String[] strArr = (String[]) obj;
                akcr.b(strArr, Event.LIST);
                return (strArr.length == 0 ? 1 : null) == null;
            }
        }

        /* renamed from: gut$c$3 */
        static final class 3<T, R> implements ajfc<String[], ajdb> {
            private /* synthetic */ c a;

            3(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                String[] strArr = (String[]) obj;
                akcr.b(strArr, "it");
                hwl hwl = (hwl) this.a.a.a.b();
                akcr.b(strArr, "dataIds");
                return hwl.a((hwg) new FetchModelsAndTrainDurableJob(new gux(strArr)));
            }
        }

        c(gut gut) {
            this.a = gut;
        }

        public final void run() {
            this.a.b.a(ajdx.c((Callable) new 1(this)).b((ajdw) ((zfw) this.a.e.b()).f()).a((ajdw) ((zfw) this.a.e.b()).b()).a((ajfl) 2.a).e(new 3(this)).e());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gut.class), "durableJobManager", "getDurableJobManager()Lcom/snap/durablejob/DurableJobManager;"), new akdc(akde.a(gut.class), "ddmlDataRepository", "getDdmlDataRepository()Lcom/snap/ddml/lib/DdmlDataRepository;"), new akdc(akde.a(gut.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public gut(ajwy<hwl> ajwy, ajwy<gur> ajwy2, zgb zgb, zgk<b> zgk, ftl ftl) {
        akcr.b(ajwy, "durableJobManagerProvider");
        akcr.b(ajwy2, "ddmlDataRepositoryProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(ftl, "compositeConfigurationProvider");
        super(zgk);
        this.c = ftl;
        this.a = ajxh.a(new b(ajwy));
        this.d = ajxh.a(new a(ajwy2));
        this.e = ajxh.a(new e(zgb));
    }

    public final ajej a() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction {…  .subscribe())\n        }");
        return a;
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new d(this));
        akcr.a(a, "Disposables.fromAction { disposable.clear() }");
        return a;
    }
}
