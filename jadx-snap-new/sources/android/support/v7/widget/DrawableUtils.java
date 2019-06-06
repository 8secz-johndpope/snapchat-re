package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import com.mapbox.mapboxsdk.style.layers.Property;
import defpackage.hw;
import defpackage.mc;
import defpackage.os;
import java.lang.reflect.Field;

public class DrawableUtils {
    public static final Rect INSETS_NONE = new Rect();
    private static final String TAG = "DrawableUtils";
    private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
    private static Class<?> sInsetsClazz;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                sInsetsClazz = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    private DrawableUtils() {
    }

    public static boolean canSafelyMutateDrawable(Drawable drawable) {
        while (true) {
            if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
                if (!(drawable instanceof DrawableContainer)) {
                    if (!(drawable instanceof hw)) {
                        if (!(drawable instanceof mc)) {
                            if (!(drawable instanceof ScaleDrawable)) {
                                break;
                            }
                            drawable = ((ScaleDrawable) drawable).getDrawable();
                        } else {
                            drawable = ((mc) drawable).b;
                        }
                    } else {
                        drawable = ((hw) drawable).a();
                    }
                } else {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState instanceof DrawableContainerState) {
                        for (Drawable canSafelyMutateDrawable : ((DrawableContainerState) constantState).getChildren()) {
                            if (!canSafelyMutateDrawable(canSafelyMutateDrawable)) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    static void fixDrawable(Drawable drawable) {
        if (VERSION.SDK_INT == 21) {
            if (VECTOR_DRAWABLE_CLAZZ_NAME.equals(drawable.getClass().getName())) {
                fixVectorDrawableTinting(drawable);
            }
        }
    }

    private static void fixVectorDrawableTinting(Drawable drawable) {
        int[] state = drawable.getState();
        int[] iArr = (state == null || state.length == 0) ? os.d : os.e;
        drawable.setState(iArr);
        drawable.setState(state);
    }

    public static Rect getOpticalBounds(Drawable drawable) {
        if (sInsetsClazz != null) {
            try {
                Object drawable2;
                if (drawable2 instanceof hw) {
                    drawable2 = ((hw) drawable2).a();
                }
                drawable2 = drawable2.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable2, new Object[0]);
                if (drawable2 != null) {
                    Rect rect = new Rect();
                    for (Field field : sInsetsClazz.getFields()) {
                        String name = field.getName();
                        int i = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals(Property.TEXT_ANCHOR_BOTTOM)) {
                                    i = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals(Property.TEXT_ANCHOR_TOP)) {
                                    i = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    i = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    i = 2;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        if (i == 0) {
                            rect.left = field.getInt(drawable2);
                        } else if (i == 1) {
                            rect.top = field.getInt(drawable2);
                        } else if (i == 2) {
                            rect.right = field.getInt(drawable2);
                        } else if (i == 3) {
                            rect.bottom = field.getInt(drawable2);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e(TAG, "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return INSETS_NONE;
    }

    public static Mode parseTintMode(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
