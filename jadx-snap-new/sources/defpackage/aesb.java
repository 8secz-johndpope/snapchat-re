package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.TakeSnapButton;

/* renamed from: aesb */
public enum aesb {
    LEVEL_NONE(0),
    LEVEL_1(100),
    LEVEL_2(Callback.DEFAULT_DRAG_ANIMATION_DURATION),
    LEVEL_3(MapboxConstants.ANIMATION_DURATION),
    LEVEL_4(400),
    LEVEL_5(TakeSnapButton.LONG_PRESS_TIME),
    LEVEL_6(600),
    LEVEL_7(700),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aesb(int i) {
        this.intValue = i;
    }

    public static aesb a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aesb[] values = aesb.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].intValue == num.intValue()) {
                return values[i];
            }
        }
        return UNRECOGNIZED_VALUE;
    }

    public final int a() {
        return this.intValue;
    }
}
