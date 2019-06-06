package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import defpackage.xbp.a;

/* renamed from: xbd */
public abstract class xbd {
    private xbp a;

    /* renamed from: xbd$a */
    public interface a {
        a a(ajdw ajdw);

        a a(Context context);

        a a(Optional<xck> optional);

        a a(xaz xaz);

        a a(xfu xfu);

        xbd a();
    }

    /* renamed from: xbd$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    static {
        b bVar = new b();
    }

    public final synchronized void a(xbp xbp) {
        this.a = xbp;
    }

    public abstract xfn b();

    public final synchronized void b(xbp xbp) {
        if (akcr.a((Object) xbp, n())) {
            a(null);
        }
    }

    public abstract xjn c();

    public abstract xay d();

    public abstract xgk e();

    public abstract xhl f();

    public abstract xhc g();

    public abstract xgq h();

    public abstract ajdw i();

    public abstract xbb j();

    public abstract xaz k();

    public abstract a l();

    public abstract xfu m();

    public final synchronized xbp n() {
        return this.a;
    }
}
