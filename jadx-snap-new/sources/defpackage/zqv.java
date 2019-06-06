package defpackage;

import com.snap.unlockables.lib.network.api.LocationIndependentUnlockHttpInterface;
import com.snap.unlockables.lib.network.api.UnlockablesFsnHttpInterface;
import defpackage.zpq.b;
import java.util.concurrent.Callable;

/* renamed from: zqv */
public final class zqv {

    /* renamed from: zqv$b */
    static final class b extends akcq implements akbk<zrx> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zrx) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zqv$a */
    public static final class a implements LocationIndependentUnlockHttpInterface {
        private /* synthetic */ UnlockablesFsnHttpInterface a;

        a(UnlockablesFsnHttpInterface unlockablesFsnHttpInterface) {
            this.a = unlockablesFsnHttpInterface;
        }

        public final ajdx<akxa<affs>> fetchUnlockedFilterOrLens(aera aera) {
            akcr.b(aera, "request");
            return this.a.fetchUnlockedFilterOrLens(aera);
        }

        public final ajdx<akxa<affs>> fetchUnlockedSticker(aiad aiad) {
            akcr.b(aiad, "request");
            return this.a.fetchUnlockedStickerPack(aiad);
        }

        public final ajcx unlockFilterOrLens(zrw zrw) {
            akcr.b(zrw, "requestPayload");
            return this.a.unlockFilterOrLens(zrw);
        }

        public final ajdx<akxa<aenr>> unlockSticker(aikd aikd) {
            akcr.b(aikd, "request");
            return this.a.unlockSticker(aikd);
        }
    }

    public static ajdx<b> a(ajwy<zrx> ajwy) {
        akcr.b(ajwy, "unlockablesNetClient");
        Object a = ajdx.c((Callable) new zqw(new b(ajwy))).a();
        akcr.a(a, "Single.fromCallable<Unlo…esNetClient::get).cache()");
        return a;
    }

    public static LocationIndependentUnlockHttpInterface b(ajwy<gcy> ajwy) {
        akcr.b(ajwy, "fsnProvider");
        Object a = ((gcy) ajwy.get()).a(UnlockablesFsnHttpInterface.class);
        akcr.a(a, "fsnProvider.get().create…ttpInterface::class.java)");
        return new a((UnlockablesFsnHttpInterface) a);
    }
}
