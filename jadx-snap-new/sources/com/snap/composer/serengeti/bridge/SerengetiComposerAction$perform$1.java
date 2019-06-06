package com.snap.composer.serengeti.bridge;

import com.snap.composer.actions.ComposerAction;
import defpackage.akdd.e;
import defpackage.wll.a;

public final class SerengetiComposerAction$perform$1 implements a {
    private /* synthetic */ e a;

    SerengetiComposerAction$perform$1(e eVar) {
        this.a = eVar;
    }

    /* JADX WARNING: Missing block: B:5:0x0012, code skipped:
            if (r4 == null) goto L_0x0014;
     */
    public final void failure(java.lang.Throwable r4) {
        /*
        r3 = this;
        r0 = r3.a;
        r0 = r0.a;
        r0 = (com.snap.composer.actions.ComposerAction) r0;
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        if (r4 == 0) goto L_0x0014;
    L_0x000e:
        r4 = r4.getMessage();
        if (r4 != 0) goto L_0x0016;
    L_0x0014:
        r4 = "Unknown error";
    L_0x0016:
        r1[r2] = r4;
        r0.perform(r1);
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.serengeti.bridge.SerengetiComposerAction$perform$1.failure(java.lang.Throwable):void");
    }

    public final void success(Object obj) {
        ComposerAction composerAction = (ComposerAction) this.a.a;
        if (composerAction != null) {
            composerAction.perform(new Object[]{null, obj});
        }
    }
}
