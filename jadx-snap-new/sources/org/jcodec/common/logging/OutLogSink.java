package org.jcodec.common.logging;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import org.jcodec.common.tools.MainUtils;
import org.jcodec.common.tools.MainUtils.ANSIColor;

public class OutLogSink implements LogSink {
    public static SimpleFormat DEFAULT_FORMAT = null;
    private static String empty = "                                                                                                                                                                                                                                                ";
    private MessageFormat fmt;
    private LogLevel minLevel;
    private PrintStream out;

    public interface MessageFormat {
        String formatMessage(Message message);
    }

    public static class SimpleFormat implements MessageFormat {
        private static Map<LogLevel, ANSIColor> colorMap;
        private String fmt;

        static {
            HashMap hashMap = new HashMap();
            colorMap = hashMap;
            hashMap.put(LogLevel.DEBUG, ANSIColor.BROWN);
            colorMap.put(LogLevel.INFO, ANSIColor.GREEN);
            colorMap.put(LogLevel.WARN, ANSIColor.MAGENTA);
            colorMap.put(LogLevel.ERROR, ANSIColor.RED);
        }

        public SimpleFormat(String str) {
            this.fmt = str;
        }

        public String formatMessage(Message message) {
            return this.fmt.replace("#level", String.valueOf(message.getLevel())).replace("#color_code", String.valueOf(((ANSIColor) colorMap.get(message.getLevel())).ordinal() + 30)).replace("#class", message.getClassName()).replace("#method", message.getMethodName()).replace("#file", message.getFileName()).replace("#line", String.valueOf(message.getLineNumber())).replace("#message", message.getMessage());
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MainUtils.colorString("[#level]", "#color_code"));
        stringBuilder.append(MainUtils.bold("\t#class.#method (#file:#line):"));
        stringBuilder.append("\t#message");
        DEFAULT_FORMAT = new SimpleFormat(stringBuilder.toString());
    }

    public OutLogSink(PrintStream printStream, MessageFormat messageFormat, LogLevel logLevel) {
        this.out = printStream;
        this.fmt = messageFormat;
        this.minLevel = logLevel;
    }

    public static OutLogSink createOutLogSink() {
        return new OutLogSink(System.out, DEFAULT_FORMAT, LogLevel.INFO);
    }

    public void postMessage(Message message) {
        if (message.getLevel().ordinal() >= this.minLevel.ordinal()) {
            this.out.println(this.fmt.formatMessage(message));
        }
    }
}
