package defpackage;

import defpackage.ebl.a;
import defpackage.wjt.h;
import defpackage.wjt.i;
import defpackage.wjt.j;
import java.util.concurrent.Callable;

/* renamed from: wjs */
public final class wjs implements ihe {
    private final wjr a;
    private final wjt b;

    public wjs(wjr wjr, wjt wjt) {
        akcr.b(wjr, "savedInstanceHandler");
        akcr.b(wjt, "mediaRecoveryStartupListener");
        this.a = wjr;
        this.b = wjt;
    }

    public final ajcx a(boolean z) {
        if (z) {
            wjv wjv = this.a.a;
            if (wjv != null) {
                Object a;
                String str;
                wjt wjt = this.b;
                akcr.b(wjv, "state");
                long currentTimeMillis = System.currentTimeMillis();
                if (((wkk) wjt.d.get()).c()) {
                    a = ajvo.a(ajhn.a);
                    str = "Completable.complete()";
                } else {
                    Object a2 = wjt.c.b(wjt.a).b((ajdw) wjt.b.h()).a((ajfl) h.a).f(i.a).a((ajeb) ajdx.b((Callable) j.a));
                    akcr.a(a2, "mediaPackageManager.look…snap\")\n                })");
                    ajdv ajdv = wjt.f;
                    ebo ebo = new ebo(a2, wjv.a);
                    aagz aagz = aagz.ANDROID_BACKGROUND_DESTROYED;
                    Object g = wjt.e.g(dnd.MEDIA_RECOVERY_CRASH_COUNT);
                    akcr.a(g, "configProvider.getIntCon…DIA_RECOVERY_CRASH_COUNT)");
                    ajdv.a(new ebm(ebo, new a(aagz, g), currentTimeMillis));
                    a = a2.e();
                    str = "mediaPackages.ignoreElement()";
                }
                akcr.a(a, str);
                return a;
            }
        }
        return null;
    }
}
