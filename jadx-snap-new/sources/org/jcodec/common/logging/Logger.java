package org.jcodec.common.logging;

import java.util.LinkedList;
import java.util.List;

public class Logger {
    private static LogLevel globalLogLevel = LogLevel.INFO;
    private static List<LogSink> sinks;
    private static List<LogSink> stageSinks = new LinkedList();

    public static void debug(String str) {
        message(LogLevel.DEBUG, str, null);
    }

    public static void error(String str) {
        message(LogLevel.ERROR, str, null);
    }

    public static void info(String str) {
        message(LogLevel.INFO, str, null);
    }

    private static void message(LogLevel logLevel, String str, Object[] objArr) {
        if (globalLogLevel.ordinal() < logLevel.ordinal()) {
            Message message;
            if (sinks == null) {
                synchronized (Logger.class) {
                    if (sinks == null) {
                        sinks = stageSinks;
                        stageSinks = null;
                        if (sinks.isEmpty()) {
                            sinks.add(OutLogSink.createOutLogSink());
                        }
                    }
                }
            }
            if (LogLevel.DEBUG.equals(globalLogLevel)) {
                StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
                message = new Message(logLevel, stackTraceElement.getFileName(), stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getLineNumber(), str, objArr);
            } else {
                Message message2 = new Message(logLevel, "", "", "", 0, str, objArr);
            }
            for (LogSink postMessage : sinks) {
                postMessage.postMessage(message);
            }
        }
    }

    public static void warn(String str) {
        message(LogLevel.WARN, str, null);
    }
}
