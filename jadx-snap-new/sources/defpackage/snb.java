package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.google.common.base.Predicate;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.opera.view.FitWidthImageView;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.siw.c;

/* renamed from: snb */
public class snb extends slm {
    public static final Predicate<sqh> a = new 1();
    final ImageView b;
    ObjectAnimator c;
    c d;
    private final ski e;

    /* renamed from: snb$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return szt.a(szv.a(AppContext.get()));
        }
    }

    /* renamed from: snb$2 */
    class 2 implements ski {
        2() {
        }

        public final void handleEvent(String str, szw szw, szw szw2) {
            snb snb;
            if (szw2.a(skm.a, false)) {
                snb = snb.this;
                snb.m();
                c a = snb.D().a(snb.b.getMeasuredWidth(), snb.b.getMeasuredHeight(), Config.ARGB_8888);
                Bitmap c = a.c();
                c.eraseColor(-16777216);
                snb.z().a(c);
                snb.n();
                snb.d = snb.A().a.a(c, c.getHeight(), c.getWidth(), 4, null, null);
                if (snb.d != null) {
                    Bitmap c2 = snb.d.c();
                    if (abss.a().l()) {
                        snb.a(c);
                        snb.a(c2);
                    }
                }
                a.b();
                if (snb.d != null) {
                    snb.b.setVisibility(0);
                    snb.b.setImageBitmap(snb.d.c());
                    snb.c = ObjectAnimator.ofFloat(snb.b, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                    snb.c.setDuration(167);
                    snb.c.start();
                }
                return;
            }
            snb = snb.this;
            snb.c = ObjectAnimator.ofFloat(snb.b, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
            snb.c.setDuration(167);
            snb.c.addListener(new 3());
            snb.c.start();
        }
    }

    /* renamed from: snb$3 */
    class 3 extends tau {
        3() {
        }

        public final void onAnimationEnd(Animator animator) {
            snb.this.m();
        }
    }

    public snb(Context context) {
        this(new FitWidthImageView(context));
    }

    private snb(ImageView imageView) {
        this.e = new 2();
        this.b = imageView;
    }

    static boolean a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width];
        boolean z = true;
        for (int i = 0; i < height; i++) {
            bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = iArr[i2];
                i3 = (Color.red(i3) > 1 || Color.green(i3) > 1 || Color.blue(i3) > 1) ? 0 : 1;
                z &= i3;
            }
        }
        return z;
    }

    public final void a(szw szw) {
        C().a("TOGGLE_BLUR", this.e);
    }

    public final void b(szw szw) {
        C().b("TOGGLE_BLUR", this.e);
        m();
    }

    public final View e() {
        return this.b;
    }

    public final String f() {
        return "BLURRED_IMAGE";
    }

    public final boolean h() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void m() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.c = null;
        }
        n();
        this.d = null;
        D().a(this.b);
        this.b.setVisibility(8);
    }

    /* Access modifiers changed, original: final */
    public final void n() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.b();
        }
    }
}
