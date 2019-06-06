package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.kqe.z;
import defpackage.lrw.a;
import defpackage.lsd.b;
import defpackage.miq.e;

/* renamed from: ltb */
public final class ltb implements ajdu<b, b> {
    final kqf a;

    /* renamed from: ltb$a */
    public static final class a<T> implements ajfl<Object> {
        public static final a a = new a();

        public final boolean test(Object obj) {
            akcr.b(obj, "it");
            return obj instanceof b.b;
        }
    }

    /* renamed from: ltb$b */
    static final class b<T> implements ajfl<defpackage.lsd.b.b> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            defpackage.lsd.b.b bVar = (defpackage.lsd.b.b) obj;
            akcr.b(bVar, MapboxEvent.KEY_MODEL);
            for (Object next : bVar.b) {
                Object obj2;
                a aVar = (a) next;
                if ((aVar instanceof a.a) && (aVar.d() instanceof defpackage.mhs.b) && (((a.a) aVar).b instanceof e)) {
                    obj2 = 1;
                    continue;
                } else {
                    obj2 = null;
                    continue;
                }
                if (obj2 != null) {
                    break;
                }
            }
            Object next2 = null;
            return next2 != null;
        }
    }

    /* renamed from: ltb$c */
    static final class c<T> implements ajfb<b.b> {
        private /* synthetic */ ltb a;

        c(ltb ltb) {
            this.a = ltb;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a(z.b);
        }
    }

    /* renamed from: ltb$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((b.b) obj, "it");
            return ajvo.a(ajot.a);
        }
    }

    public ltb(kqf kqf) {
        akcr.b(kqf, "analyticsEventHandler");
        this.a = kqf;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object a = ajpy.k(ajdp).a();
        akcr.a(a, "sharedUpstream");
        Object a2 = a.a((ajfl) a.a).a(b.b.class);
        akcr.a(a2, "this.filter { it is R }.cast(R::class.java)");
        a = ajdp.b((ajdt) a, (ajdt) a2.a((ajfl) b.a).c(1).d((ajfb) new c(this)).u(d.a));
        akcr.a(a, "merge(sharedUpstream, selectedLensChanged)");
        return (ajdt) a;
    }
}
