package defpackage;

import com.snap.blizzard.v1.request.BlizzardRequestInterface;
import defpackage.akwt.a;

/* renamed from: dkm */
public final class dkm implements aiqc<BlizzardRequestInterface> {
    private final ajwy<dlc> a;
    private final ajwy<ajdw> b;

    public static BlizzardRequestInterface a(dlc dlc, ajdw ajdw) {
        a a = new a().a((akgx.a) dlc).a("https://app.snapchat.com");
        if (ajdw != null) {
            return (BlizzardRequestInterface) aiqf.a((BlizzardRequestInterface) a.a(new akxd(ajdw, false)).a(akxe.a()).a().a(BlizzardRequestInterface.class), "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new NullPointerException("scheduler == null");
    }

    public final /* synthetic */ Object get() {
        return dkm.a((dlc) this.a.get(), (ajdw) this.b.get());
    }
}
