package defpackage;

import android.content.Context;
import com.snapchat.android.R;
import defpackage.miw.b;
import defpackage.mvu.a;

/* renamed from: lxk */
public final class lxk implements mhi<a> {
    public ajdp<lxs> a = ajvo.a(ajot.a);
    public ajdp<Double> b = ajvo.a(ajot.a);
    public mwe c = mwd.a();
    public mvu d = a.a;
    public final ajdp<miz> e;
    public final c f;

    /* renamed from: lxk$c */
    public interface c {
        ide g();

        zgb h();

        ajdp<mmt> j();

        miw l();

        akbl<Context, jn> o();
    }

    /* renamed from: lxk$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return miz.valueOf(str);
        }
    }

    /* renamed from: lxk$d */
    public static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ lxk a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ zfw c;

        public d(lxk lxk, ajdp ajdp, zfw zfw) {
            this.a = lxk;
            this.b = ajdp;
            this.c = zfw;
        }

        public final /* synthetic */ Object apply(Object obj) {
            miz miz = (miz) obj;
            akcr.b(miz, "lensesDebugMode");
            return this.b.a(mit.a(miz == miz.INTERNAL_DEBUG ? R.layout.lenses_camera_debug_view : R.layout.lenses_studio_lens_debug_view, lxs.class, true, this.a.f.o(), false, true)).b((ajdw) this.c.l()).c((ajdw) this.c.l());
        }
    }

    /* renamed from: lxk$a */
    public static abstract class a implements mha {

        /* renamed from: lxk$a$a */
        public interface a {
            a a(ajdp<miz> ajdp);

            a a(c cVar);

            a a(mvu mvu);

            a a(mwe mwe);

            a a();

            a b(ajdp<Double> ajdp);

            a c(ajdp<lxs> ajdp);
        }

        public final ajej a() {
            Object l = b().l();
            akcr.a(l, "observe().subscribe()");
            return l;
        }

        public final ajdp<Object> b() {
            return d().b();
        }

        public abstract lxq d();
    }

    /* renamed from: lxk$b */
    public static final class b {
        static {
            b bVar = new b();
        }

        private b() {
        }

        public static final lxq a(ajdp<lxs> ajdp, lxr lxr, zfw zfw) {
            akcr.b(ajdp, "view");
            akcr.b(lxr, "debugUseCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new lxt(ajdp, lxr, zfw);
        }

        public static final lxr a(ajdp<mmt> ajdp, ajdp<Double> ajdp2, zfw zfw, mwe mwe, mvu mvu) {
            akcr.b(ajdp, "lensCore");
            akcr.b(ajdp2, "cameraAverageFps");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(mwe, "lensRepository");
            akcr.b(mvu, "lensContentInfoProvider");
            return new lxw(ajdp, ajdp2, zfw, mwe, mvu);
        }

        public static final mwe a(mwe mwe, ajdp<miz> ajdp) {
            akcr.b(mwe, "lensRepository");
            akcr.b(ajdp, "debugModeObservable");
            return new lxp(mwe, ajdp);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("Debug"));
        }
    }

    public lxk(c cVar) {
        akcr.b(cVar, "parentComponent");
        this.f = cVar;
        Object c = this.f.l().a(b.a.a).f(mja.LENSES_DEBUG_MODE).p(e.a).c(1).c();
        akcr.a(c, "parentComponent.configur…e(1)\n            .cache()");
        this.e = c;
    }

    public final /* synthetic */ Object a() {
        a a = lxj.c().a(this.f);
        Object obj = this.a;
        akcr.a(obj, "viewProvider");
        a = a.c(obj);
        obj = this.b;
        akcr.a(obj, "cameraAverageFps");
        return a.b(obj).a(this.c).a(this.d).a(this.e).a();
    }
}
