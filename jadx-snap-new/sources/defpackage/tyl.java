package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.snap.preview.shared.ui.SendToBottomPanelView;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.dnk.c;
import defpackage.tpl.b;
import defpackage.tpl.b.d;
import defpackage.tpl.b.e;
import defpackage.tpl.b.f;
import defpackage.tym.a.a;

/* renamed from: tyl */
public final class tyl implements tpw {
    final ajei a;
    final ajei b;
    final a c;
    final ajwy<twd> d;
    final ajwy<ypp> e;
    private final String f = "SendToActivator";
    private final ajxe g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private ViewGroup l;
    private zfw m;
    private final tpy n;
    private final tpg o;
    private final zgb p;
    private final tpl q;
    private final toc r;
    private final ajdp<Boolean> s;
    private final ajdp<tpk> t;
    private final ViewFinder u;

    /* renamed from: tyl$n */
    static final class n extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ ajwy a;

        n(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.get();
        }
    }

    /* renamed from: tyl$q */
    static final class q extends akcs implements akbk<tym.a> {
        private /* synthetic */ tyl a;

        q(tyl tyl) {
            this.a = tyl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.a();
        }
    }

    /* renamed from: tyl$p */
    static final class p extends akcs implements akbk<tyj> {
        private /* synthetic */ tyl a;

        p(tyl tyl) {
            this.a = tyl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            tyj a = ((tym.a) this.a.h.b()).a();
            ajvv.a(a.start(), this.a.a);
            return a;
        }
    }

    /* renamed from: tyl$o */
    static final class o extends akcs implements akbk<tyg> {
        private /* synthetic */ tyl a;

        o(tyl tyl) {
            this.a = tyl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            tyg b = ((tym.a) this.a.h.b()).b();
            ajvv.a(b.start(), this.a.a);
            return b;
        }
    }

    /* renamed from: tyl$j */
    static final class j extends akcs implements akbk<tyr> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyr) this.a.get();
        }
    }

    /* renamed from: tyl$a */
    static final class a<T> implements ajfb<Boolean> {
        private /* synthetic */ tyl a;

        a(tyl tyl) {
            this.a = tyl;
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            this.a.b.dispose();
            ((tyg) this.a.j.b()).a(bool.booleanValue() ^ 1);
        }
    }

    /* renamed from: tyl$b */
    static final class b<T> implements ajfl<Boolean> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: tyl$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ TextView a;

        c(TextView textView) {
            this.a = textView;
        }

        public final /* synthetic */ void accept(Object obj) {
            TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: tyl$d */
    static final class d<T> implements ajfb<Object> {
        private /* synthetic */ tyl a;

        d(tyl tyl) {
            this.a = tyl;
        }

        public final void accept(Object obj) {
            twd.a((twd) this.a.d.get(), twb.ENTER_SEND_TO_PAGE_GESTURE, null, 6);
            this.a.b.dispose();
            ((tyg) this.a.j.b()).a();
        }
    }

    /* renamed from: tyl$e */
    static final class e implements OnClickListener {
        private /* synthetic */ SendToBottomPanelView a;
        private /* synthetic */ tyl b;
        private /* synthetic */ OnClickListener c;

        e(SendToBottomPanelView sendToBottomPanelView, tyl tyl, OnClickListener onClickListener) {
            this.a = sendToBottomPanelView;
            this.b = tyl;
            this.c = onClickListener;
        }

        public final void onClick(View view) {
            tyl tyl = this.b;
            Object obj = this.a;
            akcr.a(obj, "this");
            tyl.a(tyl, obj, false);
        }
    }

    /* renamed from: tyl$i */
    static final class i implements OnClickListener {
        private /* synthetic */ tyl a;
        private /* synthetic */ SendToBottomPanelView b;

        i(tyl tyl, SendToBottomPanelView sendToBottomPanelView) {
            this.a = tyl;
            this.b = sendToBottomPanelView;
        }

        public final void onClick(View view) {
            tyl tyl = this.a;
            Object obj = this.b;
            akcr.a(obj, "bottomPanelView");
            tyl.a(tyl, obj, true);
        }
    }

    /* renamed from: tyl$f */
    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ SendToBottomPanelView a;
        private /* synthetic */ OnClickListener b;

        f(SendToBottomPanelView sendToBottomPanelView, OnClickListener onClickListener) {
            this.a = sendToBottomPanelView;
            this.b = onClickListener;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            SendToBottomPanelView sendToBottomPanelView = this.a;
            akcr.a(obj, "showLabel");
            if (obj.booleanValue()) {
                ((ViewStub) sendToBottomPanelView.findViewById(R.id.send_to_bottom_panel_send_button_label_mode)).setLayoutResource(R.layout.sent_to_button_label_mode_view);
                abur abur = new abur((View) sendToBottomPanelView, (int) R.id.send_to_bottom_panel_send_button_label_mode, (int) R.id.sent_to_button_label_mode_view);
                abur.a().setOnClickListener(this.b);
                sendToBottomPanelView.a(abur);
            }
        }
    }

    /* renamed from: tyl$g */
    static final class g<T> implements ajfb<tpk> {
        private /* synthetic */ tyl a;
        private /* synthetic */ SendToBottomPanelView b;

        g(tyl tyl, SendToBottomPanelView sendToBottomPanelView) {
            this.a = tyl;
            this.b = sendToBottomPanelView;
        }

        public final /* synthetic */ void accept(Object obj) {
            tyl tyl;
            tpk tpk = (tpk) obj;
            if (tpk.h) {
                tyl = this.a;
                ajvv.a(((ypp) tyl.e.get()).a(toc.d, new l(tyl)), tyl.a);
            }
            if (tpk.i) {
                tyl = this.a;
                ajvv.a(((ypp) tyl.e.get()).b(toc.d, new m(tyl)), tyl.a);
            }
            tyl = this.a;
            for (String a : tpk.c) {
                ajvv.a(((ypp) tyl.e.get()).a(a, toc.d, new k(tyl)), tyl.a);
            }
            this.b.a(ajyu.a((Iterable) tpk.a, (CharSequence) ppy.d, null, null, 0, null, null, 62));
        }
    }

    /* renamed from: tyl$h */
    static final class h<T> implements ajfb<Boolean> {
        private /* synthetic */ tyl a;

        h(tyl tyl) {
            this.a = tyl;
        }

        public final /* synthetic */ void accept(Object obj) {
            int booleanValue = ((Boolean) obj).booleanValue() ^ 1;
            SendToBottomPanelView sendToBottomPanelView = this.a.b().b;
            if (sendToBottomPanelView != null) {
                sendToBottomPanelView.setVisibility(booleanValue != 0 ? 0 : 8);
            }
        }
    }

    /* renamed from: tyl$k */
    static final class k extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ tyl a;

        k(tyl tyl) {
            this.a = tyl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((achb) this.a.g.b()).a((achg) toc.a, true, false, (acih) c.a);
            return ajxw.a;
        }
    }

    /* renamed from: tyl$l */
    static final class l extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ tyl a;

        l(tyl tyl) {
            this.a = tyl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((achb) this.a.g.b()).a((achg) toc.a, true, false, (acih) c.a);
            return ajxw.a;
        }
    }

    /* renamed from: tyl$m */
    static final class m extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ tyl a;

        m(tyl tyl) {
            this.a = tyl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((achb) this.a.g.b()).a((achg) toc.a, true, false, (acih) c.a);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tyl.class), "navigationHost", "getNavigationHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(tyl.class), "sendToComponent", "getSendToComponent()Lcom/snap/preview/sendto/activation/SendToDagger$SendToComponent;"), new akdc(akde.a(tyl.class), "sendToBottomPanelPresenter", "getSendToBottomPanelPresenter()Lcom/snap/preview/sending/ui/SendToBottomPanelPresenter;"), new akdc(akde.a(tyl.class), "sendButtonPresenter", "getSendButtonPresenter()Lcom/snap/preview/sending/ui/SendButtonPresenter;"), new akdc(akde.a(tyl.class), "labelModeConfig", "getLabelModeConfig()Lcom/snap/preview/shared/config/PreviewLabelModeConfig;")};
    }

    public tyl(a aVar, tpy tpy, tpg tpg, zgb zgb, tpl tpl, toc toc, ajdp<Boolean> ajdp, ajdp<tpk> ajdp2, ViewFinder viewFinder, ajwy<twd> ajwy, ajwy<tyr> ajwy2, ajwy<achb<zjm, zjk>> ajwy3, ajwy<ypp> ajwy4) {
        akcr.b(aVar, "builder");
        akcr.b(tpy, "previewToolInflator");
        akcr.b(tpg, "previewFragmentStaticConfiguration");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(toc, "previewFeature");
        akcr.b(ajdp, "hideSendButtonEventObservable");
        akcr.b(ajdp2, "sendToDataObservable");
        akcr.b(viewFinder, "viewFinder");
        akcr.b(ajwy, "previewMetricsPluginProvider");
        akcr.b(ajwy2, "labelModeConfig");
        akcr.b(ajwy3, "navigationHost");
        akcr.b(ajwy4, "storiesPrivacyDialogLauncher");
        this.c = aVar;
        this.n = tpy;
        this.o = tpg;
        this.p = zgb;
        this.q = tpl;
        this.r = toc;
        this.s = ajdp;
        this.t = ajdp2;
        this.u = viewFinder;
        this.d = ajwy;
        this.e = ajwy4;
        this.g = ajxh.a(new n(ajwy3));
        this.a = new ajei();
        this.b = new ajei();
        this.h = ajxh.a(new q(this));
        this.i = ajxh.a(new p(this));
        this.j = ajxh.a(new o(this));
        this.k = ajxh.a(new j(ajwy2));
    }

    public static final /* synthetic */ void a(tyl tyl, SendToBottomPanelView sendToBottomPanelView, boolean z) {
        if (!(sendToBottomPanelView.a() && z)) {
            twd.a((twd) tyl.d.get(), twb.ENTER_SEND_TO_PAGE_GESTURE, null, 6);
        }
        sendToBottomPanelView.a(null);
        sendToBottomPanelView.setOnClickListener(null);
        tyl.b().a(z);
    }

    private final tyr c() {
        return (tyr) this.k.b();
    }

    public final String a() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final tyj b() {
        return (tyj) this.i.b();
    }

    public final ajej start() {
        this.m = zgb.a(this.r.callsite("SendToActivator"));
        View findViewById = this.u.findViewById(R.id.chrome);
        if (findViewById == null) {
            akcr.a();
        }
        this.l = (ViewGroup) findViewById;
        findViewById = this.n.a(R.layout.preview_send_to);
        if (findViewById != null) {
            ajej d;
            ajei ajei;
            StringBuilder stringBuilder;
            IllegalArgumentException illegalArgumentException;
            FrameLayout frameLayout = (FrameLayout) findViewById;
            ViewGroup viewGroup = this.l;
            if (viewGroup == null) {
                akcr.a("parentView");
            }
            View view = frameLayout;
            viewGroup.addView(view);
            this.a.a((ajej) this.b);
            b bVar = this.q.b;
            String str = "schedulers";
            zfw zfw;
            if ((bVar instanceof f) || (bVar instanceof b.c) || (bVar instanceof e) || (bVar instanceof b.b)) {
                ajxm ajxm;
                akcr.b(frameLayout, "sendToView");
                View findViewById2 = frameLayout.findViewById(R.id.send_btn_layout);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                    ajxm = new ajxm(findViewById2.findViewById(R.id.send_btn), findViewById2.findViewById(R.id.send_btn_hint_label));
                } else {
                    ajxm = new ajxm(frameLayout.findViewById(R.id.send_btn), null);
                }
                ImageButton imageButton = (ImageButton) ajxm.a;
                TextView textView = (TextView) ajxm.b;
                ajej d2 = this.s.d().d((ajfb) new a(this));
                akcr.a((Object) d2, "hideSendButtonEventObser…e = !it\n                }");
                ajvv.a(d2, this.b);
                ajdj a = c().a().a((ajfl) b.a);
                zfw = this.m;
                if (zfw == null) {
                    akcr.a(str);
                }
                d = a.a((ajdw) zfw.l()).d((ajfb) new c(textView));
                akcr.a((Object) d, "labelModeConfig.isLabelM…VISIBLE\n                }");
                ajvv.a(d, this.b);
                view = imageButton;
                imageButton.setOnTouchListener(new abtc(view));
                d = cfl.c(view).d().d((ajfb) new d(this));
                akcr.a((Object) d, "RxView.clicks(sendButton…Click()\n                }");
                ajei = this.b;
            } else {
                if ((bVar instanceof b.a) || (bVar instanceof d)) {
                    akcr.b(view, "view");
                    Object obj = (SendToBottomPanelView) view.findViewById(R.id.bottom_panel);
                    akcr.a(obj, "it");
                    obj.setVisibility(0);
                    OnClickListener iVar = new i(this, obj);
                    obj.c();
                    obj.b();
                    obj.a(iVar);
                    obj.setOnClickListener(new e(obj, this, iVar));
                    ajdx a2 = c().a();
                    zfw = this.m;
                    if (zfw == null) {
                        akcr.a(str);
                    }
                    ajej e = a2.a((ajdw) zfw.l()).e((ajfb) new f(obj, iVar));
                    akcr.a((Object) e, "labelModeConfig.isLabelM…      }\n                }");
                    ajvv.a(e, this.a);
                    ajdp ajdp = this.t;
                    zfw zfw2 = this.m;
                    if (zfw2 == null) {
                        akcr.a(str);
                    }
                    d = ajdp.a((ajdw) zfw2.l()).f((ajfb) new g(this, obj));
                    akcr.a((Object) d, "sendToDataObservable\n   …(\", \"))\n                }");
                    ajvv.a(d, this.a);
                    d = this.s.f((ajfb) new h(this));
                    akcr.a((Object) d, "hideSendButtonEventObser…Visibility(!it)\n        }");
                    ajei = this.a;
                }
                stringBuilder = new StringBuilder("unexpected PreviewConfig ");
                stringBuilder.append(this.q);
                illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
                return this.a;
            }
            ajvv.a(d, ajei);
            stringBuilder = new StringBuilder("unexpected PreviewConfig ");
            stringBuilder.append(this.q);
            illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
            return this.a;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
