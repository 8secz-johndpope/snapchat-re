package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.brightcove.player.event.Event;
import com.snapchat.android.R;
import defpackage.tpl.b.b;
import defpackage.tpl.b.e;
import defpackage.ubb.a;

/* renamed from: ujw */
public final class ujw implements tzm {
    final ugi a;
    private final ajxe b;
    private final ajxe c;
    private final String d = this.a.c;
    private final Activity e;
    private final ftl f;
    private final tvd g;

    /* renamed from: ujw$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        b(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("SaveToolActivator"));
        }
    }

    /* renamed from: ujw$a */
    static final class a extends akcs implements akbk<tyr> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tyr) this.a.get();
        }
    }

    /* renamed from: ujw$c */
    static final class c<T> implements ajfl<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: ujw$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ ujw a;
        private /* synthetic */ FrameLayout b;

        d(ujw ujw, FrameLayout frameLayout) {
            this.a = ujw;
            this.b = frameLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = this.a.a.g;
            if (num != null) {
                a.a(num.intValue(), (ViewGroup) this.b);
            }
        }
    }

    /* renamed from: ujw$e */
    static final class e<T> implements ajfl<Boolean> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: ujw$f */
    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ ujw a;
        private /* synthetic */ FrameLayout b;
        private /* synthetic */ tzn c;
        private /* synthetic */ ajei d;

        f(ujw ujw, FrameLayout frameLayout, tzn tzn, ajei ajei) {
            this.a = ujw;
            this.b = frameLayout;
            this.c = tzn;
            this.d = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            a.b(this.b, this.a.a, this.c.a(), this.d);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ujw.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ujw.class), "labelModeConfig", "getLabelModeConfig()Lcom/snap/preview/shared/config/PreviewLabelModeConfig;")};
    }

    public ujw(ugi ugi, Activity activity, ftl ftl, tvd tvd, ajwy<tyr> ajwy, toc toc, zgb zgb) {
        akcr.b(ugi, "toolIcon");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ftl, "configurationProvider");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "labelModeConfig");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulerProvider");
        this.a = ugi;
        this.e = activity;
        this.f = ftl;
        this.g = tvd;
        this.b = ajxh.a(new b(zgb, toc));
        this.c = ajxh.a(new a(ajwy));
    }

    private final zfw b() {
        return (zfw) this.b.b();
    }

    public final String a() {
        return this.d;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
        tpl f = tzn.f();
        if (f.b instanceof b) {
            return null;
        }
        ImageView imageView;
        Context baseContext = this.e.getBaseContext();
        FrameLayout frameLayout = new FrameLayout(baseContext);
        String str = "context";
        if (f.b instanceof e) {
            akcr.a((Object) baseContext, str);
            akcr.b(baseContext, str);
            imageView = new ImageView(baseContext, null);
            akcr.b(baseContext, str);
            int dimensionPixelSize = baseContext.getResources().getDimensionPixelSize(R.dimen.camera_button_size);
            akcr.b(baseContext, str);
            int dimensionPixelOffset = baseContext.getResources().getDimensionPixelOffset(R.dimen.camera_button_padding);
            LayoutParams layoutParams = new LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 49;
            imageView.setLayoutParams(layoutParams);
            imageView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            imageView.setImageResource(R.drawable.gallery_snap_preview_share_button);
            imageView.setVisibility(0);
        } else {
            akcr.a((Object) baseContext, str);
            akcr.b(baseContext, str);
            imageView = a.a(baseContext, a.a(baseContext, this.a.e), this.a.a);
        }
        View view = imageView;
        abtc a = a.a(view, frameLayout, (tzl) this.a);
        tzn.b().a(frameLayout);
        ajej d = ((tyr) this.c.b()).a().a((ajfl) c.a).a((ajdw) b().l()).d((ajfb) new d(this, frameLayout));
        akcr.a((Object) d, "labelModeConfig.isLabelM…      }\n                }");
        ajvv.a(d, ajei);
        a.a(frameLayout, this.a, tzn.a(), ajei);
        ajej d2 = this.f.b((fth) tum.TOOL_BUTTON_LONG_PRESS_ENABLED).a((ajfl) e.a).b((ajdw) b().f()).a((ajdw) b().l()).d((ajfb) new f(this, frameLayout, tzn, ajei));
        akcr.a((Object) d2, "configurationProvider.ge…osable)\n                }");
        ajvv.a(d2, ajei);
        return new tzj(view, frameLayout, a);
    }
}
