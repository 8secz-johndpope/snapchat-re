package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.List;

/* renamed from: ilc */
public abstract class ilc extends zly<tqj, ilj> {
    private List<? extends ilf> a;
    private ilg b;

    /* Access modifiers changed, original: protected */
    /* renamed from: a */
    public void onBind(ilj ilj, ilj ilj2) {
        akcr.b(ilj, MapboxEvent.KEY_MODEL);
        ilg ilg = this.b;
        if (ilg == null) {
            akcr.a("geofilterViewLayerGenerator");
        }
        akcr.b(ilj, "geoFilterPageViewModel");
        ilf[] ilfArr = new ilf[2];
        ilh ilh = null;
        ilfArr[0] = ilj.e != null ? new ile(ilg.a) : null;
        if (ilj.c.p() != null) {
            ilh = new ilh(ilg.a);
        }
        ilfArr[1] = ilh;
        this.a = ajym.e(ilfArr);
        List<ilf> list = this.a;
        if (list == null) {
            akcr.a("geofilterViewLayers");
        }
        for (ilf a : list) {
            a.a(getItemView(), ilj);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(tqj tqj, View view) {
        akcr.b(tqj, "bindingContext");
        akcr.b(view, "itemView");
        this.b = new ilg(tqj);
    }

    public boolean onFailedToRecycleView() {
        return true;
    }

    public void onRecycle() {
        super.onRecycle();
        List<ilf> list = this.a;
        if (list == null) {
            akcr.a("geofilterViewLayers");
        }
        for (ilf a : list) {
            a.a();
        }
    }
}
