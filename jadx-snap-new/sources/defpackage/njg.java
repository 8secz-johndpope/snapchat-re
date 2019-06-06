package defpackage;

import com.brightcove.player.media.MediaService;
import defpackage.nbo.d;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: njg */
public final class njg implements d {
    private final ajdw a;
    private final niw b;

    /* renamed from: njg$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        public final /* synthetic */ Object call() {
            this.a.run();
            return ajxw.a;
        }
    }

    /* renamed from: njg$b */
    static final class b implements abml {
        private /* synthetic */ ajej a;

        b(ajej ajej) {
            this.a = ajej;
        }

        public final void a() {
            this.a.dispose();
        }
    }

    /* renamed from: njg$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ Runnable a;

        c(Runnable runnable) {
            this.a = runnable;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((ajwj) obj, "it");
            this.a.run();
            return ajxw.a;
        }
    }

    public njg(niw niw, ide ide, zgb zgb) {
        akcr.b(niw, "mapUserDataProvider");
        akcr.b(ide, "feature");
        akcr.b(zgb, "schedulersProvider");
        this.b = niw;
        this.a = zgb.a(ide.callsite("FriendLocationUpdate")).g();
    }

    public final abml a(Runnable runnable) {
        akcr.b(runnable, MediaService.COMMAND);
        return new b(ajdp.a(1000, TimeUnit.MILLISECONDS).m().p(new c(runnable)).b(this.a).l());
    }

    public final String a() {
        return this.b.b();
    }

    public final void b(Runnable runnable) {
        akcr.b(runnable, MediaService.COMMAND);
        ajcx.b((Callable) new a(runnable)).b(this.a).e();
    }
}
