package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchUIUtil;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

/* renamed from: oy */
public final class oy {

    /* renamed from: oy$b */
    public static class b implements ItemTouchUIUtil {
        public void clearView(View view) {
            view.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
            view.setTranslationY(MapboxConstants.MINIMUM_ZOOM);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        }

        public void onSelected(View view) {
        }
    }

    /* renamed from: oy$a */
    public static class a extends b {
        public final void clearView(View view) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                kb.a(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            super.clearView(view);
        }

        public final void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(kb.a.t(view));
                int childCount = recyclerView.getChildCount();
                float f3 = MapboxConstants.MINIMUM_ZOOM;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float t = kb.a.t(childAt);
                        if (t > f3) {
                            f3 = t;
                        }
                    }
                }
                kb.a(view, 1.0f + f3);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            super.onDraw(canvas, recyclerView, view, f, f2, i, z);
        }
    }
}
