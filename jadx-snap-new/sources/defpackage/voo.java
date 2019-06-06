package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;

/* renamed from: voo */
public final class voo {
    public final ajxe a;
    private final vop b;

    /* renamed from: voo$a */
    static final class a extends akcs implements akbk<abtl> {
        private /* synthetic */ voo a;

        a(voo voo) {
            this.a = voo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            akcr.a((Object) eglGetDisplay, "eglDisplay");
            Object obj = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            akcr.b(eglGetDisplay, "dpy");
            akcr.b(obj, "attrib_list");
            akcr.b(eGLConfigArr, "configs");
            akcr.b(iArr, "num_config");
            EGLConfig eGLConfig = !EGL14.eglChooseConfig(eglGetDisplay, obj, 0, eGLConfigArr, 0, 1, iArr, 0) ? null : eGLConfigArr[0];
            int[] iArr2 = new int[2];
            return (eGLConfig != null && vop.a(eglGetDisplay, eGLConfig, 12332, iArr2, 0) && vop.a(eglGetDisplay, eGLConfig, 12330, iArr2, 1)) ? new abtl(iArr2[0], iArr2[1]) : new abtl(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(voo.class), "maxPbufferSize", "getMaxPbufferSize()Lcom/snapchat/android/framework/ui/Resolution;");
    }

    public voo() {
        this(new vop());
    }

    private voo(vop vop) {
        akcr.b(vop, "eglWrapper");
        this.b = vop;
        this.a = ajxh.a(new a(this));
    }
}
