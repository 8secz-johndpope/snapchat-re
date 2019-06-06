package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ez */
final class ez extends ey {
    private static Method a;
    private static boolean b;

    ez() {
    }

    public final ew a(ViewGroup viewGroup) {
        return new ev(viewGroup);
    }

    public final void a(ViewGroup viewGroup, boolean z) {
        Method declaredMethod;
        String str = "ViewUtilsApi18";
        if (!b) {
            try {
                declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(str, "Failed to retrieve suppressLayout method", e);
            }
            b = true;
        }
        declaredMethod = a;
        if (declaredMethod != null) {
            try {
                declaredMethod.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e2) {
                Log.i(str, "Failed to invoke suppressLayout method", e2);
            } catch (InvocationTargetException e3) {
                Log.i(str, "Error invoking suppressLayout method", e3);
            }
        }
    }
}
