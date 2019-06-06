package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import com.snap.experiment.ExperimentHttpInterface;
import defpackage.hwv.b;
import defpackage.hwv.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* renamed from: hwy */
public final class hwy {
    private static final String q = q;
    public final zfw a = zgb.a(hxd.a, q);
    final DbClient b;
    public final Map<String, Map<String, Object>> c;
    public final Map<String, Map<String, String>> d;
    final hxb e;
    final hwv f;
    final aipn<whj> g;
    final aipn<ExperimentHttpInterface> h;
    private final Set<String> i;
    private final Set<String> j;
    private final ConcurrentMap<fth, Object> k;
    private final tnd l;
    private final tne m;
    private final ftl n;
    private final SnapDb o;
    private final hxf p;

    /* renamed from: hwy$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Map<String, String> a(Map<String, ? extends Map<String, String>> map) {
            akcr.b(map, "experimentInfo");
            Collection arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object obj = ((Map) entry.getValue()).get("experimentId");
                if (obj == null) {
                    akcr.a();
                }
                arrayList.add(ajxs.a(key, obj));
            }
            return ajzm.a((Iterable) (List) arrayList);
        }
    }

    /* renamed from: hwy$b */
    public static final class b<V> implements Callable<T> {
        private /* synthetic */ hwy a;
        private /* synthetic */ String b;

        public b(hwy hwy, String str) {
            this.a = hwy;
            this.b = str;
        }

        public final /* synthetic */ Object call() {
            String l = Long.toString(System.currentTimeMillis());
            ahcl ahcl = new ahcl();
            ahcl.c = this.b;
            ahcl.a = l;
            ahcl.b = ((whj) this.a.g.get()).a(l);
            ahcl.d = Boolean.TRUE;
            return ahcl;
        }
    }

    /* renamed from: hwy$c */
    public static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hwy a;

        public c(hwy hwy) {
            this.a = hwy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ahcl ahcl = (ahcl) obj;
            akcr.b(ahcl, "request");
            return ((ExperimentHttpInterface) this.a.h.get()).getRegistrationExperiments(ahcl);
        }
    }

    /* renamed from: hwy$d */
    public static final class d<T, R> implements ajfc<ahcn, ajdb> {
        final /* synthetic */ hwy a;

        public d(hwy hwy) {
            this.a = hwy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            final ahcn ahcn = (ahcn) obj;
            akcr.b(ahcn, EventType.RESPONSE);
            String str = "Completable.complete()";
            if (ahcn.b == null) {
                a = ajvo.a(ajhn.a);
                akcr.a((Object) a, str);
            } else {
                a = this.a.b.runInTransaction("ExperimentClient:syncExperiments", new akbl<DbTransaction, ajxw>(this) {
                    private /* synthetic */ d a;

                    public final /* synthetic */ Object invoke(Object obj) {
                        DbTransaction dbTransaction = (DbTransaction) obj;
                        akcr.b(dbTransaction, "it");
                        hwy hwy = this.a.a;
                        Map map = ahcn.b;
                        akcr.a((Object) map, "response.studySettingsV2");
                        hwy.a(map, dbTransaction);
                        return ajxw.a;
                    }
                });
            }
            hwy hwy = this.a;
            Collection collection = ahcn.c;
            Object obj2 = (collection == null || collection.isEmpty()) ? 1 : null;
            if (obj2 != null) {
                obj = ajvo.a(ajhn.a);
            } else {
                hwv hwv = hwy.f;
                akcr.b(collection, "studies");
                obj = hwv.a.f(new b(collection)).c((ajfb) new c(collection)).e();
                str = "sharedPreferences\n      …         .ignoreElement()";
            }
            akcr.a(obj, str);
            return a.b((ajdb) obj);
        }
    }

    static {
        a aVar = new a();
    }

    public hwy(zgb zgb, tnd tnd, tne tne, ftl ftl, hxb hxb, hwv hwv, SnapDb snapDb, aipn<whj> aipn, aipn<ExperimentHttpInterface> aipn2, hxf hxf) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tnd, "prefReader");
        akcr.b(tne, "prefWriter");
        akcr.b(ftl, "configProvider");
        akcr.b(hxb, "experimentMap");
        akcr.b(hwv, "blacklistedClientStudiesStore");
        akcr.b(snapDb, "snapDb");
        akcr.b(aipn, "requestAuthorization");
        akcr.b(aipn2, "experimentHttpInterface");
        akcr.b(hxf, "experimentLogger");
        this.l = tnd;
        this.m = tne;
        this.n = ftl;
        this.e = hxb;
        this.f = hwv;
        this.o = snapDb;
        this.g = aipn;
        this.h = aipn2;
        this.p = hxf;
        Object dbClient = this.o.getDbClient(hxd.a.callsite(q));
        akcr.a(dbClient, "snapDb.getDbClient(Exper…entFeature.callsite(TAG))");
        this.b = dbClient;
        dbClient = Sets.newConcurrentHashSet();
        String str = "Sets.newConcurrentHashSet()";
        akcr.a(dbClient, str);
        this.i = dbClient;
        dbClient = Sets.newConcurrentHashSet();
        akcr.a(dbClient, str);
        this.j = dbClient;
        dbClient = Maps.newConcurrentMap();
        str = "Maps.newConcurrentMap()";
        akcr.a(dbClient, str);
        this.k = dbClient;
        dbClient = Maps.newConcurrentMap();
        akcr.a(dbClient, str);
        this.c = (Map) dbClient;
        dbClient = Maps.newHashMap();
        akcr.a(dbClient, "Maps.newHashMap()");
        this.d = (Map) dbClient;
    }

    private static Comparable<?> a(fth fth, String str, boolean z) {
        akcr.b(fth, "key");
        if (str == null) {
            return null;
        }
        try {
            Object a = fth.a();
            akcr.a(a, "key.delegate");
            switch (hwz.a[a.a().ordinal()]) {
                case 1:
                    return Boolean.valueOf(str);
                case 2:
                    return Integer.valueOf(str);
                case 3:
                    return Long.valueOf(str);
                case 4:
                    return Float.valueOf(str);
                case 5:
                    return Double.valueOf(str);
                case 6:
                    return str;
                default:
                    throw new ajxk();
            }
        } catch (IllegalArgumentException unused) {
            if (ieg.b() && z) {
                ieg.a("Failed to parse experiment value from server, see logs", true, 0);
            }
            return null;
        }
    }

    private void a(fth fth) {
        akcr.b(fth, "key");
        hxh a = this.e.a(fth);
        if (a != null && a.c) {
            a(a);
        }
    }

    private final hxh b(fth fth) {
        Object a = this.e.a(fth);
        if (a == null) {
            return null;
        }
        akcr.a(a, "experimentMap.getExperim…rationKey) ?: return null");
        if (!this.j.contains(a.a)) {
            List list;
            Object newHashMap = Maps.newHashMap();
            Object a2 = this.e.a(fth);
            if (a2 == null) {
                list = ajyw.a;
            } else {
                akcr.a(a2, "experimentMap.getExperim…onKey) ?: return listOf()");
                if (fth instanceof hwx) {
                    list = ajym.b((Object[]) new fth[]{fth, new hxe(a2.a)});
                } else {
                    list = this.e.b(a2.a);
                    akcr.a((Object) list, "experimentMap.getAllConf…sOfStudy(expConfig.study)");
                }
            }
            Collection collection = list;
            if (collection != null) {
                Object[] toArray = collection.toArray(new fth[0]);
                if (toArray != null) {
                    String str;
                    fth[] fthArr = (fth[]) toArray;
                    tnd tnd = this.l;
                    tno tno = tno.EXPERIMENT;
                    akcr.b(fthArr, "keys");
                    akcr.b(tno, "type");
                    Object a3 = tnd.a.a(fthArr, tno);
                    akcr.a(a3, "prefs.getKeysRaw(keys, type)");
                    Iterator it = a3.entrySet().iterator();
                    while (true) {
                        str = "studyValues";
                        if (!it.hasNext()) {
                            break;
                        }
                        Entry entry = (Entry) it.next();
                        Object value = entry.getValue();
                        if (value != null) {
                            this.k.putIfAbsent(entry.getKey(), value);
                        } else {
                            value = ((fth) entry.getKey()).a();
                            akcr.a(value, "entry.key.delegate");
                            value = value.b();
                        }
                        akcr.a(newHashMap, str);
                        Map map = (Map) newHashMap;
                        String name = ((fth) entry.getKey()).name();
                        if (value == null) {
                            akcr.a();
                        }
                        map.put(name, value);
                    }
                    Set set = this.j;
                    a2 = a.a;
                    String str2 = "expConfig.study";
                    akcr.a(a2, str2);
                    set.add(a2);
                    if (abss.a().d()) {
                        Map map2 = this.c;
                        a2 = a.a;
                        akcr.a(a2, str2);
                        akcr.a(newHashMap, str);
                        map2.put(a2, newHashMap);
                    }
                } else {
                    throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
        }
        return a;
    }

    public final Boolean a(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.a() == fti.BOOLEAN);
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return (Boolean) this.k.get(fth);
    }

    /* Access modifiers changed, original: final */
    public final void a(hxh hxh) {
        Object obj = hxh.a;
        if (this.j.contains(obj)) {
            String str = (String) this.k.get(new hxe(obj));
            if (akly.b(str)) {
                Set set = this.i;
                akcr.a(obj, "studyName");
                if (set.add(obj)) {
                    hxf hxf = this.p;
                    if (str == null) {
                        akcr.a();
                    }
                    hxf.a(obj, str);
                }
            }
        }
    }

    public final void a(Map<String, ? extends Map<String, String>> map, DbTransaction dbTransaction) {
        String str;
        akcr.b(map, "expUpdate");
        akcr.b(dbTransaction, "tx");
        Object d = this.m.a.d();
        akcr.a(d, "prefs.editExperiments()");
        boolean a = ieg.b() ? this.n.a((fth) fxs.SHOW_EXPERIMENT_PARSE_FAIL_TAOSTS) : false;
        HashSet newHashSet = Sets.newHashSet((Iterable) this.e.a());
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = "experimentMap.getConfigu…Affected(study, variable)";
            if (!it.hasNext()) {
                break;
            }
            Iterator it2;
            Entry entry = (Entry) it.next();
            String str2 = (String) entry.getKey();
            Map map2 = (Map) entry.getValue();
            newHashSet.remove(str2);
            Set newHashSet2 = ieg.b() ? Sets.newHashSet((Iterable) this.e.a(str2)) : null;
            for (Entry entry2 : map2.entrySet()) {
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                if (newHashSet2 != null) {
                    newHashSet2.remove(str3);
                }
                Object a2 = this.e.a(str2, str3);
                akcr.a(a2, str);
                if (!a2.isEmpty()) {
                    Object obj = a2.get(0);
                    akcr.a(obj, "configKeys[0]");
                    Object a3 = hwy.a((fth) obj, str4, a);
                    for (fth a4 : (Iterable) a2) {
                        d.a(a4, a3);
                    }
                }
            }
            if (!(newHashSet2 == null || newHashSet2.isEmpty())) {
                it2 = newHashSet2.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        }
        Iterator it3 = newHashSet.iterator();
        while (it3.hasNext()) {
            String str5 = (String) it3.next();
            Iterator it4 = Sets.newHashSet((Iterable) this.e.a(str5)).iterator();
            while (it4.hasNext()) {
                Object a5 = this.e.a(str5, (String) it4.next());
                akcr.a(a5, str);
                for (fth a6 : (Iterable) a5) {
                    d.a(a6);
                }
            }
        }
        d.a().b();
        if (abss.a().d()) {
            this.d.clear();
            this.d.putAll(map);
        }
        a.a(map);
    }

    public final Float b(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.a() == fti.FLOAT);
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return (Float) this.k.get(fth);
    }

    public final Double c(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.a() == fti.DOUBLE);
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return (Double) this.k.get(fth);
    }

    public final Integer d(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.a() == fti.INTEGER);
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return (Integer) this.k.get(fth);
    }

    public final Long e(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.a() == fti.LONG);
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return (Long) this.k.get(fth);
    }

    public final String f(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        Object a = fth.a();
        akcr.a(a, "configurationKey.delegate");
        Preconditions.checkArgument(a.a() == fti.STRING);
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return (String) this.k.get(fth);
    }

    public final Object g(fth fth, boolean z) {
        akcr.b(fth, "configurationKey");
        if (b(fth) == null) {
            return null;
        }
        a(fth);
        return this.k.get(fth);
    }
}
