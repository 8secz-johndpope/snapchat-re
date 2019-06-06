package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: tzt */
public final class tzt implements tpv {
    private final ajxe a;
    private final ajxe b;
    private List<String> c;

    /* renamed from: tzt$b */
    static final class b extends akcs implements akbk<Map<String, ? extends tza>> {
        private /* synthetic */ aipn a;

        b(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Map) this.a.get();
        }
    }

    /* renamed from: tzt$a */
    static final class a extends akcs implements akbk<Set<? extends tvr>> {
        private /* synthetic */ aipn a;

        a(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Set) this.a.get();
        }
    }

    /* renamed from: tzt$c */
    static final class c extends akcs implements akbl<Object, ajxw> {
        private /* synthetic */ Class a;
        private /* synthetic */ akbl b;

        c(Class cls, akbl akbl) {
            this.a = cls;
            this.b = akbl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b(obj, "injectedInstance");
            if (this.a.isInstance(obj)) {
                obj = this.a.cast(obj);
                if (obj != null) {
                    this.b.invoke(obj);
                }
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tzt.class), "injectors", "getInjectors()Ljava/util/Map;"), new akdc(akde.a(tzt.class), "alwaysInjectedEditsProviders", "getAlwaysInjectedEditsProviders()Ljava/util/Set;")};
    }

    public tzt(aipn<Map<String, tza>> aipn, aipn<Set<tvr>> aipn2, List<String> list) {
        akcr.b(aipn, "allToolInjectors");
        akcr.b(aipn2, "alwaysInjectedEditsProvidersLazy");
        akcr.b(list, "editsLayerOrder");
        this.c = list;
        this.a = ajxh.a(new b(aipn));
        this.b = ajxh.a(new a(aipn2));
    }

    private final Set<tvr> c() {
        return (Set) this.b.b();
    }

    public final <T> T a(Class<T> cls, String str) {
        akcr.b(cls, "clazz");
        akcr.b(str, "toolId");
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : a().entrySet()) {
            Object obj = (akcr.a((String) entry.getKey(), (Object) str) && ((tza) entry.getValue()).a() && cls.isInstance(((tza) entry.getValue()).b())) ? 1 : null;
            if (obj != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterable<tza> values = linkedHashMap.values();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) values, 10));
        for (tza b : values) {
            arrayList.add(cls.cast(b.b()));
        }
        return ajyu.g((List) arrayList);
    }

    public final Map<String, tza> a() {
        return (Map) this.a.b();
    }

    public final <T> Set<T> a(Class<T> cls) {
        akcr.b(cls, "clazz");
        Collection arrayList = new ArrayList();
        for (Object next : a().values()) {
            tza tza = (tza) next;
            Object obj = (tza.a() && cls.isAssignableFrom(tza.b().getClass())) ? 1 : null;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        Iterable<tza> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (tza b : iterable) {
            arrayList2.add(cls.cast(b.b()));
        }
        Set m = ajyu.m((List) arrayList2);
        Object c = c();
        akcr.a(c, "alwaysInjectedEditsProviders");
        return ajzu.b(m, (Iterable) ajyt.a((Iterable) c, cls));
    }

    public final <T> void a(Class<T> cls, akbl<? super T, ajxw> akbl) {
        akcr.b(cls, "clazz");
        akcr.b(akbl, "listener");
        Collection arrayList = new ArrayList();
        for (Object next : a().values()) {
            tza tza = (tza) next;
            akcr.b(cls, "type");
            if (cls.isAssignableFrom(tza.e)) {
                arrayList.add(next);
            }
        }
        for (tza tza2 : (List) arrayList) {
            akbl cVar = new c(cls, akbl);
            akcr.b(cVar, "listener");
            synchronized (tza2.c) {
                if (tza2.a()) {
                    Object b = tza2.a.b();
                    akcr.a(b, "toolInitializer.value");
                    cVar.invoke(b);
                } else {
                    Boolean.valueOf(tza2.d.add(cVar));
                }
            }
        }
        Object c = c();
        akcr.a(c, "alwaysInjectedEditsProviders");
        for (Object c2 : ajyt.a((Iterable) c2, cls)) {
            akbl.invoke(c2);
        }
    }

    public final List<tyw> b() {
        Object b;
        Collection arrayList = new ArrayList();
        for (Object b2 : this.c) {
            tza tza = (tza) a().get((String) b2);
            Object obj = 1;
            if (tza == null || !tza.a()) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(b2);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (String str : (List) arrayList) {
            tza tza2 = (tza) a().get(str);
            b2 = tza2 != null ? tza2.b() : null;
            if (b2 != null) {
                arrayList2.add(b2);
            }
        }
        return akfh.d(ajyu.v((List) arrayList2));
    }
}
