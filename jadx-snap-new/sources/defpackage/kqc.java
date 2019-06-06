package defpackage;

import com.brightcove.player.analytics.Analytics;

/* renamed from: kqc */
public final class kqc implements aiqc<zfw> {
    private final ajwy<zgb> a;
    private final ajwy<ide> b;

    public static zfw a(zgb zgb, ide ide) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        return (zfw) aiqf.a(zgb.a(ide.callsite(Analytics.TAG)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kqc.a((zgb) this.a.get(), (ide) this.b.get());
    }
}
