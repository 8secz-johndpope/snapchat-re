package defpackage;

import com.google.common.base.Predicate;

/* renamed from: qzk */
public final class qzk implements qzj {
    final prd a;
    private final Predicate<Void> b = new b(this);
    private final achb<zjm, zjk> c;

    /* renamed from: qzk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: qzk$b */
    static final class b<T> implements Predicate<Void> {
        private /* synthetic */ qzk a;

        b(qzk qzk) {
            this.a = qzk;
        }

        public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
            prd prd = this.a.a;
            return prd.c && prd.d && prd.b != null;
        }
    }

    static {
        a aVar = new a();
    }

    public qzk(achb<zjm, zjk> achb, prd prd) {
        akcr.b(achb, "navigationHost");
        akcr.b(prd, "feedNavTracker");
        this.c = achb;
        this.a = prd;
    }

    public final void a() {
        this.c.a(new achq(qxo.a, pql.a, this.b, "FriendsFeedSwipeToChatPredicateControllerImpl onVisible"));
    }

    public final void b() {
        this.c.a(this.b);
    }
}
