package defpackage;

import android.os.Build.VERSION;
import java.util.concurrent.TimeUnit;

/* renamed from: mhv */
public final class mhv {

    /* renamed from: mhv$a */
    static final class a extends akcs implements akbk<Boolean> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(VERSION.SDK_INT <= 19);
        }
    }

    static {
        mhv mhv = new mhv();
    }

    private mhv() {
    }

    private static <I> mib<I> a(TimeUnit timeUnit, ajdw ajdw) {
        akcr.b(timeUnit, "timeUnit");
        akcr.b(ajdw, "scheduler");
        return new mhm(0, timeUnit, ajdw, a.a);
    }
}
