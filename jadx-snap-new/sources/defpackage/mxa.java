package defpackage;

/* renamed from: mxa */
public interface mxa {

    /* renamed from: mxa$a */
    public static final class a implements mxa {
        public static final a a = new a();

        private a() {
        }

        public final <T> T a(Class<T> cls) {
            akcr.b(cls, "t");
            StringBuilder stringBuilder = new StringBuilder("Cannot create remote service for class: [");
            stringBuilder.append(cls);
            stringBuilder.append(']');
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    <T> T a(Class<T> cls);
}
