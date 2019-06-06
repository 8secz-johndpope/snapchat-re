package defpackage;

import android.view.View;
import com.google.common.base.Predicate;

/* renamed from: eea */
public final class eea extends abtc implements Predicate<Void> {
    private boolean a = true;

    public eea(View view) {
        super(view);
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return this.a;
    }

    public final void onSpringActivate(azt azt) {
        super.onSpringActivate(azt);
        this.a = false;
    }

    public final void onSpringAtRest(azt azt) {
        super.onSpringAtRest(azt);
        this.a = true;
    }

    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.a = true;
    }
}
