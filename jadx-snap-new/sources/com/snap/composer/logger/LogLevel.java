package com.snap.composer.logger;

import defpackage.akco;

public abstract class LogLevel {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final int getDEBUG() {
            return 0;
        }

        public final int getERROR() {
            return 3;
        }

        public final int getINFO() {
            return 1;
        }

        public final int getWARN() {
            return 2;
        }
    }

    private LogLevel() {
    }
}
