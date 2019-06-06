package defpackage;

import android.content.Context;
import android.support.v4.view.ViewPager.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.snapchat.android.R;
import com.snapchat.map.feature.carousel.MapCarouselUserClusterLinearLayoutManager;

/* renamed from: acnq */
public final class acnq implements acnw<acow> {
    private final LayoutInflater a;
    private final acnk b;
    private final acpv c;

    public acnq(LayoutInflater layoutInflater, acpv acpv, acnk acnk) {
        this.a = layoutInflater;
        this.c = acpv;
        this.b = acnk;
    }

    public final Object a(ViewGroup viewGroup, int i, int i2, acnx<acow> acnx) {
        Context context = viewGroup.getContext();
        acow acow = (acow) acnx.a(i);
        acnz acnz = new acnz(context);
        acny acny = new acny(context, this.a, this.c, this.b);
        acnz.a(acny);
        acnz.getClass();
        this.b.j.a(acny.a.f((ajfb) new -$$Lambda$acnq$r4_U9JCH2FFeNTj6SPtaHj2XXgc(acnz, new -$$Lambda$4Zy87Iaqeb1vp50Y4buxXuSAET0(acnz))));
        acnz.setClipToPadding(false);
        acnz.b = abso.a(10.0f, acnz.getContext());
        acnz.setLayoutParams(new c());
        acnz.setLayoutManager(new MapCarouselUserClusterLinearLayoutManager(context));
        acnz.a(acow);
        acnz.setTag(R.id.position_id, Integer.valueOf(i2));
        viewGroup.addView(acnz);
        return acnz;
    }
}
