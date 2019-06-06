package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.snapchat.android.R;
import defpackage.uar.a.a;
import java.util.concurrent.Callable;

/* renamed from: uas */
public final class uas implements toe {
    final ajei a = new ajei();
    final ajei b = new ajei();
    final ajxe c = ajxh.a(new h(this));
    final ajxe d = ajxh.a(new a(this));
    FrameLayout e;
    FrameLayout f;
    final a g;
    final aipn<ftl> h;
    final aipn<uav> i;
    final txi j;
    private final String k = "PreviewTooltipPreloader";
    private final ajxe l = ajxh.a(new g(this));
    private zfw m;
    private final View n;
    private final zgb o;
    private final toc p;
    private final ajdp<ajxw> q;
    private final ajdp<uaq> r;

    /* renamed from: uas$g */
    static final class g extends akcs implements akbk<uat> {
        private /* synthetic */ uas a;

        g(uas uas) {
            this.a = uas;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            uat a = this.a.g.a().a();
            FrameLayout frameLayout = this.a.e;
            if (frameLayout == null) {
                akcr.a("previewLayout");
            }
            FrameLayout frameLayout2 = this.a.f;
            if (frameLayout2 == null) {
                akcr.a("tooltipLayer");
            }
            akcr.b(frameLayout, "previewLayoutFromPreloader");
            akcr.b(frameLayout2, "tooltipLayerFromPreloader");
            a.c = frameLayout;
            a.d = frameLayout2;
            Object context = frameLayout.getContext();
            akcr.a(context, "previewLayoutFromPreloader.context");
            a.b = context;
            ajvv.a(a.start(), this.a.a);
            return a;
        }
    }

    /* renamed from: uas$h */
    static final class h extends akcs implements akbk<uav> {
        private /* synthetic */ uas a;

        h(uas uas) {
            this.a = uas;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (uav) this.a.i.get();
        }
    }

    /* renamed from: uas$a */
    static final class a extends akcs implements akbk<ftl> {
        private /* synthetic */ uas a;

        a(uas uas) {
            this.a = uas;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.h.get();
        }
    }

    /* renamed from: uas$b */
    static final class b<T> implements ajfb<ajxw> {
        private /* synthetic */ uas a;

        b(uas uas) {
            this.a = uas;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.dispose();
            ((uat) this.a.l.b()).a(uaj.SWIPE_FILTER);
            ((uat) this.a.l.b()).a(new uaf());
        }
    }

    /* renamed from: uas$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ uas a;

        c(uas uas) {
            this.a = uas;
        }

        public final /* synthetic */ Object call() {
            Object obj = (uav) this.a.c.b();
            akcr.a(obj, "previewTooltipRepository");
            defpackage.txi.c cVar = this.a.j.C;
            aeew aeew = cVar != null ? cVar.a : null;
            Object obj2 = (ftl) this.a.d.b();
            akcr.a(obj2, "compositeConfigurationProvider");
            return uay.a(obj, aeew, obj2);
        }
    }

    /* renamed from: uas$d */
    static final class d<T> implements ajfb<uaj> {
        private /* synthetic */ uas a;

        d(uas uas) {
            this.a = uas;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (uaj) obj;
            this.a.b.dispose();
            uat a = ((uat) this.a.l.b());
            akcr.a(obj2, "it");
            a.a(new uak(obj2, false, null, null, false, 30));
        }
    }

    /* renamed from: uas$e */
    static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: uas$f */
    static final class f<T> implements ajfb<uaq> {
        private /* synthetic */ uas a;

        f(uas uas) {
            this.a = uas;
        }

        public final /* synthetic */ void accept(Object obj) {
            uaq uaq = (uaq) obj;
            this.a.b.dispose();
            if (uaq instanceof uak) {
                ((uat) this.a.l.b()).a((uak) uaq);
            } else if (uaq instanceof uag) {
                ((uat) this.a.l.b()).a((uag) uaq);
            } else {
                if (uaq instanceof uaf) {
                    ((uat) this.a.l.b()).a((uaf) uaq);
                }
            }
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(uas.class), "previewTooltipPresenter", "getPreviewTooltipPresenter()Lcom/snap/preview/tooltips/PreviewTooltipPresenter;"), new akdc(akde.a(uas.class), "previewTooltipRepository", "getPreviewTooltipRepository()Lcom/snap/preview/tooltips/PreviewTooltipRepository;"), new akdc(akde.a(uas.class), "compositeConfigurationProvider", "getCompositeConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
    }

    public uas(View view, a aVar, aipn<ftl> aipn, aipn<uav> aipn2, zgb zgb, toc toc, txi txi, ajdp<ajxw> ajdp, ajdp<uaq> ajdp2) {
        akcr.b(view, "rootView");
        akcr.b(aVar, "builder");
        akcr.b(aipn, "compositeConfigurationProviderLazy");
        akcr.b(aipn2, "previewTooltipRepositoryLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(txi, "previewMediaPlayer");
        akcr.b(ajdp, "scrollInFilterEventObservable");
        akcr.b(ajdp2, "tooltipVisibilityObservable");
        this.n = view;
        this.g = aVar;
        this.h = aipn;
        this.i = aipn2;
        this.o = zgb;
        this.p = toc;
        this.j = txi;
        this.q = ajdp;
        this.r = ajdp2;
    }

    private final void a() {
        View view = this.n;
        if (view != null) {
            this.e = (FrameLayout) view;
            try {
                FrameLayout frameLayout = this.e;
                if (frameLayout == null) {
                    akcr.a("previewLayout");
                }
                frameLayout = (FrameLayout) frameLayout.findViewById(R.id.snap_preview_tooltip_layer);
                if (frameLayout != null) {
                    this.f = frameLayout;
                    ajdj d = this.q.d();
                    zfw zfw = this.m;
                    String str = "schedulers";
                    if (zfw == null) {
                        akcr.a(str);
                    }
                    ajej d2 = d.a((ajdw) zfw.l()).d((ajfb) new b(this));
                    if (d2 != null) {
                        ajvv.a(d2, this.b);
                    }
                    ajdx c = ajdx.c((Callable) new c(this));
                    zfw = this.m;
                    if (zfw == null) {
                        akcr.a(str);
                    }
                    c = c.b((ajdw) zfw.f());
                    zfw = this.m;
                    if (zfw == null) {
                        akcr.a(str);
                    }
                    d2 = c.a((ajdw) zfw.l()).a((ajfb) new d(this), (ajfb) e.a);
                    akcr.a((Object) d2, "Single.fromCallable {\n  …age}\")\n                })");
                    ajvv.a(d2, this.b);
                    d = this.r.d();
                    zfw = this.m;
                    if (zfw == null) {
                        akcr.a(str);
                    }
                    d2 = d.a((ajdw) zfw.l()).d((ajfb) new f(this));
                    akcr.a((Object) d2, "tooltipVisibilityObserva…              }\n        }");
                    ajvv.a(d2, this.b);
                }
            } catch (NullPointerException unused) {
            }
        } else {
            throw new ajxt("null cannot be cast to non-null type android.widget.FrameLayout");
        }
    }

    public final ajej start() {
        this.m = zgb.a(this.p.callsite("PreviewTooltipPreloader"));
        a();
        this.a.a((ajej) this.b);
        return this.a;
    }
}
