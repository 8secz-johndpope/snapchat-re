package defpackage;

import java.io.Serializable;

/* renamed from: aklu */
public final class aklu {

    /* renamed from: aklu$a */
    public static class a implements Serializable {
        a() {
        }
    }

    static {
        a aVar = new a();
    }

    public static void a(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            stringBuffer.append(obj.getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        throw new NullPointerException("Cannot get the toString of a null identity");
    }

    @Deprecated
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 ? true : (obj == null || obj2 == null) ? false : obj.equals(obj2);
    }

    public static boolean b(Object obj, Object obj2) {
        return !aklu.a(obj, obj2);
    }

    public final String toString() {
        return super.toString();
    }
}
