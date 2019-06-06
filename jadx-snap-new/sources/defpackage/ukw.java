package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.ubb.a;

/* renamed from: ukw */
public final class ukw implements tzm {
    final ugi a;
    final toc b;
    private final ajxe c;
    private final ajxe d;
    private final String e = this.a.c;
    private final zgb f;
    private final Activity g;
    private final tvd h;

    /* renamed from: ukw$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ ukw a;
        private /* synthetic */ zgb b;

        b(ukw ukw, zgb zgb) {
            this.a = ukw;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.b.callsite("SoundToolActivator"));
        }
    }

    /* renamed from: ukw$a */
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

    /* renamed from: ukw$c */
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

    /* renamed from: ukw$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ ukw a;
        private /* synthetic */ FrameLayout b;

        d(ukw ukw, FrameLayout frameLayout) {
            this.a = ukw;
            this.b = frameLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = this.a.a.g;
            if (num != null) {
                a.a(num.intValue(), (ViewGroup) this.b);
            }
        }
    }

    /* renamed from: ukw$e */
    static final class e<T> implements ajfb<abbd> {
        private /* synthetic */ ukw a;
        private /* synthetic */ FrameLayout b;
        private /* synthetic */ tzn c;
        private /* synthetic */ ajei d;

        e(ukw ukw, FrameLayout frameLayout, tzn tzn, ajei ajei) {
            this.a = ukw;
            this.b = frameLayout;
            this.c = tzn;
            this.d = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((abbd) obj) != abbd.DISCOVER) {
                a.b(this.b, this.a.a, this.c.a(), this.d);
            }
        }
    }

    /* renamed from: ukw$f */
    static final class f<T> implements ajfb<aesf> {
        private /* synthetic */ FrameLayout a;

        f(FrameLayout frameLayout) {
            this.a = frameLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.setVisibility(abyp.a((aesf) obj) ? 0 : 8);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ukw.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ukw.class), "labelModeConfig", "getLabelModeConfig()Lcom/snap/preview/shared/config/PreviewLabelModeConfig;")};
    }

    public ukw(ugi ugi, zgb zgb, toc toc, Activity activity, tvd tvd, ajwy<tyr> ajwy, zgb zgb2) {
        akcr.b(ugi, "toolIcon");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajwy, "labelModeConfig");
        akcr.b(zgb2, "schedulerProvider");
        this.a = ugi;
        this.f = zgb;
        this.b = toc;
        this.g = activity;
        this.h = tvd;
        this.c = ajxh.a(new b(this, zgb2));
        this.d = ajxh.a(new a(ajwy));
    }

    private final zfw b() {
        return (zfw) this.c.b();
    }

    public final String a() {
        return this.e;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
        tpl f = tzn.f();
        if (!tpt.b(f) && !tpt.d(f)) {
            return null;
        }
        Context baseContext = this.g.getBaseContext();
        akcr.a((Object) baseContext, "context");
        int a = a.a(baseContext, this.a.e);
        FrameLayout frameLayout = new FrameLayout(baseContext);
        View a2 = a.a(baseContext, a, this.a.a);
        abtc a3 = a.a(a2, frameLayout, (tzl) this.a);
        tzn.b().a(frameLayout);
        ajej d = ((tyr) this.d.b()).a().a((ajfl) c.a).a((ajdw) b().l()).d((ajfb) new d(this, frameLayout));
        akcr.a((Object) d, "labelModeConfig.isLabelM…      }\n                }");
        ajvv.a(d, ajei);
        a.a(frameLayout, this.a, tzn.a(), ajei);
        d = this.h.f.b((ajdw) b().f()).a((ajdw) b().l()).f((ajfb) new e(this, frameLayout, tzn, ajei));
        akcr.a((Object) d, "previewDataSource.mediaO…      }\n                }");
        ajvv.a(d, ajei);
        zfw a4 = zgb.a(this.b.callsite("SoundToolActivator"));
        frameLayout.setVisibility(8);
        ajei.a(tzn.h().j(ajfu.a).a((ajdw) a4.l()).f((ajfb) new f(frameLayout)));
        return new tzj(a2, frameLayout, a3);
    }
}
