package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.tpl.b.b;
import defpackage.ubb.a;

/* renamed from: umg */
public final class umg implements tzm {
    private final String a = this.b.c;
    private final ugi b;
    private final ftl c;
    private final zgb d;
    private final toc e;
    private final Activity f;

    /* renamed from: umg$b */
    static final class b<T> implements ajfb<Integer> {
        private /* synthetic */ umy a;

        b(umy umy) {
            this.a = umy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            if (obj != null && obj.intValue() == 0) {
                this.a.a();
                return;
            }
            umy umy = this.a;
            akcr.a(obj, "it");
            umy.a(obj.intValue());
        }
    }

    /* renamed from: umg$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ umy a;

        c(umy umy) {
            this.a = umy;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    /* renamed from: umg$a */
    static final class a<T> implements ajfb<aesf> {
        private /* synthetic */ FrameLayout a;

        a(FrameLayout frameLayout) {
            this.a = frameLayout;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.setVisibility(abyp.b((aesf) obj) ? 0 : 8);
        }
    }

    public umg(ugi ugi, ftl ftl, zgb zgb, toc toc, Activity activity) {
        akcr.b(ugi, "toolIcon");
        akcr.b(ftl, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(activity, Event.ACTIVITY);
        this.b = ugi;
        this.c = ftl;
        this.d = zgb;
        this.e = toc;
        this.f = activity;
    }

    public final String a() {
        return this.a;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
        tpl f = tzn.f();
        Object obj = (tpt.c(f) || tpt.d(f)) ? null : 1;
        boolean z = f.b instanceof b;
        boolean a = f.a.a();
        if (obj != null || z || a) {
            return null;
        }
        ajej f2;
        Context baseContext = this.f.getBaseContext();
        zfw a2 = zgb.a(this.e.callsite("ImageTimerToolActivator"));
        FrameLayout frameLayout = new FrameLayout(baseContext);
        umy umy = new umy(baseContext, a2.h());
        View view = umy;
        abtc a3 = a.a(view, frameLayout, (tzl) this.b);
        tzn.c().a(frameLayout);
        a.a(frameLayout, this.b, tzn.a(), ajei);
        if (tpt.d(f)) {
            umy.a(3);
            frameLayout.setVisibility(8);
            f2 = tzn.h().j(ajfu.a).a((ajdw) a2.l()).f((ajfb) new a(frameLayout));
        } else {
            f2 = this.c.s(tum.IMAGE_TIMER_DEFAULT_VALUE).d(Integer.valueOf(0)).b((ajdw) a2.h()).a((ajdw) a2.l()).a((ajfb) new b(umy), (ajfb) new c(umy));
        }
        ajei.a(f2);
        return new tzj(view, frameLayout, a3);
    }
}
