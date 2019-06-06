package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: abus */
public final class abus extends TextureView {
    final Set<SurfaceTextureListener> a = Sets.newCopyOnWriteArraySet();
    public a b;
    private SurfaceTextureListener c;

    /* renamed from: abus$1 */
    class 1 implements SurfaceTextureListener {
        1() {
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            for (SurfaceTextureListener onSurfaceTextureAvailable : abus.this.a) {
                onSurfaceTextureAvailable.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = 1;
            for (SurfaceTextureListener onSurfaceTextureDestroyed : abus.this.a) {
                i &= onSurfaceTextureDestroyed.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return i;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            for (SurfaceTextureListener onSurfaceTextureSizeChanged : abus.this.a) {
                onSurfaceTextureSizeChanged.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            for (SurfaceTextureListener onSurfaceTextureUpdated : abus.this.a) {
                onSurfaceTextureUpdated.onSurfaceTextureUpdated(surfaceTexture);
            }
        }
    }

    /* renamed from: abus$a */
    public interface a {
        void onDetach();
    }

    public abus(Context context) {
        super(context);
        super.setSurfaceTextureListener(new 1());
    }

    public final void a(SurfaceTextureListener surfaceTextureListener) {
        this.a.add(surfaceTextureListener);
    }

    public final void b(SurfaceTextureListener surfaceTextureListener) {
        this.a.remove(surfaceTextureListener);
    }

    public final SurfaceTextureListener getSurfaceTextureListener() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onDetach();
        }
        super.onDetachedFromWindow();
    }

    public final void setSurfaceTextureListener(SurfaceTextureListener surfaceTextureListener) {
        SurfaceTextureListener surfaceTextureListener2 = this.c;
        if (surfaceTextureListener2 != null) {
            this.a.remove(surfaceTextureListener2);
        }
        if (surfaceTextureListener != null) {
            this.a.add(surfaceTextureListener);
        }
        this.c = surfaceTextureListener;
    }
}
