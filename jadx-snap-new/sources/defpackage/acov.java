package defpackage;

import android.text.TextUtils;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: acov */
public final class acov {
    public final String a;
    public final String b;
    public final String c = AppContext.get().getString(R.string.me);
    public nkh d;
    public alhq e;
    private final CharSequence f;

    public acov(nkh nkh, String str) {
        this.a = nkh.c();
        this.b = nkh.b();
        this.d = nkh;
        this.f = str;
    }

    public final String a() {
        return b() ? this.c : nkb.a(this.d);
    }

    public final boolean b() {
        return TextUtils.equals(this.f, this.d.c());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acov)) {
            return false;
        }
        acov acov = (acov) obj;
        if (this.a == null && acov.a == null) {
            return super.equals(obj);
        }
        String str = this.a;
        if (str != null) {
            String str2 = acov.a;
            if (str2 != null) {
                return str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public final String toString() {
        return String.format("UserCarouselItem: id=%s name=%s location=%s", new Object[]{this.a, a(), this.e});
    }
}
