package defpackage;

import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.UnlockablesModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: hma */
public final class hma implements hmi<hjf> {
    final FeatureType a = FeatureType.DISCOVER_FEED;
    final gwd b;
    private final List<hbj> c = ajyl.a(hbj.PUBLISHER_STORY_CARD);
    private final zfw d;

    /* renamed from: hma$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hma a;
        private /* synthetic */ hjf b;
        private /* synthetic */ idl c;
        private /* synthetic */ ajfb d;

        a(hma hma, hjf hjf, idl idl, ajfb ajfb) {
            this.a = hma;
            this.b = hjf;
            this.c = idl;
            this.d = ajfb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "snaps");
            if (list.isEmpty()) {
                return ajvo.a(ajsn.a);
            }
            gwl gwl = (gwl) ajyu.f(list);
            return ajdx.b((Object) new gnt(String.valueOf(gwl.a), gxm.a(String.valueOf(gwl.a), this.a.a, gxu.PUBLISHER), this.c, gnr.SNAP, 1.0f, this.d));
        }
    }

    /* renamed from: hma$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hma a;
        private /* synthetic */ hjf b;
        private /* synthetic */ idl c;
        private /* synthetic */ float d;
        private /* synthetic */ ajfb e;

        b(hma hma, hjf hjf, idl idl, float f, ajfb ajfb) {
            this.a = hma;
            this.b = hjf;
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
            Iterable<gwl> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (gwl gwl : iterable) {
                arrayList.add(new gnt(String.valueOf(gwl.a), gxm.a(String.valueOf(gwl.a), this.a.a, gxu.PUBLISHER), this.c, gnr.SNAP, this.d, this.e));
            }
            return ajdx.b((List) arrayList);
        }
    }

    /* renamed from: hma$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hma a;
        private /* synthetic */ hjf b;
        private /* synthetic */ int c;

        c(hma hma, hjf hjf, int i) {
            this.a = hma;
            this.b = hjf;
            this.c = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "storyRowIds");
            return list.isEmpty() ? ajdx.b((Object) ajyw.a) : this.a.b.a(((gwu) ajyu.f(list)).b, this.a.a, this.c).d((Object) ajyw.a);
        }
    }

    /* renamed from: hma$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ hma a;

        d(hma hma) {
            this.a = hma;
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
                if (((gwl) next).b != null) {
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

    public hma(gwd gwd, zfw zfw) {
        akcr.b(gwd, "publisherStorySnapMediaRepository");
        akcr.b(zfw, "schedulers");
        this.b = gwd;
        this.d = zfw;
    }

    private ajdx<List<gwl>> a(hjf hjf, int i) {
        akcr.b(hjf, UnlockablesModel.DATA);
        Object f = this.b.a(ajyl.a(hjf.e()), this.a).a((ajfc) new c(this, hjf, i)).f(new d(this));
        akcr.a(f, "publisherStorySnapMediaR… getSnapsToPrefetch(it) }");
        return f;
    }

    public final /* synthetic */ ajdx a(Object obj, int i, float f, idl idl, ajfb ajfb) {
        hjf hjf = (hjf) obj;
        akcr.b(hjf, UnlockablesModel.DATA);
        akcr.b(idl, "uiPage");
        obj = a(hjf, i).a((ajdw) this.d.b()).a((ajfc) new b(this, hjf, idl, f, ajfb));
        akcr.a(obj, "getPrefetchSnapsFromData…  }\n                    }");
        return obj;
    }

    public final /* synthetic */ ajdx a(Object obj, idl idl, ajfb ajfb) {
        hjf hjf = (hjf) obj;
        akcr.b(hjf, UnlockablesModel.DATA);
        akcr.b(idl, "uiPage");
        akcr.b(ajfb, "prefetchStateObserver");
        obj = a(hjf, 1).a((ajdw) this.d.b()).a((ajfc) new a(this, hjf, idl, ajfb));
        akcr.a(obj, "getPrefetchSnapsFromData…  }\n                    }");
        return obj;
    }

    public final List<hbj> a() {
        return this.c;
    }
}
