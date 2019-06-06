package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: acxt */
public final class acxt {
    public final a a = new a();
    final HashSet<adcp> b = new HashSet();
    final Object c = new Object();
    final adcl d;
    public final Object e = new Object();
    public final adce f;
    public adcp g;
    private final ajwy<aclo> h;

    /* renamed from: acxt$a */
    public static class a {
        final ConcurrentHashMap<adcp, alkk> a = new ConcurrentHashMap(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        final ConcurrentHashMap<adcp, Long> b = new ConcurrentHashMap(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);

        a() {
        }

        private long b(adcp adcp) {
            Long l = (Long) this.b.get(adcp);
            return l == null ? 0 : l.longValue();
        }

        public final alkk a(adcp adcp) {
            alkk alkk = (alkk) this.a.get(adcp);
            if (alkk == null || System.currentTimeMillis() < b(adcp)) {
                return alkk;
            }
            this.a.remove(adcp);
            this.b.remove(adcp);
            return null;
        }
    }

    /* renamed from: acxt$b */
    public static class b implements Runnable {
        private final WeakReference<acxt> a;
        private final adcp[] b;

        public b(acxt acxt, adcp... adcpArr) {
            this.a = new WeakReference(acxt);
            this.b = adcpArr;
        }

        private void a(ArrayList<alkj> arrayList) {
            alkk[] alkkArr = new alkk[arrayList.size()];
            for (int i = 0; i < alkkArr.length; i++) {
                alkk alkk = new alkk();
                alkk.b = (alkj) arrayList.get(i);
                alkk.c = Integer.MAX_VALUE;
                alkk.a |= 1;
                alkkArr[i] = alkk;
            }
            arrayList.toArray(new alkj[arrayList.size()]);
            acxt.a(alkkArr, (acxt) this.a.get());
        }

        public final void run() {
            acxt acxt = (acxt) this.a.get();
            if (acxt != null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (adcp adcp : this.b) {
                    alkj alkj = (alkj) adcp.a();
                    if (alkj != null) {
                        if (alkj.c >= 11) {
                            alkj a = acxt.a(alkj);
                            adcp adcp2 = new adcp(a);
                            if (acxt.a.a(adcp2) == null) {
                                synchronized (acxt.c) {
                                    if (!acxt.b.contains(adcp2)) {
                                        hashSet.add(a);
                                        acxt.b.add(adcp2);
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (acxt.a.a(adcp) == null) {
                            arrayList.add(alkj);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    a(arrayList);
                }
                if (!hashSet.isEmpty()) {
                    alkj[] alkjArr = new alkj[hashSet.size()];
                    alik alik = new alik();
                    alik.a = (alkj[]) hashSet.toArray(alkjArr);
                    acxt.d.a(alik, new c(this.a, alik.a));
                }
            }
        }
    }

    /* renamed from: acxt$c */
    static class c implements aczq<alil> {
        private final WeakReference<acxt> a;
        private final alkj[] b;

        public c(WeakReference<acxt> weakReference, alkj[] alkjArr) {
            this.a = weakReference;
            this.b = alkjArr;
        }

        public final /* synthetic */ void a(Object obj, aczw aczw) {
            alil alil = (alil) obj;
            acxt acxt = (acxt) this.a.get();
            if (acxt != null) {
                synchronized (acxt.c) {
                    for (alkj adcp : this.b) {
                        acxt.b.remove(new adcp(adcp));
                    }
                }
                if (aczw == null && alil != null) {
                    acxt.a(alil.a, acxt);
                }
            }
        }
    }

    public acxt(adcl adcl, ajwy<aclo> ajwy, adce adce) {
        this.d = adcl;
        this.f = adce;
        this.h = ajwy;
    }

    public static alkj a(alkj alkj) {
        if (alkj.c <= 11) {
            return alkj;
        }
        alkj alkj2 = new alkj();
        int pow = (int) Math.pow(2.0d, (double) (alkj.c - 11));
        alkj2.a(alkj.a / pow);
        alkj2.b(alkj.b / pow);
        alkj2.c(11);
        return alkj2;
    }

    static /* synthetic */ void a(alkk[] alkkArr, acxt acxt) {
        if (alkkArr != null && acxt != null) {
            Object obj = null;
            for (alkk alkk : alkkArr) {
                adcp adcp = new adcp(alkk.b);
                synchronized (acxt.e) {
                    if (acxt.g != null && acxt.g.equals(adcp)) {
                        obj = 1;
                    }
                }
                a aVar = acxt.a;
                aVar.a.put(adcp, alkk);
                aVar.b.put(adcp, Long.valueOf(System.currentTimeMillis() + 3600000));
            }
            if (obj != null) {
                ((aclo) acxt.h.get()).d();
            }
        }
    }
}
