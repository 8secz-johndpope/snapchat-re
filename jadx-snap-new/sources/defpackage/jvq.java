package defpackage;

import android.app.Activity;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snapchat.android.R;
import defpackage.ahcb.c;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jvq */
public final class jvq extends ajed implements zma {
    final ajwl<jvp> a;
    final String b;
    final zke c;
    final ajdp<Integer> d;
    private final ajei e = new ajei();
    private ajdp<znh<zmy>> f;
    private final ira g;
    private final zfw h;

    /* renamed from: jvq$1 */
    static final class 1<T> implements ajfb<irs> {
        private /* synthetic */ jvq a;

        1(jvq jvq) {
            this.a = jvq;
        }

        public final /* synthetic */ void accept(Object obj) {
            irs irs = (irs) obj;
            akcr.b(irs, "autofillState");
            this.a.a.a(new jvp(irs.b, irs.c, false, ""));
        }
    }

    /* renamed from: jvq$2 */
    static final class 2<T> implements ajfb<Throwable> {
        public static final 2 a = new 2();

        2() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jvq$a */
    static final class a<T> implements ajfb<ajej> {
        private /* synthetic */ jvq a;
        private /* synthetic */ itd b;

        a(jvq jvq, itd itd) {
            this.a = jvq;
            this.b = itd;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a(new jvp(this.b.a, this.b.b, true, ""));
        }
    }

    /* renamed from: jvq$b */
    static final class b<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ jvq a;
        private /* synthetic */ itd b;

        b(jvq jvq, itd itd) {
            this.a = jvq;
            this.b = itd;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            Object obj2 = ((ahcd) bVar.b).b;
            akcr.a(obj2, "response.body.logged");
            if (obj2.booleanValue()) {
                this.a.a.a(new jvp(this.b.a, this.b.b, false, ""));
                this.a.c.a(new jvo(this.b.a, this.b.b));
                return;
            }
            ajwl ajwl = this.a.a;
            String str = this.b.a;
            String str2 = this.b.b;
            String str3 = ((ahcd) bVar.b).a;
            if (str3 == null) {
                str3 = this.a.b;
            }
            ajwl.a(new jvp(str, str2, false, str3));
        }
    }

    /* renamed from: jvq$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ jvq a;
        private /* synthetic */ itd b;

        c(jvq jvq, itd itd) {
            this.a = jvq;
            this.b = itd;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a.a(new jvp(this.b.a, this.b.b, false, this.a.b));
        }
    }

    /* renamed from: jvq$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ jvq a;

        d(jvq jvq) {
            this.a = jvq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            jvp jvp = (jvp) obj;
            akcr.b(jvp, "it");
            return znk.a((Object) new jvt(jvp.a, jvp.b, jvp.c, jvp.d, this.a.d));
        }
    }

    public jvq(ira ira, zfw zfw, zke zke, iqm iqm, ifs ifs, Activity activity, ajdp<Integer> ajdp) {
        akcr.b(ira, "identityApi");
        akcr.b(zfw, "schedulers");
        akcr.b(zke, "eventDispatcher");
        akcr.b(iqm, "contactApi");
        akcr.b(ifs, "permissionHelper");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajdp, "softKeyboardDetector");
        this.g = ira;
        this.h = zfw;
        this.c = zke;
        this.d = ajdp;
        String str = "";
        Object i = ajwl.i(new jvp(str, str, false, str));
        akcr.a(i, "BehaviorSubject.createDe…eData(\"\", \"\", false, \"\"))");
        this.a = i;
        i = activity.getString(R.string.problem_connecting);
        akcr.a(i, "activity.getString(R.string.problem_connecting)");
        this.b = i;
        this.e.a(iqm.a(activity, ifs, this.h, ifu.IN_APP_PHONE_NUMBER).a((ajdw) this.h.l()).a((ajfb) new 1(this), (ajfb) 2.a));
        this.f = this.a.p(new d(this));
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        Object obj = this.f;
        akcr.a(obj, "viewModel");
        return obj;
    }

    public final void onDispose() {
        this.e.dispose();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSetPhoneEvent(itd itd) {
        akcr.b(itd, "event");
        this.e.a(this.g.a(itd.a, itd.b, itd.c, c.IN_APP_CONTACT_TYPE).a((ajdw) this.h.l()).b((ajfb) new a(this, itd)).a((ajfb) new b(this, itd), (ajfb) new c(this, itd)));
    }
}
