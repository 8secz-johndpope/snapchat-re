package defpackage;

import android.text.TextUtils;

/* renamed from: icd */
public final class icd {
    public final String a;
    public final String b;

    public icd(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof icd) {
            icd icd = (icd) obj;
            if (TextUtils.equals(this.a, icd.a) && TextUtils.equals(this.b, icd.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.b.hashCode();
    }
}
