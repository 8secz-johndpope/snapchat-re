package com.snap.composer.serengeti.bridge;

import android.content.Context;
import android.content.Intent;
import com.brightcove.player.media.ErrorFields;
import defpackage.ajei;
import defpackage.akcr;
import defpackage.alpu;
import defpackage.wku.a;

public final class ComposerSerengetiNativeBridge implements a {
    private final Context a;
    private final ajei b;

    public ComposerSerengetiNativeBridge(Context context, ajei ajei) {
        akcr.b(context, "ctx");
        akcr.b(ajei, "disposable");
        this.a = context;
        this.b = ajei;
    }

    public final void dismiss() {
    }

    public final void dismissWithCallback(Runnable runnable) {
    }

    public final Context getContext() {
        return this.a;
    }

    public final Context getCtx() {
        return this.a;
    }

    public final ajei getDisposable() {
        return this.b;
    }

    public final void handlePostOnboardingNavigation(alpu alpu) {
    }

    public final void openUrl(alpu alpu) {
        akcr.b(alpu, "link");
    }

    public final ajei sessionDisposable() {
        return this.b;
    }

    public final void showAlert(String str) {
        akcr.b(str, ErrorFields.MESSAGE);
    }

    public final void startActivityForResult(Intent intent, int i) {
        akcr.b(intent, "intent");
    }
}
