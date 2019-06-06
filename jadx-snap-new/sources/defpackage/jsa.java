package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jsa */
public final class jsa extends ajed implements zma {
    long a;
    final idj b;
    final iqt c;
    final ith d;
    final zke e;
    final jth f;
    private final ajdp<znh<zmy>> g;
    private final ajwl<Long> h;

    /* renamed from: jsa$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0011 A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
        public final R apply(T1 r9, T2 r10) {
            /*
            r8 = this;
            r10 = (java.lang.Long) r10;
            r9 = (java.util.List) r9;
            r9 = (java.lang.Iterable) r9;
            r0 = new java.util.ArrayList;
            r0.<init>();
            r0 = (java.util.Collection) r0;
            r9 = r9.iterator();
        L_0x0011:
            r1 = r9.hasNext();
            if (r1 == 0) goto L_0x004c;
        L_0x0017:
            r1 = r9.next();
            r2 = r1;
            r2 = (defpackage.itm) r2;
            r3 = r2.g;
            r4 = 0;
            if (r3 == 0) goto L_0x0029;
        L_0x0024:
            r6 = r3.longValue();
            goto L_0x002a;
        L_0x0029:
            r6 = r4;
        L_0x002a:
            r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
            if (r3 != 0) goto L_0x0045;
        L_0x002e:
            r2 = r2.h;
            if (r2 == 0) goto L_0x0036;
        L_0x0032:
            r4 = r2.longValue();
        L_0x0036:
            r2 = "timestamp";
            defpackage.akcr.a(r10, r2);
            r2 = r10.longValue();
            r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
            if (r6 <= 0) goto L_0x0045;
        L_0x0043:
            r2 = 1;
            goto L_0x0046;
        L_0x0045:
            r2 = 0;
        L_0x0046:
            if (r2 == 0) goto L_0x0011;
        L_0x0048:
            r0.add(r1);
            goto L_0x0011;
        L_0x004c:
            r0 = (java.util.List) r0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jsa$a.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jsa$b */
    public static final class b<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ jsa a;

        public b(jsa jsa) {
            this.a = jsa;
        }

        public final R apply(T1 t1, T2 t2) {
            Object obj = (Long) t2;
            Object obj2 = (List) t1;
            akcr.a(obj2, "friends");
            Collection arrayList = new ArrayList();
            Iterator it = ((Iterable) obj2).iterator();
            while (true) {
                long j = 0;
                int i = 1;
                String str = "null cannot be cast to non-null type com.snap.identity.ui.shared.addfriendstakeover.AddFriendsTakeOverViewModel";
                if (it.hasNext()) {
                    Object next = it.next();
                    zmy zmy = (zmy) next;
                    if (zmy != null) {
                        Long l = ((jse) zmy).e;
                        if (l != null) {
                            j = l.longValue();
                        }
                        akcr.a(obj, "lastViewedReverseAddedTimestamp");
                        if (j <= obj.longValue()) {
                            i = 0;
                        }
                        if (i != 0) {
                            arrayList.add(next);
                        }
                    } else {
                        throw new ajxt(str);
                    }
                }
                List list = (List) arrayList;
                if ((list.isEmpty() ^ 1) != 0) {
                    obj2 = ajyu.f(list);
                    if (obj2 != null) {
                        obj2 = (jse) obj2;
                        jsa jsa = this.a;
                        Long l2 = obj2.e;
                        if (l2 != null) {
                            j = l2.longValue();
                        }
                        jsa.a = j;
                        return znk.a(obj2);
                    }
                    throw new ajxt(str);
                }
                this.a.e.a(new jsw());
                return znk.a;
            }
        }
    }

    /* renamed from: jsa$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return ajyu.h((Iterable) list);
        }
    }

    /* renamed from: jsa$d */
    static final class d extends akcq implements akbl<List<? extends itm>, List<? extends zmy>> {
        d(jsa jsa) {
            super(1, jsa);
        }

        public final String getName() {
            return "toViewModels";
        }

        public final akej getOwner() {
            return akde.a(jsa.class);
        }

        public final String getSignature() {
            return "toViewModels(Ljava/util/List;)Ljava/util/List;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            jsa jsa = (jsa) this.receiver;
            Iterable<itm> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (itm jse : iterable) {
                arrayList.add(new jse(jse, jsa.b, jsa.c, jsa.d, (String) jrg.a.get(new Random().nextInt(jrg.a.size())), jsa.f));
            }
            return (List) arrayList;
        }
    }

    public jsa(ajdp<List<itm>> ajdp, ajwl<Long> ajwl, idj idj, iqt iqt, ith ith, zke zke, jth jth) {
        akcr.b(ajdp, "source");
        akcr.b(ajwl, "lastSeenAddedMeSectionTimestamp");
        akcr.b(idj, "uiPage");
        akcr.b(iqt, "friendActionSource");
        akcr.b(ith, "analyticsSource");
        akcr.b(zke, "eventDispatcher");
        akcr.b(jth, "addedMeAndQuickAddSeenLogger");
        this.b = idj;
        this.c = iqt;
        this.d = ith;
        this.e = zke;
        this.f = jth;
        Object i = ajwl.i(Long.valueOf(0));
        akcr.a(i, "BehaviorSubject.createDefault(0L)");
        this.h = i;
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) ajwl, (ajex) new a());
        if (a == null) {
            akcr.a();
        }
        Object p = a.p(c.a).p(new jsb(new d(this)));
        akcr.a(p, "viewModelSource");
        a = ajdp.a((ajdt) p, (ajdt) this.h, (ajex) new b(this));
        if (a == null) {
            akcr.a();
        }
        this.g = a;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return this.g;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.h.a(Long.valueOf(this.a));
    }

    public final void onDispose() {
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onIgnoreFriendEvent(isv isv) {
        akcr.b(isv, "event");
        this.h.a(Long.valueOf(this.a));
    }
}
