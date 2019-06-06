package defpackage;

import android.content.Context;
import android.view.View;
import com.google.common.base.Strings;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Lists;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: rkp */
public abstract class rkp<T extends rmk> implements zma {
    final riq h;
    protected final WeakReference<Context> i;
    ajei j = new ajei();
    protected int k;

    /* renamed from: rkp$1 */
    class 1 implements ajdu<List<zmy>, znh<zmy>> {

        /* renamed from: rkp$1$1 */
        class 1 implements ajey<znh<zmy>, znh<zmy>> {
            1() {
            }

            public final /* bridge */ /* synthetic */ boolean test(Object obj, Object obj2) {
                return ((znh) obj) == ((znh) obj2);
            }
        }

        /* renamed from: rkp$1$2 */
        class 2 implements ajex<List<zmy>, rhf, znh<zmy>> {
            2() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                rhf rhf = (rhf) obj2;
                znf<zmy> znf = new znf((List) obj);
                Supplier memoize = Suppliers.memoize(new 4(znf));
                Object obj3 = null;
                int i = 0;
                for (zmy zmy : znf) {
                    Object a;
                    List list;
                    rmk rmk;
                    rmk rmk2;
                    rmk rmk3;
                    rmk rmk4;
                    if (zmy instanceof rmk) {
                        rmk = (rmk) zmy;
                        a = rkp.a(rhf, rmk);
                        if (rmk != a) {
                            list = (List) memoize.get();
                        } else {
                            i++;
                        }
                    } else if (zmy instanceof rnq) {
                        rnq rnq = (rnq) zmy;
                        rmk2 = rnq.a;
                        rmk = rnq.b;
                        rmk3 = (rmp) rkp.a(rhf, rmk2);
                        rmk4 = (rmp) rkp.a(rhf, rmk);
                        if (rmk4 == rmk && rmk3 == rmk2) {
                            i++;
                        } else {
                            ((List) memoize.get()).set(i, new rnq(rmk3, rmk4));
                            obj3 = 1;
                            i++;
                        }
                    } else {
                        if (zmy instanceof rkb) {
                            rkb rkb = (rkb) zmy;
                            rmk2 = rkb.a.f;
                            rmk3 = null;
                            if (rkb.b != null) {
                                rmk3 = rkb.b.f;
                            }
                            rmk = (rmp) rkp.a(rhf, rmk2);
                            rmk4 = (rmp) rkp.a(rhf, rmk3);
                            if (rmk4 != rmk3 || rmk != rmk2) {
                                list = (List) memoize.get();
                                a = new rkb(rmk, rmk4);
                            }
                        } else if (zmy instanceof rnu) {
                            zmy zmy2;
                            zmy zmy3 = (rnu) zmy;
                            Supplier memoize2 = Suppliers.memoize(new 5(zmy3));
                            List list2 = zmy3.h;
                            Object obj4 = null;
                            for (int i2 = 0; i2 < list2.size(); i2++) {
                                zmy zmy4 = (zmy) list2.get(i2);
                                if (zmy4 instanceof rmk) {
                                    rmk rmk5 = (rmk) zmy4;
                                    if (rhf.a(rmk5.g().a) != rmk5.e()) {
                                        ((List) memoize2.get()).set(i2, rmk5.a());
                                        obj4 = 1;
                                    }
                                }
                            }
                            if (obj4 != null) {
                                zmy rnu = new rnu(zmy3.getType(), zmy3.c, zmy3.d, (List) memoize2.get(), zmy3.getId(), zmy3.e, zmy3.f, zmy3.g);
                            } else {
                                zmy2 = zmy3;
                            }
                            if (zmy2 != zmy) {
                                ((List) memoize.get()).set(i, zmy2);
                                obj3 = 1;
                            }
                        } else if (zmy instanceof rnr) {
                            rnr rnr = (rnr) zmy;
                            rmk rmk6 = rnr.a;
                            rmk = rnr.b;
                            rmk2 = (rnn) rkp.a(rhf, rmk6);
                            rmk rmk7 = (rnn) rkp.a(rhf, rmk);
                            if (rmk7 != rmk || rmk2 != rmk6) {
                                ((List) memoize.get()).set(i, new rnr(rmk2, rmk7));
                                obj3 = 1;
                            }
                        }
                        i++;
                    }
                    list.set(i, a);
                    obj3 = 1;
                    i++;
                }
                return obj3 != null ? new znf((List) memoize.get()) : znf;
            }
        }

        1() {
        }

        public final ajdt<znh<zmy>> apply(ajdp<List<zmy>> ajdp) {
            return ajdp.a((ajdt) ajdp, rkp.this.d().b(), new 2()).a(new 1());
        }
    }

    /* renamed from: rkp$2 */
    class 2 implements ajfc<String, ajdt<String>> {
        2() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (String) obj;
            return Strings.isNullOrEmpty(obj) ? ajdp.b(obj) : ajdp.b(150, TimeUnit.MILLISECONDS).p(new ajfc<Long, String>() {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return obj;
                }
            });
        }
    }

    /* renamed from: rkp$3 */
    class 3 implements ajfc<String, String> {
        3() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return vxg.a((String) obj).trim();
        }
    }

    /* renamed from: rkp$4 */
    static class 4 implements Supplier<List<zmy>> {
        private /* synthetic */ znh a;

        4(znh znh) {
            this.a = znh;
        }

        public final /* synthetic */ Object get() {
            return Lists.newArrayList(this.a);
        }
    }

    /* renamed from: rkp$5 */
    static class 5 implements Supplier<List<zmy>> {
        private /* synthetic */ rnu a;

        5(rnu rnu) {
            this.a = rnu;
        }

        public final /* synthetic */ Object get() {
            return new ArrayList(this.a.h);
        }
    }

    public rkp(riq riq, Context context) {
        this.h = riq;
        this.i = new WeakReference(context);
    }

    static <TModel extends rmk> TModel a(rhf rhf, TModel tModel) {
        return tModel == null ? null : rhf.a(tModel.g().a) != tModel.e() ? tModel.a() : tModel;
    }

    public abstract int a();

    public final void a(View view, zmy zmy) {
    }

    public final riq b() {
        return this.h;
    }

    public final void b(View view, zmy zmy) {
    }

    public final rhf d() {
        return this.h.h();
    }

    public void dispose() {
        this.j.a();
    }

    public final rig e() {
        return this.h.i();
    }

    /* Access modifiers changed, original: protected|final */
    public final ajdu<List<zmy>, znh<zmy>> f() {
        return new 1();
    }

    /* Access modifiers changed, original: protected|final */
    public final ajdp<String> g() {
        return this.h.g().p(new 3()).h(new 2()).j(ajfu.a);
    }

    public boolean isDisposed() {
        return this.j.isDisposed();
    }
}
