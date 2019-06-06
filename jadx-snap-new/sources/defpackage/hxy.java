package defpackage;

import com.snap.featureconfig.FeatureConfigRequestHttpInterface;

/* renamed from: hxy */
public final class hxy implements aiqc<FeatureConfigRequestHttpInterface> {
    private final ajwy<gcy> a;

    public static FeatureConfigRequestHttpInterface a(gcy gcy) {
        akcr.b(gcy, "fsnServiceFactory");
        Object a = gcy.a(FeatureConfigRequestHttpInterface.class);
        akcr.a(a, "fsnServiceFactory.create…ttpInterface::class.java)");
        return (FeatureConfigRequestHttpInterface) aiqf.a((FeatureConfigRequestHttpInterface) a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hxy.a((gcy) this.a.get());
    }
}
