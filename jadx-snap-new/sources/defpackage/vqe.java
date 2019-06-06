package defpackage;

import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: vqe */
public final class vqe implements ajdu<dnk, Object> {
    final zjw a;
    final zfw b;

    /* renamed from: vqe$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ vqe a;

        a(vqe vqe) {
            this.a = vqe;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final dnk dnk = (dnk) obj;
            akcr.b(dnk, "payload");
            return ajdp.b((Callable) new Callable<T>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ Object call() {
                    vqe vqe = this.a.a;
                    Object obj = dnk;
                    akcr.a(obj, "payload");
                    achb achb = vqe.a.d;
                    if (achb.c) {
                        Object obj2;
                        Object obj3;
                        Iterator it = vqe.a.d.g().iterator();
                        Object obj4;
                        do {
                            obj2 = null;
                            if (!it.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it.next();
                            aciv aciv = (aciv) obj3;
                            if (akcr.a((zjm) aciv.e(), dnh.a) || akcr.a((zjm) aciv.e(), dnh.c)) {
                                obj4 = 1;
                                continue;
                            } else {
                                obj4 = null;
                                continue;
                            }
                        } while (obj4 == null);
                        aciv aciv2 = (aciv) obj3;
                        if (aciv2 != null) {
                            obj2 = (zjm) aciv2.e();
                        }
                        if (obj2 == null) {
                            achb.a(achb, dnh.a, false, (acih) obj, 2);
                        } else if (akcr.a(obj2, (zjm) achb.h())) {
                            achb.a((acih) obj, (achg) obj2);
                        } else {
                            achb.a((achg) obj2, false, true, (acih) obj);
                        }
                    } else {
                        zjw.a(vqe.a, dnh.a, true, null, (acih) obj, 4);
                    }
                    return ajxw.a;
                }
            }).b((ajdw) this.a.b.l()).a((ajdw) this.a.b.h());
        }
    }

    public vqe(zjw zjw, zfw zfw) {
        akcr.b(zjw, "deepLinkNavigator");
        akcr.b(zfw, "schedulers");
        this.a = zjw;
        this.b = zfw;
    }

    public final ajdt<Object> apply(ajdp<dnk> ajdp) {
        akcr.b(ajdp, "upstream");
        Object k = ajdp.k((ajfc) new a(this));
        akcr.a(k, "upstream.flatMap { paylo…rInteractive())\n        }");
        return (ajdt) k;
    }
}
