package defpackage;

import com.google.common.base.Optional;

/* renamed from: dje */
public abstract class dje {
    private zym a;
    private djf b;
    private ilv c;
    private zym d;

    protected dje(djf djf, zym zym, ilv ilv) {
        this.b = djf;
        this.a = zym;
        this.c = ilv;
    }

    public final void a() {
        djf.a(this.a, true);
    }

    public final zym b() {
        zym zym = this.d;
        if (zym != null) {
            return zym;
        }
        zym = e();
        boolean z = false;
        if (zym == null || !djf.a(zym, false)) {
            this.d = this.a;
            ilv ilv = this.c;
            ino ino = ino.SERVER_CONFIG_INVALID;
            if (zym == null) {
                z = true;
            }
            ilv.c(ino.a("configIsNull", z), 1);
        } else {
            this.d = zym;
        }
        return this.d;
    }

    public final String c() {
        return b().g;
    }

    public abstract ajdp<Optional<zym>> d();

    public abstract zym e();
}
