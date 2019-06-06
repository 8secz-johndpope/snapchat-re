package defpackage;

import com.google.common.base.Predicate;
import com.snapchat.deck.views.DeckView;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: achb */
public class achb<T extends achg, C extends achd<T, C>> {
    public aciw<T, C> a;
    public acgs<T, C> b;
    public boolean c;
    public final ache<T, C> d;
    private final HashSet<achk<T, C>> e = new HashSet();
    private final LinkedList<achq<T>> f = new LinkedList();
    private DeckView g;
    private final achc<T, C> h;

    /* renamed from: achb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public achb(ache<T, C> ache, achc<T, C> achc) {
        akcr.b(ache, "pageFactory");
        akcr.b(achc, "navigationSpecs");
        this.d = ache;
        this.h = achc;
    }

    public static /* synthetic */ void a(achb achb, achg achg, boolean z, acih acih, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            acih = null;
        }
        achb.a(achg, z, acih);
    }

    public final C a(T t) {
        akcr.b(t, "pageType");
        d();
        aciw aciw = this.a;
        if (aciw == null) {
            akcr.a("pageManager");
        }
        return aciw.a().b((achg) t);
    }

    public final DeckView a() {
        DeckView deckView = this.g;
        if (deckView == null) {
            akcr.a("deckView");
        }
        return deckView;
    }

    public final void a(C c, acgu<T> acgu, acih acih) {
        akcr.b(c, "pageController");
        akcr.b(acgu, "navigationAction");
        d();
        String str = "Check failed.";
        if ((acgu.c() == acgw.PRESENT ? 1 : null) == null) {
            throw new IllegalStateException(str.toString());
        } else if (c.getDeckPageType().equals(acgu.h())) {
            acgs acgs = this.b;
            if (acgs == null) {
                akcr.a("navigationManager");
            }
            acgs.a((acig) new acip(this, c, acgu, acih));
        } else {
            throw new IllegalStateException(str.toString());
        }
    }

    public final void a(T t, acig<T, C> acig, acih acih) {
        aciw aciw;
        achg t2;
        abmr.a();
        this.c = true;
        String str = "pageManager";
        if (!this.e.isEmpty()) {
            aciw = this.a;
            if (aciw == null) {
                akcr.a(str);
            }
            aciw.a((Collection) this.e);
            this.e.clear();
        }
        if (!this.f.isEmpty()) {
            acgs acgs = this.b;
            if (acgs == null) {
                akcr.a("navigationManager");
            }
            acgs.a((Collection) this.f);
        }
        if (t2 == null) {
            t2 = this.h.a();
            akcr.a((Object) t2, "navigationSpecs.defaultOriginPageType");
        }
        aciw = this.a;
        if (aciw == null) {
            akcr.a(str);
        }
        aciw.a(t2, acih);
        if (acig != null) {
            a((acig) new acij(acig, acih));
        }
    }

    public final void a(T t, boolean z, acih acih) {
        akcr.b(t, "pageType");
        a((acig) new acik(t, z, acih));
    }

    public final void a(T t, boolean z, boolean z2, acih acih) {
        akcr.b(t, "pageType");
        a((acig) new acio(t, z, z2, acih));
    }

    public final void a(achh achh) {
        akcr.b(achh, "subscriber");
        abmr.a();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        acgs.a(achh);
    }

    public final void a(achk<T, C> achk) {
        akcr.b(achk, "navigationSubscriber");
        abmr.a();
        if (this.c) {
            aciw aciw = this.a;
            if (aciw == null) {
                akcr.a("pageManager");
            }
            aciw.a((achk) achk);
            return;
        }
        this.e.add(achk);
    }

    public final void a(achq<T> achq) {
        akcr.b(achq, "gestureEnabledPredicate");
        abmr.a();
        if (this.c) {
            acgs acgs = this.b;
            if (acgs == null) {
                akcr.a("navigationManager");
            }
            acgs.a((achq) achq);
            return;
        }
        this.f.add(achq);
    }

    public final void a(achz achz) {
        akcr.b(achz, "programmaticInputGesture");
        d();
        DeckView deckView = this.g;
        if (deckView == null) {
            akcr.a("deckView");
        }
        deckView.a(achz);
    }

    public final void a(acig<T, C> acig) {
        akcr.b(acig, "navigable");
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        acgs.a((acig) acig);
    }

    public final void a(acih acih, T t) {
        akcr.b(acih, "payload");
        akcr.b(t, "pageType");
        d();
        aciw aciw = this.a;
        if (aciw == null) {
            akcr.a("pageManager");
        }
        aciw.a(acih, (achg) t);
    }

    public final void a(Predicate<Void> predicate) {
        akcr.b(predicate, "predicateToRemove");
        abmr.a();
        if (this.c) {
            acgs acgs = this.b;
            if (acgs == null) {
                akcr.a("navigationManager");
            }
            acgs.a((Predicate) predicate);
            return;
        }
        Object it = this.f.iterator();
        akcr.a(it, "coldStartGestureEnabledPredicates.iterator()");
        while (it.hasNext()) {
            if (akcr.a(((achq) it.next()).d, (Object) predicate)) {
                it.remove();
            }
        }
    }

    public final void a(DeckView deckView) {
        akcr.b(deckView, "deckView");
        abmr.a();
        this.g = deckView;
        this.a = new aciw(this.d, deckView, this.h);
        achc achc = this.h;
        aciw aciw = this.a;
        if (aciw == null) {
            akcr.a("pageManager");
        }
        this.b = new acgs(this, achc, aciw, deckView);
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        deckView.a(acgs);
    }

    public final void a(boolean z) {
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        Object d = acgs.d();
        akcr.a(d, "navigationManager.navigationStack");
        acgu d2 = d.k().j().g().a(z).d();
        akcr.a((Object) d2, "navigationManager.naviga…                 .build()");
        a((acig) new acii(d2));
    }

    public final void b() {
        abmr.a();
        aciw aciw = this.a;
        if (aciw == null) {
            akcr.a("pageManager");
        }
        aciw.a(true);
    }

    public final void b(achh achh) {
        akcr.b(achh, "subscriber");
        abmr.a();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        acgs.b(achh);
    }

    public final void b(achk<T, C> achk) {
        akcr.b(achk, "navigationSubscriber");
        abmr.a();
        if (this.c) {
            aciw aciw = this.a;
            if (aciw == null) {
                akcr.a("pageManager");
            }
            aciw.b((achk) achk);
            return;
        }
        this.e.remove(achk);
    }

    public final void b(acig<T, C> acig) {
        akcr.b(acig, "navigable");
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        acgs.b((acig) acig);
    }

    public final boolean c() {
        aciw aciw = this.a;
        if (aciw == null) {
            akcr.a("pageManager");
        }
        return aciw.b();
    }

    public final void d() {
        abmr.a();
        if (!this.c) {
            throw new IllegalArgumentException("NavigationHost not yet initialized via NavigationHost#onPostCreate and/or NavigationHost#start".toString());
        }
    }

    public final boolean e() {
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        return acgs.a();
    }

    public final boolean f() {
        DeckView deckView = this.g;
        if (deckView == null) {
            akcr.a("deckView");
        }
        return deckView.a();
    }

    public final Deque<aciv<T, C>> g() {
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        Object d = acgs.d();
        akcr.a(d, "navigationManager.navigationStack");
        d = d.g();
        akcr.a(d, "navigationManager.navigationStack.pageStack");
        return d;
    }

    public final T h() {
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        Object d = acgs.d();
        akcr.a(d, "navigationManager.navigationStack");
        return d.d();
    }

    public final aciv<T, C> i() {
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        Object d = acgs.d();
        akcr.a(d, "navigationManager.navigationStack");
        return d.c();
    }

    public final Iterator<aciv<T, C>> j() {
        d();
        acgs acgs = this.b;
        if (acgs == null) {
            akcr.a("navigationManager");
        }
        Object d = acgs.d();
        akcr.a(d, "navigationManager.navigationStack");
        d = d.h();
        akcr.a(d, "navigationManager.navigationStack.pagesFromTop");
        return d;
    }

    public String toString() {
        Object d;
        akmf a = new akmf(this).a("\nisInitialized", this.c);
        achb achb = this;
        Object obj = "uninitialized";
        if (achb.b != null) {
            acgs acgs = this.b;
            if (acgs == null) {
                akcr.a("navigationManager");
            }
            d = acgs.d();
        } else {
            d = obj;
        }
        a = a.a("\nnavigationStack", d);
        if (achb.g != null) {
            obj = this.g;
            if (obj == null) {
                akcr.a("deckView");
            }
        }
        Object akmf = a.a("\ndeckView", obj).toString();
        akcr.a(akmf, "ToStringBuilder(this)\n  …              .toString()");
        return akmf;
    }
}
