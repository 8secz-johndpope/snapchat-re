package defpackage;

/* renamed from: akap */
public final class akap {
    static final int a(akal akal) {
        try {
            Object declaredField = akal.getClass().getDeclaredField("label");
            akcr.a(declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(akal);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
