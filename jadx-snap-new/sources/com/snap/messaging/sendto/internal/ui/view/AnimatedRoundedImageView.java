package com.snap.messaging.sendto.internal.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snapchat.android.framework.ui.views.RoundedImageView;
import defpackage.azt;
import defpackage.azu;
import defpackage.azx;
import defpackage.rlm.1;

public class AnimatedRoundedImageView extends RoundedImageView {
    private final Supplier<azt> a;

    public AnimatedRoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AnimatedRoundedImageView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.a = Suppliers.memoize(new -$$Lambda$AnimatedRoundedImageView$JBfpZvYFIVPe1tcq1lYdwRHD6B4(this));
    }

    private /* synthetic */ azt c() {
        azu azu = new azu(420.0d, 32.0d);
        azt a = azx.b().a();
        a.a(new 1(this));
        a.a(azu);
        return a;
    }

    public final void a() {
        if (getVisibility() != 0) {
            ((azt) this.a.get()).a(2.0d);
            setVisibility(0);
        }
        ((azt) this.a.get()).b(0.0d);
    }

    public final void b() {
        if (getVisibility() == 0) {
            ((azt) this.a.get()).b(2.0d);
        }
    }
}
