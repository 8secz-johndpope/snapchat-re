package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.ConstraintLayout.a;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.bd.b;

/* renamed from: bb */
public final class bb extends ViewGroup {
    public ba a;

    /* renamed from: bb$a */
    public static class a extends android.support.constraint.ConstraintLayout.a {
        public float ak;
        public boolean al;
        public float am;
        public float an;
        public float ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        private float aw;

        public a() {
            super(-2, -2);
            this.ak = 1.0f;
            this.al = false;
            this.am = MapboxConstants.MINIMUM_ZOOM;
            this.an = MapboxConstants.MINIMUM_ZOOM;
            this.ao = MapboxConstants.MINIMUM_ZOOM;
            this.ap = MapboxConstants.MINIMUM_ZOOM;
            this.aq = 1.0f;
            this.ar = 1.0f;
            this.as = MapboxConstants.MINIMUM_ZOOM;
            this.at = MapboxConstants.MINIMUM_ZOOM;
            this.au = MapboxConstants.MINIMUM_ZOOM;
            this.av = MapboxConstants.MINIMUM_ZOOM;
            this.aw = MapboxConstants.MINIMUM_ZOOM;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.ak = 1.0f;
            int i = 0;
            this.al = false;
            this.am = MapboxConstants.MINIMUM_ZOOM;
            this.an = MapboxConstants.MINIMUM_ZOOM;
            this.ao = MapboxConstants.MINIMUM_ZOOM;
            this.ap = MapboxConstants.MINIMUM_ZOOM;
            this.aq = 1.0f;
            this.ar = 1.0f;
            this.as = MapboxConstants.MINIMUM_ZOOM;
            this.at = MapboxConstants.MINIMUM_ZOOM;
            this.au = MapboxConstants.MINIMUM_ZOOM;
            this.av = MapboxConstants.MINIMUM_ZOOM;
            this.aw = MapboxConstants.MINIMUM_ZOOM;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            while (i < indexCount) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.ak = obtainStyledAttributes.getFloat(index, this.ak);
                } else if (index == 22) {
                    this.am = obtainStyledAttributes.getFloat(index, this.am);
                    this.al = true;
                } else if (index == 17) {
                    this.ao = obtainStyledAttributes.getFloat(index, this.ao);
                } else if (index == 18) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                } else if (index == 16) {
                    this.an = obtainStyledAttributes.getFloat(index, this.an);
                } else if (index == 14) {
                    this.aq = obtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == 15) {
                    this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == 10) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == 11) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else {
                    float f;
                    if (index == 12) {
                        f = obtainStyledAttributes.getFloat(index, this.au);
                    } else if (index == 13) {
                        this.av = obtainStyledAttributes.getFloat(index, this.av);
                    } else if (index == 21) {
                        f = obtainStyledAttributes.getFloat(index, MapboxConstants.MINIMUM_ZOOM);
                    }
                    this.au = f;
                }
                i++;
            }
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
