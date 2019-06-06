package com.snap.composer.attributes.impl.animations;

import android.animation.TimeInterpolator;
import defpackage.akco;
import defpackage.akcr;
import java.util.Map;

public enum AnimationType {
    ;
    
    private static final Map<Integer, AnimationType> ANIMATION_LOOKUP = null;
    public static final Companion Companion = null;
    private final TimeInterpolator interpolator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Map<Integer, AnimationType> getANIMATION_LOOKUP() {
            return AnimationType.ANIMATION_LOOKUP;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x00a2 in {2, 6, 8} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    static {
        /*
        r0 = 4;
        r0 = new com.snap.composer.attributes.impl.animations.AnimationType[r0];
        r1 = new com.snap.composer.attributes.impl.animations.AnimationType;
        r2 = new android.view.animation.LinearInterpolator;
        r2.<init>();
        r2 = (android.animation.TimeInterpolator) r2;
        r3 = 0;
        r4 = "LINEAR";
        r1.<init>(r4, r3, r2);
        LINEAR = r1;
        r0[r3] = r1;
        r1 = new com.snap.composer.attributes.impl.animations.AnimationType;
        r2 = new android.view.animation.AccelerateInterpolator;
        r2.<init>();
        r2 = (android.animation.TimeInterpolator) r2;
        r4 = 1;
        r5 = "EASE_IN";
        r1.<init>(r5, r4, r2);
        EASE_IN = r1;
        r0[r4] = r1;
        r1 = new com.snap.composer.attributes.impl.animations.AnimationType;
        r2 = new android.view.animation.DecelerateInterpolator;
        r2.<init>();
        r2 = (android.animation.TimeInterpolator) r2;
        r4 = 2;
        r5 = "EASE_OUT";
        r1.<init>(r5, r4, r2);
        EASE_OUT = r1;
        r0[r4] = r1;
        r1 = new com.snap.composer.attributes.impl.animations.AnimationType;
        r2 = new android.view.animation.AccelerateDecelerateInterpolator;
        r2.<init>();
        r2 = (android.animation.TimeInterpolator) r2;
        r4 = 3;
        r5 = "EASE_IN_OUT";
        r1.<init>(r5, r4, r2);
        EASE_IN_OUT = r1;
        r0[r4] = r1;
        $VALUES = r0;
        r0 = new com.snap.composer.attributes.impl.animations.AnimationType$Companion;
        r1 = 0;
        r0.<init>(r1);
        Companion = r0;
        r0 = values();
        r1 = new java.util.ArrayList;
        r2 = r0.length;
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r2 = r0.length;
        r4 = 0;
        if (r4 >= r2) goto L_0x007e;
        r5 = r0[r4];
        r6 = new ajxm;
        r7 = r5.ordinal();
        r7 = java.lang.Integer.valueOf(r7);
        r6.<init>(r7, r5);
        r1.add(r6);
        r4 = r4 + 1;
        goto L_0x0067;
        r1 = (java.util.List) r1;
        r1 = (java.util.Collection) r1;
        r0 = new defpackage.ajxm[r3];
        r0 = r1.toArray(r0);
        if (r0 == 0) goto L_0x009a;
        r0 = (defpackage.ajxm[]) r0;
        r1 = r0.length;
        r0 = java.util.Arrays.copyOf(r0, r1);
        r0 = (defpackage.ajxm[]) r0;
        r0 = defpackage.ajzm.a(r0);
        ANIMATION_LOOKUP = r0;
        return;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.animations.AnimationType.<clinit>():void");
    }

    protected AnimationType(TimeInterpolator timeInterpolator) {
        akcr.b(timeInterpolator, "interpolator");
        this.interpolator = timeInterpolator;
    }

    public final TimeInterpolator getInterpolator() {
        return this.interpolator;
    }
}
