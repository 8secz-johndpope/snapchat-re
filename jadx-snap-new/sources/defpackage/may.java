package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.snapchat.android.R;
import defpackage.mbh.b;
import defpackage.mbn.a;
import defpackage.mbn.d;
import java.util.Set;

/* renamed from: may */
public abstract class may implements d, mha {

    /* renamed from: may$d */
    public interface d {
        ide g();

        zgb h();

        ajdp<lqf> k();

        miw l();

        kqf m();

        akbl<Context, jn> o();
    }

    /* renamed from: may$a */
    public static abstract class a implements mhi<may> {
        public d f;

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(d dVar);

        public abstract a a(boolean z);

        public abstract a b(ajdp<mih> ajdp);

        public abstract a c(ajdp<ViewGroup> ajdp);
    }

    /* renamed from: may$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: may$c */
    public static final class c {
        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdp<mbh> a(ajdp<ViewGroup> ajdp, zfw zfw, akbl<Context, jn> akbl) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(akbl, "asyncLayoutInflaterFactory");
            Object a = mit.a(R.id.lenses_camera_button_view_stub, ajdp).a(mit.a((int) R.layout.lenses_camera_lensbutton_view, mbh.class, true, (akbl) akbl, false, true)).b((ajdw) zfw.l()).c((ajdw) zfw.l()).i().a();
            akcr.a(a, "ViewObservables.find<Vie…              .refCount()");
            return a;
        }

        public static final ajdu<b, b> a(ajdp<lqf> ajdp, ajdp<mih> ajdp2, ajdp<Boolean> ajdp3) {
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(ajdp2, "windowRect");
            akcr.b(ajdp3, "hideWhen");
            return mic.a(new maw(ajdp), new max(ajdp3), mic.a((ajdp) ajdp2));
        }

        public static final mbf a(ajdp<mbh> ajdp, mbg mbg, ajdu<b, b> ajdu, zfw zfw, kqf kqf) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(mbg, "useCase");
            akcr.b(ajdu, "observableTransformer");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(kqf, "analyticsEventHandler");
            return new mat(ajdp, mbg, ajdu, zfw, kqf);
        }

        public static final mbg a() {
            return new mau();
        }

        public static final mhi<? extends mha> a(may may, ajdp<mih> ajdp, ajdp<ViewGroup> ajdp2, boolean z) {
            String str = "parentComponent";
            akcr.b(may, "component");
            akcr.b(ajdp, "windowRect");
            akcr.b(ajdp2, "viewGroupProvider");
            if (z) {
                return mhc.a;
            }
            d dVar = may;
            akcr.b(dVar, str);
            a c = mbi.c();
            akcr.b(dVar, str);
            a aVar = c;
            aVar.a(dVar);
            aVar.d = dVar;
            a a = c.a((ajdp) ajdp);
            ajdp a2 = mit.a(R.id.lenses_button_tooltip_view_stub, ajdp2);
            akcr.b(a2, "viewStub");
            a aVar2 = a;
            d dVar2 = aVar2.d;
            if (dVar2 == null) {
                akcr.a(str);
            }
            dVar2.e();
            dVar2 = aVar2.d;
            if (dVar2 == null) {
                akcr.a(str);
            }
            zfw a3 = zgb.a(dVar2.d(), "LensButtonTooltipComponent.Builder#attachToViewStub");
            d dVar3 = aVar2.d;
            if (dVar3 == null) {
                akcr.a(str);
            }
            Object a4 = a2.a(mit.a((int) R.layout.lenses_camera_lensbutton_tooltip_view, mbw.class, true, dVar3.f(), false, true)).b((ajdw) a3.l()).c((ajdw) a3.l()).i().a();
            akcr.a(a4, "viewStub.compose(ViewObs…              .refCount()");
            aVar2.b(a4);
            return new mar(may, a);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("LensButton"));
        }
    }

    /* renamed from: may$e */
    static final class e<T> implements ajfl<lqf> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            lqf lqf = (lqf) obj;
            akcr.b(lqf, "it");
            return lqf instanceof lqf.b.b;
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
        Object d = ajdp.b((ajdt) j().b(), (ajdt) mhb.a(k())).d((ajdt) h().a((ajfl) e.a));
        akcr.a(d, "Observable.merge(\n      …cycle.Opened.Streaming })");
        return d;
    }

    public abstract mbg i();

    public abstract mbf j();

    public abstract Set<mhi<? extends mha>> k();
}
