package defpackage;

import android.content.Context;
import com.snapchat.android.R;
import defpackage.acrn.a;

/* renamed from: acrm */
public class acrm implements a {
    private String a;
    private String b;

    public String a(Context context, alkk.a aVar, int i, boolean z) {
        String str;
        if (z) {
            if (this.b == null) {
                this.b = context.getString(R.string.degrees_fahrenheit);
            }
            str = this.b;
        } else {
            if (this.a == null) {
                this.a = context.getString(R.string.degrees_celsius);
            }
            str = this.a;
        }
        return context.getString(R.string.degree_with_suffix, new Object[]{Integer.valueOf(i), str});
    }
}
