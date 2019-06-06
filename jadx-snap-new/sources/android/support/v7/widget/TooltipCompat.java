package android.support.v7.widget;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import defpackage.ov;

public class TooltipCompat {
    private TooltipCompat() {
    }

    public static void setTooltipText(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (ov.b != null && ov.b.a == view) {
            ov.a(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (ov.c != null && ov.c.a == view) {
                ov.c.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        ov ovVar = new ov(view, charSequence);
    }
}
