package defpackage;

import android.app.Activity;
import com.brightcove.player.event.Event;
import defpackage.abmh.a;

/* renamed from: rpt */
public final class rpt implements abmh {
    private final ajxe a;

    /* renamed from: rpt$a */
    static final class a extends akcs implements akbk<abmh> {
        private /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abmh b = adfw.b();
            b.a(this.a);
            return b;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rpt.class), "realJingleService", "getRealJingleService()Lcom/snapchat/android/framework/audio/JingleService;");
    }

    public rpt(Activity activity) {
        akcr.b(activity, Event.ACTIVITY);
        this.a = ajxh.a(new a(activity));
    }

    private final abmh b() {
        return (abmh) this.a.b();
    }

    public final void a() {
        b().a();
    }

    public final void a(int i) {
        b().a(i);
    }

    public final void a(a aVar) {
        akcr.b(aVar, "jingle");
        b().a(aVar);
    }

    public final void a(Activity activity) {
        akcr.b(activity, Event.ACTIVITY);
    }

    public final void b(a aVar) {
        akcr.b(aVar, "jingle");
        b().b(aVar);
    }
}
