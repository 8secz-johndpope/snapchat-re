package com.snap.composer.attributes.impl.gestures;

import com.snap.composer.actions.ComposerAction;
import com.snap.composer.views.touches.TouchGestureRecognizerListener;

public final class TouchContext implements TouchGestureRecognizerListener {
    private ComposerAction a;
    private ComposerAction b;
    private ComposerAction c;

    public final ComposerAction getAction() {
        return this.a;
    }

    public final ComposerAction getEndAction() {
        return this.c;
    }

    public final ComposerAction getStartAction() {
        return this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Missing block: B:3:0x001a, code skipped:
            if (r3 != null) goto L_0x001c;
     */
    /* JADX WARNING: Missing block: B:8:0x0026, code skipped:
            if (r3 != null) goto L_0x001c;
     */
    public final void onRecognized(com.snap.composer.views.touches.TouchGestureRecognizer r2, com.snap.composer.views.touches.ComposerGestureRecognizerState r3, int r4, int r5) {
        /*
        r1 = this;
        r0 = "gestureRecognizer";
        defpackage.akcr.b(r2, r0);
        r0 = "state";
        defpackage.akcr.b(r3, r0);
        r0 = com.snap.composer.attributes.impl.gestures.GestureAttributesUtils.INSTANCE;
        r2 = r2.getView();
        r2 = r0.getGestureParams(r2, r3, r4, r5);
        r4 = com.snap.composer.views.touches.ComposerGestureRecognizerState.BEGAN;
        if (r3 != r4) goto L_0x0020;
    L_0x0018:
        r3 = r1.b;
        if (r3 == 0) goto L_0x0029;
    L_0x001c:
        r3.perform(r2);
        goto L_0x0029;
    L_0x0020:
        r4 = com.snap.composer.views.touches.ComposerGestureRecognizerState.ENDED;
        if (r3 != r4) goto L_0x0029;
    L_0x0024:
        r3 = r1.c;
        if (r3 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x001c;
    L_0x0029:
        r3 = r1.a;
        if (r3 == 0) goto L_0x0030;
    L_0x002d:
        r3.perform(r2);
    L_0x0030:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.gestures.TouchContext.onRecognized(com.snap.composer.views.touches.TouchGestureRecognizer, com.snap.composer.views.touches.ComposerGestureRecognizerState, int, int):void");
    }

    public final void setAction(ComposerAction composerAction) {
        this.a = composerAction;
    }

    public final void setEndAction(ComposerAction composerAction) {
        this.c = composerAction;
    }

    public final void setStartAction(ComposerAction composerAction) {
        this.b = composerAction;
    }
}
