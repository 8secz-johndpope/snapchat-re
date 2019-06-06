package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Iterator;

/* renamed from: tag */
public final class tag {
    public float a = 1.0f;
    private final abpx<a> b = new abpx();

    /* renamed from: tag$a */
    public interface a {
        void a(float f);
    }

    /* renamed from: tag$b */
    public static class b {
        public static final tag a = new tag();
    }

    public final void a(float f) {
        f = Math.max(Math.min(f, 1.0f), MapboxConstants.MINIMUM_ZOOM);
        this.a = f;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f);
        }
    }

    public final void a(a aVar) {
        this.b.c(aVar);
    }
}
