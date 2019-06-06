package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: abtj */
public final class abtj {
    public static void a(Context context, View view) {
        InputMethodManager c = abtj.c(context);
        if (c != null) {
            c.showSoftInput(view, 1);
        }
    }

    public static boolean a(Context context) {
        return ((InputMethodManager) context.getSystemService("input_method")).isAcceptingText();
    }

    public static void b(Context context) {
        InputMethodManager c = abtj.c(context);
        if (c != null) {
            c.toggleSoftInput(1, 1);
        }
    }

    private static InputMethodManager c(Context context) {
        return context == null ? null : (InputMethodManager) context.getSystemService("input_method");
    }
}
