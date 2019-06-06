package defpackage;

import com.snap.framework.developer.BuildConfigInfo;
import defpackage.lbp.a;

/* renamed from: kui */
public final class kui implements aiqc<a> {
    private final ajwy<ftl> a;
    private final ajwy<tnj> b;
    private final ajwy<BuildConfigInfo> c;
    private final ajwy<hxs> d;
    private final ajwy<hxu> e;
    private final ajwy<zgb> f;

    public static a a(ftl ftl, tnj tnj, BuildConfigInfo buildConfigInfo, ajwy<hxs> ajwy, ajwy<hxu> ajwy2, zgb zgb) {
        return (a) aiqf.a(ktz.a.a(ftl, tnj, buildConfigInfo, ajwy, ajwy2, zgb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        return kui.a((ftl) ajwy.get(), (tnj) ajwy2.get(), (BuildConfigInfo) ajwy3.get(), this.d, this.e, (zgb) this.f.get());
    }
}
