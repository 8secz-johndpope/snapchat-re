package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: airp */
public final class airp {
    public static int a(int i) {
        return (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION || i > 299) ? (i < MapboxConstants.ANIMATION_DURATION || i > 399) ? (i < 400 || i > 499) ? 1 : 0 : 1 : 0;
    }
}
