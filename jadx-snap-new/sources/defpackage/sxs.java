package defpackage;

import android.os.SystemClock;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.bxx.b;
import java.io.File;

/* renamed from: sxs */
public final class sxs {
    public static final a a;
    public static final bxa b;
    public static final Supplier<bym> c = Suppliers.memoize(new 1());
    static final b d = new 2();

    /* renamed from: sxs$a */
    public static class a implements bxa, bxw<bxe> {
        private static final bxj a = new bxj();

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final long a() {
            return a.a();
        }

        public final /* synthetic */ void a(Object obj) {
            a.a((bxe) obj);
            long a = a.a();
            abrc abrc = (abrc) abrc.c.get();
            abrc.b.set(System.currentTimeMillis());
            abrc.a.set(a);
        }
    }

    /* renamed from: sxs$2 */
    static class 2 implements b {
        2() {
        }

        public final void a(bxx bxx, byd byd) {
        }

        public final void a(bxx bxx, byd byd, byd byd2) {
        }

        public final void a(byd byd) {
        }
    }

    /* renamed from: sxs$1 */
    static class 1 implements Supplier<bym> {
        1() {
        }

        public final /* synthetic */ Object get() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(AppContext.get().getFilesDir());
            stringBuilder.append("/streaming");
            bym bym = new bym(new File(stringBuilder.toString()), new byl());
            bym.a("SimpleCache", sxs.d);
            return bym;
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b = aVar;
    }

    public static long a() {
        SystemClock.elapsedRealtime();
        return ((bym) c.get()).a();
    }

    public static Supplier<bym> b() {
        return c;
    }
}
