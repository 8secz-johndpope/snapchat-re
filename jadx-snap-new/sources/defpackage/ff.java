package defpackage;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ff */
class ff extends fe {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    ff() {
    }

    public final void a(View view, float f) {
        Method declaredMethod;
        if (!b) {
            try {
                declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            b = true;
        }
        declaredMethod = a;
        if (declaredMethod != null) {
            try {
                declaredMethod.invoke(view, new Object[]{Float.valueOf(f)});
                return;
            } catch (IllegalAccessException unused) {
                return;
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        view.setAlpha(f);
    }

    public final float b(View view) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                view = ((Float) method.invoke(view, new Object[0])).floatValue();
                return view;
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.b(view);
    }

    public final void c(View view) {
    }

    public final void d(View view) {
    }
}
