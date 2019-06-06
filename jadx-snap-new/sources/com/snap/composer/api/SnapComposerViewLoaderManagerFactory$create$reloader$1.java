package com.snap.composer.api;

import com.snap.composer.reloader.DaemonClientProvider;
import com.snap.composer.reloader.IComposerReloader;
import defpackage.akcr;
import java.util.Collection;

public final class SnapComposerViewLoaderManagerFactory$create$reloader$1 implements IComposerReloader {
    SnapComposerViewLoaderManagerFactory$create$reloader$1() {
    }

    public final void setUsernames(Collection<String> collection) {
        akcr.b(collection, "usernames");
    }

    public final void startListening(DaemonClientProvider daemonClientProvider) {
        akcr.b(daemonClientProvider, "daemonClientProvider");
    }

    public final void stopListening() {
    }
}
