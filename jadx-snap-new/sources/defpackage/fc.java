package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: fc */
final class fc {
    static final fi a;
    static final Property<View, Float> b = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(fc.b((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            fc.a((View) obj, ((Float) obj2).floatValue());
        }
    };
    private static Field c;
    private static boolean d;

    static {
        fi fhVar = VERSION.SDK_INT >= 22 ? new fh() : VERSION.SDK_INT >= 21 ? new fg() : VERSION.SDK_INT >= 19 ? new ff() : VERSION.SDK_INT >= 18 ? new fe() : new fd();
        a = fhVar;
        2 2 = new Property<View, Rect>(Rect.class, "clipBounds") {
            public final /* synthetic */ Object get(Object obj) {
                return kb.a.p((View) obj);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                kb.a.a((View) obj, (Rect) obj2);
            }
        };
    }

    static fm a(View view) {
        return a.a(view);
    }

    static void a(View view, float f) {
        a.a(view, f);
    }

    static void a(View view, int i) {
        if (!d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    static void a(View view, Matrix matrix) {
        a.a(view, matrix);
    }

    static float b(View view) {
        return a.b(view);
    }

    static void b(View view, Matrix matrix) {
        a.b(view, matrix);
    }

    static void c(View view, Matrix matrix) {
        a.c(view, matrix);
    }
}
