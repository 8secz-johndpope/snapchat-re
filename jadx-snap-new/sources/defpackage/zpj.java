package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;

/* renamed from: zpj */
public final class zpj {
    public static void a(Context context, IBinder iBinder) {
        if (context != null) {
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                }
            } catch (Exception unused) {
            }
        }
    }
}
