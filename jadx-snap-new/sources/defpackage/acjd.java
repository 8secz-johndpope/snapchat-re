package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.snapchat.deck.views.DeckView;
import defpackage.acix.b;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* renamed from: acjd */
public class acjd<T extends achg, C extends achd<T, C>> {
    protected final ache<T, C> a;
    protected final DeckView b;
    protected final achc<T, C> c;
    protected final Deque<acje<T, C>> d;

    public acjd(ache<T, C> ache, DeckView deckView, achc<T, C> achc) {
        this(ache, deckView, achc, new ArrayDeque());
    }

    protected acjd(ache<T, C> ache, DeckView deckView, achc<T, C> achc, Deque<acje<T, C>> deque) {
        this.a = ache;
        this.b = deckView;
        this.c = achc;
        this.d = deque;
    }

    public final int a(int i) {
        Iterator descendingIterator = this.d.descendingIterator();
        int i2 = 0;
        while (descendingIterator.hasNext()) {
            aciv a = ((acje) descendingIterator.next()).a();
            if (a.a == i) {
                return i2;
            }
            if (a.d != null) {
                i2++;
            }
        }
        return i2;
    }

    public final acjc<T, C> a(acgu<T> acgu, aciv<T, C> aciv) {
        return new acjc(this, acgu, aciv);
    }

    public final acjc<T, C> a(acig<T, C> acig) {
        return new acjc(this, acig);
    }

    public final void a(T t) {
        List a = this.c.a(t);
        for (int i = 0; i < a.size() - 1; i++) {
            acgu acgu = (acgu) a.get(i);
            aciv a2 = aciv.a(this.c, acgu.h());
            b(acgu, a2);
            if (i == a.size() - 2) {
                a2.a(b.VISIBLE, new achi(acgu, aciv.a(this.c, acgu.d()), a2, achj.SETTLING_TO_DESTINATION, true, 1.0f, true, true, true, null));
            }
        }
    }

    public final C b(T t) {
        for (acje acje : this.d) {
            if (acje.a().e().equals(t)) {
                return acje.a().c;
            }
        }
        return null;
    }

    public final void b(acgu<T> acgu, aciv<T, C> aciv) {
        Preconditions.checkArgument(acgu.c() == acgw.PRESENT);
        if (!this.d.isEmpty()) {
            Preconditions.checkArgument(acgu.i().equals(d()));
        }
        this.d.push(new acje(acgu, aciv));
        aciv.a(b.STACKED, null);
    }

    public final void b(aciv<T, C> aciv) {
        for (acje acje : this.d) {
            if (acje.a.h().equals(aciv.e())) {
                boolean z = true;
                Preconditions.checkArgument(acje.a().d == null);
                if (aciv.a != acje.b.a) {
                    z = false;
                }
                Preconditions.checkArgument(z);
                acje.b = aciv;
                return;
            }
        }
    }

    public final boolean b() {
        return this.d.isEmpty();
    }

    public final aciv<T, C> c() {
        return b() ? null : ((acje) this.d.peek()).a();
    }

    public final T d() {
        return b() ? null : c().e();
    }

    public final int e() {
        return b() ? -1 : c().a;
    }

    public final C f() {
        return b() ? null : c().c;
    }

    public final Deque<aciv<T, C>> g() {
        ArrayDeque arrayDeque = new ArrayDeque(this.d.size());
        for (acje a : this.d) {
            arrayDeque.add(a.a());
        }
        return arrayDeque;
    }

    public final Iterator<aciv<T, C>> h() {
        return Iterators.unmodifiableIterator(Iterators.transform(this.d.iterator(), -$$Lambda$NosP9OM0VX2cBE75gzyd7T2HKT4.INSTANCE));
    }

    public final int i() {
        return this.d.size();
    }

    public final aciv<T, C> j() {
        aciv a = ((acje) this.d.pop()).a();
        a.a(b.ADDED, null);
        Preconditions.checkState(b() ^ 1, "Last page popped in Deck!");
        return a;
    }

    public final acgu<T> k() {
        return ((acje) this.d.peek()).a;
    }

    public final T l() {
        return m().e();
    }

    public final aciv<T, C> m() {
        Iterator it = this.d.iterator();
        it.next();
        return ((acje) it.next()).a();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NavigationStack");
        for (acje acje : this.d) {
            stringBuilder.append(10);
            stringBuilder.append(acje);
        }
        return stringBuilder.toString();
    }
}
