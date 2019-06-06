package defpackage;

import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

/* renamed from: zmu */
public final class zmu implements zmw {
    static final String e = e;
    static final b f = new b(null, null);
    final ArrayMap<zlv, LinkedList<zmt<?>>> a = new ArrayMap();
    final zms b;
    final LayoutInflater c;
    final ViewGroup d;
    private final ajdw g;

    /* renamed from: zmu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zmu$b */
    static final class b {
        final zlv a;
        final zmt<?> b;

        public b(zlv zlv, zmt<?> zmt) {
            this.a = zlv;
            this.b = zmt;
        }
    }

    /* renamed from: zmu$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Entry entry = (Entry) obj;
            akcr.b(entry, "entry");
            return ajdp.b(entry.getKey()).a((long) ((Number) entry.getValue()).intValue());
        }
    }

    /* renamed from: zmu$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ zmu a;

        /* renamed from: zmu$d$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ void accept(Object obj) {
                Log.e(zmu.e, "Failed to inflate", (Throwable) obj);
            }
        }

        d(zmu zmu) {
            this.a = zmu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final zlv zlv = (zlv) obj;
            akcr.b(zlv, "viewType");
            return ajdp.b((Callable) new Callable<T>(this) {
                private /* synthetic */ d a;

                private b a() {
                    new StringBuilder("preload:").append(zlv);
                    Object a = zmv.a(this.a.a.c);
                    akcr.a(a, "threadInflater");
                    return new b(zlv, zms.createViewHolderForType(this.a.a.b, zlv, zms.createView(a.getContext(), zlv, this.a.a.d, a)));
                }

                public final /* synthetic */ Object call() {
                    return a();
                }
            }).c((ajfb) 2.a).f(zmu.f);
        }
    }

    /* renamed from: zmu$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ zmu a;

        e(zmu zmu) {
            this.a = zmu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "inflation");
            zmu zmu = this.a;
            if (bVar != zmu.f) {
                synchronized (zmu.a) {
                    LinkedList linkedList = (LinkedList) zmu.a.get(bVar.a);
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        zmu.a.put(bVar.a, linkedList);
                    }
                    zmt zmt = bVar.b;
                    if (zmt == null) {
                        akcr.a();
                    }
                    linkedList.add(zmt);
                }
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public zmu(zms zms, ajdw ajdw, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        akcr.b(zms, "viewFactory");
        akcr.b(ajdw, "inflationScheduler");
        akcr.b(layoutInflater, "layoutInflater");
        akcr.b(viewGroup, "parent");
        this.b = zms;
        this.g = ajdw;
        this.c = layoutInflater;
        this.d = viewGroup;
    }

    public final ajcx a(Map<zlv, Integer> map) {
        akcr.b(map, "preloads");
        Object g = ajdp.b((Iterable) map.entrySet()).k((ajfc) c.a).k((ajfc) new d(this)).b(this.g).p(new e(this)).g();
        akcr.a(g, "Observable.fromIterable(…        .ignoreElements()");
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    public final defpackage.zmt<?> a(defpackage.zlv r3) {
        /*
        r2 = this;
        r0 = "viewType";
        defpackage.akcr.b(r3, r0);
        r0 = r2.a;
        monitor-enter(r0);
        r1 = r2.a;	 Catch:{ all -> 0x002b }
        r3 = r1.get(r3);	 Catch:{ all -> 0x002b }
        r3 = (java.util.LinkedList) r3;	 Catch:{ all -> 0x002b }
        r1 = r3;
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x001e;
    L_0x0015:
        r1 = r1.isEmpty();	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001e;
    L_0x001c:
        r1 = 0;
        goto L_0x001f;
    L_0x001e:
        r1 = 1;
    L_0x001f:
        if (r1 != 0) goto L_0x0028;
    L_0x0021:
        r3 = r3.remove();	 Catch:{ all -> 0x002b }
        r3 = (defpackage.zmt) r3;	 Catch:{ all -> 0x002b }
        goto L_0x0029;
    L_0x0028:
        r3 = 0;
    L_0x0029:
        monitor-exit(r0);
        return r3;
    L_0x002b:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmu.a(zlv):zmt");
    }
}
