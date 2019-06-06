package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.Toast;
import com.brightcove.player.model.Video.Fields;
import com.snap.memories.lib.meo.MyEyesOnlyStateProvider;
import com.snap.memories.lib.meo.MyEyesOnlyStateProvider.e;
import com.snapchat.android.R;
import defpackage.ovg.h;
import defpackage.ovx.g;
import defpackage.owf.f;
import defpackage.oyb.d;
import defpackage.oyr.n;
import defpackage.oyr.o;
import defpackage.oyr.q;
import defpackage.oyr.r;
import defpackage.oyr.s;
import defpackage.oza.c;
import defpackage.pfz.a;
import defpackage.pga.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: oyu */
public final class oyu implements ajej {
    private final ajwy<xad> A;
    private final ftl B;
    final ajxe a;
    final ajei b;
    public final ajwo<ojb> c;
    public final ajwo<ojj> d;
    final Context e;
    final oyr f;
    final ajwy<oyb> g;
    final ajwy<ovx> h;
    final achb<zjm, zjk> i;
    final ajwy<pjl> j;
    final pga k;
    final ajwy<pkp> l;
    final ajwy<owf> m;
    final ajwy<ilv> n;
    final ajwy<a> o;
    final ajwy<oza> p;
    final ajwy<ozm> q;
    private final AtomicBoolean r = new AtomicBoolean(false);
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final zkf w;
    private final ajwy<oya.a> x;
    private final pot y;
    private final sku z;

    /* renamed from: oyu$ab */
    static final class ab<T1, T2> implements ajew<Boolean, Throwable> {
        private /* synthetic */ oyu a;
        private /* synthetic */ zjm b;
        private /* synthetic */ String c;

        ab(oyu oyu, zjm zjm, String str) {
            this.a = oyu;
            this.b = zjm;
            this.c = str;
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            if (akcr.a((Boolean) obj, Boolean.TRUE)) {
                this.a.i.a((achg) this.b, true, true, null);
            } else {
                Toast.makeText(this.a.e, R.string.memories_general_error, 0).show();
            }
        }
    }

    /* renamed from: oyu$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.pga.b bVar = (defpackage.pga.b) obj;
            akcr.b(bVar, "it");
            return ajyl.a(bVar);
        }
    }

    /* renamed from: oyu$h */
    static final class h implements ajev {
        private /* synthetic */ oyu a;

        h(oyu oyu) {
            this.a = oyu;
        }

        public final void run() {
            ((pkp) this.a.l.get()).a();
        }
    }

    /* renamed from: oyu$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: oyu$j */
    static final class j implements ajev {
        private /* synthetic */ oyu a;
        private /* synthetic */ olb b;

        j(oyu oyu, olb olb) {
            this.a = oyu;
            this.b = olb;
        }

        public final void run() {
            if (this.b == olb.OPERA) {
                this.a.i.a((acig) new acio(ojc.a));
            }
        }
    }

    /* renamed from: oyu$p */
    static final class p<T> implements ajfb<Boolean> {
        private /* synthetic */ oyu a;
        private /* synthetic */ ozc b;

        p(oyu oyu, ozc ozc) {
            this.a = oyu;
            this.b = ozc;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "multiSelectEnabled");
            if (!obj.booleanValue()) {
                Object b;
                String str;
                oyr oyr = this.a.f;
                ozb ozb = this.b.a;
                WeakReference weakReference = this.b.b;
                znu znu = this.b.c;
                akcr.b(ozb, "snapData");
                akcr.b(weakReference, "imageViewRef");
                akcr.b(znu, "actionMenuContent");
                Object b2 = ajdx.c((Callable) new s((View) weakReference.get())).b((ajdw) oyr.a().h());
                akcr.a(b2, "Single.fromCallable {\n  …dulers.userInteractive())");
                ajeb ajeb = (ajeb) b2;
                if (oyr.h.p()) {
                    b = ajdx.c((Callable) new defpackage.oyr.p(oyr)).b((ajdw) oyr.a().i());
                    str = "Single.fromCallable {\n  …eOn(schedulers.queries())";
                } else {
                    b = ajdx.b(Boolean.FALSE);
                    str = "Single.just(false)";
                }
                akcr.a(b, str);
                b2 = ajdx.a(ajeb, (ajeb) b, (ajeb) oyr.i.c(), (ajfd) new n(oyr, ozb, znu));
                akcr.a(b2, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
                b2 = b2.a((ajfc) o.a);
                akcr.a(b2, "Singles\n                …          .flatMap { it }");
                ajej a = b2.a((ajdw) oyr.a().l()).a((ajfb) new q(oyr), (ajfb) new r(oyr, ozb));
                akcr.a((Object) a, "getController(snapData, …tId)))\n                })");
                ajvv.a(a, this.a.b);
            } else if (this.b.a.b != orh.INITIAL) {
                ((ozm) this.a.t.b()).b(this.b.a.a);
            } else {
                this.a.a(this.b.a.a);
            }
        }
    }

    /* renamed from: oyu$q */
    static final class q<T> implements ajfb<Boolean> {
        private /* synthetic */ oyu a;
        private /* synthetic */ ozd b;

        q(oyu oyu, ozd ozd) {
            this.a = oyu;
            this.b = ozd;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "multiSelectEnabled");
            if (obj.booleanValue() && ((ozm) this.a.t.b()).a()) {
                ((ozm) this.a.t.b()).b(this.b.a);
            } else {
                this.a.a(this.b.a, this.b.b, this.b.c, this.b.d, false);
            }
        }
    }

    /* renamed from: oyu$s */
    static final class s<T> implements ajfb<ajej> {
        private /* synthetic */ List a;

        s(List list) {
            this.a = list;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: oyu$t */
    static final class t<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ oyu a;

        t(oyu oyu) {
            this.a = oyu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            olj olj = (olj) obj;
            akcr.b(olj, "it");
            oyu oyu = this.a;
            obj = oyu.k.a((idd) oyu.a.b(), olj).f(b.a);
            akcr.a(obj, "snapToMediaPackageConver…entId).map { listOf(it) }");
            return obj.i();
        }
    }

    /* renamed from: oyu$u */
    static final class u<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final u a = new u();

        u() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return list;
        }
    }

    /* renamed from: oyu$v */
    static final class v<T> implements ajfb<Throwable> {
        public static final v a = new v();

        v() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: oyu$a */
    static final class a extends akcs implements akbk<idd> {
        private /* synthetic */ oiy a;

        a(oiy oiy) {
            this.a = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("MemoriesBusEventHandler");
        }
    }

    /* renamed from: oyu$aa */
    static final class aa extends akcs implements akbk<ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ oli b;

        aa(oyu oyu, oli oli) {
            this.a = oyu;
            this.b = oli;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ((a) this.a.o.get()).a(this.b, null, null).a(aamx.CANCELLED, null);
            return ajxw.a;
        }
    }

    /* renamed from: oyu$c */
    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ List b;
        private /* synthetic */ olb c;

        c(oyu oyu, List list, olb olb) {
            this.a = oyu;
            this.b = list;
            this.c = olb;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            oyu oyu = this.a;
            List list = this.b;
            olb olb = this.c;
            oyb oyb = (oyb) oyu.g.get();
            Set<olj> m = ajyu.m(list);
            akcr.b(m, "memoriesContentIds");
            Set linkedHashSet = new LinkedHashSet();
            Set linkedHashSet2 = new LinkedHashSet();
            Set linkedHashSet3 = new LinkedHashSet();
            for (olj olj : m) {
                if ((olj instanceof olp) || (olj instanceof oll)) {
                    linkedHashSet.add(olj.c);
                } else if (olj instanceof old) {
                    linkedHashSet3.add(((old) olj).a);
                } else if (olj instanceof olo) {
                    linkedHashSet2.add(((olo) olj).a);
                }
            }
            ovg ovg = oyb.a;
            akcr.b(linkedHashSet, "entryIds");
            akcr.b(linkedHashSet2, "snapIds");
            Object b = ajdx.c((Callable) new h(ovg, linkedHashSet, linkedHashSet2)).b((ajdw) ovg.b().i());
            akcr.a(b, "Single\n                .…eOn(schedulers.queries())");
            b = b.a((ajfc) new defpackage.oyb.c(oyb)).e((ajfc) new d(oyb, linkedHashSet3));
            akcr.a(b, "memoriesDeletionReposito…ollIds)\n                }");
            ajej g = b.b((ajev) new h(oyu)).a((ajdw) oyu.a().l()).a((ajfb) i.a).g(new j(oyu, olb));
            akcr.a((Object) g, "memoriesDeletionControll…      }\n                }");
            ajvv.a(g, oyu.b);
            return ajxw.a;
        }
    }

    /* renamed from: oyu$d */
    static final class d extends akcs implements akbl<List<? extends b>, ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ boolean b;
        private /* synthetic */ olb c;
        private /* synthetic */ boolean d;
        private /* synthetic */ oli e;

        d(oyu oyu, boolean z, olb olb, boolean z2, oli oli) {
            this.a = oyu;
            this.b = z;
            this.c = olb;
            this.d = z2;
            this.e = oli;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "convertResults");
            Iterable<b> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(bVar.a);
            }
            list = ajyn.b((Iterable) (List) arrayList);
            boolean z = true;
            if (this.b) {
                int i = oyv.a[this.c.ordinal()];
                if (i == 1) {
                    this.a.i.b((acig) new acio(ojc.a, false));
                } else if (i == 2) {
                    this.a.i.a(false);
                }
            }
            pgd b = this.a.b();
            boolean z2 = this.d;
            if (this.e.b != olb.GRID) {
                z = false;
            }
            b.a(list, z2, z, this.e);
            return ajxw.a;
        }
    }

    /* renamed from: oyu$e */
    static final class e extends akcs implements akbk<pgd> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (pgd) this.a.get();
        }
    }

    /* renamed from: oyu$f */
    static final class f extends akcs implements akbk<ozm> {
        private /* synthetic */ oyu a;

        f(oyu oyu) {
            this.a = oyu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ozm) this.a.q.get();
        }
    }

    /* renamed from: oyu$g */
    static final class g extends akcs implements akbk<oza> {
        private /* synthetic */ oyu a;

        g(oyu oyu) {
            this.a = oyu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (oza) this.a.p.get();
        }
    }

    /* renamed from: oyu$k */
    static final class k extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ akbk a;

        k(akbk akbk) {
            this.a = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.invoke();
            return ajxw.a;
        }
    }

    /* renamed from: oyu$l */
    static final class l extends akcs implements akbk<ajxw> {
        private /* synthetic */ akbk a;

        l(akbk akbk) {
            this.a = akbk;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            this.a.invoke();
            return ajxw.a;
        }
    }

    /* renamed from: oyu$m */
    static final class m extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ akbk a;

        m(akbk akbk) {
            this.a = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.invoke();
            return ajxw.a;
        }
    }

    /* renamed from: oyu$n */
    static final class n extends akcs implements akbl<List<? extends b>, ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ olg b;

        n(oyu oyu, olg olg) {
            this.a = oyu;
            this.b = olg;
            super(1);
        }

        /* JADX WARNING: Missing block: B:7:0x003f, code skipped:
            if (r8 == null) goto L_0x0041;
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (java.util.List) r8;
            r0 = "convertResults";
            defpackage.akcr.b(r8, r0);
            r0 = r8;
            r0 = (java.lang.Iterable) r0;
            r1 = new java.util.ArrayList;
            r2 = 10;
            r2 = defpackage.ajyn.a(r0, r2);
            r1.<init>(r2);
            r1 = (java.util.Collection) r1;
            r0 = r0.iterator();
        L_0x001b:
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x002d;
        L_0x0021:
            r2 = r0.next();
            r2 = (defpackage.pga.b) r2;
            r2 = r2.a;
            r1.add(r2);
            goto L_0x001b;
        L_0x002d:
            r1 = (java.util.List) r1;
            r1 = (java.lang.Iterable) r1;
            r0 = defpackage.ajyn.b(r1);
            r8 = defpackage.ajyu.g(r8);
            r8 = (defpackage.pga.b) r8;
            if (r8 == 0) goto L_0x0041;
        L_0x003d:
            r8 = r8.b;
            if (r8 != 0) goto L_0x0046;
        L_0x0041:
            r8 = new oja;
            r8.<init>();
        L_0x0046:
            r1 = r7.b;
            r1 = r1.a;
            r2 = r1 instanceof defpackage.olo;
            if (r2 != 0) goto L_0x0064;
        L_0x004e:
            r2 = r1 instanceof defpackage.oll;
            if (r2 != 0) goto L_0x0064;
        L_0x0052:
            r2 = r1 instanceof defpackage.olp;
            if (r2 == 0) goto L_0x0057;
        L_0x0056:
            goto L_0x0064;
        L_0x0057:
            r1 = r1 instanceof defpackage.old;
            if (r1 == 0) goto L_0x005e;
        L_0x005b:
            r1 = defpackage.pju.CAMERA_ROLL;
            goto L_0x0073;
        L_0x005e:
            r8 = new ajxk;
            r8.<init>();
            throw r8;
        L_0x0064:
            r1 = r7.b;
            r1 = r1.a;
            r1 = defpackage.olk.a(r1);
            if (r1 == 0) goto L_0x0071;
        L_0x006e:
            r1 = defpackage.pju.MY_EYES_ONLY;
            goto L_0x0073;
        L_0x0071:
            r1 = defpackage.pju.MEMORIES;
        L_0x0073:
            r2 = r7.a;
            r2 = r2.n;
            r2 = r2.get();
            r2 = (defpackage.ilv) r2;
            r3 = r7.b;
            r3 = r3.b;
            r3 = r3.toString();
            r4 = "saveSource";
            defpackage.akcr.b(r1, r4);
            r4 = "eventSource";
            defpackage.akcr.b(r3, r4);
            r4 = defpackage.iom.EDIT_ATTEMPT;
            r5 = r1;
            r5 = (java.lang.Enum) r5;
            r6 = "source";
            r4 = r4.a(r6, r5);
            r5 = "event_source";
            r3 = r4.a(r5, r3);
            r2.c(r3, 1);
            r2 = r7.a;
            r2 = r2.j;
            r2 = r2.get();
            r2 = (defpackage.pjl) r2;
            r2.a(r0, r1);
            r1 = r7.a;
            r1 = r1.c;
            r2 = new ojb;
            r3 = r7.b;
            r3 = r3.a;
            r3 = defpackage.ajyl.a(r3);
            r3 = defpackage.oyu.a(r3);
            r2.<init>(r0, r8, r3);
            r1.a(r2);
            r8 = defpackage.ajxw.a;
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oyu$n.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: oyu$o */
    static final class o extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ oyt b;
        private /* synthetic */ String c;
        private /* synthetic */ zjm d;
        private /* synthetic */ olh e;

        o(oyu oyu, oyt oyt, String str, zjm zjm, olh olh) {
            this.a = oyu;
            this.b = oyt;
            this.c = str;
            this.d = zjm;
            this.e = olh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            obj = this.b.a;
            if (!(obj == null || akgb.a((CharSequence) obj))) {
                if (akcr.a(obj, this.c)) {
                    this.a.i.a((achg) this.d, true, true, null);
                } else {
                    oyu oyu = this.a;
                    String str = this.e.a.a;
                    zjm zjm = this.d;
                    ovx ovx = (ovx) oyu.h.get();
                    akcr.b(str, "entryId");
                    akcr.b(obj, "title");
                    obj = ajdx.c((Callable) new g(ovx, str, obj)).b((ajdw) ovx.a().n());
                    akcr.a(obj, "Single.fromCallable {\n  ….memoriesDatabaseWrite())");
                    ajej b = obj.a((ajdw) oyu.a().l()).b((ajew) new ab(oyu, zjm, str));
                    akcr.a((Object) b, "storiesRepository.get()\n…      }\n                }");
                    ajvv.a(b, oyu.b);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: oyu$r */
    static final class r extends akcs implements akbl<List<? extends b>, ajxw> {
        final /* synthetic */ oyu a;
        private /* synthetic */ oln b;

        /* renamed from: oyu$r$2 */
        static final class 2<T> implements ajfb<ojj> {
            private /* synthetic */ r a;

            2(r rVar) {
                this.a = rVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.d.a((ojj) obj);
            }
        }

        /* renamed from: oyu$r$3 */
        static final class 3<T> implements ajfb<Throwable> {
            private /* synthetic */ r a;

            3(r rVar) {
                this.a = rVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Toast.makeText(this.a.a.e, R.string.memories_general_error, 0).show();
            }
        }

        r(oyu oyu, oln oln) {
            this.a = oyu;
            this.b = oln;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            List list = (List) obj;
            akcr.b(list, "convertResults");
            olj olj = this.b.a.size() == 1 ? (olj) ajyu.f(this.b.a) : null;
            Iterable<b> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(bVar.a);
            }
            list = ajyn.b((Iterable) (List) arrayList);
            final gcn a = oyu.a(this.b.a);
            if ((olj instanceof oll) || (olj instanceof olp)) {
                owf owf = (owf) this.a.m.get();
                Context context = this.a.e;
                str = olj.c;
                akcr.b(context, "context");
                akcr.b(str, "entryId");
                Object b = ajdx.a((Callable) new f(owf, str, context)).b((ajdw) owf.c().i());
                akcr.a(b, "Single\n                .…eOn(schedulers.queries())");
                obj = b.f(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        String str = (String) obj;
                        akcr.b(str, "title");
                        return new ojk(a, list, str);
                    }
                });
                str = "entryRepository.get().ge…                        }";
            } else {
                obj = ajdx.b(new ojh(a, list));
                str = "Single.just(MemoriesRegu…es\n                    ))";
            }
            akcr.a(obj, str);
            ajej a2 = obj.a((ajdw) this.a.a().l()).a((ajfb) new 2(this), (ajfb) new 3(this));
            akcr.a((Object) a2, "when (contentId) {\n     …()\n                    })");
            ajvv.a(a2, this.a.b);
            return ajxw.a;
        }
    }

    /* renamed from: oyu$w */
    static final class w extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ oyu a;

        w(oyu oyu) {
            this.a = oyu;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            Toast.makeText(this.a.e, R.string.error_something_went_wrong, 0).show();
            return ajxw.a;
        }
    }

    /* renamed from: oyu$x */
    static final class x extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ oiy b;

        x(zgb zgb, oiy oiy) {
            this.a = zgb;
            this.b = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("MemoriesBusEventHandler"));
        }
    }

    /* renamed from: oyu$y */
    static final class y extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ oli b;

        y(oyu oyu, oli oli) {
            this.a = oyu;
            this.b = oli;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.b, false, true);
            return ajxw.a;
        }
    }

    /* renamed from: oyu$z */
    static final class z extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ oyu a;
        private /* synthetic */ oli b;

        z(oyu oyu, oli oli) {
            this.a = oyu;
            this.b = oli;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.b, true, true);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(oyu.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(oyu.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(oyu.class), "multiSelectController", "getMultiSelectController()Lcom/snap/memories/lib/grid/multiselect/MultiSelectController;"), new akdc(akde.a(oyu.class), "memoriesExportController", "getMemoriesExportController()Lcom/snap/memories/lib/media/MemoriesExportController;"), new akdc(akde.a(oyu.class), "myEyesOnlyEventHandler", "getMyEyesOnlyEventHandler()Lcom/snap/memories/lib/grid/MyEyesOnlyEventHandler;")};
    }

    public oyu(oiy oiy, zgb zgb, Context context, oyr oyr, zkf zkf, ajwy<oya.a> ajwy, ajwy<oyb> ajwy2, ajwy<pgd> ajwy3, ajwy<ovx> ajwy4, pot pot, achb<zjm, zjk> achb, sku sku, ajwy<pjl> ajwy5, pga pga, ajwy<pkp> ajwy6, ajwy<xad> ajwy7, ajwy<owf> ajwy8, ajwy<ilv> ajwy9, ajwy<a> ajwy10, ajwy<oza> ajwy11, ftl ftl, ajwy<ozm> ajwy12) {
        zgb zgb2 = zgb;
        Context context2 = context;
        oyr oyr2 = oyr;
        zkf zkf2 = zkf;
        ajwy<oya.a> ajwy13 = ajwy;
        ajwy<oyb> ajwy14 = ajwy2;
        ajwy<pgd> ajwy15 = ajwy3;
        ajwy<ovx> ajwy16 = ajwy4;
        pot pot2 = pot;
        achb<zjm, zjk> achb2 = achb;
        sku sku2 = sku;
        ajwy<pjl> ajwy17 = ajwy5;
        pga pga2 = pga;
        ajwy<pkp> ajwy18 = ajwy6;
        ajwy<xad> ajwy19 = ajwy7;
        akcr.b(oiy, "memoriesAttributedFeature");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(context2, "context");
        akcr.b(oyr2, "actionMenuLauncher");
        akcr.b(zkf2, "rxBus");
        akcr.b(ajwy13, "contentDebugViewerPageControllerBuilder");
        akcr.b(ajwy14, "memoriesDeletionController");
        akcr.b(ajwy15, "exportController");
        akcr.b(ajwy16, "storiesRepository");
        akcr.b(pot2, "memoriesOperaViewerLauncher");
        akcr.b(achb2, "navigationHost");
        akcr.b(sku2, "playbackPerformanceAnalytics");
        akcr.b(ajwy17, "saveSessionManager");
        akcr.b(pga2, "snapToMediaPackageConverter");
        akcr.b(ajwy18, "syncManager");
        akcr.b(ajwy7, "spectaclesContentController");
        ajwy<owf> ajwy20 = ajwy8;
        akcr.b(ajwy20, "entryRepository");
        ajwy<ilv> ajwy21 = ajwy9;
        akcr.b(ajwy21, "graphene");
        akcr.b(ajwy10, "exportAnalyticsBuilder");
        akcr.b(ajwy11, "meoEventHandler");
        akcr.b(ftl, "configurationProvider");
        akcr.b(ajwy12, "multiSelectControllerProvider");
        ajwy<xad> ajwy22 = ajwy7;
        this.e = context2;
        this.f = oyr2;
        this.w = zkf2;
        this.x = ajwy13;
        this.g = ajwy14;
        this.h = ajwy16;
        this.y = pot2;
        this.i = achb2;
        this.z = sku2;
        this.j = ajwy17;
        this.k = pga2;
        this.l = ajwy18;
        this.A = ajwy22;
        this.m = ajwy20;
        this.n = ajwy21;
        ajwy<oza> ajwy23 = ajwy11;
        this.o = ajwy10;
        this.p = ajwy23;
        ajwy<ozm> ajwy24 = ajwy12;
        this.B = ftl;
        this.q = ajwy24;
        oiy oiy2 = oiy;
        this.a = ajxh.a(new a(oiy2));
        this.s = ajxh.a(new x(zgb, oiy2));
        this.t = ajxh.a(new f(this));
        this.u = ajxh.a(new e(ajwy3));
        this.v = ajxh.a(new g(this));
        this.b = new ajei();
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<MemoriesEditEvent>()");
        this.c = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<MemoriesSendEvent>()");
        this.d = ajwo;
    }

    private void a(List<? extends olj> list, olb olb, akbl<? super List<b>, ajxw> akbl) {
        acig a;
        String str = "contentIds";
        akcr.b(list, str);
        akcr.b(olb, "source");
        akcr.b(akbl, "onSuccess");
        zhe.a aVar = new zhe.a(this.e, this.i, ojc.c, false);
        akcr.b(list, str);
        Object d = ajdp.b((Iterable) list).e((ajfb) new s(list)).c((ajfc) new t(this)).l(u.a).a(16).b((ajdw) a().b()).d((ajfb) v.a);
        akcr.a(d, "Observable.fromIterable(…sage}\")\n                }");
        d = d.a((ajdw) a().l()).c((ajfb) new oyx(akbl)).e();
        akcr.a(d, "prepareMediaPackages(con…         .ignoreElement()");
        zhe a2 = aVar.a(d).a((akbl) new w(this), true).a();
        if (olb == olb.GRID) {
            a = acie.a.a(new acig[]{new acio(ojc.a, false), new acip(this.i, a2, a2.b)}, null);
        } else {
            a = new acip(this.i, a2, a2.b);
        }
        this.i.a(a);
    }

    private final oza d() {
        return (oza) this.v.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.s.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(oli oli, boolean z, boolean z2) {
        akcr.b(oli, "event");
        List list = oli.a;
        olb olb = oli.b;
        a(list, olb, (akbl) new d(this, z2, olb, z, oli));
    }

    /* Access modifiers changed, original: final */
    public final void a(olj olj) {
        if (olk.b(olj)) {
            ajej c = ((xad) this.A.get()).b(olj.c).c();
            akcr.a((Object) c, "spectaclesContentControl…             .subscribe()");
            ajvv.a(c, this.b);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(olj olj, ouw ouw, WeakReference<View> weakReference, ajdx<List<ouw>> ajdx, boolean z) {
        por por;
        olj olj2 = olj;
        long b = this.z.b();
        long c = this.z.c();
        if ((olj2 instanceof oll) || (olj2 instanceof olo)) {
            por = por.SNAP;
        } else if (olj2 instanceof olp) {
            por = ((olp) olj2).b ? por.SPECTACLES : por.STORY;
        } else if (olj2 instanceof old) {
            por = por.CAMERA_ROLL;
        } else {
            throw new ajxk();
        }
        ajvv.a(this.y.a(ouw, por, weakReference, ajdx, b, c, z), this.b);
    }

    /* Access modifiers changed, original: final */
    public final pgd b() {
        return (pgd) this.u.b();
    }

    public final ajej c() {
        if (this.r.compareAndSet(false, true)) {
            ajej a = this.w.a(this);
            akcr.a((Object) a, "rxBus.subscribe(this)");
            ajvv.a(a, this.b);
        }
        return this;
    }

    public final void dispose() {
        if (this.r.compareAndSet(true, false)) {
            this.b.a();
            b().a.a();
            d().a.a();
        }
    }

    public final boolean isDisposed() {
        return !this.r.get();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onDebugContentEvent(ole ole) {
        akcr.b(ole, "event");
        oya.a aVar = (oya.a) this.x.get();
        olj olj = ole.a;
        akcr.b(olj, "id");
        aVar.b = olj;
        zjm zjm = aVar.a;
        Context context = aVar.c;
        zgb zgb = aVar.d;
        oiy oiy = aVar.e;
        zkq zkq = aVar.f;
        owf owf = aVar.g;
        owl owl = aVar.h;
        epx epx = aVar.i;
        olj olj2 = aVar.b;
        if (olj2 == null) {
            akcr.a(Fields.CONTENT_ID);
        }
        oya oya = new oya(zjm, context, zgb, oiy, zkq, owf, owl, epx, olj2, (byte) 0);
        this.i.a((achd) oya, (acgu) oya.b.b(), null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onDeleteContentEvent(olf olf) {
        zgy.a a;
        akcr.b(olf, "event");
        List list = olf.a;
        olb olb = olf.b;
        olj olj = list.size() == 1 ? (olj) ajyu.f(list) : null;
        int i = olj instanceof olp ? R.string.memories_delete_story_body : olj instanceof old ? R.string.memories_delete_camera_roll_body : ((olj instanceof olo) || (olj instanceof oll)) ? R.string.memories_delete_snap_body : R.string.memories_delete_snaps_body;
        zgy.a aVar = new zgy.a(this.e, this.i, ojc.c, false, null, 24);
        if (olj instanceof old) {
            a = aVar.a((int) R.string.memories_delete_camera_roll_title);
        }
        zgy a2 = zgy.a.a(a.b(i).a((int) R.string.memories_delete_text, (akbl) new c(this, list, olb), olb == olb.GRID), null, false, null, null, null, 31).a();
        this.i.a((acig) olb == olb.GRID ? acie.a.a(new acig[]{new acio(ojc.a, false), new acip(this.i, a2, a2.a)}, null) : new acip(this.i, a2, a2.a));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onEditSnapEvent(olg olg) {
        akcr.b(olg, "event");
        a(ajyl.a(olg.a), olg.b, (akbl) new n(this, olg));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onEditStoryNameEvent(olh olh) {
        olh olh2 = olh;
        akcr.b(olh2, "event");
        String str = olh2.a.d;
        CharSequence charSequence = str;
        Object obj = (charSequence == null || akgb.a(charSequence)) ? 1 : null;
        int i = obj != null ? R.string.action_menu_name_story : R.string.action_menu_rename_story;
        zjm zjm = ojc.s;
        zgy.a aVar = new zgy.a(this.e, this.i, zjm, false, null, 24);
        oyt oyt = new oyt(str);
        zgy a = zgy.a.a(zgy.a.a(aVar.a(i), null, str, oyt, (InputFilter[]) new LengthFilter[]{new LengthFilter(30)}, Integer.valueOf(8193), null, false, false, 224).a((int) R.string.memories_submit, (akbl) new o(this, oyt, str, zjm, olh), false), null, false, null, null, null, 31).a();
        this.i.a(olh2.b == olb.GRID ? acie.a.a(new acig[]{new acio(ojc.a, false), new acip(this.i, a, a.a)}, null) : new acip(this.i, a, a.a));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onEntryLongClickEvent(ozc ozc) {
        akcr.b(ozc, "event");
        ajej e = oyw.a(this.B, ozc.a.a).b((ajdw) a().h()).a((ajdw) a().l()).e((ajfb) new p(this, ozc));
        akcr.a((Object) e, "configurationProvider.is…      }\n                }");
        ajvv.a(e, this.b);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onExportSnapEvent(oli oli) {
        Object obj;
        akcr.b(oli, "event");
        Iterable<olj> iterable = oli.a;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (olj olj : iterable) {
                if (!(olj instanceof old)) {
                    obj = null;
                    break;
                }
            }
        }
        obj = 1;
        if (obj != null) {
            a(oli, true, false);
            return;
        }
        acie a;
        akbk aaVar = new aa(this, oli);
        zgy a2 = zgy.a.a(new zgy.a(this.e, this.i, ojc.c, false, null, 24).a((int) R.string.memories_action_menu_export_to).a((int) R.string.memories_action_menu_export_to_camera_roll, (akbl) new y(this, oli), false).a((int) R.string.memories_action_menu_export_to_other_apps, (akbl) new z(this, oli), false), (akbl) new k(aaVar), false, null, null, null, 30).a((akbk) new l(aaVar)).a((akbl) new m(aaVar)).a();
        if (oli.b == olb.GRID) {
            a = acie.a.a(new acig[]{new acio(ojc.a, false), new acip(this.i, a2, a2.a)}, null);
        } else {
            a = new acip(this.i, a2, a2.a);
        }
        this.i.a((acig) a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onMemoriesSnapClickEvent(ozd ozd) {
        akcr.b(ozd, "event");
        ajej e = oyw.a(this.B, ozd.a).b((ajdw) a().h()).a((ajdw) a().l()).e((ajfb) new q(this, ozd));
        akcr.a((Object) e, "configurationProvider.is…      }\n                }");
        ajvv.a(e, this.b);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onMemoriesSnapImportClickEvent(oze oze) {
        akcr.b(oze, "event");
        a(oze.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPrioritizeFromActionMenu(olm olm) {
        akcr.b(olm, "event");
        a(olm.a);
        this.i.a(true);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSendSnapEvent(oln oln) {
        akcr.b(oln, "event");
        a(oln.a, oln.b, (akbl) new r(this, oln));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onToggleMyEyesOnly(olq olq) {
        String str = "event";
        akcr.b(olq, str);
        if (olq.a()) {
            ((ilv) this.n.get()).c((ily) iom.MEO_IMPORT_ATTEMPT, 1);
        }
        oza d = d();
        akcr.b(olq, str);
        MyEyesOnlyStateProvider myEyesOnlyStateProvider = (MyEyesOnlyStateProvider) d.g.get();
        Object c = myEyesOnlyStateProvider.c().d().c((ajfc) new e(myEyesOnlyStateProvider));
        akcr.a(c, "observeMyEyesOnlyEnabled…      }\n                }");
        ajej a = c.a((ajdw) ((zfw) d.c.b()).l()).a((ajfb) new c(d, olq), (ajfb) new oza.d(d, olq));
        akcr.a((Object) a, "myEyesOnlyStateProvider.…(it) }\n                })");
        ajvv.a(a, d.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onViewInVrEvent(ols ols) {
        akcr.b(ols, "event");
        Object a = ajyl.a(ols.b);
        olj olj = ols.a;
        ouw ouw = ols.b;
        WeakReference weakReference = ols.c;
        Object b = ajdx.b(a);
        akcr.a(b, "Single.just(singleItemPlaylist)");
        a(olj, ouw, weakReference, b, true);
    }
}
