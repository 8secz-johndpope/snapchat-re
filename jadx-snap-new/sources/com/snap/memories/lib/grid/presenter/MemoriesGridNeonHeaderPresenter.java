package com.snap.memories.lib.grid.presenter;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.AppBarLayout;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.snap.memories.lib.grid.view.MemoriesAllPagesRecyclerView;
import com.snapchat.android.R;
import defpackage.achd;
import defpackage.achg;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajvv;
import defpackage.ajwl;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.fsy;
import defpackage.fta;
import defpackage.j;
import defpackage.k;
import defpackage.ojc;
import defpackage.olj;
import defpackage.ozf;
import defpackage.ozg;
import defpackage.ozh;
import defpackage.ozi;
import defpackage.ozj;
import defpackage.ozk;
import defpackage.ozl;
import defpackage.ozm;
import defpackage.ozn;
import defpackage.pbe;
import defpackage.s;
import defpackage.zfw;
import defpackage.zkq;
import defpackage.zll;
import java.util.List;
import java.util.Set;

public final class MemoriesGridNeonHeaderPresenter extends zll<pbe> implements k {
    public final ajws<ajxw> a;
    int b;
    int c;
    boolean d;
    final ajwy<ozn> e;
    private final ajxe f;
    private final ajxe g = ajxh.a(new c(this));
    private final android.support.design.widget.AppBarLayout.b h;
    private final ajei i;

    public static final class a implements android.support.design.widget.AppBarLayout.b {
        private /* synthetic */ MemoriesGridNeonHeaderPresenter a;

        a(MemoriesGridNeonHeaderPresenter memoriesGridNeonHeaderPresenter) {
            this.a = memoriesGridNeonHeaderPresenter;
        }

        public final void a(AppBarLayout appBarLayout, int i) {
            MemoriesGridNeonHeaderPresenter memoriesGridNeonHeaderPresenter = this.a;
            int i2 = 1;
            if (i == 0) {
                i2 = 3;
            } else {
                if ((i == (-appBarLayout.c()) ? 1 : null) != 1) {
                    i2 = 2;
                }
            }
            memoriesGridNeonHeaderPresenter.c = i2;
        }
    }

    static final class d<T> implements ajfb<Rect> {
        private /* synthetic */ View a;
        private /* synthetic */ MemoriesGridNeonHeaderPresenter b;

        d(View view, MemoriesGridNeonHeaderPresenter memoriesGridNeonHeaderPresenter) {
            this.a = view;
            this.b = memoriesGridNeonHeaderPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.height = this.b.b + rect.top;
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    static final class e<T> implements ajfb<Set<? extends olj>> {
        private /* synthetic */ MemoriesGridNeonHeaderPresenter a;

        e(MemoriesGridNeonHeaderPresenter memoriesGridNeonHeaderPresenter) {
            this.a = memoriesGridNeonHeaderPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            MemoriesGridNeonHeaderPresenter memoriesGridNeonHeaderPresenter;
            if (((Set) obj).isEmpty()) {
                if (this.a.d) {
                    memoriesGridNeonHeaderPresenter = this.a;
                    memoriesGridNeonHeaderPresenter.d = false;
                    memoriesGridNeonHeaderPresenter.b();
                    memoriesGridNeonHeaderPresenter.a().d.a((achg) ojc.d, true, false, null);
                }
            } else if (!this.a.d) {
                memoriesGridNeonHeaderPresenter = this.a;
                pbe pbe = (pbe) memoriesGridNeonHeaderPresenter.getTarget();
                if (pbe != null) {
                    MemoriesAllPagesRecyclerView a = pbe.a();
                    if (a != null) {
                        Context context = a.getContext();
                        if (context != null) {
                            memoriesGridNeonHeaderPresenter.d = true;
                            memoriesGridNeonHeaderPresenter.b();
                            ozn a2 = memoriesGridNeonHeaderPresenter.a();
                            akcr.b(context, "context");
                            defpackage.fsy.a aVar = new defpackage.fsy.a(context, a2.d, ojc.d);
                            zkq zkq = a2.c;
                            akcr.b(zkq, "insetsDetector");
                            aVar.a = zkq;
                            Object string = aVar.h.getString(R.string.action_menu_select);
                            akcr.a(string, "context.getString(textId)");
                            akcr.b(string, "text");
                            aVar.g.a(string);
                            Object a3 = a2.a();
                            String str = "multiSelectController";
                            akcr.a(a3, str);
                            fta ozl = new ozl(a3, a2.e);
                            akcr.b(ozl, "button");
                            aVar.d = ozl;
                            a3 = a2.a();
                            akcr.a(a3, str);
                            aVar = aVar.a(new ozh(a3, a2.e));
                            a3 = a2.a();
                            akcr.a(a3, str);
                            aVar = aVar.a(new ozg(a3, a2.e));
                            a3 = a2.a();
                            akcr.a(a3, str);
                            aVar = aVar.a(new ozi(a3, a2.e));
                            a3 = a2.a();
                            akcr.a(a3, str);
                            aVar = aVar.a(new ozk(a3, a2.e));
                            a3 = a2.a();
                            akcr.a(a3, str);
                            aVar = aVar.a(new ozj(a3, a2.e));
                            Object a4 = a2.a();
                            akcr.a(a4, str);
                            aVar = aVar.a(new ozf(a4, a2.f, a2.g, (zfw) a2.a.b(), a2.e));
                            akbk bVar = new defpackage.ozn.b(a2);
                            akcr.b(bVar, "callback");
                            aVar.c = new defpackage.fsy.a.b(aVar, bVar);
                            aVar.g.a(R.id.subscreen_top_right, new defpackage.fsy.a.c(aVar, bVar));
                            fsy fsy = new fsy(aVar.f, aVar.j, aVar.d, aVar.e, aVar.c, aVar.a, (byte) 0);
                            a2.d.a((achd) fsy, fsy.c, null);
                        }
                    }
                }
            }
        }
    }

    static final class f<T> implements ajfb<ajxw> {
        private /* synthetic */ pbe a;

        f(pbe pbe) {
            this.a = pbe;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b().b();
        }
    }

    static final class g<T> implements ajfl<Rect> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Rect rect = (Rect) obj;
            akcr.b(rect, "rect");
            return rect.top > 0;
        }
    }

    static final class h<T> implements ajfb<Boolean> {
        private /* synthetic */ List a;

        h(List list) {
            this.a = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            for (View view : this.a) {
                akcr.a(obj, Property.VISIBLE);
                view.setVisibility(obj.booleanValue() ? 0 : 4);
            }
        }
    }

    static final class b extends akcs implements akbk<ozm> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ozm) this.a.get();
        }
    }

    static final class c extends akcs implements akbk<ozn> {
        private /* synthetic */ MemoriesGridNeonHeaderPresenter a;

        c(MemoriesGridNeonHeaderPresenter memoriesGridNeonHeaderPresenter) {
            this.a = memoriesGridNeonHeaderPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ozn) this.a.e.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(MemoriesGridNeonHeaderPresenter.class), "multiSelectController", "getMultiSelectController()Lcom/snap/memories/lib/grid/multiselect/MultiSelectController;"), new akdc(akde.a(MemoriesGridNeonHeaderPresenter.class), "multiSelectLauncher", "getMultiSelectLauncher()Lcom/snap/memories/lib/grid/multiselect/MultiSelectLauncher;")};
    }

    public MemoriesGridNeonHeaderPresenter(ajwy<ozn> ajwy, ajwy<ozm> ajwy2) {
        akcr.b(ajwy, "multiSelectLauncherProvider");
        akcr.b(ajwy2, "multiSelectControllerProvider");
        this.e = ajwy;
        this.f = ajxh.a(new b(ajwy2));
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Unit>()");
        this.a = (ajws) ajwl;
        this.c = 3;
        this.h = new a(this);
        this.i = new ajei();
    }

    private final ozm c() {
        return (ozm) this.f.b();
    }

    /* Access modifiers changed, original: final */
    public final ozn a() {
        return (ozn) this.g.b();
    }

    /* renamed from: a */
    public final void takeTarget(pbe pbe) {
        akcr.b(pbe, "target");
        super.takeTarget(pbe);
        pbe.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        pbe pbe = (pbe) getTarget();
        if (pbe != null) {
            MemoriesAllPagesRecyclerView a = pbe.a();
            if (a != null) {
                a.a = this.d ^ 1;
                LayoutParams layoutParams = a.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = c().a() ? this.b : 0;
                    a.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    public final void dropTarget() {
        this.c = 3;
        pbe pbe = (pbe) getTarget();
        if (pbe != null) {
            j lifecycle = pbe.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        pbe pbe = (pbe) getTarget();
        if (pbe != null) {
            pbe.b().a(this.h);
            ajej f = this.a.f((ajfb) new f(pbe));
            akcr.a((Object) f, "headerExpansionSubject.s…anded(true)\n            }");
            ajvv.a(f, this.i);
            View findViewById = pbe.b().findViewById(R.id.memories_grid_neon_header);
            Object context = pbe.b().getContext();
            akcr.a(context, "headerView.context");
            this.b = context.getResources().getDimensionPixelSize(R.dimen.neon_header_height);
            context = pbe.d().get();
            akcr.a(context, "insetsDetector.get()");
            f = ((zkq) context).a().a((ajfl) g.a).f((ajfb) new d(findViewById, this));
            akcr.a((Object) f, "insetsDetector.get().win…          }\n            }");
            ajvv.a(f, this.i);
            r1 = new View[3];
            Object findViewById2 = pbe.b().findViewById(R.id.memories_grid_neon_header);
            akcr.a(findViewById2, "headerView.findViewById(…emories_grid_neon_header)");
            r1[0] = findViewById2;
            context = pbe.b().findViewById(R.id.memories_grid_tab_container_background_left);
            akcr.a(context, "headerView.findViewById(…ontainer_background_left)");
            r1[1] = context;
            context = pbe.b().findViewById(R.id.memories_grid_tab_container_background_right);
            akcr.a(context, "headerView.findViewById(…ntainer_background_right)");
            r1[2] = context;
            ajej f2 = pbe.c().f((ajfb) new h(ajym.b((Object[]) r1)));
            akcr.a((Object) f2, "neonHeaderBackgroundVisi…          }\n            }");
            ajvv.a(f2, this.i);
            f2 = c().c().f((ajfb) new e(this));
            akcr.a((Object) f2, "multiSelectController.ob…  }\n                    }");
            ajvv.a(f2, this.i);
        }
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        pbe pbe = (pbe) getTarget();
        if (pbe != null) {
            pbe.b().b(this.h);
        }
        this.i.a();
    }
}
