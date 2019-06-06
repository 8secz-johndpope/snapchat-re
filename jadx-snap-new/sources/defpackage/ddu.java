package defpackage;

import android.graphics.Color;

/* renamed from: ddu */
public final class ddu {
    private static final int a = Color.parseColor("#FFB9C0C7");
    private static final int[] b = new int[]{-2621392, -632576, -17920, -12334789, -16722528, -13344273, -7784778, -1769084, -902057, -30208, -10240, -6366976, -9580614, -15815169, -5737985, -39507, -5111802, -3323901, -2711039, -15373040, -16735879, -14401642, -11854493, -6617765, -754826, -19361, -137593, -3545003, -5641244, -8661508, -3297793, -22063};

    public static final int a(String str) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj != null) {
            return a;
        }
        int[] iArr = b;
        if (str == null) {
            akcr.a();
        }
        return iArr[Math.abs(str.hashCode() % 32)];
    }
}
