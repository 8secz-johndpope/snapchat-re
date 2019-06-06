package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.Set;

/* renamed from: rwg */
public final class rwg extends zgi implements achk<zjm, zjk> {
    idl a;
    final aipn<achb<zjm, zjk>> b;
    final Set<zii> c;

    /* renamed from: rwg$a */
    static final class a implements ajev {
        private /* synthetic */ rwg a;

        a(rwg rwg) {
            this.a = rwg;
        }

        public final void run() {
            rwg rwg = this.a;
            ((achb) rwg.b.get()).b((achk) rwg);
            for (zii a : rwg.c) {
                a.a();
            }
            rwg.a = null;
        }
    }

    public rwg(aipn<achb<zjm, zjk>> aipn, Set<zii> set, zgk<b> zgk) {
        akcr.b(aipn, "navHost");
        akcr.b(set, "listeners");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.b = aipn;
        this.c = set;
    }

    private final void a(idl idl) {
        if (idl != null) {
            for (zii a : this.c) {
                a.a(idl);
            }
            this.a = idl;
        }
    }

    public final ajej a() {
        ((achb) this.b.get()).a((achk) this);
        idl idl = null;
        if (((achb) this.b.get()).c) {
            zjm zjm = (zjm) ((achb) this.b.get()).h();
            if (akcr.a((Object) zjm, zjn.a)) {
                zjm = null;
            }
            if (zjm != null) {
                idg idg = zjm.d;
                if (idg != null) {
                    idl = idg.b;
                }
            }
        }
        if ((akcr.a((Object) idl, this.a) ^ 1) != 0) {
            a(idl);
        }
        Object a = ajek.a((ajev) new a(this));
        akcr.a(a, "Disposables.fromAction({ onActivityPause() })");
        return a;
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }

    public final ajej b() {
        ((achb) this.b.get()).a((achk) this);
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        return obj;
    }

    public final void b(achi<zjm, zjk> achi) {
        idl idl;
        akcr.b(achi, "navigationEvent");
        zjm zjm = (zjm) achi.f.e();
        if (zjm != null) {
            idg idg = zjm.d;
            if (idg != null) {
                idl = idg.b;
                a(idl);
            }
        }
        idl = null;
        a(idl);
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
    }
}
