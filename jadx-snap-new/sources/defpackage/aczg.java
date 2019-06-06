package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import java.lang.ref.WeakReference;

/* renamed from: aczg */
final class aczg extends SurfaceView {
    final a a = new a(this);

    /* renamed from: aczg$a */
    static class a implements Callback {
        private final WeakReference<SurfaceView> a;
        private Surface b;

        public a(SurfaceView surfaceView) {
            this.a = new WeakReference(surfaceView);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SurfaceView surfaceView = (SurfaceView) this.a.get();
            if (surfaceView != null) {
                adcb.a("MapView Surface changed: {}, {}", this.b, Boolean.valueOf(surfaceView.isShown()));
            }
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            SurfaceView surfaceView = (SurfaceView) this.a.get();
            this.b = surfaceHolder.getSurface();
            if (surfaceView != null) {
                adcb.a("MapView Surface created: {}, {}", this.b, Boolean.valueOf(surfaceView.isShown()));
                return;
            }
            new StringBuilder("MapView Surface created ").append(this.b);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SurfaceView surfaceView = (SurfaceView) this.a.get();
            if (surfaceView != null) {
                adcb.a("MapView Surface destroyed: {}, {}", this.b, Boolean.valueOf(surfaceView.isShown()));
            } else {
                new StringBuilder("MapView Surface destroyed ").append(this.b);
            }
            this.b = null;
        }

        public final String toString() {
            String stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder("mSurface = ");
            if (this.b != null) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(this.b);
                stringBuilder3.append(": ");
                stringBuilder3.append(this.b.isValid());
                stringBuilder = stringBuilder3.toString();
            } else {
                stringBuilder = "null";
            }
            stringBuilder2.append(stringBuilder);
            return stringBuilder2.toString();
        }
    }

    public aczg(Context context) {
        super(context);
        getHolder().addCallback(this.a);
    }
}
