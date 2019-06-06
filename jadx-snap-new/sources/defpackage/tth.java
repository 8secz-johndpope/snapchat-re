package defpackage;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: tth */
public final class tth extends ajed implements tqm, zma {
    public boolean a;
    public final ajwl<tqn> b;
    public boolean c;
    public ImmutableList<zmy> d;
    private ImmutableList<zmy> e;
    private final ajwl<znh<zmy>> f;

    public tth(tql tql) {
        akcr.b(tql, "initiallySelectedFilters");
        Object i = ajwl.i(new tqn(tql));
        akcr.a(i, "BehaviorSubject.createDe…nitiallySelectedFilters))");
        this.b = i;
        i = ImmutableList.of();
        String str = "ImmutableList.of()";
        akcr.a(i, str);
        this.e = i;
        i = ImmutableList.of();
        akcr.a(i, str);
        this.d = i;
        i = new ajwl();
        akcr.a(i, "BehaviorSubject.create()");
        this.f = i;
    }

    private final void a(int i) {
        if (this.a) {
            this.b.a(a().a(i));
        } else {
            this.b.a(new tqn(new tql(null, null, null, null, Integer.valueOf(i), null, 47)));
        }
    }

    private final void a(abzx abzx) {
        if (this.a) {
            this.b.a(a().a(abzx));
        } else {
            this.b.a(new tqn(new tql(null, abzx, null, null, null, null, 61)));
        }
    }

    private final void a(abzy abzy) {
        if (this.a) {
            this.b.a(a().a(abzy));
        } else {
            this.b.a(new tqn(new tql(null, null, ajyl.a(abzy), null, null, null, 59)));
        }
    }

    private final void a(acab acab) {
        if (this.a) {
            this.b.a(a().a(acab));
        } else {
            this.b.a(new tqn(new tql(null, null, null, ajyl.a(acab), null, null, 55)));
        }
    }

    private final void a(acae acae) {
        if (this.a) {
            this.b.a(a().a(acae));
        } else {
            this.b.a(new tqn(new tql(acae, null, null, null, null, null, 62)));
        }
    }

    private final void a(String str) {
        this.b.a(new tqn(new tql(null, null, null, null, null, str, 31)));
    }

    public final float a(zmy zmy, zmy zmy2, float f) {
        akcr.b(zmy, "leftViewModel");
        akcr.b(zmy2, "rightViewModel");
        if (this.a && !this.e.isEmpty()) {
            if (!this.c) {
                return MapboxConstants.MINIMUM_ZOOM;
            }
            zmy zmy3 = (zmy) this.e.get(0);
            if (zmy3.areItemsTheSame(zmy)) {
                return f - 1.0f;
            }
            if (zmy3.areItemsTheSame(zmy2)) {
                return f;
            }
        }
        return -1.0f;
    }

    public final tqn a() {
        Object p = this.b.p();
        if (p == null) {
            akcr.a();
        }
        return (tqn) p;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(ImmutableList<zmy> immutableList) {
        akcr.b(immutableList, "viewModels");
        if (!immutableList.isEmpty()) {
            zmy zmy = (zmy) immutableList.get(0);
            if (zmy instanceof tui) {
                a(((tui) zmy).a);
            } else if (zmy instanceof tuf) {
                a(((tuf) zmy).a);
            } else if (zmy instanceof ilj) {
                a(((ilj) zmy).c);
            } else if (zmy instanceof zvp) {
                a(((zvp) zmy).a);
            } else if (zmy instanceof tuh) {
                a(((tuh) zmy).a);
            } else if (zmy instanceof tue) {
                a(((tue) zmy).a);
            } else if (this.a) {
                this.b.a(a().e());
            } else {
                d();
            }
        }
        if (this.a) {
            if (!this.c) {
                this.e = immutableList;
            }
            return;
        }
        this.d = immutableList;
        this.e = immutableList;
    }

    public final void a(boolean z) {
        if (z != this.a) {
            if (z) {
                this.b.a(a().e());
            }
            this.f.a(new znf(z ? this.d : ajyw.a));
        }
        this.a = z;
    }

    public final ajdp<tqn> b() {
        return this.b;
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return this.f;
    }

    public final void d() {
        this.b.a(new tqn(new tql(null, null, null, null, null, null, 63)));
    }

    public final void onDispose() {
    }
}
