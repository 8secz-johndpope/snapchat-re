package defpackage;

import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.gxc.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: hmb */
public final class hmb implements hmi<hjg> {
    final FeatureType a = FeatureType.DISCOVER_FEED;
    final gwb b;
    private final List<hbj> c = ajym.b((Object[]) new hbj[]{hbj.OUR_STORY_CARD, hbj.PUBLIC_USER_STORY_CARD});
    private final zfw d;

    /* renamed from: hmb$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hmb a;
        private /* synthetic */ hjg b;
        private /* synthetic */ idl c;
        private /* synthetic */ ajfb d;

        a(hmb hmb, hjg hjg, idl idl, ajfb ajfb) {
            this.a = hmb;
            this.b = hjg;
            this.c = idl;
            this.d = ajfb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "snaps");
            if (list.isEmpty()) {
                return ajvo.a(ajsn.a);
            }
            gwk gwk = (gwk) ajyu.f(list);
            return ajdx.b((Object) new gnt(String.valueOf(gwk.a), hmb.a(this.a, gwk), this.c, gnr.SNAP, 1.0f, this.d));
        }
    }

    /* renamed from: hmb$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hmb a;
        private /* synthetic */ hjg b;
        private /* synthetic */ idl c;
        private /* synthetic */ float d;
        private /* synthetic */ ajfb e;

        b(hmb hmb, hjg hjg, idl idl, float f, ajfb ajfb) {
            this.a = hmb;
            this.b = hjg;
            this.c = idl;
            this.d = f;
            this.e = ajfb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "snaps");
            if (list.isEmpty()) {
                return ajdx.b((Object) ajyw.a);
            }
            Iterable<gwk> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (gwk gwk : iterable) {
                arrayList.add(new gnt(String.valueOf(gwk.a), hmb.a(this.a, gwk), this.c, gnr.SNAP, this.d, this.e));
            }
            return ajdx.b((List) arrayList);
        }
    }

    /* renamed from: hmb$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hmb a;
        private /* synthetic */ hjg b;
        private /* synthetic */ int c;

        c(hmb hmb, hjg hjg, int i) {
            this.a = hmb;
            this.b = hjg;
            this.c = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "storyRowIds");
            if (list.isEmpty()) {
                return ajdx.b((Object) ajyw.a);
            }
            gwb gwb = this.a.b;
            long j = ((gwu) ajyu.f(list)).b;
            FeatureType featureType = this.a.a;
            obj = this.b.d();
            akcr.a(obj, "data.cardType()");
            return gwb.a(j, featureType, a.a(obj), this.c).d((Object) ajyw.a);
        }
    }

    /* renamed from: hmb$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ hmb a;

        d(hmb hmb) {
            this.a = hmb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            Collection arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                int i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((gwk) next).b != null) {
                    i = 0;
                }
                if (i != 0) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            return (((Collection) list2).isEmpty() ^ 1) != 0 ? list2 : list;
        }
    }

    public hmb(gwb gwb, zfw zfw) {
        akcr.b(gwb, "dynamicStorySnapMediaRepository");
        akcr.b(zfw, "schedulers");
        this.b = gwb;
        this.d = zfw;
    }

    private ajdx<List<gwk>> a(hjg hjg, int i) {
        akcr.b(hjg, UnlockablesModel.DATA);
        Object f = this.b.a(ajyl.a(hjg.e()), this.a).a((ajfc) new c(this, hjg, i)).f(new d(this));
        akcr.a(f, "dynamicStorySnapMediaRep… getSnapsToPrefetch(it) }");
        return f;
    }

    public final /* synthetic */ ajdx a(Object obj, int i, float f, idl idl, ajfb ajfb) {
        hjg hjg = (hjg) obj;
        akcr.b(hjg, UnlockablesModel.DATA);
        akcr.b(idl, "uiPage");
        obj = a(hjg, i).a((ajdw) this.d.b()).a((ajfc) new b(this, hjg, idl, f, ajfb));
        akcr.a(obj, "getPrefetchSnapsFromData…  }\n                    }");
        return obj;
    }

    public final /* synthetic */ ajdx a(Object obj, idl idl, ajfb ajfb) {
        hjg hjg = (hjg) obj;
        akcr.b(hjg, UnlockablesModel.DATA);
        akcr.b(idl, "uiPage");
        akcr.b(ajfb, "prefetchStateObserver");
        obj = a(hjg, 1).a((ajdw) this.d.b()).a((ajfc) new a(this, hjg, idl, ajfb));
        akcr.a(obj, "getPrefetchSnapsFromData… }\n\n                    }");
        return obj;
    }

    public final List<hbj> a() {
        return this.c;
    }
}
