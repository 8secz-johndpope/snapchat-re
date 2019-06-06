package defpackage;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: rcn */
public final class rcn implements OnClickListener {
    final long a = TimeUnit.MINUTES.toMillis(1);
    final long b = TimeUnit.MINUTES.toMillis(2);
    public rcm c;
    long d;
    String e;
    public ajej f;
    ihh g;
    ViewGroup h;
    FragmentActivity i;
    hgi j;
    public rcp k;
    ftl l;
    public zfw m;
    public qxq n;
    qxl o;
    public boolean p;
    long q = TimeUnit.HOURS.toMillis(2);
    long r = TimeUnit.HOURS.toMillis(12);
    int s = 2;
    private final long t = TimeUnit.SECONDS.toMillis(3);
    private tnj u;
    private dib v;
    private achb<zjm, zjk> w;
    private rco x;

    /* renamed from: rcn$a */
    public static final class a<T> implements ajfl<Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return !bool.booleanValue();
        }
    }

    /* renamed from: rcn$b */
    public static final class b<T> implements ajfb<List<? extends hjh>> {
        private /* synthetic */ rcn a;

        public b(rcn rcn) {
            this.a = rcn;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0133  */
        public final /* synthetic */ void accept(java.lang.Object r13) {
            /*
            r12 = this;
            r13 = (java.util.List) r13;
            r0 = r12.a;
            r0 = r0.c;
            r1 = 0;
            if (r0 == 0) goto L_0x000e;
        L_0x0009:
            r0 = r0.getParent();
            goto L_0x000f;
        L_0x000e:
            r0 = r1;
        L_0x000f:
            if (r0 != 0) goto L_0x001e;
        L_0x0011:
            r0 = r12.a;
            r0 = r0.h;
            r2 = r12.a;
            r2 = r2.c;
            r2 = (android.view.View) r2;
            r0.addView(r2);
        L_0x001e:
            r0 = r12.a;
            r0 = r0.c;
            if (r0 == 0) goto L_0x0152;
        L_0x0024:
            r2 = "it";
            defpackage.akcr.a(r13, r2);
            r2 = "unviewedStories";
            defpackage.akcr.b(r13, r2);
            r2 = r13.size();
            r3 = 2;
            if (r2 >= r3) goto L_0x003c;
        L_0x0035:
            r13 = 8;
            r0.setVisibility(r13);
            goto L_0x0152;
        L_0x003c:
            r2 = new java.util.ArrayList;
            r4 = r13.size();
            r2.<init>(r4);
            r4 = r13.iterator();
        L_0x0049:
            r5 = r4.hasNext();
            if (r5 == 0) goto L_0x006b;
        L_0x004f:
            r5 = r4.next();
            r5 = (defpackage.hjh) r5;
            r6 = r5.f();
            r6 = r6.a();
            r6 = (int) r6;
            r7 = new ajxm;
            r6 = java.lang.Integer.valueOf(r6);
            r7.<init>(r6, r5);
            r2.add(r7);
            goto L_0x0049;
        L_0x006b:
            r4 = r2;
            r4 = (java.util.List) r4;
            r5 = defpackage.rcm.a.a;
            r5 = (java.util.Comparator) r5;
            java.util.Collections.sort(r4, r5);
            r4 = 0;
            r5 = r2.get(r4);
            r5 = (defpackage.ajxm) r5;
            r5 = r5.b;
            r5 = (defpackage.hjh) r5;
            r6 = 1;
            r2 = r2.get(r6);
            r2 = (defpackage.ajxm) r2;
            r2 = r2.b;
            r2 = (defpackage.hjh) r2;
            r7 = r5.E();
            r8 = 6;
            r9 = " ";
            if (r7 == 0) goto L_0x00a7;
        L_0x0094:
            r7 = (java.lang.CharSequence) r7;
            r10 = new java.lang.String[]{r9};
            r7 = defpackage.akgc.a(r7, r10, r4, r8);
            if (r7 == 0) goto L_0x00a7;
        L_0x00a0:
            r7 = r7.get(r4);
            r7 = (java.lang.String) r7;
            goto L_0x00a8;
        L_0x00a7:
            r7 = r1;
        L_0x00a8:
            r10 = r2.E();
            if (r10 == 0) goto L_0x00c0;
        L_0x00ae:
            r10 = (java.lang.CharSequence) r10;
            r9 = new java.lang.String[]{r9};
            r8 = defpackage.akgc.a(r10, r9, r4, r8);
            if (r8 == 0) goto L_0x00c0;
        L_0x00ba:
            r1 = r8.get(r4);
            r1 = (java.lang.String) r1;
        L_0x00c0:
            r8 = r13.size();
            r9 = "friendText";
            if (r8 != r3) goto L_0x00e6;
        L_0x00c8:
            r13 = r0.a;
            if (r13 != 0) goto L_0x00cf;
        L_0x00cc:
            defpackage.akcr.a(r9);
        L_0x00cf:
            r8 = r0.getResources();
            r9 = 2131887251; // 0x7f120493 float:1.9409104E38 double:1.0532922515E-314;
            r3 = new java.lang.Object[r3];
            r3[r4] = r7;
            r3[r6] = r1;
            r1 = r8.getString(r9, r3);
            r1 = (java.lang.CharSequence) r1;
            r13.setText(r1);
            goto L_0x010f;
        L_0x00e6:
            r8 = r0.a;
            if (r8 != 0) goto L_0x00ed;
        L_0x00ea:
            defpackage.akcr.a(r9);
        L_0x00ed:
            r9 = r0.getResources();
            r10 = 2131887250; // 0x7f120492 float:1.9409102E38 double:1.053292251E-314;
            r11 = 3;
            r11 = new java.lang.Object[r11];
            r11[r4] = r7;
            r11[r6] = r1;
            r13 = r13.size();
            r13 = r13 - r3;
            r13 = java.lang.Integer.valueOf(r13);
            r11[r3] = r13;
            r13 = r9.getString(r10, r11);
            r13 = (java.lang.CharSequence) r13;
            r8.setText(r13);
        L_0x010f:
            r13 = r0.b;
            if (r13 != 0) goto L_0x0118;
        L_0x0113:
            r1 = "firstThumbnail";
            defpackage.akcr.a(r1);
        L_0x0118:
            r6 = r5.C();
            r8 = r5.D();
            r1 = defpackage.yjl.a(r6, r8, r4);
            r3 = defpackage.hbn.f;
            r3 = r3.getPage();
            r3 = (defpackage.idl) r3;
            r13.setImageUri(r1, r3);
            r13 = r0.c;
            if (r13 != 0) goto L_0x0138;
        L_0x0133:
            r1 = "secondThumbnail";
            defpackage.akcr.a(r1);
        L_0x0138:
            r5 = r2.C();
            r1 = r2.D();
            r1 = defpackage.yjl.a(r5, r1, r4);
            r2 = defpackage.hbn.f;
            r2 = r2.getPage();
            r2 = (defpackage.idl) r2;
            r13.setImageUri(r1, r2);
            r0.setVisibility(r4);
        L_0x0152:
            r13 = r12.a;
            r0 = r13.f;
            if (r0 == 0) goto L_0x015b;
        L_0x0158:
            r0.dispose();
        L_0x015b:
            r0 = r13.g;
            r0 = r0.a();
            r13.d = r0;
            r0 = r13.n;
            r0 = r0.a();
            r13.e = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rcn$b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: rcn$c */
    public static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ rcn a;

        public c(rcn rcn) {
            this.a = rcn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            return this.a.o.a();
        }
    }

    /* renamed from: rcn$d */
    public static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ rcn a;

        public d(rcn rcn) {
            this.a = rcn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? ajvo.a(ajpu.a) : this.a.l.t(qyi.LAST_FRIEND_STORY_BUTTON_IMPRESSION_MS);
        }
    }

    /* renamed from: rcn$e */
    public static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ rcn a;

        public e(rcn rcn) {
            this.a = rcn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Long l = (Long) obj;
            akcr.b(l, "it");
            rcn rcn = this.a;
            if (rcn.g.a() - l.longValue() > rcn.q || rcn.a(rcn.n.a())) {
                obj = rcn.l.t(gvt.LAST_WATCHED_FRIEND_STORY_DF_MS);
                str = "configurationProvider.ob…TCHED_FRIEND_STORY_DF_MS)";
            } else {
                obj = ajvo.a(ajpu.a);
                str = "Observable.never()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: rcn$f */
    public static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ rcn a;

        public f(rcn rcn) {
            this.a = rcn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            rcn rcn = this.a;
            if (rcn.g.a() - l.longValue() > rcn.r) {
                return rcn.j.d();
            }
            obj = ajdp.b((Object) ajyw.a);
            akcr.a(obj, "Observable.just(emptyList())");
            return obj;
        }
    }

    /* renamed from: rcn$g */
    public static final class g<T> implements ajfl<List<? extends hjx>> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: rcn$h */
    public static final class h<T, R> implements ajfc<T, R> {
        private /* synthetic */ rcn a;

        public h(rcn rcn) {
            this.a = rcn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<hjx> list = (List) obj;
            akcr.b(list, "it");
            ArrayList arrayList = new ArrayList();
            for (hjx hjx : list) {
                if ((hjx.a() instanceof hjh) && !hjx.a().r()) {
                    hio a = hjx.a();
                    String str = "null cannot be cast to non-null type com.snap.discoverfeed.model.FriendStoryData";
                    if (a == null) {
                        throw new ajxt(str);
                    } else if (((hjh) a).H()) {
                        continue;
                    } else {
                        a = hjx.a();
                        if (a == null) {
                            throw new ajxt(str);
                        } else if (((hjh) a).F() == hji.FRIEND) {
                            hio a2 = hjx.a();
                            if (a2 != null) {
                                arrayList.add((hjh) a2);
                            } else {
                                throw new ajxt(str);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: rcn$i */
    public static final class i<T> implements ajfl<ArrayList<hjh>> {
        private /* synthetic */ rcn a;

        public i(rcn rcn) {
            this.a = rcn;
        }

        public final /* synthetic */ boolean test(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            akcr.b(arrayList, "it");
            return arrayList.size() >= this.a.s;
        }
    }

    /* renamed from: rcn$j */
    public static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ rcn a;

        public j(rcn rcn) {
            this.a = rcn;
        }

        /* JADX WARNING: Missing block: B:14:0x004f, code skipped:
            return r7;
     */
        private java.util.List<defpackage.hjh> a(java.util.ArrayList<defpackage.hjh> r7) {
            /*
            r6 = this;
            r0 = "it";
            defpackage.akcr.b(r7, r0);
            r0 = r6.a;
            monitor-enter(r0);
            r1 = r6.a;	 Catch:{ all -> 0x0050 }
            r1 = r1.c;	 Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004c;
        L_0x000e:
            r1 = r6.a;	 Catch:{ all -> 0x0050 }
            r1 = r1.i;	 Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x001a;
        L_0x0014:
            r7 = defpackage.ajyw.a;	 Catch:{ all -> 0x0050 }
            r7 = (java.util.List) r7;	 Catch:{ all -> 0x0050 }
            monitor-exit(r0);
            return r7;
        L_0x001a:
            r2 = r6.a;	 Catch:{ all -> 0x0050 }
            r3 = new rcm;	 Catch:{ all -> 0x0050 }
            r1 = (android.content.Context) r1;	 Catch:{ all -> 0x0050 }
            r3.<init>(r1);	 Catch:{ all -> 0x0050 }
            r1 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x0050 }
            r4 = -2;
            r1.<init>(r4, r4);	 Catch:{ all -> 0x0050 }
            r4 = r3.getResources();	 Catch:{ all -> 0x0050 }
            r5 = 2131166399; // 0x7f0704bf float:1.7947042E38 double:1.0529361033E-314;
            r4 = r4.getDimensionPixelOffset(r5);	 Catch:{ all -> 0x0050 }
            r1.bottomMargin = r4;	 Catch:{ all -> 0x0050 }
            r4 = 81;
            r1.gravity = r4;	 Catch:{ all -> 0x0050 }
            r1 = (android.view.ViewGroup.LayoutParams) r1;	 Catch:{ all -> 0x0050 }
            r3.setLayoutParams(r1);	 Catch:{ all -> 0x0050 }
            r1 = r6.a;	 Catch:{ all -> 0x0050 }
            r1 = (android.view.View.OnClickListener) r1;	 Catch:{ all -> 0x0050 }
            r3.setOnClickListener(r1);	 Catch:{ all -> 0x0050 }
            r1 = 1;
            r3.setEnabled(r1);	 Catch:{ all -> 0x0050 }
            r2.c = r3;	 Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r0);
            r7 = (java.util.List) r7;
            return r7;
        L_0x0050:
            r7 = move-exception;
            monitor-exit(r0);
            throw r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rcn$j.a(java.util.ArrayList):java.util.List");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((ArrayList) obj);
        }
    }

    public rcn(ihh ihh, ViewGroup viewGroup, FragmentActivity fragmentActivity, hgi hgi, tnj tnj, dib dib, rcp rcp, ftl ftl, zfw zfw, achb<zjm, zjk> achb, hoy hoy, qxq qxq, qxl qxl, rco rco) {
        ihh ihh2 = ihh;
        ViewGroup viewGroup2 = viewGroup;
        hgi hgi2 = hgi;
        tnj tnj2 = tnj;
        dib dib2 = dib;
        rcp rcp2 = rcp;
        ftl ftl2 = ftl;
        zfw zfw2 = zfw;
        achb<zjm, zjk> achb2 = achb;
        hoy hoy2 = hoy;
        qxq qxq2 = qxq;
        qxl qxl2 = qxl;
        rco rco2 = rco;
        akcr.b(ihh2, "clock");
        akcr.b(viewGroup2, "viewGroup");
        akcr.b(hgi2, "discoverFeedFriendsStoriesDataProvider");
        akcr.b(tnj2, "preferences");
        akcr.b(dib2, "blizzardEventLogger");
        akcr.b(rcp2, "sessionManager");
        akcr.b(ftl2, "configurationProvider");
        akcr.b(zfw2, "schedulers");
        akcr.b(achb2, "navigationHost");
        akcr.b(hoy2, "featureFlagManager");
        akcr.b(qxq2, "friendsFeedSessionManager");
        akcr.b(qxl2, "friendsFeedApi");
        akcr.b(rco2, "friendStoryTeachingClickListener");
        this.g = ihh2;
        this.h = viewGroup2;
        this.i = fragmentActivity;
        this.j = hgi2;
        this.u = tnj2;
        this.v = dib2;
        this.k = rcp2;
        this.l = ftl2;
        this.m = zfw2;
        this.w = achb2;
        this.n = qxq;
        this.o = qxl;
        this.x = rco;
        this.e = null;
        final hoy hoy3 = hoy;
        zfw.h().a((Runnable) new Runnable(this) {
            private /* synthetic */ rcn a;

            public final void run() {
                this.a.p = hoy3.m();
                this.a.q = hoy3.n() ? this.a.a : TimeUnit.HOURS.toMillis((long) hoy3.p());
                this.a.r = hoy3.o() ? this.a.b : TimeUnit.HOURS.toMillis((long) hoy3.q());
                this.a.s = hoy3.r();
            }
        });
    }

    private final void b() {
        this.u.b().a((fth) qyi.LAST_FRIEND_STORY_BUTTON_IMPRESSION_MS, Long.valueOf(this.g.a())).b();
        this.k.a(true);
    }

    private final void c() {
        aatt aatt = new aatt();
        aatt.a(this.n.a());
        aatu aatu = new aatu();
        aatu.a("story_reminder");
        aamj aamj = new aamj();
        aamj.a(aatu);
        aamj.a(aatt);
        this.v.a((aajt) aamj);
    }

    public final void a() {
        ajej ajej = this.f;
        if (ajej != null) {
            ajej.dispose();
        }
        rcm rcm = this.c;
        if (rcm != null && rcm.getVisibility() == 0) {
            rcm = this.c;
            if (rcm != null) {
                rcm.setVisibility(8);
            }
            if (this.g.a() - this.d > this.t) {
                b();
                c();
            }
        }
    }

    public final boolean a(String str) {
        return akgb.a(this.e, str, false);
    }

    public final void onClick(View view) {
        if (this.g.a() - this.d > this.t) {
            c();
        }
        b();
        if (view != null) {
            view.setVisibility(8);
        }
        this.x.a = true;
        achb.a(this.w, hbn.a, true, null, 4);
    }
}
