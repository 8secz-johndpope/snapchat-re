package com.snapchat.map.feature.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.acnu;

public class MapCarouselView extends MapCardsViewPager {
    public MapCarouselView(Context context) {
        super(context);
    }

    public MapCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i, boolean z) {
        if (this.b != null) {
            super.a(((acnu) this.b).b(i), z);
        }
    }

    public final boolean a(View view, boolean z, int i, int i2, int i3) {
        acnu acnu = (acnu) this.b;
        return acnu == null ? false : !acnu.a(acnu.a()) || super.a(view, z, i, i2, i3);
    }

    public final int b() {
        int b = super.b();
        if (this.b == null) {
            return b;
        }
        int a = ((acnu) this.b).a();
        return a == 0 ? b : b % a;
    }

    public final void b(int i) {
        if (this.b != null) {
            super.b(((acnu) this.b).b(i));
        }
    }

    public final int h() {
        return super.b();
    }
}
