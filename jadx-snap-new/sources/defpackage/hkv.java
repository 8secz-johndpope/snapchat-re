package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: hkv */
public final class hkv {
    private final ajxe a;
    private final yui b;

    /* renamed from: hkv$a */
    static final class a extends akcs implements akbk<Resources> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "applicationContext.get()");
            return ((Context) obj).getResources();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hkv.class), "resources", "getResources()Landroid/content/res/Resources;");
    }

    public hkv(ajwy<Context> ajwy, yui yui) {
        akcr.b(ajwy, "applicationContext");
        akcr.b(yui, "optInNotifConfiguration");
        this.b = yui;
        this.a = ajxh.a(new a(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final Resources a() {
        return (Resources) this.a.b();
    }

    /* Access modifiers changed, original: final */
    public final sde b() {
        return this.b.c ? sde.GENERIC : sde.DISPLAY_ONLY;
    }
}
