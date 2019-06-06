package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: abtu */
public abstract class abtu extends LinearLayout {
    protected abtu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected abtu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    public abstract void a(abtt abtt);
}
