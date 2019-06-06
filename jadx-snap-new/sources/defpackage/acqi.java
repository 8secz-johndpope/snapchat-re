package defpackage;

import android.content.res.Resources;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.snapchat.android.R;

/* renamed from: acqi */
public final class acqi {
    public acxz a;
    public final ajxe b = ajxh.a(new b(this));
    final Resources c;
    private final ajxe d = ajxh.a(a.a);

    /* renamed from: acqi$a */
    static final class a extends akcs implements akbk<LinearInterpolator> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinearInterpolator();
        }
    }

    /* renamed from: acqi$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ acqi a;

        b(acqi acqi) {
            this.a = acqi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.getString(R.string.egg_hunt_egg_too_far_label);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acqi.class), "linearInterpolator", "getLinearInterpolator()Landroid/view/animation/LinearInterpolator;"), new akdc(akde.a(acqi.class), "outOfRangeText", "getOutOfRangeText()Ljava/lang/String;")};
    }

    public acqi(Resources resources) {
        akcr.b(resources, "resources");
        this.c = resources;
    }

    public final LinearInterpolator a() {
        return (LinearInterpolator) this.d.b();
    }

    public final void a(aclg aclg) {
        akcr.b(aclg, "snapMap");
        long currentTimeMillis = System.currentTimeMillis();
        acxz acxz = this.a;
        if (acxz != null) {
            acxz.a(currentTimeMillis, (Interpolator) a());
        }
        this.a = null;
        aclg.j().m();
    }
}
