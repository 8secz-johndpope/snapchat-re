package defpackage;

/* renamed from: dau */
public abstract class dau {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <K, V> boolean a(jh<K, V> jhVar, jh<K, V> jhVar2) {
        if (jhVar == jhVar2) {
            return true;
        }
        int size = jhVar.size();
        if (size != jhVar2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            Object b = jhVar.b(i);
            Object c = jhVar.c(i);
            Object obj = jhVar2.get(b);
            if (c == null) {
                if (obj != null || !jhVar2.containsKey(b)) {
                    return false;
                }
            } else if (!c.equals(obj)) {
                return false;
            }
        }
        return true;
    }
}
