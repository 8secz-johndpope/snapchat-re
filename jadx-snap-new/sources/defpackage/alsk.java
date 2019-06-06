package defpackage;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: alsk */
public final class alsk {
    public static void a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
