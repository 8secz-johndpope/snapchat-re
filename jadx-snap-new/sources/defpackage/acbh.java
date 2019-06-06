package defpackage;

import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acbh */
public final class acbh {
    private acbg a;
    private a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private float f = Float.MIN_NORMAL;

    /* renamed from: acbh$a */
    public interface a {
        void a();
    }

    /* renamed from: acbh$b */
    public static class b implements a {
        private float a;
        private float b;
        private boolean c;
        private ViewGroup d;

        public b() {
            this((byte) 0);
        }

        private b(byte b) {
            this.a = MapboxConstants.MINIMUM_ZOOM;
            this.b = MapboxConstants.MINIMUM_ZOOM;
            this.d = null;
        }

        public final void a() {
            this.c = false;
        }
    }

    public acbh(acbg acbg, a aVar) {
        this.a = acbg;
        this.b = aVar;
    }

    public final void a() {
        this.d = true;
        this.f = Float.MIN_NORMAL;
        this.b.a();
        this.e = false;
        this.c = false;
    }
}
