package defpackage;

import com.google.common.base.Supplier;
import com.snap.framework.developer.BuildConfigInfo;
import defpackage.miu.a;
import defpackage.miu.b;

/* renamed from: lbq */
final class lbq {

    /* renamed from: lbq$a */
    public static final class a implements b {
        a() {
        }
    }

    static {
        lbq lbq = new lbq();
    }

    private lbq() {
    }

    public static final a a(ftl ftl, tnj tnj, Supplier<hxs> supplier, Supplier<hxu> supplier2, BuildConfigInfo buildConfigInfo, ide ide, zgb zgb) {
        akcr.b(ftl, "compositeConfigurationProvider");
        akcr.b(tnj, "preferences");
        akcr.b(supplier, "featureConfiguration");
        akcr.b(supplier2, "featureConfigurationMap");
        akcr.b(buildConfigInfo, "buildConfigInfo");
        akcr.b(ide, "attributedFeature");
        akcr.b(zgb, "schedulersProvider");
        Object a = new miu(new a()).a(buildConfigInfo).a((miw) new lbj(ftl, tnj, supplier, supplier2, zgb.a(ide.callsite("CompositeConfigurationRepository")))).a();
        akcr.a(a, "ConfigurationBuilder(obj…                 .build()");
        return a;
    }

    public static final miw a(a aVar) {
        akcr.b(aVar, "configurationComponent");
        Object d = aVar.d();
        akcr.a(d, "configurationComponent.configurationRepository()");
        return d;
    }

    public static final hww b(a aVar) {
        akcr.b(aVar, "configurationComponent");
        Object a = aVar.a();
        akcr.a(a, "configurationComponent.experiments()");
        return a;
    }

    public static final wnh c(a aVar) {
        akcr.b(aVar, "configurationComponent");
        Object b = aVar.b();
        akcr.a(b, "configurationComponent.serverConfigs()");
        return b;
    }

    public static final hxn d(a aVar) {
        akcr.b(aVar, "configurationComponent");
        Object c = aVar.c();
        akcr.a(c, "configurationComponent.featureConfigs()");
        return c;
    }
}
