package com.snap.lenses.camera.carousel.community;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.abtc;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.lum;

public final class DefaultInfoButtonView extends ImageView implements lum {
    private Animator a;
    private final ajxe b;

    static final class c extends akcs implements akbk<ajdp<defpackage.lum.a>> {
        private /* synthetic */ DefaultInfoButtonView a;

        c(DefaultInfoButtonView defaultInfoButtonView) {
            this.a = defaultInfoButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(this.a).p(AnonymousClass1.a)).a();
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultInfoButtonView a;

        b(DefaultInfoButtonView defaultInfoButtonView) {
            this.a = defaultInfoButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.setVisibility(8);
            return ajxw.a;
        }
    }

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ DefaultInfoButtonView a;

        a(DefaultInfoButtonView defaultInfoButtonView) {
            this.a = defaultInfoButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.setVisibility(0);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultInfoButtonView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultInfoButtonView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultInfoButtonView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = ajxh.a(new c(this));
    }

    public final ajdp<defpackage.lum.a> a() {
        return (ajdp) this.b.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x008e  */
    public final /* synthetic */ void accept(java.lang.Object r8) {
        /*
        r7 = this;
        r8 = (defpackage.lum.b) r8;
        r0 = "model";
        defpackage.akcr.b(r8, r0);
        r0 = r7.a;
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r0.cancel();
    L_0x000e:
        r0 = r8 instanceof defpackage.lum.b.a;
        if (r0 == 0) goto L_0x005f;
    L_0x0012:
        r8 = new android.animation.AnimatorSet;
        r8.<init>();
        r0 = r7;
        r0 = (com.snap.lenses.camera.carousel.community.DefaultInfoButtonView) r0;
        r1 = 1126629376; // 0x43270000 float:167.0 double:5.566288703E-315;
        r2 = r0.getAlpha();
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r3 - r2;
        r2 = r2 * r1;
        r1 = (long) r2;
        r4 = 3;
        r4 = new android.animation.Animator[r4];
        r5 = 0;
        r0 = (android.view.View) r0;
        r6 = 1065688760; // 0x3f851eb8 float:1.04 double:5.265202055E-315;
        r1 = defpackage.mgx.a(r0, r3, r6, r1);
        r1 = (android.animation.Animator) r1;
        r4[r5] = r1;
        r1 = 1;
        r2 = 1065017672; // 0x3f7ae148 float:0.98 double:5.26188644E-315;
        r2 = defpackage.mgx.a(r0, r2);
        r2 = (android.animation.Animator) r2;
        r4[r1] = r2;
        r1 = 2;
        r0 = defpackage.mgx.a(r0, r3);
        r0 = (android.animation.Animator) r0;
        r4[r1] = r0;
        r8.playSequentially(r4);
        r8 = (android.animation.Animator) r8;
        r0 = new com.snap.lenses.camera.carousel.community.DefaultInfoButtonView$a;
        r0.<init>(r7);
        r0 = (defpackage.akbk) r0;
        r8 = defpackage.mgx.b(r8, r0);
    L_0x005c:
        r7.a = r8;
        goto L_0x008a;
    L_0x005f:
        r0 = defpackage.lum.b.b.a;
        r8 = defpackage.akcr.a(r8, r0);
        if (r8 == 0) goto L_0x008a;
    L_0x0067:
        r8 = r7;
        r8 = (android.view.View) r8;
        r0 = 1124401152; // 0x43050000 float:133.0 double:5.555279813E-315;
        r1 = r7.getAlpha();
        r1 = r1 * r0;
        r0 = (long) r1;
        r2 = 0;
        r8 = defpackage.mgx.a(r8, r2, r2, r0);
        r0 = "hide()";
        defpackage.akcr.a(r8, r0);
        r8 = (android.animation.Animator) r8;
        r0 = new com.snap.lenses.camera.carousel.community.DefaultInfoButtonView$b;
        r0.<init>(r7);
        r0 = (defpackage.akbk) r0;
        r8 = defpackage.mgx.a(r8, r0);
        goto L_0x005c;
    L_0x008a:
        r8 = r7.a;
        if (r8 == 0) goto L_0x0091;
    L_0x008e:
        r8.start();
    L_0x0091:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.carousel.community.DefaultInfoButtonView.accept(java.lang.Object):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(new abtc(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener(null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setPivotX(((float) i) / 2.0f);
        setPivotY((float) i2);
    }
}
