package defpackage;

import com.brightcove.player.event.Event;
import java.util.concurrent.Callable;

/* renamed from: duq */
public final class duq implements dus {
    private final ajxe a = ajxh.a(a.a);

    /* renamed from: duq$a */
    static final class a extends akcs implements akbk<ajdx<dur>> {
        public static final a a = new a();

        /* renamed from: duq$a$1 */
        static final class 1<V> implements Callable<T> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ Object call() {
                return dut.a;
            }
        }

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdx.c((Callable) 1.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(duq.class), Event.CONFIGURATION, "getConfiguration()Lio/reactivex/Single;");
    }

    public final ajdx<dur> a() {
        return (ajdx) this.a.b();
    }
}
