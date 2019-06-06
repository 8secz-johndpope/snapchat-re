package defpackage;

import android.os.Looper;
import android.view.View;

/* renamed from: adcr */
public final class adcr {

    /* renamed from: adcr$a */
    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ View a;
        private /* synthetic */ zfw b;
        private /* synthetic */ ajei c;
        private /* synthetic */ Runnable d;

        a(View view, zfw zfw, ajei ajei, Runnable runnable) {
            this.a = view;
            this.b = zfw;
            this.c = ajei;
            this.d = runnable;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.post(this.d);
            return ajxw.a;
        }
    }

    /* renamed from: adcr$b */
    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ View a;
        private /* synthetic */ zfw b;
        private /* synthetic */ ajei c;
        private /* synthetic */ Runnable d;
        private /* synthetic */ long e = 20000;

        b(View view, zfw zfw, ajei ajei, Runnable runnable) {
            this.a = view;
            this.b = zfw;
            this.c = ajei;
            this.d = runnable;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.postDelayed(this.d, this.e);
            return ajxw.a;
        }
    }

    static final void a(View view, zfw zfw, ajei ajei, akbk<ajxw> akbk) {
        if (view.isAttachedToWindow() || akcr.a(Looper.myLooper(), Looper.getMainLooper())) {
            akbk.invoke();
            return;
        }
        ajej a = zfw.l().a((Runnable) new adcs(akbk));
        akcr.a((Object) a, "qualifiedSchedulers.main…().scheduleDirect(action)");
        ajvv.a(a, ajei);
    }

    public static final void a(View view, zfw zfw, ajei ajei, Runnable runnable) {
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(runnable, "runnable");
        if (view != null) {
            adcr.a(view, zfw, ajei, (akbk) new a(view, zfw, ajei, runnable));
        }
    }
}
