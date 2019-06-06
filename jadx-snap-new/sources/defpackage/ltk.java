package defpackage;

import android.content.Context;
import defpackage.miw.b.a;

/* renamed from: ltk */
public abstract class ltk implements mha {

    /* renamed from: ltk$c */
    public interface c {
        ide h();

        zgb i();

        ajdp<lqf> j();

        akbl<Context, jn> k();

        ajdp<mmt> l();

        miw m();

        lth q();
    }

    /* renamed from: ltk$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: ltk$a */
    public static abstract class a implements mhi<ltk> {
        public c a;

        public abstract a a(ajdp<ltr> ajdp);

        public abstract a a(c cVar);

        public abstract a b(ajdp<mih> ajdp);

        public abstract a c(ajdp<Boolean> ajdp);
    }

    /* renamed from: ltk$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ltk a;

        d(ltk ltk) {
            this.a = ltk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (bool.booleanValue()) {
                return this.a.d().b();
            }
            obj = ajvo.a(ajot.a);
            akcr.a(obj, "Observable.empty()");
            return obj;
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        Object l = b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }

    public final ajdp<Object> b() {
        Object u = c().a(a.a).a(mja.BITMOJI_POPUP_ENABLED).c(1).u(new d(this));
        akcr.a(u, "configurationRepository.…          }\n            }");
        return u;
    }

    public abstract miw c();

    public abstract ltp d();
}
