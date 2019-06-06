package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.acwc.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: aclo */
public final class aclo {
    acra A;
    public boolean B = false;
    int C = -1;
    public a D;
    public List<acvh> E;
    public Location F;
    cgi G;
    cgi H;
    boolean I;
    boolean J = true;
    long K;
    int L;
    long M;
    boolean N;
    public acrn O;
    public String P;
    public List<String> Q = null;
    private final adco R;
    private final ajdp<Optional<alkn>> S = this.d.j(ajfu.a).f();
    private final ajdp<Double> T = this.e.f();
    private final aclj U;
    private final HashMap<String, Integer> V = new HashMap();
    private final Runnable W = new 1();
    private final Runnable X = new a();
    private final String Y;
    private final ftl Z;
    final adco a;
    private final ajei aa;
    private final zfw ab;
    private Typeface ac = null;
    private boolean ad;
    private final Runnable ae = new b(false);
    final acqz b = new acqz();
    public final ackl c;
    final ajwl<Optional<alkn>> d = new ajwl();
    final ajwl<Double> e = new ajwl();
    final acxj f;
    final Context g;
    public final acwc h;
    final Object i = new Object();
    final cgi j = new cgn();
    final cgi k = new cgn();
    public final Set<actb> l;
    public final ackr m;
    final adce n;
    final Set<String> o = new HashSet();
    final ArrayList<String> p = new ArrayList();
    public final ackz q;
    final adbv r;
    final boolean s;
    public final acvu t;
    public final niu u;
    final acxs v;
    public final acqn w;
    public int x;
    public boolean y;
    acyd z;

    /* renamed from: aclo$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            aclo.this.n.a(new b(true));
        }
    }

    /* renamed from: aclo$a */
    class a implements Runnable {
        a() {
        }

        public final void run() {
            adbv adbv = aclo.this.r;
            acmj j = adbv.j();
            if (j != null && adbv.e()) {
                List list;
                int size;
                int length;
                acvu acvu = aclo.this.t;
                double i = j.i();
                synchronized (acvu) {
                    list = acvu.h;
                    acvu.h = null;
                }
                if (!(list == null && acvu.p == i)) {
                    acvu.p = i;
                    if (list != null) {
                        acvu.o = list;
                    }
                    if (acvu.o != null) {
                        acwk acwk;
                        if (acvu.q == null) {
                            acvu.q = new acvt(acvu.i, acvu.d);
                            acvt acvt = acvu.q;
                            acvt.r = R.raw.default_platform;
                            if (acvt.r != 0) {
                                acvt.t = "2131820573";
                            }
                        }
                        if (acvu.r == null) {
                            acvu.r = new acwj(acvu.i, acvu.d);
                        }
                        for (acwk acwk2 : acvu.g.values()) {
                            acwk2.e = false;
                        }
                        acvu.l.clear();
                        acvu.m.clear();
                        for (alhm alhm : acvu.o) {
                            alhm alhm2;
                            if (!(alhm2.e == null || alhm2.e.length == 0)) {
                                double a = adbv.a((double) alhm2.c);
                                if (a <= 0.0d) {
                                    break;
                                }
                                Object obj;
                                double d;
                                if (i < 8.0d) {
                                    Iterator it = acvu.m.iterator();
                                    obj = null;
                                    while (it.hasNext()) {
                                        Iterator it2;
                                        acwh acwh = (acwh) it.next();
                                        double d2 = a;
                                        d = i;
                                        alhm alhm3 = alhm2;
                                        float[] fArr = acvu.n;
                                        Location.distanceBetween(acwh.e, acwh.d, (double) alhm2.c, (double) alhm2.d, fArr);
                                        double d3 = (double) fArr[0];
                                        Double.isNaN(d3);
                                        if (((double) ((int) (d3 / d2))) < 35.0d) {
                                            alhm2 = alhm3;
                                            acwh.b.add(alhm2);
                                            size = acwh.c.size();
                                            length = alhm2.e.length + size;
                                            Collections.addAll(acwh.c, alhm2.e);
                                            double length2 = (double) (alhm2.c * ((float) alhm2.e.length));
                                            double d4 = acwh.e;
                                            i = (double) size;
                                            Double.isNaN(i);
                                            d4 *= i;
                                            Double.isNaN(length2);
                                            length2 += d4;
                                            d4 = (double) length;
                                            Double.isNaN(d4);
                                            acwh.e = length2 / d4;
                                            length2 = (double) (alhm2.d * ((float) alhm2.e.length));
                                            it2 = it;
                                            double d5 = acwh.d;
                                            Double.isNaN(i);
                                            d5 *= i;
                                            Double.isNaN(length2);
                                            length2 += d5;
                                            Double.isNaN(d4);
                                            acwh.d = length2 / d4;
                                            obj = 1;
                                        } else {
                                            it2 = it;
                                            alhm2 = alhm3;
                                            obj = null;
                                        }
                                        if (obj != null) {
                                            break;
                                        }
                                        it = it2;
                                        a = d2;
                                        i = d;
                                    }
                                    d = i;
                                } else {
                                    d = i;
                                    obj = null;
                                }
                                if (obj == null) {
                                    acvu.m.add(new acwh(alhm2));
                                }
                                i = d;
                            }
                        }
                        for (acwh acwh2 : acvu.m) {
                            if (acwh2.b.size() > 1) {
                                Collections.sort(acwh2.c, acwh.a);
                            }
                            for (alhq alhq : acwh2.c) {
                                acwk2 = (acwk) acvu.g.get(alhq.a);
                                if (acwk2 == null) {
                                    acwc acwc = acvu.e;
                                    int i2 = acvu.f;
                                    acvu.f = i2 + 1;
                                    acwk2 = new acwk(acwc, new acvp(i2));
                                } else if (acwk2.e) {
                                }
                                acwk2.a(acwh2, acvu.g, acvu.b(acwh2), acvu.a(acwh2));
                                acvu.l.add(acwk2);
                            }
                        }
                        for (acwk acwk3 : acvu.l) {
                            acwk3.n = acwk3.a.e ? -200.0f : acwk3.f;
                        }
                        Collections.sort(acvu.l, acvu.j);
                        synchronized (acvu) {
                            acvu.k = new adcf(acvu.c, acvu.l);
                        }
                    }
                }
                acwc acwc2 = aclo.this.h;
                acwc2.c.clear();
                synchronized (acwc2.b) {
                    acwc2.c.addAll(acwc2.b);
                }
                synchronized (acwc2.d) {
                    for (int a2 : acwc2.a) {
                        acwc2.e.a(a2).a();
                    }
                    for (int i3 = 0; i3 < acwc2.c.size(); i3++) {
                        acvm acvm = (acvm) acwc2.c.get(i3);
                        String a3 = acwc2.g.a();
                        if (!(a3 == null || (acwc2.l ^ acwc2.k) == 0 || !a3.equals(acvm.a))) {
                            acwc2.l = acwc2.k;
                        }
                        acwc2.e.a(acvm.b.z).a(acvm.b);
                    }
                }
                adbv.m();
            }
        }
    }

    /* renamed from: aclo$b */
    class b implements Runnable {
        private final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        private void a(aljy[] aljyArr, List<acxl> list, double d, String str, alkl alkl) {
            if (aljyArr != null) {
                for (aljy aljy : aljyArr) {
                    if (b.a(aljy) && !b.a(aljy, d)) {
                        list.add(new acxl(aljy, alkl, Integer.valueOf(aclo.this.b(aljy.b))));
                    }
                }
            }
        }

        private boolean a(acxs acxs, List<acxl> list, alkj[] alkjArr, double d) {
            acxs acxs2 = acxs;
            Object obj = null;
            for (alkj alkj : alkjArr) {
                acxm acxm = (acxm) acxs2.a.m.b.a(new adcp(alkj));
                if (acxm != null) {
                    a(acxm.b, list, d, null, acxm.a);
                } else {
                    obj = 1;
                }
                acxh acxh = (acxh) acxs2.a.m.c.a(new adcp(alkj));
                if (acxh != null) {
                    a(acxh.b, list, d, null, acxh.a);
                } else {
                    obj = 1;
                }
                jb jbVar = acxs2.a.m.d;
                acxb acxb = jbVar == null ? null : (acxb) jbVar.a(new adcp(alkj));
                if (acxb != null) {
                    a(acxb.b, list, d, null, acxb.a);
                } else if (acxs2.b(acxv.GAME) != null) {
                    obj = 1;
                }
            }
            return obj == null;
        }

        private static boolean a(aljy aljy) {
            return aljy.j == 0 || aljy.j == 2 || aljy.j == 3 || aljy.j == 1;
        }

        private static boolean a(aljy aljy, double d) {
            return d < ((double) aljy.g) || ((aljy.h > MapboxConstants.MINIMUM_ZOOM ? 1 : null) != null && d > ((double) aljy.h));
        }

        public final void run() {
            adbv adbv = aclo.this.r;
            if (!(aclo.this.v == null || !adbv.e() || adbv.j() == null)) {
                aclb aclb = adbv.d;
                if (aclb.e) {
                    cgi cgi = aclb.e ? aclb.b : null;
                    if (cgi != null) {
                        cgj a = aclb.a();
                        double d = aclb.c;
                        if (a != null) {
                            alkj a2 = adbu.a(cgi.getLatitude(), cgi.getLongitude(), (int) d);
                            cgi a3 = cgo.a(a.getLatNorth(), a.getLonEast());
                            cgi a4 = cgo.a(a.getLatSouth(), a.getLonWest());
                            Object obj = (!this.a && a4.equals(aclo.this.H) && a3.equals(aclo.this.G)) ? null : 1;
                            SystemClock.uptimeMillis();
                            int min = Math.min(15, Math.max(1, (int) Math.floor(d)));
                            int min2 = Math.min(15, (int) Math.ceil(d));
                            double d2 = (double) min2;
                            alkj[] a5 = adbu.a(a4, a3, d2, cgi.getLongitude());
                            alkj[] a6 = min2 == min ? adcp.b : adbu.a(a4, a3, (double) min, cgi.getLongitude());
                            if (a5 == null || a6 == null) {
                                aclo.this.a.a(new b(this.a));
                            } else {
                                aclo aclo = aclo.this;
                                aclo.G = a3;
                                aclo.H = a4;
                                acxs acxs = aclo.v;
                                adcp[] adcpArr = (adcp[]) aklq.a(adcp.a(a5), adcp.a(a6));
                                if (adcpArr != null) {
                                    acxs.a.a(adcpArr);
                                }
                                if (aclo.this.s) {
                                    acxs = aclo.this.v;
                                    Object[] a7 = adcp.a(a5);
                                    Object[] a8 = adcp.a(a6);
                                    adcp adcp = new adcp(a2);
                                    adcpArr = (adcp[]) aklq.a(a7, a8);
                                    if (adcpArr != null) {
                                        acxt acxt = acxs.b;
                                        if (adcp.a() != null) {
                                            alkj a9 = acxt.a((alkj) adcp.a());
                                            synchronized (acxt.e) {
                                                acxt.g = new adcp(a9);
                                            }
                                            acxt.f.a(new defpackage.acxt.b(acxt, adcpArr));
                                        }
                                    }
                                }
                                if (obj != null) {
                                    alkk a10 = aclo.this.v.b.a.a(new adcp(acxt.a(a2)));
                                    if (a10 != null) {
                                        if (aclo.this.O != null) {
                                            aclo.this.O.a(a10);
                                        }
                                        aclo.this.d.a(Optional.fromNullable(a10.e));
                                    }
                                    aclo.this.e.a(Double.valueOf(d));
                                    ArrayList<acxl> arrayList = new ArrayList();
                                    int i = min;
                                    if (a(aclo.this.v, arrayList, a5, d)) {
                                        aclo.this.o.clear();
                                        for (acxl acxl : arrayList) {
                                            aljy aljy = acxl.a;
                                            if (aljy.f != null && aljy.f.length > 0) {
                                                String str = aljy.f[0].b;
                                                if (str != null) {
                                                    aclo.this.o.add(str);
                                                }
                                            }
                                        }
                                        aclo.this.f.a.a(aclo.this.o, aclo.this.p);
                                        aclo.this.z = new acyd(arrayList);
                                    }
                                    synchronized (aclo.this.i) {
                                    }
                                    if (aclo.this.B) {
                                        aclo aclo2 = aclo.this;
                                        aclo2.A = aclo2.b.a(aclo.this.v, d, (double) i, a6, d2, a5, a4, a3, cgi.getLongitude());
                                    }
                                    adbv.m();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public aclo(niu niu, adbv adbv, acli acli, acwc acwc, ackl ackl, adce adce, acxj acxj, aclj aclj, Context context, ajei ajei, acvu acvu, ftl ftl, acxs acxs, acqn acqn) {
        acli acli2 = acli;
        this.r = adbv;
        StringBuilder stringBuilder = new StringBuilder("ViewStateManager_");
        stringBuilder.append(acli2.a);
        this.Y = stringBuilder.toString();
        this.n = adce;
        this.h = acwc;
        this.c = ackl;
        this.f = acxj;
        this.U = aclj;
        this.g = context;
        this.aa = ajei;
        this.Z = ftl;
        this.l = new HashSet();
        this.a = new adco(90, new acll(this.n));
        this.R = new adco(60, new acll(this.n));
        this.ab = zgb.a(adcw.b.callsite("ViewStateManager"));
        this.q = new ackz();
        this.t = acvu;
        this.m = new ackr();
        this.s = acli2.e;
        this.u = niu;
        this.v = acxs;
        this.w = acqn;
    }

    private static /* synthetic */ boolean a(double d, Double d2, Double d3) {
        return Math.abs(d2.doubleValue() - d3.doubleValue()) <= d;
    }

    public final synchronized Typeface a() {
        return this.ac;
    }

    public final void a(acrn acrn) {
        this.O = acrn;
    }

    public final void a(actb actb) {
        this.l.add(actb);
    }

    public final void a(acvm acvm) {
        acwc acwc = this.h;
        synchronized (acwc.b) {
            acwc.b.remove(acvm);
            acwc.b.add(acvm);
            acwc.f.put(acvm.a, acvm);
        }
        acwc.e();
    }

    public final void a(a aVar) {
        this.D = aVar;
    }

    public final void a(acwe acwe) {
        this.h.i = acwe;
    }

    public final synchronized void a(Typeface typeface) {
        this.ac = typeface;
    }

    public final void a(String str) {
        this.h.b(str);
    }

    public final void a(List<acvh> list) {
        this.E = list;
    }

    public final void a(boolean z) {
        this.c.a = z;
        this.h.a(z);
        a aVar = this.D;
        if (aVar != null && aVar.a(z, this.U.a())) {
            this.r.m();
        }
    }

    public final synchronized int b(String str) {
        Integer num = (Integer) this.V.get(str);
        if (num != null) {
            return num.intValue();
        }
        num = Integer.valueOf(this.V.size());
        this.V.put(str, num);
        return num.intValue();
    }

    public final void b() {
        this.aa.a(this.Z.b(adew.DISABLE_HEATMAP).b((ajdw) this.ab.f()).e(new -$$Lambda$aclo$feHHhF3xF2s4_O-Uh7t3Ec5JGV4(this)));
    }

    public final void b(actb actb) {
        this.l.remove(actb);
    }

    public final void b(acvm acvm) {
        if (TextUtils.equals(this.h.a(), acvm.a)) {
            this.h.b(null);
        }
        this.h.a(acvm);
    }

    public final void c() {
        this.a.a(this.ae);
        this.R.a(this.X);
    }

    public final void c(acvm acvm) {
        this.h.b(acvm.a);
    }

    public final void d() {
        this.aa.a(this.ab.l().a(this.W));
    }

    public final void d(acvm acvm) {
        if (acvm != null) {
            acwc acwc = this.h;
            String str = acvm.a;
            synchronized (acwc.d) {
                if (str.equals(acwc.h)) {
                    acwc.b(null);
                }
            }
        }
        this.w.a.a(acqk.a);
    }

    public final void e() {
        this.n.a(new b(true));
    }

    public final void f() {
        this.h.b(null);
        this.w.a.a(acqk.a);
    }

    public final float g() {
        a aVar = this.D;
        return aVar != null ? aVar.a() : 1.0f;
    }

    public final ackl h() {
        return this.c;
    }

    public final void i() {
        this.n.a(this.X);
    }

    public final acvu j() {
        return this.t;
    }

    public final synchronized void k() {
        this.ad = false;
    }

    public final synchronized void l() {
        this.ad = true;
    }

    public final synchronized boolean m() {
        return this.ad;
    }

    public final acwc n() {
        return this.h;
    }

    public final ajdp<Optional<alkn>> o() {
        return this.S;
    }

    public final ajdp<Double> p() {
        return this.T.a(new -$$Lambda$aclo$g60J_-OVLmbrSQCDkEC50kf0dn0(0.5d));
    }

    public final acqn q() {
        return this.w;
    }
}
