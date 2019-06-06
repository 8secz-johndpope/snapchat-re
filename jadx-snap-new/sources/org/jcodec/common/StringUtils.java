package org.jcodec.common;

import java.util.ArrayList;

public class StringUtils {
    public static String[] splitC(String str, char c) {
        return splitWorker(str, c, false);
    }

    private static String[] splitWorker(String str, char c, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (obj != null || z) {
                    arrayList.add(str.substring(i2, i));
                    obj = null;
                    obj2 = 1;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                obj = 1;
                obj2 = null;
            }
        }
        if (obj != null || (z && r6 != null)) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
