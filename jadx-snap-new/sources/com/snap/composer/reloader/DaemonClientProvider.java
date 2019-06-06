package com.snap.composer.reloader;

import com.snapchat.client.composer.DaemonClient;

public interface DaemonClientProvider {
    DaemonClient newDaemonClient();
}
