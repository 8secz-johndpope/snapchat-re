package defpackage;

import android.view.View;
import android.view.animation.ScaleAnimation;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: raz */
public final class raz {
    public final AtomicBoolean a = new AtomicBoolean(false);
    private final List<View> b = new ArrayList();
    private final ScaleAnimation c = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, 1, MapboxConstants.MINIMUM_ZOOM, 1, MapboxConstants.MINIMUM_ZOOM);

    public raz() {
        this.c.setDuration(150);
        this.c.setRepeatMode(2);
        this.c.setRepeatCount(1);
    }

    public final void a() {
        if (this.a.compareAndSet(false, true)) {
            for (View startAnimation : this.b) {
                startAnimation.startAnimation(this.c);
            }
        }
    }

    public final void a(View... viewArr) {
        akcr.b(viewArr, "view");
        ajyr.a((Collection) this.b, (Object[]) viewArr);
    }
}
