package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.snapchat.android.R;
import defpackage.lyw.a;
import defpackage.lyw.a.c;
import defpackage.lyx.b;
import defpackage.lzh.d;
import java.util.Set;

/* renamed from: lyl */
public abstract class lyl implements d, mha {

    /* renamed from: lyl$d */
    public interface d {
        mqt A();

        ide g();

        zgb h();

        ajdp<lqf> k();

        miw l();

        akbl<Context, jn> o();
    }

    /* renamed from: lyl$a */
    public static abstract class a implements mhi<lyl> {
        public d e;

        public abstract a a(ajdp<mih> ajdp);

        public abstract a a(d dVar);

        public abstract a b(ajdp<ViewGroup> ajdp);

        public abstract a c(ajdp<Boolean> ajdp);
    }

    /* renamed from: lyl$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lyl$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ lyl a;

        /* renamed from: lyl$e$1 */
        static final class 1<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                return ajdp.b(c.a).d((ajfb) new lym(new akbl<a, ajxw>(this.a.a.j().a()) {
                    public final String getName() {
                        return "accept";
                    }

                    public final akej getOwner() {
                        return akde.a(ajfb.class);
                    }

                    public final String getSignature() {
                        return "accept(Ljava/lang/Object;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        ((ajfb) this.receiver).accept((a) obj);
                        return ajxw.a;
                    }
                }));
            }
        }

        e(lyl lyl) {
            this.a = lyl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            return bool.booleanValue() ? ajdp.b((ajdt) this.a.i().b().a((ajfc) new 1(this)), (ajdt) mhb.a(this.a.k())) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: lyl$c */
    public static final class c {

        /* renamed from: lyl$c$a */
        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.lyw.b.c) obj, "it");
                return Boolean.FALSE;
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdp<lyx> a(ajdp<ViewGroup> ajdp, zfw zfw, akbl<Context, jn> akbl) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(akbl, "asyncLayoutInflaterFactory");
            Object a = mit.a(R.id.lenses_camera_explorer_button_view_stub, ajdp).a(mit.a((int) R.layout.lenses_camera_explorerbutton_view, lyx.class, true, (akbl) akbl, false, true)).b((ajdw) zfw.l()).c((ajdw) zfw.l()).i().a();
            akcr.a(a, "viewStub.compose(ViewObs…              .refCount()");
            return a;
        }

        public static final ajdp<Boolean> a(lyw lyw) {
            akcr.b(lyw, "useCase");
            Object b = lyw.b().b(defpackage.lyw.b.c.class);
            akcr.a(b, "ofType(R::class.java)");
            b = b.p(a.a);
            akcr.a(b, "useCase.outputs\n        …           .map { false }");
            return b;
        }

        public static final ajdu<b, b> a(ajdp<mih> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, ajdp<lqf> ajdp4, zfw zfw, miw miw) {
            akcr.b(ajdp, "windowRect");
            akcr.b(ajdp2, "hideWhen");
            akcr.b(ajdp3, "highlightWhen");
            akcr.b(ajdp4, "cameraLifecycle");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(miw, "configurationRepository");
            return mic.a(new lyk(ajdp2, ajdp4, zfw), new lyu(ajdp3, miw, mhk.b.a), mic.a((ajdp) ajdp));
        }

        public static final lyv a(ajdp<lyx> ajdp, lyw lyw, ajdu<b, b> ajdu, zfw zfw) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(lyw, "useCase");
            akcr.b(ajdu, "viewModelTransformer");
            akcr.b(zfw, "qualifiedSchedulers");
            return new lyd(ajdp, lyw, ajdu, zfw);
        }

        public static final lyw a(mqt mqt) {
            akcr.b(mqt, "lensesExplorerController");
            return new lyg(mqt);
        }

        public static final mhi<? extends mha> a(ajdp<ViewGroup> ajdp, ajdp<mih> ajdp2, ajdp<Boolean> ajdp3, lyl lyl) {
            String str = "parentComponent";
            akcr.b(ajdp, "viewGroupProvider");
            akcr.b(ajdp2, "windowRect");
            akcr.b(ajdp3, "hideWhen");
            akcr.b(lyl, "component");
            d dVar = lyl;
            akcr.b(dVar, str);
            lzh.a c = lyy.c();
            akcr.b(dVar, str);
            lzh.a aVar = c;
            aVar.a(dVar);
            aVar.e = dVar;
            c = c;
            Object b = ajdp.b(defpackage.lzq.c.a);
            akcr.a(b, "Observable.just(ExplorerTooltipView.Noop)");
            lzh.a c2 = c.c(b);
            Object b2 = ajdp.b(mih.e);
            akcr.a(b2, "Observable.just(Rectangle.ZERO)");
            c2 = c2.b(b2);
            ajdp a = ajvo.a(ajot.a);
            akcr.a((Object) a, "Observable.empty()");
            lzh.a a2 = c2.a(a).b(ajdp2).a((ajdp) ajdp3);
            ajdp a3 = mit.a(R.id.lenses_camera_explorer_tooltip_view_stub, ajdp);
            akcr.b(a3, "viewStub");
            lzh.a aVar2 = a2;
            dVar = aVar2.e;
            if (dVar == null) {
                akcr.a(str);
            }
            dVar.e();
            dVar = aVar2.e;
            if (dVar == null) {
                akcr.a(str);
            }
            zfw a4 = zgb.a(dVar.d(), "ExplorerTooltipComponent.Builder#attachToViewStub");
            d dVar2 = aVar2.e;
            if (dVar2 == null) {
                akcr.a(str);
            }
            Object a5 = a3.a(mit.a((int) R.layout.lenses_camera_explorer_tooltip_view, lzq.class, true, dVar2.f(), false, true)).b((ajdw) a4.l()).c((ajdw) a4.l()).i().a();
            akcr.a(a5, "viewStub.compose(ViewObs…              .refCount()");
            aVar2.c(a5);
            return new lxz(lyl, a2);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("ExplorerComponent"));
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
        Object u = g().a(miw.b.a.a).a(mja.LENS_EXPLORER_ENABLED).c(1).u(new e(this));
        akcr.a(u, "configurationRepository.…      }\n                }");
        return u;
    }

    public abstract lyv i();

    public abstract lyw j();

    public abstract Set<mhi<? extends mha>> k();
}
