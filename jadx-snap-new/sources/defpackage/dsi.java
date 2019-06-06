package defpackage;

/* renamed from: dsi */
public final class dsi implements aiqc<doa> {
    private final ajwy<dug> a;
    private final ajwy<dqo> b;

    public static doa a(dug dug, dqo dqo) {
        akcr.b(dug, "cameraTelemetry");
        akcr.b(dqo, "cameraStore");
        return (doa) aiqf.a(new eim(dug, dqo), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dsi.a((dug) this.a.get(), (dqo) this.b.get());
    }
}
