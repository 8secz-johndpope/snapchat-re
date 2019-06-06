package defpackage;

import defpackage.mwe.a;
import defpackage.mwe.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: kxt */
public final class kxt implements mwe {
    final ReentrantLock a = new ReentrantLock();
    final ajvp<List<mux>> b;
    volatile List<mux> c;

    /* renamed from: kxt$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ defpackage.mwe.a a;

        a(defpackage.mwe.a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "lenses");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((mux) next).a, ((b) this.a).a)) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    public kxt() {
        Object obj = ajyw.a;
        ajfv.a(obj, "defaultValue is null");
        Object ajvp = new ajvp(obj);
        akcr.a(ajvp, "BehaviorProcessor.create…<List<Lens>>(emptyList())");
        this.b = ajvp;
        this.c = ajyw.a;
    }

    public final ajde<List<mux>> a(a aVar) {
        akcr.b(aVar, "queryCriteria");
        if (aVar instanceof a.a) {
            return this.b;
        }
        if (aVar instanceof b) {
            Object d = this.b.d((ajfc) new a(aVar));
            akcr.a(d, "lensesProcessor.map { le…          }\n            }");
            return d;
        }
        throw new ajxk();
    }

    public final void a(mux mux) {
        akcr.b(mux, "lens");
        Lock lock = this.a;
        lock.lock();
        try {
            Object a = ajyu.a((Collection) this.c, (Object) mux);
            this.c = a;
            this.b.a(a);
        } finally {
            lock.unlock();
        }
    }
}
