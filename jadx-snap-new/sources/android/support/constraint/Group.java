package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout.a;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.az;

public class Group extends az {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : MapboxConstants.MINIMUM_ZOOM;
        for (int i = 0; i < this.c; i++) {
            View view = (View) constraintLayout.a.get(this.b[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > MapboxConstants.MINIMUM_ZOOM && VERSION.SDK_INT >= 21) {
                    view.setElevation(elevation);
                }
            }
        }
    }

    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.e = false;
    }

    public final void c() {
        a aVar = (a) getLayoutParams();
        aVar.aj.d(0);
        aVar.aj.e(0);
    }
}
