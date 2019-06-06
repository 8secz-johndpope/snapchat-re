package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import defpackage.abzt.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: zvj */
public final class zvj extends tqi {
    tqm a;
    ajcx b;
    acab c;
    acab d;
    alia e;
    final ftl f;
    final zvr g;
    final tvd h;
    final zve i;
    private final ajxe j = ajxh.a(new h(this));
    private final ajxe k = ajxh.a(new e(this));
    private final zgb l;

    /* renamed from: zvj$h */
    static final class h extends akcs implements akbk<ajwl<ajdp<znh<zmy>>>> {
        final /* synthetic */ zvj a;

        /* renamed from: zvj$h$1 */
        static final class 1<V> implements Callable<ajdt<? extends T>> {
            private /* synthetic */ h a;

            1(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object call() {
                return this.a.a.f.p(tum.VENUE_FILTERS_ENABLED).h(Boolean.valueOf(this.a.a.f.a((fth) tum.VENUE_FILTERS_ENABLED)));
            }
        }

        /* renamed from: zvj$h$2 */
        static final class 2<T1, T2, R> implements ajex<Boolean, abbd, Boolean> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                abbd abbd = (abbd) obj2;
                akcr.b(bool, "enabled");
                akcr.b(abbd, "sourceType");
                boolean z = (!bool.booleanValue() || abbd == abbd.CAMERA_ROLL || abbd == abbd.MAP) ? false : true;
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: zvj$h$3 */
        static final class 3<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ h a;

            3(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "enabled");
                return bool.booleanValue() ? this.a.a.g.a().d(new zvq(new alib(), new alia())) : ajdx.b(new zvq(new alib(), new alia()));
            }
        }

        /* renamed from: zvj$h$4 */
        static final class 4<T, R> implements ajfc<T, R> {
            private /* synthetic */ h a;

            4(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                zvq zvq = (zvq) obj;
                akcr.b(zvq, "wrapper");
                if (zvq.a.a == null || zvq.a.a.length == 0) {
                    return znk.a;
                }
                String str;
                Object obj2 = zvq.a.a;
                akcr.a(obj2, "wrapper.response.checkinLocations");
                Collection arrayList = new ArrayList(obj2.length);
                int length = obj2.length;
                int i = 0;
                while (true) {
                    str = "it";
                    if (i >= length) {
                        break;
                    }
                    Object obj3 = obj2[i];
                    affu affu = new affu();
                    akcr.a(obj3, str);
                    affu.i = obj3.c();
                    affu.b = obj3.c();
                    affu.a = obj3.b();
                    affu.c = obj3.e();
                    arrayList.add(affu);
                    i++;
                }
                Collection arrayList2 = new ArrayList();
                for (Object next : (List) arrayList) {
                    CharSequence charSequence = ((affu) next).b;
                    int i2 = (charSequence == null || akgb.a(charSequence)) ? 1 : 0;
                    if ((1 ^ i2) != 0) {
                        arrayList2.add(next);
                    }
                }
                acab acab = new acab((List) arrayList2);
                this.a.a.d = acab;
                zvj zvj = this.a.a;
                Object next2 = zvq.a.b;
                akcr.a(next2, "wrapper.response.extraCheckinLocations");
                Collection arrayList3 = new ArrayList(next2.length);
                for (Object obj4 : next2) {
                    affu affu2 = new affu();
                    akcr.a(obj4, str);
                    affu2.i = obj4.c();
                    affu2.b = obj4.c();
                    affu2.a = obj4.b();
                    affu2.c = obj4.e();
                    arrayList3.add(affu2);
                }
                zvj.c = new acab((List) arrayList3);
                this.a.a.e = zvq.b;
                return acab.a().isEmpty() ? znk.a : znk.a((Object) new zvp(acab, 0, true));
            }
        }

        /* renamed from: zvj$h$5 */
        static final class 5<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ h a;

            5(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                obj = (znh) obj;
                akcr.b(obj, "it");
                ajcx ajcx = this.a.a.b;
                if (ajcx == null) {
                    akcr.a("delayedBind");
                }
                return ajcx.a((ajdt) ajdp.b(obj));
            }
        }

        /* renamed from: zvj$h$6 */
        static final class 6<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ h a;

            /* renamed from: zvj$h$6$2 */
            static final class 2<T> implements ajfb<znh<zmy>> {
                public static final 2 a = new 2();

                2() {
                }

                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }

            6(h hVar) {
                this.a = hVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final znh znh = (znh) obj;
                akcr.b(znh, "seekable");
                if (this.a.a.a == null) {
                    ajdp.b((Object) znk.a);
                }
                return zvj.a(this.a.a).b().u(new ajfc<T, ajdt<? extends R>>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        tqn tqn = (tqn) obj;
                        akcr.b(tqn, "filterInfo");
                        Object obj2 = (tqn.a || tqn.b) ? 1 : null;
                        obj = (obj2 == null || (tqn.c.d.isEmpty() ^ 1) == 0) ? znh : znk.a;
                        return ajdp.b(obj);
                    }
                }).h((ajdt) ajdp.b((Object) znk.a)).j(ajfu.a).d((ajfb) 2.a);
            }
        }

        /* renamed from: zvj$h$7 */
        static final class 7<T> implements ajfb<znh<zmy>> {
            public static final 7 a = new 7();

            7() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        h(zvj zvj) {
            this.a = zvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object u = ajdx.a(ajdp.a((Callable) new 1(this)).b((ajdw) this.a.a().i()).j(ajfu.a).e(), (ajeb) this.a.h.f.e(), (ajex) 2.a).a((ajfc) new 3(this)).f(new 4(this)).d((ajfc) new 5(this)).u(new 6(this));
            akcr.a(u, "Observable.defer {\n     …                        }");
            return ajwl.i(igs.a(u).d((ajfb) 7.a).a((ajdw) this.a.a().l()));
        }
    }

    /* renamed from: zvj$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zvj a;

        e(zvj zvj) {
            this.a = zvj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(zvi.a.callsite("VenueFilterPageSection"));
        }
    }

    /* renamed from: zvj$a */
    static final class a<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ zvj a;

        a(zvj zvj) {
            this.a = zvj;
        }

        public final /* synthetic */ Object call() {
            return this.a.f.p(tum.VENUE_FILTERS_ENABLED).h(Boolean.valueOf(this.a.f.a((fth) tum.VENUE_FILTERS_ENABLED)));
        }
    }

    /* renamed from: zvj$d */
    static final class d implements OnClickListener {
        private /* synthetic */ zvj a;
        private /* synthetic */ zmy b;

        d(zvj zvj, zmy zmy) {
            this.a = zvj;
            this.b = zmy;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00d8 in {9, 10, 11, 13, 19, 20, 22, 26, 27, 29} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void onClick(android.view.View r13) {
            /*
            r12 = this;
            r13 = r12.b;
            if (r13 == 0) goto L_0x00d0;
            r13 = (defpackage.zvp) r13;
            r0 = r13.a;
            r0 = r0.a();
            r1 = r13.a;
            r13 = r13.a;
            r13 = r13.b();
            r13 = r1.b(r13);
            r1 = r13.longValue();
            r13 = (int) r1;
            r13 = r0.get(r13);
            r13 = (defpackage.acac) r13;
            r0 = r12.a;
            r0 = r0.c;
            r1 = 0;
            if (r0 == 0) goto L_0x0069;
            r0 = r0.a();
            if (r0 == 0) goto L_0x0069;
            r0 = (java.lang.Iterable) r0;
            r2 = new java.util.ArrayList;
            r3 = 10;
            r3 = defpackage.ajyn.a(r0, r3);
            r2.<init>(r3);
            r2 = (java.util.Collection) r2;
            r0 = r0.iterator();
            r3 = r0.hasNext();
            if (r3 == 0) goto L_0x0065;
            r3 = r0.next();
            r3 = (defpackage.acac) r3;
            r4 = new zvc;
            r5 = "it";
            defpackage.akcr.a(r3, r5);
            r5 = r3.c();
            r3 = r3.d();
            r4.<init>(r5, r3);
            r2.add(r4);
            goto L_0x0043;
            r0 = r2;
            r0 = (java.util.List) r0;
            goto L_0x006a;
            r0 = r1;
            if (r0 != 0) goto L_0x0070;
            r0 = defpackage.ajyw.a;
            r0 = (java.util.List) r0;
            r0 = (java.lang.Iterable) r0;
            r2 = new java.util.ArrayList;
            r2.<init>();
            r2 = (java.util.Collection) r2;
            r0 = r0.iterator();
            r3 = r0.hasNext();
            if (r3 == 0) goto L_0x009c;
            r3 = r0.next();
            r3 = (defpackage.zvc) r3;
            r4 = r3.a;
            if (r4 != 0) goto L_0x008f;
            r5 = r1;
            goto L_0x0096;
            r5 = new zvd;
            r3 = r3.b;
            r5.<init>(r4, r3);
            if (r5 == 0) goto L_0x007d;
            r2.add(r5);
            goto L_0x007d;
            r8 = r2;
            r8 = (java.util.List) r8;
            r0 = r12.a;
            r0 = r0.e;
            r1 = "selectedVenueItem";
            defpackage.akcr.a(r13, r1);
            r1 = r13.c();
            if (r0 == 0) goto L_0x00cf;
            if (r1 == 0) goto L_0x00cf;
            r2 = r12.a;
            r6 = r2.i;
            r7 = new zvd;
            r13 = r13.d();
            r7.<init>(r1, r13);
            r1 = r0.a();
            r9 = (float) r1;
            r1 = r0.b();
            r10 = (float) r1;
            r0 = r0.c();
            r11 = (float) r0;
            r6.a(r7, r8, r9, r10, r11);
            return;
            r13 = new ajxt;
            r0 = "null cannot be cast to non-null type com.snap.venuefilters.ui.viewmodel.VenueFilterPageViewModel";
            r13.<init>(r0);
            throw r13;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zvj$d.onClick(android.view.View):void");
        }
    }

    /* renamed from: zvj$f */
    static final class f<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ zvj a;

        f(zvj zvj) {
            this.a = zvj;
        }

        public final /* synthetic */ Object call() {
            return this.a.f.p(tum.VENUE_FILTERS_ENABLED).h(Boolean.valueOf(this.a.f.a((fth) tum.VENUE_FILTERS_ENABLED)));
        }
    }

    /* renamed from: zvj$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ abzt a;

        b(abzt abzt) {
            this.a = abzt;
        }

        /* JADX WARNING: Missing block: B:22:0x0094, code skipped:
            if (r7 == null) goto L_0x0096;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (java.lang.Boolean) r7;
            r0 = "enabled";
            defpackage.akcr.b(r7, r0);
            r7 = r7.booleanValue();
            if (r7 == 0) goto L_0x009f;
        L_0x000d:
            r7 = r6.a;
            r7 = r7.n();
            if (r7 != 0) goto L_0x0017;
        L_0x0015:
            goto L_0x009f;
        L_0x0017:
            r7 = r6.a;
            r7 = r7.m();
            if (r7 == 0) goto L_0x0096;
        L_0x001f:
            r0 = "it";
            defpackage.akcr.a(r7, r0);
            r0 = r7.a();
            r1 = "it.venueItems";
            defpackage.akcr.a(r0, r1);
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
        L_0x003a:
            r2 = r0.hasNext();
            r3 = 0;
            if (r2 == 0) goto L_0x0064;
        L_0x0041:
            r2 = r0.next();
            r4 = r2;
            r4 = (defpackage.acac) r4;
            r5 = "venueItem";
            defpackage.akcr.a(r4, r5);
            r4 = r4.a();
            r4 = (java.lang.CharSequence) r4;
            r5 = 1;
            if (r4 == 0) goto L_0x005c;
        L_0x0056:
            r4 = defpackage.akgb.a(r4);
            if (r4 == 0) goto L_0x005d;
        L_0x005c:
            r3 = 1;
        L_0x005d:
            r3 = r3 ^ r5;
            if (r3 == 0) goto L_0x003a;
        L_0x0060:
            r1.add(r2);
            goto L_0x003a;
        L_0x0064:
            r1 = (java.util.List) r1;
            r7.a(r1);
            r0 = r7.a();
            r0 = r0.isEmpty();
            if (r0 == 0) goto L_0x0078;
        L_0x0073:
            r7 = com.google.common.base.Optional.absent();
            goto L_0x0090;
        L_0x0078:
            r0 = new zvp;
            r1 = r7.b();
            r1 = r7.b(r1);
            r1 = r1.longValue();
            r2 = (int) r1;
            r0.<init>(r7, r2, r3);
            r0 = (defpackage.zmy) r0;
            r7 = com.google.common.base.Optional.of(r0);
        L_0x0090:
            r7 = defpackage.ajdp.b(r7);
            if (r7 != 0) goto L_0x009e;
        L_0x0096:
            r7 = com.google.common.base.Optional.absent();
            r7 = defpackage.ajdp.b(r7);
        L_0x009e:
            return r7;
        L_0x009f:
            r7 = com.google.common.base.Optional.absent();
            r7 = defpackage.ajdp.b(r7);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zvj$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: zvj$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (defpackage.acab) r9;
            r0 = "it";
            defpackage.akcr.b(r9, r0);
            r0 = r9.b();
            r0 = (java.lang.CharSequence) r0;
            r1 = 1;
            r2 = 0;
            if (r0 == 0) goto L_0x001a;
        L_0x0011:
            r0 = defpackage.akgb.a(r0);
            if (r0 == 0) goto L_0x0018;
        L_0x0017:
            goto L_0x001a;
        L_0x0018:
            r0 = 0;
            goto L_0x001b;
        L_0x001a:
            r0 = 1;
        L_0x001b:
            if (r0 != 0) goto L_0x002f;
        L_0x001d:
            r0 = r9.b();
            r0 = r9.b(r0);
            if (r0 == 0) goto L_0x002f;
        L_0x0027:
            r0 = (java.lang.Number) r0;
            r3 = r0.longValue();
            r0 = (int) r3;
            goto L_0x0030;
        L_0x002f:
            r0 = 0;
        L_0x0030:
            if (r0 >= 0) goto L_0x0033;
        L_0x0032:
            r0 = 0;
        L_0x0033:
            r3 = r9.a();
            r4 = "it.venueItems";
            defpackage.akcr.a(r3, r4);
            r3 = (java.lang.Iterable) r3;
            r4 = new java.util.ArrayList;
            r4.<init>();
            r4 = (java.util.Collection) r4;
            r3 = r3.iterator();
        L_0x0049:
            r5 = r3.hasNext();
            if (r5 == 0) goto L_0x0074;
        L_0x004f:
            r5 = r3.next();
            r6 = r5;
            r6 = (defpackage.acac) r6;
            r7 = "venueItem";
            defpackage.akcr.a(r6, r7);
            r6 = r6.a();
            r6 = (java.lang.CharSequence) r6;
            if (r6 == 0) goto L_0x006c;
        L_0x0063:
            r6 = defpackage.akgb.a(r6);
            if (r6 == 0) goto L_0x006a;
        L_0x0069:
            goto L_0x006c;
        L_0x006a:
            r6 = 0;
            goto L_0x006d;
        L_0x006c:
            r6 = 1;
        L_0x006d:
            r6 = r6 ^ r1;
            if (r6 == 0) goto L_0x0049;
        L_0x0070:
            r4.add(r5);
            goto L_0x0049;
        L_0x0074:
            r4 = (java.util.List) r4;
            r9.a(r4);
            r1 = r9.a();
            r1 = r1.isEmpty();
            if (r1 == 0) goto L_0x0088;
        L_0x0083:
            r9 = defpackage.znk.a;
            r9 = (defpackage.znh) r9;
            return r9;
        L_0x0088:
            r1 = new zvp;
            r1.<init>(r9, r0, r2);
            r1 = (defpackage.zmy) r1;
            r9 = defpackage.znk.a(r1);
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.zvj$c.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: zvj$g */
    static final class g<T, R> implements ajfc<Boolean, ajdb> {
        final /* synthetic */ zvj a;
        final /* synthetic */ a b;

        /* renamed from: zvj$g$1 */
        static final class 1<V> implements Callable<Object> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object call() {
                boolean z;
                a aVar;
                acab acab = this.a.a.d;
                if (acab != null) {
                    this.a.b.a(acab);
                }
                if (this.a.a.a != null) {
                    z = true;
                    if ((zvj.a(this.a.a).a().d().isEmpty() ^ 1) != 0) {
                        this.a.b.a((acab) ajyu.g(zvj.a(this.a.a).a().d()));
                        aVar = this.a.b;
                        return aVar.b(z);
                    }
                }
                aVar = this.a.b;
                z = false;
                return aVar.b(z);
            }
        }

        g(zvj zvj, a aVar) {
            this.a = zvj;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            return bool.booleanValue() ? ajcx.b((Callable) new 1(this)) : ajvo.a(ajhn.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zvj.class), "venuefiltersDataSourceSubject", "getVenuefiltersDataSourceSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(zvj.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public zvj(ftl ftl, zgb zgb, zvr zvr, tvd tvd, zve zve) {
        akcr.b(ftl, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zvr, "venuesApi");
        akcr.b(tvd, "previewDataSource");
        akcr.b(zve, "venueFeedbackPageLauncher");
        this.f = ftl;
        this.l = zgb;
        this.g = zvr;
        this.h = tvd;
        this.i = zve;
    }

    private final ajwl<ajdp<znh<zmy>>> b() {
        return (ajwl) this.j.b();
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "builder");
        Object e = ajdp.a((Callable) new f(this)).b((ajdw) a().i()).j(ajfu.a).e().e((ajfc) new g(this, aVar));
        akcr.a(e, "Observable.defer {\n     …      }\n                }");
        return e;
    }

    public final ajdp<Optional<zmy>> a(abzt abzt) {
        akcr.b(abzt, "filters");
        Object d = ajdp.a((Callable) new a(this)).b((ajdw) a().i()).j(ajfu.a).e().d((ajfc) new b(abzt));
        akcr.a(d, "Observable.defer {\n     …      }\n                }");
        return d;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.k.b();
    }

    public final void a(int i) {
    }

    public final void a(ajdp<aesf> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, tqm tqm, ajcx ajcx, boolean z, toz toz, tpl tpl, ajdp<zmy> ajdp4) {
        akcr.b(ajdp, "mediaTypeObservable");
        akcr.b(ajdp2, "updateEnabledObservable");
        akcr.b(ajdp3, "previewVisibleObservable");
        akcr.b(tqm, "stackedFiltersController");
        akcr.b(ajcx, "delayedBind");
        akcr.b(toz, "mediaPlayerCapabilities");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp4, "currentAdapterViewModel");
        this.a = tqm;
        this.b = ajcx;
        super.a(ajdp, ajdp2, ajdp3, tqm, ajcx, z, toz, tpl, ajdp4);
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
        if (this.a != null) {
            aann aann = iip.c;
            tqm tqm = this.a;
            if (tqm == null) {
                akcr.a("stackedFiltersController");
            }
            for (acab acab : tqm.a().d()) {
                aann.G(acab.b());
                aann.c(acab.c());
                List a = acab.a();
                aann.M(a != null ? Long.valueOf((long) a.size()) : null);
                iip.g = true;
            }
        }
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
        Object m = abzt.m();
        if (m != null) {
            b().a(ajdp.b(m).p(c.a).i().a());
        }
    }

    public final void b(View view, zmy zmy) {
        ImageView imageView = view != null ? (ImageView) view.findViewById(R.id.venuefilter_reporting_tool_img) : null;
        if (imageView != null) {
            imageView.setOnClickListener(new d(this, zmy));
        }
    }

    public final ajdp<znh<zmy>> d() {
        Object a = ajdp.a((ajdt) b(), ajde.a);
        akcr.a(a, "Observable.switchOnNext(…filtersDataSourceSubject)");
        return a;
    }

    public final Map<Integer, Integer> e() {
        return ajyx.a;
    }

    public final void onDispose() {
    }
}
