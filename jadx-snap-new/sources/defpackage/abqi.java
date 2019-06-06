package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abqi */
public final class abqi {
    public static CharSequence a(abpz abpz) {
        return new String(Character.toChars(abpz.mUnicode));
    }

    public static String a(String str) {
        String str2 = "";
        if (str == null) {
            return str2;
        }
        String str3 = str;
        for (abqf abqf : abqf.SUPPORTED_EMOJI_SKIN_TONES_WITHOUT_NONE) {
            str3 = str3.replace(abqf.mUnicodeString, str2);
        }
        String str4 = (String) abqh.a.get(str3);
        if (str4 == null) {
            List arrayList = new ArrayList();
            int i = 0;
            if (str != null) {
                int length = str.length();
                if (length >= 5) {
                    arrayList = abqi.c(str);
                } else {
                    int codePointAt;
                    if (length == 4) {
                        length = Character.codePointAt(str.substring(0, 2), 0);
                        codePointAt = Character.codePointAt(str.substring(2), 0);
                        arrayList.add(Integer.toHexString(length));
                    } else if (length > 0) {
                        length = Character.codePointAt(str, 0);
                        arrayList.add(Integer.toHexString(length));
                        if ((str.length() == 2 || str.length() == 3) && length < 256) {
                            codePointAt = Character.codePointAt(str, str.length() - 1);
                        }
                    }
                    arrayList.add(Integer.toHexString(codePointAt));
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (i < arrayList.size()) {
                stringBuilder.append((String) arrayList.get(i));
                if (i != arrayList.size() - 1) {
                    stringBuilder.append('-');
                }
                i++;
            }
            return stringBuilder.toString();
        } else if (str3.equals(str)) {
            return str4;
        } else {
            abqf b = abqf.b(str);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str4);
            if (b != abqf.NONE) {
                StringBuilder stringBuilder3 = new StringBuilder("-");
                stringBuilder3.append(b.mHexCodeString);
                str2 = stringBuilder3.toString();
            }
            stringBuilder2.append(str2);
            return stringBuilder2.toString();
        }
    }

    public static List<String> b(String str) {
        return ImmutableList.copyOf(str.split(" "));
    }

    private static List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        char[] toCharArray = str.toCharArray();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            boolean startsWith = str.startsWith("‍", i);
            boolean startsWith2 = str.startsWith("️", i);
            Object obj = 1;
            Object obj2 = (startsWith || startsWith2) ? 1 : null;
            int i3 = i + 1;
            Object obj3 = i3 >= str.length() ? 1 : null;
            int i4 = i + 2;
            boolean a = i4 <= str.length() ? abqf.a(str.substring(i, i4)) : false;
            int i5 = i - 2;
            boolean a2 = i5 >= 0 ? abqf.a(str.substring(i5, i)) : false;
            Object obj4 = (startsWith || startsWith2 || obj3 != null || a) ? 1 : null;
            int i6 = (obj3 == null || obj2 != null) ? i : i3;
            if (i2 >= i6) {
                obj = null;
            }
            if (!(obj4 == null || obj == null)) {
                arrayList.add(Integer.toHexString(Character.codePointAt(toCharArray, i2, i6)));
                i2 = a ? i : i3;
            }
            if (startsWith || startsWith2) {
                if (startsWith || (!a2 && startsWith2)) {
                    arrayList.add(Integer.toHexString(Character.codePointAt(str.substring(i, i3), 0)));
                }
                i2 = i3;
            }
            i = i3;
        }
        return arrayList;
    }
}
