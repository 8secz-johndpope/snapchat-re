package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.ui.avatar.AvatarView;
import com.snapchat.android.R;
import defpackage.ipq.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: ipj */
public final class ipj implements ipt, ipu, ipw {
    SparseArray<zjm> a;
    final ipm b = new ipm();
    boolean c;
    final ipv d;
    private final a e = new a();
    private final c f = new c();
    private View g;
    private ViewGroup h;
    private final SparseArray<zoa> i = new SparseArray();
    private ipn j;
    private int k;
    private final achb<zjm, zjk> l;
    private final ipq m;
    private final ipi n;
    private final ipl o;
    private final zgb p;
    private final zgk<b> q;

    /* renamed from: ipj$c */
    final class c implements achk<zjm, zjk> {
        private boolean a = true;

        /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0155  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x018c  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0198  */
        /* JADX WARNING: Missing block: B:13:0x007b, code skipped:
            if (defpackage.akcr.a(r3, defpackage.qxo.a) != false) goto L_0x0046;
     */
        public final void a(defpackage.achi<defpackage.zjm, defpackage.zjk> r10) {
            /*
            r9 = this;
            r0 = "navigationEvent";
            defpackage.akcr.b(r10, r0);
            r0 = r10.l;
            if (r0 == 0) goto L_0x01b0;
        L_0x0009:
            r0 = r10.e;
            r0 = r0.e();
            r0 = (defpackage.zjm) r0;
            r10 = r10.f;
            r10 = r10.e();
            r10 = (defpackage.zjm) r10;
            r1 = defpackage.ipj.this;
            r1 = r1.b;
            r2 = "source";
            defpackage.akcr.a(r0, r2);
            r3 = r0;
            r3 = (defpackage.achg) r3;
            r4 = "destination";
            defpackage.akcr.a(r10, r4);
            r5 = r10;
            r5 = (defpackage.achg) r5;
            defpackage.akcr.b(r3, r2);
            defpackage.akcr.b(r5, r4);
            r2 = new ipm$a;
            r2.<init>(r3, r5);
            r4 = defpackage.hbn.a;
            r4 = defpackage.akcr.a(r5, r4);
            r6 = 8388613; // 0x800005 float:1.175495E-38 double:4.1445255E-317;
            r7 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
            if (r4 == 0) goto L_0x0051;
        L_0x0046:
            r3 = r1.a;
            r3.a(r7);
            r3 = r1.c;
            r3.a(r6);
            goto L_0x007e;
        L_0x0051:
            r4 = defpackage.qxo.a;
            r4 = defpackage.akcr.a(r5, r4);
            if (r4 == 0) goto L_0x0064;
        L_0x0059:
            r3 = r1.a;
            r3.a(r6);
            r3 = r1.c;
            r3.a(r7);
            goto L_0x007e;
        L_0x0064:
            r4 = defpackage.dnh.a;
            r4 = defpackage.akcr.a(r5, r4);
            if (r4 == 0) goto L_0x007e;
        L_0x006c:
            r4 = defpackage.hbn.a;
            r4 = defpackage.akcr.a(r3, r4);
            if (r4 == 0) goto L_0x0075;
        L_0x0074:
            goto L_0x0059;
        L_0x0075:
            r4 = defpackage.qxo.a;
            r3 = defpackage.akcr.a(r3, r4);
            if (r3 == 0) goto L_0x007e;
        L_0x007d:
            goto L_0x0046;
        L_0x007e:
            r3 = defpackage.dnh.a;
            r3 = defpackage.akcr.a(r5, r3);
            if (r3 == 0) goto L_0x008b;
        L_0x0086:
            r3 = r1.b;
            r4 = 48;
            goto L_0x008f;
        L_0x008b:
            r3 = r1.b;
            r4 = 80;
        L_0x008f:
            r3.a(r4);
            r3 = r1.a;
            r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
            r3.a(r4);
            r3 = defpackage.ojc.a;
            r3 = (defpackage.achg) r3;
            r3 = r2.a(r3);
            r4 = 0;
            if (r3 == 0) goto L_0x00aa;
        L_0x00a5:
            r3 = r1.a;
            r3.a(r4);
        L_0x00aa:
            r3 = r1.h;
            r3 = (defpackage.zob) r3;
            r1.b(r3);
            r3 = r1.f;
            r3 = (defpackage.zob) r3;
            r1.b(r3);
            r3 = defpackage.adcw.a;
            r3 = (defpackage.achg) r3;
            r3 = r2.a(r3);
            if (r3 == 0) goto L_0x00c5;
        L_0x00c2:
            r3 = r1.h;
            goto L_0x00c7;
        L_0x00c5:
            r3 = r1.f;
        L_0x00c7:
            r3 = (defpackage.zob) r3;
            r1.a(r3);
            r3 = r1.i;
            r3 = (defpackage.zob) r3;
            r1.b(r3);
            r3 = defpackage.upp.b;
            r3 = (defpackage.achg) r3;
            r3 = r2.a(r3);
            if (r3 == 0) goto L_0x00e4;
        L_0x00dd:
            r3 = r1.i;
            r3 = (defpackage.zob) r3;
            r1.a(r3);
        L_0x00e4:
            r3 = r1.g;
            r3 = (defpackage.zob) r3;
            r1.b(r3);
            r3 = r1.e;
            r5 = 2131429255; // 0x7f0b0787 float:1.8480178E38 double:1.0530659714E-314;
            r3.b(r5);
            r3 = r1.e;
            r6 = 2131429254; // 0x7f0b0786 float:1.8480176E38 double:1.053065971E-314;
            r3.b(r6);
            r3 = r1.d;
            r7 = 2131428648; // 0x7f0b0528 float:1.8478946E38 double:1.0530656715E-314;
            r3.b(r7);
            r3 = r1.d;
            r8 = 2131429261; // 0x7f0b078d float:1.848019E38 double:1.0530659744E-314;
            r3.b(r8);
            r3 = r1.j;
            r3 = (defpackage.zob) r3;
            r1.b(r3);
            r3 = defpackage.vxc.a;
            r3 = (defpackage.achg) r3;
            r3 = r2.a(r3);
            if (r3 == 0) goto L_0x0143;
        L_0x011c:
            r3 = r1.g;
            r3 = (defpackage.zob) r3;
            r1.a(r3);
            r3 = r1.a;
            r3.a(r4);
            r3 = r1.e;
            r3.a(r5);
            r3 = r1.e;
            r3.a(r6);
            r3 = r1.d;
            r3.a(r7);
            r3 = r1.d;
            r3.a(r8);
            r3 = r1.j;
            r3 = (defpackage.zob) r3;
            r1.a(r3);
        L_0x0143:
            r3 = r1.e;
            r4 = 2131430339; // 0x7f0b0bc3 float:1.8482376E38 double:1.053066507E-314;
            r3.b(r4);
            r3 = defpackage.ojc.a;
            r3 = (defpackage.achg) r3;
            r3 = r2.a(r3);
            if (r3 == 0) goto L_0x015a;
        L_0x0155:
            r3 = r1.e;
            r3.a(r4);
        L_0x015a:
            r3 = r1.f;
            r4 = 2131428417; // 0x7f0b0441 float:1.8478478E38 double:1.0530655574E-314;
            r3.b(r4);
            r3 = defpackage.qxo.a;
            r3 = (defpackage.achg) r3;
            r3 = r2.a(r3);
            if (r3 == 0) goto L_0x0171;
        L_0x016c:
            r3 = r1.f;
            r3.a(r4);
        L_0x0171:
            r3 = r1.d;
            r4 = 2131429250; // 0x7f0b0782 float:1.8480167E38 double:1.053065969E-314;
            r3.b(r4);
            r3 = defpackage.hbn.a;
            r3 = (defpackage.achg) r3;
            r2 = r2.a(r3);
            if (r2 == 0) goto L_0x0188;
        L_0x0183:
            r1 = r1.d;
            r1.a(r4);
        L_0x0188:
            r1 = r9.a;
            if (r1 == 0) goto L_0x0198;
        L_0x018c:
            r0 = 0;
            r9.a = r0;
        L_0x018f:
            r1 = defpackage.ipj.this;
            r10 = r1.a(r10, r0);
            r1.c = r10;
            return;
        L_0x0198:
            r1 = defpackage.ipj.this;
            r1 = r1.c;
            if (r1 == 0) goto L_0x01a7;
        L_0x019e:
            r1 = defpackage.ipj.this;
            r1 = defpackage.ipj.a(r1);
            defpackage.zod.a(r1);
        L_0x01a7:
            r1 = defpackage.irc.m;
            r0 = defpackage.akcr.a(r0, r1);
            r0 = r0 ^ 1;
            goto L_0x018f;
        L_0x01b0:
            r0 = defpackage.ipj.this;
            r0 = r0.c;
            if (r0 == 0) goto L_0x01bf;
        L_0x01b6:
            r0 = defpackage.ipj.this;
            r0 = r0.b;
            r10 = r10.i;
            r0.a(r10);
        L_0x01bf:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ipj$c.a(achi):void");
        }

        public final void b(achi<zjm, zjk> achi) {
            akcr.b(achi, "navigationEvent");
            zjm zjm = (zjm) achi.e.e();
            if (!zjm.f && achi.d == acgw.DISMISS) {
                ipj ipj = ipj.this;
                akcr.a((Object) zjm, "sourceType");
                ipj.a(ipj, zjm);
            }
            if (achi.j) {
                zod.a(ipj.a(ipj.this));
                ipj ipj2 = ipj.this;
                Object e = achi.f.e();
                akcr.a(e, "navigationEvent.destinationPage.pageType");
                ipj.b(ipj2, (zjm) e);
            }
        }

        public final void c(achi<zjm, zjk> achi) {
            akcr.b(achi, "navigationEvent");
            zjm zjm = (zjm) achi.f.e();
            if (!zjm.f && achi.d == acgw.PRESENT) {
                ipj ipj = ipj.this;
                akcr.a((Object) zjm, "pageFailedToGo");
                ipj.a(ipj, zjm);
            }
            zjm zjm2 = (zjm) achi.e.e();
            zod.a(ipj.a(ipj.this));
            ipj ipj2 = ipj.this;
            akcr.a((Object) zjm2, "currentPage");
            ipj2.a(zjm2, false);
            ipj.b(ipj.this, zjm2);
        }
    }

    /* renamed from: ipj$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: ipj$a */
    final class a implements OnClickListener {
        public final void onClick(View view) {
            akcr.b(view, "v");
            SparseArray sparseArray = ipj.this.a;
            if (sparseArray == null) {
                akcr.a("destinations");
            }
            Object obj = (zjm) sparseArray.get(view.getId());
            ipv ipv = ipj.this.d;
            akcr.a(obj, "pageType");
            ipv.d(obj);
        }
    }

    static {
        b bVar = new b();
    }

    public ipj(ipv ipv, achb<zjm, zjk> achb, ipq ipq, ipi ipi, ipl ipl, zgb zgb, zgk<b> zgk) {
        akcr.b(ipv, "hovaSpecs");
        akcr.b(achb, "navigationHost");
        akcr.b(ipq, "notificationBadgeViewManager");
        akcr.b(ipi, "avatarAndStoriesManager");
        akcr.b(ipl, "hovaIconLabelManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "scoper");
        this.d = ipv;
        this.l = achb;
        this.m = ipq;
        this.n = ipi;
        this.o = ipl;
        this.p = zgb;
        this.q = zgk;
    }

    public static final /* synthetic */ void b(ipj ipj, zjm zjm) {
        ipj.c = false;
        int b = ipj.d.b(zjm);
        if (b != -1) {
            if (b != 0) {
                SparseArray a = ipj.d.a(zjm);
                if (a != null) {
                    ipj.a = a;
                    Collection arrayList = new ArrayList();
                    for (Object next : akef.a(0, a.size())) {
                        if ((akcr.a((zjm) a.valueAt(((Number) next).intValue()), (Object) zjm) ^ 1) != 0) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<Number> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (Number intValue : iterable) {
                        int intValue2 = intValue.intValue();
                        View view = ipj.g;
                        if (view == null) {
                            akcr.a("hovaNavView");
                        }
                        arrayList2.add(view.findViewById(a.keyAt(intValue2)));
                    }
                    for (View view2 : (List) arrayList2) {
                        if (view2 != null) {
                            view2.setOnClickListener(ipj.e);
                        }
                    }
                }
                return;
            }
            ViewGroup viewGroup = ipj.h;
            if (viewGroup == null) {
                akcr.a("sceneHolder");
            }
            viewGroup.removeAllViews();
        }
    }

    public final View a(int i, zjm zjm) {
        akcr.b(zjm, "pageType");
        int b = this.d.b(zjm);
        ipn ipn = this.j;
        if (ipn == null) {
            akcr.a("hovaViewPrefetcher");
        }
        return ipn.a(b).findViewById(i);
    }

    public final void a() {
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            akcr.a("sceneHolder");
        }
        zod.a(viewGroup);
    }

    public final void a(View view) {
        akcr.b(view, "hovaNavView");
        this.g = view;
        Object findViewById = view.findViewById(R.id.scene_holder);
        akcr.a(findViewById, "hovaNavView.findViewById(R.id.scene_holder)");
        this.h = (ViewGroup) findViewById;
        this.l.a((achk) this.f);
        Object context = view.getContext();
        akcr.a(context, "hovaNavView.context");
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            akcr.a("sceneHolder");
        }
        this.j = new ipn(context, viewGroup, this.d, this.n, this.p, this.q);
    }

    public final void a(zjm zjm) {
        akcr.b(zjm, "pageType");
        int b = this.d.b(zjm);
        if (b != 0) {
            ipn ipn = this.j;
            if (ipn == null) {
                akcr.a("hovaViewPrefetcher");
            }
            ipn.a(b);
        }
    }

    public final void a(boolean z) {
        abmr.a();
        ipq ipq = this.m;
        if (z != ipq.f) {
            ipq.f = z;
            for (Entry value : ipq.a.entrySet()) {
                ((ipq.b) value.getValue()).a(z, true);
            }
        }
    }

    public final void a(boolean z, int i) {
        abmr.a();
        ipq ipq = this.m;
        for (Entry entry : ipq.d.entrySet()) {
            if (i < 0 && ipq.h != z) {
                ((a) entry.getValue()).a(z, false);
            } else if (i >= 0 && !(((a) entry.getValue()).a == i && ipq.h == z)) {
                ((a) entry.getValue()).a(z, i);
            }
        }
        ipq.h = z;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(zjm zjm, boolean z) {
        zjm zjm2 = zjm;
        String str = "pageType";
        String str2 = "view";
        int b = this.d.b(zjm2);
        int i = this.k;
        this.k = b;
        if (b <= 0) {
            return false;
        }
        Object obj;
        zoa zoa;
        zoa zoa2;
        String str3;
        View findViewById;
        ipn ipn = this.j;
        if (ipn == null) {
            akcr.a("hovaViewPrefetcher");
        }
        View a = ipn.a(b);
        String str4 = "sceneHolder";
        if (this.i.get(b) != null) {
            obj = this.i.get(b);
            akcr.a(obj, "scenes[sceneId]");
            zoa = (zoa) obj;
        } else {
            ViewGroup viewGroup = this.h;
            if (viewGroup == null) {
                akcr.a(str4);
            }
            zoa zoa3 = new zoa(viewGroup, a);
            this.i.put(b, zoa3);
            zoa = zoa3;
        }
        ipq ipq = this.m;
        akcr.b(a, str2);
        akcr.b(zjm2, str);
        View findViewById2 = a.findViewById(R.id.feed_icon_container);
        View findViewById3 = a.findViewById(R.id.discoverfeed_icon_container);
        View findViewById4 = a.findViewById(R.id.memories_icon_container);
        View findViewById5 = a.findViewById(R.id.neon_add_friend_button_container);
        View findViewById6 = a.findViewById(R.id.neon_header_avatar_container);
        if (findViewById2 == null || ipq.a.containsKey(zjm2)) {
            zoa2 = zoa;
            str3 = str4;
        } else {
            Object values = ipq.a.values();
            akcr.a(values, "feedBadgeControllers.values");
            zoa2 = zoa;
            str3 = str4;
            ipq.a.put(zjm2, new ipq.b((ipp) findViewById2, ipq.f, (ipq.b) ajyu.c((Iterable) values)));
        }
        if (!(findViewById3 == null || ipq.b.containsKey(zjm2))) {
            obj = ipq.b.values();
            akcr.a(obj, "storiesBadgeControllers.values");
            ipq.b.put(zjm2, new ipq.b((ipp) findViewById3, ipq.g, (ipq.b) ajyu.c((Iterable) obj)));
        }
        if (!(findViewById4 == null || ipq.c.containsKey(zjm2))) {
            obj = ipq.c.values();
            akcr.a(obj, "memoriesBadgeControllers.values");
            ipq.c.put(zjm2, new ipq.b((ipp) findViewById4, false, (ipq.b) ajyu.c((Iterable) obj)));
        }
        if (!(findViewById5 == null && findViewById6 == null)) {
            if (!(findViewById5 == null || ipq.d.containsKey(zjm2))) {
                findViewById5.setVisibility(0);
                obj = ipq.d.values();
                akcr.a(obj, "addFriendButtonBadgeControllers.values");
                ipq.d.put(zjm2, new a((ipp) findViewById5, ipq.h, (a) ajyu.c((Iterable) obj)));
            }
            if (!(findViewById6 == null || ipq.e.containsKey(zjm2))) {
                obj = ipq.e.values();
                akcr.a(obj, "avatarBadgeControllers.values");
                ipq.e.put(zjm2, new a((ipp) findViewById6, ipq.i, (a) ajyu.c((Iterable) obj)));
            }
        }
        ipi ipi = this.n;
        akcr.b(a, str2);
        akcr.b(zjm2, str);
        AvatarView avatarView = (AvatarView) a.findViewById(R.id.neon_header_avatar);
        if (avatarView != null) {
            ipi.a(avatarView, zjm2);
        }
        ipl ipl = this.o;
        akcr.b(a, str2);
        akcr.b(zjm2, str);
        if (!ipl.a.containsKey(zjm2)) {
            findViewById = a.findViewById(R.id.feed_icon_container);
            ipl.a.put(zjm2, new WeakReference(findViewById));
            ipl.a(findViewById, ipl.c);
        }
        if (!ipl.b.containsKey(zjm2)) {
            findViewById = a.findViewById(R.id.discoverfeed_icon_container);
            ipl.b.put(zjm2, new WeakReference(findViewById));
            ipl.a(findViewById, ipl.d);
        }
        ipm ipm = z ? this.b : null;
        String str5 = "sceneToGo.sceneRoot";
        if (i == this.k) {
            if (ipm != null) {
                ViewGroup viewGroup2 = this.h;
                if (viewGroup2 == null) {
                    akcr.a(str3);
                }
                zod.a(viewGroup2, (zob) ipm);
            }
            ipv ipv = this.d;
            Object a2 = zoa2.a();
            akcr.a(a2, str5);
            ipv.a(a2, zjm2);
        } else {
            ipv ipv2 = this.d;
            Object a3 = zoa2.a();
            akcr.a(a3, str5);
            ipv2.a(a3, zjm2);
            zod.a(zoa2, (zob) ipm);
        }
        return true;
    }

    public final void b(zjm zjm) {
        String str = "destination";
        akcr.b(zjm, str);
        ipn ipn = this.j;
        if (ipn == null) {
            akcr.a("hovaViewPrefetcher");
        }
        akcr.b(zjm, str);
        if (akcr.a((Object) zjm, dnh.a)) {
            ipn.a(qxo.a);
            ipn.a(hbn.a);
        }
    }

    public final void b(boolean z) {
        abmr.a();
        ipq ipq = this.m;
        if (z != ipq.g) {
            ipq.g = z;
            for (Entry value : ipq.b.entrySet()) {
                ((ipq.b) value.getValue()).a(z, true);
            }
        }
    }

    public final void c(boolean z) {
        abmr.a();
        ipq ipq = this.m;
        for (Entry entry : ipq.e.entrySet()) {
            if (((a) entry.getValue()).a != 0 || ipq.i != z) {
                ((a) entry.getValue()).a(z, 0);
            }
        }
        ipq.i = z;
    }

    public final void d(boolean z) {
        abmr.a();
        ipl ipl = this.o;
        ipl.c = z;
        for (Entry value : ipl.a.entrySet()) {
            ipl.a((View) ((WeakReference) value.getValue()).get(), z);
        }
    }

    public final void e(boolean z) {
        abmr.a();
        ipl ipl = this.o;
        ipl.d = z;
        for (Entry value : ipl.b.entrySet()) {
            ipl.a((View) ((WeakReference) value.getValue()).get(), z);
        }
    }
}
