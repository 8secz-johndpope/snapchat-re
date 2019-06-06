package defpackage;

import com.google.common.base.Optional;
import defpackage.abzt.a;
import java.util.Map;

/* renamed from: tqi */
public abstract class tqi extends ajed implements zma {
    private ajdp<Boolean> a;

    /* renamed from: tqi$a */
    static final class a<T1, T2, R> implements ajex<znh<zmy>, Boolean, ajxm<? extends znh<zmy>, ? extends Boolean>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            znh znh = (znh) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(znh, "viewModels");
            return ajxs.a(znh, Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: tqi$b */
    static final class b<T> implements ajfl<ajxm<? extends znh<zmy>, ? extends Boolean>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return ((Boolean) ajxm.b).booleanValue();
        }
    }

    /* renamed from: tqi$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            return (znh) ajxm.a;
        }
    }

    public abstract ajcx a(a aVar);

    public ajdp<Optional<zmy>> a(abzt abzt) {
        akcr.b(abzt, "filters");
        Object b = ajdp.b(Optional.absent());
        akcr.a(b, "Observable.just(Optional.absent())");
        return b;
    }

    public abstract void a(int i);

    public void a(ajdp<aesf> ajdp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3, tqm tqm, ajcx ajcx, boolean z, toz toz, tpl tpl, ajdp<zmy> ajdp4) {
        akcr.b(ajdp, "mediaTypeObservable");
        akcr.b(ajdp2, "updateEnabledObservable");
        akcr.b(ajdp3, "previewVisibleObservable");
        akcr.b(tqm, "stackedFiltersController");
        akcr.b(ajcx, "delayedBind");
        akcr.b(toz, "mediaPlayerCapabilities");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp4, "currentAdapterViewModel");
        this.a = ajdp2;
    }

    public abstract void a(iip iip);

    public abstract void b(abzt abzt);

    public final ajdp<znh<zmy>> c() {
        ajdt d = d();
        ajdp ajdp = this.a;
        if (ajdp == null) {
            akcr.a("updateEnabledObservable");
        }
        return ajdp.a(d, (ajdt) ajdp, (ajex) a.a).a((ajfl) b.a).p(c.a);
    }

    public abstract ajdp<znh<zmy>> d();

    public abstract Map<Integer, Integer> e();
}
