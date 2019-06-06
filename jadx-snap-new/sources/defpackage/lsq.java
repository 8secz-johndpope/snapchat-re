package defpackage;

import defpackage.lqf.b.a;
import defpackage.lqf.b.b.c;
import defpackage.lrw.a.d;
import defpackage.lsd.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lsq */
public final class lsq implements ajdu<b, b> {
    private final ajdp<lqf> a;

    /* renamed from: lsq$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof c;
        }
    }

    /* renamed from: lsq$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((c) obj, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: lsq$c */
    static final class c<T> implements ajfl<lqf> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            obj = (lqf) obj;
            akcr.b(obj, "it");
            return (obj instanceof a) || (obj instanceof lqf.b.b.b) || akcr.a(obj, lqf.a.a);
        }
    }

    /* renamed from: lsq$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((lqf) obj, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: lsq$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ lsq a;

        b(lsq lsq) {
            this.a = lsq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            defpackage.lsd.b bVar = (defpackage.lsd.b) ajxm.a;
            Object obj2 = (Boolean) ajxm.b;
            akcr.a(obj2, "recording");
            if (!obj2.booleanValue() || !(bVar instanceof defpackage.lsd.b.b)) {
                return bVar;
            }
            defpackage.lsd.b.b bVar2 = (defpackage.lsd.b.b) bVar;
            List list = bVar2.b;
            int i = bVar2.c;
            Object obj3 = (i < 0 || list.size() <= i) ? null : (lrw.a) list.get(i);
            Iterable<Object> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (Object obj4 : iterable) {
                Object obj42;
                if (!akcr.a(obj42, obj3)) {
                    if (obj42 instanceof lrw.a.c) {
                        obj42 = new lrw.a.c(false, ((lrw.a.c) obj42).a);
                    } else {
                        lrw.a.a a;
                        if (obj42 instanceof lrw.a.a) {
                            a = lrw.a.a.a((lrw.a.a) obj42, null, false, false, false, null, null, null, 123);
                        } else if (obj42 instanceof d) {
                            a = d.a((d) obj42, null, false, false, 3);
                        } else {
                            throw new ajxk();
                        }
                        obj42 = a;
                    }
                }
                arrayList.add(obj42);
            }
            return defpackage.lsd.b.b.a(bVar2, false, (List) arrayList, 0, false, false, false, null, 116);
        }
    }

    public lsq(ajdp<lqf> ajdp) {
        akcr.b(ajdp, "cameraLifecycle");
        this.a = ajdp;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object a = this.a.a((ajfl) a.a).a(c.class);
        akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
        a = ajdp.b((ajdt) a.p(e.a), (ajdt) this.a.a((ajfl) c.a).p(d.a)).h(Boolean.FALSE).j(ajfu.a);
        akcr.a(a, "isInRecordingState");
        Object p = myu.a(ajdp, a).p(new b(this));
        akcr.a(p, "pairLatest(upstream, isI…      }\n                }");
        return (ajdt) p;
    }
}
