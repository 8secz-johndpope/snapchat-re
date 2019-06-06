package defpackage;

/* renamed from: tzb */
public final class tzb implements toe {
    final ftl a;
    private final String b = "ToolsPreloader";
    private final ajei c = new ajei();
    private final zgb d;
    private final toc e;

    /* renamed from: tzb$a */
    static final class a implements Runnable {
        private /* synthetic */ tzb a;

        a(tzb tzb) {
            this.a = tzb;
        }

        public final void run() {
            this.a.a.a((fth) tum.USER_TAGGING);
            this.a.a.a((fth) tum.DYNAMIC_CAPTIONS_V25);
            this.a.a.a((fth) tum.CAPTION_HARDWARE_RENDERING);
            this.a.a.a((fth) tum.DYNAMIC_CAPTIONS_NONLATIN);
            this.a.a.a((fth) tum.CAPTION_HARDWARE_RENDERING_NONLATIN);
            this.a.a.a((fth) tum.SHOW_CAPTION_CAROUSEL_AFTER_KEYBOARD);
            this.a.a.a((fth) tum.DRAWING_SMOOTHING_ENABLED);
            this.a.a.f(tum.DRAWING_SMOOTHING_WINDOW_SIZE);
            this.a.a.a((fth) tum.DRAWING_V2);
            this.a.a.f(tum.LAST_USED_BRUSH_COLOR);
        }
    }

    public tzb(zgb zgb, toc toc, ftl ftl) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(ftl, "configProvider");
        this.d = zgb;
        this.e = toc;
        this.a = ftl;
    }

    public final ajej start() {
        ajej a = zgb.a(this.e.callsite("ToolsPreloader")).f().a((Runnable) new a(this));
        akcr.a((Object) a, "schedulersProvider.forCa…ED_BRUSH_COLOR)\n        }");
        ajvv.a(a, this.c);
        return this.c;
    }
}
