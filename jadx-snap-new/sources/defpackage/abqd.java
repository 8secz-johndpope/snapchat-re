package defpackage;

import android.text.TextUtils;
import com.google.common.base.Preconditions;
import java.util.Locale;

/* renamed from: abqd */
public final class abqd {
    public final String a;
    private final String b;

    private abqd(String str) {
        Preconditions.checkArgument(str != null);
        this.b = null;
        this.a = str;
    }

    public static abqd a(String str) {
        return new abqd(str);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof abqd) {
            abqd abqd = (abqd) obj;
            String str = this.a;
            String str2 = abqd.a;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                return str.equalsIgnoreCase(str2);
            }
            CharSequence charSequence = null;
            if (!(TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence))) {
                return charSequence.equalsIgnoreCase(charSequence);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = null;
        if (TextUtils.isEmpty(null)) {
            if (TextUtils.isEmpty(this.a)) {
                return 0;
            }
            str = this.a;
        }
        return str.toUpperCase(Locale.getDefault()).hashCode();
    }
}
