package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: jq */
public final class jq {
    private static Field a;
    private static boolean b;
    private static b c = (VERSION.SDK_INT >= 21 ? new a() : new b());

    /* renamed from: jq$b */
    static class b {
        b() {
        }

        public void a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                jq.a(layoutInflater, (Factory2) factory);
            } else {
                jq.a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: jq$a */
    static class a extends b {
        a() {
        }

        public final void a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    static void a(LayoutInflater layoutInflater, Factory2 factory2) {
        String str = "; inflation may have unexpected results.";
        String str2 = "LayoutInflaterCompatHC";
        if (!b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder stringBuilder = new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ");
                stringBuilder.append(LayoutInflater.class.getName());
                stringBuilder.append(str);
                Log.e(str2, stringBuilder.toString(), e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder stringBuilder2 = new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                stringBuilder2.append(layoutInflater);
                stringBuilder2.append(str);
                Log.e(str2, stringBuilder2.toString(), e2);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, Factory2 factory2) {
        c.a(layoutInflater, factory2);
    }
}
