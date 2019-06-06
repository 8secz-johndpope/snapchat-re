package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.commerce.lib.views.CarouselIndicator;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: foh */
public final class foh extends tih implements e, fjd {
    private static final List<View> a = new ArrayList();
    private final List<e> b = new ArrayList();
    private CarouselIndicator c;
    private ViewPager d;
    private View e;
    private int m;
    private zke n;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = layoutInflater.inflate(R.layout.url_image_view_pager_fragment_layout, viewGroup, false);
        this.d = (ViewPager) this.e.findViewById(R.id.url_images_vp);
        this.c = (CarouselIndicator) this.e.findViewById(R.id.url_images_carousel_indicator);
        View findViewById = this.e.findViewById(R.id.top_padding_view);
        View findViewById2 = this.e.findViewById(R.id.bottom_padding_view);
        -$$Lambda$foh$WArxqejCQgip8UFF9QK0dGg_hig -__lambda_foh_warxqejcqgip8uff9qk0dgg_hig = new -$$Lambda$foh$WArxqejCQgip8UFF9QK0dGg_hig(this);
        findViewById.setOnClickListener(-__lambda_foh_warxqejcqgip8uff9qk0dgg_hig);
        findViewById2.setOnClickListener(-__lambda_foh_warxqejcqgip8uff9qk0dgg_hig);
        Context g = g();
        View view = this.e;
        List list = a;
        findViewById.setOnTouchListener(new abum(g, view, view, list, list, new -$$Lambda$7ucDLImCJOgDDBMpUMleZdMcOhQ(this)));
        this.d.a((e) this);
        return this.e;
    }

    public final void a() {
        d();
    }

    public final void a(Context context, Bundle bundle, boolean z, tgq tgq, zkf zkf, FragmentActivity fragmentActivity, fv fvVar) {
        super.a(context, bundle, z, tgq, zkf, fragmentActivity, fvVar);
    }

    public final void a(e eVar) {
        if (eVar != null) {
            this.b.add(eVar);
        }
    }

    public final void a(zke zke) {
        this.n = zke;
    }

    public final void b() {
        zke zke = this.n;
        if (zke != null) {
            zke.a(frh.a);
        }
    }

    public final void c() {
        this.b.clear();
    }

    public final void d() {
        this.i.onBackPressed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCreateCarouselIndicator(fqc fqc) {
        if (fqc.a == 1) {
            CarouselIndicator carouselIndicator = this.c;
            if (carouselIndicator != null) {
                carouselIndicator.setVisibility(8);
            }
            return;
        }
        int i = fqc.a;
        int i2 = fqc.b;
        CarouselIndicator carouselIndicator2 = this.c;
        if (carouselIndicator2 != null) {
            carouselIndicator2.setVisibility(0);
            this.c.a(i);
            this.c.b(i2);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLoadImages(fqj fqj) {
        List list = fqj.a;
        int i = fqj.b;
        this.m = list.size();
        this.d.a(new fkp(list, this));
        this.d.b(i);
    }

    public final void onPageScrollStateChanged(int i) {
        for (e onPageScrollStateChanged : this.b) {
            onPageScrollStateChanged.onPageScrollStateChanged(i);
        }
    }

    public final void onPageScrolled(int i, float f, int i2) {
        for (e onPageScrolled : this.b) {
            onPageScrolled.onPageScrolled(i, f, i2);
        }
    }

    public final void onPageSelected(int i) {
        for (e onPageSelected : this.b) {
            onPageSelected.onPageSelected(i);
        }
        zke zke = this.n;
        if (zke != null) {
            zke.a(new frl(i, this.m));
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUpdateCarouselIndicator(fso fso) {
        int i = fso.a;
        CarouselIndicator carouselIndicator = this.c;
        if (carouselIndicator != null) {
            carouselIndicator.b(i);
        }
    }
}
