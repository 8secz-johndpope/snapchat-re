package defpackage;

import defpackage.miw.b.a;

/* renamed from: lwh */
public final class lwh implements aiqc<lwj> {
    private final ajwy<ajdp<mmt>> a;
    private final ajwy<mwe> b;
    private final ajwy<miw> c;

    public static lwj a(ajdp<mmt> ajdp, mwe mwe, miw miw) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mwe, "lensRepository");
        akcr.b(miw, "configurationRepository");
        Object c = miw.a(a.a).a(mja.CENSORED_PROMPT_ENABLED).c(1);
        akcr.a(c, "configurationRepository\n…                 .take(1)");
        return (lwj) aiqf.a(new lwn(ajdp, mwe, c), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return lwh.a((ajdp) this.a.get(), (mwe) this.b.get(), (miw) this.c.get());
    }
}
