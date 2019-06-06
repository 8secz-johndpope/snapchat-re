package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: tbv */
public abstract class tbv extends FrameLayout {
    public tbv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public tbv(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(String str);

    public abstract int b();

    public abstract void b(int i);
}
