package defpackage;

import defpackage.dpq.c;
import defpackage.dpq.c.a;
import defpackage.dpq.c.b;
import defpackage.eih.e;
import java.util.List;

/* renamed from: ela */
public final class ela implements dno {
    private final ajdp<c> a;
    private final ajfb<e> b;
    private final ajfb<Boolean> c;
    private final zfw d;

    /* renamed from: ela$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (c) obj;
            akcr.b(obj, "it");
            if (!akcr.a(obj, b.a)) {
                return akcr.a(obj, defpackage.dpq.c.c.a.a) ? ajyl.a(e.EXTERNAL_RECORDING_REQUESTED) : akcr.a(obj, c.c.b.a) ? ajyl.a(e.EXTERNAL_RECORDING_FINISHED) : ajyw.a;
            } else {
                return ajym.b((Object[]) new e[]{e.EXTERNAL_RECORDING_REQUESTED, e.EXTERNAL_RECORDING_FINISHED});
            }
        }
    }

    /* renamed from: ela$b */
    static final class b<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list;
        }
    }

    /* renamed from: ela$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            boolean z;
            obj = (a) obj;
            akcr.b(obj, "action");
            if (akcr.a(obj, a.b.a)) {
                z = true;
            } else if (akcr.a(obj, a.a.a)) {
                z = false;
            } else {
                throw new ajxk();
            }
            return Boolean.valueOf(z);
        }
    }

    public ela(ajdp<c> ajdp, ajfb<e> ajfb, ajfb<Boolean> ajfb2, zfw zfw) {
        akcr.b(ajdp, "captureActions");
        akcr.b(ajfb, "captureSubject");
        akcr.b(ajfb2, "captureEnabledConsumer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajfb;
        this.c = ajfb2;
        this.d = zfw;
    }

    public final ajej start() {
        ajei ajei = new ajei();
        ajej f = this.a.a((ajdw) this.d.l()).p(a.a).l(b.a).f(this.b);
        akcr.a((Object) f, "captureActions\n         …subscribe(captureSubject)");
        ajvv.a(ajei, f);
        Object a = this.a.a((ajdw) this.d.l());
        akcr.a(a, "captureActions\n         …dSchedulers.mainThread())");
        a = a.b(a.class);
        akcr.a(a, "ofType(R::class.java)");
        f = a.p(c.a).f(this.c);
        akcr.a((Object) f, "captureActions\n         …e(captureEnabledConsumer)");
        ajvv.a(ajei, f);
        return ajei;
    }
}
