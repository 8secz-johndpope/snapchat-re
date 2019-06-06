package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snapchat.android.R;
import org.opencv.imgproc.Imgproc;

/* renamed from: lqp */
public final class lqp {
    static final lqp n;
    public static final lqp o;
    public static final lqp p;
    public final int a;
    final Integer b;
    final Integer c;
    final Integer d;
    final Integer e;
    final Integer f;
    final Integer g;
    final Integer h;
    final Integer i;
    final Integer j;
    final Integer k;
    final Integer l;
    final Integer m;
    private final Integer q;

    /* renamed from: lqp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        Integer valueOf = Integer.valueOf(R.id.lenses_camera_carousel_view_stub);
        Integer valueOf2 = Integer.valueOf(R.id.lenses_camera_touch_view_stub);
        Integer valueOf3 = Integer.valueOf(R.id.lenses_camera_lensbutton_view_stub);
        Integer valueOf4 = Integer.valueOf(R.id.lenses_camera_hint_view_stub);
        Integer valueOf5 = Integer.valueOf(R.id.lenses_camera_capture_tooltip_view_stub);
        Integer valueOf6 = Integer.valueOf(R.id.lenses_camera_carousel_tooltip_view_stub);
        Integer valueOf7 = Integer.valueOf(R.id.lenses_camera_debug_view_stub);
        Integer valueOf8 = Integer.valueOf(R.id.lenses_camera_slug_view_stub);
        Integer valueOf9 = Integer.valueOf(R.id.lenses_camera_text_input_view_stub);
        Integer num = valueOf;
        n = new lqp((int) R.layout.lenses_camera_composite_view, num, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, Integer.valueOf(R.id.lenses_camera_confidential_view_stub), Integer.valueOf(R.id.lenses_camera_upcoming_view_stub), Integer.valueOf(R.id.lenses_camera_snappables_view_stub), 4096);
        o = new lqp((int) R.layout.lenses_camera_composite_view_for_talk, num, null, null, null, null, null, null, null, null, null, null, null, 16380);
        p = new lqp((int) R.layout.lenses_camera_composite_view, Integer.valueOf(R.id.lenses_single_lens_icon_view_stub), valueOf2, null, valueOf4, valueOf5, null, valueOf7, valueOf8, valueOf9, Integer.valueOf(R.id.lenses_camera_confidential_view_stub), Integer.valueOf(R.id.lenses_camera_upcoming_view_stub), Integer.valueOf(R.id.lenses_camera_snappables_view_stub), 4168);
    }

    private lqp(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.q = num5;
        this.f = num6;
        this.g = num7;
        this.h = num8;
        this.i = num9;
        this.j = num10;
        this.k = num11;
        this.l = num12;
        this.m = num13;
    }

    private static lqp a(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        return new lqp(i, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13);
    }

    public static /* synthetic */ lqp a(lqp lqp, int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, int i2) {
        lqp lqp2 = lqp;
        int i3 = i2;
        return lqp.a((i3 & 1) != 0 ? lqp2.a : i, (i3 & 2) != 0 ? lqp2.b : num, (i3 & 4) != 0 ? lqp2.c : num2, (i3 & 8) != 0 ? lqp2.d : num3, (i3 & 16) != 0 ? lqp2.e : num4, (i3 & 32) != 0 ? lqp2.q : num5, (i3 & 64) != 0 ? lqp2.f : num6, (i3 & 128) != 0 ? lqp2.g : num7, (i3 & 256) != 0 ? lqp2.h : num8, (i3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? lqp2.i : num9, (i3 & Imgproc.INTER_TAB_SIZE2) != 0 ? lqp2.j : num10, (i3 & ItemAnimator.FLAG_MOVED) != 0 ? lqp2.k : num11, (i3 & 4096) != 0 ? lqp2.l : num12, (i3 & 8192) != 0 ? lqp2.m : num13);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lqp) {
                lqp lqp = (lqp) obj;
                if (!((this.a == lqp.a ? 1 : null) != null && akcr.a(this.b, lqp.b) && akcr.a(this.c, lqp.c) && akcr.a(this.d, lqp.d) && akcr.a(this.e, lqp.e) && akcr.a(this.q, lqp.q) && akcr.a(this.f, lqp.f) && akcr.a(this.g, lqp.g) && akcr.a(this.h, lqp.h) && akcr.a(this.i, lqp.i) && akcr.a(this.j, lqp.j) && akcr.a(this.k, lqp.k) && akcr.a(this.l, lqp.l) && akcr.a(this.m, lqp.m))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        int i2 = 0;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.c;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.d;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.e;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.q;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.f;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.g;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.h;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.i;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.j;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.k;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.l;
        i = (i + (num != null ? num.hashCode() : 0)) * 31;
        num = this.m;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutConfiguration(root=");
        stringBuilder.append(this.a);
        stringBuilder.append(", carouselViewStubIdRes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", touchViewStubIdRes=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lensButtonViewStubIdRes=");
        stringBuilder.append(this.d);
        stringBuilder.append(", hintViewStubIdRes=");
        stringBuilder.append(this.e);
        stringBuilder.append(", tooltipViewStubIdRes=");
        stringBuilder.append(this.q);
        stringBuilder.append(", carouselTooltipViewStubIdRes=");
        stringBuilder.append(this.f);
        stringBuilder.append(", debugViewStubIdRes=");
        stringBuilder.append(this.g);
        stringBuilder.append(", slugViewStubIdRes=");
        stringBuilder.append(this.h);
        stringBuilder.append(", textInputViewStubIdRes=");
        stringBuilder.append(this.i);
        stringBuilder.append(", confidentialViewStubIdRes=");
        stringBuilder.append(this.j);
        stringBuilder.append(", upcomingViewStubIdRes=");
        stringBuilder.append(this.k);
        stringBuilder.append(", explorerViewStubIdRes=");
        stringBuilder.append(this.l);
        stringBuilder.append(", snappablesViewStubIdRes=");
        stringBuilder.append(this.m);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
