package com.snap.preview.discard;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.snap.ui.view.ShadowTextView;
import com.snapchat.android.R;
import defpackage.abyi;
import defpackage.achb;
import defpackage.achg;
import defpackage.aipn;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfu;
import defpackage.ajwo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.gcn;
import defpackage.gqr;
import defpackage.gqt;
import defpackage.idd;
import defpackage.k;
import defpackage.toc;
import defpackage.tvd;
import defpackage.tvh;
import defpackage.txt;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.List;

public final class DiscardBackButtonPresenter extends zll<tvh> implements k {
    final ajxe a;
    public boolean b;
    final tvd c;
    final ajwy<gqr> d;
    private final ajxe e = ajxh.a(c.a);
    private final ajxe f;
    private final ajxe g;
    private final ajxe h;
    private ShadowTextView i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class g implements ajev {
        final /* synthetic */ DiscardBackButtonPresenter a;
        final /* synthetic */ Context b;

        /* renamed from: com.snap.preview.discard.DiscardBackButtonPresenter$g$1 */
        static final class AnonymousClass1<T, R> implements ajfc<T, R> {
            private /* synthetic */ g a;

            AnonymousClass1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                List list = (List) obj;
                akcr.b(list, "mediaPackages");
                return ajxs.a(list, this.a.a.c.d());
            }
        }

        /* renamed from: com.snap.preview.discard.DiscardBackButtonPresenter$g$2 */
        static final class AnonymousClass2<T, R> implements ajfc<ajxm<? extends List<? extends abyi>, ? extends gcn>, ajdb> {
            final /* synthetic */ g a;

            /* renamed from: com.snap.preview.discard.DiscardBackButtonPresenter$g$2$1 */
            static final class AnonymousClass1 implements ajev {
                private /* synthetic */ AnonymousClass2 a;

                AnonymousClass1(AnonymousClass2 anonymousClass2) {
                    this.a = anonymousClass2;
                }

                public final void run() {
                    Toast.makeText(this.a.a.b, R.string.preview_save_success, 1).show();
                    this.a.a.a.a().a((achg) toc.a, true, false, null);
                }
            }

            AnonymousClass2(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                Object obj2 = (List) ajxm.a;
                gcn gcn = (gcn) ajxm.b;
                txt txt = (txt) this.a.a.a.b();
                akcr.a(obj2, "mediaPackages");
                return txt.a(obj2, gcn, null, this.a.a.c.j.c, false).a((ajdw) ((zfw) this.a.a.h.b()).l()).b((ajev) new AnonymousClass1(this));
            }
        }

        /* renamed from: com.snap.preview.discard.DiscardBackButtonPresenter$g$3 */
        static final class AnonymousClass3<T> implements ajfb<Throwable> {
            private /* synthetic */ g a;

            AnonymousClass3(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (Throwable) obj;
                Toast.makeText(this.a.b, R.string.preview_save_failed, 1).show();
                gqr gqr = (gqr) this.a.a.d.get();
                gqt gqt = gqt.NORMAL;
                akcr.a(obj, "it");
                gqr.a(gqt, obj, ((idd) this.a.a.g.b()));
            }
        }

        public g(DiscardBackButtonPresenter discardBackButtonPresenter, Context context) {
            this.a = discardBackButtonPresenter;
            this.b = context;
        }

        public final void run() {
            DiscardBackButtonPresenter discardBackButtonPresenter = this.a;
            zln.bindTo$default(discardBackButtonPresenter, discardBackButtonPresenter.c.f().f(new AnonymousClass1(this)).a((ajdw) ((zfw) this.a.h.b()).h()).e((ajfc) new AnonymousClass2(this)).a((ajdw) ((zfw) this.a.h.b()).l()).a((ajfb) new AnonymousClass3(this)).a(ajfu.g).e(), this.a, null, null, 6, null);
        }
    }

    static final class h<T> implements ajfb<Boolean> {
        private /* synthetic */ DiscardBackButtonPresenter a;

        h(DiscardBackButtonPresenter discardBackButtonPresenter) {
            this.a = discardBackButtonPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            DiscardBackButtonPresenter discardBackButtonPresenter = this.a;
            akcr.a(obj, "it");
            discardBackButtonPresenter.a(obj.booleanValue());
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class b extends akcs implements akbk<idd> {
        private /* synthetic */ toc a;

        b(toc toc) {
            this.a = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("DiscardBackButtonPresenter");
        }
    }

    static final class c extends akcs implements akbk<ajwo<Boolean>> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwo();
        }
    }

    static final class d extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ aipn a;

        d(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    static final class e extends akcs implements akbk<txt> {
        private /* synthetic */ aipn a;

        e(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (txt) this.a.get();
        }
    }

    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ DiscardBackButtonPresenter a;
        private /* synthetic */ zgb b;

        f(DiscardBackButtonPresenter discardBackButtonPresenter, zgb zgb) {
            this.a = discardBackButtonPresenter;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(((idd) this.a.g.b()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DiscardBackButtonPresenter.class), "hintTextVisibilitySubject", "getHintTextVisibilitySubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(DiscardBackButtonPresenter.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(DiscardBackButtonPresenter.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(DiscardBackButtonPresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(DiscardBackButtonPresenter.class), "savingAndExportingController", "getSavingAndExportingController()Lcom/snap/preview/save/SavingAndExportingController;")};
        a aVar = new a();
    }

    public DiscardBackButtonPresenter(toc toc, aipn<achb<zjm, zjk>> aipn, aipn<txt> aipn2, zgb zgb, tvd tvd, ajwy<gqr> ajwy) {
        akcr.b(toc, "previewFeature");
        akcr.b(aipn, "navigationHostLazy");
        akcr.b(aipn2, "savingAndExportingControllerLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "exceptionTracker");
        this.c = tvd;
        this.d = ajwy;
        this.f = ajxh.a(new d(aipn));
        this.g = ajxh.a(new b(toc));
        this.h = ajxh.a(new f(this, zgb));
        this.a = ajxh.a(new e(aipn2));
    }

    public final achb<zjm, zjk> a() {
        return (achb) this.f.b();
    }

    /* renamed from: a */
    public final void takeTarget(tvh tvh) {
        ShadowTextView shadowTextView;
        akcr.b(tvh, "target");
        super.takeTarget(tvh);
        tvh = (tvh) getTarget();
        if (tvh != null) {
            Context a = tvh.a();
            if (a != null) {
                Resources resources = a.getResources();
                shadowTextView = new ShadowTextView(a);
                shadowTextView.setPadding(resources.getDimensionPixelSize(R.dimen.snap_preview_discard_button_padding_start), resources.getDimensionPixelSize(R.dimen.memories_preview_done_button_padding_top), 0, 0);
                shadowTextView.setText(R.string.done);
                shadowTextView.setTextColor(-1);
                shadowTextView.setTextSize(2, 18.0f);
                shadowTextView.setupShadowAttributes(Math.min(resources.getDimension(R.dimen.default_gap_1_25x), 25.0f), -16777216);
                shadowTextView.setGravity(17);
                shadowTextView.setVisibility(8);
                LayoutParams layoutParams = new LayoutParams(resources.getDimensionPixelSize(R.dimen.discard_button_hint_text_width), resources.getDimensionPixelSize(R.dimen.camera_button_size));
                layoutParams.leftMargin = resources.getDimensionPixelSize(R.dimen.discard_button_text_margin_start);
                layoutParams.gravity = 16;
                tvh tvh2 = (tvh) getTarget();
                if (tvh2 != null) {
                    FrameLayout b = tvh2.b();
                    if (b != null) {
                        b.addView(shadowTextView, layoutParams);
                    }
                }
                this.i = shadowTextView;
                zln.bindTo$default(this, ((ajwo) this.e.b()).a((ajfb) new h(this), (ajfb) i.a), this, null, null, 6, null);
            }
        }
        shadowTextView = null;
        this.i = shadowTextView;
        zln.bindTo$default(this, ((ajwo) this.e.b()).a((ajfb) new h(this), (ajfb) i.a), this, null, null, 6, null);
    }

    public final void a(boolean z) {
        ShadowTextView shadowTextView;
        int i;
        this.b = z;
        if (z) {
            shadowTextView = this.i;
            if (shadowTextView != null) {
                i = 0;
            }
        }
        shadowTextView = this.i;
        if (shadowTextView != null) {
            i = 8;
        } else {
            return;
        }
        shadowTextView.setVisibility(i);
    }
}
