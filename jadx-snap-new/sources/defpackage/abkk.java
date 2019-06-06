package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: abkk */
public final class abkk {
    public byte[] a;
    private final SharedPreferences b;

    public abkk(Context context) {
        this.b = context.getSharedPreferences("dust_shared_pref", 0);
        abkl abkl = new abkl(this.b.getString("dust_value", null));
        if (abkl.a) {
            this.a = abkl.b;
        } else {
            this.a = null;
        }
    }

    public final void a(String str) {
        if (str != null) {
            abkl abkl = new abkl(str);
            if (abkl.a()) {
                String str2 = "dust_value";
                String string = this.b.getString(str2, null);
                if (!str.equals(string)) {
                    abkl abkl2 = new abkl(string);
                    Object obj = null;
                    Object obj2 = (!abkl.a() || (abkl2.a() && abkl.b() <= abkl2.b())) ? null : 1;
                    if (obj2 != null) {
                        if (abkl.a && abkl.b != null && abkl.b.length > 8) {
                            obj = 1;
                        }
                        if (obj != null) {
                            this.b.edit().putString(str2, str).apply();
                            this.a = abkl.b;
                            return;
                        }
                        this.b.edit().putString(str2, null).apply();
                        this.a = null;
                    }
                }
            }
        }
    }
}
