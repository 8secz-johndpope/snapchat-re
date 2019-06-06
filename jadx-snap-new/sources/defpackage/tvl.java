package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.brightcove.player.event.Event;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.tpl.b;
import defpackage.tpl.b.c;
import defpackage.tpl.b.d;
import defpackage.tpl.b.e;
import defpackage.tpl.b.f;
import defpackage.tvn.a.a;

/* renamed from: tvl */
public final class tvl implements tpw {
    final ajei a = new ajei();
    final ajei b = new ajei();
    final a c;
    private final String d = "DiscardButtonActivator";
    private final ajxe e = ajxh.a(new a(this));
    private ViewGroup f;
    private zfw g;
    private final tpg h;
    private final tpy i;
    private final zgb j;
    private final tpl k;
    private final toc l;
    private final ajdp<Boolean> m;
    private final ajdp<tpd> n;
    private final ViewFinder o;
    private final Activity p;

    /* renamed from: tvl$a */
    static final class a extends akcs implements akbk<tvi> {
        private /* synthetic */ tvl a;

        a(tvl tvl) {
            this.a = tvl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            tvi a = this.a.c.a().a();
            ajvv.a(a.start(), this.a.a);
            return a;
        }
    }

    /* renamed from: tvl$f */
    static final class f<T> implements ajfb<tpd> {
        private /* synthetic */ tvl a;

        f(tvl tvl) {
            this.a = tvl;
        }

        public final /* synthetic */ void accept(Object obj) {
            tpd tpd = (tpd) obj;
            if (tpd != null) {
                ImageButton imageButton;
                int i;
                int i2 = tvm.a[tpd.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        imageButton = (ImageButton) this.a.b().findViewById(R.id.preview_back_discard_button);
                        if (imageButton != null) {
                            i = R.drawable.preview_discard;
                        }
                    }
                }
                imageButton = (ImageButton) this.a.b().findViewById(R.id.preview_back_discard_button);
                if (imageButton != null) {
                    i = R.drawable.preview_back;
                } else {
                    return;
                }
                imageButton.setImageResource(i);
            }
        }
    }

    /* renamed from: tvl$e */
    static final class e<T> implements ajfb<Object> {
        private /* synthetic */ tvl a;

        e(tvl tvl) {
            this.a = tvl;
        }

        public final void accept(Object obj) {
            this.a.b.dispose();
            ((tvi) this.a.e.b()).b();
        }
    }

    /* renamed from: tvl$b */
    static final class b<T> implements ajfb<Object> {
        private /* synthetic */ tvl a;

        b(tvl tvl) {
            this.a = tvl;
        }

        public final void accept(Object obj) {
            this.a.b.dispose();
            ((tvi) this.a.e.b()).b();
        }
    }

    /* renamed from: tvl$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ tvl a;

        c(tvl tvl) {
            this.a = tvl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            tvi a = ((tvi) this.a.e.b());
            akcr.a(obj, "it");
            a.a(obj.booleanValue());
        }
    }

    /* renamed from: tvl$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tvl.class), "discardButtonPresenter", "getDiscardButtonPresenter()Lcom/snap/preview/discard/DiscardButtonPresenter;");
    }

    public tvl(a aVar, tpg tpg, tpy tpy, zgb zgb, tpl tpl, toc toc, ajdp<Boolean> ajdp, ajdp<tpd> ajdp2, ViewFinder viewFinder, Activity activity) {
        akcr.b(aVar, "builder");
        akcr.b(tpg, "previewFragmentStaticConfiguration");
        akcr.b(tpy, "previewToolInflator");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(toc, "previewFeature");
        akcr.b(ajdp, "showDiscardHintObservable");
        akcr.b(ajdp2, "previewControlEventObservable");
        akcr.b(viewFinder, "viewFinder");
        akcr.b(activity, Event.ACTIVITY);
        this.c = aVar;
        this.h = tpg;
        this.i = tpy;
        this.j = zgb;
        this.k = tpl;
        this.l = toc;
        this.m = ajdp;
        this.n = ajdp2;
        this.o = viewFinder;
        this.p = activity;
    }

    public final String a() {
        return this.d;
    }

    public final ViewGroup b() {
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            akcr.a("parentView");
        }
        return viewGroup;
    }

    public final ajej start() {
        ajej d;
        String str;
        StringBuilder stringBuilder;
        IllegalArgumentException illegalArgumentException;
        this.g = zgb.a(this.l.callsite("DiscardButtonActivator"));
        View findViewById = this.o.findViewById(R.id.chrome);
        if (findViewById == null) {
            akcr.a();
        }
        this.f = (ViewGroup) findViewById;
        findViewById = this.i.a(R.layout.preview_discard_button);
        ViewGroup viewGroup = this.f;
        String str2 = "parentView";
        if (viewGroup == null) {
            akcr.a(str2);
        }
        viewGroup.addView(findViewById);
        ajej f = this.n.f((ajfb) new f(this));
        akcr.a((Object) f, "previewControlEventObser…)\n            }\n        }");
        ajvv.a(f, this.a);
        this.a.a((ajej) this.b);
        b bVar = this.k.b;
        String str3 = "null cannot be cast to non-null type android.widget.ImageButton";
        if ((bVar instanceof f) || (bVar instanceof c) || (bVar instanceof d) || (bVar instanceof b.a) || (bVar instanceof b.b)) {
            akcr.b(findViewById, str2);
            findViewById = findViewById.findViewById(R.id.preview_back_discard_button);
            if (findViewById != null) {
                ImageButton imageButton = (ImageButton) findViewById;
                View view = imageButton;
                imageButton.setOnTouchListener(new abtc(view));
                d = cfl.c(view).d().d((ajfb) new e(this));
                str = "RxView.clicks(discardBtn…essed()\n                }";
            } else {
                throw new ajxt(str3);
            }
        }
        if (bVar instanceof e) {
            akcr.b(findViewById, str2);
            Object obj = (FrameLayout) new abur(findViewById, (int) R.id.preview_from_gallery_back_button_stub, (int) R.id.preview_from_gallery_back_button).a();
            View view2 = (View) obj;
            obj.setOnTouchListener(new abtc(view2));
            akcr.a(obj, "discardBackButton");
            obj.setVisibility(0);
            findViewById = findViewById.findViewById(R.id.preview_back_discard_button);
            if (findViewById != null) {
                ((ImageButton) findViewById).setVisibility(8);
                d = cfl.c(view2).d().d((ajfb) new b(this));
                akcr.a((Object) d, "RxView.clicks(discardBac…essed()\n                }");
                ajvv.a(d, this.b);
                d = this.m.a((ajfb) new c(this), (ajfb) d.a);
                str = "showDiscardHintObservabl…Message}\", it)\n        })";
            } else {
                throw new ajxt(str3);
            }
        }
        stringBuilder = new StringBuilder("unexpected PreviewConfig ");
        stringBuilder.append(this.k);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        return this.a;
        akcr.a((Object) d, str);
        ajvv.a(d, this.b);
        stringBuilder = new StringBuilder("unexpected PreviewConfig ");
        stringBuilder.append(this.k);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        return this.a;
    }
}
