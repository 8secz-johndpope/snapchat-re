package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gpd */
public final class gpd {
    boolean a = true;
    private final zfw b = zgb.a(gpc.a.callsite("UserAuthStoreReader"));
    private final ajdx<SharedPreferences> c;
    private ajdx<gpa> d;

    public gpd(Context context) {
        this.c = ajdx.c(new -$$Lambda$gpd$vImqgF-p18yTkO6exU9rdmLZghs(context)).a().b((ajdw) this.b.f());
    }

    private ajdx<gpa> e() {
        this.d = this.c.f(-$$Lambda$gpd$AFOdLzZMobw5dT1hLjSvfFHtesQ.INSTANCE).b((ajdw) this.b.f()).a();
        this.d.c();
        this.a = false;
        return this.d;
    }

    private /* synthetic */ Boolean f() {
        return Boolean.valueOf(this.a);
    }

    public final void a() {
        e();
    }

    public final ajdx<gpa> b() {
        return ajdx.c(new -$$Lambda$gpd$w5tDoty86F463sIuI_IwmXHStZw(this)).b((ajdw) this.b.l()).a(new -$$Lambda$gpd$lzcn74hNv7X8a8OVcfjXudRQRFU(this)).a((ajdw) this.b.f());
    }

    public final gpa c() {
        if (this.a) {
            e();
        }
        return (gpa) this.d.b();
    }

    public final void d() {
        this.a = true;
    }
}
