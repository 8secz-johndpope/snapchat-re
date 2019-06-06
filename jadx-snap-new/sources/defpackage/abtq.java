package defpackage;

import com.snapchat.android.R;
import java.util.Arrays;

/* renamed from: abtq */
public final class abtq extends abtt {
    public final String[] a;

    public final int a() {
        return R.layout.action_menu_text;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abtq)) {
            return false;
        }
        return Arrays.equals(this.a, ((abtq) obj).a);
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String[] strArr = this.a;
        return hashCode + (strArr == null ? 0 : Arrays.hashCode(strArr));
    }
}
