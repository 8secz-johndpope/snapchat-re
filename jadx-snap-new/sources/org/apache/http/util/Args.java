package org.apache.http.util;

public class Args {
    public static <T extends CharSequence> T notEmpty(T t, String str) {
        StringBuilder stringBuilder;
        if (t == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (!TextUtils.isEmpty(t)) {
            return t;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" may not be empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static int notNegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" may not be negative");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static <T> T notNull(T t, String str) {
        if (t != null) {
            return t;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" may not be null");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
