package defpackage;

import android.support.v4.view.ViewPager.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.snapchat.map.feature.carousel.MapCarouselView;
import java.util.List;

/* renamed from: acos */
public final class acos {
    public acnu a;
    final List<acot> b;
    private MapCarouselView c;

    /* renamed from: acos$a */
    static final class a implements Runnable {
        private /* synthetic */ aclg a;
        private /* synthetic */ MapCarouselView b;

        a(aclg aclg, MapCarouselView mapCarouselView) {
            this.a = aclg;
            this.b = mapCarouselView;
        }

        public final void run() {
            this.b.a(0, false);
            this.b.measure(0, 0);
            this.b.setVisibility(0);
        }
    }

    /* renamed from: acos$b */
    static final class b<T> implements acnx<Object> {
        private /* synthetic */ acnx a;

        b(acnx acnx) {
            this.a = acnx;
        }

        public final /* bridge */ /* synthetic */ Object a(int i) {
            return this.a;
        }
    }

    /* renamed from: acos$c */
    public static final class c implements e {
        private /* synthetic */ acos a;
        private /* synthetic */ aclg b;

        c(acos acos, aclg aclg) {
            this.a = acos;
            this.b = aclg;
        }

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            List list = this.a.b;
            acnu acnu = this.a.a;
            if (acnu == null) {
                akcr.a("mapCarouselAdapter");
            }
            ((acot) list.get(acnu.c(i))).a(this.b);
        }
    }

    /* renamed from: acos$d */
    static final class d<T> implements acnw<acot> {
        private /* synthetic */ acnx a;
        private /* synthetic */ LayoutInflater b;

        d(acnx acnx, LayoutInflater layoutInflater) {
            this.a = acnx;
            this.b = layoutInflater;
        }

        public final /* bridge */ /* synthetic */ Object a(ViewGroup viewGroup, int i, int i2, acnx acnx) {
            return ((acot) this.a.a(i)).a(viewGroup, this.b);
        }
    }

    /* renamed from: acos$e */
    static final class e<T> implements acnx<acot> {
        private /* synthetic */ acos a;

        e(acos acos) {
            this.a = acos;
        }

        public final /* synthetic */ Object a(int i) {
            return (acot) this.a.b.get(i);
        }
    }

    public acos(List<? extends acot> list) {
        akcr.b(list, "mapCarouselItems");
        this.b = list;
    }

    public final void a(ViewGroup viewGroup, aclg aclg) {
        akcr.b(viewGroup, "snapMapView");
        akcr.b(aclg, "snapMap");
        MapCarouselView mapCarouselView = this.c;
        if (mapCarouselView != null) {
            viewGroup.removeView(mapCarouselView);
        }
        mapCarouselView = new MapCarouselView(viewGroup.getContext());
        viewGroup.addView(mapCarouselView);
        this.c = mapCarouselView;
        LayoutParams layoutParams = mapCarouselView.getLayoutParams();
        layoutParams.height = -2;
        mapCarouselView.setLayoutParams(layoutParams);
        acnx eVar = new e(this);
        this.a = new acnu(new d(eVar, LayoutInflater.from(viewGroup.getContext())));
        acnu acnu = this.a;
        String str = "mapCarouselAdapter";
        if (acnu == null) {
            akcr.a(str);
        }
        acnu.a((acnx) new b(eVar));
        acnu = this.a;
        if (acnu == null) {
            akcr.a(str);
        }
        mapCarouselView.a((jz) acnu);
        mapCarouselView.g();
        LayoutParams layoutParams2 = mapCarouselView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams2;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.gravity = 80;
            layoutParams3.bottomMargin = (int) abtp.a(4.0f, mapCarouselView.getContext());
            mapCarouselView.setLayoutParams(layoutParams2);
            mapCarouselView.d((int) abtp.a(4.0f, mapCarouselView.getContext()));
            mapCarouselView.setVisibility(4);
            acnu = this.a;
            if (acnu == null) {
                akcr.a(str);
            }
            acnu.a(this.b, 0, 0);
            acnu = this.a;
            if (acnu == null) {
                akcr.a(str);
            }
            acnu.notifyDataSetChanged();
            mapCarouselView.a((e) new c(this, aclg));
            Object j = aclg.j();
            String str2 = "snapMap.viewHost";
            akcr.a(j, str2);
            j = j.j();
            if (j != null) {
                Object j2 = aclg.j();
                akcr.a(j2, str2);
                if (j2.e()) {
                    akcr.a(j, "mapController");
                    j = j.p();
                    akcr.a(j, "mapController.viewHolder");
                    j.a().postDelayed(new a(aclg, mapCarouselView), 500);
                } else {
                    return;
                }
            }
            this.c = mapCarouselView;
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
