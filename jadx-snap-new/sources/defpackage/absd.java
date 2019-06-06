package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: absd */
final class absd implements absf {
    absd() {
    }

    public final boolean a() {
        try {
            Object invoke = Class.forName("android.view.WindowManagerGlobal").getMethod("getWindowManagerService", new Class[0]).invoke(null, new Object[0]);
            invoke = invoke.getClass().getMethod("hasNavigationBar", new Class[0]).invoke(invoke, new Object[0]);
            return invoke != null && ((Boolean) invoke).booleanValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }
}
