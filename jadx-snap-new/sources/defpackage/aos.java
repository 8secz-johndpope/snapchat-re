package defpackage;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: aos */
public final class aos<T extends Drawable> implements aov<T> {
    private final aoy<T> a;
    private final int b;
    private aot<T> c;
    private aot<T> d;

    /* renamed from: aos$a */
    static class a implements defpackage.aox.a {
        private final int a;

        a(int i) {
            this.a = i;
        }

        public final Animation a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(MapboxConstants.MINIMUM_ZOOM, 1.0f);
            alphaAnimation.setDuration((long) this.a);
            return alphaAnimation;
        }
    }

    public aos() {
        this(MapboxConstants.ANIMATION_DURATION);
    }

    public aos(int i) {
        this(new aoy(new a(i)), i);
    }

    private aos(aoy<T> aoy, int i) {
        this.a = aoy;
        this.b = i;
    }

    public final aou<T> a(boolean z, boolean z2) {
        if (z) {
            return aow.a;
        }
        if (z2) {
            if (this.c == null) {
                this.c = new aot(this.a.a(false, true), this.b);
            }
            return this.c;
        }
        if (this.d == null) {
            this.d = new aot(this.a.a(false, false), this.b);
        }
        return this.d;
    }
}
