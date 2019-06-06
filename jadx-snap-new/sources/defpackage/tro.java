package defpackage;

import android.os.Bundle;
import com.snap.preview.api.PreviewFragment;
import com.snap.preview.app.bindings.PreviewFragmentImpl;
import com.snap.ui.deck.MainPageFragment;
import defpackage.zjr.a;

/* renamed from: tro */
public final class tro implements tpe {
    private final aipn<icz> a;
    private final ihh b;
    private final tph c;

    public tro(aipn<icz> aipn, ihh ihh, tph tph) {
        akcr.b(aipn, "pageLoadMetricReporter");
        akcr.b(ihh, "clock");
        akcr.b(tph, "previewPagePreloader");
        this.a = aipn;
        this.b = ihh;
        this.c = tph;
    }

    public final PreviewFragment a(tpl tpl) {
        akcr.b(tpl, "previewStartUpConfig");
        zjr a = a.a(toc.a.d, this.a, this.b, null);
        MainPageFragment a2 = this.c.a();
        if (a2 == null) {
            a2 = new PreviewFragmentImpl();
        }
        a2.U = a;
        Bundle bundle = new Bundle();
        tpl.a.a(bundle);
        tpl.b.a(bundle);
        a2.setArguments(bundle);
        return a2;
    }
}
