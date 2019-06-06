package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import defpackage.ojc.a;
import java.util.List;

/* renamed from: rvs */
public final class rvs implements achc<zjm, zjk> {
    final ajwy<fxj> a;
    private final ajxe b = ajxh.a(new a(this));
    private final ImmutableMap<zjm, List<acgu<zjm>>> c;

    /* renamed from: rvs$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ rvs a;

        a(rvs rvs) {
            this.a = rvs;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Boolean) ((fxj) this.a.a.get()).a().b();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rvs.class), "isV11Enabled", "isV11Enabled()Ljava/lang/Boolean;");
    }

    public rvs(ajwy<fxj> ajwy) {
        akcr.b(ajwy, "v11Configuration");
        this.a = ajwy;
        Builder put = ImmutableMap.builder().put(dnh.a, ajyl.a(dnh.b.g().a((achg) zjn.a).d()));
        zjm zjm = qxo.a;
        acgu[] acguArr = new acgu[2];
        acguArr[0] = dnh.b.g().a((achg) zjn.a).d();
        Object d = d();
        String str = "isV11Enabled";
        akcr.a(d, str);
        acguArr[1] = qxo.a(d.booleanValue()).g().a((achg) dnh.a).d();
        put = put.put(zjm, ajym.b((Object[]) acguArr));
        zjm = pql.a;
        acguArr = new acgu[3];
        acguArr[0] = dnh.b.g().a((achg) zjn.a).d();
        d = d();
        akcr.a(d, str);
        acguArr[1] = qxo.a(d.booleanValue()).g().a((achg) dnh.a).d();
        acguArr[2] = pql.c.g().a((achg) qxo.a).d();
        put = put.put(zjm, ajym.b((Object[]) acguArr));
        zjm = ojc.a;
        acguArr = new acgu[2];
        acguArr[0] = dnh.b.g().a((achg) zjn.a).d();
        d = d();
        akcr.a(d, str);
        acguArr[1] = a.a(d.booleanValue()).g().a((achg) dnh.a).d();
        put = put.put(zjm, ajym.b((Object[]) acguArr));
        zjm = hbn.a;
        acguArr = new acgu[2];
        acguArr[0] = dnh.b.g().a((achg) zjn.a).d();
        d = d();
        akcr.a(d, str);
        acguArr[1] = hbn.a(d.booleanValue()).g().a((achg) dnh.a).d();
        this.c = put.put(zjm, ajym.b((Object[]) acguArr)).put(adcw.a, ajym.b((Object[]) new acgu[]{dnh.b.g().a((achg) zjn.a).d(), nmh.a.g().a((achg) dnh.a).d()})).build();
    }

    private static acgu<zjm> a(acgu<zjm> acgu, boolean z) {
        if (acgu.f() == z) {
            return acgu;
        }
        Object d = acgu.g().a(z).d();
        akcr.a(d, "this.toBuilder().shouldA…te(shouldAnimate).build()");
        return d;
    }

    private final acgu<zjm> a(boolean z) {
        Object d = d();
        akcr.a(d, "isV11Enabled");
        return rvs.a(qxo.a(d.booleanValue()), z);
    }

    private final acgu<zjm> b(boolean z) {
        Object d = d();
        akcr.a(d, "isV11Enabled");
        return rvs.a(qxo.b(d.booleanValue()), z);
    }

    private final acgu<zjm> c(boolean z) {
        Object d = d();
        akcr.a(d, "isV11Enabled");
        return rvs.a(hbn.a(d.booleanValue()), z);
    }

    private final acgu<zjm> d(boolean z) {
        Object d = d();
        akcr.a(d, "isV11Enabled");
        return rvs.a(hbn.b(d.booleanValue()), z);
    }

    private final Boolean d() {
        return (Boolean) this.b.b();
    }

    private final acgu<zjm> e(boolean z) {
        Object d = d();
        akcr.a(d, "isV11Enabled");
        return rvs.a(a.a(d.booleanValue()), z);
    }

    private final acgu<zjm> f(boolean z) {
        Object d = d();
        akcr.a(d, "isV11Enabled");
        return rvs.a(a.b(d.booleanValue()), z);
    }

    public final /* bridge */ /* synthetic */ achg a() {
        return dnh.a;
    }

    public final /* synthetic */ acig a(achg achg, achg achg2, boolean z) {
        acid acid;
        Object obj = (zjm) achg;
        Object obj2 = (zjm) achg2;
        akcr.b(obj, "sourcePageType");
        akcr.b(obj2, "destinationPageType");
        if (obj.equals(obj2)) {
            acid = new acid();
        } else {
            String str = "MapScreenFeature.PRESENT_PULLDOWN";
            String str2 = "CHAT_PRESENT_DEFAULT";
            acgu[] acguArr;
            Object obj3;
            acgu acgu;
            Object obj4;
            String str3;
            Object obj5;
            if (akcr.a(obj, dnh.a)) {
                if (akcr.a(obj2, qxo.a)) {
                    acid = new acii(a(z));
                } else if (akcr.a(obj2, hbn.a)) {
                    acid = new acii(c(z));
                } else if (akcr.a(obj2, pql.a)) {
                    acguArr = new acgu[2];
                    acguArr[0] = a(z);
                    obj3 = pql.c;
                    akcr.a(obj3, str2);
                    acguArr[1] = rvs.a(obj3, z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, ojc.a)) {
                    acid = new acii(e(z));
                } else if (akcr.a(obj2, adcw.a)) {
                    acgu = nmh.a;
                    akcr.a((Object) acgu, str);
                    acid = new acii(acgu);
                }
            } else if (akcr.a(obj, qxo.a)) {
                if (akcr.a(obj2, dnh.a)) {
                    acid = new acii(b(z));
                } else if (akcr.a(obj2, hbn.a)) {
                    acid = new acii(new acgu[]{b(z), c(z)}, (byte) 0);
                } else if (akcr.a(obj2, pql.a)) {
                    obj2 = pql.c;
                    akcr.a(obj2, str2);
                    acid = new acii(rvs.a(obj2, z));
                } else if (akcr.a(obj2, ojc.a)) {
                    acid = new acii(new acgu[]{b(z), e(z)}, (byte) 0);
                } else if (akcr.a(obj2, adcw.a)) {
                    acguArr = new acgu[2];
                    acguArr[0] = b(z);
                    obj4 = nmh.a;
                    akcr.a(obj4, str);
                    acguArr[1] = obj4;
                    acid = new acii(acguArr, (byte) 0);
                }
            } else if (akcr.a(obj, pql.a)) {
                str3 = "CHAT_DISMISS_DEFAULT";
                if (akcr.a(obj2, dnh.a)) {
                    acguArr = new acgu[2];
                    obj5 = pql.d;
                    akcr.a(obj5, str3);
                    acguArr[0] = rvs.a(obj5, z);
                    acguArr[1] = b(z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, qxo.a)) {
                    obj2 = pql.d;
                    akcr.a(obj2, str3);
                    acid = new acii(rvs.a(obj2, z));
                } else if (akcr.a(obj2, hbn.a)) {
                    acguArr = new acgu[3];
                    obj5 = pql.d;
                    akcr.a(obj5, str3);
                    acguArr[0] = rvs.a(obj5, z);
                    acguArr[1] = b(z);
                    acguArr[2] = c(z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, ojc.a)) {
                    acguArr = new acgu[3];
                    obj5 = pql.d;
                    akcr.a(obj5, str3);
                    acguArr[0] = rvs.a(obj5, z);
                    acguArr[1] = b(z);
                    acguArr[2] = e(z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, adcw.a)) {
                    acguArr = new acgu[3];
                    Object obj6 = pql.d;
                    akcr.a(obj6, str3);
                    acguArr[0] = rvs.a(obj6, z);
                    acguArr[1] = b(z);
                    obj4 = nmh.a;
                    akcr.a(obj4, str);
                    acguArr[2] = obj4;
                    acid = new acii(acguArr, (byte) 0);
                }
            } else if (akcr.a(obj, hbn.a)) {
                if (akcr.a(obj2, dnh.a)) {
                    acid = new acii(d(z));
                } else if (akcr.a(obj2, qxo.a)) {
                    acid = new acii(new acgu[]{d(z), a(z)}, (byte) 0);
                } else if (akcr.a(obj2, pql.a)) {
                    acguArr = new acgu[3];
                    acguArr[0] = d(z);
                    acguArr[1] = a(z);
                    obj3 = pql.c;
                    akcr.a(obj3, str2);
                    acguArr[2] = rvs.a(obj3, z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, ojc.a)) {
                    acid = new acii(new acgu[]{d(z), e(z)}, (byte) 0);
                } else if (akcr.a(obj2, adcw.a)) {
                    acguArr = new acgu[2];
                    acguArr[0] = d(z);
                    obj4 = nmh.a;
                    akcr.a(obj4, str);
                    acguArr[1] = obj4;
                    acid = new acii(acguArr, (byte) 0);
                }
            } else if (akcr.a(obj, ojc.a)) {
                if (akcr.a(obj2, dnh.a)) {
                    acid = new acii(f(z));
                } else if (akcr.a(obj2, qxo.a)) {
                    acid = new acii(new acgu[]{f(z), a(z)}, (byte) 0);
                } else if (akcr.a(obj2, pql.a)) {
                    acguArr = new acgu[3];
                    acguArr[0] = f(z);
                    acguArr[1] = a(z);
                    obj3 = pql.c;
                    akcr.a(obj3, str2);
                    acguArr[2] = rvs.a(obj3, z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, hbn.a)) {
                    acid = new acii(new acgu[]{f(z), c(z)}, (byte) 0);
                } else if (akcr.a(obj2, adcw.a)) {
                    acguArr = new acgu[2];
                    acguArr[0] = f(z);
                    obj4 = nmh.a;
                    akcr.a(obj4, str);
                    acguArr[1] = obj4;
                    acid = new acii(acguArr, (byte) 0);
                }
            } else if (akcr.a(obj, adcw.a)) {
                str3 = "MapScreenFeature.DISMISS_PULLDOWN";
                if (akcr.a(obj2, dnh.a)) {
                    acgu = nmh.b;
                    akcr.a((Object) acgu, str3);
                    acid = new acii(acgu);
                } else if (akcr.a(obj2, qxo.a)) {
                    acguArr = new acgu[2];
                    obj5 = nmh.b;
                    akcr.a(obj5, str3);
                    acguArr[0] = obj5;
                    acguArr[1] = a(z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, pql.a)) {
                    acguArr = new acgu[3];
                    acguArr[0] = f(z);
                    obj5 = nmh.b;
                    akcr.a(obj5, str3);
                    acguArr[1] = obj5;
                    obj3 = pql.c;
                    akcr.a(obj3, str2);
                    acguArr[2] = rvs.a(obj3, z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, hbn.a)) {
                    acguArr = new acgu[2];
                    obj5 = nmh.b;
                    akcr.a(obj5, str3);
                    acguArr[0] = obj5;
                    acguArr[1] = c(z);
                    acid = new acii(acguArr, (byte) 0);
                } else if (akcr.a(obj2, ojc.a)) {
                    acguArr = new acgu[2];
                    obj5 = nmh.b;
                    akcr.a(obj5, str3);
                    acguArr[0] = obj5;
                    acguArr[1] = e(z);
                    acid = new acii(acguArr, (byte) 0);
                }
            }
            acid = new acid();
        }
        return acid;
    }

    public final /* bridge */ /* synthetic */ achg b() {
        return zjn.a;
    }

    public final /* bridge */ /* synthetic */ achg c() {
        return zjn.b;
    }
}
