package com.snap.composer.api;

import com.snap.composer.logger.LogLevel;
import com.snap.composer.logger.Logger;
import defpackage.akco;

public final class LoggerImpl implements Logger {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public final void log(int i, String str) {
        log(i, null, str);
    }

    public final void log(int i, Throwable th, String str) {
        if (i != LogLevel.Companion.getDEBUG() && i != LogLevel.Companion.getERROR() && i != LogLevel.Companion.getINFO()) {
            LogLevel.Companion.getWARN();
        }
    }
}
