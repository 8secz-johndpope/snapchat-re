package com.snap.composer.jsmodules;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.snap.composer.logger.Logger;
import com.snap.composer.utils.MainThreadUtils;
import defpackage.absj;
import defpackage.abxv;
import defpackage.ajwo;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajzm;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdd.d;

public final class ComposerDeviceModule extends ComposerBridgeModule {
    private final String a = String.valueOf(VERSION.SDK_INT);
    private final String b;
    private final double c;
    private final double d;
    private final double e;
    private double f;
    private double g;
    private ajwo<ajxw> h;
    private final JSThreadDispatcher i;
    private final Context j;
    private final Logger k;

    static final class b implements Runnable {
        private /* synthetic */ ComposerDeviceModule a;
        private /* synthetic */ double b;
        private /* synthetic */ double c;
        private /* synthetic */ double d;

        b(ComposerDeviceModule composerDeviceModule, double d, double d2, double d3) {
            this.a = composerDeviceModule;
            this.b = d;
            this.c = d2;
            this.d = d3;
        }

        public final void run() {
            if (this.b != this.c || this.a.f != this.d) {
                this.a.f = this.c;
                this.a.g = this.d;
                this.a.h.a(ajxw.a);
            }
        }
    }

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ ComposerDeviceModule a;
        private /* synthetic */ d b;

        a(ComposerDeviceModule composerDeviceModule, d dVar) {
            this.a = composerDeviceModule;
            this.b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abxv.a(this.a.getContext(), this.b.a);
            return ajxw.a;
        }
    }

    public ComposerDeviceModule(JSThreadDispatcher jSThreadDispatcher, Context context, Logger logger) {
        akcr.b(jSThreadDispatcher, "jsThreadDispatcher");
        akcr.b(context, "context");
        akcr.b(logger, "logger");
        this.i = jSThreadDispatcher;
        this.j = context;
        this.k = logger;
        Object obj = Build.MODEL;
        akcr.a(obj, "Build.MODEL");
        this.b = obj;
        obj = this.j.getResources();
        akcr.a(obj, "context.resources");
        DisplayMetrics displayMetrics = obj.getDisplayMetrics();
        double d = (double) displayMetrics.density;
        this.e = d;
        double d2 = (double) displayMetrics.widthPixels;
        Double.isNaN(d2);
        Double.isNaN(d);
        this.c = d2 / d;
        d2 = (double) displayMetrics.heightPixels;
        Double.isNaN(d2);
        Double.isNaN(d);
        this.d = d2 / d;
        obj = new ajwo();
        akcr.a(obj, "PublishSubject.create()");
        this.h = obj;
    }

    public static final /* synthetic */ boolean access$performHapticFeedback(ComposerDeviceModule composerDeviceModule, Object[] objArr) {
        Object obj;
        d dVar = new d();
        dVar.a = 10;
        Object obj2 = "action_sheet";
        if (objArr.length <= 0 || !(objArr[0] instanceof String)) {
            obj = obj2;
        } else {
            obj = objArr[0];
            if (obj != null) {
                obj = (String) obj;
            } else {
                throw new ajxt("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (akcr.a(obj, obj2)) {
            dVar.a = 10;
        }
        MainThreadUtils.runOnMainThreadIfNeeded(new a(composerDeviceModule, dVar));
        return true;
    }

    public final Context getContext() {
        return this.j;
    }

    public final Object loadModule() {
        r0 = new ajxm[12];
        r0[0] = ajxs.a("getSystemType", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$1(this));
        r0[1] = ajxs.a("getSystemVersion", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$2(this));
        r0[2] = ajxs.a("getModel", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$3(this));
        r0[3] = ajxs.a("getDisplayWidth", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$4(this));
        r0[4] = ajxs.a("getDisplayHeight", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$5(this));
        r0[5] = ajxs.a("getDisplayScale", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$6(this));
        r0[6] = ajxs.a("getDisplayLeftInset", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$7(this));
        r0[7] = ajxs.a("getDisplayRightInset", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$8(this));
        r0[8] = ajxs.a("getDisplayBottomInset", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$9(this));
        r0[9] = ajxs.a("getDisplayTopInset", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$10(this));
        r0[10] = ajxs.a("observeDisplayInsetChange", makeObserverMethod(this.h));
        r0[11] = ajxs.a("performHapticFeedback", new ComposerDeviceModule$loadModule$$inlined$makeBridgeMethod$11(this));
        return ajzm.a(r0);
    }

    public final void updateInsets(double d) {
        Object a = absj.a();
        akcr.a(a, "StatusBarUtils.getInstance()");
        double b = (double) a.b();
        double d2 = this.e;
        Double.isNaN(b);
        this.i.runOnJsThread(new b(this, d, b / d2, d / d2));
    }
}
