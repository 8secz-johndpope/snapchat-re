package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: abjx */
public interface abjx {

    /* renamed from: abjx$a */
    public static final class a {
        private final Object a;

        public a(Object obj) {
            if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
                this.a = obj;
                return;
            }
            throw new IllegalArgumentException("Invalid surface object");
        }

        public final boolean a() {
            return this.a instanceof SurfaceTexture;
        }

        public final Surface b() {
            return (Surface) this.a;
        }

        public final SurfaceTexture c() {
            return (SurfaceTexture) this.a;
        }
    }

    a a();

    void b();

    void c();
}
