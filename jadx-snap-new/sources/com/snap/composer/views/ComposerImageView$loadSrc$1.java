package com.snap.composer.views;

import android.net.Uri;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.views.ComposerImageView.Companion;
import defpackage.akcr;
import defpackage.akdd;
import defpackage.akdd.e;
import defpackage.jwl;
import defpackage.jwv;
import defpackage.jxj.a;

public final class ComposerImageView$loadSrc$1 implements a {
    private /* synthetic */ ComposerImageView a;
    private /* synthetic */ Object b;
    private /* synthetic */ akdd.a c;
    private /* synthetic */ e d;
    private /* synthetic */ ComposerAction e;

    ComposerImageView$loadSrc$1(ComposerImageView composerImageView, Object obj, akdd.a aVar, e eVar, ComposerAction composerAction) {
        this.a = composerImageView;
        this.b = obj;
        this.c = aVar;
        this.d = eVar;
        this.e = composerAction;
    }

    public final void onFailure(jwl jwl) {
        akcr.b(jwl, "failureReason");
        if ((akcr.a(this.a.currentSrc, this.b) ^ 1) == 0) {
            ComposerAction composerAction = this.e;
            if (composerAction != null) {
                composerAction.perform(new Boolean[]{Boolean.FALSE});
            }
        }
    }

    public final void onImageReady(jwv jwv) {
        akcr.b(jwv, "metrics");
        if ((akcr.a(this.a.currentSrc, this.b) ^ 1) == 0) {
            if (!this.c.a) {
                Companion.access$updateImageSize(ComposerImageView.Companion, (Uri) this.d.a, jwv.a, jwv.b);
                if (this.a.getWidth() <= 1 && this.a.getHeight() <= 1 && jwv.a != 0 && jwv.b != 0) {
                    ViewUtils.INSTANCE.invalidateLayout(this.a);
                }
            }
            ComposerAction composerAction = this.e;
            if (composerAction != null) {
                composerAction.perform(new Boolean[]{Boolean.TRUE});
            }
        }
    }
}
