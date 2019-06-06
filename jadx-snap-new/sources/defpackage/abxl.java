package defpackage;

import defpackage.abqr.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: abxl */
public final class abxl {
    abxp a;
    final List<c> b;
    final List<c> c;
    private final List<b> d;
    private final List<abxm> e;
    private final List<c> f;
    private final abqr g;
    private final boolean h;

    /* renamed from: abxl$a */
    public static final class a {
        public List<abxp> a;
        final List<c> b = new ArrayList();
        final List<ajxm<abxp, akbk<ajxw>>> c = new ArrayList();
        public abxp d;

        public final c a(abxp abxp) {
            akcr.b(abxp, "state");
            c cVar = new c(abxp);
            this.b.add(cVar);
            return cVar;
        }

        public final abxl a() {
            List list = this.a;
            String str = "states";
            if (list == null) {
                akcr.a(str);
            }
            if (list.isEmpty()) {
                throw new IllegalStateException("DFA.Builder must specify a non zero number of states");
            }
            if (this.d == null) {
                list = this.a;
                if (list == null) {
                    akcr.a(str);
                }
                this.d = (abxp) ajyu.f(list);
            }
            return new abxl(this);
        }

        public final void a(abxp abxp, akbk<ajxw> akbk) {
            akcr.b(abxp, "state");
            akcr.b(akbk, "listener");
            this.c.add(new ajxm(abxp, akbk));
        }

        public final void a(List<abxp> list) {
            akcr.b(list, "<set-?>");
            this.a = list;
        }

        public final void a(List<abxp> list, akbk<ajxw> akbk) {
            akcr.b(list, "states");
            akcr.b(akbk, "listener");
            List list2 = this.c;
            Iterable<abxp> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (abxp ajxm : iterable) {
                arrayList.add(new ajxm(ajxm, akbk));
            }
            list2.addAll((List) arrayList);
        }
    }

    /* renamed from: abxl$b */
    public interface b {
        void a(abxp abxp);
    }

    /* renamed from: abxl$c */
    public static final class c {
        final List<abxm> a = new ArrayList();
        long b;
        final abxp c;
        private abxp d;

        public c(abxp abxp) {
            akcr.b(abxp, "initialState");
            this.c = abxp;
        }

        public final c a(long j) {
            c cVar = this;
            cVar.b = j;
            return cVar;
        }

        public final c a(abxm abxm) {
            akcr.b(abxm, "input");
            c cVar = this;
            cVar.a.add(abxm);
            return cVar;
        }

        public final c a(abxp abxp) {
            akcr.b(abxp, "endState");
            c cVar = this;
            cVar.d = abxp;
            return cVar;
        }

        public final abxp a() {
            abxp abxp = this.d;
            if (abxp == null) {
                akcr.a("endState");
            }
            return abxp;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("StateTransition from ");
            stringBuilder.append(this.c);
            stringBuilder.append(" to ");
            abxp abxp = this.d;
            if (abxp == null) {
                akcr.a("endState");
            }
            stringBuilder.append(abxp);
            stringBuilder.append(" given inputs: ");
            stringBuilder.append(this.a);
            stringBuilder.append(" and time: ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: abxl$2 */
    public static final class 2 implements a {
        private /* synthetic */ abxl a;

        2(abxl abxl) {
            this.a = abxl;
        }

        public final void a() {
        }

        public final void a(long j, float f) {
            Collection arrayList = new ArrayList();
            Iterator it = this.a.b.iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((float) ((c) next).b) > ((float) j) * f) {
                    i = 0;
                }
                if (i != 0) {
                    arrayList.add(next);
                }
            }
            arrayList = (List) arrayList;
            this.a.c.addAll(arrayList);
            this.a.b.removeAll(arrayList);
            if ((arrayList.isEmpty() ^ 1) != 0) {
                this.a.d(null);
            }
        }
    }

    public abxl(a aVar) {
        akcr.b(aVar, "builder");
        abxp abxp = aVar.d;
        if (abxp == null) {
            List list = aVar.a;
            if (list == null) {
                akcr.a("states");
            }
            abxp = (abxp) ajyu.f(list);
        }
        this.a = abxp;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = aVar.b;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = new abqr();
        this.h = false;
        for (final ajxm ajxm : aVar.c) {
            this.d.add(new b() {
                public final void a(abxp abxp) {
                    akcr.b(abxp, "newState");
                    if ((akcr.a((Object) abxp, (abxp) ajxm.a) ^ 1) == 0) {
                        ((akbk) ajxm.b).invoke();
                    }
                }
            });
        }
        this.g.a((a) new 2(this));
        a(this.a);
    }

    private final void a(abxp abxp) {
        this.b.clear();
        this.c.clear();
        this.a = abxp;
        for (b a : this.d) {
            a.a(abxp);
        }
        long j = 0;
        for (c cVar : this.f) {
            if ((1 ^ akcr.a(cVar.c, (Object) abxp)) == 0) {
                if (cVar.b != 0) {
                    this.b.add(cVar);
                    j = Math.max(j, cVar.b);
                } else {
                    this.c.add(cVar);
                }
            }
        }
        if (j != 0) {
            long j2 = j << 1;
            this.g.a(j2, 0, j2);
            this.g.a();
        }
        d(null);
    }

    private final void d(abxm abxm) {
        List h = ajyu.h((Collection) this.e);
        if (abxm != null) {
            h.add(abxm);
        }
        for (c cVar : this.c) {
            if (!cVar.a.isEmpty()) {
                if (h.containsAll(cVar.a)) {
                }
            }
            a(cVar.a());
            return;
        }
    }

    public final void a(b bVar) {
        akcr.b(bVar, "stateListener");
        this.d.add(bVar);
    }

    public final void a(abxm abxm) {
        akcr.b(abxm, "instantInput");
        d(abxm);
    }

    public final void b(abxm abxm) {
        akcr.b(abxm, "input");
        this.e.add(abxm);
        d(null);
    }

    public final void c(abxm abxm) {
        akcr.b(abxm, "input");
        this.e.remove(abxm);
    }
}
