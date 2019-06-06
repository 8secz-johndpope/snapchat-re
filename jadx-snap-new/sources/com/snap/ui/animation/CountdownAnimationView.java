package com.snap.ui.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import defpackage.abut;
import defpackage.abuy;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.zim;
import defpackage.zio;

public class CountdownAnimationView extends abut implements abuy {
    public final zim a;

    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ CountdownAnimationView a;

        a(CountdownAnimationView countdownAnimationView) {
            this.a = countdownAnimationView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            super.invalidate();
            return ajxw.a;
        }
    }

    public CountdownAnimationView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
        this.a = new zim(context, new a(this));
        setScaleType(ScaleType.CENTER_CROP);
        setImageDrawable(this.a);
    }

    public final void a(zio zio) {
        this.a.a(zio);
    }
}
