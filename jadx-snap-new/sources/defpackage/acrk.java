package defpackage;

import android.os.Looper;
import defpackage.nbo.c;
import java.util.Map;

/* renamed from: acrk */
public final class acrk extends ajdp<Map<String, alhq>> {
    private final acrg a;
    private final abss b;

    /* renamed from: acrk$a */
    public static final class a extends ajed implements c {
        private ajdv<? super Map<String, alhq>> a;
        private final acrg b;

        public a(ajdv<? super Map<String, alhq>> ajdv, acrg acrg) {
            akcr.b(acrg, "friendLocationManager");
            this.a = ajdv;
            this.b = acrg;
        }

        public final void a(Map<String, alhq> map) {
            akcr.b(map, "friendLocations");
            if (!isDisposed()) {
                ajdv ajdv = this.a;
                if (ajdv != null) {
                    Object a = this.b.a();
                    akcr.a(a, "friendLocationManager.fr…ocationsIncludingSelfCopy");
                    ajdv.a(a);
                }
            }
        }

        public final void onDispose() {
            this.b.b((c) this);
            this.a = null;
        }
    }

    public acrk(acrg acrg, abss abss) {
        akcr.b(acrg, "friendLocationManager");
        akcr.b(abss, "releaseManager");
        this.a = acrg;
        this.b = abss;
    }

    public final void a_(ajdv<? super Map<String, alhq>> ajdv) {
        akcr.b(ajdv, "observer");
        if (!this.b.l() || (akcr.a(Looper.myLooper(), Looper.getMainLooper()) ^ 1) == 0) {
            a aVar = new a(ajdv, this.a);
            ajdv.a((ajej) aVar);
            this.a.a((c) aVar);
            return;
        }
        throw new IllegalThreadStateException("You must subscribe to FriendLocationsObservable on the main thread");
    }
}
