package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.snap.framework.developer.BuildConfigInfo;
import java.util.Map;

/* renamed from: fto */
public final class fto implements aiqc<Map<String, ? extends aipn<ftk>>> {
    private final ajwy<ftk> a;
    private final ajwy<ftk> b;
    private final ajwy<ftk> c;
    private final ajwy<ftk> d;
    private final ajwy<ftk> e;
    private final ajwy<Optional<aipn<ftk>>> f;
    private final ajwy<ftk> g;
    private final ajwy<BuildConfigInfo> h;

    public static Map<String, ? extends aipn<ftk>> a(aipn<ftk> aipn, aipn<ftk> aipn2, aipn<ftk> aipn3, aipn<ftk> aipn4, aipn<ftk> aipn5, Optional<aipn<ftk>> optional, aipn<ftk> aipn6, BuildConfigInfo buildConfigInfo) {
        Builder builder = ImmutableMap.builder();
        if (buildConfigInfo.TWEAK_FLAG) {
            builder.put("tweaks", aipn);
        }
        builder.put("serverconfigs", aipn2);
        builder.put("experiments", aipn3);
        builder.put("feature-config", aipn4);
        builder.put("prefs", aipn5);
        builder.put("circumstance-engine", aipn6);
        if (optional.isPresent()) {
            builder.put("application-default", optional.get());
        }
        return (Map) aiqf.a(builder.build(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fto.a(aiqb.b(this.a), aiqb.b(this.b), aiqb.b(this.c), aiqb.b(this.d), aiqb.b(this.e), (Optional) this.f.get(), aiqb.b(this.g), (BuildConfigInfo) this.h.get());
    }
}
