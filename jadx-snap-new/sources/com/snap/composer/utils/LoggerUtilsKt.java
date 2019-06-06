package com.snap.composer.utils;

import com.snap.composer.logger.LogLevel;
import com.snap.composer.logger.Logger;
import defpackage.akcr;

public final class LoggerUtilsKt {
    public static final void debug(Logger logger, String str) {
        akcr.b(logger, "receiver$0");
        logger.log(LogLevel.Companion.getDEBUG(), str);
    }

    public static final void error(Logger logger, String str) {
        akcr.b(logger, "receiver$0");
        logger.log(LogLevel.Companion.getERROR(), str);
    }

    public static final void info(Logger logger, String str) {
        akcr.b(logger, "receiver$0");
        logger.log(LogLevel.Companion.getINFO(), str);
    }

    public static final void warn(Logger logger, String str) {
        akcr.b(logger, "receiver$0");
        logger.log(LogLevel.Companion.getWARN(), str);
    }
}
