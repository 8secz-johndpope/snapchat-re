package defpackage;

import defpackage.lrg.a;
import defpackage.lsd.a.c;
import defpackage.lsd.a.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lrk */
public final class lrk {

    /* renamed from: lrk$e */
    public static final class e<T> implements ajfl<Object> {
        public static final e a = new e();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof a;
        }
    }

    /* renamed from: lrk$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (a) obj;
            akcr.b(obj, "appearance");
            return Boolean.valueOf(akcr.a(obj, a.a.a));
        }
    }

    /* renamed from: lrk$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof e;
        }
    }

    /* renamed from: lrk$b */
    public static final class b<T> implements ajfl<Object> {
        public static final b a = new b();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof c;
        }
    }

    /* renamed from: lrk$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.lsd.a.c cVar = (defpackage.lsd.a.c) obj;
            akcr.b(cVar, "it");
            return cVar.b.d();
        }
    }

    /* renamed from: lrk$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ajdp a;

        d(ajdp ajdp) {
            this.a = ajdp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final mhs mhs = (mhs) obj;
            akcr.b(mhs, "id");
            return this.a.a((ajfl) new ajfl<e>() {
                public final /* synthetic */ boolean test(Object obj) {
                    e eVar = (e) obj;
                    akcr.b(eVar, "it");
                    for (Object next : eVar.a) {
                        if (akcr.a(((lrw.a) next).d(), mhs)) {
                            break;
                        }
                    }
                    Object next2 = null;
                    return next2 != null;
                }
            }).p(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    e eVar = (e) obj;
                    akcr.b(eVar, "visibleModels");
                    mhs mhs = mhs;
                    Iterable<lrw.a> iterable = eVar.a;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (lrw.a d : iterable) {
                        arrayList.add(d.d());
                    }
                    return new ajxr(mhs, (List) arrayList, lrk.a(eVar));
                }
            });
        }
    }

    static final ajdp<Boolean> a(ajdp<lrg> ajdp) {
        Object a = ajdp.a((ajfl) e.a).a(a.class);
        akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
        a = a.p(f.a);
        akcr.a(a, "filterByType<CarouselApp…elAppearance.All.Hidden }");
        return a;
    }
}
