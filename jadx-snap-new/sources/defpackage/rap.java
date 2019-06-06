package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: rap */
public final class rap {
    private final View a;
    private final ColorStateList b;
    private int c;

    public rap(View view, int i) {
        this.a = view;
        this.b = ColorStateList.valueOf(i);
        kb.a(view, Mode.SRC_OVER);
    }

    public final void a() {
        this.a.setVisibility(4);
    }

    public final void a(float f) {
        this.a.setVisibility(0);
        Drawable background = this.a.getBackground();
        background.setBounds(new Rect(0, this.c, this.a.getWidth(), this.a.getHeight()));
        if (f < 0.5f) {
            background.setAlpha((int) (f * 255.0f));
            kb.a(this.a, this.b.withAlpha((int) ((1.0f - (f * 2.0f)) * 255.0f)));
            return;
        }
        background.setAlpha((int) ((1.0f - f) * 255.0f));
        kb.a(this.a, null);
    }

    public final void a(int i) {
        this.c = i;
    }
}
