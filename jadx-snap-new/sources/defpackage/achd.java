package defpackage;

import defpackage.acix.a;

/* renamed from: achd */
public interface achd<T extends achg, C extends achd<T, C>> {
    T getDeckPageType();

    acgv<T> getNavigationActionSpec();

    void onNewPayload(acih acih);

    void onPageAdded();

    boolean onPageBackPressed();

    void onPageHidden(achi<T, C> achi);

    void onPageNavigate(achi<T, C> achi);

    void onPageNavigateUnsuccessful(achi<T, C> achi);

    void onPagePartialVisibilityChanged(achi<T, C> achi, a aVar);

    void onPageRemoved();

    void onPageStacked();

    void onPageUnstacked();

    void onPageVisible(achi<T, C> achi);

    <R> R traceRenderingEvent(String str, akbk<? extends R> akbk);
}
