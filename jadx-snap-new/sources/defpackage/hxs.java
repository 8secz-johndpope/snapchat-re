package defpackage;

import android.util.Pair;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.record.UnlockablesModel;
import com.snap.featureconfig.FeatureConfigRequestHttpInterface;
import com.snap.framework.developer.BuildConfigInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: hxs */
public final class hxs {
    private static final String h = h;
    final tnf a;
    final hxu b;
    final ajwy<FeatureConfigRequestHttpInterface> c;
    final rzx d;
    private final zfw e = zgb.a(hxq.a, h);
    private final BuildConfigInfo f;
    private final ieh g;

    /* renamed from: hxs$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "optionalFeatureConfigData");
            if (optional.orNull() == null) {
                return Optional.absent();
            }
            obj = optional.get();
            if (obj != null) {
                return Optional.fromNullable(((hxp) obj).a);
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.featureconfig.FeatureConfigData");
        }
    }

    /* renamed from: hxs$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hxs$f */
    static final class f<V> implements Callable<T> {
        private /* synthetic */ hxs a;
        private /* synthetic */ Map b;

        f(hxs hxs, Map map) {
            this.a = hxs;
            this.b = map;
        }

        public final /* synthetic */ Object call() {
            return new b(this.a, this.b);
        }
    }

    /* renamed from: hxs$w */
    static final class w<T, R> implements ajfc<b, ajdb> {
        public static final w a = new w();

        w() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return bVar.a();
        }
    }

    /* renamed from: hxs$b */
    public final class b {
        final Pair<Map<fth, hxp>, ajcx> a;
        final Pair<Map<fth, hxp>, ajcx> b;
        final Pair<Map<fth, hxp>, ajcx> c;
        private /* synthetic */ hxs d;

        public b(hxs hxs, Map<fth, ? extends Object> map) {
            akcr.b(map, "items");
            this.d = hxs;
            Map c = hxs.c(map);
            Map map2 = (Map) c.get(hxr.FEATURE_SETTING);
            Map map3 = (Map) c.get(hxr.CLIENT_PROPERTY);
            c = (Map) c.get(hxr.TOOLTIP);
            if (map2 == null) {
                akcr.a();
            }
            if (map2.isEmpty()) {
                this.a = null;
            } else {
                map2 = hxs.d(map2);
                this.a = new Pair(map2, hxs.a(map2).d());
            }
            if (map3 == null) {
                akcr.a();
            }
            if (map3.isEmpty()) {
                this.b = null;
            } else {
                map2 = hxs.d(map3);
                this.b = new Pair(map2, hxs.a(map2).d());
            }
            if (c == null) {
                akcr.a();
            }
            if (c.isEmpty()) {
                this.c = null;
                return;
            }
            c = hxs.c(hxs, c);
            this.c = new Pair(c, hxs.a(c).d());
        }

        public final ajcx a() {
            ajdb[] ajdbArr;
            hxs hxs;
            Object obj;
            Map map;
            Object obj2;
            ajcx a = ajvo.a(ajhn.a);
            akcr.a((Object) a, "Completable.complete()");
            Pair pair = this.a;
            String str = "Completable.mergeArrayDe…second)\n                )";
            if (pair != null) {
                ajdbArr = new ajdb[2];
                ajdbArr[0] = a;
                hxs = this.d;
                obj = pair.first;
                akcr.a(obj, "pendingChanges.first");
                map = (Map) obj;
                obj2 = this.a.second;
                akcr.a(obj2, "pendingChanges.second");
                ajdbArr[1] = hxs.a(map, (ajcx) obj2);
                a = ajcx.c(ajdbArr);
                akcr.a((Object) a, str);
            }
            pair = this.b;
            if (pair != null) {
                ajdbArr = new ajdb[2];
                ajdbArr[0] = a;
                hxs = this.d;
                obj = pair.first;
                akcr.a(obj, "legacyCPPendingChanges.first");
                map = (Map) obj;
                obj2 = this.b.second;
                akcr.a(obj2, "legacyCPPendingChanges.second");
                ajdbArr[1] = hxs.b(map, (ajcx) obj2);
                a = ajcx.c(ajdbArr);
                akcr.a((Object) a, str);
            }
            pair = this.c;
            if (pair == null) {
                return a;
            }
            ajdb[] ajdbArr2 = new ajdb[2];
            ajdbArr2[0] = a;
            hxs = this.d;
            obj = pair.first;
            akcr.a(obj, "tooltipsChanges.first");
            ajdbArr2[1] = hxs.a(hxs, (Map) obj, (ajcx) this.c.second);
            Object c = ajcx.c(ajdbArr2);
            akcr.a(c, str);
            return c;
        }
    }

    /* renamed from: hxs$k */
    static final class k implements ajev {
        public static final k a = new k();

        k() {
        }

        public final void run() {
        }
    }

    /* renamed from: hxs$l */
    static final class l<T> implements ajfb<Throwable> {
        public static final l a = new l();

        l() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hxs$u */
    static final class u implements ajev {
        public static final u a = new u();

        u() {
        }

        public final void run() {
        }
    }

    /* renamed from: hxs$v */
    static final class v<T> implements ajfb<Throwable> {
        public static final v a = new v();

        v() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hxs$m */
    static final class m<V> implements Callable<T> {
        private /* synthetic */ hxs a;
        private /* synthetic */ Map b;

        m(hxs hxs, Map map) {
            this.a = hxs;
            this.b = map;
        }

        public final /* synthetic */ Object call() {
            hxs hxs = this.a;
            Map map = this.b;
            akcr.b(map, UnlockablesModel.DATA);
            Collection arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                aekm aekm = new aekm();
                aekm.a = hxs.b.a((fth) entry.getKey());
                aekm.b = ((hxp) entry.getValue()).a.toString();
                aekm.c = Long.valueOf(((hxp) entry.getValue()).c);
                arrayList.add(aekm);
            }
            List k = ajyu.k((List) arrayList);
            afeg afeg = new afeg();
            afeg.b = k;
            afeg.c = ieh.a();
            return afeg;
        }
    }

    /* renamed from: hxs$n */
    static final class n<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hxs a;

        n(hxs hxs) {
            this.a = hxs;
        }

        public final /* synthetic */ Object apply(Object obj) {
            afeg afeg = (afeg) obj;
            akcr.b(afeg, "req");
            return ((FeatureConfigRequestHttpInterface) this.a.c.get()).uploadEvents(afeg);
        }
    }

    /* renamed from: hxs$o */
    static final class o<T> implements ajfb<Throwable> {
        public static final o a = new o();

        o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hxs$p */
    static final class p<T> implements ajfl<Throwable> {
        private /* synthetic */ hxs a;

        p(hxs hxs) {
            this.a = hxs;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return this.a.d.a(th);
        }
    }

    /* renamed from: hxs$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ hxs a;
        private /* synthetic */ Map b;

        g(hxs hxs, Map map) {
            this.a = hxs;
            this.b = map;
        }

        public final /* synthetic */ Object call() {
            hxs hxs = this.a;
            Map map = this.b;
            akcr.b(map, UnlockablesModel.DATA);
            Collection arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                String b = hxs.b.b((fth) entry.getKey());
                if (b == null) {
                    akcr.a();
                }
                arrayList.add(ajxs.a(b, ((hxp) entry.getValue()).a.toString()));
            }
            Map a = ajzm.a((Iterable) (List) arrayList);
            afeo afeo = new afeo();
            afeo.b = a;
            return afeo;
        }
    }

    /* renamed from: hxs$q */
    static final class q<V> implements Callable<T> {
        private /* synthetic */ hxs a;
        private /* synthetic */ Map b;

        q(hxs hxs, Map map) {
            this.a = hxs;
            this.b = map;
        }

        public final /* synthetic */ Object call() {
            hxs hxs = this.a;
            Map map = this.b;
            akcr.b(map, UnlockablesModel.DATA);
            Map linkedHashMap = new LinkedHashMap(ajzm.a(map.size()));
            for (Entry entry : map.entrySet()) {
                linkedHashMap.put(hxs.b.c((fth) entry.getKey()), entry.getValue());
            }
            List k = ajyu.k(linkedHashMap.keySet());
            afeo afeo = new afeo();
            afeo.a = k;
            return afeo;
        }
    }

    /* renamed from: hxs$d */
    static final class d implements ajev {
        public static final d a = new d();

        d() {
        }

        public final void run() {
        }
    }

    /* renamed from: hxs$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hxs$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hxs a;

        h(hxs hxs) {
            this.a = hxs;
        }

        public final /* synthetic */ Object apply(Object obj) {
            afeo afeo = (afeo) obj;
            akcr.b(afeo, "it");
            return ((FeatureConfigRequestHttpInterface) this.a.c.get()).uploadUserRequest(afeo);
        }
    }

    /* renamed from: hxs$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hxs$j */
    static final class j<T> implements ajfl<Throwable> {
        private /* synthetic */ hxs a;

        j(hxs hxs) {
            this.a = hxs;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return this.a.d.a(th);
        }
    }

    /* renamed from: hxs$r */
    static final class r<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hxs a;

        r(hxs hxs) {
            this.a = hxs;
        }

        public final /* synthetic */ Object apply(Object obj) {
            afeo afeo = (afeo) obj;
            akcr.b(afeo, "req");
            return ((FeatureConfigRequestHttpInterface) this.a.c.get()).uploadUserRequest(afeo);
        }
    }

    /* renamed from: hxs$s */
    static final class s<T> implements ajfb<Throwable> {
        public static final s a = new s();

        s() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: hxs$t */
    static final class t<T> implements ajfl<Throwable> {
        private /* synthetic */ hxs a;

        t(hxs hxs) {
            this.a = hxs;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return this.a.d.a(th);
        }
    }

    /* renamed from: hxs$x */
    static final class x<T, R> implements ajfc<b, ajdb> {
        public static final x a = new x();

        x() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            return bVar.a();
        }
    }

    static {
        a aVar = new a();
    }

    public hxs(zgb zgb, tnf tnf, hxu hxu, ajwy<FeatureConfigRequestHttpInterface> ajwy, rzx rzx, BuildConfigInfo buildConfigInfo, ieh ieh) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tnf, "prefs");
        akcr.b(hxu, "featureMap");
        akcr.b(ajwy, "featureConfigRequestInterface");
        akcr.b(rzx, "noNetworkDetector");
        akcr.b(buildConfigInfo, "buildConfigInfo");
        akcr.b(ieh, "deviceSpecificSettingUtils");
        this.a = tnf;
        this.b = hxu;
        this.c = ajwy;
        this.d = rzx;
        this.f = buildConfigInfo;
        this.g = ieh;
    }

    public static final /* synthetic */ ajcx a(hxs hxs, Map map, ajcx ajcx) {
        Object a;
        String str;
        if (map.isEmpty()) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            Object a2 = ajdx.c((Callable) new q(hxs, map)).b((ajdw) hxs.e.b()).a((ajdw) hxs.e.g()).a((ajfc) new r(hxs)).d((ajfb) s.a).e().a((ajfl) new t(hxs));
            akcr.a(a2, "Single.fromCallable { ma…sNoNetworkException(it) }");
            if (ajcx == null) {
                a = a2.b((ajdb) hxs.f(hxs.e(map)));
                str = "serverFetch.andThen(setI…sSynced(pendingChanges)))";
            } else {
                a = ajcx.c(ajcx, (ajdb) a2);
                str = "Completable.mergeArrayDe…iousDbWrite, serverFetch)";
            }
        }
        akcr.a(a, str);
        return a;
    }

    static Comparable<?> a(fti fti, String str) {
        if (str == null) {
            return null;
        }
        String valueOf;
        switch (hxt.a[fti.ordinal()]) {
            case 1:
                valueOf = Boolean.valueOf(str);
                break;
            case 2:
                valueOf = Long.valueOf(str);
                break;
            case 3:
                valueOf = Integer.valueOf(str);
                break;
            case 4:
                valueOf = Float.valueOf(str);
                break;
            case 5:
                valueOf = Double.valueOf(str);
                break;
            case 6:
                valueOf = str.toString();
                break;
            default:
                throw new ajxk();
        }
        return valueOf;
    }

    private ajcx b(fth fth) {
        akcr.b(fth, "key");
        if (this.b.e(fth) == hxr.TOOLTIP) {
            return b(fth, Boolean.TRUE);
        }
        throw new IllegalArgumentException("Tried to set tooltip read on non-tooltip key: ".concat(String.valueOf(fth)));
    }

    private final Map<fth, hxp> d(Map<fth, ? extends Object> map) {
        HashMap hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            fth fth = (fth) entry.getKey();
            Object value = entry.getValue();
            hxp a = this.a.a(fth);
            if (a == null) {
                hashMap.put(fth, new hxp(value));
            } else {
                Map map2;
                String str;
                Object a2 = fth.a();
                akcr.a(a2, "key.delegate");
                if (ftj.b(a2.c())) {
                    if ((akcr.a(a.a, value.toString()) ^ 1) != 0) {
                        map2 = hashMap;
                        value = a.a(value.toString());
                        str = "currentValue.setNewValue(value.toString())";
                    }
                } else if ((akcr.a(a.a, value) ^ 1) != 0) {
                    map2 = hashMap;
                    value = a.a(value);
                    str = "currentValue.setNewValue(value)";
                }
                akcr.a(value, str);
                map2.put(fth, value);
            }
        }
        return hashMap;
    }

    private static Map<fth, hxp> e(Map<fth, ? extends hxp> map) {
        Map linkedHashMap = new LinkedHashMap(ajzm.a(map.size()));
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((hxp) entry.getValue()).a());
        }
        return linkedHashMap;
    }

    private final ajcx f(Map<fth, ? extends hxp> map) {
        Object b = this.a.b().a((Map) map).b();
        akcr.a(b, "prefs.editFeature().setK…s).applyLaterWithResult()");
        return b;
    }

    private ajcx g(Map<fth, ? extends Object> map) {
        akcr.b(map, "updates");
        return j(map);
    }

    private Pair<ajcx, ajcx> h(Map<fth, ? extends Object> map) {
        akcr.b(map, "updates");
        b bVar = new b(this, map);
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        if (bVar.a != null) {
            a = ajcx.c((ajdb) a, (ajdb) bVar.a.second);
            akcr.a(a, "Completable.mergeArrayDe…e, pendingChanges.second)");
        }
        if (bVar.b != null) {
            a = ajcx.c((ajdb) a, (ajdb) bVar.b.second);
            akcr.a(a, "Completable.mergeArrayDe…yCPPendingChanges.second)");
        }
        if (bVar.c != null) {
            a = ajcx.c((ajdb) a, (ajdb) bVar.c.second);
            akcr.a(a, "Completable.mergeArrayDe…, tooltipsChanges.second)");
        }
        a = Pair.create(a, bVar.a());
        akcr.a(a, "Pair.create(db(), network())");
        akcr.a(a, "SyncOperation(updates).r….create(db(), network())}");
        return a;
    }

    private final ajdx<b> i(Map<fth, ? extends Object> map) {
        Object c = ajdx.c((Callable) new f(this, map));
        akcr.a(c, "Single.fromCallable { SyncOperation(updates) }");
        return c;
    }

    private ajcx j(Map<fth, ? extends Object> map) {
        akcr.b(map, "updates");
        Object e = i(map).e((ajfc) w.a);
        akcr.a(e, "sync(updates).flatMapCompletable { it.network() }");
        return e;
    }

    /* Access modifiers changed, original: final */
    public final ajcx a(Map<fth, ? extends hxp> map) {
        Object a = this.a.b().a((Map) map).a();
        akcr.a(a, "prefs.editFeature().setK…hanges).applyWithResult()");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final ajcx a(Map<fth, ? extends hxp> map, ajcx ajcx) {
        if (map.isEmpty()) {
            return ajcx;
        }
        akcr.a(ajdx.c((Callable) new m(this, map)).b((ajdw) this.e.b()).a((ajdw) this.e.g()).a((ajfc) new n(this)).d((ajfb) o.a).e().a((ajfl) new p(this)), "Single.fromCallable { ma…sNoNetworkException(it) }");
        Object b = ajcx.c(ajcx, (ajdb) r0).b((ajdb) f(hxs.e(map)));
        akcr.a(b, "Completable.mergeArrayDe…sSynced(pendingChanges)))");
        return b;
    }

    public final ajcx a(Map<fth, ? extends Object> map, zfw zfw) {
        akcr.b(map, "updates");
        akcr.b(zfw, "schedulers");
        Object b = i(map).e((ajfc) x.a).b((ajdw) zfw.g());
        akcr.a(b, "sync(updates).flatMapCom…eOn(schedulers.network())");
        return b;
    }

    public final void a(fth fth) {
        akcr.b(fth, "key");
        b(fth).b((ajdw) this.e.h()).a((ajev) d.a, (ajfb) e.a);
    }

    public final void a(fth fth, Object obj) {
        akcr.b(fth, "key");
        akcr.b(obj, "value");
        Object of = ImmutableMap.of(fth, obj);
        akcr.a(of, "ImmutableMap.of(key, value)");
        b((Map) of);
    }

    public final void a(List<String> list, DbTransaction dbTransaction) {
        String str = "seenTooltips";
        akcr.b(list, str);
        String str2 = "tx";
        akcr.b(dbTransaction, str2);
        akcr.b(list, str);
        akcr.b(dbTransaction, str2);
        dbTransaction.checkInTransaction();
        Object newHashMap = Maps.newHashMap();
        Iterator it = list.iterator();
        while (true) {
            str2 = "changesToSet";
            if (it.hasNext()) {
                fth b = this.b.b((String) it.next());
                if (b != null) {
                    akcr.a(newHashMap, str2);
                    ((Map) newHashMap).put(b, new hxp(Boolean.TRUE));
                }
            } else {
                akcr.a(newHashMap, str2);
                Object b2 = a(hxs.e((Map) newHashMap)).b((ajdb) this.a.a().a((fth) fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS, Boolean.TRUE).c());
                akcr.a(b2, "setInDb(markPendingAsSyn… true).applyWithResult())");
                b2.a((ajev) u.a, (ajfb) v.a);
                return;
            }
        }
    }

    public final void a(Map<String, String> map, DbTransaction dbTransaction) {
        String str = "legacyClientProperties";
        akcr.b(map, str);
        String str2 = "tx";
        akcr.b(dbTransaction, str2);
        akcr.b(map, str);
        akcr.b(dbTransaction, str2);
        dbTransaction.checkInTransaction();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (fth fth : this.b.a()) {
            Map map2;
            Object hxp;
            tnf tnf = this.a;
            akcr.a((Object) fth, "key");
            hxp a = tnf.a(fth);
            Object a2 = fth.a();
            akcr.a(a2, "key.delegate");
            fti a3 = a2.a();
            akcr.a((Object) a3, "key.delegate.type");
            a2 = hxs.a(a3, (String) map.get(this.b.b(fth)));
            if (a != null) {
                if (a2 != null) {
                    if (akcr.a(a.a, a2)) {
                        if (a.b) {
                            map2 = hashMap;
                            hxp = new hxp(a2, false, 1);
                        }
                    } else if (!a.b) {
                        map2 = hashMap;
                        hxp = new hxp(a2, false, 1);
                    }
                }
                hashMap2.put(fth, a);
            } else if (a2 != null) {
                map2 = hashMap;
                hxp = new hxp(a2, false, 1);
            }
            map2.put(fth, hxp);
        }
        ajcx b = a((Map) hashMap).b((ajdb) this.a.a().a((fth) fxs.FEATURE_CONFIG_SYNCED_CLIENT_PROPERTIES, Boolean.TRUE).c());
        Map map3 = hashMap2;
        akcr.a((Object) b, "dbSet");
        b(map3, b).a((ajev) k.a, (ajfb) l.a);
    }

    public final ajcx b(fth fth, Object obj) {
        akcr.b(fth, "key");
        akcr.b(obj, "value");
        Object of = ImmutableMap.of(fth, obj);
        akcr.a(of, "ImmutableMap.of(key, value)");
        return g((Map) of);
    }

    /* Access modifiers changed, original: final */
    public final ajcx b(Map<fth, ? extends hxp> map, ajcx ajcx) {
        if (map.isEmpty()) {
            return ajcx;
        }
        akcr.a(ajdx.c((Callable) new g(this, map)).b((ajdw) this.e.b()).a((ajdw) this.e.g()).a((ajfc) new h(this)).d((ajfb) i.a).e().a((ajfl) new j(this)), "Single.fromCallable { ma…sNoNetworkException(it) }");
        Object b = ajcx.c(ajcx, (ajdb) r0).b((ajdb) f(hxs.e(map)));
        akcr.a(b, "Completable.mergeArrayDe…sSynced(pendingChanges)))");
        return b;
    }

    public final void b(Map<fth, ? extends Object> map) {
        akcr.b(map, "updates");
        j(map).e();
    }

    public final ajcx c(fth fth, Object obj) {
        akcr.b(fth, "key");
        akcr.b(obj, "value");
        Object of = ImmutableMap.of(fth, obj);
        akcr.a(of, "ImmutableMap.of(key, value)");
        Map map = (Map) of;
        akcr.b(map, "updates");
        ((ajcx) h(map).second).e();
        of = h(map).first;
        akcr.a(of, "updateSettingsWithAllResults(updates).first");
        return (ajcx) of;
    }

    public final Map<hxr, Map<fth, Object>> c(Map<fth, ? extends Object> map) {
        akcr.b(map, "updates");
        hxr[] values = hxr.values();
        Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(values.length), 16));
        for (Object put : values) {
            linkedHashMap.put(put, new HashMap());
        }
        for (Entry entry : map.entrySet()) {
            fth fth = (fth) entry.getKey();
            Object value = entry.getValue();
            Object e = this.b.e(fth);
            if (e != null) {
                akcr.a(e, "featureMap.getKeyType(ke…th @FeatureConfig: $key\")");
                e = linkedHashMap.get(e);
                if (e == null) {
                    akcr.a();
                }
                ((Map) e).put(fth, value);
            } else {
                throw new IllegalArgumentException("Key is not annotated with @FeatureConfig: ".concat(String.valueOf(fth)));
            }
        }
        return linkedHashMap;
    }
}
