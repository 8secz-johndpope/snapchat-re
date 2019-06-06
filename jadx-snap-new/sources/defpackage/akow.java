package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.akou.a;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* renamed from: akow */
public abstract class akow {
    static final String a = "akow";
    protected final Context b;

    protected akow(Context context) {
        if (context != null) {
            this.b = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    private static void a(String str, boolean z, Exception exception) {
        if (z) {
            Log.e(a, "Unable to load provider class: ".concat(String.valueOf(str)), exception);
            return;
        }
        if (Log.isLoggable(a, 3)) {
            String str2 = a;
            StringBuilder stringBuilder = new StringBuilder("Tried to load ");
            stringBuilder.append(str);
            stringBuilder.append(" provider class but it wasn't included in the app classpath");
            Log.d(str2, stringBuilder.toString());
        }
    }

    static boolean a(Context context, String str, Set<akow> set, boolean z) {
        try {
            set.add((akow) context.getClassLoader().loadClass(str).asSubclass(akow.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            akow.a(str, z, e);
            return false;
        }
    }

    public abstract a a();

    public abstract String b();

    public abstract String c();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[class=");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(", name=");
        stringBuilder.append(b());
        stringBuilder.append(", version=");
        stringBuilder.append(c());
        stringBuilder.append(", enabled=true]");
        return stringBuilder.toString();
    }
}
