package defpackage;

import android.view.ViewGroup;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.deck.views.DeckView;
import defpackage.acix.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aciw */
public final class aciw<T extends achg, C extends achd<T, C>> {
    public final ache<T, C> a;
    public final DeckView b;
    public final acjd<T, C> c;
    private final achc<T, C> d;
    private final CopyOnWriteArraySet<achk<T, C>> e;
    private final aciu<T, C> f;
    private aciv<T, C> g;
    private boolean h = true;

    public aciw(ache<T, C> ache, DeckView deckView, achc<T, C> achc) {
        this.a = ache;
        this.b = deckView;
        this.d = achc;
        this.e = new CopyOnWriteArraySet();
        this.c = new acjd(ache, deckView, achc);
        this.f = new aciu(achc);
    }

    private achi<T, C> a(boolean z, aciv<T, C> aciv) {
        return new achi(achr.LEFT_TO_RIGHT, acis.a, z ? acgw.PRESENT : acgw.DISMISS, z ? this.f.a : aciv, z ? aciv : this.f.a, achj.SETTLING_TO_DESTINATION, true, 1.0f, true, true, true, null);
    }

    private void b(boolean z) {
        Object obj = null;
        for (aciv aciv : this.c.g()) {
            ViewGroup viewGroup = aciv.d;
            if (viewGroup != null) {
                if (z) {
                    viewGroup.setVisibility(0);
                    z = false;
                } else if (obj != null) {
                    viewGroup.setVisibility(4);
                } else {
                    viewGroup.setVisibility(0);
                    if (!aciv.e().a()) {
                        obj = 1;
                    }
                }
            }
        }
    }

    public final acjd<T, C> a() {
        return this.c;
    }

    public final void a(acgu<T> acgu, float f, boolean z, achj achj, boolean z2, acig<T, C> acig, acih acih) {
        aciv a;
        aciv aciv;
        acig<T, C> acig2 = acig;
        boolean z3 = true;
        acih acih2;
        if (z) {
            Preconditions.checkArgument(this.g == null);
            if (acgu.c() == acgw.PRESENT) {
                a = this.a.a(this.b, acgu.h(), acih);
            } else {
                acih2 = acih;
                Preconditions.checkArgument(acgu.h().equals(this.c.d()));
                a = this.c.c();
            }
            this.g = a;
        } else {
            acih2 = acih;
        }
        if (acgu.c() == acgw.PRESENT) {
            if (this.c.b()) {
                achc achc = this.d;
                a = aciv.a(achc, achc.b());
            } else {
                a = this.c.c();
            }
            aciv = this.g;
        } else {
            if (z) {
                achg i = acgu.i();
                a = (aciv) Preconditions.checkNotNull(this.c.m());
                if (a.d == null) {
                    this.a.a(this.b, i, a.a, this.c, acih).a(b.STACKED, null);
                }
            }
            a = this.c.c();
            aciv = this.c.m();
        }
        aciv aciv2 = aciv;
        aciv = a;
        boolean z4 = acig2 == null || acig.d();
        boolean z5 = acig2 == null || acig2.e(this.d, this.c);
        achi achi = new achi(acgu, aciv, aciv2, achj, z2, f, z5, z4, z, acih);
        achi.c.a(this.b, achi);
        if (achi.l) {
            if (achi.d != acgw.DISMISS) {
                z3 = false;
            }
            b(z3);
        }
        achi.e.a(achi);
        achi.f.a(achi);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((achk) it.next()).a(achi);
        }
    }

    public final void a(acgu<T> acgu, acig<T, C> acig, boolean z, acih acih) {
        aciv a;
        aciv aciv;
        acgu<T> acgu2 = acgu;
        acig<T, C> acig2 = acig;
        if (acgu.c() == acgw.PRESENT) {
            if (this.c.b()) {
                achc achc = this.d;
                a = aciv.a(achc, achc.b());
            } else {
                Preconditions.checkArgument(acgu.i().equals(this.c.d()));
                a = this.c.c();
            }
            Preconditions.checkArgument(acgu.h().equals(this.g.e()));
            aciv = this.g;
        } else {
            Preconditions.checkState(this.g == this.c.c());
            a = this.g;
            Preconditions.checkArgument(acgu.i().equals(this.c.l()));
            aciv = this.c.m();
        }
        aciv aciv2 = a;
        aciv aciv3 = aciv;
        boolean z2 = acig2 == null || acig.d();
        boolean z3 = acig2 == null || acig2.e(this.d, this.c);
        acih a2 = acih == null ? acig2 == null ? null : acig.a() : acih;
        achi achi = r1;
        achi achi2 = new achi(acgu, aciv2, aciv3, achj.SETTLING_TO_DESTINATION, z, 1.0f, z3, z2, true, a2);
        acjc a3 = acig2 == null ? this.c.a(acgu2, this.g) : acig.b();
        acjc a4 = acig2 == null ? a3 : this.c.a(acgu2, this.g);
        for (aciv aciv32 : this.c.g()) {
            b a5 = a3.a(aciv32);
            b bVar = aciv32.b.a;
            b a6 = a4.a(aciv32);
            if (((a6.ordinal() > bVar.ordinal() && a6.ordinal() <= a5.ordinal()) || (a6.ordinal() < bVar.ordinal() && a6.ordinal() >= a5.ordinal())) && (a6.ordinal() < b.PARTIALLY_VISIBLE.ordinal() || (a6 == b.PARTIALLY_VISIBLE && this.h))) {
                aciv32.a(a6, achi);
            }
            if (acgu.c() != acgw.DISMISS || aciv32 != this.c.c()) {
                if (!aciv32.e().a()) {
                    break;
                }
            }
        }
        if (acgu.c() == acgw.PRESENT) {
            this.c.b(acgu2, this.g);
        } else {
            Preconditions.checkState(this.g == this.c.j());
            this.a.a(this.b, this.g);
        }
        b(false);
        if (achi.j && this.h) {
            achi.f.a(b.VISIBLE, achi);
        }
        this.g = null;
        acgu.b().b(this.b, achi);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((achk) it.next()).b(achi);
        }
    }

    public final void a(acgu<T> acgu, boolean z) {
        aciv c;
        aciv aciv;
        if (acgu.c() == acgw.PRESENT) {
            Preconditions.checkArgument(this.g.equals(this.c.c()) ^ 1);
            c = this.c.c();
            aciv = this.g;
        } else {
            Preconditions.checkArgument(this.g.equals(this.c.c()));
            c = this.g;
            aciv = this.c.m();
        }
        achi achi = new achi(acgu, c, aciv, achj.SETTLING_BACK_TO_SOURCE, z, MapboxConstants.MINIMUM_ZOOM, true, true, true, null);
        Preconditions.checkState(achi.h ^ 1, "Programmatic navigation cannot result in onLandOnSamePage ".concat(String.valueOf(achi)));
        if (acgu.c() == acgw.PRESENT) {
            this.c.c().b(achi);
            this.g.b(achi);
            this.a.a(this.b, this.g);
        } else {
            this.g.b(achi);
            this.c.m().b(achi);
        }
        b(false);
        this.g = null;
        acgu.b().c(this.b, achi);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((achk) it.next()).c(achi);
        }
    }

    public final void a(T t, acih acih) {
        List a = this.d.a(t);
        this.c.a((achg) t);
        a((acgu) a.get(a.size() - 1), 1.0f, true, achj.SETTLING_TO_DESTINATION, true, null, acih);
        a((acgu) a.get(a.size() - 1), new acid(), true, acih);
    }

    public final void a(achk<T, C> achk) {
        this.e.add(achk);
    }

    public final void a(acih acih, T t) {
        if (t.equals(this.c.d())) {
            this.c.c().c.onNewPayload(acih);
        }
    }

    public final void a(Collection<achk<T, C>> collection) {
        this.e.addAll(collection);
    }

    public final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.h) {
                Object obj = 1;
                for (aciv aciv : this.c.g()) {
                    if (obj != null) {
                        aciv.a(b.VISIBLE, a(true, aciv));
                        obj = null;
                    } else {
                        aciv.a(b.PARTIALLY_VISIBLE, a(true, aciv));
                    }
                    if (!aciv.e().a()) {
                        break;
                    }
                }
                return;
            }
            for (aciv aciv2 : this.c.g()) {
                aciv2.a(b.STACKED, a(false, aciv2));
                if (!aciv2.e().a()) {
                    break;
                }
            }
        }
    }

    public final void b(achk<T, C> achk) {
        this.e.remove(achk);
    }

    public final boolean b() {
        return this.h;
    }
}
