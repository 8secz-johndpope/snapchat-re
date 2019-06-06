package defpackage;

import defpackage.akdl.a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: akdg */
public class akdg {
    public static Iterable a(Object obj) {
        if ((obj instanceof akdh) && !(obj instanceof akdj)) {
            akdg.a(obj, "kotlin.collections.MutableIterable");
        }
        return akdg.g(obj);
    }

    private static <T extends Throwable> T a(T t) {
        return akcr.a((Throwable) t, akdg.class.getName());
    }

    private static void a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(" cannot be cast to ");
        stringBuilder.append(str);
        throw ((ClassCastException) akdg.a(new ClassCastException(stringBuilder.toString())));
    }

    public static Collection b(Object obj) {
        if ((obj instanceof akdh) && !(obj instanceof akdi)) {
            akdg.a(obj, "kotlin.collections.MutableCollection");
        }
        return akdg.h(obj);
    }

    public static boolean c(Object obj) {
        return (obj instanceof List) && (!(obj instanceof akdh) || (obj instanceof akdk));
    }

    public static Map d(Object obj) {
        if ((obj instanceof akdh) && !(obj instanceof akdl)) {
            akdg.a(obj, "kotlin.collections.MutableMap");
        }
        return akdg.i(obj);
    }

    public static Entry e(Object obj) {
        if ((obj instanceof akdh) && !(obj instanceof a)) {
            akdg.a(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return akdg.j(obj);
    }

    public static Object f(Object obj) {
        if (!(obj == null || akdg.k(obj))) {
            akdg.a(obj, "kotlin.jvm.functions.Function2");
        }
        return obj;
    }

    private static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) akdg.a(e));
        }
    }

    private static Collection h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) akdg.a(e));
        }
    }

    private static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) akdg.a(e));
        }
    }

    private static Entry j(Object obj) {
        try {
            return (Entry) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) akdg.a(e));
        }
    }

    private static boolean k(Object obj) {
        if (obj instanceof ajxb) {
            int arity = obj instanceof akcp ? ((akcp) obj).getArity() : obj instanceof akbk ? 0 : obj instanceof akbl ? 1 : obj instanceof akbw ? 2 : obj instanceof akca ? 3 : obj instanceof akcb ? 4 : obj instanceof akcc ? 5 : obj instanceof akcd ? 6 : obj instanceof akce ? 7 : obj instanceof akcf ? 8 : obj instanceof akcg ? 9 : obj instanceof akbm ? 10 : obj instanceof akbn ? 11 : obj instanceof akbo ? 12 : obj instanceof akbp ? 13 : obj instanceof akbq ? 14 : obj instanceof akbr ? 15 : obj instanceof akbs ? 16 : obj instanceof akbt ? 17 : obj instanceof akbu ? 18 : obj instanceof akbv ? 19 : obj instanceof akbx ? 20 : obj instanceof akby ? 21 : obj instanceof akbz ? 22 : -1;
            if (arity == 2) {
                return true;
            }
        }
        return false;
    }
}
