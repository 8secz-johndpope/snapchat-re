package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.tpl.b.c;
import defpackage.tpl.b.f;
import defpackage.ubb.a;

/* renamed from: ujl */
public final class ujl implements tzm {
    final ugi a;
    private final ajxe b;
    private final ajxe c;
    private final String d = this.a.c;
    private final Activity e;
    private final ftl f;

    /* renamed from: ujl$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        b(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("PostToolActivator"));
        }
    }

    /* renamed from: ujl$a */
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

    /* renamed from: ujl$c */
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

    /* renamed from: ujl$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ ujl a;
        private /* synthetic */ FrameLayout b;

        d(ujl ujl, FrameLayout frameLayout) {
            this.a = ujl;
            this.b = frameLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = this.a.a.g;
            if (num != null) {
                a.a(num.intValue(), (ViewGroup) this.b);
            }
        }
    }

    /* renamed from: ujl$e */
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

    /* renamed from: ujl$f */
    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ ujl a;
        private /* synthetic */ FrameLayout b;
        private /* synthetic */ tzn c;
        private /* synthetic */ ajei d;

        f(ujl ujl, FrameLayout frameLayout, tzn tzn, ajei ajei) {
            this.a = ujl;
            this.b = frameLayout;
            this.c = tzn;
            this.d = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            a.b(this.b, this.a.a, this.c.a(), this.d);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ujl.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ujl.class), "labelModeConfig", "getLabelModeConfig()Lcom/snap/preview/shared/config/PreviewLabelModeConfig;")};
    }

    public ujl(ugi ugi, Activity activity, ftl ftl, ajwy<tyr> ajwy, toc toc, zgb zgb) {
        akcr.b(ugi, "toolIcon");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ftl, "configurationProvider");
        akcr.b(ajwy, "labelModeConfig");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulerProvider");
        this.a = ugi;
        this.e = activity;
        this.f = ftl;
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
        if ((!(f.b instanceof f) && !(f.b instanceof c)) || tpt.d(f)) {
            return null;
        }
        Context baseContext = this.e.getBaseContext();
        akcr.a((Object) baseContext, "context");
        int a = a.a(baseContext, this.a.e);
        FrameLayout frameLayout = new FrameLayout(baseContext);
        View a2 = a.a(baseContext, a, this.a.a);
        abtc a3 = a.a(a2, frameLayout, (tzl) this.a);
        tzn.b().a(frameLayout);
        ajej d = ((tyr) this.c.b()).a().a((ajfl) c.a).a((ajdw) b().l()).d((ajfb) new d(this, frameLayout));
        akcr.a((Object) d, "labelModeConfig.isLabelM…      }\n                }");
        ajvv.a(d, ajei);
        a.a(frameLayout, this.a, tzn.a(), ajei);
        ajej d2 = this.f.b((fth) tum.TOOL_BUTTON_LONG_PRESS_ENABLED).a((ajfl) e.a).b((ajdw) b().f()).a((ajdw) b().l()).d((ajfb) new f(this, frameLayout, tzn, ajei));
        akcr.a((Object) d2, "configurationProvider.ge…osable)\n                }");
        ajvv.a(d2, ajei);
        return new tzj(a2, frameLayout, a3);
    }
}
