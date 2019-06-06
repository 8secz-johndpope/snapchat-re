package defpackage;

/* renamed from: ily */
public interface ily {

    /* renamed from: ily$a */
    public static final class a {
        public static ilz a(ily ily) {
            return new ilz(ily);
        }

        public static ilz a(ily ily, String str, Enum<?> enumR) {
            akcr.b(str, "shortKey");
            akcr.b(enumR, "shortValue");
            return new ilz(ily).a(str, (Enum) enumR);
        }

        public static ilz a(ily ily, String str, String str2) {
            akcr.b(str, "shortKey");
            akcr.b(str2, "shortValue");
            return new ilz(ily).a(str, str2);
        }

        public static ilz a(ily ily, String str, boolean z) {
            akcr.b(str, "shortKey");
            return new ilz(ily).a(str, z);
        }
    }

    ilz a(String str, Enum<?> enumR);

    ilz a(String str, String str2);

    ilz a(String str, boolean z);

    ink a();

    ilz b();
}
