package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.PopupWindow;
import com.mapbox.mapboxsdk.R;

class BubblePopupHelper {
    BubblePopupHelper() {
    }

    static PopupWindow create(Context context, BubbleLayout bubbleLayout) {
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setContentView(bubbleLayout);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setAnimationStyle(16973826);
        popupWindow.setBackgroundDrawable(VERSION.SDK_INT >= 21 ? context.getDrawable(R.drawable.mapbox_popup_window_transparent) : context.getResources().getDrawable(R.drawable.mapbox_popup_window_transparent));
        return popupWindow;
    }
}
