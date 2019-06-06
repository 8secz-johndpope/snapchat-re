package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: arc */
public final class arc implements arh {
    private final Method a;
    private final Object b;

    private arc(Object obj, Method method) {
        this.b = obj;
        this.a = method;
    }

    public static arh a(Context context) {
        Class b = arc.b(context);
        if (b == null) {
            return null;
        }
        Object a = arc.a(context, b);
        if (a == null) {
            return null;
        }
        Method a2 = arc.a(b);
        return a2 == null ? null : new arc(a, a2);
    }

    private static Object a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method a(Class cls) {
        try {
            return cls.getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Class b(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(String str, Bundle bundle) {
        a("fab", str, bundle);
    }

    public final void a(String str, String str2, Bundle bundle) {
        try {
            this.a.invoke(this.b, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
