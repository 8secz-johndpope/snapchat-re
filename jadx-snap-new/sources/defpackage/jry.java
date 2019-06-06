package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jry */
public final class jry extends ajed implements zma, zmb {
    final Resources a;
    final ajxe b = ajxh.a(new c(this));
    final Set<String> c = new LinkedHashSet();
    final ajwl<Long> d;
    final idj e;
    final String f;
    final iqt g;
    final ith h;
    final jth i;
    final ajwl<Boolean> j;
    private final ajdp<znh<zmy>> k;
    private final ajwl<Integer> l;
    private final ypo m;

    /* renamed from: jry$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ jry a;
        private /* synthetic */ int b;

        public a(jry jry, int i) {
            this.a = jry;
            this.b = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0011 A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
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
            if (r1 == 0) goto L_0x0059;
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
            if (r3 == 0) goto L_0x0052;
        L_0x002e:
            r3 = r2.h;
            if (r3 == 0) goto L_0x0036;
        L_0x0032:
            r4 = r3.longValue();
        L_0x0036:
            r3 = "timestamp";
            defpackage.akcr.a(r10, r3);
            r6 = r10.longValue();
            r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r3 > 0) goto L_0x0052;
        L_0x0043:
            r3 = r8.a;
            r3 = r3.c;
            r2 = r2.c;
            r2 = r3.contains(r2);
            if (r2 == 0) goto L_0x0050;
        L_0x004f:
            goto L_0x0052;
        L_0x0050:
            r2 = 0;
            goto L_0x0053;
        L_0x0052:
            r2 = 1;
        L_0x0053:
            if (r2 == 0) goto L_0x0011;
        L_0x0055:
            r0.add(r1);
            goto L_0x0011;
        L_0x0059:
            r0 = (java.util.List) r0;
            r9 = new ajxm;
            r10 = r8.b;
            r10 = java.lang.Integer.valueOf(r10);
            r9.<init>(r0, r10);
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jry$a.apply(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jry$b */
    public static final class b<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Object obj = (Integer) t2;
            Object obj2 = (znh) t1;
            int a = obj2.a() - 1;
            akcr.a(obj, "itemCount");
            if (akcr.a(a, obj.intValue()) <= 0) {
                return obj2;
            }
            akcr.a(obj2, "friends");
            return znk.a(znk.a(ajyu.k((Iterable) obj2).subList(0, obj.intValue() + 1)), znk.a(new jve()));
        }
    }

    /* renamed from: jry$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ jry a;

        d(jry jry) {
            this.a = jry;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            List list = (List) ajxm.a;
            int intValue = ((Number) ajxm.b).intValue();
            jry jry = this.a;
            Iterable iterable = list;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                itm itm = (itm) next;
                jre a = jrf.a(true, i, list.size());
                Object p = jry.d.p();
                if (p == null) {
                    akcr.a();
                }
                akcr.a(p, "lastSeenAddedMeSectionTimestamp.value!!");
                List list2 = list;
                jrx jrx = r2;
                Collection collection = arrayList;
                jrx jrx2 = new jrx(itm, ((Number) p).longValue(), jry.e, jry.f, a, jry.g, jry.h, jry.i, true, intValue);
                collection.add(jrx);
                list = list2;
                arrayList = collection;
                i = i2;
            }
            Object b = ajdp.b((List) arrayList);
            akcr.a(b, "Observable.just(addedMeF…tAcceptV2Type)\n        })");
            return b;
        }
    }

    /* renamed from: jry$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ jry a;

        e(jry jry) {
            this.a = jry;
        }

        public final /* synthetic */ Object apply(Object obj) {
            znh a;
            List list = (List) obj;
            akcr.b(list, "it");
            if (list.isEmpty()) {
                this.a.j.a(Boolean.TRUE);
                a = znk.a((jub) this.a.b.b());
            } else {
                this.a.j.a(Boolean.FALSE);
                a = znk.a(list);
            }
            if (list.isEmpty()) {
                return znk.a;
            }
            Object string = this.a.a.getString(R.string.ff_added_me_title);
            akcr.a(string, "resources.getString(R.string.ff_added_me_title)");
            return znk.a(znk.a(new jrz(string)), a);
        }
    }

    /* renamed from: jry$c */
    static final class c extends akcs implements akbk<jub> {
        private /* synthetic */ jry a;

        c(jry jry) {
            this.a = jry;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new jub(this.a.a.getString(R.string.no_new_friends_text, new Object[]{abqi.a(abpz.POOP)}));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jry.class), "noNewFriendsViewModel", "getNoNewFriendsViewModel()Lcom/snap/identity/ui/shared/nofriends/NoFriendsViewModel;");
    }

    public jry(Context context, ajdp<List<itm>> ajdp, ajwl<Integer> ajwl, ajwl<Long> ajwl2, idj idj, String str, iqt iqt, ith ith, jth jth, ajwl<Boolean> ajwl3, int i, ypo ypo) {
        akcr.b(context, "context");
        akcr.b(ajdp, "source");
        akcr.b(ajwl, "itemCount");
        akcr.b(ajwl2, "lastSeenAddedMeSectionTimestamp");
        akcr.b(idj, "uiPage");
        akcr.b(str, "featureName");
        akcr.b(iqt, "friendActionSource");
        akcr.b(ith, "analyticsSource");
        akcr.b(jth, "addedMeAndQuickAddSeenLogger");
        akcr.b(ajwl3, "addMeEmptySubject");
        akcr.b(ypo, "publicUserStoriesSyncableSection");
        this.l = ajwl;
        this.d = ajwl2;
        this.e = idj;
        this.f = str;
        this.g = iqt;
        this.h = ith;
        this.i = jth;
        this.j = ajwl3;
        this.m = ypo;
        this.a = context.getResources();
        ajdp a = ajdp.a((ajdt) ajdp, (ajdt) this.d, (ajex) new a(this, i));
        if (a == null) {
            akcr.a();
        }
        Object p = a.u(new d(this)).p(new e(this));
        akcr.a(p, "viewModelSource");
        a = ajdp.a((ajdt) p, (ajdt) this.l, (ajex) new b());
        if (a == null) {
            akcr.a();
        }
        this.k = a;
    }

    public final void a(View view, zmy zmy) {
        this.m.a(view, zmy);
    }

    public final void b(View view, zmy zmy) {
        this.m.b(view, zmy);
    }

    public final ajdp<znh<zmy>> c() {
        return this.k;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.c.add(isj.b);
    }

    public final void onDispose() {
        this.m.dispose();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFriendsViewMoreClick(iss iss) {
        akcr.b(iss, "event");
        ajwl ajwl = this.l;
        Object p = ajwl.p();
        if (p == null) {
            akcr.a();
        }
        ajwl.a(Integer.valueOf(((Number) p).intValue() + 7));
    }
}
