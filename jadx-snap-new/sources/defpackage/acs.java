package defpackage;

import defpackage.jf.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acs */
public final class acs {
    private final acu a;
    private final a b;

    /* renamed from: acs$a */
    static class a {
        final Map<Class<?>, a<?>> a = new HashMap();

        /* renamed from: acs$a$a */
        static class a<Model> {
            final List<acq<Model, ?>> a;

            public a(List<acq<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public final void a() {
            this.a.clear();
        }
    }

    private acs(acu acu) {
        this.b = new a();
        this.a = acu;
    }

    public acs(a<List<Throwable>> aVar) {
        this(new acu(aVar));
    }

    public final synchronized List<Class<?>> a(Class<?> cls) {
        return this.a.b(cls);
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, acr<? extends Model, ? extends Data> acr) {
        this.a.a(cls, cls2, acr);
        this.b.a();
    }

    public final synchronized <A> List<acq<A, ?>> b(Class<A> cls) {
        List<acq<A, ?>> list;
        a aVar = (a) this.b.a.get(cls);
        list = aVar == null ? null : aVar.a;
        if (list == null) {
            list = Collections.unmodifiableList(this.a.a((Class) cls));
            if (((a) this.b.a.put(cls, new a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(cls)));
            }
        }
        return list;
    }

    public final synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, acr<? extends Model, ? extends Data> acr) {
        this.a.b(cls, cls2, acr);
        this.b.a();
    }
}
