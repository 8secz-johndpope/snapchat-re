package com.snap.composer.attributes.impl.animations;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.drawables.ComposerGradientDrawable;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akdd.e;
import defpackage.akde;
import defpackage.aken;
import java.util.Arrays;

public final class ColorAnimator {
    public static final Companion Companion = new Companion();
    private static final ajxe a = ajxh.a(a.a);

    public static final class Companion {

        static final class a implements AnimatorUpdateListener {
            private /* synthetic */ e a;
            private /* synthetic */ int[] b;
            private /* synthetic */ int[] c;
            private /* synthetic */ ComposerGradientDrawable d;

            a(e eVar, int[] iArr, int[] iArr2, ComposerGradientDrawable composerGradientDrawable) {
                this.a = eVar;
                this.b = iArr;
                this.c = iArr2;
                this.d = composerGradientDrawable;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0061 in {6, 8, 10, 12} preds:[]
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
                	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            public final void onAnimationUpdate(android.animation.ValueAnimator r7) {
                /*
                r6 = this;
                r0 = "it";
                defpackage.akcr.a(r7, r0);
                r7 = r7.getAnimatedValue();
                if (r7 == 0) goto L_0x0059;
                r7 = (java.lang.Float) r7;
                r7 = r7.floatValue();
                r0 = r6.a;
                r0 = r0.a;
                r0 = (int[]) r0;
                r0 = r0.length;
                r1 = 0;
                r2 = 0;
                if (r2 >= r0) goto L_0x0051;
                r3 = com.snap.composer.attributes.impl.animations.ColorAnimator.Companion;
                r3 = ((android.animation.ArgbEvaluator) com.snap.composer.attributes.impl.animations.ColorAnimator.a.b());
                r4 = r6.a;
                r4 = r4.a;
                r4 = (int[]) r4;
                r4 = r4[r2];
                r4 = java.lang.Integer.valueOf(r4);
                r5 = r6.b;
                r5 = r5[r1];
                r5 = java.lang.Integer.valueOf(r5);
                r3 = r3.evaluate(r7, r4, r5);
                if (r3 == 0) goto L_0x0049;
                r3 = (java.lang.Integer) r3;
                r3 = r3.intValue();
                r4 = r6.c;
                r4[r2] = r3;
                r2 = r2 + 1;
                goto L_0x001a;
                r7 = new ajxt;
                r0 = "null cannot be cast to non-null type kotlin.Int";
                r7.<init>(r0);
                throw r7;
                r7 = r6.d;
                r0 = r6.c;
                r7.setColors(r0);
                return;
                r7 = new ajxt;
                r0 = "null cannot be cast to non-null type kotlin.Float";
                r7.<init>(r0);
                throw r7;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.animations.ColorAnimator$Companion$a.onAnimationUpdate(android.animation.ValueAnimator):void");
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(Companion.class), "argbEvaluator", "getArgbEvaluator()Landroid/animation/ArgbEvaluator;");
        }

        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ValueAnimator animateGradientDrawable(ComposerGradientDrawable composerGradientDrawable, int[] iArr) {
            akcr.b(composerGradientDrawable, "drawable");
            akcr.b(iArr, "to");
            if (iArr.length > 1) {
                composerGradientDrawable.setColors(iArr);
                return null;
            }
            e eVar = new e();
            eVar.a = composerGradientDrawable.getComposerColors();
            if (((int[]) eVar.a) == null) {
                composerGradientDrawable.setColor(0);
                eVar.a = composerGradientDrawable.getComposerColors();
            }
            if (((int[]) eVar.a) == null) {
                return null;
            }
            int[] iArr2 = (int[]) eVar.a;
            Object copyOf = Arrays.copyOf(iArr2, iArr2.length);
            String str = "java.util.Arrays.copyOf(this, size)";
            akcr.a(copyOf, str);
            eVar.a = copyOf;
            iArr2 = (int[]) eVar.a;
            copyOf = Arrays.copyOf(iArr2, iArr2.length);
            akcr.a(copyOf, str);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            ofFloat.addUpdateListener(new a(eVar, iArr, copyOf, composerGradientDrawable));
            return ofFloat;
        }
    }

    static final class a extends akcs implements akbk<ArgbEvaluator> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArgbEvaluator();
        }
    }
}
