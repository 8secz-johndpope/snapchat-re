package defpackage;

import android.content.Context;
import android.view.View;
import com.snapchat.android.R;
import defpackage.akdd.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;
import org.opencv.imgproc.Imgproc;

/* renamed from: jut */
public final class jut extends ajed implements zma, zmb {
    final Set<String> a;
    final Set<String> b;
    final Set<String> c;
    final Context d;
    final jth e;
    final idj f;
    final String g;
    final iqt h;
    final ith i;
    final boolean j;
    final zlv k;
    final ajwl<Boolean> l;
    final boolean m;
    final boolean n;
    private final ajdp<znh<zmy>> o;
    private final ajcx p;
    private final ftl q;
    private final ypo r;

    /* renamed from: jut$c */
    static final class c<T> implements ajfb<znh<itp>> {
        private /* synthetic */ jut a;
        private /* synthetic */ a b;

        c(jut jut, a aVar) {
            this.a = jut;
            this.b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (znh) obj;
            this.b.a = false;
            akcr.a(obj, "it");
            for (itp itp : (Iterable) obj) {
                if (itp.g) {
                    this.a.b.add(itp.c);
                } else {
                    this.a.a.remove(itp.c);
                }
            }
        }
    }

    /* renamed from: jut$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ jut a;
        private /* synthetic */ a b;

        e(jut jut, a aVar) {
            this.a = jut;
            this.b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.b.a = true;
            this.a.a.addAll(this.a.b);
            this.a.b.clear();
        }
    }

    /* renamed from: jut$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ jut a;
        private /* synthetic */ defpackage.akdd.a b;

        public a(jut jut, defpackage.akdd.a aVar) {
            this.a = jut;
            this.b = aVar;
        }

        public final R apply(T1 t1, T2 t2) {
            Object obj = (znh) t1;
            String str = "records";
            Collection arrayList;
            if (this.b.a) {
                akcr.a(obj, str);
                arrayList = new ArrayList();
                for (Object next : (Iterable) obj) {
                    if ((((itp) next).g ^ 1) != 0) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
            akcr.a(obj, str);
            arrayList = new ArrayList();
            for (Object next2 : (Iterable) obj) {
                itp itp = (itp) next2;
                Object obj2 = (!itp.g || (!this.a.a.contains(itp.c) && this.a.c.contains(itp.c))) ? 1 : null;
                if (obj2 != null) {
                    arrayList.add(next2);
                }
            }
            return (List) arrayList;
        }
    }

    /* renamed from: jut$b */
    public static final class b<T1, T2, T3, T4, T5, R> implements ajff<T1, T2, T3, T4, T5, R> {
        private /* synthetic */ jut a;

        public b(jut jut) {
            this.a = jut;
        }

        public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            boolean booleanValue = ((Boolean) t5).booleanValue();
            List list = (List) t4;
            boolean booleanValue2 = ((Boolean) t3).booleanValue();
            boolean booleanValue3 = ((Boolean) t2).booleanValue();
            Object obj = (Boolean) t1;
            if (booleanValue) {
                jut jut = this.a;
                akcr.a((Object) list, "viewModels");
                akcr.a(obj, "isAddFriendV11");
                boolean booleanValue4 = obj.booleanValue();
                if (list.isEmpty()) {
                    jut.l.a(Boolean.TRUE);
                } else {
                    jut.l.a(Boolean.FALSE);
                    boolean z = booleanValue4 && jut.n;
                    boolean z2 = z && booleanValue3 && booleanValue2;
                    String string = z ? jut.d.getResources().getString(R.string.all_contacts) : null;
                    Object string2 = jut.d.getResources().getString(R.string.df_quick_add);
                    akcr.a(string2, "context.resources.getString(R.string.df_quick_add)");
                    return znk.a(znk.a((Object) new jrz(string2, jut.k, z, z2, string)), znk.a(list));
                }
            }
            return znk.a;
        }
    }

    /* renamed from: jut$d */
    static final class d extends akcq implements akbl<List<? extends itp>, ajdp<List<? extends zmy>>> {
        d(jut jut) {
            super(1, jut);
        }

        public final String getName() {
            return "toViewModels";
        }

        public final akej getOwner() {
            return akde.a(jut.class);
        }

        public final String getSignature() {
            return "toViewModels(Ljava/util/List;)Lio/reactivex/Observable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            jut jut = (jut) this.receiver;
            Iterable iterable = list;
            Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    ajym.a();
                }
                itp itp = (itp) next;
                arrayList.add(new jvh(itp, list.indexOf(itp), jut.e, jut.f, jut.g, jut.h, jut.i, jrf.a(jut.j, i, list.size()), 0, false, jut.k == jri.HEADER_BLUE_LEFT ? jri.QUICK_ADD_LIST_ITEM : jri.QUICK_ADD_LIST_ITEM_V2, jut.m, 768));
                i = i2;
            }
            Object b = ajdp.b((List) arrayList);
            akcr.a(b, "Observable.just(suggeste…nerDecoration)\n        })");
            return b;
        }
    }

    private jut(Context context, ajcx ajcx, ajdp<znh<itp>> ajdp, ajdp<Boolean> ajdp2, jth jth, ajdp<Boolean> ajdp3, idj idj, String str, iqt iqt, ith ith, zfw zfw, ftl ftl, ajdp<Boolean> ajdp4, ajdp<Boolean> ajdp5, boolean z, zlv zlv, ajwl<Boolean> ajwl, boolean z2, boolean z3, ypo ypo) {
        Context context2 = context;
        ajcx ajcx2 = ajcx;
        ajdp<znh<itp>> ajdp6 = ajdp;
        ajdp<Boolean> ajdp7 = ajdp2;
        jth jth2 = jth;
        ajdp<Boolean> ajdp8 = ajdp3;
        idj idj2 = idj;
        String str2 = str;
        iqt iqt2 = iqt;
        ith ith2 = ith;
        ftl ftl2 = ftl;
        ajdp<Boolean> ajdp9 = ajdp4;
        ajdp<Boolean> ajdp10 = ajdp5;
        zlv zlv2 = zlv;
        ajwl<Boolean> ajwl2 = ajwl;
        akcr.b(context2, "context");
        akcr.b(ajcx2, "initialFeedItemsCompletion");
        akcr.b(ajdp6, "source");
        akcr.b(ajdp7, "shouldShowQuickAddList");
        akcr.b(jth2, "addedMeAndQuickAddSeenLogger");
        akcr.b(ajdp8, "visibleSubject");
        akcr.b(idj2, "uiPage");
        akcr.b(str2, "featureName");
        akcr.b(iqt2, "friendActionSource");
        akcr.b(ith2, "analyticsSource");
        akcr.b(zfw, "schedulers");
        akcr.b(ftl2, "configurationProvider");
        akcr.b(ajdp9, "hasPhoneNumberVerified");
        akcr.b(ajdp10, "hasGivenAccessToContacts");
        akcr.b(zlv2, "headerViewType");
        akcr.b(ajwl2, "quickAddListEmptySubject");
        ypo ypo2 = ypo;
        akcr.b(ypo2, "publicUserStoriesSyncableSection");
        this.d = context2;
        this.p = ajcx2;
        this.e = jth2;
        this.f = idj2;
        this.g = str2;
        this.h = iqt2;
        this.i = ith2;
        this.q = ftl2;
        this.j = z;
        this.k = zlv2;
        this.l = ajwl2;
        this.m = z2;
        this.n = z3;
        this.r = ypo2;
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        a aVar = new a();
        aVar.a = true;
        ajdw a = zfx.a((ajdw) zfw.b(), 1);
        Object d = ajdp6.a(a).d((ajfb) new c(this, aVar));
        Object d2 = ajdp8.a(a).d((ajfb) new e(this, aVar));
        akcr.a(d, "dataSource");
        akcr.a(d2, "visibilitySource");
        ajdp a2 = ajdp.a((ajdt) d, (ajdt) d2, (ajex) new a(this, aVar));
        if (a2 == null) {
            akcr.a();
        }
        Object u = a2.u(new juu(new d(this)));
        d2 = this.q.p(jic.IS_ADD_FRIENDS_V11);
        akcr.a(d2, "configurationProvider.ob…onKey.IS_ADD_FRIENDS_V11)");
        akcr.a(u, "viewModelSource");
        a2 = ajdp.a((ajdt) d2, ajdp9, ajdp10, (ajdt) u, ajdp2, new b(this));
        if (a2 == null) {
            akcr.a();
        }
        this.o = a2;
    }

    public /* synthetic */ jut(Context context, ajcx ajcx, ajdp ajdp, ajdp ajdp2, jth jth, ajdp ajdp3, idj idj, String str, iqt iqt, ith ith, zfw zfw, ftl ftl, ajdp ajdp4, ajdp ajdp5, boolean z, zlv zlv, ajwl ajwl, boolean z2, boolean z3, ypo ypo, int i) {
        ajdp b;
        ajdp ajdp6;
        ajdp ajdp7;
        ajwl ajwl2;
        int i2 = i;
        String str2 = "Observable.just(false)";
        if ((i2 & 4096) != 0) {
            b = ajdp.b(Boolean.FALSE);
            akcr.a((Object) b, str2);
            ajdp6 = b;
        } else {
            ajdp6 = ajdp4;
        }
        if ((i2 & 8192) != 0) {
            b = ajdp.b(Boolean.FALSE);
            akcr.a((Object) b, str2);
            ajdp7 = b;
        } else {
            ajdp7 = ajdp5;
        }
        boolean z4 = (i2 & 16384) != 0 ? false : z;
        zlv zlv2 = (32768 & i2) != 0 ? jri.HEADER_BLUE_LEFT : zlv;
        if ((Imgproc.FLOODFILL_FIXED_RANGE & i2) != 0) {
            ajwl ajwl3 = new ajwl();
            akcr.a((Object) ajwl3, "BehaviorSubject.create()");
            ajwl2 = ajwl3;
        } else {
            ajwl2 = ajwl;
        }
        this(context, ajcx, ajdp, ajdp2, jth, ajdp3, idj, str, iqt, ith, zfw, ftl, ajdp6, ajdp7, z4, zlv2, ajwl2, (Imgproc.FLOODFILL_MASK_ONLY & i2) != 0 ? true : z2, (i2 & 262144) != 0 ? false : z3, ypo);
    }

    public final void a(View view, zmy zmy) {
        this.r.a(view, zmy);
    }

    public final void b(View view, zmy zmy) {
        this.r.b(view, zmy);
    }

    public final ajdp<znh<zmy>> c() {
        Object a = this.p.a((ajdt) this.o);
        akcr.a(a, "initialFeedItemsCompletion.andThen(viewModels)");
        return a;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddFriendEvent(isj isj) {
        akcr.b(isj, "event");
        this.c.add(isj.b);
    }

    public final void onDispose() {
        this.r.dispose();
    }
}
