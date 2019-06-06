package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: dtu */
public final class dtu implements aiqc<abls> {
    private final ajwy<czb> a;
    private final ajwy<zgb> b;

    public static abls a(czb czb, zgb zgb) {
        akcr.b(czb, "mediaCreationBlizzardReporter");
        akcr.b(zgb, "schedulersProvider");
        return (abls) aiqf.a(new ablq(ImmutableList.of(czb, new ablr(zgb.a(dnh.f.callsite("LogcatRecorder"))))), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtu.a((czb) this.a.get(), (zgb) this.b.get());
    }
}
