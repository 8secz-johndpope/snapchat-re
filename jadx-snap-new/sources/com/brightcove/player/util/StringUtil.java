package com.brightcove.player.util;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class StringUtil {
    public static final String LONG_TIME_FORMAT = "%d:%02d:%02d";
    public static final String SHORTER_TIME_FORMAT = "%01d:%02d";
    public static final String SHORT_TIME_FORMAT = "%02d:%02d";
    public static final String ZERO_TIME_STRING = "0:00";

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String join(List<String> list, String str) {
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append((String) list.get(i));
            if (i < list.size() - 1) {
                stringBuilder.append(str);
            }
        }
        return stringBuilder.toString();
    }

    public static String join(String[] strArr, String str) {
        return (strArr == null || strArr.length == 0) ? null : join(Arrays.asList(strArr), str);
    }

    public static CharSequence replaceAll(CharSequence charSequence, String[] strArr, CharSequence[] charSequenceArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        while (true) {
            int spanEnd;
            int spanStart;
            Object obj = null;
            for (CharSequence charSequence2 : strArr) {
                int indexOf = TextUtils.indexOf(spannableStringBuilder, charSequence2);
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(charSequence2, indexOf, charSequence2.length() + indexOf, 33);
                    obj = 1;
                }
            }
            if (obj == null) {
                return spannableStringBuilder;
            }
            for (int i = 0; i < strArr.length; i++) {
                spanStart = spannableStringBuilder.getSpanStart(strArr[i]);
                spanEnd = spannableStringBuilder.getSpanEnd(strArr[i]);
                if (spanStart >= 0) {
                    spannableStringBuilder.replace(spanStart, spanEnd, charSequenceArr[i]);
                }
            }
        }
    }

    public static String stringForTime(long j) {
        if (j <= 0) {
            return ZERO_TIME_STRING;
        }
        Formatter format;
        j /= 1000;
        long j2 = j % 60;
        long j3 = (j / 60) % 60;
        j /= 3600;
        Formatter formatter = new Formatter(Locale.getDefault());
        if (j > 0) {
            format = formatter.format(LONG_TIME_FORMAT, new Object[]{Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2)});
        } else {
            Object[] objArr;
            String str;
            if (j3 < 10) {
                objArr = new Object[]{Long.valueOf(j3), Long.valueOf(j2)};
                str = SHORTER_TIME_FORMAT;
            } else {
                objArr = new Object[]{Long.valueOf(j3), Long.valueOf(j2)};
                str = SHORT_TIME_FORMAT;
            }
            format = formatter.format(str, objArr);
        }
        return format.toString();
    }
}
