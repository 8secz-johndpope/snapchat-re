package defpackage;

import android.text.TextUtils;

/* renamed from: abqc */
public final class abqc {
    private static final int[][] a = new int[][]{new int[]{8352, 11263}, new int[]{126976, 131071}, new int[]{1041637, 1041646}, new int[]{12288, 12351}, new int[]{12800, 13055}};

    public static boolean a(int i) {
        int[][] iArr = a;
        for (int i2 = 0; i2 < 5; i2++) {
            int[] iArr2 = iArr[i2];
            if (i < iArr2[0]) {
                return false;
            }
            if (i <= iArr2[1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            boolean a = abqc.a(codePointAt);
            if (!a && !Character.isWhitespace(codePointAt) && (i <= 0 || codePointAt < 65024 || codePointAt > 65039 || !z)) {
                return false;
            }
            i += Character.charCount(codePointAt);
            z = a;
        }
        return true;
    }

    public static boolean b(String str) {
        if (!(str == null || TextUtils.isEmpty(str.trim()))) {
            int i = 0;
            while (i < str.length()) {
                int codePointAt = str.codePointAt(i);
                if (abqc.a(codePointAt)) {
                    return true;
                }
                i += Character.charCount(codePointAt);
            }
        }
        return false;
    }
}
