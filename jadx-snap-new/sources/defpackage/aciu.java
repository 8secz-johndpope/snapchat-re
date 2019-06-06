package defpackage;

/* renamed from: aciu */
public final class aciu<T extends achg, C extends achd<T, C>> {
    final aciv<T, C> a = new aciv(-1, new a(this), null);
    final achc<T, C> b;

    /* renamed from: aciu$a */
    public static final class a implements achd<T, C> {
        private /* synthetic */ aciu a;

        a(aciu aciu) {
            this.a = aciu;
        }

        public final T getDeckPageType() {
            Object c = this.a.b.c();
            akcr.a(c, "navigationSpecs.hiddenPageType");
            return c;
        }

        public final acgv<T> getNavigationActionSpec() {
            return null;
        }

        public final void onNewPayload(acih acih) {
            akcr.b(acih, "payload");
        }

        public final void onPageAdded() {
        }

        public final boolean onPageBackPressed() {
            return false;
        }

        public final void onPageHidden(achi<T, C> achi) {
            akcr.b(achi, "navigationEvent");
        }

        public final void onPageNavigate(achi<T, C> achi) {
            akcr.b(achi, "navigationEvent");
        }

        public final void onPageNavigateUnsuccessful(achi<T, C> achi) {
            akcr.b(achi, "navigationEvent");
        }

        public final void onPagePartialVisibilityChanged(achi<T, C> achi, defpackage.acix.a aVar) {
            akcr.b(achi, "navigationEvent");
            akcr.b(aVar, "pageStateTransition");
        }

        public final void onPageRemoved() {
        }

        public final void onPageStacked() {
        }

        public final void onPageUnstacked() {
        }

        public final void onPageVisible(achi<T, C> achi) {
            akcr.b(achi, "navigationEvent");
        }

        public final <R> R traceRenderingEvent(String str, akbk<? extends R> akbk) {
            String str2 = "name";
            akcr.b(str, str2);
            String str3 = "section";
            akcr.b(akbk, str3);
            akcr.b(str, str2);
            akcr.b(akbk, str3);
            return akbk.invoke();
        }
    }

    public aciu(achc<T, C> achc) {
        akcr.b(achc, "navigationSpecs");
        this.b = achc;
    }
}
