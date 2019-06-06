package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import com.snapchat.android.R;
import defpackage.ubb.a;
import java.util.Set;

/* renamed from: udw */
public final class udw implements tzm {
    boolean a;
    boolean b;
    final String c = this.d.c;
    final ugi d;
    private final ajxe e;
    private final ajxe f;
    private final Activity g;

    /* renamed from: udw$f */
    public static final class f extends SimpleOnGestureListener {
        private /* synthetic */ udw a;
        private /* synthetic */ ajfb b;

        f(udw udw, ajfb ajfb) {
            this.a = udw;
            this.b = ajfb;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (this.a.b && !this.a.a) {
                udw udw = this.a;
                udw.a = true;
                this.b.accept(new tzo((tzl) udw.d, true, motionEvent, false, 24));
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (!this.a.a) {
                udw udw = this.a;
                udw.a = true;
                this.b.accept(new tzo((tzl) udw.d, true, motionEvent, false, 24));
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: udw$a */
    static final class a extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: udw$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        b(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("CaptionToolActivator"));
        }
    }

    /* renamed from: udw$c */
    static final class c extends akcs implements akbl<Set<? extends String>, Boolean> {
        private /* synthetic */ udw a;

        c(udw udw) {
            this.a = udw;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "it");
            boolean z = set.isEmpty() || set.contains(this.a.c);
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: udw$d */
    static final class d<T> implements ajfb<MotionEvent> {
        private /* synthetic */ GestureDetector a;

        d(GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.onTouchEvent((MotionEvent) obj);
        }
    }

    /* renamed from: udw$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ udw a;

        e(udw udw) {
            this.a = udw;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            udw udw = this.a;
            akcr.a(obj, "it");
            udw.b = obj.booleanValue();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(udw.class), "configurationProvider", "getConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(udw.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public udw(ugi ugi, Activity activity, ajwy<ftl> ajwy, zgb zgb) {
        akcr.b(ugi, "toolIcon");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajwy, "compositeConfigurationProvider");
        akcr.b(zgb, "schedulersProvider");
        this.d = ugi;
        this.g = activity;
        this.e = ajxh.a(new a(ajwy));
        this.f = ajxh.a(new b(zgb));
    }

    public final String a() {
        return this.c;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
        Context baseContext = this.g.getBaseContext();
        akcr.a((Object) baseContext, "context");
        int a = a.a(baseContext, this.d.e);
        FrameLayout frameLayout = new FrameLayout(baseContext);
        View a2 = a.a(baseContext, a, this.d.a);
        abtc a3 = a.a(a2, frameLayout, (tzl) this.d);
        tzn.c().a(frameLayout);
        ajfb a4 = tzn.a();
        FrameLayout d = tzn.d();
        if (!tzn.e().a() || d == null) {
            a.a(frameLayout, this.d, a4, ajei);
        } else {
            frameLayout.setVisibility(8);
            Object inflate = LayoutInflater.from(baseContext).inflate(R.layout.caption_bar, d, false);
            d.addView(inflate);
            akcr.a(inflate, "captionBarView");
            a.a(inflate, this.d, a4, ajei);
        }
        ajej f = igs.a(tzn.g(), tzn.i(), (akbl) new c(this)).f((ajfb) new d(new GestureDetector(baseContext, new f(this, a4))));
        akcr.a((Object) f, "target.gestureEventObser…nEvent)\n                }");
        ajvv.a(f, ajei);
        f = ((ftl) this.e.b()).b((fth) tum.PREVIEW_UX).b((ajdw) ((zfw) this.f.b()).f()).e((ajfb) new e(this));
        akcr.a((Object) f, "configurationProvider.ge…ed = it\n                }");
        ajvv.a(f, ajei);
        return new tzj(a2, frameLayout, a3);
    }
}
