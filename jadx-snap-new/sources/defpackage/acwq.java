package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: acwq */
public final class acwq implements Renderer {
    final b[] a;
    private final GLSurfaceView b;

    /* renamed from: acwq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acwq$b */
    public interface b {
        boolean b();

        void c();
    }

    static {
        a aVar = new a();
    }

    public acwq(GLSurfaceView gLSurfaceView, b[] bVarArr) {
        akcr.b(gLSurfaceView, "view");
        akcr.b(bVarArr, "delegates");
        this.b = gLSurfaceView;
        this.a = bVarArr;
    }

    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16384);
        for (b b : this.a) {
            if (b.b()) {
                this.b.requestRender();
            }
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClear(16384);
        GLES20.glEnable(3042);
        GLES20.glBlendEquation(32774);
        GLES20.glBlendFunc(770, 771);
    }
}
