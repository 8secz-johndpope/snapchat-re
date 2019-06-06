package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.mjo.d;
import defpackage.myh.c;
import java.util.Set;

/* renamed from: lkw */
public abstract class lkw implements d, c, tvy {

    /* renamed from: lkw$c */
    public interface c {
        zgb a();

        ide b();
    }

    /* renamed from: lkw$a */
    public interface a extends defpackage.tvy.a {
        a a();

        a a(Context context);

        a a(Supplier<kpc> supplier);

        a a(Set<akbl<mmt, mph>> set);

        a a(defpackage.lfu.a aVar);

        a a(c cVar);

        a a(lnr lnr);

        a b(Supplier<iha> supplier);
    }

    /* renamed from: lkw$b */
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
}
