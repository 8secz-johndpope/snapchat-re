package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ixm */
public final class ixm {
    final ConcurrentHashMap<String, ajej> a = new ConcurrentHashMap();
    final ajwl<Map<String, ajej>> b;
    final ajei c;

    /* renamed from: ixm$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            akcr.b(map, "it");
            Map linkedHashMap = new LinkedHashMap();
            for (Entry entry : map.entrySet()) {
                entry.getKey();
                if ((((ajej) entry.getValue()).isDisposed() ^ 1) != 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap.keySet();
        }
    }

    /* renamed from: ixm$b */
    public static final class b implements ajej {
        private /* synthetic */ ajwm a;

        b(ajwm ajwm) {
            this.a = ajwm;
        }

        public final void dispose() {
            this.a.a();
        }

        public final boolean isDisposed() {
            return this.a.i();
        }
    }

    /* renamed from: ixm$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ ixm a;
        private /* synthetic */ ajwm b;

        c(ixm ixm, ajwm ajwm) {
            this.a = ixm;
            this.b = ajwm;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a();
            this.a.a();
        }
    }

    public ixm() {
        Object i = ajwl.i(ajyx.a);
        akcr.a(i, "BehaviorSubject.createDe…Of<String, Disposable>())");
        this.b = i;
        this.c = new ajei();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b.a(this.a);
    }
}
