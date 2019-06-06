package com.snap.shake2report.ui.screenshotpage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.google.common.base.Optional;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.abtc;
import defpackage.achb;
import defpackage.achd;
import defpackage.aily;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.jwa;
import defpackage.jwb;
import defpackage.jwj;
import defpackage.k;
import defpackage.kaz;
import defpackage.s;
import defpackage.wqv;
import defpackage.wtq;
import defpackage.wvl;
import defpackage.wvm;
import defpackage.wvn;
import defpackage.wwp;
import defpackage.wwq;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import java.util.List;
import java.util.concurrent.Callable;

public final class ScreenshotPagePresenter extends zll<wwq> implements k {
    final ajei a = new ajei();
    final Context b;
    final achb<zjm, zjk> c;
    final aipn<wtq> d;
    final wvl e;
    final jwb f;
    private final ajxe g = ajxh.a(new g(this));
    private final ajxe h = ajxh.a(new a(this));
    private final zke i;
    private zgb j;

    static final class c implements OnClickListener {
        final /* synthetic */ ScreenshotPagePresenter a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                wwq wwq = (wwq) this.a.a.getTarget();
                ScreenshotDrawingView c = wwq != null ? wwq.c() : null;
                if (c == null) {
                    akcr.a();
                }
                c.setVisibility(8);
                ScreenshotPagePresenter.a(this.a.a, true);
                return ajxw.a;
            }
        }

        c(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final void onClick(View view) {
            wwq wwq = (wwq) this.a.getTarget();
            ScreenshotDrawingView screenshotDrawingView = null;
            if (wwq != null) {
                ScreenshotDrawingView c = wwq.c();
                if (c != null && c.a()) {
                    zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.b, this.a.c, new zjm(wqv.g, "S2r_cancel_screenshot_warning_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 16).a((int) R.string.s2r_discard_change).a((int) R.string.s2r_dialog_yes, (akbl) new a(this), false), null, false, null, null, null, 31).a();
                    this.a.c.a((achd) a, a.a, null);
                    return;
                }
            }
            wwq = (wwq) this.a.getTarget();
            if (wwq != null) {
                screenshotDrawingView = wwq.c();
            }
            if (screenshotDrawingView == null) {
                akcr.a();
            }
            screenshotDrawingView.setVisibility(8);
            ScreenshotPagePresenter.a(this.a, true);
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ ScreenshotPagePresenter a;

        d(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final void onClick(View view) {
            akcr.a((Object) view, "it");
            view.setSelected(true);
            wwq wwq = (wwq) this.a.getTarget();
            ScreenshotDrawingView c = wwq != null ? wwq.c() : null;
            if (c == null) {
                akcr.a();
            }
            c.setVisibility(0);
            wwq = (wwq) this.a.getTarget();
            c = wwq != null ? wwq.c() : null;
            if (c == null) {
                akcr.a();
            }
            wwq wwq2 = (wwq) this.a.getTarget();
            Object l = wwq2 != null ? wwq2.l() : null;
            if (l == null) {
                akcr.a();
            }
            jwa b = this.a.b();
            akcr.b(l, "displayMetrics");
            akcr.b(b, "bitmapFactory");
            l = b.a(l.widthPixels, l.heightPixels, "ScreenshotDrawingView");
            akcr.a(l, "bitmapFactory.createBitm…etrics.heightPixels, TAG)");
            c.a = l;
            kaz kaz = c.a;
            String str = "bitmapRef";
            if (kaz == null) {
                akcr.a(str);
            }
            Object a = kaz.a();
            akcr.a(a, "bitmapRef.get()");
            c.b = new Canvas(((jwj) a).a());
            c.c = new Paint();
            Paint paint = c.c;
            if (paint == null) {
                akcr.a("paint");
            }
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setColor(-65536);
            paint.setStrokeWidth(20.0f);
            paint.setStyle(Style.STROKE);
            paint.setStrokeJoin(Join.ROUND);
            paint.setStrokeCap(Cap.ROUND);
            paint.setXfermode(null);
            paint.setAlpha(255);
            kaz kaz2 = c.a;
            if (kaz2 == null) {
                akcr.a(str);
            }
            ajvv.a((ajej) kaz2, this.a.a);
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ ScreenshotPagePresenter a;

        e(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final void onClick(View view) {
            wwq wwq = (wwq) this.a.getTarget();
            if (wwq != null) {
                ScreenshotDrawingView c = wwq.c();
                if (c != null && c.a()) {
                    ScreenshotPagePresenter screenshotPagePresenter = this.a;
                    ajej g = ajdx.c((Callable) new h(screenshotPagePresenter)).a((ajdw) screenshotPagePresenter.a().f()).e((ajfc) new i(screenshotPagePresenter)).a((ajdw) screenshotPagePresenter.a().l()).g(new j(screenshotPagePresenter));
                    akcr.a((Object) g, "Single.fromCallable { ta…aveScreenshotPage(true) }");
                    ajvv.a(g, screenshotPagePresenter.a);
                }
            }
        }
    }

    static final class f implements OnClickListener {
        final /* synthetic */ ScreenshotPagePresenter a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                ScreenshotPagePresenter.a(this.a.a, false);
                return ajxw.a;
            }
        }

        f(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final void onClick(View view) {
            zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(this.a.b, this.a.c, new zjm(wqv.g, "s2r_remove_screenshot_warning_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 16).a((int) R.string.s2r_remove_screenshot).a((int) R.string.s2r_dialog_yes, (akbl) new a(this), false), null, false, null, null, null, 31).a();
            this.a.c.a((achd) a, a.a, null);
        }
    }

    static final class h<V> implements Callable<T> {
        private /* synthetic */ ScreenshotPagePresenter a;

        h(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r5 = this;
            r0 = r5.a;
            r1 = r0.b();
            r2 = r0.getTarget();
            r2 = (defpackage.wwq) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x001e;
        L_0x000f:
            r2 = r2.b();
            if (r2 == 0) goto L_0x001e;
        L_0x0015:
            r2 = r2.getWidth();
            r2 = java.lang.Integer.valueOf(r2);
            goto L_0x001f;
        L_0x001e:
            r2 = r3;
        L_0x001f:
            if (r2 != 0) goto L_0x0024;
        L_0x0021:
            defpackage.akcr.a();
        L_0x0024:
            r2 = r2.intValue();
            r4 = r0.getTarget();
            r4 = (defpackage.wwq) r4;
            if (r4 == 0) goto L_0x003e;
        L_0x0030:
            r4 = r4.b();
            if (r4 == 0) goto L_0x003e;
        L_0x0036:
            r3 = r4.getHeight();
            r3 = java.lang.Integer.valueOf(r3);
        L_0x003e:
            if (r3 != 0) goto L_0x0043;
        L_0x0040:
            defpackage.akcr.a();
        L_0x0043:
            r3 = r3.intValue();
            r4 = "ScreenshotPagePresenter";
            r1 = r1.a(r2, r3, r4);
            r2 = "bitmapFactory.createBitm…ImageView?.height!!, TAG)";
            defpackage.akcr.a(r1, r2);
            r2 = r0.a;
            r3 = r1;
            r3 = (defpackage.ajej) r3;
            r2.a(r3);
            r2 = new android.graphics.Canvas;
            r3 = r1.a();
            r4 = "outputBitmapRef.get()";
            defpackage.akcr.a(r3, r4);
            r3 = (defpackage.jwj) r3;
            r3 = r3.a();
            r2.<init>(r3);
            r3 = r0.getTarget();
            r3 = (defpackage.wwq) r3;
            if (r3 == 0) goto L_0x007f;
        L_0x0076:
            r3 = r3.b();
            if (r3 == 0) goto L_0x007f;
        L_0x007c:
            r3.draw(r2);
        L_0x007f:
            r0 = r0.getTarget();
            r0 = (defpackage.wwq) r0;
            if (r0 == 0) goto L_0x0090;
        L_0x0087:
            r0 = r0.c();
            if (r0 == 0) goto L_0x0090;
        L_0x008d:
            r0.draw(r2);
        L_0x0090:
            r0 = r1.a();
            defpackage.akcr.a(r0, r4);
            r0 = (defpackage.jwj) r0;
            r0 = r0.a();
            r1 = "outputBitmapRef.get().underlyingBitmap";
            defpackage.akcr.a(r0, r1);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.shake2report.ui.screenshotpage.ScreenshotPagePresenter$h.call():java.lang.Object");
        }
    }

    static final class b<T> implements ajfb<Optional<Uri>> {
        private /* synthetic */ ScreenshotPagePresenter a;

        b(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            ScreenshotPagePresenter screenshotPagePresenter = this.a;
            akcr.a(obj, "it");
            if (obj.isPresent()) {
                wwq wwq = (wwq) screenshotPagePresenter.getTarget();
                if (wwq != null) {
                    SnapImageView b = wwq.b();
                    if (b != null) {
                        obj = obj.get();
                        akcr.a(obj, "imageUri.get()");
                        b.setImageUri((Uri) obj, wqv.g.getPage());
                    }
                }
            }
        }
    }

    static final class i<T, R> implements ajfc<Bitmap, ajdb> {
        final /* synthetic */ ScreenshotPagePresenter a;

        i(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            akcr.b(bitmap, "it");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ i a;

                public final void run() {
                    wtq wtq = (wtq) this.a.a.d.get();
                    String str = this.a.a.e.a;
                    if (str == null) {
                        akcr.a();
                    }
                    wtq.a(str, bitmap);
                }
            });
        }
    }

    static final class j implements ajev {
        private /* synthetic */ ScreenshotPagePresenter a;

        j(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
        }

        public final void run() {
            ScreenshotPagePresenter.a(this.a, true);
        }
    }

    static final class a extends akcs implements akbk<jwa> {
        private /* synthetic */ ScreenshotPagePresenter a;

        a(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.f.a(wqv.g);
        }
    }

    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ ScreenshotPagePresenter a;

        g(ScreenshotPagePresenter screenshotPagePresenter) {
            this.a = screenshotPagePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(wqv.g, "ScreenshotPagePresenter");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ScreenshotPagePresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ScreenshotPagePresenter.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;")};
    }

    public ScreenshotPagePresenter(Context context, achb<zjm, zjk> achb, zke zke, zgb zgb, aipn<wtq> aipn, wvl wvl, jwb jwb) {
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(zke, "dispatcher");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "shakeFileManager");
        akcr.b(wvl, "reportConfigProvider");
        akcr.b(jwb, "bitmapFactoryProvider");
        this.b = context;
        this.c = achb;
        this.i = zke;
        this.j = zgb;
        this.d = aipn;
        this.e = wvl;
        this.f = jwb;
    }

    public static final /* synthetic */ void a(ScreenshotPagePresenter screenshotPagePresenter, boolean z) {
        zke zke;
        Object wvn;
        if (z) {
            zke = screenshotPagePresenter.i;
            wvn = new wvn();
        } else {
            List list = screenshotPagePresenter.e.i;
            list.remove(wvm.SCREENSHOT);
            aily aily = screenshotPagePresenter.e.c;
            Object obj = (aily != null && wwp.a[aily.ordinal()] == 1) ? wvm.ADD_NEW : wvm.ADD_BACK;
            list.add(obj);
            screenshotPagePresenter.e.a(list);
            zke = screenshotPagePresenter.i;
            wvn = new wvn();
        }
        zke.a(wvn);
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.g.b();
    }

    /* renamed from: a */
    public final void takeTarget(wwq wwq) {
        akcr.b(wwq, "target");
        super.takeTarget(wwq);
        wwq.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final jwa b() {
        return (jwa) this.h.b();
    }

    public final void dropTarget() {
        wwq wwq = (wwq) getTarget();
        if (wwq != null) {
            defpackage.j lifecycle = wwq.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onFragmentResume() {
        wtq wtq = (wtq) this.d.get();
        String str = this.e.a;
        if (str == null) {
            akcr.a();
        }
        ajej e = wtq.a(str).b((ajdw) a().f()).a((ajdw) a().l()).e((ajfb) new b(this));
        akcr.a((Object) e, "shakeFileManager.get().g… setBackgroundImage(it) }");
        ajvv.a(e, this.a);
        wwq wwq = (wwq) getTarget();
        ImageButton imageButton = null;
        ImageButton h = wwq != null ? wwq.h() : null;
        if (h == null) {
            akcr.a();
        }
        h.setOnTouchListener(new abtc(h));
        h.setOnClickListener(new c(this));
        wwq = (wwq) getTarget();
        h = wwq != null ? wwq.j() : null;
        if (h == null) {
            akcr.a();
        }
        h.setOnTouchListener(new abtc(h));
        h.setOnClickListener(new f(this));
        wwq = (wwq) getTarget();
        h = wwq != null ? wwq.k() : null;
        if (h == null) {
            akcr.a();
        }
        h.setOnTouchListener(new abtc(h));
        h.setOnClickListener(new d(this));
        wwq = (wwq) getTarget();
        if (wwq != null) {
            imageButton = wwq.i();
        }
        if (imageButton == null) {
            akcr.a();
        }
        imageButton.setOnTouchListener(new abtc(imageButton));
        imageButton.setOnClickListener(new e(this));
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        this.a.a();
    }
}
