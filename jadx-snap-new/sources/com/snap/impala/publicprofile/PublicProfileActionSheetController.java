package com.snap.impala.publicprofile;

import android.support.annotation.Keep;
import android.view.ViewGroup.LayoutParams;
import com.snap.composer.IComposerViewLoader;
import com.snap.composer.api.ui.page.ComposerPageController;
import com.snap.composer.views.ComposerView;
import defpackage.aipn;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.khu;
import defpackage.khx;
import defpackage.khy;

public final class PublicProfileActionSheetController implements ComposerPageController {
    private final ComposerView a;
    @Keep
    private final ajxw preinit = ((ajxw) b.a.invoke());

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<Throwable, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public PublicProfileActionSheetController(khu khu, aipn<IComposerViewLoader> aipn, khy khy) {
        akcr.b(khu, "context");
        String str = "viewLoader";
        akcr.b(aipn, str);
        akcr.b(khy, "viewModel");
        Object obj = aipn.get();
        akcr.a(obj, "viewLoader.get()");
        IComposerViewLoader iComposerViewLoader = (IComposerViewLoader) obj;
        akbl akbl = c.a;
        akcr.b(iComposerViewLoader, str);
        ComposerView khx = new khx(iComposerViewLoader.getContext());
        iComposerViewLoader.inflateViewAsync(khx, khx.a, khx.b, khy, khu, null, akbl);
        this.a = khx;
        getView().setLayoutParams(new LayoutParams(-1, -1));
    }

    public final ComposerView getView() {
        return this.a;
    }
}
