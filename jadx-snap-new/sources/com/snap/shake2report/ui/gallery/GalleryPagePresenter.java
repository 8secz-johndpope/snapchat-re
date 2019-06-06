package com.snap.shake2report.ui.gallery;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.ui.view.ScHeaderView;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyn;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.eps;
import defpackage.eqj;
import defpackage.eqx;
import defpackage.erb;
import defpackage.ere;
import defpackage.ftt;
import defpackage.idl;
import defpackage.j;
import defpackage.jwh;
import defpackage.jwi;
import defpackage.k;
import defpackage.s;
import defpackage.wqv;
import defpackage.wtq;
import defpackage.wvh;
import defpackage.wvk;
import defpackage.wvl;
import defpackage.wvm;
import defpackage.wwj;
import defpackage.wwk;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zlx;
import defpackage.zmf;
import defpackage.zms;
import defpackage.znk;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

public final class GalleryPagePresenter extends zll<wwk> implements k {
    final ajxe a = ajxh.a(g.a);
    final zkf b;
    final zke c;
    final ajwy<wtq> d;
    final wvl e;
    private final ajxe f = ajxh.a(new f(this));
    private final ajei g = new ajei();
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final eqj i;
    private zgb j;
    private final ajwy<jwi> k;

    static final class c implements OnClickListener {
        private /* synthetic */ GalleryPagePresenter a;

        c(GalleryPagePresenter galleryPagePresenter) {
            this.a = galleryPagePresenter;
        }

        public final void onClick(View view) {
            this.a.c.a(new wvh());
        }
    }

    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ GalleryPagePresenter a;

        a(GalleryPagePresenter galleryPagePresenter) {
            this.a = galleryPagePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "mediaList");
            Iterable<eps> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (eps erb : iterable) {
                arrayList.add(new erb(erb, wwj.CAMERA_ROLL_IMAGE, ere.IMAGE));
            }
            return (List) arrayList;
        }
    }

    static final class b<T> implements ajfb<List<? extends erb>> {
        private /* synthetic */ GalleryPagePresenter a;

        b(GalleryPagePresenter galleryPagePresenter) {
            this.a = galleryPagePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            GalleryPagePresenter galleryPagePresenter = this.a;
            akcr.a((Object) list, "models");
            zmf zmf = new zmf((zms) galleryPagePresenter.a.b(), galleryPagePresenter.b.a());
            wwk wwk = (wwk) galleryPagePresenter.getTarget();
            if (wwk != null) {
                RecyclerView c = wwk.c();
                if (c != null) {
                    c.setAdapter(zmf);
                }
            }
            zmf.a(znk.a(list));
        }
    }

    static final class d<T, R> implements ajfc<InputStream, ajdb> {
        final /* synthetic */ GalleryPagePresenter a;

        d(GalleryPagePresenter galleryPagePresenter) {
            this.a = galleryPagePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final InputStream inputStream = (InputStream) obj;
            akcr.b(inputStream, "inputStream");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ d a;

                public final void run() {
                    wtq wtq = (wtq) this.a.a.d.get();
                    String str = this.a.a.e.a;
                    if (str == null) {
                        akcr.a();
                    }
                    wtq.a(str, inputStream);
                }
            });
        }
    }

    static final class e implements ajev {
        private /* synthetic */ GalleryPagePresenter a;

        e(GalleryPagePresenter galleryPagePresenter) {
            this.a = galleryPagePresenter;
        }

        public final void run() {
            List list = this.a.e.i;
            list.clear();
            list.add(wvm.SCREENSHOT);
            this.a.c.a(new wvh());
        }
    }

    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ GalleryPagePresenter a;

        f(GalleryPagePresenter galleryPagePresenter) {
            this.a = galleryPagePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(wqv.g, "GalleryPagePresenter");
        }
    }

    static final class g extends akcs implements akbk<zms> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zms((zlx) new eqx(), wwj.class);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(GalleryPagePresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(GalleryPagePresenter.class), "viewFactory", "getViewFactory()Lcom/snap/ui/recycling/factory/ViewFactory;")};
    }

    public GalleryPagePresenter(zkf zkf, zke zke, eqj eqj, zgb zgb, ajwy<jwi> ajwy, ajwy<wtq> ajwy2, wvl wvl) {
        akcr.b(zkf, "bus");
        akcr.b(zke, "dispatcher");
        akcr.b(eqj, "cameraRollImageProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "contentUriResolver");
        akcr.b(ajwy2, "fileManager");
        akcr.b(wvl, "reportConfigProvider");
        this.b = zkf;
        this.c = zke;
        this.i = eqj;
        this.j = zgb;
        this.k = ajwy;
        this.d = ajwy2;
        this.e = wvl;
    }

    private final zfw a() {
        return (zfw) this.f.b();
    }

    /* renamed from: a */
    public final void takeTarget(wwk wwk) {
        akcr.b(wwk, "target");
        super.takeTarget(wwk);
        wwk.getLifecycle().a(this);
        ajej a = this.b.a(this);
        akcr.a((Object) a, "bus.subscribe(this)");
        ajvv.a(a, this.g);
    }

    public final void dropTarget() {
        wwk wwk = (wwk) getTarget();
        if (wwk != null) {
            j lifecycle = wwk.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        this.g.a();
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onFragmentResume() {
        ScHeaderView scHeaderView = null;
        ajej f = defpackage.eqm.a.a(this.i, null, null, 0, 31).a(a().f()).b().p(new a(this)).a((ajdw) a().l()).f((ajfb) new b(this));
        akcr.a((Object) f, "paginator.observe()\n    …pdateViewModels(models) }");
        ajvv.a(f, this.g);
        wwk wwk = (wwk) getTarget();
        if (wwk != null) {
            scHeaderView = wwk.b();
        }
        if (scHeaderView == null) {
            akcr.a();
        }
        scHeaderView.setBackArrowOnClickListener(new c(this));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onGalleryItemSelectedEvent(wvk wvk) {
        akcr.b(wvk, "event");
        if (this.h.compareAndSet(false, true)) {
            ajej g = ((jwi) this.k.get()).a(new jwh(ftt.b(wvk.a.b()), (idl) wqv.g.getPage(), 0, 12)).e((ajfc) new d(this)).b((ajdw) a().f()).a((ajdw) a().l()).g(new e(this));
            akcr.a((Object) g, "contentUriResolver.get()…())\n                    }");
            ajvv.a(g, this.g);
        }
    }
}
