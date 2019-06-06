package defpackage;

import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.mhs.b;
import defpackage.mwe.a;
import java.util.Collection;
import java.util.List;

/* renamed from: lnt */
public final class lnt implements lnx {
    private final mwe a;

    /* renamed from: lnt$a */
    static final class a<T> implements ajfl<List<? extends mux>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return !((Collection) list).isEmpty();
        }
    }

    /* renamed from: lnt$b */
    static final class b<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ defpackage.mhs.b a;

        b(defpackage.mhs.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            obj = ((mux) list.get(0)).a(this.a);
            if (obj != null) {
                ajdj b = ajdj.b(obj);
                if (b != null) {
                    return b;
                }
            }
            return ajvo.a(ajlu.a);
        }
    }

    public lnt(mwe mwe) {
        akcr.b(mwe, "lensRepository");
        this.a = mwe;
    }

    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        mhs mhs = (mhs) obj3;
        akcr.b(bVar, "assetId");
        akcr.b(bVar2, DiscoverStorySnapModel.LENSID);
        akcr.b(mhs, "avatarId");
        obj = this.a.a(new a.b(bVar2)).b((ajfl) a.a).b().a((ajfc) new b(bVar));
        akcr.a(obj, "lensRepository.query(Len…y()\n                    }");
        return obj;
    }
}
