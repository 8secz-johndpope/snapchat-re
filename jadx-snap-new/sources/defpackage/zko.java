package defpackage;

import android.os.Build.VERSION;
import android.view.WindowInsets;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zko */
public final class zko {
    private final AtomicLong a = new AtomicLong(0);
    private final ajei b;

    public zko(ajei ajei, akbk<? extends ajdx<Long>> akbk) {
        akcr.b(ajei, "compositeDisposable");
        akcr.b(akbk, "serverDisplayTopCutoutHeightSingleFactory");
        this.b = ajei;
        this.b.a(((ajdx) akbk.invoke()).e((ajfb) new zkp(new akbl<Long, ajxw>(this.a) {
            public final String getName() {
                return "set";
            }

            public final akej getOwner() {
                return akde.a(AtomicLong.class);
            }

            public final String getSignature() {
                return "set(J)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((AtomicLong) this.receiver).set(((Number) obj).longValue());
                return ajxw.a;
            }
        })));
    }

    public final int a(WindowInsets windowInsets) {
        if (VERSION.SDK_INT < 28) {
            return (int) this.a.get();
        }
        if ((windowInsets != null ? windowInsets.getDisplayCutout() : null) != null) {
            Object displayCutout = windowInsets.getDisplayCutout();
            String str = "rootWindowInsets.displayCutout";
            akcr.a(displayCutout, str);
            if (displayCutout.getSafeInsetTop() != 0) {
                Object displayCutout2 = windowInsets.getDisplayCutout();
                akcr.a(displayCutout2, str);
                return displayCutout2.getSafeInsetTop();
            }
        }
        return 0;
    }
}
