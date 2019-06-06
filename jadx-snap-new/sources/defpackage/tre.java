package defpackage;

/* renamed from: tre */
public final class tre {
    public tpj a;

    public tre(zgb zgb, final ftl ftl) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ftl, "configProvider");
        final tpi tpi = new tpi();
        this.a = new tpj(tpi);
        zgb.a(toc.d.callsite("PreviewConfigPreloader")).f().a((Runnable) new Runnable() {
            public final void run() {
                tpi.b = ftl.a((fth) tum.VIDEO_TIMER_LOOP_PLAYBACK);
                tpi.a = ftl.a((fth) tum.SNAP_CROP_ENABLED);
                tpi.c = ftl.a((fth) tum.CAPTION_BAR);
                tpi.e = ftl.a((fth) tum.LENSES_IN_FILTER_CAROUSEL);
            }
        });
    }
}
