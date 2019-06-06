package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.snapchat.android.R;
import defpackage.lvw.a;
import defpackage.lvw.d;
import defpackage.miw.b;
import java.util.Set;

/* renamed from: lvq */
public abstract class lvq implements d, mha {

    /* renamed from: lvq$d */
    public interface d {
        ide h();

        zgb i();

        ajdp<lqf> j();

        akbl<Context, jn> k();

        ajdp<mmt> l();

        miw m();

        mwe o();
    }

    /* renamed from: lvq$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lvq$a */
    public static abstract class a implements mhi<lvq> {
        public d d;

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(d dVar);

        public abstract a b(ajdp<ViewGroup> ajdp);
    }

    /* renamed from: lvq$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lvq a;

        e(lvq lvq) {
            this.a = lvq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            return bool.booleanValue() ? mhb.a(this.a.j()) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: lvq$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mhi<? extends mha> a(ajdp<ViewGroup> ajdp, lvq lvq, ajdp<Boolean> ajdp2) {
            String str = "parentComponent";
            akcr.b(ajdp, "viewProvider");
            akcr.b(lvq, "component");
            akcr.b(ajdp2, "hideWhen");
            ajdp a = mit.a(R.id.lenses_camera_locked_cta_view_stub, ajdp);
            d dVar = lvq;
            akcr.b(dVar, str);
            a c = lvs.c();
            akcr.b(dVar, str);
            a aVar = c;
            aVar.a(dVar);
            aVar.d = dVar;
            c = c;
            ajdp a2 = ajvo.a(ajot.a);
            akcr.a((Object) a2, "Observable.empty<Boolean>()");
            a a3 = c.a(a2).a((ajdp) ajdp2);
            akcr.b(a, "viewStub");
            a aVar2 = a3;
            d dVar2 = aVar2.d;
            if (dVar2 == null) {
                akcr.a(str);
            }
            dVar2.e();
            dVar2 = aVar2.d;
            if (dVar2 == null) {
                akcr.a(str);
            }
            zfw a4 = zgb.a(dVar2.d(), "LockedCtaComponent.Builder#attachToViewStub");
            d dVar3 = aVar2.d;
            if (dVar3 == null) {
                akcr.a(str);
            }
            Object a5 = a.a(mit.a((int) R.layout.lenses_camera_locked_cta_view, lwd.class, true, dVar3.f(), false, true)).b((ajdw) a4.l()).c((ajdw) a4.l()).i().a();
            akcr.a(a5, "viewStub.compose(ViewObs…              .refCount()");
            aVar2.b(a5);
            return a3;
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
        Object u = k().a(b.a.a).a(mja.CAMERA_LENS_LOCKING_ENABLED).u(new e(this));
        akcr.a(u, "configurationRepository.…      }\n                }");
        return u;
    }

    public abstract Set<mhi<? extends mha>> j();

    public abstract miw k();
}
