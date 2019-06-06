package defpackage;

import android.os.Build;
import defpackage.mnk.b;
import defpackage.mnk.c;
import java.util.concurrent.Callable;

/* renamed from: mla */
public final class mla implements mni {
    final zfw a;
    final akbk<Boolean> b;
    final akbk<String> c;
    private final ajxe d;

    /* renamed from: mla$1 */
    static final class 1 extends akcs implements akbk<String> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = Build.CPU_ABI;
            akcr.a(obj, "Build.CPU_ABI");
            return obj;
        }
    }

    /* renamed from: mla$a */
    static final class a extends akcs implements akbk<ajdx<mnk>> {
        final /* synthetic */ mla a;

        /* renamed from: mla$a$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ Object call() {
                mla mla = this.a.a;
                String str = (String) mla.c.invoke();
                boolean z = false;
                if (akgb.a(str) || !akgb.b(str, "arm", false)) {
                    z = true;
                }
                c cVar = z ? new c(str) : ((Boolean) mla.b.invoke()).booleanValue() ? b.a : defpackage.mnk.a.a;
                return cVar;
            }
        }

        a(mla mla) {
            this.a = mla;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdx c = ajdx.c((Callable) new 1(this));
            akcr.a((Object) c, "fromCallable { deviceSupportStatus() }");
            return mip.b(c, "DefaultNativeSupportAssessor#deviceSupportStatus").b((ajdw) this.a.a.f()).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mla.class), "deviceSupportStatus", "getDeviceSupportStatus()Lio/reactivex/Single;");
    }

    public /* synthetic */ mla(zfw zfw, akbk akbk) {
        this(zfw, akbk, 1.a);
    }

    private mla(zfw zfw, akbk<Boolean> akbk, akbk<String> akbk2) {
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(akbk, "nativeLibraryLoader");
        akcr.b(akbk2, "cpuAbiProvider");
        this.a = zfw;
        this.b = akbk;
        this.c = akbk2;
        this.d = ajxh.a(new a(this));
    }

    public final ajdx<mnk> a() {
        Object obj = (ajdx) this.d.b();
        akcr.a(obj, "deviceSupportStatus");
        return obj;
    }
}
