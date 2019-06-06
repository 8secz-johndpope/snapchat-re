package org.jcodec.common.tools;

import java.util.regex.Pattern;

public class MainUtils {
    private static Pattern flagPattern = Pattern.compile("^--([^=]+)=(.*)$");
    public static boolean isColorSupported;

    public enum ANSIColor {
        BLACK,
        RED,
        GREEN,
        BROWN,
        BLUE,
        MAGENTA,
        CYAN,
        GREY
    }

    static {
        boolean z = System.console() != null || Boolean.parseBoolean(System.getProperty("jcodec.colorPrint"));
        isColorSupported = z;
    }

    public static String bold(String str) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder("\u001b[1m");
        stringBuilder.append(str);
        stringBuilder.append("\u001b[0m");
        return stringBuilder.toString();
    }

    public static String colorString(String str, String str2) {
        if (!isColorSupported) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder("\u001b[");
        stringBuilder.append(str2);
        stringBuilder.append("m");
        stringBuilder.append(str);
        stringBuilder.append("\u001b[0m");
        return stringBuilder.toString();
    }
}
