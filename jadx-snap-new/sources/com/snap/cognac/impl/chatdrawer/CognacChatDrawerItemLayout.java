package com.snap.cognac.impl.chatdrawer;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View.MeasureSpec;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.framework.ui.views.RoundedFrameLayout;
import defpackage.akcr;
import defpackage.fbc;

public final class CognacChatDrawerItemLayout extends RoundedFrameLayout {
    private static final defpackage.fet.a c = defpackage.fet.a.ORIGINAL;
    public defpackage.fet.a a = c;
    private float b = -1.0f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public CognacChatDrawerItemLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), AudioPlayer.INFINITY_LOOP_COUNT);
        if (this.a == defpackage.fet.a.ORIGINAL) {
            super.onMeasure(i, i2);
            return;
        }
        Pair pair;
        int i3 = fbc.a[this.a.ordinal()];
        String str = "Check failed.";
        Object obj = null;
        if (i3 == 1) {
            if (this.b > MapboxConstants.MINIMUM_ZOOM) {
                obj = 1;
            }
            if (obj != null) {
                i = MeasureSpec.getSize(i);
                pair = new Pair(Integer.valueOf(MeasureSpec.makeMeasureSpec(i, AudioPlayer.INFINITY_LOOP_COUNT)), Integer.valueOf(MeasureSpec.makeMeasureSpec(Math.round(((float) i) / this.b), AudioPlayer.INFINITY_LOOP_COUNT)));
            } else {
                throw new IllegalStateException(str.toString());
            }
        } else if (i3 == 2) {
            if (this.b > MapboxConstants.MINIMUM_ZOOM) {
                obj = 1;
            }
            if (obj != null) {
                i3 = MeasureSpec.getSize(i);
                int size = MeasureSpec.getSize(i2);
                if (size == 0) {
                    pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                } else {
                    float f = (float) i3;
                    float f2 = (float) size;
                    float f3 = f / f2;
                    float f4 = this.b;
                    if (f3 < f4) {
                        pair = new Pair(Integer.valueOf(MeasureSpec.makeMeasureSpec(i3, AudioPlayer.INFINITY_LOOP_COUNT)), Integer.valueOf(MeasureSpec.makeMeasureSpec(Math.round(f / f4), AudioPlayer.INFINITY_LOOP_COUNT)));
                    } else {
                        pair = new Pair(Integer.valueOf(MeasureSpec.makeMeasureSpec(Math.round(f2 * f4), AudioPlayer.INFINITY_LOOP_COUNT)), Integer.valueOf(MeasureSpec.makeMeasureSpec(size, AudioPlayer.INFINITY_LOOP_COUNT)));
                    }
                }
            } else {
                throw new IllegalStateException(str.toString());
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("Unhandled aspect ratio correction method: ");
            stringBuilder.append(this.a);
            throw new IllegalStateException(stringBuilder.toString());
        }
        Object obj2 = pair.first;
        akcr.a(obj2, "measureSpec.first");
        i = ((Number) obj2).intValue();
        Object obj3 = pair.second;
        akcr.a(obj3, "measureSpec.second");
        super.onMeasure(i, ((Number) obj3).intValue());
    }
}
