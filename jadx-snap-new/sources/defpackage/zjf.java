package defpackage;

import com.brightcove.player.event.Event;
import com.snap.ui.deck.MainPageFragment;
import defpackage.acix.a;

/* renamed from: zjf */
public class zjf implements acha, zjk {
    private final zjm a;
    private final MainPageFragment b;
    private acgv<zjm> c;

    public /* synthetic */ zjf(zjm zjm, MainPageFragment mainPageFragment) {
        this(zjm, mainPageFragment, null);
    }

    public zjf(zjm zjm, MainPageFragment mainPageFragment, acgv<zjm> acgv) {
        akcr.b(zjm, "deckPageType");
        akcr.b(mainPageFragment, Event.FRAGMENT);
        this.a = zjm;
        this.b = mainPageFragment;
        this.c = acgv;
    }

    /* renamed from: a */
    public zjm getDeckPageType() {
        return this.a;
    }

    /* renamed from: b */
    public MainPageFragment c() {
        return this.b;
    }

    public acgv<zjm> getNavigationActionSpec() {
        return this.c;
    }

    public void onNewPayload(acih acih) {
        akcr.b(acih, "payload");
        c().b(acih);
    }

    public void onPageAdded() {
        c().p_();
    }

    public boolean onPageBackPressed() {
        return c().o_();
    }

    public void onPageHidden(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        c().b((achi) achi);
    }

    public void onPageNavigate(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        c().c(achi);
        if (achi.l && achi.d == acgw.PRESENT && akcr.a((zjk) achi.f.d(), (Object) this)) {
            c().a(achi.m);
        }
    }

    public void onPageNavigateUnsuccessful(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        c().d(achi);
    }

    public void onPagePartialVisibilityChanged(achi<zjm, zjk> achi, a aVar) {
        akcr.b(achi, "navigationEvent");
        akcr.b(aVar, "pageStateTransition");
        c().a(achi, aVar);
    }

    public void onPageRemoved() {
        c().s_();
    }

    public void onPageStacked() {
        c().n_();
    }

    public void onPageUnstacked() {
        c().q_();
    }

    public void onPageVisible(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        c().a_(achi);
    }

    public <R> R traceRenderingEvent(String str, akbk<? extends R> akbk) {
        akcr.b(str, "name");
        akcr.b(akbk, "section");
        return zjk.a.a(this, str, akbk);
    }
}
