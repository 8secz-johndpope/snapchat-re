package com.looksery.sdk.touch;

import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import com.looksery.sdk.domain.Size;
import com.looksery.sdk.touch.Touch.State;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class TouchConverter<T> {
    private static final Touch[] EMPTY = new Touch[0];
    private static final Comparator<Touch> ID_COMPARATOR = new Comparator<Touch>() {
        public int compare(Touch touch, Touch touch2) {
            return touch.compareTo(touch2);
        }
    };

    public static TouchConverter<Size> forSize() {
        return new TouchConverter<Size>() {
            public float[] normalizePosition(Size size, float f, float f2) {
                return new float[]{f / ((float) size.getWidth()), f2 / ((float) size.getHeight())};
            }
        };
    }

    public static TouchConverter<View> forView() {
        return new TouchConverter<View>() {
            public float[] normalizePosition(View view, float f, float f2) {
                return new float[]{f / ((float) view.getWidth()), f2 / ((float) view.getHeight())};
            }
        };
    }

    private static boolean isValid(MotionEvent motionEvent) {
        return VERSION.SDK_INT >= 18 ? motionEvent.isFromSource(2) : true;
    }

    public abstract float[] normalizePosition(T t, float f, float f2);

    public final TouchEvent toTouchEvent(T t, MotionEvent motionEvent) {
        return TouchEvent.create(toTouches(t, motionEvent), motionEvent.getEventTime());
    }

    public final Touch[] toTouches(T t, MotionEvent motionEvent) {
        if (!isValid(motionEvent)) {
            return EMPTY;
        }
        State from = State.from(motionEvent.getActionMasked());
        if (from.isValid()) {
            int actionIndex = motionEvent.getActionIndex();
            float[] normalizePosition = normalizePosition(t, motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
            Object touch = Touch.isValid(normalizePosition) ? new Touch(motionEvent.getPointerId(actionIndex), from, normalizePosition) : null;
            int pointerCount = motionEvent.getPointerCount();
            if (pointerCount > 1) {
                List list = null;
                for (int i = 0; i < pointerCount; i++) {
                    if (i != actionIndex) {
                        float[] normalizePosition2 = normalizePosition(t, motionEvent.getX(i), motionEvent.getY(i));
                        if (Touch.isValid(normalizePosition2)) {
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(new Touch(motionEvent.getPointerId(i), State.MOVED, normalizePosition2));
                        }
                    }
                }
                if (list != null) {
                    if (touch != null) {
                        list.add(touch);
                    }
                    Touch[] touchArr = (Touch[]) list.toArray(new Touch[list.size()]);
                    if (list.size() > 1) {
                        Arrays.sort(touchArr, ID_COMPARATOR);
                    }
                    return touchArr;
                }
            }
            if (touch != null) {
                return new Touch[]{touch};
            }
        }
        return EMPTY;
    }
}
