package defpackage;

import com.google.common.base.Supplier;
import com.snap.framework.developer.BuildConfigInfo;
import defpackage.miu.a;

/* renamed from: lbr */
public final class lbr implements aiqc<a> {
    private final ajwy<ftl> a;
    private final ajwy<tnj> b;
    private final ajwy<Supplier<hxs>> c;
    private final ajwy<Supplier<hxu>> d;
    private final ajwy<BuildConfigInfo> e;
    private final ajwy<ide> f;
    private final ajwy<zgb> g;

    public static a a(ftl ftl, tnj tnj, Supplier<hxs> supplier, Supplier<hxu> supplier2, BuildConfigInfo buildConfigInfo, ide ide, zgb zgb) {
        return (a) aiqf.a(lbq.a(ftl, tnj, supplier, supplier2, buildConfigInfo, ide, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lbr.a((ftl) this.a.get(), (tnj) this.b.get(), (Supplier) this.c.get(), (Supplier) this.d.get(), (BuildConfigInfo) this.e.get(), (ide) this.f.get(), (zgb) this.g.get());
    }
}
