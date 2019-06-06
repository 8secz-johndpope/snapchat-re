package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: lkh */
public final class lkh implements ajdr<achi<zjm, zjk>> {
    final akbl<achk<zjm, zjk>, ajxw> a;
    private final akbl<achk<zjm, zjk>, ajxw> b;

    /* renamed from: lkh$b */
    public static final class b implements achk<zjm, zjk> {
        private /* synthetic */ ajdq a;

        b(ajdq ajdq) {
            this.a = ajdq;
        }

        public final void a(achi<zjm, zjk> achi) {
            akcr.b(achi, "navigationEvent");
        }

        public final void b(achi<zjm, zjk> achi) {
            akcr.b(achi, "navigationEvent");
            this.a.a((Object) achi);
        }

        public final void c(achi<zjm, zjk> achi) {
            akcr.b(achi, "navigationEvent");
        }
    }

    /* renamed from: lkh$a */
    static final class a implements ajev {
        private /* synthetic */ lkh a;
        private /* synthetic */ b b;

        a(lkh lkh, b bVar) {
            this.a = lkh;
            this.b = bVar;
        }

        public final void run() {
            this.a.a.invoke(this.b);
        }
    }

    public lkh(akbl<? super achk<zjm, zjk>, ajxw> akbl, akbl<? super achk<zjm, zjk>, ajxw> akbl2) {
        akcr.b(akbl, "addNavigationSubscriber");
        akcr.b(akbl2, "removeNavigationSubscriber");
        this.b = akbl;
        this.a = akbl2;
    }

    public final void subscribe(ajdq<achi<zjm, zjk>> ajdq) {
        akcr.b(ajdq, Event.EMITTER);
        b bVar = new b(ajdq);
        ajdq.a(ajek.a((ajev) new a(this, bVar)));
        this.b.invoke(bVar);
    }
}
