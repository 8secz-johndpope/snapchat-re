package org.apache.http.util;

import java.io.UnsupportedEncodingException;

public final class EncodingUtils {
    public static byte[] getBytes(String str, String str2) {
        Args.notNull(str, "Input");
        Args.notEmpty(str2, "Charset");
        try {
            str = str.getBytes(str2);
            return str;
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
