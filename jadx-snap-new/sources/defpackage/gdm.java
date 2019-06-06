package defpackage;

/* renamed from: gdm */
public final class gdm {
    final gdn a;

    /* renamed from: gdm$a */
    static final class a implements ajev {
        private /* synthetic */ gdm a;
        private /* synthetic */ Thread b;

        a(gdm gdm, Thread thread) {
            this.a = gdm;
            this.b = thread;
        }

        public final void run() {
            this.a.a.a().a((Object) gdj.BACKGROUND);
        }
    }

    public gdm(gdn gdn) {
        akcr.b(gdn, "appStateNotifier");
        this.a = gdn;
    }
}
