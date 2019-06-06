package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.deck.views.DeckView;
import defpackage.achl.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: acgs */
public final class acgs<T extends achg, C extends achd<T, C>> {
    public final achc<T, C> a;
    public final aciw<T, C> b;
    public final CopyOnWriteArraySet<achh> c = new CopyOnWriteArraySet();
    public final List<achq<T>> d = new LinkedList();
    public acgu<T> e;
    public acig<T, C> f;
    public zgm g = null;
    private final achb<T, C> h;
    private final DeckView i;
    private final Queue<acig<T, C>> j = new LinkedList();
    private acgu<T> k;

    public acgs(achb<T, C> achb, achc<T, C> achc, aciw<T, C> aciw, DeckView deckView) {
        this.h = achb;
        this.a = achc;
        this.b = aciw;
        this.i = deckView;
    }

    private void a(float f, boolean z, achj achj) {
        if (!h()) {
            if (z) {
                achg d;
                if (this.e.c() == acgw.PRESENT) {
                    d = this.b.c.d();
                } else {
                    Preconditions.checkArgument(this.b.c.d().equals(this.e.h()));
                    d = this.b.c.l();
                }
                this.e = this.e.a(d, new -$$Lambda$acgs$Fn0Id0OUGn0QNeRLY16fBv-_JZY(this));
            }
            in.a("PageManager:onNavigate");
            aciw aciw = this.b;
            acgu acgu = this.e;
            boolean b = b();
            acig acig = this.f;
            aciw.a(acgu, f, z, achj, b, acig, acig != null ? acig.a() : null);
            in.a();
        }
    }

    public final void a(C c) {
        ache ache = this.b.a;
        Preconditions.checkArgument(c.getDeckPageType().e() ^ 1);
        ache.g.add(c);
    }

    public final void a(achh achh) {
        this.c.add(achh);
    }

    public final void a(achq<T> achq) {
        this.d.add(achq);
    }

    public final void a(achr achr, float f, achj achj) {
        if (this.g == null) {
            StringBuilder stringBuilder = new StringBuilder("gesture:");
            stringBuilder.append(achr.name());
            this.g = zgm.a(stringBuilder.toString());
        }
        acgu acgu = this.e;
        boolean z = true;
        if (acgu == null || achr != acgu.a()) {
            acgu = this.k;
            if (acgu != null) {
                Preconditions.checkArgument(acgu.a() == achr);
                acgu = this.k;
            } else {
                acgv navigationActionSpec = this.b.c.f().getNavigationActionSpec();
                Preconditions.checkNotNull(navigationActionSpec, String.format("Spec is null for gesture %s", new Object[]{achr}));
                acgu a = navigationActionSpec.a(achr);
                Preconditions.checkNotNull(a, String.format("Spec doesn't contain gesture %s", new Object[]{achr}));
                Supplier supplier = (Supplier) navigationActionSpec.a.get(a.h());
                achd achd = supplier != null ? (achd) supplier.get() : null;
                if (achd != null) {
                    achb achb = this.h;
                    achg deckPageType = achd.getDeckPageType();
                    akcr.b(deckPageType, "pageType");
                    akcr.b(achd, "pageController");
                    achb.d();
                    acgs acgs = achb.b;
                    if (acgs == null) {
                        akcr.a("navigationManager");
                    }
                    aciw aciw = acgs.b;
                    aciw.a.a(deckPageType, achd, aciw.b);
                }
                acgu = a;
            }
            if (this.e != null) {
                a((float) MapboxConstants.MINIMUM_ZOOM, false, achj);
                e();
            }
            this.e = acgu;
        } else {
            z = false;
        }
        if (achr == achr.LEFT_TO_RIGHT || achr == achr.TOP_TO_BOTTOM) {
            a(-f, z, achj);
        } else {
            a(f, z, achj);
        }
        this.k = null;
    }

    public final void a(acig<T, C> acig) {
        if (!c()) {
            this.f = acig;
            f();
        }
    }

    public final void a(Predicate<Void> predicate) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((achq) it.next()).d.equals(predicate)) {
                it.remove();
            }
        }
    }

    public final void a(Collection<achq<T>> collection) {
        this.d.addAll(collection);
    }

    public final boolean a() {
        if (c() || ((aciv) Preconditions.checkNotNull(this.b.c.c())).c.onPageBackPressed()) {
            return true;
        }
        if (this.b.c.i() == 1) {
            return false;
        }
        this.f = new acii(this.b.c.k().j(), null);
        f();
        return true;
    }

    public final void b(achh achh) {
        this.c.remove(achh);
    }

    public final void b(acig<T, C> acig) {
        if (c()) {
            this.j.add(acig);
        } else {
            a((acig) acig);
        }
    }

    public final boolean b() {
        return this.f != null;
    }

    public final boolean c() {
        return (!b() && this.e == null && this.h.f()) ? false : true;
    }

    public final acjd<T, C> d() {
        return this.b.c;
    }

    public final void e() {
        if (!h()) {
            this.b.a(this.e, b());
            this.e = null;
            g();
        }
    }

    public final void f() {
        acig acig = this.f;
        if (acig != null) {
            if (acig.e(this.a, this.b.c)) {
                this.f = null;
                return;
            }
            this.k = this.f.c();
            this.h.a(new a().a(this.k.a()).a(this.k.f()).b(this.f.d()).c(this.f.e(this.a, this.b.c)).a());
        }
    }

    public final void g() {
        if (!c()) {
            acig acig = (acig) this.j.poll();
            if (acig != null) {
                a(acig);
            }
        }
    }

    public final boolean h() {
        Context context = this.i.getContext();
        return (context instanceof Activity) && ((Activity) context).isDestroyed();
    }
}
