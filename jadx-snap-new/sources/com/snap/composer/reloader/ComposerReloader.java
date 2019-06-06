package com.snap.composer.reloader;

import android.content.Context;
import com.snap.composer.logger.LogLevel;
import com.snap.composer.logger.Logger;
import defpackage.akcr;
import defpackage.zfw;
import java.util.Collection;

public final class ComposerReloader implements IComposerReloader {
    private final Logger a;
    private final Context b;

    public ComposerReloader(zfw zfw, Logger logger, Context context) {
        akcr.b(zfw, "schedulers");
        akcr.b(logger, "logger");
        akcr.b(context, "context");
        this.a = logger;
        this.b = context;
    }

    public final Context getContext() {
        return this.b;
    }

    public final Logger getLogger() {
        return this.a;
    }

    public final void setUsernames(Collection<String> collection) {
        akcr.b(collection, "usernames");
    }

    public final void startListening(DaemonClientProvider daemonClientProvider) {
        akcr.b(daemonClientProvider, "daemonClientProvider");
        this.a.log(LogLevel.Companion.getERROR(), "Cannot enable hot reloader in prod mode");
    }

    public final void stopListening() {
    }
}
