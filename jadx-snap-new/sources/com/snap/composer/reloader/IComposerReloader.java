package com.snap.composer.reloader;

import java.util.Collection;

public interface IComposerReloader {
    void setUsernames(Collection<String> collection);

    void startListening(DaemonClientProvider daemonClientProvider);

    void stopListening();
}
