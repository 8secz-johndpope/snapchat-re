package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: mhb */
public final class mhb {

    /* renamed from: mhb$a */
    public static final class a implements mhi<mha> {
        private /* synthetic */ ajxe a;

        public a(ajxe ajxe) {
            this.a = ajxe;
        }

        public final /* synthetic */ Object a() {
            return (mha) ((mhi) this.a.b()).a();
        }
    }

    /* renamed from: mhb$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ mhi a;

        b(mhi mhi) {
            this.a = mhi;
        }

        private mha a() {
            return (mha) this.a.a();
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: mhb$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mha mha = (mha) obj;
            akcr.b(mha, "attachable");
            return mha.b();
        }
    }

    public static final ajdp<Object> a(Set<? extends mhi<? extends mha>> set) {
        akcr.b(set, "receiver$0");
        Iterable<mhi> iterable = set;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (mhi bVar : iterable) {
            arrayList.add(ajdp.b((Callable) new b(bVar)).u(c.a));
        }
        Object c = ajdp.c((Iterable) (List) arrayList);
        akcr.a(c, "Observable.merge(map {\n …chable.observe() }\n    })");
        return c;
    }
}
