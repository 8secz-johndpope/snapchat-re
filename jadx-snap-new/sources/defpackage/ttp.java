package defpackage;

import android.view.View;
import com.snapchat.android.R;
import defpackage.abzt.a;
import java.util.Map;

/* renamed from: ttp */
public final class ttp extends tqi {
    ajcx a;
    private final znh<zmy> b = znk.a(new tud());

    /* renamed from: ttp$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ttp a;

        a(ttp ttp) {
            this.a = ttp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (znh) obj;
            akcr.b(obj, "it");
            ajcx ajcx = this.a.a;
            if (ajcx == null) {
                akcr.a("delayedBind");
            }
            return ajcx.a((ajdt) ajdp.b(obj));
        }
    }

    public final ajcx a(a aVar) {
        akcr.b(aVar, "builder");
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
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
        akcr.b(ajdp4, "currentViewModel");
        super.a(ajdp, ajdp2, ajdp3, tqm, ajcx, z, toz, tpl, ajdp4);
        this.a = ajcx;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void a(iip iip) {
        akcr.b(iip, "previewAnalyticsWrapper");
    }

    public final void b(abzt abzt) {
        akcr.b(abzt, "filters");
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> d() {
        Object u = ajdp.b(this.b).u(new a(this));
        akcr.a(u, "Observable.just(myViewMo…en(Observable.just(it)) }");
        return u;
    }

    public final Map<Integer, Integer> e() {
        return ajzl.a(ajxs.a(Integer.valueOf(R.layout.enable_location_filter_view), Integer.valueOf(1)));
    }

    public final void onDispose() {
    }
}
